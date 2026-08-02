package defpackage;

/* loaded from: classes.dex */
public abstract class ugo {
    public static final tgo a;

    static {
        fkk fkkVar = new fkk(50);
        a = new tgo(fkkVar, fkkVar, fkkVar, fkkVar);
    }

    public static final tgo a(float f) {
        dma dmaVar = new dma(f);
        return new tgo(dmaVar, dmaVar, dmaVar, dmaVar);
    }

    public static final tgo b(float f, float f2, float f3, float f4) {
        return new tgo(new dma(f), new dma(f2), new dma(f3), new dma(f4));
    }

    public static tgo c(float f, float f2) {
        return b(f, f2, 0, 0);
    }
}
