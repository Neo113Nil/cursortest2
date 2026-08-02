package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.persuggest.api.ActionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Luk0;", "", "Companion", "sk0", "tk0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class uk0 {
    public static final tk0 Companion = new tk0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new c20(24)), null};
    public final ActionType a;
    public final String b;

    public /* synthetic */ uk0(int i, ActionType actionType, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = actionType;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public uk0() {
        this.a = null;
        this.b = null;
    }
}
