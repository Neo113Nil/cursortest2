package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class uif implements bzc, Serializable {
    private final int arity;

    public uif(int i) {
        this.arity = i;
    }

    @Override // defpackage.bzc
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        ern.a.getClass();
        return frn.a(this);
    }
}
