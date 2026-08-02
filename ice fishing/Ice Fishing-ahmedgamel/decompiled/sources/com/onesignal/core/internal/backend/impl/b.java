package com.onesignal.core.internal.backend.impl;

import G3.e;
import I7.l;
import Q7.q;
import b8.InterfaceC0537a;
import f8.AbstractC4526c;
import f8.C;
import f8.C4525b;
import f8.EnumC4524a;
import f8.h;
import f8.j;
import f8.r;
import f8.y;
import g8.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import u7.C5081g;
import u7.v;
import v7.AbstractC5120k;
import v7.AbstractC5121l;
import v7.C5117h;
import v7.C5125p;
import y4.g;

/* loaded from: classes2.dex */
public final class b {
    private static final String FEATURES_PROPERTY = "features";
    public static final b INSTANCE = new b();
    private static final AbstractC4526c format;

    public static final class a extends i implements l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return v.f41073a;
        }

        public final void invoke(h Json) {
            kotlin.jvm.internal.h.e(Json, "$this$Json");
            Json.f37511b = true;
        }
    }

    static {
        a builderAction = a.INSTANCE;
        C4525b from = AbstractC4526c.f37500d;
        kotlin.jvm.internal.h.e(from, "from");
        kotlin.jvm.internal.h.e(builderAction, "builderAction");
        h hVar = new h();
        j jVar = from.f37501a;
        hVar.f37510a = jVar.f37519c;
        hVar.f37511b = jVar.f37518b;
        String str = (String) jVar.f37521e;
        hVar.f37512c = str;
        hVar.f37513d = (String) jVar.f37522f;
        hVar.f37514e = (EnumC4524a) jVar.f37523g;
        hVar.f37515f = jVar.f37520d;
        hVar.f37516g = from.f37502b;
        builderAction.invoke((Object) hVar);
        if (!kotlin.jvm.internal.h.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        j jVar2 = new j(hVar.f37511b, hVar.f37510a, hVar.f37512c, hVar.f37513d, hVar.f37515f, hVar.f37514e);
        e module = hVar.f37516g;
        kotlin.jvm.internal.h.e(module, "module");
        format = new r(jVar2, module);
    }

    private b() {
    }

    private final String canonicalFeatureFlagId(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sb.append(Character.toLowerCase(str.charAt(i)));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    private final y findSiblingJsonObject(y yVar, String str, String str2) {
        for (String str3 : AbstractC5120k.t(str, str2)) {
            if (!kotlin.jvm.internal.h.a(str3, FEATURES_PROPERTY)) {
                f8.l lVar = (f8.l) yVar.get(str3);
                if (lVar instanceof y) {
                    return (y) lVar;
                }
            }
        }
        for (Map.Entry entry : yVar.f37545n.entrySet()) {
            String str4 = (String) entry.getKey();
            f8.l lVar2 = (f8.l) entry.getValue();
            if (!kotlin.jvm.internal.h.a(str4, FEATURES_PROPERTY) && q.b0(str4, str) && (lVar2 instanceof y)) {
                return (y) lVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final g parseRootStrict(y yVar) {
        C5081g c5081g;
        String a9;
        String obj;
        f8.l lVar = (f8.l) yVar.get(FEATURES_PROPERTY);
        if (lVar != null) {
            f8.e eVar = lVar instanceof f8.e ? (f8.e) lVar : null;
            if (eVar != null) {
                ArrayList arrayList = new ArrayList();
                List<f8.l> list = eVar.f37504n;
                for (f8.l lVar2 : list) {
                    C c9 = lVar2 instanceof C ? (C) lVar2 : null;
                    if (c9 != null) {
                        if (!c9.c()) {
                            c9 = null;
                        }
                        if (c9 != null && (a9 = c9.a()) != null && (obj = Q7.j.G0(a9).toString()) != null) {
                            if (obj.length() <= 0) {
                                obj = null;
                            }
                            if (obj != null) {
                                c5081g = new C5081g(obj, INSTANCE.canonicalFeatureFlagId(obj));
                                if (c5081g == null) {
                                    arrayList.add(c5081g);
                                }
                            }
                        }
                    }
                    c5081g = null;
                    if (c5081g == null) {
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add((String) ((C5081g) next).f41053u)) {
                        arrayList2.add(next);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(AbstractC5121l.w(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((String) ((C5081g) it2.next()).f41053u);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        C5081g c5081g2 = (C5081g) it3.next();
                        String str = (String) c5081g2.f41052n;
                        String key = (String) c5081g2.f41053u;
                        y findSiblingJsonObject = INSTANCE.findSiblingJsonObject(yVar, str, key);
                        if (findSiblingJsonObject != null) {
                            kotlin.jvm.internal.h.e(key, "key");
                        }
                    }
                    return new g(arrayList3, linkedHashMap.isEmpty() ? null : new y(linkedHashMap));
                }
                if (list.isEmpty()) {
                    return new g(C5125p.f41221n, null);
                }
            }
        }
        return null;
    }

    public final String encodeMetadata(y yVar) {
        char[] cArr = null;
        if (yVar == null) {
            return null;
        }
        AbstractC4526c abstractC4526c = format;
        InterfaceC0537a serializer = f8.l.Companion.serializer();
        abstractC4526c.getClass();
        kotlin.jvm.internal.h.e(serializer, "serializer");
        I1.a aVar = new I1.a((char) 0, 13);
        g8.b bVar = g8.b.f37734c;
        synchronized (bVar) {
            C5117h c5117h = (C5117h) bVar.f35586b;
            char[] cArr2 = (char[]) (c5117h.isEmpty() ? null : c5117h.removeLast());
            if (cArr2 != null) {
                bVar.f35585a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        aVar.f1304v = cArr;
        try {
            new g8.q(new M.h(aVar), abstractC4526c, t.f37773v, new g8.q[t.f37772A.a()]).m(serializer, yVar);
            return aVar.toString();
        } finally {
            aVar.m();
        }
    }

    public final AbstractC4526c getFormat() {
        return format;
    }

    public final g parse(String payload) {
        kotlin.jvm.internal.h.e(payload, "payload");
        g parseSuccessful = parseSuccessful(payload);
        return parseSuccessful == null ? g.Companion.getEMPTY() : parseSuccessful;
    }

    public final Map<String, y> parseStoredMetadataMap(String str) {
        v7.q qVar = v7.q.f41222n;
        if (str != null && !Q7.j.s0(str)) {
            try {
                f8.l a9 = format.a(str);
                y yVar = a9 instanceof y ? (y) a9 : null;
                if (yVar != null) {
                    Set<Map.Entry> entrySet = yVar.f37545n.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : entrySet) {
                        String str2 = (String) entry.getKey();
                        f8.l lVar = (f8.l) entry.getValue();
                        y yVar2 = lVar instanceof y ? (y) lVar : null;
                        C5081g c5081g = yVar2 != null ? new C5081g(str2, yVar2) : null;
                        if (c5081g != null) {
                            arrayList.add(c5081g);
                        }
                    }
                    return v7.t.x(arrayList);
                }
            } catch (Throwable unused) {
            }
        }
        return qVar;
    }

    public final g parseSuccessful(String payload) {
        kotlin.jvm.internal.h.e(payload, "payload");
        try {
            f8.l a9 = format.a(payload);
            y yVar = a9 instanceof y ? (y) a9 : null;
            if (yVar == null) {
                return null;
            }
            return parseRootStrict(yVar);
        } catch (Throwable unused) {
            return null;
        }
    }
}
