package defpackage;

import androidx.fragment.app.y;
import com.appsflyer.internal.k;
import java.util.LinkedHashMap;
import kotlin.Pair;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class jkf {
    public final ylf a;
    public final kxi b;
    public final mg5 c;
    public final v5v d;
    public final qdc e;
    public final mka f;
    public final fkn g;
    public final fkn h;
    public int i;
    public final bff j;

    public jkf(ylf ylfVar, kxi kxiVar, mg5 mg5Var, v5v v5vVar, qdc qdcVar, mka mkaVar, bff bffVar) {
        mkaVar.getClass();
        this.a = ylfVar;
        this.b = kxiVar;
        this.c = mg5Var;
        this.d = v5vVar;
        this.e = qdcVar;
        this.f = mkaVar;
        this.g = ylfVar.p;
        this.h = ylfVar.o;
        this.j = bffVar;
    }

    public final void a() {
        String t = weo.t();
        t.getClass();
        qdc qdcVar = this.e;
        nmb nmbVar = (nmb) ((jyr) qdcVar.b).getValue();
        String G = ((kxi) qdcVar.c).a.G();
        wjb wjbVar = wjb.MainScreen;
        String h = StationId.f("user:onyourwave").h();
        pkb pkbVar = pkb.Audiobook;
        nmb.z(nmbVar, G, wjbVar, null, null, null, null, 0, false, "my_wave", "my_wave", 0, "wave", h, 0, t, 52476);
        w5l w5lVar = new w5l(new cvo(wjbVar, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60), new jab(qkb.MyWave, 1, 2, 0), new thj(pkb.Wave, new s9p(t75.c(r9p.a)).toString(), 1, 1, ""), null);
        mg5 mg5Var = this.c;
        x97.y(mg5Var.d, null, null, new rc4(mg5Var, this.b, w5lVar, null, 14), 3);
    }

    public final void b() {
        boolean z = this.d.a;
        fkn fknVar = this.g;
        if (z) {
            Object value = fknVar.a.getValue();
            mlf mlfVar = value instanceof mlf ? (mlf) value : null;
            if (mlfVar != null && mlfVar.a.a.a) {
                return;
            }
        } else {
            Object value2 = fknVar.a.getValue();
            nlf nlfVar = value2 instanceof nlf ? (nlf) value2 : null;
            if (nlfVar != null && nlfVar.a.a.a) {
                return;
            }
        }
        ((tjf) this.f.a).e();
    }

    public final void c() {
        int i = this.i;
        qdc qdcVar = this.e;
        nmb nmbVar = (nmb) ((jyr) qdcVar.b).getValue();
        String G = ((kxi) qdcVar.c).a.G();
        nmbVar.getClass();
        G.getClass();
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "main");
        m.put("hash", G);
        m.put("entity_id", "N/A");
        eta.m(0, "entity_name", "MyWave", "entity_pos", m);
        k.u(i, "entity_height", "entity_type", "my_wave", m);
        m.put("from", "main_screen");
        dfi.p(1, "to", "my_wawe_settings_window", "_meta", m);
        nmbVar.C("Home.MyWave.Selected", m);
        yfx yfxVar = ((tjf) this.f.a).c;
        if (yfxVar != null) {
            x1e x1eVar = ((u1e) yfxVar.b).a;
            x1eVar.getClass();
            tkf tkfVar = new tkf();
            tkfVar.setArguments(cxb.K(new Pair("force_dark_theme", Boolean.FALSE)));
            y yVar = x1eVar.d;
            yVar.getClass();
            x7f.B(tkfVar, yVar, "NewRupSettingsDialog");
        }
    }
}
