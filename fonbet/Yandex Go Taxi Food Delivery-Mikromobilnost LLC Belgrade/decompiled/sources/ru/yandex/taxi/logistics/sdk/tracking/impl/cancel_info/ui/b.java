package ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.ui;

import com.yandex.delivery.mapper.model.CancelType;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.htg;
import defpackage.ixh;
import defpackage.tje;
import defpackage.uv7;
import defpackage.wwf;
import defpackage.yr31;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class b extends yr31 {
    public final r0 A;
    public final gci0 B;
    public CancelType C;
    public final uv7 b;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.repository.a c;
    public final com.yandex.delivery.utils.dialogmanager.a w;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.mapper.a x;
    public final wwf y;
    public final htg z;

    public b(uv7 uv7Var, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.repository.a aVar, com.yandex.delivery.utils.dialogmanager.a aVar2, ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.mapper.a aVar3, wwf wwfVar, htg htgVar) {
        this.b = uv7Var;
        this.c = aVar;
        this.w = aVar2;
        this.x = aVar3;
        this.y = wwfVar;
        this.z = htgVar;
        r0 c = bvf0.c(ixh.a);
        this.A = c;
        this.B = e.d(c);
        tje.N(ds31.a(this), null, null, new DeliveryCancelInfoViewModel$requestCancelInfo$1(this, null), 3);
    }
}
