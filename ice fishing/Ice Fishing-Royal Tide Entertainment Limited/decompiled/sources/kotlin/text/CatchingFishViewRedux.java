package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.PackageFactory;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class CatchingFishViewRedux implements Runnable {
    public Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public Object CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishViewRedux() {
        this.CatchingFishReduxKtor = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        WeakReference weakReference;
        int i;
        CatchingFishWorkManagerMVP CatchingFishLayout;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.CatchingFishViewModelScope).sendInstallReferrerI((ReferrerDetails) this.CatchingFishDaggerWebsocket, (String) this.CatchingFishWorkManager);
                return;
            case 1:
                ((Handler) this.CatchingFishWorkManager).post(new CatchingFishService(15, this, ((AsyncTaskExecutor) this.CatchingFishViewModelScope).doInBackground((Object[]) this.CatchingFishDaggerWebsocket)));
                return;
            case 2:
                try {
                    obj = ((CatchingFishPicassoMoshi) this.CatchingFishDaggerWebsocket).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.CatchingFishViewModelScope).post(new CatchingFishService(27, (CatchingFishGraphQLEspresso) this.CatchingFishWorkManager, obj, false));
                return;
            case 3:
                SdkClickHandler sdkClickHandler = (SdkClickHandler) this.CatchingFishViewModelScope;
                weakReference = sdkClickHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                sdkClickHandler.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage((String) this.CatchingFishWorkManager, (String) this.CatchingFishDaggerWebsocket, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
                return;
            default:
                CatchingFishFragmentJUnit catchingFishFragmentJUnit = (CatchingFishFragmentJUnit) this.CatchingFishWorkManager;
                Intent intent = catchingFishFragmentJUnit.CatchingFishReduxKtor;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    CatchingFishLayout = CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = catchingFishFragmentJUnit.CatchingFishReduxKtor;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = catchingFishFragmentJUnit.CatchingFishReduxKtor;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context = (Context) this.CatchingFishDaggerWebsocket;
                    bundle.putBoolean("supports_message_handled", true);
                    CatchingFishFluxFirebase CatchingFishViewModelFAB = CatchingFishFluxFirebase.CatchingFishViewModelFAB(context);
                    synchronized (CatchingFishViewModelFAB) {
                        i = CatchingFishViewModelFAB.CatchingFishParcelableFAB;
                        CatchingFishViewModelFAB.CatchingFishParcelableFAB = i + 1;
                    }
                    CatchingFishLayout = CatchingFishViewModelFAB.CatchingFishLayout(new CatchingFishFluxKtor(i, 2, bundle, 0));
                }
                CatchingFishLayout.CatchingFishParcelableFAB(CatchingFishToastGraphQLMVP.CatchingFishDaggerWebsocket, new CatchingFishRealmFABMockk((CountDownLatch) this.CatchingFishViewModelScope));
                return;
        }
    }

    public /* synthetic */ CatchingFishViewRedux(Context context, CatchingFishFragmentJUnit catchingFishFragmentJUnit, CountDownLatch countDownLatch) {
        this.CatchingFishReduxKtor = 4;
        this.CatchingFishDaggerWebsocket = context;
        this.CatchingFishWorkManager = catchingFishFragmentJUnit;
        this.CatchingFishViewModelScope = countDownLatch;
    }

    public /* synthetic */ CatchingFishViewRedux(Object obj, Object obj2, Object obj3, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishViewModelScope = obj;
        this.CatchingFishDaggerWebsocket = obj2;
        this.CatchingFishWorkManager = obj3;
    }

    public CatchingFishViewRedux(SdkClickHandler sdkClickHandler, String str, String str2) {
        this.CatchingFishReduxKtor = 3;
        this.CatchingFishViewModelScope = sdkClickHandler;
        this.CatchingFishWorkManager = str;
        this.CatchingFishDaggerWebsocket = str2;
    }
}
