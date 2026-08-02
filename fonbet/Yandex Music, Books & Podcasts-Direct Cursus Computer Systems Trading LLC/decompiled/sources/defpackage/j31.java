package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class j31 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j31);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.artist_concerts_buy) + f1d.a(R.string.concert_full_cashback_percent_text, f1d.a(R.string.artist_concerts_buy, Integer.hashCode(R.string.artist_concerts_buy_from) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("ArtistConcertPriceStringConfig(fromTextId=", R.string.artist_concerts_buy_from, R.string.artist_concerts_buy, ", defaultTextId=", ", cashbackTextId=");
        l.append(R.string.concert_full_cashback_percent_text);
        l.append(", fallbackTextId=");
        l.append(R.string.artist_concerts_buy);
        l.append(")");
        return l.toString();
    }
}
