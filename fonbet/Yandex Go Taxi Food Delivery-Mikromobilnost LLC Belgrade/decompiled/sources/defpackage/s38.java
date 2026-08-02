package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class s38 {
    public static final x34 i = new x34("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final x34 j = new x34("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final x34 k = new x34("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList a;
    public final ug70 b;
    public final int c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final q6x0 g;
    public final ap7 h;

    public s38(ArrayList arrayList, ug70 ug70Var, int i2, boolean z, ArrayList arrayList2, boolean z2, q6x0 q6x0Var, ap7 ap7Var) {
        this.a = arrayList;
        this.b = ug70Var;
        this.c = i2;
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = q6x0Var;
        this.h = ap7Var;
        this.d = z;
    }

    public final Range a() {
        Range range = (Range) this.b.g(k, lru0.a);
        Objects.requireNonNull(range);
        return range;
    }

    public final int b() {
        Object obj = this.g.a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int c() {
        Integer num = (Integer) this.b.g(xi21.u4, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int d() {
        Integer num = (Integer) this.b.g(xi21.w4, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
