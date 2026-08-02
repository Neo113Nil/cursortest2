package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.Timebase;
import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes10.dex */
public final class ql31 implements vhw0 {
    public final String a;
    public final Timebase b;
    public final i94 c;
    public final Size w;
    public final lzn x;
    public final q8n y;
    public final Range z;

    public ql31(String str, Timebase timebase, i94 i94Var, Size size, lzn lznVar, q8n q8nVar, Range range) {
        this.a = str;
        this.b = timebase;
        this.c = i94Var;
        this.w = size;
        this.x = lznVar;
        this.y = q8nVar;
        this.z = range;
    }

    @Override // defpackage.vhw0
    public final Object get() {
        Range range = this.z;
        i94 i94Var = this.c;
        t38 b = ll31.b(i94Var, range);
        sgb1.g(3, "VidEncVdPrflRslvr");
        Range range2 = i94Var.c;
        sgb1.g(3, "VidEncVdPrflRslvr");
        lzn lznVar = this.x;
        int b2 = lznVar.b();
        int i = this.y.b;
        int a = lznVar.a();
        int i2 = b.b;
        int e = lznVar.e();
        Size size = this.w;
        int d = ll31.d(b2, i, a, i2, e, size.getWidth(), lznVar.k(), size.getHeight(), lznVar.g(), range2);
        int i3 = lznVar.i();
        String str = this.a;
        e94 a2 = ll31.a(i3, str);
        m d2 = d94.d();
        if (str == null) {
            ny61.t("Null mimeType");
            return null;
        }
        d2.a = str;
        Timebase timebase = this.b;
        if (timebase == null) {
            ny61.t("Null inputTimebase");
            return null;
        }
        d2.c = timebase;
        d2.d = size;
        d2.j = Integer.valueOf(d);
        d2.g = Integer.valueOf(b.a);
        d2.h = Integer.valueOf(b.b);
        d2.b = Integer.valueOf(i3);
        d2.f = a2;
        return d2.a();
    }
}
