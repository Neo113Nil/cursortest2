package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.alicekit.core.json.schema.HtmlString;
import java.util.List;

/* loaded from: classes11.dex */
public final class u801 extends RecyclerView.Adapter {
    public final List a;

    public u801(w801 w801Var, List list) {
        this.a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        v801 v801Var = (v801) x0Var;
        kjl kjlVar = (kjl) this.a.get(i);
        TextView textView = v801Var.N;
        textView.setText(kjlVar.b);
        TextView textView2 = v801Var.O;
        HtmlString htmlString = kjlVar.c;
        if (TextUtils.isEmpty(htmlString)) {
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
        } else {
            textView2.setText(htmlString);
            textView2.setVisibility(0);
        }
        ((GradientDrawable) textView.getBackground()).setStroke(v801Var.a.getResources().getDimensionPixelSize(atg0.div_traffic_item_stroke_width), kjlVar.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new v801(g8a1.g(viewGroup, wkh0.div_traffic_item));
    }
}
