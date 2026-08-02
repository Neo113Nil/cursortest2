package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PersonalizedAdsSectionViewEvent {

    /* loaded from: classes7.dex */
    public final class OpenUrl implements PersonalizedAdsSectionViewEvent {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }

    /* loaded from: classes7.dex */
    public final class ToggleSetting implements PersonalizedAdsSectionViewEvent {
        public final boolean isChecked;

        public ToggleSetting(boolean z) {
            this.isChecked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSetting) && this.isChecked == ((ToggleSetting) obj).isChecked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleSetting(isChecked=", ")", this.isChecked);
        }
    }
}
