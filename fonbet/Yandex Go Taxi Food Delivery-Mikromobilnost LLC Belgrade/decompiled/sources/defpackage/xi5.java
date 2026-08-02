package defpackage;

import android.graphics.Paint;
import android.text.Layout;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.go.sdk_registry.wrappers.mob.b;

/* loaded from: classes10.dex */
public final class xi5 {
    public static final float a(Layout layout, int i, Paint paint) {
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = fry0.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText(EllipsizedTextView.DEFAULT_ELLIPSIS) + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : wqv.a[paragraphAlignment.ordinal()]) == 1) {
            return n.a(layout.getWidth(), measureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - measureText) + Math.abs(lineLeft);
    }

    public static final float b(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = fry0.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText(EllipsizedTextView.DEFAULT_ELLIPSIS) + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? wqv.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final snp0 c(lnp0 lnp0Var, b bVar) {
        return new snp0(new tnp0(lnp0Var, bVar, 0));
    }
}
