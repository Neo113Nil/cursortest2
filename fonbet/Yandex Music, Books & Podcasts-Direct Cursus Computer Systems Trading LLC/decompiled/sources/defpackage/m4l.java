package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.List;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class m4l {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public m4l() {
        bdt I = hag.I(e.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(b5d.class), true);
        this.c = l18Var.b(hag.I(w2h.class), true);
    }

    public static Object b(m4l m4lVar, List list, a6l a6lVar, xpt xptVar, aur aurVar, int i) {
        StationId stationId;
        xpt xptVar2 = (i & 8) != 0 ? null : xptVar;
        m4lVar.getClass();
        jyr jyrVar = m4lVar.c;
        StationId stationId2 = StationId.a;
        if (list == null || list.isEmpty() || (stationId = StationId.f((String) list.get(0))) == StationId.a) {
            stationId = null;
        }
        if (stationId == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("StationId can not be null"), null, 2, null);
            stationId = StationId.f("user:onyourwave");
            stationId.getClass();
        }
        if (stationId.g()) {
            return m4lVar.a(stationId, a6lVar, xptVar2, aurVar);
        }
        t0q s0qVar = xptVar2 != null ? new s0q() : new r0q(0);
        int i2 = xptVar2 != null ? xptVar2.h : 0;
        int i3 = i2 == 0 ? -1 : k4l.a[ouj.D(i2)];
        if (i3 != -1) {
            if (i3 == 1) {
                ((w2h) jyrVar.getValue()).a(true);
            } else if (i3 == 2) {
                ((w2h) jyrVar.getValue()).a(false);
            } else if (i3 != 3) {
                b6e.s();
                return null;
            }
        }
        qdc qdcVar = new qdc((e) null, new h(Page.RADIO), 1);
        chn chnVar = new chn();
        list.getClass();
        if (list.isEmpty()) {
            dfi.r("seed must be not empty", "EmptySeeds");
        }
        return y5g.Y(list, qdcVar, rsu.a, chnVar, a6lVar, null, null, s0qVar, true, 456);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StationId stationId, a6l a6lVar, xpt xptVar, cg6 cg6Var) {
        l4l l4lVar;
        int i;
        rj6 rj6Var;
        dgr dgrVar;
        StationId stationId2;
        String str;
        int i2;
        if (cg6Var instanceof l4l) {
            l4lVar = (l4l) cg6Var;
            int i3 = l4lVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l4lVar.o = i3 - Integer.MIN_VALUE;
                Object obj = l4lVar.m;
                nm6 nm6Var = nm6.a;
                i = l4lVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    b5d b5dVar = (b5d) this.b.getValue();
                    d5d N = ox6.N(stationId);
                    l4lVar.j = stationId;
                    l4lVar.k = a6lVar;
                    l4lVar.l = xptVar;
                    l4lVar.o = 1;
                    obj = b5dVar.b(N, n5n.HIGH, l4lVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xptVar = l4lVar.l;
                    a6lVar = l4lVar.k;
                    stationId = l4lVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    dgrVar = new dgr(stationId, ((e5d) ((qj6) rj6Var).a).c);
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    dgrVar = dgr.e;
                }
                e eVar = (e) this.a.getValue();
                h hVar = new h(Page.RADIO);
                dgrVar.getClass();
                eVar.getClass();
                stationId2 = dgrVar.a;
                if (stationId2.j()) {
                    str = dgrVar.d;
                } else if (stationId2.equals(StationId.f("user:onyourwave"))) {
                    str = "onyourwave";
                } else {
                    ru.yandex.music.utils.Assertions.fail("Unsupported station found. Backend said that this is impossible. stationId = " + stationId2);
                    str = "default";
                }
                c cVar = c.d;
                nyk d = oyk.d(dgrVar);
                String str2 = "radio_" + str.replaceAll("-", "_");
                ru.yandex.music.utils.Assertions.assertNonNull(hVar, "build(): scope is not set");
                ru.yandex.music.utils.Assertions.assertNonNull(d, "build(): info is not set");
                ru.yandex.music.utils.Assertions.assertNonNull(str2, "build(): card is not set");
                c cVar2 = new c(hVar, d, str2);
                int i4 = xptVar == null ? xptVar.h : 0;
                i2 = i4 != 0 ? -1 : k4l.a[ouj.D(i4)];
                if (i2 != -1) {
                    jyr jyrVar = this.c;
                    if (i2 == 1) {
                        ((w2h) jyrVar.getValue()).a(true);
                    } else if (i2 == 2) {
                        ((w2h) jyrVar.getValue()).a(false);
                    } else if (i2 != 3) {
                        b6e.s();
                        return null;
                    }
                }
                a6lVar.getClass();
                return new u4d(cVar2, dgrVar, a6lVar.a);
            }
        }
        l4lVar = new l4l(this, cg6Var);
        Object obj2 = l4lVar.m;
        nm6 nm6Var2 = nm6.a;
        i = l4lVar.o;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
        e eVar2 = (e) this.a.getValue();
        h hVar2 = new h(Page.RADIO);
        dgrVar.getClass();
        eVar2.getClass();
        stationId2 = dgrVar.a;
        if (stationId2.j()) {
        }
        c cVar3 = c.d;
        nyk d2 = oyk.d(dgrVar);
        String str22 = "radio_" + str.replaceAll("-", "_");
        ru.yandex.music.utils.Assertions.assertNonNull(hVar2, "build(): scope is not set");
        ru.yandex.music.utils.Assertions.assertNonNull(d2, "build(): info is not set");
        ru.yandex.music.utils.Assertions.assertNonNull(str22, "build(): card is not set");
        c cVar22 = new c(hVar2, d2, str22);
        if (xptVar == null) {
        }
        if (i4 != 0) {
        }
        if (i2 != -1) {
        }
        a6lVar.getClass();
        return new u4d(cVar22, dgrVar, a6lVar.a);
    }
}
