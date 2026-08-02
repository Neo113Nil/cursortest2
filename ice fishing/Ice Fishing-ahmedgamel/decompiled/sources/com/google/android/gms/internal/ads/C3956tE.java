package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.tE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3956tE {

    /* renamed from: c, reason: collision with root package name */
    public static final C3956tE f35015c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3956tE f35016d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3956tE f35017e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3956tE f35018f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3956tE f35019g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3956tE f35020h;
    public static final C3956tE i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3956tE f35021j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3956tE f35022k;

    /* renamed from: l, reason: collision with root package name */
    public static final C3956tE f35023l;

    /* renamed from: m, reason: collision with root package name */
    public static final C3956tE f35024m;

    /* renamed from: n, reason: collision with root package name */
    public static final C3956tE f35025n;

    /* renamed from: o, reason: collision with root package name */
    public static final C3956tE f35026o;

    /* renamed from: p, reason: collision with root package name */
    public static final C3956tE f35027p;

    /* renamed from: q, reason: collision with root package name */
    public static final C3956tE f35028q;

    /* renamed from: r, reason: collision with root package name */
    public static final C3956tE f35029r;

    /* renamed from: s, reason: collision with root package name */
    public static final C3956tE f35030s;

    /* renamed from: t, reason: collision with root package name */
    public static final C3956tE f35031t;

    /* renamed from: u, reason: collision with root package name */
    public static final C3956tE f35032u;

    /* renamed from: v, reason: collision with root package name */
    public static final C3956tE f35033v;

    /* renamed from: w, reason: collision with root package name */
    public static final C3956tE f35034w;

    /* renamed from: x, reason: collision with root package name */
    public static final C3956tE f35035x;

    /* renamed from: y, reason: collision with root package name */
    public static final C3956tE f35036y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35037a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35038b;

    static {
        int i4 = 0;
        f35015c = new C3956tE("UNKNOWN_PREFIX", i4);
        f35016d = new C3956tE("TINK", i4);
        f35017e = new C3956tE("LEGACY", i4);
        f35018f = new C3956tE("RAW", i4);
        f35019g = new C3956tE("CRUNCHY", i4);
        f35020h = new C3956tE("WITH_ID_REQUIREMENT", i4);
        int i6 = 1;
        i = new C3956tE("TINK", i6);
        f35021j = new C3956tE("CRUNCHY", i6);
        f35022k = new C3956tE("NO_PREFIX", i6);
        int i9 = 2;
        f35023l = new C3956tE("ASSUME_AES_GCM", i9);
        f35024m = new C3956tE("ASSUME_XCHACHA20POLY1305", i9);
        f35025n = new C3956tE("ASSUME_CHACHA20POLY1305", i9);
        f35026o = new C3956tE("ASSUME_AES_CTR_HMAC", i9);
        f35027p = new C3956tE("ASSUME_AES_EAX", i9);
        f35028q = new C3956tE("ASSUME_AES_GCM_SIV", i9);
        int i10 = 3;
        f35029r = new C3956tE("TINK", i10);
        f35030s = new C3956tE("CRUNCHY", i10);
        f35031t = new C3956tE("LEGACY", i10);
        f35032u = new C3956tE("NO_PREFIX", i10);
        int i11 = 4;
        f35033v = new C3956tE("TINK", i11);
        f35034w = new C3956tE("CRUNCHY", i11);
        f35035x = new C3956tE("LEGACY", i11);
        f35036y = new C3956tE("NO_PREFIX", i11);
    }

    public /* synthetic */ C3956tE(String str, int i4) {
        this.f35037a = i4;
        this.f35038b = str;
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e9) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e9);
                String join = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(join).length() + length + 2 + 1), str2, " [", join, "]");
            }
        }
        return D.x.p(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f35038b, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.f35038b, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f35038b, str, objArr));
        }
    }

    public void d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f35038b, str, objArr), remoteException);
        }
    }

    public String toString() {
        switch (this.f35037a) {
            case 0:
                return this.f35038b;
            case 1:
                return this.f35038b;
            case 2:
                return this.f35038b;
            case 3:
                return this.f35038b;
            case 4:
                return this.f35038b;
            default:
                return super.toString();
        }
    }

    public C3956tE(String str) {
        this.f35037a = 6;
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(myUid).length() + 15 + String.valueOf(myPid).length() + 2);
        AbstractC5128c.g(sb, "UID: [", myUid, "]  PID: [", myPid);
        sb.append("] ");
        this.f35038b = sb.toString().concat(str);
    }
}
