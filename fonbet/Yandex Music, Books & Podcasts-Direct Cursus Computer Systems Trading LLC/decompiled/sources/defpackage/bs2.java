package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bs2 implements zr2 {
    public float a;
    public final Object b;

    public bs2(List list) {
        this.a = -1.0f;
        this.b = (acf) list.get(0);
    }

    @Override // defpackage.zr2
    public boolean c(float f) {
        if (this.a == f) {
            return true;
        }
        this.a = f;
        return false;
    }

    @Override // defpackage.zr2
    public acf e() {
        return (acf) this.b;
    }

    @Override // defpackage.zr2
    public boolean g(float f) {
        return !((acf) this.b).c();
    }

    @Override // defpackage.zr2
    public float h() {
        return ((acf) this.b).b();
    }

    @Override // defpackage.zr2
    public boolean isEmpty() {
        return false;
    }

    @Override // defpackage.zr2
    public float j() {
        return ((acf) this.b).a();
    }

    public bs2(dup dupVar, float f) {
        dupVar.getClass();
        this.b = dupVar;
        this.a = f;
    }
}
