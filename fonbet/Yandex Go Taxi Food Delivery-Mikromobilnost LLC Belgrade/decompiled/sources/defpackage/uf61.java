package defpackage;

import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;

/* loaded from: classes10.dex */
public final class uf61 extends lg {
    @Override // defpackage.lg
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void j(jdv jdvVar) {
        dav G0 = jdvVar.G0();
        ap7 ap7Var = G0 instanceof bp7 ? ((bp7) G0).a : null;
        if (ap7Var != null && ((ap7Var.f() == CameraCaptureMetaData$AfState.LOCKED_FOCUSED || ap7Var.f() == CameraCaptureMetaData$AfState.PASSIVE_FOCUSED) && ap7Var.l() == CameraCaptureMetaData$AeState.CONVERGED && ap7Var.i() == CameraCaptureMetaData$AwbState.CONVERGED)) {
            super.c(jdvVar);
        } else {
            ((dy31) this.d).getClass();
            jdvVar.close();
        }
    }
}
