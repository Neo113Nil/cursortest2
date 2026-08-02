package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.Config$OptionPriority;

/* loaded from: classes10.dex */
public final class vn7 implements owo {
    public final yy40 a = yy40.b();

    public final wn7 a() {
        return new wn7(ug70.a(this.a));
    }

    public final void b(CaptureRequest.Key key, Object obj) {
        this.a.w(wn7.a(key), obj);
    }

    public final void c(CaptureRequest.Key key, Object obj, Config$OptionPriority config$OptionPriority) {
        this.a.t(wn7.a(key), config$OptionPriority, obj);
    }

    @Override // defpackage.owo
    public final yy40 d() {
        return this.a;
    }
}
