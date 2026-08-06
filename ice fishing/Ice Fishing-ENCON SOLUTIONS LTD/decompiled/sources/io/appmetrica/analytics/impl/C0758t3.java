package io.appmetrica.analytics.impl;

import A1.C0015p;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758t3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0862x3 fromModel(C0732s3 c0732s3) {
        C0862x3 c0862x3 = new C0862x3();
        c0862x3.f7171a = a(c0732s3.f6880a);
        int size = c0732s3.f6881b.size();
        C0784u3[] c0784u3Arr = new C0784u3[size];
        for (int i2 = 0; i2 < size; i2++) {
            c0784u3Arr[i2] = a((C0706r3) c0732s3.f6881b.get(i2));
        }
        c0862x3.f7172b = c0784u3Arr;
        return c0862x3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0732s3 toModel(C0862x3 c0862x3) {
        C0784u3 c0784u3 = c0862x3.f7171a;
        if (c0784u3 == null) {
            c0784u3 = new C0784u3();
        }
        C0706r3 a2 = a(c0784u3);
        C0784u3[] c0784u3Arr = c0862x3.f7172b;
        ArrayList arrayList = new ArrayList(c0784u3Arr.length);
        for (C0784u3 c0784u32 : c0784u3Arr) {
            arrayList.add(a(c0784u32));
        }
        return new C0732s3(a2, arrayList);
    }

    public static C0784u3 a(C0706r3 c0706r3) {
        C0836w3 c0836w3;
        C0784u3 c0784u3 = new C0784u3();
        Map map = c0706r3.f6806a;
        int i2 = 0;
        if (map != null) {
            c0836w3 = new C0836w3();
            int size = map.size();
            C0810v3[] c0810v3Arr = new C0810v3[size];
            for (int i3 = 0; i3 < size; i3++) {
                c0810v3Arr[i3] = new C0810v3();
            }
            c0836w3.f7089a = c0810v3Arr;
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C0810v3 c0810v3 = c0836w3.f7089a[i4];
                c0810v3.f7037a = str;
                c0810v3.f7038b = str2;
                i4++;
            }
        } else {
            c0836w3 = null;
        }
        c0784u3.f6964a = c0836w3;
        int ordinal = c0706r3.f6807b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i2 = 2;
                if (ordinal != 2) {
                    i2 = 3;
                    if (ordinal != 3) {
                        throw new C0015p();
                    }
                }
            } else {
                i2 = 1;
            }
        }
        c0784u3.f6965b = i2;
        return c0784u3;
    }

    public static C0706r3 a(C0784u3 c0784u3) {
        LinkedHashMap linkedHashMap;
        S7 s7;
        C0836w3 c0836w3 = c0784u3.f6964a;
        if (c0836w3 != null) {
            C0810v3[] c0810v3Arr = c0836w3.f7089a;
            int G = i1.v.G(c0810v3Arr.length);
            if (G < 16) {
                G = 16;
            }
            linkedHashMap = new LinkedHashMap(G);
            for (C0810v3 c0810v3 : c0810v3Arr) {
                linkedHashMap.put(c0810v3.f7037a, c0810v3.f7038b);
            }
        } else {
            linkedHashMap = null;
        }
        int i2 = c0784u3.f6965b;
        if (i2 == 0) {
            s7 = S7.f5044b;
        } else if (i2 == 1) {
            s7 = S7.f5045c;
        } else if (i2 == 2) {
            s7 = S7.f5046d;
        } else if (i2 != 3) {
            s7 = S7.f5044b;
        } else {
            s7 = S7.f5047e;
        }
        return new C0706r3(linkedHashMap, s7);
    }
}
