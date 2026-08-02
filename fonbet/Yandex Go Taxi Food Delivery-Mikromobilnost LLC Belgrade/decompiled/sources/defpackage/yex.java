package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes.dex */
public abstract class yex {
    public static final hzk a = hzk.n(RemoteBioParameters.X, RemoteBioParameters.Y);

    public static int a(a aVar) {
        aVar.a();
        int nextDouble = (int) (aVar.nextDouble() * 255.0d);
        int nextDouble2 = (int) (aVar.nextDouble() * 255.0d);
        int nextDouble3 = (int) (aVar.nextDouble() * 255.0d);
        while (aVar.hasNext()) {
            aVar.skipValue();
        }
        aVar.d();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    public static PointF b(a aVar, float f) {
        int i = vex.a[aVar.k().ordinal()];
        if (i == 1) {
            float nextDouble = (float) aVar.nextDouble();
            float nextDouble2 = (float) aVar.nextDouble();
            while (aVar.hasNext()) {
                aVar.skipValue();
            }
            return new PointF(nextDouble * f, nextDouble2 * f);
        }
        if (i == 2) {
            aVar.a();
            float nextDouble3 = (float) aVar.nextDouble();
            float nextDouble4 = (float) aVar.nextDouble();
            while (aVar.k() != JsonReader$Token.END_ARRAY) {
                aVar.skipValue();
            }
            aVar.d();
            return new PointF(nextDouble3 * f, nextDouble4 * f);
        }
        if (i != 3) {
            vg10.g(aVar.k(), "Unknown point starts with ");
            return null;
        }
        aVar.c();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (aVar.hasNext()) {
            int o = aVar.o(a);
            if (o == 0) {
                f2 = d(aVar);
            } else if (o != 1) {
                aVar.v();
                aVar.skipValue();
            } else {
                f3 = d(aVar);
            }
        }
        aVar.e();
        return new PointF(f2 * f, f3 * f);
    }

    public static ArrayList c(a aVar, float f) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k() == JsonReader$Token.BEGIN_ARRAY) {
            aVar.a();
            arrayList.add(b(aVar, f));
            aVar.d();
        }
        aVar.d();
        return arrayList;
    }

    public static float d(a aVar) {
        JsonReader$Token k = aVar.k();
        int i = vex.a[k.ordinal()];
        if (i == 1) {
            return (float) aVar.nextDouble();
        }
        if (i != 2) {
            kbs.f(k, "Unknown value for token of type ");
            return 0.0f;
        }
        aVar.a();
        float nextDouble = (float) aVar.nextDouble();
        while (aVar.hasNext()) {
            aVar.skipValue();
        }
        aVar.d();
        return nextDouble;
    }
}
