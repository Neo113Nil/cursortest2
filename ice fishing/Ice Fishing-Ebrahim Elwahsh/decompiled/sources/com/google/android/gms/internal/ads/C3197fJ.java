package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.fJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3197fJ {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f30685f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f30686a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f30687b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30688c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30689d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30690e;

    static {
        A2.a("media3.datasource");
    }

    public C3197fJ(Uri uri, long j9, long j10) {
        this(uri, Collections.EMPTY_MAP, j9, j10, 0);
    }

    public final String toString() {
        String obj = this.f30686a.toString();
        int length = obj.length();
        long j9 = this.f30688c;
        int length2 = String.valueOf(j9).length();
        long j10 = this.f30689d;
        int length3 = String.valueOf(j10).length();
        int i = this.f30690e;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        sb.append("DataSpec[GET ");
        sb.append(obj);
        sb.append(", ");
        sb.append(j9);
        com.anythink.basead.b.c.i.x(sb, ", ", j10, ", null, ");
        return AbstractC5051n.e(i, "]", sb);
    }

    public C3197fJ(Uri uri, Map map, long j9, long j10, int i) {
        boolean z8 = false;
        boolean z9 = j9 >= 0;
        PA.n(z9);
        PA.n(z9);
        if (j10 <= 0) {
            j10 = j10 == -1 ? -1L : j10;
            PA.n(z8);
            uri.getClass();
            this.f30686a = uri;
            this.f30687b = Collections.unmodifiableMap(new HashMap(map));
            this.f30688c = j9;
            this.f30689d = j10;
            this.f30690e = i;
        }
        z8 = true;
        PA.n(z8);
        uri.getClass();
        this.f30686a = uri;
        this.f30687b = Collections.unmodifiableMap(new HashMap(map));
        this.f30688c = j9;
        this.f30689d = j10;
        this.f30690e = i;
    }
}
