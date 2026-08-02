package defpackage;

import com.yandex.go.address.models.Address;
import defpackage.fmy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.linked_order.models.data.IconType;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;

/* loaded from: classes9.dex */
public final class uoy {
    public final ipy a;
    public final wnt b;
    public final xdf c;

    public uoy(ipy ipyVar, wnt wntVar, xdf xdfVar) {
        this.a = ipyVar;
        this.b = wntVar;
        this.c = xdfVar;
    }

    public final String a(fmy fmyVar, String str) {
        return this.c.a(new fef(fmyVar.getK().getB(), null, null, fmyVar.getK().getA()), str, false, false);
    }

    public final sly b(sny snyVar, r1e0 r1e0Var) {
        zzs zzsVar;
        zzs zzsVar2;
        IconType iconType;
        String str;
        String str2;
        String str3;
        String J1;
        String D1;
        String D12;
        umy umyVar = (umy) r1e0Var.a;
        Address address = (Address) a.R(umyVar.getE().getA());
        Address address2 = (Address) a.b0(umyVar.getE().getA());
        boolean a = umyVar.getD().getA();
        String a2 = a(umyVar.getB(), umyVar.getB().getB());
        String a3 = a(umyVar.getB(), umyVar.getB().getC());
        String a4 = a(umyVar.getB(), umyVar.getB().getJ().getA());
        String a5 = a(umyVar.getB(), umyVar.getB().getJ().getB());
        String a6 = a(umyVar.getB(), umyVar.getB().getI().getA());
        String a7 = a(umyVar.getB(), umyVar.getB().getI().getB());
        String a8 = a(umyVar.getB(), umyVar.getB().getD());
        String a9 = a(umyVar.getB(), umyVar.getB().getE());
        Long l = r1e0Var.b;
        long longValue = l != null ? l.longValue() : 5000L;
        bny.Companion.getClass();
        qn11 b = umyVar.b(bny.class);
        if (b == null) {
            b = bny.d;
        }
        bny bnyVar = (bny) b;
        long j = !bnyVar.b ? -1L : bnyVar.c;
        String a10 = umyVar.getB().getA();
        String f = umyVar.getB().getF();
        List h = umyVar.getB().getH();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h) {
            fmy.b bVar = (fmy.b) obj;
            if (bVar.getA().length() > 0 || bVar.getB().length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fmy.b bVar2 = (fmy.b) it.next();
            arrayList2.add(new eny(bVar2.getA(), bVar2.getB(), bVar2.getC()));
            umyVar = umyVar;
        }
        umy umyVar2 = umyVar;
        String a11 = umyVar2.getC().getD().getA();
        String str4 = (address == null || (D12 = address.D1()) == null) ? "" : D12;
        if (address == null || (zzsVar = address.B()) == null) {
            zzsVar = zzs.f;
        }
        zzs zzsVar3 = zzsVar;
        String str5 = (address2 == null || (D1 = address2.D1()) == null) ? "" : D1;
        if (address2 == null || (zzsVar2 = address2.B()) == null) {
            zzsVar2 = zzs.f;
        }
        zzs zzsVar4 = zzsVar2;
        int i = toy.a[umyVar2.getD().getE().ordinal()];
        if (i == 1) {
            iconType = IconType.B2C;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            iconType = IconType.C2C;
        }
        IconType iconType2 = iconType;
        String a12 = umyVar2.getC().getA();
        String b2 = umyVar2.getC().getB();
        String c = umyVar2.getC().getC();
        boolean c2 = umyVar2.getD().getC();
        boolean d = umyVar2.getD().getD();
        boolean b3 = umyVar2.getD().getB();
        LinkedOrderStatusDto a13 = umyVar2.getA();
        String e = a13 != null ? ((xnt) this.b).e(a13, LinkedOrderStatusDto.Companion.serializer()) : "";
        String f2 = umyVar2.getD().getF();
        LinkedOrderStatusDto a14 = umyVar2.getA();
        if (a14 == null) {
            a14 = LinkedOrderStatusDto.SEARCH;
        }
        LinkedOrderStatusDto linkedOrderStatusDto = a14;
        String l2 = umyVar2.getB().getL();
        String str6 = (address2 == null || (J1 = address2.J1()) == null) ? "" : J1;
        String m = a ? umyVar2.getB().getM() : "";
        String n = a ? umyVar2.getB().getN() : "";
        String o = a ? umyVar2.getB().getO() : "";
        if (address2 == null || (str = address2.e2()) == null) {
            str = "";
        }
        String str7 = a ? str : "";
        if (address2 == null || (str2 = address2.H1()) == null) {
            str2 = "";
        }
        String str8 = a ? str2 : "";
        if (address2 == null || (str3 = address2.e0()) == null) {
            str3 = "";
        }
        String str9 = a ? str3 : "";
        String g = umyVar2.getB().getG();
        String c3 = umyVar2.getB().getJ().getC();
        String c4 = umyVar2.getB().getI().getC();
        boolean p = umyVar2.getB().getP();
        pi11 f3 = umyVar2.getF();
        tly tlyVar = new tly(longValue, j, snyVar, a10, a2, a3, f, a11, arrayList2, str4, zzsVar3, str5, zzsVar4, iconType2, a12, b2, c, f2, e, linkedOrderStatusDto, c2, d, b3, l2, m, n, o, str6, str7, str8, str9, g, a8, a9, a4, a5, c3, a6, a7, c4, p, f3 != null ? new upy(f3.getA(), f3.getB()) : null, umyVar2.getB().getQ());
        LinkedOrderStatusDto a15 = umyVar2.getA();
        this.a.getClass();
        switch (a15 == null ? -1 : hpy.a[a15.ordinal()]) {
            case -1:
                jst.e.getClass();
                break;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return new nly(tlyVar);
            case 8:
            case 9:
            case 10:
            case 11:
                break;
        }
        return new ply(tlyVar);
    }
}
