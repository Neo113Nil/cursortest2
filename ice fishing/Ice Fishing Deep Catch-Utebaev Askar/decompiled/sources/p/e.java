package p;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sequence f231a;

    public e(kotlin.text.c cVar) {
        this.f231a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f231a.iterator();
    }
}
