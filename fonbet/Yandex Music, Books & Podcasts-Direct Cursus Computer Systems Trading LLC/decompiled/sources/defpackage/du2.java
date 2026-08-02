package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.hu2;
import defpackage.iu2;
import defpackage.ju2;
import defpackage.x3n;
import java.util.List;

/* loaded from: classes3.dex */
public final class du2 implements Handler.Callback {
    public final /* synthetic */ int a;

    public /* synthetic */ du2(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.material.behavior.SwipeDismissBehavior, com.google.android.material.snackbar.BaseTransientBottomBar$Behavior, uk6] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = 0;
        switch (this.a) {
            case 0:
                int i2 = message.what;
                if (i2 == 0) {
                    ju2 ju2Var = (ju2) message.obj;
                    iu2 iu2Var = ju2Var.i;
                    if (iu2Var.getParent() == null) {
                        ViewGroup.LayoutParams layoutParams = iu2Var.getLayoutParams();
                        if (layoutParams instanceof xk6) {
                            xk6 xk6Var = (xk6) layoutParams;
                            ?? r4 = new SwipeDismissBehavior<View>() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$Behavior

                                @NonNull
                                private final hu2 delegate;

                                {
                                    hu2 hu2Var = new hu2();
                                    setStartAlphaSwipeDistance(0.1f);
                                    setEndAlphaSwipeDistance(0.6f);
                                    setSwipeDirection(0);
                                    this.delegate = hu2Var;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public void setBaseTransientBottomBar(@NonNull ju2 ju2Var2) {
                                    hu2 hu2Var = this.delegate;
                                    hu2Var.getClass();
                                    hu2Var.a = ju2Var2.t;
                                }

                                @Override // com.google.android.material.behavior.SwipeDismissBehavior
                                public boolean canSwipeDismissView(View view) {
                                    this.delegate.getClass();
                                    return view instanceof iu2;
                                }

                                @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.uk6
                                public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
                                    hu2 hu2Var = this.delegate;
                                    hu2Var.getClass();
                                    int actionMasked = motionEvent.getActionMasked();
                                    if (actionMasked != 0) {
                                        if (actionMasked == 1 || actionMasked == 3) {
                                            x3n.h0().J0(hu2Var.a);
                                        }
                                    } else if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                        x3n.h0().C0(hu2Var.a);
                                    }
                                    return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
                                }
                            };
                            r4.setBaseTransientBottomBar(ju2Var);
                            r4.setListener(new bnd(9, ju2Var));
                            xk6Var.b(r4);
                            xk6Var.g = 80;
                        }
                        ViewGroup viewGroup = ju2Var.g;
                        iu2Var.k = true;
                        viewGroup.addView(iu2Var);
                        iu2Var.k = false;
                        ju2Var.f();
                        iu2Var.setVisibility(4);
                    }
                    if (iu2Var.isLaidOut()) {
                        ju2Var.e();
                        return true;
                    }
                    ju2Var.r = true;
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                ju2 ju2Var2 = (ju2) message.obj;
                int i3 = message.arg1;
                iu2 iu2Var2 = ju2Var2.i;
                AccessibilityManager accessibilityManager = ju2Var2.s;
                if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || iu2Var2.getVisibility() != 0) {
                    ju2Var2.c();
                    return true;
                }
                int i4 = 2;
                if (iu2Var2.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.setInterpolator(ju2Var2.d);
                    ofFloat.addUpdateListener(new cu2(ju2Var2, i));
                    ofFloat.setDuration(ju2Var2.b);
                    ofFloat.addListener(new bu2(ju2Var2, i3, i));
                    ofFloat.start();
                    return true;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                iu2 iu2Var3 = ju2Var2.i;
                int height = iu2Var3.getHeight();
                ViewGroup.LayoutParams layoutParams2 = iu2Var3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                valueAnimator.setIntValues(0, height);
                valueAnimator.setInterpolator(ju2Var2.e);
                valueAnimator.setDuration(ju2Var2.c);
                valueAnimator.addListener(new bu2(ju2Var2, i3, i4));
                valueAnimator.addUpdateListener(new cu2(ju2Var2, 3));
                valueAnimator.start();
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((k2o) message.obj).g();
                return true;
        }
    }
}
