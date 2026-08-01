package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.tE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3933tE {

    /* renamed from: c, reason: collision with root package name */
    public static final C3933tE f34229c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3933tE f34230d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3933tE f34231e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3933tE f34232f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3933tE f34233g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3933tE f34234h;
    public static final C3933tE i;

    /* renamed from: j, reason: collision with root package name */
    public static final C3933tE f34235j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3933tE f34236k;

    /* renamed from: l, reason: collision with root package name */
    public static final C3933tE f34237l;

    /* renamed from: m, reason: collision with root package name */
    public static final C3933tE f34238m;

    /* renamed from: n, reason: collision with root package name */
    public static final C3933tE f34239n;

    /* renamed from: o, reason: collision with root package name */
    public static final C3933tE f34240o;

    /* renamed from: p, reason: collision with root package name */
    public static final C3933tE f34241p;

    /* renamed from: q, reason: collision with root package name */
    public static final C3933tE f34242q;

    /* renamed from: r, reason: collision with root package name */
    public static final C3933tE f34243r;

    /* renamed from: s, reason: collision with root package name */
    public static final C3933tE f34244s;

    /* renamed from: t, reason: collision with root package name */
    public static final C3933tE f34245t;

    /* renamed from: u, reason: collision with root package name */
    public static final C3933tE f34246u;

    /* renamed from: v, reason: collision with root package name */
    public static final C3933tE f34247v;

    /* renamed from: w, reason: collision with root package name */
    public static final C3933tE f34248w;

    /* renamed from: x, reason: collision with root package name */
    public static final C3933tE f34249x;

    /* renamed from: y, reason: collision with root package name */
    public static final C3933tE f34250y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34252b;

    static {
        int i6 = 0;
        f34229c = new C3933tE("UNKNOWN_PREFIX", i6);
        f34230d = new C3933tE("TINK", i6);
        f34231e = new C3933tE("LEGACY", i6);
        f34232f = new C3933tE("RAW", i6);
        f34233g = new C3933tE("CRUNCHY", i6);
        f34234h = new C3933tE("WITH_ID_REQUIREMENT", i6);
        int i9 = 1;
        i = new C3933tE("TINK", i9);
        f34235j = new C3933tE("CRUNCHY", i9);
        f34236k = new C3933tE("NO_PREFIX", i9);
        int i10 = 2;
        f34237l = new C3933tE("ASSUME_AES_GCM", i10);
        f34238m = new C3933tE("ASSUME_XCHACHA20POLY1305", i10);
        f34239n = new C3933tE("ASSUME_CHACHA20POLY1305", i10);
        f34240o = new C3933tE("ASSUME_AES_CTR_HMAC", i10);
        f34241p = new C3933tE("ASSUME_AES_EAX", i10);
        f34242q = new C3933tE("ASSUME_AES_GCM_SIV", i10);
        int i11 = 3;
        f34243r = new C3933tE("TINK", i11);
        f34244s = new C3933tE("CRUNCHY", i11);
        f34245t = new C3933tE("LEGACY", i11);
        f34246u = new C3933tE("NO_PREFIX", i11);
        int i12 = 4;
        f34247v = new C3933tE("TINK", i12);
        f34248w = new C3933tE("CRUNCHY", i12);
        f34249x = new C3933tE("LEGACY", i12);
        f34250y = new C3933tE("NO_PREFIX", i12);
    }

    public /* synthetic */ C3933tE(String str, int i6) {
        this.f34251a = i6;
        this.f34252b = str;
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e9) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e9);
                String join = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(join).length() + length + 2 + 1), str2, " [", join, "]");
            }
        }
        return D.y.s(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f34252b, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.f34252b, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f34252b, str, objArr));
        }
    }

    public void d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f34252b, str, objArr), remoteException);
        }
    }

    public String toString() {
        switch (this.f34251a) {
            case 0:
                return this.f34252b;
            case 1:
                return this.f34252b;
            case 2:
                return this.f34252b;
            case 3:
                return this.f34252b;
            case 4:
                return this.f34252b;
            default:
                return super.toString();
        }
    }

    public C3933tE(String str) {
        this.f34251a = 6;
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(myUid).length() + 15 + String.valueOf(myPid).length() + 2);
        u1.h.h(sb, "UID: [", myUid, "]  PID: [", myPid);
        sb.append("] ");
        this.f34252b = sb.toString().concat(str);
    }
}
