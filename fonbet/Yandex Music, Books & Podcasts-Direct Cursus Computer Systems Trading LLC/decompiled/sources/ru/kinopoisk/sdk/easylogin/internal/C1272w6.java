package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aur;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.eno;
import defpackage.lbq;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.t7l;
import defpackage.vdr;
import defpackage.we7;
import defpackage.x0q;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.y2x;
import defpackage.yc4;
import defpackage.zsd;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.AbstractC1066h7;
import ru.kinopoisk.sdk.easylogin.internal.C1032f1;
import ru.kinopoisk.sdk.easylogin.internal.P;
import ru.kinopoisk.sdk.easylogin.internal.T4;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.w6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1272w6 extends defpackage.s9 {

    @NotNull
    public final A6 d;

    @NotNull
    public final String e;

    @NotNull
    public final String f;

    @NotNull
    public final xpi g;

    @NotNull
    public final vdr h;

    @NotNull
    public final xpi i;

    @NotNull
    public final vdr j;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.w6$a */
    public enum a {
        NotStarted,
        InProgress,
        Success,
        Failure
    }

    @we7(c = "ru.kinopoisk.tvauth.mock.MockTvInteractor$authProcessStateFlow$1$1", f = "MockTvInteractor.kt", l = {30, 32, com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER, com.yandex.pulse.metrics.o.METRICS_FILTERING_STATUS_FIELD_NUMBER, com.yandex.pulse.metrics.o.SESSION_HASH_FIELD_NUMBER, UibcKeyCode.TV_KEYCODE_0}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.w6$b */
    public static final class b extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C1272w6.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            b bVar = C1272w6.this.new b((Continuation) obj2);
            bVar.b = (rjc) obj;
            return bVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x00cb, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00b8, code lost:
        
            if (defpackage.y2x.p(r4, r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        
            if (defpackage.y2x.p(r4, r6) != r0) goto L18;
         */
        @Override // defpackage.kq2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            rjc rjcVar;
            nm6 nm6Var = nm6.a;
            switch (this.a) {
                case 0:
                    qgg.h0(obj);
                    rjc rjcVar2 = (rjc) this.b;
                    P p = new P(P.c.Starting, null, null);
                    this.b = rjcVar2;
                    this.a = 1;
                    if (rjcVar2.emit(p, this) != nm6Var) {
                        rjcVar = rjcVar2;
                        long j = C1272w6.this.d.g.c;
                        this.b = rjcVar;
                        this.a = 2;
                        break;
                    }
                    return nm6Var;
                case 1:
                    rjcVar = (rjc) this.b;
                    qgg.h0(obj);
                    long j2 = C1272w6.this.d.g.c;
                    this.b = rjcVar;
                    this.a = 2;
                    break;
                case 2:
                    rjcVar = (rjc) this.b;
                    qgg.h0(obj);
                    int ordinal = C1272w6.this.d.g.a.ordinal();
                    if (ordinal == 0) {
                        P p2 = new P(P.c.WaitingForConfirmation, C1272w6.this.d.g.b, "oauth");
                        this.b = rjcVar;
                        this.a = 3;
                        break;
                    } else {
                        if (ordinal == 1) {
                            P p3 = new P(P.c.Error, null, null);
                            this.b = null;
                            this.a = 6;
                            break;
                        }
                        return Unit.a;
                    }
                    return nm6Var;
                case 3:
                    rjcVar = (rjc) this.b;
                    qgg.h0(obj);
                    long j3 = C1272w6.this.d.g.c;
                    this.b = rjcVar;
                    this.a = 4;
                    break;
                case 4:
                    rjcVar = (rjc) this.b;
                    qgg.h0(obj);
                    P p4 = new P(P.c.Authorized, null, null);
                    this.b = null;
                    this.a = 5;
                    break;
                case 5:
                case 6:
                    qgg.h0(obj);
                    return Unit.a;
                default:
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    @we7(c = "ru.kinopoisk.tvauth.mock.MockTvInteractor$installFlow$1$1", f = "MockTvInteractor.kt", l = {SQLiteDatabase.OPEN_URI, 65, 67, 69}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.w6$c */
    public static final class c extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C1272w6.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            c cVar = C1272w6.this.new c((Continuation) obj2);
            cVar.b = (rjc) obj;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        
            if (defpackage.y2x.p(r5, r7) == r0) goto L28;
         */
        @Override // defpackage.kq2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            rjc rjcVar;
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                rjc rjcVar2 = (rjc) this.b;
                a aVar = a.InProgress;
                this.b = rjcVar2;
                this.a = 1;
                if (rjcVar2.emit(aVar, this) != nm6Var) {
                    rjcVar = rjcVar2;
                }
                return nm6Var;
            }
            if (i == 1) {
                rjcVar = (rjc) this.b;
                qgg.h0(obj);
            } else {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rjcVar = (rjc) this.b;
                qgg.h0(obj);
                if (C1272w6.this.d.f.a == T4.c.Success) {
                    a aVar2 = a.Success;
                    this.b = null;
                    this.a = 3;
                } else {
                    a aVar3 = a.Failure;
                    this.b = null;
                    this.a = 4;
                }
            }
            long j = C1272w6.this.d.f.b;
            this.b = rjcVar;
            this.a = 2;
        }
    }

    @we7(c = "ru.kinopoisk.tvauth.mock.MockTvInteractor$special$$inlined$flatMapLatest$1", f = "MockTvInteractor.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.w6$d */
    public static final class d extends aur implements pyc {
        public int a;
        public /* synthetic */ rjc b;
        public /* synthetic */ Object c;
        public final /* synthetic */ C1272w6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Continuation continuation, C1272w6 c1272w6) {
            super(3, continuation);
            this.d = c1272w6;
        }

        @Override // defpackage.pyc
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            d dVar = new d((Continuation) obj3, this.d);
            dVar.b = (rjc) obj;
            dVar.c = obj2;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                rjc rjcVar = this.b;
                eno enoVar = new eno(this.d.new b(null));
                this.a = 1;
                if (zsd.e0(rjcVar, enoVar, this) == nm6Var) {
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

    @we7(c = "ru.kinopoisk.tvauth.mock.MockTvInteractor$special$$inlined$flatMapLatest$2", f = "MockTvInteractor.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.w6$e */
    public static final class e extends aur implements pyc {
        public int a;
        public /* synthetic */ rjc b;
        public /* synthetic */ Object c;
        public final /* synthetic */ C1272w6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Continuation continuation, C1272w6 c1272w6) {
            super(3, continuation);
            this.d = c1272w6;
        }

        @Override // defpackage.pyc
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            e eVar = new e((Continuation) obj3, this.d);
            eVar.b = (rjc) obj;
            eVar.c = obj2;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                rjc rjcVar = this.b;
                eno enoVar = new eno(this.d.new c(null));
                this.a = 1;
                if (zsd.e0(rjcVar, enoVar, this) == nm6Var) {
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
    public C1272w6(@NotNull A6 a6, @NotNull Q2 q2) {
        super(q2);
        a6.getClass();
        q2.getClass();
        this.d = a6;
        this.e = "MockTvInteractor";
        this.f = a6.toString();
        x0q b2 = y0q.b(0, 1, null, 5);
        this.g = b2;
        yc4 M0 = zsd.M0(b2, new d(null, this));
        mm6 mm6Var = (mm6) this.b.getValue();
        P p = new P(P.c.Unknown, null, null);
        t7l t7lVar = lbq.a;
        this.h = zsd.F0(M0, mm6Var, t7lVar, p);
        x0q b3 = y0q.b(0, 1, null, 5);
        this.i = b3;
        this.j = zsd.F0(zsd.M0(b3, new e(null, this)), (mm6) this.b.getValue(), t7lVar, a.NotStarted);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull cg6 cg6Var) {
        C1298y6 c1298y6;
        int i;
        C1272w6 c1272w6;
        int ordinal;
        if (cg6Var instanceof C1298y6) {
            c1298y6 = (C1298y6) cg6Var;
            int i2 = c1298y6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1298y6.d = i2 - Integer.MIN_VALUE;
                Object obj = c1298y6.b;
                nm6 nm6Var = nm6.a;
                i = c1298y6.d;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.j.getValue() != a.NotStarted) {
                        int ordinal2 = ((a) this.j.getValue()).ordinal();
                        if (ordinal2 == 1) {
                            throw new AbstractC1066h7.a();
                        }
                        if (ordinal2 != 3) {
                            return Unit.a;
                        }
                        xq0.q("Failed to install tv app");
                        return null;
                    }
                    long j = this.d.e.b;
                    c1298y6.a = this;
                    c1298y6.d = 1;
                    if (y2x.p(j, c1298y6) == nm6Var) {
                        return nm6Var;
                    }
                    c1272w6 = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c1272w6 = c1298y6.a;
                    qgg.h0(obj);
                }
                ordinal = c1272w6.d.e.a.ordinal();
                if (ordinal != 0) {
                    return Unit.a;
                }
                if (ordinal == 1) {
                    xq0.q("Failed to open tv app");
                    return null;
                }
                if (ordinal == 2) {
                    throw new AbstractC1066h7.a();
                }
                b6e.s();
                return null;
            }
        }
        c1298y6 = new C1298y6(this, cg6Var);
        Object obj2 = c1298y6.b;
        nm6 nm6Var2 = nm6.a;
        i = c1298y6.d;
        if (i != 0) {
        }
        ordinal = c1272w6.d.e.a.ordinal();
        if (ordinal != 0) {
        }
    }

    @Override // defpackage.s9
    @NotNull
    public final String b() {
        return this.f;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1290xb
    public final void close() {
    }

    @Override // defpackage.s9
    @NotNull
    public final String a() {
        return this.e;
    }

    @Override // defpackage.s9
    public final Object a(@NotNull Continuation<? super Unit> continuation) {
        xpi xpiVar = this.i;
        Unit unit = Unit.a;
        Object emit = xpiVar.emit(unit, continuation);
        return emit == nm6.a ? emit : unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull C1004d1 c1004d1, @NotNull Type type, @NotNull cg6 cg6Var) {
        C1285x6 c1285x6;
        int i;
        if (cg6Var instanceof C1285x6) {
            c1285x6 = (C1285x6) cg6Var;
            int i2 = c1285x6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1285x6.d = i2 - Integer.MIN_VALUE;
                Object obj = c1285x6.b;
                nm6 nm6Var = nm6.a;
                i = c1285x6.d;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = c1004d1.a;
                    if (Intrinsics.d(str, "Auth.Process.GetState")) {
                        return new C1032f1(C1032f1.c.Success, c1004d1.b, this.h.getValue());
                    }
                    if (Intrinsics.d(str, "Auth.Process.Start")) {
                        xpi xpiVar = this.g;
                        Unit unit = Unit.a;
                        c1285x6.a = c1004d1;
                        c1285x6.d = 1;
                        if (xpiVar.emit(unit, c1285x6) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        xq0.q("Unknown command");
                        return null;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c1004d1 = c1285x6.a;
                    qgg.h0(obj);
                }
                return new C1032f1(C1032f1.c.Success, c1004d1.b, null);
            }
        }
        c1285x6 = new C1285x6(this, cg6Var);
        Object obj2 = c1285x6.b;
        nm6 nm6Var2 = nm6.a;
        i = c1285x6.d;
        if (i != 0) {
        }
        return new C1032f1(C1032f1.c.Success, c1004d1.b, null);
    }
}
