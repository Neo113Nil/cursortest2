package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.yandex.taxi.persuggest.api.finalsuggest.Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ltd60;", "Layd;", "Companion", "sd60", "qd60", "rd60", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class td60 extends ayd {
    public static final rd60 Companion = new rd60();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(26))};
    public final Map a;

    public td60(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = b.f();
        } else {
            this.a = map;
        }
    }

    @Override // defpackage.ayd
    public final Type a() {
        return Type.NO_WHITELISTED_REQUIREMENTS;
    }

    @Override // defpackage.ayd
    public final boolean b(xxd xxdVar) {
        if (!(xxdVar instanceof sd60)) {
            return false;
        }
        Map map = this.a;
        if (map.isEmpty()) {
            return false;
        }
        Map map2 = ((sd60) xxdVar).a;
        LinkedHashSet<String> U = kotlin.collections.a.U(map2.keySet(), map.keySet());
        if (U.isEmpty()) {
            return true;
        }
        for (String str : U) {
            Object obj = map.get(str);
            if (obj != null) {
                Number number = obj instanceof Number ? (Number) obj : null;
                if (number == null) {
                    return false;
                }
                int intValue = number.intValue();
                Object obj2 = map2.get(str);
                if (obj2 != null && obj2.equals(Integer.valueOf(intValue))) {
                    return false;
                }
            }
        }
        return true;
    }

    public td60() {
        this.a = b.f();
    }
}
