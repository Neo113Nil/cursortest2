package com.squareup.cash.investing.viewmodels.settings;

import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel;

/* loaded from: classes6.dex */
public abstract class InvestingSettingsViewEvent {

    public final class BackClicked extends InvestingSettingsViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 1494214742;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class EntryClicked extends InvestingSettingsViewEvent {

        /* renamed from: type, reason: collision with root package name */
        public final InvestingSettingsViewModel.Entry.Type f1166type;

        public EntryClicked(InvestingSettingsViewModel.Entry.Type type2) {
            this.f1166type = type2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EntryClicked) && this.f1166type == ((EntryClicked) obj).f1166type;
        }

        public final int hashCode() {
            return this.f1166type.hashCode();
        }

        public final String toString() {
            return "EntryClicked(type=" + this.f1166type + ")";
        }
    }
}
