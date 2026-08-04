package com.gamericefishpro.space.v8;

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

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<h> CREATOR = new v(5);
    public static final Scope[] H = new Scope[0];
    public static final com.gamericefishpro.space.s8.d[] I = new com.gamericefishpro.space.s8.d[0];
    public Account A;
    public com.gamericefishpro.space.s8.d[] B;
    public com.gamericefishpro.space.s8.d[] C;
    public final boolean D;
    public final int E;
    public final boolean F;
    public final String G;
    public final int d;
    public final int e;
    public final int i;
    public String v;
    public IBinder w;
    public Scope[] y;
    public Bundle z;

    public h(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, com.gamericefishpro.space.s8.d[] dVarArr, com.gamericefishpro.space.s8.d[] dVarArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? H : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        com.gamericefishpro.space.s8.d[] dVarArr3 = I;
        com.gamericefishpro.space.s8.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.d = i;
        this.e = i2;
        this.i = i3;
        if ("com.google.android.gms".equals(str)) {
            this.v = "com.google.android.gms";
        } else {
            this.v = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = a.e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                j o0Var = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new o0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        o0 o0Var2 = (o0) o0Var;
                        Parcel parcelF = o0Var2.F(o0Var2.H(), 2);
                        Account account3 = (Account) com.gamericefishpro.space.h9.i.a(parcelF, Account.CREATOR);
                        parcelF.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.A = account2;
        } else {
            this.w = iBinder;
            this.A = account;
        }
        this.y = scopeArr2;
        this.z = bundle2;
        this.B = dVarArr4;
        this.C = dVarArr3;
        this.D = z;
        this.E = i4;
        this.F = z2;
        this.G = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
