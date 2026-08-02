package defpackage;

import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.promotions.model.d;

/* loaded from: classes5.dex */
public abstract class tpu0 {
    public static final rpu0 a(Story story) {
        String b;
        List list;
        Object obj;
        String str;
        Story.e eVar = story.i.c;
        Integer num = null;
        FormattedText b2 = b(eVar != null ? eVar.b : null);
        FormattedText b3 = b(eVar != null ? eVar.c : null);
        String str2 = story.b;
        if (eVar == null) {
            b = null;
        } else {
            d dVar = PromotionBackground.Companion;
            List list2 = eVar.a;
            PromotionBackground.Type type = PromotionBackground.Type.IMAGE;
            dVar.getClass();
            b = d.b(list2, type);
        }
        if (eVar != null && (list = eVar.a) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PromotionBackground) obj).a == PromotionBackground.Type.COLOR) {
                    break;
                }
            }
            PromotionBackground promotionBackground = (PromotionBackground) obj;
            if (promotionBackground != null && (str = promotionBackground.b) != null) {
                num = q5z.S(str);
            }
        }
        return new rpu0(str2, b2, b3, b, num, story.k);
    }

    public static FormattedText b(Story.f fVar) {
        if (fVar == null) {
            return FormattedText.c;
        }
        FormattedText formattedText = fVar.c;
        if (formattedText != null) {
            return formattedText;
        }
        String str = fVar.a;
        String str2 = fVar.b;
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? FormattedText.c : FormattedText.Companion.a(str, str2);
    }
}
