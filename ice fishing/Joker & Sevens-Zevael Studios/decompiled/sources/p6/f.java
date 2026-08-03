package p6;

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

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new e7.c(19);

    /* renamed from: u, reason: collision with root package name */
    public static final Scope[] f5578u = new Scope[0];

    /* renamed from: v, reason: collision with root package name */
    public static final m6.d[] f5579v = new m6.d[0];

    /* renamed from: g, reason: collision with root package name */
    public final int f5580g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5581h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5582i;

    /* renamed from: j, reason: collision with root package name */
    public String f5583j;

    /* renamed from: k, reason: collision with root package name */
    public IBinder f5584k;

    /* renamed from: l, reason: collision with root package name */
    public Scope[] f5585l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f5586m;

    /* renamed from: n, reason: collision with root package name */
    public Account f5587n;

    /* renamed from: o, reason: collision with root package name */
    public m6.d[] f5588o;

    /* renamed from: p, reason: collision with root package name */
    public m6.d[] f5589p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5590q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5591r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5592s;

    /* renamed from: t, reason: collision with root package name */
    public final String f5593t;

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, m6.d[] dVarArr, m6.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f5578u : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        m6.d[] dVarArr3 = f5579v;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f5580g = i10;
        this.f5581h = i11;
        this.f5582i = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f5583j = "com.google.android.gms";
        } else {
            this.f5583j = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f5538d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface e0Var = queryLocalInterface instanceof g ? (g) queryLocalInterface : new e0(iBinder);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        account2 = ((e0) e0Var).b();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f5587n = account2;
        } else {
            this.f5584k = iBinder;
            this.f5587n = account;
        }
        this.f5585l = scopeArr;
        this.f5586m = bundle;
        this.f5588o = dVarArr;
        this.f5589p = dVarArr2;
        this.f5590q = z10;
        this.f5591r = i13;
        this.f5592s = z11;
        this.f5593t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e7.c.a(this, parcel, i10);
    }
}
