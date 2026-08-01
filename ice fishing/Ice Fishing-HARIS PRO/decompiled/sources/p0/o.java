package p0;

import java.util.ArrayList;
import r.C0338f;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0338f f4203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f4204b;

    public o(p pVar, C0338f c0338f) {
        this.f4204b = pVar;
        this.f4203a = c0338f;
    }

    @Override // p0.k
    public final void c(m mVar) {
        ((ArrayList) this.f4203a.get(this.f4204b.f4206b)).remove(mVar);
        mVar.x(this);
    }
}
