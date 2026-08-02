package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class rfq extends a {
    public final boolean E;
    public final rn5 F;
    public final Bundle G;
    public final Integer H;

    public rfq(Context context, Looper looper, rn5 rn5Var, Bundle bundle, rmd rmdVar, smd smdVar) {
        super(context, looper, 44, rn5Var, rmdVar, smdVar, 0);
        this.E = true;
        this.F = rn5Var;
        this.G = bundle;
        this.H = (Integer) rn5Var.h;
    }

    public final void B(lxw lxwVar) {
        try {
            this.F.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount b = "<<default account>>".equals(account.name) ? ihr.a(this.h).b() : null;
            Integer num = this.H;
            y1g.G(num);
            vyw vywVar = new vyw(2, account, num.intValue(), b);
            byw bywVar = (byw) s();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(bywVar.i);
            int i = kxw.a;
            obtain.writeInt(1);
            int o0 = o8g.o0(obtain, 20293);
            o8g.q0(1, 4, obtain);
            obtain.writeInt(1);
            o8g.i0(obtain, 2, vywVar, 0);
            o8g.p0(obtain, o0);
            obtain.writeStrongBinder(lxwVar);
            bywVar.R(obtain, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                lxwVar.S0(new myw(1, new h66(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final boolean e() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof byw ? (byw) queryLocalInterface : new byw(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle r() {
        rn5 rn5Var = this.F;
        boolean equals = this.h.getPackageName().equals((String) rn5Var.e);
        Bundle bundle = this.G;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) rn5Var.e);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.signin.service.START";
    }
}
