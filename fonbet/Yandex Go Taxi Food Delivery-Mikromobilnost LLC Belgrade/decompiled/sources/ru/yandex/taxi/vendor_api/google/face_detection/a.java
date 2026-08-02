package ru.yandex.taxi.vendor_api.google.face_detection;

import android.content.Context;
import android.media.Image;
import com.yandex.go.coroutines.h;
import defpackage.c7b1;
import defpackage.dnr;
import defpackage.i3y;
import defpackage.i7p;
import defpackage.j7p;
import defpackage.l7p;
import defpackage.m7p;
import defpackage.ny61;
import defpackage.o7p;
import defpackage.p7p;
import defpackage.sss;
import defpackage.tcc;
import defpackage.udq0;
import defpackage.xzv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final i3y b = kotlin.a.a(new sss(15));
    public final i3y c = kotlin.a.a(new dnr(24, this));
    public final h d = new h(new GmsFaceDetectionRepository$installationCheck$1(this, null));

    public a(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[LOOP:1: B:25:0x009b->B:27:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Image image, int i, ContinuationImpl continuationImpl) {
        GmsFaceDetectionRepository$analyzeFaceContours$1 gmsFaceDetectionRepository$analyzeFaceContours$1;
        int i2;
        Iterator it;
        ArrayList arrayList;
        Iterator it2;
        if (continuationImpl instanceof GmsFaceDetectionRepository$analyzeFaceContours$1) {
            gmsFaceDetectionRepository$analyzeFaceContours$1 = (GmsFaceDetectionRepository$analyzeFaceContours$1) continuationImpl;
            int i3 = gmsFaceDetectionRepository$analyzeFaceContours$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gmsFaceDetectionRepository$analyzeFaceContours$1.label = i3 - Integer.MIN_VALUE;
                Object obj = gmsFaceDetectionRepository$analyzeFaceContours$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = gmsFaceDetectionRepository$analyzeFaceContours$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    gmsFaceDetectionRepository$analyzeFaceContours$1.L$0 = image;
                    gmsFaceDetectionRepository$analyzeFaceContours$1.I$0 = i;
                    gmsFaceDetectionRepository$analyzeFaceContours$1.label = 1;
                    if (this.d.a(gmsFaceDetectionRepository$analyzeFaceContours$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = gmsFaceDetectionRepository$analyzeFaceContours$1.I$0;
                    image = (Image) gmsFaceDetectionRepository$analyzeFaceContours$1.L$0;
                    b.b(obj);
                }
                c7b1.c(image, i);
                List list = (List) udq0.f(((p7p) ((o7p) this.b.getValue())).c(xzv.c(image, i, null)));
                ArrayList arrayList2 = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    j7p j7pVar = (j7p) ((i7p) it.next()).j.get(1);
                    ArrayList arrayList3 = j7pVar != null ? j7pVar.b : null;
                    if (arrayList3 != null) {
                        arrayList2.add(arrayList3);
                    }
                }
                arrayList = new ArrayList(tcc.n(arrayList2, 10));
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new l7p((List) it2.next()));
                }
                if (arrayList.isEmpty()) {
                    return new m7p(arrayList);
                }
                return null;
            }
        }
        gmsFaceDetectionRepository$analyzeFaceContours$1 = new GmsFaceDetectionRepository$analyzeFaceContours$1(this, continuationImpl);
        Object obj2 = gmsFaceDetectionRepository$analyzeFaceContours$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = gmsFaceDetectionRepository$analyzeFaceContours$1.label;
        if (i2 != 0) {
        }
        c7b1.c(image, i);
        List list2 = (List) udq0.f(((p7p) ((o7p) this.b.getValue())).c(xzv.c(image, i, null)));
        ArrayList arrayList22 = new ArrayList();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        arrayList = new ArrayList(tcc.n(arrayList22, 10));
        it2 = arrayList22.iterator();
        while (it2.hasNext()) {
        }
        if (arrayList.isEmpty()) {
        }
    }
}
