package com.squareup.cash.data;

import android.app.ActivityManager;
import android.app.Application;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.storage.ClearAppUserDataOnNextLaunch;
import com.squareup.cash.storage.RealAppDataWiper;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.worker.ApplicationWorker;
import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ClearAppUserDataApplicationWorker implements ApplicationWorker {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object clearAppUserDataOnNextLaunch;
    public final Application context;

    public ClearAppUserDataApplicationWorker(Application application, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.context = application;
        this.clearAppUserDataOnNextLaunch = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r2.set(r7, r0) == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (r8 == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    @Override // com.squareup.cash.worker.ApplicationWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object work(Continuation continuation) {
        ClearAppUserDataApplicationWorker$work$1 clearAppUserDataApplicationWorker$work$1;
        Object obj;
        int i;
        int i2 = this.$r8$classId;
        Continuation continuation2 = null;
        Object obj2 = this.clearAppUserDataOnNextLaunch;
        switch (i2) {
            case 0:
                SharedPreferencesKeyValue sharedPreferencesKeyValue = (SharedPreferencesKeyValue) obj2;
                if (continuation instanceof ClearAppUserDataApplicationWorker$work$1) {
                    clearAppUserDataApplicationWorker$work$1 = (ClearAppUserDataApplicationWorker$work$1) continuation;
                    int i3 = clearAppUserDataApplicationWorker$work$1.label;
                    if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                        clearAppUserDataApplicationWorker$work$1.label = i3 - PKIFailureInfo.systemUnavail;
                        obj = clearAppUserDataApplicationWorker$work$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = clearAppUserDataApplicationWorker$work$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            clearAppUserDataApplicationWorker$work$1.label = 1;
                            obj = sharedPreferencesKeyValue.get(clearAppUserDataApplicationWorker$work$1);
                            break;
                        } else if (i == 1) {
                            SafeTrace.throwOnFailure(obj);
                        } else if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                            break;
                        }
                        if (((ClearAppUserDataOnNextLaunch) obj).value) {
                            Object systemService = this.context.getSystemService("activity");
                            systemService.getClass();
                            if (!((ActivityManager) systemService).clearApplicationUserData()) {
                                ClearAppUserDataOnNextLaunch clearAppUserDataOnNextLaunch = new ClearAppUserDataOnNextLaunch(false);
                                clearAppUserDataApplicationWorker$work$1.label = 2;
                                break;
                            }
                        }
                    }
                }
                clearAppUserDataApplicationWorker$work$1 = new ClearAppUserDataApplicationWorker$work$1(this, (ContinuationImpl) continuation);
                obj = clearAppUserDataApplicationWorker$work$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clearAppUserDataApplicationWorker$work$1.label;
                if (i != 0) {
                }
                if (((ClearAppUserDataOnNextLaunch) obj).value) {
                }
            default:
                Object withContext = JobKt.withContext((CoroutineContext) obj2, new RealGcmRegistrar$unregister$2(this, continuation2, 26), continuation);
                if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public ClearAppUserDataApplicationWorker(SharedPreferencesKeyValue sharedPreferencesKeyValue, Application application, RealAppDataWiper realAppDataWiper) {
        this.clearAppUserDataOnNextLaunch = sharedPreferencesKeyValue;
        this.context = application;
    }
}
