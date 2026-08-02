package defpackage;

import java.util.Comparator;
import ru.yandex.taxi.masstransit.model.VariantStyle;

/* loaded from: classes6.dex */
public final class v231 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.valueOf(((VariantStyle.a) obj2).a.a()).compareTo(Float.valueOf(((VariantStyle.a) obj).a.a()));
    }
}
