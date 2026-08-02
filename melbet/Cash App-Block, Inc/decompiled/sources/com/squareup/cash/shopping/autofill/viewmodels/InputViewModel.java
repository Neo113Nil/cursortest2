package com.squareup.cash.shopping.autofill.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class InputViewModel {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InputState {
        public static final /* synthetic */ InputState[] $VALUES;
        public static final InputState DEFAULT;
        public static final InputState DISABLED;
        public static final InputState ERROR;

        static {
            InputState inputState = new InputState("DEFAULT", 0);
            DEFAULT = inputState;
            InputState inputState2 = new InputState("ERROR", 1);
            ERROR = inputState2;
            InputState inputState3 = new InputState("DISABLED", 2);
            DISABLED = inputState3;
            $VALUES = new InputState[]{inputState, inputState2, inputState3};
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InputType {
        public static final /* synthetic */ InputType[] $VALUES;
        public static final InputType ADDRESS1;
        public static final InputType ADDRESS2;
        public static final InputType CITY;
        public static final InputType EMAIL;
        public static final InputType FIRST_NAME;
        public static final InputType LAST_NAME;
        public static final InputType PHONE;
        public static final InputType POSTAL;
        public static final InputType STATE;

        static {
            InputType inputType = new InputType("FIRST_NAME", 0);
            FIRST_NAME = inputType;
            InputType inputType2 = new InputType("LAST_NAME", 1);
            LAST_NAME = inputType2;
            InputType inputType3 = new InputType("PHONE", 2);
            PHONE = inputType3;
            InputType inputType4 = new InputType("EMAIL", 3);
            EMAIL = inputType4;
            InputType inputType5 = new InputType("ADDRESS1", 4);
            ADDRESS1 = inputType5;
            InputType inputType6 = new InputType("ADDRESS2", 5);
            ADDRESS2 = inputType6;
            InputType inputType7 = new InputType("CITY", 6);
            CITY = inputType7;
            InputType inputType8 = new InputType("STATE", 7);
            STATE = inputType8;
            InputType inputType9 = new InputType("POSTAL", 8);
            POSTAL = inputType9;
            $VALUES = new InputType[]{inputType, inputType2, inputType3, inputType4, inputType5, inputType6, inputType7, inputType8, inputType9};
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class KeyboardType {
        public static final /* synthetic */ KeyboardType[] $VALUES;
        public static final KeyboardType NUMBERS;
        public static final KeyboardType TEXT;

        static {
            KeyboardType keyboardType = new KeyboardType("TEXT", 0);
            TEXT = keyboardType;
            KeyboardType keyboardType2 = new KeyboardType("NUMBERS", 1);
            NUMBERS = keyboardType2;
            $VALUES = new KeyboardType[]{keyboardType, keyboardType2};
        }

        public static KeyboardType valueOf(String str) {
            return (KeyboardType) Enum.valueOf(KeyboardType.class, str);
        }

        public static KeyboardType[] values() {
            return (KeyboardType[]) $VALUES.clone();
        }
    }

    public abstract InputState getState();

    public final class InputDropdownViewModel extends InputViewModel {
        public final List choices;
        public final String helperText;
        public final String label;
        public final String placeholder;
        public final InputState state;

        /* renamed from: type, reason: collision with root package name */
        public final InputType f1202type;
        public final String value;

        public InputDropdownViewModel(List list, String str, String str2, InputState inputState, String str3, String str4) {
            InputType inputType = InputType.STATE;
            list.getClass();
            this.choices = list;
            this.helperText = str;
            this.value = str2;
            this.state = inputState;
            this.f1202type = inputType;
            this.label = str3;
            this.placeholder = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputDropdownViewModel)) {
                return false;
            }
            InputDropdownViewModel inputDropdownViewModel = (InputDropdownViewModel) obj;
            return Intrinsics.areEqual(this.choices, inputDropdownViewModel.choices) && Intrinsics.areEqual(this.helperText, inputDropdownViewModel.helperText) && Intrinsics.areEqual(this.value, inputDropdownViewModel.value) && this.state == inputDropdownViewModel.state && this.f1202type == inputDropdownViewModel.f1202type && Intrinsics.areEqual(this.label, inputDropdownViewModel.label) && Intrinsics.areEqual(this.placeholder, inputDropdownViewModel.placeholder);
        }

        @Override // com.squareup.cash.shopping.autofill.viewmodels.InputViewModel
        public final InputState getState() {
            return this.state;
        }

        public final int hashCode() {
            int hashCode = this.choices.hashCode() * 31;
            String str = this.helperText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.value;
            int hashCode3 = (this.f1202type.hashCode() + ((this.state.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
            String str3 = this.label;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.placeholder;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("InputDropdownViewModel(choices=", ", helperText=", this.helperText, ", value=", this.choices);
            m.append(this.value);
            m.append(", state=");
            m.append(this.state);
            m.append(", type=");
            m.append(this.f1202type);
            m.append(", label=");
            m.append(this.label);
            m.append(", placeholder=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.placeholder, ")");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ InputDropdownViewModel(List list) {
            this(list, null, "CA", InputState.DEFAULT, "State", null);
            InputType inputType = InputType.FIRST_NAME;
        }
    }

    public final class InputFieldViewModel extends InputViewModel {
        public final String helperText;
        public final KeyboardType keyboardType;
        public final String label;
        public final String placeholder;
        public final InputState state;

        /* renamed from: type, reason: collision with root package name */
        public final InputType f1203type;
        public final String value;

        public /* synthetic */ InputFieldViewModel(String str, String str2, InputState inputState, InputType inputType, String str3, String str4, int i) {
            this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? InputState.DEFAULT : inputState, inputType, str3, (i & 32) != 0 ? null : str4, KeyboardType.TEXT);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputFieldViewModel)) {
                return false;
            }
            InputFieldViewModel inputFieldViewModel = (InputFieldViewModel) obj;
            return Intrinsics.areEqual(this.helperText, inputFieldViewModel.helperText) && Intrinsics.areEqual(this.value, inputFieldViewModel.value) && this.state == inputFieldViewModel.state && this.f1203type == inputFieldViewModel.f1203type && Intrinsics.areEqual(this.label, inputFieldViewModel.label) && Intrinsics.areEqual(this.placeholder, inputFieldViewModel.placeholder) && this.keyboardType == inputFieldViewModel.keyboardType;
        }

        @Override // com.squareup.cash.shopping.autofill.viewmodels.InputViewModel
        public final InputState getState() {
            return this.state;
        }

        public final int hashCode() {
            String str = this.helperText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            int hashCode2 = (this.f1203type.hashCode() + ((this.state.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
            String str3 = this.label;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.placeholder;
            return this.keyboardType.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputFieldViewModel(helperText=", this.helperText, ", value=", this.value, ", state=");
            m.append(this.state);
            m.append(", type=");
            m.append(this.f1203type);
            m.append(", label=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.label, ", placeholder=", this.placeholder, ", keyboardType=");
            m.append(this.keyboardType);
            m.append(")");
            return m.toString();
        }

        public InputFieldViewModel(String str, String str2, InputState inputState, InputType inputType, String str3, String str4, KeyboardType keyboardType) {
            inputState.getClass();
            this.helperText = str;
            this.value = str2;
            this.state = inputState;
            this.f1203type = inputType;
            this.label = str3;
            this.placeholder = str4;
            this.keyboardType = keyboardType;
        }
    }
}
