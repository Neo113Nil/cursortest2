package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class s8 extends mif {
    public static final AtomicInteger f = new AtomicInteger(0);
    public final ArrayList c;
    public final g2o d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(ig3 ig3Var) {
        super(ig3Var);
        ig3Var.getClass();
        this.c = new ArrayList();
        f.getAndIncrement();
        this.d = new g2o();
    }
}
