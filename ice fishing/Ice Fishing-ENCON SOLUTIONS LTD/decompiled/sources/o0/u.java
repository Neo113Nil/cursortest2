package o0;

import a.AbstractC0083a;
import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import l0.C0980a;
import org.json.JSONException;
import p0.AbstractC1021r;
import p0.C1016m;

/* loaded from: classes.dex */
public final class u extends C0.c implements n0.g, n0.h {

    /* renamed from: i, reason: collision with root package name */
    public static final B0.b f8310i = B0.c.f88a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8311b;

    /* renamed from: c, reason: collision with root package name */
    public final A0.a f8312c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.b f8313d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f8314e;

    /* renamed from: f, reason: collision with root package name */
    public final Q0.c f8315f;

    /* renamed from: g, reason: collision with root package name */
    public C0.a f8316g;

    /* renamed from: h, reason: collision with root package name */
    public n f8317h;

    public u(Context context, A0.a aVar, Q0.c cVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f8311b = context;
        this.f8312c = aVar;
        this.f8315f = cVar;
        this.f8314e = (Set) cVar.f1518a;
        this.f8313d = f8310i;
    }

    @Override // n0.g
    public final void a(int i2) {
        n nVar = this.f8317h;
        l lVar = (l) nVar.f8294f.f8266j.get(nVar.f8290b);
        if (lVar != null) {
            if (lVar.f8282i) {
                lVar.p(new m0.b(17));
            } else {
                lVar.a(i2);
            }
        }
    }

    @Override // n0.h
    public final void b(m0.b bVar) {
        this.f8317h.b(bVar);
    }

    @Override // n0.g
    public final void c() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        C0.a aVar = this.f8316g;
        aVar.getClass();
        try {
            aVar.f137z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = aVar.f2687c;
                    ReentrantLock reentrantLock = C0980a.f8129c;
                    AbstractC1021r.c(context);
                    ReentrantLock reentrantLock2 = C0980a.f8129c;
                    reentrantLock2.lock();
                    try {
                        if (C0980a.f8130d == null) {
                            C0980a.f8130d = new C0980a(context.getApplicationContext());
                        }
                        C0980a c0980a = C0980a.f8130d;
                        reentrantLock2.unlock();
                        String a2 = c0980a.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a2)) {
                            String a3 = c0980a.a("googleSignInAccount:" + a2);
                            if (a3 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.a(a3);
                                } catch (JSONException unused) {
                                }
                                Integer num = aVar.f135B;
                                AbstractC1021r.c(num);
                                C1016m c1016m = new C1016m(2, account, num.intValue(), googleSignInAccount);
                                C0.d dVar = (C0.d) aVar.q();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(dVar.f8599b);
                                int i2 = y0.b.f8600a;
                                obtain.writeInt(1);
                                int y2 = AbstractC0083a.y(obtain, 20293);
                                AbstractC0083a.A(obtain, 1, 4);
                                obtain.writeInt(1);
                                AbstractC0083a.u(obtain, 2, c1016m, 0);
                                AbstractC0083a.z(obtain, y2);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                dVar.f8598a.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                dVar.f8598a.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = aVar.f135B;
            AbstractC1021r.c(num2);
            C1016m c1016m2 = new C1016m(2, account, num2.intValue(), googleSignInAccount);
            C0.d dVar2 = (C0.d) aVar.q();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dVar2.f8599b);
            int i22 = y0.b.f8600a;
            obtain.writeInt(1);
            int y22 = AbstractC0083a.y(obtain, 20293);
            AbstractC0083a.A(obtain, 1, 4);
            obtain.writeInt(1);
            AbstractC0083a.u(obtain, 2, c1016m2, 0);
            AbstractC0083a.z(obtain, y22);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f8312c.post(new D0.f(7, this, new C0.f(1, new m0.b(8, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
