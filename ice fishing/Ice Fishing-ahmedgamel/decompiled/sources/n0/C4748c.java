package n0;

import B7.h;
import I7.p;
import S7.InterfaceC0404w;
import android.net.Uri;
import p0.C4824c;
import u7.v;
import z7.InterfaceC5267d;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4748c extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39456n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4749d f39457u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Uri f39458v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4748c(C4749d c4749d, Uri uri, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f39457u = c4749d;
        this.f39458v = uri;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new C4748c(this.f39457u, this.f39458v, interfaceC5267d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4748c) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(v.f41353a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f39456n;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            C4824c c4824c = this.f39457u.f39459a;
            this.f39456n = 1;
            if (c4824c.d(this.f39458v, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
        }
        return v.f41353a;
    }
}
