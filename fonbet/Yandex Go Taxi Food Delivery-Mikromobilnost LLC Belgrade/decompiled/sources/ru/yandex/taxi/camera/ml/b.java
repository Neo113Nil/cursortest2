package ru.yandex.taxi.camera.ml;

import android.media.Image;
import defpackage.l0x0;
import defpackage.t7v;
import defpackage.tje;
import defpackage.uk20;
import defpackage.w511;
import defpackage.x4r0;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
public final class b implements t7v {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.t7v
    public final void d(x4r0 x4r0Var) {
        Image f = x4r0Var.b.f();
        if (f != null) {
            uk20 uk20Var = this.a.d;
            if (uk20Var instanceof ru.yandex.taxi.vendor_api.google.bank_card.a) {
                tje.Y(EmptyCoroutineContext.a, new MlCameraController$MlVisionAnalyser$analyze$1$1(uk20Var, f, x4r0Var, null));
            } else {
                if (!(uk20Var instanceof l0x0)) {
                    w511.b();
                    return;
                }
                ((l0x0) uk20Var).a(f, x4r0Var.x.e());
            }
        }
        x4r0Var.close();
    }
}
