package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.b6e;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.uif;
import defpackage.we7;
import defpackage.xq0;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.AbstractC0962a1;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.interaction.AbstractTvInteractor$execute$4", f = "AbstractTvInteractor.kt", l = {120}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1086j extends aur implements Function2<mm6, Continuation<Object>, Object> {
    public int a;
    public final /* synthetic */ Y0<?> b;
    public final /* synthetic */ defpackage.s9 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Type e;
    public final /* synthetic */ uif f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1086j(Y0<?> y0, defpackage.s9 s9Var, String str, Type type, Function1<? super C1032f1<Object>, Object> function1, Continuation<? super C1086j> continuation) {
        super(2, continuation);
        this.b = y0;
        this.c = s9Var;
        this.d = str;
        this.e = type;
        this.f = (uif) function1;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1086j(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1086j) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            C1004d1 c1004d1 = new C1004d1(this.b.a(), defpackage.s9.a(this.c), this.b.b());
            Timber.INSTANCE.tag(this.c.a()).v(ouj.n(this.d, ": command=%s, descriptor=[%s]"), c1004d1, this.c.b());
            defpackage.s9 s9Var = this.c;
            Type type = this.e;
            this.a = 1;
            obj = s9Var.a(c1004d1, type, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        C1032f1 c1032f1 = (C1032f1) obj;
        Timber.INSTANCE.tag(this.c.a()).v(ouj.n(this.d, ": got response %s"), c1032f1);
        int ordinal = c1032f1.getA().ordinal();
        if (ordinal == 0) {
            return this.f.invoke(c1032f1);
        }
        if (ordinal == 1) {
            throw new AbstractC0962a1.a("Command failed on tv side", null, 2, null);
        }
        if (ordinal == 2) {
            throw new AbstractC0962a1.b();
        }
        b6e.s();
        return null;
    }
}
