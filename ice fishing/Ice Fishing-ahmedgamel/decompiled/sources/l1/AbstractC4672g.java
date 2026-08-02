package l1;

import android.graphics.Path;
import android.graphics.PointF;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.Wv;
import e1.C4472a;
import g1.k;
import java.util.ArrayList;

/* renamed from: l1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4672g {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f38834a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f2, float f9, float f10) {
        return Math.max(f9, Math.min(f10, f2));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(p.f9259b, i));
    }

    public static int d(float f2, float f9) {
        int i = (int) f2;
        int i4 = (int) f9;
        int i6 = i / i4;
        int i9 = i % i4;
        if (!((i ^ i4) >= 0) && i9 != 0) {
            i6--;
        }
        return i - (i4 * i6);
    }

    public static void e(k kVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = kVar.f37631b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f38834a;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            ArrayList arrayList = kVar.f37630a;
            if (i >= arrayList.size()) {
                break;
            }
            C4472a c4472a = (C4472a) arrayList.get(i);
            PointF pointF3 = c4472a.f37212a;
            boolean equals = pointF3.equals(pointF2);
            PointF pointF4 = c4472a.f37213b;
            PointF pointF5 = c4472a.f37214c;
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
        if (kVar.f37632c) {
            path3.close();
        }
    }

    public static float f(float f2, float f9, float f10) {
        return Wv.a(f9, f2, f10, f2);
    }

    public static void g(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2, b1.k kVar) {
        if (eVar.a(i, kVar.getName())) {
            String name = kVar.getName();
            e1.e eVar3 = new e1.e(eVar2);
            eVar3.f37237a.add(name);
            e1.e eVar4 = new e1.e(eVar3);
            eVar4.f37238b = kVar;
            arrayList.add(eVar4);
        }
    }
}
