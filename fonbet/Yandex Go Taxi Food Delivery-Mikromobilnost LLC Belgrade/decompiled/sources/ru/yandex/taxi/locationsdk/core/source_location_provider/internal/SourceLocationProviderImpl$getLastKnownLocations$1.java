package ru.yandex.taxi.locationsdk.core.source_location_provider.internal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.locationsdk.core.source_location_provider.internal.SourceLocationProviderImpl", f = "SourceLocationProviderImpl.kt", l = {47}, m = "getLastKnownLocations")
/* loaded from: classes9.dex */
final class SourceLocationProviderImpl$getLastKnownLocations$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceLocationProviderImpl$getLastKnownLocations$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
