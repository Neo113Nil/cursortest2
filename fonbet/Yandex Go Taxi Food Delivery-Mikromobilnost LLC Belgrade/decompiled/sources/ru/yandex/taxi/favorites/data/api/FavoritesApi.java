package ru.yandex.taxi.favorites.data.api;

import defpackage.afp;
import defpackage.cmt;
import defpackage.efp;
import defpackage.hep;
import defpackage.hrh;
import defpackage.khp;
import defpackage.q76;
import defpackage.s490;
import defpackage.scp;
import defpackage.vcp;
import defpackage.xep;
import defpackage.xgp;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001aH'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/favorites/data/api/FavoritesApi;", "", "Lkotlinx/serialization/json/c;", "body", "Lcmt;", "Lefp;", "c", "(Lkotlinx/serialization/json/c;)Lcmt;", "Lkhp;", "d", "Lscp;", "Lvcp;", "e", "(Lscp;)Lcmt;", "Lxep;", "Lafp;", "g", "(Lxep;)Lcmt;", "Lhep;", "Lzy11;", "b", "(Lhep;)Lcmt;", "Lxgp;", "h", "(Lxgp;)Lcmt;", "a", "Lhrh;", "f", "(Lhrh;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FavoritesApi {
    @s490("userplaces/v1/ride/update")
    cmt<zy11> a(@q76 xgp body);

    @s490("userplaces/v1/remove")
    cmt<zy11> b(@q76 hep body);

    @s490("userplaces/v1/list")
    cmt<efp> c(@q76 c body);

    @s490("userplaces/v2/list")
    cmt<khp> d(@q76 c body);

    @s490("userplaces/v1/create")
    cmt<vcp> e(@q76 scp body);

    @s490("userplaces/v1/ride/remove")
    cmt<zy11> f(@q76 hrh body);

    @s490("userplaces/v1/update")
    cmt<afp> g(@q76 xep body);

    @s490("userplaces/v1/ride/create")
    cmt<zy11> h(@q76 xgp body);
}
