package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.vow0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/y;", "Lru/yandex/taxi/surge/models/dto/h0;", "Companion", "uow0", "vow0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class y extends h0 {
    public static final vow0 Companion = new vow0();
    public final c0 a;
    public final w b;

    public y(int i, c0 c0Var, w wVar) {
        this.a = (i & 1) == 0 ? new c0(0) : c0Var;
        if ((i & 2) == 0) {
            this.b = new w(0);
        } else {
            this.b = wVar;
        }
    }

    public y() {
        c0 c0Var = new c0(0);
        w wVar = new w(0);
        this.a = c0Var;
        this.b = wVar;
    }
}
