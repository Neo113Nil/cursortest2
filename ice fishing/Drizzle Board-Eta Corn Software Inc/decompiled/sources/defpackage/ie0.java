package defpackage;

import com.kolosta.rejin.jilosa.data.local.BoardDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ie0 {
    public static final String[] ow5vqvCr = {"INSERT", "UPDATE", "DELETE"};
    public final LinkedHashMap MdtA4re8;
    public final LinkedHashMap NCTxEWno;
    public final nw Qr9iLBAD;
    public final gn VgvYg0wo;
    public final String[] b2ZJblxo;
    public final tg0 jb9XjC4I;
    public final BoardDatabase_Impl qoPGr6Ce;
    public final boolean wxUZMvaN;
    public final AtomicBoolean eVhOlqcC = new AtomicBoolean(false);
    public ok k3x7lurq = new ek(6);
    public final LinkedHashMap P7K7Inc8 = new LinkedHashMap();

    public ie0(BoardDatabase_Impl boardDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, gn gnVar) {
        String str;
        this.qoPGr6Ce = boardDatabase_Impl;
        this.NCTxEWno = linkedHashMap;
        this.MdtA4re8 = linkedHashMap2;
        this.wxUZMvaN = z;
        this.VgvYg0wo = gnVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.P7K7Inc8.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.NCTxEWno.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.b2ZJblxo = strArr2;
        for (Map.Entry entry : this.NCTxEWno.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.P7K7Inc8.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.P7K7Inc8;
                linkedHashMap3.put(lowerCase3, zq.g2aRJUAd(linkedHashMap3, lowerCase2));
            }
        }
        this.Qr9iLBAD = new nw(this.b2ZJblxo.length);
        this.jb9XjC4I = new tg0(this.b2ZJblxo.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e1, code lost:
    
        if (defpackage.g50.wxUZMvaN(r7, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e3, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r13v5, types: [rz] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e1 -> B:11:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object MdtA4re8(md0 md0Var, int i, h9 h9Var) {
        ee0 ee0Var;
        int i2;
        md0 md0Var2;
        int i3;
        int i4;
        String[] strArr;
        rz rzVar;
        int i5;
        String str;
        if (h9Var instanceof ee0) {
            ee0Var = (ee0) h9Var;
            int i6 = ee0Var.OnDfzHZD;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ee0Var.OnDfzHZD = i6 - Integer.MIN_VALUE;
                Object obj = ee0Var.k3x7lurq;
                i2 = ee0Var.OnDfzHZD;
                u9 u9Var = u9.NCTxEWno;
                if (i2 != 0) {
                    fn.SgZGMMPL(obj);
                    ee0Var.VgvYg0wo = md0Var;
                    ee0Var.Qr9iLBAD = i;
                    ee0Var.OnDfzHZD = 1;
                    Object wxUZMvaN = g50.wxUZMvaN(md0Var, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)", ee0Var);
                    md0Var2 = md0Var;
                } else if (i2 == 1) {
                    i = ee0Var.Qr9iLBAD;
                    ?? r13 = ee0Var.VgvYg0wo;
                    fn.SgZGMMPL(obj);
                    md0Var2 = r13;
                } else {
                    if (i2 != 2) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = ee0Var.eVhOlqcC;
                    i4 = ee0Var.jb9XjC4I;
                    i3 = ee0Var.Qr9iLBAD;
                    strArr = ee0Var.b2ZJblxo;
                    str = ee0Var.P7K7Inc8;
                    rzVar = ee0Var.VgvYg0wo;
                    fn.SgZGMMPL(obj);
                    i4++;
                    if (i4 >= i5) {
                        return xe0.qoPGr6Ce;
                    }
                    String str2 = strArr[i4];
                    String str3 = "CREATE " + (this.wxUZMvaN ? "TEMP" : "") + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str2) + "` AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i3 + " AND invalidated = 0; END";
                    ee0Var.VgvYg0wo = rzVar;
                    ee0Var.P7K7Inc8 = str;
                    ee0Var.b2ZJblxo = strArr;
                    ee0Var.Qr9iLBAD = i3;
                    ee0Var.jb9XjC4I = i4;
                    ee0Var.eVhOlqcC = i5;
                    ee0Var.OnDfzHZD = 2;
                }
                String str4 = this.b2ZJblxo[i];
                i3 = i;
                i4 = 0;
                strArr = ow5vqvCr;
                rzVar = md0Var2;
                i5 = 3;
                str = str4;
                if (i4 >= i5) {
                }
            }
        }
        ee0Var = new ee0(this, h9Var);
        Object obj2 = ee0Var.k3x7lurq;
        i2 = ee0Var.OnDfzHZD;
        u9 u9Var2 = u9.NCTxEWno;
        if (i2 != 0) {
        }
        String str42 = this.b2ZJblxo[i];
        i3 = i;
        i4 = 0;
        strArr = ow5vqvCr;
        rzVar = md0Var2;
        i5 = 3;
        str = str42;
        if (i4 >= i5) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:11:0x0025, B:12:0x0072, B:14:0x007a, B:17:0x00b4, B:19:0x0083, B:20:0x0087, B:22:0x0094, B:24:0x009e, B:26:0x00a4, B:27:0x00a2, B:30:0x00a9, B:33:0x00ae), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object NCTxEWno(h9 h9Var) {
        ce0 ce0Var;
        int i;
        mcXgUFR8 mcxgufr8;
        Set set;
        Object Qr9iLBAD;
        int[] iArr;
        if (h9Var instanceof ce0) {
            ce0Var = (ce0) h9Var;
            int i2 = ce0Var.Qr9iLBAD;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ce0Var.Qr9iLBAD = i2 - Integer.MIN_VALUE;
                Object obj = ce0Var.P7K7Inc8;
                i = ce0Var.Qr9iLBAD;
                g9 g9Var = null;
                int i3 = 1;
                if (i != 0) {
                    fn.SgZGMMPL(obj);
                    BoardDatabase_Impl boardDatabase_Impl = this.qoPGr6Ce;
                    mcXgUFR8 mcxgufr82 = boardDatabase_Impl.b2ZJblxo;
                    boolean P7K7Inc8 = mcxgufr82.P7K7Inc8();
                    zf zfVar = zf.NCTxEWno;
                    if (!P7K7Inc8) {
                        return zfVar;
                    }
                    try {
                        if (!this.eVhOlqcC.compareAndSet(true, false)) {
                            mcxgufr82.fVMzMhyS();
                            return zfVar;
                        }
                        if (!((Boolean) this.k3x7lurq.qoPGr6Ce()).booleanValue()) {
                            mcxgufr82.fVMzMhyS();
                            return zfVar;
                        }
                        de0 de0Var = new de0(this, g9Var, i3);
                        ce0Var.VgvYg0wo = mcxgufr82;
                        ce0Var.Qr9iLBAD = 1;
                        obj = boardDatabase_Impl.eVhOlqcC(false, de0Var, ce0Var);
                        u9 u9Var = u9.NCTxEWno;
                        if (obj == u9Var) {
                            return u9Var;
                        }
                        mcxgufr8 = mcxgufr82;
                    } catch (Throwable th) {
                        th = th;
                        mcxgufr8 = mcxgufr82;
                        mcxgufr8.fVMzMhyS();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mcxgufr8 = ce0Var.VgvYg0wo;
                    try {
                        fn.SgZGMMPL(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        mcxgufr8.fVMzMhyS();
                        throw th;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    tg0 tg0Var = this.jb9XjC4I;
                    if (!set.isEmpty()) {
                        x90 x90Var = (x90) tg0Var.MdtA4re8;
                        do {
                            Qr9iLBAD = x90Var.Qr9iLBAD();
                            int[] iArr2 = (int[]) Qr9iLBAD;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                            }
                            lf lfVar = fn.OxcuoDLp;
                            if (Qr9iLBAD == null) {
                                Qr9iLBAD = lfVar;
                            }
                        } while (!x90Var.eVhOlqcC(Qr9iLBAD, iArr));
                    }
                    this.VgvYg0wo.ow5vqvCr(set);
                }
                mcxgufr8.fVMzMhyS();
                return set;
            }
        }
        ce0Var = new ce0(this, h9Var);
        Object obj2 = ce0Var.P7K7Inc8;
        i = ce0Var.Qr9iLBAD;
        g9 g9Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        mcxgufr8.fVMzMhyS();
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object VgvYg0wo(h9 h9Var) {
        ge0 ge0Var;
        int i;
        mcXgUFR8 mcxgufr8;
        if (h9Var instanceof ge0) {
            ge0Var = (ge0) h9Var;
            int i2 = ge0Var.Qr9iLBAD;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ge0Var.Qr9iLBAD = i2 - Integer.MIN_VALUE;
                Object obj = ge0Var.P7K7Inc8;
                i = ge0Var.Qr9iLBAD;
                if (i != 0) {
                    fn.SgZGMMPL(obj);
                    BoardDatabase_Impl boardDatabase_Impl = this.qoPGr6Ce;
                    mcXgUFR8 mcxgufr82 = boardDatabase_Impl.b2ZJblxo;
                    if (mcxgufr82.P7K7Inc8()) {
                        try {
                            k4 k4Var = new k4(this, null);
                            ge0Var.VgvYg0wo = mcxgufr82;
                            ge0Var.Qr9iLBAD = 1;
                            Object eVhOlqcC = boardDatabase_Impl.eVhOlqcC(false, k4Var, ge0Var);
                            u9 u9Var = u9.NCTxEWno;
                            if (eVhOlqcC == u9Var) {
                                return u9Var;
                            }
                            mcxgufr8 = mcxgufr82;
                        } catch (Throwable th) {
                            th = th;
                            mcxgufr8 = mcxgufr82;
                            mcxgufr8.fVMzMhyS();
                            throw th;
                        }
                    }
                    return xe0.qoPGr6Ce;
                }
                if (i != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mcxgufr8 = ge0Var.VgvYg0wo;
                try {
                    fn.SgZGMMPL(obj);
                } catch (Throwable th2) {
                    th = th2;
                    mcxgufr8.fVMzMhyS();
                    throw th;
                }
                mcxgufr8.fVMzMhyS();
                return xe0.qoPGr6Ce;
            }
        }
        ge0Var = new ge0(this, h9Var);
        Object obj2 = ge0Var.P7K7Inc8;
        i = ge0Var.Qr9iLBAD;
        if (i != 0) {
        }
        mcxgufr8.fVMzMhyS();
        return xe0.qoPGr6Ce;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object qoPGr6Ce(rz rzVar, h9 h9Var) {
        ae0 ae0Var;
        int i;
        Set set;
        if (h9Var instanceof ae0) {
            ae0Var = (ae0) h9Var;
            int i2 = ae0Var.Qr9iLBAD;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ae0Var.Qr9iLBAD = i2 - Integer.MIN_VALUE;
                Object obj = ae0Var.P7K7Inc8;
                i = ae0Var.Qr9iLBAD;
                u9 u9Var = u9.NCTxEWno;
                if (i != 0) {
                    fn.SgZGMMPL(obj);
                    x80 x80Var = new x80(5);
                    ae0Var.VgvYg0wo = rzVar;
                    ae0Var.Qr9iLBAD = 1;
                    obj = rzVar.wxUZMvaN("SELECT * FROM room_table_modification_log WHERE invalidated = 1", x80Var, ae0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) ae0Var.VgvYg0wo;
                        fn.SgZGMMPL(obj);
                        return set2;
                    }
                    rzVar = (rz) ae0Var.VgvYg0wo;
                    fn.SgZGMMPL(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    ae0Var.VgvYg0wo = set;
                    ae0Var.Qr9iLBAD = 2;
                    if (g50.wxUZMvaN(rzVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", ae0Var) == u9Var) {
                        return u9Var;
                    }
                }
                return set;
            }
        }
        ae0Var = new ae0(this, h9Var);
        Object obj2 = ae0Var.P7K7Inc8;
        i = ae0Var.Qr9iLBAD;
        u9 u9Var2 = u9.NCTxEWno;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v5, types: [rz] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0089 -> B:10:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object wxUZMvaN(md0 md0Var, int i, h9 h9Var) {
        fe0 fe0Var;
        int i2;
        String str;
        int i3;
        md0 md0Var2;
        int i4;
        String[] strArr;
        if (h9Var instanceof fe0) {
            fe0Var = (fe0) h9Var;
            int i5 = fe0Var.ow5vqvCr;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fe0Var.ow5vqvCr = i5 - Integer.MIN_VALUE;
                Object obj = fe0Var.eVhOlqcC;
                i2 = fe0Var.ow5vqvCr;
                if (i2 != 0) {
                    fn.SgZGMMPL(obj);
                    str = this.b2ZJblxo[i];
                    i3 = 3;
                    md0Var2 = md0Var;
                    i4 = 0;
                    strArr = ow5vqvCr;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = fe0Var.jb9XjC4I;
                    i4 = fe0Var.Qr9iLBAD;
                    String[] strArr2 = fe0Var.b2ZJblxo;
                    str = fe0Var.P7K7Inc8;
                    ?? r3 = fe0Var.VgvYg0wo;
                    fn.SgZGMMPL(obj);
                    strArr = strArr2;
                    md0Var2 = r3;
                    i4++;
                    if (i4 < i3) {
                        String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i4]) + '`';
                        fe0Var.VgvYg0wo = md0Var2;
                        fe0Var.P7K7Inc8 = str;
                        fe0Var.b2ZJblxo = strArr;
                        fe0Var.Qr9iLBAD = i4;
                        fe0Var.jb9XjC4I = i3;
                        fe0Var.ow5vqvCr = 1;
                        Object wxUZMvaN = g50.wxUZMvaN(md0Var2, str2, fe0Var);
                        u9 u9Var = u9.NCTxEWno;
                        if (wxUZMvaN == u9Var) {
                            return u9Var;
                        }
                        i4++;
                        if (i4 < i3) {
                            return xe0.qoPGr6Ce;
                        }
                    }
                }
            }
        }
        fe0Var = new fe0(this, h9Var);
        Object obj2 = fe0Var.eVhOlqcC;
        i2 = fe0Var.ow5vqvCr;
        if (i2 != 0) {
        }
    }
}
