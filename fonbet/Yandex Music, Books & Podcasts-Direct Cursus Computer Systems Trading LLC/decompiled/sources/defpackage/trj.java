package defpackage;

import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class trj extends mbo {
    @Override // defpackage.mbo
    public final p4w b() {
        if (!this.a || !((t4w) this.c).j.d) {
            return new urj((UUID) this.b, (t4w) this.c, (Set) this.d);
        }
        xq0.x("Cannot set backoff criteria on an idle mode job");
        return null;
    }

    @Override // defpackage.mbo
    public final mbo k() {
        return this;
    }
}
