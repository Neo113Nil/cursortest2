package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class nhn implements Serializable {

    @NotNull
    public static final nhn a = new nhn();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return phn.a;
    }
}
