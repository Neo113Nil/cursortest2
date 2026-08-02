package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.camera.core.internal.utils.a;
import com.yandex.mobile.drive.scan.ui.b;

/* loaded from: classes15.dex */
public final class wlm0 extends t8v {
    public final /* synthetic */ b a;

    public wlm0(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.t8v
    public final void a(jdv jdvVar) {
        try {
            Bitmap a = a.a(jdvVar);
            int e = jdvVar.G0().e();
            boolean z = e % 360 != 0;
            boolean z2 = Math.abs(0.0f) <= 1.0E-5f;
            if (z || !z2) {
                Matrix matrix = new Matrix();
                if (z) {
                    matrix.postRotate(e);
                }
                if (!z2) {
                    matrix.postScale(1.0f, 1.0f);
                }
                Bitmap createBitmap = Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, true);
                a.recycle();
                a = createBitmap;
            }
            gwk0.m(jdvVar, null);
            b bVar = this.a;
            bVar.w = a;
            bVar.x = Integer.valueOf(jdvVar.G0().e());
            bVar.h();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                gwk0.m(jdvVar, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.t8v
    public final void b() {
        b bVar = this.a;
        bVar.h();
        bVar.m.b(bVar.i.a().getMode(), "failed to capture picture", null);
    }
}
