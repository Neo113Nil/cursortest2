package defpackage;

import android.view.View;
import com.lightside.slab.SlotView;

/* loaded from: classes3.dex */
public final class trq {
    public View a;
    public bxq b;
    public orq c;
    public sfm d;

    public trq(SlotView slotView) {
        this.a = slotView;
        this.b = slotView;
        w40 w40Var = new w40(3, this, trq.class, "onInsert", "onInsert(Lcom/lightside/slab/Slab;Landroid/view/View;Lcom/lightside/slab/Slot;)V", 0, 9);
        if (slotView.a) {
            xq0.q("Check failed.");
        } else {
            slotView.b = w40Var;
        }
    }

    public final void a(orq orqVar) {
        orqVar.getClass();
        if (orqVar == this.c) {
            return;
        }
        sfm sfmVar = this.d;
        if (sfmVar != null) {
            sfmVar.o();
        }
        this.d = null;
        bxq bxqVar = this.b;
        if (!(bxqVar instanceof SlotView) || ((SlotView) bxqVar).getParent() != null) {
            this.b.a(orqVar).b(new w40(3, this, trq.class, "onInsert", "onInsert(Lcom/lightside/slab/Slab;Landroid/view/View;Lcom/lightside/slab/Slot;)V", 0, 9));
            return;
        }
        bxq bxqVar2 = this.b;
        bxqVar2.getClass();
        SlotView slotView = (SlotView) bxqVar2;
        xum xumVar = new xum(23, this, orqVar);
        slotView.getClass();
        sfm sfmVar2 = new sfm();
        sfmVar2.b = slotView;
        sfmVar2.c = xumVar;
        sfmVar2.o();
        wrq wrqVar = new wrq(sfmVar2, slotView);
        View view = wrqVar.i;
        view.addOnAttachStateChangeListener(wrqVar);
        if (view.isAttachedToWindow()) {
            wrqVar.onViewAttachedToWindow(view);
        }
        sfmVar2.a = wrqVar;
        this.d = sfmVar2;
    }
}
