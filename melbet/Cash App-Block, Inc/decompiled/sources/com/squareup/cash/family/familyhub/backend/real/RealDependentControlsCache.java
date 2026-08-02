package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import dev.zacsweers.metro.internal.Factory;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes6.dex */
public final class RealDependentControlsCache {
    public String currentToken;
    public final LinkedHashMap cache = new LinkedHashMap();
    public final SharedFlowImpl statusUpdates = FlowKt.MutableSharedFlow$default(0, 1, null, 4);

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory(0);
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new RealDependentControlsCache();
                default:
                    return new RealDependentCustomerTokenRepository();
            }
        }
    }

    public final Object setStatus(ControlType controlType, DependentControlStatus.Loaded loaded, ContinuationImpl continuationImpl) {
        this.cache.put(controlType, loaded);
        Object emit = this.statusUpdates.emit(new Pair(controlType, loaded), continuationImpl);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
    }
}
