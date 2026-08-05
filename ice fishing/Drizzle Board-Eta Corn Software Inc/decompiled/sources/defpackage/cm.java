package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class cm implements zk {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final /* synthetic */ Object wxUZMvaN;

    public /* synthetic */ cm(Object obj, int i, Object obj2) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
        this.wxUZMvaN = obj2;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        pu MdtA4re8;
        h40 Ey6iv0m0;
        long j;
        int i = this.NCTxEWno;
        int i2 = 1;
        int i3 = 0;
        xe0 xe0Var = xe0.qoPGr6Ce;
        Object obj2 = this.wxUZMvaN;
        Object obj3 = this.MdtA4re8;
        switch (i) {
            case 0:
                ((em) obj3).wxUZMvaN.removeCallbacks((XrPeKzBk) obj2);
                return xe0Var;
            case 1:
                f40 f40Var = (f40) obj;
                f40Var.getClass();
                ((o6) obj3).NCTxEWno.WYNAV5pd(f40Var, (p6) obj2);
                return xe0Var;
            case 2:
                f40 f40Var2 = (f40) obj;
                f40Var2.getClass();
                ((ws) obj3).NCTxEWno.WYNAV5pd(f40Var2, (xs) obj2);
                return xe0Var;
            case 3:
                pu puVar = (pu) obj3;
                gu guVar = ((uu) obj2).NCTxEWno;
                yu yuVar = (yu) obj;
                yuVar.getClass();
                wu wuVar = yuVar.qoPGr6Ce;
                wuVar.VgvYg0wo = 0;
                wuVar.P7K7Inc8 = 0;
                if (puVar instanceof ru) {
                    int i4 = pu.b2ZJblxo;
                    Iterator it = l60.RXQxj5Oe(puVar, new tKaxLBvG(16)).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            pu puVar2 = (pu) it.next();
                            pu P7K7Inc8 = guVar.P7K7Inc8();
                            if (fn.qoPGr6Ce(puVar2, P7K7Inc8 != null ? P7K7Inc8.wxUZMvaN : null)) {
                            }
                        } else {
                            int i5 = ru.jb9XjC4I;
                            yuVar.NCTxEWno = fn.jb9XjC4I(guVar.b2ZJblxo()).MdtA4re8.qoPGr6Ce;
                            yuVar.MdtA4re8 = true;
                        }
                    }
                }
                return xe0Var;
            case 4:
                wv wvVar = (wv) obj3;
                xu xuVar = (xu) obj2;
                ut utVar = (ut) obj;
                utVar.getClass();
                wt wtVar = utVar.jb9XjC4I;
                pu puVar3 = utVar.MdtA4re8;
                if (puVar3 == null) {
                    puVar3 = null;
                }
                if (puVar3 == null || (MdtA4re8 = wvVar.MdtA4re8(puVar3, wtVar.qoPGr6Ce(), xuVar)) == null) {
                    return null;
                }
                return MdtA4re8.equals(puVar3) ? utVar : wvVar.NCTxEWno().NCTxEWno(MdtA4re8, MdtA4re8.qoPGr6Ce(wtVar.qoPGr6Ce()));
            case 5:
                ArrayList arrayList = (ArrayList) obj2;
                f40 f40Var3 = (f40) obj;
                f40Var3.getClass();
                n6 n6Var = ((ny) obj3).NCTxEWno;
                Ey6iv0m0 = f40Var3.Ey6iv0m0("INSERT OR REPLACE INTO `pairings` (`id`,`name`,`emoji`,`subtitle`,`description`,`sauceBase`,`intensity`,`intensityLevel`,`prepMinutes`,`cuisine`,`scope`,`tags`,`contextNote`,`flow`,`popularity`,`novelty`,`openedAt`,`rating`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                try {
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj4 = arrayList.get(i3);
                        i3++;
                        if (obj4 != null) {
                            n6Var.MdtA4re8(Ey6iv0m0, obj4);
                            Ey6iv0m0.amk52bBQ();
                            Ey6iv0m0.I5GHvsYW();
                        }
                    }
                    le0.eVhOlqcC(Ey6iv0m0, null);
                    return xe0Var;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 6:
                List list = (List) obj2;
                f40 f40Var4 = (f40) obj;
                f40Var4.getClass();
                h40 Ey6iv0m02 = f40Var4.Ey6iv0m0((String) obj3);
                try {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Ey6iv0m02.qoPGr6Ce(i2, ((Number) it2.next()).longValue());
                        i2++;
                    }
                    int sjUBp5pO = le0.sjUBp5pO(Ey6iv0m02, "id");
                    int sjUBp5pO2 = le0.sjUBp5pO(Ey6iv0m02, "name");
                    int sjUBp5pO3 = le0.sjUBp5pO(Ey6iv0m02, "emoji");
                    int sjUBp5pO4 = le0.sjUBp5pO(Ey6iv0m02, "subtitle");
                    int sjUBp5pO5 = le0.sjUBp5pO(Ey6iv0m02, "description");
                    int sjUBp5pO6 = le0.sjUBp5pO(Ey6iv0m02, "sauceBase");
                    int sjUBp5pO7 = le0.sjUBp5pO(Ey6iv0m02, "intensity");
                    int sjUBp5pO8 = le0.sjUBp5pO(Ey6iv0m02, "intensityLevel");
                    int sjUBp5pO9 = le0.sjUBp5pO(Ey6iv0m02, "prepMinutes");
                    int sjUBp5pO10 = le0.sjUBp5pO(Ey6iv0m02, "cuisine");
                    int sjUBp5pO11 = le0.sjUBp5pO(Ey6iv0m02, "scope");
                    int sjUBp5pO12 = le0.sjUBp5pO(Ey6iv0m02, "tags");
                    int sjUBp5pO13 = le0.sjUBp5pO(Ey6iv0m02, "contextNote");
                    int sjUBp5pO14 = le0.sjUBp5pO(Ey6iv0m02, "flow");
                    int sjUBp5pO15 = le0.sjUBp5pO(Ey6iv0m02, "popularity");
                    int sjUBp5pO16 = le0.sjUBp5pO(Ey6iv0m02, "novelty");
                    int sjUBp5pO17 = le0.sjUBp5pO(Ey6iv0m02, "openedAt");
                    int sjUBp5pO18 = le0.sjUBp5pO(Ey6iv0m02, "rating");
                    ArrayList arrayList2 = new ArrayList();
                    while (Ey6iv0m02.amk52bBQ()) {
                        int i6 = sjUBp5pO2;
                        int i7 = sjUBp5pO3;
                        int i8 = sjUBp5pO15;
                        int i9 = sjUBp5pO4;
                        int i10 = sjUBp5pO5;
                        int i11 = sjUBp5pO16;
                        int i12 = sjUBp5pO17;
                        int i13 = sjUBp5pO;
                        int i14 = sjUBp5pO18;
                        arrayList2.add(new oy(Ey6iv0m02.getLong(sjUBp5pO), Ey6iv0m02.wxUZMvaN(sjUBp5pO2), Ey6iv0m02.wxUZMvaN(sjUBp5pO3), Ey6iv0m02.wxUZMvaN(sjUBp5pO4), Ey6iv0m02.wxUZMvaN(sjUBp5pO5), Ey6iv0m02.wxUZMvaN(sjUBp5pO6), Ey6iv0m02.wxUZMvaN(sjUBp5pO7), (int) Ey6iv0m02.getLong(sjUBp5pO8), (int) Ey6iv0m02.getLong(sjUBp5pO9), Ey6iv0m02.wxUZMvaN(sjUBp5pO10), Ey6iv0m02.wxUZMvaN(sjUBp5pO11), Ey6iv0m02.wxUZMvaN(sjUBp5pO12), Ey6iv0m02.wxUZMvaN(sjUBp5pO13), Ey6iv0m02.wxUZMvaN(sjUBp5pO14), (int) Ey6iv0m02.getLong(i8), (int) Ey6iv0m02.getLong(i11), Ey6iv0m02.getLong(i12), (int) Ey6iv0m02.getLong(i14)));
                        sjUBp5pO18 = i14;
                        sjUBp5pO = i13;
                        sjUBp5pO17 = i12;
                        sjUBp5pO4 = i9;
                        sjUBp5pO15 = i8;
                        sjUBp5pO16 = i11;
                        sjUBp5pO2 = i6;
                        sjUBp5pO3 = i7;
                        sjUBp5pO5 = i10;
                    }
                    Ey6iv0m02.close();
                    return arrayList2;
                } catch (Throwable th) {
                    Ey6iv0m02.close();
                    throw th;
                }
            default:
                z80 z80Var = (z80) obj2;
                f40 f40Var5 = (f40) obj;
                f40Var5.getClass();
                n6 n6Var2 = ((y80) obj3).NCTxEWno;
                Ey6iv0m0 = f40Var5.Ey6iv0m0("INSERT OR REPLACE INTO `sprint_rounds` (`id`,`traitKey`,`elapsedMillis`,`accuracyPercent`,`finishedAt`,`correctOrder`,`userOrder`) VALUES (nullif(?, 0),?,?,?,?,?,?)");
                try {
                    n6Var2.MdtA4re8(Ey6iv0m0, z80Var);
                    Ey6iv0m0.amk52bBQ();
                    le0.eVhOlqcC(Ey6iv0m0, null);
                    Ey6iv0m0 = f40Var5.Ey6iv0m0("SELECT changes()");
                    try {
                        Ey6iv0m0.amk52bBQ();
                        int i15 = (int) Ey6iv0m0.getLong(0);
                        le0.eVhOlqcC(Ey6iv0m0, null);
                        if (i15 == 0) {
                            j = -1;
                        } else {
                            Ey6iv0m0 = f40Var5.Ey6iv0m0("SELECT last_insert_rowid()");
                            try {
                                Ey6iv0m0.amk52bBQ();
                                long j2 = Ey6iv0m0.getLong(0);
                                le0.eVhOlqcC(Ey6iv0m0, null);
                                j = j2;
                            } finally {
                            }
                        }
                        return Long.valueOf(j);
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
        }
    }
}
