package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import androidx.core.graphics.TypefaceCompat$$ExternalSyntheticApiModelOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes3.dex */
public abstract class Api31Compat {
    public static final Map getPhysicalCameraTotalResults(TotalCaptureResult totalCaptureResult) {
        totalCaptureResult.getClass();
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static final List getSupportedExtensions(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        List<Integer> supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
        supportedExtensions.getClass();
        return supportedExtensions;
    }

    public static final InputConfiguration newInputConfiguration(String str, List list) {
        list.getClass();
        str.getClass();
        if (list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("Call to create InputConfiguration but list of InputConfigData is empty.");
            return null;
        }
        if (list.size() == 1) {
            InputConfigData inputConfigData = (InputConfigData) CollectionsKt.first(list);
            return new InputConfiguration(inputConfigData.width, inputConfigData.height, inputConfigData.f839format);
        }
        List<InputConfigData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (InputConfigData inputConfigData2 : list2) {
            TypefaceCompat$$ExternalSyntheticApiModelOutline0.m();
            arrayList.add(TypefaceCompat$$ExternalSyntheticApiModelOutline0.m(inputConfigData2.width, inputConfigData2.height, str));
        }
        return TypefaceCompat$$ExternalSyntheticApiModelOutline0.m(((InputConfigData) CollectionsKt.first(list)).f839format, arrayList);
    }
}
