package h3;

import N2.i;
import N2.j;
import P2.AbstractC0379i;
import P2.C0375e;
import P2.s;
import P2.w;
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
import m.b1;
import org.json.JSONException;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4564a extends AbstractC0379i implements N2.c {

    /* renamed from: X, reason: collision with root package name */
    public final boolean f38006X;
    public final b1 Y;

    /* renamed from: Z, reason: collision with root package name */
    public final Bundle f38007Z;

    /* renamed from: n0, reason: collision with root package name */
    public final Integer f38008n0;

    public C4564a(Context context, Looper looper, b1 b1Var, Bundle bundle, i iVar, j jVar) {
        super(context, looper, 44, b1Var, iVar, jVar);
        this.f38006X = true;
        this.Y = b1Var;
        this.f38007Z = bundle;
        this.f38008n0 = (Integer) b1Var.f39127z;
    }

    public final void A() {
        c(new C0375e(this));
    }

    public final void B(AbstractBinderC4567d abstractBinderC4567d) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.Y.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f2454A;
                ReentrantLock reentrantLock = K2.a.f1567c;
                w.h(context);
                ReentrantLock reentrantLock2 = K2.a.f1567c;
                reentrantLock2.lock();
                try {
                    if (K2.a.f1568d == null) {
                        K2.a.f1568d = new K2.a(context.getApplicationContext());
                    }
                    K2.a aVar = K2.a.f1568d;
                    reentrantLock2.unlock();
                    String a9 = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a9)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(a9).length());
                        sb.append("googleSignInAccount:");
                        sb.append(a9);
                        String a10 = aVar.a(sb.toString());
                        if (a10 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.a(a10);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.f38008n0;
                            w.h(num);
                            s sVar = new s(2, account, num.intValue(), googleSignInAccount);
                            C4569f c4569f = (C4569f) u();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(c4569f.f4330v);
                            int i = a3.b.f4331a;
                            obtain.writeInt(1);
                            int G7 = A8.b.G(obtain, 20293);
                            A8.b.F(obtain, 1, 4);
                            obtain.writeInt(1);
                            A8.b.y(obtain, 2, sVar, 0);
                            A8.b.I(obtain, G7);
                            obtain.writeStrongBinder(abstractBinderC4567d);
                            c4569f.S(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = this.f38008n0;
            w.h(num2);
            s sVar2 = new s(2, account, num2.intValue(), googleSignInAccount);
            C4569f c4569f2 = (C4569f) u();
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(c4569f2.f4330v);
            int i6 = a3.b.f4331a;
            obtain2.writeInt(1);
            int G72 = A8.b.G(obtain2, 20293);
            A8.b.F(obtain2, 1, 4);
            obtain2.writeInt(1);
            A8.b.y(obtain2, 2, sVar2, 0);
            A8.b.I(obtain2, G72);
            obtain2.writeStrongBinder(abstractBinderC4567d);
            c4569f2.S(obtain2, 12);
        } catch (RemoteException e9) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                abstractBinderC4567d.w3(new C4571h(1, new M2.b(8, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e9);
            }
        }
    }

    @Override // P2.AbstractC0376f, N2.c
    public final int j() {
        return 12451000;
    }

    @Override // P2.AbstractC0376f, N2.c
    public final boolean m() {
        return this.f38006X;
    }

    @Override // P2.AbstractC0376f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C4569f ? (C4569f) queryLocalInterface : new C4569f(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // P2.AbstractC0376f
    public final Bundle s() {
        b1 b1Var = this.Y;
        boolean equals = this.f2454A.getPackageName().equals((String) b1Var.f39124w);
        Bundle bundle = this.f38007Z;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) b1Var.f39124w);
        }
        return bundle;
    }

    @Override // P2.AbstractC0376f
    public final String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // P2.AbstractC0376f
    public final String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
