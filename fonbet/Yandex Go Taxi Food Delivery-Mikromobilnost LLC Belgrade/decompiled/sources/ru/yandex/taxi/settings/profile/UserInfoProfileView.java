package ru.yandex.taxi.settings.profile;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.yandex.go.ui.CircleLoadingImageView;
import defpackage.dvg0;
import defpackage.dzg0;
import defpackage.i3y;
import defpackage.kj;
import defpackage.kyh0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.nfv;
import defpackage.pav;
import defpackage.pn21;
import defpackage.qn21;
import defpackage.rn21;
import defpackage.tje;
import defpackage.zr01;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J!\u0010\u0017\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/yandex/taxi/settings/profile/UserInfoProfileView;", "Lru/yandex/taxi/design/ListItemComponent;", "Lpn21;", "Landroid/content/Context;", "context", "Lqn21;", "presenter", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lqn21;Lpav;)V", "Lzy11;", "handleAccountPhonish", "()V", "Lkj;", "account", "setPortalAccount", "(Lkj;)V", "setAvatarPadding", "setupUserPhotoAccessibility", "setLinkAccount", "", "accountTitle", "setAccount", "(Lkj;Ljava/lang/String;)V", "avatarUrl", "setImage", "(Ljava/lang/String;)V", "setCircleLoadingImage", "onAttachedToWindow", "onDetachedFromWindow", "Lqn21;", "Lpav;", "", "avatarSize$delegate", "Li3y;", "getAvatarSize", "()I", "avatarSize", "mSpace$delegate", "getMSpace", "mSpace", "Lcom/yandex/go/ui/CircleLoadingImageView;", "circleLoadingImageView$delegate", "getCircleLoadingImageView", "()Lcom/yandex/go/ui/CircleLoadingImageView;", "circleLoadingImageView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserInfoProfileView extends ListItemComponent implements pn21 {
    public static final int $stable = 8;

    /* renamed from: avatarSize$delegate, reason: from kotlin metadata */
    private final i3y avatarSize;

    /* renamed from: circleLoadingImageView$delegate, reason: from kotlin metadata */
    private final i3y circleLoadingImageView;
    private final pav imageLoader;

    /* renamed from: mSpace$delegate, reason: from kotlin metadata */
    private final i3y mSpace;
    private final qn21 presenter;

    public UserInfoProfileView(Context context, qn21 qn21Var, pav pavVar) {
        super(context, null, 0);
        this.presenter = qn21Var;
        this.imageLoader = pavVar;
        this.avatarSize = kotlin.a.a(new rn21(this, 0));
        this.mSpace = kotlin.a.a(new rn21(this, 1));
        this.circleLoadingImageView = kotlin.a.a(new zr01(20, context, this));
        setTitleTextSizePx(tje.r(mrg0.component_text_size_header, getContext()));
        setTitleTypeface(5);
        setBackgroundResource(dzg0.component_selectable_list_item_bg);
        title().setMaxLines(1);
        title().setSingleLine(true);
        title().setEllipsize(TextUtils.TruncateAt.END);
        autofitTitle(getMSpace());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int avatarSize_delegate$lambda$0(UserInfoProfileView userInfoProfileView) {
        return ru.yandex.taxi.design.utils.c.d(dvg0.avatar_size, userInfoProfileView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CircleLoadingImageView circleLoadingImageView_delegate$lambda$0(Context context, UserInfoProfileView userInfoProfileView) {
        CircleLoadingImageView circleLoadingImageView = new CircleLoadingImageView(context, null, 0, 6, null);
        circleLoadingImageView.setLayoutParams(new FrameLayout.LayoutParams(userInfoProfileView.getAvatarSize(), userInfoProfileView.getAvatarSize()));
        circleLoadingImageView.setPadding(userInfoProfileView.getMSpace());
        circleLoadingImageView.setImportantForAccessibility(2);
        circleLoadingImageView.init(userInfoProfileView.imageLoader);
        return circleLoadingImageView;
    }

    private final int getAvatarSize() {
        return ((Number) this.avatarSize.getValue()).intValue();
    }

    private final CircleLoadingImageView getCircleLoadingImageView() {
        return (CircleLoadingImageView) this.circleLoadingImageView.getValue();
    }

    private final int getMSpace() {
        return ((Number) this.mSpace.getValue()).intValue();
    }

    private final void handleAccountPhonish() {
        subtitle().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mSpace_delegate$lambda$0(UserInfoProfileView userInfoProfileView) {
        return ru.yandex.taxi.design.utils.c.d(mrg0.go_design_m_space, userInfoProfileView);
    }

    private final void setAvatarPadding() {
        setTrailImageSize(getAvatarSize());
        setTrailImagePadding(getMSpace());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setImage$lambda$0(UserInfoProfileView userInfoProfileView) {
        userInfoProfileView.clearTrailView();
        return zy11.a;
    }

    private final void setPortalAccount(kj account) {
        subtitle().setVisibility(0);
        setSubtitle(account.g);
    }

    private final void setupUserPhotoAccessibility() {
        setTrailImportantForAccessibility(1);
        setTrailContentDescription(getContext().getString(kyh0.profile_accessibility_photo));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qn21 qn21Var = this.presenter;
        qn21Var.Bg(this);
        kj Ig = qn21Var.B.a.Ig();
        ((pn21) qn21Var.Dg()).setAccount(Ig, qn21Var.z.a(Ig));
        tje.N(qn21Var.Jg(), null, null, new UserInfoProfilePresenter$attachView$$inlined$safeCollectIn$1(qn21Var.C.f, null, this), 3);
        tje.N(qn21Var.Jg(), null, null, new UserInfoProfilePresenter$attachView$$inlined$safeCollectIn$2(qn21Var.y.b, null, qn21Var), 3);
        tje.N(qn21Var.Jg(), null, null, new UserInfoProfilePresenter$attachView$$inlined$safeCollectIn$3(new b(qn21Var.x.f), null, qn21Var), 3);
        tje.N(qn21Var.Jg(), null, null, new UserInfoProfilePresenter$loadCurrentAccount$1(qn21Var, null), 3);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.pn21
    public void setAccount(kj account, String accountTitle) {
        setTitle(accountTitle);
        if (account == null) {
            return;
        }
        if (account.n) {
            setPortalAccount(account);
        } else {
            handleAccountPhonish();
        }
    }

    @Override // defpackage.pn21
    public void setCircleLoadingImage(String avatarUrl) {
        if (avatarUrl == null) {
            clearTrailView();
            setTrailImagePadding(0);
            return;
        }
        setTrailImagePadding(0);
        CircleLoadingImageView circleLoadingImageView = getCircleLoadingImageView();
        circleLoadingImageView.setImage(avatarUrl, getAvatarSize());
        setTrailView(circleLoadingImageView);
        setupUserPhotoAccessibility();
    }

    @Override // defpackage.pn21
    public void setImage(String avatarUrl) {
        if (avatarUrl == null) {
            clearTrailView();
            setTrailImagePadding(0);
            return;
        }
        setAvatarPadding();
        setupUserPhotoAccessibility();
        nac nacVar = (nac) this.imageLoader.a(getTrailImageView());
        nacVar.f(getAvatarSize(), getAvatarSize());
        nacVar.g(nfv.a);
        nacVar.i = new rn21(this, 2);
        nacVar.c(avatarUrl);
    }

    @Override // defpackage.pn21
    public void setLinkAccount(kj account) {
        setPortalAccount(account);
    }
}
