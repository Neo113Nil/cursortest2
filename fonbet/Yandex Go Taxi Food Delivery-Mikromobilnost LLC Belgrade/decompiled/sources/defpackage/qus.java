package defpackage;

import java.util.Comparator;

/* loaded from: classes12.dex */
public final class qus implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Boolean.valueOf(((wts) obj2).c).compareTo(Boolean.valueOf(((wts) obj).c));
    }
}
