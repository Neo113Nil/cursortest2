package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.MaterialDatePicker;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public abstract class PickerFragment extends Fragment {
    public final LinkedHashSet onSelectionChangedListeners = new LinkedHashSet();

    public void addOnSelectionChangedListener(MaterialDatePicker.AnonymousClass2 anonymousClass2) {
        this.onSelectionChangedListeners.add(anonymousClass2);
    }
}
