package com.yandex.plus.bdui.plus.checkout.div;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.widget.TextView;
import com.yandex.plus.divkit.impl.n;
import com.yandex.plus.home.internal.di.y;
import defpackage.gc8;
import defpackage.gld;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.vct;
import defpackage.x3f;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y7k;
import defpackage.z7o;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c implements com.yandex.plus.divkit.api.d {
    public static final Set g = xz0.Y(new String[]{"http", "https"});
    public static final Set h = xz0.Y(new String[]{"plus-action", "plus-checkout"});
    public final com.yandex.plus.bdui.plus.content.controller.d a;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d b;
    public final y c;
    public final com.yandex.plus.log.api.b d;
    public final x3f e;
    public final tf6 f;

    public c(com.yandex.plus.bdui.plus.content.controller.d dVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar2, y yVar, com.yandex.plus.log.api.b bVar, x3f x3fVar) {
        dVar.getClass();
        dVar2.getClass();
        yVar.getClass();
        bVar.getClass();
        x3fVar.getClass();
        this.a = dVar;
        this.b = dVar2;
        this.c = yVar;
        this.d = bVar;
        this.e = x3fVar;
        this.f = gld.B();
    }

    public final TextView a(com.yandex.plus.divkit.api.c cVar, n nVar, gc8 gc8Var) {
        Object t7oVar;
        JSONObject jSONObject = cVar.b;
        if (jSONObject == null) {
            xq0.q("Expected custom_props for DecoratedText custom view");
            return null;
        }
        TextView textView = new TextView(gc8Var.getContext());
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Double.valueOf(jSONObject.getDouble("font_size"));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Double d = (Double) (t7oVar instanceof t7o ? null : t7oVar);
        Integer w = com.yandex.plus.bdui.flex.ui.a.w("line_height", jSONObject);
        Integer w2 = com.yandex.plus.bdui.flex.ui.a.w("max_lines", jSONObject);
        Integer num = (Integer) n.a(nVar, jSONObject, "text_color", new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, new com.yandex.plus.divkit.utils.c(nVar.a, (y7k) nVar.c.getValue(), "text_color"), com.yandex.plus.divkit.utils.c.class, "anyToColor", "anyToColor(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 7), vct.f, 16);
        int intValue = num != null ? num.intValue() : -16777216;
        if (d != null) {
            textView.setTextSize(2, (float) d.doubleValue());
        }
        if (w != null) {
            int intValue2 = w.intValue();
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                textView.setLineHeight(2, intValue2);
            } else if (i >= 28) {
                Context context = textView.getContext();
                context.getClass();
                Resources resources = context.getResources();
                resources.getClass();
                resources.getDisplayMetrics().getClass();
                textView.setLineHeight(intValue2);
            }
        }
        if (w2 != null) {
            textView.setMaxLines(w2.intValue());
        }
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setMovementMethod(new com.yandex.plus.home.common.ui.a());
        textView.setTextColor(intValue);
        return textView;
    }
}
