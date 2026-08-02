package defpackage;

import java.io.Closeable;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class g78 implements Closeable {
    public final e78 a;
    public boolean b;
    public final /* synthetic */ l78 c;

    public g78(l78 l78Var, e78 e78Var) {
        this.c = l78Var;
        this.a = e78Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        l78 l78Var = this.c;
        synchronized (l78Var) {
            e78 e78Var = this.a;
            int i = e78Var.h - 1;
            e78Var.h = i;
            if (i == 0 && e78Var.f) {
                Regex regex = l78.q;
                l78Var.P(e78Var);
            }
        }
    }
}
