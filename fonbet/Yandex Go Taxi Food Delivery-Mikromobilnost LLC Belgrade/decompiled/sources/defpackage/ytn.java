package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class ytn extends RecyclerView.Adapter {
    public final ztn a;
    public final t8j b;
    public final LayoutInflater c;
    public int w;

    public ytn(Context context, ztn ztnVar, t8j t8jVar) {
        this.a = ztnVar;
        this.b = t8jVar;
        this.c = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        View view = x0Var.a;
        boolean z = i == this.w;
        int i2 = f7h0.emoji_picker_header_icon;
        WeakHashMap weakHashMap = b.a;
        View view2 = (View) rp31.d(view, i2);
        ImageView imageView = (ImageView) view2;
        Context context = imageView.getContext();
        ztn ztnVar = this.a;
        imageView.setImageDrawable(context.getDrawable(((d2x) ztnVar.a.get(i)).a));
        imageView.setSelected(z);
        imageView.setContentDescription(((d2x) ztnVar.a.get(i)).b.c);
        ImageView imageView2 = (ImageView) view2;
        view.setOnClickListener(new wtn(this, i, r1));
        if (z) {
            imageView2.post(new xtn(imageView2, 0));
        }
        View view3 = (View) rp31.d(view, f7h0.emoji_picker_header_underline);
        view3.setVisibility(z ? 0 : 8);
        view3.setSelected(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new utn(this.c.inflate(gth0.header_icon_holder, viewGroup, false));
    }
}
