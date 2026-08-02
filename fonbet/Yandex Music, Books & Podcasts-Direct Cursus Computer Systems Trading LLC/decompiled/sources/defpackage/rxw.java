package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.yandex.plus.pay.inapp.google.internal.a;
import io.appmetrica.analytics.billingv6.impl.i;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class rxw implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rxw(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    private final void a() {
        wix wixVar = (wix) this.b;
        int i = ((lkx) this.c).a;
        synchronized (wixVar) {
            lkx lkxVar = (lkx) wixVar.e.get(i);
            if (lkxVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                wixVar.e.remove(i);
                lkxVar.b(new my1("Timed out waiting for response", null));
                wixVar.c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, vyf] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, vyf] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        g8e g8eVar = null;
        boolean z5 = true;
        int i = 0;
        switch (this.a) {
            case 0:
                sxw sxwVar = (sxw) this.c;
                myw mywVar = (myw) this.b;
                h66 h66Var = mywVar.b;
                if (h66Var.e()) {
                    xyw xywVar = mywVar.c;
                    y1g.G(xywVar);
                    h66 h66Var2 = xywVar.c;
                    if (!h66Var2.e()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(h66Var2)), new Exception());
                        sxwVar.n.b(h66Var2);
                        sxwVar.m.disconnect();
                        return;
                    }
                    cxw cxwVar = sxwVar.n;
                    IBinder iBinder = xywVar.b;
                    if (iBinder != null) {
                        int i2 = qc.h;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        g8eVar = queryLocalInterface instanceof g8e ? (g8e) queryLocalInterface : new snx(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                    }
                    Set set = sxwVar.k;
                    cxwVar.getClass();
                    if (g8eVar == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        cxwVar.b(new h66(4));
                    } else {
                        cxwVar.c = g8eVar;
                        cxwVar.d = set;
                        if (cxwVar.e) {
                            cxwVar.a.f(g8eVar, set);
                        }
                    }
                } else {
                    sxwVar.n.b(h66Var);
                }
                sxwVar.m.disconnect();
                return;
            case 1:
                if (((uyw) this.c).b) {
                    h66 h66Var3 = ((pyw) this.b).b;
                    boolean d = h66Var3.d();
                    uyw uywVar = (uyw) this.c;
                    if (d) {
                        ?? r1 = uywVar.a;
                        Activity b = uywVar.b();
                        PendingIntent pendingIntent = h66Var3.c;
                        y1g.G(pendingIntent);
                        int i3 = ((pyw) this.b).a;
                        int i4 = GoogleApiActivity.b;
                        Intent intent = new Intent(b, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i3);
                        intent.putExtra("notify_manager", false);
                        r1.startActivityForResult(intent, 1);
                        return;
                    }
                    if (uywVar.e.a(uywVar.b(), null, h66Var3.b) != null) {
                        uyw uywVar2 = (uyw) this.c;
                        uywVar2.e.i(uywVar2.b(), uywVar2.a, h66Var3.b, (uyw) this.c);
                        return;
                    }
                    int i5 = h66Var3.b;
                    uyw uywVar3 = (uyw) this.c;
                    if (i5 != 18) {
                        int i6 = ((pyw) this.b).a;
                        uywVar3.c.set(null);
                        uywVar3.k(h66Var3, i6);
                        return;
                    }
                    pmd pmdVar = uywVar3.e;
                    Activity b2 = uywVar3.b();
                    pmdVar.getClass();
                    ProgressBar progressBar = new ProgressBar(b2, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(b2);
                    builder.setView(progressBar);
                    builder.setMessage(ixw.b(b2, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog create = builder.create();
                    pmd.g(b2, create, "GooglePlayServicesUpdatingDialog", uywVar3);
                    uyw uywVar4 = (uyw) this.c;
                    Context applicationContext = uywVar4.b().getApplicationContext();
                    qyw qywVar = new qyw(this, create);
                    uywVar4.e.getClass();
                    pmd.f(applicationContext, qywVar);
                    return;
                }
                return;
            case 2:
                qz2 qz2Var = (qz2) this.b;
                m4n m4nVar = (m4n) this.c;
                qz2Var.getClass();
                uz2 uz2Var = b6x.l;
                qz2Var.y(24, 9, uz2Var);
                e6x e6xVar = i6x.b;
                m4nVar.onQueryPurchasesResponse(uz2Var, p7x.e);
                return;
            case 3:
                Future future = (Future) this.b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.c;
                future.cancel(true);
                l8x.g("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                qz2 qz2Var2 = (qz2) this.b;
                i iVar = (i) this.c;
                qz2Var2.getClass();
                uz2 uz2Var2 = b6x.l;
                qz2Var2.y(24, 11, uz2Var2);
                iVar.onPurchaseHistoryResponse(uz2Var2, null);
                return;
            case 5:
                qz2 qz2Var3 = (qz2) this.b;
                qtm qtmVar = (qtm) this.c;
                uz2 uz2Var3 = b6x.l;
                qz2Var3.y(24, 7, uz2Var3);
                qtmVar.onProductDetailsResponse(uz2Var3, new ArrayList());
                return;
            case 6:
                ((l3x) this.b).U0((crh) this.c);
                return;
            case 7:
                h4x h4xVar = ((f4x) this.b).i;
                j0x j0xVar = (j0x) this.c;
                msg msgVar = h4x.G;
                jw0 jw0Var = j0xVar.d;
                a2x a2xVar = j0xVar.f;
                jw0 jw0Var2 = h4xVar.t;
                kox koxVar = h4xVar.D;
                if (!d94.d(jw0Var, jw0Var2)) {
                    h4xVar.t = jw0Var;
                    koxVar.c();
                }
                double d2 = j0xVar.a;
                if (Double.isNaN(d2) || Math.abs(d2 - h4xVar.v) <= 1.0E-7d) {
                    z = false;
                } else {
                    h4xVar.v = d2;
                    z = true;
                }
                boolean z6 = j0xVar.b;
                if (z6 != h4xVar.w) {
                    h4xVar.w = z6;
                    z = true;
                }
                msg msgVar2 = h4x.G;
                msgVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(h4xVar.m));
                if (koxVar != null && (z || h4xVar.m)) {
                    koxVar.f();
                }
                Double.isNaN(j0xVar.g);
                int i7 = j0xVar.c;
                if (i7 != h4xVar.x) {
                    h4xVar.x = i7;
                    z2 = true;
                } else {
                    z2 = false;
                }
                msgVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(h4xVar.m));
                if (koxVar != null && (z2 || h4xVar.m)) {
                    koxVar.a();
                }
                int i8 = j0xVar.e;
                if (i8 != h4xVar.y) {
                    h4xVar.y = i8;
                } else {
                    z5 = false;
                }
                msgVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z5), Boolean.valueOf(h4xVar.m));
                if (koxVar != null && (z5 || h4xVar.m)) {
                    koxVar.e();
                }
                if (!d94.d(h4xVar.z, a2xVar)) {
                    h4xVar.z = a2xVar;
                }
                h4xVar.m = false;
                return;
            case 8:
                h4x h4xVar2 = ((f4x) this.b).i;
                b0x b0xVar = (b0x) this.c;
                msg msgVar3 = h4x.G;
                String str = b0xVar.a;
                if (d94.d(str, h4xVar2.u)) {
                    z5 = false;
                } else {
                    h4xVar2.u = str;
                }
                h4x.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z5), Boolean.valueOf(h4xVar2.n));
                kox koxVar2 = h4xVar2.D;
                if (koxVar2 != null && (z5 || h4xVar2.n)) {
                    koxVar2.d();
                }
                h4xVar2.n = false;
                return;
            case 9:
                Task task = (Task) this.b;
                boolean j = task.j();
                c7x c7xVar = (c7x) this.c;
                onx onxVar = c7xVar.d;
                if (j) {
                    onxVar.r();
                    return;
                }
                try {
                    onxVar.q(c7xVar.c.p(task));
                    return;
                } catch (njo e) {
                    if (e.getCause() instanceof Exception) {
                        onxVar.p((Exception) e.getCause());
                        return;
                    } else {
                        onxVar.p(e);
                        return;
                    }
                } catch (Exception e2) {
                    onxVar.p(e2);
                    return;
                }
            case 10:
                c7x c7xVar2 = (c7x) this.c;
                onx onxVar2 = c7xVar2.d;
                try {
                    Task task2 = (Task) c7xVar2.c.p((Task) this.b);
                    if (task2 == null) {
                        c7xVar2.d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    f48 f48Var = j8s.b;
                    task2.d(f48Var, c7xVar2);
                    task2.c(f48Var, c7xVar2);
                    task2.a(f48Var, c7xVar2);
                    return;
                } catch (njo e3) {
                    if (e3.getCause() instanceof Exception) {
                        onxVar2.p((Exception) e3.getCause());
                        return;
                    } else {
                        onxVar2.p(e3);
                        return;
                    }
                } catch (Exception e4) {
                    onxVar2.p(e4);
                    return;
                }
            case 11:
                yfx yfxVar = (yfx) this.b;
                i8s i8sVar = (i8s) this.c;
                Context context = (Context) yfxVar.b;
                String string = yfx.B(context).getString(CommonUrlParts.APP_SET_ID, null);
                long j2 = yfx.B(context).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? j2 + 33696000000L : -1L;
                if (string == null || System.currentTimeMillis() > j3) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new hfx("Failed to store the app set ID.");
                        }
                        yfx.E(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new hfx("Failed to store the app set ID creation time.");
                        }
                    } catch (hfx e5) {
                        i8sVar.a(e5);
                        return;
                    }
                } else {
                    try {
                        yfx.E(context);
                    } catch (hfx e6) {
                        i8sVar.a(e6);
                        return;
                    }
                }
                i8sVar.b(new iu0(string, 1));
                return;
            case 12:
                wix wixVar = (wix) this.b;
                IBinder iBinder2 = (IBinder) this.c;
                synchronized (wixVar) {
                    if (iBinder2 == null) {
                        wixVar.a("Null service connection");
                    } else {
                        try {
                            wixVar.c = new apo(iBinder2);
                            wixVar.a = 2;
                            ((ScheduledExecutorService) wixVar.f.c).execute(new mex(wixVar, i));
                        } catch (RemoteException e7) {
                            wixVar.a(e7.getMessage());
                        }
                    }
                }
                return;
            case 13:
                synchronized (((tbx) this.c).c) {
                    try {
                        OnCompleteListener onCompleteListener = (OnCompleteListener) ((tbx) this.c).d;
                        if (onCompleteListener != null) {
                            onCompleteListener.onComplete((Task) this.b);
                        }
                    } finally {
                    }
                }
                return;
            case 14:
                synchronized (((tbx) this.c).c) {
                    zpj zpjVar = (zpj) ((tbx) this.c).d;
                    Exception g = ((Task) this.b).g();
                    y1g.G(g);
                    zpjVar.d(g);
                }
                return;
            case 15:
                synchronized (((tbx) this.c).c) {
                    ((tqj) ((tbx) this.c).d).onSuccess(((Task) this.b).h());
                }
                return;
            case 16:
                a();
                return;
            case 17:
                tbx tbxVar = (tbx) this.c;
                onx onxVar3 = (onx) tbxVar.d;
                try {
                    Task l = ((aqr) tbxVar.c).l(((Task) this.b).h());
                    if (l == null) {
                        onxVar3.p(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    f48 f48Var2 = j8s.b;
                    l.d(f48Var2, tbxVar);
                    l.c(f48Var2, tbxVar);
                    l.a(f48Var2, tbxVar);
                    return;
                } catch (CancellationException unused) {
                    tbxVar.e();
                    return;
                } catch (njo e8) {
                    if (e8.getCause() instanceof Exception) {
                        tbxVar.d((Exception) e8.getCause());
                        return;
                    } else {
                        onxVar3.p(e8);
                        return;
                    }
                } catch (Exception e9) {
                    onxVar3.p(e9);
                    return;
                }
            case 18:
                qz2 qz2Var4 = (qz2) this.b;
                uz2 uz2Var4 = (uz2) this.c;
                n4n n4nVar = (n4n) qz2Var4.e.d;
                evj evjVar = qz2Var4.e;
                if (n4nVar != null) {
                    ((n4n) evjVar.d).onPurchasesUpdated(uz2Var4, null);
                    return;
                } else {
                    l8x.g("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 19:
                fox foxVar = (fox) this.b;
                j0x j0xVar2 = (j0x) this.c;
                msg msgVar4 = fox.D0;
                jw0 jw0Var3 = j0xVar2.d;
                a2x a2xVar2 = j0xVar2.f;
                jw0 jw0Var4 = foxVar.E;
                kox koxVar3 = foxVar.G;
                if (!d94.d(jw0Var3, jw0Var4)) {
                    foxVar.E = jw0Var3;
                    koxVar3.c();
                }
                double d3 = j0xVar2.a;
                if (Double.isNaN(d3) || Math.abs(d3 - foxVar.v0) <= 1.0E-7d) {
                    z3 = false;
                } else {
                    foxVar.v0 = d3;
                    z3 = true;
                }
                boolean z7 = j0xVar2.b;
                if (z7 != foxVar.X) {
                    foxVar.X = z7;
                    z3 = true;
                }
                Double.isNaN(j0xVar2.g);
                msg msgVar5 = fox.D0;
                msgVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(foxVar.Z));
                if (koxVar3 != null && (z3 || foxVar.Z)) {
                    koxVar3.f();
                }
                int i9 = j0xVar2.c;
                if (i9 != foxVar.x0) {
                    foxVar.x0 = i9;
                    z4 = true;
                } else {
                    z4 = false;
                }
                msgVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(foxVar.Z));
                if (koxVar3 != null && (z4 || foxVar.Z)) {
                    koxVar3.a();
                }
                int i10 = j0xVar2.e;
                if (i10 != foxVar.y0) {
                    foxVar.y0 = i10;
                } else {
                    z5 = false;
                }
                msgVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z5), Boolean.valueOf(foxVar.Z));
                if (koxVar3 != null && (z5 || foxVar.Z)) {
                    koxVar3.e();
                }
                if (!d94.d(foxVar.w0, a2xVar2)) {
                    foxVar.w0 = a2xVar2;
                }
                foxVar.Z = false;
                return;
            case 20:
                fox foxVar2 = (fox) this.b;
                b0x b0xVar2 = (b0x) this.c;
                msg msgVar6 = fox.D0;
                String str2 = b0xVar2.a;
                if (d94.d(str2, foxVar2.L)) {
                    z5 = false;
                } else {
                    foxVar2.L = str2;
                }
                fox.D0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z5), Boolean.valueOf(foxVar2.Y));
                kox koxVar4 = foxVar2.G;
                if (koxVar4 != null && (z5 || foxVar2.Y)) {
                    koxVar4.d();
                }
                foxVar2.Y = false;
                return;
            case 21:
                qz2 qz2Var5 = (qz2) this.b;
                a aVar = (a) this.c;
                uz2 uz2Var5 = b6x.l;
                qz2Var5.y(24, 3, uz2Var5);
                aVar.a(uz2Var5);
                return;
            case 22:
                qz2 qz2Var6 = (qz2) this.b;
                a aVar2 = (a) this.c;
                qz2Var6.getClass();
                uz2 uz2Var6 = b6x.l;
                qz2Var6.y(24, 13, uz2Var6);
                aVar2.b(uz2Var6, null);
                return;
            default:
                onx onxVar4 = (onx) this.b;
                try {
                    onxVar4.q(((Callable) this.c).call());
                    return;
                } catch (Exception e10) {
                    onxVar4.p(e10);
                    return;
                } catch (Throwable th) {
                    onxVar4.p(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ rxw(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
