package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class uho extends lgu {
    public final HashMap M0;

    public uho(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M0 = new HashMap();
    }

    @Override // defpackage.lgu
    public final void b(xfu xfuVar) {
        tho thoVar = new tho(this, xfuVar);
        this.M0.put(xfuVar, thoVar);
        super.b(thoVar);
    }

    @Override // defpackage.lgu
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !wyf.N(this)) ? currentItem : (r1.b() - currentItem) - 1;
    }

    @Override // defpackage.lgu
    public void setCurrentItem(int i) {
        h2k adapter = super.getAdapter();
        if (adapter != null && wyf.N(this)) {
            i = (adapter.b() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    @Override // defpackage.lgu
    public final void u(xfu xfuVar) {
        tho thoVar = (tho) this.M0.remove(xfuVar);
        if (thoVar != null) {
            super.u(thoVar);
        }
    }

    @Override // defpackage.lgu
    public final void x(int i, boolean z) {
        h2k adapter = super.getAdapter();
        if (adapter != null && wyf.N(this)) {
            i = (adapter.b() - i) - 1;
        }
        super.x(i, z);
    }
}
