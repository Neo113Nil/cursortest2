package defpackage;

import androidx.compose.foundation.relocation.a;

/* loaded from: classes10.dex */
public final class sk6 extends e530 {
    public pk6 a;

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        pk6 pk6Var = this.a;
        if (pk6Var instanceof a) {
            ((a) pk6Var).a.j(this);
        }
        if (pk6Var instanceof a) {
            ((a) pk6Var).a.b(this);
        }
        this.a = pk6Var;
    }

    @Override // defpackage.e530
    public final void onDetach() {
        pk6 pk6Var = this.a;
        if (pk6Var instanceof a) {
            ((a) pk6Var).a.j(this);
        }
    }
}
