package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3547m5 {

    /* renamed from: a, reason: collision with root package name */
    public long f31898a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31899b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31900c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31901d;

    /* renamed from: e, reason: collision with root package name */
    public final long f31902e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31903f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31904g;

    /* renamed from: h, reason: collision with root package name */
    public final List f31905h;

    public C3547m5(String str, String str2, long j6, long j9, long j10, long j11, List list) {
        this.f31899b = str;
        this.f31900c = true == "".equals(str2) ? null : str2;
        this.f31901d = j6;
        this.f31902e = j9;
        this.f31903f = j10;
        this.f31904g = j11;
        this.f31905h = list;
    }

    public static C3547m5 a(C3601n5 c3601n5) {
        if (C3709p5.v(c3601n5) != 538247942) {
            throw new IOException();
        }
        String z3 = C3709p5.z(c3601n5);
        String z6 = C3709p5.z(c3601n5);
        long x9 = C3709p5.x(c3601n5);
        long x10 = C3709p5.x(c3601n5);
        long x11 = C3709p5.x(c3601n5);
        long x12 = C3709p5.x(c3601n5);
        int v9 = C3709p5.v(c3601n5);
        if (v9 < 0) {
            throw new IOException(D.y.m(v9, "readHeaderList size=", new StringBuilder(String.valueOf(v9).length() + 20)));
        }
        List arrayList = v9 == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < v9; i++) {
            arrayList.add(new Z4(C3709p5.z(c3601n5).intern(), C3709p5.z(c3601n5).intern()));
        }
        return new C3547m5(z3, z6, x9, x10, x11, x12, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3547m5(String str, W4 w42) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = w42.f28314b;
        long j6 = w42.f28315c;
        long j9 = w42.f28316d;
        long j10 = w42.f28317e;
        long j11 = w42.f28318f;
        List list = w42.f28320h;
        if (list == 0) {
            Map map = w42.f28319g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new Z4((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }
}
