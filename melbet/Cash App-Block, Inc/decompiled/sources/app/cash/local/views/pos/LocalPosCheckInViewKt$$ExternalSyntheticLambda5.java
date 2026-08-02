package app.cash.local.views.pos;

import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.compose.runtime.MutableState;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalPosCheckInViewKt$$ExternalSyntheticLambda5 implements Preview.SurfaceProvider {
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ LocalPosCheckInViewKt$$ExternalSyntheticLambda5(MutableState mutableState) {
        this.f$0 = mutableState;
    }

    @Override // androidx.camera.core.Preview.SurfaceProvider
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        surfaceRequest.getClass();
        this.f$0.setValue(surfaceRequest);
    }
}
