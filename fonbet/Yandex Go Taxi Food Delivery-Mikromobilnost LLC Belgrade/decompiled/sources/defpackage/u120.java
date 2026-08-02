package defpackage;

import android.app.Activity;
import android.view.View;
import com.yandex.bricks.BrickSlotView;
import com.yandex.bricks.c;
import com.yandex.dsl.views.a;
import com.yandex.dsl.views.layouts.FrameLayoutBuilder;
import com.yandex.messaging.navigation.MessengerFragmentUi$special$$inlined$brickSlot$default$1;
import com.yandex.messaging.navigation.MessengerFragmentUi$special$$inlined$brickSlot$default$2;

/* loaded from: classes15.dex */
public final class u120 extends a {
    public final c c;
    public final c w;

    /* JADX WARN: Multi-variable type inference failed */
    public u120(Activity activity, int i) {
        super(activity);
        View view = (View) MessengerFragmentUi$special$$inlined$brickSlot$default$1.b.invoke(jh91.e(0, activity), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        boolean z = this instanceof kzx;
        if (z) {
            ((kzx) this).addToParent(view);
        }
        this.c = new c((BrickSlotView) view);
        int i2 = e9h0.auth_brick_slot;
        View view2 = (View) MessengerFragmentUi$special$$inlined$brickSlot$default$2.b.invoke(jh91.e(0, activity), 0, 0);
        if (i2 != -1) {
            view2.setId(i2);
        }
        if (z) {
            ((kzx) this).addToParent(view2);
        }
        BrickSlotView brickSlotView = (BrickSlotView) view2;
        c cVar = new c(brickSlotView);
        brickSlotView.setVisibility(8);
        this.w = cVar;
    }

    @Override // com.yandex.dsl.views.a
    public final View a(jp31 jp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
        if (jp31Var instanceof kzx) {
            ((kzx) jp31Var).addToParent(frameLayoutBuilder);
        }
        frameLayoutBuilder.invoke(this.c.a, new myv(frameLayoutBuilder, 1));
        frameLayoutBuilder.invoke(this.w.a, new myv(frameLayoutBuilder, 2));
        return frameLayoutBuilder;
    }
}
