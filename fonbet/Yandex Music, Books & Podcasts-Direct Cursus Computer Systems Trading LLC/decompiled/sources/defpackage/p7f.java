package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class p7f {
    public static final j6e a = j6e.s("x", "y");

    public static int a(b7f b7fVar) {
        b7fVar.a();
        int nextDouble = (int) (b7fVar.nextDouble() * 255.0d);
        int nextDouble2 = (int) (b7fVar.nextDouble() * 255.0d);
        int nextDouble3 = (int) (b7fVar.nextDouble() * 255.0d);
        while (b7fVar.hasNext()) {
            b7fVar.w();
        }
        b7fVar.g();
        return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, nextDouble, nextDouble2, nextDouble3);
    }

    public static PointF b(b7f b7fVar, float f) {
        int D = ouj.D(b7fVar.peek());
        if (D == 0) {
            b7fVar.a();
            float nextDouble = (float) b7fVar.nextDouble();
            float nextDouble2 = (float) b7fVar.nextDouble();
            while (b7fVar.peek() != 2) {
                b7fVar.w();
            }
            b7fVar.g();
            return new PointF(nextDouble * f, nextDouble2 * f);
        }
        if (D != 2) {
            if (D != 6) {
                xq0.x("Unknown point starts with ".concat(f1d.x(b7fVar.peek())));
                return null;
            }
            float nextDouble3 = (float) b7fVar.nextDouble();
            float nextDouble4 = (float) b7fVar.nextDouble();
            while (b7fVar.hasNext()) {
                b7fVar.w();
            }
            return new PointF(nextDouble3 * f, nextDouble4 * f);
        }
        b7fVar.b();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (b7fVar.hasNext()) {
            int D2 = b7fVar.D(a);
            if (D2 == 0) {
                f2 = d(b7fVar);
            } else if (D2 != 1) {
                b7fVar.H();
                b7fVar.w();
            } else {
                f3 = d(b7fVar);
            }
        }
        b7fVar.o();
        return new PointF(f2 * f, f3 * f);
    }

    public static ArrayList c(b7f b7fVar, float f) {
        ArrayList arrayList = new ArrayList();
        b7fVar.a();
        while (b7fVar.peek() == 1) {
            b7fVar.a();
            arrayList.add(b(b7fVar, f));
            b7fVar.g();
        }
        b7fVar.g();
        return arrayList;
    }

    public static float d(b7f b7fVar) {
        int peek = b7fVar.peek();
        int D = ouj.D(peek);
        if (D != 0) {
            if (D == 6) {
                return (float) b7fVar.nextDouble();
            }
            xq0.x("Unknown value for token of type ".concat(f1d.x(peek)));
            return 0.0f;
        }
        b7fVar.a();
        float nextDouble = (float) b7fVar.nextDouble();
        while (b7fVar.hasNext()) {
            b7fVar.w();
        }
        b7fVar.g();
        return nextDouble;
    }
}
