package e7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p6.p;
import p6.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.a implements n6.a {
    public final boolean D;
    public final p6.d E;
    public final Bundle F;
    public final Integer G;

    public a(Context context, Looper looper, p6.d dVar, Bundle bundle, n6.f fVar, n6.g gVar) {
        super(context, looper, 44, dVar, fVar, gVar);
        this.D = true;
        this.E = dVar;
        this.F = bundle;
        this.G = dVar.f5555a;
    }

    @Override // n6.a
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, n6.a
    public final boolean n() {
        return this.D;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle q() {
        p6.d dVar = this.E;
        boolean equals = this.f1432h.getPackageName().equals(dVar.f5556b);
        Bundle bundle = this.F;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", dVar.f5556b);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void x() {
        d(new p6.c(this));
    }

    public final void y(d dVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.E.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f1432h;
                ReentrantLock reentrantLock = k6.a.f3632c;
                u.g(context);
                ReentrantLock reentrantLock2 = k6.a.f3632c;
                reentrantLock2.lock();
                try {
                    if (k6.a.f3633d == null) {
                        k6.a.f3633d = new k6.a(context.getApplicationContext());
                    }
                    k6.a aVar = k6.a.f3633d;
                    reentrantLock2.unlock();
                    String a6 = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a6)) {
                        String a8 = aVar.a("googleSignInAccount:" + a6);
                        if (a8 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.a(a8);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.G;
                            u.g(num);
                            p pVar = new p(2, account, num.intValue(), googleSignInAccount);
                            f fVar = (f) r();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(fVar.f8791e);
                            int i10 = y6.b.f8792a;
                            obtain.writeInt(1);
                            int g02 = x4.f.g0(obtain, 20293);
                            x4.f.i0(obtain, 1, 4);
                            obtain.writeInt(1);
                            x4.f.b0(obtain, 2, pVar, 0);
                            x4.f.h0(obtain, g02);
                            obtain.writeStrongBinder(dVar);
                            fVar.b(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = this.G;
            u.g(num2);
            p pVar2 = new p(2, account, num2.intValue(), googleSignInAccount);
            f fVar2 = (f) r();
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(fVar2.f8791e);
            int i102 = y6.b.f8792a;
            obtain2.writeInt(1);
            int g022 = x4.f.g0(obtain2, 20293);
            x4.f.i0(obtain2, 1, 4);
            obtain2.writeInt(1);
            x4.f.b0(obtain2, 2, pVar2, 0);
            x4.f.h0(obtain2, g022);
            obtain2.writeStrongBinder(dVar);
            fVar2.b(obtain2, 12);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.a(new h(1, new m6.b(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }
}
