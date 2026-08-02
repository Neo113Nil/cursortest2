package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aur;
import defpackage.cg6;
import defpackage.clc;
import defpackage.eno;
import defpackage.gld;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y4h;
import defpackage.zsd;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.F4;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$findKinopoiskCastServiceId$2", f = "AndroidTvInteractor.kt", l = {183}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1278x extends aur implements Function2<mm6, Continuation<? super String>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r c;
    public final /* synthetic */ String d;

    @we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$findKinopoiskCastServiceId$2$1", f = "AndroidTvInteractor.kt", l = {155}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x$a */
    public static final class a extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ mm6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mm6 mm6Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = mm6Var;
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
            rjc rjcVar;
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                rjcVar = (rjc) this.b;
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rjcVar = (rjc) this.b;
                qgg.h0(obj);
            }
            while (gld.T(this.c)) {
                Unit unit = Unit.a;
                this.b = rjcVar;
                this.a = 1;
                if (rjcVar.emit(unit, this) == nm6Var) {
                    return nm6Var;
                }
            }
            return Unit.a;
        }
    }

    @we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$findKinopoiskCastServiceId$2$3$googleCastDeviceInfo$1", f = "AndroidTvInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x$b */
    public static final class b extends aur implements Function2<mm6, Continuation<? super F4.b>, Object> {
        public final /* synthetic */ r a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.a = rVar;
            this.b = str;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.a, this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new b(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            F4.b a = this.a.f.a(this.b);
            if (a != null) {
                return a;
            }
            xq0.x("Google cast device not found");
            return null;
        }
    }

    @we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$findKinopoiskCastServiceId$2$4", f = "AndroidTvInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x$c */
    public static final class c extends aur implements Function2<Throwable, Continuation<? super Boolean>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ r b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = rVar;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.b, continuation);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            c cVar = new c(this.b, (Continuation) obj2);
            cVar.a = (Throwable) obj;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            Timber.INSTANCE.tag(this.b.h).v((Throwable) this.a, "Error while searching kinopoisk cast", new Object[0]);
            return Boolean.TRUE;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x$d */
    public static final class d implements pjc {
        public final /* synthetic */ pjc a;
        public final /* synthetic */ r b;

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x$d$a */
        public static final class a<T> implements rjc {
            public final /* synthetic */ rjc a;
            public final /* synthetic */ r b;

            @we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$findKinopoiskCastServiceId$2$invokeSuspend$$inlined$map$1$2", f = "AndroidTvInteractor.kt", l = {50}, m = "emit")
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x$d$a$a, reason: collision with other inner class name */
            public static final class C0044a extends cg6 {
                public /* synthetic */ Object a;
                public int b;

                public C0044a(Continuation continuation) {
                    super(continuation);
                }

                @Override // defpackage.kq2
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(rjc rjcVar, r rVar) {
                this.a = rjcVar;
                this.b = rVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // defpackage.rjc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0044a c0044a;
                int i;
                if (continuation instanceof C0044a) {
                    c0044a = (C0044a) continuation;
                    int i2 = c0044a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0044a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0044a.a;
                        nm6 nm6Var = nm6.a;
                        i = c0044a.b;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar = this.a;
                            List<C1260v7> b = this.b.g.b();
                            c0044a.b = 1;
                            if (rjcVar.emit(b, c0044a) == nm6Var) {
                                return nm6Var;
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
                c0044a = new C0044a(continuation);
                Object obj22 = c0044a.a;
                nm6 nm6Var2 = nm6.a;
                i = c0044a.b;
                if (i != 0) {
                }
                return Unit.a;
            }
        }

        public d(pjc pjcVar, r rVar) {
            this.a = pjcVar;
            this.b = rVar;
        }

        @Override // defpackage.pjc
        public final Object collect(rjc rjcVar, Continuation continuation) {
            Object collect = this.a.collect(new a(rjcVar, this.b), continuation);
            return collect == nm6.a ? collect : Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x$e */
    public static final class e implements pjc {
        public final /* synthetic */ d a;
        public final /* synthetic */ r b;
        public final /* synthetic */ String c;

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x$e$a */
        public static final class a<T> implements rjc {
            public final /* synthetic */ rjc a;
            public final /* synthetic */ r b;
            public final /* synthetic */ String c;

            @we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$findKinopoiskCastServiceId$2$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidTvInteractor.kt", l = {UibcKeyCode.TV_KEYCODE_3, 71}, m = "emit")
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x$e$a$a, reason: collision with other inner class name */
            public static final class C0045a extends cg6 {
                public /* synthetic */ Object a;
                public int b;
                public a c;
                public rjc e;
                public List f;

                public C0045a(Continuation continuation) {
                    super(continuation);
                }

                @Override // defpackage.kq2
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(rjc rjcVar, r rVar, String str) {
                this.a = rjcVar;
                this.b = rVar;
                this.c = str;
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
            
                if (r2.emit(r4, r0) == r1) goto L39;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // defpackage.rjc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0045a c0045a;
                int i;
                rjc rjcVar;
                List list;
                a<T> aVar;
                Iterator<T> it;
                Object obj2;
                if (continuation instanceof C0045a) {
                    c0045a = (C0045a) continuation;
                    int i2 = c0045a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0045a.b = i2 - Integer.MIN_VALUE;
                        Object obj3 = c0045a.a;
                        nm6 nm6Var = nm6.a;
                        i = c0045a.b;
                        if (i != 0) {
                            qgg.h0(obj3);
                            rjcVar = this.a;
                            list = (List) obj;
                            y4h b = this.b.e.b();
                            b bVar = new b(this.b, this.c, null);
                            c0045a.c = this;
                            c0045a.e = rjcVar;
                            c0045a.f = list;
                            c0045a.b = 1;
                            obj3 = x97.V(b, bVar, c0045a);
                            if (obj3 != nm6Var) {
                                aVar = this;
                            }
                            return nm6Var;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                qgg.h0(obj3);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = c0045a.f;
                        rjcVar = c0045a.e;
                        aVar = c0045a.c;
                        qgg.h0(obj3);
                        List list2 = list;
                        F4.b bVar2 = (F4.b) obj3;
                        Timber.INSTANCE.tag(aVar.b.h).v("Searching google cast service [%s] among kinopoisk services [%s]", bVar2, CollectionsKt.X(list2, null, null, null, null, 63));
                        it = list2.iterator();
                        loop0: while (true) {
                            if (it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            List<InetAddress> list3 = ((C1260v7) obj2).b;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator<T> it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.d(((InetAddress) it2.next()).getHostAddress(), bVar2.b.getHostAddress())) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                        if (obj2 != null) {
                            c0045a.c = null;
                            c0045a.e = null;
                            c0045a.f = null;
                            c0045a.b = 2;
                        }
                        return Unit.a;
                    }
                }
                c0045a = new C0045a(continuation);
                Object obj32 = c0045a.a;
                nm6 nm6Var2 = nm6.a;
                i = c0045a.b;
                if (i != 0) {
                }
                List list22 = list;
                F4.b bVar22 = (F4.b) obj32;
                Timber.INSTANCE.tag(aVar.b.h).v("Searching google cast service [%s] among kinopoisk services [%s]", bVar22, CollectionsKt.X(list22, null, null, null, null, 63));
                it = list22.iterator();
                loop0: while (true) {
                    if (it.hasNext()) {
                    }
                }
                if (obj2 != null) {
                }
                return Unit.a;
            }
        }

        public e(d dVar, r rVar, String str) {
            this.a = dVar;
            this.b = rVar;
            this.c = str;
        }

        @Override // defpackage.pjc
        public final Object collect(rjc rjcVar, Continuation continuation) {
            Object collect = this.a.collect(new a(rjcVar, this.b, this.c), continuation);
            return collect == nm6.a ? collect : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1278x(r rVar, String str, Continuation<? super C1278x> continuation) {
        super(2, continuation);
        this.c = rVar;
        this.d = str;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1278x c1278x = new C1278x(this.c, this.d, continuation);
        c1278x.b = obj;
        return c1278x;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1278x) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            eno enoVar = new eno(new a((mm6) this.b, null));
            r rVar = this.c;
            clc z0 = zsd.z0(new e(new d(enoVar, rVar), rVar, this.d), Long.MAX_VALUE, new c(rVar, null));
            this.a = 1;
            obj = zsd.i0(z0, this);
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
        C1260v7 c1260v7 = (C1260v7) obj;
        if (c1260v7 != null) {
            return c1260v7.a;
        }
        return null;
    }
}
