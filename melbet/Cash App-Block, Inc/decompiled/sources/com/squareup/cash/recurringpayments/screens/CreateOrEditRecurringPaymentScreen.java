package com.squareup.cash.recurringpayments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CreateOrEditRecurringPaymentScreen implements BlockersScreens, BottomSheetScreen {
    public static final Parcelable.Creator<CreateOrEditRecurringPaymentScreen> CREATOR = new Creator();
    public final List amountOptions;
    public final BlockersData blockersData;
    public final RecurringPaymentBlocker.CadenceMenu cadenceMenu;
    public final CurrencyCode currencyCode;
    public final List enumerated_cadences;
    public final Screen exitScreen;
    public final Long maxAmountInCents;
    public final Long minAmountInCents;
    public final RecurringPaymentBlocker.Button primaryButton;
    public final RecurringPaymentBlocker.Button secondaryButton;
    public final RecurringPaymentBlocker.Schedule selectedSchedule;
    public final boolean shouldForceExpand;
    public final String title;

    /* loaded from: classes8.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BlockersData blockersData = (BlockersData) NavAction$$ExternalSyntheticOutline0.m(parcel, CreateOrEditRecurringPaymentScreen.class);
            String readString = parcel.readString();
            RecurringPaymentBlocker.Schedule schedule = (RecurringPaymentBlocker.Schedule) parcel.readParcelable(CreateOrEditRecurringPaymentScreen.class.getClassLoader());
            RecurringPaymentBlocker.CadenceMenu cadenceMenu = (RecurringPaymentBlocker.CadenceMenu) parcel.readParcelable(CreateOrEditRecurringPaymentScreen.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = CameraState$Type$EnumUnboxingLocalUtility.m(CreateOrEditRecurringPaymentScreen.class, parcel, arrayList, i, 1);
            }
            RecurringPaymentBlocker.Button button = (RecurringPaymentBlocker.Button) parcel.readParcelable(CreateOrEditRecurringPaymentScreen.class.getClassLoader());
            RecurringPaymentBlocker.Button button2 = (RecurringPaymentBlocker.Button) parcel.readParcelable(CreateOrEditRecurringPaymentScreen.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = CameraState$Type$EnumUnboxingLocalUtility.m(CreateOrEditRecurringPaymentScreen.class, parcel, arrayList2, i2, 1);
            }
            return new CreateOrEditRecurringPaymentScreen(blockersData, readString, schedule, cadenceMenu, arrayList, button, button2, arrayList2, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, CurrencyCode.valueOf(parcel.readString()), parcel.readInt() != 0, (Screen) parcel.readParcelable(CreateOrEditRecurringPaymentScreen.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreateOrEditRecurringPaymentScreen[i];
        }
    }

    public CreateOrEditRecurringPaymentScreen(BlockersData blockersData, String str, RecurringPaymentBlocker.Schedule schedule, RecurringPaymentBlocker.CadenceMenu cadenceMenu, List list, RecurringPaymentBlocker.Button button, RecurringPaymentBlocker.Button button2, List list2, Long l, Long l2, CurrencyCode currencyCode, boolean z, Screen screen) {
        blockersData.getClass();
        cadenceMenu.getClass();
        list.getClass();
        list2.getClass();
        currencyCode.getClass();
        this.blockersData = blockersData;
        this.title = str;
        this.selectedSchedule = schedule;
        this.cadenceMenu = cadenceMenu;
        this.amountOptions = list;
        this.primaryButton = button;
        this.secondaryButton = button2;
        this.enumerated_cadences = list2;
        this.minAmountInCents = l;
        this.maxAmountInCents = l2;
        this.currencyCode = currencyCode;
        this.shouldForceExpand = z;
        this.exitScreen = screen;
    }

    public static CreateOrEditRecurringPaymentScreen copy$default(CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen, RecurringPaymentBlocker.Schedule schedule, ArrayList arrayList, boolean z, int i) {
        BlockersData blockersData = createOrEditRecurringPaymentScreen.blockersData;
        String str = createOrEditRecurringPaymentScreen.title;
        RecurringPaymentBlocker.Schedule schedule2 = (i & 4) != 0 ? createOrEditRecurringPaymentScreen.selectedSchedule : schedule;
        RecurringPaymentBlocker.CadenceMenu cadenceMenu = createOrEditRecurringPaymentScreen.cadenceMenu;
        List list = (i & 16) != 0 ? createOrEditRecurringPaymentScreen.amountOptions : arrayList;
        RecurringPaymentBlocker.Button button = createOrEditRecurringPaymentScreen.primaryButton;
        RecurringPaymentBlocker.Button button2 = createOrEditRecurringPaymentScreen.secondaryButton;
        List list2 = createOrEditRecurringPaymentScreen.enumerated_cadences;
        Long l = createOrEditRecurringPaymentScreen.minAmountInCents;
        Long l2 = createOrEditRecurringPaymentScreen.maxAmountInCents;
        CurrencyCode currencyCode = createOrEditRecurringPaymentScreen.currencyCode;
        boolean z2 = (i & 2048) != 0 ? createOrEditRecurringPaymentScreen.shouldForceExpand : z;
        Screen screen = createOrEditRecurringPaymentScreen.exitScreen;
        createOrEditRecurringPaymentScreen.getClass();
        blockersData.getClass();
        cadenceMenu.getClass();
        list.getClass();
        list2.getClass();
        currencyCode.getClass();
        return new CreateOrEditRecurringPaymentScreen(blockersData, str, schedule2, cadenceMenu, list, button, button2, list2, l, l2, currencyCode, z2, screen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrEditRecurringPaymentScreen)) {
            return false;
        }
        CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen = (CreateOrEditRecurringPaymentScreen) obj;
        return Intrinsics.areEqual(this.blockersData, createOrEditRecurringPaymentScreen.blockersData) && Intrinsics.areEqual(this.title, createOrEditRecurringPaymentScreen.title) && Intrinsics.areEqual(this.selectedSchedule, createOrEditRecurringPaymentScreen.selectedSchedule) && Intrinsics.areEqual(this.cadenceMenu, createOrEditRecurringPaymentScreen.cadenceMenu) && Intrinsics.areEqual(this.amountOptions, createOrEditRecurringPaymentScreen.amountOptions) && Intrinsics.areEqual(this.primaryButton, createOrEditRecurringPaymentScreen.primaryButton) && Intrinsics.areEqual(this.secondaryButton, createOrEditRecurringPaymentScreen.secondaryButton) && Intrinsics.areEqual(this.enumerated_cadences, createOrEditRecurringPaymentScreen.enumerated_cadences) && Intrinsics.areEqual(this.minAmountInCents, createOrEditRecurringPaymentScreen.minAmountInCents) && Intrinsics.areEqual(this.maxAmountInCents, createOrEditRecurringPaymentScreen.maxAmountInCents) && this.currencyCode == createOrEditRecurringPaymentScreen.currencyCode && this.shouldForceExpand == createOrEditRecurringPaymentScreen.shouldForceExpand && Intrinsics.areEqual(this.exitScreen, createOrEditRecurringPaymentScreen.exitScreen);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int hashCode = this.blockersData.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RecurringPaymentBlocker.Schedule schedule = this.selectedSchedule;
        int m = Recorder$$ExternalSyntheticOutline2.m((this.cadenceMenu.hashCode() + ((hashCode2 + (schedule == null ? 0 : schedule.hashCode())) * 31)) * 31, 31, this.amountOptions);
        RecurringPaymentBlocker.Button button = this.primaryButton;
        int hashCode3 = (m + (button == null ? 0 : button.hashCode())) * 31;
        RecurringPaymentBlocker.Button button2 = this.secondaryButton;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (button2 == null ? 0 : button2.hashCode())) * 31, 31, this.enumerated_cadences);
        Long l = this.minAmountInCents;
        int hashCode4 = (m2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.maxAmountInCents;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.currencyCode.hashCode() + ((hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31, 31, this.shouldForceExpand);
        Screen screen = this.exitScreen;
        return m3 + (screen != null ? screen.hashCode() : 0);
    }

    public final boolean isCreate() {
        RecurringPaymentBlocker.Button button = this.primaryButton;
        RecurringPaymentBlocker.Button.Action action = button != null ? button.action : null;
        RecurringPaymentBlocker.Button.Action action2 = RecurringPaymentBlocker.Button.Action.DELETE;
        if (action == action2) {
            return false;
        }
        RecurringPaymentBlocker.Button button2 = this.secondaryButton;
        return (button2 != null ? button2.action : null) != action2;
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "CreateOrEditRecurringPaymentScreen(blockersData=", ", title=", this.title, ", selectedSchedule=");
        m.append(this.selectedSchedule);
        m.append(", cadenceMenu=");
        m.append(this.cadenceMenu);
        m.append(", amountOptions=");
        m.append(this.amountOptions);
        m.append(", primaryButton=");
        m.append(this.primaryButton);
        m.append(", secondaryButton=");
        m.append(this.secondaryButton);
        m.append(", enumerated_cadences=");
        m.append(this.enumerated_cadences);
        m.append(", minAmountInCents=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.minAmountInCents, ", maxAmountInCents=", this.maxAmountInCents, ", currencyCode=");
        m.append(this.currencyCode);
        m.append(", shouldForceExpand=");
        m.append(this.shouldForceExpand);
        m.append(", exitScreen=");
        m.append(this.exitScreen);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.selectedSchedule, i);
        parcel.writeParcelable(this.cadenceMenu, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.amountOptions, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.primaryButton, i);
        parcel.writeParcelable(this.secondaryButton, i);
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.enumerated_cadences, parcel);
        while (m2.hasNext()) {
            parcel.writeParcelable((Parcelable) m2.next(), i);
        }
        Long l = this.minAmountInCents;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        Long l2 = this.maxAmountInCents;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l2);
        }
        parcel.writeString(this.currencyCode.name());
        parcel.writeInt(this.shouldForceExpand ? 1 : 0);
        parcel.writeParcelable(this.exitScreen, i);
    }
}
