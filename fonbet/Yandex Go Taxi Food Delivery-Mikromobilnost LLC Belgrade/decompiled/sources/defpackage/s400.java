package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.a;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor.b;

/* loaded from: classes11.dex */
public final class s400 implements nb00, we10, jg51, yd70, g0a0, tbu, uv60, tr81, pke {
    public static final /* synthetic */ s400 a = new s400();

    public s400(b bVar, o6i o6iVar, j18 j18Var) {
        new AtomicBoolean(false);
    }

    @Override // defpackage.tr81
    public void a(String str) {
    }

    @Override // defpackage.yd70
    public void b(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // defpackage.tr81
    public void c(String str) {
    }

    @Override // defpackage.uv60
    public f7q0 d() {
        return new qb4(-9223372036854775807L);
    }

    @Override // defpackage.tr81
    public void e(Set set) {
    }

    public Object f(Object obj) {
        dlo dloVar;
        x74 x74Var = (x74) obj;
        jdv jdvVar = x74Var.b;
        m6f0 m6f0Var = x74Var.a;
        if (a.c(jdvVar.getFormat())) {
            try {
                fg1 fg1Var = dlo.b;
                ByteBuffer h = jdvVar.i0()[0].h();
                h.rewind();
                byte[] bArr = new byte[h.capacity()];
                h.get(bArr);
                dloVar = new dlo(new androidx.exifinterface.media.a(new ByteArrayInputStream(bArr)));
                jdvVar.i0()[0].h().rewind();
            } catch (IOException e) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e);
            }
        } else {
            dloVar = null;
        }
        ycv.g.getClass();
        if (((ImageCaptureRotationOptionQuirk) tbj.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            x34 x34Var = s38.i;
        } else if (a.c(jdvVar.getFormat())) {
            d6z.v(dloVar, "JPEG image must have exif.");
            Size size = new Size(jdvVar.getWidth(), jdvVar.getHeight());
            int b = m6f0Var.f - dloVar.b();
            Size size2 = lw01.d(lw01.k(b)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix a2 = lw01.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), b, false);
            RectF rectF = new RectF(m6f0Var.e);
            a2.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            int b2 = dloVar.b();
            Matrix matrix = new Matrix(m6f0Var.h);
            matrix.postConcat(a2);
            ap7 zo7Var = jdvVar.G0() instanceof bp7 ? ((bp7) jdvVar.G0()).a : new zo7();
            jdvVar.getFormat();
            return new r74(jdvVar, dloVar, jdvVar.getFormat(), size2, rect, b2, matrix, zo7Var);
        }
        Rect rect2 = m6f0Var.e;
        int i = m6f0Var.f;
        Matrix matrix2 = m6f0Var.h;
        ap7 zo7Var2 = jdvVar.G0() instanceof bp7 ? ((bp7) jdvVar.G0()).a : new zo7();
        Size size3 = new Size(jdvVar.getWidth(), jdvVar.getHeight());
        if (a.c(jdvVar.getFormat())) {
            d6z.v(dloVar, "JPEG image must have Exif.");
        }
        return new r74(jdvVar, dloVar, jdvVar.getFormat(), size3, rect2, i, matrix2, zo7Var2);
    }

    @Override // defpackage.uv60
    public void g(long j) {
    }

    @Override // defpackage.tbu
    public String getServiceName() {
        return "scooters";
    }

    @Override // defpackage.pke
    public /* synthetic */ Object h(Task task) {
        zm2 zm2Var = k991.k;
        return null;
    }

    @Override // defpackage.uv60
    public long j(c5p c5pVar) {
        return -1L;
    }

    @Override // defpackage.trq0
    public void onContinueLoadingRequested(urq0 urq0Var) {
        int i = n920.a;
        throw null;
    }

    @Override // defpackage.we10
    public void onPrepared(xe10 xe10Var) {
        int i = n920.a;
        throw null;
    }

    @Override // defpackage.jg51
    public void p(lg51 lg51Var) {
    }

    @Override // defpackage.jg51
    public void r(i4u i4uVar) {
    }

    public /* synthetic */ s400(Object obj, Object obj2) {
    }

    public s400() {
    }

    public /* synthetic */ s400(Object obj) {
    }
}
