package ru.yandex.taxi.search.address.model;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.dto.b;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.search.perf.c;
import com.yandex.go.analytics.ListBasedOrderAddressAnalyticsData;
import com.yandex.go.suggest.AdditionalSuggest;
import defpackage.do0;
import defpackage.eqe;
import defpackage.i3c0;
import defpackage.i4v0;
import defpackage.mdh;
import defpackage.qpc;
import defpackage.rol0;
import defpackage.rwp0;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v7v0;
import defpackage.z81;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.persuggest.repository.e;
import ru.yandex.taxi.persuggest.source.m;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public final m b;
    public final eqe c;
    public final e d;
    public final c e;

    public a(tt2 tt2Var, m mVar, eqe eqeVar, e eVar, c cVar) {
        this.a = tt2Var;
        this.b = mVar;
        this.c = eqeVar;
        this.d = eVar;
        this.e = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.go.suggest.AdditionalSuggest] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.yandex.go.suggest.AdditionalSuggest] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.yandex.go.address.models.PlainAddress] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static final ArrayList a(a aVar, List list) {
        ?? r10;
        aVar.getClass();
        List<qpc> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (qpc qpcVar : list2) {
            if (qpcVar instanceof v7v0) {
                v7v0 v7v0Var = (v7v0) qpcVar;
                String str = v7v0Var.q;
                AddressDTO addressDTO = z81.a;
                PlainAddress.Companion.getClass();
                AddressDTO.Companion.getClass();
                PlainAddress plainAddress = new PlainAddress(b.b(v7v0Var));
                plainAddress.m(v7v0Var.j);
                r10 = plainAddress;
                if (str.length() != 0) {
                    FavoriteAddress h = z81.h(plainAddress, null);
                    int i = v7v0Var.r;
                    i3c0 i3c0Var = PlaceType.Companion;
                    String str2 = v7v0Var.s;
                    i3c0Var.getClass();
                    PlaceType a = i3c0.a(str2);
                    String str3 = plainAddress.getAddress().n;
                    if (str3 == null) {
                        str3 = "";
                    }
                    r10 = z81.g(FavoriteAddress.b(h, str, i, a, null, str3, 3932124), plainAddress.getAddress(), plainAddress.q0());
                }
                eqe eqeVar = aVar.c;
                i4v0 i4v0Var = v7v0Var.F;
                eqeVar.getClass();
                zzs B = r10.B();
                String m = eqeVar.a.m();
                String G = eqeVar.c.G(m);
                String str4 = i4v0Var.a;
                zzs zzsVar = i4v0Var.b;
                String q2 = r10.q2();
                Integer num = i4v0Var.d;
                r10.O1(new ListBasedOrderAddressAnalyticsData(str4, B, zzsVar, q2, m, G, B, num != null ? num.intValue() : -1, i4v0Var.h, i4v0Var.c));
                String pickMethod = r10.getPickMethod();
                if (pickMethod == null || pickMethod.length() == 0) {
                    r10.P("suggest.zero_suggest");
                }
            } else if (qpcVar instanceof do0) {
                r10 = z81.c((do0) qpcVar);
            } else {
                AdditionalSuggest.Companion.getClass();
                r10 = AdditionalSuggest.a;
            }
            arrayList.add(r10);
        }
        return arrayList;
    }

    public final tpr b(boolean z, rwp0 rwp0Var, List list) {
        rol0 rol0Var = new rol0(new ZeroSuggestProvider$loadSuggestsFlow$1(this, rwp0Var, list, rwp0Var.a, z, null));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(rol0Var, mdh.b);
    }
}
