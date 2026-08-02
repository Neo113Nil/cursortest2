package s3;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4973d implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f40537n;

    public C4973d(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f40537n = materialButtonToggleGroup;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int compareTo = Boolean.valueOf(materialButton.f36660H).compareTo(Boolean.valueOf(materialButton2.f36660H));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f40537n;
        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
    }
}
