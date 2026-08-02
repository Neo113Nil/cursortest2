package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class agi implements upr {
    public final d7k a = new d7k();

    @Override // defpackage.upr
    public final void i(byte[] bArr, int i, int i2, tpr tprVar, ua6 ua6Var) {
        rv6 a;
        d7k d7kVar = this.a;
        d7kVar.F(i + i2, bArr);
        d7kVar.H(i);
        ArrayList arrayList = new ArrayList();
        while (d7kVar.a() > 0) {
            vq1.u("Incomplete Mp4Webvtt Top Level box header found.", d7kVar.a() >= 8);
            int h = d7kVar.h();
            if (d7kVar.h() == 1987343459) {
                int i3 = h - 8;
                CharSequence charSequence = null;
                qv6 qv6Var = null;
                while (i3 > 0) {
                    vq1.u("Incomplete vtt cue box header found.", i3 >= 8);
                    int h2 = d7kVar.h();
                    int h3 = d7kVar.h();
                    int i4 = h2 - 8;
                    byte[] bArr2 = d7kVar.a;
                    int i5 = d7kVar.b;
                    int i6 = dvt.a;
                    String str = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    d7kVar.I(i4);
                    i3 = (i3 - 8) - i4;
                    if (h3 == 1937011815) {
                        ygv ygvVar = new ygv();
                        zgv.e(str, ygvVar);
                        qv6Var = ygvVar.a();
                    } else if (h3 == 1885436268) {
                        charSequence = zgv.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (qv6Var != null) {
                    qv6Var.a = charSequence;
                    a = qv6Var.a();
                } else {
                    Pattern pattern = zgv.a;
                    ygv ygvVar2 = new ygv();
                    ygvVar2.c = charSequence;
                    a = ygvVar2.a().a();
                }
                arrayList.add(a);
            } else {
                d7kVar.I(h - 8);
            }
        }
        ua6Var.accept(new uv6(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.upr
    public final int y() {
        return 2;
    }
}
