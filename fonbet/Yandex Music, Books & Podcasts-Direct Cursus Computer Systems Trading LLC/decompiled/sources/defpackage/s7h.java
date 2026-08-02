package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class s7h extends zh {
    public final ai a;

    public s7h(ai aiVar) {
        this.a = aiVar;
    }

    @Override // defpackage.zh
    public final void a(Object obj) {
        Unit unit;
        ei eiVar = this.a.a;
        if (eiVar != null) {
            eiVar.a(obj);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        xq0.q("Launcher has not been initialized");
    }

    @Override // defpackage.zh
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
