package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class xa8 extends y2f {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ xa8(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.y2f
    public final boolean k() {
        switch (this.e) {
        }
        return false;
    }

    @Override // defpackage.y2f
    public final void l(Throwable th) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((qa8) obj).a();
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                Object obj2 = h3f.a.get(j());
                a3f a3fVar = (a3f) obj;
                if (!(obj2 instanceof sm5)) {
                    r7o r7oVar = z7o.b;
                    a3fVar.resumeWith(i3f.a(obj2));
                    break;
                } else {
                    r7o r7oVar2 = z7o.b;
                    a3fVar.resumeWith(qgg.J(((sm5) obj2).a));
                    break;
                }
        }
    }
}
