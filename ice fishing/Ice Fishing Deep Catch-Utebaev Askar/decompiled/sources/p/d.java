package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f230c;

    public d(h sequence, f predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f228a = sequence;
        this.f229b = false;
        this.f230c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new c(this);
    }
}
