package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.hrw0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/y0;", "Lru/yandex/taxi/surge/models/dto/j1;", "Companion", "grw0", "hrw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class y0 extends j1 {
    public static final hrw0 Companion = new hrw0();
    public final l0 a;

    public y0(int i, l0 l0Var) {
        if ((i & 1) == 0) {
            this.a = new l0(0);
        } else {
            this.a = l0Var;
        }
    }

    public y0() {
        this.a = new l0(0);
    }
}
