package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.EVConnectorType;
import com.google.android.libraries.places.api.model.FuelPrice$FuelType;
import com.google.android.libraries.places.api.model.OpeningHours$HoursType;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.internal.zzarc;
import com.google.android.libraries.places.internal.zzaso;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzd;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzp;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.firebase.messaging.RemoteMessage;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import com.squareup.cardcustomizations.stampview.Stamp;
import com.squareup.cardcustomizations.stampview.TransformedStamp;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchContinuation;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchInitiationSource;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchType;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchingMetadata;
import com.squareup.cash.account.backend.ManagedAccountFlipDirection;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.screens.AccountsLoadingFailedScreen;
import com.squareup.cash.account.screens.AddAccountScreen;
import com.squareup.cash.account.screens.BusinessInfoScreen;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.account.screens.SwitchFullAccountLoadingScreen;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzb implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzb(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e9 A[LOOP:1: B:81:0x02e7->B:82:0x02e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0307  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        int i;
        String readString;
        int i2;
        int readInt;
        int i3;
        int i4;
        int i5 = 0;
        switch (this.$r8$classId) {
            case 0:
                return new zza((PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader()), parcel.readInt() != 0);
            case 1:
                String readString2 = parcel.readString();
                readString2.getClass();
                return DayOfWeek.valueOf(readString2);
            case 2:
                String readString3 = parcel.readString();
                readString3.getClass();
                return EVConnectorType.valueOf(readString3);
            case 3:
                String readString4 = parcel.readString();
                readString4.getClass();
                return FuelPrice$FuelType.valueOf(readString4);
            case 4:
                String readString5 = parcel.readString();
                readString5.getClass();
                return OpeningHours$HoursType.valueOf(readString5);
            case 5:
                String readString6 = parcel.readString();
                readString6.getClass();
                return Place.BooleanPlaceAttributeValue.valueOf(readString6);
            case 6:
                String readString7 = parcel.readString();
                readString7.getClass();
                return Place.BusinessStatus.valueOf(readString7);
            case 7:
                String readString8 = parcel.readString();
                readString8.getClass();
                return Place.Field.valueOf(readString8);
            case 8:
                parcel.getClass();
                return new zzd(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                parcel.getClass();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                while (i5 != readInt2) {
                    i5 = CameraState$Type$EnumUnboxingLocalUtility.m(zzd.CREATOR, parcel, arrayList, i5, 1);
                }
                return new zzp(arrayList);
            case 10:
                parcel.getClass();
                String readString9 = parcel.readString();
                if (readString9 != null) {
                    if (readString9.equals("VARIANT_UNDEFINED")) {
                        i = 1;
                    } else if (readString9.equals("VARIANT_COMPACT")) {
                        i = 2;
                    } else if (readString9.equals("VARIANT_FULL")) {
                        i = 3;
                    } else {
                        if (readString9.equals("VARIANT_COMPACT_ADVANCED")) {
                            i4 = 4;
                        } else if (readString9.equals("VARIANT_FULL_ADVANCED")) {
                            i4 = 5;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.google.android.libraries.places.internal.zzarg.".concat(readString9));
                        }
                        i = i4;
                    }
                    readString = parcel.readString();
                    if (readString == null) {
                        if (readString.equals("PLACE_WIDGET_ORIENTATION_UNSPECIFIED")) {
                            i2 = 1;
                        } else if (readString.equals("VERTICAL")) {
                            i2 = 2;
                        } else if (readString.equals("HORIZONTAL")) {
                            i2 = 3;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.google.android.libraries.places.internal.zzasw.".concat(readString));
                        }
                        readInt = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt);
                        for (i3 = 0; i3 != readInt; i3++) {
                            arrayList2.add((zzarc) Enum.valueOf(zzarc.class, parcel.readString()));
                        }
                        return new com.google.android.libraries.places.widget.internal.placedetails.zzb(i, i2, arrayList2, parcel.readInt(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (zzaso) parcel.readValue(com.google.android.libraries.places.widget.internal.placedetails.zzb.class.getClassLoader()), (zzaso) parcel.readValue(com.google.android.libraries.places.widget.internal.placedetails.zzb.class.getClassLoader()));
                    }
                    a$$ExternalSyntheticBUOutline0.m$2("Name is null");
                    i2 = 0;
                    readInt = parcel.readInt();
                    ArrayList arrayList22 = new ArrayList(readInt);
                    while (i3 != readInt) {
                    }
                    if (parcel.readInt() == 0) {
                    }
                    return new com.google.android.libraries.places.widget.internal.placedetails.zzb(i, i2, arrayList22, parcel.readInt(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (zzaso) parcel.readValue(com.google.android.libraries.places.widget.internal.placedetails.zzb.class.getClassLoader()), (zzaso) parcel.readValue(com.google.android.libraries.places.widget.internal.placedetails.zzb.class.getClassLoader()));
                }
                a$$ExternalSyntheticBUOutline0.m$2("Name is null");
                i = 0;
                readString = parcel.readString();
                if (readString == null) {
                }
                i2 = 0;
                readInt = parcel.readInt();
                ArrayList arrayList222 = new ArrayList(readInt);
                while (i3 != readInt) {
                }
                if (parcel.readInt() == 0) {
                }
                return new com.google.android.libraries.places.widget.internal.placedetails.zzb(i, i2, arrayList222, parcel.readInt(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (zzaso) parcel.readValue(com.google.android.libraries.places.widget.internal.placedetails.zzb.class.getClassLoader()), (zzaso) parcel.readValue(com.google.android.libraries.places.widget.internal.placedetails.zzb.class.getClassLoader()));
            case 11:
                MaterialCheckBox.SavedState savedState = new MaterialCheckBox.SavedState(parcel);
                savedState.checkedState = ((Integer) parcel.readValue(MaterialCheckBox.SavedState.class.getClassLoader())).intValue();
                return savedState;
            case 12:
                return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (CalendarConstraints.DateValidator) parcel.readParcelable(CalendarConstraints.DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
            case 13:
                return new DateValidatorPointForward(parcel.readLong());
            case 14:
                return Month.create(parcel.readInt(), parcel.readInt());
            case 15:
                SingleDateSelector singleDateSelector = new SingleDateSelector();
                singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
                return singleDateSelector;
            case 16:
                Bundle bundle = null;
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readInt3);
                    } else {
                        bundle = ComposeUtilsKt.createBundle(parcel, readInt3);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new RemoteMessage(bundle);
            case 17:
                parcel.getClass();
                return new LocationSearchClient$SessionId$GoogleSessionId((zzdi) parcel.readParcelable(LocationSearchClient$SessionId$GoogleSessionId.class.getClassLoader()));
            case 18:
                parcel.getClass();
                String readString10 = parcel.readString();
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new SearchLocation(readString10, (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel));
            case 19:
                parcel.getClass();
                String readString11 = parcel.readString();
                readString11.getClass();
                String readString12 = parcel.readString();
                readString12.getClass();
                Stamp stamp = new Stamp(readString11, readString12);
                float[] fArr = new float[9];
                parcel.readFloatArray(fArr);
                Matrix matrix = new Matrix();
                matrix.setValues(fArr);
                float readFloat = parcel.readFloat();
                float[] fArr2 = new float[9];
                parcel.readFloatArray(fArr2);
                Matrix matrix2 = new Matrix();
                matrix2.setValues(fArr2);
                return new TransformedStamp(stamp, matrix, readFloat, matrix2, parcel.readInt());
            case 20:
                parcel.getClass();
                return new AccountSwitcher$AccountSwitchContinuation(parcel.readString(), AccountSwitcher$AccountSwitchInitiationSource.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readLong(), (TargetDestination) parcel.readParcelable(AccountSwitcher$AccountSwitchContinuation.class.getClassLoader()));
            case 21:
                parcel.getClass();
                return new AccountSwitcher$AccountSwitchingMetadata(parcel.readString(), parcel.readString(), (Redacted) parcel.readParcelable(AccountSwitcher$AccountSwitchingMetadata.class.getClassLoader()), parcel.readInt() == 0 ? null : AccountSwitcher$AccountSwitchingMetadata.SwitchSource.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() == 0 ? null : AccountSwitcher$AccountSwitchInitiationSource.valueOf(parcel.readString()), parcel.readInt() != 0 ? AccountSwitcher$AccountSwitchType.valueOf(parcel.readString()) : null, parcel.readString());
            case 22:
                parcel.getClass();
                parcel.readInt();
                return Account.INSTANCE;
            case 23:
                parcel.getClass();
                return new AccountSwitcherScreen(AccountSwitchAccountViewSwitcher.Entrypoint.valueOf(parcel.readString()), (Screen) parcel.readParcelable(AccountSwitcherScreen.class.getClassLoader()), (TargetDestination) parcel.readParcelable(AccountSwitcherScreen.class.getClassLoader()));
            case 24:
                parcel.getClass();
                parcel.readInt();
                return AccountsLoadingFailedScreen.INSTANCE;
            case 25:
                parcel.getClass();
                return new AddAccountScreen((Screen) parcel.readParcelable(AddAccountScreen.class.getClassLoader()));
            case 26:
                parcel.getClass();
                parcel.readInt();
                return BusinessInfoScreen.INSTANCE;
            case 27:
                parcel.getClass();
                parcel.readInt();
                return EditProfile.INSTANCE;
            case 28:
                parcel.getClass();
                return new ManagedAccountAnimationInfo(parcel.readString(), ManagedAccountFlipDirection.valueOf(parcel.readString()));
            default:
                parcel.getClass();
                return new SwitchFullAccountLoadingScreen((FullAccount) parcel.readParcelable(SwitchFullAccountLoadingScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), (TargetDestination) parcel.readParcelable(SwitchFullAccountLoadingScreen.class.getClassLoader()), AccountSwitcher$AccountSwitchInitiationSource.valueOf(parcel.readString()), parcel.readInt() != 0 ? ManagedAccountAnimationInfo.CREATOR.createFromParcel(parcel) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new ReviewInfo[i];
            case 1:
                return new DayOfWeek[i];
            case 2:
                return new EVConnectorType[i];
            case 3:
                return new FuelPrice$FuelType[i];
            case 4:
                return new OpeningHours$HoursType[i];
            case 5:
                return new Place.BooleanPlaceAttributeValue[i];
            case 6:
                return new Place.BusinessStatus[i];
            case 7:
                return new Place.Field[i];
            case 8:
                return new zzd[i];
            case 9:
                return new zzp[i];
            case 10:
                return new com.google.android.libraries.places.widget.internal.placedetails.zzb[i];
            case 11:
                return new MaterialCheckBox.SavedState[i];
            case 12:
                return new CalendarConstraints[i];
            case 13:
                return new DateValidatorPointForward[i];
            case 14:
                return new Month[i];
            case 15:
                return new SingleDateSelector[i];
            case 16:
                return new RemoteMessage[i];
            case 17:
                return new LocationSearchClient$SessionId$GoogleSessionId[i];
            case 18:
                return new SearchLocation[i];
            case 19:
                return new TransformedStamp[i];
            case 20:
                return new AccountSwitcher$AccountSwitchContinuation[i];
            case 21:
                return new AccountSwitcher$AccountSwitchingMetadata[i];
            case 22:
                return new Account[i];
            case 23:
                return new AccountSwitcherScreen[i];
            case 24:
                return new AccountsLoadingFailedScreen[i];
            case 25:
                return new AddAccountScreen[i];
            case 26:
                return new BusinessInfoScreen[i];
            case 27:
                return new EditProfile[i];
            case 28:
                return new ManagedAccountAnimationInfo[i];
            default:
                return new SwitchFullAccountLoadingScreen[i];
        }
    }
}
