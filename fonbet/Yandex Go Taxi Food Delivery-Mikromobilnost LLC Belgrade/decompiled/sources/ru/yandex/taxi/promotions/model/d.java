package ru.yandex.taxi.promotions.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes9.dex */
public final class d {
    public static ArrayList a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PromotionBackground promotionBackground = (PromotionBackground) it.next();
            PromotionBackground.Type type = promotionBackground.a;
            String str = ((type == PromotionBackground.Type.COLOR) || ((type == PromotionBackground.Type.VIDEO) && z)) ? null : promotionBackground.b;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String b(List list, PromotionBackground.Type type) {
        PromotionBackground d = d(list, type);
        if (d != null) {
            return d.b;
        }
        return null;
    }

    public static PromotionBackground c(List list, PromotionBackground.Type type) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PromotionBackground) obj).a == type) {
                break;
            }
        }
        return (PromotionBackground) obj;
    }

    public static PromotionBackground d(List list, PromotionBackground.Type type) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PromotionBackground) obj).a == type) {
                break;
            }
        }
        return (PromotionBackground) obj;
    }

    public static ArrayList e(List list, PromotionBackground.Type type) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PromotionBackground promotionBackground = (PromotionBackground) it.next();
            String str = promotionBackground.a == type ? promotionBackground.b : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final KSerializer serializer() {
        return c.a;
    }
}
