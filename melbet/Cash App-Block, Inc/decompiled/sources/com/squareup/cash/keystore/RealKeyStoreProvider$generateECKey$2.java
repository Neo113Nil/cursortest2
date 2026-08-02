package com.squareup.cash.keystore;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.Provider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RealKeyStoreProvider$generateECKey$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KeyGenParameterSpec $spec;
    public final /* synthetic */ RealKeyStoreProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealKeyStoreProvider$generateECKey$2(RealKeyStoreProvider realKeyStoreProvider, KeyGenParameterSpec keyGenParameterSpec, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realKeyStoreProvider;
        this.$spec = keyGenParameterSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        KeyGenParameterSpec keyGenParameterSpec = this.$spec;
        RealKeyStoreProvider realKeyStoreProvider = this.this$0;
        switch (i) {
            case 0:
                return new RealKeyStoreProvider$generateECKey$2(realKeyStoreProvider, keyGenParameterSpec, continuation, 0);
            default:
                return new RealKeyStoreProvider$generateECKey$2(realKeyStoreProvider, keyGenParameterSpec, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealKeyStoreProvider$generateECKey$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        KeyGenParameterSpec keyGenParameterSpec = this.$spec;
        RealKeyStoreProvider realKeyStoreProvider = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Provider provider = ((KeyStore) realKeyStoreProvider.keyStore.delegate).getProvider();
                provider.getClass();
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", provider.getName());
                keyPairGenerator.initialize(keyGenParameterSpec);
                keyPairGenerator.generateKeyPair();
                return keyPairGenerator;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Provider provider2 = ((KeyStore) realKeyStoreProvider.keyStore.delegate).getProvider();
                provider2.getClass();
                KeyPairGenerator keyPairGenerator2 = KeyPairGenerator.getInstance("RSA", provider2.getName());
                keyPairGenerator2.initialize(keyGenParameterSpec);
                return keyPairGenerator2.generateKeyPair();
        }
    }
}
