package ru.yandex.taxi.surge.models.dto;

import defpackage.drw0;
import defpackage.gsq0;
import defpackage.ypw0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/x0;", "Lru/yandex/taxi/surge/models/dto/j1;", "Companion", "brw0", "drw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class x0 extends j1 {
    public static final drw0 Companion = new drw0();
    public final ypw0 a;

    public x0(int i, ypw0 ypw0Var) {
        if ((i & 1) == 0) {
            this.a = new ypw0(0);
        } else {
            this.a = ypw0Var;
        }
    }

    public x0() {
        this.a = new ypw0(0);
    }
}
