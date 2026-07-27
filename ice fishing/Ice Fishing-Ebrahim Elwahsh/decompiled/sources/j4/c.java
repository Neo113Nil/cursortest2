package j4;

import S0.l;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.icefishing.icefishingliveapp.C5284R;
import com.icefishing.icefishingliveapp.DetailsActivity;
import com.icefishing.icefishingliveapp.MainActivity;
import java.util.ArrayList;
import k4.m;
import t0.AbstractC5032P;
import t0.AbstractC5059v;
import t0.C5020D;

/* loaded from: classes2.dex */
public final class c extends AbstractC5059v {

    /* renamed from: e, reason: collision with root package name */
    public static ArrayList f38559e;

    /* renamed from: c, reason: collision with root package name */
    public Context f38560c;

    /* renamed from: d, reason: collision with root package name */
    public MainActivity f38561d;

    public static void e(c cVar, int i) {
        cVar.getClass();
        Context context = cVar.f38560c;
        Intent intent = new Intent(context, (Class<?>) DetailsActivity.class);
        intent.setFlags(32768);
        intent.putExtra("discription", i);
        intent.setFlags(268435456);
        try {
            m.e(context).j(cVar.f38561d, m.f38803t, m.f38795l, m.f38776I, new l(cVar, intent, 13, false));
        } catch (ActivityNotFoundException e6) {
            e6.printStackTrace();
        }
    }

    @Override // t0.AbstractC5059v
    public final int a() {
        return f38559e.size();
    }

    @Override // t0.AbstractC5059v
    public final void c(AbstractC5032P abstractC5032P, int i) {
        b bVar = (b) abstractC5032P;
        Context context = this.f38560c;
        int i4 = context.getResources().getDisplayMetrics().widthPixels;
        View view = bVar.f40615a;
        C5020D c5020d = (C5020D) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c5020d).width = i4 / 2;
        view.setLayoutParams(c5020d);
        int i9 = ((d) f38559e.get(i)).f38563b;
        ImageView imageView = bVar.f38557v;
        imageView.setImageResource(i9);
        imageView.setImageTintMode(PorterDuff.Mode.SRC_IN);
        imageView.setColorFilter(E.b.a(context, C5284R.color.colorPrimary));
        bVar.f38558w.setText(((d) f38559e.get(i)).f38564c);
        bVar.f38556u.setText(((d) f38559e.get(i)).f38562a);
        view.setOnClickListener(new ViewOnClickListenerC4597a(this, i, 0));
        bVar.f38555t.setOnClickListener(new ViewOnClickListenerC4597a(this, i, 1));
    }

    @Override // t0.AbstractC5059v
    public final AbstractC5032P d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f38560c).inflate(C5284R.layout.custom_view, viewGroup, false);
        b bVar = new b(inflate);
        bVar.f38557v = (ImageView) inflate.findViewById(C5284R.id.image_item);
        TextView textView = (TextView) inflate.findViewById(C5284R.id.title_item);
        bVar.f38558w = textView;
        bVar.f38556u = (TextView) inflate.findViewById(C5284R.id.desc_item);
        bVar.f38555t = (CardView) inflate.findViewById(C5284R.id.readBtn);
        textView.setSelected(true);
        return bVar;
    }
}
