package defpackage;

import ru.yandex.taxi.logistics.sdk.d;

/* loaded from: classes5.dex */
public final class s3i implements ofg {
    public final pwy0 a;
    public final d b;

    public s3i(pwy0 pwy0Var) {
        this.a = pwy0Var;
        this.b = new d(pwy0Var.a());
    }

    @Override // defpackage.ofg
    public final tpr a() {
        return this.b;
    }

    @Override // defpackage.ofg
    public final boolean b() {
        return this.a.getThemeType().c();
    }
}
