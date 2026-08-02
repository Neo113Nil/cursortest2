package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.cg6;
import defpackage.clc;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.pairing.PairingConnectionImpl$send$3", f = "PairingConnectionImpl.kt", l = {79}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.n7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1150n7 extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C1136m7 b;
    public final /* synthetic */ JSONObject c;

    @we7(c = "ru.kinopoisk.pairing.PairingConnectionImpl$send$3$1", f = "PairingConnectionImpl.kt", l = {77}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.n7$a */
    public static final class a extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ C1136m7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1136m7 c1136m7, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = c1136m7;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.c, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            a aVar = new a(this.c, (Continuation) obj2);
            aVar.b = (rjc) obj;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                rjc rjcVar = (rjc) this.b;
                Object value = ((xdr) this.c.d).getValue();
                this.a = 1;
                if (rjcVar.emit(value, this) == nm6Var) {
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

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.n7$b */
    public static final class b implements pjc {
        public final /* synthetic */ pjc a;

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.n7$b$a */
        public static final class a<T> implements rjc {
            public final /* synthetic */ rjc a;

            @we7(c = "ru.kinopoisk.pairing.PairingConnectionImpl$send$3$invokeSuspend$$inlined$filterIsInstance$1$2", f = "PairingConnectionImpl.kt", l = {50}, m = "emit")
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.n7$b$a$a, reason: collision with other inner class name */
            public static final class C0040a extends cg6 {
                public /* synthetic */ Object a;
                public int b;

                public C0040a(Continuation continuation) {
                    super(continuation);
                }

                @Override // defpackage.kq2
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(rjc rjcVar) {
                this.a = rjcVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // defpackage.rjc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0040a c0040a;
                int i;
                if (continuation instanceof C0040a) {
                    c0040a = (C0040a) continuation;
                    int i2 = c0040a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0040a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0040a.a;
                        nm6 nm6Var = nm6.a;
                        i = c0040a.b;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar = this.a;
                            if (obj instanceof C1286x7) {
                                c0040a.b = 1;
                                if (rjcVar.emit(obj, c0040a) == nm6Var) {
                                    return nm6Var;
                                }
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj2);
                        }
                        return Unit.a;
                    }
                }
                c0040a = new C0040a(continuation);
                Object obj22 = c0040a.a;
                nm6 nm6Var2 = nm6.a;
                i = c0040a.b;
                if (i != 0) {
                }
                return Unit.a;
            }
        }

        public b(pjc pjcVar) {
            this.a = pjcVar;
        }

        @Override // defpackage.pjc
        public final Object collect(rjc rjcVar, Continuation continuation) {
            Object collect = this.a.collect(new a(rjcVar), continuation);
            return collect == nm6.a ? collect : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1150n7(C1136m7 c1136m7, JSONObject jSONObject, Continuation<? super C1150n7> continuation) {
        super(2, continuation);
        this.b = c1136m7;
        this.c = jSONObject;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1150n7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1150n7(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            Timber.INSTANCE.tag("PairingConnectionImpl").v("Waiting for connected state", new Object[0]);
            C1136m7 c1136m7 = this.b;
            b bVar = new b(new clc(c1136m7.d, new a(c1136m7, null)));
            this.a = 1;
            if (zsd.i0(bVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        ((C1255v2) this.b.e.getValue()).send(this.c.toString());
        return Unit.a;
    }
}
