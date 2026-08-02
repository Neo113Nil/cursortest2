package ru.yandex.taxi.surge.models.dto;

import defpackage.fsw0;
import defpackage.gsq0;
import defpackage.vtw0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/h1;", "Lru/yandex/taxi/surge/models/dto/j1;", "Companion", "dsw0", "fsw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class h1 extends j1 {
    public static final fsw0 Companion = new fsw0();
    public final vtw0 a;

    public h1(int i, vtw0 vtw0Var) {
        if ((i & 1) == 0) {
            this.a = new vtw0(0);
        } else {
            this.a = vtw0Var;
        }
    }

    public h1() {
        this.a = new vtw0(0);
    }
}
