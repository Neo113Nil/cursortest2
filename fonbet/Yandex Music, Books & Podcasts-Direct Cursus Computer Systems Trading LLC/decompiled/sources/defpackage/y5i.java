package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class y5i {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, i));
    }

    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(hup hupVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = hupVar.b;
        ArrayList arrayList = hupVar.a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            pv6 pv6Var = (pv6) arrayList.get(i);
            PointF pointF3 = pv6Var.a;
            PointF pointF4 = pv6Var.b;
            PointF pointF5 = pv6Var.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (hupVar.c) {
            path3.close();
        }
    }

    public static float f(float f, float f2, float f3) {
        return su4.e(f2, f, f3, f);
    }

    public static void g(abf abfVar, int i, ArrayList arrayList, abf abfVar2, cbf cbfVar) {
        if (abfVar.a(i, cbfVar.getName())) {
            String name = cbfVar.getName();
            abf abfVar3 = new abf(abfVar2);
            abfVar3.a.add(name);
            abf abfVar4 = new abf(abfVar3);
            abfVar4.b = cbfVar;
            arrayList.add(abfVar4);
        }
    }
}
