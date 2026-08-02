package defpackage;

import com.yandex.go.slot.dto.SlotItemBodyDto;
import com.yandex.go.slot.dto.SlotItemLineDto;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public abstract class qrs0 {
    public static final ArrayList a(String str, List list) {
        List<SlotItemBodyDto> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (SlotItemBodyDto slotItemBodyDto : list2) {
            List<SlotItemLineDto> list3 = slotItemBodyDto.a;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
            for (SlotItemLineDto slotItemLineDto : list3) {
                FormattedText formattedText = slotItemLineDto.c;
                if (formattedText != null) {
                    slotItemLineDto = new SlotItemLineDto(slotItemLineDto.a, slotItemLineDto.b, d9s.a(str, formattedText));
                }
                arrayList2.add(slotItemLineDto);
            }
            arrayList.add(new SlotItemBodyDto(arrayList2, slotItemBodyDto.b));
        }
        return arrayList;
    }

    public static final ArrayList b(String str, String str2, List list) {
        List<SlotItemBodyDto> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (SlotItemBodyDto slotItemBodyDto : list2) {
            r rVar = new r(str, str2, 25);
            List<SlotItemLineDto> list3 = slotItemBodyDto.a;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
            for (SlotItemLineDto slotItemLineDto : list3) {
                FormattedText formattedText = slotItemLineDto.c;
                if (formattedText != null) {
                    slotItemLineDto = new SlotItemLineDto(slotItemLineDto.a, slotItemLineDto.b, (FormattedText) rVar.invoke(formattedText));
                }
                arrayList2.add(slotItemLineDto);
            }
            arrayList.add(new SlotItemBodyDto(arrayList2, slotItemBodyDto.b));
        }
        return arrayList;
    }
}
