package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes15.dex */
public final class xsn extends RecyclerView.Adapter {
    public mum a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        String[][] strArr = usn.a;
        return 8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        wsn wsnVar = (wsn) x0Var;
        int i2 = usn.b[i];
        wsnVar.O = i;
        ImageView imageView = wsnVar.N;
        View view = wsnVar.a;
        imageView.setImageDrawable(view.getContext().getDrawable(i2));
        imageView.setContentDescription(view.getContext().getString(usn.c[i]));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new wsn(LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_vh_emoji_category_item, viewGroup, false), this.a);
    }
}
