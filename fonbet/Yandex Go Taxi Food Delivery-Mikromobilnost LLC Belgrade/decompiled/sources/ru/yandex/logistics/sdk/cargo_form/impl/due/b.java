package ru.yandex.logistics.sdk.cargo_form.impl.due;

import defpackage.bvf0;
import defpackage.ds31;
import defpackage.dxm;
import defpackage.evm;
import defpackage.fsg;
import defpackage.gci0;
import defpackage.j6s;
import defpackage.jwh;
import defpackage.m2n;
import defpackage.nvm;
import defpackage.p6s;
import defpackage.ri20;
import defpackage.u1n;
import defpackage.wsr0;
import defpackage.x2s;
import defpackage.x4e;
import defpackage.xsr0;
import defpackage.yr31;
import defpackage.ysu;
import defpackage.zrm;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes5.dex */
public final class b extends yr31 {
    public final r0 A;
    public final r0 B;
    public final gci0 C;
    public final evm b;
    public final dxm c;
    public final u1n w;
    public final zrm x;
    public final m2n y;
    public final r0 z;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(evm evmVar, dxm dxmVar, nvm nvmVar, u1n u1nVar, zrm zrmVar) {
        ZonedDateTime parse;
        int size;
        int i;
        Map map;
        this.b = evmVar;
        this.c = dxmVar;
        this.w = u1nVar;
        this.x = zrmVar;
        m2n m2nVar = evmVar.x;
        ArrayList arrayList = m2nVar.a;
        this.y = m2nVar;
        r0 c = bvf0.c(0);
        this.z = c;
        r0 c2 = bvf0.c(0);
        this.A = c2;
        r0 c3 = bvf0.c(0);
        this.B = c3;
        this.C = e.R(e.n(c, c2, c3, new DueViewModel$stateFlow$1(4, nvmVar, nvm.class, PolicyMappingsExtension.MAP, "map(III)Lru/yandex/logistics/sdk/cargo_form/impl/due/DueScreenState;", 4)), ds31.a(this), wsr0.a(xsr0.a, 3), null);
        u1n.k(u1nVar, new x2s(evmVar.y, null));
        String str = evmVar.z;
        j6s b = ((p6s) zrmVar.b).b();
        Object obj = (b == null || (map = b.a) == null) ? null : map.get(str);
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            try {
                parse = ZonedDateTime.parse(str2, DateTimeFormatter.ISO_DATE_TIME);
            } catch (DateTimeParseException unused) {
                ((jwh) zrmVar.c).a.o("Delivery.OrderForm.Failed.DateTimeParseError", null, new LinkedHashMap());
            }
            size = arrayList.size();
            for (i = 0; i < size; i++) {
                fsg fsgVar = (fsg) arrayList.get(i);
                int size2 = fsgVar.c.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ysu ysuVar = (ysu) fsgVar.c.get(i2);
                    ZonedDateTime zonedDateTime = ysuVar.b;
                    List list = ysuVar.c;
                    if (zonedDateTime != null && zonedDateTime.equals(parse)) {
                        c.m(null, Integer.valueOf(i));
                        c2.m(null, Integer.valueOf(i2));
                        return;
                    }
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        int size3 = list2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            if (((ri20) list.get(i3)).b.equals(parse)) {
                                c.m(null, Integer.valueOf(i));
                                c2.m(null, Integer.valueOf(i2));
                                x4e.z(i3, this.B, null);
                                return;
                            }
                        }
                    }
                }
            }
        }
        parse = null;
        size = arrayList.size();
        while (i < size) {
        }
    }
}
