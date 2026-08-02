package io.appmetrica.analytics.impl;

import defpackage.gw00;
import defpackage.w511;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.m4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0525m4 implements ProtobufConverter {
    public static C0554n4 a(C0467k4 c0467k4) {
        C0612p4 c0612p4;
        C0554n4 c0554n4 = new C0554n4();
        Map map = c0467k4.a;
        int i = 0;
        if (map != null) {
            c0612p4 = new C0612p4();
            int size = map.size();
            C0583o4[] c0583o4Arr = new C0583o4[size];
            for (int i2 = 0; i2 < size; i2++) {
                c0583o4Arr[i2] = new C0583o4();
            }
            c0612p4.a = c0583o4Arr;
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C0583o4 c0583o4 = c0612p4.a[i3];
                c0583o4.a = str;
                c0583o4.b = str2;
                i3++;
            }
        } else {
            c0612p4 = null;
        }
        c0554n4.a = c0612p4;
        int ordinal = c0467k4.b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        w511.b();
                        return null;
                    }
                }
            } else {
                i = 1;
            }
        }
        c0554n4.b = i;
        return c0554n4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0496l4 toModel(C0641q4 c0641q4) {
        C0554n4 c0554n4 = c0641q4.a;
        if (c0554n4 == null) {
            c0554n4 = new C0554n4();
        }
        C0467k4 a = a(c0554n4);
        C0554n4[] c0554n4Arr = c0641q4.b;
        ArrayList arrayList = new ArrayList(c0554n4Arr.length);
        for (C0554n4 c0554n42 : c0554n4Arr) {
            arrayList.add(a(c0554n42));
        }
        return new C0496l4(a, arrayList);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0641q4 fromModel(C0496l4 c0496l4) {
        C0641q4 c0641q4 = new C0641q4();
        c0641q4.a = a(c0496l4.a);
        int size = c0496l4.b.size();
        C0554n4[] c0554n4Arr = new C0554n4[size];
        for (int i = 0; i < size; i++) {
            c0554n4Arr[i] = a((C0467k4) c0496l4.b.get(i));
        }
        c0641q4.b = c0554n4Arr;
        return c0641q4;
    }

    public static C0467k4 a(C0554n4 c0554n4) {
        LinkedHashMap linkedHashMap;
        EnumC0271d9 enumC0271d9;
        C0612p4 c0612p4 = c0554n4.a;
        if (c0612p4 != null) {
            C0583o4[] c0583o4Arr = c0612p4.a;
            int d = gw00.d(c0583o4Arr.length);
            if (d < 16) {
                d = 16;
            }
            linkedHashMap = new LinkedHashMap(d);
            for (C0583o4 c0583o4 : c0583o4Arr) {
                Pair pair = new Pair(c0583o4.a, c0583o4.b);
                linkedHashMap.put(pair.c(), pair.f());
            }
        } else {
            linkedHashMap = null;
        }
        int i = c0554n4.b;
        if (i == 0) {
            enumC0271d9 = EnumC0271d9.c;
        } else if (i == 1) {
            enumC0271d9 = EnumC0271d9.d;
        } else if (i == 2) {
            enumC0271d9 = EnumC0271d9.e;
        } else if (i != 3) {
            enumC0271d9 = EnumC0271d9.c;
        } else {
            enumC0271d9 = EnumC0271d9.f;
        }
        return new C0467k4(linkedHashMap, enumC0271d9);
    }
}
