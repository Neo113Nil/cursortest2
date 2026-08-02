package ru.yandex.taxi.superapp;

import android.util.Base64;
import defpackage.ck7;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uza;
import defpackage.v0w;
import defpackage.wls;
import defpackage.ydz0;
import defpackage.yp6;
import defpackage.zy11;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lck7;", "", "<anonymous>", "(Ltse;)Lck7;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppStorageDelegate$getContext$1$1$result$1", f = "SuperAppStorageDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppStorageDelegate$getContext$1$1$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppStorageDelegate$getContext$1$1$result$1(q qVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppStorageDelegate$getContext$1$1$result$1(this.this$0, this.$key, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppStorageDelegate$getContext$1$1$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p pVar = this.this$0.a;
        String str2 = this.$key;
        synchronized (pVar) {
            if (!evu0.J(str2)) {
                str = (String) pVar.c.c(str2);
                if (str == null) {
                    pVar.a.getClass();
                    File file = new File(pVar.b, Base64.encodeToString(str2.getBytes(uza.a), 2).replace('=', '_'));
                    if (file.exists()) {
                        v0w v0wVar = new v0w(new FileInputStream(file), ydz0.d);
                        try {
                            yp6 yp6Var = new yp6();
                            Charset defaultCharset = Charset.defaultCharset();
                            yp6Var.N1(v0wVar);
                            str = yp6Var.T(yp6Var.b, defaultCharset);
                            v0wVar.close();
                        } finally {
                        }
                    }
                }
            }
            str = null;
        }
        return new ck7(str, null);
    }
}
