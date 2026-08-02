package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.InputStream$Config;
import androidx.camera.camera2.pipe.MetadataTransform;
import androidx.camera.camera2.pipe.OutputStream$Config;
import androidx.camera.camera2.pipe.OutputStream$DynamicRangeProfile;
import androidx.camera.camera2.pipe.OutputStream$MirrorMode;
import androidx.camera.camera2.pipe.OutputStream$StreamUseCase;
import androidx.camera.camera2.pipe.OutputStream$StreamUseHint;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.media.ImageReaderImageSource;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.GlideBuilder$1;
import dagger.internal.DelegateFactory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.MapBuilderValues;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class StreamGraphImpl implements AutoCloseable {
    public static final StreamGraphImpl$special$$inlined$compareBy$1 previewFormatComparator;
    public static final StreamGraphImpl$special$$inlined$compareBy$1 previewOutputTypesComparator;
    public final LinkedHashMap _streamMap;
    public final CameraGraph$Config graphConfig;
    public final MapBuilder imageSourceMap;
    public final List inputs;
    public final LinkedHashMap outputConfigMap;
    public final List outputConfigs;
    public final ArrayList outputs;
    public final ArrayList streams;
    public static final AtomicInt streamIds = AtomicFU.atomic(0);
    public static final AtomicInt outputIds = AtomicFU.atomic(0);
    public static final AtomicInt inputIds = AtomicFU.atomic(0);
    public static final AtomicInt configIds = AtomicFU.atomic(0);
    public static final AtomicInt groupIds = AtomicFU.atomic(0);
    public static final List previewOutputTypes = CollectionsKt__CollectionsKt.listOf((Object[]) new MetadataTransform.AnonymousClass1[]{MetadataTransform.AnonymousClass1.SURFACE_VIEW, MetadataTransform.AnonymousClass1.SURFACE_TEXTURE});
    public static final List previewFormats = CollectionsKt__CollectionsKt.listOf((Object[]) new StreamFormat[]{new StreamFormat(0), new StreamFormat(34)});

    public final class InputStreamImpl {

        /* renamed from: format, reason: collision with root package name */
        public final int f840format;
        public final int id;

        public InputStreamImpl(int i, int i2) {
            this.id = i;
            this.f840format = i2;
        }
    }

    public final class OutputConfig {
        public final String camera;
        public final MetadataTransform.AnonymousClass1 deferredOutputType;
        public final OutputStream$DynamicRangeProfile dynamicRangeProfile;

        /* renamed from: format, reason: collision with root package name */
        public final int f841format;
        public final Integer groupNumber;
        public final int id;
        public final OutputStream$MirrorMode mirrorMode;
        public final List sensorPixelModes;
        public final Size size;
        public final ArrayList streamBuilder;
        public final OutputStream$StreamUseCase streamUseCase;
        public final OutputStream$StreamUseHint streamUseHint;

        public OutputConfig(int i, Size size, int i2, String str, Integer num, MetadataTransform.AnonymousClass1 anonymousClass1, OutputStream$MirrorMode outputStream$MirrorMode, OutputStream$DynamicRangeProfile outputStream$DynamicRangeProfile, OutputStream$StreamUseCase outputStream$StreamUseCase, OutputStream$StreamUseHint outputStream$StreamUseHint, List list) {
            size.getClass();
            str.getClass();
            this.id = i;
            this.size = size;
            this.f841format = i2;
            this.camera = str;
            this.groupNumber = num;
            this.deferredOutputType = anonymousClass1;
            this.mirrorMode = outputStream$MirrorMode;
            this.dynamicRangeProfile = outputStream$DynamicRangeProfile;
            this.streamUseCase = outputStream$StreamUseCase;
            this.streamUseHint = outputStream$StreamUseHint;
            this.sensorPixelModes = list;
            this.streamBuilder = new ArrayList();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id, "OutputConfig-");
        }
    }

    public final class OutputStreamImpl {
        public final String camera;
        public final OutputStream$DynamicRangeProfile dynamicRangeProfile;

        /* renamed from: format, reason: collision with root package name */
        public final int f842format;
        public final int id;
        public final OutputStream$MirrorMode mirrorMode;
        public final MetadataTransform.AnonymousClass1 outputType;
        public final Size size;
        public CameraStream stream;
        public final OutputStream$StreamUseCase streamUseCase;
        public final OutputStream$StreamUseHint streamUseHint;

        public OutputStreamImpl(int i, int i2, Size size, MetadataTransform.AnonymousClass1 anonymousClass1, OutputStream$DynamicRangeProfile outputStream$DynamicRangeProfile, OutputStream$MirrorMode outputStream$MirrorMode, OutputStream$StreamUseCase outputStream$StreamUseCase, OutputStream$StreamUseHint outputStream$StreamUseHint, String str) {
            size.getClass();
            str.getClass();
            this.id = i;
            this.size = size;
            this.f842format = i2;
            this.camera = str;
            this.mirrorMode = outputStream$MirrorMode;
            this.dynamicRangeProfile = outputStream$DynamicRangeProfile;
            this.streamUseCase = outputStream$StreamUseCase;
            this.outputType = anonymousClass1;
            this.streamUseHint = outputStream$StreamUseHint;
        }

        public final boolean isValidForHighSpeedOperatingMode() {
            OutputStream$StreamUseHint outputStream$StreamUseHint;
            OutputStream$StreamUseCase outputStream$StreamUseCase = this.streamUseCase;
            if (outputStream$StreamUseCase == null) {
                return true;
            }
            long j = outputStream$StreamUseCase.value;
            if (OutputStream$StreamUseCase.m51equalsimpl0(j, 0L) || OutputStream$StreamUseCase.m51equalsimpl0(j, 1L) || OutputStream$StreamUseCase.m51equalsimpl0(j, 3L) || (outputStream$StreamUseHint = this.streamUseHint) == null) {
                return true;
            }
            long j2 = outputStream$StreamUseHint.value;
            return OutputStream$StreamUseHint.m52equalsimpl0(j2, 0L) || OutputStream$StreamUseHint.m52equalsimpl0(j2, 1L);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id, "Output-");
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$1] */
    static {
        final int i = 0;
        previewOutputTypesComparator = new Comparator() { // from class: androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        Iterator it = ((CameraStream) obj).outputs.iterator();
                        if (it.hasNext()) {
                            StreamGraphImpl.OutputStreamImpl outputStreamImpl = (StreamGraphImpl.OutputStreamImpl) it.next();
                            Integer valueOf = Integer.valueOf(CollectionsKt.indexOf(outputStreamImpl.outputType, StreamGraphImpl.previewOutputTypes));
                            while (it.hasNext()) {
                                StreamGraphImpl.OutputStreamImpl outputStreamImpl2 = (StreamGraphImpl.OutputStreamImpl) it.next();
                                Integer valueOf2 = Integer.valueOf(CollectionsKt.indexOf(outputStreamImpl2.outputType, StreamGraphImpl.previewOutputTypes));
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                            Iterator it2 = ((CameraStream) obj2).outputs.iterator();
                            if (it2.hasNext()) {
                                StreamGraphImpl.OutputStreamImpl outputStreamImpl3 = (StreamGraphImpl.OutputStreamImpl) it2.next();
                                Integer valueOf3 = Integer.valueOf(CollectionsKt.indexOf(outputStreamImpl3.outputType, StreamGraphImpl.previewOutputTypes));
                                while (it2.hasNext()) {
                                    StreamGraphImpl.OutputStreamImpl outputStreamImpl4 = (StreamGraphImpl.OutputStreamImpl) it2.next();
                                    Integer valueOf4 = Integer.valueOf(CollectionsKt.indexOf(outputStreamImpl4.outputType, StreamGraphImpl.previewOutputTypes));
                                    if (valueOf3.compareTo(valueOf4) < 0) {
                                        valueOf3 = valueOf4;
                                    }
                                }
                                break;
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                    default:
                        Iterator it3 = ((CameraStream) obj).outputs.iterator();
                        if (it3.hasNext()) {
                            Integer valueOf5 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(new StreamFormat(((StreamGraphImpl.OutputStreamImpl) it3.next()).f842format)));
                            while (it3.hasNext()) {
                                Integer valueOf6 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(new StreamFormat(((StreamGraphImpl.OutputStreamImpl) it3.next()).f842format)));
                                if (valueOf5.compareTo(valueOf6) < 0) {
                                    valueOf5 = valueOf6;
                                }
                            }
                            Iterator it4 = ((CameraStream) obj2).outputs.iterator();
                            if (it4.hasNext()) {
                                Integer valueOf7 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(new StreamFormat(((StreamGraphImpl.OutputStreamImpl) it4.next()).f842format)));
                                while (it4.hasNext()) {
                                    Integer valueOf8 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(new StreamFormat(((StreamGraphImpl.OutputStreamImpl) it4.next()).f842format)));
                                    if (valueOf7.compareTo(valueOf8) < 0) {
                                        valueOf7 = valueOf8;
                                    }
                                }
                                break;
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                }
                return 0;
            }
        };
        final int i2 = 1;
        previewFormatComparator = new Comparator() { // from class: androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        Iterator it = ((CameraStream) obj).outputs.iterator();
                        if (it.hasNext()) {
                            StreamGraphImpl.OutputStreamImpl outputStreamImpl = (StreamGraphImpl.OutputStreamImpl) it.next();
                            Integer valueOf = Integer.valueOf(CollectionsKt.indexOf(outputStreamImpl.outputType, StreamGraphImpl.previewOutputTypes));
                            while (it.hasNext()) {
                                StreamGraphImpl.OutputStreamImpl outputStreamImpl2 = (StreamGraphImpl.OutputStreamImpl) it.next();
                                Integer valueOf2 = Integer.valueOf(CollectionsKt.indexOf(outputStreamImpl2.outputType, StreamGraphImpl.previewOutputTypes));
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                            Iterator it2 = ((CameraStream) obj2).outputs.iterator();
                            if (it2.hasNext()) {
                                StreamGraphImpl.OutputStreamImpl outputStreamImpl3 = (StreamGraphImpl.OutputStreamImpl) it2.next();
                                Integer valueOf3 = Integer.valueOf(CollectionsKt.indexOf(outputStreamImpl3.outputType, StreamGraphImpl.previewOutputTypes));
                                while (it2.hasNext()) {
                                    StreamGraphImpl.OutputStreamImpl outputStreamImpl4 = (StreamGraphImpl.OutputStreamImpl) it2.next();
                                    Integer valueOf4 = Integer.valueOf(CollectionsKt.indexOf(outputStreamImpl4.outputType, StreamGraphImpl.previewOutputTypes));
                                    if (valueOf3.compareTo(valueOf4) < 0) {
                                        valueOf3 = valueOf4;
                                    }
                                }
                                break;
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                    default:
                        Iterator it3 = ((CameraStream) obj).outputs.iterator();
                        if (it3.hasNext()) {
                            Integer valueOf5 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(new StreamFormat(((StreamGraphImpl.OutputStreamImpl) it3.next()).f842format)));
                            while (it3.hasNext()) {
                                Integer valueOf6 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(new StreamFormat(((StreamGraphImpl.OutputStreamImpl) it3.next()).f842format)));
                                if (valueOf5.compareTo(valueOf6) < 0) {
                                    valueOf5 = valueOf6;
                                }
                            }
                            Iterator it4 = ((CameraStream) obj2).outputs.iterator();
                            if (it4.hasNext()) {
                                Integer valueOf7 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(new StreamFormat(((StreamGraphImpl.OutputStreamImpl) it4.next()).f842format)));
                                while (it4.hasNext()) {
                                    Integer valueOf8 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(new StreamFormat(((StreamGraphImpl.OutputStreamImpl) it4.next()).f842format)));
                                    if (valueOf7.compareTo(valueOf8) < 0) {
                                        valueOf7 = valueOf8;
                                    }
                                }
                                break;
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                }
                return 0;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [androidx.camera.camera2.pipe.OutputStream$Config$LazyOutputConfig] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StreamGraphImpl(CameraMetadata cameraMetadata, CameraGraph$Config cameraGraph$Config, GlideBuilder$1 glideBuilder$1, DelegateFactory delegateFactory) {
        boolean z;
        Iterator it;
        CameraGraph$Config cameraGraph$Config2;
        ?? r6;
        MetadataTransform.AnonymousClass1 anonymousClass1;
        Integer num;
        cameraMetadata.getClass();
        cameraGraph$Config.getClass();
        delegateFactory.getClass();
        this.graphConfig = cameraGraph$Config;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (cameraGraph$Config.sessionMode == 0) {
            CameraMetadata.Companion.getClass();
            if (!CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata)) {
                CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                key.getClass();
                Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
                Integer num2 = (Integer) camera2CameraMetadata.get(key);
                if ((num2 == null || num2.intValue() != 0) && ((num = (Integer) camera2CameraMetadata.get(key)) == null || num.intValue() != 4)) {
                    z = true;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    it = cameraGraph$Config.exclusiveStreamGroups.iterator();
                    while (true) {
                        MetadataTransform.AnonymousClass1 anonymousClass12 = null;
                        if (it.hasNext()) {
                            Iterator it2 = this.graphConfig.streams.iterator();
                            while (it2.hasNext()) {
                                CameraStream.Config config = (CameraStream.Config) it2.next();
                                for (OutputStream$Config outputStream$Config : config.outputs) {
                                    if (!linkedHashMap.containsKey(outputStream$Config)) {
                                        AtomicInt atomicInt = configIds;
                                        atomicInt.getClass();
                                        int incrementAndGet = AtomicInt.FU.incrementAndGet(atomicInt);
                                        Size size = outputStream$Config.size;
                                        int i = outputStream$Config.f838format;
                                        String str = outputStream$Config.camera;
                                        String str2 = str == null ? this.graphConfig.camera : str;
                                        Integer num3 = (Integer) linkedHashMap3.get(config);
                                        if (z) {
                                            ?? r15 = outputStream$Config instanceof OutputStream$Config.LazyOutputConfig ? (OutputStream$Config.LazyOutputConfig) outputStream$Config : anonymousClass12;
                                            if (r15 != 0) {
                                                anonymousClass1 = r15.outputType;
                                                OutputConfig outputConfig = new OutputConfig(incrementAndGet, size, i, str2, num3, anonymousClass1, outputStream$Config.mirrorMode, outputStream$Config.dynamicRangeProfile, outputStream$Config.streamUseCase, outputStream$Config.streamUseHint, outputStream$Config.sensorPixelModes);
                                                linkedHashMap.put(outputStream$Config, outputConfig);
                                                arrayList.add(outputConfig);
                                                it2 = it2;
                                                anonymousClass12 = null;
                                            }
                                        }
                                        anonymousClass1 = anonymousClass12;
                                        OutputConfig outputConfig2 = new OutputConfig(incrementAndGet, size, i, str2, num3, anonymousClass1, outputStream$Config.mirrorMode, outputStream$Config.dynamicRangeProfile, outputStream$Config.streamUseCase, outputStream$Config.streamUseHint, outputStream$Config.sensorPixelModes);
                                        linkedHashMap.put(outputStream$Config, outputConfig2);
                                        arrayList.add(outputConfig2);
                                        it2 = it2;
                                        anonymousClass12 = null;
                                    }
                                }
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int size2 = this.graphConfig.streams.size();
                            int i2 = 0;
                            while (true) {
                                cameraGraph$Config2 = this.graphConfig;
                                if (i2 >= size2) {
                                    break;
                                }
                                CameraStream.Config config2 = (CameraStream.Config) cameraGraph$Config2.streams.get(i2);
                                List list = config2.outputs;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    Object obj = linkedHashMap.get((OutputStream$Config) it3.next());
                                    obj.getClass();
                                    OutputConfig outputConfig3 = (OutputConfig) obj;
                                    AtomicInt atomicInt2 = outputIds;
                                    atomicInt2.getClass();
                                    OutputStreamImpl outputStreamImpl = new OutputStreamImpl(AtomicInt.FU.incrementAndGet(atomicInt2), outputConfig3.f841format, outputConfig3.size, outputConfig3.deferredOutputType, outputConfig3.dynamicRangeProfile, outputConfig3.mirrorMode, outputConfig3.streamUseCase, outputConfig3.streamUseHint, outputConfig3.camera);
                                    linkedHashMap4.put(outputStreamImpl, outputConfig3);
                                    arrayList3.add(outputStreamImpl);
                                    size2 = size2;
                                }
                                int i3 = size2;
                                AtomicInt atomicInt3 = streamIds;
                                atomicInt3.getClass();
                                CameraStream cameraStream = new CameraStream(AtomicInt.FU.incrementAndGet(atomicInt3), arrayList3);
                                linkedHashMap2.put(config2, cameraStream);
                                arrayList2.add(cameraStream);
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    OutputStreamImpl outputStreamImpl2 = (OutputStreamImpl) it4.next();
                                    outputStreamImpl2.getClass();
                                    outputStreamImpl2.stream = cameraStream;
                                }
                                Iterator it5 = config2.outputs.iterator();
                                while (it5.hasNext()) {
                                    Object obj2 = linkedHashMap.get((OutputStream$Config) it5.next());
                                    obj2.getClass();
                                    ((OutputConfig) obj2).streamBuilder.add(cameraStream);
                                }
                                i2++;
                                size2 = i3;
                            }
                            ArrayList<InputStream$Config> arrayList4 = cameraGraph$Config2.input;
                            if (arrayList4 != null) {
                                r6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                                for (InputStream$Config inputStream$Config : arrayList4) {
                                    AtomicInt atomicInt4 = inputIds;
                                    atomicInt4.getClass();
                                    int incrementAndGet2 = AtomicInt.FU.incrementAndGet(atomicInt4);
                                    inputStream$Config.getClass();
                                    r6.add(new InputStreamImpl(incrementAndGet2, inputStream$Config.streamFormat));
                                }
                            } else {
                                r6 = EmptyList.INSTANCE;
                            }
                            this.inputs = r6;
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it6 = arrayList2.iterator();
                            while (it6.hasNext()) {
                                Object next = it6.next();
                                ArrayList arrayList7 = ((CameraStream) next).outputs;
                                if (!arrayList7.isEmpty()) {
                                    Iterator it7 = arrayList7.iterator();
                                    while (it7.hasNext()) {
                                        OutputStream$StreamUseCase outputStream$StreamUseCase = ((OutputStreamImpl) it7.next()).streamUseCase;
                                        if (outputStream$StreamUseCase == null ? false : OutputStream$StreamUseCase.m51equalsimpl0(outputStream$StreamUseCase.value, 1L)) {
                                            arrayList5.add(next);
                                            break;
                                        }
                                    }
                                }
                                arrayList6.add(next);
                            }
                            if (arrayList5.isEmpty()) {
                                ArrayList arrayList8 = new ArrayList();
                                ArrayList arrayList9 = new ArrayList();
                                Iterator it8 = arrayList2.iterator();
                                while (it8.hasNext()) {
                                    Object next2 = it8.next();
                                    ArrayList arrayList10 = ((CameraStream) next2).outputs;
                                    if (!arrayList10.isEmpty()) {
                                        Iterator it9 = arrayList10.iterator();
                                        while (it9.hasNext()) {
                                            if (CollectionsKt.contains(previewOutputTypes, ((OutputStreamImpl) it9.next()).outputType)) {
                                                arrayList8.add(next2);
                                                break;
                                            }
                                        }
                                    }
                                    arrayList9.add(next2);
                                }
                                if (arrayList8.isEmpty()) {
                                    ArrayList arrayList11 = new ArrayList();
                                    ArrayList arrayList12 = new ArrayList();
                                    Iterator it10 = arrayList2.iterator();
                                    while (it10.hasNext()) {
                                        Object next3 = it10.next();
                                        ArrayList arrayList13 = ((CameraStream) next3).outputs;
                                        if (!arrayList13.isEmpty()) {
                                            Iterator it11 = arrayList13.iterator();
                                            while (it11.hasNext()) {
                                                if (previewFormats.contains(new StreamFormat(((OutputStreamImpl) it11.next()).f842format))) {
                                                    arrayList11.add(next3);
                                                    break;
                                                }
                                            }
                                        }
                                        arrayList12.add(next3);
                                    }
                                    if (!arrayList11.isEmpty()) {
                                        arrayList2 = CollectionsKt.plus((Iterable) arrayList12, (Collection) CollectionsKt.sortedWith(arrayList11, previewFormatComparator));
                                    }
                                } else {
                                    arrayList2 = CollectionsKt.plus((Iterable) arrayList9, (Collection) CollectionsKt.sortedWith(arrayList8, previewOutputTypesComparator));
                                }
                            } else {
                                arrayList2 = CollectionsKt.plus((Iterable) arrayList6, (Collection) arrayList5);
                            }
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = new ArrayList();
                            for (Object obj3 : arrayList2) {
                                ArrayList arrayList16 = ((CameraStream) obj3).outputs;
                                if (!arrayList16.isEmpty()) {
                                    Iterator it12 = arrayList16.iterator();
                                    while (it12.hasNext()) {
                                        OutputStream$StreamUseCase outputStream$StreamUseCase2 = ((OutputStreamImpl) it12.next()).streamUseCase;
                                        if (outputStream$StreamUseCase2 == null ? false : OutputStream$StreamUseCase.m51equalsimpl0(outputStream$StreamUseCase2.value, 3L)) {
                                            arrayList14.add(obj3);
                                            break;
                                        }
                                    }
                                }
                                arrayList15.add(obj3);
                            }
                            if (arrayList14.isEmpty()) {
                                ArrayList arrayList17 = new ArrayList();
                                ArrayList arrayList18 = new ArrayList();
                                for (Object obj4 : arrayList2) {
                                    ArrayList arrayList19 = ((CameraStream) obj4).outputs;
                                    if (!arrayList19.isEmpty()) {
                                        Iterator it13 = arrayList19.iterator();
                                        while (it13.hasNext()) {
                                            OutputStream$StreamUseHint outputStream$StreamUseHint = ((OutputStreamImpl) it13.next()).streamUseHint;
                                            if (outputStream$StreamUseHint == null ? false : OutputStream$StreamUseHint.m52equalsimpl0(outputStream$StreamUseHint.value, 1L)) {
                                                arrayList17.add(obj4);
                                                break;
                                            }
                                        }
                                    }
                                    arrayList18.add(obj4);
                                }
                                if (!arrayList17.isEmpty()) {
                                    arrayList2 = CollectionsKt.plus((Iterable) arrayList17, (Collection) arrayList18);
                                }
                            } else {
                                arrayList2 = CollectionsKt.plus((Iterable) arrayList14, (Collection) arrayList15);
                            }
                            this.streams = arrayList2;
                            ArrayList arrayList20 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                            Iterator it14 = arrayList2.iterator();
                            while (it14.hasNext()) {
                                arrayList20.add(new StreamId(((CameraStream) it14.next()).id));
                            }
                            CollectionsKt.toSet(arrayList20);
                            this._streamMap = linkedHashMap2;
                            this.outputConfigs = CollectionsKt.sortedWith(arrayList, new SemanticsSortKt$special$$inlined$thenBy$1(this, 1));
                            this.outputConfigMap = linkedHashMap4;
                            ArrayList arrayList21 = this.streams;
                            ArrayList arrayList22 = new ArrayList();
                            Iterator it15 = arrayList21.iterator();
                            while (it15.hasNext()) {
                                CollectionsKt__MutableCollectionsKt.addAll(((CameraStream) it15.next()).outputs, arrayList22);
                            }
                            this.outputs = arrayList22;
                            MapBuilder mapBuilder = new MapBuilder();
                            Iterator it16 = this.graphConfig.streams.iterator();
                            while (it16.hasNext()) {
                                ((CameraStream.Config) it16.next()).getClass();
                            }
                            this.imageSourceMap = mapBuilder.build();
                            return;
                        }
                        List<CameraStream.Config> list2 = (List) it.next();
                        if (list2.isEmpty()) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            throw null;
                        }
                        List list3 = this.graphConfig.streams;
                        ArrayList arrayList23 = new ArrayList();
                        Iterator it17 = list3.iterator();
                        while (it17.hasNext()) {
                            CollectionsKt__MutableCollectionsKt.addAll(((CameraStream.Config) it17.next()).outputs, arrayList23);
                        }
                        ArrayList arrayList24 = new ArrayList();
                        Iterator it18 = arrayList23.iterator();
                        while (it18.hasNext()) {
                            it18.next();
                        }
                        ArrayList arrayList25 = new ArrayList();
                        Iterator it19 = arrayList24.iterator();
                        if (it19.hasNext()) {
                            throw Recorder$$ExternalSyntheticOutline2.m(it19);
                        }
                        AtomicInt atomicInt5 = groupIds;
                        atomicInt5.getClass();
                        int incrementAndGet3 = AtomicInt.FU.incrementAndGet(atomicInt5);
                        while (arrayList25.contains(Integer.valueOf(incrementAndGet3))) {
                            incrementAndGet3 = AtomicInt.FU.incrementAndGet(atomicInt5);
                        }
                        for (CameraStream.Config config3 : list2) {
                            if (linkedHashMap3.containsKey(config3)) {
                                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                                throw null;
                            }
                            linkedHashMap3.put(config3, Integer.valueOf(incrementAndGet3));
                        }
                    }
                }
            }
        }
        z = false;
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        it = cameraGraph$Config.exclusiveStreamGroups.iterator();
        while (true) {
            MetadataTransform.AnonymousClass1 anonymousClass122 = null;
            if (it.hasNext()) {
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        Iterator it = ((MapBuilderValues) this.imageSourceMap.values()).iterator();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (ImageReaderImageSource) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    Path$$ExternalSyntheticBUOutline0.m$3();
                    return;
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    /* renamed from: get-aKI5c8E, reason: not valid java name */
    public final CameraStream m89getaKI5c8E(int i) {
        Object obj;
        Iterator it = this.streams.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CameraStream) obj).id == i) {
                break;
            }
        }
        return (CameraStream) obj;
    }

    /* renamed from: getCameraStreamConfig-aKI5c8E, reason: not valid java name */
    public final CameraStream.Config m90getCameraStreamConfigaKI5c8E(int i) {
        Object obj;
        Iterator it = this._streamMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CameraStream) ((Map.Entry) obj).getValue()).id == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (CameraStream.Config) entry.getKey();
        }
        return null;
    }

    public final String toString() {
        return "StreamGraph(" + this._streamMap + ')';
    }
}
