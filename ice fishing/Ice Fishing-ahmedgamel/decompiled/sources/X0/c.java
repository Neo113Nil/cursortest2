package X0;

import Y0.p;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.IceFishing.LiveIceFishing.DetailsActivity;
import com.IceFishing.LiveIceFishing.MainActivity;
import com.google.android.gms.internal.ads.C3067cm;
import java.util.ArrayList;
import t0.AbstractC5000P;
import t0.AbstractC5026v;
import t0.C4988D;

/* loaded from: classes.dex */
public final class c extends AbstractC5026v {

    /* renamed from: e, reason: collision with root package name */
    public static ArrayList f3744e;

    /* renamed from: c, reason: collision with root package name */
    public Context f3745c;

    /* renamed from: d, reason: collision with root package name */
    public MainActivity f3746d;

    public static void e(c cVar, int i) {
        cVar.getClass();
        Context context = cVar.f3745c;
        Intent intent = new Intent(context, (Class<?>) DetailsActivity.class);
        intent.setFlags(32768);
        intent.putExtra("discription", i);
        intent.setFlags(268435456);
        try {
            p.e(context).j(cVar.f3746d, p.f3890t, p.f3882l, p.f3863I, new C3067cm(cVar, intent, 5, false));
        } catch (ActivityNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    @Override // t0.AbstractC5026v
    public final int a() {
        return f3744e.size();
    }

    @Override // t0.AbstractC5026v
    public final void c(AbstractC5000P abstractC5000P, int i) {
        b bVar = (b) abstractC5000P;
        Context context = this.f3745c;
        int i4 = context.getResources().getDisplayMetrics().widthPixels;
        View view = bVar.f40643a;
        C4988D c4988d = (C4988D) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c4988d).width = i4 / 2;
        view.setLayoutParams(c4988d);
        int i6 = ((d) f3744e.get(i)).f3748b;
        ImageView imageView = bVar.f3742v;
        imageView.setImageResource(i6);
        imageView.setImageTintMode(PorterDuff.Mode.SRC_IN);
        imageView.setColorFilter(E.b.a(context, C5248R.color.colorPrimary));
        bVar.f3743w.setText(((d) f3744e.get(i)).f3749c);
        bVar.f3741u.setText(((d) f3744e.get(i)).f3747a);
        view.setOnClickListener(new a(this, i, 0));
        bVar.f3740t.setOnClickListener(new a(this, i, 1));
    }

    @Override // t0.AbstractC5026v
    public final AbstractC5000P d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f3745c).inflate(C5248R.layout.custom_view, viewGroup, false);
        b bVar = new b(inflate);
        bVar.f3742v = (ImageView) inflate.findViewById(C5248R.id.image_item);
        TextView textView = (TextView) inflate.findViewById(C5248R.id.title_item);
        bVar.f3743w = textView;
        bVar.f3741u = (TextView) inflate.findViewById(C5248R.id.desc_item);
        bVar.f3740t = (CardView) inflate.findViewById(C5248R.id.readBtn);
        textView.setSelected(true);
        return bVar;
    }
}
