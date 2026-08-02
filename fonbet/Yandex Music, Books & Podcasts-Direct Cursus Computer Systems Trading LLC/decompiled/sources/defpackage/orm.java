package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class orm {
    public static final xxk a;
    public static final v7l b;
    public static final rnl c;

    static {
        qo6 qo6Var = qo6.a;
        jzb jzbVar = jzb.c;
        qxk qxkVar = qxk.b;
        xxk xxkVar = new xxk(null, "Track 1", "Artist 1", true, "", null, qo6Var, true, true, jzbVar, true, true, qxkVar, false, true, u75.h("", "", ""));
        a = xxkVar;
        xxk xxkVar2 = new xxk(null, "Track 2", "Artist gpp 2", true, "", null, qo6Var, true, true, jzbVar, true, true, qxkVar, false, true, null);
        xxk xxkVar3 = new xxk(null, "Track 3", "Artist 3", true, "", null, qo6Var, true, true, jzbVar, true, true, qxkVar, false, true, null);
        b = new v7l(0.8f, 2000L, 1600L, true);
        bdn bdnVar = new bdn("Now playing", "test", new q84(false, new d74(R.drawable.ic_station_2_24)), true, null);
        qan qanVar = new qan(xxkVar, xxkVar2, xxkVar3);
        j1g j1gVar = j1g.a;
        n1g n1gVar = new n1g(j1gVar, true, true);
        yi6 yi6Var = yi6.a;
        xi6 xi6Var = xi6.c;
        c = new rnl(bdnVar, qanVar, n1gVar, jj2.a, new zi6(yi6Var, xi6Var, xi6Var, true), new dtp(new usp(nyn.a), new xsp(false), new rsp(p5n.b), new atp(ppl.a), new osp(xgl.b), nsp.d), new zwr(null, u75.h(new ywr(2000L, "First line"), new ywr(4000L, "Second line and it's a long one"), new ywr(6000L, "Third line"), new ywr(8000L, "Forth line"), new ywr(10000L, "Fifth line")), 2));
        new xxk(null, "Stream", null, false, null, null, qo6.m, false, false, null, true, true, qxkVar, false, false, null);
        new n1g(j1gVar, true, true);
        c3x.U(d85.c);
    }
}
