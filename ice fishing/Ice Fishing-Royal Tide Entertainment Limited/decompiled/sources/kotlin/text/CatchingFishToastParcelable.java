package kotlin.text;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public class CatchingFishToastParcelable {
    public final boolean CatchingFishCoroutine;
    public View CatchingFishDaggerWebsocket;
    public PopupWindow.OnDismissListener CatchingFishFragmentHandler;
    public CatchingFishMVPEspresso CatchingFishLayout;
    public final Context CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final CatchingFishSharedFlowAdMob CatchingFishSnackbar;
    public CatchingFishDaggerAdMob CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public int CatchingFishWorkManager = 8388611;
    public final CatchingFishToastContext CatchingFishCloudMessaging = new CatchingFishToastContext(this);

    public CatchingFishToastParcelable(Context context, CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, View view, boolean z, int i, int i2) {
        this.CatchingFishParcelableFAB = context;
        this.CatchingFishSnackbar = catchingFishSharedFlowAdMob;
        this.CatchingFishDaggerWebsocket = view;
        this.CatchingFishCoroutine = z;
        this.CatchingFishReduxKtor = i;
    }

    public void CatchingFishCoroutine() {
        this.CatchingFishLayout = null;
        PopupWindow.OnDismissListener onDismissListener = this.CatchingFishFragmentHandler;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final CatchingFishMVPEspresso CatchingFishParcelableFAB() {
        CatchingFishMVPEspresso catchingFishWebSocketGlide;
        if (this.CatchingFishLayout == null) {
            Context context = this.CatchingFishParcelableFAB;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                catchingFishWebSocketGlide = new CatchingFishSpannableMockk(context, this.CatchingFishDaggerWebsocket, this.CatchingFishReduxKtor, this.CatchingFishCoroutine);
            } else {
                catchingFishWebSocketGlide = new CatchingFishWebSocketGlide(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, this.CatchingFishDaggerWebsocket, this.CatchingFishReduxKtor, this.CatchingFishCoroutine);
            }
            catchingFishWebSocketGlide.CatchingFishEspressoTesting(this.CatchingFishSnackbar);
            catchingFishWebSocketGlide.CatchingFishNavigation(this.CatchingFishCloudMessaging);
            catchingFishWebSocketGlide.CatchingFishUnitTesting(this.CatchingFishDaggerWebsocket);
            catchingFishWebSocketGlide.CatchingFishFragmentHandler(this.CatchingFishViewModelFAB);
            catchingFishWebSocketGlide.CatchingFishAnimationMockk(this.CatchingFishViewModelScope);
            catchingFishWebSocketGlide.CatchingFishStateLiveData(this.CatchingFishWorkManager);
            this.CatchingFishLayout = catchingFishWebSocketGlide;
        }
        return this.CatchingFishLayout;
    }

    public final void CatchingFishReduxKtor(int i, int i2, boolean z, boolean z2) {
        CatchingFishMVPEspresso CatchingFishParcelableFAB = CatchingFishParcelableFAB();
        CatchingFishParcelableFAB.CatchingFish(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.CatchingFishWorkManager, this.CatchingFishDaggerWebsocket.getLayoutDirection()) & 7) == 5) {
                i -= this.CatchingFishDaggerWebsocket.getWidth();
            }
            CatchingFishParcelableFAB.CatchingFishRoomDatabase(i);
            CatchingFishParcelableFAB.CatchingFishJetpackCompose(i2);
            int i3 = (int) ((this.CatchingFishParcelableFAB.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            CatchingFishParcelableFAB.CatchingFishReduxKtor = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        CatchingFishParcelableFAB.CatchingFishReduxKtor();
    }

    public final boolean CatchingFishSnackbar() {
        CatchingFishMVPEspresso catchingFishMVPEspresso = this.CatchingFishLayout;
        return catchingFishMVPEspresso != null && catchingFishMVPEspresso.CatchingFishParcelableFAB();
    }
}
