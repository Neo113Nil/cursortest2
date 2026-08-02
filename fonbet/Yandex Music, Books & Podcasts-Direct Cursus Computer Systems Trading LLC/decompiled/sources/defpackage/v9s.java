package defpackage;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class v9s extends hag {
    public final /* synthetic */ ixf a;
    public final /* synthetic */ x9s b;

    public v9s(x9s x9sVar, ixf ixfVar) {
        this.b = x9sVar;
        this.a = ixfVar;
    }

    @Override // defpackage.hag
    public final void t(int i) {
        this.b.n = true;
        this.a.C(i);
    }

    @Override // defpackage.hag
    public final void u(Typeface typeface) {
        x9s x9sVar = this.b;
        Typeface create = Typeface.create(typeface, x9sVar.d);
        x9sVar.p = create;
        x9sVar.n = true;
        this.a.D(create, false);
    }
}
