package kotlin.text;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class CatchingFishBundleDagger {
    public static final CatchingFishCardViewMVI CatchingFishReduxKtor = new CatchingFishCardViewMVI(new CatchingFishToastGraphQLMVP(2));
    public static final int CatchingFishDaggerWebsocket = -100;
    public static CatchingFishIntentStateFlow CatchingFishWorkManager = null;
    public static CatchingFishIntentStateFlow CatchingFishViewModelScope = null;
    public static Boolean CatchingFishViewModelFAB = null;
    public static boolean CatchingFishLayout = false;
    public static final CatchingFishRoomStateFlow CatchingFishFragmentHandler = new CatchingFishRoomStateFlow(0);
    public static final Object CatchingFishCloudMessaging = new Object();
    public static final Object CatchingFishEspressoTesting = new Object();

    public static boolean CatchingFishParcelableFAB(Context context) {
        if (CatchingFishViewModelFAB == null) {
            try {
                int i = AppLocalesMetadataHolderService.CatchingFishReduxKtor;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), CatchingFishServiceAdMob.CatchingFishParcelableFAB() | 128).metaData;
                if (bundle != null) {
                    CatchingFishViewModelFAB = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                CatchingFishViewModelFAB = Boolean.FALSE;
            }
        }
        return CatchingFishViewModelFAB.booleanValue();
    }

    public static void CatchingFishReduxKtor(CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor) {
        synchronized (CatchingFishCloudMessaging) {
            try {
                CatchingFishRoomStateFlow catchingFishRoomStateFlow = CatchingFishFragmentHandler;
                catchingFishRoomStateFlow.getClass();
                CatchingFishHiltToast catchingFishHiltToast = new CatchingFishHiltToast(catchingFishRoomStateFlow);
                while (catchingFishHiltToast.hasNext()) {
                    CatchingFishBundleDagger catchingFishBundleDagger = (CatchingFishBundleDagger) ((WeakReference) catchingFishHiltToast.next()).get();
                    if (catchingFishBundleDagger == catchingFishMockkWidgetKtor || catchingFishBundleDagger == null) {
                        catchingFishHiltToast.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void CatchingFishCloudMessaging(CharSequence charSequence);

    public abstract void CatchingFishCoroutine();

    public abstract boolean CatchingFishDaggerWebsocket(int i);

    public abstract void CatchingFishFragmentHandler(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void CatchingFishLayout(View view);

    public abstract void CatchingFishSnackbar();

    public abstract void CatchingFishViewModelScope(int i);
}
