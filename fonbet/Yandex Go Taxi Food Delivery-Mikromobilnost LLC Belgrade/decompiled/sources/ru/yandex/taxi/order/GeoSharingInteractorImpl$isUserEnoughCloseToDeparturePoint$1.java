package ru.yandex.taxi.order;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.order.GeoSharingInteractorImpl", f = "GeoSharingInteractor.kt", l = {ModuleDescriptor.MODULE_VERSION, 161}, m = "isUserEnoughCloseToDeparturePoint", v = 2)
/* loaded from: classes6.dex */
final class GeoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1 extends ContinuationImpl {
    double D$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSharingInteractorImpl$isUserEnoughCloseToDeparturePoint$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.c(this.this$0, null, this);
    }
}
