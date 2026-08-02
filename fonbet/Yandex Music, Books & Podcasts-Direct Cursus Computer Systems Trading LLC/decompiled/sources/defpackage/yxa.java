package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes.dex */
public final class yxa implements vwt {
    public final x6k a;

    public yxa(x6k x6kVar) {
        this.a = x6kVar;
    }

    @Override // defpackage.vwt
    public final Object a(a aVar) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxa) && this.a.equals(((yxa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
