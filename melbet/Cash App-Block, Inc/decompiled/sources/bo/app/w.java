package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import coil3.size.DimensionKt;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class w extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ com.braze.storage.a c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.braze.storage.a aVar, ArrayList arrayList, long j, Continuation continuation) {
        super(2, continuation);
        this.c = aVar;
        this.d = arrayList;
        this.e = j;
    }

    public static final String a() {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to update last request time per placement for key: ", DataStoreKey.BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT.getKey());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        w wVar = new w(this.c, this.d, this.e, continuation);
        wVar.b = obj;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            DataStore dataStore = this.c.getDataStore();
            v vVar = new v(this.d, this.e, null);
            this.b = coroutineScope;
            this.a = 1;
            Object edit = DimensionKt.edit(dataStore, vVar, this);
            return edit == coroutineSingletons ? coroutineSingletons : edit;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(0), 4, (Object) null);
            return Unit.INSTANCE;
        }
    }
}
