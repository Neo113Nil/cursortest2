package defpackage;

import com.yandex.go.analytics.realtime.event.CreativeType;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.api.dto.ticket.a;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final class zpf0 {
    public final dei0 a;
    public final gei0 b;

    public zpf0(dei0 dei0Var, gei0 gei0Var) {
        this.a = dei0Var;
        this.b = gei0Var;
    }

    public static CreativeType f(Promotion promotion) {
        return promotion instanceof cb8 ? CreativeType.Card : promotion instanceof shs ? CreativeType.Fullscreen : promotion instanceof Story ? CreativeType.Story : promotion instanceof tg60 ? CreativeType.Notification : promotion instanceof a ? CreativeType.Ticket : promotion instanceof zi20 ? CreativeType.MissedSeen : CreativeType.Unsupported;
    }

    public final long a() {
        fei0 a = ((hei0) this.b).a();
        if (a != null) {
            return a.a();
        }
        o430 o430Var = e3n.b;
        return 0L;
    }

    public final void b(Promotion promotion, int i, Map map, String str) {
        Map c = promotion.getC();
        if (c != null) {
            CreativeType f = f(promotion);
            String b = promotion.getB();
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("part", Integer.valueOf(i));
            mapBuilder.put("total_parts", Integer.valueOf(promotion instanceof shs ? ((shs) promotion).l.size() : promotion instanceof Story ? ((Story) promotion).i.d.size() : 1));
            mapBuilder.put(MetaDataField.SCREEN_FIELD, str);
            ((com.yandex.go.analytics.realtime.a) this.a).d(new iei0(f, b, c, mapBuilder.j(), map, 2));
        }
    }

    public final void c(Promotion promotion, String str) {
        Map c = promotion.getC();
        if (c != null) {
            CreativeType f = f(promotion);
            String b = promotion.getB();
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put(MetaDataField.SCREEN_FIELD, str);
            ((com.yandex.go.analytics.realtime.a) this.a).d(new iei0(f, b, c, mapBuilder.j(), null, 34));
        }
    }

    public final void d(Promotion promotion, String str) {
        Map c = promotion.getC();
        if (c != null) {
            CreativeType f = f(promotion);
            String b = promotion.getB();
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put(MetaDataField.SCREEN_FIELD, str);
            ((com.yandex.go.analytics.realtime.a) this.a).d(new iei0(f, b, c, mapBuilder.j(), 2));
        }
    }

    public final void e(Promotion promotion, int i, Map map, String str) {
        Map c = promotion.getC();
        if (c != null) {
            CreativeType f = f(promotion);
            String b = promotion.getB();
            int size = promotion instanceof shs ? ((shs) promotion).l.size() : promotion instanceof Story ? ((Story) promotion).i.d.size() : 1;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put(MetaDataField.SCREEN_FIELD, str);
            ((com.yandex.go.analytics.realtime.a) this.a).d(new iei0(f, b, i, size, c, mapBuilder.j(), map));
        }
    }
}
