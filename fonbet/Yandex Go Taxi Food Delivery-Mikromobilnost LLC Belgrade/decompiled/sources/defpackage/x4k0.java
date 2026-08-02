package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x4k0 {
    public final dmt0 a;
    public final List b = scc.g(o9s.f, o9s.d);

    public x4k0(dmt0 dmt0Var) {
        this.a = dmt0Var;
    }

    public final String a(SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilder spannableStringBuilder2;
        String spannableStringBuilder3 = spannableStringBuilder.toString();
        List<p9s> list = this.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (p9s p9sVar : list) {
                if (cvu0.x(spannableStringBuilder3, p9sVar.a, false) && cvu0.s(spannableStringBuilder3, p9sVar.b, false)) {
                    spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder3);
                    break;
                }
            }
        }
        spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < spannableStringBuilder2.length()) {
            Object[] spans = spannableStringBuilder2.getSpans(i, i + 1, Object.class);
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : spans) {
                if (hashSet.add(new Triple(obj.getClass(), Integer.valueOf(spannableStringBuilder2.getSpanStart(obj)), Integer.valueOf(spannableStringBuilder2.getSpanEnd(obj))))) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof CharacterStyle) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                CharacterStyle characterStyle = (CharacterStyle) it2.next();
                this.a.getClass();
                String a = dmt0.a(characterStyle);
                Pair pair = a != null ? new Pair(a, Integer.valueOf(spannableStringBuilder2.getSpanEnd(characterStyle))) : null;
                if (pair != null) {
                    arrayList4.add(pair);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (((w4k0) next2).b <= i) {
                    arrayList5.add(next2);
                }
            }
            Iterator it4 = new u1l(2, arrayList5).iterator();
            while (true) {
                ListIterator listIterator = ((t2k0) it4).a;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                w4k0 w4k0Var = (w4k0) listIterator.previous();
                if (i <= 0 || !rza.b(spannableStringBuilder2.charAt(i - 1))) {
                    sb.append(w4k0Var.a);
                } else {
                    sb.insert(sb.length() - 1, w4k0Var.a);
                }
            }
            arrayList.removeAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                Object next3 = it5.next();
                Pair pair2 = (Pair) next3;
                if (!arrayList.isEmpty()) {
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        if (jl40.l(((w4k0) it6.next()).a, pair2.c())) {
                            break;
                        }
                    }
                }
                arrayList6.add(next3);
            }
            Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                Pair pair3 = (Pair) it7.next();
                if (rza.b(spannableStringBuilder2.charAt(i))) {
                    sb.append(spannableStringBuilder2.charAt(i));
                    sb.append((String) pair3.c());
                    i++;
                } else {
                    sb.append((String) pair3.c());
                }
                arrayList.add(new w4k0((String) pair3.c(), ((Number) pair3.f()).intValue()));
            }
            if (!arrayList3.isEmpty()) {
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    if (((CharacterStyle) it8.next()) instanceof URLSpan) {
                        Object[] array = arrayList3.toArray(new Object[0]);
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj2 : array) {
                            if (obj2 instanceof URLSpan) {
                                arrayList7.add(obj2);
                            }
                        }
                        URLSpan uRLSpan = (URLSpan) a.P(arrayList7);
                        int spanStart = spannableStringBuilder2.getSpanStart(uRLSpan);
                        int spanEnd = spannableStringBuilder2.getSpanEnd(uRLSpan);
                        sb.append("[");
                        sb.append(spannableStringBuilder2.subSequence(spanStart, spanEnd));
                        sb.append("](" + uRLSpan.getURL() + Extension.C_BRAKE);
                        i = ((Number) new Pair(Integer.valueOf(spanStart), Integer.valueOf(spanEnd)).getSecond()).intValue();
                    }
                }
            }
            if (i < spannableStringBuilder2.length()) {
                sb.append(spannableStringBuilder2.charAt(i));
            }
            i++;
        }
        Iterator it9 = new s2k0(arrayList).iterator();
        while (true) {
            ListIterator listIterator2 = ((r2k0) it9).a;
            if (!listIterator2.hasPrevious()) {
                return sb.toString();
            }
            w4k0 w4k0Var2 = (w4k0) listIterator2.previous();
            if (sb.length() <= 0 || !rza.b(gvu0.x0(sb))) {
                sb.append(w4k0Var2.a);
            } else {
                sb.insert(sb.length() - 1, w4k0Var2.a);
            }
        }
    }
}
