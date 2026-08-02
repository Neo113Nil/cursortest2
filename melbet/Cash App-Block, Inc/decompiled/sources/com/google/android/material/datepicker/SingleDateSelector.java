package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.review.zzb;
import com.squareup.cash.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class SingleDateSelector implements Parcelable {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new zzb(15);
    public Long selectedItem;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$1, reason: invalid class name */
    public final class AnonymousClass1 extends TextWatcherAdapter {
        public final CalendarConstraints constraints;
        public final SimpleDateFormat dateFormat;
        public final String formatHint;
        public int lastLength = 0;
        public final String outOfRange;
        public final q4$$ExternalSyntheticLambda0 setErrorCallback;
        public DateFormatTextWatcher$$ExternalSyntheticLambda1 setRangeErrorCallback;
        public final TextInputLayout textInputLayout;
        public final /* synthetic */ TextInputLayout val$dateTextInput;
        public final /* synthetic */ MaterialDatePicker.AnonymousClass2 val$listener;

        public AnonymousClass1(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, MaterialDatePicker.AnonymousClass2 anonymousClass2, TextInputLayout textInputLayout2) {
            this.val$listener = anonymousClass2;
            this.val$dateTextInput = textInputLayout2;
            this.formatHint = str;
            this.dateFormat = simpleDateFormat;
            this.textInputLayout = textInputLayout;
            this.constraints = calendarConstraints;
            this.outOfRange = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
            this.setErrorCallback = new q4$$ExternalSyntheticLambda0(27, this, str);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
                return;
            }
            int length = editable.length();
            String str = this.formatHint;
            if (length >= str.length() || editable.length() < this.lastLength) {
                return;
            }
            char charAt = str.charAt(editable.length());
            if (Character.isLetterOrDigit(charAt)) {
                return;
            }
            editable.append(charAt);
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.lastLength = charSequence.length();
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CalendarConstraints calendarConstraints = this.constraints;
            TextInputLayout textInputLayout = this.textInputLayout;
            q4$$ExternalSyntheticLambda0 q4__externalsyntheticlambda0 = this.setErrorCallback;
            textInputLayout.removeCallbacks(q4__externalsyntheticlambda0);
            textInputLayout.removeCallbacks(this.setRangeErrorCallback);
            textInputLayout.setError(null);
            SingleDateSelector singleDateSelector = SingleDateSelector.this;
            singleDateSelector.selectedItem = null;
            singleDateSelector.getClass();
            Long l = singleDateSelector.selectedItem;
            MaterialDatePicker.AnonymousClass2 anonymousClass2 = this.val$listener;
            anonymousClass2.onSelectionChanged(l);
            if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.formatHint.length()) {
                return;
            }
            try {
                Date parse = this.dateFormat.parse(charSequence.toString());
                textInputLayout.setError(null);
                long time = parse.getTime();
                if (calendarConstraints.validator.isValid(time)) {
                    Calendar dayCopy = UtcDates.getDayCopy(calendarConstraints.start.firstOfMonth);
                    dayCopy.set(5, 1);
                    if (dayCopy.getTimeInMillis() <= time) {
                        Month month = calendarConstraints.end;
                        int i4 = month.daysInMonth;
                        Calendar dayCopy2 = UtcDates.getDayCopy(month.firstOfMonth);
                        dayCopy2.set(5, i4);
                        if (time <= dayCopy2.getTimeInMillis()) {
                            singleDateSelector.selectedItem = Long.valueOf(parse.getTime());
                            singleDateSelector.getClass();
                            anonymousClass2.onSelectionChanged(singleDateSelector.selectedItem);
                            return;
                        }
                    }
                }
                DateFormatTextWatcher$$ExternalSyntheticLambda1 dateFormatTextWatcher$$ExternalSyntheticLambda1 = new DateFormatTextWatcher$$ExternalSyntheticLambda1(this, time, 0);
                this.setRangeErrorCallback = dateFormatTextWatcher$$ExternalSyntheticLambda1;
                textInputLayout.post(dateFormatTextWatcher$$ExternalSyntheticLambda1);
            } catch (ParseException unused) {
                textInputLayout.post(q4__externalsyntheticlambda0);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ArrayList getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedItem;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedItem);
    }
}
