package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class qan0 implements jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qan0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof qan0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof qan0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof qan0) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(3, (a) this.b, a.class, "takePicture", "takePicture(Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V", 0);
            case 1:
                return new FunctionReferenceImpl(3, (a) this.b, a.class, "takePicture", "takePicture(Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V", 0);
            default:
                return new FunctionReferenceImpl(3, (w8v) this.b, w8v.class, "takePicture", "takePicture(Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
