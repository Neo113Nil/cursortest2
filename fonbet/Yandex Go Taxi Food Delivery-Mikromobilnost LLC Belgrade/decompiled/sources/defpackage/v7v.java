package defpackage;

import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class v7v implements hcv, wi21 {
    public final yy40 a;

    public v7v(yy40 yy40Var) {
        this.a = yy40Var;
        x34 x34Var = max0.f4;
        Class cls = (Class) yy40Var.g(x34Var, null);
        if (cls != null && !cls.equals(f.class)) {
            w511.l("Invalid target class configuration for ", this, Extension.COLON_SPACE, cls);
            throw null;
        }
        yy40Var.w(xi21.t4, UseCaseConfigFactory$CaptureType.IMAGE_ANALYSIS);
        yy40Var.w(x34Var, f.class);
        x34 x34Var2 = max0.e4;
        if (yy40Var.g(x34Var2, null) == null) {
            yy40Var.w(x34Var2, f.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // defpackage.hcv
    public final Object a(int i) {
        this.a.w(icv.n2, Integer.valueOf(i));
        return this;
    }

    @Override // defpackage.hcv
    public final /* bridge */ /* synthetic */ Object b(bsj0 bsj0Var) {
        h(bsj0Var);
        return this;
    }

    @Override // defpackage.hcv
    public final Object c(Size size) {
        this.a.w(icv.r2, size);
        return this;
    }

    @Override // defpackage.owo
    public final yy40 d() {
        return this.a;
    }

    public final f f() {
        b8v e = e();
        icv.v(e);
        return new f(e);
    }

    @Override // defpackage.wi21
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final b8v e() {
        return new b8v(ug70.a(this.a));
    }

    public final void h(bsj0 bsj0Var) {
        this.a.w(icv.w2, bsj0Var);
    }

    public v7v() {
        this(yy40.b());
    }
}
