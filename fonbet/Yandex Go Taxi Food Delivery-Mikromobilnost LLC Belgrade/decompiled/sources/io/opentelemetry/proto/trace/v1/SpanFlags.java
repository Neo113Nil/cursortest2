package io.opentelemetry.proto.trace.v1;

import defpackage.dqw;
import defpackage.fqw;
import defpackage.hqw;
import defpackage.ny61;

/* loaded from: classes4.dex */
public enum SpanFlags implements dqw {
    SPAN_FLAGS_DO_NOT_USE(0),
    SPAN_FLAGS_TRACE_FLAGS_MASK(255),
    SPAN_FLAGS_CONTEXT_HAS_IS_REMOTE_MASK(256),
    SPAN_FLAGS_CONTEXT_IS_REMOTE_MASK(512),
    UNRECOGNIZED(-1);

    public static final int SPAN_FLAGS_CONTEXT_HAS_IS_REMOTE_MASK_VALUE = 256;
    public static final int SPAN_FLAGS_CONTEXT_IS_REMOTE_MASK_VALUE = 512;
    public static final int SPAN_FLAGS_DO_NOT_USE_VALUE = 0;
    public static final int SPAN_FLAGS_TRACE_FLAGS_MASK_VALUE = 255;
    private static final fqw internalValueMap = new fqw() { // from class: io.opentelemetry.proto.trace.v1.SpanFlags.1
        @Override // defpackage.fqw
        public SpanFlags findValueByNumber(int i) {
            return SpanFlags.forNumber(i);
        }
    };
    private final int value;

    public static final class SpanFlagsVerifier implements hqw {
        static final hqw INSTANCE = new SpanFlagsVerifier();

        private SpanFlagsVerifier() {
        }

        @Override // defpackage.hqw
        public boolean isInRange(int i) {
            return SpanFlags.forNumber(i) != null;
        }
    }

    SpanFlags(int i) {
        this.value = i;
    }

    public static SpanFlags forNumber(int i) {
        if (i == 0) {
            return SPAN_FLAGS_DO_NOT_USE;
        }
        if (i == 512) {
            return SPAN_FLAGS_CONTEXT_IS_REMOTE_MASK;
        }
        if (i == 255) {
            return SPAN_FLAGS_TRACE_FLAGS_MASK;
        }
        if (i != 256) {
            return null;
        }
        return SPAN_FLAGS_CONTEXT_HAS_IS_REMOTE_MASK;
    }

    public static fqw internalGetValueMap() {
        return internalValueMap;
    }

    public static hqw internalGetVerifier() {
        return SpanFlagsVerifier.INSTANCE;
    }

    @Override // defpackage.dqw
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        ny61.g("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static SpanFlags valueOf(int i) {
        return forNumber(i);
    }
}
