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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.kinopoisk.internal.KinopoiskCastDeviceManager$special$$inlined$flatMapLatest$1", f = "KinopoiskCastDeviceManager.kt", l = {189}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.s5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1217s5 extends aur implements pyc {
    public int a;
    public /* synthetic */ rjc b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1106k5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217s5(Continuation continuation, C1106k5 c1106k5) {
        super(3, continuation);
        this.d = c1106k5;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1217s5 c1217s5 = new C1217s5((Continuation) obj3, this.d);
        c1217s5.b = (rjc) obj;
        c1217s5.c = obj2;
        return c1217s5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc c;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = this.b;
            C1198r0.a aVar = (C1198r0.a) this.c;
            Timber.INSTANCE.d("KinopoiskCastDeviceManager", "get discovered items [connectionState=%s]", aVar);
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                c = this.d.a.c();
            } else if (ordinal == 1) {
                c = new fs(15, CollectionsKt.w0(this.d.c));
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                c = new fs(15, c5b.a);
            }
            this.a = 1;
            if (zsd.e0(rjcVar, c, this) == nm6Var) {
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
