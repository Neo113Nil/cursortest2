package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import defpackage.tls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class LocationManagerAdapterKt$requestLocationUpdates$5$listener$1 extends AdaptedFunctionReference implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        kotlinx.coroutines.channels.b.c((y6f0) this.receiver, (Location) obj);
        return zy11.a;
    }
}
