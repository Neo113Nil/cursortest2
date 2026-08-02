package com.miteksystems.misnap.controller.a;

import com.miteksystems.misnap.core.DocumentIqaCheck;
import com.miteksystems.misnap.core.UserAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class i {

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DocumentIqaCheck.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[4] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    public static final UserAction.Document a(DocumentIqaCheck documentIqaCheck) {
        documentIqaCheck.getClass();
        switch (a.a[documentIqaCheck.ordinal()]) {
            case 1:
            case 12:
                return UserAction.Document.NOT_FOUND.INSTANCE;
            case 2:
                return UserAction.Document.HOLD_STILL.INSTANCE;
            case 3:
                return UserAction.Document.TOO_DARK.INSTANCE;
            case 4:
                return UserAction.Document.TOO_BRIGHT.INSTANCE;
            case 5:
                return UserAction.Document.TOO_CLOSE.INSTANCE;
            case 6:
                return UserAction.Document.TOO_FAR.INSTANCE;
            case 7:
                return UserAction.Document.STRAIGHTEN.INSTANCE;
            case 8:
                return UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE;
            case 9:
                return UserAction.Document.USE_DARK_BACKGROUND.INSTANCE;
            case 10:
                return UserAction.Document.WRONG_DOCUMENT.INSTANCE;
            case 11:
                return UserAction.Document.REDUCE_GLARE.INSTANCE;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
