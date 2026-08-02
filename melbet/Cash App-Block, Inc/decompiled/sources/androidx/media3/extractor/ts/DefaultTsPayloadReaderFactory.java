package androidx.media3.extractor.ts;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import com.google.mlkit.vision.text.zzc;
import com.miteksystems.misnap.camera.a.b;
import com.miteksystems.misnap.camera.a.d;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class DefaultTsPayloadReaderFactory implements CameraSelectorFilter {
    public final List closedCaptionFormats;

    public DefaultTsPayloadReaderFactory() {
        this.closedCaptionFormats = CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(1920, 1080), new Size(1280, 720)});
    }

    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public ArrayList filterCameras(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (isCameraSufficient$camera_release((Camera2CameraInfo) next, true)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (isCameraSufficient$camera_release((Camera2CameraInfo) next2, false)) {
                    arrayList2.add(next2);
                }
            }
        }
        return arrayList2;
    }

    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public MiSnapCameraInfo getCameraInfo(Camera2CameraInfo camera2CameraInfo) {
        List list;
        Object obj;
        boolean z;
        Size[] outputSizes;
        camera2CameraInfo.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) == null || (list = ArraysKt___ArraysKt.toList(outputSizes)) == null) {
            list = EmptyList.INSTANCE;
        }
        List a = b.a(camera2CameraInfo, 35);
        List a2 = b.a(camera2CameraInfo, 256);
        List d = b.d(camera2CameraInfo);
        Boolean bool = (Boolean) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        Integer num = (Integer) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            num = r1;
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        int intValue2 = (num2 != null ? num2 : Integer.MAX_VALUE).intValue();
        boolean z2 = true;
        d dVar = (d.values().length - 1 <= intValue2 || intValue2 < 0) ? d.h : d.values()[intValue2];
        int[] iArr = (int[]) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null || (obj = ArraysKt___ArraysKt.toList(iArr)) == null) {
            obj = EmptyList.INSTANCE;
        }
        list.getClass();
        a.getClass();
        a2.getClass();
        d.getClass();
        dVar.getClass();
        obj.getClass();
        if (intValue == 0) {
            boolean z3 = false;
            b.a aVar = new b.a(d, 0);
            if (aVar.a(1) || aVar.a(3) || aVar.a(2)) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            List list2 = this.closedCaptionFormats;
            Size a3 = b.a(list, list2);
            Size a4 = b.a(a, list2);
            Size a5 = b.a(a2, list2);
            Rational rational = a5 != null ? new Rational(a5.getWidth(), a5.getHeight()) : null;
            if ((a3 == null || a4 == null) && rational != null) {
                if (a3 == null) {
                    a3 = b.a(list, (Size) CollectionsKt.first(list2), rational);
                }
                if (a4 == null) {
                    a4 = b.a(a, (Size) CollectionsKt.first(list2), rational);
                }
                z2 = z;
            }
            if (a3 != null && a4 != null && a5 != null) {
                return new MiSnapCameraInfo(z2, z3, booleanValue, a3, a4, a5, dVar.toString(), b.a(intValue), null, null);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List getClosedCaptionFormats(HuffmanTreeGroup huffmanTreeGroup) {
        String str;
        int i;
        List list;
        ParsableByteArray parsableByteArray = new ParsableByteArray((byte[]) huffmanTreeGroup.trees);
        ArrayList arrayList = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int readUnsignedByte2 = parsableByteArray.position + parsableByteArray.readUnsignedByte();
            if (readUnsignedByte == 134) {
                arrayList = new ArrayList();
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte() & 31;
                for (int i2 = 0; i2 < readUnsignedByte3; i2++) {
                    String readString = parsableByteArray.readString(3, StandardCharsets.UTF_8);
                    int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                    boolean z = (readUnsignedByte4 & 128) != 0;
                    if (z) {
                        i = readUnsignedByte4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte readUnsignedByte5 = (byte) parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    if (z) {
                        boolean z2 = (readUnsignedByte5 & 64) != 0;
                        byte[] bArr = CodecSpecificDataUtil.NAL_START_CODE;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    Format.Builder builder = new Format.Builder();
                    builder.sampleMimeType = MimeTypes.normalizeMimeType(str);
                    builder.language = readString;
                    builder.accessibilityChannel = i;
                    builder.initializationData = list;
                    arrayList.add(new Format(builder));
                }
            }
            parsableByteArray.setPosition(readUnsignedByte2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
    
        if (com.miteksystems.misnap.camera.a.b.a(r2, (android.util.Size) kotlin.collections.CollectionsKt.first(r8), r5) != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010b, code lost:
    
        if (com.miteksystems.misnap.camera.a.b.a(r1, (android.util.Size) kotlin.collections.CollectionsKt.first(r8), r5) != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isCameraSufficient$camera_release(Camera2CameraInfo camera2CameraInfo, boolean z) {
        List list;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        Size[] outputSizes;
        camera2CameraInfo.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) == null || (list = ArraysKt___ArraysKt.toList(outputSizes)) == null) {
            list = EmptyList.INSTANCE;
        }
        List a = b.a(camera2CameraInfo, 35);
        List a2 = b.a(camera2CameraInfo, 256);
        List d = b.d(camera2CameraInfo);
        Integer num = (Integer) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            num = r0;
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        int intValue2 = (num2 != null ? num2 : Integer.MAX_VALUE).intValue();
        d dVar = (d.values().length - 1 <= intValue2 || intValue2 < 0) ? d.h : d.values()[intValue2];
        int[] iArr = (int[]) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null || (obj = ArraysKt___ArraysKt.toList(iArr)) == null) {
            obj = EmptyList.INSTANCE;
        }
        list.getClass();
        a.getClass();
        a2.getClass();
        d.getClass();
        dVar.getClass();
        obj.getClass();
        List<Size> list2 = this.closedCaptionFormats;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Size size : list2) {
                size.getClass();
                if (a2.contains(size)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z5 = intValue == 0;
        Size a3 = b.a(a2, list2);
        Rational rational = a3 != null ? new Rational(a3.getWidth(), a3.getHeight()) : null;
        if (z) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (Size size2 : list2) {
                    size2.getClass();
                    if (list.contains(size2)) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
        } else {
            if (rational != null) {
            }
            z3 = false;
        }
        if (z) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (Size size3 : list2) {
                    size3.getClass();
                    if (a.contains(size3)) {
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = false;
        } else {
            if (rational != null) {
            }
            z4 = false;
        }
        return z5 && z3 && z2 && z4;
    }

    public DefaultTsPayloadReaderFactory(zzc zzcVar) {
        this.closedCaptionFormats = CollectionsKt__CollectionsJVMKt.listOf(zzcVar);
    }

    public DefaultTsPayloadReaderFactory(List list) {
        this.closedCaptionFormats = list;
    }
}
