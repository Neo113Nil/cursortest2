package defpackage;

import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class wld0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((Number) ((Pair) obj).getSecond()).intValue()).compareTo(Integer.valueOf(((Number) ((Pair) obj2).getSecond()).intValue()));
    }
}
