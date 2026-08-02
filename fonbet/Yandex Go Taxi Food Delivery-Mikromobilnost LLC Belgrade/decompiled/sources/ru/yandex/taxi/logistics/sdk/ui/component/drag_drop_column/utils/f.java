package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.c6p0;
import defpackage.g8e;
import defpackage.nnm;
import defpackage.sls;
import defpackage.tls;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f {
    public static final f e = new f(Scroller$Direction.FORWARD, 0.0f, new c6p0(21), new Scroller$ScrollInfo$Companion$Null$2(1, null));
    public final Scroller$Direction a;
    public final float b;
    public final sls c;
    public final tls d;

    public f(Scroller$Direction scroller$Direction, float f, sls slsVar, tls tlsVar) {
        this.a = scroller$Direction;
        this.b = f;
        this.c = slsVar;
        this.d = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && Float.compare(this.b, fVar.b) == 0 && this.c.equals(fVar.c) && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nnm.a(g8e.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.a + ", speedMultiplier=" + this.b + ", maxScrollDistanceProvider=" + this.c + ", onScroll=" + this.d + Extension.C_BRAKE;
    }
}
