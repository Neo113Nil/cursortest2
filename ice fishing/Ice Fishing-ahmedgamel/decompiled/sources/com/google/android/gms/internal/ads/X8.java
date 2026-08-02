package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class X8 extends S2.a {
    public static final Parcelable.Creator<X8> CREATOR = new V8(1);

    /* renamed from: A, reason: collision with root package name */
    public long f29273A;

    /* renamed from: B, reason: collision with root package name */
    public String f29274B;

    /* renamed from: C, reason: collision with root package name */
    public int f29275C;

    /* renamed from: n, reason: collision with root package name */
    public final String f29276n;

    /* renamed from: u, reason: collision with root package name */
    public final long f29277u;

    /* renamed from: v, reason: collision with root package name */
    public final String f29278v;

    /* renamed from: w, reason: collision with root package name */
    public final String f29279w;

    /* renamed from: x, reason: collision with root package name */
    public final String f29280x;

    /* renamed from: y, reason: collision with root package name */
    public final Bundle f29281y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f29282z;

    public X8(String str, long j6, String str2, String str3, String str4, Bundle bundle, boolean z6, long j9, String str5, int i) {
        this.f29276n = str;
        this.f29277u = j6;
        this.f29278v = str2 == null ? "" : str2;
        this.f29279w = str3 == null ? "" : str3;
        this.f29280x = str4 == null ? "" : str4;
        this.f29281y = bundle == null ? new Bundle() : bundle;
        this.f29282z = z6;
        this.f29273A = j9;
        this.f29274B = str5;
        this.f29275C = i;
    }

    public static X8 a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                String sb2 = sb.toString();
                int i = w2.z.f41712b;
                x2.i.f(sb2);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new X8(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e9) {
            e = e9;
            int i4 = w2.z.f41712b;
            x2.i.g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e10) {
            e = e10;
            int i42 = w2.z.f41712b;
            x2.i.g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 2, this.f29276n);
        com.bumptech.glide.e.w(parcel, 3, 8);
        parcel.writeLong(this.f29277u);
        com.bumptech.glide.e.r(parcel, 4, this.f29278v);
        com.bumptech.glide.e.r(parcel, 5, this.f29279w);
        com.bumptech.glide.e.r(parcel, 6, this.f29280x);
        com.bumptech.glide.e.n(parcel, 7, this.f29281y);
        com.bumptech.glide.e.w(parcel, 8, 4);
        parcel.writeInt(this.f29282z ? 1 : 0);
        long j6 = this.f29273A;
        com.bumptech.glide.e.w(parcel, 9, 8);
        parcel.writeLong(j6);
        com.bumptech.glide.e.r(parcel, 10, this.f29274B);
        int i4 = this.f29275C;
        com.bumptech.glide.e.w(parcel, 11, 4);
        parcel.writeInt(i4);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
