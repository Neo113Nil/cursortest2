package ru.yandex.taxi.camera.ml;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.f;
import defpackage.co7;
import defpackage.er7;
import defpackage.g320;
import defpackage.h2b1;
import defpackage.i3y;
import defpackage.noh;
import defpackage.tse;
import defpackage.uk20;
import java.util.concurrent.ExecutorService;
import ru.yandex.taxi.camera.CameraPreview;

/* loaded from: classes13.dex */
public final class c {
    public final CameraPreview a;
    public final tse b;
    public volatile boolean c;
    public final noh e;
    public f g;
    public co7 i;
    public uk20 d = h2b1.H;
    public final er7 f = new er7();
    public final i3y h = kotlin.a.a(new g320(26));

    public c(Context context, CameraPreview cameraPreview, tse tseVar) {
        this.a = cameraPreview;
        this.b = tseVar;
        this.e = a.b(context);
    }

    public final void a() {
        this.c = false;
        this.d = h2b1.H;
        this.f.a();
        this.a.detachPreview();
        f fVar = this.g;
        if (fVar != null) {
            fVar.H();
        }
        this.g = null;
        ((ExecutorService) this.h.getValue()).shutdown();
        this.i = null;
    }

    public final void b(Size size) {
        this.f.b();
        if (this.c) {
            return;
        }
        this.c = true;
        com.yandex.go.coroutines.b.g(this.b, null, null, new MlCameraController$start$1(size, this, null), 3);
    }
}
