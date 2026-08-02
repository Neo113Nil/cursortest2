package com.squareup.cash;

import com.squareup.cash.treehouse.network.RealHttpClient;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.SetupTeardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import dev.zacsweers.metro.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final /* synthetic */ class SandboxedSetupTeardowns$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Provider f$0;

    public /* synthetic */ SandboxedSetupTeardowns$$ExternalSyntheticLambda0(Provider provider, int i) {
        this.$r8$classId = i;
        this.f$0 = provider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Provider provider = this.f$0;
        switch (i) {
            case 0:
                List<UiSetupTeardown> list = ((UiSandboxedSetupTeardowns) provider.invoke()).setupTeardowns;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (final UiSetupTeardown uiSetupTeardown : list) {
                    uiSetupTeardown.getClass();
                    arrayList.add(new SetupTeardown() { // from class: com.squareup.util.coroutines.SetupTeardownKt$$ExternalSyntheticLambda1
                        @Override // com.squareup.util.coroutines.SetupTeardown
                        public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
                            coroutineScope.getClass();
                            UnitSetupTeardown unitSetupTeardown = UnitSetupTeardown.this;
                            unitSetupTeardown.getClass();
                            return unitSetupTeardown.setup(coroutineScope);
                        }
                    });
                }
                return arrayList;
            case 1:
                List<IoSetupTeardown> list2 = ((IoSandboxedSetupTeardowns) provider.invoke()).setupTeardowns;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (final IoSetupTeardown ioSetupTeardown : list2) {
                    ioSetupTeardown.getClass();
                    arrayList2.add(new SetupTeardown() { // from class: com.squareup.util.coroutines.SetupTeardownKt$$ExternalSyntheticLambda1
                        @Override // com.squareup.util.coroutines.SetupTeardown
                        public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
                            coroutineScope.getClass();
                            UnitSetupTeardown unitSetupTeardown = UnitSetupTeardown.this;
                            unitSetupTeardown.getClass();
                            return unitSetupTeardown.setup(coroutineScope);
                        }
                    });
                }
                return arrayList2;
            case 2:
                OkHttpClient.Builder newBuilder = ((OkHttpClient) provider.invoke()).newBuilder();
                newBuilder.readTimeout(30L, timeUnit);
                return new OkHttpClient(newBuilder);
            case 3:
                OkHttpClient.Builder newBuilder2 = ((OkHttpClient) provider.invoke()).newBuilder();
                newBuilder2.readTimeout(30L, timeUnit);
                return new OkHttpClient(newBuilder2);
            default:
                return new RealHttpClient((Call.Factory) provider.invoke());
        }
    }
}
