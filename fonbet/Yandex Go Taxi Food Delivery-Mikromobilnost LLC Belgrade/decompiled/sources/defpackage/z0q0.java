package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionStyle;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lz0q0;", "", "Companion", "x0q0", "y0q0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class z0q0 {
    public static final y0q0 Companion = new y0q0();
    public static final i3y[] d;
    public final String a;
    public final SectionStyle b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new w0q0(0)), a.b(lazyThreadSafetyMode, new w0q0(1))};
    }

    public /* synthetic */ z0q0(int i, String str, SectionStyle sectionStyle, List list) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = SectionStyle.UNKNOWN;
        } else {
            this.b = sectionStyle;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public z0q0() {
        SectionStyle sectionStyle = SectionStyle.UNKNOWN;
        this.a = null;
        this.b = sectionStyle;
        this.c = EmptyList.a;
    }
}
