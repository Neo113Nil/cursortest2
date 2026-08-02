package androidx.glance.appwidget;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import androidx.datastore.core.DataStore;
import app.cash.badging.backend.RealBadger2$clear$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class MyPackageReplacedReceiver$onReceive$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MyPackageReplacedReceiver$onReceive$1(Context context, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new MyPackageReplacedReceiver$onReceive$1(this.$context, continuation, 0);
            default:
                return new MyPackageReplacedReceiver$onReceive$1(this.$context, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MyPackageReplacedReceiver$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Context context = this.$context;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GlanceAppWidgetManager glanceAppWidgetManager = new GlanceAppWidgetManager(context);
                    this.label = 1;
                    String packageName = context.getPackageName();
                    List<AppWidgetProviderInfo> installedProviders = glanceAppWidgetManager.appWidgetManager.getInstalledProviders();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : installedProviders) {
                        if (Intrinsics.areEqual(((AppWidgetProviderInfo) obj2).provider.getPackageName(), packageName)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
                    }
                    Object updateData = ((DataStore) glanceAppWidgetManager.dataStore$delegate.getValue()).updateData(new RealBadger2$clear$2(CollectionsKt.toSet(arrayList2), continuation, 16), this);
                    if (updateData != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        updateData = Unit.INSTANCE;
                    }
                    if (updateData == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                context.getClass();
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                Deferred sandboxedComponentExtFlow = ((CashApp) applicationContext).getSandboxedComponentExtFlow();
                this.label = 1;
                Object await = sandboxedComponentExtFlow.await(this);
                return await == coroutineSingletons2 ? coroutineSingletons2 : await;
        }
    }
}
