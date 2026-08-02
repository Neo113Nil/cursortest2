package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import ru.yandex.taxi.carplates.model.view.CarPlatesFormatterSpan;

/* loaded from: classes5.dex */
public final class t58 {
    public final Context a;
    public int b;
    public float c;
    public boolean d = true;
    public final int e = xng0.textMain;
    public final int f = xng0.bgMinor;

    public t58(Context context) {
        this.a = context;
        this.c = context.getResources().getDimensionPixelSize(mrg0.component_text_size_subtitle);
    }

    public final void a(bvc0 bvc0Var, SpannableStringBuilder spannableStringBuilder, boolean z) {
        String str = bvc0Var.b;
        if (str == null || evu0.J(str)) {
            return;
        }
        a78 a78Var = bvc0Var.c;
        boolean z2 = bvc0Var.a;
        int length = spannableStringBuilder.length();
        if (a78Var == null) {
            String b = t7s.b(str);
            Context context = this.a;
            a78Var = z68.a(z2 ? context.getColor(mqg0.component_amber_high) : qje.t(this.f, context), z2 ? context.getColor(mqg0.component_black) : qje.t(this.e, context), b);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = a78Var.c.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        spannableStringBuilder.append((CharSequence) sb);
        spannableStringBuilder.setSpan(new CarPlatesFormatterSpan(this.a, a78Var.a, a78Var.b, this.c, a78Var.c, this.b, this.d, z), length, spannableStringBuilder.length(), 33);
    }
}
