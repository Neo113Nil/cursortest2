package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class nb1 extends bfu {
    public final dn9 k;
    public final vdr l;
    public final fkn m;

    public nb1(dn9 dn9Var) {
        this.k = dn9Var;
        jyr jyrVar = (jyr) dn9Var.f;
        vdr vdrVar = (vdr) jyrVar.getValue();
        this.l = vdrVar;
        this.m = lg3.u0(new cz(vdrVar, this, 3), ot0.F(this), a((rd1) ((vdr) jyrVar.getValue()).getValue()));
        x97.y(ot0.F(this), null, null, new hl(this, null, 9), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lb1 a(rd1 rd1Var) {
        ra1 ra1Var;
        List list;
        String str;
        if (rd1Var instanceof pd1) {
            pd1 pd1Var = (pd1) rd1Var;
            return new jb1(pd1Var.a.b, pd1Var.b);
        }
        if (!(rd1Var instanceof qd1)) {
            b6e.s();
            return null;
        }
        n01 n01Var = (n01) ((qd1) rd1Var).a;
        String str2 = n01Var.a.b;
        String str3 = n01Var.d;
        ua1 ua1Var = null;
        if (str3 != null) {
            if (StringsKt.U(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                ra1Var = new ra1(str3);
                ta1 ta1Var = n01Var.f.isEmpty() ? ta1.a : null;
                List list2 = n01Var.b;
                sa1 sa1Var = list2 == null ? new sa1(list2) : null;
                fk1 fk1Var = n01Var.c;
                va1 va1Var = fk1Var == null ? new va1(new db1(fk1Var.a, fk1Var.b)) : null;
                list = n01Var.e;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List<m7g> list3 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    for (m7g m7gVar : list3) {
                        m7gVar.getClass();
                        String str4 = m7gVar.d;
                        if (str4 != null) {
                            WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                            webPath$Storage.getClass();
                            str = etn.B(str4, webPath$Storage).getPathForSize(frv.b());
                        } else {
                            str = null;
                        }
                        arrayList.add(new w7g(new a8g(m7gVar.a, m7gVar.b, str), new r7g(m7gVar.c)));
                    }
                    ua1Var = new ua1(arrayList);
                }
                return new kb1(str2, sa1Var, ta1Var, ra1Var, va1Var, ua1Var);
            }
        }
        ra1Var = null;
        if (n01Var.f.isEmpty()) {
        }
        List list22 = n01Var.b;
        if (list22 == null) {
        }
        fk1 fk1Var2 = n01Var.c;
        if (fk1Var2 == null) {
        }
        list = n01Var.e;
        if (list.isEmpty()) {
        }
        if (list != null) {
        }
        return new kb1(str2, sa1Var, ta1Var, ra1Var, va1Var, ua1Var);
    }
}
