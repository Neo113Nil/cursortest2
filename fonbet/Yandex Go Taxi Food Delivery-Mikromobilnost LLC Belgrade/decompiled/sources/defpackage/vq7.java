package defpackage;

import android.net.Uri;
import androidx.camera.core.ImageCaptureException;

/* loaded from: classes13.dex */
public final class vq7 implements u8v {
    public final /* synthetic */ wq7 a;

    public vq7(wq7 wq7Var) {
        this.a = wq7Var;
    }

    @Override // defpackage.u8v
    public final void j(ImageCaptureException imageCaptureException) {
        this.a.b.e(imageCaptureException);
    }

    @Override // defpackage.u8v
    public final void k(reu reuVar) {
        this.a.b.f((Uri) reuVar.b);
    }
}
