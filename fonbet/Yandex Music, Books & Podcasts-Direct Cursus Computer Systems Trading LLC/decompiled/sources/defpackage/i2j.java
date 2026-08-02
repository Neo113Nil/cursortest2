package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i2j {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ j2j c;

    public i2j(j2j j2jVar, ik7 ik7Var, Executor executor) {
        this.c = j2jVar;
        this.a = new WeakReference(ik7Var);
        this.b = executor;
    }
}
