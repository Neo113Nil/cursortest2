package defpackage;

import android.graphics.Bitmap;
import java.util.function.Supplier;

/* loaded from: classes14.dex */
public final /* synthetic */ class yg21 implements yvf0 {
    public final /* synthetic */ zg21 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Supplier c;

    public /* synthetic */ yg21(zg21 zg21Var, String str, Supplier supplier) {
        this.a = zg21Var;
        this.b = str;
        this.c = supplier;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        zg21 zg21Var = this.a;
        String str = this.b;
        Supplier supplier = this.c;
        try {
            Bitmap a = zg21Var.c.a();
            if (a.getConfig() == Bitmap.Config.ARGB_8888) {
                return a;
            }
            jst.e.j(new IllegalStateException("Wrong image config: " + a.getConfig()));
            return u8b1.f(a);
        } catch (IllegalArgumentException e) {
            if (!qyy0.a()) {
                throw e;
            }
            jst.e.w(e);
            zg21Var.d = true;
            return (Bitmap) supplier.get();
        } catch (InterruptedException unused) {
            unr0.C(new Object[]{str}, 1, "Failed to load image with url: %s", jst.e);
            zg21Var.d = true;
            return (Bitmap) supplier.get();
        }
    }
}
