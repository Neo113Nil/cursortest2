package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import defpackage.bln0;
import defpackage.cln0;
import defpackage.cma1;
import defpackage.ehn0;
import defpackage.i3y;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.pfh0;
import defpackage.qrh0;
import defpackage.r0h0;
import defpackage.scc;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010*\u001a\r\u0012\t\u0012\u00070$¢\u0006\u0002\b%0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/yandex/taxi/scooters/presentation/feedback/newbie/ScootersFeedbackCardNewbieHeader;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "text", "Lzy11;", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "Landroid/graphics/Bitmap;", "bitmap", "setImage", "(Landroid/graphics/Bitmap;)V", "currentStep", "setProgress", "(I)V", "Lnsz;", "animation", "playAnimation", "(Lnsz;)V", "Lcln0;", "uiState", "bindUiState", "(Lcln0;)V", "Lbln0;", "binding", "Lbln0;", "", "Lcom/yandex/go/design/view/GoView;", "Lkotlin/jvm/internal/EnhancedNullability;", "progressSteps$delegate", "Li3y;", "getProgressSteps", "()Ljava/util/List;", "progressSteps", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersFeedbackCardNewbieHeader extends GoConstraintLayout {
    public static final int $stable = 8;
    private final bln0 binding;

    /* renamed from: progressSteps$delegate, reason: from kotlin metadata */
    private final i3y progressSteps;

    public ScootersFeedbackCardNewbieHeader(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View inflate = LayoutInflater.from(context).inflate(qrh0.scooters_feedback_card_newbie_header, (ViewGroup) this, false);
        addView(inflate);
        int i3 = pfh0.image_view;
        GoImageView goImageView = (GoImageView) cma1.O(i3, inflate);
        if (goImageView != null) {
            i3 = pfh0.lottie_animation_view;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i3, inflate);
            if (lottieAnimationView != null) {
                i3 = pfh0.progress_container;
                if (((GoLinearLayout) cma1.O(i3, inflate)) != null) {
                    i3 = pfh0.progress_step_1;
                    GoView goView = (GoView) cma1.O(i3, inflate);
                    if (goView != null) {
                        i3 = pfh0.progress_step_2;
                        GoView goView2 = (GoView) cma1.O(i3, inflate);
                        if (goView2 != null) {
                            i3 = pfh0.progress_step_3;
                            GoView goView3 = (GoView) cma1.O(i3, inflate);
                            if (goView3 != null) {
                                i3 = pfh0.subtitle_text_view;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
                                if (robotoTextView != null) {
                                    i3 = pfh0.title_text_view;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, inflate);
                                    if (robotoTextView2 != null) {
                                        this.binding = new bln0((GoConstraintLayout) inflate, goImageView, lottieAnimationView, goView, goView2, goView3, robotoTextView, robotoTextView2);
                                        this.progressSteps = kotlin.a.b(LazyThreadSafetyMode.NONE, new ehn0(3, this));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    private final List<GoView> getProgressSteps() {
        return (List) this.progressSteps.getValue();
    }

    private final void playAnimation(nsz animation) {
        LottieAnimationView lottieAnimationView = this.binding.c;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setComposition(animation);
        lottieAnimationView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List progressSteps_delegate$lambda$0(ScootersFeedbackCardNewbieHeader scootersFeedbackCardNewbieHeader) {
        bln0 bln0Var = scootersFeedbackCardNewbieHeader.binding;
        return scc.g(bln0Var.d, bln0Var.e, bln0Var.f);
    }

    private final void setImage(Bitmap bitmap) {
        this.binding.b.setImageBitmap(bitmap);
    }

    private final void setProgress(int currentStep) {
        int i = 0;
        for (Object obj : getProgressSteps()) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ((GoView) obj).setBackgroundResource(i < currentStep ? r0h0.scooters_newbie_progress_active : r0h0.scooters_newbie_progress_inactive);
            i = i2;
        }
    }

    private final void setSubtitle(CharSequence text) {
        this.binding.g.setText(text);
    }

    private final void setTitle(CharSequence text) {
        this.binding.h.setText(text);
    }

    public final void bindUiState(cln0 uiState) {
        setTitle(uiState.a);
        setSubtitle(uiState.b);
        setImage(uiState.d);
        setProgress(uiState.c);
        nsz nszVar = uiState.e;
        if (nszVar != null) {
            playAnimation(nszVar);
        }
    }

    public ScootersFeedbackCardNewbieHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersFeedbackCardNewbieHeader(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersFeedbackCardNewbieHeader(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersFeedbackCardNewbieHeader(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
