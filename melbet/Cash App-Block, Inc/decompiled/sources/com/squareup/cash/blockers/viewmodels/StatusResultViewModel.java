package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class StatusResultViewModel {

    public final class Hidden extends StatusResultViewModel {
        public static final Hidden INSTANCE = new Hidden();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public final int hashCode() {
            return -1441548321;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    public final class Loading extends StatusResultViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1980698023;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready extends StatusResultViewModel {
        public final ColorModel accentColor;
        public final HapticEffect hapticEffect;
        public final StatusResult.Icon icon;
        public final LayoutUpdate layoutUpdate;
        public final boolean loading;
        public final StatusResultButton primaryButton;
        public final StatusResultButton secondaryButton;
        public final boolean showConfetti;
        public final String text;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class HapticEffect {
            public static final /* synthetic */ HapticEffect[] $VALUES;
            public static final HapticEffect ERROR;
            public static final HapticEffect SUCCESS;

            static {
                HapticEffect hapticEffect = new HapticEffect("SUCCESS", 0);
                SUCCESS = hapticEffect;
                HapticEffect hapticEffect2 = new HapticEffect("ERROR", 1);
                ERROR = hapticEffect2;
                $VALUES = new HapticEffect[]{hapticEffect, hapticEffect2};
            }

            public static HapticEffect valueOf(String str) {
                return (HapticEffect) Enum.valueOf(HapticEffect.class, str);
            }

            public static HapticEffect[] values() {
                return (HapticEffect[]) $VALUES.clone();
            }
        }

        public Ready(StatusResult.Icon icon, String str, StatusResultButton statusResultButton, StatusResultButton statusResultButton2, LayoutUpdate layoutUpdate, ColorModel colorModel, boolean z, HapticEffect hapticEffect, boolean z2) {
            statusResultButton.getClass();
            this.icon = icon;
            this.text = str;
            this.primaryButton = statusResultButton;
            this.secondaryButton = statusResultButton2;
            this.layoutUpdate = layoutUpdate;
            this.accentColor = colorModel;
            this.loading = z;
            this.hapticEffect = hapticEffect;
            this.showConfetti = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.icon == ready.icon && Intrinsics.areEqual(this.text, ready.text) && Intrinsics.areEqual(this.primaryButton, ready.primaryButton) && Intrinsics.areEqual(this.secondaryButton, ready.secondaryButton) && Intrinsics.areEqual(this.layoutUpdate, ready.layoutUpdate) && Intrinsics.areEqual(this.accentColor, ready.accentColor) && this.loading == ready.loading && this.hapticEffect == ready.hapticEffect && this.showConfetti == ready.showConfetti;
        }

        public final int hashCode() {
            StatusResult.Icon icon = this.icon;
            int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
            String str = this.text;
            int hashCode2 = (this.primaryButton.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            StatusResultButton statusResultButton = this.secondaryButton;
            int hashCode3 = (hashCode2 + (statusResultButton == null ? 0 : statusResultButton.hashCode())) * 31;
            LayoutUpdate layoutUpdate = this.layoutUpdate;
            int hashCode4 = (hashCode3 + (layoutUpdate == null ? 0 : layoutUpdate.hashCode())) * 31;
            ColorModel colorModel = this.accentColor;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (colorModel == null ? 0 : colorModel.hashCode())) * 31, 31, this.loading);
            HapticEffect hapticEffect = this.hapticEffect;
            return Boolean.hashCode(this.showConfetti) + ((m + (hapticEffect != null ? hapticEffect.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(icon=");
            sb.append(this.icon);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", primaryButton=");
            sb.append(this.primaryButton);
            sb.append(", secondaryButton=");
            sb.append(this.secondaryButton);
            sb.append(", layoutUpdate=");
            sb.append(this.layoutUpdate);
            sb.append(", accentColor=");
            sb.append(this.accentColor);
            sb.append(", loading=");
            sb.append(this.loading);
            sb.append(", hapticEffect=");
            sb.append(this.hapticEffect);
            sb.append(", showConfetti=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showConfetti, ")");
        }
    }
}
