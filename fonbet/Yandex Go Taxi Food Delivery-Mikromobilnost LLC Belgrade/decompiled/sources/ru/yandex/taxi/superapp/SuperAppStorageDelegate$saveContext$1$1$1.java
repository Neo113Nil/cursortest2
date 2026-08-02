package ru.yandex.taxi.superapp;

import android.util.Base64;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qy80;
import defpackage.ryq0;
import defpackage.tse;
import defpackage.uza;
import defpackage.wls;
import defpackage.ydz0;
import defpackage.yp6;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppStorageDelegate$saveContext$1$1$1", f = "SuperAppStorageDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppStorageDelegate$saveContext$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ryq0 $data;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppStorageDelegate$saveContext$1$1$1(q qVar, ryq0 ryq0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$data = ryq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppStorageDelegate$saveContext$1$1$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppStorageDelegate$saveContext$1$1$1 superAppStorageDelegate$saveContext$1$1$1 = (SuperAppStorageDelegate$saveContext$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppStorageDelegate$saveContext$1$1$1.invokeSuspend(zy11Var);
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
        p pVar = this.this$0.a;
        ryq0 ryq0Var = this.$data;
        String str = ryq0Var.a;
        String str2 = ryq0Var.b;
        synchronized (pVar) {
            try {
                if (!evu0.J(str)) {
                    pVar.a.getClass();
                    File file = new File(pVar.b, Base64.encodeToString(str.getBytes(uza.a), 2).replace('=', '_'));
                    if (str2 != null && str2.length() != 0) {
                        if (!pVar.b.exists() && !pVar.b.mkdirs()) {
                            throw new RuntimeException("Could not create directory for superapp storage");
                        }
                        qy80 qy80Var = new qy80(new FileOutputStream(file, false), new ydz0());
                        try {
                            yp6 yp6Var = new yp6();
                            yp6Var.v0(str2, 0, str2.length(), Charset.defaultCharset());
                            long a = yp6Var.a();
                            if (a > 0) {
                                qy80Var.write(yp6Var, a);
                            }
                            long j = yp6Var.b;
                            if (j > 0) {
                                qy80Var.write(yp6Var, j);
                            }
                            qy80Var.flush();
                            qy80Var.close();
                            pVar.c.d(str, str2);
                        } finally {
                        }
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zy11.a;
    }
}
