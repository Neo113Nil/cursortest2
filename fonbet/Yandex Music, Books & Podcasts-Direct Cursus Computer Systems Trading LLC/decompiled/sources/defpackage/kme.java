package defpackage;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class kme implements arf, Serializable {
    public final Object a;

    public kme(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.arf
    public final Object getValue() {
        return this.a;
    }

    @Override // defpackage.arf
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
