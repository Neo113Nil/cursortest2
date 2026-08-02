package com.miteksystems.misnap.workflow.util;

import com.miteksystems.misnap.core.MiSnapSettings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class SharedPrefsUtil {

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[MiSnapSettings.UseCase.values().length];
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[9] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[3] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[5] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[8] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            a = iArr;
            int[] iArr2 = new int[MiSnapSettings.Analysis.Document.Trigger.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            b = iArr2;
            int[] iArr3 = new int[MiSnapSettings.Analysis.Barcode.Trigger.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            c = iArr3;
        }
    }

    public static String a(MiSnapSettings.UseCase useCase) {
        switch (a.a[useCase.ordinal()]) {
            case 1:
                return "FACE";
            case 2:
                return "BARCODE";
            case 3:
                return "VOICE";
            case 4:
                return "IDCARDFRONT";
            case 5:
                return "IDCARDBACK";
            case 6:
                return "PASSPORT";
            case 7:
                return "CHECKFRONT";
            case 8:
                return "CHECKBACK";
            case 9:
                return "GENERIC_DOCUMENT";
            case 10:
                return "NFC";
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static String a(MiSnapSettings.UseCase useCase, MiSnapSettings.Analysis.Barcode.Trigger trigger) {
        String str;
        StringBuilder sb = new StringBuilder("PREF_FIRST_TIME_");
        int i = a.c[trigger.ordinal()];
        if (i == 1) {
            str = "VIDEO";
        } else {
            if (i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = "MANUAL";
        }
        sb.append(str);
        sb.append("_USER_");
        sb.append(a(useCase));
        sb.append("_KEY");
        return sb.toString();
    }

    public static String a(MiSnapSettings.UseCase useCase, MiSnapSettings.Analysis.Document.Trigger trigger) {
        String str;
        StringBuilder sb = new StringBuilder("PREF_FIRST_TIME_");
        int i = a.b[trigger.ordinal()];
        if (i == 1) {
            str = "VIDEO";
        } else {
            if (i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = "MANUAL";
        }
        sb.append(str);
        sb.append("_USER_");
        sb.append(a(useCase));
        sb.append("_KEY");
        return sb.toString();
    }
}
