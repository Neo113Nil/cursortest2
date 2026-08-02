package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class eem extends s4k {
    public final wdm b;
    public final kem c;
    public final lem d;
    public final String e;
    public final boolean f;
    public final s8i g;
    public final cfm h;
    public final cfm i;
    public final int j;
    public volatile pp2 k;

    public eem(wdm wdmVar, kem kemVar, lem lemVar, String str, boolean z, s8i s8iVar, cfm cfmVar, cfm cfmVar2) {
        kemVar.getClass();
        lemVar.getClass();
        str.getClass();
        this.b = wdmVar;
        this.c = kemVar;
        this.d = lemVar;
        this.e = str;
        this.f = z;
        this.g = s8iVar;
        this.h = cfmVar;
        this.i = cfmVar2;
        this.j = 20;
    }

    @Override // defpackage.s4k
    public final Object c(t4k t4kVar) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02a8 A[Catch: IOException -> 0x0033, LOOP:0: B:15:0x02a2->B:17:0x02a8, LOOP_END, TryCatch #0 {IOException -> 0x0033, blocks: (B:13:0x002e, B:14:0x0293, B:15:0x02a2, B:20:0x02b7, B:17:0x02a8, B:23:0x003b, B:24:0x0247, B:25:0x0256, B:27:0x025c, B:30:0x0046, B:31:0x00db, B:32:0x00fd, B:34:0x0201, B:35:0x020b, B:37:0x0215, B:38:0x021b, B:40:0x022b, B:45:0x026d, B:47:0x0271, B:50:0x02cb, B:51:0x02d0, B:54:0x0051, B:55:0x00fb, B:57:0x005c, B:58:0x0132, B:59:0x0154, B:61:0x0067, B:62:0x0152, B:64:0x0072, B:65:0x0185, B:66:0x01a6, B:68:0x007d, B:69:0x01a4, B:71:0x0088, B:72:0x01d3, B:73:0x01f4, B:75:0x0093, B:76:0x01f2, B:78:0x009b, B:81:0x00a3, B:87:0x00b9, B:90:0x00c3, B:94:0x00de, B:95:0x00e3, B:96:0x00e4, B:100:0x010b, B:101:0x0110, B:102:0x0111, B:105:0x011b, B:109:0x0135, B:110:0x013a, B:111:0x013b, B:115:0x0164, B:118:0x016e, B:122:0x0188, B:123:0x018d, B:124:0x018e, B:128:0x01b3, B:131:0x01bd, B:135:0x01d6, B:136:0x01db, B:137:0x01dc), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x025c A[Catch: IOException -> 0x0033, LOOP:1: B:25:0x0256->B:27:0x025c, LOOP_END, TryCatch #0 {IOException -> 0x0033, blocks: (B:13:0x002e, B:14:0x0293, B:15:0x02a2, B:20:0x02b7, B:17:0x02a8, B:23:0x003b, B:24:0x0247, B:25:0x0256, B:27:0x025c, B:30:0x0046, B:31:0x00db, B:32:0x00fd, B:34:0x0201, B:35:0x020b, B:37:0x0215, B:38:0x021b, B:40:0x022b, B:45:0x026d, B:47:0x0271, B:50:0x02cb, B:51:0x02d0, B:54:0x0051, B:55:0x00fb, B:57:0x005c, B:58:0x0132, B:59:0x0154, B:61:0x0067, B:62:0x0152, B:64:0x0072, B:65:0x0185, B:66:0x01a6, B:68:0x007d, B:69:0x01a4, B:71:0x0088, B:72:0x01d3, B:73:0x01f4, B:75:0x0093, B:76:0x01f2, B:78:0x009b, B:81:0x00a3, B:87:0x00b9, B:90:0x00c3, B:94:0x00de, B:95:0x00e3, B:96:0x00e4, B:100:0x010b, B:101:0x0110, B:102:0x0111, B:105:0x011b, B:109:0x0135, B:110:0x013a, B:111:0x013b, B:115:0x0164, B:118:0x016e, B:122:0x0188, B:123:0x018d, B:124:0x018e, B:128:0x01b3, B:131:0x01bd, B:135:0x01d6, B:136:0x01db, B:137:0x01dc), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0215 A[Catch: IOException -> 0x0033, TryCatch #0 {IOException -> 0x0033, blocks: (B:13:0x002e, B:14:0x0293, B:15:0x02a2, B:20:0x02b7, B:17:0x02a8, B:23:0x003b, B:24:0x0247, B:25:0x0256, B:27:0x025c, B:30:0x0046, B:31:0x00db, B:32:0x00fd, B:34:0x0201, B:35:0x020b, B:37:0x0215, B:38:0x021b, B:40:0x022b, B:45:0x026d, B:47:0x0271, B:50:0x02cb, B:51:0x02d0, B:54:0x0051, B:55:0x00fb, B:57:0x005c, B:58:0x0132, B:59:0x0154, B:61:0x0067, B:62:0x0152, B:64:0x0072, B:65:0x0185, B:66:0x01a6, B:68:0x007d, B:69:0x01a4, B:71:0x0088, B:72:0x01d3, B:73:0x01f4, B:75:0x0093, B:76:0x01f2, B:78:0x009b, B:81:0x00a3, B:87:0x00b9, B:90:0x00c3, B:94:0x00de, B:95:0x00e3, B:96:0x00e4, B:100:0x010b, B:101:0x0110, B:102:0x0111, B:105:0x011b, B:109:0x0135, B:110:0x013a, B:111:0x013b, B:115:0x0164, B:118:0x016e, B:122:0x0188, B:123:0x018d, B:124:0x018e, B:128:0x01b3, B:131:0x01bd, B:135:0x01d6, B:136:0x01db, B:137:0x01dc), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022b A[Catch: IOException -> 0x0033, TryCatch #0 {IOException -> 0x0033, blocks: (B:13:0x002e, B:14:0x0293, B:15:0x02a2, B:20:0x02b7, B:17:0x02a8, B:23:0x003b, B:24:0x0247, B:25:0x0256, B:27:0x025c, B:30:0x0046, B:31:0x00db, B:32:0x00fd, B:34:0x0201, B:35:0x020b, B:37:0x0215, B:38:0x021b, B:40:0x022b, B:45:0x026d, B:47:0x0271, B:50:0x02cb, B:51:0x02d0, B:54:0x0051, B:55:0x00fb, B:57:0x005c, B:58:0x0132, B:59:0x0154, B:61:0x0067, B:62:0x0152, B:64:0x0072, B:65:0x0185, B:66:0x01a6, B:68:0x007d, B:69:0x01a4, B:71:0x0088, B:72:0x01d3, B:73:0x01f4, B:75:0x0093, B:76:0x01f2, B:78:0x009b, B:81:0x00a3, B:87:0x00b9, B:90:0x00c3, B:94:0x00de, B:95:0x00e3, B:96:0x00e4, B:100:0x010b, B:101:0x0110, B:102:0x0111, B:105:0x011b, B:109:0x0135, B:110:0x013a, B:111:0x013b, B:115:0x0164, B:118:0x016e, B:122:0x0188, B:123:0x018d, B:124:0x018e, B:128:0x01b3, B:131:0x01bd, B:135:0x01d6, B:136:0x01db, B:137:0x01dc), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026d A[Catch: IOException -> 0x0033, TryCatch #0 {IOException -> 0x0033, blocks: (B:13:0x002e, B:14:0x0293, B:15:0x02a2, B:20:0x02b7, B:17:0x02a8, B:23:0x003b, B:24:0x0247, B:25:0x0256, B:27:0x025c, B:30:0x0046, B:31:0x00db, B:32:0x00fd, B:34:0x0201, B:35:0x020b, B:37:0x0215, B:38:0x021b, B:40:0x022b, B:45:0x026d, B:47:0x0271, B:50:0x02cb, B:51:0x02d0, B:54:0x0051, B:55:0x00fb, B:57:0x005c, B:58:0x0132, B:59:0x0154, B:61:0x0067, B:62:0x0152, B:64:0x0072, B:65:0x0185, B:66:0x01a6, B:68:0x007d, B:69:0x01a4, B:71:0x0088, B:72:0x01d3, B:73:0x01f4, B:75:0x0093, B:76:0x01f2, B:78:0x009b, B:81:0x00a3, B:87:0x00b9, B:90:0x00c3, B:94:0x00de, B:95:0x00e3, B:96:0x00e4, B:100:0x010b, B:101:0x0110, B:102:0x0111, B:105:0x011b, B:109:0x0135, B:110:0x013a, B:111:0x013b, B:115:0x0164, B:118:0x016e, B:122:0x0188, B:123:0x018d, B:124:0x018e, B:128:0x01b3, B:131:0x01bd, B:135:0x01d6, B:136:0x01db, B:137:0x01dc), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.s4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o4k o4kVar, cg6 cg6Var) {
        dem demVar;
        pp2 pp2Var;
        o4k o4kVar2;
        xqn xqnVar;
        mdm mdmVar;
        pp2 bemVar;
        mdm mdmVar2;
        mdm mdmVar3;
        mdm mdmVar4;
        ap0 ap0Var;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        try {
            if (cg6Var instanceof dem) {
                demVar = (dem) cg6Var;
                int i = demVar.n;
                if ((i & Integer.MIN_VALUE) != 0) {
                    demVar.n = i - Integer.MIN_VALUE;
                    Object obj = demVar.l;
                    nm6 nm6Var = nm6.a;
                    switch (demVar.n) {
                        case 0:
                            qgg.h0(obj);
                            pp2Var = this.k;
                            if ((o4kVar instanceof n4k) || pp2Var == null) {
                                xqn xqnVar2 = new xqn();
                                int ordinal = this.d.ordinal();
                                if (ordinal == 0) {
                                    int ordinal2 = this.c.ordinal();
                                    if (ordinal2 == 0) {
                                        wdm wdmVar = this.b;
                                        String str = this.e;
                                        demVar.j = o4kVar;
                                        demVar.k = xqnVar2;
                                        demVar.n = 1;
                                        Object g = wdmVar.g(str, demVar);
                                        if (g != nm6Var) {
                                            o4kVar2 = o4kVar;
                                            xqnVar = xqnVar2;
                                            obj = g;
                                            mdmVar = (mdm) obj;
                                            xqnVar.a = mdmVar.a;
                                            bemVar = new bem(mdmVar.b);
                                            pp2Var = bemVar;
                                            this.g.invoke(xqnVar.a);
                                            this.k = pp2Var;
                                            o4kVar = o4kVar2;
                                        }
                                    } else {
                                        if (ordinal2 != 1) {
                                            throw new x7j();
                                        }
                                        wdm wdmVar2 = this.b;
                                        String str2 = this.e;
                                        demVar.j = o4kVar;
                                        demVar.k = xqnVar2;
                                        demVar.n = 2;
                                        Object c = wdmVar2.c(str2, demVar);
                                        if (c != nm6Var) {
                                            o4kVar2 = o4kVar;
                                            xqnVar = xqnVar2;
                                            obj = c;
                                            mdmVar = (mdm) obj;
                                            xqnVar.a = mdmVar.a;
                                            bemVar = new bem(mdmVar.b);
                                            pp2Var = bemVar;
                                            this.g.invoke(xqnVar.a);
                                            this.k = pp2Var;
                                            o4kVar = o4kVar2;
                                        }
                                    }
                                } else if (ordinal == 1) {
                                    int ordinal3 = this.c.ordinal();
                                    if (ordinal3 == 0) {
                                        wdm wdmVar3 = this.b;
                                        String str3 = this.e;
                                        demVar.j = o4kVar;
                                        demVar.k = xqnVar2;
                                        demVar.n = 3;
                                        Object i2 = wdmVar3.i(str3, demVar);
                                        if (i2 != nm6Var) {
                                            o4kVar2 = o4kVar;
                                            xqnVar = xqnVar2;
                                            obj = i2;
                                            mdmVar2 = (mdm) obj;
                                            xqnVar.a = mdmVar2.a;
                                            bemVar = new bem(mdmVar2.b);
                                            pp2Var = bemVar;
                                            this.g.invoke(xqnVar.a);
                                            this.k = pp2Var;
                                            o4kVar = o4kVar2;
                                        }
                                    } else {
                                        if (ordinal3 != 1) {
                                            throw new x7j();
                                        }
                                        wdm wdmVar4 = this.b;
                                        String str4 = this.e;
                                        demVar.j = o4kVar;
                                        demVar.k = xqnVar2;
                                        demVar.n = 4;
                                        Object e = wdmVar4.e(str4, demVar);
                                        if (e != nm6Var) {
                                            o4kVar2 = o4kVar;
                                            xqnVar = xqnVar2;
                                            obj = e;
                                            mdmVar2 = (mdm) obj;
                                            xqnVar.a = mdmVar2.a;
                                            bemVar = new bem(mdmVar2.b);
                                            pp2Var = bemVar;
                                            this.g.invoke(xqnVar.a);
                                            this.k = pp2Var;
                                            o4kVar = o4kVar2;
                                        }
                                    }
                                } else if (ordinal == 2) {
                                    int ordinal4 = this.c.ordinal();
                                    if (ordinal4 == 0) {
                                        wdm wdmVar5 = this.b;
                                        String str5 = this.e;
                                        demVar.j = o4kVar;
                                        demVar.k = xqnVar2;
                                        demVar.n = 5;
                                        Object j = wdmVar5.j(str5, demVar);
                                        if (j != nm6Var) {
                                            o4kVar2 = o4kVar;
                                            xqnVar = xqnVar2;
                                            obj = j;
                                            mdmVar3 = (mdm) obj;
                                            xqnVar.a = mdmVar3.a;
                                            List list = mdmVar3.b;
                                            list.getClass();
                                            bemVar = new cem(list, 1);
                                            pp2Var = bemVar;
                                            this.g.invoke(xqnVar.a);
                                            this.k = pp2Var;
                                            o4kVar = o4kVar2;
                                        }
                                    } else {
                                        if (ordinal4 != 1) {
                                            throw new x7j();
                                        }
                                        wdm wdmVar6 = this.b;
                                        String str6 = this.e;
                                        demVar.j = o4kVar;
                                        demVar.k = xqnVar2;
                                        demVar.n = 6;
                                        Object f = wdmVar6.f(str6, demVar);
                                        if (f != nm6Var) {
                                            o4kVar2 = o4kVar;
                                            xqnVar = xqnVar2;
                                            obj = f;
                                            mdmVar3 = (mdm) obj;
                                            xqnVar.a = mdmVar3.a;
                                            List list2 = mdmVar3.b;
                                            list2.getClass();
                                            bemVar = new cem(list2, 1);
                                            pp2Var = bemVar;
                                            this.g.invoke(xqnVar.a);
                                            this.k = pp2Var;
                                            o4kVar = o4kVar2;
                                        }
                                    }
                                } else {
                                    if (ordinal != 3) {
                                        throw new x7j();
                                    }
                                    int ordinal5 = this.c.ordinal();
                                    if (ordinal5 == 0) {
                                        wdm wdmVar7 = this.b;
                                        String str7 = this.e;
                                        demVar.j = o4kVar;
                                        demVar.k = xqnVar2;
                                        demVar.n = 7;
                                        Object h = wdmVar7.h(str7, demVar);
                                        if (h != nm6Var) {
                                            o4kVar2 = o4kVar;
                                            xqnVar = xqnVar2;
                                            obj = h;
                                            mdmVar4 = (mdm) obj;
                                            xqnVar.a = mdmVar4.a;
                                            bemVar = new bem(mdmVar4.b);
                                            pp2Var = bemVar;
                                            this.g.invoke(xqnVar.a);
                                            this.k = pp2Var;
                                            o4kVar = o4kVar2;
                                        }
                                    } else {
                                        if (ordinal5 != 1) {
                                            throw new x7j();
                                        }
                                        wdm wdmVar8 = this.b;
                                        String str8 = this.e;
                                        demVar.j = o4kVar;
                                        demVar.k = xqnVar2;
                                        demVar.n = 8;
                                        Object d = wdmVar8.d(str8, demVar);
                                        if (d != nm6Var) {
                                            o4kVar2 = o4kVar;
                                            xqnVar = xqnVar2;
                                            obj = d;
                                            mdmVar4 = (mdm) obj;
                                            xqnVar.a = mdmVar4.a;
                                            bemVar = new bem(mdmVar4.b);
                                            pp2Var = bemVar;
                                            this.g.invoke(xqnVar.a);
                                            this.k = pp2Var;
                                            o4kVar = o4kVar2;
                                        }
                                    }
                                }
                                return nm6Var;
                            }
                            Integer num = (Integer) o4kVar.a();
                            ap0 ap0Var2 = new ap0(num != null ? num.intValue() : 0, this.j, pp2Var.b.size());
                            if (pp2Var instanceof bem) {
                                List E = bow.E(((bem) pp2Var).b, ap0Var2);
                                wdm wdmVar9 = this.b;
                                boolean z = this.f;
                                demVar.j = null;
                                demVar.k = ap0Var2;
                                demVar.n = 9;
                                obj = wdmVar9.b(E, z, demVar);
                                if (obj != nm6Var) {
                                    ap0Var = ap0Var2;
                                    Iterable iterable = (Iterable) obj;
                                    arrayList = new ArrayList(v75.o(iterable, 10));
                                    it = iterable.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new vwl((oq) it.next()));
                                    }
                                    ArrayList arrayList2 = arrayList;
                                    this.h.invoke();
                                    return new q4k(arrayList2, null, ap0Var.a(), Integer.MIN_VALUE, Integer.MIN_VALUE);
                                }
                            } else {
                                if (!(pp2Var instanceof cem)) {
                                    throw new x7j();
                                }
                                List E2 = bow.E(((cem) pp2Var).b, ap0Var2);
                                wdm wdmVar10 = this.b;
                                boolean z2 = this.f;
                                demVar.j = null;
                                demVar.k = ap0Var2;
                                demVar.n = 10;
                                obj = ((nsl) wdmVar10.c.getValue()).d(E2, z2, demVar);
                                if (obj != nm6Var) {
                                    ap0Var = ap0Var2;
                                    Iterable iterable2 = (Iterable) obj;
                                    arrayList = new ArrayList(v75.o(iterable2, 10));
                                    it2 = iterable2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(new wwl((cvl) it2.next()));
                                    }
                                    ArrayList arrayList22 = arrayList;
                                    this.h.invoke();
                                    return new q4k(arrayList22, null, ap0Var.a(), Integer.MIN_VALUE, Integer.MIN_VALUE);
                                }
                            }
                            return nm6Var;
                        case 1:
                            xqnVar = (xqn) demVar.k;
                            o4kVar2 = demVar.j;
                            qgg.h0(obj);
                            mdmVar = (mdm) obj;
                            xqnVar.a = mdmVar.a;
                            bemVar = new bem(mdmVar.b);
                            pp2Var = bemVar;
                            this.g.invoke(xqnVar.a);
                            this.k = pp2Var;
                            o4kVar = o4kVar2;
                            Integer num2 = (Integer) o4kVar.a();
                            ap0 ap0Var22 = new ap0(num2 != null ? num2.intValue() : 0, this.j, pp2Var.b.size());
                            if (pp2Var instanceof bem) {
                            }
                            return nm6Var;
                        case 2:
                            xqnVar = (xqn) demVar.k;
                            o4kVar2 = demVar.j;
                            qgg.h0(obj);
                            mdmVar = (mdm) obj;
                            xqnVar.a = mdmVar.a;
                            bemVar = new bem(mdmVar.b);
                            pp2Var = bemVar;
                            this.g.invoke(xqnVar.a);
                            this.k = pp2Var;
                            o4kVar = o4kVar2;
                            Integer num22 = (Integer) o4kVar.a();
                            ap0 ap0Var222 = new ap0(num22 != null ? num22.intValue() : 0, this.j, pp2Var.b.size());
                            if (pp2Var instanceof bem) {
                            }
                            return nm6Var;
                        case 3:
                            xqnVar = (xqn) demVar.k;
                            o4kVar2 = demVar.j;
                            qgg.h0(obj);
                            mdmVar2 = (mdm) obj;
                            xqnVar.a = mdmVar2.a;
                            bemVar = new bem(mdmVar2.b);
                            pp2Var = bemVar;
                            this.g.invoke(xqnVar.a);
                            this.k = pp2Var;
                            o4kVar = o4kVar2;
                            Integer num222 = (Integer) o4kVar.a();
                            ap0 ap0Var2222 = new ap0(num222 != null ? num222.intValue() : 0, this.j, pp2Var.b.size());
                            if (pp2Var instanceof bem) {
                            }
                            return nm6Var;
                        case 4:
                            xqnVar = (xqn) demVar.k;
                            o4kVar2 = demVar.j;
                            qgg.h0(obj);
                            mdmVar2 = (mdm) obj;
                            xqnVar.a = mdmVar2.a;
                            bemVar = new bem(mdmVar2.b);
                            pp2Var = bemVar;
                            this.g.invoke(xqnVar.a);
                            this.k = pp2Var;
                            o4kVar = o4kVar2;
                            Integer num2222 = (Integer) o4kVar.a();
                            ap0 ap0Var22222 = new ap0(num2222 != null ? num2222.intValue() : 0, this.j, pp2Var.b.size());
                            if (pp2Var instanceof bem) {
                            }
                            return nm6Var;
                        case 5:
                            xqnVar = (xqn) demVar.k;
                            o4kVar2 = demVar.j;
                            qgg.h0(obj);
                            mdmVar3 = (mdm) obj;
                            xqnVar.a = mdmVar3.a;
                            List list22 = mdmVar3.b;
                            list22.getClass();
                            bemVar = new cem(list22, 1);
                            pp2Var = bemVar;
                            this.g.invoke(xqnVar.a);
                            this.k = pp2Var;
                            o4kVar = o4kVar2;
                            Integer num22222 = (Integer) o4kVar.a();
                            ap0 ap0Var222222 = new ap0(num22222 != null ? num22222.intValue() : 0, this.j, pp2Var.b.size());
                            if (pp2Var instanceof bem) {
                            }
                            return nm6Var;
                        case 6:
                            xqnVar = (xqn) demVar.k;
                            o4kVar2 = demVar.j;
                            qgg.h0(obj);
                            mdmVar3 = (mdm) obj;
                            xqnVar.a = mdmVar3.a;
                            List list222 = mdmVar3.b;
                            list222.getClass();
                            bemVar = new cem(list222, 1);
                            pp2Var = bemVar;
                            this.g.invoke(xqnVar.a);
                            this.k = pp2Var;
                            o4kVar = o4kVar2;
                            Integer num222222 = (Integer) o4kVar.a();
                            ap0 ap0Var2222222 = new ap0(num222222 != null ? num222222.intValue() : 0, this.j, pp2Var.b.size());
                            if (pp2Var instanceof bem) {
                            }
                            return nm6Var;
                        case 7:
                            xqnVar = (xqn) demVar.k;
                            o4kVar2 = demVar.j;
                            qgg.h0(obj);
                            mdmVar4 = (mdm) obj;
                            xqnVar.a = mdmVar4.a;
                            bemVar = new bem(mdmVar4.b);
                            pp2Var = bemVar;
                            this.g.invoke(xqnVar.a);
                            this.k = pp2Var;
                            o4kVar = o4kVar2;
                            Integer num2222222 = (Integer) o4kVar.a();
                            ap0 ap0Var22222222 = new ap0(num2222222 != null ? num2222222.intValue() : 0, this.j, pp2Var.b.size());
                            if (pp2Var instanceof bem) {
                            }
                            return nm6Var;
                        case 8:
                            xqnVar = (xqn) demVar.k;
                            o4kVar2 = demVar.j;
                            qgg.h0(obj);
                            mdmVar4 = (mdm) obj;
                            xqnVar.a = mdmVar4.a;
                            bemVar = new bem(mdmVar4.b);
                            pp2Var = bemVar;
                            this.g.invoke(xqnVar.a);
                            this.k = pp2Var;
                            o4kVar = o4kVar2;
                            Integer num22222222 = (Integer) o4kVar.a();
                            ap0 ap0Var222222222 = new ap0(num22222222 != null ? num22222222.intValue() : 0, this.j, pp2Var.b.size());
                            if (pp2Var instanceof bem) {
                            }
                            return nm6Var;
                        case 9:
                            ap0Var = (ap0) demVar.k;
                            qgg.h0(obj);
                            Iterable iterable3 = (Iterable) obj;
                            arrayList = new ArrayList(v75.o(iterable3, 10));
                            it = iterable3.iterator();
                            while (it.hasNext()) {
                            }
                            ArrayList arrayList222 = arrayList;
                            this.h.invoke();
                            return new q4k(arrayList222, null, ap0Var.a(), Integer.MIN_VALUE, Integer.MIN_VALUE);
                        case 10:
                            ap0Var = (ap0) demVar.k;
                            qgg.h0(obj);
                            Iterable iterable22 = (Iterable) obj;
                            arrayList = new ArrayList(v75.o(iterable22, 10));
                            it2 = iterable22.iterator();
                            while (it2.hasNext()) {
                            }
                            ArrayList arrayList2222 = arrayList;
                            this.h.invoke();
                            return new q4k(arrayList2222, null, ap0Var.a(), Integer.MIN_VALUE, Integer.MIN_VALUE);
                        default:
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (demVar.n) {
            }
        } catch (IOException e2) {
            this.i.invoke();
            return new p4k(e2);
        }
        demVar = new dem(this, cg6Var);
        Object obj2 = demVar.l;
        nm6 nm6Var2 = nm6.a;
    }
}
