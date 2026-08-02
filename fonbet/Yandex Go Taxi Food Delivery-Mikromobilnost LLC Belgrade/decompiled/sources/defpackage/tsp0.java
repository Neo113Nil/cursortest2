package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public final class tsp0 implements hz50 {
    public final NetworkMethod a;
    public final String b;
    public final wj00 c;
    public final wj00 d;
    public final wj00 e;
    public final y5j0 f;

    public tsp0(NetworkMethod networkMethod, String str, wj00 wj00Var, wj00 wj00Var2, wj00 wj00Var3, y5j0 y5j0Var) {
        this.a = networkMethod;
        this.b = str;
        this.c = wj00Var;
        this.d = wj00Var2;
        this.e = wj00Var3;
        this.f = y5j0Var;
    }

    @Override // defpackage.hz50
    public final wj00 a() {
        return this.c;
    }

    @Override // defpackage.hz50
    public final wj00 b() {
        return this.d;
    }

    @Override // defpackage.hz50
    public final String c() {
        return this.b;
    }

    @Override // defpackage.hz50
    public final wj00 d() {
        return this.e;
    }

    @Override // defpackage.hz50
    public final y5j0 encoding() {
        return this.f;
    }

    @Override // defpackage.hz50
    public final NetworkMethod method() {
        return this.a;
    }
}
