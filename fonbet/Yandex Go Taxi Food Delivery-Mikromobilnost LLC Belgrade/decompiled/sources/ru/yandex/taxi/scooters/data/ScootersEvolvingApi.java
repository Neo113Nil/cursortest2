package ru.yandex.taxi.scooters.data;

import defpackage.cmt;
import defpackage.djg0;
import defpackage.djo;
import defpackage.gjo;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JM\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/scooters/data/ScootersEvolvingApi;", "", "", "evolutionMode", "userChoice", "Ldjo;", "evolveOfferParams", "", "headers", "Lcmt;", "Lgjo;", "a", "(Ljava/lang/String;Ljava/lang/String;Ldjo;Ljava/util/Map;)Lcmt;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScootersEvolvingApi {
    @s490("scooters/api/yandex/tag/evolve")
    cmt<gjo> a(@djg0("evolution_mode") String evolutionMode, @djg0("user_choice") String userChoice, @q76 djo evolveOfferParams, @uau Map<String, String> headers);
}
