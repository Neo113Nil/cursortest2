package defpackage;

import com.yandex.music.shared.network.api.converter.ConvertedResultContext$Companion$ConvertedResultContextException;

/* loaded from: classes4.dex */
public interface tj6 {
    public static final qee a = qee.d;

    static Object a(rj6 rj6Var) {
        rj6Var.getClass();
        if (rj6Var instanceof qj6) {
            return ((qj6) rj6Var).a;
        }
        if (rj6Var instanceof pj6) {
            throw new ConvertedResultContext$Companion$ConvertedResultContextException((pj6) rj6Var);
        }
        b6e.s();
        return null;
    }
}
