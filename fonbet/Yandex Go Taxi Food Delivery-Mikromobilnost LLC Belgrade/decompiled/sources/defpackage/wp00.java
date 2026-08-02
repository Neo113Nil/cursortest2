package defpackage;

import java.util.Comparator;

/* loaded from: classes9.dex */
public final class wp00 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((lm00) obj2).d.f()).compareTo(Integer.valueOf(((lm00) obj).d.f()));
    }
}
