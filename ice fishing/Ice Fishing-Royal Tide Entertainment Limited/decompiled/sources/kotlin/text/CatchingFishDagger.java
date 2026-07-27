package kotlin.text;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.adjust.sdk.AdjustInstance;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishDagger implements Runnable {
    public final /* synthetic */ Context CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishDagger(Context context, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CatchingFishIntentStateFlow catchingFishIntentStateFlow;
        Object obj;
        Context context;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustInstance.lambda$setSendingReferrersAsNotSent$2(this.CatchingFishDaggerWebsocket);
                break;
            case 1:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.CatchingFishDaggerWebsocket;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            catchingFishIntentStateFlow = CatchingFishBundleDagger.CatchingFishWorkManager;
                            break;
                        } else {
                            CatchingFishRoomStateFlow catchingFishRoomStateFlow = CatchingFishBundleDagger.CatchingFishFragmentHandler;
                            catchingFishRoomStateFlow.getClass();
                            CatchingFishHiltToast catchingFishHiltToast = new CatchingFishHiltToast(catchingFishRoomStateFlow);
                            while (true) {
                                if (catchingFishHiltToast.hasNext()) {
                                    CatchingFishBundleDagger catchingFishBundleDagger = (CatchingFishBundleDagger) ((WeakReference) catchingFishHiltToast.next()).get();
                                    if (catchingFishBundleDagger != null && (context = ((CatchingFishMockkWidgetKtor) catchingFishBundleDagger).CatchingFishUnitTesting) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                catchingFishIntentStateFlow = new CatchingFishIntentStateFlow(new CatchingFishWidgetHiltKtor(CatchingFishStateFlowLayout.CatchingFishParcelableFAB(obj)));
                                if (catchingFishIntentStateFlow.CatchingFishParcelableFAB.CatchingFishParcelableFAB.isEmpty()) {
                                    String CatchingFishSensorManager = CatchingFishAdMobFAB.CatchingFishSensorManager(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        CatchingFishStateFlowLayout.CatchingFishSnackbar(systemService, CatchingFishHiltViewModel.CatchingFishParcelableFAB(CatchingFishSensorManager));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            catchingFishIntentStateFlow = CatchingFishIntentStateFlow.CatchingFishSnackbar;
                            if (catchingFishIntentStateFlow.CatchingFishParcelableFAB.CatchingFishParcelableFAB.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                CatchingFishBundleDagger.CatchingFishLayout = true;
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new CatchingFishDagger(this.CatchingFishDaggerWebsocket, 3));
                break;
            default:
                CatchingFishFirebaseDagger.CatchingFishStripeAPI(this.CatchingFishDaggerWebsocket, new CatchingFishExoPlayerRealm(), CatchingFishFirebaseDagger.CatchingFishCloudMessaging, false);
                break;
        }
    }
}
