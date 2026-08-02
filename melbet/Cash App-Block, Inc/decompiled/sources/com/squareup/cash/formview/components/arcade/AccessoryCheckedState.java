package com.squareup.cash.formview.components.arcade;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface AccessoryCheckedState {

    public final class Checkbox implements AccessoryCheckedState {
        public final boolean checked;

        public Checkbox(boolean z) {
            this.checked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Checkbox) && this.checked == ((Checkbox) obj).checked;
        }

        @Override // com.squareup.cash.formview.components.arcade.AccessoryCheckedState
        public final boolean getChecked() {
            return this.checked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Checkbox(checked=", ")", this.checked);
        }

        @Override // com.squareup.cash.formview.components.arcade.AccessoryCheckedState
        public final AccessoryCheckedState withChecked(boolean z) {
            return new Checkbox(z);
        }
    }

    public final class Radio implements AccessoryCheckedState {
        public final boolean checked;

        public Radio(boolean z) {
            this.checked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Radio) && this.checked == ((Radio) obj).checked;
        }

        @Override // com.squareup.cash.formview.components.arcade.AccessoryCheckedState
        public final boolean getChecked() {
            return this.checked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Radio(checked=", ")", this.checked);
        }

        @Override // com.squareup.cash.formview.components.arcade.AccessoryCheckedState
        public final AccessoryCheckedState withChecked(boolean z) {
            return new Radio(z);
        }
    }

    public final class Toggle implements AccessoryCheckedState {
        public final boolean checked;

        public Toggle(boolean z) {
            this.checked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Toggle) && this.checked == ((Toggle) obj).checked;
        }

        @Override // com.squareup.cash.formview.components.arcade.AccessoryCheckedState
        public final boolean getChecked() {
            return this.checked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Toggle(checked=", ")", this.checked);
        }

        @Override // com.squareup.cash.formview.components.arcade.AccessoryCheckedState
        public final AccessoryCheckedState withChecked(boolean z) {
            return new Toggle(z);
        }
    }

    boolean getChecked();

    AccessoryCheckedState withChecked(boolean z);
}
