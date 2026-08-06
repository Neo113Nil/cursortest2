package p0;

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
import q0.AbstractC1035a;

/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007d extends AbstractC1035a {
    public static final Parcelable.Creator<C1007d> CREATOR = new C.l(21);

    /* renamed from: o, reason: collision with root package name */
    public static final Scope[] f8349o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final m0.d[] f8350p = new m0.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f8351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8353c;

    /* renamed from: d, reason: collision with root package name */
    public String f8354d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f8355e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f8356f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f8357g;

    /* renamed from: h, reason: collision with root package name */
    public Account f8358h;

    /* renamed from: i, reason: collision with root package name */
    public m0.d[] f8359i;

    /* renamed from: j, reason: collision with root package name */
    public m0.d[] f8360j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8361k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8362l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8363m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8364n;

    public C1007d(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, m0.d[] dVarArr, m0.d[] dVarArr2, boolean z2, int i5, boolean z3, String str2) {
        scopeArr = scopeArr == null ? f8349o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        m0.d[] dVarArr3 = f8350p;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f8351a = i2;
        this.f8352b = i3;
        this.f8353c = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f8354d = "com.google.android.gms";
        } else {
            this.f8354d = str;
        }
        if (i2 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i6 = AbstractBinderC1004a.f8342b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC1008e c1003c = queryLocalInterface instanceof InterfaceC1008e ? (InterfaceC1008e) queryLocalInterface : new C1003C(iBinder);
                if (c1003c != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((C1003C) c1003c).a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f8358h = account2;
        } else {
            this.f8355e = iBinder;
            this.f8358h = account;
        }
        this.f8356f = scopeArr;
        this.f8357g = bundle;
        this.f8359i = dVarArr;
        this.f8360j = dVarArr2;
        this.f8361k = z2;
        this.f8362l = i5;
        this.f8363m = z3;
        this.f8364n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        C.l.a(this, parcel, i2);
    }
}
