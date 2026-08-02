package defpackage;

import androidx.camera.core.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class se7 {
    public final LinkedHashSet a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final iru0 f;
    public final j g;
    public final HashMap h;
    public final mru0 i;
    public final mru0 j;

    public se7(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, iru0 iru0Var, j jVar, HashMap hashMap, mru0 mru0Var, mru0 mru0Var2) {
        this.a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = iru0Var;
        this.g = jVar;
        this.h = hashMap;
        this.i = mru0Var;
        this.j = mru0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se7)) {
            return false;
        }
        se7 se7Var = (se7) obj;
        return this.a.equals(se7Var.a) && this.b.equals(se7Var.b) && this.c.equals(se7Var.c) && this.d.equals(se7Var.d) && this.e.equals(se7Var.e) && jl40.l(this.f, se7Var.f) && jl40.l(this.g, se7Var.g) && this.h.equals(se7Var.h) && jl40.l(this.i, se7Var.i) && jl40.l(this.j, se7Var.j);
    }

    public final int hashCode() {
        int b = ly3.b(ly3.b(ly3.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        iru0 iru0Var = this.f;
        int hashCode = (b + (iru0Var == null ? 0 : iru0Var.hashCode())) * 31;
        j jVar = this.g;
        int hashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31)) * 31;
        mru0 mru0Var = this.j;
        return hashCode2 + (mru0Var != null ? mru0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.j + ')';
    }
}
