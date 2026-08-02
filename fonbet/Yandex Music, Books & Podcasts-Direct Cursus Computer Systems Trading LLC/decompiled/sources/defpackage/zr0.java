package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class zr0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CharSequence convertSelectionToString;
        switch (this.a) {
            case 0:
                bs0 bs0Var = (bs0) this.b;
                es0 es0Var = bs0Var.G;
                es0Var.setSelection(i);
                if (es0Var.getOnItemClickListener() != null) {
                    es0Var.performItemClick(view, i, bs0Var.D.getItemId(i));
                }
                bs0Var.dismiss();
                break;
            case 1:
                lch lchVar = (lch) this.b;
                y9g y9gVar = lchVar.e;
                convertSelectionToString = lchVar.convertSelectionToString(i < 0 ? !y9gVar.z.isShowing() ? null : y9gVar.c.getSelectedItem() : lchVar.getAdapter().getItem(i));
                lchVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = lchVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !y9gVar.z.isShowing() ? null : y9gVar.c.getSelectedView();
                        i = !y9gVar.z.isShowing() ? -1 : y9gVar.c.getSelectedItemPosition();
                        j = !y9gVar.z.isShowing() ? Long.MIN_VALUE : y9gVar.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(y9gVar.c, view, i, j);
                }
                y9gVar.dismiss();
                break;
            default:
                ((SearchView) this.b).n(i);
                break;
        }
    }
}
