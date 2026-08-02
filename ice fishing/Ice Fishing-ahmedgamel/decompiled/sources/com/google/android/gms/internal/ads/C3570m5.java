package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3570m5 {

    /* renamed from: a, reason: collision with root package name */
    public long f32678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32679b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32680c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32681d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32682e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32683f;

    /* renamed from: g, reason: collision with root package name */
    public final long f32684g;

    /* renamed from: h, reason: collision with root package name */
    public final List f32685h;

    public C3570m5(String str, String str2, long j6, long j9, long j10, long j11, List list) {
        this.f32679b = str;
        this.f32680c = true == "".equals(str2) ? null : str2;
        this.f32681d = j6;
        this.f32682e = j9;
        this.f32683f = j10;
        this.f32684g = j11;
        this.f32685h = list;
    }

    public static C3570m5 a(C3624n5 c3624n5) {
        if (C3732p5.v(c3624n5) != 538247942) {
            throw new IOException();
        }
        String z6 = C3732p5.z(c3624n5);
        String z9 = C3732p5.z(c3624n5);
        long x9 = C3732p5.x(c3624n5);
        long x10 = C3732p5.x(c3624n5);
        long x11 = C3732p5.x(c3624n5);
        long x12 = C3732p5.x(c3624n5);
        int v9 = C3732p5.v(c3624n5);
        if (v9 < 0) {
            throw new IOException(D.x.k(v9, "readHeaderList size=", new StringBuilder(String.valueOf(v9).length() + 20)));
        }
        List arrayList = v9 == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < v9; i++) {
            arrayList.add(new Z4(C3732p5.z(c3624n5).intern(), C3732p5.z(c3624n5).intern()));
        }
        return new C3570m5(z6, z9, x9, x10, x11, x12, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3570m5(String str, W4 w42) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = w42.f29112b;
        long j6 = w42.f29113c;
        long j9 = w42.f29114d;
        long j10 = w42.f29115e;
        long j11 = w42.f29116f;
        List list = w42.f29118h;
        if (list == 0) {
            Map map = w42.f29117g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new Z4((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }
}
