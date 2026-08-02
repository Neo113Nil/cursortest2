package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.trw0;
import defpackage.xqw0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/d1;", "Lru/yandex/taxi/surge/models/dto/j1;", "Companion", "srw0", "trw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d1 extends j1 {
    public static final trw0 Companion = new trw0();
    public final xqw0 a;

    public d1(int i, xqw0 xqw0Var) {
        if ((i & 1) == 0) {
            this.a = new xqw0(0);
        } else {
            this.a = xqw0Var;
        }
    }

    public d1() {
        this.a = new xqw0(0);
    }
}
