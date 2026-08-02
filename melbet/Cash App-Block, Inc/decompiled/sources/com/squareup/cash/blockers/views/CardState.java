package com.squareup.cash.blockers.views;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableHolder;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import com.squareup.cash.scrubbing.PostalCodeValidator;
import com.squareup.protos.common.countries.Country;
import com.squareup.scannerview.ManualErrorReason;
import com.squareup.scannerview.ScannerView;
import com.squareup.scannerview.Step;
import com.squareup.util.cash.Luhn;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Clock;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.reflect.jvm.internal.KotlinKPropertyKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes4.dex */
public final class CardState {
    public final ParcelableSnapshotMutableState _brand$delegate;
    public final ParcelableSnapshotMutableState _expiration$delegate;
    public final ParcelableSnapshotMutableState _name$delegate;
    public final ParcelableSnapshotMutableState _number$delegate;
    public final ParcelableSnapshotMutableState _postalCode$delegate;
    public final ParcelableSnapshotMutableState _requireName$delegate;
    public final ParcelableSnapshotMutableState _requirePostalCode$delegate;
    public final ParcelableSnapshotMutableState _securityCode$delegate;
    public final Clock clock;
    public final ParcelableSnapshotMutableState _postalCountry$delegate = Updater.mutableStateOf$default(Country.US);
    public final ParcelableSnapshotMutableState _isSubmittable$delegate = Updater.mutableStateOf$default(Boolean.FALSE);

    public final class Saver implements androidx.compose.runtime.saveable.Saver, ScannerView.Callback {
        public static final Saver INSTANCE = new Saver();

        @Override // com.squareup.scannerview.ScannerView.Callback
        public void onComplete(ArrayList arrayList) {
            arrayList.getClass();
        }

        @Override // com.squareup.scannerview.ScannerView.Callback
        public void onError() {
        }

        @Override // com.squareup.scannerview.ScannerView.Callback
        public void onManualError(ManualErrorReason manualErrorReason) {
            manualErrorReason.getClass();
        }

        @Override // com.squareup.scannerview.ScannerView.Callback
        public void onPreviewVisibilityChanged(boolean z, Step step) {
            step.getClass();
        }

        @Override // androidx.compose.runtime.saveable.Saver
        /* renamed from: restore */
        public Object mo380restore(Object obj) {
            List list = (List) obj;
            Clock systemDefaultZone = Clock.systemDefaultZone();
            systemDefaultZone.getClass();
            Object obj2 = list.get(0);
            obj2.getClass();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            Object obj3 = list.get(1);
            obj3.getClass();
            boolean booleanValue2 = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            obj4.getClass();
            String str = (String) obj4;
            Object obj5 = list.get(3);
            obj5.getClass();
            String str2 = (String) obj5;
            Object obj6 = list.get(4);
            obj6.getClass();
            String str3 = (String) obj6;
            Object obj7 = list.get(5);
            obj7.getClass();
            String str4 = (String) obj7;
            Object obj8 = list.get(6);
            obj8.getClass();
            return new CardState(systemDefaultZone, booleanValue2, booleanValue, str, str2, str3, str4, (String) obj8);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaveableHolder saveableHolder, Object obj) {
            CardState cardState = (CardState) obj;
            saveableHolder.getClass();
            cardState.getClass();
            return CollectionsKt__CollectionsKt.listOf(Boolean.valueOf(cardState.get_requireName()), Boolean.valueOf(cardState.get_requirePostalCode()), (String) cardState._name$delegate.getValue(), cardState.get_number(), (String) cardState._expiration$delegate.getValue(), (String) cardState._securityCode$delegate.getValue(), (String) cardState._postalCode$delegate.getValue());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class UpdateResult {
        public static final /* synthetic */ UpdateResult[] $VALUES;
        public static final UpdateResult Invalid;
        public static final UpdateResult ValidComplete;
        public static final UpdateResult ValidNeedsMore;
        public static final UpdateResult ValidSubmittable;

        static {
            UpdateResult updateResult = new UpdateResult("Invalid", 0);
            Invalid = updateResult;
            UpdateResult updateResult2 = new UpdateResult("ValidNeedsMore", 1);
            ValidNeedsMore = updateResult2;
            UpdateResult updateResult3 = new UpdateResult("ValidSubmittable", 2);
            ValidSubmittable = updateResult3;
            UpdateResult updateResult4 = new UpdateResult("ValidComplete", 3);
            ValidComplete = updateResult4;
            $VALUES = new UpdateResult[]{updateResult, updateResult2, updateResult3, updateResult4};
        }

        public static UpdateResult valueOf(String str) {
            return (UpdateResult) Enum.valueOf(UpdateResult.class, str);
        }

        public static UpdateResult[] values() {
            return (UpdateResult[]) $VALUES.clone();
        }

        public final boolean isSubmittable() {
            return this == ValidSubmittable || this == ValidComplete;
        }
    }

    public CardState(Clock clock, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        this.clock = clock;
        this._requirePostalCode$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
        this._requireName$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z2));
        this._name$delegate = Updater.mutableStateOf$default(str);
        this._number$delegate = Updater.mutableStateOf$default(str2);
        this._expiration$delegate = Updater.mutableStateOf$default(str3);
        this._securityCode$delegate = Updater.mutableStateOf$default(str4);
        this._postalCode$delegate = Updater.mutableStateOf$default(str5);
        this._brand$delegate = Updater.mutableStateOf$default(KotlinKPropertyKt.guessBrand(str2));
    }

