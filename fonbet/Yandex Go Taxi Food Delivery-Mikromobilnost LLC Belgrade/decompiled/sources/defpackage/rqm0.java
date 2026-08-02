package defpackage;

import java.util.Comparator;

/* loaded from: classes6.dex */
public final class rqm0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((zuo0) obj).getStartTime()).compareTo(Long.valueOf(((zuo0) obj2).getStartTime()));
    }
}
