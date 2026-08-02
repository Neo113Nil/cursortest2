package defpackage;

import android.graphics.PointF;
import com.yandex.metrica.push.common.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class iup implements xwt {
    public static final iup a = new iup();
    public static final j6e b = j6e.s("c", "v", CoreConstants.PushMessage.SERVICE_TYPE, "o");

    @Override // defpackage.xwt
    public final Object r(b7f b7fVar, float f) {
        if (b7fVar.peek() == 1) {
            b7fVar.a();
        }
        b7fVar.b();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (b7fVar.hasNext()) {
            int D = b7fVar.D(b);
            if (D == 0) {
                z = b7fVar.nextBoolean();
            } else if (D == 1) {
                arrayList = p7f.c(b7fVar, f);
            } else if (D == 2) {
                arrayList2 = p7f.c(b7fVar, f);
            } else if (D != 3) {
                b7fVar.H();
                b7fVar.w();
            } else {
                arrayList3 = p7f.c(b7fVar, f);
            }
        }
        b7fVar.o();
        if (b7fVar.peek() == 2) {
            b7fVar.g();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            xq0.x("Shape data was missing information.");
            return null;
        }
        if (arrayList.isEmpty()) {
            return new hup(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i2 = i - 1;
            arrayList4.add(new pv6(y5i.a((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), y5i.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i3 = size - 1;
            arrayList4.add(new pv6(y5i.a((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), y5i.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new hup(pointF, z, arrayList4);
    }
}
