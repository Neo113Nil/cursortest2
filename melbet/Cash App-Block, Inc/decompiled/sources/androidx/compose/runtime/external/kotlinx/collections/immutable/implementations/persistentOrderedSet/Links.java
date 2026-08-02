package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;

/* loaded from: classes.dex */
public final class Links {
    public final Object next;
    public final Object previous;

    public Links(Object obj, Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Links() {
        this(r0, r0);
        EndOfChain endOfChain = EndOfChain.INSTANCE;
    }

    public Links(Object obj) {
        this(obj, EndOfChain.INSTANCE);
    }
}
