package defpackage;

import com.yandex.go.address.models.PlainAddress;
import java.util.Set;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final /* synthetic */ class ygc0 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;

    public /* synthetic */ ygc0(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Set set = this.b;
        Set set2 = (Set) obj;
        switch (i) {
            case 0:
                zgc0 zgc0Var = PlainAddress.Companion;
                break;
            default:
                zgc0 zgc0Var2 = PlainAddress.Companion;
                break;
        }
        return v4r0.h(set2, set);
    }
}
