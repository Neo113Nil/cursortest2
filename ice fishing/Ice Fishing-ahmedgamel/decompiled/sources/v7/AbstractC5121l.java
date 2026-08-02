package v7;

import java.util.Collection;

/* renamed from: v7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5121l extends AbstractC5120k {
    public static int w(Iterable iterable, int i) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
