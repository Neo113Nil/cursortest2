package ru.yandex.taxi.orderbutton.summary.base.analytics;

import defpackage.g8e;
import defpackage.xy40;
import kotlin.Metadata;

/* loaded from: classes6.dex */
public final class SummaryOrderButtonAnalytics {
    public final xy40 a = new xy40(0);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/orderbutton/summary/base/analytics/SummaryOrderButtonAnalytics$SummaryEmptyOrderButtonException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "creator", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SummaryEmptyOrderButtonException extends RuntimeException {
        private final String creator;

        public SummaryEmptyOrderButtonException(String str) {
            super(g8e.o("Empty order button from ", str));
            this.creator = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getCreator() {
            return this.creator;
        }
    }
}
