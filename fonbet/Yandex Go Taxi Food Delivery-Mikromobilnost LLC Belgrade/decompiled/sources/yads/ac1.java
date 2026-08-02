package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ac1 implements Iterator {
    public static final ac1 b;
    public static final /* synthetic */ ac1[] c;

    static {
        ac1 ac1Var = new ac1();
        b = ac1Var;
        c = new ac1[]{ac1Var};
    }

    public static ac1 valueOf(String str) {
        return (ac1) Enum.valueOf(ac1.class, str);
    }

    public static ac1[] values() {
        return (ac1[]) c.clone();
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
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
