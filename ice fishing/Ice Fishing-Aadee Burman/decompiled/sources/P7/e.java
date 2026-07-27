package P7;

import D4.c;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2612a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final h f2613b;

    /* renamed from: c, reason: collision with root package name */
    public final I7.l f2614c;

    public e(g gVar, c.b predicate) {
        kotlin.jvm.internal.h.e(predicate, "predicate");
        this.f2613b = gVar;
        this.f2614c = predicate;
    }

    @Override // P7.h
    public final Iterator iterator() {
        switch (this.f2612a) {
            case 0:
                return new d(this);
            default:
                return new l(this);
        }
    }

    public e(h hVar, I7.l transformer) {
        kotlin.jvm.internal.h.e(transformer, "transformer");
        this.f2613b = hVar;
        this.f2614c = transformer;
    }
}
