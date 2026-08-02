package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class fmk extends aur implements Function2 {
    public final /* synthetic */ xxq j;
    public final /* synthetic */ String k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmk(xxq xxqVar, String str, Context context, long j, Continuation continuation) {
        super(2, continuation);
        this.j = xxqVar;
        this.k = str;
        this.l = context;
        this.m = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new fmk(this.j, this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fmk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        String n = ouj.n(this.j.a, this.k);
        SharedPreferences sharedPreferences = this.l.getSharedPreferences("PersistentTimedChecker", 0);
        if (System.currentTimeMillis() - sharedPreferences.getLong(n, 0L) <= this.m) {
            return Boolean.FALSE;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(n, System.currentTimeMillis());
        edit.apply();
        return Boolean.TRUE;
    }
}
