package ru.yandex.taxi.location.zerokm.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import defpackage.dxt0;
import defpackage.gc61;
import defpackage.h6u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.location.zerokm.datasource.ZeroKmDbSource$save$2", f = "ZeroKmDbSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ZeroKmDbSource$save$2 extends SuspendLambda implements wls {
    final /* synthetic */ Iterable<gc61> $zeroKilometers;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroKmDbSource$save$2(a aVar, Iterable iterable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$zeroKilometers = iterable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZeroKmDbSource$save$2(this.this$0, this.$zeroKilometers, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ZeroKmDbSource$save$2 zeroKmDbSource$save$2 = (ZeroKmDbSource$save$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        zeroKmDbSource$save$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        dxt0 dxt0Var = aVar.c;
        Context context = aVar.a;
        Uri uri = aVar.d;
        dxt0Var.getClass();
        h6u0.h(context, uri, null, null);
        a aVar2 = this.this$0;
        Iterable<gc61> iterable = this.$zeroKilometers;
        aVar2.getClass();
        for (gc61 gc61Var : iterable) {
            if (gc61Var != null) {
                String str = gc61Var.a;
                dxt0 dxt0Var2 = aVar2.c;
                Context context2 = aVar2.a;
                Uri uri2 = aVar2.d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("mcc", str);
                contentValues.put("lon", Double.valueOf(gc61Var.b));
                contentValues.put("lat", Double.valueOf(gc61Var.c));
                String format = String.format("%1$s = %2$s", Arrays.copyOf(new Object[]{"mcc", str}, 2));
                dxt0Var2.getClass();
                h6u0.m(context2, uri2, contentValues, format, null);
            }
        }
        return zy11.a;
    }
}
