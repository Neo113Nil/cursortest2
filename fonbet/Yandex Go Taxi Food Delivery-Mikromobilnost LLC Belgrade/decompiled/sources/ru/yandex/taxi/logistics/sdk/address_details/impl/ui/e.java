package ru.yandex.taxi.logistics.sdk.address_details.impl.ui;

import defpackage.au0;
import defpackage.ds0;
import defpackage.ds31;
import defpackage.f4l0;
import defpackage.g2q0;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.ps0;
import defpackage.pt0;
import defpackage.qkg;
import defpackage.rls0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vu0;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yr31;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e extends yr31 {
    public final tpr A;
    public final gci0 B;
    public final ru.yandex.taxi.logistics.sdk.address_details.api.a b;
    public final f4l0 c;
    public final ds0 w;
    public final ru.yandex.taxi.logistics.sdk.address_details.impl.domain.a x;
    public final qkg y;
    public final ps0 z;

    public e(ru.yandex.taxi.logistics.sdk.address_details.api.a aVar, f4l0 f4l0Var, ds0 ds0Var, ru.yandex.taxi.logistics.sdk.address_details.impl.domain.a aVar2, pt0 pt0Var) {
        this.b = aVar;
        this.c = f4l0Var;
        this.w = ds0Var;
        this.x = aVar2;
        qkg qkgVar = new qkg(Collections.singletonList(new g2q0(Collections.singletonList(new rls0()), null, null, null, false, null, null, null, null, 1022)), null, null, null, 30);
        this.y = qkgVar;
        ps0 ps0Var = new ps0(null, qkgVar, null, new qkg(EmptyList.a, null, null, null, 30), null, null, null, null);
        this.z = ps0Var;
        tpr a = pt0Var.a();
        this.A = a;
        this.B = kotlinx.coroutines.flow.e.R(new au0(a, this, 1), ds31.a(this), wsr0.a(xsr0.a, 3), ps0Var);
        tje.N(ds31.a(this), null, null, new AddressDetailsViewModel$sendAnalyticsOnShown$1(this, null), 3);
        tje.N(ds31.a(this), null, null, new AddressDetailsViewModel$observeUploadPhotoErrors$1(this, null), 3);
        aVar.A.invoke();
    }

    public final void W(int i, vu0 vu0Var, boolean z) {
        b0(i, i == 0 ? "SenderAddress" : "RecipientAddress");
        tje.N(ds31.a(this), null, null, new AddressDetailsViewModel$onAddressClicked$1(vu0Var, this, i, z, null), 3);
    }

    public final void X(int i, String str) {
        b0(i, i == 0 ? "SenderDetails" : "RecipientDetails");
        tje.N(ds31.a(this), null, null, new AddressDetailsViewModel$onContactClicked$1(this, i, str, null), 3);
    }

    public final void Y(int i) {
        tje.N(ds31.a(this), null, null, new AddressDetailsViewModel$onDeleteAddressClicked$1(this, i, null), 3);
    }

    public final void Z(int i) {
        String str = ((ps0) this.B.a.getValue()).g;
        ds0 ds0Var = this.w;
        ds0Var.getClass();
        if (str != null) {
            boolean z = i == 0;
            String concat = str.concat(".StaticMap.Tapped");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("position", z ? "source" : "destination");
            if (!z) {
                linkedHashMap.put("point_b_index", Integer.valueOf(i));
            }
            ds0Var.a.a.o(concat, null, linkedHashMap);
        }
        tje.N(ds31.a(this), null, null, new AddressDetailsViewModel$onStaticMapClick$1(this, i, null), 3);
    }

    public final void a0(String str) {
        ps0 ps0Var = (ps0) this.B.a.getValue();
        Pair pair = new Pair(ps0Var.g, ps0Var.h);
        String str2 = (String) pair.getFirst();
        Map map = (Map) pair.getSecond();
        ds0 ds0Var = this.w;
        ds0Var.getClass();
        if (str2 != null) {
            ds0Var.c("Shown", g8e.p(str2, Extension.DOT_CHAR, str), map);
        }
    }

    public final void b0(int i, String str) {
        boolean z = i == 0;
        ps0 ps0Var = (ps0) this.B.a.getValue();
        String str2 = ps0Var.g;
        MapBuilder mapBuilder = new MapBuilder();
        Map map = ps0Var.h;
        if (map != null) {
            mapBuilder.putAll(map);
        }
        if (!z) {
            mapBuilder.put("point_b_index", Integer.valueOf(i));
        }
        Pair pair = new Pair(str2, mapBuilder.j());
        String str3 = (String) pair.getFirst();
        Map map2 = (Map) pair.getSecond();
        ds0 ds0Var = this.w;
        ds0Var.getClass();
        if (str3 != null) {
            ds0Var.c("Tapped", g8e.p(str3, Extension.DOT_CHAR, str), map2);
        }
    }
}
