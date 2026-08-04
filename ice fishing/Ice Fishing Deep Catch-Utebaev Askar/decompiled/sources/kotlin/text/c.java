package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function2 f200d;

    public c(CharSequence input, int i2, int i3, p getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f197a = input;
        this.f198b = i2;
        this.f199c = i3;
        this.f200d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
