package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class g19 extends xr8 {
    public final hp8 A;
    public final z09 z;

    public g19(e23 e23Var, z09 z09Var, hp8 hp8Var, p0a p0aVar) {
        super(z09Var, e23Var, hp8Var, p0aVar);
        this.z = z09Var;
        this.A = hp8Var;
    }

    @Override // defpackage.xr8
    public final void t(e23 e23Var, jc8 jc8Var, int i, pm9 pm9Var) {
        super.t(e23Var, jc8Var, i, pm9Var);
        this.z.setTag(R.id.div_gallery_item_index, Integer.valueOf(i));
        this.A.a(e23Var.a);
    }

    @Override // defpackage.xr8
    public final void u() {
        int i = i9f.a;
    }
}
