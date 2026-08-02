package androidx.camera.core.featuregroup.impl;

import androidx.transition.Transition;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public enum UseCaseType {
    PREVIEW("PREVIEW"),
    IMAGE_CAPTURE("IMAGE_CAPTURE"),
    IMAGE_ANALYSIS("IMAGE_ANALYSIS"),
    VIDEO_CAPTURE("VIDEO_CAPTURE"),
    STREAM_SHARING("STREAM_SHARING"),
    UNDEFINED("UNDEFINED");

    public static final Transition.AnonymousClass1 Companion = new Transition.AnonymousClass1();
    public final Class surfaceClass;

    UseCaseType(String str) {
        this.surfaceClass = r2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "Preview";
        }
        if (ordinal == 1) {
            return "ImageCapture";
        }
        if (ordinal == 2) {
            return "ImageAnalysis";
        }
        if (ordinal == 3) {
            return "VideoCapture";
        }
        if (ordinal == 4) {
            return "StreamSharing";
        }
        if (ordinal == 5) {
            return "Undefined";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
