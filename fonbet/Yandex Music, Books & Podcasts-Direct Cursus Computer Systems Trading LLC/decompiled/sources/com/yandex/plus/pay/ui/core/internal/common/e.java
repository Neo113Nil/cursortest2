package com.yandex.plus.pay.ui.core.internal.common;

import com.yandex.plus.pay.internal.g;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ou7;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends aur implements Function2 {
    public ou7 j;
    public String k;
    public long l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ long p;
    public final /* synthetic */ f q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j, f fVar, Continuation continuation) {
        super(2, continuation);
        this.p = j;
        this.q = fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.p, this.q, continuation);
        eVar.o = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008a  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        ou7 ou7Var;
        String str;
        int i;
        mm6 mm6Var = (mm6) this.o;
        nm6 nm6Var = nm6.a;
        int i2 = this.n;
        f fVar = this.q;
        if (i2 == 0) {
            qgg.h0(obj);
            ou7 p = x97.p(mm6Var, null, null, new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(fVar, null, 2), 3);
            ou7 p2 = x97.p(mm6Var, null, null, new com.yandex.plus.home.feature.webviews.internal.treasury.d(fVar, null, 15), 3);
            this.o = null;
            this.j = p;
            j = this.p;
            this.l = j;
            this.n = 1;
            Object s = p2.s(this);
            if (s != nm6Var) {
                ou7Var = p;
                obj = s;
            }
            return nm6Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.m;
            long j2 = this.l;
            String str2 = this.k;
            qgg.h0(obj);
            j = j2;
            str = str2;
            return new com.yandex.plus.pay.ui.core.api.common.b(j, str, (String) obj, i == 0);
        }
        j = this.l;
        ou7Var = this.j;
        qgg.h0(obj);
        String str3 = (String) obj;
        int i3 = ((g) fVar.c).e() == com.yandex.plus.core.user.a.b ? 1 : 0;
        this.o = null;
        this.j = null;
        this.k = str3;
        this.l = j;
        this.m = i3;
        this.n = 2;
        Object H = ou7Var.H(this);
        if (H != nm6Var) {
            str = str3;
            obj = H;
            i = i3;
            return new com.yandex.plus.pay.ui.core.api.common.b(j, str, (String) obj, i == 0);
        }
        return nm6Var;
    }
}
