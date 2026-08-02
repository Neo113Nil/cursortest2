package coil3.network.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.SourceResponseBody;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.Cache;
import okio.Buffer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewInvestingCategory.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readBuffer(SourceResponseBody sourceResponseBody, ContinuationImpl continuationImpl) {
        UtilsKt$readBuffer$1 utilsKt$readBuffer$1;
        int i;
        SourceResponseBody sourceResponseBody2;
        Throwable th;
        Buffer buffer;
        if (continuationImpl instanceof UtilsKt$readBuffer$1) {
            utilsKt$readBuffer$1 = (UtilsKt$readBuffer$1) continuationImpl;
            int i2 = utilsKt$readBuffer$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                utilsKt$readBuffer$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = utilsKt$readBuffer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = utilsKt$readBuffer$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    try {
                        Buffer buffer2 = new Buffer();
                        utilsKt$readBuffer$1.L$0 = sourceResponseBody;
                        utilsKt$readBuffer$1.L$1 = buffer2;
                        utilsKt$readBuffer$1.label = 1;
                        sourceResponseBody.source.readAll(buffer2);
                        if (Unit.INSTANCE == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        sourceResponseBody2 = sourceResponseBody;
                        buffer = buffer2;
                    } catch (Throwable th2) {
                        sourceResponseBody2 = sourceResponseBody;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    buffer = utilsKt$readBuffer$1.L$1;
                    sourceResponseBody2 = utilsKt$readBuffer$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            Cache.Companion.closeFinally(sourceResponseBody2, th);
                            throw th4;
                        }
                    }
                }
                Cache.Companion.closeFinally(sourceResponseBody2, null);
                return buffer;
            }
        }
        utilsKt$readBuffer$1 = new UtilsKt$readBuffer$1(continuationImpl);
        Object obj2 = utilsKt$readBuffer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = utilsKt$readBuffer$1.label;
        if (i != 0) {
        }
        Cache.Companion.closeFinally(sourceResponseBody2, null);
        return buffer;
    }
}
