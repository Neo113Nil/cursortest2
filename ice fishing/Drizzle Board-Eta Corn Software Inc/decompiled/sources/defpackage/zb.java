package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zb {
    public Object MdtA4re8;
    public boolean NCTxEWno;
    public Object P7K7Inc8;
    public Object Qr9iLBAD;
    public List VgvYg0wo;
    public Object b2ZJblxo;
    public boolean qoPGr6Ce;
    public Object wxUZMvaN;

    public static void VgvYg0wo(f40 f40Var) {
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0("PRAGMA busy_timeout");
        try {
            Ey6iv0m0.amk52bBQ();
            long j = Ey6iv0m0.getLong(0);
            le0.eVhOlqcC(Ey6iv0m0, null);
            if (j < 3000) {
                w30.KlHjfFWx(f40Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                le0.eVhOlqcC(Ey6iv0m0, th);
                throw th2;
            }
        }
    }

    public void MdtA4re8() {
        u8 u8Var = (u8) this.MdtA4re8;
        ArrayList arrayList = (ArrayList) this.P7K7Inc8;
        ArrayList arrayList2 = (ArrayList) this.VgvYg0wo;
        arrayList2.clear();
        u8 u8Var2 = (u8) this.wxUZMvaN;
        u8Var2.wxUZMvaN.P7K7Inc8();
        u8Var2.VgvYg0wo.P7K7Inc8();
        arrayList2.add(u8Var2.wxUZMvaN);
        arrayList2.add(u8Var2.VgvYg0wo);
        ArrayList arrayList3 = u8Var2.SMax8wMR;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            t8 t8Var = (t8) obj;
            if (t8Var instanceof am) {
                bm bmVar = new bm(t8Var);
                t8Var.wxUZMvaN.P7K7Inc8();
                t8Var.VgvYg0wo.P7K7Inc8();
                bmVar.P7K7Inc8 = ((am) t8Var).X1t0wlBd;
                arrayList2.add(bmVar);
            } else {
                if (t8Var.RXQxj5Oe()) {
                    if (t8Var.NCTxEWno == null) {
                        t8Var.NCTxEWno = new c4(t8Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(t8Var.NCTxEWno);
                } else {
                    arrayList2.add(t8Var.wxUZMvaN);
                }
                if (t8Var.FySoLYna()) {
                    if (t8Var.MdtA4re8 == null) {
                        t8Var.MdtA4re8 = new c4(t8Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(t8Var.MdtA4re8);
                } else {
                    arrayList2.add(t8Var.VgvYg0wo);
                }
                if (t8Var instanceof y1) {
                    arrayList2.add(new hm(t8Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((th0) obj2).P7K7Inc8();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            th0 th0Var = (th0) obj3;
            if (th0Var.NCTxEWno != u8Var2) {
                th0Var.wxUZMvaN();
            }
        }
        arrayList.clear();
        b2ZJblxo(u8Var.wxUZMvaN, 0, arrayList);
        b2ZJblxo(u8Var.VgvYg0wo, 1, arrayList);
        this.qoPGr6Ce = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0269, code lost:
    
        Qr9iLBAD(r10, 0, r6, 0, r12);
        r12.wxUZMvaN.VgvYg0wo.wxUZMvaN(r12.lDXGDhIF());
        r12.VgvYg0wo.VgvYg0wo.wxUZMvaN(r12.jb9XjC4I());
        r12.qoPGr6Ce = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x028d, code lost:
    
        r6 = r10;
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00e3, code lost:
    
        if (r15 != 3) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e5, code lost:
    
        if (r6 != r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00e7, code lost:
    
        Qr9iLBAD(r0, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f0, code lost:
    
        r11 = r12.jb9XjC4I();
        Qr9iLBAD(1, (int) ((r11 * r12.KRabZ4CU) + 0.5f), 1, r11, r12);
        r12.wxUZMvaN.VgvYg0wo.wxUZMvaN(r12.lDXGDhIF());
        r12.VgvYg0wo.VgvYg0wo.wxUZMvaN(r12.jb9XjC4I());
        r12.qoPGr6Ce = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0127, code lost:
    
        r10 = r0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012a, code lost:
    
        if (r15 != 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012c, code lost:
    
        Qr9iLBAD(r10, 0, r6, 0, r12);
        r12.wxUZMvaN.VgvYg0wo.OnDfzHZD = r12.lDXGDhIF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0140, code lost:
    
        r0 = r10;
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0143, code lost:
    
        if (r15 != 2) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        r6 = r2[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0147, code lost:
    
        if (r6 == 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x014a, code lost:
    
        if (r6 != 4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014d, code lost:
    
        r6 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014f, code lost:
    
        Qr9iLBAD(1, (int) ((r4 * r25.lDXGDhIF()) + 0.5f), r10, r12.jb9XjC4I(), r12);
        r12.wxUZMvaN.VgvYg0wo.wxUZMvaN(r12.lDXGDhIF());
        r12.VgvYg0wo.VgvYg0wo.wxUZMvaN(r12.jb9XjC4I());
        r12.qoPGr6Ce = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0180, code lost:
    
        if (r7[r16].P7K7Inc8 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0186, code lost:
    
        if (r7[1].P7K7Inc8 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0188, code lost:
    
        Qr9iLBAD(r0, 0, r10, 0, r12);
        r12.wxUZMvaN.VgvYg0wo.wxUZMvaN(r12.lDXGDhIF());
        r12.VgvYg0wo.VgvYg0wo.wxUZMvaN(r12.jb9XjC4I());
        r12.qoPGr6Ce = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ab, code lost:
    
        r10 = r6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00ca, code lost:
    
        if (r6 == 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r13 == 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
    
        if (r13 != 3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        if (r6 == r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d8, code lost:
    
        if (r6 != 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00db, code lost:
    
        r10 = r6;
        r6 = 3;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ae, code lost:
    
        if (r10 != r6) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b0, code lost:
    
        if (r13 == r0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b2, code lost:
    
        if (r13 != r8) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b5, code lost:
    
        r7 = r6;
        r6 = r10;
        r10 = r0;
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0290, code lost:
    
        if (r13 != r7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0292, code lost:
    
        if (r6 != r7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0294, code lost:
    
        if (r15 == r0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0296, code lost:
    
        if (r1 != r0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x029a, code lost:
    
        if (r1 != 2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x029c, code lost:
    
        if (r15 != 2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02a0, code lost:
    
        if (r2[r16] != r8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02a4, code lost:
    
        if (r2[r0] != r8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02a6, code lost:
    
        Qr9iLBAD(r8, (int) ((r4 * r25.lDXGDhIF()) + 0.5f), r8, (int) ((r14 * r25.jb9XjC4I()) + 0.5f), r12);
        r12.wxUZMvaN.VgvYg0wo.wxUZMvaN(r12.lDXGDhIF());
        r12.VgvYg0wo.VgvYg0wo.wxUZMvaN(r12.jb9XjC4I());
        r12.qoPGr6Ce = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02d9, code lost:
    
        Qr9iLBAD(r10, 0, r10, 0, r12);
        r12.wxUZMvaN.VgvYg0wo.OnDfzHZD = r12.lDXGDhIF();
        r12.VgvYg0wo.VgvYg0wo.OnDfzHZD = r12.jb9XjC4I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bb, code lost:
    
        if (r1 != r6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bd, code lost:
    
        if (r13 != r0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bf, code lost:
    
        r20 = r8;
        Qr9iLBAD(r0, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cd, code lost:
    
        r9 = r12.lDXGDhIF();
        r0 = r12.KRabZ4CU;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d6, code lost:
    
        if (r12.gmkaJpmS != (-1)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d8, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01da, code lost:
    
        Qr9iLBAD(r20, r9, r20, (int) ((r9 * r0) + 0.5f), r12);
        r12.wxUZMvaN.VgvYg0wo.wxUZMvaN(r12.lDXGDhIF());
        r12.VgvYg0wo.VgvYg0wo.wxUZMvaN(r12.jb9XjC4I());
        r12.qoPGr6Ce = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01cb, code lost:
    
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0203, code lost:
    
        r6 = r10;
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0206, code lost:
    
        if (r1 != 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0208, code lost:
    
        Qr9iLBAD(r13, 0, r10, 0, r12);
        r12.VgvYg0wo.VgvYg0wo.OnDfzHZD = r12.jb9XjC4I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x021d, code lost:
    
        if (r1 != 2) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021f, code lost:
    
        r7 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0221, code lost:
    
        if (r7 == r8) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0224, code lost:
    
        if (r7 != 4) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0227, code lost:
    
        r0 = 1;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022a, code lost:
    
        Qr9iLBAD(r13, r12.lDXGDhIF(), r8, (int) ((r14 * r25.jb9XjC4I()) + 0.5f), r12);
        r12.wxUZMvaN.VgvYg0wo.wxUZMvaN(r12.lDXGDhIF());
        r12.VgvYg0wo.VgvYg0wo.wxUZMvaN(r12.jb9XjC4I());
        r12.qoPGr6Ce = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025f, code lost:
    
        if (r7[2].P7K7Inc8 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0267, code lost:
    
        if (r7[3].P7K7Inc8 != null) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void NCTxEWno(u8 u8Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = u8Var.SMax8wMR;
        int[] iArr = u8Var.N2kLh4D5;
        int size = arrayList.size();
        char c = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            t8 t8Var = (t8) obj;
            int[] iArr2 = t8Var.N2kLh4D5;
            e8[] e8VarArr = t8Var.FXJmAAN1;
            e8 e8Var = t8Var.aZz0PFXp;
            e8 e8Var2 = t8Var.pRiPUEwG;
            e8 e8Var3 = t8Var.VhgXwMj9;
            e8 e8Var4 = t8Var.eIA6dogk;
            int i8 = iArr2[c];
            int i9 = iArr2[1];
            char c2 = c;
            if (t8Var.LvHlPNBd == 8) {
                t8Var.qoPGr6Ce = true;
                c = c2;
            } else {
                float f = t8Var.FySoLYna;
                if (f < 1.0f && i8 == 3) {
                    t8Var.amk52bBQ = 2;
                }
                float f2 = t8Var.DK9slbsy;
                if (f2 < 1.0f && i9 == 3) {
                    t8Var.KlHjfFWx = 2;
                }
                if (t8Var.KRabZ4CU > 0.0f) {
                    i = 3;
                    if (i8 == 3) {
                        if (i9 != 2) {
                            i6 = 1;
                        }
                        t8Var.amk52bBQ = 3;
                    } else {
                        i6 = 1;
                    }
                    if (i9 == 3) {
                        if (i8 == 2 || i8 == i6) {
                            i = 3;
                            t8Var.KlHjfFWx = 3;
                        } else {
                            i = 3;
                        }
                    }
                    if (i8 == i && i9 == i) {
                        if (t8Var.amk52bBQ == 0) {
                            t8Var.amk52bBQ = i;
                        }
                        if (t8Var.KlHjfFWx == 0) {
                            t8Var.KlHjfFWx = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i8 == i && t8Var.amk52bBQ == 1 && (e8Var4.P7K7Inc8 == null || e8Var3.P7K7Inc8 == null)) {
                    i8 = 2;
                }
                if (i9 == 3 && t8Var.KlHjfFWx == 1 && (e8Var2.P7K7Inc8 == null || e8Var.P7K7Inc8 == null)) {
                    i9 = 2;
                }
                lm lmVar = t8Var.wxUZMvaN;
                lmVar.wxUZMvaN = i8;
                int i10 = t8Var.amk52bBQ;
                lmVar.qoPGr6Ce = i10;
                sf0 sf0Var = t8Var.VgvYg0wo;
                sf0Var.wxUZMvaN = i9;
                ArrayList arrayList2 = arrayList;
                int i11 = t8Var.KlHjfFWx;
                sf0Var.qoPGr6Ce = i11;
                int i12 = (i8 == 4 || i8 == 1) ? 2 : 2;
                if (i9 != 4) {
                    if (i9 == 1) {
                        i2 = 1;
                        int lDXGDhIF = t8Var.lDXGDhIF();
                        if (i8 != 4) {
                            i3 = (u8Var.lDXGDhIF() - e8Var4.b2ZJblxo) - e8Var3.b2ZJblxo;
                            i4 = i2;
                        } else {
                            i3 = lDXGDhIF;
                            i4 = i8;
                        }
                        int jb9XjC4I = t8Var.jb9XjC4I();
                        if (i9 != 4) {
                            jb9XjC4I = (u8Var.jb9XjC4I() - e8Var2.b2ZJblxo) - e8Var.b2ZJblxo;
                            i5 = i2;
                        } else {
                            i5 = i9;
                        }
                        Qr9iLBAD(i4, i3, i5, jb9XjC4I, t8Var);
                        t8Var.wxUZMvaN.VgvYg0wo.wxUZMvaN(t8Var.lDXGDhIF());
                        t8Var.VgvYg0wo.VgvYg0wo.wxUZMvaN(t8Var.jb9XjC4I());
                        t8Var.qoPGr6Ce = true;
                        c = c2;
                        arrayList = arrayList2;
                    }
                }
                i2 = 1;
                int lDXGDhIF2 = t8Var.lDXGDhIF();
                if (i8 != 4) {
                }
                int jb9XjC4I2 = t8Var.jb9XjC4I();
                if (i9 != 4) {
                }
                Qr9iLBAD(i4, i3, i5, jb9XjC4I2, t8Var);
                t8Var.wxUZMvaN.VgvYg0wo.wxUZMvaN(t8Var.lDXGDhIF());
                t8Var.VgvYg0wo.VgvYg0wo.wxUZMvaN(t8Var.jb9XjC4I());
                t8Var.qoPGr6Ce = true;
                c = c2;
                arrayList = arrayList2;
            }
        }
    }

    public void OnDfzHZD(f40 f40Var) {
        w30.KlHjfFWx(f40Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        w30.KlHjfFWx(f40Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((we) this.wxUZMvaN).NCTxEWno) + "')");
    }

    public void P7K7Inc8(f40 f40Var) {
        Object k30Var;
        we weVar = (we) this.wxUZMvaN;
        VgvYg0wo(f40Var);
        oa oaVar = (oa) this.MdtA4re8;
        t30 t30Var = oaVar.P7K7Inc8;
        t30 t30Var2 = t30.MdtA4re8;
        if (t30Var == t30Var2) {
            w30.KlHjfFWx(f40Var, "PRAGMA journal_mode = WAL");
        } else {
            w30.KlHjfFWx(f40Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (oaVar.P7K7Inc8 == t30Var2) {
            w30.KlHjfFWx(f40Var, "PRAGMA synchronous = NORMAL");
        } else {
            w30.KlHjfFWx(f40Var, "PRAGMA synchronous = FULL");
        }
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0("PRAGMA user_version");
        try {
            Ey6iv0m0.amk52bBQ();
            int i = (int) Ey6iv0m0.getLong(0);
            le0.eVhOlqcC(Ey6iv0m0, null);
            int i2 = weVar.qoPGr6Ce;
            int i3 = weVar.qoPGr6Ce;
            if (i != i2) {
                w30.KlHjfFWx(f40Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        eVhOlqcC(f40Var);
                    } else {
                        k3x7lurq(f40Var, i, i3);
                    }
                    w30.KlHjfFWx(f40Var, "PRAGMA user_version = " + i3);
                    k30Var = xe0.qoPGr6Ce;
                } catch (Throwable th) {
                    k30Var = new k30(th);
                }
                if (!(k30Var instanceof k30)) {
                    w30.KlHjfFWx(f40Var, "END TRANSACTION");
                }
                Throwable qoPGr6Ce = l30.qoPGr6Ce(k30Var);
                if (qoPGr6Ce != null) {
                    w30.KlHjfFWx(f40Var, "ROLLBACK TRANSACTION");
                    throw qoPGr6Ce;
                }
            }
            ow5vqvCr(f40Var);
        } finally {
        }
    }

    public void Qr9iLBAD(int i, int i2, int i3, int i4, t8 t8Var) {
        e2 e2Var = (e2) this.Qr9iLBAD;
        e2Var.qoPGr6Ce = i;
        e2Var.NCTxEWno = i3;
        e2Var.MdtA4re8 = i2;
        e2Var.wxUZMvaN = i4;
        ((j8) this.b2ZJblxo).NCTxEWno(t8Var, e2Var);
        t8Var.aZz0PFXp(e2Var.VgvYg0wo);
        t8Var.eIA6dogk(e2Var.P7K7Inc8);
        t8Var.euDDoUNr = e2Var.Qr9iLBAD;
        int i5 = e2Var.b2ZJblxo;
        t8Var.ESscZ9M1 = i5;
        t8Var.euDDoUNr = i5 > 0;
    }

    public void b2ZJblxo(th0 th0Var, int i, ArrayList arrayList) {
        ac acVar = th0Var.Qr9iLBAD;
        ac acVar2 = th0Var.jb9XjC4I;
        ArrayList arrayList2 = acVar.k3x7lurq;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            yb ybVar = (yb) obj;
            if (ybVar instanceof ac) {
                qoPGr6Ce((ac) ybVar, i, arrayList, null);
            } else if (ybVar instanceof th0) {
                qoPGr6Ce(((th0) ybVar).Qr9iLBAD, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = acVar2.k3x7lurq;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            yb ybVar2 = (yb) obj2;
            if (ybVar2 instanceof ac) {
                qoPGr6Ce((ac) ybVar2, i, arrayList, null);
            } else if (ybVar2 instanceof th0) {
                qoPGr6Ce(((th0) ybVar2).jb9XjC4I, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((sf0) th0Var).k3x7lurq.k3x7lurq;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                yb ybVar3 = (yb) obj3;
                if (ybVar3 instanceof ac) {
                    qoPGr6Ce((ac) ybVar3, i, arrayList, null);
                }
            }
        }
    }

    public void eVhOlqcC(f40 f40Var) {
        we weVar = (we) this.wxUZMvaN;
        f40Var.getClass();
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (Ey6iv0m0.amk52bBQ()) {
                if (Ey6iv0m0.getLong(0) == 0) {
                    z = true;
                }
            }
            le0.eVhOlqcC(Ey6iv0m0, null);
            weVar.qoPGr6Ce(f40Var);
            if (!z) {
                y30 RXQxj5Oe = weVar.RXQxj5Oe(f40Var);
                if (!RXQxj5Oe.qoPGr6Ce) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) RXQxj5Oe.NCTxEWno)).toString());
                }
            }
            OnDfzHZD(f40Var);
            weVar.amk52bBQ(f40Var);
            Iterator it = this.VgvYg0wo.iterator();
            while (it.hasNext()) {
                ((s30) it.next()).getClass();
                if (f40Var instanceof ta0) {
                    ((ta0) f40Var).NCTxEWno.getClass();
                }
            }
        } finally {
        }
    }

    public void jb9XjC4I() {
        d2 d2Var;
        zb zbVar = this;
        ArrayList arrayList = ((u8) zbVar.MdtA4re8).SMax8wMR;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            t8 t8Var = (t8) arrayList.get(i);
            if (!t8Var.qoPGr6Ce) {
                int[] iArr = t8Var.N2kLh4D5;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = t8Var.amk52bBQ;
                int i6 = t8Var.KlHjfFWx;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                zc zcVar = t8Var.wxUZMvaN.VgvYg0wo;
                boolean z3 = zcVar.eVhOlqcC;
                zc zcVar2 = t8Var.VgvYg0wo.VgvYg0wo;
                boolean z4 = zcVar2.eVhOlqcC;
                boolean z5 = z;
                if (z3 && z4) {
                    zbVar.Qr9iLBAD(1, zcVar.b2ZJblxo, 1, zcVar2.b2ZJblxo, t8Var);
                    t8Var.qoPGr6Ce = true;
                } else if (z3 && z2) {
                    Qr9iLBAD(1, zcVar.b2ZJblxo, 2, zcVar2.b2ZJblxo, t8Var);
                    sf0 sf0Var = t8Var.VgvYg0wo;
                    if (i4 == 3) {
                        sf0Var.VgvYg0wo.OnDfzHZD = t8Var.jb9XjC4I();
                    } else {
                        sf0Var.VgvYg0wo.wxUZMvaN(t8Var.jb9XjC4I());
                        t8Var.qoPGr6Ce = true;
                    }
                } else if (z4 && z5) {
                    Qr9iLBAD(2, zcVar.b2ZJblxo, 1, zcVar2.b2ZJblxo, t8Var);
                    lm lmVar = t8Var.wxUZMvaN;
                    if (i3 == 3) {
                        lmVar.VgvYg0wo.OnDfzHZD = t8Var.lDXGDhIF();
                    } else {
                        lmVar.VgvYg0wo.wxUZMvaN(t8Var.lDXGDhIF());
                        t8Var.qoPGr6Ce = true;
                    }
                }
                if (t8Var.qoPGr6Ce && (d2Var = t8Var.VgvYg0wo.ow5vqvCr) != null) {
                    d2Var.wxUZMvaN(t8Var.ESscZ9M1);
                }
                zbVar = this;
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k3x7lurq(f40 f40Var, int i, int i2) {
        boolean z;
        we weVar = (we) this.wxUZMvaN;
        f40Var.getClass();
        oa oaVar = (oa) this.MdtA4re8;
        List Qr9iLBAD = fn.Qr9iLBAD(oaVar.wxUZMvaN, i, i2);
        if (Qr9iLBAD != null) {
            weVar.I5GHvsYW(f40Var);
            Iterator it = Qr9iLBAD.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                m1.qoPGr6Ce();
                return;
            }
            y30 RXQxj5Oe = weVar.RXQxj5Oe(f40Var);
            if (RXQxj5Oe.qoPGr6Ce) {
                weVar.Ey6iv0m0(f40Var);
                OnDfzHZD(f40Var);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + ((String) RXQxj5Oe.NCTxEWno)).toString());
            }
        }
        oaVar.getClass();
        if (i <= i2 || !oaVar.eVhOlqcC) {
            Set set = oaVar.k3x7lurq;
            if (oaVar.jb9XjC4I && (set == null || !set.contains(Integer.valueOf(i)))) {
                z = true;
                if (!z) {
                    throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
                }
                if (oaVar.ygLcUYwZ) {
                    h40 Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                    try {
                        mp mpVar = new mp(10);
                        while (Ey6iv0m0.amk52bBQ()) {
                            String wxUZMvaN = Ey6iv0m0.wxUZMvaN(0);
                            if (!ja0.Ey6iv0m0(wxUZMvaN, "sqlite_") && !wxUZMvaN.equals("android_metadata")) {
                                mpVar.add(new hx(wxUZMvaN, Boolean.valueOf(fn.qoPGr6Ce(Ey6iv0m0.wxUZMvaN(1), "view"))));
                            }
                        }
                        mp P7K7Inc8 = ra.P7K7Inc8(mpVar);
                        le0.eVhOlqcC(Ey6iv0m0, null);
                        ListIterator listIterator = P7K7Inc8.listIterator(0);
                        while (true) {
                            kp kpVar = (kp) listIterator;
                            if (!kpVar.hasNext()) {
                                break;
                            }
                            hx hxVar = (hx) kpVar.next();
                            String str = (String) hxVar.NCTxEWno;
                            if (((Boolean) hxVar.MdtA4re8).booleanValue()) {
                                w30.KlHjfFWx(f40Var, "DROP VIEW IF EXISTS `" + str + '`');
                            } else {
                                w30.KlHjfFWx(f40Var, "DROP TABLE IF EXISTS `" + str + '`');
                            }
                        }
                    } finally {
                    }
                } else {
                    weVar.MdtA4re8(f40Var);
                }
                Iterator it2 = this.VgvYg0wo.iterator();
                while (it2.hasNext()) {
                    ((s30) it2.next()).getClass();
                    if (f40Var instanceof ta0) {
                        ((ta0) f40Var).NCTxEWno.getClass();
                    }
                }
                weVar.qoPGr6Ce(f40Var);
                return;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ow5vqvCr(f40 f40Var) {
        boolean z;
        Object k30Var;
        y30 RXQxj5Oe;
        f40Var.getClass();
        we weVar = (we) this.wxUZMvaN;
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (Ey6iv0m0.amk52bBQ()) {
                if (Ey6iv0m0.getLong(0) != 0) {
                    z = true;
                    le0.eVhOlqcC(Ey6iv0m0, null);
                    if (z) {
                        w30.KlHjfFWx(f40Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            RXQxj5Oe = weVar.RXQxj5Oe(f40Var);
                        } catch (Throwable th) {
                            k30Var = new k30(th);
                        }
                        if (!RXQxj5Oe.qoPGr6Ce) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) RXQxj5Oe.NCTxEWno)).toString());
                        }
                        weVar.Ey6iv0m0(f40Var);
                        OnDfzHZD(f40Var);
                        k30Var = xe0.qoPGr6Ce;
                        if (!(k30Var instanceof k30)) {
                            w30.KlHjfFWx(f40Var, "END TRANSACTION");
                        }
                        Throwable qoPGr6Ce = l30.qoPGr6Ce(k30Var);
                        if (qoPGr6Ce != null) {
                            w30.KlHjfFWx(f40Var, "ROLLBACK TRANSACTION");
                            throw qoPGr6Ce;
                        }
                    } else {
                        Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String wxUZMvaN = Ey6iv0m0.amk52bBQ() ? Ey6iv0m0.wxUZMvaN(0) : null;
                            le0.eVhOlqcC(Ey6iv0m0, null);
                            if (!((String) weVar.NCTxEWno).equals(wxUZMvaN) && !((String) weVar.MdtA4re8).equals(wxUZMvaN)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) weVar.NCTxEWno) + ", found: " + wxUZMvaN).toString());
                            }
                        } finally {
                        }
                    }
                    weVar.KlHjfFWx(f40Var);
                    for (s30 s30Var : this.VgvYg0wo) {
                        s30Var.getClass();
                        if (f40Var instanceof ta0) {
                            fk fkVar = ((ta0) f40Var).NCTxEWno;
                            fkVar.getClass();
                            s30Var.qoPGr6Ce.ow5vqvCr(fkVar);
                        }
                    }
                    this.qoPGr6Ce = true;
                }
            }
            z = false;
            le0.eVhOlqcC(Ey6iv0m0, null);
            if (z) {
            }
            weVar.KlHjfFWx(f40Var);
            while (r0.hasNext()) {
            }
            this.qoPGr6Ce = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public void qoPGr6Ce(ac acVar, int i, ArrayList arrayList, e40 e40Var) {
        th0 th0Var = acVar.wxUZMvaN;
        e40 e40Var2 = th0Var.MdtA4re8;
        ac acVar2 = th0Var.jb9XjC4I;
        ac acVar3 = th0Var.Qr9iLBAD;
        if (e40Var2 == null) {
            u8 u8Var = (u8) this.MdtA4re8;
            if (th0Var == u8Var.wxUZMvaN || th0Var == u8Var.VgvYg0wo) {
                return;
            }
            if (e40Var == null) {
                e40Var = new e40();
                e40Var.qoPGr6Ce = null;
                e40Var.NCTxEWno = new ArrayList();
                e40Var.qoPGr6Ce = th0Var;
                arrayList.add(e40Var);
            }
            th0Var.MdtA4re8 = e40Var;
            e40Var.NCTxEWno.add(th0Var);
            ArrayList arrayList2 = acVar3.k3x7lurq;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                yb ybVar = (yb) obj;
                if (ybVar instanceof ac) {
                    qoPGr6Ce((ac) ybVar, i, arrayList, e40Var);
                }
            }
            ArrayList arrayList3 = acVar2.k3x7lurq;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                yb ybVar2 = (yb) obj2;
                if (ybVar2 instanceof ac) {
                    qoPGr6Ce((ac) ybVar2, i, arrayList, e40Var);
                }
            }
            if (i == 1 && (th0Var instanceof sf0)) {
                ArrayList arrayList4 = ((sf0) th0Var).k3x7lurq.k3x7lurq;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    yb ybVar3 = (yb) obj3;
                    if (ybVar3 instanceof ac) {
                        qoPGr6Ce((ac) ybVar3, i, arrayList, e40Var);
                    }
                }
            }
            ArrayList arrayList5 = acVar3.ow5vqvCr;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                qoPGr6Ce((ac) obj4, i, arrayList, e40Var);
            }
            ArrayList arrayList6 = acVar2.ow5vqvCr;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                qoPGr6Ce((ac) obj5, i, arrayList, e40Var);
            }
            if (i == 1 && (th0Var instanceof sf0)) {
                ArrayList arrayList7 = ((sf0) th0Var).k3x7lurq.ow5vqvCr;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    qoPGr6Ce((ac) obj6, i, arrayList, e40Var);
                }
            }
        }
    }

    public int wxUZMvaN(u8 u8Var, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        u8 u8Var2 = u8Var;
        ArrayList arrayList2 = (ArrayList) this.P7K7Inc8;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            th0 th0Var = ((e40) arrayList2.get(i3)).qoPGr6Ce;
            if (!(th0Var instanceof c4) ? !(i != 0 ? (th0Var instanceof sf0) : (th0Var instanceof lm)) : ((c4) th0Var).P7K7Inc8 != i) {
                ac acVar = (i == 0 ? u8Var2.wxUZMvaN : u8Var2.VgvYg0wo).Qr9iLBAD;
                ac acVar2 = (i == 0 ? u8Var2.wxUZMvaN : u8Var2.VgvYg0wo).jb9XjC4I;
                ac acVar3 = th0Var.Qr9iLBAD;
                ac acVar4 = th0Var.jb9XjC4I;
                boolean contains = acVar3.ow5vqvCr.contains(acVar);
                boolean contains2 = acVar4.ow5vqvCr.contains(acVar2);
                long eVhOlqcC = th0Var.eVhOlqcC();
                if (contains && contains2) {
                    long NCTxEWno = e40.NCTxEWno(acVar3, j);
                    arrayList = arrayList2;
                    long qoPGr6Ce = e40.qoPGr6Ce(acVar4, j);
                    long j3 = NCTxEWno - eVhOlqcC;
                    int i4 = acVar4.P7K7Inc8;
                    i2 = i3;
                    if (j3 >= (-i4)) {
                        j3 += i4;
                    }
                    long j4 = acVar3.P7K7Inc8;
                    long j5 = ((-qoPGr6Ce) - eVhOlqcC) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    t8 t8Var = th0Var.NCTxEWno;
                    if (i == 0) {
                        f = t8Var.pP9Y2m6O;
                    } else if (i == 1) {
                        f = t8Var.tef3qNMP;
                    } else {
                        t8Var.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    max = (acVar3.P7K7Inc8 + ((((long) ((f2 * f) + 0.5f)) + eVhOlqcC) + ((long) (((1.0f - f) * f2) + 0.5f)))) - acVar4.P7K7Inc8;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(e40.NCTxEWno(acVar3, acVar3.P7K7Inc8), acVar3.P7K7Inc8 + eVhOlqcC) : contains2 ? Math.max(-e40.qoPGr6Ce(acVar4, acVar4.P7K7Inc8), (-acVar4.P7K7Inc8) + eVhOlqcC) : (th0Var.eVhOlqcC() + acVar3.P7K7Inc8) - acVar4.P7K7Inc8;
                }
            } else {
                arrayList = arrayList2;
                max = j;
                i2 = i3;
            }
            j2 = Math.max(j2, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            u8Var2 = u8Var;
            j = 0;
        }
        return (int) j2;
    }
}
