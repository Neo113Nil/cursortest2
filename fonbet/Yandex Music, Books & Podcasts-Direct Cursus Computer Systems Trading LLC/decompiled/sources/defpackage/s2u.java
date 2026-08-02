package defpackage;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class s2u {
    public final f7l a;
    public final g4l b;
    public final byk c;
    public final LinkedHashSet d;

    public s2u() {
        jyr b = l18.b.b(hag.I(oq7.class), true);
        this.a = ((oq7) b.getValue()).a;
        this.b = ((oq7) b.getValue()).b;
        this.c = new byk(1);
        this.d = new LinkedHashSet();
    }

    public static x1u a(y9u y9uVar) {
        if (y9uVar instanceof w9u) {
            return ((w9u) y9uVar).a;
        }
        if (y9uVar instanceof x9u) {
            return ((x9u) y9uVar).a;
        }
        if (Intrinsics.d(y9uVar, v9u.a)) {
            return null;
        }
        b6e.s();
        return null;
    }
}