    public static UpdateResult checkNumber(String str, CardBrandGuesser$Brand cardBrandGuesser$Brand) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!Character.isDigit(str.charAt(i2))) {
                return UpdateResult.Invalid;
            }
        }
        int length = str.length();
        int i3 = cardBrandGuesser$Brand.maxDigits;
        if (length > i3) {
            return UpdateResult.Invalid;
        }
        if (str.length() == i3) {
            Lazy lazy = Luhn.WHITESPACE$delegate;
            String replace = ((Regex) Luhn.WHITESPACE$delegate.getValue()).replace(str.toString(), "");
            boolean z = false;
            for (int length2 = replace.length() - 1; -1 < length2; length2--) {
                char charAt = replace.charAt(length2);
                if (charAt != ' ') {
                    if (Intrinsics.compare((int) charAt, 48) < 0 || Intrinsics.compare((int) charAt, 57) > 0) {
                        i = -1;
                        break;
                    }
                    int i4 = charAt - '0';
                    if (z) {
                        i4 *= 2;
                    }
                    if (i4 > 9) {
                        i4 = (i4 % 10) + 1;
                    }
                    i += i4;
                    z = !z;
                }
            }
            if (i % 10 != 0) {
                return UpdateResult.Invalid;
            }
        }
        return str.length() == i3 ? UpdateResult.ValidComplete : UpdateResult.ValidNeedsMore;
    }

    public static UpdateResult checkSecurityCode(String str, CardBrandGuesser$Brand cardBrandGuesser$Brand) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return UpdateResult.Invalid;
            }
        }
        return str.length() > cardBrandGuesser$Brand.cvvLength ? UpdateResult.Invalid : str.length() == cardBrandGuesser$Brand.cvvLength ? UpdateResult.ValidComplete : UpdateResult.ValidNeedsMore;
    }

    public final UpdateResult checkExpiration(String str) {
        if (str.length() == 0) {
            return UpdateResult.ValidNeedsMore;
        }
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if (!Character.isDigit(str.charAt(i))) {
                    break;
                }
                i++;
            } else if (str.length() <= 4) {
                CharRange charRange = new CharRange('2', '9');
                Character firstOrNull = StringsKt___StringsKt.firstOrNull(str);
                String take = (firstOrNull == null || !charRange.contains(firstOrNull.charValue())) ? StringsKt___StringsKt.take(2, str) : String.valueOf(StringsKt___StringsKt.first(str));
                int parseInt = Integer.parseInt(take);
                if (parseInt > 12) {
                    return UpdateResult.Invalid;
                }
                String substring = str.substring(take.length());
                int length = substring.length();
                if (length != 0 && length != 1) {
                    if (length != 2) {
                        return UpdateResult.Invalid;
                    }
                    YearMonth atMonth = Year.parse(substring, DateTimeFormatter.ofPattern("yy")).atMonth(parseInt);
                    YearMonth now = YearMonth.now(this.clock);
                    return (atMonth.isAfter(now) || atMonth.equals(now)) ? UpdateResult.ValidComplete : UpdateResult.Invalid;
                }
                return UpdateResult.ValidNeedsMore;
            }
        }
        return UpdateResult.Invalid;
    }

    public final UpdateResult checkName(String str) {
        return (get_requireName() || str.length() != 0) ? (get_requireName() || str.length() <= 0) ? str.length() == 0 ? UpdateResult.ValidNeedsMore : UpdateResult.ValidSubmittable : UpdateResult.Invalid : UpdateResult.ValidComplete;
    }

    public final UpdateResult checkPostalCode(String str) {
        int ordinal;
        if (!get_requirePostalCode() && str.length() == 0) {
            return UpdateResult.ValidComplete;
        }
        if ((get_requirePostalCode() || str.length() <= 0) && (ordinal = new PostalCodeValidator((Country) this._postalCountry$delegate.getValue()).validate(str).ordinal()) != 0) {
            if (ordinal == 1) {
                return UpdateResult.ValidNeedsMore;
            }
            if (ordinal == 2) {
                return UpdateResult.ValidComplete;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return UpdateResult.Invalid;
    }

    public final void checkValidity() {
        this._isSubmittable$delegate.setValue(Boolean.valueOf(checkName((String) this._name$delegate.getValue()).isSubmittable() && checkNumber(get_number(), get_brand()).isSubmittable() && checkExpiration((String) this._expiration$delegate.getValue()).isSubmittable() && checkSecurityCode((String) this._securityCode$delegate.getValue(), get_brand()).isSubmittable() && checkPostalCode((String) this._postalCode$delegate.getValue()).isSubmittable()));
    }

    public final CardBrandGuesser$Brand get_brand() {
        return (CardBrandGuesser$Brand) this._brand$delegate.getValue();
    }

    public final String get_number() {
        return (String) this._number$delegate.getValue();
    }

    public final boolean get_requireName() {
        return ((Boolean) this._requireName$delegate.getValue()).booleanValue();
    }

    public final boolean get_requirePostalCode() {
        return ((Boolean) this._requirePostalCode$delegate.getValue()).booleanValue();
    }

    public final UpdateResult setNumber(String str) {
        str.getClass();
        String replace = new Regex("[ -]").replace(str, "");
        CardBrandGuesser$Brand guessBrand = KotlinKPropertyKt.guessBrand(replace);
        UpdateResult checkNumber = checkNumber(replace, guessBrand);
        if (checkNumber != UpdateResult.Invalid) {
            this._number$delegate.setValue(replace);
            this._brand$delegate.setValue(guessBrand);
            checkValidity();
        }
        return checkNumber;
    }
}
