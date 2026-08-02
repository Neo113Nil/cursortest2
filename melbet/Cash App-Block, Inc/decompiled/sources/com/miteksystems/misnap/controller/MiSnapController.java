package com.miteksystems.misnap.controller;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.view.PreviewView;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.stats.zza;
import com.miteksystems.misnap.barcode.BarcodeAnalysisSettings;
import com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer;
import com.miteksystems.misnap.barcode.MiSnapBarcodeDetector;
import com.miteksystems.misnap.classifier.MiSnapDocumentClassifier;
import com.miteksystems.misnap.controller.a.a;
import com.miteksystems.misnap.controller.a.a0;
import com.miteksystems.misnap.controller.a.b;
import com.miteksystems.misnap.controller.a.b0;
import com.miteksystems.misnap.controller.a.d;
import com.miteksystems.misnap.controller.a.e;
import com.miteksystems.misnap.controller.a.f;
import com.miteksystems.misnap.controller.a.g;
import com.miteksystems.misnap.controller.a.h;
import com.miteksystems.misnap.controller.a.j;
import com.miteksystems.misnap.controller.a.m;
import com.miteksystems.misnap.controller.a.o;
import com.miteksystems.misnap.controller.a.p;
import com.miteksystems.misnap.controller.a.w;
import com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper;
import com.miteksystems.misnap.core.Barcode;
import com.miteksystems.misnap.core.DevicePerformanceUtil;
import com.miteksystems.misnap.core.DocumentClassification;
import com.miteksystems.misnap.core.DocumentData;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.ExtractedDataCorners;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.MiSnapMibiData;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.MrzData;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.core.ValidationUtil;
import com.miteksystems.misnap.core.Vds;
import com.miteksystems.misnap.detector.MiSnapDocumentDetector;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$Result$Failure;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$Result$Processed;
import com.miteksystems.misnap.face.MiSnapFaceAnalyzer;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.StandaloneCoroutine;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class MiSnapController {
    public final a0 a;
    public final CompressionUtilNativeWrapper b;
    public final p c;
    public final d d;
    public final Context e;
    public final int f;
    public final MiSnapSettings g;
    public int h;
    public UserAction i;
    public final /* synthetic */ long k;
    public boolean l;
    public boolean m;
    public final MutableLiveData n;
    public final MibiData.Session o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final Handler s;
    public final zza t;
    public final MutableLiveData u;
    public final MutableLiveData v;
    public StandaloneCoroutine w;
    public final WeakReference x;
    public final PreviewView.DisplayRotationListener y;

    public abstract class Companion {

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MiSnapSettings.Analysis.Document.Orientation.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static boolean a(MiSnapSettings miSnapSettings) {
            MiSnapSettings.Analysis.Document document = miSnapSettings.analysis.document;
            document.getClass();
            MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement = document.c;
            MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement2 = MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
            if (extractionRequirement == null) {
                extractionRequirement = extractionRequirement2;
            }
            return extractionRequirement != extractionRequirement2;
        }

        public static boolean f(MiSnapSettings miSnapSettings) {
            MiSnapSettings.UseCase useCase = miSnapSettings.a;
            return useCase == MiSnapSettings.UseCase.CHECK_FRONT || useCase == MiSnapSettings.UseCase.CHECK_BACK || useCase == MiSnapSettings.UseCase.ID_FRONT || useCase == MiSnapSettings.UseCase.ID_BACK || useCase == MiSnapSettings.UseCase.PASSPORT || useCase == MiSnapSettings.UseCase.GENERIC_DOCUMENT;
        }

        public static boolean l(MiSnapSettings miSnapSettings) {
            if (!a(miSnapSettings)) {
                return false;
            }
            MiSnapSettings.UseCase useCase = miSnapSettings.a;
            return (useCase == MiSnapSettings.UseCase.ID_FRONT || useCase == MiSnapSettings.UseCase.ID_BACK) && DocumentAnalysisSettings.getDocumentExtractionRequirement(miSnapSettings.analysis.document) == MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
        }

        public static boolean m(MiSnapSettings miSnapSettings) {
            MiSnapSettings.UseCase useCase;
            Boolean bool;
            MiSnapSettings.Analysis.Document document = miSnapSettings.analysis.document;
            document.getClass();
            return ((!DocumentAnalysisSettings.requireDocType(document.advanced).isCheck() && (bool = document.h) != null) ? bool.booleanValue() : false) && ((useCase = miSnapSettings.a) == MiSnapSettings.UseCase.ID_FRONT || useCase == MiSnapSettings.UseCase.ID_BACK || useCase == MiSnapSettings.UseCase.PASSPORT) && !a(miSnapSettings);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"com/miteksystems/misnap/controller/MiSnapController$Container", "", "", "imageBytes", "", "rts", "<init>", "([BLjava/lang/String;)V", "component1", "()[B", "component2", "()Ljava/lang/String;", "Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "copy", "([BLjava/lang/String;)Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "getImageBytes", "b", "Ljava/lang/String;", "getRts", "controller_release"}, k = 1, mv = {1, 8, 0})
    public final /* data */ class Container {

        /* renamed from: a, reason: from kotlin metadata */
        public final byte[] imageBytes;

        /* renamed from: b, reason: from kotlin metadata */
        public final String rts;

        public Container(byte[] bArr, String str) {
            bArr.getClass();
            this.imageBytes = bArr;
            this.rts = str;
        }

        public static /* synthetic */ Container copy$default(Container container, byte[] bArr, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = container.imageBytes;
            }
            if ((i & 2) != 0) {
                str = container.rts;
            }
            return container.copy(bArr, str);
        }

        /* renamed from: component1, reason: from getter */
        public final byte[] getImageBytes() {
            return this.imageBytes;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRts() {
            return this.rts;
        }

        public final Container copy(byte[] imageBytes, String rts) {
            imageBytes.getClass();
            return new Container(imageBytes, rts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Container)) {
                return false;
            }
            Container container = (Container) other;
            return Intrinsics.areEqual(this.imageBytes, container.imageBytes) && Intrinsics.areEqual(this.rts, container.rts);
        }

        public final byte[] getImageBytes() {
            return this.imageBytes;
        }

        public final String getRts() {
            return this.rts;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.imageBytes) * 31;
            String str = this.rts;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Container(imageBytes=");
            sb.append(Arrays.toString(this.imageBytes));
            sb.append(", rts=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.rts, ')');
        }
    }

    public abstract class ErrorResult {

        public final class BarcodeAnalysis extends ErrorResult {
            public final MiSnapBarcodeAnalyzer.Result.Failure a;

            public BarcodeAnalysis(MiSnapBarcodeAnalyzer.Result.Failure failure) {
                failure.getClass();
                this.a = failure;
            }
        }

        public final class BarcodeDetection extends ErrorResult {
            public final MiSnapBarcodeDetector.Result.Failure a;

            public BarcodeDetection(MiSnapBarcodeDetector.Result.Failure failure) {
                failure.getClass();
                this.a = failure;
            }
        }

        public final class DocumentAnalysis extends ErrorResult {
            public final MiSnapDocumentAnalyzer$Result$Failure a;

            public DocumentAnalysis(MiSnapDocumentAnalyzer$Result$Failure miSnapDocumentAnalyzer$Result$Failure) {
                this.a = miSnapDocumentAnalyzer$Result$Failure;
            }
        }

        public final class DocumentClassification extends ErrorResult {
            public final MiSnapDocumentClassifier.Result.Failure a;

            public DocumentClassification(MiSnapDocumentClassifier.Result.Failure failure) {
                failure.getClass();
                this.a = failure;
            }
        }

        public final class DocumentDetection extends ErrorResult {
            public final MiSnapDocumentDetector.Result.Failure a;

            public DocumentDetection(MiSnapDocumentDetector.Result.Failure failure) {
                failure.getClass();
                this.a = failure;
            }
        }

        public final class FaceAnalysis extends ErrorResult {
            public final MiSnapFaceAnalyzer.Result.Failure a;

            public FaceAnalysis(MiSnapFaceAnalyzer.Result.Failure failure) {
                failure.getClass();
                this.a = failure;
            }
        }

        public final class VdsProcessingError extends ErrorResult {
            public static final VdsProcessingError INSTANCE$1 = new VdsProcessingError();
            public static final VdsProcessingError INSTANCE = new VdsProcessingError();
        }
    }

    public final class FeedbackResult {
        public final UserAction a;
        public final int[][] b;
        public final int[][] c;
        public final List d;
        public final Metadata e;

        public final class Metadata {
            public final Integer a;

            public Metadata(Integer num) {
                this.a = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Metadata) && this.a.equals(((Metadata) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Metadata(luma=" + this.a + ')';
            }
        }

        public FeedbackResult(UserAction userAction, int[][] iArr, int[][] iArr2, List list, Metadata metadata, int i) {
            iArr = (i & 2) != 0 ? new int[0][] : iArr;
            iArr2 = (i & 4) != 0 ? new int[0][] : iArr2;
            list = (i & 8) != 0 ? EmptyList.INSTANCE : list;
            metadata = (i & 16) != 0 ? null : metadata;
            userAction.getClass();
            iArr.getClass();
            iArr2.getClass();
            list.getClass();
            this.a = userAction;
            this.b = iArr;
            this.c = iArr2;
            this.d = list;
            this.e = metadata;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedbackResult)) {
                return false;
            }
            FeedbackResult feedbackResult = (FeedbackResult) obj;
            return Intrinsics.areEqual(this.a, feedbackResult.a) && this.b.equals(feedbackResult.b) && this.c.equals(feedbackResult.c) && this.d.equals(feedbackResult.d) && Intrinsics.areEqual(this.e, feedbackResult.e);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            Metadata metadata = this.e;
            return m + (metadata == null ? 0 : metadata.a.hashCode());
        }

        public final String toString() {
            return "FeedbackResult(userAction=" + this.a + ", corners=" + Arrays.toString(this.b) + ", glareCorners=" + Arrays.toString(this.c) + ", warnings=" + this.d + ", metaData=" + this.e + ')';
        }
    }

    public abstract class FrameResult {

        /* loaded from: classes9.dex */
        public final class BarcodeAnalysis extends FrameResult {
            public final byte[] a;
            public final Barcode b;
            public final List c;
            public final MiSnapMibiData d;
            public final boolean e;
            public final String f;

            public BarcodeAnalysis(byte[] bArr, Barcode barcode, List list, MiSnapMibiData miSnapMibiData, boolean z, String str) {
                bArr.getClass();
                list.getClass();
                this.a = bArr;
                this.b = barcode;
                this.c = list;
                this.d = miSnapMibiData;
                this.e = z;
                this.f = str;
            }
        }

        /* loaded from: classes9.dex */
        public final class DocumentAnalysis extends FrameResult {
            public final byte[] a;
            public final DocumentExtraction b;
            public final DocumentClassification c;
            public final Barcode d;
            public final List e;
            public final MiSnapMibiData f;
            public final boolean g;
            public final String h;

            public DocumentAnalysis(byte[] bArr, DocumentExtraction documentExtraction, DocumentClassification documentClassification, Barcode barcode, List list, MiSnapMibiData miSnapMibiData, boolean z, String str) {
                bArr.getClass();
                list.getClass();
                this.a = bArr;
                this.b = documentExtraction;
                this.c = documentClassification;
                this.d = barcode;
                this.e = list;
                this.f = miSnapMibiData;
                this.g = z;
                this.h = str;
            }
        }

        /* loaded from: classes9.dex */
        public final class FaceAnalysis extends FrameResult {
            public final byte[] a;
            public final ArrayList b;
            public final MiSnapMibiData c;
            public final boolean d;
            public final String e;
            public final byte[] f;

            public FaceAnalysis(byte[] bArr, ArrayList arrayList, MiSnapMibiData miSnapMibiData, boolean z, String str, byte[] bArr2) {
                bArr.getClass();
                this.a = bArr;
                this.b = arrayList;
                this.c = miSnapMibiData;
                this.d = z;
                this.e = str;
                this.f = bArr2;
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MiSnapSettings.UseCase.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[MiSnapSettings.Analysis.Document.Advanced.DocType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[7] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[6] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[3] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[5] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[4] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[8] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DocumentClassification.Type.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[6] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[7] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[8] = 9;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[9] = 10;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[10] = 11;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[11] = 12;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[12] = 13;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[13] = 14;
            } catch (NoSuchFieldError unused31) {
            }
        }
    }

    public MiSnapController(Context context, MiSnapSettings miSnapSettings, a0 a0Var, CompressionUtilNativeWrapper compressionUtilNativeWrapper, p pVar) {
        long intValue;
        d dVar = new d(context, miSnapSettings);
        this.a = a0Var;
        this.b = compressionUtilNativeWrapper;
        this.c = pVar;
        this.d = dVar;
        this.e = context.getApplicationContext();
        this.f = DevicePerformanceUtil.getCurrentDevicePerformanceTier$default(context);
        MiSnapSettings m2165clone = miSnapSettings.m2165clone();
        MiSnapSettings.UseCase useCase = miSnapSettings.a;
        MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
        this.g = m2165clone;
        this.h = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context);
        Object systemService = context.getSystemService("accessibility");
        Unit unit = null;
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        boolean z = accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        if (analysis.b == null && z) {
            intValue = 0;
        } else {
            useCase.getClass();
            Integer num = analysis.b;
            intValue = (num == null || num.intValue() <= 0) ? (useCase == MiSnapSettings.UseCase.FACE || useCase == MiSnapSettings.UseCase.BARCODE) ? 0 : IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO : num.intValue();
        }
        this.k = intValue;
        this.n = new MutableLiveData();
        this.o = MibiData.bindSession();
        this.q = true;
        Looper myLooper = Looper.myLooper();
        this.s = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.t = new zza(this, 15);
        this.u = new MutableLiveData();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.v = mutableLiveData;
        this.x = new WeakReference(context);
        PreviewView.DisplayRotationListener displayRotationListener = new PreviewView.DisplayRotationListener(this, 3);
        this.y = displayRotationListener;
        try {
            System.loadLibrary("misnapControllerUtil");
        } catch (UnsatisfiedLinkError e) {
            Log.e("CompressionUtilLib", "Unable to load library", e);
            ErrorResult b = b();
            if (Looper.getMainLooper().isCurrentThread()) {
                mutableLiveData.setValue(b);
            } else {
                mutableLiveData.postValue(b);
            }
        }
        Object systemService2 = context.getSystemService("display");
        systemService2.getClass();
        DisplayManager displayManager = (DisplayManager) systemService2;
        Looper myLooper2 = Looper.myLooper();
        displayManager.registerDisplayListener(displayRotationListener, new Handler(myLooper2 == null ? Looper.getMainLooper() : myLooper2));
        if (MibiData.startSession(miSnapSettings, MiSnapController.class.getName())) {
            MibiData.Session bindSession = MibiData.bindSession();
            this.o = bindSession;
            boolean isAutoTrigger = AnalysisSettings.isAutoTrigger(analysis, useCase);
            MibiData.MetaData metaData = bindSession.getMetaData();
            if (isAutoTrigger) {
                metaData.b++;
            } else {
                metaData.c++;
            }
        }
        boolean z2 = analysis.c == null && z;
        if (AnalysisSettings.getMotionDetectorSensitivity(analysis, useCase) != MiSnapSettings.Analysis.MotionDetectorSensitivity.NONE) {
            MiSnapSettings miSnapSettings2 = this.g;
            if (!((!SVG$Unit$EnumUnboxingLocalUtility._isLowerThan(this.f) && Companion.f(miSnapSettings2)) ? DocumentAnalysisSettings.shouldEnableFocusOnFinalFrame(miSnapSettings2.analysis.document) : false) && isImageQualityPriority$controller_release() && !z2) {
                dVar.d();
                MibiData.Session session = dVar.b;
                Sensor sensor = dVar.c;
                if (sensor != null) {
                    dVar.a.registerListener(dVar.l, sensor, 2);
                    session.addUxpEvent("DMDST", new String[0]);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    session.addUxpEvent("DMDUA", new String[0]);
                }
            }
        }
        c();
    }

    public final void a(b0 b0Var, boolean z) {
        MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult faceIqasResult;
        String a;
        Barcode barcode;
        Barcode.Type type2;
        Barcode.Type type3;
        boolean z2 = b0Var instanceof j;
        MibiData.Session session = this.o;
        if (z2) {
            MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult = ((j) b0Var).b;
            if (documentIqasResult != null) {
                session.addUxpEvent("SMCFS", a(documentIqasResult));
            }
        } else if (b0Var instanceof f) {
            MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult2 = ((f) b0Var).c.b;
            if (documentIqasResult2 != null) {
                session.addUxpEvent("SMCFS", a(documentIqasResult2));
            }
        } else if ((b0Var instanceof o) && (faceIqasResult = ((o) b0Var).b) != null) {
            session.addUxpEvent("SMCFS", a(faceIqasResult));
        }
        MiSnapSettings miSnapSettings = this.g;
        String str = z ? AnalysisSettings.isAutoTrigger(miSnapSettings.analysis, miSnapSettings.a) ? "ForcedAuto" : "Manual" : "Auto";
        boolean a2 = w.a(b0Var, miSnapSettings);
        MiSnapSettings.UseCase useCase = miSnapSettings.a;
        MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
        if (session.isCurrentSession()) {
            MibiData.h = miSnapSettings;
        }
        if (z2) {
            String a3 = a(miSnapSettings);
            j jVar = (j) b0Var;
            DocumentClassification documentClassification = jVar.g;
            a = documentClassification != null ? a(documentClassification) : "";
            DocumentExtraction documentExtraction = jVar.f;
            session.addSessionInfo(new MibiData.DocumentSessionInfo(a3, a, Boolean.valueOf((documentExtraction != null ? documentExtraction.a : null) != null), Boolean.valueOf(a2), Boolean.valueOf(DocumentAnalysisSettings.shouldEnableEnhancedManual(analysis.document)), str, jVar.d, a(this.h), a(DocumentAnalysisSettings.getOrientation(analysis.document, this.h)), a(jVar.c), Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c), Boolean.valueOf(!DocumentAnalysisSettings.shouldPrioritizeDocumentExtractionOverImageQuality(analysis.document))));
            return;
        }
        if (b0Var instanceof b) {
            Barcode barcode2 = ((b) b0Var).b;
            session.addSessionInfo(new MibiData.BarcodeSessionInfo((barcode2 == null || (type3 = barcode2.c) == null) ? null : type3.a, a(this.h), a(BarcodeAnalysisSettings.getOrientation(analysis.barcode, this.h)), Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c)));
            return;
        }
        if (!(b0Var instanceof f)) {
            if (b0Var instanceof o) {
                session.addSessionInfo(new MibiData.FaceSessionInfo(str, Boolean.valueOf(analysis.face.a == MiSnapSettings.Analysis.Face.Trigger.AUTO_SMILE), a(this.h), a(((o) b0Var).c), Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c)));
                return;
            }
            return;
        }
        String a4 = a(miSnapSettings);
        f fVar = (f) b0Var;
        j jVar2 = fVar.c;
        DocumentClassification documentClassification2 = jVar2.g;
        a = documentClassification2 != null ? a(documentClassification2) : "";
        DocumentExtraction documentExtraction2 = jVar2.f;
        session.addSessionInfo(new MibiData.DocumentSessionInfo(a4, a, Boolean.valueOf((documentExtraction2 != null ? documentExtraction2.a : null) != null), Boolean.valueOf(a2), Boolean.valueOf(DocumentAnalysisSettings.shouldEnableEnhancedManual(analysis.document)), str, jVar2.d, a(this.h), a(DocumentAnalysisSettings.getOrientation(analysis.document, this.h)), a(jVar2.c), Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c), Boolean.valueOf(!DocumentAnalysisSettings.shouldPrioritizeDocumentExtractionOverImageQuality(analysis.document))));
        b bVar = fVar.b;
        session.addSessionInfo(new MibiData.BarcodeSessionInfo((bVar == null || (barcode = bVar.b) == null || (type2 = barcode.c) == null) ? null : type2.a, a(this.h), a(BarcodeAnalysisSettings.getOrientation(analysis.barcode, this.h)), Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c)));
    }

    public final ErrorResult b() {
        MiSnapDocumentAnalyzer$Result$Failure.ImageFormat imageFormat = MiSnapDocumentAnalyzer$Result$Failure.ImageFormat.INSTANCE$1;
        a0 a0Var = this.a;
        return a0Var instanceof h ? new ErrorResult.DocumentAnalysis(imageFormat) : a0Var instanceof a ? new ErrorResult.BarcodeAnalysis(MiSnapBarcodeAnalyzer.Result.Failure.LibraryLoad.INSTANCE) : a0Var instanceof m ? new ErrorResult.FaceAnalysis(MiSnapFaceAnalyzer.Result.Failure.InputFormat.INSTANCE) : a0Var instanceof e ? new ErrorResult.DocumentAnalysis(imageFormat) : a0Var instanceof g ? new ErrorResult.DocumentClassification(MiSnapDocumentClassifier.Result.Failure.LibraryLoad.INSTANCE) : new ErrorResult.DocumentDetection(MiSnapDocumentDetector.Result.Failure.LibraryLoad.INSTANCE);
    }

    public final void c() {
        MiSnapSettings miSnapSettings = this.g;
        MiSnapSettings.UseCase useCase = miSnapSettings.a;
        MiSnapSettings.UseCase useCase2 = miSnapSettings.a;
        MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
        int ordinal = useCase.ordinal();
        MibiData.Session session = this.o;
        switch (ordinal) {
            case 0:
            case 3:
            case 4:
            case 5:
                session.setErrorSessionInfo(new MibiData.DocumentSessionInfo(a(miSnapSettings), Boolean.valueOf(DocumentAnalysisSettings.shouldEnableEnhancedManual(analysis.document)), a(this.h), a(DocumentAnalysisSettings.getOrientation(analysis.document, this.h)), Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase2)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c)), new MibiData.SessionInfo[0]);
                break;
            case 1:
            case 2:
                session.setErrorSessionInfo(new MibiData.DocumentSessionInfo(a(miSnapSettings), Boolean.valueOf(DocumentAnalysisSettings.shouldEnableEnhancedManual(analysis.document)), a(this.h), a(DocumentAnalysisSettings.getOrientation(analysis.document, this.h)), Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase2)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c)), new MibiData.SessionInfo[0]);
                MiSnapSettings.Analysis.Document document = analysis.document;
                document.getClass();
                MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement = document.c;
                MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement2 = MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
                if (extractionRequirement == null) {
                    extractionRequirement = extractionRequirement2;
                }
                if (extractionRequirement != extractionRequirement2) {
                    session.setErrorSessionInfo(new MibiData.BarcodeSessionInfo(null, a(this.h), a(BarcodeAnalysisSettings.getOrientation(analysis.barcode, this.h)), Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase2)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c)), new MibiData.SessionInfo[0]);
                    break;
                }
                break;
            case 6:
                session.setErrorSessionInfo(new MibiData.BarcodeSessionInfo(null, a(this.h), a(BarcodeAnalysisSettings.getOrientation(analysis.barcode, this.h)), Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase2)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c)), new MibiData.SessionInfo[0]);
                break;
            case 7:
                session.setErrorSessionInfo(new MibiData.FaceSessionInfo(null, Boolean.valueOf(analysis.face.a == MiSnapSettings.Analysis.Face.Trigger.AUTO_SMILE), a(this.h), null, Integer.valueOf(AnalysisSettings.getImageQuality(analysis, useCase2)), System.currentTimeMillis() - session.getMetaData().a, Integer.valueOf(session.getMetaData().b), Integer.valueOf(session.getMetaData().c)), new MibiData.SessionInfo[0]);
                break;
        }
    }

    public final boolean isImageQualityPriority$controller_release() {
        MiSnapSettings.UseCase useCase = this.g.a;
        if (useCase == MiSnapSettings.UseCase.ID_FRONT || useCase == MiSnapSettings.UseCase.ID_BACK || useCase == MiSnapSettings.UseCase.PASSPORT) {
            return !DocumentAnalysisSettings.shouldPrioritizeDocumentExtractionOverImageQuality(r3.analysis.document);
        }
        return true;
    }

    public final Barcode prepareBarcodeResult$controller_release(Barcode barcode) {
        String str;
        ErrorResult.VdsProcessingError vdsProcessingError = ErrorResult.VdsProcessingError.INSTANCE;
        barcode.getClass();
        if (Intrinsics.areEqual(barcode.d, Boolean.FALSE)) {
            return barcode;
        }
        Vds vds = barcode.e;
        MutableLiveData mutableLiveData = this.v;
        MibiData.Session session = this.o;
        if (vds == null || (str = vds.b) == null || str.length() == 0) {
            session.addUxpEvent("EVPGF", new String[0]);
            if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                mutableLiveData.setValue(vdsProcessingError);
                return null;
            }
            mutableLiveData.postValue(vdsProcessingError);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vds", str);
            Context context = this.e;
            context.getClass();
            jSONObject.put("mibi", MibiData.toJsonString(context));
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            byte[] bytes = jSONObject2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            String encodeToString = Base64.encodeToString(bytes, 2);
            Vds.VdsHeader vdsHeader = vds.a;
            vdsHeader.getClass();
            return new Barcode(barcode.a, barcode.b, barcode.c, barcode.d, new Vds(vdsHeader, encodeToString));
        } catch (Exception e) {
            Log.e("MiSnapController", "Error preparing VDS barcode payload", e);
            session.addUxpEvent("EVPGF", new String[0]);
            if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                mutableLiveData.setValue(vdsProcessingError);
            } else {
                mutableLiveData.postValue(vdsProcessingError);
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldHandleDeviceMotionFeedback$controller_release(b0 b0Var, boolean z) {
        boolean z2;
        d dVar;
        boolean z3;
        boolean areEqual;
        if (!z) {
            MiSnapSettings miSnapSettings = this.g;
            if (AnalysisSettings.getMotionDetectorSensitivity(miSnapSettings.analysis, miSnapSettings.a) != MiSnapSettings.Analysis.MotionDetectorSensitivity.NONE && this.q) {
                z2 = true;
                dVar = this.d;
                ConcurrentLinkedDeque concurrentLinkedDeque = dVar.f;
                if (dVar.k == 3) {
                    d.c cVar = d.c.a;
                    if (((concurrentLinkedDeque.contains(cVar) && concurrentLinkedDeque.contains(d.c.b)) || !concurrentLinkedDeque.contains(cVar)) && dVar.g.getValue() == cVar) {
                        z3 = true;
                        areEqual = Intrinsics.areEqual(b0Var.a, UserAction.NONE.INSTANCE);
                        zza zzaVar = this.t;
                        Handler handler = this.s;
                        if (areEqual || !z2 || !z3) {
                            if (this.r) {
                                handler.removeCallbacksAndMessages(zzaVar);
                                this.r = false;
                            }
                            return false;
                        }
                        if (!this.r) {
                            handler.postDelayed(zzaVar, 3000L);
                            this.r = true;
                        }
                        boolean z4 = b0Var instanceof j;
                        MibiData.Session session = this.o;
                        if (z4) {
                            MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult = ((j) b0Var).b;
                            session.addUxpEvent("SMCDM", String.valueOf(documentIqasResult != null ? Integer.valueOf(documentIqasResult.b) : null));
                            return true;
                        }
                        if (!(b0Var instanceof f)) {
                            session.addUxpEvent("SMCDM", new String[0]);
                            return true;
                        }
                        MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult2 = ((f) b0Var).c.b;
                        session.addUxpEvent("SMCDM", String.valueOf(documentIqasResult2 != null ? Integer.valueOf(documentIqasResult2.b) : null));
                        return true;
                    }
                }
                z3 = false;
                areEqual = Intrinsics.areEqual(b0Var.a, UserAction.NONE.INSTANCE);
                zza zzaVar2 = this.t;
                Handler handler2 = this.s;
                if (areEqual) {
                }
                if (this.r) {
                }
                return false;
            }
        }
        z2 = false;
        dVar = this.d;
        ConcurrentLinkedDeque concurrentLinkedDeque2 = dVar.f;
        if (dVar.k == 3) {
        }
        z3 = false;
        areEqual = Intrinsics.areEqual(b0Var.a, UserAction.NONE.INSTANCE);
        zza zzaVar22 = this.t;
        Handler handler22 = this.s;
        if (areEqual) {
        }
        if (this.r) {
        }
        return false;
    }

    public final /* synthetic */ boolean shouldTrackFinalFrameDispatched$controller_release() {
        if (!SVG$Unit$EnumUnboxingLocalUtility._isLowerThan(this.f)) {
            if (Companion.f(this.g)) {
                return !DocumentAnalysisSettings.shouldEnableFocusOnFinalFrame(r2.analysis.document);
            }
        }
        return true;
    }

    public final void a(FeedbackResult feedbackResult) {
        MutableLiveData mutableLiveData = this.n;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(feedbackResult);
        } else {
            mutableLiveData.postValue(feedbackResult);
        }
    }

    public static String a(MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult) {
        return "FFSSB: " + documentIqasResult.a + ", FFSSS: " + documentIqasResult.b + ", FFSFC: " + documentIqasResult.c + ", FFSSA: " + documentIqasResult.d + ", FFSRA: " + documentIqasResult.e + ", FFSHF: " + documentIqasResult.f + ", FFSPP: " + documentIqasResult.g + ", FFSGC: " + documentIqasResult.h + ", FFSBC: " + documentIqasResult.i + ", FFSCC: " + documentIqasResult.j + ", FFSMC: " + documentIqasResult.k + ", FFSCO: " + ArraysKt___ArraysKt.joinToString$default(documentIqasResult.l, ",", null, null, MiSnapController$formatDocumentIqaResultsForMiBi$1$1.INSTANCE, 30);
    }

    public static String a(MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult faceIqasResult) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            failure = "FSFBB: " + faceIqasResult.getFaceBoundingBox().toShortString() + ", FSFHF: " + String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(faceIqasResult.getHorizontalFill())}, 1)) + ", FSFPP: " + faceIqasResult.getPadding() + ", FSFPA: " + String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(faceIqasResult.getPitchAngle())}, 1)) + ", FSFYA: " + String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(faceIqasResult.getYawAngle())}, 1)) + ", FSFRA: " + String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(faceIqasResult.getRollAngle())}, 1)) + ", FSFLE: " + String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(faceIqasResult.getLeftEyeOpenConfidence())}, 1)) + ", FSFRE: " + String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(faceIqasResult.getRightEyeOpenConfidence())}, 1)) + ", FSFSM: " + String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(faceIqasResult.getSmileConfidence())}, 1)) + ", FSFLM: " + faceIqasResult.getLuma();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = "";
        }
        return (String) failure;
    }

    public final FeedbackResult a(b0 b0Var, Frame frame, boolean z) {
        Integer luma;
        if (b0Var instanceof j) {
            if (z) {
                UserAction.Document.HOLD_STILL hold_still = UserAction.Document.HOLD_STILL.INSTANCE;
                j jVar = (j) b0Var;
                int[][] iArr = jVar.d;
                a(frame, iArr);
                int[][] iArr2 = jVar.e;
                a(frame, iArr2);
                ArrayList mutableList = CollectionsKt.toMutableList((Collection) jVar.c);
                mutableList.add(hold_still);
                return new FeedbackResult(hold_still, iArr, iArr2, mutableList, null, 16);
            }
            UserAction userAction = b0Var.a;
            j jVar2 = (j) b0Var;
            int[][] iArr3 = jVar2.d;
            a(frame, iArr3);
            int[][] iArr4 = jVar2.e;
            a(frame, iArr4);
            return new FeedbackResult(userAction, iArr3, iArr4, jVar2.c, null, 16);
        }
        if (b0Var instanceof b) {
            return new FeedbackResult(b0Var.a, null, null, null, null, 30);
        }
        if (!(b0Var instanceof f)) {
            FeedbackResult.Metadata metadata = null;
            if (!(b0Var instanceof o)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            UserAction userAction2 = b0Var.a;
            o oVar = (o) b0Var;
            int[][] iArr5 = oVar.d;
            ArrayList arrayList = oVar.c;
            MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult faceIqasResult = oVar.b;
            if (faceIqasResult != null && (luma = faceIqasResult.getLuma()) != null) {
                metadata = new FeedbackResult.Metadata(Integer.valueOf(luma.intValue()));
            }
            return new FeedbackResult(userAction2, iArr5, null, arrayList, metadata, 4);
        }
        if (z) {
            UserAction.Document.HOLD_STILL hold_still2 = UserAction.Document.HOLD_STILL.INSTANCE;
            j jVar3 = ((f) b0Var).c;
            int[][] iArr6 = jVar3.d;
            a(frame, iArr6);
            int[][] iArr7 = jVar3.e;
            a(frame, iArr7);
            ArrayList mutableList2 = CollectionsKt.toMutableList((Collection) jVar3.c);
            mutableList2.add(hold_still2);
            return new FeedbackResult(hold_still2, iArr6, iArr7, mutableList2, null, 16);
        }
        UserAction userAction3 = b0Var.a;
        j jVar4 = ((f) b0Var).c;
        int[][] iArr8 = jVar4.d;
        a(frame, iArr8);
        int[][] iArr9 = jVar4.e;
        a(frame, iArr9);
        return new FeedbackResult(userAction3, iArr8, iArr9, jVar4.c, null, 16);
    }

    public final ErrorResult a() {
        MiSnapDocumentAnalyzer$Result$Failure.ImageFormat imageFormat = MiSnapDocumentAnalyzer$Result$Failure.ImageFormat.INSTANCE;
        a0 a0Var = this.a;
        return a0Var instanceof h ? new ErrorResult.DocumentAnalysis(imageFormat) : a0Var instanceof a ? new ErrorResult.BarcodeAnalysis(MiSnapBarcodeAnalyzer.Result.Failure.ImageFormat.INSTANCE) : a0Var instanceof m ? new ErrorResult.FaceAnalysis(MiSnapFaceAnalyzer.Result.Failure.InputFormat.INSTANCE) : a0Var instanceof e ? new ErrorResult.DocumentAnalysis(imageFormat) : a0Var instanceof g ? new ErrorResult.DocumentClassification(MiSnapDocumentClassifier.Result.Failure.ImageFormat.INSTANCE) : new ErrorResult.DocumentDetection(MiSnapDocumentDetector.Result.Failure.ImageFormat.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0058, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0060, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x005d, code lost:
    
        r1 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x005b, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:26:0x0090, B:28:0x0094, B:30:0x00a0, B:32:0x00aa, B:34:0x00b0, B:37:0x00b3, B:39:0x00bb, B:40:0x00c3), top: B:25:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:26:0x0090, B:28:0x0094, B:30:0x00a0, B:32:0x00aa, B:34:0x00b0, B:37:0x00b3, B:39:0x00bb, B:40:0x00c3), top: B:25:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DocumentExtraction a(j jVar) {
        Mrz mrz;
        DocumentData documentData;
        boolean z;
        String str;
        Object failure;
        String str2;
        MiSnapSettings miSnapSettings = this.g;
        boolean a = w.a(jVar, miSnapSettings);
        DocumentExtraction documentExtraction = jVar.f;
        if (a && w.a(jVar)) {
            if (documentExtraction != null && (mrz = documentExtraction.a) != null) {
                if (mrz instanceof MrzData) {
                    MrzData mrzData = (MrzData) mrz;
                    String str3 = mrzData.g;
                    String repeat = StringsKt__StringsJVMKt.repeat(str3.length(), Marker.ANY_MARKER);
                    String replace$default = StringsKt__StringsJVMKt.replace$default(mrzData.i, str3, StringsKt__StringsJVMKt.repeat(str3.length(), Marker.ANY_MARKER));
                    String str4 = mrzData.b;
                    String str5 = mrzData.c;
                    String str6 = mrzData.d;
                    String str7 = mrzData.e;
                    String str8 = mrzData.f;
                    String str9 = mrzData.h;
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, str5, str6, str7, str8);
                    repeat.getClass();
                    str9.getClass();
                    mrz = new MrzData(str4, str5, str6, str7, str8, repeat, str9, replace$default);
                }
            }
        }
        if (documentExtraction != null && (documentData = documentExtraction.b) != null) {
            String str10 = documentData.j;
            boolean z2 = false;
            if (Intrinsics.areEqual(documentData.b, "NLD")) {
                String str11 = documentData.a;
                if (str11 == null) {
                    str11 = "";
                }
                if (w.a(str11)) {
                    z = true;
                    if (DocumentAnalysisSettings.shouldRedactOptionalData(miSnapSettings.analysis.document) && z) {
                        try {
                            Result.Companion companion = Result.Companion;
                            if (str10 == null) {
                                StringBuilder sb = new StringBuilder();
                                int length = str10.length();
                                for (int i = 0; i < length; i++) {
                                    char charAt = str10.charAt(i);
                                    if (!CharsKt.isWhitespace(charAt)) {
                                        sb.append(charAt);
                                    }
                                }
                                str2 = sb.toString();
                            } else {
                                str2 = null;
                            }
                            failure = Boolean.valueOf(ValidationUtil.c.matches(String.valueOf(str2 == null ? str2.subSequence(0, 9) : null)));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        Object obj = Boolean.FALSE;
                        Result.Companion companion3 = Result.Companion;
                        if (failure instanceof Result.Failure) {
                            failure = obj;
                        }
                        z2 = ((Boolean) failure).booleanValue();
                    }
                    if (z2 && str10 != null) {
                        String repeat2 = StringsKt__StringsJVMKt.repeat(str10.length(), Marker.ANY_MARKER);
                        str = documentData.l;
                        if (str != null) {
                            str = StringsKt__StringsJVMKt.replace$default(str, str10, StringsKt__StringsJVMKt.repeat(str10.length(), Marker.ANY_MARKER));
                        }
                        documentData = new DocumentData(documentData.a, documentData.b, documentData.c, documentData.d, documentData.e, documentData.f, documentData.g, documentData.h, documentData.i, repeat2, documentData.k, str);
                    }
                }
            }
            z = false;
            if (DocumentAnalysisSettings.shouldRedactOptionalData(miSnapSettings.analysis.document)) {
                Result.Companion companion4 = Result.Companion;
                if (str10 == null) {
                }
                failure = Boolean.valueOf(ValidationUtil.c.matches(String.valueOf(str2 == null ? str2.subSequence(0, 9) : null)));
                Object obj2 = Boolean.FALSE;
                Result.Companion companion32 = Result.Companion;
                if (failure instanceof Result.Failure) {
                }
                z2 = ((Boolean) failure).booleanValue();
            }
            if (z2) {
                String repeat22 = StringsKt__StringsJVMKt.repeat(str10.length(), Marker.ANY_MARKER);
                str = documentData.l;
                if (str != null) {
                }
                documentData = new DocumentData(documentData.a, documentData.b, documentData.c, documentData.d, documentData.e, documentData.f, documentData.g, documentData.h, documentData.i, repeat22, documentData.k, str);
            }
        } else {
            documentData = documentExtraction != null ? documentExtraction.b : null;
        }
        ExtractedDataCorners extractedDataCorners = documentExtraction != null ? documentExtraction.c : null;
        DocumentExtraction documentExtraction2 = new DocumentExtraction(mrz, documentData, extractedDataCorners);
        if (mrz == null && documentData == null && extractedDataCorners == null) {
            return null;
        }
        return documentExtraction2;
    }

    public static String a(MiSnapSettings miSnapSettings) {
        MiSnapSettings.Analysis.Document.Advanced.DocType docType = miSnapSettings.analysis.document.advanced.m;
        switch (docType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[docType.ordinal()]) {
            case 1:
                return "Check_Front";
            case 2:
                return "Check_Back";
            case 3:
            case 4:
            case 5:
                return "ID_Front";
            case 6:
            case 7:
                return "ID_Back";
            case 8:
                return "Passport";
            case 9:
                return "Generic";
            default:
                return "";
        }
    }

    public static String a(int i) {
        return i == 2 ? "Landscape" : "Portrait";
    }

    public static ArrayList a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UserAction) it.next()).toString());
        }
        return arrayList;
    }

    public static String a(DocumentClassification documentClassification) {
        switch (documentClassification.a.ordinal()) {
            case 0:
                return "Unknown";
            case 1:
                return "ID_Front";
            case 2:
                return "ID_Back";
            case 3:
                return "DL_Front";
            case 4:
                return "DL_Back";
            case 5:
                return "RP_Front";
            case 6:
                return "Passport";
            case 7:
                return "Passport_Card";
            case 8:
                return "Generic_Front";
            case 9:
                return "Generic_Back";
            case 10:
                return "Education_ID";
            case 11:
                return "Gift_Card";
            case 12:
                return "Health_Insurance";
            case 13:
                return "Library_Card";
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public final void a(Frame frame, int[][] iArr) {
        boolean z = this.h == 1;
        int i = frame.getRotationDegrees() >= 180 ? 180 : 0;
        if (z) {
            i += 90;
        }
        int width = frame.getImageSize().getWidth();
        int height = frame.getImageSize().getHeight();
        iArr.getClass();
        if (i == 90) {
            for (int i2 = 0; i2 < 4; i2++) {
                int[] iArr2 = iArr[i2];
                iArr[i2] = new int[]{height - iArr2[1], iArr2[0]};
            }
            return;
        }
        if (i == 180) {
            for (int i3 = 0; i3 < 4; i3++) {
                int[] iArr3 = iArr[i3];
                iArr[i3] = new int[]{width - iArr3[0], height - iArr3[1]};
            }
            return;
        }
        if (i != 270) {
            return;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            int[] iArr4 = iArr[i4];
            iArr[i4] = new int[]{iArr4[1], width - iArr4[0]};
        }
    }

    public final void a(FrameResult frameResult) {
        if (this.p && shouldTrackFinalFrameDispatched$controller_release()) {
            return;
        }
        this.p = true;
        MutableLiveData mutableLiveData = this.u;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(frameResult);
        } else {
            mutableLiveData.postValue(frameResult);
        }
    }

    public final Container a(Frame frame, b0 b0Var) {
        boolean contains = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{256, 17, 5}).contains(Integer.valueOf(frame.getImageFormat()));
        MiSnapSettings miSnapSettings = this.g;
        boolean z = AnalysisSettings.shouldEnableAiBasedRts(miSnapSettings.analysis, miSnapSettings.a) && frame.getImageFormat() != 17;
        MutableLiveData mutableLiveData = this.v;
        MibiData.Session session = this.o;
        if (contains && !z) {
            session.addUxpEvent("SMCFF", new String[0]);
            try {
                CompressionUtilNativeWrapper compressionUtilNativeWrapper = this.b;
                Context context = this.e;
                context.getClass();
                Container a = compressionUtilNativeWrapper.a(frame, miSnapSettings, b0Var, context);
                if (a != null) {
                    return a;
                }
                session.addUxpEvent("SMCFE", new String[0]);
                ErrorResult b = b();
                mutableLiveData.getClass();
                if (Looper.getMainLooper().isCurrentThread()) {
                    mutableLiveData.setValue(b);
                } else {
                    mutableLiveData.postValue(b);
                }
                return new Container(new byte[0], null);
            } catch (Exception e) {
                Log.e("MiSnapController", "Error processing image", e);
                session.addUxpEvent("SMCFE", new String[0]);
                ErrorResult b2 = b();
                if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                    mutableLiveData.setValue(b2);
                } else {
                    mutableLiveData.postValue(b2);
                }
                return new Container(new byte[0], null);
            }
        }
        session.addUxpEvent("SMCFE", new String[0]);
        ErrorResult a2 = a();
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(a2);
        } else {
            mutableLiveData.postValue(a2);
        }
        return new Container(new byte[0], null);
    }
}
