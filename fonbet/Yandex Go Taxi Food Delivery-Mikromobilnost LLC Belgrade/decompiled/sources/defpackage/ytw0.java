package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockIconType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lytw0;", "", "Companion", "wtw0", "xtw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ytw0 {
    public static final xtw0 Companion = new xtw0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(25))};
    public final String a;
    public final SurgeInfoTextBlockIconType b;

    public /* synthetic */ ytw0(int i, String str, SurgeInfoTextBlockIconType surgeInfoTextBlockIconType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = surgeInfoTextBlockIconType;
        }
    }

    public ytw0(int i) {
        this.a = "";
        this.b = null;
    }

    public ytw0() {
        this(0);
    }
}
