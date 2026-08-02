package defpackage;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.images.utils.ScaleMode;
import java.io.File;
import kotlin.io.b;

/* loaded from: classes15.dex */
public final class wlg0 {
    public final mlg0 a;
    public final o1w b;
    public final h3y c;
    public final xzq d;
    public final noy0 e;
    public final zg10 f;
    public final TextView g;
    public final TextView h;
    public final ImageView i;
    public final View j;
    public final ImageView k;
    public final ImageView l;
    public final View m;
    public yn50 n;
    public final u0r o;
    public j3b p;
    public rlg0 q;

    public wlg0(mlg0 mlg0Var, o1w o1wVar, h3y h3yVar, xzq xzqVar, noy0 noy0Var, zg10 zg10Var) {
        this.a = mlg0Var;
        this.b = o1wVar;
        this.c = h3yVar;
        this.d = xzqVar;
        this.e = noy0Var;
        this.f = zg10Var;
        iv31 iv31Var = mlg0Var.a;
        this.g = (TextView) iv31Var.a().findViewById(e9h0.chat_input_panel_first_line);
        this.h = (TextView) iv31Var.a().findViewById(e9h0.chat_input_panel_second_line);
        this.i = (ImageView) iv31Var.a().findViewById(e9h0.chat_input_clear);
        this.j = iv31Var.a().findViewById(e9h0.chat_input_panel_image_preview_container);
        ImageView imageView = (ImageView) iv31Var.a().findViewById(e9h0.chat_input_panel_image_preview);
        this.k = imageView;
        this.l = (ImageView) iv31Var.a().findViewById(e9h0.chat_input_panel_quote_icon);
        this.m = iv31Var.a().findViewById(e9h0.chat_input_panel_quote_area);
        this.o = new u0r(iv31Var.a().getContext(), imageView, h3yVar);
    }

    public final void a(plg0 plg0Var) {
        j3b j3bVar;
        String str = plg0Var.e;
        Integer num = plg0Var.f;
        String str2 = plg0Var.d;
        if (str != null) {
            String m = b.m(new File(str));
            Integer a = this.d.a(m);
            this.o.c(a != null ? a.intValue() : xzq.b, str2, str2 != null && this.f.c(this.p, m, num) && (j3bVar = this.p) != null && okb1.b(j3bVar).j());
        } else if (str2 != null) {
            ImageView imageView = this.k;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            String f = com.yandex.messaging.internal.images.b.f(str2);
            imageView.setImageDrawable(null);
            g9v load = ((xav) this.c.get()).load(f);
            int i = layoutParams.width;
            yn50 yn50Var = (yn50) load;
            xn50 xn50Var = yn50Var.b;
            xn50Var.i = i;
            xn50Var.j = layoutParams.height;
            xn50Var.k = ScaleMode.CENTER_CROP;
            this.n = yn50Var;
            yn50Var.b(imageView, new ahv(imageView, num));
            int i2 = plg0Var.g;
            str = imageView.getContext().getResources().getString(i2 != 1 ? i2 != 3 ? oyh0.messenger_message_with_sticker : oyh0.messenger_message_with_gif : oyh0.messenger_message_with_image);
        } else {
            z83.i();
            str = "";
        }
        this.h.setText(str, TextView.BufferType.EDITABLE);
    }

    public final void b(Editable editable) {
        z83.b(null, 0, Integer.valueOf(this.a.a.a().getVisibility()));
        this.h.setText(((v3k0) this.e).b(0, editable), TextView.BufferType.EDITABLE);
    }
}
