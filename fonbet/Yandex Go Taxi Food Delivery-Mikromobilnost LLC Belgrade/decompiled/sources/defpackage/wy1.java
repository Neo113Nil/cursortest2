package defpackage;

import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardInfo;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardItemDto$ActionButtons;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardItemDto$Text;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class wy1 {
    public static lz1 a(AltpinCardInfo altpinCardInfo) {
        List list;
        SlotButtonDto slotButtonDto;
        List list2 = altpinCardInfo.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof AltpinCardItemDto$Text) {
                arrayList.add(obj);
            }
        }
        List list3 = altpinCardInfo.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list3) {
            if (obj2 instanceof AltpinCardItemDto$ActionButtons) {
                arrayList2.add(obj2);
            }
        }
        AltpinCardItemDto$ActionButtons altpinCardItemDto$ActionButtons = (AltpinCardItemDto$ActionButtons) a.R(arrayList2);
        if (altpinCardItemDto$ActionButtons == null || (list = altpinCardItemDto$ActionButtons.a) == null) {
            return null;
        }
        FormattedText formattedText = altpinCardInfo.a;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SlotItemDto slotItemDto = ((AltpinCardItemDto$Text) it.next()).a;
            if (slotItemDto != null) {
                arrayList3.add(slotItemDto);
            }
        }
        SlotButtonDto slotButtonDto2 = (SlotButtonDto) a.S(0, list);
        if (slotButtonDto2 == null || (slotButtonDto = (SlotButtonDto) a.S(1, list)) == null) {
            return null;
        }
        return new lz1(formattedText, arrayList3, slotButtonDto2, slotButtonDto);
    }
}
