package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* loaded from: classes.dex */
public final class jyo extends BaseAdapter {
    public final /* synthetic */ lyo a;

    public jyo(lyo lyoVar) {
        this.a = lyoVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.b.getChildCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ((kyo) this.a.b.getChildAt(i)).getClass();
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view != null) {
            getItem(i);
            throw null;
        }
        getItem(i);
        lyo lyoVar = this.a;
        new kyo(lyoVar, lyoVar.getContext());
        throw null;
    }
}
