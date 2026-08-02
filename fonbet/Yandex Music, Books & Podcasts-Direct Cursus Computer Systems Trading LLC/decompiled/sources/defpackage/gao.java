package defpackage;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class gao implements x7o, m1t, xhj, o97, xic, m6b, qw0, fxh, lci, gpt, p7q, pun, a0x, OnCompleteListener {
    public Object a;

    public gao(int i) {
        switch (i) {
            case 1:
                this.a = new rb5();
                new LinkedHashMap();
                break;
            case 10:
                this.a = new ciq(0);
                break;
            case 15:
                this.a = new Rect();
                break;
            case 17:
                this.a = new ehv(0);
                break;
            default:
                this.a = new AtomicLong();
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static fow O(String str) {
        switch (str.hashCode()) {
            case -2008522753:
                if (str.equals("speaker")) {
                    return fow.j;
                }
                break;
            case -1182874636:
                if (str.equals("ios_tv")) {
                    return fow.d;
                }
                break;
            case -991572145:
                if (str.equals("android_wear")) {
                    return fow.k;
                }
                break;
            case -861391249:
                if (str.equals(ConstantDeviceInfo.APP_PLATFORM)) {
                    return fow.e;
                }
                break;
            case -791808179:
                if (str.equals("web_tv")) {
                    return fow.h;
                }
                break;
            case 104461:
                if (str.equals("ios")) {
                    return fow.c;
                }
                break;
            case 117588:
                if (str.equals("web")) {
                    return fow.g;
                }
                break;
            case 722989650:
                if (str.equals("android_tv")) {
                    return fow.f;
                }
                break;
            case 1121611313:
                if (str.equals("web_desktop")) {
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    return ((otw) ((byb) qdcVar.C(I)).b(otw.class)).h() ? fow.i : fow.l;
                }
                break;
        }
        return fow.l;
    }

    @Override // defpackage.m6b
    public boolean A(Object obj, File file, pwj pwjVar) {
        InputStream inputStream = (InputStream) obj;
        z98 z98Var = (z98) this.a;
        byte[] bArr = (byte[]) z98Var.f(SQLiteDatabase.OPEN_FULLMUTEX, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        z98Var.l(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z98Var.l(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                z98Var.l(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.fxh
    public boolean B(hxh hxhVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.m1t
    public boolean C(mqs mqsVar, int i) {
        mqsVar.getClass();
        ((znk) this.a).getClass();
        mqsVar.getClass();
        return false;
    }

    @Override // defpackage.xic
    public float D() {
        return 0.0f;
    }

    @Override // defpackage.m1t
    public sbb E(uu5 uu5Var) {
        return ((znk) this.a).E(uu5Var);
    }

    @Override // defpackage.xic
    public long F(float f) {
        return ((long) (Math.exp(((yz0) this.a).b(f) / (nic.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.o97
    public boolean G() {
        return true;
    }

    @Override // defpackage.o97
    public long H() {
        return 0L;
    }

    @Override // defpackage.xic
    public float I(float f, float f2) {
        double b = ((yz0) this.a).b(f2);
        double d = nic.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * b) * r0.a * r0.b))) + f;
    }

    @Override // defpackage.o97
    public long J(long j, long j2) {
        return 1L;
    }

    @Override // defpackage.xhj
    public void K(Object obj) {
        d8q.b((c8q) this.a, obj);
    }

    public boolean L() {
        mxw mxwVar = ((uww) this.a).d;
        return mxwVar != null && mxwVar.g();
    }

    public void M(fmq fmqVar) {
        ob5[] ob5VarArr = {new wyn(fmqVar)};
        rb5 rb5Var = (rb5) this.a;
        rb5Var.getClass();
        rb5Var.c.post(new qf0(11, rb5Var, ob5VarArr));
    }

    public void N(Context context, chv chvVar) {
        Intent intent;
        synchronized (((ehv) this.a)) {
            if (context == null) {
                throw new NullPointerException("Context cannot be null.");
            }
            String str = chvVar.a;
            intent = new Intent();
            intent.setPackage(str);
            intent.setAction("com.whatsapp.otp.OTP_REQUESTED");
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 67108864 : 0);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putParcelable("_ci_", activity);
            Package r6 = ehv.class.getPackage();
            String implementationVersion = r6 != null ? r6.getImplementationVersion() : null;
            if (implementationVersion == null) {
                implementationVersion = "0.1.0_not_from_manifest";
            }
            extras.putString("SDK_VERSION", implementationVersion);
            intent.putExtras(extras);
        }
        context.sendBroadcast(intent);
    }

    public void P(int i, Object obj, iex iexVar) {
        kbx kbxVar = (kbx) this.a;
        kbxVar.k(i, 3);
        iexVar.b((lax) obj, kbxVar.a);
        kbxVar.k(i, 4);
    }

    public void Q(int i, Object obj, iex iexVar) {
        lax laxVar = (lax) obj;
        kbx kbxVar = (kbx) this.a;
        kbxVar.m((i << 3) | 2);
        kbxVar.m(laxVar.a(iexVar));
        iexVar.b(laxVar, kbxVar.a);
    }

    @Override // defpackage.fxh
    public void a(hxh hxhVar) {
        tos tosVar = (tos) this.a;
        boolean p = tosVar.a.a.p();
        Window.Callback callback = tosVar.b;
        if (p) {
            callback.onPanelClosed(108, hxhVar);
        } else if (callback.onPreparePanel(0, null, hxhVar)) {
            callback.onMenuOpened(108, hxhVar);
        }
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        yyw yywVar = new yyw(2, (i8s) obj2);
        szw szwVar = (szw) ((azw) obj).s();
        hbd hbdVar = (hbd) this.a;
        Parcel X = szwVar.X();
        int i = ezw.a;
        X.writeStrongBinder(yywVar);
        ezw.c(X, hbdVar);
        szwVar.p0(X, 3);
    }

    @Override // defpackage.a0x
    public void b(Bitmap bitmap) {
        msg msgVar = mmx.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - r3) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, bitmap.getHeight() + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((mmx) this.a).b(bitmap2, 0);
    }

    @Override // defpackage.o97
    public long c(long j) {
        return 0L;
    }

    public int d(View view) {
        Rect rect = (Rect) this.a;
        if (!view.isShown() || !view.getGlobalVisibleRect(rect)) {
            return 0;
        }
        return ((rect.height() * rect.width()) * 100) / (view.getHeight() * view.getWidth());
    }

    @Override // defpackage.xhj
    public Object e() {
        return d8q.a((c8q) this.a);
    }

    @Override // defpackage.m1t
    public sbb g(int i, uu5 uu5Var) {
        ((znk) this.a).getClass();
        return null;
    }

    @Override // defpackage.m1t
    public boolean h() {
        return ((znk) this.a).h();
    }

    @Override // defpackage.o97
    public long i(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.o97
    public long j(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.o97
    public whn k(long j) {
        return (whn) this.a;
    }

    @Override // defpackage.xic
    public float l(float f, long j) {
        long j2 = j / 1000000;
        mic a = ((yz0) this.a).a(f);
        long j3 = a.c;
        return (((Math.signum(a.a) * ug0.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return nuu.c;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        Float f;
        bzs bzsVar;
        szuVar.getClass();
        jzs jzsVar = (jzs) CollectionsKt.firstOrNull(szuVar.o());
        if (jzsVar == null || (bzsVar = jzsVar.c) == null || (f = bzsVar.c) == null) {
            f = (Float) this.a;
        }
        this.a = f;
        bzs bzsVar2 = szuVar.l.c;
        if (bzsVar2 == null) {
            bzsVar2 = bzs.e;
        }
        return new nuu(bzsVar2, (Float) this.a);
    }

    @Override // defpackage.xic
    public float o(float f, float f2, long j) {
        long j2 = j / 1000000;
        mic a = ((yz0) this.a).a(f2);
        long j3 = a.c;
        return (Math.signum(a.a) * a.b * ug0.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        p84.f((p84) ((p3x) this.a).i, "joinApplication", task);
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        jg3 jg3Var = (jg3) obj;
        jg3Var.getClass();
        ((rro) this.a).K(new kro(jg3Var));
    }

    @Override // defpackage.o97
    public long p(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return nuu.c;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        return nuu.c;
    }

    @Override // defpackage.qw0
    public Object r(rwo rwoVar, Float f, Float f2, Function1 function1, r1r r1rVar) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object c = w1r.c(rwoVar, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, wdp.J(0.0f, floatValue2, 28), (tm0) this.a, function1, r1rVar);
        return c == nm6.a ? c : (qm0) c;
    }

    @Override // defpackage.gpt
    public ca7 s(Uri uri) {
        return new njr(1, uri, (ContentResolver) this.a);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return nuu.c;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return nuu.c;
    }

    @Override // defpackage.m1t
    public Object v(mqs mqsVar, Continuation continuation) {
        ((znk) this.a).getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((rro) this.a).K(new lro(bfkVar, R.string.paymentsdk_sbp_something_went_wrong, R.string.paymentsdk_sbp_something_went_wrong_description));
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new hpt(this);
    }

    @Override // defpackage.o97
    public long z(long j) {
        return 1L;
    }

    @Override // defpackage.o97
    public long f(long j, long j2) {
        return j2;
    }

    public gao(jx7 jx7Var) {
        float f = m8r.a;
        yz0 yz0Var = new yz0();
        yz0Var.a = f;
        float density = jx7Var.getDensity();
        float f2 = nic.a;
        yz0Var.b = density * 386.0878f * 160.0f * 0.84f;
        this.a = yz0Var;
    }

    public /* synthetic */ gao(Object obj) {
        this.a = obj;
    }
}
