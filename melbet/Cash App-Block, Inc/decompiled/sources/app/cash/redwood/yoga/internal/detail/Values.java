package app.cash.redwood.yoga.internal.detail;

import app.cash.redwood.yoga.internal.YGValue;
import com.squareup.protos.cash.cashsuggest.api.Section;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Values {
    public final ArrayList values_;

    public Values(YGValue yGValue) {
        ArrayList arrayList = new ArrayList();
        this.values_ = arrayList;
        arrayList.add(Section.Content.createCompactValue(yGValue));
    }

    public final YGValue get(int i) {
        while (true) {
            ArrayList arrayList = this.values_;
            if (arrayList.size() >= i + 1) {
                return ((CompactValue) arrayList.get(i)).convertToYgValue();
            }
            arrayList.add(new CompactValue());
        }
    }

    public final CompactValue getCompactValue(int i) {
        while (true) {
            ArrayList arrayList = this.values_;
            if (arrayList.size() >= i + 1) {
                return Section.Content.createCompactValue(((CompactValue) arrayList.get(i)).convertToYgValue());
            }
            arrayList.add(new CompactValue());
        }
    }

    public Values() {
        this.values_ = new ArrayList();
    }
}
