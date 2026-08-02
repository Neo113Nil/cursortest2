package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.mm6;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.ssa;
import defpackage.t7o;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.yd5;
import defpackage.z7o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1080i7;
import ru.kinopoisk.tvauth.internal.presentation.connecting.ConnectingScreen;
import ru.kinopoisk.tvauth.internal.presentation.connectionerror.ConnectionErrorScreen;

@we7(c = "ru.kinopoisk.tvauth.internal.presentation.installtvapp.InstallTvAppViewModel$tryToConnect$1", f = "InstallTvAppViewModel.kt", l = {SQLiteDatabase.OPEN_URI, 69}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.g5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1050g5 extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public Object a;
    public C1022e5 b;
    public int c;
    public final /* synthetic */ C1022e5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050g5(C1022e5 c1022e5, Continuation<? super C1050g5> continuation) {
        super(2, continuation);
        this.d = c1022e5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1050g5(this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1050g5(this.d, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ab  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        C1022e5 c1022e5;
        Throwable a;
        nm6 nm6Var = nm6.a;
        int i = this.c;
        try {
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            t7oVar = new t7o(th);
        }
        if (i == 0) {
            qgg.h0(obj);
            I9 i9 = this.d.c;
            r7o r7oVar2 = z7o.b;
            this.c = 1;
            obj = i9.a(this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c1022e5 = this.b;
                t7oVar = this.a;
                qgg.h0(obj);
                int i2 = C1022e5.g;
                c1022e5.getClass();
                x97.y(ot0.F(c1022e5), null, null, new C1050g5(c1022e5, null), 3);
                C1022e5 c1022e52 = this.d;
                a = z7o.a(t7oVar);
                if (a != null) {
                    c1022e52.b.trackError(a);
                    Z7.a(c1022e52.a.b, ConnectionErrorScreen.a);
                }
                return Unit.a;
            }
            qgg.h0(obj);
        }
        InterfaceC1080i7 interfaceC1080i7 = (InterfaceC1080i7) obj;
        r7o r7oVar3 = z7o.b;
        t7oVar = interfaceC1080i7;
        C1022e5 c1022e53 = this.d;
        if (!(t7oVar instanceof t7o)) {
            InterfaceC1080i7 interfaceC1080i72 = (InterfaceC1080i7) t7oVar;
            if (Intrinsics.d(interfaceC1080i72, InterfaceC1080i7.a.a)) {
                C1167oa c1167oa = c1022e53.a;
                Z7.a(c1167oa.b, new ConnectingScreen(new Q1(c1167oa.a.a, true)));
            } else if (Intrinsics.d(interfaceC1080i72, InterfaceC1080i7.b.a)) {
                C1288x9 c1288x9 = c1022e53.d;
                c1288x9.getClass();
                msa msaVar = nsa.b;
                long N = yd5.N(c1288x9.a().n, ssa.MILLISECONDS);
                this.a = t7oVar;
                this.b = c1022e53;
                this.c = 2;
                if (y2x.p(N, this) != nm6Var) {
                    c1022e5 = c1022e53;
                    int i22 = C1022e5.g;
                    c1022e5.getClass();
                    x97.y(ot0.F(c1022e5), null, null, new C1050g5(c1022e5, null), 3);
                }
                return nm6Var;
            }
        }
        C1022e5 c1022e522 = this.d;
        a = z7o.a(t7oVar);
        if (a != null) {
        }
        return Unit.a;
    }
}
