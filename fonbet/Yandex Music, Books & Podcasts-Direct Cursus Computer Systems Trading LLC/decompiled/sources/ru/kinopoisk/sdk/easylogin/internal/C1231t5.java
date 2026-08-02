package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.v75;
import defpackage.we7;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import ru.kinopoisk.sdk.easylogin.internal.C1106k5;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1233t7;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.t5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1231t5 implements pjc {
    public final /* synthetic */ pjc a;
    public final /* synthetic */ C1106k5 b;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.t5$a */
    public static final class a<T> implements rjc {
        public final /* synthetic */ rjc a;
        public final /* synthetic */ C1106k5 b;

        @we7(c = "ru.kinopoisk.cast.kinopoisk.internal.KinopoiskCastDeviceManager$special$$inlined$map$1$2", f = "KinopoiskCastDeviceManager.kt", l = {50}, m = "emit")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.t5$a$a, reason: collision with other inner class name */
        public static final class C0043a extends cg6 {
            public /* synthetic */ Object a;
            public int b;

            public C0043a(Continuation continuation) {
                super(continuation);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(rjc rjcVar, C1106k5 c1106k5) {
            this.a = rjcVar;
            this.b = c1106k5;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // defpackage.rjc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C0043a c0043a;
            int i;
            InterfaceC1305z0.b bVar;
            if (continuation instanceof C0043a) {
                c0043a = (C0043a) continuation;
                int i2 = c0043a.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0043a.b = i2 - Integer.MIN_VALUE;
                    Object obj2 = c0043a.a;
                    nm6 nm6Var = nm6.a;
                    i = c0043a.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        rjc rjcVar = this.a;
                        List<C1164o7> list = (List) obj;
                        Timber.INSTANCE.d("KinopoiskCastDeviceManager", "map items to castDeviceInfo");
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        for (C1164o7 c1164o7 : list) {
                            C1106k5 c1106k5 = this.b;
                            C1106k5.a aVar = C1106k5.e;
                            c1106k5.getClass();
                            String str = c1164o7.a;
                            String str2 = c1164o7.b;
                            if (StringsKt.U(str2)) {
                                str2 = c1164o7.d;
                            }
                            String str3 = str2;
                            InterfaceC1305z0.c cVar = InterfaceC1305z0.c.KinopoiskCast;
                            C1106k5.a aVar2 = C1106k5.e;
                            InterfaceC1233t7 interfaceC1233t7 = c1164o7.e;
                            aVar2.getClass();
                            if (interfaceC1233t7 instanceof InterfaceC1233t7.a) {
                                bVar = InterfaceC1305z0.b.AndroidTv;
                            } else if (interfaceC1233t7 instanceof InterfaceC1233t7.b) {
                                bVar = InterfaceC1305z0.b.AppleTv;
                            } else {
                                if (!(interfaceC1233t7 instanceof InterfaceC1233t7.c)) {
                                    b6e.s();
                                    return null;
                                }
                                bVar = InterfaceC1305z0.b.Unknown;
                            }
                            arrayList.add(new InterfaceC1305z0.a(str, str3, cVar, bVar, InterfaceC1305z0.d.Disconnected, c1164o7.d));
                        }
                        c0043a.b = 1;
                        if (rjcVar.emit(arrayList, c0043a) == nm6Var) {
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
            c0043a = new C0043a(continuation);
            Object obj22 = c0043a.a;
            nm6 nm6Var2 = nm6.a;
            i = c0043a.b;
            if (i != 0) {
            }
            return Unit.a;
        }
    }

    public C1231t5(pjc pjcVar, C1106k5 c1106k5) {
        this.a = pjcVar;
        this.b = c1106k5;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new a(rjcVar, this.b), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
