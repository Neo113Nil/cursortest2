package com.miteksystems.misnap.document;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.core.DocumentIqaCheck;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.plaid.internal.EnumC0170g;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public abstract class DocumentAnalysisSettings {

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

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
            a = iArr;
            int[] iArr2 = new int[MiSnapSettings.Analysis.Document.Advanced.DocType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[6] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[2] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[3] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[7] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[5] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
        }
    }

    public final class b extends Lambda implements Function1 {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.a;
        }
    }

    public final class c extends Lambda implements Function1 {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.i;
        }
    }

    public final class d extends Lambda implements Function1 {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.e;
        }
    }

    public final class e extends Lambda implements Function1 {
        public static final e a = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.f;
        }
    }

    public final class f extends Lambda implements Function1 {
        public static final f a = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.h;
        }
    }

    public final class g extends Lambda implements Function1 {
        public static final g a = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.g;
        }
    }

    public final class h extends Lambda implements Function1 {
        public static final h a = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.d;
        }
    }

    public final class i extends Lambda implements Function1 {
        public static final i a = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.c;
        }
    }

    public final class j extends Lambda implements Function1 {
        public static final j a = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.k;
        }
    }

    public final class k extends Lambda implements Function1 {
        public static final k a = new k(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.b;
        }
    }

    public final class l extends Lambda implements Function1 {
        public static final l a = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.j;
        }
    }

    public final class m extends Lambda implements Function1 {
        public static final m a = new m(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapSettings.Analysis.Document.Advanced advanced = (MiSnapSettings.Analysis.Document.Advanced) obj;
            advanced.getClass();
            return advanced.l;
        }
    }

    public static final int a(MiSnapSettings.Analysis.Document.Advanced advanced, boolean z, Integer num, Function1 function1) {
        MiSnapSettings.Analysis.Document.Advanced m2167default;
        if (z) {
            advanced.getClass();
            ArrayList a2 = a(advanced, requireDocType(advanced).isCheck());
            MiSnapSettings.Analysis.Document.Advanced.DocType docType = advanced.m;
            switch (docType == null ? -1 : a.b[docType.ordinal()]) {
                case 1:
                    m2167default = c(a2, true);
                    break;
                case 2:
                    m2167default = b(a2, true);
                    break;
                case 3:
                case 4:
                    m2167default = f(a2, true);
                    break;
                case 5:
                    m2167default = e(a2, true);
                    break;
                case 6:
                    m2167default = d(a2, true);
                    break;
                case 7:
                    m2167default = a(a2, true);
                    break;
                case 8:
                    m2167default = g(a2, true);
                    break;
                default:
                    m2167default = h(a2, true);
                    break;
            }
        } else {
            m2167default = m2167default(advanced);
        }
        Object invoke = function1.invoke(m2167default);
        invoke.getClass();
        return (num != null && new IntRange(0, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 1).contains(num.intValue())) ? num.intValue() : ((Number) invoke).intValue();
    }

    public static final MiSnapSettings.Analysis.Document.Advanced b(ArrayList arrayList, boolean z) {
        MiSnapSettings.Analysis.Document.Advanced advanced = new MiSnapSettings.Analysis.Document.Advanced();
        advanced.a = 600;
        advanced.b = 10;
        advanced.c = 875;
        advanced.d = Integer.valueOf(z ? 650 : 700);
        advanced.e = 930;
        advanced.f = Integer.valueOf(z ? EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE : 330);
        advanced.g = z ? 550 : 600;
        advanced.h = 750;
        advanced.i = 150;
        advanced.j = 550;
        advanced.k = 0;
        advanced.l = 0;
        advanced.n = arrayList;
        return advanced;
    }

    public static final MiSnapSettings.Analysis.Document.Advanced c(ArrayList arrayList, boolean z) {
        MiSnapSettings.Analysis.Document.Advanced advanced = new MiSnapSettings.Analysis.Document.Advanced();
        advanced.a = 600;
        advanced.b = 10;
        advanced.c = 875;
        advanced.d = z ? 650 : 700;
        advanced.e = 900;
        advanced.f = Integer.valueOf(z ? EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE : 330);
        advanced.g = z ? 550 : 600;
        advanced.h = 750;
        advanced.i = 150;
        advanced.j = 650;
        advanced.k = 0;
        advanced.l = 800;
        advanced.n = arrayList;
        return advanced;
    }

    public static final MiSnapSettings.Analysis.Document.Advanced d(ArrayList arrayList, boolean z) {
        MiSnapSettings.Analysis.Document.Advanced advanced = new MiSnapSettings.Analysis.Document.Advanced();
        advanced.a = z ? 750 : 800;
        advanced.b = 50;
        advanced.c = 750;
        advanced.d = Integer.valueOf(z ? 500 : 530);
        advanced.e = 820;
        advanced.f = 200;
        advanced.g = Integer.valueOf(z ? 600 : 640);
        advanced.h = 0;
        advanced.i = Integer.valueOf(z ? 150 : 100);
        advanced.j = 610;
        advanced.k = Integer.valueOf(z ? 550 : 590);
        advanced.l = 0;
        advanced.n = arrayList;
        return advanced;
    }

    /* renamed from: default, reason: not valid java name */
    public static final MiSnapSettings.Analysis.Document.Advanced m2167default(MiSnapSettings.Analysis.Document.Advanced advanced) {
        advanced.getClass();
        ArrayList a2 = a(advanced, requireDocType(advanced).isCheck());
        MiSnapSettings.Analysis.Document.Advanced.DocType docType = advanced.m;
        switch (docType == null ? -1 : a.b[docType.ordinal()]) {
            case 1:
                return c(a2, false);
            case 2:
                return b(a2, false);
            case 3:
            case 4:
                return f(a2, false);
            case 5:
                return e(a2, false);
            case 6:
                return d(a2, false);
            case 7:
                return a(a2, false);
            case 8:
                return g(a2, false);
            default:
                return h(a2, false);
        }
    }

    public static final MiSnapSettings.Analysis.Document.Advanced e(ArrayList arrayList, boolean z) {
        MiSnapSettings.Analysis.Document.Advanced advanced = new MiSnapSettings.Analysis.Document.Advanced();
        advanced.a = z ? 750 : 800;
        advanced.b = 50;
        advanced.c = 750;
        advanced.d = Integer.valueOf(z ? 500 : 530);
        advanced.e = 820;
        advanced.f = 400;
        advanced.g = z ? 600 : 640;
        advanced.h = 0;
        advanced.i = Integer.valueOf(z ? 150 : 100);
        advanced.j = 600;
        advanced.k = Integer.valueOf(z ? 550 : 590);
        advanced.l = 0;
        advanced.n = arrayList;
        return advanced;
    }

    public static final MiSnapSettings.Analysis.Document.Advanced f(ArrayList arrayList, boolean z) {
        MiSnapSettings.Analysis.Document.Advanced advanced = new MiSnapSettings.Analysis.Document.Advanced();
        advanced.a = 10;
        advanced.b = 50;
        advanced.c = 750;
        advanced.d = 500;
        advanced.e = 820;
        advanced.f = 200;
        advanced.g = 0;
        advanced.h = 0;
        advanced.i = 150;
        advanced.j = 700;
        advanced.k = Integer.valueOf(z ? 620 : 640);
        advanced.l = 140;
        advanced.n = arrayList;
        return advanced;
    }

    public static final MiSnapSettings.Analysis.Document.Advanced g(ArrayList arrayList, boolean z) {
        MiSnapSettings.Analysis.Document.Advanced advanced = new MiSnapSettings.Analysis.Document.Advanced();
        advanced.a = z ? 750 : 800;
        advanced.b = 50;
        advanced.c = 750;
        advanced.d = Integer.valueOf(z ? 500 : 530);
        advanced.e = 820;
        advanced.f = 400;
        advanced.g = Integer.valueOf(z ? 600 : 640);
        advanced.h = 0;
        advanced.i = Integer.valueOf(z ? 150 : 100);
        advanced.j = 610;
        advanced.k = Integer.valueOf(z ? 550 : 590);
        advanced.l = 140;
        advanced.n = arrayList;
        return advanced;
    }

    public static final MiSnapSettings.Analysis.Document.ExtractionRequirement getDocumentExtractionRequirement(MiSnapSettings.Analysis.Document document) {
        document.getClass();
        MiSnapSettings.Analysis.Document.ExtractionRequirement extractionRequirement = document.a;
        return extractionRequirement == null ? MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE : extractionRequirement;
    }

    public static final int getOrientation(MiSnapSettings.Analysis.Document document, int i2) {
        document.getClass();
        MiSnapSettings.Analysis.Document.Orientation orientation = document.d;
        if (orientation == null) {
            orientation = MiSnapSettings.Analysis.Document.Orientation.DEVICE;
        }
        int i3 = a.a[orientation.ordinal()];
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 3) {
            return i2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    public static final MiSnapSettings.Analysis.Document.Advanced h(ArrayList arrayList, boolean z) {
        MiSnapSettings.Analysis.Document.Advanced advanced = new MiSnapSettings.Analysis.Document.Advanced();
        advanced.a = 700;
        advanced.b = 50;
        advanced.c = 750;
        advanced.d = z ? r1 : 600;
        advanced.e = 820;
        advanced.f = 330;
        advanced.g = z ? 550 : 600;
        advanced.h = 750;
        advanced.i = 150;
        advanced.j = 600;
        advanced.k = 0;
        advanced.l = 0;
        advanced.n = arrayList;
        return advanced;
    }

    public static final MiSnapSettings.Analysis.Document.Advanced.DocType requireDocType(MiSnapSettings.Analysis.Document.Advanced advanced) {
        advanced.getClass();
        MiSnapSettings.Analysis.Document.Advanced.DocType docType = advanced.m;
        if (docType != null) {
            return docType;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required parameter 'docType' is missing from MiSnapSettings");
        return null;
    }

    public static final MiSnapSettings.Analysis.Document.Trigger requireTrigger(MiSnapSettings.Analysis.Document document) {
        document.getClass();
        MiSnapSettings.Analysis.Document.Trigger trigger = document.e;
        if (trigger != null) {
            return trigger;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required parameter 'trigger' is missing from MiSnapSettings");
        return null;
    }

    public static final boolean shouldEnableEnhancedManual(MiSnapSettings.Analysis.Document document) {
        document.getClass();
        Boolean bool = document.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean shouldEnableFocusOnFinalFrame(MiSnapSettings.Analysis.Document document) {
        Boolean bool;
        document.getClass();
        if (requireDocType(document.advanced).isCheck() || (bool = document.i) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final boolean shouldPrioritizeDocumentExtractionOverImageQuality(MiSnapSettings.Analysis.Document document) {
        Boolean bool;
        document.getClass();
        if (getDocumentExtractionRequirement(document) != MiSnapSettings.Analysis.Document.ExtractionRequirement.REQUIRED || (bool = document.b) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final boolean shouldRedactOptionalData(MiSnapSettings.Analysis.Document document) {
        document.getClass();
        Boolean bool = document.f;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final MiSnapSettings.Analysis.Document.Advanced a(ArrayList arrayList, boolean z) {
        int i2;
        MiSnapSettings.Analysis.Document.Advanced advanced = new MiSnapSettings.Analysis.Document.Advanced();
        advanced.a = z ? 750 : 800;
        advanced.b = 50;
        advanced.c = 750;
        advanced.d = Integer.valueOf(z ? 500 : 530);
        advanced.e = 820;
        advanced.f = 400;
        if (z) {
            i2 = 600;
        } else {
            i2 = 640;
        }
        advanced.g = i2;
        advanced.h = 0;
        advanced.i = Integer.valueOf(z ? 150 : 100);
        advanced.j = 600;
        advanced.k = Integer.valueOf(z ? 550 : 590);
        advanced.l = 10;
        advanced.n = arrayList;
        return advanced;
    }

    public static final /* synthetic */ ArrayList a(MiSnapSettings.Analysis.Document.Advanced advanced, boolean z) {
        DocumentIqaCheck documentIqaCheck = DocumentIqaCheck.SHARP_ENOUGH;
        DocumentIqaCheck documentIqaCheck2 = DocumentIqaCheck.NOT_TOO_DARK;
        DocumentIqaCheck documentIqaCheck3 = DocumentIqaCheck.NOT_TOO_BRIGHT;
        DocumentIqaCheck documentIqaCheck4 = DocumentIqaCheck.WITHIN_BOUNDS;
        DocumentIqaCheck documentIqaCheck5 = DocumentIqaCheck.CLOSE_ENOUGH;
        DocumentIqaCheck documentIqaCheck6 = DocumentIqaCheck.GOOD_ANGLE;
        DocumentIqaCheck documentIqaCheck7 = DocumentIqaCheck.PLAIN_BACKGROUND;
        DocumentIqaCheck documentIqaCheck8 = DocumentIqaCheck.GOOD_CONTRAST;
        DocumentIqaCheck documentIqaCheck9 = DocumentIqaCheck.FOUR_CORNER_CONFIDENCE;
        return a(advanced, z ? CollectionsKt__CollectionsKt.listOf((Object[]) new DocumentIqaCheck[]{documentIqaCheck9, documentIqaCheck8, documentIqaCheck7, documentIqaCheck6, documentIqaCheck5, documentIqaCheck4, documentIqaCheck3, documentIqaCheck2, DocumentIqaCheck.CORRECT_DOCUMENT, documentIqaCheck}) : CollectionsKt__CollectionsKt.listOf((Object[]) new DocumentIqaCheck[]{DocumentIqaCheck.NO_GLARE, documentIqaCheck9, documentIqaCheck8, documentIqaCheck7, documentIqaCheck6, documentIqaCheck5, documentIqaCheck4, documentIqaCheck3, documentIqaCheck2, documentIqaCheck, DocumentIqaCheck.EXTRACTION_CONFIDENCE}));
    }

    public static final ArrayList a(MiSnapSettings.Analysis.Document.Advanced advanced, List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            DocumentIqaCheck documentIqaCheck = (DocumentIqaCheck) next;
            Object obj = linkedHashMap.get(documentIqaCheck);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(documentIqaCheck, obj);
            }
            ((List) obj).add(next);
        }
        MiSnapSettings.Analysis.Document.Advanced.DocType requireDocType = requireDocType(advanced);
        DocumentIqaCheck documentIqaCheck2 = DocumentIqaCheck.NO_GLARE;
        if (arrayList.contains(documentIqaCheck2)) {
            if (!CollectionsKt__CollectionsKt.listOf((Object[]) new MiSnapSettings.Analysis.Document.Advanced.DocType[]{MiSnapSettings.Analysis.Document.Advanced.DocType.ID_FRONT, MiSnapSettings.Analysis.Document.Advanced.DocType.ID_BACK, MiSnapSettings.Analysis.Document.Advanced.DocType.PASSPORT, MiSnapSettings.Analysis.Document.Advanced.DocType.TD1, MiSnapSettings.Analysis.Document.Advanced.DocType.ONE_LINE_MRZ}).contains(requireDocType)) {
                arrayList.remove(documentIqaCheck2);
            }
        }
        DocumentIqaCheck documentIqaCheck3 = DocumentIqaCheck.EXTRACTION_CONFIDENCE;
        if (arrayList.contains(documentIqaCheck3) && !requireDocType.isMrzDocument()) {
            arrayList.remove(documentIqaCheck3);
        }
        DocumentIqaCheck documentIqaCheck4 = DocumentIqaCheck.CORRECT_DOCUMENT;
        if (arrayList.contains(documentIqaCheck4) && !requireDocType.isCheck()) {
            arrayList.remove(documentIqaCheck4);
        }
        return arrayList;
    }
}
