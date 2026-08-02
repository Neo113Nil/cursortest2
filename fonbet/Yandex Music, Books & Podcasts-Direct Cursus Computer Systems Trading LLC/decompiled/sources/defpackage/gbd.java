package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class gbd extends l9 {

    @NonNull
    public static final Parcelable.Creator<gbd> CREATOR = new oex(18);
    public static final Scope[] o = new Scope[0];
    public static final i6c[] p = new i6c[0];
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public i6c[] i;
    public i6c[] j;
    public final boolean k;
    public final int l;
    public boolean m;
    public final String n;

    public gbd(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, i6c[] i6cVarArr, i6c[] i6cVarArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        i6c[] i6cVarArr3 = p;
        i6c[] i6cVarArr4 = i6cVarArr == null ? i6cVarArr3 : i6cVarArr;
        i6cVarArr3 = i6cVarArr2 != null ? i6cVarArr2 : i6cVarArr3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = qc.h;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                g8e snxVar = queryLocalInterface instanceof g8e ? (g8e) queryLocalInterface : new snx(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        snx snxVar2 = (snx) snxVar;
                        Parcel L0 = snxVar2.L0(snxVar2.M0(), 2);
                        Account account3 = (Account) z4x.a(L0, Account.CREATOR);
                        L0.recycle();
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
            this.h = account2;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr2;
        this.g = bundle2;
        this.i = i6cVarArr4;
        this.j = i6cVarArr3;
        this.k = z;
        this.l = i4;
        this.m = z2;
        this.n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        oex.a(this, parcel, i);
    }
}
