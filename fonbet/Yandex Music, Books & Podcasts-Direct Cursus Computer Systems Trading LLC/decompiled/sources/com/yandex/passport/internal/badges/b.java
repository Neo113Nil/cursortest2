package com.yandex.passport.internal.badges;

import android.content.SharedPreferences;
import com.yandex.passport.internal.report.f2;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.k2;
import com.yandex.passport.internal.report.reporters.k;
import com.yandex.passport.internal.report.ue;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.zac;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = cVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b(this.k, continuation, 0);
            case 1:
                return new b(this.k, continuation, 1);
            default:
                return new b(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        boolean z = false;
        c cVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                try {
                    return zac.d(cVar.e);
                } catch (Exception e) {
                    k kVar = cVar.c;
                    kVar.getClass();
                    kVar.n(k2.d, new ff(e), new ue(e));
                    return null;
                }
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (cVar.e.exists()) {
                    long j = cVar.d.getLong("last_update", 0L);
                    cVar.b.getClass();
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis >= 0 && currentTimeMillis < 86400000) {
                        z = true;
                    }
                }
                if (!z) {
                    k kVar2 = cVar.c;
                    kVar2.getClass();
                    kVar2.p(f2.d);
                }
                return Boolean.valueOf(z);
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                try {
                    SharedPreferences sharedPreferences = cVar.d;
                    sharedPreferences.getClass();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("last_update");
                    edit.commit();
                    cVar.e.delete();
                } catch (Exception unused) {
                }
                return Unit.a;
        }
    }
}
