package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.adjust.sdk.Constants;
import com.yandex.messaging.internal.urlpreview.UrlPreviewBackgroundStyle;
import com.yandex.messaging.internal.urlpreview.reporter.UrlPreviewReporter$Element;

/* loaded from: classes15.dex */
public final class xws0 extends x3 {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final View E;
    public final Group F;
    public final View G;
    public UrlPreviewBackgroundStyle H;
    public final View c;
    public final xav w;
    public final jcz0 x;
    public final sh21 y;
    public final View z;

    public xws0(lh21 lh21Var, View view, xav xavVar, jcz0 jcz0Var, sh21 sh21Var) {
        super(17, lh21Var);
        this.c = view;
        this.w = xavVar;
        this.x = jcz0Var;
        this.y = sh21Var;
        View a = new iv31(e9h0.small_default_url_preview_container_stub, e9h0.small_url_preview_container, olh0.msg_v_url_preview_default_small, view).a();
        this.z = a;
        this.A = (TextView) a.findViewById(e9h0.url_host);
        ImageView imageView = (ImageView) a.findViewById(e9h0.preview_image);
        this.B = imageView;
        this.C = (TextView) a.findViewById(e9h0.url_preview_title);
        this.D = (TextView) a.findViewById(e9h0.url_preview_content);
        this.E = a.findViewById(e9h0.turbo_url_button_bg);
        this.F = (Group) a.findViewById(e9h0.turbo_url_group);
        this.G = a.findViewById(e9h0.small_default_preview_status_and_time_group);
        this.H = UrlPreviewBackgroundStyle.LowHalfCorners;
        View[] viewArr = {a, imageView};
        for (int i = 0; i < 2; i++) {
            viewArr[i].setOnLongClickListener(new ly4(10, this));
        }
    }

    @Override // defpackage.x3
    public final void Dg() {
        View view = this.z;
        view.setVisibility(8);
        view.setOnClickListener(null);
        this.E.setOnClickListener(null);
        this.w.c(this.B);
    }

    @Override // defpackage.x3
    public final View Ig() {
        return this.G;
    }

    @Override // defpackage.x3
    public final View Jg() {
        return this.z;
    }

    @Override // defpackage.x3
    public final void Rg() {
        Dg();
    }

    @Override // defpackage.x3
    public final void Sg(UrlPreviewBackgroundStyle urlPreviewBackgroundStyle) {
        this.H = urlPreviewBackgroundStyle;
    }

    @Override // defpackage.x3
    public final void Tg(ip31 ip31Var, z9z0 z9z0Var, Canvas canvas, boolean z, boolean z2, boolean z3) {
        View view = this.c;
        Drawable b = z9z0.b(z9z0Var, view.getContext(), this.H.a(z3, z, z2));
        int a = kjs0.a(2.0f);
        int f = ip31Var.f();
        int g = ip31Var.g();
        b.setLayoutDirection(view.getLayoutDirection());
        View view2 = this.z;
        b.setBounds(f + a, view2.getTop() + a, g - a, view2.getBottom() - a);
        b.draw(canvas);
    }

    @Override // defpackage.x3
    public final void show() {
        View view = this.z;
        final int i = 0;
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener(this) { // from class: wws0
            public final /* synthetic */ xws0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                xws0 xws0Var = this.b;
                switch (i2) {
                    case 0:
                        xws0Var.x.C(if90.c(((lh21) ((ye0) xws0Var.b)).a));
                        break;
                    default:
                        jcz0 jcz0Var = xws0Var.x;
                        ye0 ye0Var = (ye0) xws0Var.b;
                        jcz0Var.C(Uri.parse(((lh21) ye0Var).w));
                        xws0Var.y.a(ye0Var, UrlPreviewReporter$Element.TurboButton);
                        break;
                }
            }
        });
        lh21 lh21Var = (lh21) ((ye0) this.b);
        Integer num = lh21Var.x;
        String str = lh21Var.z;
        String str2 = lh21Var.c;
        String str3 = lh21Var.b;
        Integer num2 = lh21Var.y;
        String str4 = lh21Var.a;
        Uri parse = Uri.parse(str4);
        if (parse.getScheme() == null) {
            parse = parse.buildUpon().scheme(Constants.SCHEME).authority(str4).build();
        }
        String host = parse.getHost();
        TextView textView = this.A;
        if (host == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(parse.getHost());
        }
        TextView textView2 = this.C;
        if (str3 == null || str3.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str3);
        }
        TextView textView3 = this.D;
        if (str2 == null || str2.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(str2);
        }
        final int i2 = 1;
        ImageView imageView = this.B;
        if (str == null || num == null || num2 == null || num.intValue() <= 0 || num2.intValue() <= 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(null);
            yn50 yn50Var = (yn50) this.w.load(str);
            yn50Var.b.i = num.intValue();
            int intValue = num2.intValue();
            xn50 xn50Var = yn50Var.b;
            xn50Var.j = intValue;
            xn50Var.f = true;
            yn50Var.b(imageView, null);
        }
        String str5 = lh21Var.w;
        Group group = this.F;
        if (str5 == null) {
            group.setVisibility(8);
            return;
        }
        group.setVisibility(0);
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: wws0
            public final /* synthetic */ xws0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                xws0 xws0Var = this.b;
                switch (i22) {
                    case 0:
                        xws0Var.x.C(if90.c(((lh21) ((ye0) xws0Var.b)).a));
                        break;
                    default:
                        jcz0 jcz0Var = xws0Var.x;
                        ye0 ye0Var = (ye0) xws0Var.b;
                        jcz0Var.C(Uri.parse(((lh21) ye0Var).w));
                        xws0Var.y.a(ye0Var, UrlPreviewReporter$Element.TurboButton);
                        break;
                }
            }
        });
    }
}
