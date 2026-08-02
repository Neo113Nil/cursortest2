package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class r9w implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ faw b;

    public /* synthetic */ r9w(faw fawVar, int i) {
        this.a = i;
        this.b = fawVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 2;
        switch (this.a) {
            case 0:
                return new t5l(btf.b(new r9w(this.b, 12)), l18.b.b(hag.I(p5l.class), true));
            case 1:
                faw fawVar = this.b;
                String str = fawVar.m;
                if (str == null || str.length() == 0) {
                    fawVar.m = ((v3i) fawVar.i.getValue()).a();
                }
                return fawVar.m;
            case 2:
                faw fawVar2 = this.b;
                jyr b = btf.b(new r9w(fawVar2, 14));
                rtl rtlVar = (rtl) fawVar2.f.getValue();
                jyr b2 = l18.b.b(hag.I(i5h.class), true);
                rtlVar.getClass();
                lum lumVar = new lum();
                lumVar.a = rtlVar;
                lumVar.b = b;
                lumVar.c = b2;
                return new guu(lumVar);
            case 3:
                faw fawVar3 = this.b;
                return new d0l(l18.b.b(hag.I(odd.class), true), btf.b(new r9w(fawVar3, 9)), btf.b(new r9w(fawVar3, 10)));
            case 4:
                String string = this.b.a.getString(R.string.favorite_playlist_title);
                string.getClass();
                return string;
            case 5:
                faw fawVar4 = this.b;
                l18 l18Var = l18.b;
                return new k9w(l18Var.b(hag.I(wlw.class), true), btf.b(new r9w(fawVar4, 7)), l18Var.b(hag.I(f5v.class), true), l18Var.b(hag.I(sfn.class), true), l18Var.b(hag.I(zzp.class), true), l18Var.b(hag.I(b5d.class), true), l18Var.b(hag.I(q4d.class), true), btf.b(new r9w(fawVar4, 8)), l18Var.b(hag.I(q3t.class), true), l18Var.b(hag.I(qqs.class), true));
            case 6:
                return (String) ((d4i) this.b.j.getValue()).b.getValue();
            case 7:
                return (afw) this.b.g.getValue();
            case 8:
                eni eniVar = this.b.a().a().a.a;
                bdt I = hag.I(mzs.class);
                qdc qdcVar = eniVar.a;
                qdcVar.getClass();
                return (mzs) qdcVar.C(I);
            case 9:
                return (afw) this.b.g.getValue();
            case 10:
                return this.b.a().a().a();
            case 11:
                return (frt) this.b.c.getValue();
            case 12:
                return (frt) this.b.c.getValue();
            case 13:
                faw fawVar5 = this.b;
                f7l f7lVar = fawVar5.a().a().a().a;
                jyr b3 = l18.b.b(hag.I(d6m.class), true);
                jyr b4 = btf.b(new r9w(fawVar5, 11));
                eni eniVar2 = fawVar5.a().a().a.a;
                bdt I2 = hag.I(q7l.class);
                qdc qdcVar2 = eniVar2.a;
                qdcVar2.getClass();
                return new toh(f7lVar, b3, b4, (q7l) qdcVar2.C(I2));
            case 14:
                return (z66) this.b.k.getValue();
            case 15:
                faw fawVar6 = this.b;
                l18 l18Var2 = l18.b;
                bdt I3 = hag.I(dk4.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                dk4 dk4Var = (dk4) qdcVar3.C(I3);
                f7l f7lVar2 = fawVar6.a().a().a().a;
                eni eniVar3 = fawVar6.a().a().a.a;
                bdt I4 = hag.I(k1l.class);
                qdc qdcVar4 = eniVar3.a;
                qdcVar4.getClass();
                return new toh(dk4Var, f7lVar2, (k1l) qdcVar4.C(I4));
            case 16:
                return new i0l(i, this.b.a().a().a().a);
            case 17:
                faw fawVar7 = this.b;
                oq7 a = fawVar7.a().a().a();
                eni eniVar4 = fawVar7.a().a().a.a;
                bdt I5 = hag.I(k1l.class);
                qdc qdcVar5 = eniVar4.a;
                qdcVar5.getClass();
                return new pyp(a, (k1l) qdcVar5.C(I5), l18.b.b(hag.I(ms.class), true));
            case 18:
                faw fawVar8 = this.b;
                Context context = fawVar8.a;
                return new vhr(context, (frt) fawVar8.c.getValue(), new qe(context));
            case 19:
                if (((e6q) this.b.e.getValue()).f.c(hld.j()) instanceof fd4) {
                    ssg.a(2, e6q.g, "maybeUpdate() not updated", null);
                }
                return Unit.a;
            case 20:
                return (e6q) this.b.e.getValue();
            default:
                hag.x(this.b.a, R.string.tracks_skipped_unavailable, 0);
                return Unit.a;
        }
    }
}
