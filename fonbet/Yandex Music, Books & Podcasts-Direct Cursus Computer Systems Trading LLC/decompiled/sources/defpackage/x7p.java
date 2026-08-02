package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x7p extends y7p {
    public final euu a;
    public final u1u b;
    public final klu c;
    public final e4p d;

    public x7p(euu euuVar, u1u u1uVar, klu kluVar) {
        u1uVar.getClass();
        this.a = euuVar;
        this.b = u1uVar;
        this.c = kluVar;
        this.d = e4p.a;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7p)) {
            return false;
        }
        x7p x7pVar = (x7p) obj;
        return this.a.equals(x7pVar.a) && Intrinsics.d(this.b, x7pVar.b) && Intrinsics.d(this.c, x7pVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        klu kluVar = this.c;
        return hashCode + (kluVar == null ? 0 : kluVar.hashCode());
    }

    public final String toString() {
        return "WaveButton(uiData=" + this.a + ", model=" + this.b + ", waveAgentUiData=" + this.c + ")";
    }
}
