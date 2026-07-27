package n4;

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
import com.icefishing.icefishinglive2.C5275R;
import com.icefishing.icefishinglive2.DetailsActivity;
import com.icefishing.icefishinglive2.MainActivity;
import java.util.ArrayList;
import o4.C4799l;
import t0.AbstractC5003S;
import t0.AbstractC5027v;
import t0.C4991F;

/* loaded from: classes2.dex */
public final class c extends AbstractC5027v {

    /* renamed from: e, reason: collision with root package name */
    public static ArrayList f39482e;

    /* renamed from: c, reason: collision with root package name */
    public Context f39483c;

    /* renamed from: d, reason: collision with root package name */
    public MainActivity f39484d;

    public static void e(c cVar, int i) {
        cVar.getClass();
        Context context = cVar.f39483c;
        Intent intent = new Intent(context, (Class<?>) DetailsActivity.class);
        intent.setFlags(32768);
        intent.putExtra("discription", i);
        intent.setFlags(268435456);
        try {
            C4799l.e(context).j(cVar.f39484d, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new k8.b(cVar, intent, false));
        } catch (ActivityNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    @Override // t0.AbstractC5027v
    public final int a() {
        return f39482e.size();
    }

    @Override // t0.AbstractC5027v
    public final void c(AbstractC5003S abstractC5003S, int i) {
        b bVar = (b) abstractC5003S;
        Context context = this.f39483c;
        int i6 = context.getResources().getDisplayMetrics().widthPixels;
        View view = bVar.f40590a;
        C4991F c4991f = (C4991F) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c4991f).width = i6 / 2;
        view.setLayoutParams(c4991f);
        int i9 = ((d) f39482e.get(i)).f39486b;
        ImageView imageView = bVar.f39480v;
        imageView.setImageResource(i9);
        imageView.setImageTintMode(PorterDuff.Mode.SRC_IN);
        imageView.setColorFilter(E.b.a(context, C5275R.color.colorPrimary));
        bVar.f39481w.setText(((d) f39482e.get(i)).f39487c);
        bVar.f39479u.setText(((d) f39482e.get(i)).f39485a);
        view.setOnClickListener(new ViewOnClickListenerC4757a(this, i, 0));
        bVar.f39478t.setOnClickListener(new ViewOnClickListenerC4757a(this, i, 1));
    }

    @Override // t0.AbstractC5027v
    public final AbstractC5003S d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f39483c).inflate(C5275R.layout.custom_view, viewGroup, false);
        b bVar = new b(inflate);
        bVar.f39480v = (ImageView) inflate.findViewById(C5275R.id.image_item);
        TextView textView = (TextView) inflate.findViewById(C5275R.id.title_item);
        bVar.f39481w = textView;
        bVar.f39479u = (TextView) inflate.findViewById(C5275R.id.desc_item);
        bVar.f39478t = (CardView) inflate.findViewById(C5275R.id.readBtn);
        textView.setSelected(true);
        return bVar;
    }
}
