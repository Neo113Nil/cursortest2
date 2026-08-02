package io.appmetrica.analytics.impl;

import defpackage.b6e;
import defpackage.tah;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0336i4 implements ProtobufConverter {
    public static C0364j4 a(C0278g4 c0278g4) {
        C0422l4 c0422l4;
        C0364j4 c0364j4 = new C0364j4();
        Map map = c0278g4.a;
        int i = 0;
        if (map != null) {
            c0422l4 = new C0422l4();
            int size = map.size();
            C0393k4[] c0393k4Arr = new C0393k4[size];
            for (int i2 = 0; i2 < size; i2++) {
                c0393k4Arr[i2] = new C0393k4();
            }
            c0422l4.a = c0393k4Arr;
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C0393k4 c0393k4 = c0422l4.a[i3];
                c0393k4.a = str;
                c0393k4.b = str2;
                i3++;
            }
        } else {
            c0422l4 = null;
        }
        c0364j4.a = c0422l4;
        int ordinal = c0278g4.b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                }
            } else {
                i = 1;
            }
        }
        c0364j4.b = i;
        return c0364j4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0307h4 toModel(@NotNull C0451m4 c0451m4) {
        C0364j4 c0364j4 = c0451m4.a;
        if (c0364j4 == null) {
            c0364j4 = new C0364j4();
        }
        C0278g4 a = a(c0364j4);
        C0364j4[] c0364j4Arr = c0451m4.b;
        ArrayList arrayList = new ArrayList(c0364j4Arr.length);
        for (C0364j4 c0364j42 : c0364j4Arr) {
            arrayList.add(a(c0364j42));
        }
        return new C0307h4(a, arrayList);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0451m4 fromModel(@NotNull C0307h4 c0307h4) {
        C0451m4 c0451m4 = new C0451m4();
        c0451m4.a = a(c0307h4.a);
        int size = c0307h4.b.size();
        C0364j4[] c0364j4Arr = new C0364j4[size];
        for (int i = 0; i < size; i++) {
            c0364j4Arr[i] = a((C0278g4) c0307h4.b.get(i));
        }
        c0451m4.b = c0364j4Arr;
        return c0451m4;
    }

    public static C0278g4 a(C0364j4 c0364j4) {
        LinkedHashMap linkedHashMap;
        X8 x8;
        C0422l4 c0422l4 = c0364j4.a;
        if (c0422l4 != null) {
            C0393k4[] c0393k4Arr = c0422l4.a;
            int a = tah.a(c0393k4Arr.length);
            if (a < 16) {
                a = 16;
            }
            linkedHashMap = new LinkedHashMap(a);
            for (C0393k4 c0393k4 : c0393k4Arr) {
                linkedHashMap.put(c0393k4.a, c0393k4.b);
            }
        } else {
            linkedHashMap = null;
        }
        int i = c0364j4.b;
        if (i == 0) {
            x8 = X8.b;
        } else if (i == 1) {
            x8 = X8.c;
        } else if (i == 2) {
            x8 = X8.d;
        } else if (i != 3) {
            x8 = X8.b;
        } else {
            x8 = X8.e;
        }
        return new C0278g4(linkedHashMap, x8);
    }
}
