package defpackage;

import com.yandex.go.order.processor.api.parts.OrderChainPartType;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes12.dex */
public final class tgt0 extends l89 {
    public final ei00 d;
    public boolean e;

    public tgt0(ei00 ei00Var) {
        this.d = ei00Var;
    }

    @Override // defpackage.l89, defpackage.z880
    public final void a() {
        if (!this.e) {
            this.e = true;
            ArrayList arrayList = this.a;
            arrayList.clear();
            Map map = (Map) this.d.get();
            for (OrderChainPartType orderChainPartType : OrderChainPartType.a()) {
                y880 y880Var = (y880) map.get(orderChainPartType);
                if (y880Var == null) {
                    jst.e.w(new IllegalStateException("Missing orderPart to type [" + orderChainPartType + "]"));
                } else if (arrayList.contains(y880Var)) {
                    jst.e.w(new IllegalStateException("Register duplicated order chain element. skip it"));
                } else {
                    arrayList.add(y880Var);
                }
            }
        }
        super.a();
    }
}
