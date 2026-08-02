package com.squareup.cash.favorites.presenters;

import app.cash.local.store.real.RealLocalInstalledStore$showGeoTab$$inlined$map$1$2;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$header$$inlined$map$1$2;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final class AddFavoritesPresenter$models$lambda$15$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Transform$special$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ AddFavoritesPresenter$models$lambda$15$$inlined$map$1(Transform$special$$inlined$map$1 transform$special$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = transform$special$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        Transform$special$$inlined$map$1 transform$special$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = transform$special$$inlined$map$1.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, 29), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = transform$special$$inlined$map$1.collect(new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, 15), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
