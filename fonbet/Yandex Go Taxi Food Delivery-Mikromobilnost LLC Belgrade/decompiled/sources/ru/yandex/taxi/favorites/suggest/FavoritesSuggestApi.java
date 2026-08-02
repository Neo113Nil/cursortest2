package ru.yandex.taxi.favorites.suggest;

import com.yandex.go.suggest.FavoriteSuggestResponse;
import defpackage.cmt;
import defpackage.neu;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/favorites/suggest/FavoritesSuggestApi;", "", "Lcmt;", "Lcom/yandex/go/suggest/FavoriteSuggestResponse;", "a", "()Lcmt;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FavoritesSuggestApi {
    @s490("userplaces/suggested-points")
    @neu({"Content-Type: application/json"})
    cmt<FavoriteSuggestResponse> a();
}
