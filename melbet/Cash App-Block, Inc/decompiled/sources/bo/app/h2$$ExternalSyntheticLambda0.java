package bo.app;

import app.cash.local.primitives.CartEntryWithQuantity;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;

/* loaded from: classes3.dex */
public final /* synthetic */ class h2$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;

    public /* synthetic */ h2$$ExternalSyntheticLambda0(List list, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 0;
        List list = this.f$0;
        switch (i) {
            case 1:
                Object obj = list.get(2);
                obj.getClass();
                break;
            case 2:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i2 += ((CartEntryWithQuantity) it.next()).getQuantity();
                }
                break;
            case 8:
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                    } else if (!((AmountSelectorWidgetModel.Item) it2.next()).isSelected()) {
                        i2++;
                    }
                }
                break;
        }
        return ((KType) list.get(0)).getClassifier();
    }
}
