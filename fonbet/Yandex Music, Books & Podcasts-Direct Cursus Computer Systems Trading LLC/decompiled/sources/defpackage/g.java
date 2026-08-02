package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class g implements yn7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                r7o r7oVar = z7o.b;
                ((zt3) obj).resumeWith(Unit.a);
                break;
            default:
                dzfVar.getClass();
                ((qju) obj).d = true;
                break;
        }
    }
}
