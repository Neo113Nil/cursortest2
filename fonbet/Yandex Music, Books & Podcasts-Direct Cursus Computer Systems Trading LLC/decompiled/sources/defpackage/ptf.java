package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class ptf implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ ptf(x0 x0Var, int i) {
        this.a = i;
        this.b = x0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object key = ((vtf) obj).getKey();
                x0 x0Var = this.b;
                return gl5.b(Integer.valueOf(x0Var.A(key)), Integer.valueOf(x0Var.A(((vtf) obj2).getKey())));
            case 1:
                Object key2 = ((vtf) obj).getKey();
                x0 x0Var2 = this.b;
                return gl5.b(Integer.valueOf(x0Var2.A(key2)), Integer.valueOf(x0Var2.A(((vtf) obj2).getKey())));
            case 2:
                Object key3 = ((vtf) obj2).getKey();
                x0 x0Var3 = this.b;
                return gl5.b(Integer.valueOf(x0Var3.A(key3)), Integer.valueOf(x0Var3.A(((vtf) obj).getKey())));
            default:
                Object key4 = ((vtf) obj2).getKey();
                x0 x0Var4 = this.b;
                return gl5.b(Integer.valueOf(x0Var4.A(key4)), Integer.valueOf(x0Var4.A(((vtf) obj).getKey())));
        }
    }
}
