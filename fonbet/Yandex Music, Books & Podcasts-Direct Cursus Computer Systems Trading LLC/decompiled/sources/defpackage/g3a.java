package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.media3.extractor.FlacStreamMetadata;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.impl.C0295gl;
import io.appmetrica.analytics.rtmwrapper.internal.RtmServiceReporter;
import kotlin.Pair;
import ru.kinopoisk.sdk.easylogin.internal.F4;
import ru.kinopoisk.sdk.easylogin.internal.K8;
import ru.yandex.music.R;
import ru.yandex.music.utils.Preconditions;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

/* loaded from: classes5.dex */
public final /* synthetic */ class g3a implements RtmServiceReporter, kd, myc, ycg, qyc, va6, aze, p03, MviScreen, dyn, OnCompleteListener, tqj, arr, yr6, jc4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dyn
    public void a(long j, d7k d7kVar) {
        saf.F(j, d7kVar, ((jvc) this.b).K);
    }

    @Override // defpackage.va6
    public void accept(Object obj) {
        switch (this.a) {
            case 11:
                F4.b((F4.f) this.b, obj);
                break;
            case 12:
                F4.c((F4.g) this.b, obj);
                break;
            default:
                F4.d((F4.h) this.b, obj);
                break;
        }
    }

    @Override // defpackage.myc
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return (uj7) this.b;
            case 10:
                return F4.a((F4.e) this.b, obj);
            default:
                ((zhg) this.b).b.l(obj);
                return obj;
        }
    }

    @Override // defpackage.kd
    /* renamed from: b */
    public void mo33b(Object obj) {
        lum lumVar = (lum) this.b;
        Throwable th = (Throwable) obj;
        th.getClass();
        lumVar.Q(th);
    }

    @Override // defpackage.p03
    public long c(long j) {
        return ((FlacStreamMetadata) this.b).getSampleNumber(j);
    }

    @Override // defpackage.yr6
    public void d(cvl cvlVar) {
        uu5 uu5Var = (uu5) this.b;
        cvlVar.getClass();
        v7f v7fVar = (v7f) uu5Var.i;
        if (v7fVar != null) {
            v7fVar.dismissAllowingStateLoss();
        }
    }

    public boolean e(pv9 pv9Var, int i, Bundle bundle) {
        gc6 gc6Var;
        kr0 kr0Var = (kr0) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((dne) pv9Var.b).m();
                Parcelable parcelable = (Parcelable) ((dne) pv9Var.b).i();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        dne dneVar = (dne) pv9Var.b;
        ClipData clipData = new ClipData(dneVar.getDescription(), new ClipData.Item(dneVar.l()));
        if (i2 >= 31) {
            gc6Var = new fc6(clipData, 2);
        } else {
            hc6 hc6Var = new hc6();
            hc6Var.b = clipData;
            hc6Var.c = 2;
            gc6Var = hc6Var;
        }
        gc6Var.a(dneVar.q());
        gc6Var.setExtras(bundle);
        return wdu.m(kr0Var, gc6Var.build()) == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(cxb cxbVar) {
        boolean z;
        StackTraceElement stackTraceElement;
        String str;
        o3a o3aVar = (o3a) this.b;
        cir cirVar = o3aVar.A;
        boolean z2 = true;
        if (cxbVar instanceof u2a) {
            u2a u2aVar = (u2a) cxbVar;
            o3a.i(o3aVar, u2aVar.t, u2aVar.u);
        } else if (cxbVar instanceof x2a) {
            x2a x2aVar = (x2a) cxbVar;
            q2a q2aVar = x2aVar.t;
            r2a r2aVar = x2aVar.u;
            if (o3aVar.J) {
                xq0.q("Can't update document after destroy");
                return;
            } else {
                fxn fxnVar = new fxn(new m4a(q2aVar), y5g.i0((m6a) cirVar.a), r2a.c, r2aVar);
                ywf.E(o3aVar, cirVar);
                cirVar.b(new r5a(fxnVar));
            }
        } else if (cxbVar instanceof w2a) {
            kb6 kb6Var = ((w2a) cxbVar).t;
            ywf.E(o3aVar, cirVar);
            cirVar.b(new y2a(kb6Var));
        } else {
            if (!(cxbVar instanceof v2a)) {
                z = false;
                if (o3aVar.G == null && !z) {
                    z2 = false;
                }
                if (z2) {
                    g06 g06Var = o3aVar.q;
                    xgb xgbVar = xgb.ACTION_SERVICE_REQUEST_ERROR;
                    jyr a = fsg.a(new Pair("commandType", cxbVar.getClass().getSimpleName()));
                    c5b c5bVar = c5b.a;
                    htb htbVar = ((thc) g06Var.c).a;
                    boolean booleanValue = Boolean.FALSE.booleanValue();
                    vhc vhcVar = vhc.d;
                    if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        Integer valueOf = Integer.valueOf(lineNumber);
                        if (lineNumber <= 0) {
                            valueOf = null;
                        }
                        if (valueOf == null || (str = valueOf.toString()) == null) {
                            str = "No line info";
                        }
                        vhcVar = new vhc(fileName, methodName, str);
                    }
                    g06Var.N(yhc.ERROR, "Failed to publish command: command not handled", fsg.c(a, fsg.a(new Pair("errorType", "Command.Publish.Failed"))), c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
                    return;
                }
                return;
            }
            o3aVar.n(((v2a) cxbVar).t);
        }
        z = true;
        if (o3aVar.G == null) {
            z2 = false;
        }
        if (z2) {
        }
    }

    @Override // defpackage.jc4
    public void g(un4 un4Var) {
        K8.a((K8) this.b, un4Var);
    }

    @Override // defpackage.arr
    public Object get() {
        ah3 ah3Var = (ah3) this.b;
        return new SurfaceSize(ah3Var.b, ah3Var.c);
    }

    @Override // io.appmetrica.analytics.MviScreen
    public String getName() {
        return ((suc) this.b).b.a;
    }

    @Override // defpackage.aze
    public void i(int i, Object obj) {
        y7c y7cVar = (y7c) this.b;
        f6w B = f6w.B((x7c) obj, y7cVar.l, y7cVar.k, y7cVar.m, null);
        y supportFragmentManager = ((t) Preconditions.nonNull(y7cVar.l())).getSupportFragmentManager();
        a l = su4.l(supportFragmentManager, supportFragmentManager);
        l.g(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_right, R.anim.slide_out_left);
        l.e(R.id.content_frame, B, null);
        l.c(null);
        l.j();
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((f8l) obj).k((tcu) this.b);
                break;
            case 5:
                ((f8l) obj).l((sv6) this.b);
                break;
            case 6:
                ((f8l) obj).P(((urb) this.b).a.O);
                break;
            default:
                ((f8l) obj).h((u2i) this.b);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 19:
                mp3 mp3Var = (mp3) this.b;
                task.getClass();
                try {
                    Boolean bool = (Boolean) task.h();
                    mp3Var.invoke(Boolean.valueOf(bool == null ? false : bool.booleanValue()));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    mp3Var.invoke(Boolean.FALSE);
                    return;
                }
            default:
                tge tgeVar = (tge) this.b;
                task.getClass();
                if (!task.l()) {
                    Exception g = task.g();
                    if (g != null) {
                        ssg.a(6, null, "Failed to request app update info", g);
                        break;
                    }
                } else {
                    zu0 zu0Var = (zu0) task.h();
                    ssg.a(4, null, "Received app update info " + zu0Var, null);
                    tgeVar.d = zu0Var;
                    xdr xdrVar = tgeVar.c;
                    zu0Var.getClass();
                    if (zu0Var.a == 2) {
                        gox.a();
                        PendingIntent pendingIntent = zu0Var.c;
                        if (pendingIntent == null) {
                            pendingIntent = null;
                        }
                        if (pendingIntent != null) {
                            ssg.a(4, null, "Update is available", null);
                            pge pgeVar = pge.b;
                            xdrVar.getClass();
                            xdrVar.m(null, pgeVar);
                            break;
                        }
                    }
                    if (zu0Var.b == 11) {
                        ssg.a(4, null, "Update is downloaded", null);
                        pge pgeVar2 = pge.d;
                        xdrVar.getClass();
                        xdrVar.m(null, pgeVar2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        int i = this.a;
        oxd oxdVar = (oxd) this.b;
        switch (i) {
            case 20:
                int i2 = HiddenActivity.c;
                oxdVar.invoke(obj);
                break;
            case 21:
                int i3 = HiddenActivity.c;
                oxdVar.invoke(obj);
                break;
            case 22:
                int i4 = HiddenActivity.c;
                oxdVar.invoke(obj);
                break;
            default:
                int i5 = HiddenActivity.c;
                oxdVar.invoke(obj);
                break;
        }
    }

    @Override // io.appmetrica.analytics.rtmwrapper.internal.RtmServiceReporter
    public void reportData(int i, Bundle bundle) {
        ((C0295gl) this.b).reportData(i, bundle);
    }
}
