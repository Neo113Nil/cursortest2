package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes6.dex */
public final class iqm extends s13 {
    public final TextView A;
    public final x9e B;
    public final t3g C;
    public final int w;
    public final ImageView x;
    public final TextView y;
    public final TextView z;

    public iqm(ViewGroup viewGroup, int i) {
        super(viewGroup, R.layout.half_screen_presentable_item_layout);
        this.C = (t3g) sk3.I(t3g.class);
        View view = this.a;
        this.x = (ImageView) view.findViewById(R.id.cover);
        this.y = (TextView) view.findViewById(R.id.title);
        this.z = (TextView) view.findViewById(R.id.subtitle);
        this.A = (TextView) view.findViewById(R.id.info);
        this.B = (x9e) view.findViewById(R.id.explicit_mark);
        this.w = i;
    }

    @Override // defpackage.s13
    public final void e(Object obj) {
        hqm hqmVar = (hqm) obj;
        super.e(hqmVar);
        ImageView imageView = this.x;
        imageView.setBackgroundResource(0);
        co6 b = hqmVar.a.b();
        jyr jyrVar = sht.a;
        i4w.O(imageView, b, frv.b() / 2);
        int i = hqmVar.d;
        TextView textView = this.y;
        textView.setMaxLines(i);
        fqm fqmVar = hqmVar.a;
        sht.d(textView, fqmVar.e());
        nu1 nu1Var = hqmVar.b;
        boolean z = nu1Var instanceof oq;
        TextView textView2 = this.z;
        t3g t3gVar = this.C;
        Context context = this.u;
        if (z) {
            oq oqVar = (oq) nu1Var;
            lq j = oqVar.j();
            int i2 = oqVar.q;
            if ((j == lq.b || oqVar.d() == Album$AlbumType.PODCAST) && i2 >= 0) {
                boolean l = t3gVar.l(oqVar.a);
                vq2.J(textView2, context, l);
                sht.d(textView2, y3g.a(i2 + (l ? 1 : 0)));
                if (l) {
                    i2++;
                }
                textView2.setContentDescription(dag.A(i2, false));
            } else {
                textView2.setCompoundDrawables(null, null, null, null);
                sht.d(textView2, fqmVar.d());
            }
        } else if (nu1Var instanceof cvl) {
            cvl cvlVar = (cvl) nu1Var;
            int i3 = cvlVar.h;
            if (i3 >= 0) {
                boolean p = t3gVar.p(cvlVar.g());
                vq2.J(textView2, context, p);
                sht.d(textView2, y3g.a(i3 + (p ? 1 : 0)));
            } else {
                textView2.setCompoundDrawables(null, null, null, null);
                sht.d(textView2, fqmVar.d());
            }
        } else {
            textView2.setCompoundDrawables(null, null, null, null);
            sht.d(textView2, fqmVar.d());
        }
        sht.d(this.A, fqmVar.a(context, this.w));
        jzb c = fqmVar.c();
        x9e x9eVar = this.B;
        if (c != null) {
            x9eVar.c(c);
        }
        boolean z2 = c != null;
        if (x9eVar != null) {
            x9eVar.setVisibility(z2 ? 0 : 8);
        }
        bow.D(this.a);
    }
}
