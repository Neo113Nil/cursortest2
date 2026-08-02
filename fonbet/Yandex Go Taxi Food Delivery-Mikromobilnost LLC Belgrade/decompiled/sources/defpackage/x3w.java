package defpackage;

import com.yandex.go.order.state.instructions.InstructionItemButton;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction;

/* loaded from: classes14.dex */
public interface x3w {
    /* renamed from: a */
    InstructionItemButton getE();

    /* renamed from: b */
    String getC();

    default int c() {
        return 0;
    }

    /* renamed from: getAction */
    ScheduledOrderItemAction getF();

    /* renamed from: getSubtitle */
    String getB();

    /* renamed from: getTitle */
    String getA();
}
