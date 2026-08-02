package defpackage;

import java.util.Comparator;

/* loaded from: classes5.dex */
public final class qub implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((u4v) obj2).b.size()).compareTo(Integer.valueOf(((u4v) obj).b.size()));
    }
}
