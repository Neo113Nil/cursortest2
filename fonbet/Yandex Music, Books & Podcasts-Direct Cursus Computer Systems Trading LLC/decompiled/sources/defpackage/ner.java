package defpackage;

/* loaded from: classes.dex */
public abstract class ner implements mer {
    public final du1 a = new du1(0);

    public final boolean b(int i) {
        return (i & this.a.get()) != 0;
    }

    public final void c(int i) {
        du1 du1Var;
        int i2;
        do {
            du1Var = this.a;
            i2 = du1Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!du1Var.compareAndSet(i2, i2 | i));
    }
}
