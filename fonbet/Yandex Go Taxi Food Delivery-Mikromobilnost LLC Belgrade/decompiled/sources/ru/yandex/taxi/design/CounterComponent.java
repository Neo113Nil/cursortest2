package ru.yandex.taxi.design;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.dze;
import defpackage.dzg0;
import defpackage.eze;
import defpackage.m810;
import defpackage.mrg0;
import defpackage.mzh0;
import defpackage.ndh0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.sls;
import defpackage.sph0;
import defpackage.tje;
import defpackage.vng;
import defpackage.wvh0;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;
import ru.yandex.taxi.design.CounterComponent;
import ru.yandex.taxi.widget.ComponentLinearLayout;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 I2\u00020\u0001:\u0002$JB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\u00162\b\b\u0001\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010!J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101R\u001c\u00104\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00106\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u001c\u00108\u001a\n 3*\u0004\u0018\u000107078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010;R\u0016\u0010@\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010C\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010D\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010AR\u0016\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u0010F\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010AR\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/yandex/taxi/design/CounterComponent;", "Lru/yandex/taxi/widget/ComponentLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "icon", "colorAttr", "", CaretView.ALPHA_PROPERTY, "Landroid/graphics/drawable/Drawable;", "tintedDrawable", "(IIF)Landroid/graphics/drawable/Drawable;", "alphaDrawable", "(IF)Landroid/graphics/drawable/Drawable;", "value", "", "notifyListener", "Lzy11;", "setValueInternal", "(IZ)V", "disable", "setDisableIfNoOption", "(Z)V", "min", CspBioProgressConstants.MAX, "setMinMaxValues", "(II)V", "setValue", "(I)V", "invalidateComponent", "()V", "Leze;", "listener", "setValueChangedListener", "(Leze;)V", "", "contentDescription", "setPlusButtonContentDescription", "(Ljava/lang/String;)V", "setMinusButtonContentDescription", "valueContentDescriptionResId", "setValueContentDescription", "Landroid/widget/FrameLayout$LayoutParams;", "generateDefaultFrameLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "minusButton", "Landroid/widget/ImageView;", "plusButton", "Landroid/widget/TextView;", "valueView", "Landroid/widget/TextView;", "minValue", CA20Status.STATUS_USER_I, "maxValue", "currentValue", "valueChangedListener", "Leze;", "enabledBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "disabledBackgroundDrawable", "enabledMinusDrawable", "disabledMinusDrawable", "enabledPlusDrawable", "disabledPlusDrawable", "disableIfNoOption", "Z", "Companion", "dze", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CounterComponent extends ComponentLinearLayout {
    public static final dze Companion = new dze();
    private static final float DEFAULT_STATE_ALPHA = 1.0f;
    private static final float DISABLED_STATE_ALPHA = 0.25f;
    private int currentValue;
    private boolean disableIfNoOption;
    private final Drawable disabledBackgroundDrawable;
    private final Drawable disabledMinusDrawable;
    private final Drawable disabledPlusDrawable;
    private final Drawable enabledBackgroundDrawable;
    private final Drawable enabledMinusDrawable;
    private final Drawable enabledPlusDrawable;
    private int maxValue;
    private int minValue;
    private final ImageView minusButton;
    private final ImageView plusButton;
    private eze valueChangedListener;
    private int valueContentDescriptionResId;
    private final TextView valueView;

    public CounterComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        final int i2 = 1;
        ru.yandex.taxi.design.utils.c.q(this, sph0.component_counter, true);
        ImageView imageView = (ImageView) findViewById(ndh0.counter_minus_button);
        this.minusButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(ndh0.counter_plus_button);
        this.plusButton = imageView2;
        this.valueView = (TextView) findViewById(ndh0.counter_value);
        this.minValue = 1;
        this.maxValue = 1;
        this.currentValue = 1;
        this.valueContentDescriptionResId = wvh0.accessibility_shuttle_seats;
        Drawable t = vng.t(dzg0.counter_bg, getContext());
        this.enabledBackgroundDrawable = t;
        this.disabledBackgroundDrawable = alphaDrawable(dzg0.counter_bg, 0.25f);
        this.enabledMinusDrawable = tintedDrawable$default(this, dzg0.ic_minus, xng0.textMain, 0.0f, 4, null);
        this.disabledMinusDrawable = tintedDrawable(dzg0.ic_minus, xng0.textMain, 0.25f);
        this.enabledPlusDrawable = tintedDrawable$default(this, dzg0.ic_plus, xng0.textMain, 0.0f, 4, null);
        this.disabledPlusDrawable = tintedDrawable(dzg0.ic_plus, xng0.textMain, 0.25f);
        this.disableIfNoOption = true;
        setBackgroundDrawable(t);
        invalidateComponent();
        final int i3 = 0;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: cze
            public final /* synthetic */ CounterComponent b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i4 = i3;
                CounterComponent counterComponent = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = CounterComponent._init_$lambda$0(counterComponent);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = CounterComponent._init_$lambda$1(counterComponent);
                        return _init_$lambda$1;
                }
            }
        }, imageView);
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: cze
            public final /* synthetic */ CounterComponent b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i4 = i2;
                CounterComponent counterComponent = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = CounterComponent._init_$lambda$0(counterComponent);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = CounterComponent._init_$lambda$1(counterComponent);
                        return _init_$lambda$1;
                }
            }
        }, imageView2);
        imageView2.setContentDescription(getContext().getString(mzh0.shuttle_seats_plus_button));
        imageView.setContentDescription(getContext().getString(mzh0.shuttle_seats_minus_button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(CounterComponent counterComponent) {
        setValueInternal$default(counterComponent, counterComponent.currentValue - 1, false, 2, null);
        counterComponent.invalidateComponent();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(CounterComponent counterComponent) {
        setValueInternal$default(counterComponent, counterComponent.currentValue + 1, false, 2, null);
        counterComponent.invalidateComponent();
        return zy11.a;
    }

    private final Drawable alphaDrawable(int icon, float alpha) {
        Drawable t = vng.t(icon, getContext());
        if (t != null) {
            t.setAlpha(m810.b(255.0f * alpha));
        }
        return t;
    }

    public static /* synthetic */ Drawable alphaDrawable$default(CounterComponent counterComponent, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        return counterComponent.alphaDrawable(i, f);
    }

    private final void setValueInternal(int value, boolean notifyListener) {
        int i = this.currentValue;
        int min = Math.min(this.maxValue, value);
        this.currentValue = min;
        int max = Math.max(this.minValue, min);
        this.currentValue = max;
        if (!notifyListener || i == max) {
            return;
        }
        eze ezeVar = this.valueChangedListener;
        if (ezeVar != null) {
            ezeVar.a(max);
        }
        int i2 = this.valueContentDescriptionResId;
        int i3 = this.currentValue;
        announceForAccessibility(ru.yandex.taxi.design.utils.c.u(this, i2, i3, Integer.valueOf(i3)));
    }

    public static /* synthetic */ void setValueInternal$default(CounterComponent counterComponent, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        counterComponent.setValueInternal(i, z);
    }

    private final Drawable tintedDrawable(int icon, int colorAttr, float alpha) {
        Drawable c0 = tje.c0(icon, getContext());
        if (c0 == null) {
            return null;
        }
        c0.setTint(qje.t(colorAttr, getContext()));
        c0.setAlpha(m810.b(255.0f * alpha));
        return c0;
    }

    public static /* synthetic */ Drawable tintedDrawable$default(CounterComponent counterComponent, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f = 1.0f;
        }
        return counterComponent.tintedDrawable(i, i2, f);
    }

    public final FrameLayout.LayoutParams generateDefaultFrameLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.setMarginStart(tje.r(mrg0.go_design_s_space, getContext()));
        layoutParams.setMarginEnd(tje.r(mrg0.go_design_m_space, getContext()));
        return layoutParams;
    }

    public final void invalidateComponent() {
        this.valueView.setText(String.valueOf(this.currentValue));
        TextView textView = this.valueView;
        int i = this.valueContentDescriptionResId;
        int i2 = this.currentValue;
        textView.setContentDescription(ru.yandex.taxi.design.utils.c.u(this, i, i2, Integer.valueOf(i2)));
        if (this.minValue == this.maxValue && this.disableIfNoOption) {
            setBackgroundDrawable(this.disabledBackgroundDrawable);
            this.plusButton.setEnabled(false);
            this.plusButton.setImageDrawable(this.disabledPlusDrawable);
            this.minusButton.setEnabled(false);
            this.minusButton.setImageDrawable(this.disabledMinusDrawable);
            this.valueView.setAlpha(0.25f);
            return;
        }
        setBackgroundDrawable(this.enabledBackgroundDrawable);
        this.valueView.setAlpha(1.0f);
        int i3 = this.currentValue;
        int i4 = this.minValue;
        ImageView imageView = this.minusButton;
        if (i3 == i4) {
            imageView.setEnabled(false);
            this.minusButton.setImageDrawable(this.disabledMinusDrawable);
        } else {
            imageView.setEnabled(true);
            this.minusButton.setImageDrawable(this.enabledMinusDrawable);
        }
        int i5 = this.currentValue;
        int i6 = this.maxValue;
        ImageView imageView2 = this.plusButton;
        if (i5 == i6) {
            imageView2.setEnabled(false);
            this.plusButton.setImageDrawable(this.disabledPlusDrawable);
        } else {
            imageView2.setEnabled(true);
            this.plusButton.setImageDrawable(this.enabledPlusDrawable);
        }
    }

    public final void setDisableIfNoOption(boolean disable) {
        this.disableIfNoOption = disable;
    }

    public final void setMinMaxValues(int min, int max) {
        if (min > max) {
            ny61.g("min value should be less then or equals to max value");
            return;
        }
        this.minValue = min;
        this.maxValue = max;
        setValue(this.currentValue);
    }

    public final void setMinusButtonContentDescription(String contentDescription) {
        this.minusButton.setContentDescription(contentDescription);
    }

    public final void setPlusButtonContentDescription(String contentDescription) {
        this.plusButton.setContentDescription(contentDescription);
    }

    public final void setValue(int value) {
        setValueInternal(value, false);
    }

    public final void setValueChangedListener(eze listener) {
        this.valueChangedListener = listener;
    }

    public final void setValueContentDescription(int valueContentDescriptionResId) {
        this.valueContentDescriptionResId = valueContentDescriptionResId;
    }

    public CounterComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CounterComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CounterComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
