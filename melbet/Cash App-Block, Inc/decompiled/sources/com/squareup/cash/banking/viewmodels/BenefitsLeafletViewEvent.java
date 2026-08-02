package com.squareup.cash.banking.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BenefitsLeafletViewEvent {

    public final class CallToActionButtonClicked implements BenefitsLeafletViewEvent {
        public final String clientRoute;
        public final Level level;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Level {
            public static final /* synthetic */ Level[] $VALUES;
            public static final Level Primary;
            public static final Level Secondary;

            static {
                Level level = new Level("Primary", 0);
                Primary = level;
                Level level2 = new Level("Secondary", 1);
                Secondary = level2;
                $VALUES = new Level[]{level, level2};
            }

            public static Level valueOf(String str) {
                return (Level) Enum.valueOf(Level.class, str);
            }

            public static Level[] values() {
                return (Level[]) $VALUES.clone();
            }
        }

        public CallToActionButtonClicked(String str, Level level) {
            str.getClass();
            this.clientRoute = str;
            this.level = level;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallToActionButtonClicked)) {
                return false;
            }
            CallToActionButtonClicked callToActionButtonClicked = (CallToActionButtonClicked) obj;
            return Intrinsics.areEqual(this.clientRoute, callToActionButtonClicked.clientRoute) && this.level == callToActionButtonClicked.level;
        }

        public final int hashCode() {
            return this.level.hashCode() + (this.clientRoute.hashCode() * 31);
        }

        public final String toString() {
            return "CallToActionButtonClicked(clientRoute=" + this.clientRoute + ", level=" + this.level + ")";
        }
    }

    public final class Dismissed implements BenefitsLeafletViewEvent {
        public final boolean isError;

        public Dismissed(boolean z) {
            this.isError = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dismissed) && this.isError == ((Dismissed) obj).isError;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isError);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Dismissed(isError=", ")", this.isError);
        }
    }

    public final class DoneButtonClicked implements BenefitsLeafletViewEvent {
        public static final DoneButtonClicked INSTANCE = new DoneButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DoneButtonClicked);
        }

        public final int hashCode() {
            return -968984034;
        }

        public final String toString() {
            return "DoneButtonClicked";
        }
    }

    public final class UrlClicked implements BenefitsLeafletViewEvent {
        public final String url;

        public UrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClicked) && Intrinsics.areEqual(this.url, ((UrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClicked(url=", this.url, ")");
        }
    }
}
