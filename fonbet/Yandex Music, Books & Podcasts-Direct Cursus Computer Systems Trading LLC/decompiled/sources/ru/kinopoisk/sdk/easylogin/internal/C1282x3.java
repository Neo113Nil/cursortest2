package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.a4g;
import defpackage.cg6;
import defpackage.gld;
import defpackage.lbq;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.tah;
import defpackage.v75;
import defpackage.vdr;
import defpackage.we7;
import defpackage.xq0;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.F1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1282x3 {

    @NotNull
    public final F1 a;

    @NotNull
    public final InterfaceC1294y2 b;

    @NotNull
    public final mm6 c;

    @NotNull
    public final ArrayList d;

    @NotNull
    public final vdr e;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x3$a */
    public static final class a implements pjc {
        public final /* synthetic */ vdr a;

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x3$a$a, reason: collision with other inner class name */
        public static final class C0046a<T> implements rjc {
            public final /* synthetic */ rjc a;

            @we7(c = "ru.kinopoisk.analytics.evgen.EvgenFeatureFlagsProvider$special$$inlined$filter$1$2", f = "EvgenFeatureFlagsProvider.kt", l = {50}, m = "emit")
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x3$a$a$a, reason: collision with other inner class name */
            public static final class C0047a extends cg6 {
                public /* synthetic */ Object a;
                public int b;

                public C0047a(Continuation continuation) {
                    super(continuation);
                }

                @Override // defpackage.kq2
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0046a.this.emit(null, this);
                }
            }

            public C0046a(rjc rjcVar) {
                this.a = rjcVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // defpackage.rjc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0047a c0047a;
                int i;
                if (continuation instanceof C0047a) {
                    c0047a = (C0047a) continuation;
                    int i2 = c0047a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0047a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0047a.a;
                        nm6 nm6Var = nm6.a;
                        i = c0047a.b;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar = this.a;
                            if (((F1.a) obj) == F1.a.Snapshot) {
                                c0047a.b = 1;
                                if (rjcVar.emit(obj, c0047a) == nm6Var) {
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
                c0047a = new C0047a(continuation);
                Object obj22 = c0047a.a;
                nm6 nm6Var2 = nm6.a;
                i = c0047a.b;
                if (i != 0) {
                }
                return Unit.a;
            }
        }

        public a(vdr vdrVar) {
            this.a = vdrVar;
        }

        @Override // defpackage.pjc
        public final Object collect(rjc rjcVar, Continuation continuation) {
            Object collect = this.a.collect(new C0046a(rjcVar), continuation);
            return collect == nm6.a ? collect : Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x3$b */
    public static final class b implements pjc {
        public final /* synthetic */ a a;
        public final /* synthetic */ C1282x3 b;

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x3$b$a */
        public static final class a<T> implements rjc {
            public final /* synthetic */ rjc a;
            public final /* synthetic */ C1282x3 b;

            @we7(c = "ru.kinopoisk.analytics.evgen.EvgenFeatureFlagsProvider$special$$inlined$map$1$2", f = "EvgenFeatureFlagsProvider.kt", l = {50}, m = "emit")
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.x3$b$a$a, reason: collision with other inner class name */
            public static final class C0048a extends cg6 {
                public /* synthetic */ Object a;
                public int b;

                public C0048a(Continuation continuation) {
                    super(continuation);
                }

                @Override // defpackage.kq2
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(rjc rjcVar, C1282x3 c1282x3) {
                this.a = rjcVar;
                this.b = c1282x3;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // defpackage.rjc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0048a c0048a;
                int i;
                if (continuation instanceof C0048a) {
                    c0048a = (C0048a) continuation;
                    int i2 = c0048a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0048a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0048a.a;
                        nm6 nm6Var = nm6.a;
                        i = c0048a.b;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar = this.a;
                            LinkedHashMap a = this.b.a();
                            c0048a.b = 1;
                            if (rjcVar.emit(a, c0048a) == nm6Var) {
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
                c0048a = new C0048a(continuation);
                Object obj22 = c0048a.a;
                nm6 nm6Var2 = nm6.a;
                i = c0048a.b;
                if (i != 0) {
                }
                return Unit.a;
            }
        }

        public b(a aVar, C1282x3 c1282x3) {
            this.a = aVar;
            this.b = c1282x3;
        }

        @Override // defpackage.pjc
        public final Object collect(rjc rjcVar, Continuation continuation) {
            Object collect = this.a.collect(new a(rjcVar, this.b), continuation);
            return collect == nm6.a ? collect : Unit.a;
        }
    }

    public C1282x3(@NotNull F1 f1, @NotNull InterfaceC1294y2 interfaceC1294y2, @NotNull E1 e1, @NotNull Q2 q2) {
        f1.getClass();
        interfaceC1294y2.getClass();
        e1.getClass();
        q2.getClass();
        this.a = f1;
        this.b = interfaceC1294y2;
        this.c = gld.e(kotlin.coroutines.e.c(a4g.n(), q2.c().plus(new C1187q2("EvgenFeatureFlagsProvider"))));
        Set<D1<?>> configDescriptors = e1.getConfigDescriptors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : configDescriptors) {
            if (obj instanceof C3) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
        this.e = zsd.F0(new b(new a(this.a.getStateFlow()), this), this.c, lbq.a, a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LinkedHashMap a() {
        F1 f1 = this.a;
        f1.getClass();
        F1.a aVar = (F1.a) f1.getStateFlow().getValue();
        aVar.getClass();
        boolean z = aVar == F1.a.Snapshot;
        ArrayList arrayList = this.d;
        int a2 = tah.a(v75.o(arrayList, 10));
        if (a2 < 16) {
            a2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3 c3 = (C3) it.next();
            String key = c3.getKey();
            Boolean bool = (Boolean) (z ? this.a.getValue(c3) : this.b.a(c3)).a;
            bool.getClass();
            linkedHashMap.put(key, bool);
        }
        return linkedHashMap;
    }
}
