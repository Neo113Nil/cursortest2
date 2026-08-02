package com.squareup.cash.activity.backend.loader;

import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class ActivityTabCache extends ActivitiesCache.InMemory {

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
                    return new ActivityTabCache();
                default:
                    return new RealActivitiesCacheManager();
            }
        }
    }
}
