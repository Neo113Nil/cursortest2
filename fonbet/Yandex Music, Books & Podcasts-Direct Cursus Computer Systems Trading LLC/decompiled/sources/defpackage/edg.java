package defpackage;

import java.util.EventListener;

/* loaded from: classes5.dex */
public abstract class edg {
    public final EventListener a;
    public final boolean b;

    public edg(ikp ikpVar, boolean z) {
        this.a = ikpVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edg) {
            return this.a.equals(((edg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
