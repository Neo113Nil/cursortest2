package ru.yandex.taxi.widget.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.a;
import defpackage.dzg0;
import defpackage.mos0;
import defpackage.mqg0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u001b¨\u0006\""}, d2 = {"Lru/yandex/taxi/widget/views/SlideableShadowView;", "Landroid/widget/FrameLayout;", "Landroidx/coordinatorlayout/widget/a;", "Lnwy0;", "Landroid/content/Context;", "context", "", "anchorViewId", "Ljava/util/function/Supplier;", "topOffsetSupplier", "<init>", "(Landroid/content/Context;ILjava/util/function/Supplier;)V", "Lzy11;", "updateBackground", "()V", "setDefaultParams", "onAttachedToWindow", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "getBehavior", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "", "applyThemeForChildrenByDefault", "()Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", CA20Status.STATUS_USER_I, "Ljava/util/function/Supplier;", "leftOffset", "topOffset", "rightOffset", "bottomOffset", "mos0", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SlideableShadowView extends FrameLayout implements a, nwy0 {
    private final int anchorViewId;
    private final int bottomOffset;
    private final int leftOffset;
    private final int rightOffset;
    private final int topOffset;
    private final Supplier<Integer> topOffsetSupplier;

    public SlideableShadowView(Context context, int i, Supplier<Integer> supplier) {
        super(context);
        this.anchorViewId = i;
        this.topOffsetSupplier = supplier;
        this.leftOffset = (int) tje.w(13, getContext());
        this.topOffset = (int) tje.w(22, getContext());
        this.rightOffset = (int) tje.w(13, getContext());
        updateBackground();
    }

    private final void setDefaultParams() {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) getLayoutParams();
        layoutParams.anchorGravity = 81;
        layoutParams.gravity = 49;
        layoutParams.setAnchorId(this.anchorViewId);
    }

    private final void updateBackground() {
        Drawable mutate = tje.y(dzg0.bg_shadow, getContext()).mutate();
        if (qje.s(xng0.themeDarkMode, getContext())) {
            mutate.setTint(getContext().getColor(mqg0.black));
        }
        setBackground(mutate);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateBackground();
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return new mos0(this.leftOffset, this.topOffset, this.rightOffset, this.bottomOffset, this.topOffsetSupplier);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDefaultParams();
    }

    public /* synthetic */ SlideableShadowView(Context context, int i, Supplier supplier, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i2 & 4) != 0 ? null : supplier);
    }
}
