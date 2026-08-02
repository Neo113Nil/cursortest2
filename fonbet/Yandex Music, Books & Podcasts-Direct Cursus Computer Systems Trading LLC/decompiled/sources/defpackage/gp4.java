package defpackage;

/* loaded from: classes6.dex */
public final class gp4 implements nlm {
    public final jyr a = l18.b.b(hag.I(ezb.class), true);

    public final boolean a(boolean z) {
        int ordinal = ((ezb) this.a.getValue()).a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return false;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nlm
    public final boolean apply(Object obj) {
        x1u x1uVar = (x1u) obj;
        x1uVar.getClass();
        int ordinal = ((ezb) this.a.getValue()).a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return false;
            }
            if (x1uVar.i) {
                return false;
            }
        }
        return true;
    }
}
