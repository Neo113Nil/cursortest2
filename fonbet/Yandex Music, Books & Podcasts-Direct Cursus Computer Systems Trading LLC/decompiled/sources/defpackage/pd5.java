package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.yandex.messenger.websdk.api.MessengerAnalytics;
import com.yandex.messenger.websdk.api.MessengerAnalyticsFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class pd5 implements lci, MessengerAnalyticsFactory {
    public final Context a;

    public pd5(Context context) {
        context.getClass();
        this.a = context;
    }

    public static ns6 a(pd5 pd5Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return pd5Var.c();
        }
        if (obj instanceof n7d) {
            for (ms6 ms6Var : ((n7d) obj).a) {
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            gt6 gt6Var = new gt6(pd5Var.a);
            gt6 gt6Var2 = gt6Var.isAvailableOnDevice() ? gt6Var : null;
            return gt6Var2 == null ? pd5Var.c() : gt6Var2;
        }
        if (i <= 33) {
            return pd5Var.c();
        }
        return null;
    }

    @Override // com.yandex.messenger.websdk.api.MessengerAnalyticsFactory
    public MessengerAnalytics b() {
        return new o(this.a);
    }

    public ns6 c() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List w0 = CollectionsKt.w0(arrayList);
        if (w0.isEmpty()) {
            return null;
        }
        Iterator it = w0.iterator();
        ns6 ns6Var = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                newInstance.getClass();
                ns6 ns6Var2 = (ns6) newInstance;
                if (!ns6Var2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (ns6Var != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    ns6Var = ns6Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return ns6Var;
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new qwh(this.a, 2);
    }

    public /* synthetic */ pd5(Context context, boolean z) {
        this.a = context;
    }
}
