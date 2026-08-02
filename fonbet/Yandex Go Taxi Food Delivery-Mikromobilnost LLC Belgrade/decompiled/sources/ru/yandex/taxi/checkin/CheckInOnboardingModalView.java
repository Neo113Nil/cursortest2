package ru.yandex.taxi.checkin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.go.taxi.order.models.api.response.Instruction;
import defpackage.bzg0;
import defpackage.g18;
import defpackage.gdh0;
import defpackage.hxx;
import defpackage.j37;
import defpackage.k7x0;
import defpackage.kph0;
import defpackage.l7b;
import defpackage.m7x0;
import defpackage.m950;
import defpackage.mpu0;
import defpackage.nac;
import defpackage.npu0;
import defpackage.od9;
import defpackage.oep0;
import defpackage.pav;
import defpackage.pep0;
import defpackage.qdb1;
import defpackage.rfb;
import defpackage.rp31;
import defpackage.tfb;
import defpackage.x3;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.checkin.CheckInOnboardingModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u000289BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006:"}, d2 = {"Lru/yandex/taxi/checkin/CheckInOnboardingModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lk7x0;", "tagUrlFormatter", "Lpav;", "imageLoader", "Lrfb;", "checkInOnboardingAnalytics", "Lyvf0;", "", "storyRouter", "Loep0;", "screenStackNavigator", "Lcom/yandex/go/taxi/order/models/api/response/Instruction;", "instruction", "Lj37;", "buttonStyle", "<init>", "(Landroid/content/Context;Lk7x0;Lpav;Lrfb;Lyvf0;Loep0;Lcom/yandex/go/taxi/order/models/api/response/Instruction;Lj37;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDismissManually", "onDetachedFromWindow", "Lk7x0;", "Lpav;", "Lrfb;", "Lyvf0;", "Loep0;", "Lcom/yandex/go/taxi/order/models/api/response/Instruction;", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "subtitle", "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/widget/RoundedCornersImageView;", "picture", "Lru/yandex/taxi/widget/RoundedCornersImageView;", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "pictureShimmer", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "Lru/yandex/taxi/design/ButtonComponent;", "skipSteps", "Lru/yandex/taxi/design/ButtonComponent;", "showSteps", "Lg18;", "loadPictureTask", "Lg18;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "Companion", "v920", "tfb", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckInOnboardingModalView extends SlideableModalView {
    private static final tfb Companion = new tfb();

    @Deprecated
    public static final String STORIES_OPEN_REASON = "CheckInInstructionsStories";
    private final rfb checkInOnboardingAnalytics;
    private final pav imageLoader;
    private final Instruction instruction;
    private g18 loadPictureTask;
    private final RoundedCornersImageView picture;
    private final ShimmeringFrameLayout pictureShimmer;
    private final oep0 screenStackNavigator;
    private final ButtonComponent showSteps;
    private final ButtonComponent skipSteps;
    private final yvf0 storyRouter;
    private final ListTextComponent subtitle;
    private final k7x0 tagUrlFormatter;
    private final ListTitleComponent title;

    public CheckInOnboardingModalView(Context context, k7x0 k7x0Var, pav pavVar, rfb rfbVar, yvf0 yvf0Var, oep0 oep0Var, Instruction instruction, j37 j37Var) {
        super(context);
        this.tagUrlFormatter = k7x0Var;
        this.imageLoader = pavVar;
        this.checkInOnboardingAnalytics = rfbVar;
        this.storyRouter = yvf0Var;
        this.screenStackNavigator = oep0Var;
        this.instruction = instruction;
        int i = gdh0.title;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ListTitleComponent listTitleComponent = (ListTitleComponent) ((View) rp31.d(this, i));
        this.title = listTitleComponent;
        ListTextComponent listTextComponent = (ListTextComponent) ((View) rp31.d(this, gdh0.subtitle));
        this.subtitle = listTextComponent;
        this.picture = (RoundedCornersImageView) ((View) rp31.d(this, gdh0.picture));
        this.pictureShimmer = (ShimmeringFrameLayout) ((View) rp31.d(this, gdh0.picture_shimmer));
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, gdh0.skip_steps));
        this.skipSteps = buttonComponent;
        ButtonComponent buttonComponent2 = (ButtonComponent) ((View) rp31.d(this, gdh0.show_steps));
        this.showSteps = buttonComponent2;
        listTitleComponent.setTitle(instruction.a);
        listTextComponent.setText(instruction.b);
        buttonComponent.setText(instruction.g);
        buttonComponent2.setText(instruction.f);
        final int i2 = 1;
        if (j37Var != null) {
            buttonComponent2.setTextIconTint(true);
            buttonComponent2.setButtonTitleColor(j37Var.b);
            buttonComponent2.setButtonBackground(j37Var.a);
        }
        final int i3 = 0;
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: sfb
            public final /* synthetic */ CheckInOnboardingModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                CheckInOnboardingModalView checkInOnboardingModalView = this.b;
                switch (i4) {
                    case 0:
                        CheckInOnboardingModalView._init_$lambda$1(checkInOnboardingModalView);
                        break;
                    case 1:
                        CheckInOnboardingModalView._init_$lambda$2(checkInOnboardingModalView);
                        break;
                    default:
                        checkInOnboardingModalView.onBackPressed();
                        break;
                }
            }
        });
        buttonComponent2.setDebounceClickListener(new Runnable(this) { // from class: sfb
            public final /* synthetic */ CheckInOnboardingModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i2;
                CheckInOnboardingModalView checkInOnboardingModalView = this.b;
                switch (i4) {
                    case 0:
                        CheckInOnboardingModalView._init_$lambda$1(checkInOnboardingModalView);
                        break;
                    case 1:
                        CheckInOnboardingModalView._init_$lambda$2(checkInOnboardingModalView);
                        break;
                    default:
                        checkInOnboardingModalView.onBackPressed();
                        break;
                }
            }
        });
        final int i4 = 2;
        qdb1.c(this, new Runnable(this) { // from class: sfb
            public final /* synthetic */ CheckInOnboardingModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i4;
                CheckInOnboardingModalView checkInOnboardingModalView = this.b;
                switch (i42) {
                    case 0:
                        CheckInOnboardingModalView._init_$lambda$1(checkInOnboardingModalView);
                        break;
                    case 1:
                        CheckInOnboardingModalView._init_$lambda$2(checkInOnboardingModalView);
                        break;
                    default:
                        checkInOnboardingModalView.onBackPressed();
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CheckInOnboardingModalView checkInOnboardingModalView) {
        rfb rfbVar = checkInOnboardingModalView.checkInOnboardingAnalytics;
        rfbVar.getClass();
        rfbVar.a.a("CheckInOnboarding.IAmHere.Tapped", new HashMap(), 1, new HashMap());
        checkInOnboardingModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(CheckInOnboardingModalView checkInOnboardingModalView) {
        rfb rfbVar = checkInOnboardingModalView.checkInOnboardingAnalytics;
        rfbVar.getClass();
        rfbVar.a.a("CheckInOnboarding.HowTofind.Tapped", new HashMap(), 1, new HashMap());
        oep0 oep0Var = checkInOnboardingModalView.screenStackNavigator;
        m950 m950Var = (m950) checkInOnboardingModalView.storyRouter.get();
        int i = HProv.PP_SAME_MEDIA;
        ((pep0) oep0Var).f(m950Var, new npu0((x3) new mpu0(checkInOnboardingModalView.instruction.d), STORIES_OPEN_REASON, (Float) null, false, i), hxx.a);
        checkInOnboardingModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(CheckInOnboardingModalView checkInOnboardingModalView, Drawable drawable) {
        checkInOnboardingModalView.pictureShimmer.setShimmering(false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1(CheckInOnboardingModalView checkInOnboardingModalView) {
        checkInOnboardingModalView.picture.setImageResource(bzg0.placeholder_picture);
        checkInOnboardingModalView.pictureShimmer.setShimmering(false);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return kph0.view_onboarding_checkin;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rfb rfbVar = this.checkInOnboardingAnalytics;
        rfbVar.getClass();
        rfbVar.a.a("CheckInOnboarding.Shown", new HashMap(), 1, new HashMap());
        this.pictureShimmer.setShimmering(true);
        nac nacVar = (nac) this.imageLoader.a(this.picture);
        nacVar.h = new od9(20, this);
        nacVar.i = new l7b(7, this);
        this.loadPictureTask = nacVar.c(((m7x0) this.tagUrlFormatter).a(this.instruction.c));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.loadPictureTask;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        rfb rfbVar = this.checkInOnboardingAnalytics;
        rfbVar.getClass();
        rfbVar.a.a("CheckInOnboarding.Close", new HashMap(), 1, new HashMap());
    }
}
