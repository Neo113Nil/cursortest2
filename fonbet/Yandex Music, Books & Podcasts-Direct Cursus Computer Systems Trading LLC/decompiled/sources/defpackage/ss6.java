package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ss6 extends ResultReceiver {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss6(vs6 vs6Var, Handler handler, int i) {
        super(handler);
        this.a = i;
        this.b = vs6Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        Object obj;
        Bundle bundle2 = bundle;
        int i2 = 27;
        int i3 = 2;
        int i4 = 26;
        int i5 = 28;
        int i6 = 1;
        d9e d9eVar = null;
        int i7 = 0;
        switch (this.a) {
            case 0:
                bundle2.getClass();
                le0 le0Var = new le0(2, vs6.a, os6.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 7);
                ts6 ts6Var = (ts6) this.b;
                if (vs6.c(bundle2, le0Var, ts6Var.f(), ts6Var.e(), ts6Var.g)) {
                    return;
                }
                int i8 = bundle2.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle2.getParcelable("RESULT_DATA");
                int i9 = vs6.c;
                if (i8 != i9) {
                    Log.w("BeginSignIn", "Returned request code " + i9 + " which  does not match what was given " + i8);
                    return;
                }
                m40 m40Var = new m40(i4, ts6Var);
                CancellationSignal cancellationSignal = ts6Var.g;
                if (i != -1) {
                    xqn xqnVar = new xqn();
                    xqnVar.a = new l7d(4, bcx.z(i));
                    if (i == 0) {
                        xqnVar.a = new l7d(0, "activity is cancelled by the user.");
                    }
                    vs6.a(cancellationSignal, new us6(m40Var, xqnVar, 1));
                    return;
                }
                try {
                    ild.A(ts6Var.d);
                    vs6.a(ts6Var.g, new ha0(i2, ts6Var, ts6Var.d(zyw.f(intent))));
                    return;
                } catch (m7d e) {
                    vs6.a(ts6Var.g, new ha0(29, ts6Var, e));
                    return;
                } catch (qo0 e2) {
                    xqn xqnVar2 = new xqn();
                    xqnVar2.a = new l7d(4, e2.getMessage());
                    int i10 = e2.a.a;
                    if (i10 == 16) {
                        xqnVar2.a = new l7d(0, e2.getMessage());
                    } else if (vs6.b.contains(Integer.valueOf(i10))) {
                        xqnVar2.a = new l7d(2, e2.getMessage());
                    }
                    vs6.a(ts6Var.g, new ha0(i5, ts6Var, xqnVar2));
                    return;
                } catch (Throwable th) {
                    vs6.a(ts6Var.g, new qs6(i7, ts6Var, new l7d(4, th.getMessage())));
                    return;
                }
            case 1:
                bundle2.getClass();
                le0 le0Var2 = new le0(2, vs6.a, os6.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 8);
                ws6 ws6Var = (ws6) this.b;
                Executor executor = ws6Var.e;
                if (executor == null) {
                    Intrinsics.j("executor");
                    throw null;
                }
                ls6 ls6Var = ws6Var.d;
                if (ls6Var == null) {
                    Intrinsics.j("callback");
                    throw null;
                }
                if (vs6.c(bundle2, le0Var2, executor, ls6Var, ws6Var.f)) {
                    return;
                }
                int i11 = bundle2.getInt("ACTIVITY_REQUEST_CODE");
                int i12 = vs6.c;
                if (i11 != i12) {
                    Log.w("CreatePassword", "Returned request code " + i12 + " which does not match what was given " + i11);
                    return;
                }
                m40 m40Var2 = new m40(i2, ws6Var);
                CancellationSignal cancellationSignal2 = ws6Var.f;
                if (i == -1) {
                    Unit.a.getClass();
                    new Bundle();
                    vs6.a(ws6Var.f, new qs6(i6, ws6Var, new cr6()));
                    return;
                } else {
                    xqn xqnVar3 = new xqn();
                    xqnVar3.a = new yq6(bcx.z(i), 4);
                    if (i == 0) {
                        xqnVar3.a = new xq6("activity is cancelled by the user.");
                    }
                    vs6.a(cancellationSignal2, new us6(m40Var2, xqnVar3, 0));
                    return;
                }
            case 2:
                bundle2.getClass();
                le0 le0Var3 = new le0(2, vs6.a, os6.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 9);
                dt6 dt6Var = (dt6) this.b;
                Executor executor2 = dt6Var.f;
                if (executor2 == null) {
                    Intrinsics.j("executor");
                    throw null;
                }
                ls6 ls6Var2 = dt6Var.e;
                if (ls6Var2 == null) {
                    Intrinsics.j("callback");
                    throw null;
                }
                if (vs6.c(bundle2, le0Var3, executor2, ls6Var2, dt6Var.g)) {
                    return;
                }
                int i13 = bundle2.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) bundle2.getParcelable("RESULT_DATA");
                int i14 = vs6.c;
                if (i13 != i14) {
                    Log.w("CreatePublicKey", "Returned request code " + i14 + " does not match what was given " + i13);
                    return;
                }
                m40 m40Var3 = new m40(i5, dt6Var);
                CancellationSignal cancellationSignal3 = dt6Var.g;
                if (i != -1) {
                    xqn xqnVar4 = new xqn();
                    xqnVar4.a = new yq6(bcx.z(i), 4);
                    if (i == 0) {
                        xqnVar4.a = new xq6("activity is cancelled by the user.");
                    }
                    vs6.a(cancellationSignal3, new us6(m40Var3, xqnVar4, 0));
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    it6 it6Var = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = dt6Var.g;
                    it6Var.getClass();
                    if (it6.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor3 = dt6Var.f;
                    if (executor3 != null) {
                        executor3.execute(new xs6(dt6Var, i7));
                        return;
                    } else {
                        Intrinsics.j("executor");
                        throw null;
                    }
                }
                g0n g0nVar = (g0n) asq.A(byteArrayExtra, g0n.CREATOR);
                g0nVar.getClass();
                LinkedHashMap linkedHashMap = i0n.a;
                Parcelable parcelable = g0nVar.d;
                if (parcelable == null && (parcelable = g0nVar.e) == null && (parcelable = g0nVar.f) == null) {
                    xq0.q("No response set.");
                    return;
                }
                if (parcelable instanceof o02) {
                    o02 o02Var = (o02) parcelable;
                    bfb bfbVar = o02Var.a;
                    bfbVar.getClass();
                    o2 o2Var = (o2) i0n.a.get(bfbVar);
                    String str = o02Var.b;
                    obj = o2Var == null ? new as6(new o2(26), f1d.g("unknown fido gms exception - ", str)) : (bfbVar == bfb.NOT_ALLOWED_ERR && str != null && StringsKt.M(str, "Unable to get sync account", false)) ? new xq6("Passkey registration was cancelled by the user.") : new as6(o2Var, str);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    vs6.a(dt6Var.g, new qs6(i3, dt6Var, obj));
                    return;
                }
                try {
                    vs6.a(dt6Var.g, new qs6(3, dt6Var, dt6.e(g0nVar)));
                    return;
                } catch (JSONException e3) {
                    vs6.a(dt6Var.g, new at6(dt6Var, e3, i7));
                    return;
                } catch (Throwable th2) {
                    vs6.a(dt6Var.g, new ct6(dt6Var, th2, i7));
                    return;
                }
            case 3:
                okh okhVar = (okh) ((WeakReference) this.b).get();
                if (okhVar == null || bundle2 == null) {
                    return;
                }
                synchronized (okhVar.b) {
                    msh mshVar = okhVar.e;
                    IBinder binder = bundle2.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i15 = csh.h;
                    if (binder != null) {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof d9e)) {
                            a9e a9eVar = new a9e();
                            a9eVar.a = binder;
                            d9eVar = a9eVar;
                        } else {
                            d9eVar = (d9e) queryLocalInterface;
                        }
                    }
                    synchronized (mshVar.a) {
                        mshVar.c = d9eVar;
                    }
                    msh mshVar2 = okhVar.e;
                    z0u x = q6k.x(bundle2);
                    synchronized (mshVar2.a) {
                        mshVar2.d = x;
                    }
                    okhVar.a();
                }
                return;
            case 4:
                xop xopVar = (xop) this.b;
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                xopVar.l(new ump(i, bundle2));
                return;
            default:
                ((i8s) this.b).d(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss6(Handler handler) {
        super(handler);
        this.a = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss6(Handler handler, Object obj, int i) {
        super(handler);
        this.a = i;
        this.b = obj;
    }
}
