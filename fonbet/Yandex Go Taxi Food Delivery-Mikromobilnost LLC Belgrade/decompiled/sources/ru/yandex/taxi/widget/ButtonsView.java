package ru.yandex.taxi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.ax1;
import defpackage.b57;
import defpackage.bdc;
import defpackage.c57;
import defpackage.dv31;
import defpackage.i3y;
import defpackage.kdc;
import defpackage.mh3;
import defpackage.mrg0;
import defpackage.my6;
import defpackage.pm5;
import defpackage.q47;
import defpackage.s8o;
import defpackage.sls;
import defpackage.w511;
import defpackage.w57;
import defpackage.xng0;
import defpackage.zy6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.common_models.ui.ButtonSize;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ButtonsView;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\f*\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\f*\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\f*\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\f2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+\"\b\b\u0000\u0010**\u00020\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u00109\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u001c\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\n0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/yandex/taxi/widget/ButtonsView;", "Lru/yandex/taxi/widget/BottomEdgeButtonLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lq47;", "buttons", "Lzy11;", "renderButtonsWithCorrection", "(Lq47;)V", "Lru/yandex/taxi/common_models/ui/ButtonOrientation;", "orientation", "", "needLimitLines", "renderWithOrientation", "(Lq47;Lru/yandex/taxi/common_models/ui/ButtonOrientation;Z)V", "Lmy6;", "Lzy6;", "button", "Landroid/view/View;", "createButton", "(Lmy6;Lru/yandex/taxi/common_models/ui/ButtonOrientation;Z)Landroid/view/View;", "Lru/yandex/taxi/design/ListItemComponent;", "", "subtitle", "setMaxLines", "(Lru/yandex/taxi/design/ListItemComponent;Ljava/lang/CharSequence;)V", "updateLayout", "(Lru/yandex/taxi/design/ListItemComponent;Lru/yandex/taxi/common_models/ui/ButtonOrientation;)V", "Lru/yandex/taxi/common_models/ui/ButtonSize;", "size", "setSize", "(Lru/yandex/taxi/design/ListItemComponent;Lru/yandex/taxi/common_models/ui/ButtonSize;)V", "isTextNotFitsButtons", "()Z", "handleClick", "(Lmy6;)V", "T", "Lc57;", "buttonsContract", "()Lc57;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lb57;", "onClickListener", "Lb57;", "buttonTextSize$delegate", "Li3y;", "getButtonTextSize", "()I", "buttonTextSize", "", "buttonCornersRadius$delegate", "getButtonCornersRadius", "()F", "buttonCornersRadius", "initialState", "Lq47;", "Ldv31;", "stateHolder", "Ldv31;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonsView extends BottomEdgeButtonLayout {
    public static final int $stable = 8;

    /* renamed from: buttonCornersRadius$delegate, reason: from kotlin metadata */
    private final i3y buttonCornersRadius;

    /* renamed from: buttonTextSize$delegate, reason: from kotlin metadata */
    private final i3y buttonTextSize;
    private final q47 initialState;
    private b57 onClickListener;
    private final dv31 stateHolder;

    public ButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        final int i2 = 0;
        this.buttonTextSize = kotlin.a.a(new sls(this) { // from class: v57
            public final /* synthetic */ ButtonsView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int buttonTextSize_delegate$lambda$0;
                float buttonCornersRadius_delegate$lambda$0;
                int i3 = i2;
                ButtonsView buttonsView = this.b;
                switch (i3) {
                    case 0:
                        buttonTextSize_delegate$lambda$0 = ButtonsView.buttonTextSize_delegate$lambda$0(buttonsView);
                        return Integer.valueOf(buttonTextSize_delegate$lambda$0);
                    default:
                        buttonCornersRadius_delegate$lambda$0 = ButtonsView.buttonCornersRadius_delegate$lambda$0(buttonsView);
                        return Float.valueOf(buttonCornersRadius_delegate$lambda$0);
                }
            }
        });
        final int i3 = 1;
        this.buttonCornersRadius = kotlin.a.a(new sls(this) { // from class: v57
            public final /* synthetic */ ButtonsView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int buttonTextSize_delegate$lambda$0;
                float buttonCornersRadius_delegate$lambda$0;
                int i32 = i3;
                ButtonsView buttonsView = this.b;
                switch (i32) {
                    case 0:
                        buttonTextSize_delegate$lambda$0 = ButtonsView.buttonTextSize_delegate$lambda$0(buttonsView);
                        return Integer.valueOf(buttonTextSize_delegate$lambda$0);
                    default:
                        buttonCornersRadius_delegate$lambda$0 = ButtonsView.buttonCornersRadius_delegate$lambda$0(buttonsView);
                        return Float.valueOf(buttonCornersRadius_delegate$lambda$0);
                }
            }
        });
        q47 q47Var = new q47((List) null, 3);
        this.initialState = q47Var;
        this.stateHolder = new ax1(this, q47Var, this, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float buttonCornersRadius_delegate$lambda$0(ButtonsView buttonsView) {
        return ru.yandex.taxi.design.utils.c.d(mrg0.button_component_default_rounded_corners_radius, buttonsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buttonTextSize_delegate$lambda$0(ButtonsView buttonsView) {
        return ru.yandex.taxi.design.utils.c.d(mrg0.component_text_size_body, buttonsView);
    }

    private final View createButton(my6 button, ButtonOrientation orientation, boolean needLimitLines) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        boolean z = button.i;
        CharSequence charSequence = button.f;
        TextStyle textStyle = button.d;
        kdc kdcVar = button.c;
        listItemComponent.setEnabled(z);
        if (button.i) {
            listItemComponent.setAlpha(1.0f);
            listItemComponent.setTitleTextColor(button.b);
            listItemComponent.setRoundedBackground(s8o.m(kdcVar == null ? new bdc(xng0.controlMain) : kdcVar, listItemComponent.getContext()), getButtonCornersRadius());
            int i = textStyle == null ? -1 : w57.b[textStyle.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    listItemComponent.setTitleTypeface(3);
                } else if (i != 2) {
                    w511.b();
                    return null;
                }
            }
            listItemComponent.setTitleTypeface(0);
        } else {
            listItemComponent.setAlpha(0.5f);
            listItemComponent.setTitleTextColor(new bdc(xng0.textOnControlMinor));
            listItemComponent.setTitleTypeface(3);
            listItemComponent.setRoundedBackground(s8o.m(new bdc(xng0.controlMinor), listItemComponent.getContext()), getButtonCornersRadius());
        }
        listItemComponent.setTitle(button.a);
        listItemComponent.setTitleTextSizePx(getButtonTextSize());
        listItemComponent.setTitleAlignment(1);
        listItemComponent.setSubtitle(charSequence);
        listItemComponent.setSubtitleTextColor(button.g);
        listItemComponent.setSubtitleAlignment(1);
        if (needLimitLines) {
            setMaxLines(listItemComponent, charSequence);
        }
        setSize(listItemComponent, button.h);
        if (kdcVar == null) {
            kdcVar = new bdc(xng0.controlMain);
        }
        listItemComponent.setRoundedBackground(s8o.m(kdcVar, listItemComponent.getContext()), getButtonCornersRadius());
        if ((textStyle != null ? w57.b[textStyle.ordinal()] : -1) == 1) {
            listItemComponent.setTitleTypeface(3);
        } else {
            listItemComponent.setTitleTypeface(0);
        }
        if (button.j) {
            listItemComponent.startProgressAnimation();
        }
        updateLayout(listItemComponent, orientation);
        listItemComponent.setDebounceClickListener(new mh3(24, this, button));
        listItemComponent.setImportantForAccessibility(1);
        return listItemComponent;
    }

    private final float getButtonCornersRadius() {
        return ((Number) this.buttonCornersRadius.getValue()).floatValue();
    }

    private final int getButtonTextSize() {
        return ((Number) this.buttonTextSize.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleClick(my6 button) {
        b57 b57Var = this.onClickListener;
        zy6 zy6Var = button.e;
        if (zy6Var == null || b57Var == null) {
            return;
        }
        b57Var.a(zy6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isTextNotFitsButtons() {
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = getChildAt(i);
                ListItemComponent listItemComponent = childAt instanceof ListItemComponent ? (ListItemComponent) childAt : null;
                if (listItemComponent == null || (listItemComponent.title().getLineCount() <= 1 && listItemComponent.subtitle().getLineCount() <= 1)) {
                    if (i == childCount) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderButtonsWithCorrection(q47 buttons) {
        renderWithOrientation(buttons, buttons.a, false);
        OneShotPreDrawListener.add(this, new mh3(25, this, buttons));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButtonsWithCorrection$lambda$0(ButtonsView buttonsView, q47 q47Var) {
        if (buttonsView.isTextNotFitsButtons()) {
            buttonsView.renderWithOrientation(q47Var, ButtonOrientation.VERTICAL, true);
        }
    }

    private final void renderWithOrientation(q47 q47Var, ButtonOrientation buttonOrientation, boolean z) {
        removeAllViews();
        int i = w57.a[buttonOrientation.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            w511.b();
            return;
        }
        setOrientation(i2);
        Iterator it = q47Var.b.iterator();
        while (it.hasNext()) {
            addView(createButton((my6) it.next(), buttonOrientation, z));
        }
    }

    private final void setMaxLines(ListItemComponent listItemComponent, CharSequence charSequence) {
        listItemComponent.setTitleEllipsizeMode(1);
        listItemComponent.setSubTitleEllipsizeMode(1);
        listItemComponent.setSubtitleSingleLine(true);
        if (charSequence != null && charSequence.length() != 0) {
            listItemComponent.setTitleSingleLine(true);
        } else {
            listItemComponent.setTitleSingleLine(false);
            listItemComponent.setTitleMaxLines(2);
        }
    }

    private final void setSize(ListItemComponent listItemComponent, ButtonSize buttonSize) {
        int i;
        int i2 = w57.c[buttonSize.ordinal()];
        if (i2 == 1) {
            i = mrg0.button_component_size_XS;
        } else if (i2 == 2) {
            i = mrg0.button_component_size_S;
        } else if (i2 == 3) {
            i = mrg0.button_component_size_M;
        } else {
            if (i2 != 4) {
                w511.b();
                return;
            }
            i = mrg0.button_component_size_L;
        }
        listItemComponent.setMinHeight(ru.yandex.taxi.design.utils.c.d(i, listItemComponent));
    }

    private final void updateLayout(ListItemComponent listItemComponent, ButtonOrientation buttonOrientation) {
        LinearLayout.LayoutParams layoutParams;
        int i = w57.a[buttonOrientation.ordinal()];
        if (i == 1) {
            layoutParams = new LinearLayout.LayoutParams(0, -2);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.weight = 1.0f;
        listItemComponent.setLayoutParams(layoutParams);
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        renderButtonsWithCorrection((q47) this.stateHolder.d);
    }

    public final <T extends zy6> c57 buttonsContract() {
        return new pm5(10, this);
    }

    public ButtonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ButtonsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ButtonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
