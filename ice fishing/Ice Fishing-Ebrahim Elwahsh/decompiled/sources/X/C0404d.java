package X;

import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: X.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404d extends x7.h implements E7.l {

    /* renamed from: n, reason: collision with root package name */
    public int f3554n;

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
        return new C0404d(1, interfaceC5133d);
    }

    @Override // E7.l
    public final Object invoke(Object obj) {
        C0404d c0404d = (C0404d) create((InterfaceC5133d) obj);
        q7.v vVar = q7.v.f40183a;
        c0404d.invokeSuspend(vVar);
        return vVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f3554n;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            this.f3554n = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.f.r(obj);
        return q7.v.f40183a;
    }
}
