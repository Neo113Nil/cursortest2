package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import defpackage.ez40;
import defpackage.kme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpg;
import defpackage.tpr0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmme0;", "<anonymous>", "(Ltse;)Lmme0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1", f = "SharedPreferencesPlugin.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SharedPreferencesPlugin$clear$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $allowList;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", "preferences", "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<String> $allowList;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, Continuation continuation) {
            super(2, continuation);
            this.$allowList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ez40) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ez40 ez40Var = (ez40) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            List<String> list = this.$allowList;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ez40Var.f(new kme0((String) it.next()));
                }
            } else {
                ez40Var.e();
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$clear$1(g gVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$allowList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPreferencesPlugin$clear$1(this.this$0, this.$allowList, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPreferencesPlugin$clear$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Context context = this.this$0.a;
        if (context == null) {
            context = null;
        }
        tpg a = tpr0.a(context);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, null);
        this.label = 1;
        Object a2 = androidx.datastore.preferences.core.b.a(a, anonymousClass1, this);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }
}
