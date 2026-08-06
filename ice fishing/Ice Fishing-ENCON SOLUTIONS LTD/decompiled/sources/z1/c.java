package z1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements y1.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8628b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8629c;

    /* renamed from: d, reason: collision with root package name */
    public final t1.p f8630d;

    public c(String input, int i2, int i3, t1.p pVar) {
        kotlin.jvm.internal.i.e(input, "input");
        this.f8627a = input;
        this.f8628b = i2;
        this.f8629c = i3;
        this.f8630d = pVar;
    }

    @Override // y1.c
    public final Iterator iterator() {
        return new b(this);
    }
}
