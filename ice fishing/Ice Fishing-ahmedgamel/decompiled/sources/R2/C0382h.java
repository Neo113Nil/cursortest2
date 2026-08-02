package R2;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* renamed from: R2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382h extends S2.a {
    public static final Parcelable.Creator<C0382h> CREATOR = new B8.d(17);

    /* renamed from: H, reason: collision with root package name */
    public static final Scope[] f2808H = new Scope[0];

    /* renamed from: I, reason: collision with root package name */
    public static final O2.d[] f2809I = new O2.d[0];

    /* renamed from: A, reason: collision with root package name */
    public Account f2810A;

    /* renamed from: B, reason: collision with root package name */
    public O2.d[] f2811B;

    /* renamed from: C, reason: collision with root package name */
    public O2.d[] f2812C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f2813D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2814E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2815F;

    /* renamed from: G, reason: collision with root package name */
    public final String f2816G;

    /* renamed from: n, reason: collision with root package name */
    public final int f2817n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2818u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2819v;

    /* renamed from: w, reason: collision with root package name */
    public String f2820w;

    /* renamed from: x, reason: collision with root package name */
    public IBinder f2821x;

    /* renamed from: y, reason: collision with root package name */
    public Scope[] f2822y;

    /* renamed from: z, reason: collision with root package name */
    public Bundle f2823z;

    public C0382h(int i, int i4, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, O2.d[] dVarArr, O2.d[] dVarArr2, boolean z6, int i9, boolean z9, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f2808H : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        O2.d[] dVarArr3 = f2809I;
        O2.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f2817n = i;
        this.f2818u = i4;
        this.f2819v = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f2820w = "com.google.android.gms";
        } else {
            this.f2820w = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i10 = AbstractBinderC0375a.f2772u;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface k9 = queryLocalInterface instanceof InterfaceC0384j ? (InterfaceC0384j) queryLocalInterface : new K(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                if (k9 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            K k10 = (K) k9;
                            Parcel e02 = k10.e0(k10.t0(), 2);
                            Account account3 = (Account) e3.h.a(e02, Account.CREATOR);
                            e02.recycle();
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f2810A = account2;
        } else {
            this.f2821x = iBinder;
            this.f2810A = account;
        }
        this.f2822y = scopeArr2;
        this.f2823z = bundle2;
        this.f2811B = dVarArr4;
        this.f2812C = dVarArr3;
        this.f2813D = z6;
        this.f2814E = i9;
        this.f2815F = z9;
        this.f2816G = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        B8.d.a(this, parcel, i);
    }
}
