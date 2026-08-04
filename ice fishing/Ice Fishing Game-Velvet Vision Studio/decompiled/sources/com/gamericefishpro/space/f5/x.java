package com.gamericefishpro.space.f5;

import android.net.Uri;
import android.os.Bundle;
import com.gamericefishpro.space.h2.w1;
import com.gamericefishpro.space.t.s0;
import com.gamericefishpro.space.t.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final /* synthetic */ int w = 0;
    public final String d;
    public final w1 e;
    public z i;
    public final s0 v;

    static {
        new LinkedHashMap();
    }

    public x(p0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedHashMap linkedHashMap = q0.b;
        String navigatorName = h.d(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.d = navigatorName;
        Intrinsics.checkNotNullParameter(this, "destination");
        w1 w1Var = new w1();
        w1Var.b = this;
        w1Var.c = new ArrayList();
        w1Var.d = new LinkedHashMap();
        this.e = w1Var;
        this.v = new s0(0);
    }

    public final Bundle b(Bundle from) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e.d;
        if (from == null && linkedHashMap.isEmpty()) {
            return null;
        }
        com.gamericefishpro.space.ph.m0.c();
        Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            i iVar = (i) entry.getValue();
            iVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(source, "bundle");
            if (iVar.b && (obj = iVar.c) != null) {
                iVar.a.e(source, name, obj);
            }
        }
        if (from != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                i iVar2 = (i) entry2.getValue();
                iVar2.getClass();
                n0 n0Var = iVar2.a;
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!com.gamericefishpro.space.u6.f.n(name2, source) || !com.gamericefishpro.space.u6.f.G(name2, source)) {
                    try {
                        n0Var.a(name2, source);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder sbL = com.gamericefishpro.space.m5.a.l("Wrong argument type for '", name2, "' in argument savedState. ");
                sbL.append(n0Var.b());
                sbL.append(" expected.");
                throw new IllegalArgumentException(sbL.toString().toString());
            }
        }
        return source;
    }

    public final Map c() {
        return com.gamericefishpro.space.ph.m0.h((LinkedHashMap) this.e.d);
    }

    public w d(com.gamericefishpro.space.a8.c deepLinkRequest) {
        boolean zC;
        Regex regex;
        com.gamericefishpro.space.a8.c cVarB;
        Uri uri = (Uri) deepLinkRequest.e;
        Intrinsics.checkNotNullParameter(deepLinkRequest, "navDeepLinkRequest");
        w1 w1Var = this.e;
        LinkedHashMap arguments = (LinkedHashMap) w1Var.d;
        Intrinsics.checkNotNullParameter(deepLinkRequest, "navDeepLinkRequest");
        ArrayList arrayList = (ArrayList) w1Var.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        w wVar = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v vVar = (v) obj;
            vVar.getClass();
            com.gamericefishpro.space.oh.s sVar = vVar.d;
            Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
            if (((Regex) sVar.getValue()) == null) {
                zC = true;
            } else if (uri == null) {
                zC = false;
            } else {
                Regex regex2 = (Regex) sVar.getValue();
                Intrinsics.b(regex2);
                zC = regex2.c(uri.toString());
            }
            if (zC) {
                Bundle bundleD = uri != null ? vVar.d(uri, arguments) : null;
                int iB = vVar.b(uri);
                String str = (String) deepLinkRequest.v;
                boolean z = str != null && str.equals(null);
                String mimeType = (String) deepLinkRequest.i;
                if (mimeType != null) {
                    Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                }
                if (bundleD == null) {
                    if (z) {
                        Intrinsics.checkNotNullParameter(arguments, "arguments");
                        com.gamericefishpro.space.ph.m0.c();
                        Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        Intrinsics.checkNotNullParameter(source, "source");
                        if (uri != null && (regex = (Regex) sVar.getValue()) != null && (cVarB = regex.b(uri.toString())) != null) {
                            vVar.e(cVarB, source, arguments);
                            if (((Boolean) vVar.e.getValue()).booleanValue()) {
                                vVar.f(uri, source, arguments);
                            }
                        }
                        if (h.e(arguments, new t(source, 1)).isEmpty()) {
                        }
                    }
                }
                w wVar2 = new w((x) w1Var.b, bundleD, vVar.l, iB, z);
                if (wVar == null || wVar2.compareTo(wVar) > 0) {
                    wVar = wVar2;
                }
            }
        }
        return wVar;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof x)) {
                w1 w1Var = this.e;
                ArrayList arrayList = (ArrayList) w1Var.c;
                x xVar = (x) obj;
                s0 s0Var = xVar.v;
                w1 w1Var2 = xVar.e;
                boolean zA = Intrinsics.a(arrayList, (ArrayList) w1Var2.c);
                s0 s0Var2 = this.v;
                if (s0Var2.f() != s0Var.f()) {
                    z = false;
                    break;
                }
                Intrinsics.checkNotNullParameter(s0Var2, "<this>");
                Iterator it = com.gamericefishpro.space.li.j.b(new t0(s0Var2)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!Intrinsics.a(s0Var2.c(iIntValue), s0Var.c(iIntValue))) {
                        z = false;
                        break;
                    }
                }
                if (c().size() != xVar.c().size()) {
                    z2 = false;
                    break;
                }
                Map mapC = c();
                Intrinsics.checkNotNullParameter(mapC, "<this>");
                Set setEntrySet = mapC.entrySet();
                Intrinsics.checkNotNullParameter(setEntrySet, "<this>");
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!xVar.c().containsKey(entry.getKey()) || !Intrinsics.a(xVar.c().get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (w1Var.a != w1Var2.a || !Intrinsics.a((String) w1Var.e, (String) w1Var2.e) || !zA || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        w1 w1Var = this.e;
        int i = w1Var.a * 31;
        String str = (String) w1Var.e;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) w1Var.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = iHashCode * 31;
            String str2 = ((v) obj).a;
            iHashCode = (i3 + (str2 != null ? str2.hashCode() : 0)) * 961;
        }
        s0 s0Var = this.v;
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        if (s0Var.f() > 0) {
            s0Var.g(0).getClass();
            throw new ClassCastException();
        }
        for (String str3 : c().keySet()) {
            int iHashCode2 = (str3.hashCode() + (iHashCode * 31)) * 31;
            Object obj2 = c().get(str3);
            iHashCode = (obj2 != null ? obj2.hashCode() : 0) + iHashCode2;
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        w1 w1Var = this.e;
        w1Var.getClass();
        sb.append(Integer.toHexString(w1Var.a));
        sb.append(")");
        String str = (String) w1Var.e;
        if (str != null && !StringsKt.u(str)) {
            sb.append(" route=");
            sb.append((String) w1Var.e);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
