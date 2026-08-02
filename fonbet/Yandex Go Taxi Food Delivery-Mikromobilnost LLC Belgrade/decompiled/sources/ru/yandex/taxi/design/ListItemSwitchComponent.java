package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.c4i0;
import defpackage.lh;
import defpackage.psy;
import defpackage.qje;
import defpackage.qsy;
import defpackage.xng0;
import defpackage.xyw0;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemSwitchComponent;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u000215B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u0017\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b%\u0010\u0019J\u0017\u0010'\u001a\u00020\f2\b\b\u0001\u0010&\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0015J!\u0010*\u001a\u00020\f2\b\b\u0001\u0010(\u001a\u00020\b2\b\b\u0001\u0010)\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0016\u0010#\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u00100R\u0018\u00102\u001a\u000601R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/yandex/taxi/design/ListItemSwitchComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/widget/Checkable;", "Llh;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "init", "(Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "listener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "visibility", "setVisibility", "(I)V", "", BackendConfig.Restrictions.ENABLED, "setSwitchEnabled", "(Z)V", "checked", "setChecked", "isChecked", "()Z", "setEnabled", "Lxyw0;", "onCheckedChangedListener", "setOnCheckedListener", "(Lxyw0;)V", "toggle", "()V", "setCheckedWithAnimation", "color", "setSwitchTrackColor", "checkedColor", "uncheckedColor", "setTrackColors", "(II)V", "Landroidx/core/view/AccessibilityDelegateCompat;", "provideAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "Lru/yandex/taxi/design/SwitchComponent;", "Lru/yandex/taxi/design/SwitchComponent;", "Lqsy;", "listItemSwitchComponentAccessibilityDelegate", "Lqsy;", "Companion", "psy", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ListItemSwitchComponent extends ListItemComponent implements Checkable, lh {
    private static final String CHECKED_COLOR_ATTR = "component_switch_track_color";
    private static final String UNCHECKED_COLOR_ATTR = "component_switch_unchecked_color";
    private final qsy listItemSwitchComponentAccessibilityDelegate;
    private SwitchComponent toggle;
    private static final psy Companion = new psy();
    private static final int UNCHECKED_COLOR_STYLE = c4i0.ListItemSwitchComponent_component_switch_unchecked_color;
    private static final int CHECKED_COLOR_STYLE = c4i0.ListItemSwitchComponent_component_switch_track_color;

    public ListItemSwitchComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qsy qsyVar = new qsy(this);
        this.listItemSwitchComponentAccessibilityDelegate = qsyVar;
        init(attributeSet, i);
        androidx.core.view.b.p(this, qsyVar);
    }

    private final void init(AttributeSet attrs, int defStyleAttr) {
        SwitchComponent switchComponent = new SwitchComponent(getContext(), attrs, defStyleAttr);
        this.toggle = switchComponent;
        if (switchComponent.getId() != -1) {
            SwitchComponent switchComponent2 = this.toggle;
            if (switchComponent2 == null) {
                switchComponent2 = null;
            }
            switchComponent2.setId(-1);
        }
        final int i = 0;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ListItemSwitchComponent, defStyleAttr, 0);
        try {
            final int i2 = 1;
            boolean z = obtainStyledAttributes.getBoolean(c4i0.ListItemSwitchComponent_component_switch_enabled, true);
            boolean z2 = obtainStyledAttributes.getBoolean(c4i0.ListItemSwitchComponent_component_switch_checked, false);
            SwitchComponent switchComponent3 = this.toggle;
            if (switchComponent3 == null) {
                switchComponent3 = null;
            }
            switchComponent3.setEnabled(z);
            SwitchComponent switchComponent4 = this.toggle;
            if (switchComponent4 == null) {
                switchComponent4 = null;
            }
            switchComponent4.setChecked(z2);
            if (attrs != null) {
                qje.S(attrs, obtainStyledAttributes, UNCHECKED_COLOR_ATTR, UNCHECKED_COLOR_STYLE, xng0.controlMinor, new Consumer(this) { // from class: osy
                    public final /* synthetic */ ListItemSwitchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i3 = i;
                        ListItemSwitchComponent listItemSwitchComponent = this.b;
                        Integer num = (Integer) obj;
                        switch (i3) {
                            case 0:
                                ListItemSwitchComponent.init$lambda$0(listItemSwitchComponent, num);
                                break;
                            case 1:
                                ListItemSwitchComponent.init$lambda$1(listItemSwitchComponent, num);
                                break;
                            case 2:
                                ListItemSwitchComponent.init$lambda$2(listItemSwitchComponent, num);
                                break;
                            default:
                                ListItemSwitchComponent.init$lambda$3(listItemSwitchComponent, num);
                                break;
                        }
                    }
                }, new Consumer(this) { // from class: osy
                    public final /* synthetic */ ListItemSwitchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i3 = i2;
                        ListItemSwitchComponent listItemSwitchComponent = this.b;
                        Integer num = (Integer) obj;
                        switch (i3) {
                            case 0:
                                ListItemSwitchComponent.init$lambda$0(listItemSwitchComponent, num);
                                break;
                            case 1:
                                ListItemSwitchComponent.init$lambda$1(listItemSwitchComponent, num);
                                break;
                            case 2:
                                ListItemSwitchComponent.init$lambda$2(listItemSwitchComponent, num);
                                break;
                            default:
                                ListItemSwitchComponent.init$lambda$3(listItemSwitchComponent, num);
                                break;
                        }
                    }
                });
                int i3 = CHECKED_COLOR_STYLE;
                int i4 = xng0.controlMain;
                final int i5 = 2;
                Consumer consumer = new Consumer(this) { // from class: osy
                    public final /* synthetic */ ListItemSwitchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i32 = i5;
                        ListItemSwitchComponent listItemSwitchComponent = this.b;
                        Integer num = (Integer) obj;
                        switch (i32) {
                            case 0:
                                ListItemSwitchComponent.init$lambda$0(listItemSwitchComponent, num);
                                break;
                            case 1:
                                ListItemSwitchComponent.init$lambda$1(listItemSwitchComponent, num);
                                break;
                            case 2:
                                ListItemSwitchComponent.init$lambda$2(listItemSwitchComponent, num);
                                break;
                            default:
                                ListItemSwitchComponent.init$lambda$3(listItemSwitchComponent, num);
                                break;
                        }
                    }
                };
                final int i6 = 3;
                qje.S(attrs, obtainStyledAttributes, CHECKED_COLOR_ATTR, i3, i4, consumer, new Consumer(this) { // from class: osy
                    public final /* synthetic */ ListItemSwitchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i32 = i6;
                        ListItemSwitchComponent listItemSwitchComponent = this.b;
                        Integer num = (Integer) obj;
                        switch (i32) {
                            case 0:
                                ListItemSwitchComponent.init$lambda$0(listItemSwitchComponent, num);
                                break;
                            case 1:
                                ListItemSwitchComponent.init$lambda$1(listItemSwitchComponent, num);
                                break;
                            case 2:
                                ListItemSwitchComponent.init$lambda$2(listItemSwitchComponent, num);
                                break;
                            default:
                                ListItemSwitchComponent.init$lambda$3(listItemSwitchComponent, num);
                                break;
                        }
                    }
                });
            } else {
                SwitchComponent switchComponent5 = this.toggle;
                if (switchComponent5 == null) {
                    switchComponent5 = null;
                }
                switchComponent5.setUncheckedColorAttr(xng0.controlMinor);
                SwitchComponent switchComponent6 = this.toggle;
                if (switchComponent6 == null) {
                    switchComponent6 = null;
                }
                switchComponent6.setTrackColorAttr(xng0.controlMain);
            }
            obtainStyledAttributes.recycle();
            SwitchComponent switchComponent7 = this.toggle;
            if (switchComponent7 == null) {
                switchComponent7 = null;
            }
            switchComponent7.setClickable(false);
            SwitchComponent switchComponent8 = this.toggle;
            SwitchComponent switchComponent9 = switchComponent8 == null ? null : switchComponent8;
            if (switchComponent8 == null) {
                switchComponent8 = null;
            }
            switchComponent9.setLayoutParams(switchComponent8.generateDefaultFrameLayoutParams());
            SwitchComponent switchComponent10 = this.toggle;
            setTrailView(switchComponent10 != null ? switchComponent10 : null);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(ListItemSwitchComponent listItemSwitchComponent, Integer num) {
        SwitchComponent switchComponent = listItemSwitchComponent.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setUncheckedColorAttr(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(ListItemSwitchComponent listItemSwitchComponent, Integer num) {
        SwitchComponent switchComponent = listItemSwitchComponent.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setUncheckedTrackColor(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(ListItemSwitchComponent listItemSwitchComponent, Integer num) {
        SwitchComponent switchComponent = listItemSwitchComponent.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setTrackColorAttr(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3(ListItemSwitchComponent listItemSwitchComponent, Integer num) {
        SwitchComponent switchComponent = listItemSwitchComponent.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setTrackColor(num.intValue());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        return switchComponent.isChecked();
    }

    @Override // defpackage.lh
    /* renamed from: provideAccessibilityDelegate */
    public AccessibilityDelegateCompat getDefaultAccessibilityDelegate() {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        return switchComponent.getDefaultAccessibilityDelegate();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setChecked(checked);
    }

    public final void setCheckedWithAnimation(boolean isChecked) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setCheckedWithAnimation(isChecked);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setEnabled(enabled);
        super.setEnabled(enabled);
    }

    public final void setOnCheckedListener(xyw0 onCheckedChangedListener) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setOnCheckedChangedListener(onCheckedChangedListener);
        SwitchComponent switchComponent2 = this.toggle;
        (switchComponent2 != null ? switchComponent2 : null).setClickable(false);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        super.setOnClickListener(listener);
        androidx.core.view.b.p(this, this.listItemSwitchComponentAccessibilityDelegate);
    }

    public final void setSwitchEnabled(boolean enabled) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setEnabled(enabled);
    }

    public final void setSwitchTrackColor(int color) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setTrackColor(color);
    }

    public final void setTrackColors(int checkedColor, int uncheckedColor) {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setTrackColors(checkedColor, uncheckedColor);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.setVisibility(visibility);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        SwitchComponent switchComponent = this.toggle;
        if (switchComponent == null) {
            switchComponent = null;
        }
        switchComponent.toggleWithAnimation();
    }

    public ListItemSwitchComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListItemSwitchComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListItemSwitchComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.listItemSwitchComponentStyle : i);
    }
}
