package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.bJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2994bJ {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f30066f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f30067a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f30068b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30069c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30070d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30071e;

    static {
        AbstractC4106w2.a("media3.datasource");
    }

    public C2994bJ(Uri uri, long j6, long j9) {
        this(uri, Collections.EMPTY_MAP, j6, j9, 0);
    }

    public final String toString() {
        String obj = this.f30067a.toString();
        int length = obj.length();
        long j6 = this.f30069c;
        int length2 = String.valueOf(j6).length();
        long j9 = this.f30070d;
        int length3 = String.valueOf(j9).length();
        int i = this.f30071e;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        sb.append("DataSpec[GET ");
        sb.append(obj);
        sb.append(", ");
        sb.append(j6);
        com.IceFishing.LiveIceFishing.k.z(sb, ", ", j9, ", null, ");
        return AbstractC5128c.e(i, "]", sb);
    }

    public C2994bJ(Uri uri, Map map, long j6, long j9, int i) {
        boolean z6 = false;
        boolean z9 = j6 >= 0;
        AbstractC2792Sd.i(z9);
        AbstractC2792Sd.i(z9);
        if (j9 <= 0) {
            j9 = j9 == -1 ? -1L : j9;
            AbstractC2792Sd.i(z6);
            uri.getClass();
            this.f30067a = uri;
            this.f30068b = Collections.unmodifiableMap(new HashMap(map));
            this.f30069c = j6;
            this.f30070d = j9;
            this.f30071e = i;
        }
        z6 = true;
        AbstractC2792Sd.i(z6);
        uri.getClass();
        this.f30067a = uri;
        this.f30068b = Collections.unmodifiableMap(new HashMap(map));
        this.f30069c = j6;
        this.f30070d = j9;
        this.f30071e = i;
    }
}
