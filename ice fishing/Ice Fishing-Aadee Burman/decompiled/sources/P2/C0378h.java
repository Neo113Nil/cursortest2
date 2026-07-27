package P2;

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

/* renamed from: P2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378h extends Q2.a {
    public static final Parcelable.Creator<C0378h> CREATOR = new B8.d(17);

    /* renamed from: H, reason: collision with root package name */
    public static final Scope[] f2487H = new Scope[0];

    /* renamed from: I, reason: collision with root package name */
    public static final M2.d[] f2488I = new M2.d[0];

    /* renamed from: A, reason: collision with root package name */
    public Account f2489A;

    /* renamed from: B, reason: collision with root package name */
    public M2.d[] f2490B;

    /* renamed from: C, reason: collision with root package name */
    public M2.d[] f2491C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f2492D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2493E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2494F;

    /* renamed from: G, reason: collision with root package name */
    public final String f2495G;

    /* renamed from: n, reason: collision with root package name */
    public final int f2496n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2497u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2498v;

    /* renamed from: w, reason: collision with root package name */
    public String f2499w;

    /* renamed from: x, reason: collision with root package name */
    public IBinder f2500x;

    /* renamed from: y, reason: collision with root package name */
    public Scope[] f2501y;

    /* renamed from: z, reason: collision with root package name */
    public Bundle f2502z;

    public C0378h(int i, int i6, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, M2.d[] dVarArr, M2.d[] dVarArr2, boolean z3, int i10, boolean z6, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f2487H : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        M2.d[] dVarArr3 = f2488I;
        M2.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f2496n = i;
        this.f2497u = i6;
        this.f2498v = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f2499w = "com.google.android.gms";
        } else {
            this.f2499w = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i11 = AbstractBinderC0371a.f2451u;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface k9 = queryLocalInterface instanceof InterfaceC0380j ? (InterfaceC0380j) queryLocalInterface : new K(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (k9 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            K k10 = (K) k9;
                            Parcel e02 = k10.e0(k10.w0(), 2);
                            Account account3 = (Account) c3.h.a(e02, Account.CREATOR);
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
            this.f2489A = account2;
        } else {
            this.f2500x = iBinder;
            this.f2489A = account;
        }
        this.f2501y = scopeArr2;
        this.f2502z = bundle2;
        this.f2490B = dVarArr4;
        this.f2491C = dVarArr3;
        this.f2492D = z3;
        this.f2493E = i10;
        this.f2494F = z6;
        this.f2495G = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        B8.d.a(this, parcel, i);
    }
}
