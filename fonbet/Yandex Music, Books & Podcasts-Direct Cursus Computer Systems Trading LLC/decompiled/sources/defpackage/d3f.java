package defpackage;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class d3f extends y2f {
    public final /* synthetic */ int e;
    public final acp f;
    public final /* synthetic */ h3f g;

    public /* synthetic */ d3f(h3f h3fVar, acp acpVar, int i) {
        this.e = i;
        this.g = h3fVar;
        this.f = acpVar;
    }

    @Override // defpackage.y2f
    public final boolean k() {
        switch (this.e) {
        }
        return false;
    }

    @Override // defpackage.y2f
    public final void l(Throwable th) {
        switch (this.e) {
            case 0:
                h3f h3fVar = this.g;
                h3fVar.getClass();
                Object obj = h3f.a.get(h3fVar);
                if (!(obj instanceof sm5)) {
                    obj = i3f.a(obj);
                }
                this.f.j(h3fVar, obj);
                break;
            default:
                this.f.j(this.g, Unit.a);
                break;
        }
    }
}
