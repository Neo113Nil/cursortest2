package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C0304be;
import io.appmetrica.analytics.impl.En;
import java.util.Currency;

/* loaded from: classes.dex */
public class Revenue {
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: g, reason: collision with root package name */
        private static final En f3500g = new En(new C0304be("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        final long f3501a;

        /* renamed from: b, reason: collision with root package name */
        final Currency f3502b;

        /* renamed from: c, reason: collision with root package name */
        Integer f3503c;

        /* renamed from: d, reason: collision with root package name */
        String f3504d;

        /* renamed from: e, reason: collision with root package name */
        String f3505e;

        /* renamed from: f, reason: collision with root package name */
        Receipt f3506f;

        public /* synthetic */ Builder(long j2, Currency currency, int i2) {
            this(j2, currency);
        }

        public Revenue build() {
            return new Revenue(this, 0);
        }

        public Builder withPayload(String str) {
            this.f3505e = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f3504d = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f3503c = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f3506f = receipt;
            return this;
        }

        private Builder(long j2, Currency currency) {
            f3500g.a(currency);
            this.f3501a = j2;
            this.f3502b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            private String f3507a;

            /* renamed from: b, reason: collision with root package name */
            private String f3508b;

            public /* synthetic */ Builder(int i2) {
                this();
            }

            public Receipt build() {
                return new Receipt(this, 0);
            }

            public Builder withData(String str) {
                this.f3507a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f3508b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i2) {
            this(builder);
        }

        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f3507a;
            this.signature = builder.f3508b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i2) {
        this(builder);
    }

    public static Builder newBuilder(long j2, Currency currency) {
        return new Builder(j2, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f3501a;
        this.currency = builder.f3502b;
        this.quantity = builder.f3503c;
        this.productID = builder.f3504d;
        this.payload = builder.f3505e;
        this.receipt = builder.f3506f;
    }
}
