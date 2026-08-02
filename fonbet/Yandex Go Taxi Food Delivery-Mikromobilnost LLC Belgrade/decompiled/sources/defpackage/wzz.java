package defpackage;

import com.yandex.xplat.common.c;

/* loaded from: classes2.dex */
public class wzz extends of8 {
    @Override // defpackage.of8
    public final up8 b(nf8 nf8Var) {
        String str = ((pk8) nf8Var).a;
        int i = 0;
        b6w m = y6i0.m(y6i0.n(0, str.length()), 1);
        int i2 = m.a;
        int i3 = m.b;
        int i4 = m.c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (true) {
                Integer l = bvu0.l(10, c.f(i2, 1, str));
                if (l != null) {
                    int intValue = l.intValue();
                    if ((str.length() - i2) % 2 == 0 && (intValue = intValue * 2) > 9) {
                        intValue -= 9;
                    }
                    i += intValue;
                    if (i2 == i3) {
                        break;
                    }
                    i2 += i4;
                } else {
                    break;
                }
            }
            return up8.b;
        }
        if (i % 10 == 0) {
            return null;
        }
        return up8.b;
    }
}
