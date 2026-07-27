package kotlin.text;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.adjust.sdk.network.ErrorCodes;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishToolbarRealm implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static CatchingFishToolbarRealm CatchingFishAnimationMockk;
    public static CatchingFishToolbarRealm CatchingFishUnitTesting;
    public CatchingFishHiltPayPal CatchingFishCloudMessaging;
    public final CharSequence CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public final View CatchingFishReduxKtor;
    public final CatchingFishGlideMVPRedux CatchingFishViewModelFAB;
    public final CatchingFishGlideMVPRedux CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.text.CatchingFishGlideMVPRedux] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.text.CatchingFishGlideMVPRedux] */
    public CatchingFishToolbarRealm(View view, CharSequence charSequence) {
        final int i = 0;
        this.CatchingFishViewModelScope = new Runnable(this) { // from class: kotlin.text.CatchingFishGlideMVPRedux
            public final /* synthetic */ CatchingFishToolbarRealm CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        this.CatchingFishDaggerWebsocket.CatchingFishCoroutine(false);
                        break;
                    default:
                        this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.CatchingFishViewModelFAB = new Runnable(this) { // from class: kotlin.text.CatchingFishGlideMVPRedux
            public final /* synthetic */ CatchingFishToolbarRealm CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        this.CatchingFishDaggerWebsocket.CatchingFishCoroutine(false);
                        break;
                    default:
                        this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                        break;
                }
            }
        };
        this.CatchingFishReduxKtor = view;
        this.CatchingFishDaggerWebsocket = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB;
        this.CatchingFishWorkManager = Build.VERSION.SDK_INT >= 28 ? CatchingFishRobolectricFlux.CatchingFishFragmentHandler(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.CatchingFishOkHttp = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void CatchingFishSnackbar(CatchingFishToolbarRealm catchingFishToolbarRealm) {
        CatchingFishToolbarRealm catchingFishToolbarRealm2 = CatchingFishUnitTesting;
        if (catchingFishToolbarRealm2 != null) {
            catchingFishToolbarRealm2.CatchingFishReduxKtor.removeCallbacks(catchingFishToolbarRealm2.CatchingFishViewModelScope);
        }
        CatchingFishUnitTesting = catchingFishToolbarRealm;
        if (catchingFishToolbarRealm != null) {
            catchingFishToolbarRealm.CatchingFishReduxKtor.postDelayed(catchingFishToolbarRealm.CatchingFishViewModelScope, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [int[], java.io.Serializable] */
    public final void CatchingFishCoroutine(boolean z) {
        int height;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.CatchingFishReduxKtor;
        if (view.isAttachedToWindow()) {
            CatchingFishSnackbar(null);
            CatchingFishToolbarRealm catchingFishToolbarRealm = CatchingFishAnimationMockk;
            if (catchingFishToolbarRealm != null) {
                catchingFishToolbarRealm.CatchingFishParcelableFAB();
            }
            CatchingFishAnimationMockk = this;
            this.CatchingFishEspressoTesting = z;
            Context context = view.getContext();
            CatchingFishHiltPayPal catchingFishHiltPayPal = new CatchingFishHiltPayPal();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            catchingFishHiltPayPal.CatchingFishReduxKtor = layoutParams;
            catchingFishHiltPayPal.CatchingFishDaggerWebsocket = new Rect();
            catchingFishHiltPayPal.CatchingFishWorkManager = new int[2];
            catchingFishHiltPayPal.CatchingFishViewModelScope = new int[2];
            catchingFishHiltPayPal.CatchingFishParcelableFAB = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            catchingFishHiltPayPal.CatchingFishSnackbar = inflate;
            catchingFishHiltPayPal.CatchingFishCoroutine = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(CatchingFishHiltPayPal.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) catchingFishHiltPayPal.CatchingFishSnackbar;
            Context context2 = (Context) catchingFishHiltPayPal.CatchingFishParcelableFAB;
            this.CatchingFishCloudMessaging = catchingFishHiltPayPal;
            int i5 = this.CatchingFishLayout;
            int i6 = this.CatchingFishFragmentHandler;
            boolean z3 = this.CatchingFishEspressoTesting;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) catchingFishHiltPayPal.CatchingFishReduxKtor;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) catchingFishHiltPayPal.CatchingFishCoroutine).setText(this.CatchingFishDaggerWebsocket);
            int[] iArr = (int[]) catchingFishHiltPayPal.CatchingFishViewModelScope;
            int[] iArr2 = (int[]) catchingFishHiltPayPal.CatchingFishWorkManager;
            Rect rect = (Rect) catchingFishHiltPayPal.CatchingFishDaggerWebsocket;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i5 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i6 + dimensionPixelOffset2;
                i = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i7 = i5;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i;
                    z2 = z3;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i4 = 1;
                    i2 = i;
                    z2 = z3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i8;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams2.x = (i8 + i7) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i4];
                int i10 = ((i9 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i10 >= 0) {
                        layoutParams2.y = i10;
                    } else {
                        layoutParams2.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams2.y = i11;
                } else {
                    layoutParams2.y = i10;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.CatchingFishEspressoTesting) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            CatchingFishGlideMVPRedux catchingFishGlideMVPRedux = this.CatchingFishViewModelFAB;
            view.removeCallbacks(catchingFishGlideMVPRedux);
            view.postDelayed(catchingFishGlideMVPRedux, j2);
        }
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishToolbarRealm catchingFishToolbarRealm = CatchingFishAnimationMockk;
        View view = this.CatchingFishReduxKtor;
        if (catchingFishToolbarRealm == this) {
            CatchingFishAnimationMockk = null;
            CatchingFishHiltPayPal catchingFishHiltPayPal = this.CatchingFishCloudMessaging;
            if (catchingFishHiltPayPal != null) {
                View view2 = (View) catchingFishHiltPayPal.CatchingFishSnackbar;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) catchingFishHiltPayPal.CatchingFishParcelableFAB).getSystemService("window")).removeView(view2);
                }
                this.CatchingFishCloudMessaging = null;
                this.CatchingFishOkHttp = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (CatchingFishUnitTesting == this) {
            CatchingFishSnackbar(null);
        }
        view.removeCallbacks(this.CatchingFishViewModelFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.CatchingFishFragmentHandler) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.CatchingFishCloudMessaging == null || !this.CatchingFishEspressoTesting) {
            View view2 = this.CatchingFishReduxKtor;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.CatchingFishOkHttp = true;
                        CatchingFishParcelableFAB();
                        return false;
                    }
                } else if (view2.isEnabled() && this.CatchingFishCloudMessaging == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.CatchingFishOkHttp) {
                        int abs = Math.abs(x - this.CatchingFishLayout);
                        int i = this.CatchingFishWorkManager;
                        if (abs <= i) {
                        }
                    }
                    this.CatchingFishLayout = x;
                    this.CatchingFishFragmentHandler = y;
                    this.CatchingFishOkHttp = false;
                    CatchingFishSnackbar(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.CatchingFishLayout = view.getWidth() / 2;
        this.CatchingFishFragmentHandler = view.getHeight() / 2;
        CatchingFishCoroutine(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        CatchingFishParcelableFAB();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
