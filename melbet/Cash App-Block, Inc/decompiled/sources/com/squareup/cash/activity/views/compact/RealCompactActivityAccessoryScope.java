package com.squareup.cash.activity.views.compact;

import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* loaded from: classes5.dex */
public final class RealCompactActivityAccessoryScope {
    public final ParcelableSnapshotMutableState accessoryContent$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState type$delegate = Updater.mutableStateOf$default(Type.CUSTOM);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type AMOUNT;
        public static final Type BUTTON;
        public static final Type CUSTOM;

        static {
            Type type2 = new Type("AMOUNT", 0);
            AMOUNT = type2;
            Type type3 = new Type("BUTTON", 1);
            BUTTON = type3;
            Type type4 = new Type("PUSH", 2);
            Type type5 = new Type("CUSTOM", 3);
            CUSTOM = type5;
            $VALUES = new Type[]{type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public final void amount(ComposableLambdaImpl composableLambdaImpl) {
        this.type$delegate.setValue(Type.AMOUNT);
        this.accessoryContent$delegate.setValue(new ComposableLambdaImpl(new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 13), true, -1103162339));
    }
}
