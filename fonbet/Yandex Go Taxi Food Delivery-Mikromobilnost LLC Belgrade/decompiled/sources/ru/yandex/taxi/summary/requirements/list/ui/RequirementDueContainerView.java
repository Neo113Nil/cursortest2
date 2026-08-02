package ru.yandex.taxi.summary.requirements.list.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.dzg0;
import defpackage.f1h0;
import defpackage.g18;
import defpackage.ioj0;
import defpackage.k7x0;
import defpackage.lgj0;
import defpackage.m7x0;
import defpackage.mgj0;
import defpackage.nac;
import defpackage.pav;
import defpackage.u1c;
import defpackage.vng;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/yandex/taxi/summary/requirements/list/ui/RequirementDueContainerView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lk7x0;", "tagUrlFormatter", "Lpav;", "imageLoader", "Lmgj0;", "presenter", "<init>", "(Landroid/content/Context;Lk7x0;Lpav;Lmgj0;)V", "Lioj0;", "dueViewState", "Lzy11;", "renderDueState", "(Lioj0;)V", "", "iconTag", "loadIcon", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "getPromoPreorderIcon", "()Landroid/graphics/drawable/Drawable;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lk7x0;", "Lpav;", "Lmgj0;", "Lru/yandex/taxi/design/ListItemComponent;", "dueItem", "Lru/yandex/taxi/design/ListItemComponent;", "Lg18;", "imageCancellable", "Lg18;", "Lu1c;", "trailDelegate", "Lu1c;", "Companion", "lgj0", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementDueContainerView extends GoLinearLayout {
    public static final int $stable = 8;
    private static final lgj0 Companion = new lgj0();
    private static final float DISABLE_ALPHA = 0.4f;
    private static final float ENABLE_ALPHA = 1.0f;
    private final ListItemComponent dueItem;
    private g18 imageCancellable;
    private final pav imageLoader;
    private final mgj0 presenter;
    private final k7x0 tagUrlFormatter;
    private final u1c trailDelegate;

    public RequirementDueContainerView(Context context, k7x0 k7x0Var, pav pavVar, mgj0 mgj0Var) {
        super(context, null, 0, 0, 14, null);
        this.tagUrlFormatter = k7x0Var;
        this.imageLoader = pavVar;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        this.dueItem = listItemComponent;
        this.trailDelegate = new u1c(listItemComponent, new RequirementDueContainerView$trailDelegate$1(1, null, mgj0.class, "onTrailClick", "onTrailClick(Lkotlin/Unit;)V", 0));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        listItemComponent.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        listItemComponent.setBackground(vng.t(dzg0.bg_transparent_ripple, getContext()));
        addView(listItemComponent);
    }

    private final Drawable getPromoPreorderIcon() {
        return vng.t(f1h0.ic_schedule_clock, getContext());
    }

    private final void loadIcon(String iconTag) {
        g18 g18Var = this.imageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        if (iconTag == null || iconTag.length() == 0) {
            this.dueItem.getLeadImageView().setImageDrawable(null);
            this.dueItem.getLeadImageView().setVisibility(8);
        } else {
            this.imageCancellable = ((nac) this.imageLoader.a(this.dueItem.getLeadImageView())).c(((m7x0) this.tagUrlFormatter).a(iconTag));
            this.dueItem.getLeadImageView().setTag(iconTag);
        }
    }

    private static final void onAttachedToWindow$lambda$0(RequirementDueContainerView requirementDueContainerView) {
        requirementDueContainerView.getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderDueState(ioj0 dueViewState) {
        ListItemComponent listItemComponent = this.dueItem;
        boolean z = dueViewState.e;
        String str = dueViewState.a;
        listItemComponent.setEnabled(!z);
        this.dueItem.setContentAlpha(dueViewState.e ? 0.4f : 1.0f);
        this.dueItem.setTitle(str);
        this.dueItem.setSubtitle(dueViewState.b);
        boolean z2 = dueViewState.c;
        if (z2) {
            this.trailDelegate.a(zy11.a, str);
        } else if (!dueViewState.d || z2) {
            this.trailDelegate.b(null);
        } else {
            this.trailDelegate.b(getPromoPreorderIcon());
        }
        loadIcon(dueViewState.f);
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        Object tag = this.dueItem.getLeadImageView().getTag();
        loadIcon(tag instanceof String ? (String) tag : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.imageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        throw null;
    }
}
