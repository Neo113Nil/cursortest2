package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class nd implements yg {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final /* synthetic */ Object wxUZMvaN;

    public nd(od odVar, l20 l20Var, yg ygVar) {
        this.NCTxEWno = 0;
        this.MdtA4re8 = l20Var;
        this.wxUZMvaN = ygVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1 A[LOOP:0: B:22:0x00bb->B:24:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01aa  */
    @Override // defpackage.yg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OnDfzHZD(Object obj, g9 g9Var) {
        md mdVar;
        int i;
        gh ghVar;
        Object obj2;
        int i2;
        ry ryVar;
        int i3;
        List<p6> list;
        yg ygVar;
        int i4;
        int ESscZ9M1;
        ArrayList arrayList;
        oy oyVar;
        int i5 = this.NCTxEWno;
        Object obj3 = this.MdtA4re8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        Object obj4 = this.wxUZMvaN;
        u9 u9Var = u9.NCTxEWno;
        switch (i5) {
            case 0:
                l20 l20Var = (l20) obj3;
                if (g9Var instanceof md) {
                    mdVar = (md) g9Var;
                    int i6 = mdVar.b2ZJblxo;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        mdVar.b2ZJblxo = i6 - Integer.MIN_VALUE;
                        Object obj5 = mdVar.VgvYg0wo;
                        i = mdVar.b2ZJblxo;
                        if (i == 0) {
                            if (i == 1) {
                                fn.SgZGMMPL(obj5);
                                return xe0Var;
                            }
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fn.SgZGMMPL(obj5);
                        Object obj6 = l20Var.NCTxEWno;
                        if (obj6 != fn.OxcuoDLp && fn.qoPGr6Ce(obj6, obj)) {
                            return xe0Var;
                        }
                        l20Var.NCTxEWno = obj;
                        mdVar.b2ZJblxo = 1;
                        return ((yg) obj4).OnDfzHZD(obj, mdVar) == u9Var ? u9Var : xe0Var;
                    }
                }
                mdVar = new md(this, g9Var);
                Object obj52 = mdVar.VgvYg0wo;
                i = mdVar.b2ZJblxo;
                if (i == 0) {
                }
                break;
            case 1:
                if (g9Var instanceof gh) {
                    ghVar = (gh) g9Var;
                    int i7 = ghVar.b2ZJblxo;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ghVar.b2ZJblxo = i7 - Integer.MIN_VALUE;
                        obj2 = ghVar.P7K7Inc8;
                        i2 = ghVar.b2ZJblxo;
                        if (i2 != 0) {
                            fn.SgZGMMPL(obj2);
                            ghVar.VgvYg0wo = this;
                            ghVar.jb9XjC4I = obj;
                            ghVar.b2ZJblxo = 1;
                            obj2 = ((dl) obj4).Qr9iLBAD(obj, ghVar);
                            if (obj2 == u9Var) {
                                return u9Var;
                            }
                        } else {
                            if (i2 != 1) {
                                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = ghVar.jb9XjC4I;
                            this = ghVar.VgvYg0wo;
                            fn.SgZGMMPL(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return xe0Var;
                        }
                        ((l20) this.MdtA4re8).NCTxEWno = obj;
                        throw new qoPGr6Ce(this);
                    }
                }
                ghVar = new gh(this, g9Var);
                obj2 = ghVar.P7K7Inc8;
                i2 = ghVar.b2ZJblxo;
                if (i2 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            default:
                if (g9Var instanceof ry) {
                    ryVar = (ry) g9Var;
                    int i8 = ryVar.P7K7Inc8;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        ryVar.P7K7Inc8 = i8 - Integer.MIN_VALUE;
                        Object obj7 = ryVar.VgvYg0wo;
                        i3 = ryVar.P7K7Inc8;
                        if (i3 != 0) {
                            fn.SgZGMMPL(obj7);
                            yg ygVar2 = (yg) obj4;
                            list = (List) obj;
                            ArrayList arrayList2 = new ArrayList();
                            for (p6 p6Var : list) {
                                d6.KRabZ4CU(y5.N8VPGzVC(new Long(p6Var.NCTxEWno), new Long(p6Var.MdtA4re8)), arrayList2);
                            }
                            List B1cjorwa = x5.B1cjorwa(x5.yzvmSy3z(arrayList2));
                            ny nyVar = ((zy) obj3).qoPGr6Ce;
                            ryVar.Qr9iLBAD = ygVar2;
                            ryVar.jb9XjC4I = list;
                            ryVar.eVhOlqcC = 0;
                            ryVar.P7K7Inc8 = 1;
                            Object qoPGr6Ce = nyVar.qoPGr6Ce(B1cjorwa, ryVar);
                            if (qoPGr6Ce != u9Var) {
                                ygVar = ygVar2;
                                obj7 = qoPGr6Ce;
                                i4 = 0;
                            }
                            return u9Var;
                        }
                        if (i3 != 1) {
                            if (i3 == 2) {
                                fn.SgZGMMPL(obj7);
                                return xe0Var;
                            }
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = ryVar.eVhOlqcC;
                        list = ryVar.jb9XjC4I;
                        ygVar = ryVar.Qr9iLBAD;
                        fn.SgZGMMPL(obj7);
                        Iterable iterable = (Iterable) obj7;
                        ESscZ9M1 = zq.ESscZ9M1(z5.bvfAo0eO(iterable, 10));
                        if (ESscZ9M1 < 16) {
                            ESscZ9M1 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(ESscZ9M1);
                        for (Object obj8 : iterable) {
                            linkedHashMap.put(new Long(((oy) obj8).qoPGr6Ce), obj8);
                        }
                        arrayList = new ArrayList();
                        for (p6 p6Var2 : list) {
                            oy oyVar2 = (oy) linkedHashMap.get(new Long(p6Var2.NCTxEWno));
                            x6 x6Var = (oyVar2 == null || (oyVar = (oy) linkedHashMap.get(new Long(p6Var2.MdtA4re8))) == null) ? null : new x6(p6Var2.qoPGr6Ce, fn.aZz0PFXp(oyVar2), fn.aZz0PFXp(oyVar));
                            if (x6Var != null) {
                                arrayList.add(x6Var);
                            }
                        }
                        ryVar.Qr9iLBAD = null;
                        ryVar.jb9XjC4I = null;
                        ryVar.eVhOlqcC = i4;
                        ryVar.P7K7Inc8 = 2;
                        if (ygVar.OnDfzHZD(arrayList, ryVar) != u9Var) {
                            return xe0Var;
                        }
                        return u9Var;
                    }
                }
                ryVar = new ry(this, g9Var);
                Object obj72 = ryVar.VgvYg0wo;
                i3 = ryVar.P7K7Inc8;
                if (i3 != 0) {
                }
                Iterable iterable2 = (Iterable) obj72;
                ESscZ9M1 = zq.ESscZ9M1(z5.bvfAo0eO(iterable2, 10));
                if (ESscZ9M1 < 16) {
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(ESscZ9M1);
                while (r13.hasNext()) {
                }
                arrayList = new ArrayList();
                while (r15.hasNext()) {
                }
                ryVar.Qr9iLBAD = null;
                ryVar.jb9XjC4I = null;
                ryVar.eVhOlqcC = i4;
                ryVar.P7K7Inc8 = 2;
                if (ygVar.OnDfzHZD(arrayList, ryVar) != u9Var) {
                }
                return u9Var;
        }
    }

    public /* synthetic */ nd(Object obj, int i, Object obj2) {
        this.NCTxEWno = i;
        this.wxUZMvaN = obj;
        this.MdtA4re8 = obj2;
    }
}
