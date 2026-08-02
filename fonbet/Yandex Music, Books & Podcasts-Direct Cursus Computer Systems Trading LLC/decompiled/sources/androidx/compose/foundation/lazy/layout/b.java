package androidx.compose.foundation.lazy.layout;

import defpackage.ctf;
import defpackage.edi;
import defpackage.ltf;
import defpackage.mm6;
import defpackage.n5;
import defpackage.ntf;
import defpackage.otf;
import defpackage.tpi;
import defpackage.uod;
import defpackage.upi;
import defpackage.vso;
import defpackage.vtf;
import defpackage.wdc;
import defpackage.wpe;
import defpackage.wtf;
import defpackage.x0;
import defpackage.x97;
import defpackage.xci;
import defpackage.xod;
import defpackage.xso;
import defpackage.yci;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {
    public final tpi a;
    public x0 b;
    public int c;
    public final upi d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public ntf j;
    public final yci k;

    public b() {
        long[] jArr = vso.a;
        this.a = new tpi();
        int i = xso.a;
        this.d = new upi();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new edi(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
            public final b a;

            {
                this.a = this;
            }

            @Override // defpackage.edi
            public final xci e() {
                ntf ntfVar = new ntf();
                ntfVar.o = this.a;
                return ntfVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && this.a.equals(((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // defpackage.edi
            public final void j(xci xciVar) {
                ntf ntfVar = (ntf) xciVar;
                b bVar = ntfVar.o;
                b bVar2 = this.a;
                if (Intrinsics.d(bVar, bVar2) || !ntfVar.a.n) {
                    return;
                }
                b bVar3 = ntfVar.o;
                bVar3.e();
                bVar3.b = null;
                bVar3.c = -1;
                bVar2.j = ntfVar;
                ntfVar.o = bVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
            }
        };
    }

    public static void c(vtf vtfVar, int i, otf otfVar) {
        int i2 = 0;
        long i3 = vtfVar.i(0);
        long a = vtfVar.e() ? wpe.a(0, i, i3, 1) : wpe.a(i, 0, i3, 2);
        ltf[] ltfVarArr = otfVar.a;
        int length = ltfVarArr.length;
        int i4 = 0;
        while (i2 < length) {
            ltf ltfVar = ltfVarArr[i2];
            int i5 = i4 + 1;
            if (ltfVar != null) {
                ltfVar.l = wpe.d(a, wpe.c(vtfVar.i(i4), i3));
            }
            i2++;
            i4 = i5;
        }
    }

    public static int h(int[] iArr, vtf vtfVar) {
        int j = vtfVar.j();
        int c = vtfVar.c() + j;
        int i = 0;
        while (j < c) {
            int f = vtfVar.f() + iArr[j];
            iArr[j] = f;
            i = Math.max(i, f);
            j++;
        }
        return i;
    }

    public final ltf a(int i, Object obj) {
        otf otfVar = (otf) this.a.g(obj);
        if (otfVar != null) {
            return otfVar.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            ltf ltfVar = (ltf) arrayList.get(i);
            xod xodVar = ltfVar.n;
            if (xodVar != null) {
                j = (Math.max((int) (j & 4294967295L), ((int) (ltfVar.l & 4294967295L)) + ((int) (xodVar.u & 4294967295L))) & 4294967295L) | (Math.max((int) (j >> 32), ((int) (ltfVar.l >> 32)) + ((int) (xodVar.u >> 32))) << 32);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ce, code lost:
    
        if (r36 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d0, code lost:
    
        r1 = r29.a;
        r2 = r1.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d4, code lost:
    
        if (r4 >= r2) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d6, code lost:
    
        r5 = r1[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d8, code lost:
    
        if (r5 == null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01de, code lost:
    
        if (r5.b() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e0, code lost:
    
        r3.remove(r5);
        r13 = r48.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e5, code lost:
    
        if (r13 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e7, code lost:
    
        defpackage.vq1.Z(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ea, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ed, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f0, code lost:
    
        g(r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0132, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x012a, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x010e, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ff, code lost:
    
        f(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0210, code lost:
    
        r1 = new int[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0212, code lost:
    
        if (r20 == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0214, code lost:
    
        if (r7 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r8 = r48.c;
        r9 = (defpackage.vtf) kotlin.collections.CollectionsKt.firstOrNull(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x021a, code lost:
    
        if (r14.isEmpty() != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0221, code lost:
    
        if (r14.size() <= 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0223, code lost:
    
        defpackage.y75.s(r14, new defpackage.ptf(r7, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x022c, code lost:
    
        r2 = r14.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0231, code lost:
    
        if (r4 >= r2) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0233, code lost:
    
        r5 = (defpackage.vtf) r14.get(r4);
        r8 = r59 - h(r1, r5);
        r9 = r11.g(r5.getKey());
        r9.getClass();
        c(r5, r8, (defpackage.otf) r9);
        g(r5, false);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0256, code lost:
    
        java.util.Arrays.fill(r1, 0, r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x025e, code lost:
    
        if (r13.isEmpty() != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0265, code lost:
    
        if (r13.size() <= 1) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0267, code lost:
    
        defpackage.y75.s(r13, new defpackage.ptf(r7, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0270, code lost:
    
        r2 = r13.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0275, code lost:
    
        if (r4 >= r2) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0277, code lost:
    
        r5 = (defpackage.vtf) r13.get(r4);
        r8 = (h(r1, r5) + r60) - r5.f();
        r9 = r11.g(r5.getKey());
        r9.getClass();
        c(r5, r8, (defpackage.otf) r9);
        g(r5, false);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x029f, code lost:
    
        java.util.Arrays.fill(r1, 0, r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r9 = r9.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a3, code lost:
    
        r2 = r15.b;
        r4 = r15.a;
        r5 = r4.length - 2;
        r8 = r48.h;
        r9 = r48.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ae, code lost:
    
        if (r5 < 0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b0, code lost:
    
        r28 = r13;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02b3, code lost:
    
        r12 = r4[r10];
        r30 = r14;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02c1, code lost:
    
        if (((((~r12) << 7) & r12) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02c3, code lost:
    
        r14 = 8 - ((~(r10 - r5)) >>> 31);
        r31 = r12;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02cf, code lost:
    
        if (r12 >= r14) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d5, code lost:
    
        if ((r31 & 255) >= 128) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02d7, code lost:
    
        r13 = r2[(r10 << 3) + r12];
        r15 = (defpackage.otf) r11.g(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r48.c = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e2, code lost:
    
        if (r15 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e6, code lost:
    
        r33 = r2;
        r43 = r4;
        r4 = r53.A(r13);
        r34 = r11;
        r11 = java.lang.Math.min(r6, r15.e);
        r15.e = r11;
        r35 = r12;
        r15.d = java.lang.Math.min(r6 - r11, r15.d);
        r11 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0307, code lost:
    
        if (r4 != (-1)) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0309, code lost:
    
        r4 = r15.a;
        r12 = r4.length;
        r4 = 0;
        r37 = false;
        r38 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0313, code lost:
    
        if (r4 >= r12) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0315, code lost:
    
        r39 = r12;
        r12 = r4[r4];
        r40 = r38 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x031b, code lost:
    
        if (r12 == null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0321, code lost:
    
        if (r12.b() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0323, code lost:
    
        r42 = r4;
        r6 = r14;
        r2 = r15;
        r15 = r16;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r47 = r34;
        r28 = r35;
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r55 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0335, code lost:
    
        r29 = r1;
        r30 = r11;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0339, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0408, code lost:
    
        r4 = r42 + 1;
        r13 = r1;
        r14 = r6;
        r16 = r15;
        r35 = r28;
        r1 = r29;
        r11 = r30;
        r12 = r39;
        r38 = r40;
        r29 = r44;
        r28 = r45;
        r30 = r46;
        r34 = r47;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0348, code lost:
    
        if (((java.lang.Boolean) r12.k.getValue()).booleanValue() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x034a, code lost:
    
        r12.c();
        r15.a[r38] = r16;
        r3.remove(r12);
        r11 = r48.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0356, code lost:
    
        if (r11 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0358, code lost:
    
        defpackage.vq1.Z(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x035b, code lost:
    
        r42 = r4;
        r6 = r14;
        r2 = r15;
        r15 = r16;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r47 = r34;
        r28 = r35;
        r30 = 65535;
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r18 = 4294967295L;
        r9 = (r49 & 4294967295L) | (0 << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0370, code lost:
    
        r11 = r14;
        r14 = r12.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0373, code lost:
    
        if (r14 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0375, code lost:
    
        r41 = r13;
        r13 = r12.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x037d, code lost:
    
        if (r12.b() != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x037f, code lost:
    
        if (r13 != null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0398, code lost:
    
        r42 = r4;
        r12.e(true);
        r45 = r15;
        r15 = r16;
        r46 = r30;
        r47 = r34;
        r6 = r11;
        r2 = r45;
        r30 = 65535;
        r45 = r28;
        r44 = r29;
        r28 = r35;
        r29 = r1;
        r1 = r41;
        defpackage.x97.y(r12.a, r15, r15, new defpackage.akc(r12, r13, r14, r15, 23), 3);
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03df, code lost:
    
        if (r12.b() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03e1, code lost:
    
        r3.add(r12);
        r4 = r48.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03e6, code lost:
    
        if (r4 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r56 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03e8, code lost:
    
        defpackage.vq1.Z(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03eb, code lost:
    
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03ee, code lost:
    
        r12.c();
        r2.a[r38] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0381, code lost:
    
        r42 = r4;
        r6 = r11;
        r2 = r15;
        r15 = r16;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r47 = r34;
        r28 = r35;
        r30 = 65535;
        r29 = r1;
        r1 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03c6, code lost:
    
        r42 = r4;
        r6 = r11;
        r2 = r15;
        r15 = r16;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r47 = r34;
        r28 = r35;
        r30 = 65535;
        r29 = r1;
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03f6, code lost:
    
        r42 = r4;
        r6 = r14;
        r2 = r15;
        r15 = r16;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r47 = r34;
        r28 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0427, code lost:
    
        r6 = r14;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r47 = r34;
        r28 = r35;
        r29 = r1;
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r58 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0439, code lost:
    
        if (r37 != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x043b, code lost:
    
        f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04ce, code lost:
    
        r31 = r31 >> 8;
        r12 = r28 + 1;
        r14 = r6;
        r1 = r29;
        r2 = r33;
        r4 = r43;
        r29 = r44;
        r28 = r45;
        r30 = r46;
        r11 = r47;
        r16 = null;
        r6 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0440, code lost:
    
        r6 = r14;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r47 = r34;
        r28 = r35;
        r29 = r1;
        r11 = r15.b;
        r11.getClass();
        r37 = r54.a(r4, r15.d, r11.a, r15.e);
        r37.h();
        r11 = r15.a;
        r12 = r11.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0473, code lost:
    
        if (r13 >= r12) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0475, code lost:
    
        r14 = r11[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0477, code lost:
    
        if (r14 == null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0486, code lost:
    
        if (((java.lang.Boolean) r14.h.getValue()).booleanValue() != true) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0499, code lost:
    
        r15.a(r37, r61, r62, r59, r60, r15.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04ae, code lost:
    
        if (r4 >= r48.c) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04b0, code lost:
    
        r9.add(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x04b4, code lost:
    
        r8.add(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0489, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x048d, code lost:
    
        if (r7 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        r12 = r11.b;
        r13 = r11.a;
        r14 = r13.length - 2;
        r15 = r48.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0493, code lost:
    
        if (r4 != r7.A(r13)) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0495, code lost:
    
        f(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04ba, code lost:
    
        r33 = r2;
        r43 = r4;
        r47 = r11;
        r6 = r14;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r29 = r1;
        r28 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04e7, code lost:
    
        r33 = r2;
        r43 = r4;
        r47 = r11;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04fa, code lost:
    
        if (r14 != 8) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x050f, code lost:
    
        if (r10 == r5) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0511, code lost:
    
        r10 = r10 + 1;
        r6 = r57;
        r1 = r29;
        r2 = r33;
        r4 = r43;
        r15 = r44;
        r28 = r45;
        r14 = r46;
        r11 = r47;
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r14 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0535, code lost:
    
        if (r9.isEmpty() != false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x053c, code lost:
    
        if (r9.size() <= 1) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x053e, code lost:
    
        r5 = r53;
        defpackage.y75.s(r9, new defpackage.ptf(r5, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x054c, code lost:
    
        r1 = r9.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0551, code lost:
    
        if (r2 >= r1) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0553, code lost:
    
        r3 = (defpackage.vtf) r9.get(r2);
        r6 = r47;
        r4 = r6.g(r3.getKey());
        r4.getClass();
        r4 = (defpackage.otf) r4;
        r7 = r29;
        r10 = h(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x056e, code lost:
    
        if (r56 == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0570, code lost:
    
        r11 = (defpackage.vtf) kotlin.collections.CollectionsKt.Q(r52);
        r13 = r11.i(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x057f, code lost:
    
        if (r11.e() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0581, code lost:
    
        r11 = r13 & r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0583, code lost:
    
        r11 = (int) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x058a, code lost:
    
        r3.a(r11 - r10, r4.c, r50, r51);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0594, code lost:
    
        if (r20 == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0596, code lost:
    
        g(r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x059a, code lost:
    
        r2 = r2 + 1;
        r47 = r6;
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0585, code lost:
    
        r11 = r13 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        r12 = r13[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0588, code lost:
    
        r11 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x05a1, code lost:
    
        r10 = r50;
        r12 = r51;
        r7 = r29;
        r6 = r47;
        java.util.Arrays.fill(r7, 0, r57, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x05be, code lost:
    
        if (r8.isEmpty() != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x05c5, code lost:
    
        if (r8.size() <= 1) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05c7, code lost:
    
        defpackage.y75.s(r8, new defpackage.ptf(r5, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d0, code lost:
    
        r1 = r8.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05d5, code lost:
    
        if (r2 >= r1) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (((((~r12) << 7) & r12) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05d7, code lost:
    
        r3 = (defpackage.vtf) r8.get(r2);
        r4 = r6.g(r3.getKey());
        r4.getClass();
        r4 = (defpackage.otf) r4;
        r5 = h(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05ee, code lost:
    
        if (r56 == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05f0, code lost:
    
        r11 = (defpackage.vtf) kotlin.collections.CollectionsKt.Y(r52);
        r14 = r11.i(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05ff, code lost:
    
        if (r11.e() == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0601, code lost:
    
        r13 = r14 & r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0608, code lost:
    
        r11 = r11.f() + ((int) r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0610, code lost:
    
        r3.a((r11 - r3.f()) + r5, r4.c, r10, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x061c, code lost:
    
        if (r20 == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x061e, code lost:
    
        g(r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        r2 = 8 - ((~(r1 - r14)) >>> 31);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0621, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0605, code lost:
    
        r13 = r14 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x060e, code lost:
    
        r11 = r4.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0624, code lost:
    
        java.util.Collections.reverse(r9);
        r52.addAll(0, r9);
        r52.addAll(r8);
        r46.clear();
        r45.clear();
        r9.clear();
        r8.clear();
        r44.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x063f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x054a, code lost:
    
        r5 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        if (r3 >= r2) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x05b0, code lost:
    
        r10 = r50;
        r12 = r51;
        r5 = r53;
        r7 = r29;
        r6 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04fd, code lost:
    
        r33 = r2;
        r43 = r4;
        r47 = r11;
        r45 = r28;
        r44 = r29;
        r46 = r30;
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0527, code lost:
    
        r29 = r1;
        r47 = r11;
        r45 = r13;
        r46 = r14;
        r44 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0081, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x006c, code lost:
    
        r18 = 4294967295L;
        r9 = (r49 << 32) | (0 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0057, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        if ((r12 & 255) >= 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        r30 = r3;
        r15.a(r12[(r1 << 3) + r3]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        r12 = r12 >> 8;
        r3 = r30 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        r30 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r2 != 8) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        if (r1 == r14) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        r1 = r4.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        r3 = r48.i;
        r13 = r48.f;
        r14 = r48.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if (r2 >= r1) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        r12 = (defpackage.vtf) r4.get(r2);
        r28 = r1;
        r15.m(r12.getKey());
        r1 = r12.b();
        r35 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        if (r2 >= r1) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
    
        r29 = r1;
        r1 = r12.g(r2);
        r30 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
    
        if ((r1 instanceof defpackage.ctf) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010b, code lost:
    
        r1 = (defpackage.ctf) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0110, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f5, code lost:
    
        r2 = r30 + 1;
        r1 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
    
        r29 = (defpackage.otf) r11.g(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (r7 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        r1 = r7.A(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
    
        if (r1 != (-1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0133, code lost:
    
        if (r29 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0135, code lost:
    
        r3 = new defpackage.otf(r48);
        defpackage.otf.b(r3, r12, r61, r62, r59, r60);
        r36 = r2;
        r11.m(r12.getKey(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
    
        if (r12.getIndex() == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        if (r1 == (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015b, code lost:
    
        if (r1 >= r8) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        r14.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0206, code lost:
    
        r2 = r35 + 1;
        r4 = r52;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0162, code lost:
    
        r13.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        r13 = r12.i(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0170, code lost:
    
        if (r12.e() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        r1 = r13 & r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0179, code lost:
    
        c(r12, (int) r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017c, code lost:
    
        if (r36 == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        r1 = r3.a;
        r2 = r1.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0182, code lost:
    
        if (r3 >= r2) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
    
        r12 = r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0186, code lost:
    
        if (r12 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
    
        r12.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        r1 = r13 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018e, code lost:
    
        r36 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0190, code lost:
    
        if (r20 == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0192, code lost:
    
        defpackage.otf.b(r29, r12, r61, r62, r59, r60);
        r2 = r29.a;
        r13 = r2.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a5, code lost:
    
        if (r14 >= r13) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a7, code lost:
    
        r29 = r2;
        r2 = r29[r14];
        r30 = r13;
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01af, code lost:
    
        if (r2 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b9, code lost:
    
        if (defpackage.wpe.b(r2.l, defpackage.ltf.s) != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
    
        r2.l = defpackage.wpe.d(r2.l, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c3, code lost:
    
        r14 = r31 + 1;
        r2 = r29;
        r13 = r30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v22, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, pm6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, int i2, int i3, ArrayList arrayList, x0 x0Var, wtf wtfVar, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, mm6 mm6Var, uod uodVar) {
        Object obj;
        ArrayList arrayList2 = arrayList;
        int i7 = i4;
        x0 x0Var2 = this.b;
        this.b = x0Var;
        int size = arrayList2.size();
        int i8 = 0;
        loop0: while (true) {
            tpi tpiVar = this.a;
            if (i8 < size) {
                vtf vtfVar = (vtf) arrayList2.get(i8);
                int b = vtfVar.b();
                for (int i9 = 0; i9 < b; i9++) {
                    obj = null;
                    Object g = vtfVar.g(i9);
                    if ((g instanceof ctf ? (ctf) g : null) != null) {
                        break loop0;
                    }
                }
                i8++;
            } else {
                obj = null;
                if (tpiVar.i()) {
                    e();
                    return;
                }
            }
        }
    }

    public final void e() {
        tpi tpiVar = this.a;
        if (tpiVar.e != 0) {
            Object[] objArr = tpiVar.c;
            long[] jArr = tpiVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (ltf ltfVar : ((otf) objArr[(i << 3) + i3]).a) {
                                    if (ltfVar != null) {
                                        ltfVar.c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            tpiVar.a();
        }
    }

    public final void f(Object obj) {
        otf otfVar = (otf) this.a.k(obj);
        if (otfVar != null) {
            for (ltf ltfVar : otfVar.a) {
                if (ltfVar != null) {
                    ltfVar.c();
                }
            }
        }
    }

    public final void g(vtf vtfVar, boolean z) {
        Object g = this.a.g(vtfVar.getKey());
        g.getClass();
        ltf[] ltfVarArr = ((otf) g).a;
        int length = ltfVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            ltf ltfVar = ltfVarArr[i];
            int i3 = i2 + 1;
            if (ltfVar != null) {
                long i4 = vtfVar.i(i2);
                long j = ltfVar.l;
                if (!wpe.b(j, ltf.s) && !wpe.b(j, i4)) {
                    long c = wpe.c(i4, j);
                    wdc wdcVar = ltfVar.e;
                    if (wdcVar != null) {
                        long c2 = wpe.c(((wpe) ltfVar.q.getValue()).a, c);
                        ltfVar.g(c2);
                        ltfVar.f(true);
                        ltfVar.g = z;
                        x97.y(ltfVar.a, null, null, new n5(ltfVar, wdcVar, c2, (Continuation) null, 4), 3);
                        ltfVar.l = i4;
                    }
                }
                ltfVar.l = i4;
            }
            i++;
            i2 = i3;
        }
    }
}
