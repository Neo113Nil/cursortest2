package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aur;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.f9h;
import defpackage.fkn;
import defpackage.l1j;
import defpackage.lbq;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.t7l;
import defpackage.v75;
import defpackage.vdr;
import defpackage.we7;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1308z3;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class O7 implements B3 {
    public static final /* synthetic */ int e = 0;

    @NotNull
    public final C1308z3 a;

    @NotNull
    public final mm6 b;

    @NotNull
    public final xpi c;

    @NotNull
    public final vdr d;

    @we7(c = "ru.kinopoisk.remoteconfig.exps.RemoteConfigExperimentsProviderImpl$4$1", f = "RemoteConfigExperimentsProviderImpl.kt", l = {40}, m = "invokeSuspend")
    public static final class a extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return O7.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return O7.this.new a((Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                xpi xpiVar = O7.this.c;
                Unit unit = Unit.a;
                this.a = 1;
                if (xpiVar.emit(unit, this) == nm6Var) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/O7$b;", "", "", "TAG", "Ljava/lang/String;", "android_config_remoteconfig_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class c implements pjc {
        public final /* synthetic */ xpi a;
        public final /* synthetic */ O7 b;

        public static final class a<T> implements rjc {
            public final /* synthetic */ rjc a;
            public final /* synthetic */ O7 b;

            @we7(c = "ru.kinopoisk.remoteconfig.exps.RemoteConfigExperimentsProviderImpl$special$$inlined$map$1$2", f = "RemoteConfigExperimentsProviderImpl.kt", l = {50}, m = "emit")
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.O7$c$a$a, reason: collision with other inner class name */
            public static final class C0034a extends cg6 {
                public /* synthetic */ Object a;
                public int b;

                public C0034a(Continuation continuation) {
                    super(continuation);
                }

                @Override // defpackage.kq2
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(rjc rjcVar, O7 o7) {
                this.a = rjcVar;
                this.b = o7;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // defpackage.rjc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0034a c0034a;
                int i;
                if (continuation instanceof C0034a) {
                    c0034a = (C0034a) continuation;
                    int i2 = c0034a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0034a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0034a.a;
                        nm6 nm6Var = nm6.a;
                        i = c0034a.b;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar = this.a;
                            O7 o7 = this.b;
                            int i3 = O7.e;
                            ArrayList b = o7.b();
                            c0034a.b = 1;
                            if (rjcVar.emit(b, c0034a) == nm6Var) {
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
                c0034a = new C0034a(continuation);
                Object obj22 = c0034a.a;
                nm6 nm6Var2 = nm6.a;
                i = c0034a.b;
                if (i != 0) {
                }
                return Unit.a;
            }
        }

        public c(xpi xpiVar, O7 o7) {
            this.a = xpiVar;
            this.b = o7;
        }

        @Override // defpackage.pjc
        public final Object collect(rjc rjcVar, Continuation continuation) {
            Object collect = this.a.collect(new a(rjcVar, this.b), continuation);
            return collect == nm6.a ? collect : Unit.a;
        }
    }

    public static final class d implements pjc {
        public final /* synthetic */ vdr a;

        public static final class a<T> implements rjc {
            public final /* synthetic */ rjc a;

            @we7(c = "ru.kinopoisk.remoteconfig.exps.RemoteConfigExperimentsProviderImpl$special$$inlined$map$2$2", f = "RemoteConfigExperimentsProviderImpl.kt", l = {50}, m = "emit")
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.O7$d$a$a, reason: collision with other inner class name */
            public static final class C0035a extends cg6 {
                public /* synthetic */ Object a;
                public int b;

                public C0035a(Continuation continuation) {
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
                C0035a c0035a;
                int i;
                if (continuation instanceof C0035a) {
                    c0035a = (C0035a) continuation;
                    int i2 = c0035a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0035a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0035a.a;
                        nm6 nm6Var = nm6.a;
                        i = c0035a.b;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar = this.a;
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(v75.o(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new Integer(((C1295y3) it.next()).b));
                            }
                            c0035a.b = 1;
                            if (rjcVar.emit(arrayList, c0035a) == nm6Var) {
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
                c0035a = new C0035a(continuation);
                Object obj22 = c0035a.a;
                nm6 nm6Var2 = nm6.a;
                i = c0035a.b;
                if (i != 0) {
                }
                return Unit.a;
            }
        }

        public d(vdr vdrVar) {
            this.a = vdrVar;
        }

        @Override // defpackage.pjc
        public final Object collect(rjc rjcVar, Continuation continuation) {
            Object collect = this.a.collect(new a(rjcVar), continuation);
            return collect == nm6.a ? collect : Unit.a;
        }
    }

    static {
        new b(null);
    }

    public O7(@NotNull C1308z3 c1308z3, @NotNull J1 j1, @NotNull Q2 q2) {
        c1308z3.getClass();
        j1.getClass();
        q2.getClass();
        this.a = c1308z3;
        mm6 a2 = S2.a(q2, "RemoteConfigExperimentsProviderImpl");
        this.b = a2;
        x0q b2 = y0q.b(0, 0, null, 7);
        this.c = b2;
        ArrayList b3 = b();
        c cVar = new c(b2, this);
        t7l t7lVar = lbq.a;
        fkn F0 = zsd.F0(cVar, a2, t7lVar, b3);
        this.d = F0;
        d dVar = new d(F0);
        ArrayList arrayList = new ArrayList(v75.o(b3, 10));
        Iterator it = b3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C1295y3) it.next()).b));
        }
        zsd.F0(dVar, a2, t7lVar, arrayList);
        j1.a.add(new l1j(7));
    }

    public static final void a(O7 o7) {
        x97.y(o7.b, null, null, o7.new a(null), 3);
    }

    public final ArrayList b() {
        Map map;
        String obj;
        C1308z3.b a2;
        Pair pair;
        Map map2;
        C1308z3 c1308z3 = this.a;
        c1308z3.getClass();
        try {
            Map<String, ?> all = c1308z3.a.getAll();
            try {
                Map<String, ?> all2 = c1308z3.b.getAll();
                f9h f9hVar = new f9h();
                all.getClass();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    Integer num = value instanceof Integer ? (Integer) value : null;
                    if (num != null) {
                        key.getClass();
                        f9hVar.put(key, new Pair(num, new LinkedHashMap()));
                    }
                }
                map = f9hVar.b();
                all2.getClass();
                for (Map.Entry<String, ?> entry2 : all2.entrySet()) {
                    String key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (value2 != null && (obj = value2.toString()) != null && (a2 = c1308z3.a(obj)) != null && (pair = (Pair) map.get(a2.a)) != null && (map2 = (Map) pair.b) != null) {
                        key2.getClass();
                    }
                }
            } catch (Throwable th) {
                Timber.INSTANCE.tag("ExpsCacheStorage").e(th, "Failed to get all config preferences", new Object[0]);
                map = e5b.a;
                map.getClass();
            }
        } catch (Throwable th2) {
            Timber.INSTANCE.tag("ExpsCacheStorage").e(th2, "Failed to get all meta preferences", new Object[0]);
            map = e5b.a;
            map.getClass();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry3 : map.entrySet()) {
            Pair pair2 = (Pair) entry3.getValue();
            arrayList.add(new C1295y3((String) entry3.getKey(), ((Number) pair2.a).intValue(), (Map) pair2.b));
        }
        Timber.INSTANCE.tag("RemoteConfigExperimentsProviderImpl").d("Experiments: %s", arrayList);
        return arrayList;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.B3
    @NotNull
    public final vdr a() {
        return this.d;
    }
}
