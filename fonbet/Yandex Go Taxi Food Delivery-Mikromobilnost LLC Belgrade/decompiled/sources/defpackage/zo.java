package defpackage;

import com.yandex.go.dto.response.Action$CityMode$ContinuationAction$OpenSuggest;
import com.yandex.go.dto.response.n;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class zo extends xqt {
    public static final zo e = new zo();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, n.INSTANCE.serializer(), qoi0.a(n.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_suggest", Action$CityMode$ContinuationAction$OpenSuggest.Companion.serializer(), qoi0.a(Action$CityMode$ContinuationAction$OpenSuggest.class)));
    }
}
