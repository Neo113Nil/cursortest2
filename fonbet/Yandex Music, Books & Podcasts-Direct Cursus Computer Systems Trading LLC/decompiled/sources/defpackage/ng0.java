package defpackage;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import defpackage.ng0;
import defpackage.xci;

/* loaded from: classes.dex */
public final class ng0 implements View.OnDragListener, jma {
    public final mma a;
    public final cz0 b;
    public final AndroidDragAndDropManager$modifier$1 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public ng0() {
        mma mmaVar = new mma();
        mmaVar.q = 0L;
        this.a = mmaVar;
        this.b = new cz0(0);
        this.c = new edi() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            @Override // defpackage.edi
            public final xci e() {
                return ng0.this.a;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return ng0.this.a.hashCode();
            }

            @Override // defpackage.edi
            public final /* bridge */ /* synthetic */ void j(xci xciVar) {
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        efo efoVar = new efo(26, dragEvent);
        int action = dragEvent.getAction();
        cz0 cz0Var = this.b;
        mma mmaVar = this.a;
        switch (action) {
            case 1:
                tqn tqnVar = new tqn();
                ln4 ln4Var = new ln4(efoVar, mmaVar, tqnVar);
                if (ln4Var.invoke(mmaVar) == v9t.a) {
                    q7g.V(mmaVar, ln4Var);
                }
                boolean z = tqnVar.a;
                cz0Var.getClass();
                ty0 ty0Var = new ty0(cz0Var);
                while (ty0Var.hasNext()) {
                    ((mma) ty0Var.next()).W0();
                }
                break;
            case 2:
                mmaVar.V0(efoVar);
                break;
            case 4:
                kma kmaVar = new kma(0, efoVar);
                if (kmaVar.invoke(mmaVar) == v9t.a) {
                    q7g.V(mmaVar, kmaVar);
                }
                cz0Var.clear();
                break;
            case 5:
                mmaVar.T0();
                break;
            case 6:
                mmaVar.U0();
                break;
        }
        return false;
    }
}
