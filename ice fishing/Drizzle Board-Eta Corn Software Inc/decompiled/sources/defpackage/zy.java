package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zy {
    public final y80 MdtA4re8;
    public final o6 NCTxEWno;
    public final ny qoPGr6Ce;

    public zy(ny nyVar, o6 o6Var, y80 y80Var) {
        this.qoPGr6Ce = nyVar;
        this.NCTxEWno = o6Var;
        this.MdtA4re8 = y80Var;
    }

    public final mcXgUFR8 MdtA4re8() {
        v30 v30Var = this.qoPGr6Ce.qoPGr6Ce;
        int i = 21;
        int i2 = 2;
        return new mcXgUFR8(new xg[]{le0.OnDfzHZD(v30Var, new String[]{"pairings"}, new tKaxLBvG(20)), le0.OnDfzHZD(v30Var, new String[]{"pairings"}, new tKaxLBvG(i)), le0.OnDfzHZD(v30Var, new String[]{"pairings"}, new tKaxLBvG(23)), le0.OnDfzHZD(this.NCTxEWno.qoPGr6Ce, new String[]{"compares"}, new tKaxLBvG(i2)), le0.OnDfzHZD(this.MdtA4re8.qoPGr6Ce, new String[]{"sprint_rounds"}, new x80(i2))}, new wy(null), i, false);
    }

    public final bt NCTxEWno() {
        return new bt(le0.OnDfzHZD(this.qoPGr6Ce.qoPGr6Ce, new String[]{"pairings"}, new tKaxLBvG(24)), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[LOOP:0: B:11:0x0055->B:13:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable VgvYg0wo(final int i, h9 h9Var) {
        yy yyVar;
        int i2;
        Iterator it;
        if (h9Var instanceof yy) {
            yyVar = (yy) h9Var;
            int i3 = yyVar.b2ZJblxo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yyVar.b2ZJblxo = i3 - Integer.MIN_VALUE;
                Object obj = yyVar.VgvYg0wo;
                i2 = yyVar.b2ZJblxo;
                if (i2 != 0) {
                    fn.SgZGMMPL(obj);
                    yyVar.b2ZJblxo = 1;
                    obj = fn.gjV1z5T1(yyVar, new zk() { // from class: ly
                        @Override // defpackage.zk
                        public final Object ow5vqvCr(Object obj2) {
                            int i4 = i;
                            f40 f40Var = (f40) obj2;
                            f40Var.getClass();
                            h40 Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT * FROM pairings ORDER BY RANDOM() LIMIT ?");
                            try {
                                Ey6iv0m0.qoPGr6Ce(1, i4);
                                int sjUBp5pO = le0.sjUBp5pO(Ey6iv0m0, "id");
                                int sjUBp5pO2 = le0.sjUBp5pO(Ey6iv0m0, "name");
                                int sjUBp5pO3 = le0.sjUBp5pO(Ey6iv0m0, "emoji");
                                int sjUBp5pO4 = le0.sjUBp5pO(Ey6iv0m0, "subtitle");
                                int sjUBp5pO5 = le0.sjUBp5pO(Ey6iv0m0, "description");
                                int sjUBp5pO6 = le0.sjUBp5pO(Ey6iv0m0, "sauceBase");
                                int sjUBp5pO7 = le0.sjUBp5pO(Ey6iv0m0, "intensity");
                                int sjUBp5pO8 = le0.sjUBp5pO(Ey6iv0m0, "intensityLevel");
                                int sjUBp5pO9 = le0.sjUBp5pO(Ey6iv0m0, "prepMinutes");
                                int sjUBp5pO10 = le0.sjUBp5pO(Ey6iv0m0, "cuisine");
                                int sjUBp5pO11 = le0.sjUBp5pO(Ey6iv0m0, "scope");
                                int sjUBp5pO12 = le0.sjUBp5pO(Ey6iv0m0, "tags");
                                int sjUBp5pO13 = le0.sjUBp5pO(Ey6iv0m0, "contextNote");
                                int sjUBp5pO14 = le0.sjUBp5pO(Ey6iv0m0, "flow");
                                int sjUBp5pO15 = le0.sjUBp5pO(Ey6iv0m0, "popularity");
                                int sjUBp5pO16 = le0.sjUBp5pO(Ey6iv0m0, "novelty");
                                int sjUBp5pO17 = le0.sjUBp5pO(Ey6iv0m0, "openedAt");
                                int sjUBp5pO18 = le0.sjUBp5pO(Ey6iv0m0, "rating");
                                ArrayList arrayList = new ArrayList();
                                while (Ey6iv0m0.amk52bBQ()) {
                                    int i5 = sjUBp5pO2;
                                    int i6 = sjUBp5pO3;
                                    int i7 = sjUBp5pO15;
                                    int i8 = sjUBp5pO4;
                                    int i9 = sjUBp5pO5;
                                    int i10 = sjUBp5pO16;
                                    int i11 = sjUBp5pO17;
                                    int i12 = sjUBp5pO;
                                    int i13 = sjUBp5pO18;
                                    arrayList.add(new oy(Ey6iv0m0.getLong(sjUBp5pO), Ey6iv0m0.wxUZMvaN(sjUBp5pO2), Ey6iv0m0.wxUZMvaN(sjUBp5pO3), Ey6iv0m0.wxUZMvaN(sjUBp5pO4), Ey6iv0m0.wxUZMvaN(sjUBp5pO5), Ey6iv0m0.wxUZMvaN(sjUBp5pO6), Ey6iv0m0.wxUZMvaN(sjUBp5pO7), (int) Ey6iv0m0.getLong(sjUBp5pO8), (int) Ey6iv0m0.getLong(sjUBp5pO9), Ey6iv0m0.wxUZMvaN(sjUBp5pO10), Ey6iv0m0.wxUZMvaN(sjUBp5pO11), Ey6iv0m0.wxUZMvaN(sjUBp5pO12), Ey6iv0m0.wxUZMvaN(sjUBp5pO13), Ey6iv0m0.wxUZMvaN(sjUBp5pO14), (int) Ey6iv0m0.getLong(i7), (int) Ey6iv0m0.getLong(i10), Ey6iv0m0.getLong(i11), (int) Ey6iv0m0.getLong(i13)));
                                    sjUBp5pO18 = i13;
                                    sjUBp5pO = i12;
                                    sjUBp5pO17 = i11;
                                    sjUBp5pO4 = i8;
                                    sjUBp5pO15 = i7;
                                    sjUBp5pO16 = i10;
                                    sjUBp5pO2 = i5;
                                    sjUBp5pO3 = i6;
                                    sjUBp5pO5 = i9;
                                }
                                return arrayList;
                            } finally {
                                Ey6iv0m0.close();
                            }
                        }
                    }, this.qoPGr6Ce.qoPGr6Ce, true, false);
                    u9 u9Var = u9.NCTxEWno;
                    if (obj == u9Var) {
                        return u9Var;
                    }
                } else {
                    if (i2 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(z5.bvfAo0eO(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(fn.aZz0PFXp((oy) it.next()));
                }
                return arrayList;
            }
        }
        yyVar = new yy(this, h9Var);
        Object obj2 = yyVar.VgvYg0wo;
        i2 = yyVar.b2ZJblxo;
        if (i2 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        if (r0 == r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object qoPGr6Ce(h9 h9Var) {
        qy qyVar;
        Object obj;
        int i;
        ny nyVar = this.qoPGr6Ce;
        v30 v30Var = nyVar.qoPGr6Ce;
        if (h9Var instanceof qy) {
            qyVar = (qy) h9Var;
            int i2 = qyVar.b2ZJblxo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qyVar.b2ZJblxo = i2 - Integer.MIN_VALUE;
                obj = qyVar.VgvYg0wo;
                i = qyVar.b2ZJblxo;
                Throwable th = null;
                u9 u9Var = u9.NCTxEWno;
                int i3 = 2;
                xe0 xe0Var = xe0.qoPGr6Ce;
                if (i != 0) {
                    fn.SgZGMMPL(obj);
                    qyVar.b2ZJblxo = 1;
                    obj = fn.gjV1z5T1(qyVar, new tKaxLBvG(22), v30Var, true, false);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            fn.SgZGMMPL(obj);
                            return xe0Var;
                        }
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                }
                if (((Number) obj).intValue() <= 0) {
                    List list = pa.qoPGr6Ce;
                    ArrayList arrayList = new ArrayList(z5.bvfAo0eO(list, 10));
                    Iterator it = list.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            Throwable th2 = th;
                            y5.ZyZthT5G();
                            throw th2;
                        }
                        az azVar = (az) next;
                        arrayList.add(new oy(0L, azVar.qoPGr6Ce, azVar.NCTxEWno, azVar.MdtA4re8, azVar.wxUZMvaN, azVar.VgvYg0wo, azVar.P7K7Inc8, azVar.b2ZJblxo, azVar.Qr9iLBAD, azVar.jb9XjC4I, azVar.eVhOlqcC, azVar.k3x7lurq, azVar.ow5vqvCr, azVar.OnDfzHZD, azVar.ygLcUYwZ, pa.qoPGr6Ce.size() - i4, 0L, 0));
                        th = th;
                        i4 = i5;
                        it = it;
                        i3 = 2;
                    }
                    qyVar.b2ZJblxo = i3;
                    Object gjV1z5T1 = fn.gjV1z5T1(qyVar, new cm(nyVar, 5, arrayList), v30Var, false, true);
                    if (gjV1z5T1 != u9Var) {
                        gjV1z5T1 = xe0Var;
                    }
                    if (gjV1z5T1 == u9Var) {
                        return u9Var;
                    }
                }
                return xe0Var;
            }
        }
        qyVar = new qy(this, h9Var);
        obj = qyVar.VgvYg0wo;
        i = qyVar.b2ZJblxo;
        Throwable th3 = null;
        u9 u9Var2 = u9.NCTxEWno;
        int i32 = 2;
        xe0 xe0Var2 = xe0.qoPGr6Ce;
        if (i != 0) {
        }
        if (((Number) obj).intValue() <= 0) {
        }
        return xe0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[LOOP:0: B:11:0x004d->B:13:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable wxUZMvaN(List list, h9 h9Var) {
        xy xyVar;
        int i;
        Iterator it;
        if (h9Var instanceof xy) {
            xyVar = (xy) h9Var;
            int i2 = xyVar.b2ZJblxo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xyVar.b2ZJblxo = i2 - Integer.MIN_VALUE;
                Object obj = xyVar.VgvYg0wo;
                i = xyVar.b2ZJblxo;
                if (i != 0) {
                    fn.SgZGMMPL(obj);
                    xyVar.b2ZJblxo = 1;
                    obj = this.qoPGr6Ce.qoPGr6Ce(list, xyVar);
                    u9 u9Var = u9.NCTxEWno;
                    if (obj == u9Var) {
                        return u9Var;
                    }
                } else {
                    if (i != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(z5.bvfAo0eO(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(fn.aZz0PFXp((oy) it.next()));
                }
                return arrayList;
            }
        }
        xyVar = new xy(this, h9Var);
        Object obj2 = xyVar.VgvYg0wo;
        i = xyVar.b2ZJblxo;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }
}
