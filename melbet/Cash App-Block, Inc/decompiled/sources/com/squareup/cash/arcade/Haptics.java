package com.squareup.cash.arcade;

import android.os.VibrationEffect;
import androidx.core.view.WindowCompat$Api35Impl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Haptics {
    public final Input input = new Input();
    public final VibrationEffectFactory success = VibrationEffectFactory.Success;
    public final VibrationEffectFactory failure = VibrationEffectFactory.Failure;

    public final class Input {
        public final VibrationEffectFactory subtle = VibrationEffectFactory.InputSubtle;
        public final VibrationEffectFactory standard = VibrationEffectFactory.InputStandard;
        public final VibrationEffectFactory prominent = VibrationEffectFactory.InputProminent;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            return this.subtle.equals(input.subtle) && this.standard.equals(input.standard) && this.prominent.equals(input.prominent);
        }

        public final int hashCode() {
            return this.prominent.hashCode() + ((this.standard.hashCode() + (this.subtle.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Input(subtle=" + this.subtle + ", standard=" + this.standard + ", prominent=" + this.prominent + ")";
        }
    }

    public interface VibrationEffectFactory {
        public static final Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0 Failure;
        public static final Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0 InputProminent;
        public static final Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0 InputStandard;
        public static final Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0 InputSubtle;
        public static final Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0 Success;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0] */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0] */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0] */
        /* JADX WARN: Type inference failed for: r0v3, types: [com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0] */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0] */
        static {
            final int i = 0;
            InputSubtle = new VibrationEffectFactory() { // from class: com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0
                @Override // com.squareup.cash.arcade.Haptics.VibrationEffectFactory
                public final VibrationEffect create() {
                    switch (i) {
                        case 0:
                            return WindowCompat$Api35Impl.access$InputSubtle$lambda$0();
                        case 1:
                            return WindowCompat$Api35Impl.access$InputStandard$lambda$1();
                        case 2:
                            return WindowCompat$Api35Impl.access$InputProminent$lambda$2();
                        case 3:
                            return WindowCompat$Api35Impl.access$Success$lambda$3();
                        default:
                            return WindowCompat$Api35Impl.access$Failure$lambda$4();
                    }
                }
            };
            final int i2 = 1;
            InputStandard = new VibrationEffectFactory() { // from class: com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0
                @Override // com.squareup.cash.arcade.Haptics.VibrationEffectFactory
                public final VibrationEffect create() {
                    switch (i2) {
                        case 0:
                            return WindowCompat$Api35Impl.access$InputSubtle$lambda$0();
                        case 1:
                            return WindowCompat$Api35Impl.access$InputStandard$lambda$1();
                        case 2:
                            return WindowCompat$Api35Impl.access$InputProminent$lambda$2();
                        case 3:
                            return WindowCompat$Api35Impl.access$Success$lambda$3();
                        default:
                            return WindowCompat$Api35Impl.access$Failure$lambda$4();
                    }
                }
            };
            final int i3 = 2;
            InputProminent = new VibrationEffectFactory() { // from class: com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0
                @Override // com.squareup.cash.arcade.Haptics.VibrationEffectFactory
                public final VibrationEffect create() {
                    switch (i3) {
                        case 0:
                            return WindowCompat$Api35Impl.access$InputSubtle$lambda$0();
                        case 1:
                            return WindowCompat$Api35Impl.access$InputStandard$lambda$1();
                        case 2:
                            return WindowCompat$Api35Impl.access$InputProminent$lambda$2();
                        case 3:
                            return WindowCompat$Api35Impl.access$Success$lambda$3();
                        default:
                            return WindowCompat$Api35Impl.access$Failure$lambda$4();
                    }
                }
            };
            final int i4 = 3;
            Success = new VibrationEffectFactory() { // from class: com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0
                @Override // com.squareup.cash.arcade.Haptics.VibrationEffectFactory
                public final VibrationEffect create() {
                    switch (i4) {
                        case 0:
                            return WindowCompat$Api35Impl.access$InputSubtle$lambda$0();
                        case 1:
                            return WindowCompat$Api35Impl.access$InputStandard$lambda$1();
                        case 2:
                            return WindowCompat$Api35Impl.access$InputProminent$lambda$2();
                        case 3:
                            return WindowCompat$Api35Impl.access$Success$lambda$3();
                        default:
                            return WindowCompat$Api35Impl.access$Failure$lambda$4();
                    }
                }
            };
            final int i5 = 4;
            Failure = new VibrationEffectFactory() { // from class: com.squareup.cash.arcade.Haptics$VibrationEffectFactory$$ExternalSyntheticLambda0
                @Override // com.squareup.cash.arcade.Haptics.VibrationEffectFactory
                public final VibrationEffect create() {
                    switch (i5) {
                        case 0:
                            return WindowCompat$Api35Impl.access$InputSubtle$lambda$0();
                        case 1:
                            return WindowCompat$Api35Impl.access$InputStandard$lambda$1();
                        case 2:
                            return WindowCompat$Api35Impl.access$InputProminent$lambda$2();
                        case 3:
                            return WindowCompat$Api35Impl.access$Success$lambda$3();
                        default:
                            return WindowCompat$Api35Impl.access$Failure$lambda$4();
                    }
                }
            };
        }

        VibrationEffect create();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Haptics)) {
            return false;
        }
        Haptics haptics = (Haptics) obj;
        return Intrinsics.areEqual(this.input, haptics.input) && Intrinsics.areEqual(this.success, haptics.success) && Intrinsics.areEqual(this.failure, haptics.failure);
    }

    public final int hashCode() {
        return this.failure.hashCode() + ((this.success.hashCode() + (this.input.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Haptics(input=" + this.input + ", success=" + this.success + ", failure=" + this.failure + ")";
    }
}
