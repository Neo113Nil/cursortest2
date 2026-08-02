package ru.yandex.taxi.map_common.map.process;

import defpackage.hg00;
import defpackage.ike;
import defpackage.jse;
import defpackage.mbp0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.w511;
import java.util.Collection;

/* loaded from: classes9.dex */
public abstract class a {
    public static final pzt0 a(MapComputationsProcessor$ExecuteOn mapComputationsProcessor$ExecuteOn, ike ikeVar, tt2 tt2Var, jse jseVar, tls tlsVar) {
        int i = hg00.a[mapComputationsProcessor$ExecuteOn.ordinal()];
        if (i == 1) {
            return tje.N(ikeVar, jseVar, null, new MapComputationsProcessorKt$schedule$1(tt2Var, tlsVar, null), 2);
        }
        if (i == 2) {
            return tje.N(ikeVar, jseVar, null, new MapComputationsProcessorKt$schedule$2(tlsVar, null), 2);
        }
        w511.b();
        return null;
    }

    public static final void b(mbp0 mbp0Var, Collection collection, int i, tls tlsVar) {
        if (collection.isEmpty()) {
            return;
        }
        mbp0Var.a(MapComputationsProcessor$ExecuteOn.MAIN, new MapComputationProcessorExtensionsKt$iterateByChunks$1(tlsVar, kotlin.collections.a.F(collection, i), 0, mbp0Var, null));
    }
}
