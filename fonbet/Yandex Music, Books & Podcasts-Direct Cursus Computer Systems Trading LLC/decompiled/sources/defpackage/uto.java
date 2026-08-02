package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class uto implements p3c {
    public final /* synthetic */ int a;
    public final szm b;
    public final szm c;
    public final p3c d;

    public /* synthetic */ uto(szm szmVar, szm szmVar2, p3c p3cVar, int i) {
        this.a = i;
        this.b = szmVar;
        this.c = szmVar2;
        this.d = p3cVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ime(2, (Context) this.b.get(), (bko) this.c.get(), (vd2) ((sob) this.d).get());
            default:
                return new t9t(new vpl(), new qcm(), (eq7) ((fq7) this.b).get(), (hgp) ((xot) this.c).get(), (bjt) ((e4w) this.d).get());
        }
    }
}
