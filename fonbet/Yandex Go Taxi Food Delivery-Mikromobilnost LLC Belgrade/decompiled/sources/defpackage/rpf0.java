package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes9.dex */
public final class rpf0 implements qpf0 {
    public final r0 a = bvf0.c(b.f());

    public static FormattedText b(String str, FormattedText formattedText) {
        if (formattedText.a.isEmpty()) {
            return new FormattedText(Collections.singletonList(new FormattedText.h(str, null, null, null, null, null, 2046)));
        }
        List<Object> list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            if (obj instanceof FormattedText.h) {
                obj = FormattedText.h.e((FormattedText.h) obj, str, null, null, 2046);
            }
            arrayList.add(obj);
        }
        return new FormattedText(arrayList);
    }

    public final List a(Iterable iterable) {
        Map map = (Map) this.a.getValue();
        if (map.isEmpty()) {
            return iterable instanceof List ? (List) iterable : a.J0(iterable);
        }
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CommunicationItem communicationItem = (CommunicationItem) it.next();
            ppf0 ppf0Var = (ppf0) map.get(communicationItem.a);
            if (ppf0Var != null) {
                String d = ppf0Var.d();
                if (d != null) {
                    communicationItem = CommunicationItem.a(communicationItem, b(d, communicationItem.b), null, null, 2045);
                }
                String c = ppf0Var.c();
                if (c != null) {
                    communicationItem = CommunicationItem.a(communicationItem, null, b(c, communicationItem.c), null, 2043);
                }
                opf0 b = ppf0Var.b();
                if (b != null) {
                    CommunicationItem.a aVar = communicationItem.g;
                    communicationItem = CommunicationItem.a(communicationItem, null, null, new CommunicationItem.a(aVar.a, aVar.b, aVar.c, aVar.d, EmptyList.a, null, new bze(b.b(), b.c(), b.a()), aVar.h), 1983);
                }
            }
            arrayList.add(communicationItem);
        }
        return arrayList;
    }
}
