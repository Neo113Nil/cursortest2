package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.processing.AutoValue_Packet;
import androidx.room.CoroutinesRoom;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class ProcessingNode$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProcessingNode f$0;
    public final /* synthetic */ AutoValue_ProcessingNode_InputPacket f$1;

    public /* synthetic */ ProcessingNode$$ExternalSyntheticLambda2(ProcessingNode processingNode, AutoValue_ProcessingNode_InputPacket autoValue_ProcessingNode_InputPacket, int i) {
        this.$r8$classId = i;
        this.f$0 = processingNode;
        this.f$1 = autoValue_ProcessingNode_InputPacket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        boolean z = true;
        AutoValue_ProcessingNode_InputPacket autoValue_ProcessingNode_InputPacket = this.f$1;
        ProcessingNode processingNode = this.f$0;
        switch (i) {
            case 0:
                ProcessingRequest processingRequest = autoValue_ProcessingNode_InputPacket.processingRequest;
                try {
                    AutoValue_Packet autoValue_Packet = (AutoValue_Packet) processingNode.mInput2Packet.apply(autoValue_ProcessingNode_InputPacket);
                    int i2 = autoValue_Packet.f846format;
                    TransactorKt.checkArgument("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i2, i2 == 35 || i2 == 256 || i2 == 4101);
                    zzabp.mainThreadExecutor().execute(new CameraX$$ExternalSyntheticLambda2(11, processingRequest, (Bitmap) processingNode.mImage2Bitmap.apply(autoValue_Packet)));
                    return;
                } catch (Exception e) {
                    autoValue_ProcessingNode_InputPacket.imageProxy.close();
                    StringUtilsKt.e("ProcessingNode", "process postview input packet failed.", e);
                    return;
                }
            case 1:
                ProcessingNode$$ExternalSyntheticLambda2 processingNode$$ExternalSyntheticLambda2 = new ProcessingNode$$ExternalSyntheticLambda2(processingNode, autoValue_ProcessingNode_InputPacket, 2);
                Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("CX:processInputPacket"));
                try {
                    processingNode$$ExternalSyntheticLambda2.run();
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                ProcessingRequest processingRequest2 = autoValue_ProcessingNode_InputPacket.processingRequest;
                try {
                    if (processingNode.mInputEdge.outputFormats.size() <= 1) {
                        z = false;
                    }
                    if (autoValue_ProcessingNode_InputPacket.processingRequest.mOutputFileOptions == null) {
                        zzabp.mainThreadExecutor().execute(new CameraX$$ExternalSyntheticLambda2(12, processingRequest2, processingNode.processInMemoryCapture(autoValue_ProcessingNode_InputPacket)));
                    } else {
                        CoroutinesRoom.Companion processOnDiskCapture = processingNode.processOnDiskCapture(autoValue_ProcessingNode_InputPacket);
                        if (!z || processingRequest2.mTakePictureRequest.isFormatProcessedInSimultaneousCapture()) {
                            zzabp.mainThreadExecutor().execute(new CameraX$$ExternalSyntheticLambda2(13, processingRequest2, processOnDiskCapture));
                        }
                    }
                    return;
                } catch (ImageCaptureException e2) {
                    zzabp.mainThreadExecutor().execute(new CameraX$$ExternalSyntheticLambda2(14, processingRequest2, e2));
                    return;
                } catch (OutOfMemoryError e3) {
                    zzabp.mainThreadExecutor().execute(new CameraX$$ExternalSyntheticLambda2(14, processingRequest2, new ImageCaptureException(0, "Processing failed due to low memory.", e3)));
                    return;
                } catch (RuntimeException e4) {
                    zzabp.mainThreadExecutor().execute(new CameraX$$ExternalSyntheticLambda2(14, processingRequest2, new ImageCaptureException(0, "Processing failed.", e4)));
                    return;
                }
        }
    }
}
