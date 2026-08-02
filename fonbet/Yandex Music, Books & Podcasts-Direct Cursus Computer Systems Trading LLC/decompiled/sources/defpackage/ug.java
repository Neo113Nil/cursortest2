package defpackage;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class ug {

    @NotNull
    public static final tg Companion = new tg();
    public static final arf[] d = {null, btf.a(bwf.b, new s2(8)), null};
    public final String a;
    public final Map b;
    public final q5f c;

    public /* synthetic */ ug(int i, String str, Map map, q5f q5fVar) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, sg.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
        this.c = q5fVar;
    }
}
