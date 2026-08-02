package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class igo extends s13 {
    public final TextView A;
    public final int w;
    public final ImageView x;
    public final TextView y;
    public final TextView z;

    public igo(ViewGroup viewGroup, int i) {
        super(viewGroup, R.layout.half_screen_round_presentable_item_layout);
        View view = this.a;
        this.x = (ImageView) view.findViewById(R.id.cover);
        this.y = (TextView) view.findViewById(R.id.title);
        this.z = (TextView) view.findViewById(R.id.subtitle);
        this.A = (TextView) view.findViewById(R.id.info);
        this.w = i;
        this.a.setAccessibilityDelegate(new hgo());
    }

    @Override // defpackage.s13
    public final void e(Object obj) {
        hqm hqmVar = (hqm) obj;
        super.e(hqmVar);
        co6 b = hqmVar.a.b();
        jyr jyrVar = sht.a;
        i4w.O(this.x, b, frv.b() / 2);
        int i = hqmVar.d;
        TextView textView = this.y;
        textView.setMaxLines(i);
        fqm fqmVar = hqmVar.a;
        sht.d(textView, fqmVar.e());
        sht.d(this.z, fqmVar.d());
        sht.d(this.A, fqmVar.a(this.u, this.w));
        this.a.setContentDescription(((Object) fqmVar.e()) + fqmVar.d().toString());
    }
}
