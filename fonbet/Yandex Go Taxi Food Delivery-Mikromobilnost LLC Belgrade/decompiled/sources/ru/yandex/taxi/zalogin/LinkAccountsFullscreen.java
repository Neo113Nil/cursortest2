package ru.yandex.taxi.zalogin;

import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.aky;
import defpackage.bky;
import defpackage.cdc;
import defpackage.cma1;
import defpackage.dhv;
import defpackage.dky;
import defpackage.dst0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fhz;
import defpackage.kyh0;
import defpackage.mdh;
import defpackage.nac;
import defpackage.nfv;
import defpackage.pav;
import defpackage.pwg0;
import defpackage.rp31;
import defpackage.rx2;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uch0;
import defpackage.ujy;
import defpackage.uyj;
import defpackage.wjy;
import defpackage.xqg0;
import defpackage.yjy;
import defpackage.yoh0;
import defpackage.yow;
import defpackage.zky;
import defpackage.zy11;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.zalogin.LinkAccountsFullscreen;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001bBQ\b\u0001\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b'\u0010\u001bJ\u0017\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010\u001bJ\u000f\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0019H\u0014¢\u0006\u0004\b/\u0010\u001bJ\u0017\u00102\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b5\u0010 J\u000f\u00106\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u0010\u001bJ\u000f\u00107\u001a\u00020\u0019H\u0002¢\u0006\u0004\b7\u0010\u001bJ\u000f\u00108\u001a\u00020\u0019H\u0002¢\u0006\u0004\b8\u0010\u001bJ\u000f\u00109\u001a\u00020\u0019H\u0002¢\u0006\u0004\b9\u0010\u001bJ\u000f\u0010:\u001a\u00020\u0019H\u0002¢\u0006\u0004\b:\u0010\u001bJ\u0017\u0010=\u001a\u00020\u00192\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0019H\u0002¢\u0006\u0004\b?\u0010\u001bJ\u000f\u0010@\u001a\u00020\u0019H\u0002¢\u0006\u0004\b@\u0010\u001bJ\u000f\u0010A\u001a\u00020\u0019H\u0002¢\u0006\u0004\bA\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010CR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010GR\u0014\u0010H\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010IR\u0014\u0010Q\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010LR\u0014\u0010R\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010IR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010[R\u0014\u0010]\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[R\u0018\u00104\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010^R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010^R\u0016\u0010_\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010CR\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010`¨\u0006c"}, d2 = {"Lru/yandex/taxi/zalogin/LinkAccountsFullscreen;", "Lru/yandex/taxi/widget/ModalView;", "Laky;", "", "Landroid/app/Activity;", "activity", "Lru/yandex/taxi/analytics/Events$Zalogin$LinkageContext;", "linkageContext", "Lyjy;", "params", "", "standardAppearing", "Lpav;", "imageLoader", "Lfhz;", "loginAnalytics", "Lzky;", "errorDialogHolder", "Ldky;", "presenter", "<init>", "(Landroid/app/Activity;Lru/yandex/taxi/analytics/Events$Zalogin$LinkageContext;Lyjy;ZLpav;Lfhz;Lzky;Ldky;)V", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onSuccess", "setOnSuccessLinkage", "(Ljava/lang/Runnable;)V", "Lbky;", "model", "setData", "(Lbky;)V", "showLinkageProgress", "showLinkageDone", "showLinkageFailed", "show", "showLinkageErrorDialog", "(Z)V", "closeView", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "removeFromParent", "Ldst0;", "splashViewParams", "setSplashViewParams", "(Ldst0;)V", "onDismiss", "setDismissAction", "startAppearingAnimation", "initAnimation", "showHeader", "hideHeader", "startLinkButtonTextAnimation", "", "loginName", "setLoginFirstLetterRed", "(Ljava/lang/String;)V", "stopLinkButtonTextAnimation", "showLinkWithOtherAccountButton", "hideLinkWithOtherAccountButton", "Landroid/app/Activity;", "Z", "Lpav;", "Lfhz;", "Lzky;", "Ldky;", "backgroundContent", "Landroid/view/View;", "Lru/yandex/taxi/design/ListItemComponent;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/widget/ImageView;", "accountAvatar", "Landroid/widget/ImageView;", "close", "accountItem", "buttonsView", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "linkAccounts", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "Landroid/widget/TextView;", "linkOtherAccount", "Landroid/widget/TextView;", "Landroid/animation/AnimatorSet;", "buttonsAnimatorHideSet", "Landroid/animation/AnimatorSet;", "buttonsAnimatorShowSet", "appearingAnimatorSet", "Ljava/lang/Runnable;", "linkageSuccess", "Ldst0;", "Companion", "wjy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkAccountsFullscreen extends ModalView implements aky {
    private static final int BUTTONS_ANIM_DURATION = 300;
    public static final wjy Companion = new wjy();
    private static final int FADE_HEADER_ANIM_DURATION = 300;
    private final ImageView accountAvatar;
    private final ListItemComponent accountItem;
    private final Activity activity;
    private final AnimatorSet appearingAnimatorSet;
    private final View backgroundContent;
    private final AnimatorSet buttonsAnimatorHideSet;
    private final AnimatorSet buttonsAnimatorShowSet;
    private final View buttonsView;
    private final View close;
    private final ListItemComponent description;
    private final zky errorDialogHolder;
    private final pav imageLoader;
    private final ShimmeringRobotoTextView linkAccounts;
    private final TextView linkOtherAccount;
    private boolean linkageSuccess;
    private final fhz loginAnalytics;
    private Runnable onDismiss;
    private Runnable onSuccess;
    private final dky presenter;
    private dst0 splashViewParams;
    private final boolean standardAppearing;

    public LinkAccountsFullscreen(Activity activity, final Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, yjy yjyVar, boolean z, pav pavVar, fhz fhzVar, zky zkyVar, dky dkyVar) {
        super(activity);
        this.activity = activity;
        this.standardAppearing = z;
        this.imageLoader = pavVar;
        this.loginAnalytics = fhzVar;
        this.errorDialogHolder = zkyVar;
        this.presenter = dkyVar;
        final int i = 1;
        ru.yandex.taxi.design.utils.c.q(this, yoh0.link_accounts, true);
        int i2 = uch0.background_content;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.backgroundContent = (View) rp31.d(this, i2);
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, uch0.description));
        this.description = listItemComponent;
        this.accountAvatar = (ImageView) ((View) rp31.d(this, uch0.account_avatar));
        View view = (View) rp31.d(this, uch0.close);
        this.close = view;
        this.accountItem = (ListItemComponent) ((View) rp31.d(this, uch0.account_item));
        this.buttonsView = (View) rp31.d(this, uch0.buttons_view);
        ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) ((View) rp31.d(this, uch0.link_accounts));
        this.linkAccounts = shimmeringRobotoTextView;
        TextView textView = (TextView) ((View) rp31.d(this, uch0.link_other_account));
        this.linkOtherAccount = textView;
        this.buttonsAnimatorHideSet = new AnimatorSet();
        this.buttonsAnimatorShowSet = new AnimatorSet();
        this.appearingAnimatorSet = new AnimatorSet();
        this.splashViewParams = new dst0();
        final int i3 = 0;
        setDismissOnTouchOutside(false);
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: vjy
            public final /* synthetic */ LinkAccountsFullscreen b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i4 = i3;
                Events$Zalogin$LinkageContext events$Zalogin$LinkageContext2 = events$Zalogin$LinkageContext;
                LinkAccountsFullscreen linkAccountsFullscreen = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = LinkAccountsFullscreen._init_$lambda$0(linkAccountsFullscreen, events$Zalogin$LinkageContext2);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = LinkAccountsFullscreen._init_$lambda$1(linkAccountsFullscreen, events$Zalogin$LinkageContext2);
                        return _init_$lambda$1;
                }
            }
        }, shimmeringRobotoTextView);
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: vjy
            public final /* synthetic */ LinkAccountsFullscreen b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i4 = i;
                Events$Zalogin$LinkageContext events$Zalogin$LinkageContext2 = events$Zalogin$LinkageContext;
                LinkAccountsFullscreen linkAccountsFullscreen = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = LinkAccountsFullscreen._init_$lambda$0(linkAccountsFullscreen, events$Zalogin$LinkageContext2);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = LinkAccountsFullscreen._init_$lambda$1(linkAccountsFullscreen, events$Zalogin$LinkageContext2);
                        return _init_$lambda$1;
                }
            }
        }, textView);
        ru.yandex.taxi.design.utils.c.z(new yow(15, this), view);
        listItemComponent.setTitle(yjyVar.a);
        listItemComponent.setSubtitle(yjyVar.b);
        initAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(LinkAccountsFullscreen linkAccountsFullscreen, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext) {
        linkAccountsFullscreen.presenter.Lg(events$Zalogin$LinkageContext);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(LinkAccountsFullscreen linkAccountsFullscreen, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext) {
        dky dkyVar = linkAccountsFullscreen.presenter;
        tje.N(dkyVar.Jg(), null, null, new LinkAccountsPresenter$loginAccount$1(dkyVar, events$Zalogin$LinkageContext, null, null), 3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(LinkAccountsFullscreen linkAccountsFullscreen) {
        rx2 rx2Var = linkAccountsFullscreen.loginAnalytics.e;
        rx2Var.getClass();
        rx2Var.a.a("Zalogin.Promo.Close", new HashMap(), 1, new HashMap());
        linkAccountsFullscreen.dismiss();
        return zy11.a;
    }

    private final void hideHeader() {
        cma1.N(this.close).setDuration(300L).start();
    }

    private final void hideLinkWithOtherAccountButton() {
        this.buttonsAnimatorHideSet.start();
    }

    private final void initAnimation() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pwg0.link_accounts_button_height);
        ujy ujyVar = new ujy(this, 4);
        ujy ujyVar2 = new ujy(this, 5);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dimensionPixelSize);
        ofInt.addUpdateListener(ujyVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(ujyVar2);
        this.buttonsAnimatorHideSet.setDuration(300L);
        this.buttonsAnimatorHideSet.playTogether(ofInt, ofFloat);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(dimensionPixelSize, 0);
        ofInt2.addUpdateListener(ujyVar);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(ujyVar2);
        this.buttonsAnimatorShowSet.setDuration(300L);
        this.buttonsAnimatorShowSet.playTogether(ofInt2, ofFloat2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAnimation$lambda$0(LinkAccountsFullscreen linkAccountsFullscreen, ValueAnimator valueAnimator) {
        linkAccountsFullscreen.buttonsView.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAnimation$lambda$1(LinkAccountsFullscreen linkAccountsFullscreen, ValueAnimator valueAnimator) {
        linkAccountsFullscreen.linkOtherAccount.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void setLoginFirstLetterRed(String loginName) {
        if (loginName == null || evu0.J(loginName)) {
            return;
        }
        SpannableString spannableString = new SpannableString(loginName);
        spannableString.setSpan(new ForegroundColorSpan(getContext().getColor(xqg0.passport_first_letter)), 0, 1, 33);
        this.accountItem.setTitle(spannableString);
    }

    private final void showHeader() {
        cma1.K(this.close).setDuration(300L).start();
    }

    private final void showLinkWithOtherAccountButton() {
        this.buttonsAnimatorShowSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLinkageErrorDialog$lambda$0(LinkAccountsFullscreen linkAccountsFullscreen) {
        linkAccountsFullscreen.presenter.Lg(Events$Zalogin$LinkageContext.DIALOG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAppearingAnimation() {
        int height = getHeight();
        int width = getWidth();
        this.description.setScaleX(0.0f);
        this.buttonsView.setAlpha(0.0f);
        this.backgroundContent.setPivotX(0.0f);
        float f = height;
        this.backgroundContent.setPivotY(f);
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("scaleX", width == 0 ? 0.0f : this.splashViewParams.d / width, 1.0f), PropertyValuesHolder.ofFloat("scaleY", height != 0 ? this.splashViewParams.b / f : 0.0f, 1.0f));
        ofPropertyValuesHolder.addUpdateListener(new ujy(this, 0));
        ofPropertyValuesHolder.setDuration(500L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ujy(this, 1));
        ofFloat.setDuration(500L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ujy(this, 2));
        ofFloat2.setStartDelay(200L);
        ofFloat2.setDuration(300L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ujy(this, 3));
        ofFloat3.setStartDelay(400L);
        ofFloat3.setDuration(100L);
        this.appearingAnimatorSet.playTogether(ofPropertyValuesHolder, ofFloat, ofFloat2, ofFloat3);
        this.appearingAnimatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAppearingAnimation$lambda$0(LinkAccountsFullscreen linkAccountsFullscreen, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue("scaleX")).floatValue();
        float floatValue2 = ((Float) valueAnimator.getAnimatedValue("scaleY")).floatValue();
        linkAccountsFullscreen.backgroundContent.setScaleX(floatValue);
        linkAccountsFullscreen.backgroundContent.setScaleY(floatValue2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAppearingAnimation$lambda$1(LinkAccountsFullscreen linkAccountsFullscreen, ValueAnimator valueAnimator) {
        linkAccountsFullscreen.description.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAppearingAnimation$lambda$2(LinkAccountsFullscreen linkAccountsFullscreen, ValueAnimator valueAnimator) {
        linkAccountsFullscreen.buttonsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAppearingAnimation$lambda$3(LinkAccountsFullscreen linkAccountsFullscreen, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        linkAccountsFullscreen.close.setAlpha(floatValue);
        linkAccountsFullscreen.accountItem.setAlpha(floatValue);
    }

    private final void startLinkButtonTextAnimation() {
        this.linkAccounts.updateShimmeringColor(new cdc(getContext().getColor(xqg0.chat_send_button_disabled_background)));
        this.linkAccounts.startAnimation();
    }

    private final void stopLinkButtonTextAnimation() {
        this.linkAccounts.stopAnimation();
    }

    @Override // defpackage.aky
    public void closeView() {
        dismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContentView() {
        return this.backgroundContent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
        return this.standardAppearing ? super.getPreDrawListener() : new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.zalogin.LinkAccountsFullscreen$getPreDrawListener$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                LinkAccountsFullscreen.this.getViewTreeObserver().removeOnPreDrawListener(this);
                LinkAccountsFullscreen.this.startAppearingAnimation();
                return true;
            }
        };
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dky dkyVar = this.presenter;
        dkyVar.Bg(this);
        j jVar = dkyVar.x;
        tpr e = jVar.e();
        dkyVar.D.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        tje.N(dkyVar.Jg(), null, null, new LinkAccountsPresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(e, mdhVar), null, dkyVar), 3);
        tje.N(dkyVar.Jg(), null, null, new LinkAccountsPresenter$subscribeToLinkAccountRemoving$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.C(new o(jVar.g), new LinkAccountsPresenter$subscribeToLinkAccountRemoving$$inlined$flatMapMerge$1(null, dkyVar)), mdhVar), null, dkyVar), 3);
        dkyVar.A.b(dkyVar.F);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void removeFromParent() {
        Runnable runnable;
        super.removeFromParent();
        Runnable runnable2 = this.onDismiss;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (!this.linkageSuccess || (runnable = this.onSuccess) == null) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.aky
    public void setData(bky model) {
        setLoginFirstLetterRed(model.a);
        this.accountItem.setSubtitle(model.c);
        String str = model.b;
        if (str != null) {
            nac nacVar = (nac) this.imageLoader.a(this.accountAvatar);
            nacVar.g(nfv.a);
            nacVar.e(f1h0.yandex_avatar);
            nacVar.c(str);
        }
    }

    public final void setDismissAction(Runnable onDismiss) {
        this.onDismiss = onDismiss;
    }

    public final void setOnSuccessLinkage(Runnable onSuccess) {
        this.onSuccess = onSuccess;
    }

    public final void setSplashViewParams(dst0 splashViewParams) {
        if (splashViewParams == null) {
            splashViewParams = new dst0();
        }
        this.splashViewParams = splashViewParams;
    }

    @Override // defpackage.aky
    public void showLinkageDone() {
        this.linkageSuccess = true;
        stopLinkButtonTextAnimation();
        this.linkAccounts.setEnabled(true);
        rx2 rx2Var = this.loginAnalytics.e;
        rx2Var.getClass();
        rx2Var.a.a("Zalogin.Promo.Done", new HashMap(), 1, new HashMap());
        dismiss();
    }

    @Override // defpackage.aky
    public void showLinkageErrorDialog(boolean show) {
        zky zkyVar = this.errorDialogHolder;
        if (show) {
            zkyVar.a(this.activity, new dhv(22, this));
            return;
        }
        AlertDialog alertDialog = zkyVar.a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // defpackage.aky
    public void showLinkageFailed() {
        this.linkageSuccess = false;
        showHeader();
        stopLinkButtonTextAnimation();
        showLinkWithOtherAccountButton();
        this.linkAccounts.setText(kyh0.link_welcome_link_button);
        this.linkAccounts.setEnabled(true);
    }

    @Override // defpackage.aky
    public void showLinkageProgress() {
        hideHeader();
        hideLinkWithOtherAccountButton();
        this.linkAccounts.setText(kyh0.link_welcome_link_processing);
        startLinkButtonTextAnimation();
        this.linkAccounts.setEnabled(false);
    }
}
