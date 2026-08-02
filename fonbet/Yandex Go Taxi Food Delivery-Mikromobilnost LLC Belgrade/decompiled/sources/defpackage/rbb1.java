package defpackage;

import android.content.Context;
import com.google.android.gms.common.b;
import com.google.android.gms.internal.mlkit_vision_text_common.o;

/* loaded from: classes.dex */
public final class rbb1 extends t4y {
    public final qk20 b;

    public rbb1(qk20 qk20Var) {
        this.b = qk20Var;
    }

    @Override // defpackage.t4y
    public final Object a(Object obj) {
        fsy0 fsy0Var = (fsy0) obj;
        o e = otb1.e(fsy0Var.b());
        Context b = this.b.b();
        b.b.getClass();
        return new gsy0(e, (b.a(b) >= 204700000 || fsy0Var.a()) ? new zrr(b, fsy0Var, e) : new kzo(b), fsy0Var);
    }
}
