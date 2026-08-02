package app.cash.local.presenters;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes3.dex */
public final class RealOrderBuilderStore {
    public RealOrderBuilder active;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealOrderBuilderStore();
        }
    }
}
