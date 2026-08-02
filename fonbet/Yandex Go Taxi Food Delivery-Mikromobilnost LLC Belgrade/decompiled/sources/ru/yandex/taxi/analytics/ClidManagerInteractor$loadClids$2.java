package ru.yandex.taxi.analytics;

import android.content.Context;
import defpackage.evu0;
import defpackage.g2c;
import defpackage.gw00;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qx11;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidManager;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.ClidManagerInteractor$loadClids$2", f = "ClidManagerInteractor.kt", l = {13}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ClidManagerInteractor$loadClids$2 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $clidTypes;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ g2c this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.analytics.ClidManagerInteractor$loadClids$2$1", f = "ClidManagerInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.analytics.ClidManagerInteractor$loadClids$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Set<String> $clidTypes;
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ g2c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Set set, g2c g2cVar, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
            this.$clidTypes = set;
            this.this$0 = g2cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$context, this.$clidTypes, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            ClidManager clidManager = ClidManager.getInstance();
            String packageName = this.$context.getPackageName();
            try {
                clidManager.initContext(this.$context);
                clidManager.registerManifestClids(packageName);
                Set<String> set = this.$clidTypes;
                g2c g2cVar = this.this$0;
                int d = gw00.d(tcc.n(set, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (Object obj2 : set) {
                    String str2 = (String) obj2;
                    g2cVar.getClass();
                    String str3 = "";
                    try {
                        str = clidManager.getClid(packageName, str2);
                    } catch (AssertionError unused) {
                        jst.e.getClass();
                        str = "";
                    }
                    if (!"${clid.number}".equals(str)) {
                        str3 = str;
                    }
                    if (evu0.J(str3)) {
                        str3 = "0";
                    }
                    linkedHashMap.put(obj2, str3);
                }
                return linkedHashMap;
            } catch (Exception e) {
                jst.e.k(e, "Failed to initialize ClidManager");
                return kotlin.collections.b.f();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClidManagerInteractor$loadClids$2(Context context, Set set, g2c g2cVar, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
        this.$clidTypes = set;
        this.this$0 = g2cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClidManagerInteractor$loadClids$2(this.$context, this.$clidTypes, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClidManagerInteractor$loadClids$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        qx11 qx11Var = uyj.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$clidTypes, this.this$0, null);
        this.label = 1;
        Object k0 = tje.k0(qx11Var, anonymousClass1, this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
