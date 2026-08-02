package defpackage;

import java.util.Comparator;

/* loaded from: classes15.dex */
public final class zmt0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xmt0 xmt0Var = (xmt0) obj2;
        xmt0 xmt0Var2 = (xmt0) obj;
        return Integer.valueOf(xmt0Var.b - xmt0Var.a).compareTo(Integer.valueOf(xmt0Var2.b - xmt0Var2.a));
    }
}
