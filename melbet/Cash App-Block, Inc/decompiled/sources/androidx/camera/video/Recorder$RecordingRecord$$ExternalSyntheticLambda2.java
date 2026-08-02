package androidx.camera.video;

import android.media.MediaMuxer;
import android.net.Uri;
import androidx.appcompat.widget.TintInfo;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.video.internal.muxer.Media3MuxerImpl$State;
import androidx.camera.video.internal.muxer.MediaMuxerImpl$State;
import androidx.media3.muxer.FileOutputStreamSeekableMuxerOutput;
import androidx.media3.muxer.Mp4Muxer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileOutputStream;
import org.brotli.dec.HuffmanTreeGroup;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Recorder$RecordingRecord$$ExternalSyntheticLambda2 {
    public final /* synthetic */ AutoValue_Recorder_RecordingRecord f$0;
    public final /* synthetic */ ZslControlImpl$$ExternalSyntheticLambda1 f$1;
    public final /* synthetic */ FileOutputOptions f$2;

    public /* synthetic */ Recorder$RecordingRecord$$ExternalSyntheticLambda2(AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord, ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda1, FileOutputOptions fileOutputOptions) {
        this.f$0 = autoValue_Recorder_RecordingRecord;
        this.f$1 = zslControlImpl$$ExternalSyntheticLambda1;
        this.f$2 = fileOutputOptions;
    }

    public final HuffmanTreeGroup get(int i, Recorder$$ExternalSyntheticLambda17 recorder$$ExternalSyntheticLambda17) {
        HuffmanTreeGroup huffmanTreeGroup;
        this.f$1.getClass();
        int i2 = 0;
        if (i == 0 || i == 2) {
            StringUtilsKt.d("Recorder", "Create Media3MuxerImpl");
            huffmanTreeGroup = new HuffmanTreeGroup(2, false);
            huffmanTreeGroup.trees = Media3MuxerImpl$State.IDLE;
        } else {
            StringUtilsKt.d("Recorder", "Create MediaMuxerImpl");
            huffmanTreeGroup = new HuffmanTreeGroup(3, false);
            huffmanTreeGroup.trees = MediaMuxerImpl$State.IDLE;
        }
        Uri uri = Uri.EMPTY;
        FileOutputOptions fileOutputOptions = this.f$2;
        if (!(fileOutputOptions instanceof FileOutputOptions)) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Invalid output options type: ".concat(fileOutputOptions.getClass().getSimpleName()));
            return null;
        }
        File file = fileOutputOptions.mFileOutputOptionsInternal.file;
        File parentFile = file.getParentFile();
        if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
            StringUtilsKt.w("Recorder", "Failed to create folder for " + file.getAbsolutePath());
        }
        StringUtilsKt.d("Recorder", "Muxer.setOutput by path = " + file.getAbsolutePath());
        String absolutePath = file.getAbsolutePath();
        int i3 = huffmanTreeGroup.$r8$classId;
        absolutePath.getClass();
        switch (i3) {
            case 2:
                if (((Media3MuxerImpl$State) huffmanTreeGroup.trees) != Media3MuxerImpl$State.IDLE) {
                    Handlers$$ExternalSyntheticBUOutline0.m((Media3MuxerImpl$State) huffmanTreeGroup.trees, "Muxer is not idle. Current state: ");
                    break;
                } else if (i != 0 && i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported format: "));
                    break;
                } else {
                    TintInfo tintInfo = new TintInfo();
                    tintInfo.mTintList = null;
                    tintInfo.mTintMode = new Mp4Muxer(new FileOutputStreamSeekableMuxerOutput(new FileOutputStream(absolutePath)));
                    huffmanTreeGroup.codes = tintInfo;
                    huffmanTreeGroup.trees = Media3MuxerImpl$State.CONFIGURED;
                    break;
                }
            default:
                if (((MediaMuxerImpl$State) huffmanTreeGroup.trees) != MediaMuxerImpl$State.IDLE) {
                    Handlers$$ExternalSyntheticBUOutline0.m((MediaMuxerImpl$State) huffmanTreeGroup.trees, "Muxer is not idle. Current state: ");
                    break;
                } else {
                    if (i != 0) {
                        i2 = 1;
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported format: "));
                                break;
                            } else {
                                i2 = 2;
                            }
                        }
                    }
                    huffmanTreeGroup.codes = new MediaMuxer(absolutePath, i2);
                    huffmanTreeGroup.trees = MediaMuxerImpl$State.CONFIGURED;
                    break;
                }
        }
        ((Recorder) recorder$$ExternalSyntheticLambda17.f$0).mOutputUri = Uri.fromFile(file);
        return huffmanTreeGroup;
    }
}
