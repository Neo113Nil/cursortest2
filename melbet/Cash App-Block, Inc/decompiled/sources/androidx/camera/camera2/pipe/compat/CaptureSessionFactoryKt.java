package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.MetadataTransform;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader;
import androidx.camera.camera2.pipe.media.ImageReaderImageSource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.MapBuilderEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public abstract class CaptureSessionFactoryKt {
    public static final DurationNs[] activeResumeCameraRetryThresholds = {new DurationNs(120000000000L), new DurationNs(300000000000L)};

    public static final MapBuilder access$buildSimpleOutputSurfaceMap(Map map, StreamGraphImpl streamGraphImpl) {
        MapBuilder mapBuilder = new MapBuilder();
        for (CameraStream cameraStream : streamGraphImpl.streams) {
            Surface surface = (Surface) map.get(new StreamId(cameraStream.id));
            if (surface != null) {
                Iterator it = cameraStream.outputs.iterator();
                while (it.hasNext()) {
                    mapBuilder.put(new OutputId(((StreamGraphImpl.OutputStreamImpl) it.next()).id), surface);
                }
            }
        }
        return mapBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final OutputConfigurations buildOutputConfigurations(CameraGraph$Config cameraGraph$Config, StreamGraphImpl streamGraphImpl, Map map) {
        LinkedHashMap linkedHashMap;
        OutputConfigurations outputConfigurations;
        ImageReaderImageSource imageReaderImageSource;
        CameraStream m89getaKI5c8E;
        cameraGraph$Config.getClass();
        String str = cameraGraph$Config.camera;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        MapBuilder mapBuilder = streamGraphImpl.imageSourceMap;
        LinkedHashMap linkedHashMap5 = streamGraphImpl.outputConfigMap;
        Iterator it = ((MapBuilderEntries) mapBuilder.entrySet()).iterator();
        do {
            int i = 1;
            OutputConfigurations outputConfigurations2 = null;
            if (!it.hasNext()) {
                for (CameraStream cameraStream : streamGraphImpl.streams) {
                    ArrayList arrayList2 = cameraStream.outputs;
                    int i2 = cameraStream.id;
                    if (arrayList2.size() == i) {
                        Surface surface = (Surface) map.get(new StreamId(i2));
                        if (surface != null) {
                            linkedHashMap3.put(new OutputId(((StreamGraphImpl.OutputStreamImpl) CollectionsKt.single((List) arrayList2)).id), surface);
                        }
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            StreamGraphImpl.OutputStreamImpl outputStreamImpl = (StreamGraphImpl.OutputStreamImpl) it2.next();
                            Object obj = linkedHashMap5.get(outputStreamImpl);
                            OutputConfigurations outputConfigurations3 = outputConfigurations2;
                            if (obj == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                                return outputConfigurations3;
                            }
                            OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap4.get((StreamGraphImpl.OutputConfig) obj);
                            Surface surface2 = outputConfiguration != null ? outputConfiguration.getSurface() : (Surface) map.get(new StreamId(i2));
                            if (surface2 != null) {
                                linkedHashMap3.put(new OutputId(outputStreamImpl.id), surface2);
                                outputConfigurations2 = outputConfigurations3;
                                i = 1;
                            } else {
                                outputConfigurations2 = outputConfigurations3;
                            }
                        }
                    }
                }
                OutputConfigurations outputConfigurations4 = outputConfigurations2;
                Iterator it3 = streamGraphImpl.outputConfigs.iterator();
                OutputConfigurations outputConfigurations5 = outputConfigurations4;
                while (it3.hasNext()) {
                    StreamGraphImpl.OutputConfig outputConfig = (StreamGraphImpl.OutputConfig) it3.next();
                    ArrayList arrayList3 = outputConfig.streamBuilder;
                    ArrayList arrayList4 = outputConfig.streamBuilder;
                    List list = outputConfig.sensorPixelModes;
                    MetadataTransform.AnonymousClass1 anonymousClass1 = outputConfig.deferredOutputType;
                    Integer num = outputConfig.groupNumber;
                    Iterator it4 = it3;
                    String str2 = outputConfig.camera;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        List list2 = list;
                        MetadataTransform.AnonymousClass1 anonymousClass12 = anonymousClass1;
                        Surface surface3 = (Surface) map.get(new StreamId(((CameraStream) it5.next()).id));
                        if (surface3 != null) {
                            arrayList5.add(surface3);
                        }
                        anonymousClass1 = anonymousClass12;
                        list = list2;
                    }
                    List list3 = list;
                    MetadataTransform.AnonymousClass1 anonymousClass13 = anonymousClass1;
                    OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap4.get(outputConfig);
                    LinkedHashMap linkedHashMap6 = linkedHashMap4;
                    if (outputConfiguration2 == null) {
                        if (anonymousClass13 != null) {
                            linkedHashMap = linkedHashMap3;
                            outputConfigurations = outputConfigurations5;
                            if (arrayList5.size() != arrayList3.size()) {
                                AndroidOutputConfiguration m75creategWWoySg$default = CaptureSessionFactory.Result.Failed.m75creategWWoySg$default(null, null, anonymousClass13, outputConfig.mirrorMode, outputConfig.dynamicRangeProfile, outputConfig.streamUseCase, list3, outputConfig.size, arrayList4.size() > 1, num != null ? num.intValue() : -1, !Intrinsics.areEqual(str2, str) ? str2 : outputConfigurations4, 2);
                                if (m75creategWWoySg$default == null) {
                                    Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + outputConfig);
                                } else {
                                    arrayList.add(m75creategWWoySg$default);
                                    Iterator it6 = arrayList3.iterator();
                                    while (it6.hasNext()) {
                                        linkedHashMap2.put(new StreamId(((CameraStream) it6.next()).id), m75creategWWoySg$default);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap3;
                            outputConfigurations = outputConfigurations5;
                        }
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it7 = arrayList3.iterator();
                            while (it7.hasNext()) {
                                Object next = it7.next();
                                if (!map.containsKey(new StreamId(((CameraStream) next).id))) {
                                    arrayList6.add(next);
                                }
                            }
                            f$$ExternalSyntheticLambda0.m(33, outputConfig, "! Missing surfaces for ", arrayList6, "Surfaces are not yet available for ");
                            return outputConfigurations4;
                        }
                        AndroidOutputConfiguration m75creategWWoySg$default2 = CaptureSessionFactory.Result.Failed.m75creategWWoySg$default((Surface) CollectionsKt.first((List) arrayList5), null, null, outputConfig.mirrorMode, outputConfig.dynamicRangeProfile, outputConfig.streamUseCase, list3, outputConfig.size, arrayList4.size() > 1, num != null ? num.intValue() : -1, !Intrinsics.areEqual(str2, str) ? str2 : outputConfigurations4, 6);
                        if (m75creategWWoySg$default2 == 0) {
                            Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + outputConfig);
                        } else {
                            for (Surface surface4 : CollectionsKt.drop(arrayList5, 1)) {
                                surface4.getClass();
                                m75creategWWoySg$default2.output.addSurface(surface4);
                            }
                            CameraStream.Config config = cameraGraph$Config.postviewStream;
                            if (config != null) {
                                CameraStream cameraStream2 = (CameraStream) streamGraphImpl._streamMap.get(config);
                                if (cameraStream2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                    return outputConfigurations4;
                                }
                                if (outputConfigurations == null && arrayList3.contains(cameraStream2)) {
                                    outputConfigurations5 = m75creategWWoySg$default2;
                                    it3 = it4;
                                    linkedHashMap4 = linkedHashMap6;
                                    linkedHashMap3 = linkedHashMap;
                                } else {
                                    arrayList.add(m75creategWWoySg$default2);
                                }
                            } else {
                                arrayList.add(m75creategWWoySg$default2);
                            }
                            it3 = it4;
                            linkedHashMap4 = linkedHashMap6;
                            linkedHashMap3 = linkedHashMap;
                            outputConfigurations5 = outputConfigurations;
                        }
                    } else {
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it8 = arrayList3.iterator();
                            while (it8.hasNext()) {
                                Object next2 = it8.next();
                                if (!map.containsKey(new StreamId(((CameraStream) next2).id))) {
                                    arrayList7.add(next2);
                                }
                            }
                            f$$ExternalSyntheticLambda0.m(33, outputConfig, "! Missing surfaces for ", arrayList7, "Surfaces are not yet available for ");
                            return outputConfigurations4;
                        }
                        arrayList.add(new AndroidOutputConfiguration(outputConfiguration2));
                        linkedHashMap = linkedHashMap3;
                        outputConfigurations = outputConfigurations5;
                    }
                    it3 = it4;
                    linkedHashMap4 = linkedHashMap6;
                    linkedHashMap3 = linkedHashMap;
                    outputConfigurations5 = outputConfigurations;
                }
                return new OutputConfigurations(arrayList, linkedHashMap2, outputConfigurations5, linkedHashMap3);
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i3 = ((StreamId) entry.getKey()).value;
            imageReaderImageSource = (ImageReaderImageSource) entry.getValue();
            m89getaKI5c8E = streamGraphImpl.m89getaKI5c8E(i3);
            if (m89getaKI5c8E == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return null;
            }
        } while (m89getaKI5c8E.outputs.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot configure multiple outputs pre-S!");
            return null;
        }
        Reflection.factory.getOrCreateKotlinClass(AndroidMultiResolutionImageReader.class);
        imageReaderImageSource.getClass();
        throw null;
    }
}
