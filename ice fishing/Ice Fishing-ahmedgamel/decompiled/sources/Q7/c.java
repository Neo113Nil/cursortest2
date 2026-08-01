package Q7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c implements P7.h {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2672b;

    /* renamed from: c, reason: collision with root package name */
    public final I7.p f2673c;

    public c(CharSequence input, int i, I7.p pVar) {
        kotlin.jvm.internal.h.e(input, "input");
        this.f2671a = input;
        this.f2672b = i;
        this.f2673c = pVar;
    }

    @Override // P7.h
    public final Iterator iterator() {
        return new b(this);
    }
}
