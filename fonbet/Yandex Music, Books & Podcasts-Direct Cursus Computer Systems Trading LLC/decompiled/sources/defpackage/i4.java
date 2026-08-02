package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4(int i, String str) {
        this.a = 8;
        this.b = i;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                men.a((b4) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((x21) this.c).b(rvf.R(this.b | 1), (hq5) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((z51) this.c).b(rvf.R(this.b | 1), (hq5) obj);
                break;
            case 3:
                ((Integer) obj2).intValue();
                on1.d((vm1) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((od5) this.c).b(rvf.R(this.b | 1), (hq5) obj);
                break;
            case 5:
                ((Integer) obj2).getClass();
                qwp.n((ct5) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                pd.j((List) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                lg3.w((pud) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 8:
                String str = (String) this.c;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                gae.b(a0g.E(this.b, 0, hq5Var), str, null, c3x.H(hq5Var), hq5Var, 0, 4);
            case 9:
                ((Integer) obj2).getClass();
                n7w.n((eha) this.c, this.b, (hq5) obj, rvf.R(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                hva.a((zwa) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                sj2.g((sub) this.c, vci.a, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((bgf) this.c).b(rvf.R(this.b | 1), (hq5) obj);
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((a2j) this.c).b(rvf.R(this.b | 1), (hq5) obj);
                break;
            case 14:
                ((Integer) obj2).getClass();
                p1g.d((l9j) this.c, this.b, (hq5) obj, rvf.R(49));
                break;
            case 15:
                ((Integer) obj2).getClass();
                lsq.d((mdj) this.c, this.b, (hq5) obj, rvf.R(49));
                break;
            case 16:
                ((Integer) obj2).intValue();
                szf.i((o3k) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 17:
                orj orjVar = (orj) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                orjVar.getClass();
                str2.getClass();
                brj brjVar = orjVar.b;
                int i = this.b;
                if (booleanValue) {
                    brjVar.getClass();
                    nmb nmbVar = (nmb) brjVar.c.getValue();
                    String G = brjVar.b.G();
                    cvo cvoVar = brjVar.a;
                    wjb wjbVar = cvoVar.a;
                    avo avoVar = cvoVar.e;
                    ilb ilbVar = cvoVar.g;
                    glb glbVar = cvoVar.c;
                    String str3 = avoVar.b;
                    pkb pkbVar = avoVar.a;
                    String a = brj.a(i);
                    nmbVar.q(G, wjbVar, ilbVar, glbVar, "", pkbVar, str3, avoVar.a, avoVar.b, (r44 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? 0 : 1, (r44 & 1024) != 0 ? 0 : 1, "", 0, false, brj.a(i), a, 1, 1, 0, "", "", "", 0, str2, "", "");
                } else {
                    brjVar.getClass();
                    nmb nmbVar2 = (nmb) brjVar.c.getValue();
                    String G2 = brjVar.b.G();
                    cvo cvoVar2 = brjVar.a;
                    wjb wjbVar2 = cvoVar2.a;
                    avo avoVar2 = cvoVar2.e;
                    ilb ilbVar2 = cvoVar2.g;
                    glb glbVar2 = cvoVar2.c;
                    String str4 = avoVar2.b;
                    pkb pkbVar2 = avoVar2.a;
                    String a2 = brj.a(i);
                    nmbVar2.k(G2, wjbVar2, ilbVar2, glbVar2, "", pkbVar2, str4, avoVar2.a, avoVar2.b, (r44 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? 0 : 1, (r44 & 1024) != 0 ? 0 : 1, "", 0, false, brj.a(i), a2, 1, 1, 0, "", "", "", 0, str2, "", "");
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                g0g.o((g06) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((kkq) this.c).b(rvf.R(this.b | 1), (hq5) obj);
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((fyq) this.c).b(rvf.R(this.b | 1), (hq5) obj);
                break;
            case 21:
                ArrayList arrayList = (ArrayList) this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    Function2 function2 = (Function2) CollectionsKt.S(arrayList, this.b);
                    if (function2 == null) {
                        oq5Var2.Z(1387641218);
                    } else {
                        oq5Var2.Z(-925068705);
                        function2.invoke(oq5Var2, 0);
                    }
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((dpr) this.c).b(rvf.R(this.b | 1), (hq5) obj);
                break;
            case 23:
                ((Integer) obj2).intValue();
                nnu.a((uoi) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((fvu) this.c).b(rvf.R(this.b | 1), (hq5) obj);
                break;
            case 25:
                ((Integer) obj2).intValue();
                hdg.D((e0w) this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((lyv) this.c).a(rvf.R(this.b | 1), (hq5) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i4(zwa zwaVar, int i) {
        this.a = 10;
        this.c = zwaVar;
        this.b = i;
    }

    public /* synthetic */ i4(sub subVar, int i) {
        this.a = 11;
        this.c = subVar;
        this.b = i;
    }

    public /* synthetic */ i4(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ i4(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = i;
    }
}
