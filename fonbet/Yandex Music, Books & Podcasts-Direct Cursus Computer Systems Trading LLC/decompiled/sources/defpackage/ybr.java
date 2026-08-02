package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ybr extends e80 implements t6t {
    public final yjj a;
    public Boolean b;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public String h;
    public final Handler l;
    public final t8w c = new t8w();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public final chs m = new chs();

    public ybr(yjj yjjVar, Looper looper) {
        this.a = yjjVar;
        this.l = new Handler(looper);
    }

    public static String S(boh bohVar) {
        StringBuilder sb = new StringBuilder("MediaLoadData[");
        sb.append(bohVar.f);
        sb.append('-');
        sb.append(bohVar.g);
        sb.append("] dataType=");
        int i = bohVar.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? "UNKNOWN" : "MANIFEST" : "MEDIA_INITIALIZATION" : "MEDIA");
        sb.append(" trackType=");
        sb.append(q0(bohVar.b));
        sb.append(' ');
        return sb.toString();
    }

    public static String q0(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "VIDEO" : "AUDIO" : "DEFAULT";
    }

    @Override // defpackage.t6t
    public final void C(db7 db7Var, nb7 nb7Var, boolean z) {
        db7Var.getClass();
        nb7Var.getClass();
    }

    public final String G(nb7 nb7Var, boolean z) {
        try {
            r7o r7oVar = z7o.b;
            return this.c.f(new nb7(z ? nb7Var.a : Uri.parse(nb7Var.h)));
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
            return null;
        }
    }

    public final StartFromCacheInfo N() {
        Long l;
        chs chsVar = this.m;
        chsVar.getClass();
        chsVar.a("StartFromCacheHelper", "getStartFromCacheInfo", "minVideoFromNetworkPositionMs=" + this.d + " maxVideoFromCachePositionMs=" + this.f, new Object[0]);
        chsVar.a("StartFromCacheHelper", "getStartFromCacheInfo", "minAudioFromNetworkPositionMs=" + this.e + " maxAudioFromCachePositionMs=" + this.g, new Object[0]);
        Long l2 = this.f;
        Long l3 = null;
        if (l2 != null) {
            Long l4 = this.d;
            l = l4 == null ? l2 : l4;
        } else {
            l = null;
        }
        Long l5 = this.g;
        StartFromCacheInfo startFromCacheInfo = new StartFromCacheInfo(this.h, this.b, l, (l5 == null || (l3 = this.e) != null) ? l3 : l5, null);
        chsVar.getClass();
        chsVar.a("StartFromCacheHelper", "getStartFromCacheInfo", "StartFromCacheInfo=" + startFromCacheInfo, new Object[0]);
        return startFromCacheInfo;
    }

    @Override // defpackage.t6t
    public final void a(lq2 lq2Var, nb7 nb7Var, boolean z, int i) {
        nb7Var.getClass();
    }

    public final void b() {
        this.i.clear();
        this.j.clear();
        this.k.clear();
    }

    public final void f0(nb7 nb7Var, boolean z) {
        Long l;
        chs chsVar = this.m;
        chsVar.getClass();
        chsVar.a("StartFromCacheHelper", "processTransferEnd", "onTransferEnd", new Object[0]);
        String G = G(nb7Var, z);
        boh bohVar = (boh) this.i.get(G);
        if (G == null) {
            chsVar.getClass();
            chsVar.a("StartFromCacheHelper", "processTransferEnd", "path is null dataSpec=" + nb7Var, new Object[0]);
            return;
        }
        chsVar.getClass();
        StringBuilder sb = new StringBuilder("isNetwork=");
        sb.append(z);
        sb.append(' ');
        sb.append(bohVar != null ? S(bohVar) : null);
        sb.append(" l=");
        sb.append(nb7Var.g);
        sb.append(" p=");
        sb.append(nb7Var.f);
        sb.append(' ');
        sb.append(mlr.L(15, G));
        chsVar.a("StartFromCacheHelper", "processTransferEnd", sb.toString(), new Object[0]);
        if (bohVar == null) {
            chsVar.getClass();
            chsVar.a("StartFromCacheHelper", "processTransferEnd", "cant find startMediaLoadInfo by ".concat(mlr.L(15, G)), new Object[0]);
            this.k.put(G, new xbr(nb7Var, z));
            return;
        }
        int i = bohVar.b;
        if (z || bohVar.a != 1) {
            return;
        }
        if (i == 2 || i == 1 || i == 0) {
            long j = bohVar.g;
            if (i != 1) {
                l = this.f;
                if (i != 2) {
                    Long l2 = this.g;
                    if (l == null || (l2 != null && l.longValue() >= l2.longValue())) {
                        l = l2;
                    }
                }
            } else {
                l = this.g;
            }
            if (j <= (l != null ? l.longValue() : Long.MIN_VALUE)) {
                chsVar.getClass();
                chsVar.a("StartFromCacheHelper", "processTransferEnd", "fromCachePositionMs for %s is %s %s", q0(i), Long.valueOf(j), mlr.L(15, G));
                return;
            }
            if (i == 1) {
                this.g = Long.valueOf(j);
            } else if (i != 2) {
                this.f = Long.valueOf(j);
                this.g = Long.valueOf(j);
            } else {
                this.f = Long.valueOf(j);
            }
            chsVar.getClass();
            chsVar.a("StartFromCacheHelper", "processTransferEnd", "updateMaxMediaFromCachePositionMs for %s updated to %s %s", q0(i), Long.valueOf(j), mlr.L(15, G));
        }
    }

    public final void g0(nb7 nb7Var, boolean z) {
        Long l;
        HashSet u0;
        Object t7oVar;
        chs chsVar = this.m;
        chsVar.getClass();
        chsVar.a("StartFromCacheHelper", "processTransferInitializing", "processTransferInitializing", new Object[0]);
        String G = G(nb7Var, z);
        boh bohVar = (boh) this.i.get(G);
        chs chsVar2 = this.m;
        if (G == null) {
            chsVar2.getClass();
            chsVar2.a("StartFromCacheHelper", "processTransferInitializing", "path is null dataSpec=" + nb7Var, new Object[0]);
            return;
        }
        chsVar2.getClass();
        StringBuilder sb = new StringBuilder("isNetwork=");
        sb.append(z);
        sb.append(' ');
        sb.append(bohVar != null ? S(bohVar) : null);
        sb.append(' ');
        sb.append(mlr.L(15, G));
        chsVar2.a("StartFromCacheHelper", "processTransferInitializing", sb.toString(), new Object[0]);
        if (bohVar == null) {
            chs chsVar3 = this.m;
            chsVar3.getClass();
            chsVar3.a("StartFromCacheHelper", "processTransferInitializing", "cant find startMediaLoadInfo by  ".concat(mlr.L(15, G)), new Object[0]);
            this.j.put(G, new xbr(nb7Var, z));
            return;
        }
        if (this.b == null && bohVar.a == 1) {
            this.b = Boolean.TRUE;
            chs chsVar4 = this.m;
            chsVar4.getClass();
            chsVar4.a("StartFromCacheHelper", "processTransferInitializing", "manifest from cache ".concat(mlr.L(15, G)), new Object[0]);
        }
        if (z) {
            if (this.b == null && bohVar.a == 4) {
                this.b = Boolean.FALSE;
                chs chsVar5 = this.m;
                chsVar5.getClass();
                chsVar5.a("StartFromCacheHelper", "processTransferInitializing", "manifest from network ".concat(mlr.L(15, G)), new Object[0]);
            }
            if (bohVar.a == 1) {
                int i = bohVar.b;
                if (i == 2 || i == 1 || i == 0) {
                    float f = (nb7Var.f * 1.0f) / (nb7Var.g + r5);
                    float f2 = ((bohVar.g - r5) * f) + bohVar.f;
                    if (i != 1) {
                        l = this.d;
                        if (i != 2) {
                            Long l2 = this.e;
                            if (l == null || (l2 != null && l.longValue() >= l2.longValue())) {
                                l = l2;
                            }
                        }
                    } else {
                        l = this.e;
                    }
                    if (f2 < (l != null ? l.longValue() : Long.MAX_VALUE)) {
                        int i2 = bohVar.b;
                        long j = (long) f2;
                        if (i2 == 1) {
                            this.e = Long.valueOf(j);
                        } else if (i2 != 2) {
                            this.d = Long.valueOf(j);
                            this.e = Long.valueOf(j);
                        } else {
                            this.d = Long.valueOf(j);
                        }
                        chs chsVar6 = this.m;
                        chsVar6.getClass();
                        chsVar6.a("StartFromCacheHelper", "processTransferInitializing", "minMediaFromNetworkStartPositionMs for %s updated to %s %s", q0(bohVar.b), Float.valueOf(f2), mlr.L(15, G));
                    } else {
                        chs chsVar7 = this.m;
                        chsVar7.getClass();
                        chsVar7.a("StartFromCacheHelper", "processTransferInitializing", "fromNetworkStartPositionMs for %s is %s %s", q0(bohVar.b), Float.valueOf(f2), mlr.L(15, G));
                    }
                    if (this.e == null || this.d == null) {
                        return;
                    }
                    yjj yjjVar = this.a;
                    synchronized (yjjVar.a) {
                        u0 = CollectionsKt.u0(yjjVar.a);
                    }
                    Iterator it = u0.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            r7o r7oVar = z7o.b;
                            ((zbl) next).L(N());
                            t7oVar = Unit.a;
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th);
                        }
                        Throwable a = z7o.a(t7oVar);
                        if (a != null) {
                            Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.t6t
    public final void h(db7 db7Var, nb7 nb7Var, boolean z) {
        db7Var.getClass();
        nb7Var.getClass();
        this.l.post(new wbr(this, nb7Var, z, 1));
    }

    @Override // defpackage.d80
    public final void m(c80 c80Var, cfg cfgVar, boh bohVar) {
        if (this.b != null && this.d != null && this.e != null) {
            b();
            return;
        }
        nb7 nb7Var = cfgVar.a;
        nb7Var.getClass();
        String G = G(nb7Var, true);
        chs chsVar = this.m;
        chsVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(S(bohVar));
        sb.append(' ');
        sb.append(G != null ? mlr.L(15, G) : null);
        chsVar.a("StartFromCacheHelper", "onLoadStarted", sb.toString(), new Object[0]);
        this.i.put(String.valueOf(G), bohVar);
        xbr xbrVar = (xbr) this.j.get(G);
        if (xbrVar != null) {
            chsVar.getClass();
            chsVar.a("StartFromCacheHelper", "onLoadStarted", "process pending transfer initializing", new Object[0]);
            g0(xbrVar.b, xbrVar.a);
        }
        xbr xbrVar2 = (xbr) this.k.get(G);
        if (xbrVar2 != null) {
            chsVar.getClass();
            chsVar.a("StartFromCacheHelper", "onLoadStarted", "process pending transfer end", new Object[0]);
            f0(xbrVar2.b, xbrVar2.a);
        }
    }

    @Override // defpackage.d80
    public final void n(c80 c80Var) {
        this.l.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.t6t
    public final void z(db7 db7Var, nb7 nb7Var, boolean z) {
        nb7Var.getClass();
        this.l.post(new wbr(this, nb7Var, z, 0));
    }
}
