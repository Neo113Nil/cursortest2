package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.List;

/* loaded from: classes.dex */
public final class gsf implements wtf {
    public final csf a;
    public final utf b;
    public final int c;
    public final /* synthetic */ utf d;
    public final /* synthetic */ tsf e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;

    public gsf(csf csfVar, utf utfVar, int i, tsf tsfVar, int i2, int i3, long j) {
        this.d = utfVar;
        this.e = tsfVar;
        this.f = i2;
        this.g = i3;
        this.h = j;
        this.a = csfVar;
        this.b = utfVar;
        this.c = i;
    }

    @Override // defpackage.wtf
    public final vtf a(int i, int i2, long j, int i3) {
        return b(i, j, i2, i3, this.c);
    }

    public final lsf b(int i, long j, int i2, int i3, int i4) {
        int j2;
        csf csfVar = this.a;
        Object e = csfVar.e(i);
        Object F = csfVar.b.F(i);
        List a = this.b.a(i, j);
        if (ga6.g(j)) {
            j2 = ga6.k(j);
        } else {
            if (!ga6.f(j)) {
                vme.a("does not have fixed height");
            }
            j2 = ga6.j(j);
        }
        int i5 = j2;
        xof layoutDirection = this.d.b.getLayoutDirection();
        b bVar = this.e.m;
        return new lsf(i, e, i5, i4, layoutDirection, this.f, this.g, a, this.h, F, bVar, j, i2, i3);
    }
}
