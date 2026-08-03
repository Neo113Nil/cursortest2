package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: FillableData.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/autofill/AndroidFillableData;", "Landroidx/compose/ui/autofill/FillableData;", "autofillValue", "Landroid/view/autofill/AutofillValue;", "<init>", "(Landroid/view/autofill/AutofillValue;)V", "getAutofillValue$ui", "()Landroid/view/autofill/AutofillValue;", "textValue", "", "getTextValue", "()Ljava/lang/CharSequence;", "booleanValue", "", "getBooleanValue", "()Ljava/lang/Boolean;", "listIndexValue", "", "getListIndexValue", "()Ljava/lang/Integer;", "getListIndexOrDefault", "defaultValue", "dateMillisValue", "", "getDateMillisValue", "()Ljava/lang/Long;", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class AndroidFillableData implements FillableData {
    public static final int $stable = 8;
    private final AutofillValue autofillValue;

    @Override // androidx.compose.ui.autofill.FillableData
    public /* synthetic */ long getDateMillisOrDefault(long j) {
        return FillableData.CC.$default$getDateMillisOrDefault(this, j);
    }

    public AndroidFillableData(AutofillValue autofillValue) {
        this.autofillValue = autofillValue;
    }

    /* renamed from: getAutofillValue$ui, reason: from getter */
    public final AutofillValue getAutofillValue() {
        return this.autofillValue;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public CharSequence getTextValue() {
        boolean isText;
        CharSequence textValue;
        isText = this.autofillValue.isText();
        if (!isText) {
            return null;
        }
        textValue = this.autofillValue.getTextValue();
        return textValue;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Boolean getBooleanValue() {
        boolean isToggle;
        boolean toggleValue;
        isToggle = this.autofillValue.isToggle();
        if (!isToggle) {
            return null;
        }
        toggleValue = this.autofillValue.getToggleValue();
        return Boolean.valueOf(toggleValue);
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Integer getListIndexValue() {
        boolean isList;
        int listValue;
        isList = this.autofillValue.isList();
        if (!isList) {
            return null;
        }
        listValue = this.autofillValue.getListValue();
        return Integer.valueOf(listValue);
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public int getListIndexOrDefault(int defaultValue) {
        boolean isList;
        int listValue;
        isList = this.autofillValue.isList();
        if (!isList) {
            return defaultValue;
        }
        listValue = this.autofillValue.getListValue();
        return listValue;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Long getDateMillisValue() {
        boolean isDate;
        long dateValue;
        isDate = this.autofillValue.isDate();
        if (!isDate) {
            return null;
        }
        dateValue = this.autofillValue.getDateValue();
        return Long.valueOf(dateValue);
    }
}
