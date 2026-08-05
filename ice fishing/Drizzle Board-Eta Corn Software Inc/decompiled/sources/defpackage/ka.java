package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.kolosta.rejin.jilosa.data.local.BoardDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ka implements n00 {
    public final int NCTxEWno;
    public final la qoPGr6Ce;

    public ka(la laVar, int i) {
        this.qoPGr6Ce = laVar;
        this.NCTxEWno = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033a A[LOOP:5: B:108:0x030e->B:120:0x033a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0414  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    @Override // defpackage.n00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        String str;
        we weVar;
        int i;
        Object z7Var;
        kk kkVar;
        zb zbVar;
        la laVar = this.qoPGr6Ce;
        int i2 = this.NCTxEWno;
        if (i2 == 0) {
            BoardDatabase boardDatabase = (BoardDatabase) laVar.MdtA4re8.get();
            boardDatabase.getClass();
            ny OnDfzHZD = boardDatabase.OnDfzHZD();
            ra.k3x7lurq(OnDfzHZD);
            BoardDatabase boardDatabase2 = (BoardDatabase) laVar.MdtA4re8.get();
            boardDatabase2.getClass();
            o6 k3x7lurq = boardDatabase2.k3x7lurq();
            ra.k3x7lurq(k3x7lurq);
            BoardDatabase boardDatabase3 = (BoardDatabase) laVar.MdtA4re8.get();
            boardDatabase3.getClass();
            y80 ygLcUYwZ = boardDatabase3.ygLcUYwZ();
            ra.k3x7lurq(ygLcUYwZ);
            return new zy(OnDfzHZD, k3x7lurq, ygLcUYwZ);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                BoardDatabase boardDatabase4 = (BoardDatabase) laVar.MdtA4re8.get();
                boardDatabase4.getClass();
                ws ow5vqvCr = boardDatabase4.ow5vqvCr();
                ra.k3x7lurq(ow5vqvCr);
                return new dt(ow5vqvCr);
            }
            if (i2 != 3) {
                throw new AssertionError(i2);
            }
            BoardDatabase boardDatabase5 = (BoardDatabase) laVar.MdtA4re8.get();
            boardDatabase5.getClass();
            y80 ygLcUYwZ2 = boardDatabase5.ygLcUYwZ();
            ra.k3x7lurq(ygLcUYwZ2);
            return new v80(ygLcUYwZ2);
        }
        Context context = laVar.qoPGr6Ce.qoPGr6Ce;
        ua0 ua0Var = null;
        if (ba0.WYNAV5pd("drizzle_board.db")) {
            m1.sjUBp5pO("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        vm vmVar = new vm(2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList3 = new ArrayList();
        p5 qoPGr6Ce = m20.qoPGr6Ce(BoardDatabase.class);
        if (!linkedHashSet2.isEmpty()) {
            Iterator it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    m1.NCTxEWno(q70.VgvYg0wo("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", intValue));
                    return null;
                }
            }
        }
        re reVar = new re(22);
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        t30 t30Var = t30.MdtA4re8;
        t30 t30Var2 = (activityManager == null || activityManager.isLowRamDevice()) ? t30.NCTxEWno : t30Var;
        m0 m0Var = n0.MdtA4re8;
        oa oaVar = new oa(context, "drizzle_board.db", reVar, vmVar, arrayList, false, t30Var2, m0Var, m0Var, null, true, false, linkedHashSet, null, null, null, arrayList2, arrayList3, false, null, null);
        Class qoPGr6Ce2 = qoPGr6Ce.qoPGr6Ce();
        qoPGr6Ce2.getClass();
        Package r6 = qoPGr6Ce2.getPackage();
        if (r6 == null || (str = r6.getName()) == null) {
            str = "";
        }
        String canonicalName = qoPGr6Ce2.getCanonicalName();
        canonicalName.getClass();
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
        }
        String replace = canonicalName.replace('.', '_');
        replace.getClass();
        String concat = replace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, qoPGr6Ce2.getClassLoader());
            cls.getClass();
            v30 v30Var = (v30) cls.getDeclaredConstructor(null).newInstance(null);
            v30Var.getClass();
            v30Var.eVhOlqcC = true;
            try {
                weVar = v30Var.MdtA4re8();
                weVar.getClass();
            } catch (kw unused) {
                weVar = null;
            }
            wf wfVar = wf.NCTxEWno;
            ?? r9 = oaVar.VgvYg0wo;
            if (weVar == null) {
                new tKaxLBvG(v30Var);
                new u30(2, v30Var, w30.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0);
                zb zbVar2 = new zb();
                zbVar2.MdtA4re8 = oaVar;
                zbVar2.wxUZMvaN = new r30(-1, "", "");
                zbVar2.VgvYg0wo = r9 == 0 ? wfVar : r9;
                b2ZJblxo b2zjblxo = new b2ZJblxo(5, zbVar2);
                if (r9 != 0) {
                    wfVar = r9;
                }
                x5.orhfF2Ya(wfVar, new s30(b2zjblxo));
                throw new kw();
            }
            u30 u30Var = new u30(2, v30Var, w30.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 1);
            zb zbVar3 = new zb();
            zbVar3.MdtA4re8 = oaVar;
            zbVar3.wxUZMvaN = weVar;
            if (r9 != 0) {
                wfVar = r9;
            }
            zbVar3.VgvYg0wo = wfVar;
            t30 t30Var3 = oaVar.P7K7Inc8;
            g40 g40Var = oaVar.lDXGDhIF;
            String str2 = oaVar.NCTxEWno;
            if (g40Var != null) {
                zbVar3.b2ZJblxo = null;
                if (g40Var.amk52bBQ()) {
                    z7Var = new jz(new mcXgUFR8(zbVar3, g40Var), str2 != null ? str2 : ":memory:", u30Var);
                } else if (str2 == null) {
                    z7Var = new z7(new mcXgUFR8(zbVar3, g40Var));
                } else {
                    mcXgUFR8 mcxgufr8 = new mcXgUFR8(zbVar3, g40Var);
                    int ordinal = t30Var3.ordinal();
                    if (ordinal == 1) {
                        i = 1;
                    } else {
                        if (ordinal != 2) {
                            throw new IllegalStateException(("Can't get max number of reader for journal mode '" + t30Var3 + '\'').toString());
                        }
                        i = 4;
                    }
                    int ordinal2 = t30Var3.ordinal();
                    if (ordinal2 != 1 && ordinal2 != 2) {
                        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + t30Var3 + '\'').toString());
                    }
                    z7Var = new z7(mcxgufr8, str2, i);
                }
                zbVar3.P7K7Inc8 = z7Var;
                kkVar = null;
            } else {
                if (oaVar.MdtA4re8 == null) {
                    m1.sjUBp5pO("SQLiteManager was constructed with both null driver and open helper factory!");
                    throw null;
                }
                kkVar = new kk(oaVar.qoPGr6Ce, str2, new DPHdAVYO(zbVar3, weVar.qoPGr6Ce));
                zbVar3.b2ZJblxo = kkVar;
                zbVar3.P7K7Inc8 = new jz(new tg0(kkVar), str2 != null ? str2 : ":memory:", u30Var);
            }
            boolean z = t30Var3 == t30Var;
            if (kkVar != null) {
                kkVar.setWriteAheadLoggingEnabled(z);
            }
            v30Var.VgvYg0wo = zbVar3;
            v30Var.P7K7Inc8 = v30Var.NCTxEWno();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<p5> VgvYg0wo = v30Var.VgvYg0wo();
            List list = oaVar.OnDfzHZD;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            for (p5 p5Var : VgvYg0wo) {
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (p5Var.wxUZMvaN(list.get(size2))) {
                            zArr[size2] = true;
                            break;
                        }
                        if (i3 < 0) {
                            break;
                        }
                        size2 = i3;
                    }
                }
                size2 = -1;
                if (size2 < 0) {
                    m1.KlHjfFWx(p5Var.NCTxEWno(), ") is missing in the database configuration.", "A required auto migration spec (");
                    return null;
                }
                linkedHashMap.put(p5Var, list.get(size2));
            }
            int size3 = list.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i4 = size3 - 1;
                    if (size3 >= size || !zArr[size3]) {
                        break;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size3 = i4;
                }
                m1.sjUBp5pO("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                return null;
            }
            Iterator it2 = v30Var.qoPGr6Ce(linkedHashMap).iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                m1.qoPGr6Ce();
                return null;
            }
            LinkedHashMap P7K7Inc8 = v30Var.P7K7Inc8();
            List list2 = oaVar.ow5vqvCr;
            boolean[] zArr2 = new boolean[list2.size()];
            for (Map.Entry entry : P7K7Inc8.entrySet()) {
                p5 p5Var2 = (p5) entry.getKey();
                for (p5 p5Var3 : (List) entry.getValue()) {
                    int size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i5 = size4 - 1;
                            if (p5Var3.wxUZMvaN(list2.get(size4))) {
                                zArr2[size4] = true;
                                break;
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size4 = i5;
                        }
                        if (size4 >= 0) {
                            m1.amk52bBQ("A required type converter (", p5Var3.NCTxEWno(), ") for ", p5Var2.NCTxEWno(), " is missing in the database configuration.");
                            return null;
                        }
                        Object obj = list2.get(size4);
                        p5Var3.getClass();
                        obj.getClass();
                        v30Var.jb9XjC4I.put(p5Var3, obj);
                    }
                    size4 = -1;
                    if (size4 >= 0) {
                    }
                }
            }
            int size5 = list2.size() - 1;
            if (size5 >= 0) {
                while (true) {
                    int i6 = size5 - 1;
                    if (!zArr2[size5]) {
                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i6 < 0) {
                        break;
                    }
                    size5 = i6;
                }
            }
            v30Var.MdtA4re8 = oaVar.b2ZJblxo;
            v30Var.wxUZMvaN = new HzhOLUMW(oaVar.Qr9iLBAD);
            Executor executor = v30Var.MdtA4re8;
            if (executor == null) {
                fn.ytu5o6f4("internalQueryExecutor");
                throw null;
            }
            l9 WYNAV5pd = fn.WYNAV5pd(new kg(executor), new na0(null));
            if (WYNAV5pd.OnDfzHZD(re.VgvYg0wo) == null) {
                WYNAV5pd = WYNAV5pd.eVhOlqcC(new rn(null));
            }
            v30Var.qoPGr6Ce = new e9(WYNAV5pd);
            HzhOLUMW hzhOLUMW = v30Var.wxUZMvaN;
            if (hzhOLUMW == null) {
                fn.ytu5o6f4("internalTransactionExecutor");
                throw null;
            }
            v30Var.NCTxEWno = WYNAV5pd.eVhOlqcC(new kg(hzhOLUMW));
            zb zbVar4 = v30Var.VgvYg0wo;
            if (zbVar4 == null) {
                fn.ytu5o6f4("connectionManager");
                throw null;
            }
            ua0 ua0Var2 = (ua0) zbVar4.b2ZJblxo;
            if (ua0Var2 != null) {
                while (!(ua0Var2 instanceof b00)) {
                    if (ua0Var2 instanceof vb) {
                        ua0Var2 = ((vb) ua0Var2).VgvYg0wo();
                    }
                }
                zbVar = v30Var.VgvYg0wo;
                if (zbVar != null) {
                    fn.ytu5o6f4("connectionManager");
                    throw null;
                }
                ua0 ua0Var3 = (ua0) zbVar.b2ZJblxo;
                if (ua0Var3 != null) {
                    while (true) {
                        if (ua0Var3 instanceof g1) {
                            ua0Var = ua0Var3;
                            break;
                        }
                        if (!(ua0Var3 instanceof vb)) {
                            break;
                        }
                        ua0Var3 = ((vb) ua0Var3).VgvYg0wo();
                    }
                }
                return (BoardDatabase) v30Var;
            }
            ua0Var2 = null;
            zbVar = v30Var.VgvYg0wo;
            if (zbVar != null) {
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + qoPGr6Ce2.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + qoPGr6Ce2.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + qoPGr6Ce2.getCanonicalName(), e3);
        }
    }
}
