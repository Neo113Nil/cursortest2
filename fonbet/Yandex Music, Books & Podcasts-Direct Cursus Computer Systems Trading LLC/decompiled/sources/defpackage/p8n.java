package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class p8n extends qon {
    public final xan d;
    public ybn e;
    public final ArrayList f;
    public boolean g;
    public boolean h;
    public final Paint i;
    public final String j;
    public final TextPaint k;
    public final float l;
    public final float m;
    public l8n n;
    public final s0f o;
    public final o8n p;

    public p8n(xan xanVar, Context context) {
        xanVar.getClass();
        context.getClass();
        this.d = xanVar;
        this.f = new ArrayList();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FF423C"));
        this.i = paint;
        String string = context.getString(R.string.delete_button);
        string.getClass();
        this.j = string;
        TextView textView = new TextView(context);
        textView.setTextAppearance(R.style.Medium_14_16);
        TextPaint paint2 = textView.getPaint();
        paint2.getClass();
        this.k = paint2;
        paint2.setColor(-1);
        this.l = paint2.measureText(string);
        this.m = paint2.getTextSize();
        this.o = new s0f(new n8n(this));
        this.p = new o8n(this);
    }

    public static final void u(p8n p8nVar, Canvas canvas, float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = p8nVar.m;
        if (f6 < f7) {
            return;
        }
        float f8 = p8nVar.l;
        canvas.drawText(p8nVar.j, f5 > 1.2f * f8 ? ((f5 - f8) / 2.0f) + f : (f8 * 0.2f) + f, f4 - ((f6 - f7) / 2.0f), p8nVar.k);
    }

    public static final void v(p8n p8nVar, int i, int i2) {
        p8nVar.getClass();
        ArrayList arrayList = p8nVar.f;
        int i3 = new IntRange(0, u75.g(arrayList), 1).b;
        if (i > i3 || i < 0 || i2 > i3 || i2 < 0) {
            dfi.r(f1d.e(i, i2, "Invalid move position: from ", " to "), "QueueAdapter");
        } else {
            arrayList.add(i2, (mwk) arrayList.remove(i));
            p8nVar.a.c(i, i2);
        }
    }

    public static final void w(p8n p8nVar, int i) {
        dyk dykVar;
        j4l j4lVar = p8nVar.d.a;
        g4q g4qVar = (g4q) j4lVar.k.b.c.getValue();
        if (g4qVar != null && (dykVar = (dyk) zdg.p(g4qVar, new iwn(i))) != null) {
            j4lVar.l.a(dykVar, new b3t("queue_remove"));
        }
        p8nVar.f.remove(i);
        p8nVar.a.f(i, 1);
    }

    @Override // defpackage.qon
    public final int c() {
        return this.f.size();
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        l8n l8nVar = (l8n) opnVar;
        mqs a = ((mwk) this.f.get(i)).a();
        if (a != null) {
            l8nVar.u.setContent(new wn5(new gvl(l8nVar, a, l8nVar.w, new m8n(l8nVar, this), 16), -230010899, true));
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        context.getClass();
        return new l8n(this, new ComposeView(context, null, 0, 6, null));
    }
}
