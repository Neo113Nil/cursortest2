package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.mm6;
import defpackage.mu7;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.W8;
import ru.kinopoisk.tvauth.internal.presentation.connectionerror.ConnectionErrorScreen;
import ru.kinopoisk.tvauth.internal.presentation.connectionsuccess.ConnectionSuccessScreen;
import ru.kinopoisk.tvauth.internal.presentation.entercode.EnterCodeScreen;
import ru.kinopoisk.tvauth.internal.presentation.installtvapp.InstallTvAppScreen;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.tvauth.internal.presentation.connecting.ConnectingViewModel$1", f = "ConnectingViewModel.kt", l = {com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER, 38}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class V1 extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ W1 c;

    @we7(c = "ru.kinopoisk.tvauth.internal.presentation.connecting.ConnectingViewModel$1$minimalTimeout$1", f = "ConnectingViewModel.kt", l = {com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a((Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                long j = W1.f;
                this.a = 1;
                if (y2x.p(j, this) == nm6Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(W1 w1, Continuation<? super V1> continuation) {
        super(2, continuation);
        this.c = w1;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        V1 v1 = new V1(this.c, continuation);
        v1.b = obj;
        return v1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        V1 v1 = new V1(this.c, (Continuation) obj2);
        v1.b = (mm6) obj;
        return v1.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /* JADX WARN: Type inference failed for: r1v2, types: [mu7] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r1v26, types: [mu7] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        ?? r1;
        Object obj2;
        boolean z;
        Throwable a2;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        try {
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            t7oVar = new t7o(th);
            r1 = i;
        }
        if (i == 0) {
            qgg.h0(obj);
            ?? p = x97.p((mm6) this.b, null, null, new a(null), 3);
            I9 i9 = this.c.d;
            r7o r7oVar2 = z7o.b;
            this.b = p;
            this.a = 1;
            obj = i9.b(this);
            i = p;
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.b;
                qgg.h0(obj);
                W1 w1 = this.c;
                r7o r7oVar3 = z7o.b;
                z = obj2 instanceof t7o;
                ConnectionErrorScreen connectionErrorScreen = ConnectionErrorScreen.a;
                if (!z) {
                    W8 w8 = (W8) obj2;
                    Timber.INSTANCE.tag("ConnectingViewModel").v("Connection result: %s", w8);
                    if (w8 instanceof W8.c) {
                        if (w1.e.a(w1.a.a)) {
                            Z7.a(w1.b.b, InstallTvAppScreen.a);
                        } else {
                            w1.c.trackError("Tv app not found");
                            Z7.a(w1.b.b, connectionErrorScreen);
                        }
                    } else if (w8 instanceof W8.a) {
                        Z7.a(w1.b.b, ConnectionSuccessScreen.a);
                    } else if (w8 instanceof W8.b) {
                        w1.c.trackError(((W8.b) w8).a);
                        Z7.a(w1.b.b, connectionErrorScreen);
                    } else if (w8 instanceof W8.d) {
                        Z7.a(w1.b.b, EnterCodeScreen.a);
                    }
                }
                W1 w12 = this.c;
                a2 = z7o.a(obj2);
                if (a2 != null) {
                    if (a2 instanceof CancellationException) {
                        Timber.INSTANCE.tag("ConnectingViewModel").d("Failed to connect tv: cancelled", new Object[0]);
                    } else {
                        Timber.INSTANCE.tag("ConnectingViewModel").w(a2, "Failed to connect to tv", new Object[0]);
                        w12.c.trackError(a2);
                        Z7.a(w12.b.b, connectionErrorScreen);
                    }
                }
                return Unit.a;
            }
            ?? r12 = (mu7) this.b;
            qgg.h0(obj);
            i = r12;
        }
        t7oVar = (W8) obj;
        r7o r7oVar4 = z7o.b;
        r1 = i;
        this.b = t7oVar;
        this.a = 2;
        if (r1.H(this) != nm6Var) {
            obj2 = t7oVar;
            W1 w13 = this.c;
            r7o r7oVar32 = z7o.b;
            z = obj2 instanceof t7o;
            ConnectionErrorScreen connectionErrorScreen2 = ConnectionErrorScreen.a;
            if (!z) {
            }
            W1 w122 = this.c;
            a2 = z7o.a(obj2);
            if (a2 != null) {
            }
            return Unit.a;
        }
        return nm6Var;
    }
}
