package com.miteksystems.misnap.controller.a;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.core.view.WindowCompat$Api35Impl;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.controller.a.i;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.DocumentIqaCheck;
import com.miteksystems.misnap.core.ExtractedDataCorners;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.FrameUtil;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.core.internal.FrameWrapper;
import com.miteksystems.misnap.core.internal.ImageConverterNativeWrapper;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$Result$Failure;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$Result$Processed;
import com.miteksystems.misnap.document.a;
import com.miteksystems.misnap.document.internal.BaseDocument;
import com.miteksystems.misnap.document.internal.CoreFlowIqaResults;
import com.miteksystems.misnap.document.internal.DocumentAnalyzerNativeWrapper;
import com.miteksystems.misnap.document.internal.SpikeNormalizer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h implements a0 {
    public final MiSnapSettings.Analysis.Document a;
    public final boolean c;
    public final MiSnapDocumentAnalyzer d;

    public h(Context context, MiSnapSettings.Analysis.Document document, String str) {
        MiSnapDocumentAnalyzer miSnapDocumentAnalyzer = new MiSnapDocumentAnalyzer(context, document, str);
        document.getClass();
        str.getClass();
        this.a = document;
        this.c = true;
        this.d = miSnapDocumentAnalyzer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x065c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0912 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x02e3  */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.util.ArrayList] */
    @Override // com.miteksystems.misnap.controller.a.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Frame frame, ContinuationImpl continuationImpl) {
        byte[] imageBytes;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck2;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck3;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck4;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck5;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck6;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck7;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck8;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck9;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck10;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck11;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck12;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck13;
        Object obj;
        FrameWrapper frameWrapper;
        int i;
        byte[] bArr;
        boolean isDocumentAlignedWithImage;
        MiSnapSettings.Analysis.Document.Check.Geo geo;
        CoreFlowIqaResults a;
        MiSnapSettings.Analysis.Document.Advanced.DocType docType;
        boolean z;
        double sqrt;
        MiSnapSettings.Analysis.Document.Advanced advanced;
        boolean z2;
        boolean z3;
        int skewAngle;
        Integer num;
        DocumentAnalysisSettings.c cVar;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck14;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck15;
        ArrayList arrayList;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck16;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck17;
        int i2;
        Iterator it;
        Object obj2;
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        BaseDocument documentOcr;
        ExtractedDataCorners extractedDataCorners;
        int[][][] iArr;
        Iterable iterable;
        UserAction userAction;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck18;
        Iterator it2;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck19;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck20;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck21;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck22;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck23;
        DocumentExtraction documentExtraction;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck24;
        boolean contains;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck25;
        boolean contains2;
        MiSnapDocumentAnalyzer miSnapDocumentAnalyzer = this.d;
        boolean z4 = miSnapDocumentAnalyzer.i;
        Object obj3 = MiSnapDocumentAnalyzer$Result$Failure.ImageFormat.INSTANCE$1;
        MibiData.Session session = miSnapDocumentAnalyzer.m;
        MiSnapSettings.Analysis.Document document = miSnapDocumentAnalyzer.h;
        frame.getClass();
        String str2 = miSnapDocumentAnalyzer.e;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck26 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_CORRECT_DOCUMENT;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck27 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MAX_BUSY_BACKGROUND;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck28 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MIN_CONTRAST;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck29 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MIN_FOUR_CORNER_CONFIDENCE;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck30 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MIN_PADDING;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck31 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MIN_HORIZONTAL_FILL;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck32 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MAX_SKEW_ANGLE;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck33 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MAX_ROTATION_ANGLE;
        int i3 = 3;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck34 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MIN_EXTRACTION_CONFIDENCE;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck35 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MAX_GLARE;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck36 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MIN_SHARPNESS;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck37 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MAX_BRIGHTNESS;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck38 = MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck.IS_WITHIN_MIN_BRIGHTNESS;
        if (str2 != null) {
            session.addUxpEvent("EDALF", new String[0]);
            documentCheck12 = documentCheck36;
            obj = new MiSnapDocumentAnalyzer$Result$Failure.License(str2);
            documentCheck11 = documentCheck35;
            documentCheck = documentCheck27;
            documentCheck2 = documentCheck26;
            documentCheck3 = documentCheck38;
            documentCheck4 = documentCheck28;
            documentCheck5 = documentCheck37;
            documentCheck6 = documentCheck29;
            documentCheck7 = documentCheck30;
            documentCheck8 = documentCheck31;
            documentCheck9 = documentCheck33;
            documentCheck10 = documentCheck34;
            documentCheck13 = documentCheck32;
        } else {
            if (miSnapDocumentAnalyzer.f) {
                int imageFormat = frame.getImageFormat();
                int i4 = 5;
                if (imageFormat == 17) {
                    imageBytes = frame.getImageBytes();
                } else if (imageFormat == 256) {
                    byte[] imageBytes2 = frame.getImageBytes();
                    boolean z5 = FrameUtil.a;
                    imageBytes2.getClass();
                    if (FrameUtil.a) {
                        frameWrapper = ImageConverterNativeWrapper.a(FrameUtil.c, imageBytes2);
                    } else {
                        if (!FrameUtil.b.isCurrentSession()) {
                            MibiData.Session bindSession = MibiData.bindSession();
                            FrameUtil.b = bindSession;
                            bindSession.addUxpEvent("EFULL", new String[0]);
                        }
                        frameWrapper = null;
                    }
                    if (frameWrapper == null) {
                        documentCheck = documentCheck27;
                        documentCheck2 = documentCheck26;
                        documentCheck3 = documentCheck38;
                        documentCheck4 = documentCheck28;
                        documentCheck6 = documentCheck29;
                        documentCheck7 = documentCheck30;
                        documentCheck8 = documentCheck31;
                        documentCheck9 = documentCheck33;
                        documentCheck10 = documentCheck34;
                        documentCheck11 = documentCheck35;
                    } else {
                        byte[] bArr2 = frameWrapper.d;
                        int i5 = frameWrapper.b;
                        i = (CameraSelector$$ExternalSyntheticOutline0.values(7).length + (-1) <= i5 || i5 < 0) ? 7 : CameraSelector$$ExternalSyntheticOutline0.values(7)[i5];
                        bArr = bArr2;
                        int i6 = miSnapDocumentAnalyzer.a;
                        int orientation = DocumentAnalysisSettings.getOrientation(document, i6);
                        MiSnapSettings.Analysis.Document.Advanced advanced2 = document.advanced;
                        MiSnapSettings.Analysis.Document.Check check = document.check;
                        isDocumentAlignedWithImage = WindowCompat$Api35Impl.isDocumentAlignedWithImage(i6, orientation, frame.getRotationDegrees());
                        DocumentAnalyzerNativeWrapper documentAnalyzerNativeWrapper = miSnapDocumentAnalyzer.c;
                        Size imageSize = frame.getImageSize();
                        MiSnapSettings.Analysis.Document.Advanced.DocType docType2 = miSnapDocumentAnalyzer.k;
                        check.getClass();
                        geo = check.a;
                        if (geo == null) {
                            geo = MiSnapSettings.Analysis.Document.Check.Geo.GLOBAL;
                        }
                        MiSnapSettings.Analysis.Document.Check.Geo geo2 = geo;
                        advanced2.getClass();
                        Integer num2 = advanced2.a;
                        DocumentAnalysisSettings.b bVar = DocumentAnalysisSettings.b.a;
                        a = documentAnalyzerNativeWrapper.a(bArr, imageSize, i, docType2, geo2, isDocumentAlignedWithImage, DocumentAnalysisSettings.a(advanced2, z4, num2, bVar));
                        com.miteksystems.misnap.document.a aVar = miSnapDocumentAnalyzer.j;
                        frame.getImageSize().getClass();
                        boolean z6 = aVar.b;
                        docType = aVar.d;
                        z = aVar.c;
                        MiSnapSettings.Analysis.Document document2 = aVar.a;
                        a.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int[][] a2 = com.miteksystems.misnap.document.a.a(a.getFourCorners());
                        int[][] a3 = com.miteksystems.misnap.document.a.a(a.getGlareBoundingBox());
                        int[] iArr2 = a3[0];
                        int i7 = iArr2[0];
                        int[] iArr3 = a3[1];
                        int i8 = iArr3[1];
                        int i9 = iArr3[0];
                        int i10 = iArr2[1];
                        int[][] iArr4 = {new int[]{i7, i8}, new int[]{i9, i8}, new int[]{i9, i10}, new int[]{i7, i10}};
                        sqrt = (((Math.sqrt(Math.pow(Math.abs(a2[1][1] - a2[0][1]), 2.0d) + Math.pow(Math.abs(a2[1][0] - a2[0][0]), 2.0d)) + 1.0d) + (Math.sqrt(Math.pow(Math.abs(a2[3][1] - a2[2][1]), 2.0d) + Math.pow(Math.abs(a2[3][0] - a2[2][0]), 2.0d)) + 1.0d)) / 2.0d) / (((Math.sqrt(Math.pow(Math.abs(a2[2][1] - a2[1][1]), 2.0d) + Math.pow(Math.abs(a2[2][0] - a2[1][0]), 2.0d)) + 1.0d) + (Math.sqrt(Math.pow(Math.abs(a2[3][1] - a2[0][1]), 2.0d) + Math.pow(Math.abs(a2[3][0] - a2[0][0]), 2.0d)) + 1.0d)) / 2.0d);
                        if (a.getFourCornerConfidence() < 0) {
                            Log.e("IqaAnalyzer", "4c confidence: " + a.getFourCornerConfidence() + " for docType: " + docType.name());
                        }
                        int fourCornerConfidence = a.getFourCornerConfidence();
                        advanced = document2.advanced;
                        advanced.getClass();
                        z2 = fourCornerConfidence < DocumentAnalysisSettings.a(advanced, z, advanced.a, bVar);
                        docType.getClass();
                        if (docType != MiSnapSettings.Analysis.Document.Advanced.DocType.ID_FRONT || docType == MiSnapSettings.Analysis.Document.Advanced.DocType.ID_BACK) {
                            if (Math.abs((isDocumentAlignedWithImage ? 0.6697923643670461d : 1.493d) - sqrt) > 0.205d) {
                                z3 = false;
                                if (z2 || !z3) {
                                    if (!z2) {
                                        aVar.g.put("DAIFC", a.getFourCornerConfidence());
                                    }
                                    if (!z3) {
                                        aVar.g.put("DAIAR", sqrt);
                                    }
                                } else {
                                    arrayList2.add(documentCheck29);
                                }
                                if (a.getPadding() >= ((int) ((DocumentAnalysisSettings.a(advanced, z, advanced.b, DocumentAnalysisSettings.k.a) / 1000.0f) * Math.min(r3.getHeight(), r3.getWidth())))) {
                                    arrayList2.add(documentCheck30);
                                } else {
                                    aVar.g.put("DAIMP", a.getPadding());
                                }
                                if (a.getHorizontalFill() >= (isDocumentAlignedWithImage ? DocumentAnalysisSettings.a(advanced, z, advanced.d, DocumentAnalysisSettings.h.a) : DocumentAnalysisSettings.a(advanced, z, advanced.c, DocumentAnalysisSettings.i.a))) {
                                    arrayList2.add(documentCheck31);
                                } else {
                                    aVar.g.put("DAIMF", a.getHorizontalFill());
                                }
                                skewAngle = a.getSkewAngle();
                                num = advanced.i;
                                cVar = DocumentAnalysisSettings.c.a;
                                if (skewAngle <= DocumentAnalysisSettings.a(advanced, z, num, cVar)) {
                                    arrayList2.add(documentCheck32);
                                } else {
                                    aVar.g.put("DAISA", a.getSkewAngle());
                                }
                                if (a.getRotationAngle() <= DocumentAnalysisSettings.a(advanced, z, advanced.i, cVar)) {
                                    arrayList2.add(documentCheck33);
                                } else {
                                    aVar.g.put("DAIRA", a.getRotationAngle());
                                }
                                if (a.getBrightness() == Integer.MIN_VALUE) {
                                    documentCheck14 = documentCheck37;
                                    documentCheck15 = documentCheck38;
                                    arrayList = arrayList3;
                                } else if (arrayList2.containsAll(CollectionsKt__CollectionsKt.listOf((Object[]) new MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck[]{documentCheck29, documentCheck31, documentCheck30, documentCheck32, documentCheck33}))) {
                                    if (a.getBrightness() < DocumentAnalysisSettings.a(advanced, z, advanced.e, DocumentAnalysisSettings.d.a)) {
                                        documentCheck14 = documentCheck37;
                                        arrayList2.add(documentCheck14);
                                    } else {
                                        documentCheck14 = documentCheck37;
                                        aVar.g.put("DAIXB", a.getBrightness());
                                    }
                                    if (a.getBrightness() >= DocumentAnalysisSettings.a(advanced, z, advanced.f, DocumentAnalysisSettings.e.a)) {
                                        documentCheck15 = documentCheck38;
                                        arrayList2.add(documentCheck15);
                                    } else {
                                        documentCheck15 = documentCheck38;
                                        aVar.g.put("DAIMB", a.getBrightness());
                                    }
                                    arrayList = arrayList3;
                                    if (a.getContrastConfidence() < DocumentAnalysisSettings.a(advanced, z, advanced.g, DocumentAnalysisSettings.g.a)) {
                                        documentCheck4 = documentCheck28;
                                        arrayList2.add(documentCheck4);
                                        documentCheck6 = documentCheck29;
                                    } else {
                                        documentCheck4 = documentCheck28;
                                        documentCheck6 = documentCheck29;
                                        aVar.g.put("DAICC", a.getContrastConfidence());
                                    }
                                    if (a.getSolidBackgroundConfidence() < DocumentAnalysisSettings.a(advanced, z, advanced.h, DocumentAnalysisSettings.f.a)) {
                                        documentCheck16 = documentCheck27;
                                        arrayList2.add(documentCheck16);
                                        documentCheck3 = documentCheck15;
                                    } else {
                                        documentCheck16 = documentCheck27;
                                        documentCheck3 = documentCheck15;
                                        aVar.g.put("DAIBC", a.getSolidBackgroundConfidence());
                                    }
                                    if (a.getSharpness() != Integer.MIN_VALUE) {
                                        documentCheck17 = documentCheck36;
                                        arrayList.add(documentCheck17);
                                        aVar.h.add("DAISC");
                                        documentCheck5 = documentCheck14;
                                        documentCheck7 = documentCheck30;
                                    } else {
                                        documentCheck17 = documentCheck36;
                                        documentCheck5 = documentCheck14;
                                        documentCheck7 = documentCheck30;
                                        boolean z7 = a.getSharpness() >= DocumentAnalysisSettings.a(advanced, z, advanced.j, DocumentAnalysisSettings.l.a);
                                        if (z6) {
                                            z7 = z7 && !((SpikeNormalizer) aVar.j.getValue()).a(a.getSharpness());
                                        }
                                        if (z7) {
                                            arrayList2.add(documentCheck17);
                                        } else {
                                            aVar.g.put("DAISC", a.getSharpness());
                                        }
                                    }
                                    if (a.getNoGlareConfidence() != Integer.MIN_VALUE) {
                                        documentCheck11 = documentCheck35;
                                        arrayList.add(documentCheck11);
                                        aVar.h.add("DAIGC");
                                        documentCheck12 = documentCheck17;
                                    } else {
                                        documentCheck11 = documentCheck35;
                                        documentCheck12 = documentCheck17;
                                        boolean z8 = a.getNoGlareConfidence() >= DocumentAnalysisSettings.a(advanced, z, advanced.k, DocumentAnalysisSettings.j.a);
                                        if (z6) {
                                            boolean a4 = ((SpikeNormalizer) aVar.k.getValue()).a(a.getNoGlareConfidence());
                                            if (a4) {
                                                arrayList.add(documentCheck11);
                                                aVar.h.add("DAIGC");
                                            } else {
                                                z8 = z8 && !a4;
                                            }
                                        }
                                        if (z8) {
                                            arrayList2.add(documentCheck11);
                                        } else {
                                            aVar.g.put("DAIGC", a.getNoGlareConfidence());
                                        }
                                    }
                                    i2 = a.b.a[docType.ordinal()];
                                    DocumentAnalysisSettings.m mVar = DocumentAnalysisSettings.m.a;
                                    documentCheck8 = documentCheck31;
                                    documentCheck9 = documentCheck33;
                                    if (i2 == 1) {
                                        if (i2 != 2) {
                                            documentCheck2 = documentCheck26;
                                            arrayList2.add(documentCheck2);
                                            documentCheck10 = documentCheck34;
                                            if (a.getMrzConfidence() == Integer.MIN_VALUE) {
                                                arrayList.add(documentCheck10);
                                                aVar.h.add("DAIMC");
                                            } else if (!docType.isMrzDocument() || a.getMrzConfidence() >= DocumentAnalysisSettings.a(advanced, z, advanced.l, mVar)) {
                                                arrayList2.add(documentCheck10);
                                            } else {
                                                aVar.g.put("DAIMC", a.getMrzConfidence());
                                            }
                                        } else {
                                            documentCheck10 = documentCheck34;
                                            documentCheck2 = documentCheck26;
                                            if (a.getMrzConfidence() == Integer.MIN_VALUE) {
                                                arrayList.add(documentCheck10);
                                                aVar.h.add("DAIMC");
                                            } else {
                                                arrayList2.add(documentCheck10);
                                            }
                                            if (com.miteksystems.misnap.document.a.b(a.getDocumentOcr())) {
                                                arrayList2.add(documentCheck2);
                                            } else {
                                                aVar.g.put("DAIPM", "");
                                            }
                                        }
                                        documentCheck = documentCheck16;
                                        documentCheck13 = documentCheck32;
                                    } else {
                                        documentCheck10 = documentCheck34;
                                        documentCheck2 = documentCheck26;
                                        documentCheck13 = documentCheck32;
                                        documentCheck = documentCheck16;
                                        if (a.getMrzConfidence() == Integer.MIN_VALUE) {
                                            arrayList.add(documentCheck10);
                                            aVar.h.add("DAIMC");
                                        } else {
                                            arrayList2.add(documentCheck10);
                                        }
                                        boolean z9 = a.getMrzConfidence() >= DocumentAnalysisSettings.a(advanced, z, advanced.l, mVar);
                                        if (z9 && com.miteksystems.misnap.document.a.b(a.getDocumentOcr())) {
                                            if (z9) {
                                                aVar.g.put("DAIMC", a.getMrzConfidence());
                                            }
                                            if (com.miteksystems.misnap.document.a.b(a.getDocumentOcr())) {
                                                aVar.g.put("DAIPM", "");
                                            }
                                        } else {
                                            arrayList2.add(documentCheck2);
                                        }
                                    }
                                    JSONObject jSONObject3 = aVar.e;
                                    JSONObject jSONObject4 = aVar.g;
                                    JSONObject jSONObject5 = new JSONObject();
                                    it = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"DAIFC", "DAIGC", "DAIMF", "DAIMP", "DAISA", "DAIRA", "DAISC", "DAICC", "DAIBC", "DAIXB", "DAIMB", "DAIAR", "DAIMC", "DAIPM"}).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it.next();
                                        if (jSONObject4.has((String) obj2)) {
                                            break;
                                        }
                                    }
                                    str = (String) obj2;
                                    if (str != null) {
                                        jSONObject5.put(str, jSONObject4.get(str));
                                    }
                                    jSONObject3.put("Failed", jSONObject5.toString());
                                    aVar.e.put("Skipped", CollectionsKt.joinToString$default(aVar.h, null, null, null, 0, null, null, 63));
                                    aVar.g = new JSONObject();
                                    aVar.h = new ArrayList();
                                    jSONObject = aVar.e;
                                    jSONObject2 = aVar.f;
                                    if (jSONObject.length() == jSONObject2.length()) {
                                        Iterator<String> keys = jSONObject.keys();
                                        keys.getClass();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            if (jSONObject2.has(next) && Intrinsics.areEqual(jSONObject.get(next), jSONObject2.get(next))) {
                                            }
                                        }
                                        Mrz mrz = a.getDocumentOcr().toMrz(docType);
                                        documentOcr = a.getDocumentOcr();
                                        if (documentOcr instanceof BaseDocument.ExtendedMrz) {
                                            BaseDocument.ExtendedMrz extendedMrz = (BaseDocument.ExtendedMrz) documentOcr;
                                            if (extendedMrz.getOptionalData1CharCorners().length == 0) {
                                                iArr = new int[0][][];
                                            } else {
                                                Point[][] optionalData1CharCorners = extendedMrz.getOptionalData1CharCorners();
                                                ArrayList arrayList4 = new ArrayList(optionalData1CharCorners.length);
                                                for (Point[] pointArr : optionalData1CharCorners) {
                                                    arrayList4.add(com.miteksystems.misnap.document.a.a(pointArr));
                                                }
                                                iArr = (int[][][]) arrayList4.toArray(new int[0][][]);
                                            }
                                            extractedDataCorners = new ExtractedDataCorners(iArr);
                                        } else {
                                            extractedDataCorners = null;
                                        }
                                        obj = new MiSnapDocumentAnalyzer$Result$Processed(new MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult(a.getBrightness(), a.getSharpness(), a.getFourCornerConfidence(), a.getSkewAngle(), a.getRotationAngle(), a.getHorizontalFill(), a.getPadding(), a.getNoGlareConfidence(), a.getSolidBackgroundConfidence(), a.getContrastConfidence(), a.getMrzConfidence(), a.getFourCorners(), a.getDocumentBoundingBox(), a.getGlareBoundingBox()), arrayList2, arrayList, a2, iArr4, new DocumentExtraction(mrz, miSnapDocumentAnalyzer.d ? a.getDocumentOcr().toDocumentData() : null, extractedDataCorners), miSnapDocumentAnalyzer.g);
                                    }
                                    MibiData.Session session2 = aVar.i;
                                    String jSONObject6 = aVar.e.toString();
                                    jSONObject6.getClass();
                                    session2.addUxpEvent("FDCAF", jSONObject6);
                                    aVar.f = aVar.e;
                                    aVar.e = new JSONObject();
                                    Mrz mrz2 = a.getDocumentOcr().toMrz(docType);
                                    documentOcr = a.getDocumentOcr();
                                    if (documentOcr instanceof BaseDocument.ExtendedMrz) {
                                    }
                                    obj = new MiSnapDocumentAnalyzer$Result$Processed(new MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult(a.getBrightness(), a.getSharpness(), a.getFourCornerConfidence(), a.getSkewAngle(), a.getRotationAngle(), a.getHorizontalFill(), a.getPadding(), a.getNoGlareConfidence(), a.getSolidBackgroundConfidence(), a.getContrastConfidence(), a.getMrzConfidence(), a.getFourCorners(), a.getDocumentBoundingBox(), a.getGlareBoundingBox()), arrayList2, arrayList, a2, iArr4, new DocumentExtraction(mrz2, miSnapDocumentAnalyzer.d ? a.getDocumentOcr().toDocumentData() : null, extractedDataCorners), miSnapDocumentAnalyzer.g);
                                } else {
                                    documentCheck14 = documentCheck37;
                                    arrayList = arrayList3;
                                    documentCheck15 = documentCheck38;
                                }
                                arrayList.add(documentCheck14);
                                arrayList.add(documentCheck15);
                                aVar.h.add("DAIMB");
                                aVar.h.add("DAIXB");
                                if (a.getContrastConfidence() < DocumentAnalysisSettings.a(advanced, z, advanced.g, DocumentAnalysisSettings.g.a)) {
                                }
                                if (a.getSolidBackgroundConfidence() < DocumentAnalysisSettings.a(advanced, z, advanced.h, DocumentAnalysisSettings.f.a)) {
                                }
                                if (a.getSharpness() != Integer.MIN_VALUE) {
                                }
                                if (a.getNoGlareConfidence() != Integer.MIN_VALUE) {
                                }
                                i2 = a.b.a[docType.ordinal()];
                                DocumentAnalysisSettings.m mVar2 = DocumentAnalysisSettings.m.a;
                                documentCheck8 = documentCheck31;
                                documentCheck9 = documentCheck33;
                                if (i2 == 1) {
                                }
                                JSONObject jSONObject32 = aVar.e;
                                JSONObject jSONObject42 = aVar.g;
                                JSONObject jSONObject52 = new JSONObject();
                                it = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"DAIFC", "DAIGC", "DAIMF", "DAIMP", "DAISA", "DAIRA", "DAISC", "DAICC", "DAIBC", "DAIXB", "DAIMB", "DAIAR", "DAIMC", "DAIPM"}).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                str = (String) obj2;
                                if (str != null) {
                                }
                                jSONObject32.put("Failed", jSONObject52.toString());
                                aVar.e.put("Skipped", CollectionsKt.joinToString$default(aVar.h, null, null, null, 0, null, null, 63));
                                aVar.g = new JSONObject();
                                aVar.h = new ArrayList();
                                jSONObject = aVar.e;
                                jSONObject2 = aVar.f;
                                if (jSONObject.length() == jSONObject2.length()) {
                                }
                                MibiData.Session session22 = aVar.i;
                                String jSONObject62 = aVar.e.toString();
                                jSONObject62.getClass();
                                session22.addUxpEvent("FDCAF", jSONObject62);
                                aVar.f = aVar.e;
                                aVar.e = new JSONObject();
                                Mrz mrz22 = a.getDocumentOcr().toMrz(docType);
                                documentOcr = a.getDocumentOcr();
                                if (documentOcr instanceof BaseDocument.ExtendedMrz) {
                                }
                                obj = new MiSnapDocumentAnalyzer$Result$Processed(new MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult(a.getBrightness(), a.getSharpness(), a.getFourCornerConfidence(), a.getSkewAngle(), a.getRotationAngle(), a.getHorizontalFill(), a.getPadding(), a.getNoGlareConfidence(), a.getSolidBackgroundConfidence(), a.getContrastConfidence(), a.getMrzConfidence(), a.getFourCorners(), a.getDocumentBoundingBox(), a.getGlareBoundingBox()), arrayList2, arrayList, a2, iArr4, new DocumentExtraction(mrz22, miSnapDocumentAnalyzer.d ? a.getDocumentOcr().toDocumentData() : null, extractedDataCorners), miSnapDocumentAnalyzer.g);
                            }
                        }
                        z3 = true;
                        if (z2) {
                        }
                        if (!z2) {
                        }
                        if (!z3) {
                        }
                        if (a.getPadding() >= ((int) ((DocumentAnalysisSettings.a(advanced, z, advanced.b, DocumentAnalysisSettings.k.a) / 1000.0f) * Math.min(r3.getHeight(), r3.getWidth())))) {
                        }
                        if (a.getHorizontalFill() >= (isDocumentAlignedWithImage ? DocumentAnalysisSettings.a(advanced, z, advanced.d, DocumentAnalysisSettings.h.a) : DocumentAnalysisSettings.a(advanced, z, advanced.c, DocumentAnalysisSettings.i.a))) {
                        }
                        skewAngle = a.getSkewAngle();
                        num = advanced.i;
                        cVar = DocumentAnalysisSettings.c.a;
                        if (skewAngle <= DocumentAnalysisSettings.a(advanced, z, num, cVar)) {
                        }
                        if (a.getRotationAngle() <= DocumentAnalysisSettings.a(advanced, z, advanced.i, cVar)) {
                        }
                        if (a.getBrightness() == Integer.MIN_VALUE) {
                        }
                        arrayList.add(documentCheck14);
                        arrayList.add(documentCheck15);
                        aVar.h.add("DAIMB");
                        aVar.h.add("DAIXB");
                        if (a.getContrastConfidence() < DocumentAnalysisSettings.a(advanced, z, advanced.g, DocumentAnalysisSettings.g.a)) {
                        }
                        if (a.getSolidBackgroundConfidence() < DocumentAnalysisSettings.a(advanced, z, advanced.h, DocumentAnalysisSettings.f.a)) {
                        }
                        if (a.getSharpness() != Integer.MIN_VALUE) {
                        }
                        if (a.getNoGlareConfidence() != Integer.MIN_VALUE) {
                        }
                        i2 = a.b.a[docType.ordinal()];
                        DocumentAnalysisSettings.m mVar22 = DocumentAnalysisSettings.m.a;
                        documentCheck8 = documentCheck31;
                        documentCheck9 = documentCheck33;
                        if (i2 == 1) {
                        }
                        JSONObject jSONObject322 = aVar.e;
                        JSONObject jSONObject422 = aVar.g;
                        JSONObject jSONObject522 = new JSONObject();
                        it = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"DAIFC", "DAIGC", "DAIMF", "DAIMP", "DAISA", "DAIRA", "DAISC", "DAICC", "DAIBC", "DAIXB", "DAIMB", "DAIAR", "DAIMC", "DAIPM"}).iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        str = (String) obj2;
                        if (str != null) {
                        }
                        jSONObject322.put("Failed", jSONObject522.toString());
                        aVar.e.put("Skipped", CollectionsKt.joinToString$default(aVar.h, null, null, null, 0, null, null, 63));
                        aVar.g = new JSONObject();
                        aVar.h = new ArrayList();
                        jSONObject = aVar.e;
                        jSONObject2 = aVar.f;
                        if (jSONObject.length() == jSONObject2.length()) {
                        }
                        MibiData.Session session222 = aVar.i;
                        String jSONObject622 = aVar.e.toString();
                        jSONObject622.getClass();
                        session222.addUxpEvent("FDCAF", jSONObject622);
                        aVar.f = aVar.e;
                        aVar.e = new JSONObject();
                        Mrz mrz222 = a.getDocumentOcr().toMrz(docType);
                        documentOcr = a.getDocumentOcr();
                        if (documentOcr instanceof BaseDocument.ExtendedMrz) {
                        }
                        obj = new MiSnapDocumentAnalyzer$Result$Processed(new MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult(a.getBrightness(), a.getSharpness(), a.getFourCornerConfidence(), a.getSkewAngle(), a.getRotationAngle(), a.getHorizontalFill(), a.getPadding(), a.getNoGlareConfidence(), a.getSolidBackgroundConfidence(), a.getContrastConfidence(), a.getMrzConfidence(), a.getFourCorners(), a.getDocumentBoundingBox(), a.getGlareBoundingBox()), arrayList2, arrayList, a2, iArr4, new DocumentExtraction(mrz222, miSnapDocumentAnalyzer.d ? a.getDocumentOcr().toDocumentData() : null, extractedDataCorners), miSnapDocumentAnalyzer.g);
                    }
                } else if (imageFormat == 5 || imageFormat == 2) {
                    imageBytes = frame.getImageBytes();
                    int imageFormat2 = frame.getImageFormat();
                    i4 = (CameraSelector$$ExternalSyntheticOutline0.values(7).length + (-1) <= imageFormat2 || imageFormat2 < 0) ? 7 : CameraSelector$$ExternalSyntheticOutline0.values(7)[imageFormat2];
                } else {
                    documentCheck = documentCheck27;
                    documentCheck2 = documentCheck26;
                    documentCheck3 = documentCheck38;
                    documentCheck4 = documentCheck28;
                    documentCheck5 = documentCheck37;
                    documentCheck6 = documentCheck29;
                    documentCheck7 = documentCheck30;
                    documentCheck8 = documentCheck31;
                    documentCheck9 = documentCheck33;
                    documentCheck10 = documentCheck34;
                    documentCheck11 = documentCheck35;
                    documentCheck12 = documentCheck36;
                    documentCheck13 = documentCheck32;
                    session.addUxpEvent("EDAIF", new String[0]);
                    obj = MiSnapDocumentAnalyzer$Result$Failure.ImageFormat.INSTANCE;
                }
                bArr = imageBytes;
                i = i4;
                int i62 = miSnapDocumentAnalyzer.a;
                int orientation2 = DocumentAnalysisSettings.getOrientation(document, i62);
                MiSnapSettings.Analysis.Document.Advanced advanced22 = document.advanced;
                MiSnapSettings.Analysis.Document.Check check2 = document.check;
                isDocumentAlignedWithImage = WindowCompat$Api35Impl.isDocumentAlignedWithImage(i62, orientation2, frame.getRotationDegrees());
                DocumentAnalyzerNativeWrapper documentAnalyzerNativeWrapper2 = miSnapDocumentAnalyzer.c;
                Size imageSize2 = frame.getImageSize();
                MiSnapSettings.Analysis.Document.Advanced.DocType docType22 = miSnapDocumentAnalyzer.k;
                check2.getClass();
                geo = check2.a;
                if (geo == null) {
                }
                MiSnapSettings.Analysis.Document.Check.Geo geo22 = geo;
                advanced22.getClass();
                Integer num22 = advanced22.a;
                DocumentAnalysisSettings.b bVar2 = DocumentAnalysisSettings.b.a;
                a = documentAnalyzerNativeWrapper2.a(bArr, imageSize2, i, docType22, geo22, isDocumentAlignedWithImage, DocumentAnalysisSettings.a(advanced22, z4, num22, bVar2));
                com.miteksystems.misnap.document.a aVar2 = miSnapDocumentAnalyzer.j;
                frame.getImageSize().getClass();
                boolean z62 = aVar2.b;
                docType = aVar2.d;
                z = aVar2.c;
                MiSnapSettings.Analysis.Document document22 = aVar2.a;
                a.getClass();
                ArrayList arrayList22 = new ArrayList();
                ArrayList arrayList32 = new ArrayList();
                int[][] a22 = com.miteksystems.misnap.document.a.a(a.getFourCorners());
                int[][] a32 = com.miteksystems.misnap.document.a.a(a.getGlareBoundingBox());
                int[] iArr22 = a32[0];
                int i72 = iArr22[0];
                int[] iArr32 = a32[1];
                int i82 = iArr32[1];
                int i92 = iArr32[0];
                int i102 = iArr22[1];
                int[][] iArr42 = {new int[]{i72, i82}, new int[]{i92, i82}, new int[]{i92, i102}, new int[]{i72, i102}};
                sqrt = (((Math.sqrt(Math.pow(Math.abs(a22[1][1] - a22[0][1]), 2.0d) + Math.pow(Math.abs(a22[1][0] - a22[0][0]), 2.0d)) + 1.0d) + (Math.sqrt(Math.pow(Math.abs(a22[3][1] - a22[2][1]), 2.0d) + Math.pow(Math.abs(a22[3][0] - a22[2][0]), 2.0d)) + 1.0d)) / 2.0d) / (((Math.sqrt(Math.pow(Math.abs(a22[2][1] - a22[1][1]), 2.0d) + Math.pow(Math.abs(a22[2][0] - a22[1][0]), 2.0d)) + 1.0d) + (Math.sqrt(Math.pow(Math.abs(a22[3][1] - a22[0][1]), 2.0d) + Math.pow(Math.abs(a22[3][0] - a22[0][0]), 2.0d)) + 1.0d)) / 2.0d);
                if (a.getFourCornerConfidence() < 0) {
                }
                int fourCornerConfidence2 = a.getFourCornerConfidence();
                advanced = document22.advanced;
                advanced.getClass();
                if (fourCornerConfidence2 < DocumentAnalysisSettings.a(advanced, z, advanced.a, bVar2)) {
                }
                docType.getClass();
                if (docType != MiSnapSettings.Analysis.Document.Advanced.DocType.ID_FRONT) {
                }
                if (Math.abs((isDocumentAlignedWithImage ? 0.6697923643670461d : 1.493d) - sqrt) > 0.205d) {
                }
                z3 = true;
                if (z2) {
                }
                if (!z2) {
                }
                if (!z3) {
                }
                if (a.getPadding() >= ((int) ((DocumentAnalysisSettings.a(advanced, z, advanced.b, DocumentAnalysisSettings.k.a) / 1000.0f) * Math.min(r3.getHeight(), r3.getWidth())))) {
                }
                if (a.getHorizontalFill() >= (isDocumentAlignedWithImage ? DocumentAnalysisSettings.a(advanced, z, advanced.d, DocumentAnalysisSettings.h.a) : DocumentAnalysisSettings.a(advanced, z, advanced.c, DocumentAnalysisSettings.i.a))) {
                }
                skewAngle = a.getSkewAngle();
                num = advanced.i;
                cVar = DocumentAnalysisSettings.c.a;
                if (skewAngle <= DocumentAnalysisSettings.a(advanced, z, num, cVar)) {
                }
                if (a.getRotationAngle() <= DocumentAnalysisSettings.a(advanced, z, advanced.i, cVar)) {
                }
                if (a.getBrightness() == Integer.MIN_VALUE) {
                }
                arrayList.add(documentCheck14);
                arrayList.add(documentCheck15);
                aVar2.h.add("DAIMB");
                aVar2.h.add("DAIXB");
                if (a.getContrastConfidence() < DocumentAnalysisSettings.a(advanced, z, advanced.g, DocumentAnalysisSettings.g.a)) {
                }
                if (a.getSolidBackgroundConfidence() < DocumentAnalysisSettings.a(advanced, z, advanced.h, DocumentAnalysisSettings.f.a)) {
                }
                if (a.getSharpness() != Integer.MIN_VALUE) {
                }
                if (a.getNoGlareConfidence() != Integer.MIN_VALUE) {
                }
                i2 = a.b.a[docType.ordinal()];
                DocumentAnalysisSettings.m mVar222 = DocumentAnalysisSettings.m.a;
                documentCheck8 = documentCheck31;
                documentCheck9 = documentCheck33;
                if (i2 == 1) {
                }
                JSONObject jSONObject3222 = aVar2.e;
                JSONObject jSONObject4222 = aVar2.g;
                JSONObject jSONObject5222 = new JSONObject();
                it = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"DAIFC", "DAIGC", "DAIMF", "DAIMP", "DAISA", "DAIRA", "DAISC", "DAICC", "DAIBC", "DAIXB", "DAIMB", "DAIAR", "DAIMC", "DAIPM"}).iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                str = (String) obj2;
                if (str != null) {
                }
                jSONObject3222.put("Failed", jSONObject5222.toString());
                aVar2.e.put("Skipped", CollectionsKt.joinToString$default(aVar2.h, null, null, null, 0, null, null, 63));
                aVar2.g = new JSONObject();
                aVar2.h = new ArrayList();
                jSONObject = aVar2.e;
                jSONObject2 = aVar2.f;
                if (jSONObject.length() == jSONObject2.length()) {
                }
                MibiData.Session session2222 = aVar2.i;
                String jSONObject6222 = aVar2.e.toString();
                jSONObject6222.getClass();
                session2222.addUxpEvent("FDCAF", jSONObject6222);
                aVar2.f = aVar2.e;
                aVar2.e = new JSONObject();
                Mrz mrz2222 = a.getDocumentOcr().toMrz(docType);
                documentOcr = a.getDocumentOcr();
                if (documentOcr instanceof BaseDocument.ExtendedMrz) {
                }
                obj = new MiSnapDocumentAnalyzer$Result$Processed(new MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult(a.getBrightness(), a.getSharpness(), a.getFourCornerConfidence(), a.getSkewAngle(), a.getRotationAngle(), a.getHorizontalFill(), a.getPadding(), a.getNoGlareConfidence(), a.getSolidBackgroundConfidence(), a.getContrastConfidence(), a.getMrzConfidence(), a.getFourCorners(), a.getDocumentBoundingBox(), a.getGlareBoundingBox()), arrayList22, arrayList, a22, iArr42, new DocumentExtraction(mrz2222, miSnapDocumentAnalyzer.d ? a.getDocumentOcr().toDocumentData() : null, extractedDataCorners), miSnapDocumentAnalyzer.g);
            } else {
                session.addUxpEvent("EDALL", new String[0]);
                documentCheck = documentCheck27;
                documentCheck2 = documentCheck26;
                documentCheck3 = documentCheck38;
                documentCheck4 = documentCheck28;
                documentCheck6 = documentCheck29;
                documentCheck7 = documentCheck30;
                documentCheck8 = documentCheck31;
                documentCheck9 = documentCheck33;
                documentCheck10 = documentCheck34;
                documentCheck11 = documentCheck35;
            }
            documentCheck12 = documentCheck36;
            documentCheck13 = documentCheck32;
            obj = obj3;
            documentCheck5 = documentCheck37;
        }
        if (obj instanceof MiSnapDocumentAnalyzer$Result$Failure) {
            throw new c(new MiSnapController.ErrorResult.DocumentAnalysis((MiSnapDocumentAnalyzer$Result$Failure) obj));
        }
        if (!(obj instanceof MiSnapDocumentAnalyzer$Result$Processed)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        MiSnapSettings.Analysis.Document document3 = this.a;
        MiSnapSettings.Analysis.Document.Advanced advanced3 = document3.advanced;
        advanced3.getClass();
        List list = advanced3.n;
        if (list == null || list.isEmpty()) {
            iterable = DocumentAnalysisSettings.m2167default(advanced3).n;
            iterable.getClass();
        } else {
            iterable = DocumentAnalysisSettings.a(advanced3, list);
        }
        MiSnapDocumentAnalyzer$Result$Processed miSnapDocumentAnalyzer$Result$Processed = (MiSnapDocumentAnalyzer$Result$Processed) obj;
        DocumentExtraction documentExtraction2 = miSnapDocumentAnalyzer$Result$Processed.f;
        Mrz mrz3 = documentExtraction2.a;
        ArrayList arrayList5 = miSnapDocumentAnalyzer$Result$Processed.b;
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            switch (i.a.a[((DocumentIqaCheck) next2).ordinal()]) {
                case 1:
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentCheck19 = documentCheck5;
                    documentCheck20 = documentCheck13;
                    documentCheck21 = documentCheck;
                    documentCheck22 = documentCheck12;
                    documentCheck23 = documentCheck3;
                    documentExtraction = documentExtraction2;
                    documentCheck24 = documentCheck6;
                    contains = arrayList5.contains(documentCheck24);
                    if (contains) {
                        arrayList6.add(next2);
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                case 2:
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentCheck19 = documentCheck5;
                    documentCheck20 = documentCheck13;
                    documentCheck21 = documentCheck;
                    documentCheck22 = documentCheck12;
                    documentCheck23 = documentCheck3;
                    contains = arrayList5.contains(documentCheck22);
                    documentExtraction = documentExtraction2;
                    documentCheck24 = documentCheck6;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 3:
                    documentCheck18 = documentCheck4;
                    documentCheck19 = documentCheck5;
                    documentCheck20 = documentCheck13;
                    documentCheck21 = documentCheck;
                    documentCheck23 = documentCheck3;
                    contains = arrayList5.contains(documentCheck23);
                    it2 = it3;
                    documentExtraction = documentExtraction2;
                    documentCheck22 = documentCheck12;
                    documentCheck24 = documentCheck6;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 4:
                    documentCheck19 = documentCheck5;
                    documentCheck20 = documentCheck13;
                    documentCheck21 = documentCheck;
                    contains = arrayList5.contains(documentCheck19);
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentExtraction = documentExtraction2;
                    documentCheck22 = documentCheck12;
                    documentCheck24 = documentCheck6;
                    documentCheck23 = documentCheck3;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 5:
                    documentCheck20 = documentCheck13;
                    documentCheck21 = documentCheck;
                    documentCheck25 = documentCheck7;
                    boolean contains3 = arrayList5.contains(documentCheck25);
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentCheck19 = documentCheck5;
                    contains = contains3;
                    documentCheck22 = documentCheck12;
                    documentCheck23 = documentCheck3;
                    documentExtraction = documentExtraction2;
                    documentCheck24 = documentCheck6;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 6:
                    documentCheck20 = documentCheck13;
                    documentCheck21 = documentCheck;
                    documentCheck25 = documentCheck8;
                    boolean contains32 = arrayList5.contains(documentCheck25);
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentCheck19 = documentCheck5;
                    contains = contains32;
                    documentCheck22 = documentCheck12;
                    documentCheck23 = documentCheck3;
                    documentExtraction = documentExtraction2;
                    documentCheck24 = documentCheck6;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 7:
                    documentCheck20 = documentCheck13;
                    documentCheck21 = documentCheck;
                    MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck39 = documentCheck9;
                    if (arrayList5.contains(documentCheck20) && arrayList5.contains(documentCheck39)) {
                        documentCheck9 = documentCheck39;
                        documentCheck18 = documentCheck4;
                        it2 = it3;
                        documentExtraction = documentExtraction2;
                        documentCheck19 = documentCheck5;
                        documentCheck22 = documentCheck12;
                        documentCheck24 = documentCheck6;
                        documentCheck23 = documentCheck3;
                        contains = true;
                    } else {
                        documentCheck9 = documentCheck39;
                        documentCheck18 = documentCheck4;
                        it2 = it3;
                        documentExtraction = documentExtraction2;
                        documentCheck19 = documentCheck5;
                        documentCheck22 = documentCheck12;
                        documentCheck24 = documentCheck6;
                        documentCheck23 = documentCheck3;
                        contains = false;
                    }
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 8:
                    documentCheck21 = documentCheck;
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentCheck19 = documentCheck5;
                    documentCheck22 = documentCheck12;
                    documentCheck23 = documentCheck3;
                    contains = arrayList5.contains(documentCheck21);
                    documentCheck20 = documentCheck13;
                    documentExtraction = documentExtraction2;
                    documentCheck24 = documentCheck6;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 9:
                    contains2 = arrayList5.contains(documentCheck4);
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentCheck19 = documentCheck5;
                    documentCheck20 = documentCheck13;
                    documentCheck22 = documentCheck12;
                    documentCheck23 = documentCheck3;
                    documentExtraction = documentExtraction2;
                    contains = contains2;
                    documentCheck21 = documentCheck;
                    documentCheck24 = documentCheck6;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 10:
                    contains2 = arrayList5.contains(documentCheck2);
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentCheck19 = documentCheck5;
                    documentCheck20 = documentCheck13;
                    documentCheck22 = documentCheck12;
                    documentCheck23 = documentCheck3;
                    documentExtraction = documentExtraction2;
                    contains = contains2;
                    documentCheck21 = documentCheck;
                    documentCheck24 = documentCheck6;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 11:
                    contains2 = arrayList5.contains(documentCheck11);
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentCheck19 = documentCheck5;
                    documentCheck20 = documentCheck13;
                    documentCheck22 = documentCheck12;
                    documentCheck23 = documentCheck3;
                    documentExtraction = documentExtraction2;
                    contains = contains2;
                    documentCheck21 = documentCheck;
                    documentCheck24 = documentCheck6;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                case 12:
                    contains2 = arrayList5.contains(documentCheck10);
                    documentCheck18 = documentCheck4;
                    it2 = it3;
                    documentCheck19 = documentCheck5;
                    documentCheck20 = documentCheck13;
                    documentCheck22 = documentCheck12;
                    documentCheck23 = documentCheck3;
                    documentExtraction = documentExtraction2;
                    contains = contains2;
                    documentCheck21 = documentCheck;
                    documentCheck24 = documentCheck6;
                    if (contains) {
                    }
                    documentCheck5 = documentCheck19;
                    documentCheck3 = documentCheck23;
                    documentCheck12 = documentCheck22;
                    documentCheck6 = documentCheck24;
                    documentCheck = documentCheck21;
                    documentExtraction2 = documentExtraction;
                    documentCheck4 = documentCheck18;
                    it3 = it2;
                    documentCheck13 = documentCheck20;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
        }
        DocumentExtraction documentExtraction3 = documentExtraction2;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck40 = documentCheck5;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck41 = documentCheck12;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentCheck documentCheck42 = documentCheck3;
        UserAction userAction2 = UserAction.NONE.INSTANCE;
        EmptyList emptyList = EmptyList.INSTANCE;
        if (!arrayList6.isEmpty()) {
            ArrayList arrayList7 = new ArrayList();
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                ArrayList arrayList8 = miSnapDocumentAnalyzer$Result$Processed.c;
                int i11 = i.a.a[((DocumentIqaCheck) next3).ordinal()];
                int i12 = i3;
                if (!(i11 != 2 ? i11 != i12 ? i11 != 4 ? i11 != 11 ? i11 != 12 ? false : arrayList8.contains(documentCheck10) : arrayList8.contains(documentCheck11) : arrayList8.contains(documentCheck40) : arrayList8.contains(documentCheck42) : arrayList8.contains(documentCheck41))) {
                    arrayList7.add(next3);
                }
                i3 = i12;
            }
            DocumentIqaCheck documentIqaCheck = (DocumentIqaCheck) CollectionsKt.firstOrNull((List) arrayList7);
            if (documentIqaCheck == null || (userAction = i.a(documentIqaCheck)) == null) {
                userAction = UserAction.Document.NOT_FOUND.INSTANCE;
            }
            ?? arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                arrayList9.add(i.a((DocumentIqaCheck) it5.next()));
            }
            userAction2 = userAction;
            emptyList = arrayList9;
        }
        boolean isMrzDocument = DocumentAnalysisSettings.requireDocType(document3.advanced).isMrzDocument();
        MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement = MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
        if (isMrzDocument) {
            MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement2 = document3.a;
            if (extractionRequirement2 == null) {
                extractionRequirement2 = extractionRequirement;
            }
            if (extractionRequirement2 == MiSnapSettings.Analysis.Document.ExtractionRequirement.REQUIRED && mrz3 == null && Intrinsics.areEqual(userAction2, UserAction.NONE.INSTANCE)) {
                userAction2 = UserAction.Document.MRZ_NOT_FOUND.INSTANCE;
            }
        }
        UserAction.NONE none = UserAction.NONE.INSTANCE;
        EmptyList emptyList2 = emptyList;
        if (!Intrinsics.areEqual(userAction2, none)) {
            boolean isEmpty = emptyList.isEmpty();
            emptyList2 = emptyList;
            if (isEmpty) {
                emptyList2 = CollectionsKt__CollectionsJVMKt.listOf(userAction2);
            }
        }
        EmptyList emptyList3 = emptyList2;
        if (DocumentAnalysisSettings.shouldPrioritizeDocumentExtractionOverImageQuality(document3)) {
            if (mrz3 != null) {
                userAction2 = none;
            } else if (Intrinsics.areEqual(userAction2, none)) {
                userAction2 = UserAction.Document.MRZ_NOT_FOUND.INSTANCE;
            }
            emptyList3 = emptyList2;
            if (Intrinsics.areEqual(userAction2, none)) {
                emptyList3 = EmptyList.INSTANCE;
            }
        }
        EmptyList emptyList4 = emptyList3;
        if (Intrinsics.areEqual(userAction2, none) && DocumentAnalysisSettings.requireTrigger(document3) == MiSnapSettings.Analysis.Document.Trigger.MANUAL && DocumentAnalysisSettings.shouldEnableEnhancedManual(document3)) {
            userAction2 = UserAction.Document.PRESS_MANUAL_BUTTON.INSTANCE;
        }
        UserAction userAction3 = userAction2;
        MiSnapDocumentAnalyzer$Result$Processed.DocumentIqasResult documentIqasResult = this.c ? miSnapDocumentAnalyzer$Result$Processed.a : null;
        int[][] iArr5 = miSnapDocumentAnalyzer$Result$Processed.d;
        int[][] iArr6 = miSnapDocumentAnalyzer$Result$Processed.e;
        MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement3 = document3.a;
        if (extractionRequirement3 == null) {
            extractionRequirement3 = extractionRequirement;
        }
        return new j(userAction3, documentIqasResult, emptyList4, iArr5, iArr6, extractionRequirement3 == extractionRequirement ? null : documentExtraction3, miSnapDocumentAnalyzer$Result$Processed.g, 64);
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final void a() {
        MiSnapDocumentAnalyzer miSnapDocumentAnalyzer = this.d;
        if (miSnapDocumentAnalyzer.b) {
            Context context = (Context) miSnapDocumentAnalyzer.l.get();
            Object systemService = context != null ? context.getSystemService("display") : null;
            systemService.getClass();
            ((DisplayManager) systemService).unregisterDisplayListener(miSnapDocumentAnalyzer.n);
        }
    }
}
