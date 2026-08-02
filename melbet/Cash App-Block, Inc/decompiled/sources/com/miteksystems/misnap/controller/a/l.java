package com.miteksystems.misnap.controller.a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import androidx.core.view.WindowCompat$Api35Impl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.DocumentData;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.ExtractedDataCorners;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.detector.MiSnapDocumentDetector;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import java.lang.ref.WeakReference;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class l implements a0 {
    public final MiSnapSettings.Analysis a;
    public int b;
    public final h c;
    public final h d;
    public final h e;
    public final MiSnapDocumentDetector f;
    public /* synthetic */ DocumentData g;
    public /* synthetic */ Mrz h;
    public /* synthetic */ ExtractedDataCorners i;
    public final WeakReference j;
    public final c k;

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapDocumentDetector.Detections.values().length];
            try {
                iArr[MiSnapDocumentDetector.Detections.MRZ_3LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MiSnapDocumentDetector.Detections.MRZ_1LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public final class b extends ContinuationImpl {
        public l a;
        public Frame b;
        public /* synthetic */ Object c;
        public int e;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= PKIFailureInfo.systemUnavail;
            return l.this.a(null, this);
        }
    }

    public final class c implements DisplayManager.DisplayListener {
        public final /* synthetic */ Context b;

        public c(Context context) {
            this.b = context;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            l lVar = l.this;
            if (((Context) lVar.j.get()) != null) {
                lVar.b = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(this.b);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public l(Context context, MiSnapSettings.Analysis analysis, String str) {
        analysis.getClass();
        str.getClass();
        int deviceCurrentBasicOrientation = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context);
        h hVar = new h(context, analysis.document.m2166clone(), str);
        MiSnapSettings.Analysis.Document m2166clone = analysis.document.m2166clone();
        m2166clone.advanced.m = MiSnapSettings.Analysis.Document.Advanced.DocType.TD1;
        h hVar2 = new h(context, m2166clone, str);
        MiSnapSettings.Analysis.Document m2166clone2 = analysis.document.m2166clone();
        m2166clone2.advanced.m = MiSnapSettings.Analysis.Document.Advanced.DocType.ONE_LINE_MRZ;
        h hVar3 = new h(context, m2166clone2, str);
        MiSnapDocumentDetector miSnapDocumentDetector = new MiSnapDocumentDetector(str, new MiSnapDocumentDetector.DetectorType[]{MiSnapDocumentDetector.DetectorType.MRZ_DETECTOR});
        this.a = analysis;
        this.b = deviceCurrentBasicOrientation;
        this.c = hVar;
        this.d = hVar2;
        this.e = hVar3;
        this.f = miSnapDocumentDetector;
        this.j = new WeakReference(context);
        c cVar = new c(context);
        this.k = cVar;
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        DisplayManager displayManager = (DisplayManager) systemService;
        Looper myLooper = Looper.myLooper();
        displayManager.registerDisplayListener(cVar, new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00db, code lost:
    
        if (r13 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ec, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ea, code lost:
    
        if (r13 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x004f, code lost:
    
        if (r13 == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.miteksystems.misnap.controller.a.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Frame frame, ContinuationImpl continuationImpl) {
        b bVar;
        int i;
        j jVar;
        DocumentExtraction documentExtraction;
        int i2;
        MiSnapDocumentDetector.Result.Processed findDetections;
        DocumentData documentData;
        ExtractedDataCorners extractedDataCorners;
        Mrz mrz;
        if (continuationImpl instanceof b) {
            bVar = (b) continuationImpl;
            int i3 = bVar.e;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.e = i3 - PKIFailureInfo.systemUnavail;
                Object obj = bVar.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    bVar.a = this;
                    bVar.b = frame;
                    bVar.e = 1;
                    obj = this.c.a(frame, bVar);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = bVar.a;
                        SafeTrace.throwOnFailure(obj);
                        obj.getClass();
                        jVar = (j) obj;
                        DocumentExtraction documentExtraction2 = jVar.f;
                        this.h = documentExtraction2 == null ? documentExtraction2.a : null;
                        this.i = documentExtraction2 == null ? documentExtraction2.c : null;
                        this.g = documentExtraction2 != null ? documentExtraction2.b : null;
                        return (!Intrinsics.areEqual(jVar.a, UserAction.NONE.INSTANCE) && this.h == null && DocumentAnalysisSettings.getDocumentExtractionRequirement(this.a.document) == MiSnapSettings.Analysis.Document.ExtractionRequirement.REQUIRED) ? new j(UserAction.Document.MRZ_NOT_FOUND.INSTANCE, jVar.b, jVar.c, jVar.d, jVar.e, (DocumentExtraction) null, jVar.h, 96) : new j(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e, new DocumentExtraction(this.h, this.g, this.i), jVar.h, 64);
                    }
                    frame = bVar.b;
                    this = bVar.a;
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                jVar = (j) obj;
                documentExtraction = jVar.f;
                if (documentExtraction != null && (mrz = documentExtraction.a) != null) {
                    this.h = mrz;
                }
                if (documentExtraction != null && (extractedDataCorners = documentExtraction.c) != null) {
                    this.i = extractedDataCorners;
                }
                if (documentExtraction != null && (documentData = documentExtraction.b) != null) {
                    this.g = documentData;
                }
                int i4 = this.b;
                MiSnapSettings.Analysis analysis = this.a;
                MiSnapSettings.Analysis.Document document = analysis.document;
                MiSnapSettings.Analysis.Document document2 = analysis.document;
                i2 = !WindowCompat$Api35Impl.isDocumentAlignedWithImage(i4, DocumentAnalysisSettings.getOrientation(document, i4), frame.getRotationDegrees()) ? 0 : 90;
                if ((this.h != null || DocumentAnalysisSettings.shouldRedactOptionalData(document2) || DocumentAnalysisSettings.shouldPrioritizeDocumentExtractionOverImageQuality(document2)) && DocumentAnalysisSettings.requireDocType(document2.advanced) != MiSnapSettings.Analysis.Document.Advanced.DocType.PASSPORT) {
                    findDetections = this.f.findDetections(frame, jVar.d, i2);
                    if (!(findDetections instanceof MiSnapDocumentDetector.Result.Processed)) {
                        MiSnapDocumentDetector.Detections detections = (MiSnapDocumentDetector.Detections) CollectionsKt.firstOrNull(findDetections.getDetections());
                        int i5 = detections == null ? -1 : a.a[detections.ordinal()];
                        if (i5 == 1) {
                            h hVar = this.d;
                            bVar.a = this;
                            bVar.b = null;
                            bVar.e = 2;
                            obj = hVar.a(frame, bVar);
                        } else if (i5 == 2) {
                            h hVar2 = this.e;
                            bVar.a = this;
                            bVar.b = null;
                            bVar.e = 3;
                            obj = hVar2.a(frame, bVar);
                        }
                        DocumentExtraction documentExtraction22 = jVar.f;
                        this.h = documentExtraction22 == null ? documentExtraction22.a : null;
                        this.i = documentExtraction22 == null ? documentExtraction22.c : null;
                        this.g = documentExtraction22 != null ? documentExtraction22.b : null;
                    } else if (findDetections instanceof MiSnapDocumentDetector.Result.Failure) {
                        throw new com.miteksystems.misnap.controller.a.c(new MiSnapController.ErrorResult.DocumentDetection((MiSnapDocumentDetector.Result.Failure) findDetections));
                    }
                }
                if (!Intrinsics.areEqual(jVar.a, UserAction.NONE.INSTANCE)) {
                }
            }
        }
        bVar = new b(continuationImpl);
        Object obj2 = bVar.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.e;
        if (i != 0) {
        }
        obj2.getClass();
        jVar = (j) obj2;
        documentExtraction = jVar.f;
        if (documentExtraction != null) {
            this.h = mrz;
        }
        if (documentExtraction != null) {
            this.i = extractedDataCorners;
        }
        if (documentExtraction != null) {
            this.g = documentData;
        }
        int i42 = this.b;
        MiSnapSettings.Analysis analysis2 = this.a;
        MiSnapSettings.Analysis.Document document3 = analysis2.document;
        MiSnapSettings.Analysis.Document document22 = analysis2.document;
        if (!WindowCompat$Api35Impl.isDocumentAlignedWithImage(i42, DocumentAnalysisSettings.getOrientation(document3, i42), frame.getRotationDegrees())) {
        }
        if (this.h != null) {
        }
        findDetections = this.f.findDetections(frame, jVar.d, i2);
        if (!(findDetections instanceof MiSnapDocumentDetector.Result.Processed)) {
        }
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ void a() {
        this.c.a();
        this.e.a();
        this.d.a();
        Context context = (Context) this.j.get();
        Object systemService = context != null ? context.getSystemService("display") : null;
        systemService.getClass();
        ((DisplayManager) systemService).unregisterDisplayListener(this.k);
        this.h = null;
        this.i = null;
        this.g = null;
    }
}
