package defpackage;

import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;

/* loaded from: classes.dex */
public final class zrv {
    public final IndicatorParams$Animation a;
    public final sb2 b;
    public final sb2 c;
    public final sb2 d;
    public final urv e;

    public zrv(IndicatorParams$Animation indicatorParams$Animation, sb2 sb2Var, sb2 sb2Var2, sb2 sb2Var3, urv urvVar) {
        this.a = indicatorParams$Animation;
        this.b = sb2Var;
        this.c = sb2Var2;
        this.d = sb2Var3;
        this.e = urvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrv)) {
            return false;
        }
        zrv zrvVar = (zrv) obj;
        return this.a == zrvVar.a && this.b.equals(zrvVar.b) && this.c.equals(zrvVar.c) && this.d.equals(zrvVar.d) && this.e.equals(zrvVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Style(animation=" + this.a + ", activeShape=" + this.b + ", inactiveShape=" + this.c + ", minimumShape=" + this.d + ", itemsPlacement=" + this.e + ')';
    }
}
