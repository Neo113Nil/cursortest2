package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class rwt extends cs2 {
    public final Object i;

    public rwt(szg szgVar, Object obj) {
        super(Collections.EMPTY_LIST);
        j(szgVar);
        this.i = obj;
    }

    @Override // defpackage.cs2
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.cs2
    public final Object e() {
        szg szgVar = this.e;
        Object obj = this.i;
        float f = this.d;
        return szgVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.cs2
    public final Object f(acf acfVar, float f) {
        return e();
    }

    @Override // defpackage.cs2
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // defpackage.cs2
    public final void i(float f) {
        this.d = f;
    }
}
