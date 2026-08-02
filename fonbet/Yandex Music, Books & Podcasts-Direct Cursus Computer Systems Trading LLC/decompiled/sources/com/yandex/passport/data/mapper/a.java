package com.yandex.passport.data.mapper;

import android.os.Parcelable;
import com.yandex.passport.common.core.e;
import com.yandex.passport.common.core.g;
import com.yandex.passport.data.models.w;
import defpackage.v75;
import defpackage.x3f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a {
    public final x3f a;

    public a(x3f x3fVar) {
        this.a = x3fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List] */
    public static g a(w wVar) {
        ArrayList arrayList;
        wVar.getClass();
        List list = wVar.D;
        if (list.isEmpty()) {
            arrayList = e.b;
        } else {
            List<String> list2 = list;
            ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
            for (String str : list2) {
                Parcelable.Creator<e> creator = e.CREATOR;
                str.getClass();
                arrayList2.add(new e(str));
            }
            arrayList = arrayList2;
        }
        String str2 = wVar.a;
        String str3 = wVar.b;
        long j = wVar.c;
        long j2 = wVar.d;
        String str4 = wVar.e;
        String str5 = wVar.f;
        String str6 = wVar.g;
        String str7 = wVar.h;
        int i = wVar.i;
        String str8 = wVar.j;
        String str9 = wVar.k;
        boolean z = wVar.l;
        String str10 = wVar.m;
        boolean z2 = wVar.n;
        String str11 = wVar.o;
        boolean z3 = wVar.p;
        boolean z4 = wVar.q;
        boolean z5 = wVar.r;
        String str12 = wVar.s;
        String str13 = wVar.t;
        String str14 = wVar.u;
        int i2 = wVar.v;
        String str15 = wVar.w;
        String str16 = wVar.x;
        boolean z6 = wVar.y;
        String str17 = wVar.z;
        boolean z7 = wVar.A;
        boolean z8 = wVar.B;
        boolean z9 = wVar.C;
        boolean z10 = wVar.E;
        boolean z11 = wVar.F;
        boolean z12 = wVar.G;
        boolean z13 = wVar.H;
        boolean z14 = wVar.I;
        boolean z15 = wVar.J;
        boolean z16 = wVar.K;
        return new g(i, i2, j, j2, wVar.L, wVar.Y, str2, str3, str4, str5, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str6, arrayList, wVar.X, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, wVar.Z, wVar.v0, wVar.w0);
    }

    public static Pair b(String str) {
        List e0;
        if (str != null && (e0 = StringsKt.e0(str, new char[]{':'}, 6)) != null) {
            if (e0.size() != 2) {
                e0 = null;
            }
            if (e0 != null) {
                String z = com.yandex.plus.core.network.api.utils.a.z((String) e0.get(1));
                Integer intOrNull = StringsKt.toIntOrNull((String) e0.get(0));
                return new Pair(z, new com.yandex.passport.common.time.a(com.yandex.passport.common.time.a.c(0, intOrNull != null ? intOrNull.intValue() : 0, 0, 11)));
            }
        }
        return new Pair(null, new com.yandex.passport.common.time.a(0L));
    }

    public static String c(long j, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((int) (j / 1000));
        sb.append(':');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
