package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2971bJ {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f29278f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f29279a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f29280b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29281c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29282d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29283e;

    static {
        AbstractC4083w2.a("media3.datasource");
    }

    public C2971bJ(Uri uri, long j6, long j9) {
        this(uri, Collections.EMPTY_MAP, j6, j9, 0);
    }

    public final String toString() {
        String obj = this.f29279a.toString();
        int length = obj.length();
        long j6 = this.f29281c;
        int length2 = String.valueOf(j6).length();
        long j9 = this.f29282d;
        int length3 = String.valueOf(j9).length();
        int i = this.f29283e;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        sb.append("DataSpec[GET ");
        sb.append(obj);
        sb.append(", ");
        sb.append(j6);
        D.y.x(sb, ", ", j9, ", null, ");
        return u1.h.e(i, "]", sb);
    }

    public C2971bJ(Uri uri, Map map, long j6, long j9, int i) {
        boolean z3 = false;
        boolean z6 = j6 >= 0;
        AbstractC2772Sd.i(z6);
        AbstractC2772Sd.i(z6);
        if (j9 <= 0) {
            j9 = j9 == -1 ? -1L : j9;
            AbstractC2772Sd.i(z3);
            uri.getClass();
            this.f29279a = uri;
            this.f29280b = Collections.unmodifiableMap(new HashMap(map));
            this.f29281c = j6;
            this.f29282d = j9;
            this.f29283e = i;
        }
        z3 = true;
        AbstractC2772Sd.i(z3);
        uri.getClass();
        this.f29279a = uri;
        this.f29280b = Collections.unmodifiableMap(new HashMap(map));
        this.f29281c = j6;
        this.f29282d = j9;
        this.f29283e = i;
    }
}
