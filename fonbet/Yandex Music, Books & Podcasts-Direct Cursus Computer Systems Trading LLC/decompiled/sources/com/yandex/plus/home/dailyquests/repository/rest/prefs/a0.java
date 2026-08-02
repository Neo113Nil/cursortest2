package com.yandex.plus.home.dailyquests.repository.rest.prefs;

import android.content.SharedPreferences;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ d0 k;
    public final /* synthetic */ Long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(d0 d0Var, Long l, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = d0Var;
        this.l = l;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a0(this.k, this.l, continuation, 0);
            default:
                return new a0(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((a0) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Long l = this.l;
        d0 d0Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                SharedPreferences sharedPreferences = d0Var.c;
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(d0.a(d0Var, l));
                edit.commit();
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return d0Var.c.getString(d0.a(d0Var, l), null);
        }
    }
}
