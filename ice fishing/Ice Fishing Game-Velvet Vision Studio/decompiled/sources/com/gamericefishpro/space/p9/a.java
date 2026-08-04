package com.gamericefishpro.space.p9;

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
import com.gamericefishpro.space.b8.k;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.v8.i;
import com.gamericefishpro.space.v8.u;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements com.gamericefishpro.space.t8.a {
    public final boolean X;
    public final k Y;
    public final Bundle Z;
    public final Integer a0;

    public a(Context context, Looper looper, k kVar, Bundle bundle, com.gamericefishpro.space.t8.f fVar, com.gamericefishpro.space.t8.g gVar) {
        super(context, looper, 44, kVar, fVar, gVar);
        this.X = true;
        this.Y = kVar;
        this.Z = bundle;
        this.a0 = (Integer) kVar.v;
    }

    public final void A() {
        d(new com.gamericefishpro.space.v8.e(this));
    }

    public final void B(c cVar) {
        GoogleSignInAccount googleSignInAccountB;
        try {
            this.Y.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = this.A;
                ReentrantLock reentrantLock = com.gamericefishpro.space.q8.a.c;
                c0.g(context);
                ReentrantLock reentrantLock2 = com.gamericefishpro.space.q8.a.c;
                reentrantLock2.lock();
                try {
                    if (com.gamericefishpro.space.q8.a.d == null) {
                        com.gamericefishpro.space.q8.a.d = new com.gamericefishpro.space.q8.a(context.getApplicationContext());
                    }
                    com.gamericefishpro.space.q8.a aVar = com.gamericefishpro.space.q8.a.d;
                    reentrantLock2.unlock();
                    String strA = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = aVar.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                googleSignInAccountB = GoogleSignInAccount.b(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountB = null;
                            }
                        }
                    }
                    googleSignInAccountB = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountB = null;
            }
            Integer num = this.a0;
            c0.g(num);
            u uVar = new u(2, account, num.intValue(), googleSignInAccountB);
            e eVar = (e) u();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(eVar.f);
            int i = com.gamericefishpro.space.f9.b.a;
            parcelObtain.writeInt(1);
            int iV = y3.V(parcelObtain, 20293);
            y3.U(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            y3.P(parcelObtain, 2, uVar, 0);
            y3.W(parcelObtain, iV);
            parcelObtain.writeStrongBinder(cVar);
            eVar.E(parcelObtain, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.a(new g(1, new com.gamericefishpro.space.s8.b(8, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.gamericefishpro.space.v8.f
    public final int f() {
        return 12451000;
    }

    @Override // com.gamericefishpro.space.v8.f, com.gamericefishpro.space.t8.a
    public final boolean m() {
        return this.X;
    }

    @Override // com.gamericefishpro.space.v8.f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.gamericefishpro.space.v8.f
    public final Bundle s() {
        k kVar = this.Y;
        boolean zEquals = this.A.getPackageName().equals((String) kVar.y);
        Bundle bundle = this.Z;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) kVar.y);
        }
        return bundle;
    }

    @Override // com.gamericefishpro.space.v8.f
    public final String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.gamericefishpro.space.v8.f
    public final String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
