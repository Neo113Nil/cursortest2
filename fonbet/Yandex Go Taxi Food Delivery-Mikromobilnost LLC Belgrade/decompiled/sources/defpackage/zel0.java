package defpackage;

import com.yandex.messaging.internal.urlpreview.UrlPreviewBackgroundStyle;

/* loaded from: classes13.dex */
public final /* synthetic */ class zel0 implements zls {
    public final /* synthetic */ int a;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ((Integer) obj).getClass();
                afl0 afl0Var = (afl0) obj2;
                return new afl0(afl0Var.a, afl0Var.b, afl0Var.c, afl0Var.d, afl0Var.e, afl0Var.f, afl0Var.g, qv10.h(((Integer) obj3).intValue(), afl0Var.h, "__local_fix_"));
            case 1:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    vqy0.c("Restart", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, btsVar, 0, 0, 262142);
                } else {
                    btsVar.Y();
                }
                return zy11.a;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                UrlPreviewBackgroundStyle urlPreviewBackgroundStyle = UrlPreviewBackgroundStyle.LowHalfCorners;
                int[] iArr = new int[4];
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[3] = (booleanValue || booleanValue2) ? 3 : 2;
                iArr[2] = booleanValue ? 2 : 3;
                return iArr;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                boolean booleanValue5 = ((Boolean) obj3).booleanValue();
                UrlPreviewBackgroundStyle urlPreviewBackgroundStyle2 = UrlPreviewBackgroundStyle.LowHalfCorners;
                int[] iArr2 = new int[4];
                iArr2[0] = booleanValue3 ? 3 : 2;
                iArr2[1] = (!booleanValue3 || booleanValue4) ? 3 : 2;
                iArr2[3] = (booleanValue3 || booleanValue5) ? 3 : 2;
                iArr2[2] = booleanValue3 ? 2 : 3;
                return iArr2;
        }
    }
}
