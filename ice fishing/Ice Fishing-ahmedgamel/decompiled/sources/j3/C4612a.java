package j3;

import P2.i;
import P2.j;
import R2.AbstractC0383i;
import R2.C0379e;
import R2.s;
import R2.w;
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
import m.c1;
import org.json.JSONException;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4612a extends AbstractC0383i implements P2.c {

    /* renamed from: X, reason: collision with root package name */
    public final boolean f38475X;
    public final c1 Y;

    /* renamed from: Z, reason: collision with root package name */
    public final Bundle f38476Z;

    /* renamed from: i0, reason: collision with root package name */
    public final Integer f38477i0;

    public C4612a(Context context, Looper looper, c1 c1Var, Bundle bundle, i iVar, j jVar) {
        super(context, looper, 44, c1Var, iVar, jVar);
        this.f38475X = true;
        this.Y = c1Var;
        this.f38476Z = bundle;
        this.f38477i0 = (Integer) c1Var.f39198z;
    }

    public final void A() {
        l(new C0379e(this));
    }

    public final void B(AbstractBinderC4615d abstractBinderC4615d) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.Y.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f2775A;
                ReentrantLock reentrantLock = M2.a.f1862c;
                w.h(context);
                ReentrantLock reentrantLock2 = M2.a.f1862c;
                reentrantLock2.lock();
                try {
                    if (M2.a.f1863d == null) {
                        M2.a.f1863d = new M2.a(context.getApplicationContext());
                    }
                    M2.a aVar = M2.a.f1863d;
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
                            Integer num = this.f38477i0;
                            w.h(num);
                            s sVar = new s(2, account, num.intValue(), googleSignInAccount);
                            C4617f c4617f = (C4617f) u();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(c4617f.f5723v);
                            int i = c3.b.f5724a;
                            obtain.writeInt(1);
                            int x9 = com.bumptech.glide.e.x(obtain, 20293);
                            com.bumptech.glide.e.w(obtain, 1, 4);
                            obtain.writeInt(1);
                            com.bumptech.glide.e.q(obtain, 2, sVar, 0);
                            com.bumptech.glide.e.z(obtain, x9);
                            obtain.writeStrongBinder(abstractBinderC4615d);
                            c4617f.S(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = this.f38477i0;
            w.h(num2);
            s sVar2 = new s(2, account, num2.intValue(), googleSignInAccount);
            C4617f c4617f2 = (C4617f) u();
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(c4617f2.f5723v);
            int i4 = c3.b.f5724a;
            obtain2.writeInt(1);
            int x92 = com.bumptech.glide.e.x(obtain2, 20293);
            com.bumptech.glide.e.w(obtain2, 1, 4);
            obtain2.writeInt(1);
            com.bumptech.glide.e.q(obtain2, 2, sVar2, 0);
            com.bumptech.glide.e.z(obtain2, x92);
            obtain2.writeStrongBinder(abstractBinderC4615d);
            c4617f2.S(obtain2, 12);
        } catch (RemoteException e9) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                abstractBinderC4615d.M1(new C4619h(1, new O2.b(8, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e9);
            }
        }
    }

    @Override // R2.AbstractC0380f, P2.c
    public final int i() {
        return 12451000;
    }

    @Override // R2.AbstractC0380f, P2.c
    public final boolean m() {
        return this.f38475X;
    }

    @Override // R2.AbstractC0380f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C4617f ? (C4617f) queryLocalInterface : new C4617f(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // R2.AbstractC0380f
    public final Bundle s() {
        c1 c1Var = this.Y;
        boolean equals = this.f2775A.getPackageName().equals((String) c1Var.f39195w);
        Bundle bundle = this.f38476Z;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c1Var.f39195w);
        }
        return bundle;
    }

    @Override // R2.AbstractC0380f
    public final String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // R2.AbstractC0380f
    public final String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
