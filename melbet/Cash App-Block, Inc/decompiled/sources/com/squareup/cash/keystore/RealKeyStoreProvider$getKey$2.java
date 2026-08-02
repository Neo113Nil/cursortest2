package com.squareup.cash.keystore;

import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.ConnectionPool;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealKeyStoreProvider$getKey$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $alias;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealKeyStoreProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealKeyStoreProvider$getKey$2(RealKeyStoreProvider realKeyStoreProvider, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realKeyStoreProvider;
        this.$alias = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$alias;
        RealKeyStoreProvider realKeyStoreProvider = this.this$0;
        switch (i) {
            case 0:
                return new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, 0);
            case 1:
                return new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, 1);
            case 2:
                return new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, 2);
            case 3:
                return new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, 3);
            default:
                return new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealKeyStoreProvider$getKey$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ArrayList arrayList = null;
        String str = this.$alias;
        RealKeyStoreProvider realKeyStoreProvider = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Key key = ((KeyStore) realKeyStoreProvider.keyStore.delegate).getKey(str, null);
                key.getClass();
                if (key instanceof PrivateKey) {
                    return (PrivateKey) key;
                }
                return null;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ConnectionPool connectionPool = realKeyStoreProvider.keyStore;
                str.getClass();
                return Boolean.valueOf(((KeyStore) connectionPool.delegate).containsAlias(str));
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ConnectionPool connectionPool2 = realKeyStoreProvider.keyStore;
                str.getClass();
                ((KeyStore) connectionPool2.delegate).deleteEntry(str);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Certificate[] certificateChain = ((KeyStore) realKeyStoreProvider.keyStore.delegate).getCertificateChain(str);
                if (certificateChain != null) {
                    arrayList = new ArrayList(certificateChain.length);
                    for (Certificate certificate : certificateChain) {
                        certificate.getClass();
                        arrayList.add((X509Certificate) certificate);
                    }
                }
                return arrayList;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                KeyStore.Entry entry = ((KeyStore) realKeyStoreProvider.keyStore.delegate).getEntry(str, null);
                entry.getClass();
                return entry;
        }
    }
}
