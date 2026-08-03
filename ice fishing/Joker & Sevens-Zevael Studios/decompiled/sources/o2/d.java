package o2;

import a5.c;
import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import f1.d0;
import f1.f0;
import f1.i0;
import h2.a0;
import h2.h0;
import h2.p;
import h2.s;
import j2.b;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import k2.f;
import k2.j;
import k2.k;
import k2.r;
import k2.t;
import m0.w2;
import o2.d;
import q3.u;
import q3.w;
import r2.l;
import r2.o;
import r2.q;
import s2.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f5153a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f5154b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5155c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5156d;

    /* renamed from: e, reason: collision with root package name */
    public final k2.d f5157e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.c f5158f;

    /* renamed from: g, reason: collision with root package name */
    public final e f5159g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f5160h;

    /* renamed from: i, reason: collision with root package name */
    public final i2.f f5161i;

    /* renamed from: j, reason: collision with root package name */
    public a5.c f5162j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5163k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5164l;

    /* JADX WARN: Code restructure failed: missing block: B:173:0x04e0, code lost:
    
        if ((r2.f2675b.f2698c & 1095216660480L) != 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0097, code lost:
    
        if (r7 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x09bf A[LOOP:8: B:341:0x09bd->B:342:0x09bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0310 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o2.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(String str, h0 h0Var, List list, List list2, k2.d dVar, s2.c cVar) {
        Locale locale;
        int i10;
        c cVar2;
        int i11;
        a0 a0Var;
        int size;
        int i12;
        Object obj;
        boolean z10;
        String str2;
        n2.b bVar;
        r2.p pVar;
        long j3;
        long b2;
        r rVar;
        boolean z11;
        c cVar3;
        t b10;
        Typeface typeface;
        a0 a0Var2;
        ?? r32;
        ?? r72;
        h0 h0Var2;
        List list3;
        boolean z12;
        float f10;
        String str3;
        CharSequence charSequence;
        h2.t tVar;
        long j6;
        long j10;
        float S;
        int length;
        q qVar;
        final Spannable spannable;
        ArrayList arrayList;
        int size2;
        int i13;
        a0 a0Var3;
        ArrayList arrayList2;
        int i14;
        int[] iArr;
        int size3;
        int i15;
        boolean z13;
        q qVar2;
        int size4;
        int i16;
        int i17;
        int i18;
        s2.c cVar4;
        Object eVar;
        int i19;
        int i20;
        boolean z14;
        s2.c cVar5;
        int i21;
        int i22;
        s sVar;
        int i23;
        w wVar;
        int i24;
        u[] uVarArr;
        n2.b bVar2;
        ?? obj2 = new Object();
        obj2.f5153a = str;
        obj2.f5154b = h0Var;
        obj2.f5155c = list;
        obj2.f5156d = list2;
        obj2.f5157e = dVar;
        obj2.f5158f = cVar;
        float c3 = cVar.c();
        e eVar2 = new e(1);
        ((TextPaint) eVar2).density = c3;
        eVar2.f5166b = l.f6032b;
        eVar2.f5167c = 3;
        eVar2.f5168d = f0.f2248d;
        obj2.f5159g = eVar2;
        h2.t tVar2 = h0Var.f2676c;
        m7.g gVar = i.f5178a;
        m7.g gVar2 = i.f5178a;
        w2 w2Var = (w2) gVar2.f4957h;
        if (w2Var == null) {
            if (q3.i.f5758k != null) {
                w2Var = gVar2.o();
                gVar2.f4957h = w2Var;
            } else {
                w2Var = j.f5179a;
            }
        }
        obj2.f5163k = ((Boolean) w2Var.getValue()).booleanValue();
        int i25 = h0Var.f2675b.f2697b;
        n2.b bVar3 = h0Var.f2674a.f2622k;
        if (i25 != 4) {
            if (i25 != 5) {
                if (i25 == 1) {
                    i10 = 0;
                } else if (i25 == 2) {
                    i10 = 1;
                } else {
                    if (i25 != 3 && i25 != Integer.MIN_VALUE) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar3 == null || (locale = ((n2.a) bVar3.f5042g.get(0)).f5040a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                obj2.f5164l = i10;
                cVar2 = new c(obj2);
                r2.s sVar2 = h0Var.f2675b.f2704i;
                sVar2 = sVar2 == null ? r2.s.f6044c : sVar2;
                eVar2.setFlags(sVar2.f6047b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
                i11 = sVar2.f6046a;
                if (i11 == 1) {
                    eVar2.setFlags(eVar2.getFlags() | 64);
                    eVar2.setHinting(0);
                } else if (i11 == 2) {
                    eVar2.getFlags();
                    eVar2.setHinting(1);
                } else if (i11 == 3) {
                    eVar2.getFlags();
                    eVar2.setHinting(0);
                } else {
                    eVar2.getFlags();
                }
                a0Var = h0Var.f2674a;
                size = list.size();
                i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i12);
                    if (((h2.c) obj).f2631a instanceof a0) {
                        break;
                    } else {
                        i12++;
                    }
                }
                z10 = obj != null;
                long j11 = a0Var.f2613b;
                str2 = a0Var.f2618g;
                bVar = a0Var.f2622k;
                o oVar = a0Var.f2612a;
                pVar = a0Var.f2621j;
                j3 = a0Var.f2619h;
                b2 = n.b(j11);
                if (s2.o.a(b2, 4294967296L)) {
                    eVar2.setTextSize(cVar.N(j11));
                } else if (s2.o.a(b2, 8589934592L)) {
                    eVar2.setTextSize(n.c(j11) * eVar2.getTextSize());
                }
                rVar = a0Var.f2617f;
                if (rVar != null && a0Var.f2615d == null && a0Var.f2614c == null) {
                    cVar3 = cVar2;
                    z11 = z10;
                } else {
                    k2.l lVar = a0Var.f2614c;
                    lVar = lVar == null ? k2.l.f3612i : lVar;
                    k2.j jVar = a0Var.f2615d;
                    int i26 = jVar != null ? jVar.f3609a : 0;
                    k2.k kVar = a0Var.f2616e;
                    int i27 = kVar != null ? kVar.f3610a : 65535;
                    d dVar2 = cVar2.f5152g;
                    z11 = z10;
                    cVar3 = cVar2;
                    b10 = ((k2.f) dVar2.f5157e).b(rVar, lVar, i26, i27);
                    if (b10 instanceof t) {
                        Object obj3 = b10.f3625g;
                        pc.j.c(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj3;
                    } else {
                        a5.c cVar6 = new a5.c(b10, dVar2.f5162j);
                        dVar2.f5162j = cVar6;
                        Object obj4 = cVar6.f263i;
                        pc.j.c(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj4;
                    }
                    eVar2.setTypeface(typeface);
                }
                if (bVar != null) {
                    n2.b bVar4 = n2.b.f5041i;
                    a5.c cVar7 = n2.c.f5044a;
                    cVar7.getClass();
                    LocaleList localeList = LocaleList.getDefault();
                    synchronized (((m6.i) cVar7.f263i)) {
                        try {
                            bVar2 = (n2.b) cVar7.f261g;
                            if (bVar2 == null || localeList != ((LocaleList) cVar7.f262h)) {
                                int size5 = localeList.size();
                                ArrayList arrayList3 = new ArrayList(size5);
                                int i28 = 0;
                                while (i28 < size5) {
                                    arrayList3.add(new n2.a(localeList.get(i28)));
                                    i28++;
                                    size5 = size5;
                                }
                                bVar2 = new n2.b(arrayList3);
                                cVar7.f262h = localeList;
                                cVar7.f261g = bVar2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!bVar.equals(bVar2)) {
                        ArrayList arrayList4 = new ArrayList(bc.o.O(bVar));
                        Iterator it = bVar.f5042g.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((n2.a) it.next()).f5040a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList4.toArray(new Locale[0]);
                        eVar2.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    eVar2.setFontFeatureSettings(str2);
                }
                if (pVar != null && !pVar.equals(r2.p.f6037c)) {
                    eVar2.setTextScaleX(eVar2.getTextScaleX() * pVar.f6038a);
                    eVar2.setTextSkewX(eVar2.getTextSkewX() + pVar.f6039b);
                }
                eVar2.d(oVar.b());
                eVar2.c(oVar.c(), 9205357640488583168L, oVar.a());
                eVar2.f(a0Var.f2625n);
                eVar2.g(a0Var.f2624m);
                eVar2.e(a0Var.f2626o);
                if (!s2.o.a(n.b(j3), 4294967296L) && n.c(j3) != 0.0f) {
                    float textScaleX = eVar2.getTextScaleX() * eVar2.getTextSize();
                    float N = cVar.N(j3);
                    if (textScaleX != 0.0f) {
                        eVar2.setLetterSpacing(N / textScaleX);
                    }
                } else if (s2.o.a(n.b(j3), 8589934592L)) {
                    eVar2.setLetterSpacing(n.c(j3));
                }
                long j12 = a0Var.f2623l;
                r2.a aVar = a0Var.f2620i;
                boolean z15 = (z11 || !s2.o.a(n.b(j3), 4294967296L) || n.c(j3) == 0.0f) ? false : true;
                long j13 = f1.q.f2283h;
                boolean z16 = f1.q.c(j12, j13) && !f1.q.c(j12, f1.q.f2282g);
                boolean z17 = aVar == null && Float.compare(aVar.f6013a, 0.0f) != 0;
                a0Var2 = (!z15 || z16 || z17) ? new a0(0L, 0L, (k2.l) null, (k2.j) null, (k2.k) null, (r) null, (String) null, z15 ? j3 : n.f6401c, z17 ? aVar : null, (r2.p) null, (n2.b) null, z16 ? j12 : j13, (l) null, (f0) null, 63103) : null;
                if (a0Var2 != null) {
                    int size6 = obj2.f5155c.size() + 1;
                    r32 = new ArrayList(size6);
                    int i29 = 0;
                    while (i29 < size6) {
                        r32.add(i29 == 0 ? new h2.c(0, obj2.f5153a.length(), a0Var2) : (h2.c) obj2.f5155c.get(i29 - 1));
                        i29++;
                    }
                } else {
                    r32 = obj2.f5155c;
                }
                r72 = obj2.f5153a;
                float textSize = obj2.f5159g.getTextSize();
                h0Var2 = obj2.f5154b;
                list3 = obj2.f5156d;
                s2.c cVar8 = obj2.f5158f;
                z12 = obj2.f5163k;
                a aVar2 = b.f5151a;
                if (z12 || q3.i.f5758k == null) {
                    f10 = 0.0f;
                    str3 = r72;
                    charSequence = str3;
                } else {
                    h2.t tVar3 = h0Var2.f2676c;
                    if (tVar3 != null) {
                        s sVar3 = tVar3.f2708a;
                    }
                    q3.i a6 = q3.i.a();
                    int length2 = r72.length();
                    if (!(a6.b() == 1)) {
                        throw new IllegalStateException("Not initialized yet");
                    }
                    if (length2 < 0) {
                        throw new IllegalArgumentException("end cannot be negative");
                    }
                    if (!(length2 >= 0)) {
                        throw new IllegalArgumentException("start should be <= than end");
                    }
                    if (!(r72.length() >= 0)) {
                        throw new IllegalArgumentException("start should be < than charSequence length");
                    }
                    if (!(length2 <= r72.length())) {
                        throw new IllegalArgumentException("end should be < than charSequence length");
                    }
                    if (r72.length() == 0 || length2 == 0) {
                        f10 = 0.0f;
                        str3 = r72;
                    } else {
                        a5.c cVar9 = a6.f5763e.f5755b;
                        cVar9.getClass();
                        if (r72 instanceof Spannable) {
                            wVar = new w((Spannable) r72);
                            i23 = 0;
                        } else if (!(r72 instanceof Spanned) || ((Spanned) r72).nextSpanTransition(-1, length2 + 1, u.class) > length2) {
                            i23 = 0;
                            wVar = null;
                        } else {
                            wVar = new w();
                            i23 = 0;
                            wVar.f5801g = false;
                            wVar.f5802h = new SpannableString(r72);
                        }
                        if (wVar == null || (uVarArr = (u[]) wVar.f5802h.getSpans(i23, length2, u.class)) == null || uVarArr.length <= 0) {
                            f10 = 0.0f;
                            str3 = r72;
                            i24 = 0;
                        } else {
                            int length3 = uVarArr.length;
                            f10 = 0.0f;
                            int i30 = 0;
                            int i31 = 0;
                            String str4 = r72;
                            while (i31 < length3) {
                                u uVar = uVarArr[i31];
                                String str5 = str4;
                                int spanStart = wVar.f5802h.getSpanStart(uVar);
                                u[] uVarArr2 = uVarArr;
                                int spanEnd = wVar.f5802h.getSpanEnd(uVar);
                                if (spanStart != length2) {
                                    wVar.removeSpan(uVar);
                                }
                                i30 = Math.min(spanStart, i30);
                                length2 = Math.max(spanEnd, length2);
                                i31++;
                                uVarArr = uVarArr2;
                                str4 = str5;
                            }
                            str3 = str4;
                            i24 = i30;
                        }
                        if (i24 != length2 && i24 < str3.length()) {
                            w wVar2 = (w) cVar9.E(str3, i24, length2, Integer.MAX_VALUE, false, new x4.l(8, wVar, (m6.i) cVar9.f262h));
                            if (wVar2 != null) {
                                charSequence = wVar2.f5802h;
                                pc.j.b(charSequence);
                            }
                        }
                    }
                    charSequence = str3;
                    pc.j.b(charSequence);
                }
                d dVar3 = (r32.isEmpty() && list3.isEmpty() && pc.j.a(h0Var2.f2675b.f2699d, q.f6040c)) ? obj2 : dVar3;
                Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                if (pc.j.a(h0Var2.f2674a.f2624m, l.f6033c)) {
                    spannableString.setSpan(b.f5151a, 0, str3.length(), 33);
                }
                tVar = h0Var2.f2676c;
                if ((tVar != null || (sVar = tVar.f2708a) == null) ? false : sVar.f2707a) {
                    h2.q qVar3 = h0Var2.f2675b;
                    if (qVar3.f2701f == null) {
                        j6 = 0;
                        float S2 = x4.f.S(qVar3.f2698c, textSize, cVar8);
                        if (!Float.isNaN(S2)) {
                            spannableString.setSpan(new j2.g(S2), 0, spannableString.length(), 33);
                        }
                        j10 = 1095216660480L;
                        qVar = h0Var2.f2675b.f2699d;
                        if (qVar == null) {
                            long j14 = qVar.f6041a;
                            long j15 = qVar.f6042b;
                            spannable = spannableString;
                            if ((!n.a(j14, bc.a0.t(0)) || !n.a(j15, bc.a0.t(0))) && (j14 & j10) != j6 && (j15 & j10) != j6) {
                                long b11 = n.b(j14);
                                float N2 = s2.o.a(b11, 4294967296L) ? cVar8.N(j14) : s2.o.a(b11, 8589934592L) ? n.c(j14) * textSize : f10;
                                long b12 = n.b(j15);
                                spannable.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(N2), (int) Math.ceil(s2.o.a(b12, 4294967296L) ? cVar8.N(j15) : s2.o.a(b12, 8589934592L) ? n.c(j15) * textSize : f10)), 0, spannable.length(), 33);
                            }
                        } else {
                            spannable = spannableString;
                        }
                        arrayList = new ArrayList(r32.size());
                        size2 = r32.size();
                        for (i13 = 0; i13 < size2; i13++) {
                            h2.c cVar10 = (h2.c) r32.get(i13);
                            Object obj5 = cVar10.f2631a;
                            if (obj5 instanceof a0) {
                                a0 a0Var4 = (a0) obj5;
                                if (((a0Var4.f2617f == null && a0Var4.f2615d == null && a0Var4.f2614c == null) ? false : true) || ((a0) obj5).f2616e != null) {
                                    arrayList.add(cVar10);
                                }
                            }
                        }
                        a0 a0Var5 = h0Var2.f2674a;
                        r rVar2 = a0Var5.f2617f;
                        a0 a0Var6 = ((rVar2 == null || a0Var5.f2615d != null || a0Var5.f2614c != null) && a0Var5.f2616e == null) ? null : new a0(0L, 0L, a0Var5.f2614c, a0Var5.f2615d, a0Var5.f2616e, rVar2, (String) null, 0L, (r2.a) null, (r2.p) null, (n2.b) null, 0L, (l) null, (f0) null, 65475);
                        final c cVar11 = cVar3;
                        oc.f fVar = new oc.f() { // from class: p2.a
                            @Override // oc.f
                            public final Object b(Object obj6, Object obj7, Object obj8) {
                                Typeface typeface2;
                                a0 a0Var7 = (a0) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                int intValue2 = ((Integer) obj8).intValue();
                                r rVar3 = a0Var7.f2617f;
                                k2.l lVar2 = a0Var7.f2614c;
                                if (lVar2 == null) {
                                    lVar2 = k2.l.f3612i;
                                }
                                j jVar2 = a0Var7.f2615d;
                                int i32 = jVar2 != null ? jVar2.f3609a : 0;
                                k kVar2 = a0Var7.f2616e;
                                int i33 = kVar2 != null ? kVar2.f3610a : 65535;
                                d dVar4 = cVar11.f5152g;
                                t b13 = ((f) dVar4.f5157e).b(rVar3, lVar2, i32, i33);
                                if (b13 instanceof t) {
                                    Object obj9 = b13.f3625g;
                                    pc.j.c(obj9, "null cannot be cast to non-null type android.graphics.Typeface");
                                    typeface2 = (Typeface) obj9;
                                } else {
                                    c cVar12 = new c(b13, dVar4.f5162j);
                                    dVar4.f5162j = cVar12;
                                    Object obj10 = cVar12.f263i;
                                    pc.j.c(obj10, "null cannot be cast to non-null type android.graphics.Typeface");
                                    typeface2 = (Typeface) obj10;
                                }
                                spannable.setSpan(new b(1, typeface2), intValue, intValue2, 33);
                                return ac.o.f277a;
                            }
                        };
                        if (arrayList.size() <= 1) {
                            int size7 = arrayList.size();
                            int i32 = size7 * 2;
                            int[] iArr2 = new int[i32];
                            int size8 = arrayList.size();
                            for (int i33 = 0; i33 < size8; i33++) {
                                h2.c cVar12 = (h2.c) arrayList.get(i33);
                                iArr2[i33] = cVar12.f2632b;
                                iArr2[i33 + size7] = cVar12.f2633c;
                            }
                            if (i32 > 1) {
                                Arrays.sort(iArr2);
                            }
                            if (i32 == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            int i34 = iArr2[0];
                            int i35 = 0;
                            while (i35 < i32) {
                                int i36 = iArr2[i35];
                                if (i36 == i34) {
                                    arrayList2 = arrayList;
                                    a0Var3 = a0Var6;
                                    i14 = i32;
                                    iArr = iArr2;
                                } else {
                                    int size9 = arrayList.size();
                                    a0Var3 = a0Var6;
                                    int i37 = 0;
                                    while (i37 < size9) {
                                        ArrayList arrayList5 = arrayList;
                                        h2.c cVar13 = (h2.c) arrayList.get(i37);
                                        int i38 = i32;
                                        int i39 = cVar13.f2632b;
                                        int[] iArr3 = iArr2;
                                        int i40 = cVar13.f2633c;
                                        if (i39 != i40 && h2.f.a(i34, i36, i39, i40)) {
                                            a0 a0Var7 = (a0) cVar13.f2631a;
                                            a0Var6 = a0Var6 != null ? a0Var6.c(a0Var7) : a0Var7;
                                        }
                                        i37++;
                                        i32 = i38;
                                        arrayList = arrayList5;
                                        iArr2 = iArr3;
                                    }
                                    arrayList2 = arrayList;
                                    i14 = i32;
                                    iArr = iArr2;
                                    if (a0Var6 != null) {
                                        fVar.b(a0Var6, Integer.valueOf(i34), Integer.valueOf(i36));
                                    }
                                    i34 = i36;
                                }
                                i35++;
                                a0Var6 = a0Var3;
                                i32 = i14;
                                arrayList = arrayList2;
                                iArr2 = iArr;
                            }
                        } else if (!arrayList.isEmpty()) {
                            a0 a0Var8 = (a0) ((h2.c) arrayList.get(0)).f2631a;
                            fVar.b(a0Var6 != null ? a0Var6.c(a0Var8) : a0Var8, Integer.valueOf(((h2.c) arrayList.get(0)).f2632b), Integer.valueOf(((h2.c) arrayList.get(0)).f2633c));
                        }
                        size3 = r32.size();
                        i15 = 0;
                        z13 = false;
                        while (i15 < size3) {
                            h2.c cVar14 = (h2.c) r32.get(i15);
                            Object obj6 = cVar14.f2631a;
                            if (obj6 instanceof a0) {
                                int i41 = cVar14.f2632b;
                                int i42 = cVar14.f2633c;
                                if (i41 >= 0 && i41 < spannable.length() && i42 > i41 && i42 <= spannable.length()) {
                                    a0 a0Var9 = (a0) obj6;
                                    r2.a aVar3 = a0Var9.f2620i;
                                    o oVar2 = a0Var9.f2612a;
                                    if (aVar3 != null) {
                                        spannable.setSpan(new j2.a(0, aVar3.f6013a), i41, i42, 33);
                                    }
                                    i19 = size3;
                                    i20 = i15;
                                    x4.f.U(spannable, oVar2.b(), i41, i42);
                                    d0 c7 = oVar2.c();
                                    float a8 = oVar2.a();
                                    if (c7 != null) {
                                        if (c7 instanceof i0) {
                                            x4.f.U(spannable, ((i0) c7).f2264e, i41, i42);
                                        } else {
                                            spannable.setSpan(new q2.b((f1.n) c7, a8), i41, i42, 33);
                                        }
                                    }
                                    l lVar2 = a0Var9.f2624m;
                                    if (lVar2 != null) {
                                        int i43 = lVar2.f6034a;
                                        j2.k kVar2 = new j2.k((i43 | 1) == i43, (i43 | 2) == i43);
                                        i21 = 33;
                                        spannable.setSpan(kVar2, i41, i42, 33);
                                    } else {
                                        i21 = 33;
                                    }
                                    s2.c cVar15 = cVar8;
                                    x4.f.V(spannable, a0Var9.f2613b, cVar15, i41, i42);
                                    String str6 = a0Var9.f2618g;
                                    if (str6 != null) {
                                        spannable.setSpan(new j2.b(0, str6), i41, i42, i21);
                                    }
                                    r2.p pVar2 = a0Var9.f2621j;
                                    if (pVar2 != null) {
                                        spannable.setSpan(new ScaleXSpan(pVar2.f6038a), i41, i42, i21);
                                        spannable.setSpan(new j2.a(1, pVar2.f6039b), i41, i42, i21);
                                    }
                                    x4.f.W(spannable, a0Var9.f2622k, i41, i42);
                                    long j16 = a0Var9.f2623l;
                                    if (j16 != 16) {
                                        spannable.setSpan(new BackgroundColorSpan(d0.s(j16)), i41, i42, 33);
                                    }
                                    f0 f0Var = a0Var9.f2625n;
                                    if (f0Var != null) {
                                        long j17 = f0Var.f2250b;
                                        cVar5 = cVar15;
                                        int s10 = d0.s(f0Var.f2249a);
                                        z14 = z13;
                                        float intBitsToFloat = Float.intBitsToFloat((int) (j17 >> 32));
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j17 & 4294967295L));
                                        float f11 = f0Var.f2251c;
                                        j2.j jVar2 = new j2.j(s10, intBitsToFloat, intBitsToFloat2, f11 == f10 ? Float.MIN_VALUE : f11);
                                        i22 = 33;
                                        spannable.setSpan(jVar2, i41, i42, 33);
                                    } else {
                                        z14 = z13;
                                        cVar5 = cVar15;
                                        i22 = 33;
                                    }
                                    h1.c cVar16 = a0Var9.f2626o;
                                    if (cVar16 != null) {
                                        spannable.setSpan(new q2.a(cVar16), i41, i42, i22);
                                    }
                                    if (s2.o.a(n.b(a0Var9.f2619h), 4294967296L) || s2.o.a(n.b(a0Var9.f2619h), 8589934592L)) {
                                        z13 = true;
                                        i15 = i20 + 1;
                                        size3 = i19;
                                        cVar8 = cVar5;
                                    }
                                    z13 = z14;
                                    i15 = i20 + 1;
                                    size3 = i19;
                                    cVar8 = cVar5;
                                }
                            }
                            i19 = size3;
                            i20 = i15;
                            z14 = z13;
                            cVar5 = cVar8;
                            z13 = z14;
                            i15 = i20 + 1;
                            size3 = i19;
                            cVar8 = cVar5;
                        }
                        s2.c cVar17 = cVar8;
                        if (z13) {
                            int size10 = r32.size();
                            int i44 = 0;
                            while (i44 < size10) {
                                h2.c cVar18 = (h2.c) r32.get(i44);
                                h2.b bVar5 = (h2.b) cVar18.f2631a;
                                if (bVar5 instanceof a0) {
                                    int i45 = cVar18.f2632b;
                                    int i46 = cVar18.f2633c;
                                    if (i45 >= 0 && i45 < spannable.length() && i46 > i45 && i46 <= spannable.length()) {
                                        long j18 = ((a0) bVar5).f2619h;
                                        long b13 = n.b(j18);
                                        i17 = size10;
                                        i18 = i44;
                                        if (s2.o.a(b13, 4294967296L)) {
                                            cVar4 = cVar17;
                                            eVar = new j2.f(cVar4.N(j18));
                                        } else {
                                            cVar4 = cVar17;
                                            eVar = s2.o.a(b13, 8589934592L) ? new j2.e(n.c(j18)) : null;
                                        }
                                        if (eVar != null) {
                                            spannable.setSpan(eVar, i45, i46, 33);
                                        }
                                        cVar17 = cVar4;
                                        i44 = i18 + 1;
                                        size10 = i17;
                                    }
                                }
                                i17 = size10;
                                i18 = i44;
                                cVar4 = cVar17;
                                cVar17 = cVar4;
                                i44 = i18 + 1;
                                size10 = i17;
                            }
                        }
                        s2.c cVar19 = cVar17;
                        qVar2 = h0Var2.f2675b.f2699d;
                        if (qVar2 != null) {
                            long j19 = qVar2.f6041a;
                            long b14 = n.b(j19);
                            if (s2.o.a(b14, 4294967296L)) {
                                cVar19.N(j19);
                            } else if (s2.o.a(b14, 8589934592L)) {
                                n.c(j19);
                            }
                        }
                        size4 = r32.size();
                        for (i16 = 0; i16 < size4; i16++) {
                            Object obj7 = ((h2.c) r32.get(i16)).f2631a;
                        }
                        if (list3.size() > 0) {
                            dVar3 = this;
                            charSequence = spannable;
                            dVar3.f5160h = charSequence;
                            dVar3.f5161i = new i2.f(charSequence, dVar3.f5159g, dVar3.f5164l);
                            return;
                        }
                        h2.c cVar20 = (h2.c) list3.get(0);
                        if (cVar20.f2631a != null) {
                            throw new ClassCastException();
                        }
                        for (Object obj8 : spannable.getSpans(cVar20.f2632b, cVar20.f2633c, u.class)) {
                            spannable.removeSpan((u) obj8);
                        }
                        throw null;
                    }
                }
                j6 = 0;
                h2.q qVar4 = h0Var2.f2675b;
                r2.i iVar = qVar4.f2701f;
                iVar = iVar == null ? r2.i.f6025c : iVar;
                j10 = 1095216660480L;
                S = x4.f.S(qVar4.f2698c, textSize, cVar8);
                if (!Float.isNaN(S)) {
                    if (spannableString.length() != 0) {
                        if (spannableString.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        if (spannableString.charAt(xc.h.p(spannableString)) != '\n') {
                            length = spannableString.length();
                            int i47 = length;
                            int i48 = iVar.f6027b;
                            spannableString.setSpan(new j2.h(S, i47, (i48 & 1) <= 0, (i48 & 16) <= 0, iVar.f6026a, false), 0, spannableString.length(), 33);
                        }
                    }
                    length = spannableString.length() + 1;
                    int i472 = length;
                    int i482 = iVar.f6027b;
                    spannableString.setSpan(new j2.h(S, i472, (i482 & 1) <= 0, (i482 & 16) <= 0, iVar.f6026a, false), 0, spannableString.length(), 33);
                }
                qVar = h0Var2.f2675b.f2699d;
                if (qVar == null) {
                }
                arrayList = new ArrayList(r32.size());
                size2 = r32.size();
                while (i13 < size2) {
                }
                a0 a0Var52 = h0Var2.f2674a;
                r rVar22 = a0Var52.f2617f;
                if (rVar22 == null || a0Var52.f2615d != null || a0Var52.f2614c != null) {
                }
                final c cVar112 = cVar3;
                oc.f fVar2 = new oc.f() { // from class: p2.a
                    @Override // oc.f
                    public final Object b(Object obj62, Object obj72, Object obj82) {
                        Typeface typeface2;
                        a0 a0Var72 = (a0) obj62;
                        int intValue = ((Integer) obj72).intValue();
                        int intValue2 = ((Integer) obj82).intValue();
                        r rVar3 = a0Var72.f2617f;
                        k2.l lVar22 = a0Var72.f2614c;
                        if (lVar22 == null) {
                            lVar22 = k2.l.f3612i;
                        }
                        j jVar22 = a0Var72.f2615d;
                        int i322 = jVar22 != null ? jVar22.f3609a : 0;
                        k kVar22 = a0Var72.f2616e;
                        int i332 = kVar22 != null ? kVar22.f3610a : 65535;
                        d dVar4 = cVar112.f5152g;
                        t b132 = ((f) dVar4.f5157e).b(rVar3, lVar22, i322, i332);
                        if (b132 instanceof t) {
                            Object obj9 = b132.f3625g;
                            pc.j.c(obj9, "null cannot be cast to non-null type android.graphics.Typeface");
                            typeface2 = (Typeface) obj9;
                        } else {
                            c cVar122 = new c(b132, dVar4.f5162j);
                            dVar4.f5162j = cVar122;
                            Object obj10 = cVar122.f263i;
                            pc.j.c(obj10, "null cannot be cast to non-null type android.graphics.Typeface");
                            typeface2 = (Typeface) obj10;
                        }
                        spannable.setSpan(new b(1, typeface2), intValue, intValue2, 33);
                        return ac.o.f277a;
                    }
                };
                if (arrayList.size() <= 1) {
                }
                size3 = r32.size();
                i15 = 0;
                z13 = false;
                while (i15 < size3) {
                }
                s2.c cVar172 = cVar8;
                if (z13) {
                }
                s2.c cVar192 = cVar172;
                qVar2 = h0Var2.f2675b.f2699d;
                if (qVar2 != null) {
                }
                size4 = r32.size();
                while (i16 < size4) {
                }
                if (list3.size() > 0) {
                }
            }
            i10 = 3;
            obj2.f5164l = i10;
            cVar2 = new c(obj2);
            r2.s sVar22 = h0Var.f2675b.f2704i;
            if (sVar22 == null) {
            }
            eVar2.setFlags(sVar22.f6047b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
            i11 = sVar22.f6046a;
            if (i11 == 1) {
            }
            a0Var = h0Var.f2674a;
            size = list.size();
            i12 = 0;
            while (true) {
                if (i12 >= size) {
                }
                i12++;
            }
            if (obj != null) {
            }
            long j112 = a0Var.f2613b;
            str2 = a0Var.f2618g;
            bVar = a0Var.f2622k;
            o oVar3 = a0Var.f2612a;
            pVar = a0Var.f2621j;
            j3 = a0Var.f2619h;
            b2 = n.b(j112);
            if (s2.o.a(b2, 4294967296L)) {
            }
            rVar = a0Var.f2617f;
            if (rVar != null) {
            }
            k2.l lVar3 = a0Var.f2614c;
            if (lVar3 == null) {
            }
            k2.j jVar3 = a0Var.f2615d;
            if (jVar3 != null) {
            }
            k2.k kVar3 = a0Var.f2616e;
            if (kVar3 != null) {
            }
            d dVar22 = cVar2.f5152g;
            z11 = z10;
            cVar3 = cVar2;
            b10 = ((k2.f) dVar22.f5157e).b(rVar, lVar3, i26, i27);
            if (b10 instanceof t) {
            }
            eVar2.setTypeface(typeface);
            if (bVar != null) {
            }
            if (str2 != null) {
                eVar2.setFontFeatureSettings(str2);
            }
            if (pVar != null) {
                eVar2.setTextScaleX(eVar2.getTextScaleX() * pVar.f6038a);
                eVar2.setTextSkewX(eVar2.getTextSkewX() + pVar.f6039b);
            }
            eVar2.d(oVar3.b());
            eVar2.c(oVar3.c(), 9205357640488583168L, oVar3.a());
            eVar2.f(a0Var.f2625n);
            eVar2.g(a0Var.f2624m);
            eVar2.e(a0Var.f2626o);
            if (!s2.o.a(n.b(j3), 4294967296L)) {
            }
            if (s2.o.a(n.b(j3), 8589934592L)) {
            }
            long j122 = a0Var.f2623l;
            r2.a aVar4 = a0Var.f2620i;
            if (z11) {
            }
            long j132 = f1.q.f2283h;
            if (f1.q.c(j122, j132)) {
            }
            if (aVar4 == null) {
            }
            if (z15) {
            }
            if (a0Var2 != null) {
            }
            r72 = obj2.f5153a;
            float textSize2 = obj2.f5159g.getTextSize();
            h0Var2 = obj2.f5154b;
            list3 = obj2.f5156d;
            s2.c cVar82 = obj2.f5158f;
            z12 = obj2.f5163k;
            a aVar22 = b.f5151a;
            if (z12) {
            }
            f10 = 0.0f;
            str3 = r72;
            charSequence = str3;
            if (r32.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            if (pc.j.a(h0Var2.f2674a.f2624m, l.f6033c)) {
            }
            tVar = h0Var2.f2676c;
            if ((tVar != null || (sVar = tVar.f2708a) == null) ? false : sVar.f2707a) {
            }
            j6 = 0;
            h2.q qVar42 = h0Var2.f2675b;
            r2.i iVar2 = qVar42.f2701f;
            if (iVar2 == null) {
            }
            j10 = 1095216660480L;
            S = x4.f.S(qVar42.f2698c, textSize2, cVar82);
            if (!Float.isNaN(S)) {
            }
            qVar = h0Var2.f2675b.f2699d;
            if (qVar == null) {
            }
            arrayList = new ArrayList(r32.size());
            size2 = r32.size();
            while (i13 < size2) {
            }
            a0 a0Var522 = h0Var2.f2674a;
            r rVar222 = a0Var522.f2617f;
            if (rVar222 == null || a0Var522.f2615d != null || a0Var522.f2614c != null) {
            }
            final c cVar1122 = cVar3;
            oc.f fVar22 = new oc.f() { // from class: p2.a
                @Override // oc.f
                public final Object b(Object obj62, Object obj72, Object obj82) {
                    Typeface typeface2;
                    a0 a0Var72 = (a0) obj62;
                    int intValue = ((Integer) obj72).intValue();
                    int intValue2 = ((Integer) obj82).intValue();
                    r rVar3 = a0Var72.f2617f;
                    k2.l lVar22 = a0Var72.f2614c;
                    if (lVar22 == null) {
                        lVar22 = k2.l.f3612i;
                    }
                    j jVar22 = a0Var72.f2615d;
                    int i322 = jVar22 != null ? jVar22.f3609a : 0;
                    k kVar22 = a0Var72.f2616e;
                    int i332 = kVar22 != null ? kVar22.f3610a : 65535;
                    d dVar4 = cVar1122.f5152g;
                    t b132 = ((f) dVar4.f5157e).b(rVar3, lVar22, i322, i332);
                    if (b132 instanceof t) {
                        Object obj9 = b132.f3625g;
                        pc.j.c(obj9, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface2 = (Typeface) obj9;
                    } else {
                        c cVar122 = new c(b132, dVar4.f5162j);
                        dVar4.f5162j = cVar122;
                        Object obj10 = cVar122.f263i;
                        pc.j.c(obj10, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface2 = (Typeface) obj10;
                    }
                    spannable.setSpan(new b(1, typeface2), intValue, intValue2, 33);
                    return ac.o.f277a;
                }
            };
            if (arrayList.size() <= 1) {
            }
            size3 = r32.size();
            i15 = 0;
            z13 = false;
            while (i15 < size3) {
            }
            s2.c cVar1722 = cVar82;
            if (z13) {
            }
            s2.c cVar1922 = cVar1722;
            qVar2 = h0Var2.f2675b.f2699d;
            if (qVar2 != null) {
            }
            size4 = r32.size();
            while (i16 < size4) {
            }
            if (list3.size() > 0) {
            }
        }
        i10 = 2;
        obj2.f5164l = i10;
        cVar2 = new c(obj2);
        r2.s sVar222 = h0Var.f2675b.f2704i;
        if (sVar222 == null) {
        }
        eVar2.setFlags(sVar222.f6047b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
        i11 = sVar222.f6046a;
        if (i11 == 1) {
        }
        a0Var = h0Var.f2674a;
        size = list.size();
        i12 = 0;
        while (true) {
            if (i12 >= size) {
            }
            i12++;
        }
        if (obj != null) {
        }
        long j1122 = a0Var.f2613b;
        str2 = a0Var.f2618g;
        bVar = a0Var.f2622k;
        o oVar32 = a0Var.f2612a;
        pVar = a0Var.f2621j;
        j3 = a0Var.f2619h;
        b2 = n.b(j1122);
        if (s2.o.a(b2, 4294967296L)) {
        }
        rVar = a0Var.f2617f;
        if (rVar != null) {
        }
        k2.l lVar32 = a0Var.f2614c;
        if (lVar32 == null) {
        }
        k2.j jVar32 = a0Var.f2615d;
        if (jVar32 != null) {
        }
        k2.k kVar32 = a0Var.f2616e;
        if (kVar32 != null) {
        }
        d dVar222 = cVar2.f5152g;
        z11 = z10;
        cVar3 = cVar2;
        b10 = ((k2.f) dVar222.f5157e).b(rVar, lVar32, i26, i27);
        if (b10 instanceof t) {
        }
        eVar2.setTypeface(typeface);
        if (bVar != null) {
        }
        if (str2 != null) {
        }
        if (pVar != null) {
        }
        eVar2.d(oVar32.b());
        eVar2.c(oVar32.c(), 9205357640488583168L, oVar32.a());
        eVar2.f(a0Var.f2625n);
        eVar2.g(a0Var.f2624m);
        eVar2.e(a0Var.f2626o);
        if (!s2.o.a(n.b(j3), 4294967296L)) {
        }
        if (s2.o.a(n.b(j3), 8589934592L)) {
        }
        long j1222 = a0Var.f2623l;
        r2.a aVar42 = a0Var.f2620i;
        if (z11) {
        }
        long j1322 = f1.q.f2283h;
        if (f1.q.c(j1222, j1322)) {
        }
        if (aVar42 == null) {
        }
        if (z15) {
        }
        if (a0Var2 != null) {
        }
        r72 = obj2.f5153a;
        float textSize22 = obj2.f5159g.getTextSize();
        h0Var2 = obj2.f5154b;
        list3 = obj2.f5156d;
        s2.c cVar822 = obj2.f5158f;
        z12 = obj2.f5163k;
        a aVar222 = b.f5151a;
        if (z12) {
        }
        f10 = 0.0f;
        str3 = r72;
        charSequence = str3;
        if (r32.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        if (pc.j.a(h0Var2.f2674a.f2624m, l.f6033c)) {
        }
        tVar = h0Var2.f2676c;
        if ((tVar != null || (sVar = tVar.f2708a) == null) ? false : sVar.f2707a) {
        }
        j6 = 0;
        h2.q qVar422 = h0Var2.f2675b;
        r2.i iVar22 = qVar422.f2701f;
        if (iVar22 == null) {
        }
        j10 = 1095216660480L;
        S = x4.f.S(qVar422.f2698c, textSize22, cVar822);
        if (!Float.isNaN(S)) {
        }
        qVar = h0Var2.f2675b.f2699d;
        if (qVar == null) {
        }
        arrayList = new ArrayList(r32.size());
        size2 = r32.size();
        while (i13 < size2) {
        }
        a0 a0Var5222 = h0Var2.f2674a;
        r rVar2222 = a0Var5222.f2617f;
        if (rVar2222 == null || a0Var5222.f2615d != null || a0Var5222.f2614c != null) {
        }
        final c cVar11222 = cVar3;
        oc.f fVar222 = new oc.f() { // from class: p2.a
            @Override // oc.f
            public final Object b(Object obj62, Object obj72, Object obj82) {
                Typeface typeface2;
                a0 a0Var72 = (a0) obj62;
                int intValue = ((Integer) obj72).intValue();
                int intValue2 = ((Integer) obj82).intValue();
                r rVar3 = a0Var72.f2617f;
                k2.l lVar22 = a0Var72.f2614c;
                if (lVar22 == null) {
                    lVar22 = k2.l.f3612i;
                }
                j jVar22 = a0Var72.f2615d;
                int i322 = jVar22 != null ? jVar22.f3609a : 0;
                k kVar22 = a0Var72.f2616e;
                int i332 = kVar22 != null ? kVar22.f3610a : 65535;
                d dVar4 = cVar11222.f5152g;
                t b132 = ((f) dVar4.f5157e).b(rVar3, lVar22, i322, i332);
                if (b132 instanceof t) {
                    Object obj9 = b132.f3625g;
                    pc.j.c(obj9, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface2 = (Typeface) obj9;
                } else {
                    c cVar122 = new c(b132, dVar4.f5162j);
                    dVar4.f5162j = cVar122;
                    Object obj10 = cVar122.f263i;
                    pc.j.c(obj10, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface2 = (Typeface) obj10;
                }
                spannable.setSpan(new b(1, typeface2), intValue, intValue2, 33);
                return ac.o.f277a;
            }
        };
        if (arrayList.size() <= 1) {
        }
        size3 = r32.size();
        i15 = 0;
        z13 = false;
        while (i15 < size3) {
        }
        s2.c cVar17222 = cVar822;
        if (z13) {
        }
        s2.c cVar19222 = cVar17222;
        qVar2 = h0Var2.f2675b.f2699d;
        if (qVar2 != null) {
        }
        size4 = r32.size();
        while (i16 < size4) {
        }
        if (list3.size() > 0) {
        }
    }

    public final float a() {
        float f10;
        i2.f fVar = this.f5161i;
        float f11 = fVar.f3126e;
        TextPaint textPaint = fVar.f3123b;
        if (!Float.isNaN(f11)) {
            return fVar.f3126e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = fVar.f3122a;
        lineInstance.setText(new i2.c(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new e3.b(1));
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new ac.i(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                ac.i iVar = (ac.i) priorityQueue.peek();
                if (iVar != null && ((Number) iVar.f271h).intValue() - ((Number) iVar.f270g).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new ac.i(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        if (priorityQueue.isEmpty()) {
            f10 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            ac.i iVar2 = (ac.i) it.next();
            float desiredWidth = Layout.getDesiredWidth(fVar.b(), ((Number) iVar2.f270g).intValue(), ((Number) iVar2.f271h).intValue(), textPaint);
            while (it.hasNext()) {
                ac.i iVar3 = (ac.i) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(fVar.b(), ((Number) iVar3.f270g).intValue(), ((Number) iVar3.f271h).intValue(), textPaint));
            }
            f10 = desiredWidth;
        }
        fVar.f3126e = f10;
        return f10;
    }

    @Override // h2.p
    public final boolean c() {
        a5.c cVar = this.f5162j;
        if (cVar != null ? cVar.B() : false) {
            return true;
        }
        if (!this.f5163k) {
            h2.t tVar = this.f5154b.f2676c;
            m7.g gVar = i.f5178a;
            m7.g gVar2 = i.f5178a;
            w2 w2Var = (w2) gVar2.f4957h;
            if (w2Var == null) {
                if (q3.i.f5758k != null) {
                    w2Var = gVar2.o();
                    gVar2.f4957h = w2Var;
                } else {
                    w2Var = j.f5179a;
                }
            }
            if (((Boolean) w2Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // h2.p
    public final float g() {
        return this.f5161i.c();
    }
}
