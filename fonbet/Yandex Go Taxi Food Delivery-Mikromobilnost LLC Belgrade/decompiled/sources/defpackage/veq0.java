package defpackage;

import android.content.Context;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.i;
import com.yandex.div.internal.widget.SelectView$PopupWindow$PopupAdapter;

/* loaded from: classes.dex */
public final class veq0 extends i {
    public final Context T;
    public final SelectView$PopupWindow$PopupAdapter U;

    public veq0(Context context) {
        super(context, null, iog0.listPopupWindowStyle, 0);
        this.T = context;
        this.U = new SelectView$PopupWindow$PopupAdapter(this);
    }

    @Override // androidx.appcompat.widget.i, defpackage.q9s0
    public final void show() {
        if (this.c == null) {
            super.show();
            DropDownListView dropDownListView = this.c;
            if (dropDownListView != null) {
                dropDownListView.setChoiceMode(1);
            }
        }
        super.show();
    }
}
