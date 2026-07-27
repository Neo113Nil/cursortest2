package a8;

import I7.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.v;

/* renamed from: a8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0448b extends kotlin.jvm.internal.i implements l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4387n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f4388u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f4389v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0448b(d dVar, c cVar, int i) {
        super(1);
        this.f4387n = i;
        this.f4388u = dVar;
        this.f4389v = cVar;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        switch (this.f4387n) {
            case 0:
                this.f4389v.getClass();
                this.f4388u.d(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f4392g;
                this.f4389v.getClass();
                d dVar = this.f4388u;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.d(null);
                break;
        }
        return v.f41350a;
    }
}
