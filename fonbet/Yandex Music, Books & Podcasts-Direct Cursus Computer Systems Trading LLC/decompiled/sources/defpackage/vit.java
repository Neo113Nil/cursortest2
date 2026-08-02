package defpackage;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class vit implements t9f {
    public static final vit b = new vit();
    public final /* synthetic */ udb a = new udb(Unit.a, "kotlin.Unit");

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        this.a.deserialize(eg7Var);
        return Unit.a;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        Unit unit = (Unit) obj;
        l6bVar.getClass();
        unit.getClass();
        this.a.serialize(l6bVar, unit);
    }
}
