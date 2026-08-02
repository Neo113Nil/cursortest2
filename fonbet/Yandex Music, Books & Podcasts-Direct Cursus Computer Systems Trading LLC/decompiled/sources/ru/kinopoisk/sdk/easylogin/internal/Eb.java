package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.H3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public final class Eb implements pjc {
    public final /* synthetic */ pjc a;
    public final /* synthetic */ Gb b;

    public static final class a<T> implements rjc {
        public final /* synthetic */ rjc a;
        public final /* synthetic */ Gb b;

        @we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvSearchManager$search$$inlined$mapNotNull$1$2", f = "TvSearchManager.kt", l = {66}, m = "emit")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.Eb$a$a, reason: collision with other inner class name */
        public static final class C0024a extends cg6 {
            public /* synthetic */ Object a;
            public int b;

            public C0024a(Continuation continuation) {
                super(continuation);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(rjc rjcVar, Gb gb) {
            this.a = rjcVar;
            this.b = gb;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Type inference failed for: r12v0, types: [ru.kinopoisk.sdk.easylogin.internal.H3$b] */
        /* JADX WARN: Type inference failed for: r13v0, types: [ru.kinopoisk.sdk.easylogin.internal.H3$c] */
        @Override // defpackage.rjc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C0024a c0024a;
            int i;
            if (continuation instanceof C0024a) {
                c0024a = (C0024a) continuation;
                int i2 = c0024a.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0024a.b = i2 - Integer.MIN_VALUE;
                    Object obj2 = c0024a.a;
                    nm6 nm6Var = nm6.a;
                    i = c0024a.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        rjc rjcVar = this.a;
                        List list = (List) obj;
                        list.getClass();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = list.iterator();
                        while (true) {
                            H3.a aVar = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            InterfaceC1305z0.a aVar2 = (InterfaceC1305z0.a) it.next();
                            this.b.getClass();
                            int ordinal = aVar2.c.ordinal();
                            if (ordinal == 1) {
                                aVar = new H3.a(aVar2.a, null, aVar2.b, aVar2.f, false, 16, null);
                            } else if (ordinal == 2) {
                                aVar = new H3.c(aVar2.a, aVar2.b, aVar2.f, false, 8, null);
                            } else if (ordinal == 3) {
                                aVar = new H3.b(aVar2.a, aVar2.b, aVar2.f, false, 8, null);
                            } else if (ordinal == 4) {
                                aVar = new H3.a(null, aVar2.a, aVar2.b, aVar2.f, false, 16, null);
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            c0024a.b = 1;
                            if (rjcVar.emit(arrayList, c0024a) == nm6Var) {
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
            c0024a = new C0024a(continuation);
            Object obj22 = c0024a.a;
            nm6 nm6Var2 = nm6.a;
            i = c0024a.b;
            if (i != 0) {
            }
            return Unit.a;
        }
    }

    public Eb(pjc pjcVar, Gb gb) {
        this.a = pjcVar;
        this.b = gb;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new a(rjcVar, this.b), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
