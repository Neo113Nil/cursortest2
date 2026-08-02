package defpackage;

import defpackage.nw41;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class zb30 implements q2v0 {
    public final ef90 a = new ef90();

    @Override // defpackage.q2v0
    public final void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar) {
        odf a;
        ef90 ef90Var = this.a;
        ef90Var.I(i2 + i, bArr);
        ef90Var.K(i);
        ArrayList arrayList = new ArrayList();
        while (ef90Var.a() > 0) {
            d6z.k("Incomplete Mp4Webvtt Top Level box header found.", ef90Var.a() >= 8);
            int k = ef90Var.k();
            if (ef90Var.k() == 1987343459) {
                int i3 = k - 8;
                CharSequence charSequence = null;
                ndf ndfVar = null;
                while (i3 > 0) {
                    d6z.k("Incomplete vtt cue box header found.", i3 >= 8);
                    int k2 = ef90Var.k();
                    int k3 = ef90Var.k();
                    int i4 = k2 - 8;
                    byte[] bArr2 = ef90Var.a;
                    int i5 = ef90Var.b;
                    int i6 = tw21.a;
                    String str = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    ef90Var.L(i4);
                    i3 = (i3 - 8) - i4;
                    if (k3 == 1937011815) {
                        Pattern pattern = nw41.a;
                        nw41.a aVar = new nw41.a();
                        nw41.e(str, aVar);
                        ndfVar = aVar.a();
                    } else if (k3 == 1885436268) {
                        charSequence = nw41.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (ndfVar != null) {
                    ndfVar.a = charSequence;
                    a = ndfVar.a();
                } else {
                    Pattern pattern2 = nw41.a;
                    nw41.a aVar2 = new nw41.a();
                    aVar2.c = charSequence;
                    a = aVar2.a().a();
                }
                arrayList.add(a);
            } else {
                ef90Var.L(k - 8);
            }
        }
        c9eVar.accept(new tdf(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.q2v0
    public final int f() {
        return 2;
    }
}
