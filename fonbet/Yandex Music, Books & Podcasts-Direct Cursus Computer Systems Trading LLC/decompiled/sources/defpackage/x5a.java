package defpackage;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class x5a {

    @NotNull
    public static final w5a Companion = new w5a();
    public static final arf[] d = {null, btf.a(bwf.b, new bv7(15)), null};
    public final String a;
    public final Map b;
    public final q5f c;

    public /* synthetic */ x5a(int i, String str, Map map, q5f q5fVar) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, v5a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
        this.c = q5fVar;
    }
}
