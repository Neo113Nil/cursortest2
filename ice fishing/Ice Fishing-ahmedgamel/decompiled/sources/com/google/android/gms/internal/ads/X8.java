package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class X8 extends Q2.a {
    public static final Parcelable.Creator<X8> CREATOR = new V8(1);

    /* renamed from: A, reason: collision with root package name */
    public long f28493A;

    /* renamed from: B, reason: collision with root package name */
    public String f28494B;

    /* renamed from: C, reason: collision with root package name */
    public int f28495C;

    /* renamed from: n, reason: collision with root package name */
    public final String f28496n;

    /* renamed from: u, reason: collision with root package name */
    public final long f28497u;

    /* renamed from: v, reason: collision with root package name */
    public final String f28498v;

    /* renamed from: w, reason: collision with root package name */
    public final String f28499w;

    /* renamed from: x, reason: collision with root package name */
    public final String f28500x;

    /* renamed from: y, reason: collision with root package name */
    public final Bundle f28501y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f28502z;

    public X8(String str, long j6, String str2, String str3, String str4, Bundle bundle, boolean z3, long j9, String str5, int i) {
        this.f28496n = str;
        this.f28497u = j6;
        this.f28498v = str2 == null ? "" : str2;
        this.f28499w = str3 == null ? "" : str3;
        this.f28500x = str4 == null ? "" : str4;
        this.f28501y = bundle == null ? new Bundle() : bundle;
        this.f28502z = z3;
        this.f28493A = j9;
        this.f28494B = str5;
        this.f28495C = i;
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
                int i = u2.z.f41322b;
                v2.i.f(sb2);
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
            int i6 = u2.z.f41322b;
            v2.i.g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e10) {
            e = e10;
            int i62 = u2.z.f41322b;
            v2.i.g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 2, this.f28496n);
        A8.b.F(parcel, 3, 8);
        parcel.writeLong(this.f28497u);
        A8.b.z(parcel, 4, this.f28498v);
        A8.b.z(parcel, 5, this.f28499w);
        A8.b.z(parcel, 6, this.f28500x);
        A8.b.v(parcel, 7, this.f28501y);
        A8.b.F(parcel, 8, 4);
        parcel.writeInt(this.f28502z ? 1 : 0);
        long j6 = this.f28493A;
        A8.b.F(parcel, 9, 8);
        parcel.writeLong(j6);
        A8.b.z(parcel, 10, this.f28494B);
        int i6 = this.f28495C;
        A8.b.F(parcel, 11, 4);
        parcel.writeInt(i6);
        A8.b.I(parcel, G7);
    }
}
