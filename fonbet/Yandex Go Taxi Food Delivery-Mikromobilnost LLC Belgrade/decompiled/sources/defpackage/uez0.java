package defpackage;

import java.util.Comparator;

/* loaded from: classes9.dex */
public final class uez0 implements Comparator {
    public final /* synthetic */ Comparator a;

    public uez0(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(((k7z) obj).a, ((k7z) obj2).a);
    }
}
