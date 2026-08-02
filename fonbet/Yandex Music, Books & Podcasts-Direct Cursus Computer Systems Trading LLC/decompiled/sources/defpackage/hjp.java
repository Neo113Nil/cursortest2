package defpackage;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Parcel;
import io.grpc.internal.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

/* loaded from: classes5.dex */
public final class hjp implements dmr, arr, wa6, t8s, w2q, uzt, tpl, ly1, bmw, pun, u0x, ydx {
    public final /* synthetic */ int a;
    public Object b;

    public hjp(float f, float f2, cn0 cn0Var) {
        this.a = 11;
        int[] iArr = szt.a;
        this.b = new bjt(cn0Var != null ? new kpm(f, f2, cn0Var) : new f4m(f, f2));
    }

    @Override // defpackage.rzt
    public cn0 A(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((bjt) this.b).A(j, cn0Var, cn0Var2, cn0Var3);
    }

    public void B() {
        synchronized (((b) this.b).o) {
            try {
                if (((b) this.b).l) {
                    return;
                }
                ArrayList arrayList = new ArrayList(((b) this.b).q);
                ((b) this.b).l = true;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    x13 x13Var = (x13) it.next();
                    synchronized (x13Var) {
                        x13Var.o(sgr.e, false);
                    }
                }
                synchronized (((b) this.b).o) {
                    b bVar = (b) this.b;
                    bVar.p = true;
                    bVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public sfm C(x13 x13Var) {
        synchronized (((b) this.b).o) {
            ((b) this.b).q.add(x13Var);
        }
        b bVar = (b) this.b;
        sfm sfmVar = new sfm();
        sfmVar.c = bVar;
        sfmVar.a = x13Var;
        long j = bVar.i;
        if (j != Long.MAX_VALUE) {
            sfmVar.b = x13Var.b.schedule(new yyo(1, sfmVar), j, TimeUnit.MILLISECONDS);
        } else {
            sfmVar.b = new FutureTask(new q(23), null);
        }
        lte.a((kte) bVar.t.e.get(Long.valueOf(bVar.b.c)), x13Var);
        return sfmVar;
    }

    public void D(int i, Object obj, knx knxVar) {
        dmx dmxVar = (dmx) this.b;
        dmxVar.l(i, 3);
        knxVar.g((slx) obj, dmxVar.a);
        dmxVar.l(i, 4);
    }

    public void E(int i, Object obj, knx knxVar) {
        slx slxVar = (slx) obj;
        dmx dmxVar = (dmx) this.b;
        dmxVar.n((i << 3) | 2);
        dmxVar.n(slxVar.a(knxVar));
        knxVar.g(slxVar, dmxVar.a);
    }

    @Override // defpackage.ly1
    public void I(long j) {
        xiu xiuVar = ((jqb) this.b).p1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new ey1(xiuVar, j));
        }
    }

    @Override // defpackage.ly1
    public void Q(int i, long j, long j2) {
        xiu xiuVar = ((jqb) this.b).p1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new zx1(xiuVar, i, j, j2, 0));
        }
    }

    @Override // defpackage.ly1
    public void T() {
        ((jqb) this.b).y();
    }

    @Override // defpackage.ly1
    public void W() {
        ((jqb) this.b).y1 = true;
    }

    @Override // defpackage.ly1
    public void X() {
        zrb zrbVar = ((jqb) this.b).C0;
        if (zrbVar != null) {
            zrbVar.a();
        }
    }

    @Override // defpackage.uzt, defpackage.rzt
    public boolean a() {
        ((bjt) this.b).getClass();
        return false;
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        i8s i8sVar = (i8s) obj2;
        iyw iywVar = (iyw) ((syw) obj).s();
        p8s p8sVar = (p8s) this.b;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(iywVar.i);
        int i = kxw.a;
        if (p8sVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            p8sVar.writeToParcel(obtain, 0);
        }
        try {
            iywVar.h.transact(1, obtain, null, 1);
            obtain.recycle();
            i8sVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.ydx
    public hex b(Class cls) {
        for (int i = 0; i < 2; i++) {
            ydx ydxVar = ((ydx[]) this.b)[i];
            if (ydxVar.l(cls)) {
                return ydxVar.b(cls);
            }
        }
        qq6.d("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return n1g.d;
    }

    @Override // defpackage.u0x
    public Object d() {
        switch (this.a) {
            case 20:
                if (xv7.n == null) {
                    xv7.n = new my1();
                }
                synchronized (xv7.m) {
                }
                throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
            default:
                return new e5x(new yee("AppUpdateListenerRegistry", 3), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), ((k81) ((c5p) this.b).b).a);
        }
    }

    @Override // defpackage.ly1
    public void e(boolean z) {
        xiu xiuVar = ((jqb) this.b).p1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new dy1(xiuVar, z, 0));
        }
    }

    @Override // defpackage.ly1
    public void f(Exception exc) {
        vq1.L("YMediaCodecAudioRendere", "Audio sink error", exc);
        xiu xiuVar = ((jqb) this.b).p1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new by1(xiuVar, exc, 0));
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        j1g j1gVar = (j1g) this.b;
        faqVar.getClass();
        if (faqVar instanceof naq) {
            return cb0.I(j1gVar);
        }
        if (faqVar instanceof daq) {
            return new n1g(j1gVar, false, false);
        }
        if (faqVar instanceof saq) {
            return new n1g(j1gVar, true, false);
        }
        if (faqVar instanceof qaq) {
            return n1g.d;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.dmr
    /* renamed from: get, reason: collision with other method in class */
    public dmr mo22get(String str) {
        Object opt = ((JSONObject) this.b).opt(str);
        if (opt instanceof JSONArray) {
            return new knn(10, (JSONArray) opt);
        }
        if (opt instanceof JSONObject) {
            return new hjp(5, (JSONObject) opt);
        }
        if (opt == null ? true : opt.equals(JSONObject.NULL)) {
            return null;
        }
        return i9w.g;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return cb0.I((j1g) this.b);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        j1g j1gVar = (j1g) this.b;
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            return cb0.I(j1gVar);
        }
        if (m1qVar instanceof j1q) {
            return cb0.I(j1gVar);
        }
        if (m1qVar instanceof e2q) {
            return n1g.d;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return new n1g((j1g) this.b, true, false);
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return cb0.I((j1g) this.b);
    }

    @Override // defpackage.ydx
    public boolean l(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((ydx[]) this.b)[i].l(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rzt
    public long m(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((bjt) this.b).m(cn0Var, cn0Var2, cn0Var3);
    }

    @Override // defpackage.ly1
    public void n() {
        ((jqb) this.b).A1 = true;
    }

    @Override // defpackage.bmw
    public void onError(Throwable th) {
        th.getClass();
        v3w.l("illegal queue launch: ", th.getMessage(), 5, onw.j, null);
        onw onwVar = (onw) this.b;
        onwVar.c.a("illegal queue launch", (String) onwVar.b.b.getValue(), new zsw(onwVar.d.b().c.a));
    }

    @Override // defpackage.tpl
    public String p(isb isbVar) {
        return vz1.r(new StringBuilder(), isbVar.g, 'p');
    }

    @Override // defpackage.ly1
    public void q() {
        zrb zrbVar = ((jqb) this.b).C0;
        if (zrbVar != null) {
            zrbVar.a.Y = true;
        }
    }

    @Override // defpackage.ly1
    public void r(z9 z9Var) {
        xiu xiuVar = ((jqb) this.b).p1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new ay1(xiuVar, z9Var, 0));
        }
    }

    @Override // defpackage.ly1
    public void s(z9 z9Var) {
        xiu xiuVar = ((jqb) this.b).p1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new ay1(xiuVar, z9Var, 1));
        }
    }

    @Override // defpackage.rzt
    public cn0 v(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((bjt) this.b).v(cn0Var, cn0Var2, cn0Var3);
    }

    @Override // defpackage.dmr
    public void w(Object obj, String str) {
        try {
            r7o r7oVar = z7o.b;
            ((JSONObject) this.b).put(str, obj);
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
    }

    @Override // defpackage.rzt
    public cn0 x(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((bjt) this.b).x(j, cn0Var, cn0Var2, cn0Var3);
    }

    @Override // defpackage.tpl
    public String y() {
        String string = ((z23) this.b).a.getString(R.string.player_adaptive_track);
        string.getClass();
        return string;
    }

    @Override // defpackage.tpl
    public String z() {
        String string = ((z23) this.b).a.getString(R.string.player_disable_track);
        string.getClass();
        return string;
    }

    public /* synthetic */ hjp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public hjp(dmx dmxVar) {
        this.a = 23;
        Charset charset = smx.a;
        this.b = dmxVar;
        dmxVar.a = this;
    }

    public hjp(j1g j1gVar) {
        this.a = 8;
        j1gVar.getClass();
        this.b = j1gVar;
    }

    public /* synthetic */ hjp(int i) {
        this.a = i;
    }

    @Override // defpackage.t8s
    public d7f get(String str) {
        return (d7f) ((xy0) this.b).get(str);
    }

    @Override // defpackage.arr
    public Object get() {
        return (SurfaceSize) this.b;
    }

    @Override // defpackage.wa6
    public void accept(Object obj) {
        SurfaceSize surfaceSize = (SurfaceSize) obj;
        surfaceSize.getClass();
        this.b = surfaceSize;
    }
}
