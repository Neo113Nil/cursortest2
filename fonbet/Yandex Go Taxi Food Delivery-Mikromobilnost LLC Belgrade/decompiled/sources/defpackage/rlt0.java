package defpackage;

import com.yandex.fintechsdk.core.telemetry.api.SpanKind;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class rlt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SpanKind.values().length];
        try {
            iArr[SpanKind.SPAN_KIND_INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpanKind.SPAN_KIND_SERVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpanKind.SPAN_KIND_CLIENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SpanKind.SPAN_KIND_PRODUCER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SpanKind.SPAN_KIND_CONSUMER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SpanKind.SPAN_KIND_UNSPECIFIED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SpanKind.UNRECOGNIZED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
