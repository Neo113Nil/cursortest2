package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class IntrinsicZoomCalculatorImpl {
    public final CameraDevicesImpl cameraDevices;

    public IntrinsicZoomCalculatorImpl(CameraDevicesImpl cameraDevicesImpl) {
        this.cameraDevices = cameraDevicesImpl;
    }

    public static int focalLengthToViewAngleDegrees(float f, float f2) {
        TransactorKt.checkArgument("Focal length should be positive.", f > RecyclerView.DECELERATION_RATE);
        TransactorKt.checkArgument("Sensor length should be positive.", f2 > RecyclerView.DECELERATION_RATE);
        int degrees = (int) Math.toDegrees(Math.atan(f2 / (2.0f * f)) * 2.0d);
        TransactorKt.checkArgumentInRange(degrees, 0, 360, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    public static float getDefaultFocalLength(CameraMetadata cameraMetadata) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
        key.getClass();
        Object obj = ((Camera2CameraMetadata) cameraMetadata).get(key);
        TransactorKt.checkNotNull(obj, "The focal lengths can not be empty.");
        float[] fArr = (float[]) obj;
        TransactorKt.checkState("The focal lengths can not be empty.", !(fArr.length == 0));
        return fArr[0];
    }

    public static float getSensorHorizontalLength(CameraMetadata cameraMetadata) {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
        key.getClass();
        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
        Object obj = camera2CameraMetadata.get(key);
        TransactorKt.checkNotNull(obj, "The sensor size can't be null.");
        SizeF sizeF = (SizeF) obj;
        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key2.getClass();
        Object obj2 = camera2CameraMetadata.get(key2);
        TransactorKt.checkNotNull(obj2, "The sensor orientation can't be null.");
        CameraCharacteristics.Key key3 = CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
        key3.getClass();
        Object obj3 = camera2CameraMetadata.get(key3);
        TransactorKt.checkNotNull(obj3, "The active array size can't be null.");
        Size size = (Size) obj3;
        CameraCharacteristics.Key key4 = CameraCharacteristics.SENSOR_ORIENTATION;
        key4.getClass();
        Object obj4 = camera2CameraMetadata.get(key4);
        TransactorKt.checkNotNull(obj4, "The pixel array size can't be null.");
        int intValue = ((Number) obj4).intValue();
        Size rectToSize = TransformUtils.rectToSize((Rect) obj2);
        if (TransformUtils.is90or270(intValue)) {
            SizeF sizeF2 = new SizeF(sizeF.getHeight(), sizeF.getWidth());
            Size size2 = new Size(rectToSize.getHeight(), rectToSize.getWidth());
            size = new Size(size.getHeight(), size.getWidth());
            rectToSize = size2;
            sizeF = sizeF2;
        }
        return (sizeF.getWidth() * rectToSize.getWidth()) / size.getWidth();
    }

    public final int getDefaultCameraDefaultViewAngleDegrees(CameraMetadata cameraMetadata) {
        CameraDevicesImpl cameraDevicesImpl = this.cameraDevices;
        try {
            ArrayList m92awaitCameraIdsSeavPBo$default = CameraDevicesImpl.m92awaitCameraIdsSeavPBo$default(cameraDevicesImpl);
            TransactorKt.checkNotNull(m92awaitCameraIdsSeavPBo$default, "Failed to get available camera IDs");
            Iterator it = m92awaitCameraIdsSeavPBo$default.iterator();
            while (it.hasNext()) {
                String str = ((CameraId) it.next()).value;
                CameraMetadata m93awaitCameraMetadataFpsL5FU$default = CameraDevicesImpl.m93awaitCameraMetadataFpsL5FU$default(cameraDevicesImpl, str);
                CameraId.m46toStringimpl(str);
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                key.getClass();
                Object obj = ((Camera2CameraMetadata) m93awaitCameraMetadataFpsL5FU$default).get(key);
                TransactorKt.checkNotNull(obj, "Failed to get CameraCharacteristics.LENS_FACING for " + ((Object) CameraId.m46toStringimpl(str)));
                int intValue = ((Number) obj).intValue();
                Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
                Object obj2 = camera2CameraMetadata.get(key);
                TransactorKt.checkNotNull(obj2, "Failed to get the required LENS_FACING for " + ((Object) CameraId.m46toStringimpl(camera2CameraMetadata.camera)));
                if (intValue == ((Number) obj2).intValue()) {
                    return focalLengthToViewAngleDegrees(getDefaultFocalLength(m93awaitCameraMetadataFpsL5FU$default), getSensorHorizontalLength(m93awaitCameraMetadataFpsL5FU$default));
                }
            }
            throw new IllegalStateException("Could not find the default camera for " + ((Object) CameraId.m46toStringimpl(((Camera2CameraMetadata) cameraMetadata).camera)));
        } catch (Exception e) {
            a$$ExternalSyntheticBUOutline0.m("Failed to get a valid view angle", e);
            return 0;
        }
    }
}
