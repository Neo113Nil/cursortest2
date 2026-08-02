package com.squareup.cash.account.settings.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ThemeSwitcherViewModel {

    public final class Error implements ThemeSwitcherViewModel {
        public final String body;
        public final String retryButton;
        public final String title;

        public Error(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.body = str2;
            this.retryButton = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.body, error.body) && Intrinsics.areEqual(this.retryButton, error.retryButton);
        }

        public final int hashCode() {
            return this.retryButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(title=", this.title, ", body=", this.body, ", retryButton="), this.retryButton, ")");
        }
    }

    public final class Loaded implements ThemeSwitcherViewModel {
        public final boolean animate;
        public final PaymentPadTheme previousTheme;
        public final PaymentPadTheme selectedTheme;
        public final boolean showBratHype;
        public final ArrayList themeData;

        public Loaded(ArrayList arrayList, PaymentPadTheme paymentPadTheme, PaymentPadTheme paymentPadTheme2, boolean z, boolean z2) {
            this.themeData = arrayList;
            this.selectedTheme = paymentPadTheme;
            this.previousTheme = paymentPadTheme2;
            this.animate = z;
            this.showBratHype = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.themeData.equals(loaded.themeData) && this.selectedTheme == loaded.selectedTheme && this.previousTheme == loaded.previousTheme && this.animate == loaded.animate && this.showBratHype == loaded.showBratHype;
        }

        public final int hashCode() {
            int hashCode = (this.selectedTheme.hashCode() + (this.themeData.hashCode() * 31)) * 31;
            PaymentPadTheme paymentPadTheme = this.previousTheme;
            return Boolean.hashCode(this.showBratHype) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (paymentPadTheme == null ? 0 : paymentPadTheme.hashCode())) * 31, 31, this.animate);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(themeData=");
            sb.append(this.themeData);
            sb.append(", selectedTheme=");
            sb.append(this.selectedTheme);
            sb.append(", previousTheme=");
            sb.append(this.previousTheme);
            sb.append(", animate=");
            sb.append(this.animate);
            sb.append(", showBratHype=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showBratHype, ")");
        }
    }

    public final class Loading implements ThemeSwitcherViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 120308719;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
