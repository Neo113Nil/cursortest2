package ru.yandex.taxi.vendor_api.google.object_detection;

import android.content.Context;
import android.graphics.Rect;
import android.media.Image;
import android.util.SizeF;
import com.google.android.gms.tasks.zzw;
import com.yandex.go.coroutines.h;
import defpackage.azu0;
import defpackage.bzu0;
import defpackage.c7b1;
import defpackage.dnr;
import defpackage.gtq0;
import defpackage.hp60;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.sss;
import defpackage.vg91;
import defpackage.wyu0;
import defpackage.xzv;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final i3y b = kotlin.a.a(new dnr(25, this));
    public final i3y c = kotlin.a.a(new sss(18));
    public final h d = new h(new GmsObjectDetectionRepository$installationCheck$1(this, null));

    public a(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r6.d.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Image image, int i, ContinuationImpl continuationImpl) {
        GmsObjectDetectionRepository$analyzeObject$1 gmsObjectDetectionRepository$analyzeObject$1;
        int i2;
        if (continuationImpl instanceof GmsObjectDetectionRepository$analyzeObject$1) {
            gmsObjectDetectionRepository$analyzeObject$1 = (GmsObjectDetectionRepository$analyzeObject$1) continuationImpl;
            int i3 = gmsObjectDetectionRepository$analyzeObject$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gmsObjectDetectionRepository$analyzeObject$1.label = i3 - Integer.MIN_VALUE;
                Object obj = gmsObjectDetectionRepository$analyzeObject$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = gmsObjectDetectionRepository$analyzeObject$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    gmsObjectDetectionRepository$analyzeObject$1.L$0 = image;
                    gmsObjectDetectionRepository$analyzeObject$1.I$0 = i;
                    gmsObjectDetectionRepository$analyzeObject$1.label = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        wyu0 wyu0Var = (wyu0) kotlin.collections.a.R(((azu0) obj).a);
                        if (wyu0Var == null) {
                            return null;
                        }
                        int i4 = wyu0Var.c;
                        int i5 = wyu0Var.d;
                        return new hp60(new Rect(i4, i5, wyu0Var.a + i4, wyu0Var.b + i5));
                    }
                    i = gmsObjectDetectionRepository$analyzeObject$1.I$0;
                    image = (Image) gmsObjectDetectionRepository$analyzeObject$1.L$0;
                    b.b(obj);
                }
                SizeF c = c7b1.c(image, i);
                zzw c2 = ((vg91) ((bzu0) this.c.getValue())).c(xzv.c(image, i, null));
                gmsObjectDetectionRepository$analyzeObject$1.L$0 = null;
                gmsObjectDetectionRepository$analyzeObject$1.L$1 = c;
                gmsObjectDetectionRepository$analyzeObject$1.L$2 = null;
                gmsObjectDetectionRepository$analyzeObject$1.I$0 = i;
                gmsObjectDetectionRepository$analyzeObject$1.label = 2;
                obj = gtq0.c(c2, gmsObjectDetectionRepository$analyzeObject$1);
            }
        }
        gmsObjectDetectionRepository$analyzeObject$1 = new GmsObjectDetectionRepository$analyzeObject$1(this, continuationImpl);
        Object obj2 = gmsObjectDetectionRepository$analyzeObject$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = gmsObjectDetectionRepository$analyzeObject$1.label;
        if (i2 != 0) {
        }
        SizeF c3 = c7b1.c(image, i);
        zzw c22 = ((vg91) ((bzu0) this.c.getValue())).c(xzv.c(image, i, null));
        gmsObjectDetectionRepository$analyzeObject$1.L$0 = null;
        gmsObjectDetectionRepository$analyzeObject$1.L$1 = c3;
        gmsObjectDetectionRepository$analyzeObject$1.L$2 = null;
        gmsObjectDetectionRepository$analyzeObject$1.I$0 = i;
        gmsObjectDetectionRepository$analyzeObject$1.label = 2;
        obj2 = gtq0.c(c22, gmsObjectDetectionRepository$analyzeObject$1);
    }
}
