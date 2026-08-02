package v2;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.Vr;
import r2.C4906k;
import s2.C4949p;
import s2.r;
import w2.z;

/* loaded from: classes.dex */
public final class m extends FrameLayout implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final ImageButton f41145n;

    /* renamed from: u, reason: collision with root package name */
    public final BinderC5100d f41146u;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Context context, Vr vr, BinderC5100d binderC5100d) {
        super(context);
        Drawable drawable;
        this.f41146u = binderC5100d;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f41145n = imageButton;
        String str = (String) r.f40506e.f40509c.a(AbstractC3592ma.J1);
        if (TextUtils.isEmpty(str) || com.anythink.core.express.b.a.f18317f.equals(str)) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            Resources c9 = C4906k.f40186C.f40196h.c();
            if (c9 != null) {
                try {
                } catch (Resources.NotFoundException unused) {
                    int i = z.f41712b;
                    x2.i.a("Close button resource not found, falling back to default.");
                    drawable = null;
                }
                if ("white".equals(str)) {
                    drawable = c9.getDrawable(C5248R.drawable.admob_close_button_white_circle_black_cross);
                } else {
                    if ("black".equals(str)) {
                        drawable = c9.getDrawable(C5248R.drawable.admob_close_button_black_circle_white_cross);
                    }
                    drawable = null;
                }
                if (drawable == null) {
                    imageButton.setImageResource(R.drawable.btn_dialog);
                } else {
                    imageButton.setImageDrawable(drawable);
                    imageButton.setScaleType(ImageView.ScaleType.CENTER);
                }
            } else {
                imageButton.setImageResource(R.drawable.btn_dialog);
            }
        }
        this.f41145n.setBackgroundColor(0);
        this.f41145n.setOnClickListener(this);
        ImageButton imageButton2 = this.f41145n;
        x2.d dVar = C4949p.f40498g.f40499a;
        imageButton2.setPadding(x2.d.b(context, vr.f29048a), x2.d.r(context.getResources().getDisplayMetrics(), 0), x2.d.r(context.getResources().getDisplayMetrics(), vr.f29049b), x2.d.r(context.getResources().getDisplayMetrics(), vr.f29050c));
        this.f41145n.setContentDescription("Interstitial close button");
        addView(this.f41145n, new FrameLayout.LayoutParams(x2.d.r(context.getResources().getDisplayMetrics(), vr.f29051d + vr.f29048a + vr.f29049b), x2.d.r(context.getResources().getDisplayMetrics(), vr.f29051d + vr.f29050c), 17));
        C3324ha c3324ha = AbstractC3592ma.f32836K1;
        r rVar = r.f40506e;
        long longValue = ((Long) rVar.f40509c.a(c3324ha)).longValue();
        if (longValue <= 0) {
            return;
        }
        D0.k kVar = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f32844L1)).booleanValue() ? new D0.k(this) : null;
        this.f41145n.setAlpha(0.0f);
        this.f41145n.animate().alpha(1.0f).setDuration(longValue).setListener(kVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BinderC5100d binderC5100d = this.f41146u;
        if (binderC5100d != null) {
            binderC5100d.f41112Q = 2;
            binderC5100d.f41114u.finish();
        }
    }
}
