package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class tu5 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tu5);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.concert_event_type_unspecified) + f1d.a(R.string.concert_event_type_musical, f1d.a(R.string.concert_event_type_tribute, f1d.a(R.string.concert_event_type_festival, Integer.hashCode(R.string.concert_event_type_concert) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("ConcertEventTypeStringConfig(concertTextId=", R.string.concert_event_type_concert, R.string.concert_event_type_festival, ", festivalTextId=", ", tributeTextId=");
        hrg.w(R.string.concert_event_type_tribute, R.string.concert_event_type_musical, ", musicalTextId=", ", unspecifiedTextId=", l);
        return f1d.i(l, R.string.concert_event_type_unspecified, ")");
    }
}
