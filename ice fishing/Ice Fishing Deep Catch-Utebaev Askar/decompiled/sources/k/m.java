package k;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.collections.l f153c;

    public m(kotlin.collections.l lVar) {
        this.f153c = lVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f151a == null && !this.f152b) {
            String line = ((BufferedReader) this.f153c.f175b).readLine();
            this.f151a = line;
            if (line == null) {
                this.f152b = true;
            }
        }
        return this.f151a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f151a;
        this.f151a = null;
        Intrinsics.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
