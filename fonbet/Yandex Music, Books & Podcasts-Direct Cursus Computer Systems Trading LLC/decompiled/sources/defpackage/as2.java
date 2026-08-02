package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class as2 implements zr2 {
    public final List a;
    public acf c = null;
    public float d = -1.0f;
    public acf b = a(0.0f);

    public as2(List list) {
        this.a = list;
    }

    public final acf a(float f) {
        List list = this.a;
        acf acfVar = (acf) list.get(list.size() - 1);
        if (f >= acfVar.b()) {
            return acfVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            acf acfVar2 = (acf) list.get(size);
            if (this.b != acfVar2 && f >= acfVar2.b() && f < acfVar2.a()) {
                return acfVar2;
            }
        }
        return (acf) list.get(0);
    }

    @Override // defpackage.zr2
    public final boolean c(float f) {
        acf acfVar = this.c;
        acf acfVar2 = this.b;
        if (acfVar == acfVar2 && this.d == f) {
            return true;
        }
        this.c = acfVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.zr2
    public final acf e() {
        return this.b;
    }

    @Override // defpackage.zr2
    public final boolean g(float f) {
        acf acfVar = this.b;
        if (f >= acfVar.b() && f < acfVar.a()) {
            return !this.b.c();
        }
        this.b = a(f);
        return true;
    }

    @Override // defpackage.zr2
    public final float h() {
        return ((acf) this.a.get(0)).b();
    }

    @Override // defpackage.zr2
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.zr2
    public final float j() {
        return ((acf) this.a.get(r0.size() - 1)).a();
    }
}
