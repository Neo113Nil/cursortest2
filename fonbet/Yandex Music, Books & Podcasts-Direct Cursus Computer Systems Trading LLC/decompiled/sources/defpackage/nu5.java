package defpackage;

import com.yandex.music.shared.dto.concert.ConcertCashbackDto;
import com.yandex.music.shared.dto.concert.ConcertDto;
import com.yandex.music.shared.dto.concert.ConcertEventInfoDto;
import com.yandex.music.shared.dto.concert.ConcertPriceDto;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public abstract class nu5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final us5 a(ConcertDto concertDto) {
        String title;
        ?? r3;
        ?? r5;
        ZonedDateTime zonedDateTime;
        String city;
        ?? r14;
        ru5 ru5Var;
        CoverPath coverPath;
        String title2;
        concertDto.getClass();
        String concertTitle = concertDto.getConcertTitle();
        if (concertTitle == null || concertTitle.length() == 0) {
            String title3 = concertDto.getTitle();
            title = (title3 == null || title3.length() == 0) ? "" : concertDto.getTitle();
        } else {
            title = concertDto.getConcertTitle();
        }
        String str = title;
        String id = concertDto.getId();
        if (id != null) {
            List<ConcertDto.MetroStationDto> metroStations = concertDto.getMetroStations();
            if (metroStations != null) {
                r3 = new ArrayList();
                for (ConcertDto.MetroStationDto metroStationDto : metroStations) {
                    f5i f5iVar = (metroStationDto == null || (title2 = metroStationDto.getTitle()) == null) ? null : new f5i(title2, y2x.D(metroStationDto.getLineColor()));
                    if (f5iVar != null) {
                        r3.add(f5iVar);
                    }
                }
            } else {
                r3 = c5b.a;
            }
            List<String> images = concertDto.getImages();
            if (images != null) {
                r5 = new ArrayList();
                for (String str2 : images) {
                    if (str2 != null) {
                        WebPath$Storage webPath$Storage = WebPath$Storage.AFISHA;
                        webPath$Storage.getClass();
                        coverPath = etn.B(str2, webPath$Storage);
                    } else {
                        coverPath = null;
                    }
                    if (coverPath != null) {
                        r5.add(coverPath);
                    }
                }
            } else {
                r5 = c5b.a;
            }
            ConcertPriceDto minPrice = concertDto.getMinPrice();
            uy5 b = minPrice != null ? b(minPrice) : null;
            ConcertCashbackDto cashback = concertDto.getCashback();
            String title4 = cashback != null ? cashback.getTitle() : null;
            ConcertCashbackDto cashback2 = concertDto.getCashback();
            Integer valuePercent = cashback2 != null ? cashback2.getValuePercent() : null;
            wye datetime = concertDto.getDatetime();
            if (datetime != null && (zonedDateTime = datetime.b) != null && (city = concertDto.getCity()) != null) {
                String place = concertDto.getPlace();
                String address = concertDto.getAddress();
                String contentRating = concertDto.getContentRating();
                List<ConcertDto> popularConcerts = concertDto.getPopularConcerts();
                if (popularConcerts != null) {
                    r14 = new ArrayList();
                    for (ConcertDto concertDto2 : popularConcerts) {
                        us5 a = concertDto2 != null ? a(concertDto2) : null;
                        if (a != null) {
                            r14.add(a);
                        }
                    }
                } else {
                    r14 = c5b.a;
                }
                String dataSessionId = concertDto.getDataSessionId();
                String map = concertDto.getMap();
                String mapUrl = concertDto.getMapUrl();
                ConcertEventInfoDto eventInfo = concertDto.getEventInfo();
                if (eventInfo != null) {
                    String type = eventInfo.getType();
                    if (type == null) {
                        type = "unspecified";
                    }
                    ru5Var = new ru5(type);
                } else {
                    ru5Var = ru5.b;
                }
                return new us5(id, r3, str, r5, b, title4, valuePercent, zonedDateTime, city, place, address, contentRating, r14, dataSessionId, map, mapUrl, ru5Var);
            }
        }
        return null;
    }

    public static final uy5 b(ConcertPriceDto concertPriceDto) {
        if (concertPriceDto.getValue() == null || concertPriceDto.getCurrency() == null || concertPriceDto.getCurrencySymbol() == null) {
            return null;
        }
        return new uy5(concertPriceDto.getValue().intValue(), concertPriceDto.getCurrency(), concertPriceDto.getCurrencySymbol());
    }
}
