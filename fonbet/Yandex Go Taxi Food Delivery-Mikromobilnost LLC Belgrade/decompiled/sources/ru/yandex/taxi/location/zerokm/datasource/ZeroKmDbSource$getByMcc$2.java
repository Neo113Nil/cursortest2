package ru.yandex.taxi.location.zerokm.datasource;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import defpackage.dxt0;
import defpackage.gc61;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgc61;", "<anonymous>", "(Ltse;)Lgc61;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.location.zerokm.datasource.ZeroKmDbSource$getByMcc$2", f = "ZeroKmDbSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ZeroKmDbSource$getByMcc$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $mcc;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroKmDbSource$getByMcc$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mcc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZeroKmDbSource$getByMcc$2(this.this$0, this.$mcc, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZeroKmDbSource$getByMcc$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        gc61 gc61Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        dxt0 dxt0Var = aVar.c;
        Context context = aVar.a;
        Uri uri = aVar.d;
        String format = String.format("%1$s = %2$s", Arrays.copyOf(new Object[]{"mcc", this.$mcc}, 2));
        a aVar2 = this.this$0;
        dxt0Var.getClass();
        Cursor query = context.getContentResolver().query(uri.buildUpon().appendQueryParameter("limit", "1").build(), null, format, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    Cursor cursor = query;
                    aVar2.getClass();
                    gc61Var = new gc61(String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("mcc"))), cursor.getDouble(cursor.getColumnIndexOrThrow("lon")), cursor.getDouble(cursor.getColumnIndexOrThrow("lat")));
                }
            } finally {
                query.close();
            }
        }
        if (query != null) {
        }
        if (gc61Var != null) {
            return gc61Var;
        }
        throw new ZeroKmDbSource$NoSuchMccException(String.format("Such mcc = %s not found", Arrays.copyOf(new Object[]{this.$mcc}, 1)));
    }
}
