package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class jbj {
    public static final jbj a = new jbj();

    public static kbj a(oq oqVar, boolean z) {
        w3g w3gVar;
        String str;
        String str2;
        oqVar.getClass();
        CoverPath coverPath = oqVar.o;
        int i = oqVar.q;
        String w = vz1.w(coverPath);
        l18 l18Var = l18.b;
        bdt I = hag.I(k8w.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean a2 = ((m8w) ((k8w) qdcVar.C(I))).a(oqVar);
        if (u2x.H(oqVar)) {
            oq oqVar2 = !a2 ? oqVar : null;
            if (oqVar2 != null) {
                str2 = etn.x(oqVar2);
                String o0 = etn.o0(oqVar2);
                if (!StringsKt.U(str2)) {
                    if (!StringsKt.U(o0)) {
                        str2 = ouj.o(str2, " · ", o0);
                    }
                    str = str2;
                    w3gVar = null;
                }
            }
            str2 = null;
            str = str2;
            w3gVar = null;
        } else {
            w3g w3gVar2 = new w3g(tt0.C(i), dag.A(i, z), z);
            if (i <= 0) {
                w3gVar2 = null;
            }
            w3gVar = w3gVar2;
            str = null;
        }
        return new kbj(w, oqVar.b, str, w3gVar, z, oqVar.i(), oqVar.g.b(), a2);
    }

    public static kbj c(lt ltVar, List list, Integer num, Boolean bool) {
        ArrayList arrayList;
        l18 l18Var = l18.b;
        bdt I = hag.I(u3g.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean l = ((t3g) ((u3g) qdcVar.C(I))).l(ltVar.a);
        ltVar.getClass();
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((u51) it.next()).b);
            }
        } else {
            arrayList = null;
        }
        return d(ltVar, arrayList, num, bool, l);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kbj d(lt ltVar, List list, Integer num, Boolean bool, boolean z) {
        String str;
        boolean z2;
        String str2;
        w3g w3gVar;
        ltVar.getClass();
        u9b u9bVar = ltVar.e;
        if (u9bVar == null || (str = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) == null) {
            str = "";
        }
        String str3 = str;
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            l18 l18Var = l18.b;
            bdt I = hag.I(k8w.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (!v3g.E(((m8w) ((k8w) qdcVar.C(I))).a).i.contains("bookmate")) {
                z2 = true;
                boolean z3 = z2;
                if (!lxe.w(ltVar)) {
                    if (z3) {
                        list = null;
                    }
                    str2 = list != null ? CollectionsKt.X(list, ", ", null, null, new m2j(16), 30) : null;
                    w3gVar = null;
                } else if (num != null) {
                    int intValue = num.intValue();
                    w3g w3gVar2 = new w3g(tt0.C(intValue), dag.A(intValue, z), z);
                    if (num.intValue() <= 0) {
                        w3gVar2 = null;
                    }
                    w3gVar = w3gVar2;
                    str2 = null;
                } else {
                    str2 = null;
                    w3gVar = null;
                }
                return new kbj(str3, ltVar.c, str2, w3gVar, z, ltVar.g, ltVar.d.b(), z3);
            }
        }
        z2 = false;
        boolean z32 = z2;
        if (!lxe.w(ltVar)) {
        }
        return new kbj(str3, ltVar.c, str2, w3gVar, z, ltVar.g, ltVar.d.b(), z32);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kbj e(oq oqVar, boolean z) {
        String str;
        oqVar.getClass();
        CoverPath coverPath = oqVar.o;
        int i = oqVar.q;
        String w = vz1.w(coverPath);
        l18 l18Var = l18.b;
        bdt I = hag.I(k8w.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean a2 = ((m8w) ((k8w) qdcVar.C(I))).a(oqVar);
        String str2 = oqVar.b;
        if (!a2) {
            String o0 = etn.o0(oqVar);
            if (!StringsKt.U(o0)) {
                str = o0;
                return new kbj(w, str2, str, i <= 0 ? new w3g(tt0.C(i), dag.A(i, z), z) : null, z, oqVar.i(), oqVar.g.b(), a2);
            }
        }
        str = null;
        return new kbj(w, str2, str, i <= 0 ? new w3g(tt0.C(i), dag.A(i, z), z) : null, z, oqVar.i(), oqVar.g.b(), a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(lt ltVar, List list, String str, cg6 cg6Var) {
        ibj ibjVar;
        int i;
        String str2;
        String sb;
        String str3;
        String str4;
        if (cg6Var instanceof ibj) {
            ibjVar = (ibj) cg6Var;
            int i2 = ibjVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ibjVar.p = i2 - Integer.MIN_VALUE;
                Object obj = ibjVar.n;
                nm6 nm6Var = nm6.a;
                i = ibjVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    u9b u9bVar = ltVar.e;
                    if (u9bVar == null || (str2 = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) == null) {
                        str2 = "";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(list != null ? CollectionsKt.X(list, ", ", null, null, new m2j(17), 30) : null);
                    if (str != null && str.length() != 0) {
                        sb2.append(" · ".concat(str));
                    }
                    sb = sb2.toString();
                    String str5 = ltVar.c;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(u3g.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    u3g u3gVar = (u3g) qdcVar.C(I);
                    String str6 = ltVar.a;
                    ibjVar.j = ltVar;
                    ibjVar.k = str2;
                    ibjVar.l = sb;
                    ibjVar.m = str5;
                    ibjVar.p = 1;
                    Object k = ((t3g) u3gVar).k(str6, ibjVar);
                    if (k == nm6Var) {
                        return nm6Var;
                    }
                    str3 = str5;
                    str4 = str2;
                    obj = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str7 = ibjVar.m;
                    sb = ibjVar.l;
                    String str8 = ibjVar.k;
                    lt ltVar2 = ibjVar.j;
                    qgg.h0(obj);
                    str3 = str7;
                    str4 = str8;
                    ltVar = ltVar2;
                }
                return new kbj(str4, str3, sb, null, ((Boolean) obj).booleanValue(), ltVar.g, ltVar.d.b(), false);
            }
        }
        ibjVar = new ibj(this, cg6Var);
        Object obj2 = ibjVar.n;
        nm6 nm6Var2 = nm6.a;
        i = ibjVar.p;
        if (i != 0) {
        }
        return new kbj(str4, str3, sb, null, ((Boolean) obj2).booleanValue(), ltVar.g, ltVar.d.b(), false);
    }
}
