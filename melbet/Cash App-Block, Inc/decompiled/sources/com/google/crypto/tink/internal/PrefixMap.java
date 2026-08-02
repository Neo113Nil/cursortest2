package com.google.crypto.tink.internal;

import com.google.crypto.tink.util.Bytes;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class PrefixMap {
    public static final Bytes EMPTY_BYTES = Bytes.copyFrom(new byte[0]);
    public final HashMap entries;

    public final class ConcatenatedIterator implements Iterator {
        public final Iterator it0;
        public final Iterator it1;

        public ConcatenatedIterator(Iterator it, Iterator it2) {
            this.it0 = it;
            this.it1 = it2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.it0.hasNext() || this.it1.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Iterator it = this.it0;
            return it.hasNext() ? it.next() : this.it1.next();
        }
    }

    public PrefixMap(HashMap hashMap) {
        this.entries = hashMap;
    }
}
