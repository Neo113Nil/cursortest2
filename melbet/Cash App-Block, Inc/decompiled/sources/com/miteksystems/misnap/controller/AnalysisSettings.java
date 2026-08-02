package com.miteksystems.misnap.controller;

import com.miteksystems.misnap.core.MiSnapSettings;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public abstract class AnalysisSettings {

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.UseCase.values().length];
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final int getImageQuality(MiSnapSettings.Analysis analysis, MiSnapSettings.UseCase useCase) {
        analysis.getClass();
        useCase.getClass();
        Integer num = analysis.a;
        if (useCase == MiSnapSettings.UseCase.FACE && shouldEnableAiBasedRts(analysis, useCase)) {
            return 70;
        }
        if (num != null && new IntRange(0, 100, 1).contains(num.intValue()) && (!new IntRange(0, 49, 1).contains(num.intValue()) || useCase == MiSnapSettings.UseCase.CHECK_FRONT || useCase == MiSnapSettings.UseCase.CHECK_BACK)) {
            return num.intValue();
        }
        MiSnapSettings.Analysis.INSTANCE.getClass();
        MiSnapSettings.Analysis analysis2 = new MiSnapSettings.Analysis();
        int i = a.a[useCase.ordinal()];
        Integer valueOf = Integer.valueOf(i != 1 ? (i == 2 || i == 3) ? 30 : 90 : 95);
        analysis2.a = valueOf;
        return valueOf.intValue();
    }

    public static final MiSnapSettings.Analysis.MotionDetectorSensitivity getMotionDetectorSensitivity(MiSnapSettings.Analysis analysis, MiSnapSettings.UseCase useCase) {
        analysis.getClass();
        useCase.getClass();
        int i = a.a[useCase.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return MiSnapSettings.Analysis.MotionDetectorSensitivity.NONE;
        }
        MiSnapSettings.Analysis.MotionDetectorSensitivity motionDetectorSensitivity = analysis.c;
        return motionDetectorSensitivity == null ? MiSnapSettings.Analysis.MotionDetectorSensitivity.HIGH : motionDetectorSensitivity;
    }

    public static final boolean isAutoTrigger(MiSnapSettings.Analysis analysis, MiSnapSettings.UseCase useCase) {
        analysis.getClass();
        useCase.getClass();
        int i = a.a[useCase.ordinal()];
        if (i == 1) {
            MiSnapSettings.Analysis.Face.Trigger trigger = analysis.face.a;
            if (trigger == null || trigger == MiSnapSettings.Analysis.Face.Trigger.MANUAL) {
                return false;
            }
        } else if (i != 4) {
            MiSnapSettings.Analysis.Document.Trigger trigger2 = analysis.document.e;
            if (trigger2 == null || trigger2 == MiSnapSettings.Analysis.Document.Trigger.MANUAL) {
                return false;
            }
        } else {
            MiSnapSettings.Analysis.Barcode.Trigger trigger3 = analysis.barcode.d;
            if (trigger3 == null || trigger3 == MiSnapSettings.Analysis.Barcode.Trigger.MANUAL) {
                return false;
            }
        }
        return true;
    }

    public static final boolean shouldEnableAiBasedRts(MiSnapSettings.Analysis analysis, MiSnapSettings.UseCase useCase) {
        Boolean bool;
        analysis.getClass();
        useCase.getClass();
        if (useCase != MiSnapSettings.UseCase.FACE || (bool = analysis.d) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
