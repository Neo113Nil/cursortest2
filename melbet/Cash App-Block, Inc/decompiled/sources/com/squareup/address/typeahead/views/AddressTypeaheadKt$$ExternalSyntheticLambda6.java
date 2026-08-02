package com.squareup.address.typeahead.views;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class AddressTypeaheadKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AddressTypeaheadState f$0;

    public /* synthetic */ AddressTypeaheadKt$$ExternalSyntheticLambda6(AddressTypeaheadState addressTypeaheadState, int i) {
        this.$r8$classId = i;
        this.f$0 = addressTypeaheadState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String take;
        int i = this.$r8$classId;
        AddressTypeaheadState addressTypeaheadState = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                addressTypeaheadState.getClass();
                addressTypeaheadState.streetAddressLine2$delegate.setValue(str);
                break;
            case 1:
                str.getClass();
                addressTypeaheadState.getClass();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = addressTypeaheadState.postalCode$delegate;
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                int ordinal = addressTypeaheadState.postalCodeValidator.validate(upperCase).ordinal();
                if (ordinal == 0) {
                    int i2 = AddressTypeaheadState.WhenMappings.$EnumSwitchMapping$0[addressTypeaheadState.countryCode.ordinal()];
                    int i3 = 0;
                    if (i2 == 2) {
                        StringBuilder sb = new StringBuilder();
                        int length = upperCase.length();
                        while (i3 < length) {
                            char charAt = upperCase.charAt(i3);
                            if (Character.isLetterOrDigit(charAt)) {
                                sb.append(charAt);
                            }
                            i3++;
                        }
                        take = StringsKt___StringsKt.take(6, sb.toString());
                    } else if (i2 == 3 || i2 == 4) {
                        StringBuilder sb2 = new StringBuilder();
                        int length2 = upperCase.length();
                        while (i3 < length2) {
                            char charAt2 = upperCase.charAt(i3);
                            if (Character.isLetterOrDigit(charAt2)) {
                                sb2.append(charAt2);
                            }
                            i3++;
                        }
                        take = StringsKt___StringsKt.take(7, sb2.toString());
                    } else if (i2 != 6) {
                        StringBuilder sb3 = new StringBuilder();
                        int length3 = upperCase.length();
                        while (i3 < length3) {
                            char charAt3 = upperCase.charAt(i3);
                            if (Character.isDigit(charAt3)) {
                                sb3.append(charAt3);
                            }
                            i3++;
                        }
                        take = StringsKt___StringsKt.take(5, sb3.toString());
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        int length4 = upperCase.length();
                        while (i3 < length4) {
                            char charAt4 = upperCase.charAt(i3);
                            if (Character.isDigit(charAt4)) {
                                sb4.append(charAt4);
                            }
                            i3++;
                        }
                        take = StringsKt___StringsKt.take(5, sb4.toString());
                    }
                    parcelableSnapshotMutableState.setValue(take);
                    addressTypeaheadState.setManuallyEdited(true);
                } else if (ordinal != 1 && ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    parcelableSnapshotMutableState.setValue(upperCase);
                    addressTypeaheadState.setManuallyEdited(true);
                }
                break;
            case 2:
                str.getClass();
                addressTypeaheadState.getClass();
                addressTypeaheadState.state$delegate.setValue(str);
                addressTypeaheadState.setManuallyEdited(true);
                break;
            default:
                str.getClass();
                addressTypeaheadState.getClass();
                addressTypeaheadState.city$delegate.setValue(str);
                addressTypeaheadState.setManuallyEdited(true);
                break;
        }
        return Unit.INSTANCE;
    }
}
