package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.mrg0;
import defpackage.mry;
import defpackage.tje;
import defpackage.xby;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/design/ListGroupHeaderComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "image", "", "componentsDivider", "Lzy11;", "setTitleEndDrawable", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "(Landroid/graphics/Bitmap;)V", "setTitleStartDrawable", "invalidateComponent", "()V", "Companion", "mry", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ListGroupHeaderComponent extends ListItemComponent {
    public static final mry Companion = new mry();
    private static final String DOUBLE_SPACE_IMAGE_SPAN = "  ";
    private static final float NO_TEXT_MIN_HEIGHT = 12.0f;
    private static final float TEXT_MIN_HEIGHT = 24.0f;

    public ListGroupHeaderComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTitleTypeface(3);
        setBackgroundResource(dzg0.bg_group_header);
        setTitleTextColor(new bdc(xng0.textMinor));
        setAccessibilityHeading(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.ListGroupHeaderComponent, i, 0);
        try {
            setTitle(obtainStyledAttributes.getText(c4i0.ListGroupHeaderComponent_component_list_group_title));
            obtainStyledAttributes.recycle();
            invalidateComponent();
            title().setFocusable(true);
            title().setAccessibilityHeading(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public void invalidateComponent() {
        super.invalidateComponent();
        CharSequence text = title().getText();
        if (text == null || evu0.J(text)) {
            setMinimumHeight((int) tje.x(getContext(), NO_TEXT_MIN_HEIGHT));
            setTitleTextSizePx(0);
        } else {
            setMinimumHeight((int) tje.x(getContext(), TEXT_MIN_HEIGHT));
            setTitleTextSizePx(tje.r(mrg0.component_text_size_caption, getContext()));
        }
    }

    public final void setTitleEndDrawable(Bitmap image, String componentsDivider) {
        if (componentsDivider.length() == 0) {
            xby.d.w(new IllegalArgumentException("Divider size must be > 0 otherwise it will cut the text"));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(title().getText());
        spannableStringBuilder.append((CharSequence) componentsDivider);
        spannableStringBuilder.setSpan(new ImageSpan(getContext(), image), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        title().setText(spannableStringBuilder);
    }

    public final void setTitleStartDrawable(Bitmap image) {
        title().setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(getResources(), image), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void setTitleEndDrawable(Bitmap image) {
        setTitleEndDrawable(image, DOUBLE_SPACE_IMAGE_SPAN);
    }

    public ListGroupHeaderComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListGroupHeaderComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListGroupHeaderComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.listGroupHeaderComponentStyle : i);
    }
}
