package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import p2.C4835j;

/* loaded from: classes2.dex */
public final class FE implements KD, InterfaceC3742pl, Eu {

    /* renamed from: A, reason: collision with root package name */
    public static final FE f24758A;

    /* renamed from: B, reason: collision with root package name */
    public static final FE f24759B;

    /* renamed from: C, reason: collision with root package name */
    public static final FE f24760C;

    /* renamed from: D, reason: collision with root package name */
    public static final FE f24761D;

    /* renamed from: E, reason: collision with root package name */
    public static final FE f24762E;

    /* renamed from: F, reason: collision with root package name */
    public static final FE f24763F;

    /* renamed from: G, reason: collision with root package name */
    public static final FE f24764G;

    /* renamed from: H, reason: collision with root package name */
    public static final FE f24765H;

    /* renamed from: I, reason: collision with root package name */
    public static final FE f24766I;
    public static final FE J;

    /* renamed from: K, reason: collision with root package name */
    public static final FE f24767K;

    /* renamed from: L, reason: collision with root package name */
    public static final FE f24768L;

    /* renamed from: M, reason: collision with root package name */
    public static final FE f24769M;

    /* renamed from: v, reason: collision with root package name */
    public static final FE f24770v;

    /* renamed from: w, reason: collision with root package name */
    public static final FE f24771w;

    /* renamed from: x, reason: collision with root package name */
    public static final FE f24772x;

    /* renamed from: y, reason: collision with root package name */
    public static final FE f24773y;

    /* renamed from: z, reason: collision with root package name */
    public static final FE f24774z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24775n;

    /* renamed from: u, reason: collision with root package name */
    public final String f24776u;

    static {
        int i = 0;
        f24770v = new FE("SHA1", i);
        f24771w = new FE("SHA224", i);
        f24772x = new FE("SHA256", i);
        f24773y = new FE("SHA384", i);
        f24774z = new FE("SHA512", i);
        int i6 = 1;
        f24758A = new FE("TINK", i6);
        f24759B = new FE("CRUNCHY", i6);
        f24760C = new FE("NO_PREFIX", i6);
        int i9 = 2;
        f24761D = new FE("TINK", i9);
        f24762E = new FE("NO_PREFIX", i9);
        int i10 = 3;
        f24763F = new FE("TINK", i10);
        f24764G = new FE("CRUNCHY", i10);
        f24765H = new FE("LEGACY", i10);
        f24766I = new FE("NO_PREFIX", i10);
        int i11 = 4;
        J = new FE("TINK", i11);
        f24767K = new FE("CRUNCHY", i11);
        f24768L = new FE("LEGACY", i11);
        f24769M = new FE("NO_PREFIX", i11);
    }

    public /* synthetic */ FE(String str, int i) {
        this.f24775n = i;
        this.f24776u = str;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f24776u, Integer.toString(0)});
        return null;
    }

    public String toString() {
        switch (this.f24775n) {
            case 0:
                return this.f24776u;
            case 1:
                return this.f24776u;
            case 2:
                return this.f24776u;
            case 3:
                return this.f24776u;
            case 4:
                return this.f24776u;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C4835j.f39733C.f39743h.d(this.f24776u, th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        switch (this.f24775n) {
            case 6:
                ((InterfaceC4011ul) obj).z(this.f24776u);
                break;
            default:
                ((InterfaceC2627Jl) obj).b(this.f24776u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
    }
}
