package com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import defpackage.dfi;
import defpackage.pkt;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideContentDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideContentDto;", "<init>", "()V", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class SlideContentDeserializer implements JsonDeserializer<SlideContentDto> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            JsonElement v = jsonElement.m().v("type");
            String q = v != null ? v.q() : null;
            if (q != null) {
                switch (q.hashCode()) {
                    case -2113106841:
                        if (q.equals("PAY_CARD")) {
                            cls = PayCardSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case -1823842584:
                        if (q.equals("CHART_ARTIST")) {
                            cls = ChartArtistSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case -1009583174:
                        if (q.equals("SINGLE_ENTITY")) {
                            cls = SingleEntitySlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case -898933868:
                        if (q.equals("THEN_NOW_COMPARISON")) {
                            cls = ThenNowComparisonSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case -822853898:
                        if (q.equals("CHART_FAVORITES")) {
                            cls = ChartFavouritesSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case -14379540:
                        if (q.equals("ARTISTS")) {
                            cls = ArtistsSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case 2497109:
                        if (q.equals("QUIZ")) {
                            cls = QuizEntitySlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case 2571565:
                        if (q.equals("TEXT")) {
                            cls = TextSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case 64085950:
                        if (q.equals("CHART")) {
                            cls = ChartSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case 79219839:
                        if (q.equals("STATS")) {
                            cls = StatsSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case 81665115:
                        if (q.equals("VIDEO")) {
                            cls = DefaultEntitySlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case 785535328:
                        if (q.equals("CAROUSEL")) {
                            cls = CarouselContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case 1667423859:
                        if (q.equals("COLLAGE")) {
                            cls = CollageContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case 1778155070:
                        if (q.equals("TEXT_FACT")) {
                            cls = TextFactSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    case 1947784203:
                        if (q.equals("TEXT_EXTENDED")) {
                            cls = ExtendedTextSlideContentDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                    default:
                        dfi.r("deserialize<SlideContent>(): unknown type ".concat(q), "SlideContentDeserializer");
                        return pkt.a;
                }
                if (jsonDeserializationContext != null) {
                    return (SlideContentDto) jsonDeserializationContext.a(jsonElement, cls);
                }
            }
        }
        return null;
    }
}
