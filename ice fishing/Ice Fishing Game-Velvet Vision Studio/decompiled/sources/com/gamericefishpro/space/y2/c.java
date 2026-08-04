package com.gamericefishpro.space.y2;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import com.gamericefishpro.space.b3.l;
import com.gamericefishpro.space.b3.q;
import com.gamericefishpro.space.b3.s;
import com.gamericefishpro.space.c3.n;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.ph.y;
import com.gamericefishpro.space.r2.b0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.r2.o;
import com.gamericefishpro.space.r2.p;
import com.gamericefishpro.space.r2.r;
import com.gamericefishpro.space.s4.w;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u2.b;
import com.gamericefishpro.space.u2.e;
import com.gamericefishpro.space.u2.i;
import com.gamericefishpro.space.u2.j;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.y2.c;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {
    public final CharSequence A;
    public final com.gamericefishpro.space.s2.d B;
    public com.gamericefishpro.space.r5.b C;
    public final boolean D;
    public final int E;
    public final String d;
    public final i0 e;
    public final List i;
    public final List v;
    public final com.gamericefishpro.space.u2.d w;
    public final com.gamericefishpro.space.c3.c y;
    public final e z;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:249:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:262:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:264:0x050a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0510  */
    /* JADX WARN: Code duplicated, block: B:268:0x0521  */
    /* JADX WARN: Code duplicated, block: B:269:0x0526  */
    /* JADX WARN: Code duplicated, block: B:271:0x052c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0532  */
    /* JADX WARN: Code duplicated, block: B:274:0x0552  */
    /* JADX WARN: Code duplicated, block: B:277:0x0564  */
    /* JADX WARN: Code duplicated, block: B:279:0x0570  */
    /* JADX WARN: Code duplicated, block: B:287:0x0582  */
    /* JADX WARN: Code duplicated, block: B:291:0x058c  */
    /* JADX WARN: Code duplicated, block: B:301:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:307:0x05af  */
    /* JADX WARN: Code duplicated, block: B:310:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:312:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:313:0x061c  */
    /* JADX WARN: Code duplicated, block: B:315:0x062b A[LOOP:9: B:314:0x0629->B:315:0x062b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x0644  */
    /* JADX WARN: Code duplicated, block: B:321:0x064c  */
    /* JADX WARN: Code duplicated, block: B:323:0x0653  */
    /* JADX WARN: Code duplicated, block: B:325:0x0657  */
    /* JADX WARN: Code duplicated, block: B:326:0x065c  */
    /* JADX WARN: Code duplicated, block: B:328:0x0664  */
    /* JADX WARN: Code duplicated, block: B:336:0x068f  */
    /* JADX WARN: Code duplicated, block: B:341:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:343:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:350:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:402:0x0806  */
    /* JADX WARN: Code duplicated, block: B:404:0x080d  */
    /* JADX WARN: Code duplicated, block: B:406:0x081b  */
    /* JADX WARN: Code duplicated, block: B:413:0x082f  */
    /* JADX WARN: Code duplicated, block: B:427:0x087e  */
    /* JADX WARN: Code duplicated, block: B:429:0x088f  */
    /* JADX WARN: Code duplicated, block: B:430:0x0893  */
    /* JADX WARN: Code duplicated, block: B:432:0x089e  */
    /* JADX WARN: Code duplicated, block: B:435:0x08a8 A[LOOP:7: B:434:0x08a6->B:435:0x08a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:438:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:440:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:442:0x08d1 A[LOOP:8: B:441:0x08cf->B:442:0x08d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:445:0x08de  */
    /* JADX WARN: Code duplicated, block: B:447:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:450:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:465:0x058f A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:440:0x08c4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.gamericefishpro.space.y2.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v37, types: [com.gamericefishpro.space.y2.c] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public c(String str, i0 i0Var, List list, List list2, com.gamericefishpro.space.u2.d dVar, com.gamericefishpro.space.c3.c cVar) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        final com.gamericefishpro.space.e6.a aVar;
        Typeface typeface;
        ?? arrayList;
        CharSequence charSequence;
        int i2;
        q qVar;
        p pVar;
        ArrayList arrayList2;
        int size;
        int i3;
        b0 b0Var;
        com.gamericefishpro.space.u2.b bVar;
        boolean z;
        b0 b0Var2;
        com.gamericefishpro.space.di.c cVar2;
        int size2;
        int i4;
        int[] iArr;
        int size3;
        int i5;
        int i6;
        int i7;
        int i8;
        int size4;
        b0 b0VarN;
        int i9;
        ArrayList arrayList3;
        b0 b0Var3;
        int i10;
        int i11;
        int size5;
        int i12;
        boolean z2;
        com.gamericefishpro.space.c3.c cVar3;
        com.gamericefishpro.space.c3.c cVar4;
        q qVar2;
        int size6;
        int i13;
        ?? r1;
        int i14;
        com.gamericefishpro.space.r2.c cVar5;
        long j;
        long jB;
        int size7;
        int i15;
        com.gamericefishpro.space.r2.c cVar6;
        com.gamericefishpro.space.r2.b bVar2;
        com.gamericefishpro.space.c3.c cVar7;
        int i16;
        Object eVar;
        com.gamericefishpro.space.r2.c cVar8;
        Object obj2;
        p pVar2;
        int i17;
        int i18;
        int i19;
        com.gamericefishpro.space.r2.c cVar9;
        Object obj3;
        b0 b0Var4;
        boolean z3;
        int i20;
        long j2;
        long j3;
        long jB2;
        long j4;
        float fC;
        long jB3;
        float fC2;
        r rVar;
        CharSequence charSequence2;
        r rVar2;
        com.gamericefishpro.space.x2.b bVar3;
        ?? obj4 = new Object();
        obj4.d = str;
        obj4.e = i0Var;
        obj4.i = list;
        obj4.v = list2;
        obj4.w = dVar;
        obj4.y = cVar;
        float fB = cVar.b();
        e eVar2 = new e(1);
        ((TextPaint) eVar2).density = fB;
        eVar2.b = l.b;
        eVar2.c = 3;
        eVar2.d = j0.d;
        obj4.z = eVar2;
        if (j.a(i0Var)) {
            u uVar = i.a;
            u uVar2 = i.a;
            s2 s2VarW = (s2) uVar2.e;
            if (s2VarW == null) {
                if (com.gamericefishpro.space.s4.k.c()) {
                    s2VarW = uVar2.w();
                    uVar2.e = s2VarW;
                } else {
                    s2VarW = j.a;
                }
            }
            zBooleanValue = ((Boolean) s2VarW.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        obj4.D = zBooleanValue;
        int i21 = i0Var.b.b;
        com.gamericefishpro.space.x2.b bVar4 = i0Var.a.k;
        int i22 = 2;
        if (i21 == 4) {
            i = 2;
        } else if (i21 == 5) {
            i = 3;
        } else if (i21 == 1) {
            i = 0;
        } else if (i21 == 2) {
            i = 1;
        } else {
            if (i21 != 3 && i21 != 0) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar4 == null || (locale = ((com.gamericefishpro.space.x2.a) bVar4.d.get(0)).a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        obj4.E = i;
        com.gamericefishpro.space.e6.a aVar2 = new com.gamericefishpro.space.e6.a(i22, obj4);
        s sVar = i0Var.b.i;
        sVar = sVar == null ? s.c : sVar;
        eVar2.setFlags(sVar.b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
        int i23 = sVar.a;
        if (i23 == 1) {
            eVar2.setFlags(eVar2.getFlags() | 64);
            eVar2.setHinting(0);
        } else if (i23 == 2) {
            eVar2.getFlags();
            eVar2.setHinting(1);
        } else if (i23 == 3) {
            eVar2.getFlags();
            eVar2.setHinting(0);
        } else {
            eVar2.getFlags();
        }
        b0 b0Var5 = i0Var.a;
        int size8 = list.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i24);
            if (((com.gamericefishpro.space.r2.c) obj).a instanceof b0) {
                break;
            } else {
                i24++;
            }
        }
        boolean z4 = obj != null;
        long j5 = b0Var5.b;
        String str2 = b0Var5.g;
        com.gamericefishpro.space.x2.b bVar5 = b0Var5.k;
        com.gamericefishpro.space.b3.o oVar = b0Var5.a;
        com.gamericefishpro.space.b3.p pVar3 = b0Var5.j;
        long j6 = b0Var5.h;
        long jB4 = n.b(j5);
        if (com.gamericefishpro.space.c3.o.a(jB4, 4294967296L)) {
            eVar2.setTextSize(cVar.V(j5));
        } else if (com.gamericefishpro.space.c3.o.a(jB4, 8589934592L)) {
            eVar2.setTextSize(n.c(j5) * eVar2.getTextSize());
        }
        com.gamericefishpro.space.u2.b bVar6 = b0Var5.f;
        if (bVar6 == null && b0Var5.d == null && b0Var5.c == null) {
            aVar = aVar2;
        } else {
            com.gamericefishpro.space.u2.k kVar = b0Var5.c;
            kVar = kVar == null ? com.gamericefishpro.space.u2.k.i : kVar;
            com.gamericefishpro.space.u2.i iVar = b0Var5.d;
            int i25 = iVar != null ? iVar.a : 0;
            com.gamericefishpro.space.u2.j jVar = b0Var5.e;
            int i26 = jVar != null ? jVar.a : 65535;
            aVar = aVar2;
            c cVar10 = (c) aVar.e;
            com.gamericefishpro.space.u2.q qVarB = ((com.gamericefishpro.space.u2.e) cVar10.w).b(bVar6, kVar, i25, i26);
            if (qVarB instanceof com.gamericefishpro.space.u2.q) {
                Object obj5 = qVarB.d;
                Intrinsics.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj5;
            } else {
                com.gamericefishpro.space.r5.b bVar7 = new com.gamericefishpro.space.r5.b(qVarB, cVar10.C);
                cVar10.C = bVar7;
                Object obj6 = bVar7.v;
                Intrinsics.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj6;
            }
            eVar2.setTypeface(typeface);
        }
        if (bVar5 != null) {
            com.gamericefishpro.space.x2.b bVar8 = com.gamericefishpro.space.x2.b.i;
            com.gamericefishpro.space.r5.b bVar9 = com.gamericefishpro.space.x2.c.a;
            bVar9.getClass();
            LocaleList localeList = LocaleList.getDefault();
            synchronized (((com.gamericefishpro.space.u4.b) bVar9.v)) {
                try {
                    bVar3 = (com.gamericefishpro.space.x2.b) bVar9.i;
                    if (bVar3 == null || localeList != ((LocaleList) bVar9.e)) {
                        int size9 = localeList.size();
                        ArrayList arrayList4 = new ArrayList(size9);
                        int i27 = 0;
                        while (i27 < size9) {
                            arrayList4.add(new com.gamericefishpro.space.x2.a(localeList.get(i27)));
                            i27++;
                            size9 = size9;
                        }
                        bVar3 = new com.gamericefishpro.space.x2.b(arrayList4);
                        bVar9.e = localeList;
                        bVar9.i = bVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!bVar5.equals(bVar3)) {
                ArrayList arrayList5 = new ArrayList(y.j(bVar5, 10));
                Iterator it = bVar5.d.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((com.gamericefishpro.space.x2.a) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList5.toArray(new Locale[0]);
                eVar2.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            eVar2.setFontFeatureSettings(str2);
        }
        if (pVar3 != null && !pVar3.equals(com.gamericefishpro.space.b3.p.c)) {
            eVar2.setTextScaleX(eVar2.getTextScaleX() * pVar3.a);
            eVar2.setTextSkewX(eVar2.getTextSkewX() + pVar3.b);
        }
        eVar2.d(oVar.b());
        eVar2.c(oVar.c(), 9205357640488583168L, oVar.a());
        eVar2.f(b0Var5.n);
        eVar2.g(b0Var5.m);
        eVar2.e(b0Var5.o);
        if (com.gamericefishpro.space.c3.o.a(n.b(j6), 4294967296L) && n.c(j6) != 0.0f) {
            float textScaleX = eVar2.getTextScaleX() * eVar2.getTextSize();
            float fV = cVar.V(j6);
            if (textScaleX != 0.0f) {
                eVar2.setLetterSpacing(fV / textScaleX);
            }
        } else if (com.gamericefishpro.space.c3.o.a(n.b(j6), 8589934592L)) {
            eVar2.setLetterSpacing(n.c(j6));
        }
        long j7 = b0Var5.l;
        com.gamericefishpro.space.b3.a aVar3 = b0Var5.i;
        boolean z5 = z4 && com.gamericefishpro.space.c3.o.a(n.b(j6), 4294967296L) && n.c(j6) != 0.0f;
        long j8 = com.gamericefishpro.space.o1.s.g;
        boolean z6 = (com.gamericefishpro.space.o1.s.d(j7, j8) || com.gamericefishpro.space.o1.s.d(j7, com.gamericefishpro.space.o1.s.f)) ? false : true;
        boolean z7 = (aVar3 == null || Float.compare(aVar3.a, 0.0f) == 0) ? false : true;
        b0 b0Var6 = (z5 || z6 || z7) ? new b0(0L, 0L, (com.gamericefishpro.space.u2.k) null, (com.gamericefishpro.space.u2.i) null, (com.gamericefishpro.space.u2.j) null, (com.gamericefishpro.space.u2.b) null, (String) null, z5 ? j6 : n.c, z7 ? aVar3 : null, (com.gamericefishpro.space.b3.p) null, (com.gamericefishpro.space.x2.b) null, z6 ? j7 : j8, (l) null, (j0) null, 63103) : null;
        if (b0Var6 != null) {
            int size10 = obj4.i.size() + 1;
            arrayList = new ArrayList(size10);
            int i28 = 0;
            while (i28 < size10) {
                arrayList.add(i28 == 0 ? new com.gamericefishpro.space.r2.c(0, obj4.d.length(), b0Var6) : (com.gamericefishpro.space.r2.c) obj4.i.get(i28 - 1));
                i28++;
            }
        } else {
            arrayList = obj4.i;
        }
        String str3 = obj4.d;
        float textSize = obj4.z.getTextSize();
        i0 i0Var2 = obj4.e;
        List list3 = obj4.v;
        com.gamericefishpro.space.c3.c cVar11 = obj4.y;
        boolean z8 = obj4.D;
        a aVar4 = b.a;
        if (z8 && com.gamericefishpro.space.s4.k.c()) {
            com.gamericefishpro.space.r2.s sVar2 = i0Var2.c;
            com.gamericefishpro.space.r2.h hVar = (sVar2 == null || (rVar2 = sVar2.a) == null) ? null : new com.gamericefishpro.space.r2.h(rVar2.b);
            CharSequence charSequenceF = com.gamericefishpro.space.s4.k.a().f(0, str3.length(), (hVar != null && hVar.a == 2) ? 1 : 0, str3);
            Intrinsics.b(charSequenceF);
            charSequence = charSequenceF;
        } else {
            charSequence = str3;
        }
        if (!arrayList.isEmpty() || !list3.isEmpty() || !Intrinsics.a(i0Var2.b.d, q.c) || (i0Var2.b.c & 1095216660480L) != 0) {
            r1 = obj4;
            charSequence2 = charSequence;
            final Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            b0 b0Var7 = i0Var2.a;
            p pVar4 = i0Var2.b;
            if (Intrinsics.a(b0Var7.m, l.c)) {
                spannableString.setSpan(b.a, 0, str3.length(), 33);
            }
            com.gamericefishpro.space.r2.s sVar3 = i0Var2.c;
            if (((sVar3 == null || (rVar = sVar3.a) == null) ? false : rVar.a) && pVar4.f == null) {
                float fT = d5.T(pVar4.c, textSize, cVar11);
                if (!Float.isNaN(fT)) {
                    spannableString.setSpan(new com.gamericefishpro.space.t2.g(fT), 0, spannableString.length(), 33);
                }
            } else {
                com.gamericefishpro.space.b3.i iVar2 = pVar4.f;
                iVar2 = iVar2 == null ? com.gamericefishpro.space.b3.i.d : iVar2;
                float fT2 = d5.T(pVar4.c, textSize, cVar11);
                if (!Float.isNaN(fT2)) {
                    int length = (spannableString.length() == 0 || kotlin.text.g.q(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i29 = iVar2.b;
                    i2 = 0;
                    spannableString.setSpan(new com.gamericefishpro.space.t2.h(fT2, length, (i29 & 1) > 0, (i29 & 16) > 0, iVar2.a, iVar2.c), 0, spannableString.length(), 33);
                }
                qVar = pVar4.d;
                if (qVar != null) {
                    i20 = i2;
                    j2 = qVar.a;
                    j3 = qVar.b;
                    if ((!n.a(j2, com.gamericefishpro.space.hj.c.C(i20)) && n.a(j3, com.gamericefishpro.space.hj.c.C(i20))) || (j2 & 1095216660480L) == r12 || (j3 & 1095216660480L) == 0) {
                        pVar = pVar4;
                    } else {
                        jB2 = n.b(j2);
                        pVar = pVar4;
                        if (com.gamericefishpro.space.c3.o.a(jB2, 4294967296L)) {
                            fC = cVar11.V(j2);
                            j4 = 8589934592L;
                        } else {
                            j4 = 8589934592L;
                            if (com.gamericefishpro.space.c3.o.a(jB2, 8589934592L)) {
                                fC = n.c(j2) * textSize;
                            } else {
                                fC = 0.0f;
                            }
                        }
                        jB3 = n.b(j3);
                        if (com.gamericefishpro.space.c3.o.a(jB3, 4294967296L)) {
                            fC2 = cVar11.V(j3);
                        } else if (com.gamericefishpro.space.c3.o.a(jB3, j4)) {
                            fC2 = textSize * n.c(j3);
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                } else {
                    pVar = pVar4;
                }
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                for (i3 = 0; i3 < size; i3++) {
                    cVar9 = (com.gamericefishpro.space.r2.c) arrayList.get(i3);
                    obj3 = cVar9.a;
                    if (obj3 instanceof b0) {
                        b0Var4 = (b0) obj3;
                        if (b0Var4.f != null && b0Var4.d == null && b0Var4.c == null) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3 || ((b0) obj3).e != null) {
                            arrayList2.add(cVar9);
                        }
                    }
                }
                b0Var = i0Var2.a;
                bVar = b0Var.f;
                if (bVar != null && b0Var.d == null && b0Var.c == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && b0Var.e == null) {
                    b0Var2 = null;
                } else {
                    b0Var2 = new b0(0L, 0L, b0Var.c, b0Var.d, b0Var.e, bVar, (String) null, 0L, (com.gamericefishpro.space.b3.a) null, (com.gamericefishpro.space.b3.p) null, (com.gamericefishpro.space.x2.b) null, 0L, (l) null, (j0) null, 65475);
                }
                cVar2 = new com.gamericefishpro.space.di.c() { // from class: com.gamericefishpro.space.z2.a
                    @Override // com.gamericefishpro.space.di.c
                    public final Object a(Object obj7, Object obj8, Object obj9) {
                        Typeface typeface2;
                        b0 b0Var8 = (b0) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        int iIntValue2 = ((Integer) obj9).intValue();
                        b bVar10 = b0Var8.f;
                        k kVar2 = b0Var8.c;
                        if (kVar2 == null) {
                            kVar2 = k.i;
                        }
                        i iVar3 = b0Var8.d;
                        int i30 = iVar3 != null ? iVar3.a : 0;
                        j jVar2 = b0Var8.e;
                        int i31 = jVar2 != null ? jVar2.a : 65535;
                        c cVar12 = (c) aVar.e;
                        com.gamericefishpro.space.u2.q qVarB2 = ((e) cVar12.w).b(bVar10, kVar2, i30, i31);
                        if (qVarB2 instanceof com.gamericefishpro.space.u2.q) {
                            Object obj10 = qVarB2.d;
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.graphics.Typeface");
                            typeface2 = (Typeface) obj10;
                        } else {
                            com.gamericefishpro.space.r5.b bVar11 = new com.gamericefishpro.space.r5.b(qVarB2, cVar12.C);
                            cVar12.C = bVar11;
                            Object obj11 = bVar11.v;
                            Intrinsics.c(obj11, "null cannot be cast to non-null type android.graphics.Typeface");
                            typeface2 = (Typeface) obj11;
                        }
                        spannableString.setSpan(new com.gamericefishpro.space.t2.b(1, typeface2), iIntValue, iIntValue2, 33);
                        return Unit.a;
                    }
                };
                if (arrayList2.size() <= 1) {
                    size2 = arrayList2.size();
                    i4 = size2 * 2;
                    iArr = new int[i4];
                    size3 = arrayList2.size();
                    for (i5 = 0; i5 < size3; i5++) {
                        com.gamericefishpro.space.r2.c cVar12 = (com.gamericefishpro.space.r2.c) arrayList2.get(i5);
                        iArr[i5] = cVar12.b;
                        iArr[i5 + size2] = cVar12.c;
                    }
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    if (i4 > 1) {
                        Arrays.sort(iArr);
                    }
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    if (i4 != 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    i6 = iArr[0];
                    i7 = 0;
                    while (i7 < i4) {
                        i8 = iArr[i7];
                        if (i8 == i6) {
                            arrayList3 = arrayList2;
                            b0Var3 = b0Var2;
                        } else {
                            size4 = arrayList2.size();
                            b0VarN = b0Var2;
                            i9 = 0;
                            while (i9 < size4) {
                                com.gamericefishpro.space.r2.c cVar13 = (com.gamericefishpro.space.r2.c) arrayList2.get(i9);
                                ArrayList arrayList6 = arrayList2;
                                i10 = cVar13.b;
                                b0 b0Var8 = b0Var2;
                                i11 = cVar13.c;
                                if (i10 == i11 && com.gamericefishpro.space.r2.f.a(i6, i8, i10, i11)) {
                                    b0VarN = d5.N(b0VarN, (b0) cVar13.a);
                                }
                                i9++;
                                arrayList2 = arrayList6;
                                b0Var2 = b0Var8;
                            }
                            arrayList3 = arrayList2;
                            b0Var3 = b0Var2;
                            if (b0VarN != null) {
                                cVar2.a(b0VarN, Integer.valueOf(i6), Integer.valueOf(i8));
                            }
                            i6 = i8;
                        }
                        i7++;
                        arrayList2 = arrayList3;
                        b0Var2 = b0Var3;
                    }
                } else if (!arrayList2.isEmpty()) {
                    cVar2.a(d5.N(b0Var2, (b0) ((com.gamericefishpro.space.r2.c) arrayList2.get(0)).a), Integer.valueOf(((com.gamericefishpro.space.r2.c) arrayList2.get(0)).b), Integer.valueOf(((com.gamericefishpro.space.r2.c) arrayList2.get(0)).c));
                }
                size5 = arrayList.size();
                i12 = 0;
                z2 = false;
                while (i12 < size5) {
                    cVar8 = (com.gamericefishpro.space.r2.c) arrayList.get(i12);
                    obj2 = cVar8.a;
                    if (obj2 instanceof b0) {
                        i17 = cVar8.b;
                        int i30 = cVar8.c;
                        if (i17 >= 0 || i17 >= spannableString.length() || i30 <= i17 || i30 > spannableString.length()) {
                            pVar2 = pVar;
                            size5 = size5;
                            i12 = i12;
                            z2 = z2;
                        } else {
                            b0 b0Var9 = (b0) obj2;
                            long j9 = b0Var9.h;
                            com.gamericefishpro.space.b3.a aVar5 = b0Var9.i;
                            com.gamericefishpro.space.b3.o oVar2 = b0Var9.a;
                            if (aVar5 != null) {
                                spannableString.setSpan(new com.gamericefishpro.space.t2.a(0, aVar5.a), i17, i30, 33);
                            }
                            d5.V(spannableString, oVar2.b(), i17, i30);
                            com.gamericefishpro.space.o1.o oVarC = oVar2.c();
                            float fA = oVar2.a();
                            if (oVarC != null) {
                                if (oVarC instanceof m0) {
                                    d5.V(spannableString, ((m0) oVarC).f, i17, i30);
                                } else {
                                    spannableString.setSpan(new com.gamericefishpro.space.a3.c((com.gamericefishpro.space.o1.i0) oVarC, fA), i17, i30, 33);
                                }
                            }
                            l lVar = b0Var9.m;
                            if (lVar != null) {
                                int i31 = lVar.a;
                                com.gamericefishpro.space.t2.k kVar2 = new com.gamericefishpro.space.t2.k((i31 | 1) == i31, (i31 | 2) == i31);
                                i18 = 33;
                                spannableString.setSpan(kVar2, i17, i30, 33);
                            } else {
                                i18 = 33;
                            }
                            int i32 = i18;
                            pVar2 = pVar;
                            d5.W(spannableString, b0Var9.b, cVar11, i17, i30);
                            String str4 = b0Var9.g;
                            if (str4 != null) {
                                spannableString.setSpan(new com.gamericefishpro.space.t2.b(0, str4), i17, i30, i32);
                            }
                            com.gamericefishpro.space.b3.p pVar5 = b0Var9.j;
                            if (pVar5 != null) {
                                spannableString.setSpan(new ScaleXSpan(pVar5.a), i17, i30, i32);
                                spannableString.setSpan(new com.gamericefishpro.space.t2.a(1, pVar5.b), i17, i30, i32);
                            }
                            d5.Y(spannableString, b0Var9.k, i17, i30);
                            long j10 = b0Var9.l;
                            if (j10 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(com.gamericefishpro.space.o1.o.y(j10)), i17, i30, i32);
                            }
                            j0 j0Var = b0Var9.n;
                            if (j0Var != null) {
                                long j11 = j0Var.b;
                                int iY = com.gamericefishpro.space.o1.o.y(j0Var.a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                                float f = j0Var.c;
                                com.gamericefishpro.space.t2.j jVar2 = new com.gamericefishpro.space.t2.j(iY, fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f);
                                i19 = 33;
                                spannableString.setSpan(jVar2, i17, i30, 33);
                            } else {
                                i19 = i32;
                            }
                            com.gamericefishpro.space.q1.c cVar14 = b0Var9.o;
                            if (cVar14 != null) {
                                spannableString.setSpan(new com.gamericefishpro.space.a3.a(cVar14), i17, i30, i19);
                            }
                            z2 = (com.gamericefishpro.space.c3.o.a(n.b(j9), 4294967296L) || com.gamericefishpro.space.c3.o.a(n.b(j9), 8589934592L)) ? true : z2;
                        }
                        z2 = z2;
                    } else {
                        pVar2 = pVar;
                        size5 = size5;
                        i12 = i12;
                        z2 = z2;
                        z2 = z2;
                    }
                    i12++;
                    size5 = size5;
                    cVar11 = cVar11;
                    pVar = pVar2;
                }
                p pVar6 = pVar;
                cVar3 = cVar11;
                if (z2) {
                    size7 = arrayList.size();
                    i15 = 0;
                    while (i15 < size7) {
                        cVar6 = (com.gamericefishpro.space.r2.c) arrayList.get(i15);
                        bVar2 = (com.gamericefishpro.space.r2.b) cVar6.a;
                        if (bVar2 instanceof b0) {
                            i16 = cVar6.b;
                            int i33 = cVar6.c;
                            if (i16 >= 0 || i16 >= spannableString.length() || i33 <= i16 || i33 > spannableString.length()) {
                                cVar7 = cVar3;
                            } else {
                                long j12 = ((b0) bVar2).h;
                                long jB5 = n.b(j12);
                                if (com.gamericefishpro.space.c3.o.a(jB5, 4294967296L)) {
                                    cVar7 = cVar3;
                                    eVar = new com.gamericefishpro.space.t2.f(cVar7.V(j12));
                                } else {
                                    cVar7 = cVar3;
                                    eVar = com.gamericefishpro.space.c3.o.a(jB5, 8589934592L) ? new com.gamericefishpro.space.t2.e(n.c(j12)) : null;
                                }
                                if (eVar != null) {
                                    spannableString.setSpan(eVar, i16, i33, 33);
                                }
                            }
                        } else {
                            cVar7 = cVar3;
                        }
                        i15++;
                        cVar3 = cVar7;
                    }
                }
                cVar4 = cVar3;
                qVar2 = pVar6.d;
                if (qVar2 != null) {
                    j = qVar2.a;
                    jB = n.b(j);
                    if (com.gamericefishpro.space.c3.o.a(jB, 4294967296L)) {
                        cVar4.V(j);
                    } else if (com.gamericefishpro.space.c3.o.a(jB, 8589934592L)) {
                        n.c(j);
                    }
                }
                size6 = arrayList.size();
                for (i13 = 0; i13 < size6; i13++) {
                    Object obj7 = ((com.gamericefishpro.space.r2.c) arrayList.get(i13)).a;
                }
                if (list3.size() > 0) {
                    cVar5 = (com.gamericefishpro.space.r2.c) list3.get(0);
                    if (cVar5.a == null) {
                        throw new ClassCastException();
                    }
                    for (Object obj8 : spannableString.getSpans(cVar5.b, cVar5.c, w.class)) {
                        spannableString.removeSpan((w) obj8);
                    }
                    throw null;
                }
                r1 = this;
                charSequence2 = spannableString;
            }
            i2 = 0;
            qVar = pVar4.d;
            if (qVar != null) {
                i20 = i2;
                j2 = qVar.a;
                j3 = qVar.b;
                if (!n.a(j2, com.gamericefishpro.space.hj.c.C(i20))) {
                    jB2 = n.b(j2);
                    pVar = pVar4;
                    if (com.gamericefishpro.space.c3.o.a(jB2, 4294967296L)) {
                        fC = cVar11.V(j2);
                        j4 = 8589934592L;
                    } else {
                        j4 = 8589934592L;
                        if (com.gamericefishpro.space.c3.o.a(jB2, 8589934592L)) {
                            fC = n.c(j2) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                    }
                    jB3 = n.b(j3);
                    if (com.gamericefishpro.space.c3.o.a(jB3, 4294967296L)) {
                        fC2 = cVar11.V(j3);
                    } else if (com.gamericefishpro.space.c3.o.a(jB3, j4)) {
                        fC2 = textSize * n.c(j3);
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB2 = n.b(j2);
                    pVar = pVar4;
                    if (com.gamericefishpro.space.c3.o.a(jB2, 4294967296L)) {
                        fC = cVar11.V(j2);
                        j4 = 8589934592L;
                    } else {
                        j4 = 8589934592L;
                        if (com.gamericefishpro.space.c3.o.a(jB2, 8589934592L)) {
                            fC = n.c(j2) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                    }
                    jB3 = n.b(j3);
                    if (com.gamericefishpro.space.c3.o.a(jB3, 4294967296L)) {
                        fC2 = cVar11.V(j3);
                    } else if (com.gamericefishpro.space.c3.o.a(jB3, j4)) {
                        fC2 = textSize * n.c(j3);
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
            } else {
                pVar = pVar4;
            }
            arrayList2 = new ArrayList(arrayList.size());
            size = arrayList.size();
            while (i3 < size) {
                cVar9 = (com.gamericefishpro.space.r2.c) arrayList.get(i3);
                obj3 = cVar9.a;
                if (obj3 instanceof b0) {
                    b0Var4 = (b0) obj3;
                    if (b0Var4.f != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        arrayList2.add(cVar9);
                    } else {
                        arrayList2.add(cVar9);
                    }
                }
            }
            b0Var = i0Var2.a;
            bVar = b0Var.f;
            if (bVar != null) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                b0Var2 = new b0(0L, 0L, b0Var.c, b0Var.d, b0Var.e, bVar, (String) null, 0L, (com.gamericefishpro.space.b3.a) null, (com.gamericefishpro.space.b3.p) null, (com.gamericefishpro.space.x2.b) null, 0L, (l) null, (j0) null, 65475);
            } else {
                b0Var2 = new b0(0L, 0L, b0Var.c, b0Var.d, b0Var.e, bVar, (String) null, 0L, (com.gamericefishpro.space.b3.a) null, (com.gamericefishpro.space.b3.p) null, (com.gamericefishpro.space.x2.b) null, 0L, (l) null, (j0) null, 65475);
            }
            cVar2 = new com.gamericefishpro.space.di.c() { // from class: com.gamericefishpro.space.z2.a
                @Override // com.gamericefishpro.space.di.c
                public final Object a(Object obj9, Object obj10, Object obj11) {
                    Typeface typeface2;
                    b0 b0Var10 = (b0) obj9;
                    int iIntValue = ((Integer) obj10).intValue();
                    int iIntValue2 = ((Integer) obj11).intValue();
                    b bVar10 = b0Var10.f;
                    k kVar3 = b0Var10.c;
                    if (kVar3 == null) {
                        kVar3 = k.i;
                    }
                    i iVar3 = b0Var10.d;
                    int i34 = iVar3 != null ? iVar3.a : 0;
                    j jVar3 = b0Var10.e;
                    int i35 = jVar3 != null ? jVar3.a : 65535;
                    c cVar15 = (c) aVar.e;
                    com.gamericefishpro.space.u2.q qVarB2 = ((e) cVar15.w).b(bVar10, kVar3, i34, i35);
                    if (qVarB2 instanceof com.gamericefishpro.space.u2.q) {
                        Object obj12 = qVarB2.d;
                        Intrinsics.c(obj12, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface2 = (Typeface) obj12;
                    } else {
                        com.gamericefishpro.space.r5.b bVar11 = new com.gamericefishpro.space.r5.b(qVarB2, cVar15.C);
                        cVar15.C = bVar11;
                        Object obj13 = bVar11.v;
                        Intrinsics.c(obj13, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface2 = (Typeface) obj13;
                    }
                    spannableString.setSpan(new com.gamericefishpro.space.t2.b(1, typeface2), iIntValue, iIntValue2, 33);
                    return Unit.a;
                }
            };
            if (arrayList2.size() <= 1) {
                size2 = arrayList2.size();
                i4 = size2 * 2;
                iArr = new int[i4];
                size3 = arrayList2.size();
                while (i5 < size3) {
                    com.gamericefishpro.space.r2.c cVar15 = (com.gamericefishpro.space.r2.c) arrayList2.get(i5);
                    iArr[i5] = cVar15.b;
                    iArr[i5 + size2] = cVar15.c;
                }
                Intrinsics.checkNotNullParameter(iArr, "<this>");
                if (i4 > 1) {
                    Arrays.sort(iArr);
                }
                Intrinsics.checkNotNullParameter(iArr, "<this>");
                if (i4 != 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                i6 = iArr[0];
                i7 = 0;
                while (i7 < i4) {
                    i8 = iArr[i7];
                    if (i8 == i6) {
                        arrayList3 = arrayList2;
                        b0Var3 = b0Var2;
                    } else {
                        size4 = arrayList2.size();
                        b0VarN = b0Var2;
                        i9 = 0;
                        while (i9 < size4) {
                            com.gamericefishpro.space.r2.c cVar16 = (com.gamericefishpro.space.r2.c) arrayList2.get(i9);
                            ArrayList arrayList7 = arrayList2;
                            i10 = cVar16.b;
                            b0 b0Var10 = b0Var2;
                            i11 = cVar16.c;
                            if (i10 == i11) {
                            }
                            i9++;
                            arrayList2 = arrayList7;
                            b0Var2 = b0Var10;
                        }
                        arrayList3 = arrayList2;
                        b0Var3 = b0Var2;
                        if (b0VarN != null) {
                            cVar2.a(b0VarN, Integer.valueOf(i6), Integer.valueOf(i8));
                        }
                        i6 = i8;
                    }
                    i7++;
                    arrayList2 = arrayList3;
                    b0Var2 = b0Var3;
                }
            } else if (!arrayList2.isEmpty()) {
                cVar2.a(d5.N(b0Var2, (b0) ((com.gamericefishpro.space.r2.c) arrayList2.get(0)).a), Integer.valueOf(((com.gamericefishpro.space.r2.c) arrayList2.get(0)).b), Integer.valueOf(((com.gamericefishpro.space.r2.c) arrayList2.get(0)).c));
            }
            size5 = arrayList.size();
            i12 = 0;
            z2 = false;
            while (i12 < size5) {
                cVar8 = (com.gamericefishpro.space.r2.c) arrayList.get(i12);
                obj2 = cVar8.a;
                if (obj2 instanceof b0) {
                    i17 = cVar8.b;
                    int i34 = cVar8.c;
                    if (i17 >= 0) {
                        pVar2 = pVar;
                        size5 = size5;
                        i12 = i12;
                        z2 = z2;
                        z2 = z2;
                    } else {
                        pVar2 = pVar;
                        size5 = size5;
                        i12 = i12;
                        z2 = z2;
                        z2 = z2;
                    }
                } else {
                    pVar2 = pVar;
                    size5 = size5;
                    i12 = i12;
                    z2 = z2;
                    z2 = z2;
                }
                i12++;
                size5 = size5;
                cVar11 = cVar11;
                pVar = pVar2;
            }
            p pVar7 = pVar;
            cVar3 = cVar11;
            if (z2) {
                size7 = arrayList.size();
                i15 = 0;
                while (i15 < size7) {
                    cVar6 = (com.gamericefishpro.space.r2.c) arrayList.get(i15);
                    bVar2 = (com.gamericefishpro.space.r2.b) cVar6.a;
                    if (bVar2 instanceof b0) {
                        i16 = cVar6.b;
                        int i35 = cVar6.c;
                        if (i16 >= 0) {
                            cVar7 = cVar3;
                        } else {
                            cVar7 = cVar3;
                        }
                    } else {
                        cVar7 = cVar3;
                    }
                    i15++;
                    cVar3 = cVar7;
                }
            }
            cVar4 = cVar3;
            qVar2 = pVar7.d;
            if (qVar2 != null) {
                j = qVar2.a;
                jB = n.b(j);
                if (com.gamericefishpro.space.c3.o.a(jB, 4294967296L)) {
                    cVar4.V(j);
                } else if (com.gamericefishpro.space.c3.o.a(jB, 8589934592L)) {
                    n.c(j);
                }
            }
            size6 = arrayList.size();
            while (i13 < size6) {
                Object obj9 = ((com.gamericefishpro.space.r2.c) arrayList.get(i13)).a;
            }
            if (list3.size() > 0) {
                cVar5 = (com.gamericefishpro.space.r2.c) list3.get(0);
                if (cVar5.a == null) {
                    throw new ClassCastException();
                }
                while (i14 < r1) {
                    spannableString.removeSpan((w) obj8);
                }
                throw null;
            }
            r1 = this;
            charSequence2 = spannableString;
        }
        r1 = obj4;
        charSequence2 = charSequence;
        r1.A = charSequence2;
        r1.B = new com.gamericefishpro.space.s2.d(charSequence2, r1.z, r1.E);
    }

    @Override // com.gamericefishpro.space.r2.o
    public final float a() {
        float f;
        com.gamericefishpro.space.s2.d dVar = this.B;
        float f2 = dVar.e;
        TextPaint textPaint = dVar.b;
        if (!Float.isNaN(f2)) {
            return dVar.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = dVar.a;
        lineInstance.setText(new com.gamericefishpro.space.s2.a(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new com.gamericefishpro.space.h0.a(3));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.e).intValue() - ((Number) pair.d).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Pair pair2 = (Pair) it.next();
            float desiredWidth = Layout.getDesiredWidth(dVar.b(), ((Number) pair2.d).intValue(), ((Number) pair2.e).intValue(), textPaint);
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(dVar.b(), ((Number) pair3.d).intValue(), ((Number) pair3.e).intValue(), textPaint));
            }
            f = desiredWidth;
        }
        dVar.e = f;
        return f;
    }

    @Override // com.gamericefishpro.space.r2.o
    public final boolean c() {
        com.gamericefishpro.space.r5.b bVar = this.C;
        if (bVar != null ? bVar.m() : false) {
            return true;
        }
        if (!this.D && j.a(this.e)) {
            u uVar = i.a;
            u uVar2 = i.a;
            s2 s2VarW = (s2) uVar2.e;
            if (s2VarW == null) {
                if (com.gamericefishpro.space.s4.k.c()) {
                    s2VarW = uVar2.w();
                    uVar2.e = s2VarW;
                } else {
                    s2VarW = j.a;
                }
            }
            if (((Boolean) s2VarW.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.r2.o
    public final float i() {
        return this.B.c();
    }
}
