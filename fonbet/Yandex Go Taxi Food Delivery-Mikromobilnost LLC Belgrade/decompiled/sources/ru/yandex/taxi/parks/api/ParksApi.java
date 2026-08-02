package ru.yandex.taxi.parks.api;

import defpackage.cmt;
import defpackage.djg0;
import defpackage.k1f0;
import defpackage.n1f0;
import defpackage.q76;
import defpackage.s490;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/parks/api/ParksApi;", "", "Lk1f0;", "p", "", Constants.KEY_PAGE, "Lcmt;", "Ln1f0;", "a", "(Lk1f0;I)Lcmt;", "parks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ParksApi {
    @s490("pricecat")
    cmt<n1f0> a(@q76 k1f0 p, @djg0("page") int page);
}
