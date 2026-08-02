package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class Camera2CameraMetadata implements CameraMetadata {
    public final Lazy _keys;
    public final Lazy _physicalCameraIds;
    public final Lazy _physicalRequestKeys;
    public final Lazy _requestKeys;
    public final Lazy _resultKeys;
    public final Lazy _sessionCharacteristicsKeys;
    public final Lazy _sessionKeys;
    public final Lazy _supportedExtensions;
    public final Set cacheBlocklist;
    public final String camera;
    public final CameraCharacteristics characteristics;
    public final ArrayMap extensionCache;
    public final Camera2MetadataCache metadataProvider;
    public final ArrayMap values;

    public Camera2CameraMetadata(String str, CameraCharacteristics cameraCharacteristics, Camera2MetadataCache camera2MetadataCache, EmptyMap emptyMap, Set set) {
        str.getClass();
        emptyMap.getClass();
        set.getClass();
        this.camera = str;
        this.characteristics = cameraCharacteristics;
        this.metadataProvider = camera2MetadataCache;
        this.cacheBlocklist = set;
        this.values = new ArrayMap();
        this.extensionCache = new ArrayMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this._supportedExtensions = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda0
            public final /* synthetic */ Camera2CameraMetadata f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Camera2CameraMetadata camera2CameraMetadata = this.f$0;
                switch (i2) {
                    case 0:
                        String str2 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) CameraId.m46toStringimpl(str2)) + "#supportedExtensions");
                                Camera2MetadataCache camera2MetadataCache2 = camera2CameraMetadata.metadataProvider;
                                str2.getClass();
                                Object set2 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.toSet(Api31Compat.getSupportedExtensions(camera2MetadataCache2.m73getCameraExtensionCharacteristicsEfqyGwQ(str2))) : EmptySet.INSTANCE;
                                Trace.endSection();
                                return set2;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) CameraId.m46toStringimpl(str2)), e);
                            return EmptySet.INSTANCE;
                        }
                    case 1:
                        String str3 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                                if (keys == null) {
                                    keys = EmptyList.INSTANCE;
                                }
                                Set set3 = CollectionsKt.toSet(keys);
                                Trace.endSection();
                                return set3;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) CameraId.m46toStringimpl(str3)) + '}', e2);
                            return EmptySet.INSTANCE;
                        }
                    case 2:
                        String str4 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set4 = CollectionsKt.toSet(availableCaptureRequestKeys);
                                Trace.endSection();
                                return set4;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) CameraId.m46toStringimpl(str4)), e3);
                            return EmptySet.INSTANCE;
                        }
                    case 3:
                        String str5 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = EmptyList.INSTANCE;
                                }
                                Set set5 = CollectionsKt.toSet(availableCaptureResultKeys);
                                Trace.endSection();
                                return set5;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) CameraId.m46toStringimpl(str5)), e4);
                            return EmptySet.INSTANCE;
                        }
                    case 4:
                        String str6 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = camera2CameraMetadata.characteristics.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)) + ": " + physicalCameraIds);
                                Set<String> set6 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set6, 10));
                                for (String str7 : set6) {
                                    CameraId.m45constructorimpl(str7);
                                    arrayList.add(new CameraId(str7));
                                }
                                Set set7 = CollectionsKt.toSet(arrayList);
                                Trace.endSection();
                                return set7;
                            } finally {
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e5);
                            return EmptySet.INSTANCE;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e6);
                            return EmptySet.INSTANCE;
                        }
                    case 5:
                        String str8 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = camera2CameraMetadata.characteristics.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set8 = CollectionsKt.toSet(availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return set8;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return EmptySet.INSTANCE;
                        }
                    case 6:
                        String str9 = camera2CameraMetadata.camera;
                        if (Build.VERSION.SDK_INT < 35) {
                            return EmptySet.INSTANCE;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = EmptyList.INSTANCE;
                                }
                                Set set9 = CollectionsKt.toSet(availableSessionCharacteristicsKeys);
                                Trace.endSection();
                                return set9;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return EmptySet.INSTANCE;
                        }
                    default:
                        String str10 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List<CaptureRequest.Key<?>> availableSessionKeys = camera2CameraMetadata.characteristics.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = EmptyList.INSTANCE;
                                }
                                Set set10 = CollectionsKt.toSet(availableSessionKeys);
                                Trace.endSection();
                                return set10;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return EmptySet.INSTANCE;
                        }
                }
            }
        });
        final int i2 = 1;
        this._keys = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda0
            public final /* synthetic */ Camera2CameraMetadata f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Camera2CameraMetadata camera2CameraMetadata = this.f$0;
                switch (i22) {
                    case 0:
                        String str2 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) CameraId.m46toStringimpl(str2)) + "#supportedExtensions");
                                Camera2MetadataCache camera2MetadataCache2 = camera2CameraMetadata.metadataProvider;
                                str2.getClass();
                                Object set2 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.toSet(Api31Compat.getSupportedExtensions(camera2MetadataCache2.m73getCameraExtensionCharacteristicsEfqyGwQ(str2))) : EmptySet.INSTANCE;
                                Trace.endSection();
                                return set2;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) CameraId.m46toStringimpl(str2)), e);
                            return EmptySet.INSTANCE;
                        }
                    case 1:
                        String str3 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                                if (keys == null) {
                                    keys = EmptyList.INSTANCE;
                                }
                                Set set3 = CollectionsKt.toSet(keys);
                                Trace.endSection();
                                return set3;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) CameraId.m46toStringimpl(str3)) + '}', e2);
                            return EmptySet.INSTANCE;
                        }
                    case 2:
                        String str4 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set4 = CollectionsKt.toSet(availableCaptureRequestKeys);
                                Trace.endSection();
                                return set4;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) CameraId.m46toStringimpl(str4)), e3);
                            return EmptySet.INSTANCE;
                        }
                    case 3:
                        String str5 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = EmptyList.INSTANCE;
                                }
                                Set set5 = CollectionsKt.toSet(availableCaptureResultKeys);
                                Trace.endSection();
                                return set5;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) CameraId.m46toStringimpl(str5)), e4);
                            return EmptySet.INSTANCE;
                        }
                    case 4:
                        String str6 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = camera2CameraMetadata.characteristics.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)) + ": " + physicalCameraIds);
                                Set<String> set6 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set6, 10));
                                for (String str7 : set6) {
                                    CameraId.m45constructorimpl(str7);
                                    arrayList.add(new CameraId(str7));
                                }
                                Set set7 = CollectionsKt.toSet(arrayList);
                                Trace.endSection();
                                return set7;
                            } finally {
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e5);
                            return EmptySet.INSTANCE;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e6);
                            return EmptySet.INSTANCE;
                        }
                    case 5:
                        String str8 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = camera2CameraMetadata.characteristics.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set8 = CollectionsKt.toSet(availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return set8;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return EmptySet.INSTANCE;
                        }
                    case 6:
                        String str9 = camera2CameraMetadata.camera;
                        if (Build.VERSION.SDK_INT < 35) {
                            return EmptySet.INSTANCE;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = EmptyList.INSTANCE;
                                }
                                Set set9 = CollectionsKt.toSet(availableSessionCharacteristicsKeys);
                                Trace.endSection();
                                return set9;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return EmptySet.INSTANCE;
                        }
                    default:
                        String str10 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List<CaptureRequest.Key<?>> availableSessionKeys = camera2CameraMetadata.characteristics.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = EmptyList.INSTANCE;
                                }
                                Set set10 = CollectionsKt.toSet(availableSessionKeys);
                                Trace.endSection();
                                return set10;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return EmptySet.INSTANCE;
                        }
                }
            }
        });
        final int i3 = 2;
        this._requestKeys = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda0
            public final /* synthetic */ Camera2CameraMetadata f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                Camera2CameraMetadata camera2CameraMetadata = this.f$0;
                switch (i22) {
                    case 0:
                        String str2 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) CameraId.m46toStringimpl(str2)) + "#supportedExtensions");
                                Camera2MetadataCache camera2MetadataCache2 = camera2CameraMetadata.metadataProvider;
                                str2.getClass();
                                Object set2 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.toSet(Api31Compat.getSupportedExtensions(camera2MetadataCache2.m73getCameraExtensionCharacteristicsEfqyGwQ(str2))) : EmptySet.INSTANCE;
                                Trace.endSection();
                                return set2;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) CameraId.m46toStringimpl(str2)), e);
                            return EmptySet.INSTANCE;
                        }
                    case 1:
                        String str3 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                                if (keys == null) {
                                    keys = EmptyList.INSTANCE;
                                }
                                Set set3 = CollectionsKt.toSet(keys);
                                Trace.endSection();
                                return set3;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) CameraId.m46toStringimpl(str3)) + '}', e2);
                            return EmptySet.INSTANCE;
                        }
                    case 2:
                        String str4 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set4 = CollectionsKt.toSet(availableCaptureRequestKeys);
                                Trace.endSection();
                                return set4;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) CameraId.m46toStringimpl(str4)), e3);
                            return EmptySet.INSTANCE;
                        }
                    case 3:
                        String str5 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = EmptyList.INSTANCE;
                                }
                                Set set5 = CollectionsKt.toSet(availableCaptureResultKeys);
                                Trace.endSection();
                                return set5;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) CameraId.m46toStringimpl(str5)), e4);
                            return EmptySet.INSTANCE;
                        }
                    case 4:
                        String str6 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = camera2CameraMetadata.characteristics.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)) + ": " + physicalCameraIds);
                                Set<String> set6 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set6, 10));
                                for (String str7 : set6) {
                                    CameraId.m45constructorimpl(str7);
                                    arrayList.add(new CameraId(str7));
                                }
                                Set set7 = CollectionsKt.toSet(arrayList);
                                Trace.endSection();
                                return set7;
                            } finally {
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e5);
                            return EmptySet.INSTANCE;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e6);
                            return EmptySet.INSTANCE;
                        }
                    case 5:
                        String str8 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = camera2CameraMetadata.characteristics.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set8 = CollectionsKt.toSet(availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return set8;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return EmptySet.INSTANCE;
                        }
                    case 6:
                        String str9 = camera2CameraMetadata.camera;
                        if (Build.VERSION.SDK_INT < 35) {
                            return EmptySet.INSTANCE;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = EmptyList.INSTANCE;
                                }
                                Set set9 = CollectionsKt.toSet(availableSessionCharacteristicsKeys);
                                Trace.endSection();
                                return set9;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return EmptySet.INSTANCE;
                        }
                    default:
                        String str10 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List<CaptureRequest.Key<?>> availableSessionKeys = camera2CameraMetadata.characteristics.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = EmptyList.INSTANCE;
                                }
                                Set set10 = CollectionsKt.toSet(availableSessionKeys);
                                Trace.endSection();
                                return set10;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return EmptySet.INSTANCE;
                        }
                }
            }
        });
        final int i4 = 3;
        this._resultKeys = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda0
            public final /* synthetic */ Camera2CameraMetadata f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                Camera2CameraMetadata camera2CameraMetadata = this.f$0;
                switch (i22) {
                    case 0:
                        String str2 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) CameraId.m46toStringimpl(str2)) + "#supportedExtensions");
                                Camera2MetadataCache camera2MetadataCache2 = camera2CameraMetadata.metadataProvider;
                                str2.getClass();
                                Object set2 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.toSet(Api31Compat.getSupportedExtensions(camera2MetadataCache2.m73getCameraExtensionCharacteristicsEfqyGwQ(str2))) : EmptySet.INSTANCE;
                                Trace.endSection();
                                return set2;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) CameraId.m46toStringimpl(str2)), e);
                            return EmptySet.INSTANCE;
                        }
                    case 1:
                        String str3 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                                if (keys == null) {
                                    keys = EmptyList.INSTANCE;
                                }
                                Set set3 = CollectionsKt.toSet(keys);
                                Trace.endSection();
                                return set3;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) CameraId.m46toStringimpl(str3)) + '}', e2);
                            return EmptySet.INSTANCE;
                        }
                    case 2:
                        String str4 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set4 = CollectionsKt.toSet(availableCaptureRequestKeys);
                                Trace.endSection();
                                return set4;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) CameraId.m46toStringimpl(str4)), e3);
                            return EmptySet.INSTANCE;
                        }
                    case 3:
                        String str5 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = EmptyList.INSTANCE;
                                }
                                Set set5 = CollectionsKt.toSet(availableCaptureResultKeys);
                                Trace.endSection();
                                return set5;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) CameraId.m46toStringimpl(str5)), e4);
                            return EmptySet.INSTANCE;
                        }
                    case 4:
                        String str6 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = camera2CameraMetadata.characteristics.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)) + ": " + physicalCameraIds);
                                Set<String> set6 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set6, 10));
                                for (String str7 : set6) {
                                    CameraId.m45constructorimpl(str7);
                                    arrayList.add(new CameraId(str7));
                                }
                                Set set7 = CollectionsKt.toSet(arrayList);
                                Trace.endSection();
                                return set7;
                            } finally {
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e5);
                            return EmptySet.INSTANCE;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e6);
                            return EmptySet.INSTANCE;
                        }
                    case 5:
                        String str8 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = camera2CameraMetadata.characteristics.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set8 = CollectionsKt.toSet(availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return set8;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return EmptySet.INSTANCE;
                        }
                    case 6:
                        String str9 = camera2CameraMetadata.camera;
                        if (Build.VERSION.SDK_INT < 35) {
                            return EmptySet.INSTANCE;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = EmptyList.INSTANCE;
                                }
                                Set set9 = CollectionsKt.toSet(availableSessionCharacteristicsKeys);
                                Trace.endSection();
                                return set9;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return EmptySet.INSTANCE;
                        }
                    default:
                        String str10 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List<CaptureRequest.Key<?>> availableSessionKeys = camera2CameraMetadata.characteristics.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = EmptyList.INSTANCE;
                                }
                                Set set10 = CollectionsKt.toSet(availableSessionKeys);
                                Trace.endSection();
                                return set10;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return EmptySet.INSTANCE;
                        }
                }
            }
        });
        final int i5 = 4;
        this._physicalCameraIds = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda0
            public final /* synthetic */ Camera2CameraMetadata f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                Camera2CameraMetadata camera2CameraMetadata = this.f$0;
                switch (i22) {
                    case 0:
                        String str2 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) CameraId.m46toStringimpl(str2)) + "#supportedExtensions");
                                Camera2MetadataCache camera2MetadataCache2 = camera2CameraMetadata.metadataProvider;
                                str2.getClass();
                                Object set2 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.toSet(Api31Compat.getSupportedExtensions(camera2MetadataCache2.m73getCameraExtensionCharacteristicsEfqyGwQ(str2))) : EmptySet.INSTANCE;
                                Trace.endSection();
                                return set2;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) CameraId.m46toStringimpl(str2)), e);
                            return EmptySet.INSTANCE;
                        }
                    case 1:
                        String str3 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                                if (keys == null) {
                                    keys = EmptyList.INSTANCE;
                                }
                                Set set3 = CollectionsKt.toSet(keys);
                                Trace.endSection();
                                return set3;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) CameraId.m46toStringimpl(str3)) + '}', e2);
                            return EmptySet.INSTANCE;
                        }
                    case 2:
                        String str4 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set4 = CollectionsKt.toSet(availableCaptureRequestKeys);
                                Trace.endSection();
                                return set4;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) CameraId.m46toStringimpl(str4)), e3);
                            return EmptySet.INSTANCE;
                        }
                    case 3:
                        String str5 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = EmptyList.INSTANCE;
                                }
                                Set set5 = CollectionsKt.toSet(availableCaptureResultKeys);
                                Trace.endSection();
                                return set5;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) CameraId.m46toStringimpl(str5)), e4);
                            return EmptySet.INSTANCE;
                        }
                    case 4:
                        String str6 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = camera2CameraMetadata.characteristics.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)) + ": " + physicalCameraIds);
                                Set<String> set6 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set6, 10));
                                for (String str7 : set6) {
                                    CameraId.m45constructorimpl(str7);
                                    arrayList.add(new CameraId(str7));
                                }
                                Set set7 = CollectionsKt.toSet(arrayList);
                                Trace.endSection();
                                return set7;
                            } finally {
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e5);
                            return EmptySet.INSTANCE;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e6);
                            return EmptySet.INSTANCE;
                        }
                    case 5:
                        String str8 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = camera2CameraMetadata.characteristics.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set8 = CollectionsKt.toSet(availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return set8;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return EmptySet.INSTANCE;
                        }
                    case 6:
                        String str9 = camera2CameraMetadata.camera;
                        if (Build.VERSION.SDK_INT < 35) {
                            return EmptySet.INSTANCE;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = EmptyList.INSTANCE;
                                }
                                Set set9 = CollectionsKt.toSet(availableSessionCharacteristicsKeys);
                                Trace.endSection();
                                return set9;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return EmptySet.INSTANCE;
                        }
                    default:
                        String str10 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List<CaptureRequest.Key<?>> availableSessionKeys = camera2CameraMetadata.characteristics.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = EmptyList.INSTANCE;
                                }
                                Set set10 = CollectionsKt.toSet(availableSessionKeys);
                                Trace.endSection();
                                return set10;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return EmptySet.INSTANCE;
                        }
                }
            }
        });
        final int i6 = 5;
        this._physicalRequestKeys = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda0
            public final /* synthetic */ Camera2CameraMetadata f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                Camera2CameraMetadata camera2CameraMetadata = this.f$0;
                switch (i22) {
                    case 0:
                        String str2 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) CameraId.m46toStringimpl(str2)) + "#supportedExtensions");
                                Camera2MetadataCache camera2MetadataCache2 = camera2CameraMetadata.metadataProvider;
                                str2.getClass();
                                Object set2 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.toSet(Api31Compat.getSupportedExtensions(camera2MetadataCache2.m73getCameraExtensionCharacteristicsEfqyGwQ(str2))) : EmptySet.INSTANCE;
                                Trace.endSection();
                                return set2;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) CameraId.m46toStringimpl(str2)), e);
                            return EmptySet.INSTANCE;
                        }
                    case 1:
                        String str3 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                                if (keys == null) {
                                    keys = EmptyList.INSTANCE;
                                }
                                Set set3 = CollectionsKt.toSet(keys);
                                Trace.endSection();
                                return set3;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) CameraId.m46toStringimpl(str3)) + '}', e2);
                            return EmptySet.INSTANCE;
                        }
                    case 2:
                        String str4 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set4 = CollectionsKt.toSet(availableCaptureRequestKeys);
                                Trace.endSection();
                                return set4;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) CameraId.m46toStringimpl(str4)), e3);
                            return EmptySet.INSTANCE;
                        }
                    case 3:
                        String str5 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = EmptyList.INSTANCE;
                                }
                                Set set5 = CollectionsKt.toSet(availableCaptureResultKeys);
                                Trace.endSection();
                                return set5;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) CameraId.m46toStringimpl(str5)), e4);
                            return EmptySet.INSTANCE;
                        }
                    case 4:
                        String str6 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = camera2CameraMetadata.characteristics.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)) + ": " + physicalCameraIds);
                                Set<String> set6 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set6, 10));
                                for (String str7 : set6) {
                                    CameraId.m45constructorimpl(str7);
                                    arrayList.add(new CameraId(str7));
                                }
                                Set set7 = CollectionsKt.toSet(arrayList);
                                Trace.endSection();
                                return set7;
                            } finally {
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e5);
                            return EmptySet.INSTANCE;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e6);
                            return EmptySet.INSTANCE;
                        }
                    case 5:
                        String str8 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = camera2CameraMetadata.characteristics.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set8 = CollectionsKt.toSet(availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return set8;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return EmptySet.INSTANCE;
                        }
                    case 6:
                        String str9 = camera2CameraMetadata.camera;
                        if (Build.VERSION.SDK_INT < 35) {
                            return EmptySet.INSTANCE;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = EmptyList.INSTANCE;
                                }
                                Set set9 = CollectionsKt.toSet(availableSessionCharacteristicsKeys);
                                Trace.endSection();
                                return set9;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return EmptySet.INSTANCE;
                        }
                    default:
                        String str10 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List<CaptureRequest.Key<?>> availableSessionKeys = camera2CameraMetadata.characteristics.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = EmptyList.INSTANCE;
                                }
                                Set set10 = CollectionsKt.toSet(availableSessionKeys);
                                Trace.endSection();
                                return set10;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return EmptySet.INSTANCE;
                        }
                }
            }
        });
        final int i7 = 6;
        this._sessionCharacteristicsKeys = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda0
            public final /* synthetic */ Camera2CameraMetadata f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                Camera2CameraMetadata camera2CameraMetadata = this.f$0;
                switch (i22) {
                    case 0:
                        String str2 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) CameraId.m46toStringimpl(str2)) + "#supportedExtensions");
                                Camera2MetadataCache camera2MetadataCache2 = camera2CameraMetadata.metadataProvider;
                                str2.getClass();
                                Object set2 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.toSet(Api31Compat.getSupportedExtensions(camera2MetadataCache2.m73getCameraExtensionCharacteristicsEfqyGwQ(str2))) : EmptySet.INSTANCE;
                                Trace.endSection();
                                return set2;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) CameraId.m46toStringimpl(str2)), e);
                            return EmptySet.INSTANCE;
                        }
                    case 1:
                        String str3 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                                if (keys == null) {
                                    keys = EmptyList.INSTANCE;
                                }
                                Set set3 = CollectionsKt.toSet(keys);
                                Trace.endSection();
                                return set3;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) CameraId.m46toStringimpl(str3)) + '}', e2);
                            return EmptySet.INSTANCE;
                        }
                    case 2:
                        String str4 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set4 = CollectionsKt.toSet(availableCaptureRequestKeys);
                                Trace.endSection();
                                return set4;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) CameraId.m46toStringimpl(str4)), e3);
                            return EmptySet.INSTANCE;
                        }
                    case 3:
                        String str5 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = EmptyList.INSTANCE;
                                }
                                Set set5 = CollectionsKt.toSet(availableCaptureResultKeys);
                                Trace.endSection();
                                return set5;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) CameraId.m46toStringimpl(str5)), e4);
                            return EmptySet.INSTANCE;
                        }
                    case 4:
                        String str6 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = camera2CameraMetadata.characteristics.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)) + ": " + physicalCameraIds);
                                Set<String> set6 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set6, 10));
                                for (String str7 : set6) {
                                    CameraId.m45constructorimpl(str7);
                                    arrayList.add(new CameraId(str7));
                                }
                                Set set7 = CollectionsKt.toSet(arrayList);
                                Trace.endSection();
                                return set7;
                            } finally {
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e5);
                            return EmptySet.INSTANCE;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e6);
                            return EmptySet.INSTANCE;
                        }
                    case 5:
                        String str8 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = camera2CameraMetadata.characteristics.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set8 = CollectionsKt.toSet(availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return set8;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return EmptySet.INSTANCE;
                        }
                    case 6:
                        String str9 = camera2CameraMetadata.camera;
                        if (Build.VERSION.SDK_INT < 35) {
                            return EmptySet.INSTANCE;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = EmptyList.INSTANCE;
                                }
                                Set set9 = CollectionsKt.toSet(availableSessionCharacteristicsKeys);
                                Trace.endSection();
                                return set9;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return EmptySet.INSTANCE;
                        }
                    default:
                        String str10 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List<CaptureRequest.Key<?>> availableSessionKeys = camera2CameraMetadata.characteristics.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = EmptyList.INSTANCE;
                                }
                                Set set10 = CollectionsKt.toSet(availableSessionKeys);
                                Trace.endSection();
                                return set10;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return EmptySet.INSTANCE;
                        }
                }
            }
        });
        final int i8 = 7;
        this._sessionKeys = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$$ExternalSyntheticLambda0
            public final /* synthetic */ Camera2CameraMetadata f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                Camera2CameraMetadata camera2CameraMetadata = this.f$0;
                switch (i22) {
                    case 0:
                        String str2 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) CameraId.m46toStringimpl(str2)) + "#supportedExtensions");
                                Camera2MetadataCache camera2MetadataCache2 = camera2CameraMetadata.metadataProvider;
                                str2.getClass();
                                Object set2 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.toSet(Api31Compat.getSupportedExtensions(camera2MetadataCache2.m73getCameraExtensionCharacteristicsEfqyGwQ(str2))) : EmptySet.INSTANCE;
                                Trace.endSection();
                                return set2;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) CameraId.m46toStringimpl(str2)), e);
                            return EmptySet.INSTANCE;
                        }
                    case 1:
                        String str3 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                                if (keys == null) {
                                    keys = EmptyList.INSTANCE;
                                }
                                Set set3 = CollectionsKt.toSet(keys);
                                Trace.endSection();
                                return set3;
                            } finally {
                            }
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) CameraId.m46toStringimpl(str3)) + '}', e2);
                            return EmptySet.INSTANCE;
                        }
                    case 2:
                        String str4 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set4 = CollectionsKt.toSet(availableCaptureRequestKeys);
                                Trace.endSection();
                                return set4;
                            } finally {
                            }
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) CameraId.m46toStringimpl(str4)), e3);
                            return EmptySet.INSTANCE;
                        }
                    case 3:
                        String str5 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = EmptyList.INSTANCE;
                                }
                                Set set5 = CollectionsKt.toSet(availableCaptureResultKeys);
                                Trace.endSection();
                                return set5;
                            } finally {
                            }
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) CameraId.m46toStringimpl(str5)), e4);
                            return EmptySet.INSTANCE;
                        }
                    case 4:
                        String str6 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection(((Object) CameraId.m46toStringimpl(str6)) + "#physicalCameraIds");
                                Set<String> physicalCameraIds = camera2CameraMetadata.characteristics.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)) + ": " + physicalCameraIds);
                                Set<String> set6 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set6, 10));
                                for (String str7 : set6) {
                                    CameraId.m45constructorimpl(str7);
                                    arrayList.add(new CameraId(str7));
                                }
                                Set set7 = CollectionsKt.toSet(arrayList);
                                Trace.endSection();
                                return set7;
                            } finally {
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e5);
                            return EmptySet.INSTANCE;
                        } catch (NullPointerException e6) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m46toStringimpl(str6)), e6);
                            return EmptySet.INSTANCE;
                        }
                    case 5:
                        String str8 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = camera2CameraMetadata.characteristics.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys == null) {
                                    availablePhysicalCameraRequestKeys = EmptyList.INSTANCE;
                                }
                                Set set8 = CollectionsKt.toSet(availablePhysicalCameraRequestKeys);
                                Trace.endSection();
                                return set8;
                            } finally {
                            }
                        } catch (AssertionError e7) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                            return EmptySet.INSTANCE;
                        }
                    case 6:
                        String str9 = camera2CameraMetadata.camera;
                        if (Build.VERSION.SDK_INT < 35) {
                            return EmptySet.INSTANCE;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                                if (availableSessionCharacteristicsKeys == null) {
                                    availableSessionCharacteristicsKeys = EmptyList.INSTANCE;
                                }
                                Set set9 = CollectionsKt.toSet(availableSessionCharacteristicsKeys);
                                Trace.endSection();
                                return set9;
                            } finally {
                            }
                        } catch (AssertionError e8) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                            return EmptySet.INSTANCE;
                        }
                    default:
                        String str10 = camera2CameraMetadata.camera;
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                List<CaptureRequest.Key<?>> availableSessionKeys = camera2CameraMetadata.characteristics.getAvailableSessionKeys();
                                if (availableSessionKeys == null) {
                                    availableSessionKeys = EmptyList.INSTANCE;
                                }
                                Set set10 = CollectionsKt.toSet(availableSessionKeys);
                                Trace.endSection();
                                return set10;
                            } finally {
                            }
                        } catch (AssertionError e9) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                            return EmptySet.INSTANCE;
                        }
                }
            }
        });
    }

    public final Object get(CameraCharacteristics.Key key) {
        Object obj;
        key.getClass();
        if (this.cacheBlocklist.contains(key)) {
            try {
                return this.characteristics.get(key);
            } catch (AssertionError unused) {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Failed to get characteristic for ", key, ": Framework throw an AssertionError");
                return null;
            }
        }
        synchronized (this.values) {
            obj = this.values.get(key);
        }
        if (obj != null) {
            return obj;
        }
        try {
            Object obj2 = this.characteristics.get(key);
            if (obj2 == null) {
                return obj2;
            }
            synchronized (this.values) {
                this.values.put(key, obj2);
            }
            return obj2;
        } catch (AssertionError unused2) {
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Failed to get characteristic for ", key, ": Framework throw an AssertionError");
            return null;
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        if (kClass.equals(Reflection.factory.getOrCreateKotlinClass(CameraCharacteristics.class))) {
            return this.characteristics;
        }
        return null;
    }
}
