package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ep7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep7(List list, int i) {
        super(0);
        this.r = i;
        this.s = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        List list = this.s;
        switch (i) {
            case 0:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 1:
            case 2:
                return list;
            case 3:
                a1k a1kVar = a1k.g;
                return qgg.k(t75.c(new c7t(list, 0)), 0, 0, ofg.d, null);
            default:
                return CollectionsKt.X(list, null, null, null, dpo.w0, 31);
        }
    }
}
