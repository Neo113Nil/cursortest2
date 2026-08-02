package ru.yandex.taxi.combo.ui;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.taxi.order.models.api.response.CompanionHeader;
import com.yandex.go.taxi.order.models.api.response.d;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ad11;
import defpackage.bdc;
import defpackage.cd11;
import defpackage.cvu0;
import defpackage.czo0;
import defpackage.dwh0;
import defpackage.g18;
import defpackage.g8e;
import defpackage.hbp0;
import defpackage.ifq0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.l8x;
import defpackage.nac;
import defpackage.pav;
import defpackage.pwh0;
import defpackage.pwy0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.usg0;
import defpackage.w511;
import defpackage.xng0;
import defpackage.y7z0;
import defpackage.zc11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0003¢\u0006\u0004\b&\u0010%J\u001b\u0010)\u001a\u00020(*\u00020'2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b0\u0010.J\u000f\u00101\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0010H\u0014¢\u0006\u0004\b6\u00102J\u000f\u00107\u001a\u00020\u0010H\u0014¢\u0006\u0004\b7\u00102J\u0017\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b<\u0010\u0012J\r\u0010=\u001a\u00020\u0010¢\u0006\u0004\b=\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010U¨\u0006W"}, d2 = {"Lru/yandex/taxi/combo/ui/TravelCompanionStatusView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lru/yandex/taxi/combo/domain/a;", "actionConsumer", "Lru/yandex/taxi/combo/interactor/a;", "animationInteractor", "Lpwy0;", "themeSwitcherProvider", "<init>", "(Landroid/content/Context;Lpav;Lru/yandex/taxi/combo/domain/a;Lru/yandex/taxi/combo/interactor/a;Lpwy0;)V", "Lad11;", "model", "Lzy11;", "setTitleAndSubtitle", "(Lad11;)V", "", "title", "subtitle", "announceLablesContainer", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrentTimerDescription", "()Ljava/lang/String;", "", "imageOrAnimationChanged", "(Lad11;)Z", "setAction", "setImageOrAnimation", "Lzc11;", "animation", "setAnimation", "(Lzc11;)V", "", "getRadarAnimationRes", "()I", "getFoundCompanionAnimationRes", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/animation/Animator$AnimatorListener;", "createAnimatorListener", "(Lcom/airbnb/lottie/LottieAnimationView;Lzc11;)Landroid/animation/Animator$AnimatorListener;", "", "endTime", "startTimer", "(J)V", RemoteBioParameters.TIME, "setTitleTime", "applyAttrToRoundedBackground", "()V", "Landroidx/core/view/AccessibilityDelegateCompat;", "createTitleAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "bind", "makeViewRounded", "Lpav;", "Lru/yandex/taxi/combo/domain/a;", "Lru/yandex/taxi/combo/interactor/a;", "Lpwy0;", "Lg18;", "imageLoadTask", "Lg18;", "currentModel", "Lad11;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Ll8x;", "timerJob", "Ll8x;", "Lkdc;", "roundedBackgroundColor", "Lkdc;", "rippleColor", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Ljava/lang/Float;", "lastAccessibilityTitle", "Ljava/lang/String;", "lastAccessibilitySubtitle", "combo"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TravelCompanionStatusView extends ListItemComponent {
    private final ru.yandex.taxi.combo.domain.a actionConsumer;
    private final ru.yandex.taxi.combo.interactor.a animationInteractor;
    private Float cornerRadius;
    private ad11 currentModel;
    private g18 imageLoadTask;
    private final pav imageLoader;
    private String lastAccessibilitySubtitle;
    private String lastAccessibilityTitle;
    private kdc rippleColor;
    private kdc roundedBackgroundColor;
    private hbp0 scopeDelegate;
    private final pwy0 themeSwitcherProvider;
    private l8x timerJob;

    public TravelCompanionStatusView(Context context, pav pavVar, ru.yandex.taxi.combo.domain.a aVar, ru.yandex.taxi.combo.interactor.a aVar2, pwy0 pwy0Var) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        this.actionConsumer = aVar;
        this.animationInteractor = aVar2;
        this.themeSwitcherProvider = pwy0Var;
        this.imageLoadTask = g18.u1;
        this.currentModel = ad11.g;
        this.scopeDelegate = new hbp0(new czo0(14), "", null);
        this.timerJob = kotlinx.coroutines.a.a();
        this.roundedBackgroundColor = new bdc(xng0.bgInvert);
        this.lastAccessibilityTitle = "";
        this.lastAccessibilitySubtitle = "";
        b.p(title(), createTitleAccessibilityDelegate());
    }

    private final void announceLablesContainer(String title, String subtitle) {
        String v = cvu0.v(title, "$TIME$", "", false);
        if (getTitleText().length() > 0) {
            if (v.equals(this.lastAccessibilityTitle) && jl40.l(subtitle, this.lastAccessibilitySubtitle)) {
                return;
            }
            getRootView().announceForAccessibility(cvu0.v(title, "$TIME$", getCurrentTimerDescription(), false) + Extension.FIX_SPACE + subtitle);
            this.lastAccessibilityTitle = v;
            this.lastAccessibilitySubtitle = subtitle;
        }
    }

    private final void applyAttrToRoundedBackground() {
        kdc kdcVar = this.roundedBackgroundColor;
        Integer valueOf = kdcVar != null ? Integer.valueOf(s8o.m(kdcVar, getContext())) : null;
        kdc kdcVar2 = this.rippleColor;
        Integer valueOf2 = kdcVar2 != null ? Integer.valueOf(s8o.m(kdcVar2, getContext())) : null;
        Float f = this.cornerRadius;
        if (valueOf == null || valueOf2 == null || f == null) {
            return;
        }
        setRoundedBackgroundWithCustomRipple(valueOf.intValue(), valueOf2.intValue(), f.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animator.AnimatorListener createAnimatorListener(final LottieAnimationView lottieAnimationView, final zc11 zc11Var) {
        return new Animator.AnimatorListener() { // from class: ru.yandex.taxi.combo.ui.TravelCompanionStatusView$createAnimatorListener$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                hbp0 hbp0Var;
                hbp0Var = TravelCompanionStatusView.this.scopeDelegate;
                tje.N(hbp0Var.c(), null, null, new TravelCompanionStatusView$createAnimatorListener$1$onAnimationEnd$1(TravelCompanionStatusView.this, zc11Var, lottieAnimationView, null), 3);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                hbp0 hbp0Var;
                hbp0Var = TravelCompanionStatusView.this.scopeDelegate;
                tje.N(hbp0Var.c(), null, null, new TravelCompanionStatusView$createAnimatorListener$1$onAnimationStart$1(TravelCompanionStatusView.this, zc11Var, null), 3);
            }
        };
    }

    private final AccessibilityDelegateCompat createTitleAccessibilityDelegate() {
        return new ifq0(13, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCurrentTimerDescription() {
        Long l = this.currentModel.f;
        if (l == null) {
            return "";
        }
        long longValue = l.longValue() - System.currentTimeMillis();
        int i = (int) (longValue / 60000);
        int i2 = (int) ((longValue % 60000) / 1000);
        return g8e.p(getResources().getQuantityString(dwh0.date_format_in_minutes, i, Integer.valueOf(i)), Extension.FIX_SPACE, getResources().getQuantityString(dwh0.date_format_in_seconds, i2, Integer.valueOf(i2)));
    }

    private final int getFoundCompanionAnimationRes() {
        int i = cd11.b[this.themeSwitcherProvider.getThemeType().ordinal()];
        if (i == 1) {
            return pwh0.found_companion_animation_dark;
        }
        if (i == 2) {
            return pwh0.found_companion_animation;
        }
        w511.b();
        return 0;
    }

    private final int getRadarAnimationRes() {
        int i = cd11.b[this.themeSwitcherProvider.getThemeType().ordinal()];
        if (i == 1) {
            return pwh0.radar_animation_dark;
        }
        if (i == 2) {
            return pwh0.radar_animation;
        }
        w511.b();
        return 0;
    }

    private final boolean imageOrAnimationChanged(ad11 model) {
        return (jl40.l(this.currentModel.c, model.c) && jl40.l(this.currentModel.d, model.d)) ? false : true;
    }

    private final void setAction(ad11 model) {
        d dVar = model.e;
        if (dVar != null) {
            setTrailMode(2);
            setOnClickListener(new y7z0(10, this, dVar));
        } else {
            setTrailMode(0);
            setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAction$lambda$0(TravelCompanionStatusView travelCompanionStatusView, d dVar, View view) {
        travelCompanionStatusView.actionConsumer.a(dVar);
    }

    private final void setAnimation(zc11 animation) {
        int radarAnimationRes;
        int i = cd11.a[animation.a.ordinal()];
        if (i == 1) {
            radarAnimationRes = getRadarAnimationRes();
        } else if (i == 2) {
            radarAnimationRes = getFoundCompanionAnimationRes();
        } else if (i == 3) {
            radarAnimationRes = pwh0.walk_animation;
        } else {
            if (i != 4) {
                if (i == 5) {
                    return;
                }
                w511.b();
                return;
            }
            radarAnimationRes = pwh0.wave_animation;
        }
        int i2 = radarAnimationRes;
        tje.N(this.scopeDelegate.c(), null, null, new TravelCompanionStatusView$setAnimation$1(this, animation, i2, animation.b, null), 3);
    }

    private final void setImageOrAnimation(ad11 model) {
        this.imageLoadTask.cancel();
        clearLeadView();
        zc11 zc11Var = model.d;
        String str = model.c;
        if (zc11Var.a != CompanionHeader.Animation.UNSUPPORTED) {
            setAnimation(zc11Var);
        } else if (str.length() > 0) {
            this.imageLoadTask = ((nac) this.imageLoader.a(getLeadImageView())).c(str);
        }
    }

    private final void setTitleAndSubtitle(ad11 model) {
        String str = model.a;
        String str2 = model.b;
        announceLablesContainer(str, str2);
        setSubtitle(str2);
        Long l = model.f;
        if (l != null) {
            startTimer(l.longValue());
        } else {
            setTitle(model.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitleTime(long time) {
        setTitle(cvu0.v(this.currentModel.a, "$TIME$", getContext().getString(kyh0.timer_format, Long.valueOf(time / 60000), Long.valueOf((time % 60000) / 1000)), false));
    }

    private final void startTimer(long endTime) {
        this.timerJob.a(null);
        this.timerJob = tje.N(this.scopeDelegate.c(), null, null, new TravelCompanionStatusView$startTimer$1(endTime, this, null), 3);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        applyAttrToRoundedBackground();
        setImageOrAnimation(this.currentModel);
    }

    public final void bind(ad11 model) {
        this.timerJob.a(null);
        setTitleAndSubtitle(model);
        setAction(model);
        if (getLeadImageView().getDrawable() == null || imageOrAnimationChanged(model)) {
            setImageOrAnimation(model);
        }
        this.currentModel = model;
    }

    public final void makeViewRounded() {
        this.roundedBackgroundColor = new bdc(xng0.bgMain);
        this.rippleColor = new bdc(xng0.bgMinor);
        this.cornerRadius = Float.valueOf(tje.r(usg0.order_card_item_radius, getContext()));
        applyAttrToRoundedBackground();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
        Long l = this.currentModel.f;
        if (l != null) {
            startTimer(l.longValue());
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageLoadTask.cancel();
        this.scopeDelegate.b();
    }
}
