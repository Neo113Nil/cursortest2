package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.EllipsizedTextView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class xqx {
    public final nqx a;
    public final RobotoTextView b;
    public Bitmap c;
    public boolean d;

    public xqx(Context context, nqx nqxVar) {
        this.a = nqxVar;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setMaxWidth(nqxVar.m);
        robotoTextView.setTextSize(13.0f);
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        robotoTextView.setMaxLines(nqxVar.n);
        robotoTextView.setTextColor(nqxVar.b);
        robotoTextView.setBackground(nqxVar.a);
        robotoTextView.setTextAlignment(nqxVar.l);
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.b = robotoTextView;
        Boolean bool = tp11.a;
        tp11.b(nqxVar.k, robotoTextView);
    }

    public final PointF a() {
        float p = uh6.p(this.b.getContext(), 12.0f);
        nqx nqxVar = this.a;
        return new PointF(nqxVar.c - ((nqxVar.f * p) / b().getWidth()), nqxVar.d - ((nqxVar.e * p) / b().getHeight()));
    }

    public final Bitmap b() {
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap s = xw31.s(this.b);
        this.c = s;
        return s;
    }

    public final void c(boolean z) {
        this.d = z;
        RobotoTextView robotoTextView = this.b;
        if (z) {
            tp11.b(5, robotoTextView);
            robotoTextView.setTextSize(14.0f);
            d(EllipsizedTextView.DEFAULT_ELLIPSIS);
        } else {
            robotoTextView.setTextSize(13.0f);
            Boolean bool = tp11.a;
            tp11.b(this.a.k, robotoTextView);
        }
        this.c = null;
    }

    public final void d(CharSequence charSequence) {
        this.b.setText(charSequence);
        this.c = null;
    }
}
