package defpackage;

import android.content.Context;
import java.util.Date;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class kvl extends bfu {
    public final cvl k;
    public final kxi l;
    public final ivl m;
    public final xdr n;

    public kvl(Context context, cvl cvlVar, kxi kxiVar, ivl ivlVar) {
        String b;
        cvlVar.getClass();
        this.k = cvlVar;
        this.l = kxiVar;
        this.m = ivlVar;
        opr oprVar = (opr) ivlVar.e.getValue();
        boolean g = ((z66) ivlVar.c.getValue()).g();
        boolean z = !g;
        oprVar.getClass();
        u4h u4hVar = cvlVar.u;
        int i = 1;
        if ((u4hVar != null ? u4hVar.a : null) != null && fxf.G(cvlVar)) {
            Date[] dateArr = {cvlVar.o, cvlVar.n, new Date(System.currentTimeMillis())};
            for (int i2 = 0; i2 < 3; i2++) {
                Date date = dateArr[i2];
                if (date != null) {
                    String a = rd7.a(context, date, new zzp(i), true);
                    a.getClass();
                    b = context.getString(R.string.playlist_refreshed_at, a);
                    b.getClass();
                }
            }
            throw null;
        }
        u4h u4hVar2 = cvlVar.u;
        if ((u4hVar2 != null ? u4hVar2.a : null) == null || fxf.G(cvlVar)) {
            u4h u4hVar3 = cvlVar.u;
            if ((u4hVar3 != null ? u4hVar3.a : null) != null || ivf.I(cvlVar)) {
                int i3 = !g ? cvlVar.i : cvlVar.g;
                l18 l18Var = l18.b;
                bdt I = hag.I(skr.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                b = ((skr) qdcVar.C(I)).b(R.plurals.plural_n_tracks_rtl_support, i3, Integer.valueOf(i3));
            } else {
                b = vq2.I(cvlVar, context, true, z);
            }
        } else {
            String C = vq2.C(cvlVar);
            if (C == null || C.length() == 0) {
                b = vq2.I(cvlVar, context, false, false);
            } else {
                b = context.getString(R.string.playlist_built_for_without_date, C);
                b.getClass();
            }
        }
        b.getClass();
        this.n = ydr.a(new gy7(cvlVar.b, b, cvlVar.q));
    }
}
