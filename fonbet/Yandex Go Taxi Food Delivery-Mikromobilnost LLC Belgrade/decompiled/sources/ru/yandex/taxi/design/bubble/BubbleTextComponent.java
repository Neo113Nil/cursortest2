package ru.yandex.taxi.design.bubble;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.cdc;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.qje;
import defpackage.rm6;
import defpackage.sls;
import defpackage.sph0;
import defpackage.tf;
import defpackage.tje;
import defpackage.xng0;
import defpackage.yn6;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\t\u0018\u0000 ?2\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\b\b\u0001\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u001f¢\u0006\u0004\b(\u0010\"R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00102\u001a\b\u0012\u0004\u0012\u00020\n018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010>\u001a\u0002082\u0006\u00109\u001a\u0002088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lru/yandex/taxi/design/bubble/BubbleTextComponent;", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "attributes", "resolveBubbleTextAttr", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "applyBubbleAttrs", "useBgMainStyle", "()V", "Lkdc;", "color", "setTextColor", "(Lkdc;)V", "", "size", "setTextSize", "(F)V", "gravity", "setTextGravity", "(I)V", "", "show", "showCloseIcon", "(Z)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "important", "textImportantForAccessibility", "Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "closeView", "Landroidx/appcompat/widget/AppCompatImageView;", "defaultMargin", CA20Status.STATUS_USER_I, "Lkotlin/Function0;", "manualCloseListener", "Lsls;", "getManualCloseListener", "()Lsls;", "setManualCloseListener", "(Lsls;)V", "", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "Companion", "yn6", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BubbleTextComponent extends BubbleComponent {
    private static final String TEXT_COLOR_ATTR = "component_text_color";
    private final AppCompatImageView closeView;
    private final int defaultMargin;
    private sls manualCloseListener;
    private final RobotoTextView textView;
    public static final yn6 Companion = new yn6();
    private static final int TEXT_COLOR_STYLE = c4i0.BubbleTextComponent_bubble_component_text_color;

    public BubbleTextComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, sph0.component_bubble_text, this);
        this.textView = (RobotoTextView) findViewById(ndh0.bubble_text);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(ndh0.bubble_close);
        this.closeView = appCompatImageView;
        this.defaultMargin = tje.r(mrg0.bubble_text_component_space, context);
        this.manualCloseListener = new rm6(5);
        appCompatImageView.setOnClickListener(new tf(25, this));
        applyAttrs(context, attributeSet);
        applyBubbleAttrs(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(BubbleTextComponent bubbleTextComponent, View view) {
        BubbleComponent.hide$default(bubbleTextComponent, false, 1, null);
        bubbleTextComponent.manualCloseListener.invoke();
    }

    private final void applyAttrs(Context context, AttributeSet attrs) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, c4i0.BubbleTextComponent, 0, 0);
        try {
            int i = c4i0.BubbleTextComponent_bubble_component_text;
            if (obtainStyledAttributes.hasValue(i)) {
                setText(obtainStyledAttributes.getText(i));
            }
            resolveBubbleTextAttr(attrs, obtainStyledAttributes);
            showCloseIcon(obtainStyledAttributes.getBoolean(c4i0.BubbleTextComponent_show_close, true));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void applyBubbleAttrs(Context context, AttributeSet attrs) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, c4i0.BubbleComponent, 0, 0);
        try {
            if (obtainStyledAttributes.getBoolean(c4i0.BubbleComponent_use_bg_main, false)) {
                useBgMainStyle();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void resolveBubbleTextAttr(AttributeSet attrs, TypedArray attributes) {
        if (attrs == null) {
            return;
        }
        int i = TEXT_COLOR_STYLE;
        int i2 = xng0.textInvert;
        final int i3 = 0;
        Consumer consumer = new Consumer(this) { // from class: xn6
            public final /* synthetic */ BubbleTextComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i4 = i3;
                BubbleTextComponent bubbleTextComponent = this.b;
                Integer num = (Integer) obj;
                switch (i4) {
                    case 0:
                        BubbleTextComponent.resolveBubbleTextAttr$lambda$0(bubbleTextComponent, num);
                        break;
                    default:
                        BubbleTextComponent.resolveBubbleTextAttr$lambda$1(bubbleTextComponent, num);
                        break;
                }
            }
        };
        final int i4 = 1;
        qje.S(attrs, attributes, TEXT_COLOR_ATTR, i, i2, consumer, new Consumer(this) { // from class: xn6
            public final /* synthetic */ BubbleTextComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i4;
                BubbleTextComponent bubbleTextComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        BubbleTextComponent.resolveBubbleTextAttr$lambda$0(bubbleTextComponent, num);
                        break;
                    default:
                        BubbleTextComponent.resolveBubbleTextAttr$lambda$1(bubbleTextComponent, num);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveBubbleTextAttr$lambda$0(BubbleTextComponent bubbleTextComponent, Integer num) {
        bubbleTextComponent.setTextColor(new bdc(num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveBubbleTextAttr$lambda$1(BubbleTextComponent bubbleTextComponent, Integer num) {
        bubbleTextComponent.setTextColor(new cdc(num.intValue()));
    }

    @Override // ru.yandex.taxi.design.bubble.BubbleComponent, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.textView.applyTheme(themeType);
    }

    public final sls getManualCloseListener() {
        return this.manualCloseListener;
    }

    public final CharSequence getText() {
        return this.textView.getText();
    }

    public final void setManualCloseListener(sls slsVar) {
        this.manualCloseListener = slsVar;
    }

    public final void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
        if (charSequence.length() == 0) {
            hide(false);
        }
    }

    public final void setTextColor(kdc color) {
        this.textView.setTextColor(color);
    }

    public final void setTextGravity(int gravity) {
        this.textView.setGravity(gravity);
    }

    public final void setTextSize(float size) {
        this.textView.setTextSize(0, size);
    }

    public final void showCloseIcon(boolean show) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.textView.getLayoutParams();
        int i = this.defaultMargin;
        layoutParams.setMargins(i, i, i, i);
        if (show) {
            layoutParams.setMarginEnd(0);
        } else {
            layoutParams.setMarginEnd(this.defaultMargin);
        }
        this.textView.setLayoutParams(layoutParams);
        this.closeView.setVisibility(show ? 0 : 8);
    }

    public final void textImportantForAccessibility(boolean important) {
        c.y(this.textView, important);
    }

    public final void useBgMainStyle() {
        setTextColor(new bdc(xng0.textMain));
        this.closeView.setImageTintList(ColorStateList.valueOf(qje.t(xng0.textMain, getContext())));
        getDecorator().b(new bdc(xng0.bgMain));
    }

    public BubbleTextComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BubbleTextComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BubbleTextComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
