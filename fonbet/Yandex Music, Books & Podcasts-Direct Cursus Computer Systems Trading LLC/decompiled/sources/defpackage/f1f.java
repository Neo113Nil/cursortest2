package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f1f implements Iterator {
    public static final f1f a;
    public static final /* synthetic */ f1f[] b;

    static {
        f1f f1fVar = new f1f("INSTANCE", 0);
        a = f1fVar;
        b = new f1f[]{f1fVar};
    }

    public static f1f valueOf(String str) {
        return (f1f) Enum.valueOf(f1f.class, str);
    }

    public static f1f[] values() {
        return (f1f[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        o2g.U("no calls to next() since the last call to remove()", false);
    }
}
