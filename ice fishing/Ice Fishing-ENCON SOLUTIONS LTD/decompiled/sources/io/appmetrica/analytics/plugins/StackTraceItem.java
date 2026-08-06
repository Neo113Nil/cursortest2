package io.appmetrica.analytics.plugins;

/* loaded from: classes.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f7535a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7536b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f7537c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f7538d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7539e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f7540a;

        /* renamed from: b, reason: collision with root package name */
        private String f7541b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f7542c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f7543d;

        /* renamed from: e, reason: collision with root package name */
        private String f7544e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f7540a, this.f7541b, this.f7542c, this.f7543d, this.f7544e, 0);
        }

        public Builder withClassName(String str) {
            this.f7540a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f7543d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f7541b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f7542c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f7544e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i2) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f7535a;
    }

    public Integer getColumn() {
        return this.f7538d;
    }

    public String getFileName() {
        return this.f7536b;
    }

    public Integer getLine() {
        return this.f7537c;
    }

    public String getMethodName() {
        return this.f7539e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f7535a = str;
        this.f7536b = str2;
        this.f7537c = num;
        this.f7538d = num2;
        this.f7539e = str3;
    }
}
