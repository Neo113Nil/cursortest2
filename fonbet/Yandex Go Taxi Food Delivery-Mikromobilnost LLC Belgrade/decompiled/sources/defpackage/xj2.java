package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ToolbarView;
import defpackage.sls;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes3.dex */
public final class xj2 {
    public AnimatorSet a;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final c761 c761Var, int i, final p61 p61Var) {
        Float valueOf;
        float f;
        ObjectAnimator objectAnimator;
        int i2;
        Float valueOf2;
        boolean z;
        ObjectAnimator objectAnimator2;
        Float valueOf3;
        Float f2;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        Float valueOf4;
        ObjectAnimator objectAnimator5;
        Float valueOf5;
        ObjectAnimator objectAnimator6;
        Float valueOf6;
        ObjectAnimator objectAnimator7;
        Float valueOf7;
        long j;
        ObjectAnimator objectAnimator8;
        Collection j2;
        Float valueOf8;
        Float valueOf9 = Float.valueOf(90.0f);
        Float valueOf10 = Float.valueOf(-90.0f);
        d761 d761Var = c761Var.c;
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.a = null;
        int angle = c761Var.g.getAngle();
        FrameLayout frameLayout = c761Var.a;
        float height = frameLayout.getHeight() / 3.0f;
        float width = frameLayout.getWidth() / 2.0f;
        boolean z2 = !(Math.abs(i - angle) <= 90 || angle == 0 || i == 0) || i == 180 || angle == 180;
        AppCompatTextView appCompatTextView = d761Var.d;
        if (i == 0) {
            valueOf = Float.valueOf(angle == 270 ? -90.0f : 90.0f);
        } else if (i == 90) {
            valueOf = valueOf10;
        } else {
            if (i != 270) {
                f = 2.0f;
                valueOf = null;
                if (valueOf == null) {
                    objectAnimator = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ROTATION, 0.0f, valueOf.floatValue());
                    objectAnimator.setDuration(300L);
                    objectAnimator.setStartDelay(100L);
                } else {
                    objectAnimator = null;
                }
                if (i == 0) {
                    if (i == 90) {
                        valueOf8 = Float.valueOf(width);
                    } else if (i != 270) {
                        i2 = angle;
                        valueOf2 = null;
                    } else {
                        valueOf8 = Float.valueOf(-width);
                    }
                    valueOf2 = valueOf8;
                    i2 = angle;
                } else {
                    i2 = angle;
                    valueOf2 = Float.valueOf(i2 == 270 ? height : -height);
                }
                if (valueOf2 == null) {
                    objectAnimator2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_X, 0.0f, valueOf2.floatValue());
                    z = z2;
                    objectAnimator2.setDuration(300L);
                    objectAnimator2.setStartDelay(100L);
                } else {
                    z = z2;
                    objectAnimator2 = null;
                }
                if (i == 0) {
                    valueOf3 = i != 90 ? i != 270 ? null : Float.valueOf(height) : Float.valueOf(-height);
                } else {
                    valueOf3 = Float.valueOf(i2 == 270 ? -height : height);
                }
                if (valueOf3 == null) {
                    f2 = valueOf9;
                    objectAnimator3 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, 0.0f, valueOf3.floatValue());
                    objectAnimator3.setDuration(300L);
                    objectAnimator3.setStartDelay(100L);
                } else {
                    f2 = valueOf9;
                    objectAnimator3 = null;
                }
                List A = j73.A(new ObjectAnimator[]{objectAnimator, objectAnimator2, objectAnimator3});
                ToolbarView toolbarView = d761Var.n;
                if (i != 0) {
                    f2 = Float.valueOf(i2 == 270 ? -90.0f : 90.0f);
                } else if (i == 90) {
                    f2 = valueOf10;
                } else if (i != 270) {
                    f2 = null;
                }
                if (f2 == null) {
                    objectAnimator4 = ObjectAnimator.ofFloat(toolbarView, (Property<ToolbarView, Float>) View.ROTATION, 0.0f, f2.floatValue());
                    objectAnimator4.setDuration(300L);
                    objectAnimator4.setStartDelay(100L);
                } else {
                    objectAnimator4 = null;
                }
                if (i == 0) {
                    valueOf4 = i != 90 ? i != 270 ? null : Float.valueOf(width) : Float.valueOf(-width);
                } else {
                    valueOf4 = Float.valueOf(i2 == 270 ? -height : height);
                }
                if (valueOf4 == null) {
                    objectAnimator5 = ObjectAnimator.ofFloat(toolbarView, (Property<ToolbarView, Float>) View.TRANSLATION_X, 0.0f, valueOf4.floatValue());
                    objectAnimator5.setDuration(300L);
                    objectAnimator5.setStartDelay(100L);
                } else {
                    objectAnimator5 = null;
                }
                if (i == 0) {
                    valueOf5 = i != 90 ? i != 270 ? null : Float.valueOf(height) : Float.valueOf(height);
                } else {
                    valueOf5 = Float.valueOf(i2 == 270 ? -height : height);
                }
                if (valueOf5 == null) {
                    objectAnimator6 = ObjectAnimator.ofFloat(toolbarView, (Property<ToolbarView, Float>) View.TRANSLATION_Y, 0.0f, valueOf5.floatValue());
                    objectAnimator6.setDuration(300L);
                    objectAnimator6.setStartDelay(100L);
                } else {
                    objectAnimator6 = null;
                }
                List A2 = j73.A(new ObjectAnimator[]{objectAnimator4, objectAnimator5, objectAnimator6});
                AppCompatImageView appCompatImageView = d761Var.b;
                Float valueOf11 = i == 90 ? i != 270 ? null : Float.valueOf(-width) : Float.valueOf(width);
                valueOf6 = valueOf11 == null ? Float.valueOf(valueOf11.floatValue() / f) : null;
                if (valueOf6 == null) {
                    objectAnimator7 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) View.TRANSLATION_X, 0.0f, valueOf6.floatValue());
                    objectAnimator7.setDuration(300L);
                    objectAnimator7.setStartDelay(100L);
                } else {
                    objectAnimator7 = null;
                }
                valueOf7 = i != 0 ? Float.valueOf((-height) / f) : null;
                if (valueOf7 == null) {
                    objectAnimator8 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) View.TRANSLATION_Y, 0.0f, valueOf7.floatValue());
                    j = 300;
                    objectAnimator8.setDuration(300L);
                    objectAnimator8.setStartDelay(100L);
                } else {
                    j = 300;
                    objectAnimator8 = null;
                }
                List A3 = j73.A(new ObjectAnimator[]{objectAnimator7, objectAnimator8});
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d761Var.a, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat.setDuration(j);
                ListBuilder a = rcc.a();
                a.addAll(A);
                a.addAll(A2);
                a.addAll(A3);
                j2 = z ? a.j() : null;
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                if (j2 == null) {
                    j2 = EmptyList.a;
                }
                animatorSet2.playTogether(a.o0(j2, ofFloat));
                animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.kyc.internal.screens.photo.helpers.AnimationsHelper$animateRotation$lambda$4$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        sls.this.invoke();
                        c761Var.c.a.animate().alpha(1.0f).setDuration(300L).setStartDelay(100L).start();
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                animatorSet2.start();
                this.a = animatorSet2;
            }
            valueOf = valueOf9;
        }
        f = 2.0f;
        if (valueOf == null) {
        }
        if (i == 0) {
        }
        if (valueOf2 == null) {
        }
        if (i == 0) {
        }
        if (valueOf3 == null) {
        }
        List A4 = j73.A(new ObjectAnimator[]{objectAnimator, objectAnimator2, objectAnimator3});
        ToolbarView toolbarView2 = d761Var.n;
        if (i != 0) {
        }
        if (f2 == null) {
        }
        if (i == 0) {
        }
        if (valueOf4 == null) {
        }
        if (i == 0) {
        }
        if (valueOf5 == null) {
        }
        List A22 = j73.A(new ObjectAnimator[]{objectAnimator4, objectAnimator5, objectAnimator6});
        AppCompatImageView appCompatImageView2 = d761Var.b;
        if (i == 90) {
        }
        if (valueOf11 == null) {
        }
        if (valueOf6 == null) {
        }
        if (i != 0) {
        }
        if (valueOf7 == null) {
        }
        List A32 = j73.A(new ObjectAnimator[]{objectAnimator7, objectAnimator8});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(d761Var.a, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat2.setDuration(j);
        ListBuilder a2 = rcc.a();
        a2.addAll(A4);
        a2.addAll(A22);
        a2.addAll(A32);
        if (z) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        animatorSet22.setInterpolator(new AccelerateDecelerateInterpolator());
        if (j2 == null) {
        }
        animatorSet22.playTogether(a.o0(j2, ofFloat2));
        animatorSet22.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.kyc.internal.screens.photo.helpers.AnimationsHelper$animateRotation$lambda$4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                sls.this.invoke();
                c761Var.c.a.animate().alpha(1.0f).setDuration(300L).setStartDelay(100L).start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorSet22.start();
        this.a = animatorSet22;
    }
}
