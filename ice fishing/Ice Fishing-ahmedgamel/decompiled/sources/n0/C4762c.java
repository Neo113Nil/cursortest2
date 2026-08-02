package n0;

import B7.h;
import I7.p;
import S7.InterfaceC0408w;
import android.net.Uri;
import p0.C4828c;
import u7.v;
import z7.InterfaceC5240d;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4762c extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39615n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4763d f39616u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Uri f39617v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4762c(C4763d c4763d, Uri uri, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f39616u = c4763d;
        this.f39617v = uri;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new C4762c(this.f39616u, this.f39617v, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4762c) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f39615n;
        if (i == 0) {
            Q3.b.s(obj);
            C4828c c4828c = this.f39616u.f39618a;
            this.f39615n = 1;
            if (c4828c.d(this.f39617v, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
        }
        return v.f41073a;
    }
}
