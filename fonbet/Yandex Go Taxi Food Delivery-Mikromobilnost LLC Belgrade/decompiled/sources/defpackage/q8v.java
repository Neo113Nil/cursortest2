package defpackage;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class q8v implements wi21, hcv {
    public final yy40 a;

    public q8v(yy40 yy40Var) {
        this.a = yy40Var;
        x34 x34Var = max0.f4;
        Class cls = (Class) yy40Var.g(x34Var, null);
        if (cls != null && !cls.equals(w8v.class)) {
            w511.l("Invalid target class configuration for ", this, Extension.COLON_SPACE, cls);
            throw null;
        }
        yy40Var.w(xi21.t4, UseCaseConfigFactory$CaptureType.IMAGE_CAPTURE);
        yy40Var.w(x34Var, w8v.class);
        x34 x34Var2 = max0.e4;
        if (yy40Var.g(x34Var2, null) == null) {
            yy40Var.w(x34Var2, w8v.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // defpackage.hcv
    public final /* bridge */ /* synthetic */ Object a(int i) {
        i(i);
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

    public final w8v f() {
        x34 x34Var = x8v.x;
        yy40 yy40Var = this.a;
        Integer num = (Integer) yy40Var.g(x34Var, null);
        if (num != null) {
            yy40Var.w(eav.j2, num);
        } else {
            r8v r8vVar = w8v.B;
            x34 x34Var2 = x8v.y;
            if (Objects.equals(yy40Var.g(x34Var2, null), 2)) {
                yy40Var.w(eav.j2, 32);
            } else if (Objects.equals(yy40Var.g(x34Var2, null), 3)) {
                yy40Var.w(eav.j2, 32);
                yy40Var.w(eav.k2, 256);
            } else if (Objects.equals(yy40Var.g(x34Var2, null), 1)) {
                yy40Var.w(eav.j2, Integer.valueOf(Constants.INTENT_CONTAINER_ID));
                yy40Var.w(eav.l2, q8n.c);
            } else {
                yy40Var.w(eav.j2, 256);
            }
        }
        x8v e = e();
        icv.v(e);
        w8v w8vVar = new w8v(e);
        Size size = (Size) yy40Var.g(icv.r2, null);
        if (size != null) {
            w8vVar.u = new Rational(size.getWidth(), size.getHeight());
        }
        d6z.v((Executor) yy40Var.g(lyw.A2, geb1.d()), "The IO executor can't be null");
        x34 x34Var3 = x8v.c;
        if (yy40Var.a.containsKey(x34Var3)) {
            Integer num2 = (Integer) yy40Var.f(x34Var3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                kbs.f(num2, "The flash mode is not allowed to set: ");
                return null;
            }
            if (num2.intValue() == 3 && yy40Var.g(x8v.D, null) == null) {
                ny61.g("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return null;
            }
        }
        return w8vVar;
    }

    @Override // defpackage.wi21
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final x8v e() {
        return new x8v(ug70.a(this.a));
    }

    public final void h(bsj0 bsj0Var) {
        this.a.w(icv.w2, bsj0Var);
    }

    public final void i(int i) {
        this.a.w(icv.n2, Integer.valueOf(i));
    }

    public q8v() {
        this(yy40.b());
    }
}
