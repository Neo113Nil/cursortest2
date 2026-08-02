package androidx.credentials.playservices;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.util.Log;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ar6;
import defpackage.at6;
import defpackage.bs6;
import defpackage.bzf;
import defpackage.coo;
import defpackage.ct6;
import defpackage.dt6;
import defpackage.h66;
import defpackage.hom;
import defpackage.i0n;
import defpackage.it6;
import defpackage.j0n;
import defpackage.ls6;
import defpackage.ms6;
import defpackage.my1;
import defpackage.n7d;
import defpackage.ns6;
import defpackage.pmd;
import defpackage.qad;
import defpackage.qo0;
import defpackage.qq6;
import defpackage.rs6;
import defpackage.ry2;
import defpackage.sy2;
import defpackage.t03;
import defpackage.tad;
import defpackage.ts6;
import defpackage.ty2;
import defpackage.ufq;
import defpackage.uy2;
import defpackage.vs6;
import defpackage.vy2;
import defpackage.wr6;
import defpackage.ws6;
import defpackage.xm4;
import defpackage.xqn;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJE\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001fJ?\u0010#\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"0\u0010H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R(\u0010'\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lns6;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "minApkVersion", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "Ln7d;", ServiceCommand.TYPE_REQ, "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lls6;", "Lo7d;", "Lm7d;", "callback", "", "onGetCredential", "(Landroid/content/Context;Ln7d;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lls6;)V", "Lar6;", "Lbr6;", "Lzq6;", "onCreateCredential", "(Landroid/content/Context;Lar6;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lls6;)V", "", "isAvailableOnDevice", "()Z", "(I)Z", "Lxm4;", "Ljava/lang/Void;", "Lmy1;", "onClearCredential", "(Lxm4;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lls6;)V", "Landroid/content/Context;", "Lpmd;", "googleApiAvailability", "Lpmd;", "getGoogleApiAvailability", "()Lpmd;", "setGoogleApiAvailability", "(Lpmd;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "it6", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements ns6 {

    @NotNull
    public static final it6 Companion = new it6();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;

    @NotNull
    private static final String TAG = "PlayServicesImpl";

    @NotNull
    private final Context context;

    @NotNull
    private pmd googleApiAvailability;

    public CredentialProviderPlayServicesImpl(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = pmd.e;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.b(context, minApkVersion);
    }

    private static final void onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, ls6 ls6Var, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        xqn xqnVar = new xqn();
        xqnVar.a = new my1("Clear restore credential failed for unknown reason.");
        if ((exc instanceof qo0) && ((qo0) exc).a.a == 40201) {
            xqnVar.a = new my1("The restore credential internal service had a failure.");
        }
        it6 it6Var = Companion;
        t03 t03Var = new t03(7, executor, ls6Var, xqnVar);
        it6Var.getClass();
        it6.b(cancellationSignal, t03Var);
    }

    private static final void onClearCredential$lambda$4(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, ls6 ls6Var, Exception exc) {
        exc.getClass();
        it6 it6Var = Companion;
        t03 t03Var = new t03(8, exc, executor, ls6Var);
        it6Var.getClass();
        it6.b(cancellationSignal, t03Var);
    }

    @NotNull
    public final pmd getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new h66(isGooglePlayServicesAvailable));
        }
        return z;
    }

    public void onClearCredential(@NotNull xm4 request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull ls6 callback) {
        throw null;
    }

    @Override // defpackage.ns6
    public void onCreateCredential(@NotNull Context context, @NotNull ar6 request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull ls6 callback) {
        context.getClass();
        request.getClass();
        executor.getClass();
        callback.getClass();
        Companion.getClass();
        if (it6.a(cancellationSignal)) {
            return;
        }
        if (request instanceof wr6) {
            ws6 ws6Var = new ws6(context);
            wr6 wr6Var = (wr6) request;
            ws6Var.f = cancellationSignal;
            ws6Var.d = callback;
            ws6Var.e = executor;
            if (it6.a(cancellationSignal)) {
                return;
            }
            coo cooVar = new coo(new ufq(wr6Var.e, wr6Var.f), null, 0);
            Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", cooVar);
            vs6.b(ws6Var.g, intent, "CREATE_PASSWORD");
            try {
                context.startActivity(intent);
                return;
            } catch (Exception unused) {
                vs6.a(cancellationSignal, new rs6(1, ws6Var));
                return;
            }
        }
        if (!(request instanceof bs6)) {
            qq6.d("Create Credential request is unsupported, not password or publickeycredential");
            return;
        }
        dt6 dt6Var = new dt6(context);
        bs6 bs6Var = (bs6) request;
        dt6Var.g = cancellationSignal;
        dt6Var.e = callback;
        dt6Var.f = executor;
        try {
            j0n d = dt6Var.d(bs6Var);
            if (it6.a(cancellationSignal)) {
                return;
            }
            Intent intent2 = new Intent(context, (Class<?>) HiddenActivity.class);
            intent2.putExtra("REQUEST_TYPE", d);
            vs6.b(dt6Var.h, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
            try {
                context.startActivity(intent2);
            } catch (Exception unused2) {
                vs6.a(cancellationSignal, new rs6(2, dt6Var));
            }
        } catch (JSONException e) {
            vs6.a(cancellationSignal, new at6(dt6Var, e, 1));
        } catch (Throwable th) {
            vs6.a(cancellationSignal, new ct6(dt6Var, th, 1));
        }
    }

    @Override // defpackage.ns6
    public void onGetCredential(@NotNull Context context, @NotNull n7d request, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull ls6 callback) {
        context.getClass();
        request.getClass();
        executor.getClass();
        callback.getClass();
        Companion.getClass();
        if (it6.a(cancellationSignal)) {
            return;
        }
        List<ms6> list = request.a;
        for (ms6 ms6Var : list) {
        }
        Companion.getClass();
        for (ms6 ms6Var2 : list) {
        }
        Companion.getClass();
        for (ms6 ms6Var3 : list) {
        }
        ts6 ts6Var = new ts6(context);
        ts6Var.g = cancellationSignal;
        ts6Var.e = callback;
        ts6Var.f = executor;
        Companion.getClass();
        if (it6.a(cancellationSignal)) {
            return;
        }
        int i = 0;
        uy2 uy2Var = new uy2(false);
        ry2 ry2Var = new ry2(false, null, null, true, null, null, false);
        ty2 ty2Var = new ty2(false, null, null);
        sy2 sy2Var = new sy2(false, null);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        ty2 ty2Var2 = ty2Var;
        sy2 sy2Var2 = sy2Var;
        uy2 uy2Var2 = uy2Var;
        boolean z = false;
        boolean z2 = false;
        for (ms6 ms6Var4 : list) {
            if (ms6Var4 instanceof qad) {
                uy2Var2 = new uy2(true);
                z2 = z2 || ms6Var4.d;
            } else if ((ms6Var4 instanceof tad) && !z) {
                if (j >= 231815000) {
                    LinkedHashMap linkedHashMap = i0n.a;
                    sy2Var2 = new sy2(true, ((tad) ms6Var4).f);
                } else {
                    LinkedHashMap linkedHashMap2 = i0n.a;
                    JSONObject jSONObject = new JSONObject(((tad) ms6Var4).f);
                    String optString = jSONObject.optString("rpId", "");
                    optString.getClass();
                    if (optString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    ty2Var2 = new ty2(true, bzf.B(jSONObject), optString);
                }
                z = true;
            }
        }
        vy2 vy2Var = new vy2(uy2Var2, ry2Var, null, z2, 0, ty2Var2, sy2Var2, false);
        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", vy2Var);
        vs6.b(ts6Var.h, intent, "BEGIN_SIGN_IN");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            vs6.a(cancellationSignal, new rs6(i, ts6Var));
        }
    }

    public void onPrepareCredential(@NotNull n7d n7dVar, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull ls6 ls6Var) {
        n7dVar.getClass();
        executor.getClass();
        ls6Var.getClass();
    }

    public final void setGoogleApiAvailability(@NotNull pmd pmdVar) {
        pmdVar.getClass();
        this.googleApiAvailability = pmdVar;
    }

    @Override // defpackage.ns6
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(@NotNull Context context, @NotNull hom homVar, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull ls6 ls6Var) {
        context.getClass();
        throw null;
    }
}
