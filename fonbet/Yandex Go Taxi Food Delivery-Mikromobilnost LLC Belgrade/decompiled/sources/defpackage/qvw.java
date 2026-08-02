package defpackage;

import com.yandex.go.places.map.data.repositories.h;

/* loaded from: classes12.dex */
public final class qvw implements i231 {
    public final h a;

    public qvw(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.i231
    public final c231 create() {
        u131 u131Var = new u131("should_invalidate_map_objects", false);
        u131Var.a(new mgu(19, this, u131Var));
        return u131Var;
    }
}
