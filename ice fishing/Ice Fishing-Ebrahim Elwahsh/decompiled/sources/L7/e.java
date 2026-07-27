package L7;

import java.util.Iterator;
import z4.c;

/* loaded from: classes2.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1800a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final h f1801b;

    /* renamed from: c, reason: collision with root package name */
    public final E7.l f1802c;

    public e(g gVar, c.b predicate) {
        kotlin.jvm.internal.h.e(predicate, "predicate");
        this.f1801b = gVar;
        this.f1802c = predicate;
    }

    @Override // L7.h
    public final Iterator iterator() {
        switch (this.f1800a) {
            case 0:
                return new d(this);
            default:
                return new l(this);
        }
    }

    public e(h hVar, E7.l transformer) {
        kotlin.jvm.internal.h.e(transformer, "transformer");
        this.f1801b = hVar;
        this.f1802c = transformer;
    }
}
