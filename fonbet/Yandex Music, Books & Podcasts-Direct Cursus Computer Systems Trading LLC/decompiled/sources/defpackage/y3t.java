package defpackage;

import java.util.function.Predicate;

/* loaded from: classes6.dex */
public final /* synthetic */ class y3t implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y3t(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((r3s) this.b).invoke(obj)).booleanValue();
            default:
                return ((String) obj).equals((String) this.b);
        }
    }
}
