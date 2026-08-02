package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import java.io.IOException;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes.dex */
public final class j6e implements yoe, tpl, ear, adu, ac5, e9n, wjj, y6a {
    public Object a;
    public Object b;

    public j6e(int i) {
        switch (i) {
            case 10:
                this.a = new b0u(0);
                this.b = new b0u(0);
                break;
            case 14:
                Level level = Level.FINE;
                Logger logger = Logger.getLogger(noj.class.getName());
                o2g.O(level, "level");
                this.b = level;
                o2g.O(logger, "logger");
                this.a = logger;
                break;
            case 19:
                this.a = new zx0(10);
                this.b = new ReentrantLock();
                break;
            case 24:
                cib cibVar = new cib(12);
                nrg nrgVar = new nrg();
                this.a = cibVar;
                this.b = nrgVar;
                break;
            case 25:
                xdr a = ydr.a(Boolean.FALSE);
                this.a = a;
                this.b = new fkn(a);
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005b), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j6e s(String... strArr) {
        String str;
        try {
            pn3[] pn3VarArr = new pn3[strArr.length];
            hi3 hi3Var = new hi3();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = b7f.e;
                hi3Var.M0(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str2.charAt(i3);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                        if (i2 < i3) {
                            hi3Var.R0(i2, i3, str2);
                        }
                        hi3Var.S0(str);
                        i2 = i3 + 1;
                    } else {
                        if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                        }
                        hi3Var.S0(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    hi3Var.R0(i2, length, str2);
                }
                hi3Var.M0(34);
                hi3Var.readByte();
                pn3VarArr[i] = hi3Var.g0(hi3Var.b);
            }
            String[] strArr3 = (String[]) strArr.clone();
            int i4 = qwj.d;
            return new j6e(strArr3, s7g.y(pn3VarArr));
        } catch (IOException e) {
            xq0.w(e);
            return null;
        }
    }

