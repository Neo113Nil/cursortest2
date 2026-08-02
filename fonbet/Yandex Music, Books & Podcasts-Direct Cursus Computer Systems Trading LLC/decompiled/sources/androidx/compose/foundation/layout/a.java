package androidx.compose.foundation.layout;

import defpackage.ga6;
import defpackage.hxe;
import defpackage.mp3;
import defpackage.o0k;
import defpackage.q0k;
import defpackage.u8b;
import defpackage.xof;
import defpackage.yci;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {
    public static q0k a(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return new q0k(f, f2, f, f2);
    }

    public static final q0k b(float f, float f2, float f3, float f4) {
        return new q0k(f, f2, f3, f4);
    }

    public static q0k c(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return new q0k(f, f2, f3, f4);
    }

    public static yci d(yci yciVar, float f) {
        return yciVar.f(new AspectRatioElement(f));
    }

    public static final float e(o0k o0kVar, xof xofVar) {
        return xofVar == xof.a ? o0kVar.c(xofVar) : o0kVar.b(xofVar);
    }

    public static final float f(o0k o0kVar, xof xofVar) {
        return xofVar == xof.a ? o0kVar.b(xofVar) : o0kVar.c(xofVar);
    }

    public static final yci g(yci yciVar, hxe hxeVar) {
        return yciVar.f(new IntrinsicHeightElement(hxeVar));
    }

    public static final boolean h(long j, int i, int i2) {
        int k = ga6.k(j);
        if (i > ga6.i(j) || k > i) {
            return false;
        }
        return i2 <= ga6.h(j) && ga6.j(j) <= i2;
    }

    public static final yci i(yci yciVar, Function1 function1) {
        return yciVar.f(new OffsetPxElement(function1, new mp3(8, function1)));
    }

    public static final yci j(yci yciVar, float f, float f2) {
        return yciVar.f(new OffsetElement(f, f2, new u8b(1, 13)));
    }

    public static yci k(yci yciVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return j(yciVar, f, f2);
    }

    public static final yci l(yci yciVar, o0k o0kVar) {
        return yciVar.f(new PaddingValuesElement(o0kVar, new u8b(1, 17)));
    }

    public static final yci m(yci yciVar, float f) {
        return yciVar.f(new PaddingElement(f, f, f, f, new u8b(1, 16)));
    }

    public static final yci n(yci yciVar, float f, float f2) {
        return yciVar.f(new PaddingElement(f, f2, f, f2, new u8b(1, 15)));
    }

    public static yci o(yci yciVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return n(yciVar, f, f2);
    }

    public static final yci p(yci yciVar, float f, float f2, float f3, float f4) {
        return yciVar.f(new PaddingElement(f, f2, f3, f4, new u8b(1, 14)));
    }

    public static yci q(yci yciVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return p(yciVar, f, f2, f3, f4);
    }

    public static final yci r(yci yciVar, hxe hxeVar) {
        return yciVar.f(new IntrinsicWidthElement(hxeVar));
    }
}
