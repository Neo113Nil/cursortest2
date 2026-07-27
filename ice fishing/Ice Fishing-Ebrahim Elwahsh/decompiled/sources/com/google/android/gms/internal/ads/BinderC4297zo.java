package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.zo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4297zo extends AbstractBinderC3186f8 implements InterfaceC4123wc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f35606n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f35607u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f35608v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Vu f35609w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C3320hg f35610x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C2527Do f35611y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4297zo(long j9, C3320hg c3320hg, C2527Do c2527Do, Vu vu, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f35606n = obj;
        this.f35607u = str;
        this.f35608v = j9;
        this.f35609w = vu;
        this.f35610x = c3320hg;
        Objects.requireNonNull(c2527Do);
        this.f35611y = c2527Do;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            c();
        } else {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            AbstractC3241g8.f(parcel);
            G3(readString);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void G3(String str) {
        synchronized (this.f35606n) {
            C2527Do c2527Do = this.f35611y;
            String str2 = this.f35607u;
            p2.j.f39798C.f39810k.getClass();
            c2527Do.d(str2, (int) (SystemClock.elapsedRealtime() - this.f35608v), str, false);
            c2527Do.f24565l.c(str2, "error");
            c2527Do.f24568o.i(str2, "error");
            Zu zu = c2527Do.f24569p;
            Vu vu = this.f35609w;
            vu.h(str);
            vu.b(false);
            zu.b(vu.m());
            this.f35610x.a(Boolean.FALSE);
        }
    }

    public final void c() {
        synchronized (this.f35606n) {
            C2527Do c2527Do = this.f35611y;
            String str = this.f35607u;
            p2.j.f39798C.f39810k.getClass();
            c2527Do.d(str, (int) (SystemClock.elapsedRealtime() - this.f35608v), "", true);
            c2527Do.f24565l.b(str);
            c2527Do.f24568o.b(str);
            Zu zu = c2527Do.f24569p;
            Vu vu = this.f35609w;
            vu.b(true);
            zu.b(vu.m());
            this.f35610x.a(Boolean.TRUE);
        }
    }
}
