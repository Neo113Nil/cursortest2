package defpackage;

import java.util.Objects;

/* loaded from: classes15.dex */
public interface r3z {
    default Object a(s3z s3zVar) {
        Object b = b(s3zVar);
        Objects.requireNonNull(b);
        return b;
    }

    Object b(s3z s3zVar);
}
