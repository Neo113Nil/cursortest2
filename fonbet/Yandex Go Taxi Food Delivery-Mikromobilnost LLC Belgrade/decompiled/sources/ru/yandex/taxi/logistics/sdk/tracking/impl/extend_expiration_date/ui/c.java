package ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui;

import defpackage.bvf0;
import defpackage.ds31;
import defpackage.fwo;
import defpackage.gci0;
import defpackage.hwo;
import defpackage.jwo;
import defpackage.m8h;
import defpackage.st2;
import defpackage.tje;
import defpackage.yr31;
import java.util.UUID;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class c extends yr31 {
    public final com.yandex.delivery.utils.dialogmanager.a A;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.b B;
    public final r0 C;
    public final gci0 D;
    public final r0 E;
    public final gci0 F;
    public final jwo b;
    public final hwo c;
    public final com.yandex.delivery.utils.dialogmanager.impl.b w;
    public final fwo x;
    public final m8h y;
    public final st2 z;

    public c(jwo jwoVar, hwo hwoVar, com.yandex.delivery.utils.dialogmanager.impl.b bVar, fwo fwoVar, m8h m8hVar, st2 st2Var, com.yandex.delivery.utils.dialogmanager.a aVar, ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.b bVar2) {
        this.b = jwoVar;
        this.c = hwoVar;
        this.w = bVar;
        this.x = fwoVar;
        this.y = m8hVar;
        this.z = st2Var;
        this.A = aVar;
        this.B = bVar2;
        r0 c = bvf0.c(null);
        this.C = c;
        this.D = e.d(c);
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.E = c2;
        this.F = e.d(c2);
        tje.N(ds31.a(this), null, null, new ExtendExpirationDateViewModel$fetchContent$1(this, UUID.randomUUID().toString(), null), 3);
    }
}
