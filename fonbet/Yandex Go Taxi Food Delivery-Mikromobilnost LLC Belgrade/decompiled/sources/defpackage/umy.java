package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lumy;", "Llwj0;", "Companion", "smy", "tmy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class umy extends lwj0 {
    public static final tmy Companion = new tmy();
    public static final i3y[] h = {a.b(LazyThreadSafetyMode.PUBLICATION, new wky(2)), null, null, null, null, null, null};
    public final LinkedOrderStatusDto a;
    public final fmy b;
    public final omy c;
    public final xmy d;
    public final ooy e;
    public final pi11 f;
    public final zn11 g;

    public /* synthetic */ umy(int i, LinkedOrderStatusDto linkedOrderStatusDto, fmy fmyVar, omy omyVar, xmy xmyVar, ooy ooyVar, pi11 pi11Var, zn11 zn11Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = linkedOrderStatusDto;
        }
        if ((i & 2) == 0) {
            this.b = new fmy(0);
        } else {
            this.b = fmyVar;
        }
        if ((i & 4) == 0) {
            this.c = new omy(0);
        } else {
            this.c = omyVar;
        }
        if ((i & 8) == 0) {
            this.d = new xmy(0);
        } else {
            this.d = xmyVar;
        }
        if ((i & 16) == 0) {
            this.e = new ooy(0);
        } else {
            this.e = ooyVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = pi11Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = zn11Var;
        }
    }

    @Override // defpackage.lwj0
    /* renamed from: e, reason: from getter */
    public final zn11 getG() {
        return this.g;
    }

    /* renamed from: g, reason: from getter */
    public final xmy getD() {
        return this.d;
    }

    /* renamed from: h, reason: from getter */
    public final fmy getB() {
        return this.b;
    }

    /* renamed from: i, reason: from getter */
    public final omy getC() {
        return this.c;
    }

    /* renamed from: j, reason: from getter */
    public final ooy getE() {
        return this.e;
    }

    /* renamed from: k, reason: from getter */
    public final LinkedOrderStatusDto getA() {
        return this.a;
    }

    /* renamed from: l, reason: from getter */
    public final pi11 getF() {
        return this.f;
    }

    public umy() {
        fmy fmyVar = new fmy(0);
        omy omyVar = new omy(0);
        xmy xmyVar = new xmy(0);
        ooy ooyVar = new ooy(0);
        this.a = null;
        this.b = fmyVar;
        this.c = omyVar;
        this.d = xmyVar;
        this.e = ooyVar;
        this.f = null;
        this.g = null;
    }
}
