package com.google.android.gms.internal.mlkit_vision_barcode;

import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class zzuh {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentAfterpayMonthlyStatement.deepLinkSpecs;
    }

    public static final SchedulingTime getSelectedTime(SchedulingDayTimePickerViewModel.ModelState modelState) {
        modelState.getClass();
        SchedulingDayTimePickerViewModel.ModelState.LoadedDays loadedDays = modelState instanceof SchedulingDayTimePickerViewModel.ModelState.LoadedDays ? (SchedulingDayTimePickerViewModel.ModelState.LoadedDays) modelState : null;
        if (loadedDays != null) {
            SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState timesState = loadedDays.timesState;
            SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadedTimes loadedTimes = timesState instanceof SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadedTimes ? (SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadedTimes) timesState : null;
            if (loadedTimes != null) {
                return loadedTimes.selectedTime;
            }
        }
        return null;
    }
}
