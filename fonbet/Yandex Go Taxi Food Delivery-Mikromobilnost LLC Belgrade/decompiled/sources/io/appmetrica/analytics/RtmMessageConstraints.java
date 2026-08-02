package io.appmetrica.analytics;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public class RtmMessageConstraints {
    public static final int MAX_ADDITIONAL_LENGTH_DEFAULT = 1000;
    public static final int MAX_MESSAGE_LENGTH_DEFAULT = 500;
    public static final int MAX_NAME_LENGTH_DEFAULT = 500;
    public static final int MAX_STACK_LENGTH_DEFAULT = 7000;
    public static final int MAX_VARS_LENGTH_DEFAULT = 10000;
    public static final int MAX_VARS_VALUE_LENGTH_DEFAULT = 1000;
    public static final int STACKTRACE_CAUSES_MAX_DEPTH_DEFAULT = 1;
    public static final int STACKTRACE_LINE_MAX_LENGTH_DEFAULT = 250;
    public static final int STACKTRACE_SINGLE_CAUSE_MAX_DEPTH_DEFAULT = 4;
    public static final int UNLIMITED = -1;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    private RtmMessageConstraints(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("max_vars_length", this.a);
            jSONObject.put("max_vars_value_length", this.b);
            jSONObject.put("max_additional_length", this.c);
            jSONObject.put("max_stack_length", this.d);
            jSONObject.put("max_message_length", this.e);
            jSONObject.put("max_name_length", this.f);
            jSONObject.put("stacktrace_single_cause_max_depth", this.g);
            jSONObject.put("stacktrace_causes_max_depth", this.h);
            jSONObject.put("stacktrace_line_max_length", this.i);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* loaded from: classes4.dex */
    public static class Builder {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        private Builder() {
            this.a = 10000;
            this.b = 1000;
            this.c = 1000;
            this.d = RtmMessageConstraints.MAX_STACK_LENGTH_DEFAULT;
            this.e = 500;
            this.f = 500;
            this.g = 4;
            this.h = 1;
            this.i = 250;
        }

        public RtmMessageConstraints build() {
            return new RtmMessageConstraints(this, 0);
        }

        public Builder withMaxAdditionalLength(int i) {
            this.c = i;
            return this;
        }

        public Builder withMaxMessageLength(int i) {
            this.e = i;
            return this;
        }

        public Builder withMaxNameLength(int i) {
            this.f = i;
            return this;
        }

        public Builder withMaxStackLength(int i) {
            this.d = i;
            return this;
        }

        public Builder withMaxVarsLength(int i) {
            this.a = i;
            return this;
        }

        public Builder withMaxVarsValueLength(int i) {
            this.b = i;
            return this;
        }

        public Builder withStacktraceCausesMaxDepth(int i) {
            this.h = i;
            return this;
        }

        public Builder withStacktraceLineMaxLength(int i) {
            this.i = i;
            return this;
        }

        public Builder withStacktraceSingleCauseMaxDepth(int i) {
            this.g = i;
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public /* synthetic */ RtmMessageConstraints(Builder builder, int i) {
        this(builder);
    }
}
