package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.gld;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ox6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rjc;
import defpackage.t7o;
import defpackage.tyf;
import defpackage.v75;
import defpackage.vjp;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "ru.kinopoisk.cast.samsung.smartview.SmartViewConnector$mapToSmartViewDevices$1", f = "SmartViewConnector.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class M8 extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List<vjp> c;
    public final /* synthetic */ K8 d;

    @we7(c = "ru.kinopoisk.cast.samsung.smartview.SmartViewConnector$mapToSmartViewDevices$1$1", f = "SmartViewConnector.kt", l = {150, 137}, m = "invokeSuspend")
    public static final class a extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ rjc c;
        public final /* synthetic */ List<vjp> d;
        public final /* synthetic */ K8 e;

        @we7(c = "ru.kinopoisk.cast.samsung.smartview.SmartViewConnector$mapToSmartViewDevices$1$1$1$1", f = "SmartViewConnector.kt", l = {140}, m = "invokeSuspend")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.M8$a$a, reason: collision with other inner class name */
        public static final class C0032a extends aur implements Function2<mm6, Continuation<? super N8>, Object> {
            public int a;
            public final /* synthetic */ K8 b;
            public final /* synthetic */ vjp c;

            @we7(c = "ru.kinopoisk.cast.samsung.smartview.SmartViewConnector$mapToSmartViewDevices$1$1$1$1$withTimeoutOrNull$1", f = "SmartViewConnector.kt", l = {142}, m = "invokeSuspend")
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.M8$a$a$a, reason: collision with other inner class name */
            public static final class C0033a extends aur implements Function2<mm6, Continuation<? super String>, Object> {
                public String a;
                public int b;
                public /* synthetic */ Object c;
                public final /* synthetic */ K8 d;
                public final /* synthetic */ vjp e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0033a(K8 k8, vjp vjpVar, Continuation<? super C0033a> continuation) {
                    super(2, continuation);
                    this.d = k8;
                    this.e = vjpVar;
                }

                @Override // defpackage.kq2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0033a c0033a = new C0033a(this.d, this.e, continuation);
                    c0033a.c = obj;
                    return c0033a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C0033a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
                @Override // defpackage.kq2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object t7oVar;
                    Object obj2;
                    Map map;
                    String str;
                    nm6 nm6Var = nm6.a;
                    int i = this.b;
                    try {
                    } catch (Throwable th) {
                        r7o r7oVar = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    if (i == 0) {
                        qgg.h0(obj);
                        K8 k8 = this.d;
                        vjp vjpVar = this.e;
                        r7o r7oVar2 = z7o.b;
                        ConcurrentHashMap concurrentHashMap = k8.f;
                        String str2 = vjpVar.a;
                        str2.getClass();
                        obj2 = concurrentHashMap.get(str2);
                        if (obj2 == null) {
                            O8 o8 = k8.a;
                            this.c = concurrentHashMap;
                            this.a = str2;
                            this.b = 1;
                            obj = o8.a(vjpVar, this);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            map = concurrentHashMap;
                            str = str2;
                        }
                        t7oVar = (String) obj2;
                        r7o r7oVar3 = z7o.b;
                        if (t7oVar instanceof t7o) {
                            return t7oVar;
                        }
                        return null;
                    }
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.a;
                    map = (Map) this.c;
                    qgg.h0(obj);
                    obj2 = (String) obj;
                    map.put(str, obj2);
                    t7oVar = (String) obj2;
                    r7o r7oVar32 = z7o.b;
                    if (t7oVar instanceof t7o) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0032a(K8 k8, vjp vjpVar, Continuation<? super C0032a> continuation) {
                super(2, continuation);
                this.b = k8;
                this.c = vjpVar;
            }

            @Override // defpackage.kq2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0032a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return new C0032a(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.a);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                nm6 nm6Var = nm6.a;
                int i = this.a;
                if (i == 0) {
                    qgg.h0(obj);
                    K8 k8 = this.b;
                    long j = k8.b.b;
                    C0033a c0033a = new C0033a(k8, this.c, null);
                    this.a = 1;
                    obj = tyf.M(j, c0033a, this);
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
                String str = (String) obj;
                vjp vjpVar = this.c;
                if (str == null) {
                    str = "Unknown";
                }
                return new N8(vjpVar, str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(rjc rjcVar, List<? extends vjp> list, K8 k8, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = rjcVar;
            this.d = list;
            this.e = k8;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, this.e, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (r11 == r0) goto L19;
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
                mm6 mm6Var = (mm6) this.b;
                rjcVar = this.c;
                List<vjp> list = this.d;
                K8 k8 = this.e;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(x97.p(mm6Var, null, null, new C0032a(k8, (vjp) it.next(), null), 3));
                }
                this.b = rjcVar;
                this.a = 1;
                obj = ox6.v(arrayList, this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rjcVar = (rjc) this.b;
                qgg.h0(obj);
            }
            this.b = null;
            this.a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M8(List<? extends vjp> list, K8 k8, Continuation<? super M8> continuation) {
        super(2, continuation);
        this.c = list;
        this.d = k8;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        M8 m8 = new M8(this.c, this.d, continuation);
        m8.b = obj;
        return m8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M8) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            a aVar = new a((rjc) this.b, this.c, this.d, null);
            this.a = 1;
            if (gld.Q(aVar, this) == nm6Var) {
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
