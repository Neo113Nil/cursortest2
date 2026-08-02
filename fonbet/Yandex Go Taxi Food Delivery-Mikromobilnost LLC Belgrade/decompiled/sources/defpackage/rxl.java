package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.a;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;

/* loaded from: classes10.dex */
public final class rxl implements m131 {
    public static final rxl a = new rxl();
    public static final hzk b = hzk.n("t", "f", "s", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.m131
    public final Object x(a aVar, float f) {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        aVar.c();
        String str = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (aVar.hasNext()) {
            switch (aVar.o(b)) {
                case 0:
                    str = aVar.nextString();
                    break;
                case 1:
                    str2 = aVar.nextString();
                    break;
                case 2:
                    f2 = (float) aVar.nextDouble();
                    break;
                case 3:
                    int nextInt = aVar.nextInt();
                    DocumentData.Justification justification2 = DocumentData.Justification.CENTER;
                    if (nextInt <= justification2.ordinal() && nextInt >= 0) {
                        justification = DocumentData.Justification.values()[nextInt];
                        break;
                    } else {
                        justification = justification2;
                        break;
                    }
                    break;
                case 4:
                    i = aVar.nextInt();
                    break;
                case 5:
                    f3 = (float) aVar.nextDouble();
                    break;
                case 6:
                    f4 = (float) aVar.nextDouble();
                    break;
                case 7:
                    i2 = yex.a(aVar);
                    break;
                case 8:
                    i3 = yex.a(aVar);
                    break;
                case 9:
                    f5 = (float) aVar.nextDouble();
                    break;
                case 10:
                    z = aVar.nextBoolean();
                    break;
                case 11:
                    aVar.a();
                    pointF = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
                    aVar.d();
                    break;
                case 12:
                    aVar.a();
                    pointF2 = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
                    aVar.d();
                    break;
                default:
                    aVar.v();
                    aVar.skipValue();
                    break;
            }
        }
        aVar.e();
        DocumentData documentData = new DocumentData();
        documentData.a = str;
        documentData.b = str2;
        documentData.c = f2;
        documentData.d = justification;
        documentData.e = i;
        documentData.f = f3;
        documentData.g = f4;
        documentData.h = i2;
        documentData.i = i3;
        documentData.j = f5;
        documentData.k = z;
        documentData.l = pointF;
        documentData.m = pointF2;
        return documentData;
    }
}
