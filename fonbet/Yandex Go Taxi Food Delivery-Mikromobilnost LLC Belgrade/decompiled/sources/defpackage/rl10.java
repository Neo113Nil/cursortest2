package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.settings.api.dto.settings.types.MenuItemElementType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrl10;", "", "Companion", "pl10", "ql10", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class rl10 {
    public static final ql10 Companion = new ql10();
    public static final i3y[] e = {a.b(LazyThreadSafetyMode.PUBLICATION, new w410(18)), null, null, null};
    public final MenuItemElementType a;
    public final ul10 b;
    public final ul10 c;
    public final String d;

    public /* synthetic */ rl10(int i, MenuItemElementType menuItemElementType, ul10 ul10Var, ul10 ul10Var2, String str) {
        this.a = (i & 1) == 0 ? MenuItemElementType.UNKNOWN : menuItemElementType;
        if ((i & 2) == 0) {
            this.b = new ul10(null);
        } else {
            this.b = ul10Var;
        }
        if ((i & 4) == 0) {
            this.c = new ul10(null);
        } else {
            this.c = ul10Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public rl10() {
        this(0);
    }

    public rl10(int i) {
        MenuItemElementType menuItemElementType = MenuItemElementType.UNKNOWN;
        ul10 ul10Var = new ul10(null);
        ul10 ul10Var2 = new ul10(null);
        this.a = menuItemElementType;
        this.b = ul10Var;
        this.c = ul10Var2;
        this.d = null;
    }
}
