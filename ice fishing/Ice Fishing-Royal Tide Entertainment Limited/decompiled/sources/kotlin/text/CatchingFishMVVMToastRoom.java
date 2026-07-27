package kotlin.text;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class CatchingFishMVVMToastRoom extends CatchingFishAndroidXService implements CatchingFishStripeAPIToast {
    public static final Method CatchingFishJobScheduler;
    public CatchingFishServiceHilt CatchingFishMutableLiveData;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                CatchingFishJobScheduler = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // kotlin.text.CatchingFishStripeAPIToast
    public final void CatchingFishCoroutine(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, CatchingFishKtorAdMob catchingFishKtorAdMob) {
        CatchingFishServiceHilt catchingFishServiceHilt = this.CatchingFishMutableLiveData;
        if (catchingFishServiceHilt != null) {
            catchingFishServiceHilt.CatchingFishCoroutine(catchingFishSharedFlowAdMob, catchingFishKtorAdMob);
        }
    }

    @Override // kotlin.text.CatchingFishStripeAPIToast
    public final void CatchingFishLayout(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, MenuItem menuItem) {
        CatchingFishServiceHilt catchingFishServiceHilt = this.CatchingFishMutableLiveData;
        if (catchingFishServiceHilt != null) {
            catchingFishServiceHilt.CatchingFishLayout(catchingFishSharedFlowAdMob, menuItem);
        }
    }

    @Override // kotlin.text.CatchingFishAndroidXService
    public final CatchingFishCameraXOkHttp CatchingFishRoomDatabase(Context context, boolean z) {
        CatchingFishGlideFragment catchingFishGlideFragment = new CatchingFishGlideFragment(context, z);
        catchingFishGlideFragment.setHoverListener(this);
        return catchingFishGlideFragment;
    }
}
