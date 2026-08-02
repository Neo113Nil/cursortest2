package androidx.credentials;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.util.GlideSuppliers$GlideSupplier;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeErrorMappingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CredentialProviderFactory implements ModelLoaderFactory, DirectResourceLoader$ResourceOpener, GlideSuppliers$GlideSupplier {
    public final /* synthetic */ int $r8$classId;
    public final Context context;

    public CredentialProviderFactory(Context context, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 5:
                context.getClass();
                this.context = context;
                break;
            default:
                context.getClass();
                this.context = context;
                break;
        }
    }

    public static CredentialProvider getBestAvailableProvider$default(CredentialProviderFactory credentialProviderFactory, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return credentialProviderFactory.tryCreateClosedSourceProviderFromManifest();
        }
        if (obj instanceof GetCredentialRequest) {
            Iterator it = ((GetCredentialRequest) obj).credentialOptions.iterator();
            while (it.hasNext()) {
                if (((CredentialOption) it.next()) instanceof GetDigitalCredentialOption) {
                    return credentialProviderFactory.tryCreateClosedSourceProviderFromManifest();
                }
            }
        }
        Context context = credentialProviderFactory.context;
        context.getClass();
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return credentialProviderFactory.tryCreateClosedSourceProviderFromManifest();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            CredentialProviderFrameworkImpl credentialProviderFrameworkImpl = new CredentialProviderFrameworkImpl(context);
            CredentialProviderFrameworkImpl credentialProviderFrameworkImpl2 = credentialProviderFrameworkImpl.isAvailableOnDevice() ? credentialProviderFrameworkImpl : null;
            return credentialProviderFrameworkImpl2 == null ? credentialProviderFactory.tryCreateClosedSourceProviderFromManifest() : credentialProviderFrameworkImpl2;
        }
        if (i <= 33) {
            return credentialProviderFactory.tryCreateClosedSourceProviderFromManifest();
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        int i = this.$r8$classId;
        Context context = this.context;
        switch (i) {
            case 2:
                return new AssetUriLoader(context, this);
            default:
                return new AssetUriLoader(context, multiModelLoaderFactory.build(Integer.class, InputStream.class));
        }
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public void close(Object obj) {
        ((InputStream) obj).close();
    }

    public String create(int i, StripeIntent stripeIntent, String str) {
        PaymentMethod paymentMethod;
        PaymentMethod.Type type2;
        stripeIntent.getClass();
        Context context = this.context;
        if (i == 4) {
            return context.getResources().getString(R.string.stripe_failure_reason_timed_out);
        }
        PaymentMethod paymentMethod2 = stripeIntent.getPaymentMethod();
        if (((paymentMethod2 != null ? paymentMethod2.f1440type : null) != PaymentMethod.Type.Card || !(stripeIntent.getNextActionData() instanceof StripeIntent.NextActionData.SdkData.Use3DS2)) && (stripeIntent.getStatus() == StripeIntent.Status.RequiresPaymentMethod || stripeIntent.getStatus() == StripeIntent.Status.RequiresAction)) {
            if (stripeIntent instanceof PaymentIntent) {
                PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
                StripeIntent.Status status = paymentIntent.status;
                PaymentIntent.Error error = paymentIntent.lastPaymentError;
                if (status != StripeIntent.Status.RequiresAction || ((paymentMethod = paymentIntent.paymentMethod) != null && (type2 = paymentMethod.f1440type) != null && type2.isVoucher)) {
                    if (!Intrinsics.areEqual(error != null ? error.code : null, "payment_intent_authentication_failure")) {
                        if (error != null) {
                            boolean z = paymentIntent.isLiveMode;
                            context.getClass();
                            String str2 = error.message;
                            String str3 = error.code;
                            String str4 = error.declineCode;
                            PaymentIntent.Error.Type type3 = error.f1439type;
                            return StripeErrorMappingKt.getErrorMessage(str2, type3 != null ? type3.code : null, str3, str4, z, str, context);
                        }
                    }
                }
                return context.getResources().getString(R.string.stripe_failure_reason_authentication);
            }
            if (!(stripeIntent instanceof SetupIntent)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            SetupIntent setupIntent = (SetupIntent) stripeIntent;
            SetupIntent.Error error2 = setupIntent.lastSetupError;
            if (Intrinsics.areEqual(error2 != null ? error2.code : null, "setup_intent_authentication_failure")) {
                return context.getResources().getString(R.string.stripe_failure_reason_authentication);
            }
            if (error2 != null) {
                boolean z2 = setupIntent.isLiveMode;
                context.getClass();
                String str5 = error2.message;
                String str6 = error2.code;
                String str7 = error2.declineCode;
                SetupIntent.Error.Type type4 = error2.f1442type;
                return StripeErrorMappingKt.getErrorMessage(str5, type4 != null ? type4.code : null, str6, str7, z2, str, context);
            }
        }
        return null;
    }

    @Override // com.bumptech.glide.util.GlideSuppliers$GlideSupplier
    public Object get() {
        return (ConnectivityManager) this.context.getSystemService("connectivity");
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public Class getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public Object open(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResource(i);
    }

    public CredentialProvider tryCreateClosedSourceProviderFromManifest() {
        String string2;
        Context context = this.context;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string2 = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string2);
                }
            }
        }
        List list = CollectionsKt.toList(arrayList);
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        CredentialProvider credentialProvider = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                newInstance.getClass();
                CredentialProvider credentialProvider2 = (CredentialProvider) newInstance;
                if (!credentialProvider2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (credentialProvider != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    credentialProvider = credentialProvider2;
                }
            } catch (Throwable unused) {
            }
        }
        return credentialProvider;
    }

    public /* synthetic */ CredentialProviderFactory(Context context, int i, boolean z) {
        this.$r8$classId = i;
        this.context = context;
    }
}
