package com.miteksystems.misnap.controller.a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import androidx.core.view.WindowCompat$Api35Impl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.classifier.MiSnapDocumentClassifier;
import com.miteksystems.misnap.classifier.util.ClassificationUtil;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.DocumentClassification;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.LicenseException;
import com.miteksystems.misnap.core.LicenseStatus;
import com.miteksystems.misnap.core.LicenseUtil;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$Result$Processed;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import net.oneformapp.helper.HelperFunctions;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class g implements a0 {
    public final MiSnapSettings.Analysis a;
    public int b;
    public final a0 c;
    public final MiSnapDocumentClassifier d;
    public final MibiData.Session e;
    public final String f;
    public final /* synthetic */ ArrayList g;
    public /* synthetic */ int h;
    public /* synthetic */ int i;
    public /* synthetic */ DocumentClassification j;
    public final WeakReference k;
    public final d l;

    public abstract /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DocumentClassification.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[7] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[2] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            a = iArr;
        }
    }

    public final class c extends ContinuationImpl {
        public g a;
        public Frame b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= PKIFailureInfo.systemUnavail;
            return g.this.a((Frame) null, this);
        }
    }

    public final class d implements DisplayManager.DisplayListener {
        public final /* synthetic */ Context b;

        public d(Context context) {
            this.b = context;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            g gVar = g.this;
            if (((Context) gVar.k.get()) != null) {
                gVar.b = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(this.b);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context, MiSnapSettings.Analysis analysis, String str, int i, a0 a0Var, MiSnapDocumentClassifier miSnapDocumentClassifier) {
        String message;
        a0 a0Var2;
        MiSnapDocumentClassifier.ClassificationRoutine classificationRoutine;
        LicenseStatus checkLicenseStatus;
        analysis.getClass();
        str.getClass();
        this.a = analysis;
        this.b = i;
        this.c = a0Var;
        this.d = miSnapDocumentClassifier;
        this.e = MibiData.bindSession();
        try {
            boolean z = LicenseUtil.a;
            checkLicenseStatus = HelperFunctions.checkLicenseStatus(str, "odc");
        } catch (LicenseException e) {
            message = e.getMessage();
        }
        if (checkLicenseStatus != LicenseStatus.VALID && checkLicenseStatus != LicenseStatus.EXPIRED) {
            message = checkLicenseStatus.toMessage();
            this.f = message;
            ArrayList mutableList = ArraysKt___ArraysKt.toMutableList(MiSnapDocumentClassifier.ClassificationRoutine.values());
            mutableList.remove(MiSnapDocumentClassifier.ClassificationRoutine.ALL);
            a0Var2 = this.c;
            if (a0Var2 instanceof h) {
                if (a0Var2 instanceof l) {
                    mutableList.remove(MiSnapDocumentClassifier.ClassificationRoutine.MRZ_1_LINE);
                    classificationRoutine = MiSnapDocumentClassifier.ClassificationRoutine.MRZ_3_LINE;
                }
                this.g = mutableList;
                this.k = new WeakReference(context);
                d dVar = new d(context);
                this.l = dVar;
                Object systemService = context.getSystemService("display");
                systemService.getClass();
                DisplayManager displayManager = (DisplayManager) systemService;
                Looper myLooper = Looper.myLooper();
                displayManager.registerDisplayListener(dVar, new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            }
            classificationRoutine = MiSnapDocumentClassifier.ClassificationRoutine.MRZ_2_LINE;
            mutableList.remove(classificationRoutine);
            this.g = mutableList;
            this.k = new WeakReference(context);
            d dVar2 = new d(context);
            this.l = dVar2;
            Object systemService2 = context.getSystemService("display");
            systemService2.getClass();
            DisplayManager displayManager2 = (DisplayManager) systemService2;
            Looper myLooper2 = Looper.myLooper();
            displayManager2.registerDisplayListener(dVar2, new Handler(myLooper2 == null ? Looper.getMainLooper() : myLooper2));
        }
        message = null;
        this.f = message;
        ArrayList mutableList2 = ArraysKt___ArraysKt.toMutableList(MiSnapDocumentClassifier.ClassificationRoutine.values());
        mutableList2.remove(MiSnapDocumentClassifier.ClassificationRoutine.ALL);
        a0Var2 = this.c;
        if (a0Var2 instanceof h) {
        }
        mutableList2.remove(classificationRoutine);
        this.g = mutableList2;
        this.k = new WeakReference(context);
        d dVar22 = new d(context);
        this.l = dVar22;
        Object systemService22 = context.getSystemService("display");
        systemService22.getClass();
        DisplayManager displayManager22 = (DisplayManager) systemService22;
        Looper myLooper22 = Looper.myLooper();
        displayManager22.registerDisplayListener(dVar22, new Handler(myLooper22 == null ? Looper.getMainLooper() : myLooper22));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.miteksystems.misnap.controller.a.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Frame frame, ContinuationImpl continuationImpl) {
        c cVar;
        int i;
        int i2;
        Object a;
        j jVar;
        DocumentClassification documentClassification;
        MiSnapDocumentClassifier.Result.Processed processed;
        Mrz mrz;
        DocumentClassification.Type classifyFromMrzData;
        DocumentClassification documentClassification2;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i3 = cVar.f;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f = i3 - PKIFailureInfo.systemUnavail;
                Object obj = cVar.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.f;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.f != null) {
                        throw new com.miteksystems.misnap.controller.a.c(new MiSnapController.ErrorResult.DocumentClassification(new MiSnapDocumentClassifier.Result.Failure.License(this.f)));
                    }
                    this.h++;
                    int i4 = this.b;
                    i2 = WindowCompat$Api35Impl.isDocumentAlignedWithImage(i4, DocumentAnalysisSettings.getOrientation(this.a.document, i4), frame.getRotationDegrees()) ? 0 : 90;
                    a0 a0Var = this.c;
                    cVar.a = this;
                    cVar.b = frame;
                    cVar.c = i2;
                    cVar.f = 1;
                    a = a0Var.a(frame, cVar);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = cVar.c;
                    frame = cVar.b;
                    g gVar = cVar.a;
                    SafeTrace.throwOnFailure(obj);
                    i2 = i5;
                    this = gVar;
                    a = obj;
                }
                a.getClass();
                jVar = (j) a;
                if (this.h > 1 && DocumentAnalysisSettings.requireTrigger(this.a.document) != MiSnapSettings.Analysis.Document.Trigger.MANUAL) {
                    return this.a(jVar, (DocumentClassification) null);
                }
                documentClassification = this.j;
                if (documentClassification != null) {
                    if (a(DocumentAnalysisSettings.requireDocType(this.a.document.advanced), documentClassification.a)) {
                        return this.a(jVar, documentClassification);
                    }
                    this.j = null;
                }
                if (this.i >= 4) {
                    DocumentExtraction documentExtraction = jVar.f;
                    if (documentExtraction != null && (mrz = documentExtraction.a) != null && (classifyFromMrzData = ClassificationUtil.INSTANCE.classifyFromMrzData(mrz)) != null) {
                        this.e.addUxpEvent("CCBAS", classifyFromMrzData.name());
                        documentClassification2 = new DocumentClassification(classifyFromMrzData);
                        return this.a(jVar, documentClassification2);
                    }
                    MiSnapDocumentClassifier.Result.Processed classify = this.d.classify(frame, i2, this.g);
                    if (!(classify instanceof MiSnapDocumentClassifier.Result.Processed)) {
                        if (classify instanceof MiSnapDocumentClassifier.Result.Failure) {
                            throw new com.miteksystems.misnap.controller.a.c(new MiSnapController.ErrorResult.DocumentClassification((MiSnapDocumentClassifier.Result.Failure) classify));
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    processed = classify;
                } else {
                    if (!Intrinsics.areEqual(jVar.a, UserAction.NONE.INSTANCE)) {
                        return this.a(jVar, (DocumentClassification) null);
                    }
                    MiSnapDocumentClassifier.Result.Failure classify2 = this.d.classify(frame, i2, this.g);
                    if (!(classify2 instanceof MiSnapDocumentClassifier.Result.Processed)) {
                        if (classify2 instanceof MiSnapDocumentClassifier.Result.Failure) {
                            throw new com.miteksystems.misnap.controller.a.c(new MiSnapController.ErrorResult.DocumentClassification(classify2));
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    processed = (MiSnapDocumentClassifier.Result.Processed) classify2;
                    this.j = processed.getDocumentClassification();
                }
                documentClassification2 = processed.getDocumentClassification();
                return this.a(jVar, documentClassification2);
            }
        }
        cVar = new c(continuationImpl);
        Object obj2 = cVar.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.f;
        if (i != 0) {
        }
        a.getClass();
        jVar = (j) a;
        if (this.h > 1) {
        }
        documentClassification = this.j;
        if (documentClassification != null) {
        }
        if (this.i >= 4) {
        }
        documentClassification2 = processed.getDocumentClassification();
        return this.a(jVar, documentClassification2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context, MiSnapSettings.Analysis analysis, String str) {
        this(context, analysis, str, r4, r0, new MiSnapDocumentClassifier(context, analysis, str));
        a0 lVar;
        analysis.getClass();
        str.getClass();
        int deviceCurrentBasicOrientation = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context);
        MiSnapSettings.Analysis.Document document = analysis.document;
        MiSnapSettings.Analysis.Document.Advanced.DocType requireDocType = DocumentAnalysisSettings.requireDocType(document.advanced);
        MiSnapSettings.Analysis.Document.Advanced.DocType docType = MiSnapSettings.Analysis.Document.Advanced.DocType.PASSPORT;
        MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement = MiSnapSettings.Analysis.Document.ExtractionRequirement.OPTIONAL;
        MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement2 = MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
        if (requireDocType == docType) {
            MiSnapSettings.Analysis.Document m2166clone = document.m2166clone();
            MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement3 = document.a;
            if ((extractionRequirement3 == null ? extractionRequirement2 : extractionRequirement3) == extractionRequirement2) {
                m2166clone.a = extractionRequirement;
            }
            lVar = new h(context, m2166clone, str);
        } else {
            Json.Default r1 = Json.Default;
            r1.getClass();
            MiSnapSettings.Analysis.Companion companion = MiSnapSettings.Analysis.INSTANCE;
            MiSnapSettings.Analysis analysis2 = (MiSnapSettings.Analysis) r1.decodeFromString(r1.encodeToString(companion.serializer(), analysis), companion.serializer());
            if (DocumentAnalysisSettings.getDocumentExtractionRequirement(document) == extractionRequirement2) {
                analysis2.document.a = extractionRequirement;
            }
            lVar = new l(context, analysis2, str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(MiSnapSettings.Analysis.Document.Advanced.DocType docType, DocumentClassification.Type type2) {
        type2.getClass();
        switch (b.a[type2.ordinal()]) {
            case 1:
                return true;
            case 2:
                return docType == MiSnapSettings.Analysis.Document.Advanced.DocType.PASSPORT;
            case 3:
            case 4:
            case 5:
            case 6:
                if (docType == MiSnapSettings.Analysis.Document.Advanced.DocType.ID_FRONT || docType == MiSnapSettings.Analysis.Document.Advanced.DocType.ONE_LINE_MRZ || docType == MiSnapSettings.Analysis.Document.Advanced.DocType.TD2) {
                    return true;
                }
                break;
            case 7:
            case 8:
                if (docType == MiSnapSettings.Analysis.Document.Advanced.DocType.TD1 || docType == MiSnapSettings.Analysis.Document.Advanced.DocType.ID_BACK) {
                    return true;
                }
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
        }
    }

    public final j a(j jVar, DocumentClassification documentClassification) {
        List list;
        DocumentExtraction documentExtraction;
        DocumentExtraction documentExtraction2 = jVar.f;
        MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement = MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
        MiSnapSettings.Analysis analysis = this.a;
        if (documentClassification != null) {
            DocumentClassification.Type type2 = documentClassification.a;
            UserAction userAction = jVar.a;
            if (type2 != DocumentClassification.Type.UNKNOWN) {
                this.e.addUxpEvent("CCARE", new String[0]);
                this.i = 0;
                this.j = documentClassification;
                if (!a(DocumentAnalysisSettings.requireDocType(analysis.document.advanced), type2)) {
                    a0 a0Var = this.c;
                    if (a0Var instanceof l) {
                        l lVar = (l) a0Var;
                        lVar.h = null;
                        lVar.i = null;
                        lVar.g = null;
                    }
                    userAction = UserAction.Document.WRONG_DOCUMENT.INSTANCE;
                }
            } else {
                int i = this.i;
                if (i < 4) {
                    this.i = i + 1;
                    if (Intrinsics.areEqual(userAction, UserAction.NONE.INSTANCE)) {
                        userAction = UserAction.Document.HOLD_STILL.INSTANCE;
                    }
                }
            }
            boolean z = userAction instanceof UserAction.Document.WRONG_DOCUMENT;
            List list2 = jVar.c;
            List list3 = list2;
            if (z) {
                ArrayList mutableList = CollectionsKt.toMutableList((Collection) list2);
                mutableList.remove(userAction);
                mutableList.add(0, userAction);
                list3 = mutableList;
            }
            MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult = jVar.b;
            int[][] iArr = jVar.d;
            int[][] iArr2 = jVar.e;
            if (DocumentAnalysisSettings.getDocumentExtractionRequirement(analysis.document) == extractionRequirement) {
                list = list3;
                documentExtraction = null;
            } else {
                list = list3;
                documentExtraction = documentExtraction2;
            }
            return new j(userAction, documentIqasResult, list, iArr, iArr2, documentExtraction, documentClassification, jVar.h);
        }
        DocumentExtraction documentExtraction3 = documentExtraction2;
        UserAction userAction2 = jVar.a;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult2 = jVar.b;
        List list4 = jVar.c;
        int[][] iArr3 = jVar.d;
        int[][] iArr4 = jVar.e;
        if (DocumentAnalysisSettings.getDocumentExtractionRequirement(analysis.document) == extractionRequirement) {
            documentExtraction3 = null;
        }
        return new j(userAction2, documentIqasResult2, list4, iArr3, iArr4, documentExtraction3, (DocumentClassification) null, jVar.h);
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final void a() {
        Context context = (Context) this.k.get();
        Object systemService = context != null ? context.getSystemService("display") : null;
        systemService.getClass();
        ((DisplayManager) systemService).unregisterDisplayListener(this.l);
        this.c.a();
        this.d.release();
        this.j = null;
        this.i = 0;
        this.h = 0;
    }
}
