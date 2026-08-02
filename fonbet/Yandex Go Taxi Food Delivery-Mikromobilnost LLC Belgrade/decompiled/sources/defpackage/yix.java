package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lyix;", "", "Companion", "wix", "xix", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class yix {
    public static final xix Companion = new xix();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new vix(0)), null, null};
    public final Map a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ yix(int i, Boolean bool, String str, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public yix(LinkedHashMap linkedHashMap, String str, Boolean bool) {
        this.a = linkedHashMap;
        this.b = str;
        this.c = bool;
    }

    public yix() {
        this(null, null, null);
    }
}
