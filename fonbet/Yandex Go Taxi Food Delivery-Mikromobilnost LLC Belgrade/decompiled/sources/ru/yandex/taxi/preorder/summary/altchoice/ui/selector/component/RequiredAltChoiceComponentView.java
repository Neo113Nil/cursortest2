package ru.yandex.taxi.preorder.summary.altchoice.ui.selector.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.agc0;
import defpackage.i3y;
import defpackage.lh;
import defpackage.mfb;
import defpackage.sls;
import defpackage.tje;
import defpackage.vyf0;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.TextAndBadgeComponent;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010&J\u000f\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010&J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0016\u00101\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010;\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010+\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010I\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010E¨\u0006J"}, d2 = {"Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/widget/Checkable;", "Llh;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "textView", "Lru/yandex/taxi/design/TextAndBadgeComponent;", "initLabelComponent", "(Landroid/widget/TextView;)Lru/yandex/taxi/design/TextAndBadgeComponent;", "", "text", "Lzy11;", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "setTrailTitle", "setTrailSubtitle", "Landroidx/appcompat/widget/AppCompatImageView;", "getInnerTrailImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "Lkotlin/Function0;", "listener", "setTrailCheckBoxClickListener", "(Lsls;)V", "", BackendConfig.Restrictions.ENABLED, "ellipsizeTitleMiddle", "(Z)Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentView;", "ellipsizeSubtitleMiddle", "invalidateComponent", "()V", "checked", "setChecked", "(Z)V", "showChevron", "isChecked", "()Z", "toggle", "Landroidx/core/view/AccessibilityDelegateCompat;", "provideAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "titleComponent", "Lru/yandex/taxi/design/TextAndBadgeComponent;", "subtitleComponent", "Lmfb;", "checkDrawableProvider", "Lmfb;", "badgeTopPadding", CA20Status.STATUS_USER_I, "badgeHorizontalPadding", "badgeBottomPadding", "defaultAccessibilityDelegate", "Landroidx/core/view/AccessibilityDelegateCompat;", "Z", "Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentTrailView;", "trail", "Lru/yandex/taxi/preorder/summary/altchoice/ui/selector/component/RequiredAltChoiceComponentTrailView;", "Lru/yandex/taxi/design/BadgeView;", "titleBadge$delegate", "Li3y;", "getTitleBadge", "()Lru/yandex/taxi/design/BadgeView;", "titleBadge", "subtitleBadge$delegate", "getSubtitleBadge", "subtitleBadge", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequiredAltChoiceComponentView extends ListItemComponent implements Checkable, lh {
    private final int badgeBottomPadding;
    private final int badgeHorizontalPadding;
    private final int badgeTopPadding;
    private final mfb checkDrawableProvider;
    private AccessibilityDelegateCompat defaultAccessibilityDelegate;
    private boolean isChecked;

    /* renamed from: subtitleBadge$delegate, reason: from kotlin metadata */
    private final i3y subtitleBadge;
    private final TextAndBadgeComponent subtitleComponent;

    /* renamed from: titleBadge$delegate, reason: from kotlin metadata */
    private final i3y titleBadge;
    private final TextAndBadgeComponent titleComponent;
    private final RequiredAltChoiceComponentTrailView trail;

    public RequiredAltChoiceComponentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.checkDrawableProvider = new mfb(context, attributeSet, xng0.listCheckBoxComponentStyle);
        this.badgeTopPadding = (int) tje.x(context, 1.0f);
        this.badgeHorizontalPadding = (int) tje.x(context, 6.0f);
        this.badgeBottomPadding = (int) tje.x(context, 2.0f);
        this.defaultAccessibilityDelegate = new AccessibilityDelegateCompat();
        RequiredAltChoiceComponentTrailView requiredAltChoiceComponentTrailView = new RequiredAltChoiceComponentTrailView(context, null, 0, 6, null);
        this.trail = requiredAltChoiceComponentTrailView;
        labelsContainer().removeAllViews();
        this.titleComponent = initLabelComponent(title());
        this.subtitleComponent = initLabelComponent(subtitle());
        setTrailView(requiredAltChoiceComponentTrailView);
        agc0 agc0Var = new agc0(26, this, context);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.titleBadge = a.b(lazyThreadSafetyMode, agc0Var);
        this.subtitleBadge = a.b(lazyThreadSafetyMode, new vyf0(15, this));
    }

    private final TextAndBadgeComponent initLabelComponent(TextView textView) {
        TextAndBadgeComponent textAndBadgeComponent = new TextAndBadgeComponent(getContext(), textView);
        textAndBadgeComponent.setVisibility(textView.getVisibility());
        labelsContainer().addView(textAndBadgeComponent);
        return textAndBadgeComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BadgeView subtitleBadge_delegate$lambda$0(RequiredAltChoiceComponentView requiredAltChoiceComponentView) {
        requiredAltChoiceComponentView.setSubtitleSingleLine(true);
        requiredAltChoiceComponentView.subtitleComponent.ellipsizeLeadTextMiddle(true);
        return requiredAltChoiceComponentView.subtitleComponent.initBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BadgeView titleBadge_delegate$lambda$0(RequiredAltChoiceComponentView requiredAltChoiceComponentView, Context context) {
        requiredAltChoiceComponentView.setTitleSingleLine(true);
        requiredAltChoiceComponentView.titleComponent.ellipsizeLeadTextMiddle(true);
        BadgeView initBadge = requiredAltChoiceComponentView.titleComponent.initBadge();
        xw31.E(initBadge, Integer.valueOf((int) tje.x(context, 5.0f)), 0, 0, 0);
        int i = requiredAltChoiceComponentView.badgeHorizontalPadding;
        initBadge.setPadding(i, requiredAltChoiceComponentView.badgeTopPadding, i, requiredAltChoiceComponentView.badgeBottomPadding);
        return initBadge;
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public RequiredAltChoiceComponentView ellipsizeSubtitleMiddle(boolean enabled) {
        TextAndBadgeComponent textAndBadgeComponent = this.subtitleComponent;
        if (textAndBadgeComponent != null) {
            textAndBadgeComponent.ellipsizeLeadTextMiddle(enabled);
        }
        return this;
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public RequiredAltChoiceComponentView ellipsizeTitleMiddle(boolean enabled) {
        TextAndBadgeComponent textAndBadgeComponent = this.titleComponent;
        if (textAndBadgeComponent != null) {
            textAndBadgeComponent.ellipsizeLeadTextMiddle(enabled);
        }
        return this;
    }

    public final AppCompatImageView getInnerTrailImageView() {
        return this.trail.getTrailImage();
    }

    public final BadgeView getSubtitleBadge() {
        return (BadgeView) this.subtitleBadge.getValue();
    }

    public final BadgeView getTitleBadge() {
        return (BadgeView) this.titleBadge.getValue();
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public void invalidateComponent() {
        super.invalidateComponent();
        TextAndBadgeComponent textAndBadgeComponent = this.titleComponent;
        if (textAndBadgeComponent != null) {
            textAndBadgeComponent.setVisibility(title().getVisibility());
        }
        TextAndBadgeComponent textAndBadgeComponent2 = this.subtitleComponent;
        if (textAndBadgeComponent2 != null) {
            textAndBadgeComponent2.setVisibility(subtitle().getVisibility());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.isChecked;
    }

    @Override // defpackage.lh
    /* renamed from: provideAccessibilityDelegate, reason: from getter */
    public AccessibilityDelegateCompat getDefaultAccessibilityDelegate() {
        return this.defaultAccessibilityDelegate;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        this.isChecked = checked;
        mfb mfbVar = this.checkDrawableProvider;
        this.trail.setCheckMark(checked, checked ? mfbVar.a() : mfbVar.b());
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public void setSubtitle(CharSequence text) {
        super.setSubtitle(text);
        TextAndBadgeComponent textAndBadgeComponent = this.subtitleComponent;
        if (textAndBadgeComponent != null) {
            textAndBadgeComponent.setLeadText(text);
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public void setTitle(CharSequence text) {
        super.setTitle(text);
        TextAndBadgeComponent textAndBadgeComponent = this.titleComponent;
        if (textAndBadgeComponent != null) {
            textAndBadgeComponent.setLeadText(text);
        }
    }

    public final void setTrailCheckBoxClickListener(sls listener) {
        this.trail.setCheckBoxClickListener(listener);
    }

    public final void setTrailSubtitle(CharSequence text) {
        this.trail.setSubtitle(text);
    }

    public final void setTrailTitle(CharSequence text) {
        this.trail.setTitle(text);
    }

    public final void showChevron() {
        this.trail.showChevron();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.isChecked);
    }

    public RequiredAltChoiceComponentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RequiredAltChoiceComponentView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RequiredAltChoiceComponentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
