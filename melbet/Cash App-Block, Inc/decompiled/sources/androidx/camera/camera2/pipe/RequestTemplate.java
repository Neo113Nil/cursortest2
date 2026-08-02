package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class RequestTemplate {
    public final int value;

    /* renamed from: getName-impl, reason: not valid java name */
    public static final String m53getNameimpl(int i) {
        switch (i) {
            case 1:
                return "TEMPLATE_PREVIEW";
            case 2:
                return "TEMPLATE_STILL_CAPTURE";
            case 3:
                return "TEMPLATE_RECORD";
            case 4:
                return "TEMPLATE_VIDEO_SNAPSHOT";
            case 5:
                return "TEMPLATE_ZERO_SHUTTER_LAG";
            case 6:
                return "TEMPLATE_MANUAL";
            default:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "UNKNOWN-");
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m54toStringimpl(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RequestTemplate(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RequestTemplate) {
            return this.value == ((RequestTemplate) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return m54toStringimpl(this.value);
    }
}
