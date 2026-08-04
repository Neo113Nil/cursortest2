package com.gamericefishpro.space.ai;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterator, com.gamericefishpro.space.fi.a {
    public String d;
    public boolean e;
    public final /* synthetic */ n i;

    public m(n nVar) {
        this.i = nVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.d == null && !this.e) {
            String line = ((BufferedReader) this.i.b).readLine();
            this.d = line;
            if (line == null) {
                this.e = true;
            }
        }
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.d;
        this.d = null;
        Intrinsics.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
