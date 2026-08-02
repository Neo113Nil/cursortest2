package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.fs;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import defpackage.zsd;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;

@we7(c = "ru.kinopoisk.cast.samsung.SamsungCastDeviceManager$special$$inlined$flatMapLatest$1", f = "SamsungCastDeviceManager.kt", l = {189}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.j8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1095j8 extends aur implements pyc {
    public int a;
    public /* synthetic */ rjc b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0983b8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1095j8(Continuation continuation, C0983b8 c0983b8) {
        super(3, continuation);
        this.d = c0983b8;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1095j8 c1095j8 = new C1095j8((Continuation) obj3, this.d);
        c1095j8.b = (rjc) obj;
        c1095j8.c = obj2;
        return c1095j8.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        F0 f0;
        K8 k8;
        pjc a;
        CopyOnWriteArrayList copyOnWriteArrayList;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = this.b;
            C1198r0.a aVar = (C1198r0.a) this.c;
            f0 = this.d.b;
            f0.a("SamsungCastDeviceManager", "change connection state", "state = " + aVar);
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                k8 = this.d.a;
                a = k8.a();
            } else if (ordinal == 1) {
                copyOnWriteArrayList = this.d.d;
                a = new fs(15, CollectionsKt.w0(copyOnWriteArrayList));
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                a = new fs(15, c5b.a);
            }
            this.a = 1;
            if (zsd.e0(rjcVar, a, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
