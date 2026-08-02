package defpackage;

import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class bl extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(List list, int i) {
        super(1);
        this.r = i;
        switch (i) {
            case 25:
                ywb ywbVar = ywb.a;
                this.s = list;
                super(1);
                break;
            default:
                dwb dwbVar = dwb.a;
                this.s = list;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.get(((Number) obj).intValue());
                break;
            case 1:
                this.s.get(((Number) obj).intValue());
                break;
            case 2:
                this.s.get(((Number) obj).intValue());
                break;
            case 3:
                this.s.get(((Number) obj).intValue());
                break;
            case 4:
                this.s.get(((Number) obj).intValue());
                break;
            case 5:
                this.s.get(((Number) obj).intValue());
                break;
            case 6:
                this.s.get(((Number) obj).intValue());
                break;
            case 7:
                this.s.get(((Number) obj).intValue());
                break;
            case 8:
                this.s.get(((Number) obj).intValue());
                break;
            case 9:
                this.s.get(((Number) obj).intValue());
                break;
            case 10:
                this.s.get(((Number) obj).intValue());
                break;
            case 11:
                this.s.get(((Number) obj).intValue());
                break;
            case 12:
                this.s.get(((Number) obj).intValue());
                break;
            case 13:
                this.s.get(((Number) obj).intValue());
                break;
            case 14:
                yr7 yr7Var = (yr7) obj;
                yr7Var.getClass();
                List list = yr7Var.f;
                List list2 = this.s;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).intValue()));
                }
                List w0 = CollectionsKt.w0(CollectionsKt.z0(CollectionsKt.g0(list, arrayList)));
                w0.getClass();
                yr7Var.f = w0;
                break;
            case 15:
                this.s.get(((Number) obj).intValue());
                break;
            case 16:
                this.s.get(((Number) obj).intValue());
                break;
            case 17:
                this.s.get(((Number) obj).intValue());
                break;
            case 18:
                this.s.get(((Number) obj).intValue());
                break;
            case 19:
                this.s.get(((Number) obj).intValue());
                break;
            case 20:
                this.s.get(((Number) obj).intValue());
                break;
            case 21:
                this.s.get(((Number) obj).intValue());
                break;
            case 22:
                this.s.get(((Number) obj).intValue());
                break;
            case 23:
                int intValue = ((Number) obj).intValue();
                break;
            case 24:
                break;
            case 25:
                int intValue2 = ((Number) obj).intValue();
                break;
            case 26:
                break;
            case 27:
                this.s.get(((Number) obj).intValue());
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                this.s.get(((Number) obj).intValue());
                break;
            default:
                this.s.get(((Number) obj).intValue());
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl(int i, List list, boolean z) {
        super(1);
        this.r = i;
        this.s = list;
    }
}
