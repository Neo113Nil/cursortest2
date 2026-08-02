package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class UnmodifiableIterator implements Iterator {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
