package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar;

import defpackage.cdz0;
import defpackage.e3n;
import defpackage.hwy0;
import defpackage.kp50;
import defpackage.o430;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class e {
    public static final long d;
    public static final /* synthetic */ int e = 0;
    public final b a;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.c b;
    public final m0 c;

    static {
        o430 o430Var = e3n.b;
        d = kp50.U(1, DurationUnit.SECONDS);
    }

    public e(ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, hwy0 hwy0Var, b bVar, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.c cVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = new m0(hwy0Var.b, kotlinx.coroutines.flow.e.X(new cdz0(eVar.e, 1), new TopAccentBarStateHolder$special$$inlined$flatMapLatest$1(null, this)), new TopAccentBarStateHolder$topAccentBarFlow$2(null, this));
    }
}
