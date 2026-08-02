package com.yandex.plus.pay.internal.feature.user.listener;

import com.yandex.plus.core.analytics.metrica.h;
import com.yandex.plus.metrica.utils.j;
import com.yandex.plus.metrica.utils.x;
import com.yandex.plus.metrica.utils.z;
import defpackage.b6e;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class b implements c {
    public final /* synthetic */ int a = 2;
    public final Object b;

    public b(z zVar) {
        zVar.getClass();
        this.b = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c0 -> B:38:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(mm6 mm6Var, com.yandex.plus.domain.auth.api.e eVar, Continuation continuation) {
        a aVar;
        int i;
        int i2;
        c[] cVarArr;
        com.yandex.plus.domain.auth.api.e eVar2;
        mm6 mm6Var2;
        int i3;
        int i4;
        d dVar;
        int i5;
        switch (this.a) {
            case 0:
                if (continuation instanceof a) {
                    aVar = (a) continuation;
                    int i6 = aVar.r;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        aVar.r = i6 - Integer.MIN_VALUE;
                        Object obj = aVar.p;
                        nm6 nm6Var = nm6.a;
                        i = aVar.r;
                        if (i != 0) {
                            qgg.h0(obj);
                            c[] cVarArr2 = (c[]) this.b;
                            int length = cVarArr2.length;
                            i2 = 0;
                            cVarArr = cVarArr2;
                            eVar2 = eVar;
                            mm6Var2 = mm6Var;
                            i3 = length;
                            i4 = 0;
                            if (i2 < i3) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            i3 = aVar.o;
                            int i7 = aVar.n;
                            i4 = aVar.m;
                            c[] cVarArr3 = (c[]) aVar.l;
                            com.yandex.plus.domain.auth.api.e eVar3 = aVar.k;
                            mm6 mm6Var3 = aVar.j;
                            qgg.h0(obj);
                            eVar2 = eVar3;
                            cVarArr = cVarArr3;
                            i2 = i7 + 1;
                            mm6Var2 = mm6Var3;
                            if (i2 < i3) {
                                c cVar = cVarArr[i2];
                                aVar.j = mm6Var2;
                                aVar.k = eVar2;
                                aVar.l = cVarArr;
                                aVar.m = i4;
                                aVar.n = i2;
                                aVar.o = i3;
                                aVar.r = 1;
                                if (cVar.invoke(mm6Var2, eVar2, aVar) != nm6Var) {
                                    mm6Var3 = mm6Var2;
                                    i7 = i2;
                                    i2 = i7 + 1;
                                    mm6Var2 = mm6Var3;
                                    if (i2 < i3) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                aVar = new a(this, continuation);
                Object obj2 = aVar.p;
                nm6 nm6Var2 = nm6.a;
                i = aVar.r;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof d) {
                    dVar = (d) continuation;
                    int i8 = dVar.l;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        dVar.l = i8 - Integer.MIN_VALUE;
                        Object obj3 = dVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i5 = dVar.l;
                        if (i5 != 0) {
                            qgg.h0(obj3);
                            if (!(eVar instanceof com.yandex.plus.domain.auth.api.b) && !(eVar instanceof com.yandex.plus.domain.auth.api.a) && !(eVar instanceof com.yandex.plus.domain.auth.api.d)) {
                                if (!(eVar instanceof com.yandex.plus.domain.auth.api.c)) {
                                    b6e.s();
                                    break;
                                }
                            } else {
                                com.yandex.plus.pay.internal.feature.cache.b bVar = (com.yandex.plus.pay.internal.feature.cache.b) this.b;
                                dVar.l = 1;
                                if (bVar.a(dVar) == nm6Var3) {
                                }
                            }
                        } else if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                    }
                }
                dVar = new d(this, continuation);
                Object obj32 = dVar.j;
                nm6 nm6Var32 = nm6.a;
                i5 = dVar.l;
                if (i5 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return a((mm6) obj, (com.yandex.plus.domain.auth.api.e) obj2, (Continuation) obj3);
            case 1:
                return a((mm6) obj, (com.yandex.plus.domain.auth.api.e) obj2, (Continuation) obj3);
            default:
                com.yandex.plus.domain.auth.api.e eVar = (com.yandex.plus.domain.auth.api.e) obj2;
                h k = ((x) ((z) this.b)).k();
                if ((eVar instanceof com.yandex.plus.domain.auth.api.c) || (eVar instanceof com.yandex.plus.domain.auth.api.b)) {
                    if (k != null) {
                        String valueOf = String.valueOf(eVar.getId());
                        IReporterYandex iReporterYandex = k.b;
                        iReporterYandex.reportUserInfoEvent(new UserInfo(valueOf));
                        iReporterYandex.setUserProfileID(valueOf);
                        ((j) k.a).a(valueOf);
                    }
                } else {
                    if (!(eVar instanceof com.yandex.plus.domain.auth.api.a) && !(eVar instanceof com.yandex.plus.domain.auth.api.d)) {
                        b6e.s();
                        return null;
                    }
                    if (k != null) {
                        IReporterYandex iReporterYandex2 = k.b;
                        iReporterYandex2.reportUserInfoEvent(new UserInfo(null));
                        iReporterYandex2.setUserProfileID(null);
                        ((j) k.a).a(null);
                    }
                }
                return Unit.a;
        }
    }

    public b(c[] cVarArr) {
        this.b = cVarArr;
    }

    public b(com.yandex.plus.pay.internal.feature.cache.b bVar) {
        bVar.getClass();
        this.b = bVar;
    }
}
