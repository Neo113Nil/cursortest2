package com.squareup.cash.family.activity.presenters;

import dev.zacsweers.metro.internal.Factory;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FamilyActivitiesStorage {
    public final HashMap loadedDependentActivitiesCache = new HashMap();

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new FamilyActivitiesStorage();
        }
    }
}
