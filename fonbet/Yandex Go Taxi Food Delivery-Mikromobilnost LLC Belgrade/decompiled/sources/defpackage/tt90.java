package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ltt90;", "Lxn11;", "Lc6z;", "Companion", "st90", "rt90", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class tt90 implements xn11, c6z {
    public static final st90 Companion = new st90();
    public static final i3y[] m;
    public static final tt90 n;
    public final boolean b;
    public final Map c;
    public final tkz0 d;
    public final lai e;
    public final xja0 f;
    public final hx40 g;
    public final wkf0 h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new i3y[]{null, a.b(lazyThreadSafetyMode, new ks90(3)), null, null, null, null, null, a.b(lazyThreadSafetyMode, new ks90(4)), a.b(lazyThreadSafetyMode, new ks90(5)), a.b(lazyThreadSafetyMode, new ks90(6)), a.b(lazyThreadSafetyMode, new ks90(7))};
        n = new tt90(0);
    }

    public /* synthetic */ tt90(int i, boolean z, Map map, tkz0 tkz0Var, lai laiVar, xja0 xja0Var, hx40 hx40Var, wkf0 wkf0Var, List list, List list2, List list3, List list4) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = new tkz0(0);
        } else {
            this.d = tkz0Var;
        }
        if ((i & 8) == 0) {
            this.e = new lai(0);
        } else {
            this.e = laiVar;
        }
        if ((i & 16) == 0) {
            this.f = new xja0(0);
        } else {
            this.f = xja0Var;
        }
        if ((i & 32) == 0) {
            this.g = new hx40(0);
        } else {
            this.g = hx40Var;
        }
        if ((i & 64) == 0) {
            this.h = new wkf0(0);
        } else {
            this.h = wkf0Var;
        }
        int i2 = i & 128;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.i = emptyList;
        } else {
            this.i = list;
        }
        if ((i & 256) == 0) {
            this.j = emptyList;
        } else {
            this.j = list2;
        }
        if ((i & 512) == 0) {
            this.k = emptyList;
        } else {
            this.k = list3;
        }
        if ((i & 1024) == 0) {
            this.l = emptyList;
        } else {
            this.l = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt90)) {
            return false;
        }
        tt90 tt90Var = (tt90) obj;
        return this.b == tt90Var.b && jl40.l(this.c, tt90Var.c) && jl40.l(this.d, tt90Var.d) && jl40.l(this.e, tt90Var.e) && jl40.l(this.f, tt90Var.f) && jl40.l(this.g, tt90Var.g) && jl40.l(this.h, tt90Var.h) && jl40.l(this.i, tt90Var.i) && jl40.l(this.j, tt90Var.j) && jl40.l(this.k, tt90Var.k) && jl40.l(this.l, tt90Var.l);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return this.l.hashCode() + unr0.c(unr0.c(unr0.c((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder l = nnm.l("PayOnDeliveryExperiment(enabled=", ", l10n=", ", toggle=", this.c, this.b);
        l.append(this.d);
        l.append(", deliveryForm=");
        l.append(this.e);
        l.append(", paymentSelectorScreen=");
        l.append(this.f);
        l.append(", multipointsAlert=");
        l.append(this.g);
        l.append(", prohibitedPaymentMethodAlert=");
        l.append(this.h);
        l.append(", prohibitedAlternatives=");
        l.append(this.i);
        l.append(", tariffClasses=");
        nnm.w(l, this.j, ", prohibitedPaymentMethods=", this.k, ", allowedCorpTypes=");
        return ly3.s(l, this.l, Extension.C_BRAKE);
    }

    public tt90() {
        this(0);
    }

    public tt90(int i) {
        Map f = b.f();
        tkz0 tkz0Var = new tkz0(0);
        lai laiVar = new lai(0);
        xja0 xja0Var = new xja0(0);
        hx40 hx40Var = new hx40(0);
        wkf0 wkf0Var = new wkf0(0);
        this.b = false;
        this.c = f;
        this.d = tkz0Var;
        this.e = laiVar;
        this.f = xja0Var;
        this.g = hx40Var;
        this.h = wkf0Var;
        EmptyList emptyList = EmptyList.a;
        this.i = emptyList;
        this.j = emptyList;
        this.k = emptyList;
        this.l = emptyList;
    }
}
