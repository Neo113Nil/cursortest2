package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.k7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3464k7 {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f32158c = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    public final String[] f32159a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3358i7 f32160b;

    public C3464k7(InterfaceC3358i7 interfaceC3358i7) {
        this.f32160b = interfaceC3358i7;
    }

    public static Uri d(Uri uri, String str) {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals("ad.doubleclick.net")) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new C3518l7("Parameter already exists: dc_ms");
                        }
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new C3518l7("Query parameter already exists: ms");
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i4 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i4) + "ms=" + str + "&" + uri3.substring(i4));
        } catch (UnsupportedOperationException unused2) {
            throw new C3518l7("Provided Uri is not in a valid state");
        }
    }

    public final boolean a(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f32159a;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final Uri b(Uri uri, Context context, View view, Activity activity) {
        try {
            return d(uri, this.f32160b.c(context, uri.getQueryParameter(com.anythink.expressad.f.a.b.da), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C3518l7("Provided Uri is not in a valid state");
        }
    }

    public final boolean c(Uri uri) {
        if (a(uri)) {
            String[] strArr = f32158c;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
