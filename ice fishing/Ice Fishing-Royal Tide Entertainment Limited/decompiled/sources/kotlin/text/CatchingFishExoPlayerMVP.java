package kotlin.text;

import android.os.SystemClock;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerMVP implements CatchingFishMVIWorkManager {
    public static final int CatchingFishCoroutine(int i, long j) {
        int i2 = CatchingFishMVIFABToolbar.CatchingFishSnackbar;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static CatchingFishServiceMockk CatchingFishDaggerWebsocket(CatchingFishSharedFlowMVI catchingFishSharedFlowMVI) {
        CatchingFishServiceMockk catchingFishServiceMockk;
        View view = (View) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishFABExoPlayer.CatchingFishWorkManager);
        WeakHashMap weakHashMap = CatchingFishServiceMockk.CatchingFishDaggerHiltFAB;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new CatchingFishServiceMockk(view);
                    weakHashMap.put(view, obj);
                }
                catchingFishServiceMockk = (CatchingFishServiceMockk) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean CatchingFishViewModelScope = catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishServiceMockk) | catchingFishSharedFlowMVI.CatchingFishViewModelScope(view);
        Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
        if (CatchingFishViewModelScope || CatchingFishPayPalService == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
            CatchingFishPayPalService = new CatchingFishOkHttpRedux(11, catchingFishServiceMockk, view);
            catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
        }
        CatchingFishXMLLayoutGlide.CatchingFishSnackbar(catchingFishServiceMockk, (CatchingFishServiceHandler) CatchingFishPayPalService, catchingFishSharedFlowMVI);
        return catchingFishServiceMockk;
    }

    public static final CatchingFishGsonGradle CatchingFishReduxKtor(String str, int i) {
        WeakHashMap weakHashMap = CatchingFishServiceMockk.CatchingFishDaggerHiltFAB;
        return new CatchingFishGsonGradle(new CatchingFishWidgetRoom(0, 0, 0, 0), str);
    }

    public static final CatchingFishMVPSnackbar CatchingFishSnackbar(String str, int i) {
        WeakHashMap weakHashMap = CatchingFishServiceMockk.CatchingFishDaggerHiltFAB;
        return new CatchingFishMVPSnackbar(str, i);
    }

    @Override // kotlin.text.CatchingFishMVIWorkManager
    public long CatchingFishParcelableFAB() {
        return SystemClock.elapsedRealtime();
    }
}
