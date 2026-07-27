package j1;

import android.graphics.Path;
import android.graphics.PointF;
import c1.C0533a;
import com.anythink.basead.exoplayer.k.p;
import com.icefishing.icefishinglive2.AbstractC4404f;
import e1.k;
import java.util.ArrayList;

/* renamed from: j1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4603g {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f38322a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f3, float f9, float f10) {
        return Math.max(f9, Math.min(f10, f3));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(p.f8473b, i));
    }

    public static int d(float f3, float f9) {
        int i = (int) f3;
        int i6 = (int) f9;
        int i9 = i / i6;
        int i10 = i % i6;
        if (!((i ^ i6) >= 0) && i10 != 0) {
            i9--;
        }
        return i - (i6 * i9);
    }

    public static void e(k kVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = kVar.f37155b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f38322a;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            ArrayList arrayList = kVar.f37154a;
            if (i >= arrayList.size()) {
                break;
            }
            C0533a c0533a = (C0533a) arrayList.get(i);
            PointF pointF3 = c0533a.f5494a;
            boolean equals = pointF3.equals(pointF2);
            PointF pointF4 = c0533a.f5495b;
            PointF pointF5 = c0533a.f5496c;
            if (equals && pointF4.equals(pointF5)) {
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
        if (kVar.f37156c) {
            path3.close();
        }
    }

    public static float f(float f3, float f9, float f10) {
        return AbstractC4404f.a(f9, f3, f10, f3);
    }

    public static void g(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2, Z0.k kVar) {
        if (eVar.a(i, kVar.getName())) {
            String name = kVar.getName();
            c1.e eVar3 = new c1.e(eVar2);
            eVar3.f5519a.add(name);
            c1.e eVar4 = new c1.e(eVar3);
            eVar4.f5520b = kVar;
            arrayList.add(eVar4);
        }
    }
}
