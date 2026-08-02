package n0;

import B7.h;
import I7.p;
import S7.InterfaceC0408w;
import android.net.Uri;
import android.view.InputEvent;
import p0.C4828c;
import u7.v;
import z7.InterfaceC5240d;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4761b extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39611n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4763d f39612u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Uri f39613v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InputEvent f39614w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4761b(C4763d c4763d, Uri uri, InputEvent inputEvent, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f39612u = c4763d;
        this.f39613v = uri;
        this.f39614w = inputEvent;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new C4761b(this.f39612u, this.f39613v, this.f39614w, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4761b) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f39611n;
        if (i == 0) {
            Q3.b.s(obj);
            C4828c c4828c = this.f39612u.f39618a;
            this.f39611n = 1;
            if (c4828c.c(this.f39613v, this.f39614w, this) == aVar) {
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
