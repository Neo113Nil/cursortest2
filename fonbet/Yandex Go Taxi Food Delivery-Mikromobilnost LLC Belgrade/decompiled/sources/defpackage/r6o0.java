package defpackage;

import java.util.Comparator;

/* loaded from: classes8.dex */
public final class r6o0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((zuo0) obj2).getStartTime()).compareTo(Long.valueOf(((zuo0) obj).getStartTime()));
    }
}
