package defpackage;

import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.IndeterminateDrawable;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class xqv {
    public IndeterminateDrawable a;
    public final ArrayList b = new ArrayList();

    public xqv(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(new dcm());
        }
    }

    public static float b(int i, int i2, int i3) {
        return sb2.j((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void a();

    public abstract void c();

    public abstract void d(Animatable2Compat.a aVar);

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
