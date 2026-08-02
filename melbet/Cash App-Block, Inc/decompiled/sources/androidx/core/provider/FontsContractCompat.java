package androidx.core.provider;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import androidx.biometric.BiometricFragment;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.processing.Edge;
import androidx.camera.video.Recorder;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.provider.FontRequestWorker;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.fillr.browsersdk.Fillr;
import com.miteksystems.misnap.camera.a.b;
import com.miteksystems.misnap.camera.a.d;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class FontsContractCompat {
    public static FontFamilyResult fetchFonts(Context context, FontRequest fontRequest) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{fontRequest}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return FontProvider.getFontFamilyResult(context, Collections.unmodifiableList(arrayList));
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewSavingsAddCash.deepLinkSpecs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface requestFont(Context context, List list, int i, boolean z, int i2, Handler handler, Recorder.AnonymousClass6 anonymousClass6) {
        BiometricFragment.PromptExecutor promptExecutor = new BiometricFragment.PromptExecutor(handler);
        Object[] objArr = 0;
        Recorder.AnonymousClass4 anonymousClass4 = new Recorder.AnonymousClass4(anonymousClass6, promptExecutor, false, 24);
        int i3 = 4;
        if (!z) {
            String createCacheId = FontRequestWorker.createCacheId(i, list);
            Typeface typeface = (Typeface) FontRequestWorker.sTypefaceCache.get(createCacheId);
            if (typeface != null) {
                promptExecutor.execute(new Client.AnonymousClass4(i3, anonymousClass6, typeface));
                return typeface;
            }
            Edge edge = new Edge(anonymousClass4, 2);
            synchronized (FontRequestWorker.LOCK) {
                try {
                    SimpleArrayMap simpleArrayMap = FontRequestWorker.PENDING_REPLIES;
                    ArrayList arrayList = (ArrayList) simpleArrayMap.get(createCacheId);
                    if (arrayList != null) {
                        arrayList.add(edge);
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(edge);
                    simpleArrayMap.put(createCacheId, arrayList2);
                    FontRequestWorker.AnonymousClass1 anonymousClass1 = new FontRequestWorker.AnonymousClass1(createCacheId, context, list, i, 1);
                    ThreadPoolExecutor threadPoolExecutor = FontRequestWorker.DEFAULT_EXECUTOR_SERVICE;
                    Edge edge2 = new Edge(createCacheId, 3);
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    Fillr.AnonymousClass2 anonymousClass2 = new Fillr.AnonymousClass2();
                    anonymousClass2.val$mapping = anonymousClass1;
                    anonymousClass2.val$fillrWebView = edge2;
                    anonymousClass2.this$0 = handler2;
                    threadPoolExecutor.execute(anonymousClass2);
                    return null;
                } finally {
                }
            }
        }
        if (list.size() > 1) {
            a$$ExternalSyntheticBUOutline0.m$3("Fallbacks with blocking fetches are not supported for performance reasons");
            return null;
        }
        FontRequest fontRequest = (FontRequest) list.get(0);
        LruCache lruCache = FontRequestWorker.sTypefaceCache;
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = new Object[]{fontRequest}[0];
        Objects.requireNonNull(obj);
        arrayList3.add(obj);
        String createCacheId2 = FontRequestWorker.createCacheId(i, Collections.unmodifiableList(arrayList3));
        Typeface typeface2 = (Typeface) FontRequestWorker.sTypefaceCache.get(createCacheId2);
        if (typeface2 != null) {
            promptExecutor.execute(new Client.AnonymousClass4(i3, anonymousClass6, typeface2));
            return typeface2;
        }
        if (i2 == -1) {
            ArrayList arrayList4 = new ArrayList(1);
            Object obj2 = new Object[]{fontRequest}[0];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
            FontRequestWorker.TypefaceResult fontSync = FontRequestWorker.getFontSync(createCacheId2, context, Collections.unmodifiableList(arrayList4), i);
            anonymousClass4.onTypefaceResult(fontSync);
            return fontSync.mTypeface;
        }
        try {
            try {
                try {
                    try {
                        FontRequestWorker.TypefaceResult typefaceResult = (FontRequestWorker.TypefaceResult) FontRequestWorker.DEFAULT_EXECUTOR_SERVICE.submit(new FontRequestWorker.AnonymousClass1(createCacheId2, context, fontRequest, i, 0)).get(i2, TimeUnit.MILLISECONDS);
                        anonymousClass4.onTypefaceResult(typefaceResult);
                        return typefaceResult.mTypeface;
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                } catch (TimeoutException unused) {
                    throw new InterruptedException("timeout");
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        } catch (InterruptedException unused2) {
            ((BiometricFragment.PromptExecutor) anonymousClass4.this$0).execute(new CallbackWrapper$2((Recorder.AnonymousClass6) anonymousClass4.val$audioErrorConsumer, -3, objArr == true ? 1 : 0));
            return null;
        }
    }

    public final class FontInfo {
        public final boolean mItalic;
        public final int mResultCode;
        public final int mTtcIndex;
        public final Uri mUri;
        public final String mVariationSettings;
        public final int mWeight;

        public FontInfo(String str, String str2) {
            this.mUri = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.mTtcIndex = 0;
            this.mWeight = 400;
            this.mItalic = false;
            this.mVariationSettings = str2;
            this.mResultCode = 0;
        }

        public final String getSystemFont() {
            if (isSystemFont()) {
                return this.mUri.getAuthority();
            }
            return null;
        }

        public final int getTtcIndex() {
            return this.mTtcIndex;
        }

        public final Uri getUri() {
            return this.mUri;
        }

        public final String getVariationSettings() {
            return this.mVariationSettings;
        }

        public final int getWeight() {
            return this.mWeight;
        }

        public final boolean isItalic() {
            return this.mItalic;
        }

        public final boolean isSystemFont() {
            return Objects.equals(this.mUri.getScheme(), "systemfont");
        }

        public FontInfo(Uri uri, int i, int i2, boolean z, String str, int i3) {
            uri.getClass();
            this.mUri = uri;
            this.mTtcIndex = i;
            this.mWeight = i2;
            this.mItalic = z;
            this.mVariationSettings = str;
            this.mResultCode = i3;
        }
    }

    public final class FontFamilyResult implements CameraSelectorFilter {
        public final List mFonts;
        public final int mStatusCode;

        public FontFamilyResult(int i) {
            switch (i) {
                case 2:
                    this.mFonts = CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(1920, 1080), new Size(1280, 720), new Size(640, 480)});
                    this.mStatusCode = 1;
                    break;
                default:
                    this.mStatusCode = 1;
                    this.mFonts = Collections.singletonList(null);
                    break;
            }
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
                num = r2;
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
            if (intValue != this.mStatusCode) {
                return null;
            }
            boolean z3 = false;
            b.a aVar = new b.a(d, 0);
            if (aVar.a(1) || aVar.a(3) || aVar.a(2)) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            List list2 = this.mFonts;
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
            Size size = a4;
            Size size2 = a3;
            if (size2 == null || size == null || a5 == null) {
                return null;
            }
            return new MiSnapCameraInfo(z2, z3, booleanValue, size2, size, a5, dVar.toString(), b.a(intValue), null, null);
        }

        public FontInfo[] getFonts() {
            return (FontInfo[]) this.mFonts.get(0);
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x0145, code lost:
        
            if (com.miteksystems.misnap.camera.a.b.a(r2, (android.util.Size) kotlin.collections.CollectionsKt.first(r9), r5) != null) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x010d, code lost:
        
            if (com.miteksystems.misnap.camera.a.b.a(r1, (android.util.Size) kotlin.collections.CollectionsKt.first(r9), r5) != null) goto L62;
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
            List<Size> list2 = this.mFonts;
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
            boolean z5 = intValue == this.mStatusCode;
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

        public FontFamilyResult(int i, List list) {
            this.mStatusCode = i;
            this.mFonts = list;
        }

        public FontFamilyResult(ArrayList arrayList) {
            this.mStatusCode = 0;
            this.mFonts = arrayList;
        }
    }
}
