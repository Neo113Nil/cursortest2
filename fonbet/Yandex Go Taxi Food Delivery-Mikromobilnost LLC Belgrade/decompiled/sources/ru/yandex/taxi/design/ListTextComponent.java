package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.dg4;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.sph0;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xw31;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ!\u0010\u0015\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010 \u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u000eJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u000eJ\u001d\u0010&\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b&\u0010'J5\u0010,\u001a\u00020\f2\b\b\u0001\u0010(\u001a\u00020\u00072\b\b\u0001\u0010)\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u00020\u00072\b\b\u0001\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u00103\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b\u0018\u0010\u001cR(\u0010;\u001a\u0004\u0018\u0001062\b\u00103\u001a\u0004\u0018\u0001068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorAttr", "Lzy11;", "setBackgroundColorAttr", "(I)V", "Landroid/content/res/TypedArray;", "attributes", "initAttributes", "(Landroid/content/res/TypedArray;)V", "textAlignment", "setTextAlignment", "resolveThemeAttrs", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "resId", "setText", "", "text", "setHtmlText", "(Ljava/lang/CharSequence;)V", "color", "setTextColor", "setLinkTextColor", "setTextColorAttr", "sizePx", "setTextSizePx", "", "add", "mult", "setTextLineSpacing", "(FF)V", "start", "top", "end", "bottom", "setTextPaddings", "(IIII)V", "Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "getTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "value", "getText", "()Ljava/lang/CharSequence;", "Landroid/text/method/MovementMethod;", "getMovementMethod", "()Landroid/text/method/MovementMethod;", "setMovementMethod", "(Landroid/text/method/MovementMethod;)V", "movementMethod", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ListTextComponent extends DividerAwareComponent {
    private final RobotoTextView textView;

    public ListTextComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, sph0.component_list_text_component, true);
        this.textView = (RobotoTextView) findViewById(ndh0.text);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.ListTextComponent, i, 0);
        try {
            initAttributes(obtainStyledAttributes);
            resolveThemeAttrs(attributeSet, obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void initAttributes(TypedArray attributes) {
        CharSequence text = attributes.getText(c4i0.ListTextComponent_component_text);
        if (text != null) {
            this.textView.setText(text);
        }
        setTextAlignment(attributes.getInteger(c4i0.ListTextComponent_component_text_gravity, 0));
        setTextSizePx(attributes.getDimensionPixelSize(c4i0.ListTextComponent_component_text_size, tje.r(mrg0.component_text_size_body, getContext())));
        this.textView.setTextTypeface(attributes.getInteger(c4i0.ListTextComponent_component_text_typeface, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemeAttrs$lambda$0(ListTextComponent listTextComponent, Integer num) {
        listTextComponent.textView.setTextColor(listTextComponent.getContext().getColor(num.intValue()));
    }

    private final void setBackgroundColorAttr(int colorAttr) {
        updateBackground(new dg4(new bdc(colorAttr)));
    }

    public final MovementMethod getMovementMethod() {
        return this.textView.getMovementMethod();
    }

    public final CharSequence getText() {
        return this.textView.getText();
    }

    public final RobotoTextView getTextView() {
        return this.textView;
    }

    public void resolveThemeAttrs(AttributeSet attrs, TypedArray attributes) {
        if (attrs == null) {
            setTextColorAttr(xng0.textMain);
            setBackgroundColorAttr(xng0.bgMain);
            return;
        }
        int i = c4i0.ListTextComponent_component_text_color;
        int i2 = xng0.textMain;
        final int i3 = 0;
        Consumer consumer = new Consumer(this) { // from class: oty
            public final /* synthetic */ ListTextComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i4 = i3;
                ListTextComponent listTextComponent = this.b;
                Integer num = (Integer) obj;
                switch (i4) {
                    case 0:
                        listTextComponent.setTextColorAttr(num.intValue());
                        break;
                    default:
                        ListTextComponent.resolveThemeAttrs$lambda$0(listTextComponent, num);
                        break;
                }
            }
        };
        final int i4 = 1;
        qje.S(attrs, attributes, "component_text_color", i, i2, consumer, new Consumer(this) { // from class: oty
            public final /* synthetic */ ListTextComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i4;
                ListTextComponent listTextComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        listTextComponent.setTextColorAttr(num.intValue());
                        break;
                    default:
                        ListTextComponent.resolveThemeAttrs$lambda$0(listTextComponent, num);
                        break;
                }
            }
        });
    }

    public final void setHtmlText(CharSequence text) {
        this.textView.setText(text);
        boolean d = qeb1.d(text);
        RobotoTextView robotoTextView = this.textView;
        if (d) {
            robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            robotoTextView.setMovementMethod(null);
        }
    }

    public final void setLinkTextColor(int color) {
        this.textView.setLinkTextColor(color);
    }

    public final void setMovementMethod(MovementMethod movementMethod) {
        this.textView.setMovementMethod(movementMethod);
    }

    public final void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    @Override // android.view.View
    public void setTextAlignment(int textAlignment) {
        RobotoTextView robotoTextView = this.textView;
        if (textAlignment == 0) {
            robotoTextView.setTextAlignment(5);
            robotoTextView.setGravity(8388611);
            return;
        }
        if (textAlignment == 1) {
            robotoTextView.setTextAlignment(4);
            robotoTextView.setGravity(1);
        } else if (textAlignment == 2) {
            robotoTextView.setTextAlignment(6);
            robotoTextView.setGravity(8388613);
        } else if (textAlignment != 3) {
            robotoTextView.setTextAlignment(5);
            robotoTextView.setGravity(8388611);
        } else {
            robotoTextView.setTextAlignment(2);
            robotoTextView.setGravity(8388611);
        }
    }

    public final void setTextColor(int color) {
        this.textView.setTextColor(color);
    }

    public final void setTextColorAttr(int colorAttr) {
        this.textView.setTextColor(new bdc(colorAttr));
    }

    public final void setTextLineSpacing(float add, float mult) {
        this.textView.setLineSpacing(add, mult);
    }

    public final void setTextPaddings(int start, int top, int end, int bottom) {
        xw31.J(this.textView, Integer.valueOf(start), Integer.valueOf(top), Integer.valueOf(end), Integer.valueOf(bottom));
    }

    public final void setTextSizePx(int sizePx) {
        this.textView.setTextSize(0, sizePx);
    }

    public final void setText(int resId) {
        this.textView.setText(resId);
    }

    public ListTextComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListTextComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListTextComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.listTextComponentStyle : i);
    }
}
