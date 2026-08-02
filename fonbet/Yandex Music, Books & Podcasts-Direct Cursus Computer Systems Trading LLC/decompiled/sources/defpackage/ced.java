package defpackage;

import com.yandex.music.shared.glagol.api.domain.GlagolTargetException;
import java.io.Closeable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.queue.GlagolRemoteQueueStartException;
import ru.yandex.music.glagol.data.b;
import ru.yandex.quasar.glagol.State;
import ru.yandex.quasar.glagol.a;

/* loaded from: classes5.dex */
public final class ced implements Closeable {
    public final mdg a;
    public final v68 b;
    public final String c;
    public final int d;
    public final String e;
    public final List f;
    public final vgd g;
    public final bdd h;
    public final yiq i;
    public final mm6 j;
    public final jyr k;
    public final rar l;
    public boolean m;
    public volatile boolean n;
    public volatile State o;
    public volatile String p;
    public final jyr q;
    public final b r;
    public final x0q s;
    public final xdr t;
    public final xdr u;
    public final xdr v;
    public final chd w;

    public ced(mdg mdgVar, v68 v68Var, String str, int i, String str2, List list, vgd vgdVar, bdd bddVar) {
        str.getClass();
        bddVar.getClass();
        this.a = mdgVar;
        this.b = v68Var;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = list;
        this.g = vgdVar;
        this.h = bddVar;
        yiq yiqVar = new yiq();
        this.i = yiqVar;
        mm6 r = hld.r(yiqVar, dm6.b);
        this.j = r;
        l18 l18Var = l18.b;
        this.k = l18Var.b(hag.I(zzp.class), true);
        Continuation continuation = null;
        this.l = x97.y(r, null, pm6.b, new dt0(2, 5, continuation), 1);
        this.q = l18Var.b(hag.I(y76.class), true);
        this.r = new b(yiqVar.z());
        this.s = y0q.b(0, 1, null, 5);
        this.t = ydr.a(null);
        this.u = ydr.a(vhd.h);
        xdr a = ydr.a(zgd.b);
        this.v = a;
        this.w = new chd(yiqVar.z(), a, new fzb(this, continuation, 20));
        tzh tzhVar = new tzh() { // from class: rdd
            @Override // defpackage.tzh
            public final void onMessage(dzh dzhVar) {
                State state = dzhVar.getState();
                ced cedVar = ced.this;
                x97.y(cedVar.j, null, null, new fzb(state, cedVar, (Continuation) null, 19), 3);
                cedVar.s.a(Unit.a);
            }
        };
        this.n = vgdVar != null;
        mdgVar.addListener(tzhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(cg6 cg6Var) {
        aed aedVar;
        int i;
        wdd wddVar;
        String str;
        State state;
        if (cg6Var instanceof aed) {
            aedVar = (aed) cg6Var;
            int i2 = aedVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aedVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aedVar.j;
                Object obj2 = nm6.a;
                i = aedVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.m) {
                        return Unit.a;
                    }
                    this.m = true;
                    vgd vgdVar = this.g;
                    if (vgdVar != null) {
                        aedVar.l = 1;
                        obj = g(vgdVar, aedVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                wddVar = (wdd) obj;
                if (!(wddVar instanceof udd)) {
                    state = ((udd) wddVar).b.getState();
                } else if (wddVar instanceof tdd) {
                    state = this.o;
                } else {
                    if (!(wddVar instanceof vdd)) {
                        if (!(wddVar instanceof sdd)) {
                            b6e.s();
                            return null;
                        }
                        a(new dhd(2, false));
                        int i3 = GlagolRemoteQueueStartException.c;
                        vgd vgdVar2 = this.g;
                        shd shdVar = ((sdd) wddVar).b;
                        vid vidVar = vid.b;
                        if (vgdVar2 == null || (str = vgdVar2.toString()) == null) {
                            str = "empty queue";
                        }
                        throw new GlagolRemoteQueueStartException(vidVar, str, shdVar);
                    }
                    state = this.o;
                }
                this.n = false;
                x97.y(this.j, null, null, new fzb(state, this, continuation, 19), 3);
                return Unit.a;
            }
        }
        aedVar = new aed(this, cg6Var);
        Object obj3 = aedVar.j;
        Object obj22 = nm6.a;
        i = aedVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        wddVar = (wdd) obj3;
        if (!(wddVar instanceof udd)) {
        }
        this.n = false;
        x97.y(this.j, null, null, new fzb(state, this, continuation2, 19), 3);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(gj6 gj6Var, String str, mdk mdkVar, Continuation continuation) {
        bed bedVar;
        int i;
        wis wisVar;
        if (continuation instanceof bed) {
            bedVar = (bed) continuation;
            int i2 = bedVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bedVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bedVar.k;
                nm6 nm6Var = nm6.a;
                i = bedVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        try {
                            d57 d57Var = new d57(this, gj6Var, str, mdkVar, (Continuation) null, 14);
                            bedVar.j = str;
                            bedVar.m = 1;
                            obj = tyf.J(5000L, d57Var, bedVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            str = str;
                        } catch (wis e) {
                            wisVar = e;
                            str = str;
                            ssg.a(4, "GlagolCastConnection", hrg.r("command ", str, " <-- timeout: ", wisVar.getMessage()), null);
                            return new vdd(false);
                        }
                    } catch (wis e2) {
                        e = e2;
                        wisVar = e;
                        ssg.a(4, "GlagolCastConnection", hrg.r("command ", str, " <-- timeout: ", wisVar.getMessage()), null);
                        return new vdd(false);
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = bedVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (wis e3) {
                        e = e3;
                        wisVar = e;
                        ssg.a(4, "GlagolCastConnection", hrg.r("command ", str, " <-- timeout: ", wisVar.getMessage()), null);
                        return new vdd(false);
                    }
                }
                return (wdd) obj;
            }
        }
        bedVar = new bed(this, continuation);
        Object obj2 = bedVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bedVar.m;
        if (i != 0) {
        }
        return (wdd) obj2;
    }

    public final void a(dhd dhdVar) {
        if (this.i.b) {
            v3w.l("close connection to ", this.b.getDeviceId(), 4, "GlagolCastConnection", null);
            this.i.V();
            j66.O(this.a);
            this.h.a(this, dhdVar);
        }
    }

    public final y76 b() {
        return (y76) this.q.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(new dhd(3, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0070, code lost:
    
        if (r2 == r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0087, code lost:
    
        if (r2 == r4) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r0v7, types: [aur, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(vgd vgdVar, cg6 cg6Var) {
        zdd zddVar;
        int i;
        lfd lfdVar;
        String str;
        Object H;
        try {
            if (cg6Var instanceof zdd) {
                zddVar = (zdd) cg6Var;
                int i2 = zddVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zddVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = zddVar.j;
                    Object obj2 = nm6.a;
                    i = zddVar.l;
                    int i3 = 2;
                    Object[] objArr = 0;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (Intrinsics.d(vgdVar, rgd.a)) {
                            boolean z = ((vhd) this.u.getValue()).c;
                            if (z) {
                                return tdd.b;
                            }
                            if (z) {
                                b6e.s();
                                return null;
                            }
                            zddVar.l = 1;
                            obj = z(zddVar);
                        } else if (vgdVar instanceof pgd) {
                            zddVar.l = 2;
                            obj = ((pgd) vgdVar).a(zddVar);
                        } else {
                            if (vgdVar instanceof tgd) {
                                lfdVar = ((tgd) vgdVar).d;
                            } else if (vgdVar instanceof ugd) {
                                zddVar.l = 3;
                                obj = ((ugd) vgdVar).a.invoke(new z21(i3, 26, objArr == true ? 1 : 0), zddVar);
                                if (obj == obj2) {
                                }
                                lfdVar = (lfd) obj;
                            } else {
                                if (!(vgdVar instanceof sgd)) {
                                    if (vgdVar instanceof qgd) {
                                        return new sdd(new shd("Illegal target", ((qgd) vgdVar).a));
                                    }
                                    b6e.s();
                                    return null;
                                }
                                lfdVar = ((sgd) vgdVar).a;
                            }
                            zddVar.l = 4;
                            String str2 = "launch " + lfdVar;
                            a payloadFactory = b().getPayloadFactory();
                            str = lfdVar.g;
                            if (str == null) {
                            }
                            if (H != obj2) {
                            }
                        }
                    } else {
                        if (i == 1) {
                            qgg.h0(obj);
                            return (wdd) obj;
                        }
                        if (i == 2) {
                            qgg.h0(obj);
                            lfdVar = (lfd) obj;
                            zddVar.l = 4;
                            String str22 = "launch " + lfdVar;
                            a payloadFactory2 = b().getPayloadFactory();
                            str = lfdVar.g;
                            if (str == null) {
                            }
                            if (H != obj2) {
                            }
                        } else {
                            if (i != 3) {
                                if (i == 4) {
                                    qgg.h0(obj);
                                    return obj;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            lfdVar = (lfd) obj;
                            zddVar.l = 4;
                            String str222 = "launch " + lfdVar;
                            a payloadFactory22 = b().getPayloadFactory();
                            str = lfdVar.g;
                            if (str == null) {
                                H = z(zddVar);
                            } else {
                                String str3 = lfdVar.c;
                                Double d = lfdVar.e;
                                double doubleValue = d != null ? d.doubleValue() : 0.0d;
                                ygd ygdVar = lfdVar.d;
                                mdk playMusicPayload = payloadFactory22.getPlayMusicPayload(str, str3, doubleValue, ygdVar != null ? ygdVar.a : null, ygdVar != null ? ygdVar.c : null, lfdVar.f);
                                playMusicPayload.getClass();
                                H = H(this.a, str222, playMusicPayload, zddVar);
                            }
                            if (H != obj2) {
                                return H;
                            }
                        }
                    }
                    return obj2;
                }
            }
            if (i != 0) {
            }
            return obj2;
        } catch (GlagolTargetException e) {
            return new sdd(new shd("Can't construct track list", e));
        }
        zddVar = new zdd(this, cg6Var);
        Object obj3 = zddVar.j;
        Object obj22 = nm6.a;
        i = zddVar.l;
        int i32 = 2;
        Object[] objArr2 = 0;
    }

    public final Object o(aur aurVar) {
        mdk nextPayload = b().getPayloadFactory().getNextPayload(!((vhd) this.u.getValue()).c);
        nextPayload.getClass();
        return H(this.a, "next", nextPayload, aurVar);
    }

    public final Object z(cg6 cg6Var) {
        mdk playPayload = b().getPayloadFactory().getPlayPayload();
        playPayload.getClass();
        return H(this.a, "play", playPayload, cg6Var);
    }
}
