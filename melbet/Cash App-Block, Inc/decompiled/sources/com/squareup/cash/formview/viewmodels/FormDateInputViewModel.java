package com.squareup.cash.formview.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FormDateInputViewModel {
    public final SimpleDateFormat dateFormat;
    public final SubmitFormRequest.ElementResult.DateInputResult dateInputResult;
    public final String defaultText;
    public final String formattingMask;
    public final String hint;
    public final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status OUT_OF_RANGE;
        public static final Status VALID;
        public static final Status WAITING_FOR_INPUT;

        static {
            Status status = new Status("WAITING_FOR_INPUT", 0);
            WAITING_FOR_INPUT = status;
            Status status2 = new Status("OUT_OF_RANGE", 1);
            OUT_OF_RANGE = status2;
            Status status3 = new Status("VALID", 2);
            VALID = status3;
            $VALUES = new Status[]{status, status2, status3};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public FormDateInputViewModel(SimpleDateFormat simpleDateFormat, String str, String str2, String str3, Status status, SubmitFormRequest.ElementResult.DateInputResult dateInputResult) {
        str.getClass();
        this.dateFormat = simpleDateFormat;
        this.hint = str;
        this.formattingMask = str2;
        this.defaultText = str3;
        this.status = status;
        this.dateInputResult = dateInputResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormDateInputViewModel)) {
            return false;
        }
        FormDateInputViewModel formDateInputViewModel = (FormDateInputViewModel) obj;
        return this.dateFormat.equals(formDateInputViewModel.dateFormat) && Intrinsics.areEqual(this.hint, formDateInputViewModel.hint) && this.formattingMask.equals(formDateInputViewModel.formattingMask) && Intrinsics.areEqual(this.defaultText, formDateInputViewModel.defaultText) && this.status == formDateInputViewModel.status && Intrinsics.areEqual(this.dateInputResult, formDateInputViewModel.dateInputResult);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.dateFormat.hashCode() * 31, 31, this.hint), 31, this.formattingMask);
        String str = this.defaultText;
        int hashCode = (this.status.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        SubmitFormRequest.ElementResult.DateInputResult dateInputResult = this.dateInputResult;
        return hashCode + (dateInputResult != null ? dateInputResult.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormDateInputViewModel(dateFormat=");
        sb.append(this.dateFormat);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", formattingMask=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.formattingMask, ", defaultText=", this.defaultText, ", status=");
        sb.append(this.status);
        sb.append(", dateInputResult=");
        sb.append(this.dateInputResult);
        sb.append(")");
        return sb.toString();
    }
}
