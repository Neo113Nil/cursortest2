package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes10.dex */
public final class r0b0 implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lifecycle b;
    public final /* synthetic */ q c;

    public /* synthetic */ r0b0(Lifecycle lifecycle, q qVar, int i) {
        this.a = i;
        this.b = lifecycle;
        this.c = qVar;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.d(this.c);
                break;
            default:
                this.b.d(this.c);
                break;
        }
    }
}
