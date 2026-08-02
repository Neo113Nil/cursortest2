package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class st9 {
    public final View a;
    public final xzb b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final jyr e = btf.b(new rt9(this, 2));
    public final jyr f = btf.b(new rt9(this, 1));
    public final jyr g = btf.b(new rt9(this, 0));

    public st9(d89 d89Var, xzb xzbVar) {
        this.a = d89Var;
        this.b = xzbVar;
    }

    public final void a(DivBackgroundSpan divBackgroundSpan, Canvas canvas, Spanned spanned, Layout layout) {
        int spanStart = spanned.getSpanStart(divBackgroundSpan);
        int spanEnd = spanned.getSpanEnd(divBackgroundSpan);
        if (spanStart < 0 || spanEnd < 0 || spanStart >= spanEnd) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(spanEnd);
        int primaryHorizontal = (int) layout.getPrimaryHorizontal(spanStart);
        int primaryHorizontal2 = (int) layout.getPrimaryHorizontal(spanEnd);
        if (divBackgroundSpan.b instanceof as9) {
            ((lq4) this.g.getValue()).a(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan);
        } else {
            (lineForOffset == lineForOffset2 ? (ut9) this.e.getValue() : (ut9) this.f.getValue()).a(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan);
        }
    }
}
