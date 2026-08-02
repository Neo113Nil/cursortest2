package com.miteksystems.misnap.camera.frameproducers;

import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.Preview;
import androidx.lifecycle.MutableLiveData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface FrameProducer {

    @Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/miteksystems/misnap/camera/frameproducers/FrameProducer$Event", "", "CameraInitialized", "CameraReady", "FrameProducerWarning", "InitializationError", "TakePhotoError", "VideoRecordingError", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$CameraInitialized;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$CameraReady;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public abstract class Event {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$CameraInitialized;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event;", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "a", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "getCameraInfo", "()Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "cameraInfo", "<init>", "(Lcom/miteksystems/misnap/core/MiSnapCameraInfo;)V", "camera_release"}, k = 1, mv = {1, 8, 0})
        public static final class CameraInitialized extends Event {

            /* renamed from: a, reason: from kotlin metadata */
            public final MiSnapCameraInfo cameraInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CameraInitialized(MiSnapCameraInfo miSnapCameraInfo) {
                super(null);
                miSnapCameraInfo.getClass();
                this.cameraInfo = miSnapCameraInfo;
            }

            public final MiSnapCameraInfo getCameraInfo() {
                return this.cameraInfo;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$CameraReady;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CameraReady extends Event {
            public static final CameraReady INSTANCE = new CameraReady(null);
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event;", "CameraNotInitialized", "PreviewNotInitialized", "UnableToAutoFocus", "UnsupportedSetting", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning$CameraNotInitialized;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning$PreviewNotInitialized;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning$UnableToAutoFocus;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning$UnsupportedSetting;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class FrameProducerWarning extends Event {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning$CameraNotInitialized;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CameraNotInitialized extends FrameProducerWarning {
                public static final CameraNotInitialized INSTANCE = new CameraNotInitialized(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(CameraNotInitialized.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning$PreviewNotInitialized;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class PreviewNotInitialized extends FrameProducerWarning {
                public static final PreviewNotInitialized INSTANCE = new PreviewNotInitialized(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(PreviewNotInitialized.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning$UnableToAutoFocus;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class UnableToAutoFocus extends FrameProducerWarning {
                public static final UnableToAutoFocus INSTANCE = new UnableToAutoFocus(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(UnableToAutoFocus.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning$UnsupportedSetting;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$FrameProducerWarning;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class UnsupportedSetting extends FrameProducerWarning {
                public static final UnsupportedSetting INSTANCE = new UnsupportedSetting(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(UnsupportedSetting.class, new StringBuilder(), '.');
                }
            }

            public FrameProducerWarning(DefaultConstructorMarker defaultConstructorMarker) {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event;", "CameraInitialization", "CameraNotAvailable", "InsufficientCamera", "InvalidImageFormat", "InvalidPreviewSurface", "PreviewInitialization", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$CameraInitialization;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$CameraNotAvailable;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$InsufficientCamera;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$InvalidImageFormat;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$InvalidPreviewSurface;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$PreviewInitialization;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class InitializationError extends Event {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$CameraInitialization;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CameraInitialization extends InitializationError {
                public static final CameraInitialization INSTANCE = new CameraInitialization(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(CameraInitialization.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$CameraNotAvailable;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CameraNotAvailable extends InitializationError {
                public static final CameraNotAvailable INSTANCE = new CameraNotAvailable(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(CameraNotAvailable.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$InsufficientCamera;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class InsufficientCamera extends InitializationError {
                public static final InsufficientCamera INSTANCE = new InsufficientCamera(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(InsufficientCamera.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$InvalidImageFormat;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class InvalidImageFormat extends InitializationError {
                public static final InvalidImageFormat INSTANCE = new InvalidImageFormat(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(InvalidImageFormat.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$InvalidPreviewSurface;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class InvalidPreviewSurface extends InitializationError {
                public static final InvalidPreviewSurface INSTANCE = new InvalidPreviewSurface(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(InvalidPreviewSurface.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError$PreviewInitialization;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$InitializationError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class PreviewInitialization extends InitializationError {
                public static final PreviewInitialization INSTANCE = new PreviewInitialization(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(PreviewInitialization.class, new StringBuilder(), '.');
                }
            }

            public InitializationError(DefaultConstructorMarker defaultConstructorMarker) {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event;", "CameraClosed", "Execution", "InvalidCamera", "PictureFailed", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError$CameraClosed;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError$Execution;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError$InvalidCamera;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError$PictureFailed;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class TakePhotoError extends Event {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError$CameraClosed;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CameraClosed extends TakePhotoError {
                public static final CameraClosed INSTANCE = new CameraClosed(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(CameraClosed.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError$Execution;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Execution extends TakePhotoError {
                public static final Execution INSTANCE = new Execution(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(Execution.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError$InvalidCamera;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class InvalidCamera extends TakePhotoError {
                public static final InvalidCamera INSTANCE = new InvalidCamera(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(InvalidCamera.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError$PictureFailed;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$TakePhotoError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class PictureFailed extends TakePhotoError {
                public static final PictureFailed INSTANCE = new PictureFailed(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(PictureFailed.class, new StringBuilder(), '.');
                }
            }

            public TakePhotoError(DefaultConstructorMarker defaultConstructorMarker) {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event;", "AudioRecordPermission", "Execution", "InsufficientStorage", "InvalidCamera", "InvalidVideoData", "StartRecording", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$AudioRecordPermission;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$Execution;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$InsufficientStorage;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$InvalidCamera;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$InvalidVideoData;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$StartRecording;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class VideoRecordingError extends Event {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$AudioRecordPermission;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class AudioRecordPermission extends VideoRecordingError {
                public static final AudioRecordPermission INSTANCE = new AudioRecordPermission(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(AudioRecordPermission.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$Execution;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Execution extends VideoRecordingError {
                public static final Execution INSTANCE = new Execution(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(Execution.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$InsufficientStorage;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class InsufficientStorage extends VideoRecordingError {
                public static final InsufficientStorage INSTANCE = new InsufficientStorage(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(InsufficientStorage.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$InvalidCamera;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class InvalidCamera extends VideoRecordingError {
                public static final InvalidCamera INSTANCE = new InvalidCamera(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(InvalidCamera.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$InvalidVideoData;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class InvalidVideoData extends VideoRecordingError {
                public static final InvalidVideoData INSTANCE = new InvalidVideoData(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(InvalidVideoData.class, new StringBuilder(), '.');
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError$StartRecording;", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer$Event$VideoRecordingError;", "", "toString", "()Ljava/lang/String;", "camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class StartRecording extends VideoRecordingError {
                public static final StartRecording INSTANCE = new StartRecording(null);

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(StartRecording.class, new StringBuilder(), '.');
                }
            }

            public VideoRecordingError(DefaultConstructorMarker defaultConstructorMarker) {
                super(null);
            }
        }

        public Event(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    MutableLiveData getFocusingEvents();

    MutableLiveData getFrameProducerEvents();

    MutableLiveData getPictureFrames();

    MutableLiveData getPreviewFrames();

    MutableLiveData getTorchEvents();

    MutableLiveData getVideoRecordings();

    void openCameraInstance(CameraSelectorFilter cameraSelectorFilter);

    void release();

    void requestAutoFocus(MeteringPoint meteringPoint);

    void setTorchEnabled(boolean z, Function1 function1);

    void startPreview(Surface surface, boolean z);

    void startPreview(SurfaceHolder surfaceHolder, boolean z);

    void startPreview(Preview.SurfaceProvider surfaceProvider, boolean z);

    void startVideoRecording();

    void stopVideoRecording();

    void takePicture();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final class DefaultImpls {
        public static /* synthetic */ void setTorchEnabled$default(FrameProducer frameProducer, boolean z, Function1 function1, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: setTorchEnabled");
                return;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            frameProducer.setTorchEnabled(z, function1);
        }

        public static /* synthetic */ void startPreview$default(FrameProducer frameProducer, Surface surface, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: startPreview");
                return;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            frameProducer.startPreview(surface, z);
        }

        public static /* synthetic */ void startPreview$default(FrameProducer frameProducer, SurfaceHolder surfaceHolder, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: startPreview");
                return;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            frameProducer.startPreview(surfaceHolder, z);
        }

        public static /* synthetic */ void startPreview$default(FrameProducer frameProducer, Preview.SurfaceProvider surfaceProvider, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: startPreview");
                return;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            frameProducer.startPreview(surfaceProvider, z);
        }
    }
}
