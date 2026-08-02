package com.squareup.cash.payments.presenters;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.ListProperty;
import com.squareup.cash.payments.viewmodels.Position;
import com.squareup.cash.payments.viewmodels.Rotation;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.viewmodels.Zoom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes7.dex */
public abstract class ElementUtilKt {
    public static final boolean canAddSticker(List list) {
        int i;
        list.getClass();
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((Element) it.next()) instanceof Sticker) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                    throw null;
                }
            }
        }
        return i < 25;
    }

    public static final boolean canAddText(List list) {
        int i;
        list.getClass();
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((Element) it.next()) instanceof Text) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                    throw null;
                }
            }
        }
        return i < 25;
    }

    public static final ArrayList clearFocus(List list) {
        list.getClass();
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof Text) {
                obj = Text.copy$default((Text) obj, false, null, 55);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final float getNextzIndex(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            return RecyclerView.DECELERATION_RATE;
        }
        Iterator it = linkedHashMap.values().iterator();
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return RecyclerView.DECELERATION_RATE;
        }
        Object next = it.next();
        if (it.hasNext()) {
            float floatValue = ((Number) next).floatValue();
            do {
                Object next2 = it.next();
                float floatValue2 = ((Number) next2).floatValue();
                if (Float.compare(floatValue, floatValue2) < 0) {
                    next = next2;
                    floatValue = floatValue2;
                }
            } while (it.hasNext());
        }
        return ((Number) next).floatValue() + 1.0f;
    }

    public static ArrayList updateProperties$default(List list, int i, Position position, Rotation rotation, Zoom zoom, Boolean bool, int i2) {
        if ((i2 & 2) != 0) {
            position = null;
        }
        if ((i2 & 4) != 0) {
            rotation = null;
        }
        if ((i2 & 8) != 0) {
            zoom = null;
        }
        if ((i2 & 16) != 0) {
            bool = null;
        }
        list.getClass();
        List<Element> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Element element : list2) {
            if (element.getId() == i) {
                element = element.copy(ListProperty.copy$default(element.getProperties(), position == null ? element.getProperties().position : position, rotation == null ? element.getProperties().rotation : rotation, zoom == null ? element.getProperties().zoom : zoom, null, bool != null ? bool.booleanValue() : element.getProperties().isOnTopOfDelete, 8));
            }
            arrayList.add(element);
        }
        return arrayList;
    }
}
