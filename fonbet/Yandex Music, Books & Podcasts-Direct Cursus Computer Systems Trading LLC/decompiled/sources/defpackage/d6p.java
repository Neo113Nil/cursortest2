package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d6p implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d6p(zrj zrjVar, lvf lvfVar, Function1 function1, g6p g6pVar, tmb tmbVar, boolean z) {
        this.c = zrjVar;
        this.d = lvfVar;
        this.e = function1;
        this.f = g6pVar;
        this.g = tmbVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                zrj zrjVar = (zrj) this.c;
                lvf lvfVar = (lvf) this.d;
                Function1 function1 = (Function1) this.e;
                g6p g6pVar = (g6p) this.f;
                tmb tmbVar = (tmb) this.g;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                if (zrjVar != null) {
                    vuf.Y(vufVar, null, new wn5(new f6p(0, zrjVar, function1), 866387816, true), 3);
                }
                vufVar.Z(lvfVar.d(), new kti(lvfVar, 2), new u8b(8, lvfVar), new wn5(new jv(17, lvfVar, g6pVar), 544113878, true));
                vuf.Y(vufVar, null, new wn5(new pu(g6pVar, tmbVar, lvfVar, this.b, 7), 1977921485, true), 3);
                vuf.Y(vufVar, null, weo.e, 3);
                break;
            default:
                c3r c3rVar = (c3r) this.c;
                nru nruVar = (nru) this.d;
                gsu gsuVar = (gsu) this.e;
                String str = (String) this.f;
                sai saiVar = (sai) this.g;
                ((obf) obj).getClass();
                if (this.b) {
                    if (c3rVar != null) {
                        ((nw7) c3rVar).a();
                    }
                    nruVar.g(gsuVar, str);
                    saiVar.a();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ d6p(boolean z, c3r c3rVar, nru nruVar, gsu gsuVar, String str, sai saiVar) {
        this.b = z;
        this.c = c3rVar;
        this.d = nruVar;
        this.e = gsuVar;
        this.f = str;
        this.g = saiVar;
    }
}
