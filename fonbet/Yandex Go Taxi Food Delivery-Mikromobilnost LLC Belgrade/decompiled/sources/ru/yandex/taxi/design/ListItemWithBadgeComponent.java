package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c4i0;
import defpackage.i3y;
import defpackage.i4o;
import defpackage.lh;
import defpackage.lhc;
import defpackage.mrg0;
import defpackage.qje;
import defpackage.sls;
import defpackage.tje;
import defpackage.usy;
import defpackage.vsy;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.xyw0;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.design.SwitchComponent;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 _2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Q`B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020\u00122\b\b\u0001\u0010 \u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\f¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J!\u00100\u001a\u00020\u00122\b\b\u0001\u0010.\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u0010)J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u0010\u001fJ\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\u00020=2\b\b\u0001\u0010 \u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b>\u0010?J)\u0010A\u001a\u00020@2\b\b\u0001\u0010 \u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\bA\u0010BR\u0016\u0010C\u001a\u0004\u0018\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010I\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010J\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010GR\u0014\u0010K\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010GR\u0014\u0010L\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010GR\u0016\u0010M\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u00104\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010PR\u0018\u0010R\u001a\u00060QR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010WR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020O0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010WR\u0011\u0010\\\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010^\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\b]\u0010[¨\u0006a"}, d2 = {"Lru/yandex/taxi/design/ListItemWithBadgeComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/widget/Checkable;", "Llh;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "hasTitleBadge", "()Z", "hasSubtitleBadge", "Landroid/view/View$OnClickListener;", "listener", "Lzy11;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", BackendConfig.Restrictions.ENABLED, "ellipsizeTitleMiddle", "(Z)Lru/yandex/taxi/design/ListItemWithBadgeComponent;", "ellipsizeSubtitleMiddle", "invalidateComponent", "()V", "color", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "elevation", "setTitleBadgeWithBottomShadow", "(IFF)V", "initToggle", "isChecked", "setCheckedWithAnimation", "(Z)V", "Lxyw0;", "onCheckedChangedListener", "setOnCheckedListener", "(Lxyw0;)V", "checkedColor", "uncheckedColor", "setTrackColors", "(II)V", "checked", "setChecked", "toggle", "Landroidx/core/view/AccessibilityDelegateCompat;", "provideAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "Landroid/widget/TextView;", "textView", "Lru/yandex/taxi/design/TextAndBadgeComponent;", "initLabelComponent", "(Landroid/widget/TextView;)Lru/yandex/taxi/design/TextAndBadgeComponent;", "Landroid/graphics/drawable/Drawable;", "createShadow", "(IFF)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/ShapeDrawable;", "createShadowDrawable", "(IFF)Landroid/graphics/drawable/ShapeDrawable;", "titleComponent", "Lru/yandex/taxi/design/TextAndBadgeComponent;", "subtitleComponent", "uncheckedColorStyle", CA20Status.STATUS_USER_I, "checkedColorStyle", "blurLength", "badgeTopPadding", "badgeHorizontalPadding", "badgeBottomPadding", "defaultAccessibilityDelegate", "Landroidx/core/view/AccessibilityDelegateCompat;", "Lru/yandex/taxi/design/SwitchComponent;", "Lru/yandex/taxi/design/SwitchComponent;", "Lvsy;", "listItemWithBadgeComponentAccessibilityDelegate", "Lvsy;", "Li3y;", "Lru/yandex/taxi/design/BadgeView;", "titleBadgeLazy", "Li3y;", "subtitleBadgeLazy", "toggleLazy", "getTitleBadge", "()Lru/yandex/taxi/design/BadgeView;", "titleBadge", "getSubtitleBadge", "subtitleBadge", "Companion", "usy", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ListItemWithBadgeComponent extends ListItemComponent implements Checkable, lh {
    private static final String CHECKED_COLOR_ATTR = "component_switch_track_color";
    private static final usy Companion = new usy();
    private static final String UNCHECKED_COLOR_ATTR = "component_switch_unchecked_color";
    private final int badgeBottomPadding;
    private final int badgeHorizontalPadding;
    private final int badgeTopPadding;
    private final int blurLength;
    private final int checkedColorStyle;
    private AccessibilityDelegateCompat defaultAccessibilityDelegate;
    private final vsy listItemWithBadgeComponentAccessibilityDelegate;
    private final i3y subtitleBadgeLazy;
    private final TextAndBadgeComponent subtitleComponent;
    private final i3y titleBadgeLazy;
    private final TextAndBadgeComponent titleComponent;
    private SwitchComponent toggle;
    private final i3y toggleLazy;
    private final int uncheckedColorStyle;

    public ListItemWithBadgeComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.uncheckedColorStyle = c4i0.ListItemSwitchComponent_component_switch_unchecked_color;
        this.checkedColorStyle = c4i0.ListItemSwitchComponent_component_switch_track_color;
        this.blurLength = tje.u(4, getContext());
        final int i2 = 1;
        this.badgeTopPadding = tje.u(1, getContext());
        this.badgeHorizontalPadding = tje.u(10, getContext());
        this.badgeBottomPadding = tje.u(10, getContext());
        this.defaultAccessibilityDelegate = new AccessibilityDelegateCompat();
        vsy vsyVar = new vsy(this);
        this.listItemWithBadgeComponentAccessibilityDelegate = vsyVar;
        labelsContainer().removeAllViews();
        this.titleComponent = initLabelComponent(title());
        this.subtitleComponent = initLabelComponent(subtitle());
        androidx.core.view.b.p(this, vsyVar);
        final int i3 = 0;
        this.titleBadgeLazy = kotlin.a.a(new sls(this) { // from class: tsy
            public final /* synthetic */ ListItemWithBadgeComponent b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                BadgeView titleBadgeLazy$lambda$0;
                BadgeView subtitleBadgeLazy$lambda$0;
                int i4 = i3;
                ListItemWithBadgeComponent listItemWithBadgeComponent = this.b;
                switch (i4) {
                    case 0:
                        titleBadgeLazy$lambda$0 = ListItemWithBadgeComponent.titleBadgeLazy$lambda$0(listItemWithBadgeComponent);
                        return titleBadgeLazy$lambda$0;
                    default:
                        subtitleBadgeLazy$lambda$0 = ListItemWithBadgeComponent.subtitleBadgeLazy$lambda$0(listItemWithBadgeComponent);
                        return subtitleBadgeLazy$lambda$0;
                }
            }
        });
        this.subtitleBadgeLazy = kotlin.a.a(new sls(this) { // from class: tsy
            public final /* synthetic */ ListItemWithBadgeComponent b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                BadgeView titleBadgeLazy$lambda$0;
                BadgeView subtitleBadgeLazy$lambda$0;
                int i4 = i2;
                ListItemWithBadgeComponent listItemWithBadgeComponent = this.b;
                switch (i4) {
                    case 0:
                        titleBadgeLazy$lambda$0 = ListItemWithBadgeComponent.titleBadgeLazy$lambda$0(listItemWithBadgeComponent);
                        return titleBadgeLazy$lambda$0;
                    default:
                        subtitleBadgeLazy$lambda$0 = ListItemWithBadgeComponent.subtitleBadgeLazy$lambda$0(listItemWithBadgeComponent);
                        return subtitleBadgeLazy$lambda$0;
                }
            }
        });
        this.toggleLazy = kotlin.a.a(new i4o(this, attributeSet, i));
    }

    private final Drawable createShadow(int color, float cornerRadius, float elevation) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{createShadowDrawable(color, cornerRadius, elevation)});
        int i = (int) elevation;
        layerDrawable.setLayerInset(0, i, 0, i, i + this.blurLength);
        return layerDrawable;
    }

    private final ShapeDrawable createShadowDrawable(int color, float cornerRadius, float elevation) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setShadowLayer(elevation, 0.0f, elevation, lhc.f(color, Math.abs((int) (255.0f * 0.2f)) & 255));
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = cornerRadius;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        return shapeDrawable;
    }

    private final TextAndBadgeComponent initLabelComponent(TextView textView) {
        TextAndBadgeComponent textAndBadgeComponent = new TextAndBadgeComponent(getContext(), textView);
        textAndBadgeComponent.setVisibility(textView.getVisibility());
        labelsContainer().addView(textAndBadgeComponent);
        return textAndBadgeComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BadgeView subtitleBadgeLazy$lambda$0(ListItemWithBadgeComponent listItemWithBadgeComponent) {
        listItemWithBadgeComponent.setSubtitleSingleLine(true);
        listItemWithBadgeComponent.subtitleComponent.ellipsizeLeadTextMiddle(true);
        return listItemWithBadgeComponent.subtitleComponent.initBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BadgeView titleBadgeLazy$lambda$0(ListItemWithBadgeComponent listItemWithBadgeComponent) {
        listItemWithBadgeComponent.setTitleSingleLine(true);
        listItemWithBadgeComponent.titleComponent.ellipsizeLeadTextMiddle(true);
        return listItemWithBadgeComponent.titleComponent.initBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchComponent toggleLazy$lambda$0(ListItemWithBadgeComponent listItemWithBadgeComponent, AttributeSet attributeSet, int i) {
        final SwitchComponent switchComponent = new SwitchComponent(listItemWithBadgeComponent.getContext(), attributeSet, i);
        if (switchComponent.getId() != -1) {
            switchComponent.setId(-1);
        }
        final int i2 = 0;
        TypedArray obtainStyledAttributes = switchComponent.getContext().getTheme().obtainStyledAttributes(attributeSet, c4i0.ListItemSwitchComponent, i, 0);
        try {
            final int i3 = 1;
            boolean z = obtainStyledAttributes.getBoolean(c4i0.ListItemSwitchComponent_component_switch_enabled, true);
            boolean z2 = obtainStyledAttributes.getBoolean(c4i0.ListItemSwitchComponent_component_switch_checked, false);
            switchComponent.setEnabled(z);
            switchComponent.setChecked(z2);
            if (attributeSet != null) {
                qje.S(attributeSet, obtainStyledAttributes, UNCHECKED_COLOR_ATTR, listItemWithBadgeComponent.uncheckedColorStyle, xng0.controlMinor, new Consumer() { // from class: ssy
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i4 = i2;
                        SwitchComponent switchComponent2 = switchComponent;
                        Integer num = (Integer) obj;
                        switch (i4) {
                            case 0:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$0(switchComponent2, num);
                                break;
                            case 1:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$1(switchComponent2, num);
                                break;
                            case 2:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$2(switchComponent2, num);
                                break;
                            default:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$3(switchComponent2, num);
                                break;
                        }
                    }
                }, new Consumer() { // from class: ssy
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i4 = i3;
                        SwitchComponent switchComponent2 = switchComponent;
                        Integer num = (Integer) obj;
                        switch (i4) {
                            case 0:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$0(switchComponent2, num);
                                break;
                            case 1:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$1(switchComponent2, num);
                                break;
                            case 2:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$2(switchComponent2, num);
                                break;
                            default:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$3(switchComponent2, num);
                                break;
                        }
                    }
                });
                int i4 = listItemWithBadgeComponent.checkedColorStyle;
                int i5 = xng0.controlMain;
                final int i6 = 2;
                Consumer consumer = new Consumer() { // from class: ssy
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i42 = i6;
                        SwitchComponent switchComponent2 = switchComponent;
                        Integer num = (Integer) obj;
                        switch (i42) {
                            case 0:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$0(switchComponent2, num);
                                break;
                            case 1:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$1(switchComponent2, num);
                                break;
                            case 2:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$2(switchComponent2, num);
                                break;
                            default:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$3(switchComponent2, num);
                                break;
                        }
                    }
                };
                final int i7 = 3;
                qje.S(attributeSet, obtainStyledAttributes, CHECKED_COLOR_ATTR, i4, i5, consumer, new Consumer() { // from class: ssy
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i42 = i7;
                        SwitchComponent switchComponent2 = switchComponent;
                        Integer num = (Integer) obj;
                        switch (i42) {
                            case 0:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$0(switchComponent2, num);
                                break;
                            case 1:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$1(switchComponent2, num);
                                break;
                            case 2:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$2(switchComponent2, num);
                                break;
                            default:
                                ListItemWithBadgeComponent.toggleLazy$lambda$0$0$3(switchComponent2, num);
                                break;
                        }
                    }
                });
            } else {
                switchComponent.setUncheckedColorAttr(xng0.controlMinor);
                switchComponent.setTrackColorAttr(xng0.controlMain);
            }
            obtainStyledAttributes.recycle();
            switchComponent.setClickable(false);
            switchComponent.setLayoutParams(switchComponent.generateDefaultFrameLayoutParams());
            listItemWithBadgeComponent.setTrailView(switchComponent);
            return switchComponent;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleLazy$lambda$0$0$0(SwitchComponent switchComponent, Integer num) {
        switchComponent.setUncheckedColorAttr(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleLazy$lambda$0$0$1(SwitchComponent switchComponent, Integer num) {
        switchComponent.setUncheckedTrackColor(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleLazy$lambda$0$0$2(SwitchComponent switchComponent, Integer num) {
        switchComponent.setTrackColorAttr(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleLazy$lambda$0$0$3(SwitchComponent switchComponent, Integer num) {
        switchComponent.setTrackColor(num.intValue());
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public ListItemWithBadgeComponent ellipsizeSubtitleMiddle(boolean enabled) {
        TextAndBadgeComponent textAndBadgeComponent = this.subtitleComponent;
        if (textAndBadgeComponent != null) {
            textAndBadgeComponent.ellipsizeLeadTextMiddle(enabled);
        }
        return this;
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public ListItemWithBadgeComponent ellipsizeTitleMiddle(boolean enabled) {
        TextAndBadgeComponent textAndBadgeComponent = this.titleComponent;
        if (textAndBadgeComponent != null) {
            textAndBadgeComponent.ellipsizeLeadTextMiddle(enabled);
        }
        return this;
    }

    public final BadgeView getSubtitleBadge() {
        return (BadgeView) this.subtitleBadgeLazy.getValue();
    }

    public final BadgeView getTitleBadge() {
        return (BadgeView) this.titleBadgeLazy.getValue();
    }

    public final boolean hasSubtitleBadge() {
        return this.subtitleBadgeLazy.isInitialized();
    }

    public final boolean hasTitleBadge() {
        return this.titleBadgeLazy.isInitialized();
    }

    public final void initToggle() {
        this.toggle = (SwitchComponent) this.toggleLazy.getValue();
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
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent != null) {
            return switchComponent.getIsChecked();
        }
        return false;
    }

    @Override // defpackage.lh
    /* renamed from: provideAccessibilityDelegate */
    public AccessibilityDelegateCompat getDefaultAccessibilityDelegate() {
        AccessibilityDelegateCompat defaultAccessibilityDelegate;
        SwitchComponent switchComponent = this.toggle;
        return (switchComponent == null || (defaultAccessibilityDelegate = switchComponent.getDefaultAccessibilityDelegate()) == null) ? this.defaultAccessibilityDelegate : defaultAccessibilityDelegate;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent != null) {
            switchComponent.setChecked(checked);
        }
    }

    public final void setCheckedWithAnimation(boolean isChecked) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent != null) {
            switchComponent.setCheckedWithAnimation(isChecked);
        }
    }

    public final void setOnCheckedListener(xyw0 onCheckedChangedListener) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent != null) {
            switchComponent.setOnCheckedChangedListener(onCheckedChangedListener);
        }
        SwitchComponent switchComponent2 = this.toggle;
        if (switchComponent2 != null) {
            switchComponent2.setClickable(false);
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        super.setOnClickListener(listener);
        androidx.core.view.b.p(this, this.listItemWithBadgeComponentAccessibilityDelegate);
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

    public final void setTitleBadgeWithBottomShadow(int color, float cornerRadius, float elevation) {
        getTitleBadge().setBackground(createShadow(color, cornerRadius, elevation));
        BadgeView titleBadge = getTitleBadge();
        xw31.E(titleBadge, Integer.valueOf(ru.yandex.taxi.design.utils.c.d(mrg0.go_design_s_space, titleBadge)), Integer.valueOf(ru.yandex.taxi.design.utils.c.d(mrg0.go_design_s_space, titleBadge)), 0, 0);
        int i = this.badgeHorizontalPadding;
        titleBadge.setPadding(i, this.badgeTopPadding, i, this.badgeBottomPadding);
    }

    public final void setTrackColors(int checkedColor, int uncheckedColor) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent != null) {
            switchComponent.setTrackColors(checkedColor, uncheckedColor);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent != null) {
            switchComponent.toggleWithAnimation();
        }
    }

    public ListItemWithBadgeComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListItemWithBadgeComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListItemWithBadgeComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
