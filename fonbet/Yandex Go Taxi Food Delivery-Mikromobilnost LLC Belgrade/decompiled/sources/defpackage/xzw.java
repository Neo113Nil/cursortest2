package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.bricks.BrickSlotView;
import com.yandex.bricks.c;
import com.yandex.dsl.views.a;
import com.yandex.messaging.isolated.IsolatedFragmentUi$special$$inlined$brickSlot$default$1;
import com.yandex.messaging.isolated.IsolatedFragmentUi$special$$inlined$brickSlot$default$2;
import com.yandex.messaging.isolated.IsolatedRootLayoutBuilder;

/* loaded from: classes15.dex */
public final class xzw extends a {
    public final c c;
    public final c w;

    /* JADX WARN: Multi-variable type inference failed */
    public xzw(Context context) {
        super(context);
        View view = (View) IsolatedFragmentUi$special$$inlined$brickSlot$default$1.b.invoke(jh91.e(0, context), 0, 0);
        boolean z = this instanceof kzx;
        if (z) {
            ((kzx) this).addToParent(view);
        }
        this.c = new c((BrickSlotView) view);
        int i = e9h0.auth_brick_slot;
        View view2 = (View) IsolatedFragmentUi$special$$inlined$brickSlot$default$2.b.invoke(jh91.e(0, context), 0, 0);
        if (i != -1) {
            view2.setId(i);
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
        IsolatedRootLayoutBuilder isolatedRootLayoutBuilder = new IsolatedRootLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
        if (jp31Var instanceof kzx) {
            ((kzx) jp31Var).addToParent(isolatedRootLayoutBuilder);
        }
        final View view = this.c.a;
        View view2 = (View) new zls() { // from class: com.yandex.messaging.isolated.IsolatedFragmentUi$layout$lambda$5$$inlined$include$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return view;
            }
        }.invoke(jh91.e(0, isolatedRootLayoutBuilder.getCtx()), 0, 0);
        isolatedRootLayoutBuilder.addToParent(view2);
        ViewGroup.LayoutParams generateLayoutParams = isolatedRootLayoutBuilder.generateLayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
        layoutParams.width = -1;
        layoutParams.height = -1;
        view2.setLayoutParams(generateLayoutParams);
        isolatedRootLayoutBuilder.invoke(this.w.a, new ptw(1, isolatedRootLayoutBuilder));
        return isolatedRootLayoutBuilder;
    }
}
