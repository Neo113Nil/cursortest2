package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Objects;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.zo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4307zo extends AbstractBinderC3359i8 implements InterfaceC2502Bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f36220n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f36221u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f36222v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Su f36223w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C3490kg f36224x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C2531Co f36225y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4307zo(long j6, C3490kg c3490kg, C2531Co c2531Co, Su su, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f36220n = obj;
        this.f36221u = str;
        this.f36222v = j6;
        this.f36223w = su;
        this.f36224x = c3490kg;
        Objects.requireNonNull(c2531Co);
        this.f36225y = c2531Co;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            d();
        } else {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            AbstractC3411j8.f(parcel);
            U3(readString);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void U3(String str) {
        synchronized (this.f36220n) {
            C2531Co c2531Co = this.f36225y;
            String str2 = this.f36221u;
            C4906k.f40186C.f40198k.getClass();
            c2531Co.d(str2, (int) (SystemClock.elapsedRealtime() - this.f36222v), str, false);
            c2531Co.f24976l.c(str2, "error");
            c2531Co.f24979o.c(str2, "error");
            Wu wu = c2531Co.f24980p;
            Su su = this.f36223w;
            su.S(str);
            su.a(false);
            wu.b(su.q());
            this.f36224x.b(Boolean.FALSE);
        }
    }

    public final void d() {
        synchronized (this.f36220n) {
            C2531Co c2531Co = this.f36225y;
            String str = this.f36221u;
            C4906k.f40186C.f40198k.getClass();
            c2531Co.d(str, (int) (SystemClock.elapsedRealtime() - this.f36222v), "", true);
            c2531Co.f24976l.b(str);
            c2531Co.f24979o.z(str);
            Wu wu = c2531Co.f24980p;
            Su su = this.f36223w;
            su.a(true);
            wu.b(su.q());
            this.f36224x.b(Boolean.TRUE);
        }
    }
}
