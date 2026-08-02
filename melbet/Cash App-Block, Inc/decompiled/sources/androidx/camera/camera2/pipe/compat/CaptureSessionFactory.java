package androidx.camera.camera2.pipe.compat;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.camera2.pipe.MetadataTransform;
import androidx.camera.camera2.pipe.OutputStream$DynamicRangeProfile;
import androidx.camera.camera2.pipe.OutputStream$MirrorMode;
import androidx.camera.camera2.pipe.OutputStream$StreamUseCase;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface CaptureSessionFactory {

    public interface Result {

        public final class Failed implements Result {
            public static final Failed INSTANCE = new Failed();

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v16, types: [android.hardware.camera2.params.OutputConfiguration] */
            /* JADX WARN: Type inference failed for: r1v20 */
            /* JADX WARN: Type inference failed for: r1v21 */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r5v1, types: [android.hardware.camera2.params.OutputConfiguration] */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [android.hardware.camera2.params.OutputConfiguration] */
            /* renamed from: create-gWWoySg$default, reason: not valid java name */
            public static AndroidOutputConfiguration m75creategWWoySg$default(Surface surface, Integer num, MetadataTransform.AnonymousClass1 anonymousClass1, OutputStream$MirrorMode outputStream$MirrorMode, OutputStream$DynamicRangeProfile outputStream$DynamicRangeProfile, OutputStream$StreamUseCase outputStream$StreamUseCase, List list, Size size, boolean z, int i, String str, int i2) {
                Class cls;
                ?? outputConfiguration;
                Surface surface2 = surface;
                Integer num2 = (i2 & 2) != 0 ? null : num;
                int i3 = i2 & 4;
                MetadataTransform.AnonymousClass1 anonymousClass12 = MetadataTransform.AnonymousClass1.SURFACE;
                MetadataTransform.AnonymousClass1 anonymousClass13 = i3 != 0 ? anonymousClass12 : anonymousClass1;
                boolean z2 = (i2 & 512) != 0 ? false : z;
                int i4 = (i2 & 1024) != 0 ? -1 : i;
                anonymousClass13.getClass();
                if (anonymousClass13 == MetadataTransform.AnonymousClass1.SURFACE_DEFERRED_FOR_QUERY_ONLY && Build.VERSION.SDK_INT >= 35) {
                    if (num2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    if (size == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    outputConfiguration = Api35Compat$$ExternalSyntheticApiModelOutline0.m(num2.intValue(), size);
                } else if (anonymousClass13 != anonymousClass12) {
                    if (size == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Size must defined when creating a deferred OutputConfiguration.");
                        return null;
                    }
                    if (anonymousClass13 == MetadataTransform.AnonymousClass1.SURFACE_TEXTURE) {
                        cls = SurfaceTexture.class;
                    } else if (anonymousClass13 == MetadataTransform.AnonymousClass1.SURFACE_VIEW) {
                        cls = SurfaceHolder.class;
                    } else if (anonymousClass13 != MetadataTransform.AnonymousClass1.MEDIA_CODEC) {
                        if (anonymousClass13 != MetadataTransform.AnonymousClass1.MEDIA_RECORDER) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(anonymousClass13, "Unsupported OutputType: ");
                            return null;
                        }
                        if (Build.VERSION.SDK_INT < 35) {
                            a$$ExternalSyntheticBUOutline0.m$1("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                            return null;
                        }
                        cls = MediaRecorder.class;
                    } else {
                        if (Build.VERSION.SDK_INT < 35) {
                            a$$ExternalSyntheticBUOutline0.m$1("OutputType.MEDIA_CODEC requires API 35 or higher.");
                            return null;
                        }
                        cls = MediaCodec.class;
                    }
                    outputConfiguration = new OutputConfiguration(size, cls);
                } else {
                    if (surface2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("non-null surface!");
                        return null;
                    }
                    try {
                        surface2 = i4 != -1 ? new OutputConfiguration(i4, surface2) : new OutputConfiguration(surface2);
                        outputConfiguration = surface2;
                    } catch (Throwable th) {
                        Log.w("CXCP", "Failed to create an OutputConfiguration for " + surface2 + '!', th);
                        return null;
                    }
                }
                if (z2) {
                    outputConfiguration.enableSurfaceSharing();
                }
                if (str != null) {
                    outputConfiguration.setPhysicalCameraId(str);
                }
                if (outputStream$MirrorMode != null) {
                    int i5 = outputStream$MirrorMode.value;
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 33) {
                        Api33Compat.setMirrorMode(outputConfiguration, i5);
                    } else if (i5 != 0) {
                        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i6, "Cannot set mirrorMode to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                        m2m.append((Object) OutputStream$MirrorMode.m50toStringimpl(i5));
                        Log.w("CXCP", m2m.toString());
                    }
                }
                if (outputStream$DynamicRangeProfile != null) {
                    long j = outputStream$DynamicRangeProfile.value;
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 33) {
                        Api33Compat.setDynamicRangeProfile(outputConfiguration, j);
                    } else if (j != 1) {
                        StringBuilder m2m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i7, "Cannot set dynamicRangeProfile to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                        m2m2.append((Object) OutputStream$DynamicRangeProfile.m49toStringimpl(j));
                        Log.w("CXCP", m2m2.toString());
                    }
                }
                if (outputStream$StreamUseCase != null && Build.VERSION.SDK_INT >= 33) {
                    Api33Compat.setStreamUseCase(outputConfiguration, outputStream$StreamUseCase.value);
                }
                if (!list.isEmpty()) {
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 31) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            throw Recorder$$ExternalSyntheticOutline2.m(it);
                        }
                    } else {
                        Log.w("CXCP", "Cannot add sensorPixelModeUsed value on API " + i8 + ". This may result in unexpected behavior. Requested " + list);
                    }
                }
                outputConfiguration.getMaxSharedSurfaceCount();
                return new AndroidOutputConfiguration(outputConfiguration);
            }
        }

        public final class Success implements Result {
            public final Map deferred;
            public final Map outputSurfaceMap;

            public Success(Map map, Map map2) {
                map.getClass();
                this.deferred = map;
                this.outputSurfaceMap = map2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.areEqual(this.deferred, success.deferred) && this.outputSurfaceMap.equals(success.outputSurfaceMap);
            }

            public final int hashCode() {
                return this.outputSurfaceMap.hashCode() + (this.deferred.hashCode() * 31);
            }

            public final String toString() {
                return "Success(deferred=" + this.deferred + ", outputSurfaceMap=" + this.outputSurfaceMap + ')';
            }
        }
    }

    Result create(CameraDeviceWrapper cameraDeviceWrapper, Map map, CaptureSessionState captureSessionState);
}
