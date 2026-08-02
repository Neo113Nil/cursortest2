package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class fgl {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fgl);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.concert_event_type_unspecified) + f1d.a(R.string.concert_event_type_musical, f1d.a(R.string.concert_event_type_festival, f1d.a(R.string.concert_event_type_tribute, f1d.a(R.string.concert_event_type_concert, f1d.a(R.string.artist_concert_informer_event_full_date_title_format, Integer.hashCode(R.string.artist_concert_informer_title_format) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("PlayerInformersTextConfig(concertTitleFormatRes=", R.string.artist_concert_informer_title_format, R.string.artist_concert_informer_event_full_date_title_format, ", concertTitleEventFullDateFormatRes=", ", concertEventTypeConcertRes=");
        hrg.w(R.string.concert_event_type_concert, R.string.concert_event_type_tribute, ", concertEventTypeTributeRes=", ", concertEventTypeFestivalRes=", l);
        hrg.w(R.string.concert_event_type_festival, R.string.concert_event_type_musical, ", concertEventTypeMusicalRes=", ", concertEventTypeUnspecifiedRes=", l);
        return f1d.i(l, R.string.concert_event_type_unspecified, ")");
    }
}
