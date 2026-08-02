package defpackage;

import java.util.Comparator;

/* loaded from: classes5.dex */
public final class xp00 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((lm00) obj2).d.c).compareTo(Integer.valueOf(((lm00) obj).d.c));
    }
}
