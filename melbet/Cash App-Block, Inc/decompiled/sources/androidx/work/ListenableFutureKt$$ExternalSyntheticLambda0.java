package androidx.work;

import android.content.SharedPreferences;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.datastore.core.DataStoreImpl$data$1;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final /* synthetic */ class ListenableFutureKt$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter$Resolver, SharedPreferencesKeyValue.Reader {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ListenableFutureKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        CoroutineContext coroutineContext = (CoroutineContext) this.f$0;
        CoroutineStart coroutineStart = (CoroutineStart) this.f$1;
        Function2 function2 = (Function2) this.f$2;
        callbackToFutureAdapter$Completer.addCancellationListener(new AFLogger$$ExternalSyntheticLambda0((Job) coroutineContext.get(Job.Key.$$INSTANCE), 9), DirectExecutor.INSTANCE);
        return JobKt.launch$default(JobKt.CoroutineScope(coroutineContext), null, coroutineStart, new DataStoreImpl$data$1(function2, callbackToFutureAdapter$Completer, (Continuation) null, 11), 1);
    }

    @Override // com.squareup.preferences.SharedPreferencesKeyValue.Reader
    public Object read(SharedPreferencesKeyValue sharedPreferencesKeyValue) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f$0;
        String str = (String) this.f$1;
        String str2 = (String) this.f$2;
        sharedPreferencesKeyValue.getClass();
        return sharedPreferences.getString(str, str2);
    }
}
