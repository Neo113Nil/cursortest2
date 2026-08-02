package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import r2.C4906k;

/* loaded from: classes2.dex */
public final class FE implements KD, InterfaceC3765pl, Eu {

    /* renamed from: A, reason: collision with root package name */
    public static final FE f25514A;

    /* renamed from: B, reason: collision with root package name */
    public static final FE f25515B;

    /* renamed from: C, reason: collision with root package name */
    public static final FE f25516C;

    /* renamed from: D, reason: collision with root package name */
    public static final FE f25517D;

    /* renamed from: E, reason: collision with root package name */
    public static final FE f25518E;

    /* renamed from: F, reason: collision with root package name */
    public static final FE f25519F;

    /* renamed from: G, reason: collision with root package name */
    public static final FE f25520G;

    /* renamed from: H, reason: collision with root package name */
    public static final FE f25521H;

    /* renamed from: I, reason: collision with root package name */
    public static final FE f25522I;
    public static final FE J;

    /* renamed from: K, reason: collision with root package name */
    public static final FE f25523K;

    /* renamed from: L, reason: collision with root package name */
    public static final FE f25524L;

    /* renamed from: M, reason: collision with root package name */
    public static final FE f25525M;

    /* renamed from: v, reason: collision with root package name */
    public static final FE f25526v;

    /* renamed from: w, reason: collision with root package name */
    public static final FE f25527w;

    /* renamed from: x, reason: collision with root package name */
    public static final FE f25528x;

    /* renamed from: y, reason: collision with root package name */
    public static final FE f25529y;

    /* renamed from: z, reason: collision with root package name */
    public static final FE f25530z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25531n;

    /* renamed from: u, reason: collision with root package name */
    public final String f25532u;

    static {
        int i = 0;
        f25526v = new FE("SHA1", i);
        f25527w = new FE("SHA224", i);
        f25528x = new FE("SHA256", i);
        f25529y = new FE("SHA384", i);
        f25530z = new FE("SHA512", i);
        int i4 = 1;
        f25514A = new FE("TINK", i4);
        f25515B = new FE("CRUNCHY", i4);
        f25516C = new FE("NO_PREFIX", i4);
        int i6 = 2;
        f25517D = new FE("TINK", i6);
        f25518E = new FE("NO_PREFIX", i6);
        int i9 = 3;
        f25519F = new FE("TINK", i9);
        f25520G = new FE("CRUNCHY", i9);
        f25521H = new FE("LEGACY", i9);
        f25522I = new FE("NO_PREFIX", i9);
        int i10 = 4;
        J = new FE("TINK", i10);
        f25523K = new FE("CRUNCHY", i10);
        f25524L = new FE("LEGACY", i10);
        f25525M = new FE("NO_PREFIX", i10);
    }

    public /* synthetic */ FE(String str, int i) {
        this.f25531n = i;
        this.f25532u = str;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f25532u, Integer.toString(0)});
        return null;
    }

    public String toString() {
        switch (this.f25531n) {
            case 0:
                return this.f25532u;
            case 1:
                return this.f25532u;
            case 2:
                return this.f25532u;
            case 3:
                return this.f25532u;
            case 4:
                return this.f25532u;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C4906k.f40186C.f40196h.d(this.f25532u, th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a, reason: collision with other method in class */
    public /* synthetic */ void mo5a(Object obj) {
        switch (this.f25531n) {
            case 6:
                ((InterfaceC4088vl) obj).z(this.f25532u);
                break;
            default:
                ((InterfaceC2664Kl) obj).b(this.f25532u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
    }
}
