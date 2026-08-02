package P7;

import D4.c;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2447a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final h f2448b;

    /* renamed from: c, reason: collision with root package name */
    public final I7.l f2449c;

    public e(g gVar, c.b predicate) {
        kotlin.jvm.internal.h.e(predicate, "predicate");
        this.f2448b = gVar;
        this.f2449c = predicate;
    }

    @Override // P7.h
    public final Iterator iterator() {
        switch (this.f2447a) {
            case 0:
                return new d(this);
            default:
                return new l(this);
        }
    }

    public e(h hVar, I7.l transformer) {
        kotlin.jvm.internal.h.e(transformer, "transformer");
        this.f2448b = hVar;
        this.f2449c = transformer;
    }
}
