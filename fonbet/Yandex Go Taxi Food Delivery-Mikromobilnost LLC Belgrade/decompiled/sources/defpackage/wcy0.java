package defpackage;

import java.util.Comparator;

/* loaded from: classes15.dex */
public final class wcy0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((ady0) obj).a().ordinal()).compareTo(Integer.valueOf(((ady0) obj2).a().ordinal()));
    }
}
