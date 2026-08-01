package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import g0.AbstractC0156a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r.C0343k;
import r.C0344l;

/* loaded from: classes.dex */
public class w {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f2988a;

    /* renamed from: b, reason: collision with root package name */
    public y f2989b;

    /* renamed from: c, reason: collision with root package name */
    public String f2990c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2991d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final C0343k f2992f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f2993g;

    /* renamed from: h, reason: collision with root package name */
    public int f2994h;
    public String i;

    static {
        new LinkedHashMap();
    }

    public w(String str) {
        this.f2988a = str;
        this.e = new ArrayList();
        this.f2992f = new C0343k(0);
        this.f2993g = new LinkedHashMap();
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f2993g;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C0140e c0140e = (C0140e) entry.getValue();
            c0140e.getClass();
            D1.i.e(str, "name");
            if (c0140e.f2917c && (obj = c0140e.f2918d) != null) {
                c0140e.f2915a.e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C0140e c0140e2 = (C0140e) entry2.getValue();
                c0140e2.getClass();
                D1.i.e(str2, "name");
                L l2 = c0140e2.f2915a;
                if (c0140e2.f2916b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        l2.a(bundle2, str2);
                    } catch (ClassCastException unused) {
                    }
                }
                throw new IllegalArgumentException(("Wrong argument type for '" + str2 + "' in argument bundle. " + l2.b() + " expected.").toString());
            }
        }
        return bundle2;
    }

    public final int[] b(w wVar) {
        u1.e eVar = new u1.e();
        w wVar2 = this;
        while (true) {
            y yVar = wVar2.f2989b;
            if ((wVar != null ? wVar.f2989b : null) != null) {
                y yVar2 = wVar.f2989b;
                D1.i.b(yVar2);
                if (yVar2.g(wVar2.f2994h, yVar2, null, false) == wVar2) {
                    eVar.addFirst(wVar2);
                    break;
                }
            }
            if (yVar == null || yVar.f3000l != wVar2.f2994h) {
                eVar.addFirst(wVar2);
            }
            if (D1.i.a(yVar, wVar) || yVar == null) {
                break;
            }
            wVar2 = yVar;
        }
        List Y2 = u1.g.Y(eVar);
        ArrayList arrayList = new ArrayList(u1.i.I(Y2, 10));
        Iterator it = Y2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((w) it.next()).f2994h));
        }
        return u1.g.X(arrayList);
    }

    public final C0139d c(int i) {
        C0343k c0343k = this.f2992f;
        C0139d c0139d = c0343k.e() == 0 ? null : (C0139d) c0343k.b(i);
        if (c0139d != null) {
            return c0139d;
        }
        y yVar = this.f2989b;
        if (yVar != null) {
            return yVar.c(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d1 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035e  */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, t1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u d(M0.h hVar) {
        Bundle bundle;
        int i;
        String str;
        Iterator it;
        int i2;
        u uVar;
        int i3;
        List list;
        u1.o oVar;
        List list2;
        String str2;
        Matcher matcher;
        ArrayList arrayList;
        List list3;
        String str3;
        w wVar = this;
        M0.h hVar2 = hVar;
        ArrayList arrayList2 = wVar.e;
        if (arrayList2.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList2.iterator();
        u uVar2 = null;
        while (it2.hasNext()) {
            s sVar = (s) it2.next();
            LinkedHashMap linkedHashMap = wVar.f2993g;
            Uri uri = (Uri) hVar2.f616b;
            if (uri != null) {
                sVar.getClass();
                D1.i.e(uri, "deepLink");
                D1.i.e(linkedHashMap, "arguments");
                Pattern pattern = (Pattern) sVar.f2970f.getValue();
                Matcher matcher2 = pattern != null ? pattern.matcher(uri.toString()) : null;
                if (matcher2 != null && matcher2.matches()) {
                    Bundle bundle2 = new Bundle();
                    if (sVar.c(matcher2, bundle2, linkedHashMap) && (!((Boolean) sVar.f2971g.getValue()).booleanValue() || sVar.d(uri, bundle2, linkedHashMap))) {
                        String fragment = uri.getFragment();
                        Pattern pattern2 = (Pattern) sVar.f2975m.getValue();
                        Matcher matcher3 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                        if (matcher3 != null && matcher3.matches()) {
                            List list4 = (List) sVar.f2973k.getValue();
                            ArrayList arrayList3 = new ArrayList(u1.i.I(list4, 10));
                            int i4 = 0;
                            for (Object obj : list4) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    u1.h.H();
                                    throw null;
                                }
                                String str4 = (String) obj;
                                String decode = Uri.decode(matcher3.group(i5));
                                C0140e c0140e = (C0140e) linkedHashMap.get(str4);
                                try {
                                    D1.i.d(decode, "value");
                                    s.e(bundle2, str4, decode, c0140e);
                                    arrayList3.add(t1.i.f4388c);
                                    i4 = i5;
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        }
                        bundle = !R.j.S(linkedHashMap, new r(0, bundle2)).isEmpty() ? null : bundle2;
                        if (uri == null) {
                            String str5 = sVar.f2966a;
                            if (str5 != null) {
                                List<String> pathSegments = uri.getPathSegments();
                                List<String> pathSegments2 = Uri.parse(str5).getPathSegments();
                                D1.i.d(pathSegments, "requestedPathSegments");
                                D1.i.d(pathSegments2, "uriPathSegments");
                                Set a02 = u1.g.a0(pathSegments);
                                a02.retainAll(pathSegments2);
                                i = a02.size();
                                int i6 = i;
                                String str6 = (String) hVar2.f617c;
                                boolean z2 = str6 == null && str6.equals(sVar.f2967b);
                                str = (String) hVar2.f618d;
                                if (str != null) {
                                    String str7 = sVar.f2968c;
                                    if (str7 != null) {
                                        Pattern pattern3 = (Pattern) sVar.f2977o.getValue();
                                        D1.i.b(pattern3);
                                        if (pattern3.matcher(str).matches()) {
                                            Pattern compile = Pattern.compile("/");
                                            D1.i.d(compile, "compile(...)");
                                            K1.d.m0(0);
                                            Matcher matcher4 = compile.matcher(str7);
                                            if (matcher4.find()) {
                                                ArrayList arrayList4 = new ArrayList(10);
                                                int i7 = 0;
                                                do {
                                                    arrayList4.add(str7.subSequence(i7, matcher4.start()).toString());
                                                    i7 = matcher4.end();
                                                } while (matcher4.find());
                                                arrayList4.add(str7.subSequence(i7, str7.length()).toString());
                                                list = arrayList4;
                                            } else {
                                                list = h0.f.s(str7.toString());
                                            }
                                            boolean isEmpty = list.isEmpty();
                                            u1.o oVar2 = u1.o.f4473a;
                                            if (!isEmpty) {
                                                ListIterator listIterator = list.listIterator(list.size());
                                                while (listIterator.hasPrevious()) {
                                                    if (((String) listIterator.previous()).length() != 0) {
                                                        oVar = oVar2;
                                                        int nextIndex = listIterator.nextIndex() + 1;
                                                        if (nextIndex < 0) {
                                                            throw new IllegalArgumentException(("Requested element count " + nextIndex + " is less than zero.").toString());
                                                        }
                                                        if (nextIndex == 0) {
                                                            it = it2;
                                                            list2 = oVar;
                                                            String str8 = (String) list2.get(0);
                                                            str2 = (String) list2.get(1);
                                                            Pattern compile2 = Pattern.compile("/");
                                                            D1.i.d(compile2, "compile(...)");
                                                            K1.d.m0(0);
                                                            matcher = compile2.matcher(str);
                                                            if (matcher.find()) {
                                                                arrayList = h0.f.s(str.toString());
                                                            } else {
                                                                ArrayList arrayList5 = new ArrayList(10);
                                                                int i8 = 0;
                                                                do {
                                                                    arrayList5.add(str.subSequence(i8, matcher.start()).toString());
                                                                    i8 = matcher.end();
                                                                } while (matcher.find());
                                                                arrayList5.add(str.subSequence(i8, str.length()).toString());
                                                                arrayList = arrayList5;
                                                            }
                                                            if (!arrayList.isEmpty()) {
                                                                ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
                                                                while (true) {
                                                                    if (!listIterator2.hasPrevious()) {
                                                                        break;
                                                                    }
                                                                    if (((String) listIterator2.previous()).length() != 0) {
                                                                        int nextIndex2 = listIterator2.nextIndex() + 1;
                                                                        if (nextIndex2 < 0) {
                                                                            throw new IllegalArgumentException(("Requested element count " + nextIndex2 + " is less than zero.").toString());
                                                                        }
                                                                        if (nextIndex2 != 0) {
                                                                            if (nextIndex2 >= arrayList.size()) {
                                                                                list3 = u1.g.Y(arrayList);
                                                                            } else if (nextIndex2 == 1) {
                                                                                list3 = h0.f.s(u1.g.M(arrayList));
                                                                            } else {
                                                                                ArrayList arrayList6 = new ArrayList(nextIndex2);
                                                                                Iterator it3 = arrayList.iterator();
                                                                                int i9 = 0;
                                                                                while (it3.hasNext()) {
                                                                                    arrayList6.add(it3.next());
                                                                                    i9++;
                                                                                    if (i9 == nextIndex2) {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                list3 = u1.h.G(arrayList6);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            list3 = oVar;
                                                            String str9 = (String) list3.get(0);
                                                            str3 = (String) list3.get(1);
                                                            i3 = D1.i.a(str8, str9) ? 2 : 0;
                                                            if (D1.i.a(str2, str3)) {
                                                                i3++;
                                                            }
                                                            i2 = i3;
                                                        } else {
                                                            if (nextIndex >= list.size()) {
                                                                list2 = u1.g.Y(list);
                                                            } else if (nextIndex == 1) {
                                                                list2 = h0.f.s(u1.g.M(list));
                                                            } else {
                                                                ArrayList arrayList7 = new ArrayList(nextIndex);
                                                                Iterator it4 = list.iterator();
                                                                int i10 = 0;
                                                                while (true) {
                                                                    if (!it4.hasNext()) {
                                                                        it = it2;
                                                                        break;
                                                                    }
                                                                    it = it2;
                                                                    arrayList7.add(it4.next());
                                                                    Iterator it5 = it4;
                                                                    int i11 = i10 + 1;
                                                                    if (i11 == nextIndex) {
                                                                        break;
                                                                    }
                                                                    i10 = i11;
                                                                    it2 = it;
                                                                    it4 = it5;
                                                                }
                                                                list2 = u1.h.G(arrayList7);
                                                                String str82 = (String) list2.get(0);
                                                                str2 = (String) list2.get(1);
                                                                Pattern compile22 = Pattern.compile("/");
                                                                D1.i.d(compile22, "compile(...)");
                                                                K1.d.m0(0);
                                                                matcher = compile22.matcher(str);
                                                                if (matcher.find()) {
                                                                }
                                                                if (!arrayList.isEmpty()) {
                                                                }
                                                                list3 = oVar;
                                                                String str92 = (String) list3.get(0);
                                                                str3 = (String) list3.get(1);
                                                                if (D1.i.a(str82, str92)) {
                                                                }
                                                                if (D1.i.a(str2, str3)) {
                                                                }
                                                                i2 = i3;
                                                            }
                                                            it = it2;
                                                            String str822 = (String) list2.get(0);
                                                            str2 = (String) list2.get(1);
                                                            Pattern compile222 = Pattern.compile("/");
                                                            D1.i.d(compile222, "compile(...)");
                                                            K1.d.m0(0);
                                                            matcher = compile222.matcher(str);
                                                            if (matcher.find()) {
                                                            }
                                                            if (!arrayList.isEmpty()) {
                                                            }
                                                            list3 = oVar;
                                                            String str922 = (String) list3.get(0);
                                                            str3 = (String) list3.get(1);
                                                            if (D1.i.a(str822, str922)) {
                                                            }
                                                            if (D1.i.a(str2, str3)) {
                                                            }
                                                            i2 = i3;
                                                        }
                                                    }
                                                }
                                            }
                                            oVar = oVar2;
                                            it = it2;
                                            list2 = oVar;
                                            String str8222 = (String) list2.get(0);
                                            str2 = (String) list2.get(1);
                                            Pattern compile2222 = Pattern.compile("/");
                                            D1.i.d(compile2222, "compile(...)");
                                            K1.d.m0(0);
                                            matcher = compile2222.matcher(str);
                                            if (matcher.find()) {
                                            }
                                            if (!arrayList.isEmpty()) {
                                            }
                                            list3 = oVar;
                                            String str9222 = (String) list3.get(0);
                                            str3 = (String) list3.get(1);
                                            if (D1.i.a(str8222, str9222)) {
                                            }
                                            if (D1.i.a(str2, str3)) {
                                            }
                                            i2 = i3;
                                        }
                                    }
                                    it = it2;
                                    i3 = -1;
                                    i2 = i3;
                                } else {
                                    it = it2;
                                    i2 = -1;
                                }
                                if (bundle == null) {
                                    if (z2 || i2 > -1) {
                                        D1.i.e(linkedHashMap, "arguments");
                                        Bundle bundle3 = new Bundle();
                                        if (uri != null) {
                                            Pattern pattern4 = (Pattern) sVar.f2970f.getValue();
                                            Matcher matcher5 = pattern4 != null ? pattern4.matcher(uri.toString()) : null;
                                            if (matcher5 != null && matcher5.matches()) {
                                                sVar.c(matcher5, bundle3, linkedHashMap);
                                                if (((Boolean) sVar.f2971g.getValue()).booleanValue()) {
                                                    sVar.d(uri, bundle3, linkedHashMap);
                                                }
                                            }
                                        }
                                        if (!R.j.S(linkedHashMap, new r(1, bundle3)).isEmpty()) {
                                        }
                                    }
                                    wVar = this;
                                    hVar2 = hVar;
                                    it2 = it;
                                }
                                uVar = new u(this, bundle, sVar.f2978p, i6, z2, i2);
                                if (uVar2 == null || uVar.compareTo(uVar2) > 0) {
                                    hVar2 = hVar;
                                    uVar2 = uVar;
                                    it2 = it;
                                    wVar = this;
                                } else {
                                    wVar = this;
                                    hVar2 = hVar;
                                    it2 = it;
                                }
                            }
                        } else {
                            sVar.getClass();
                        }
                        i = 0;
                        int i62 = i;
                        String str62 = (String) hVar2.f617c;
                        if (str62 == null) {
                        }
                        str = (String) hVar2.f618d;
                        if (str != null) {
                        }
                        if (bundle == null) {
                        }
                        uVar = new u(this, bundle, sVar.f2978p, i62, z2, i2);
                        if (uVar2 == null) {
                        }
                        hVar2 = hVar;
                        uVar2 = uVar;
                        it2 = it;
                        wVar = this;
                    }
                }
            }
            bundle = null;
            if (uri == null) {
            }
            i = 0;
            int i622 = i;
            String str622 = (String) hVar2.f617c;
            if (str622 == null) {
            }
            str = (String) hVar2.f618d;
            if (str != null) {
            }
            if (bundle == null) {
            }
            uVar = new u(this, bundle, sVar.f2978p, i622, z2, i2);
            if (uVar2 == null) {
            }
            hVar2 = hVar;
            uVar2 = uVar;
            it2 = it;
            wVar = this;
        }
        return uVar2;
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC0156a.e);
        D1.i.d(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.f2994h = 0;
            this.f2990c = null;
        } else {
            if (K1.d.k0(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String concat = "android-app://androidx.navigation/".concat(string);
            D1.i.e(concat, "uriPattern");
            ArrayList S2 = R.j.S(this.f2993g, new v(new s(concat, null, null), 1));
            if (!S2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + string + "\" for destination " + this + ". Following required arguments are missing: " + S2).toString());
            }
            new t1.h(new J1.j(4, concat));
            this.f2994h = concat.hashCode();
            this.f2990c = null;
        }
        this.i = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.f2994h = resourceId;
            this.f2990c = null;
            this.f2990c = R.j.w(context, resourceId);
        }
        this.f2991d = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z2;
        int size;
        LinkedHashMap linkedHashMap;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        boolean a2 = D1.i.a(this.e, wVar.e);
        C0343k c0343k = this.f2992f;
        int e = c0343k.e();
        C0343k c0343k2 = wVar.f2992f;
        if (e == c0343k2.e()) {
            Iterator it = J1.h.e0(new C0344l(c0343k)).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!D1.i.a(c0343k.b(intValue), c0343k2.b(intValue))) {
                }
            }
            z2 = true;
            LinkedHashMap linkedHashMap2 = this.f2993g;
            size = linkedHashMap2.size();
            linkedHashMap = wVar.f2993g;
            if (size == linkedHashMap.size()) {
                Set<Map.Entry> entrySet = linkedHashMap2.entrySet();
                D1.i.e(entrySet, "<this>");
                for (Map.Entry entry : entrySet) {
                    if (linkedHashMap.containsKey(entry.getKey()) && D1.i.a(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                    }
                }
                z3 = true;
                return this.f2994h != wVar.f2994h && D1.i.a(this.i, wVar.i) && a2 && z2 && z3;
            }
            z3 = false;
            if (this.f2994h != wVar.f2994h) {
            }
        }
        z2 = false;
        LinkedHashMap linkedHashMap22 = this.f2993g;
        size = linkedHashMap22.size();
        linkedHashMap = wVar.f2993g;
        if (size == linkedHashMap.size()) {
        }
        z3 = false;
        if (this.f2994h != wVar.f2994h) {
        }
    }

    public int hashCode() {
        Set<String> keySet;
        int i = this.f2994h * 31;
        String str = this.i;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            int i2 = hashCode * 31;
            String str2 = sVar.f2966a;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = sVar.f2967b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = sVar.f2968c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        C0343k c0343k = this.f2992f;
        D1.i.e(c0343k, "<this>");
        int i3 = 0;
        while (true) {
            if (!(i3 < c0343k.e())) {
                break;
            }
            int i4 = i3 + 1;
            C0139d c0139d = (C0139d) c0343k.f(i3);
            int i5 = ((hashCode * 31) + c0139d.f2912a) * 31;
            C0134C c0134c = c0139d.f2913b;
            hashCode = i5 + (c0134c != null ? c0134c.hashCode() : 0);
            Bundle bundle = c0139d.f2914c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                for (String str5 : keySet) {
                    int i6 = hashCode * 31;
                    Bundle bundle2 = c0139d.f2914c;
                    D1.i.b(bundle2);
                    Object obj = bundle2.get(str5);
                    hashCode = i6 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i3 = i4;
        }
        LinkedHashMap linkedHashMap = this.f2993g;
        for (String str6 : linkedHashMap.keySet()) {
            int b2 = D1.h.b(str6, hashCode * 31, 31);
            Object obj2 = linkedHashMap.get(str6);
            hashCode = b2 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f2990c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f2994h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.i;
        if (str2 != null && !K1.d.k0(str2)) {
            sb.append(" route=");
            sb.append(this.i);
        }
        if (this.f2991d != null) {
            sb.append(" label=");
            sb.append(this.f2991d);
        }
        String sb2 = sb.toString();
        D1.i.d(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(N n2) {
        this(R.j.E(n2.getClass()));
        D1.i.e(n2, "navigator");
        LinkedHashMap linkedHashMap = O.f2894b;
    }
}
