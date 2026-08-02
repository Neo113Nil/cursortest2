package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Trace;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.images.ImageManager$From;
import com.yandex.images.b;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.am.g;

/* loaded from: classes10.dex */
public final /* synthetic */ class ue5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ue5(Bitmap bitmap, List list, v06 v06Var, byte[] bArr, Uri uri, ImageManager$From imageManager$From) {
        this.a = 3;
        this.b = bitmap;
        this.w = list;
        this.c = v06Var;
        this.x = bArr;
        this.y = uri;
        this.z = imageManager$From;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mz40 C;
        int i = this.a;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                ety0 ety0Var = (ety0) obj6;
                LayoutDirection layoutDirection = (LayoutDirection) obj5;
                List list = (List) obj4;
                kk2 kk2Var = (kk2) obj3;
                fwi fwiVar = (fwi) obj2;
                dyr dyrVar = (dyr) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    i2t0 j = q2t0.j();
                    mz40 mz40Var = j instanceof mz40 ? (mz40) j : null;
                    if (mz40Var == null || (C = mz40Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        i2t0 j2 = C.j();
                        try {
                            ety0 I = bb1.I(ety0Var, layoutDirection);
                            if (list == null) {
                                list = EmptyList.a;
                            }
                            xv10 xv10Var = new xv10(kk2Var, I, list, fwiVar, dyrVar);
                            xv10Var.d();
                            xv10Var.b();
                            i2t0.q(j2);
                            C.w().g();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            i2t0.q(j2);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                cve cveVar = (cve) obj6;
                SharedPaymentsOpenReason sharedPaymentsOpenReason = (SharedPaymentsOpenReason) obj4;
                Runnable runnable = (Runnable) obj3;
                aue aueVar = (aue) obj2;
                tmr0 tmr0Var = (tmr0) obj;
                if (cveVar.c.b((Uri) obj5, sharedPaymentsOpenReason)) {
                    cveVar.a();
                    return;
                }
                zue zueVar = cveVar.e;
                bc bcVar = new bc(zueVar, (y) zueVar.e.get(), aueVar, runnable, tmr0Var);
                String a = aueVar.a();
                String b = aueVar.b();
                g gVar = aueVar.c;
                ((y) cveVar.f.get()).c.a().d(new d4f(bcVar, gVar.j.a(gVar.a.Ig()), b, a, sharedPaymentsOpenReason, aueVar));
                return;
            case 2:
                ((q4g) obj6).b((br7) obj5, (br7) obj4, (enw0) obj3, (enw0) obj2, (Map.Entry) obj);
                return;
            case 3:
                Bitmap bitmap = (Bitmap) obj6;
                List list2 = (List) obj4;
                v06 v06Var = (v06) obj5;
                byte[] bArr = (byte[]) obj3;
                Uri uri = (Uri) obj2;
                ImageManager$From imageManager$From = (ImageManager$From) obj;
                if (bitmap != null) {
                    Iterator it = v06Var.y.iterator();
                    while (it.hasNext()) {
                        if (((bl7) it.next()).b.l) {
                            b.i(list2, new ad7(bitmap, bArr, uri, imageManager$From));
                            return;
                        }
                    }
                    b.i(list2, new ad7(bitmap, null, uri, imageManager$From));
                    return;
                }
                mav mavVar = v06Var.G;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bl7 bl7Var = (bl7) list2.get(i2);
                    if (!bl7Var.e) {
                        bl7Var.c(mavVar == null ? kav.f : mavVar);
                    }
                }
                return;
            default:
                TransferMainFragment.renderButtonsAdapter$lambda$43$lambda$42$lambda$40((hzt0) obj6, (hzt0) obj5, (hzt0) obj4, (t961) obj3, (TransferMainFragment) obj2, (hzt0) obj);
                return;
        }
    }

    public /* synthetic */ ue5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
    }
}
