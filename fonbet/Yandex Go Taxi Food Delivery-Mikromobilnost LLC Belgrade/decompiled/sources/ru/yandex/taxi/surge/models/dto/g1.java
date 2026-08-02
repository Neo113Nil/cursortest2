package ru.yandex.taxi.surge.models.dto;

import defpackage.asw0;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/g1;", "Lru/yandex/taxi/surge/models/dto/j1;", "Companion", "yrw0", "asw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g1 extends j1 {
    public static final asw0 Companion = new asw0();
    public final FormattedText a;

    public g1(int i, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = FormattedText.c;
        } else {
            this.a = formattedText;
        }
    }

    public g1() {
        this.a = FormattedText.c;
    }
}
