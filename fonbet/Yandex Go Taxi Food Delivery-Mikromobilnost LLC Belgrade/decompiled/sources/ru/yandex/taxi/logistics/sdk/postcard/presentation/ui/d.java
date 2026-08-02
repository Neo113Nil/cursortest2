package ru.yandex.taxi.logistics.sdk.postcard.presentation.ui;

import defpackage.acu;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.q6c0;
import defpackage.tje;
import defpackage.ufe0;
import defpackage.vfe0;
import defpackage.yr31;
import defpackage.yuj0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class d extends yr31 {
    public final r0 A;
    public final ufe0 b;
    public final vfe0 c;
    public final ru.yandex.taxi.logistics.sdk.postcard.presentation.b w;
    public final q6c0 x;
    public final r0 y;
    public final r0 z;

    public d(ufe0 ufe0Var, vfe0 vfe0Var, e eVar, ru.yandex.taxi.logistics.sdk.postcard.presentation.b bVar, com.yandex.delivery.utils.dialogmanager.impl.b bVar2, yuj0 yuj0Var, q6c0 q6c0Var) {
        this.b = ufe0Var;
        this.c = vfe0Var;
        this.w = bVar;
        this.x = q6c0Var;
        r0 c = bvf0.c(null);
        this.y = c;
        this.z = c;
        new AtomicBoolean(false);
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.A = c2;
        tje.N(ds31.a(this), null, null, new PostcardPresentationViewModel$1(this, null), 3);
        kotlinx.coroutines.flow.e.H(ds31.a(this), new m0(new acu(eVar.e, 14), c2, new PostcardPresentationViewModel$launchUiStateUpdating$1(this, null)));
    }
}
