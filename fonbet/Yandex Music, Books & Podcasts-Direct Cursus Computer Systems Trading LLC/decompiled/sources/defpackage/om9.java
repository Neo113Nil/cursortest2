package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class om9 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ pm9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om9(pm9 pm9Var, int i) {
        super(0);
        this.r = i;
        this.s = pm9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return CollectionsKt.X(this.s.c, "/", null, null, null, 62);
            default:
                pm9 pm9Var = this.s;
                List<Pair> list = pm9Var.b;
                boolean isEmpty = list.isEmpty();
                long j = pm9Var.a;
                if (isEmpty) {
                    return String.valueOf(j);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append('/');
                ArrayList arrayList = new ArrayList();
                for (Pair pair : list) {
                    z75.t(arrayList, u75.h((String) pair.a, (String) pair.b));
                }
                sb.append(CollectionsKt.X(arrayList, "/", null, null, null, 62));
                return sb.toString();
        }
    }
}
