package com.squareup.cash.arcade.components.cell;

import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.moneybot.views.menu.OpenSessionByIdDialogKt$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class RealCellActivityAccessoryScope {
    public final ParcelableSnapshotMutableState accessoryContent$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState type$delegate = Updater.mutableStateOf$default(Type.CUSTOM);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type AMOUNT;
        public static final Type BUTTON;
        public static final Type CUSTOM;
        public static final Type PUSH;

        static {
            Type type2 = new Type("AMOUNT", 0);
            AMOUNT = type2;
            Type type3 = new Type("BUTTON", 1);
            BUTTON = type3;
            Type type4 = new Type("PUSH", 2);
            PUSH = type4;
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
        setAccessoryContent(new ComposableLambdaImpl(new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 27), true, -761346148));
    }

    public final void button(Function0 function0, Function1 function1) {
        function0.getClass();
        function1.getClass();
        this.type$delegate.setValue(Type.BUTTON);
        setAccessoryContent(new ComposableLambdaImpl(new OpenSessionByIdDialogKt$$ExternalSyntheticLambda1(function1, function0, 2, (byte) 0), true, -1302940528));
    }

    public final void custom(ComposableLambdaImpl composableLambdaImpl) {
        this.type$delegate.setValue(Type.CUSTOM);
        setAccessoryContent(composableLambdaImpl);
    }

    public final void setAccessoryContent(ComposableLambdaImpl composableLambdaImpl) {
        this.accessoryContent$delegate.setValue(composableLambdaImpl);
    }
}
