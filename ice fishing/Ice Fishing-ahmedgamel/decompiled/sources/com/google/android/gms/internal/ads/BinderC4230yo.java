package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Objects;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4230yo extends AbstractBinderC3336i8 implements InterfaceC2482Bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f35222n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f35223u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f35224v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Su f35225w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C3467kg f35226x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C2494Bo f35227y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4230yo(long j6, C3467kg c3467kg, C2494Bo c2494Bo, Su su, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f35222n = obj;
        this.f35223u = str;
        this.f35224v = j6;
        this.f35225w = su;
        this.f35226x = c3467kg;
        Objects.requireNonNull(c2494Bo);
        this.f35227y = c2494Bo;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            d();
        } else {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            AbstractC3388j8.f(parcel);
            U3(readString);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void U3(String str) {
        synchronized (this.f35222n) {
            C2494Bo c2494Bo = this.f35227y;
            String str2 = this.f35223u;
            C4835j.f39733C.f39745k.getClass();
            c2494Bo.d(str2, (int) (SystemClock.elapsedRealtime() - this.f35224v), str, false);
            c2494Bo.f23963l.c(str2, "error");
            c2494Bo.f23966o.c(str2, "error");
            Wu wu = c2494Bo.f23967p;
            Su su = this.f35225w;
            su.S(str);
            su.a(false);
            wu.b(su.q());
            this.f35226x.b(Boolean.FALSE);
        }
    }

    public final void d() {
        synchronized (this.f35222n) {
            C2494Bo c2494Bo = this.f35227y;
            String str = this.f35223u;
            C4835j.f39733C.f39745k.getClass();
            c2494Bo.d(str, (int) (SystemClock.elapsedRealtime() - this.f35224v), "", true);
            c2494Bo.f23963l.b(str);
            c2494Bo.f23966o.z(str);
            Wu wu = c2494Bo.f23967p;
            Su su = this.f35225w;
            su.a(true);
            wu.b(su.q());
            this.f35226x.b(Boolean.TRUE);
        }
    }
}
