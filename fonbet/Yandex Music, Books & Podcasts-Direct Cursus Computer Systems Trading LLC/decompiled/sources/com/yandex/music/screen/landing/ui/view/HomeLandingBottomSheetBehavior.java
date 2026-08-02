package com.yandex.music.screen.landing.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.a1e;
import defpackage.bf3;
import defpackage.e6d;
import defpackage.hag;
import defpackage.l18;
import defpackage.mvd;
import defpackage.xe3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001eB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R.\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00130\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010&R\u0016\u00109\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010&R\u0016\u0010:\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00107R\u0016\u0010;\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0016\u0010<\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00107R\u0016\u0010=\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00107R\u0016\u0010>\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00107¨\u0006?"}, d2 = {"Lcom/yandex/music/screen/landing/ui/view/HomeLandingBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "initialize", "(Landroid/content/Context;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "Landroid/view/MotionEvent;", NetcastTVService.UDAP_API_EVENT, "", "onInterceptTouchEvent", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "onTouchEvent", "Lkotlin/Function1;", "canSlideDownCallback", "Lkotlin/jvm/functions/Function1;", "getCanSlideDownCallback", "()Lkotlin/jvm/functions/Function1;", "setCanSlideDownCallback", "(Lkotlin/jvm/functions/Function1;)V", "La1e;", "slideDownCallback", "La1e;", "getSlideDownCallback", "()La1e;", "setSlideDownCallback", "(La1e;)V", "fullScrollingEnabled", "Z", "getFullScrollingEnabled", "()Z", "setFullScrollingEnabled", "(Z)V", "canInterceptTouchEvents", "getCanInterceptTouchEvents", "setCanInterceptTouchEvents", "Landroid/content/Context;", "Le6d;", "slideDownGestureDetector", "Le6d;", "", "touchSlop", "I", "", "slideOffset", "F", "isFirstScroll", "fullScrollStarted", "lastX", "lastY", "initialDownY", "xDistance", "yDistance", "landing-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class HomeLandingBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public static final int $stable = 8;
    private boolean canInterceptTouchEvents;

    @NotNull
    private Function1<? super View, Boolean> canSlideDownCallback;

    @NotNull
    private final Context context;
    private boolean fullScrollStarted;
    private boolean fullScrollingEnabled;
    private float initialDownY;
    private boolean isFirstScroll;
    private float lastX;
    private float lastY;
    private a1e slideDownCallback;
    private e6d slideDownGestureDetector;
    private float slideOffset;
    private int touchSlop;
    private float xDistance;
    private float yDistance;

    public HomeLandingBottomSheetBehavior() {
        this.canSlideDownCallback = new mvd(1);
        this.fullScrollingEnabled = true;
        this.canInterceptTouchEvents = true;
        this.slideOffset = -1.0f;
        Context context = (Context) l18.b.c(hag.I(Context.class));
        this.context = context;
        initialize(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canSlideDownCallback$lambda$0(View view) {
        view.getClass();
        return true;
    }

    private final void initialize(Context context) {
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        addBottomSheetCallback(new xe3(4, this));
        e6d e6dVar = new e6d(context, new bf3(4, this), null);
        e6dVar.a.setIsLongpressEnabled(false);
        this.slideDownGestureDetector = e6dVar;
    }

    public final boolean getCanInterceptTouchEvents() {
        return this.canInterceptTouchEvents;
    }

    @NotNull
    public final Function1<View, Boolean> getCanSlideDownCallback() {
        return this.canSlideDownCallback;
    }

    public final boolean getFullScrollingEnabled() {
        return this.fullScrollingEnabled;
    }

    public final a1e getSlideDownCallback() {
        return this.slideDownCallback;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.uk6
    public boolean onInterceptTouchEvent(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull MotionEvent event) {
        parent.getClass();
        child.getClass();
        event.getClass();
        int actionMasked = event.getActionMasked();
        boolean z = true;
        if (actionMasked == 0) {
            this.fullScrollStarted = false;
            if (this.fullScrollingEnabled && getState() != 3 && !parent.z(child, (int) event.getX(), (int) event.getY())) {
                this.fullScrollStarted = true;
                super.onTouchEvent(parent, child, event);
            }
            e6d e6dVar = this.slideDownGestureDetector;
            if (e6dVar == null) {
                Intrinsics.j("slideDownGestureDetector");
                throw null;
            }
            e6dVar.a.onTouchEvent(event);
            this.lastX = event.getX();
            this.lastY = event.getY();
            this.initialDownY = event.getY();
            this.xDistance = 0.0f;
            this.yDistance = 0.0f;
            return false;
        }
        if (actionMasked == 2) {
            float x = event.getX();
            float y = event.getY();
            float f = this.initialDownY - y;
            this.xDistance = Math.abs(x - this.lastX) + this.xDistance;
            this.yDistance = Math.abs(y - this.lastY) + this.yDistance;
            this.lastX = x;
            this.lastY = y;
            boolean z2 = this.fullScrollingEnabled;
            if ((!z2 || this.fullScrollStarted) && ((z2 || parent.z(child, (int) event.getX(), (int) event.getY())) && this.xDistance <= this.yDistance * 0.8f)) {
                if (this.fullScrollingEnabled) {
                    z = false;
                    if (this.yDistance > this.touchSlop && z) {
                        return this.canInterceptTouchEvents;
                    }
                } else {
                    z = false;
                    if (this.yDistance > this.touchSlop) {
                        return this.canInterceptTouchEvents;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.uk6
    public boolean onTouchEvent(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull MotionEvent event) {
        parent.getClass();
        child.getClass();
        event.getClass();
        if (!this.fullScrollingEnabled) {
            e6d e6dVar = this.slideDownGestureDetector;
            if (e6dVar == null) {
                Intrinsics.j("slideDownGestureDetector");
                throw null;
            }
            if (e6dVar.a.onTouchEvent(event)) {
                return true;
            }
        }
        return this.fullScrollingEnabled && super.onTouchEvent(parent, child, event);
    }

    public final void setCanInterceptTouchEvents(boolean z) {
        this.canInterceptTouchEvents = z;
    }

    public final void setCanSlideDownCallback(@NotNull Function1<? super View, Boolean> function1) {
        function1.getClass();
        this.canSlideDownCallback = function1;
    }

    public final void setFullScrollingEnabled(boolean z) {
        this.fullScrollingEnabled = z;
    }

    public final void setSlideDownCallback(a1e a1eVar) {
        this.slideDownCallback = a1eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeLandingBottomSheetBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.canSlideDownCallback = new mvd(1);
        this.fullScrollingEnabled = true;
        this.canInterceptTouchEvents = true;
        this.slideOffset = -1.0f;
        this.context = context;
        initialize(context);
    }
}