    public static String v(hi3 hi3Var) {
        long j = hi3Var.b;
        if (j <= 64) {
            return hi3Var.I0().e();
        }
        return hi3Var.J0((int) Math.min(j, 64L)).e() + "...";
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function0, uif] */
    public Object a() {
        if (this.b == null) {
            this.b = ((uif) this.a).invoke();
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    @Override // defpackage.wjj
    public void b(ka8 ka8Var) {
        AtomicReference atomicReference = (AtomicReference) this.b;
        while (!atomicReference.compareAndSet(null, ka8Var)) {
            if (atomicReference.get() != null) {
                ka8Var.a();
                return;
            }
        }
    }

    @Override // defpackage.y6a
    public void c(int i, boolean z) {
        g6p g6pVar = (g6p) this.a;
        c7p c7pVar = (c7p) this.b;
        g6pVar.f0(c7pVar.c, c7pVar.d, i, z);
    }

    @Override // defpackage.ac5
    public void e() {
        iwm iwmVar = (iwm) this.a;
        tw twVar = (tw) this.b;
        rmb.j(iwmVar.c, wjb.AlbumScreen, c3x.w(twVar.a.a, 0, 0), null, 12);
        sfm sfmVar = iwmVar.b;
        ow owVar = twVar.a;
        int i = AlbumScreenActivity.v0;
        Context context = (Context) sfmVar.a;
        Intent T = leu.T(context, owVar.a, d.p(((fwm) ((s63) sfmVar.c).a).a));
        T.putExtra("deeplink_target_data", new m6s(qwp.q0(owVar.f), false));
        context.startActivity(T);
        lxm lxmVar = owVar.g;
        if (lxmVar != null) {
            String str = lxmVar.a;
            mx mxVar = iwmVar.f;
            mxVar.getClass();
            mxVar.a(str);
        }
    }

    @Override // defpackage.e9n
    public void f(d9n d9nVar, int i) {
        int[] iArr = (int[]) this.b;
        try {
            d9nVar.read((byte[]) this.a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            d9nVar.close();
        }
    }

    public synchronized Map g() {
        try {
            if (((Map) this.b) == null) {
                this.b = Collections.unmodifiableMap(new HashMap((HashMap) this.a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.b;
    }

    @Override // defpackage.adu
    public View getRoot() {
        throw null;
    }

    public boolean h() {
        return ((Logger) this.a).isLoggable((Level) this.b);
    }

    public boolean i() {
        paw pawVar = (paw) this.a;
        return ((mzr) this.b).getVolume() == 0.0f || pawVar.getVolume() == 0.0f || pawVar.c();
    }

    public void j(int i, int i2, hi3 hi3Var, int i3, boolean z) {
        if (h()) {
            ((Logger) this.a).log((Level) this.b, dfi.w(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + v(hi3Var));
        }
    }

    public void k(int i, int i2, afb afbVar, pn3 pn3Var) {
        if (h()) {
            Logger logger = (Logger) this.a;
            Level level = (Level) this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(dfi.w(i));
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(afbVar);
            sb.append(" length=");
            sb.append(pn3Var.d());
            sb.append(" bytes=");
            hi3 hi3Var = new hi3();
            hi3Var.L0(pn3Var);
            sb.append(v(hi3Var));
            logger.log(level, sb.toString());
        }
    }

    @Override // defpackage.ear
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ear[] earVarArr = (ear[]) this.a;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            ear earVar = earVarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = earVar.l(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((wvo) this.b).l(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public void m(int i, long j) {
        if (h()) {
            ((Logger) this.a).log((Level) this.b, dfi.w(i) + " PING: ack=false bytes=" + j);
        }
    }

    public void n(int i, int i2, afb afbVar) {
        if (h()) {
            ((Logger) this.a).log((Level) this.b, dfi.w(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + afbVar);
        }
    }

    @Override // defpackage.wjj
    public void onComplete() {
        ((oc4) ((ltm) this.a)).p0(null);
    }

    @Override // defpackage.wjj
    public void onError(Throwable th) {
        ((oc4) ((ltm) this.a)).p0(th);
    }

    @Override // defpackage.wjj
    public void onNext(Object obj) {
        try {
            etn.k0((ltm) this.a, obj);
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.tpl
    public String p(isb isbVar) {
        z6u z6uVar = (z6u) this.a;
        z6uVar.getClass();
        String str = (String) ((ConcurrentHashMap) z6uVar.d).get(new cws(isbVar.f, isbVar.g, isbVar.h));
        return str == null ? ((hjp) this.b).p(isbVar) : str;
    }

    public void q(int i, iqe iqeVar) {
        if (h()) {
            Logger logger = (Logger) this.a;
            Level level = (Level) this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(dfi.w(i));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(toj.class);
            for (toj tojVar : toj.values()) {
                if (iqeVar.a(tojVar.a)) {
                    enumMap.put((EnumMap) tojVar, (toj) Integer.valueOf(iqeVar.a[tojVar.a]));
                }
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    public void r(long j, int i, int i2) {
        if (h()) {
            ((Logger) this.a).log((Level) this.b, dfi.w(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    public void t(v0j v0jVar) {
        v0jVar.getClass();
        v0j v0jVar2 = v0j.e;
        Assertions.assertFalse(v0jVar2 == v0jVar);
        if (v0jVar2 == v0jVar) {
            u(true);
        } else {
            ((SharedPreferences.Editor) this.b).putInt("network_mode", v0jVar.a);
        }
    }

    @Override // defpackage.yoe
    public voe toInstant() {
        throw new cbe(((String) this.a) + " when parsing an Instant from \"" + bow.F(64, (String) this.b) + '\"');
    }

    public void u(boolean z) {
        z0j z0jVar = (z0j) this.a;
        Assertions.assertTrue(!z || z0jVar.b, "Attempt to set offline while not available.");
        uju ujuVar = (uju) z0jVar.e;
        String str = ((xxq) z0jVar.d).a;
        ujuVar.getClass();
        str.getClass();
        ujuVar.b.c(new tju(ujuVar, str, z, 2));
        ((SharedPreferences.Editor) this.b).putBoolean("is_offline", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(Function1 function1, cg6 cg6Var) {
        hrn hrnVar;
        int i;
        xdr xdrVar = (xdr) this.a;
        try {
            if (cg6Var instanceof hrn) {
                hrnVar = (hrn) cg6Var;
                int i2 = hrnVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hrnVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = hrnVar.j;
                    Object obj2 = nm6.a;
                    i = hrnVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        Boolean bool = Boolean.TRUE;
                        xdrVar.getClass();
                        xdrVar.m(null, bool);
                        hrnVar.l = 1;
                        if (function1.invoke(hrnVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    Boolean bool2 = Boolean.FALSE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool2);
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            Boolean bool22 = Boolean.FALSE;
            xdrVar.getClass();
            xdrVar.m(null, bool22);
            return Unit.a;
        } catch (Throwable th) {
            Boolean bool3 = Boolean.FALSE;
            xdrVar.getClass();
            xdrVar.m(null, bool3);
            throw th;
        }
        hrnVar = new hrn(this, cg6Var);
        Object obj3 = hrnVar.j;
        Object obj22 = nm6.a;
        i = hrnVar.l;
    }

    @Override // defpackage.tpl
    public String y() {
        return ((hjp) this.b).y();
    }

    @Override // defpackage.tpl
    public String z() {
        return ((hjp) this.b).z();
    }

    @Override // defpackage.ac5
    public void d() {
    }

    public j6e(paw pawVar, mzr mzrVar) {
        pawVar.getClass();
        this.a = pawVar;
        this.b = mzrVar;
    }

    public j6e(ehk ehkVar, xwj xwjVar) {
        ehkVar.getClass();
        this.a = ehkVar;
        this.b = xwjVar;
    }

    public j6e(View view) {
        this.a = view;
    }

    public /* synthetic */ j6e(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public j6e(qsn qsnVar, int[] iArr) {
        this.a = yde.v(qsnVar);
        this.b = iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j6e(Function0 function0) {
        this.a = (uif) function0;
    }
}
