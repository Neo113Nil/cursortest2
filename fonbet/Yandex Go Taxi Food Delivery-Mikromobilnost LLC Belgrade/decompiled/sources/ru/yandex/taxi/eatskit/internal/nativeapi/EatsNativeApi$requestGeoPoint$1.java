package ru.yandex.taxi.eatskit.internal.nativeapi;

import defpackage.adn;
import defpackage.ken;
import defpackage.l0t;
import defpackage.rnc;
import defpackage.tls;
import defpackage.vdn;
import defpackage.xdn;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.eatskit.a;
import ru.yandex.taxi.eatskit.c;
import ru.yandex.taxi.eatskit.dto.GeoPointSource;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class EatsNativeApi$requestGeoPoint$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        c cVar = ((a) ((ken) this.receiver)).c;
        adn adnVar = cVar.o;
        GeoPointSource geoPointSource = ((l0t) obj).a;
        int i = geoPointSource == null ? -1 : xdn.a[geoPointSource.ordinal()];
        if (i == 1) {
            ((rnc) adnVar.a).j(new vdn(cVar, 2));
        } else if (i == 2) {
        }
        return zy11.a;
    }
}
