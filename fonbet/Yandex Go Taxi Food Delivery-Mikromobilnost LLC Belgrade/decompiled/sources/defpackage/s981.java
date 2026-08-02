package defpackage;

import java.util.Comparator;

/* loaded from: classes7.dex */
public final class s981 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
