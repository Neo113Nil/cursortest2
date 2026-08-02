package defpackage;

import androidx.room.coroutines.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.sequences.b;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public abstract class zpb1 {
    public static final dj40 a(List list) {
        List t = b.t(b.g(new yw01(new h73(1, list), new ej40(0)), new ej40(1)));
        ArrayList arrayList = (ArrayList) t;
        if (arrayList.isEmpty()) {
            arrayList.add(MtTransportType.UNKNOWN);
        }
        return new dj40(t);
    }

    public static final a b(h0w h0wVar, String str, int i) {
        return new a(h0wVar, str, i);
    }

    public static final a c(h0w h0wVar) {
        return new a(h0wVar);
    }
}
