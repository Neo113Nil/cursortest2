package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class uj4 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    public final /* synthetic */ vj4 b;

    public uj4(vj4 vj4Var) {
        this.b = vj4Var;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        vj4 vj4Var = this.b;
        if (view == vj4Var && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            dj4 dj4Var = vj4Var.h;
            Chip chip = (Chip) view2;
            ((HashMap) dj4Var.c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                dj4Var.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new znk(13, dj4Var));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        vj4 vj4Var = this.b;
        if (view == vj4Var && (view2 instanceof Chip)) {
            dj4 dj4Var = vj4Var.h;
            Chip chip = (Chip) view2;
            dj4Var.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) dj4Var.c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) dj4Var.d).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
