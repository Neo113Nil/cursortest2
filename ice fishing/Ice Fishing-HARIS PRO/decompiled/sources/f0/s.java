package f0;

import a.AbstractC0078a;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f2964q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f2965r = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f2966a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2967b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2968c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2969d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final t1.h f2970f;

    /* renamed from: g, reason: collision with root package name */
    public final t1.h f2971g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2972h;
    public boolean i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2973k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2974l;

    /* renamed from: m, reason: collision with root package name */
    public final t1.h f2975m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2976n;

    /* renamed from: o, reason: collision with root package name */
    public final t1.h f2977o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2978p;

    public s(String str, String str2, String str3) {
        List list;
        this.f2966a = str;
        this.f2967b = str2;
        this.f2968c = str3;
        ArrayList arrayList = new ArrayList();
        this.f2969d = arrayList;
        this.f2970f = new t1.h(new q(this, 6));
        this.f2971g = new t1.h(new q(this, 4));
        t1.c cVar = t1.c.f4376a;
        this.f2972h = h0.f.r(cVar, new q(this, 7));
        this.j = h0.f.r(cVar, new q(this, 1));
        this.f2973k = h0.f.r(cVar, new q(this, 0));
        this.f2974l = h0.f.r(cVar, new q(this, 3));
        this.f2975m = new t1.h(new q(this, 2));
        this.f2977o = new t1.h(new q(this, 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!f2964q.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String substring = str.substring(0, matcher.start());
            D1.i.d(substring, "substring(...)");
            a(substring, arrayList, sb);
            this.f2978p = (K1.d.g0(sb, ".*") || K1.d.g0(sb, "([^/]+?)")) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb2 = sb.toString();
            D1.i.d(sb2, "uriRegex.toString()");
            this.e = K1.l.f0(sb2, ".*", "\\E.*\\Q");
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(D1.h.g("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        Pattern compile = Pattern.compile("/");
        D1.i.d(compile, "compile(...)");
        K1.d.m0(0);
        Matcher matcher2 = compile.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int i = 0;
            do {
                arrayList2.add(str3.subSequence(i, matcher2.start()).toString());
                i = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(i, str3.length()).toString());
            list = arrayList2;
        } else {
            list = h0.f.s(str3.toString());
        }
        boolean isEmpty = list.isEmpty();
        List list2 = u1.o.f4473a;
        if (!isEmpty) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    int nextIndex = listIterator.nextIndex() + 1;
                    if (nextIndex < 0) {
                        throw new IllegalArgumentException(("Requested element count " + nextIndex + " is less than zero.").toString());
                    }
                    if (nextIndex != 0) {
                        if (nextIndex >= list.size()) {
                            list2 = u1.g.Y(list);
                        } else if (nextIndex == 1) {
                            list2 = h0.f.s(u1.g.M(list));
                        } else {
                            ArrayList arrayList3 = new ArrayList(nextIndex);
                            Iterator it = list.iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                arrayList3.add(it.next());
                                i2++;
                                if (i2 == nextIndex) {
                                    break;
                                }
                            }
                            list2 = u1.h.G(arrayList3);
                        }
                    }
                }
            }
        }
        this.f2976n = K1.l.f0("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f2965r.matcher(str);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            D1.i.c(group, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(group);
            if (matcher.start() > i) {
                String substring = str.substring(i, matcher.start());
                D1.i.d(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]*?|)");
            i = matcher.end();
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            D1.i.d(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public static void e(Bundle bundle, String str, String str2, C0140e c0140e) {
        if (c0140e == null) {
            bundle.putString(str, str2);
            return;
        }
        L l2 = c0140e.f2915a;
        D1.i.e(str, "key");
        l2.e(bundle, str, l2.d(str2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t1.b] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, t1.b] */
    public final ArrayList b() {
        ArrayList arrayList = this.f2969d;
        Collection values = ((Map) this.f2972h.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            u1.m.J(((C0151p) it.next()).f2959b, arrayList2);
        }
        return u1.g.U(u1.g.U(arrayList, arrayList2), (List) this.f2973k.getValue());
    }

    public final boolean c(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f2969d;
        ArrayList arrayList2 = new ArrayList(u1.i.I(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                u1.h.H();
                throw null;
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i2));
            C0140e c0140e = (C0140e) linkedHashMap.get(str);
            try {
                D1.i.d(decode, "value");
                e(bundle, str, decode, c0140e);
                arrayList2.add(t1.i.f4388c);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, t1.b] */
    public final boolean d(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object obj;
        boolean z2;
        Object obj2;
        String query;
        for (Map.Entry entry : ((Map) this.f2972h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            C0151p c0151p = (C0151p) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = h0.f.s(query);
            }
            D1.i.d(queryParameters, "inputParams");
            t1.i iVar = t1.i.f4388c;
            int i = 0;
            Bundle d2 = AbstractC0078a.d(new t1.d[0]);
            Iterator it = c0151p.f2959b.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                C0140e c0140e = (C0140e) linkedHashMap.get(str2);
                L l2 = c0140e != null ? c0140e.f2915a : null;
                if ((l2 instanceof E) && !c0140e.f2917c) {
                    switch (((E) l2).f2871r) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 1:
                            obj2 = u1.o.f4473a;
                            break;
                        case 2:
                            obj2 = new float[0];
                            break;
                        case 3:
                            obj2 = u1.o.f4473a;
                            break;
                        case 4:
                            obj2 = new int[0];
                            break;
                        case 5:
                            obj2 = u1.o.f4473a;
                            break;
                        case 6:
                            obj2 = new long[0];
                            break;
                        case 7:
                            obj2 = u1.o.f4473a;
                            break;
                        case 8:
                            obj2 = new String[0];
                            break;
                        default:
                            obj2 = u1.o.f4473a;
                            break;
                    }
                    l2.e(d2, str2, obj2);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = c0151p.f2958a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList = c0151p.f2959b;
                ArrayList arrayList2 = new ArrayList(u1.i.I(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i2 = i;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        u1.h.H();
                        throw null;
                    }
                    String str5 = (String) next;
                    String group = matcher.group(i3);
                    if (group == null) {
                        group = "";
                    }
                    C0140e c0140e2 = (C0140e) linkedHashMap.get(str5);
                    if (d2.containsKey(str5)) {
                        if (d2.containsKey(str5)) {
                            if (c0140e2 != null) {
                                L l3 = c0140e2.f2915a;
                                Object a2 = l3.a(d2, str5);
                                if (!d2.containsKey(str5)) {
                                    throw new IllegalArgumentException("There is no previous value in this bundle.");
                                }
                                l3.e(d2, str5, l3.c(a2, group));
                            }
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        obj = Boolean.valueOf(z2);
                        arrayList2.add(obj);
                        i2 = i3;
                        i = 0;
                    } else {
                        e(d2, str5, group, c0140e2);
                        obj = iVar;
                        arrayList2.add(obj);
                        i2 = i3;
                        i = 0;
                    }
                }
            }
            bundle.putAll(d2);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return D1.i.a(this.f2966a, sVar.f2966a) && D1.i.a(this.f2967b, sVar.f2967b) && D1.i.a(this.f2968c, sVar.f2968c);
    }

    public final int hashCode() {
        String str = this.f2966a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2967b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2968c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
