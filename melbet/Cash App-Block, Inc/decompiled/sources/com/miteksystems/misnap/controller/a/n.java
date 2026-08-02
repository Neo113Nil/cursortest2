package com.miteksystems.misnap.controller.a;

import com.miteksystems.misnap.core.FaceIqaCheck;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.face.MiSnapFaceAnalyzer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class n {

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FaceIqaCheck.values().length];
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
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static final boolean a(FaceIqaCheck faceIqaCheck, List list) {
        switch (a.a[faceIqaCheck.ordinal()]) {
            case 1:
                return list.contains(MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_FACE_FOUND);
            case 2:
                return list.contains(MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_SINGLE_FACE_DETECTED);
            case 3:
                return list.contains(MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_FACE_WITHIN_MAX_ANGLE);
            case 4:
                return list.contains(MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_FACE_WITHIN_MIN_FILL);
            case 5:
                return list.contains(MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_FACE_WITHIN_MIN_PADDING);
            case 6:
                return list.contains(MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_WITH_EYES_OPEN);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
        }
    }

    public static final UserAction.Face a(FaceIqaCheck faceIqaCheck) {
        faceIqaCheck.getClass();
        switch (a.a[faceIqaCheck.ordinal()]) {
            case 1:
                return UserAction.Face.NOT_FOUND.INSTANCE;
            case 2:
                return UserAction.Face.MULTIPLE_FACES.INSTANCE;
            case 3:
                return UserAction.Face.STRAIGHTEN.INSTANCE;
            case 4:
                return UserAction.Face.TOO_FAR.INSTANCE;
            case 5:
                return UserAction.Face.TOO_CLOSE.INSTANCE;
            case 6:
                return UserAction.Face.OPEN_EYES.INSTANCE;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
