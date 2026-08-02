package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.prw0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/b1;", "Lru/yandex/taxi/surge/models/dto/j1;", "Companion", "orw0", "prw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class b1 extends j1 {
    public static final prw0 Companion = new prw0();
    public final DetailedPriceContent a;

    public b1(int i, DetailedPriceContent detailedPriceContent) {
        if ((i & 1) == 0) {
            this.a = new DetailedPriceContent(0);
        } else {
            this.a = detailedPriceContent;
        }
    }

    public b1() {
        this.a = new DetailedPriceContent(0);
    }
}
