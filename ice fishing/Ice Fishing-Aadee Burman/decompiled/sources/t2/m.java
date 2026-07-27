package t2;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.Vr;
import com.icefishing.icefishinglive2.C5275R;
import p2.C4835j;
import q2.C4900p;
import q2.r;
import u2.z;

/* loaded from: classes.dex */
public final class m extends FrameLayout implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final ImageButton f40854n;

    /* renamed from: u, reason: collision with root package name */
    public final BinderC5036d f40855u;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Context context, Vr vr, BinderC5036d binderC5036d) {
        super(context);
        Drawable drawable;
        this.f40855u = binderC5036d;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f40854n = imageButton;
        String str = (String) r.f40204e.f40207c.a(AbstractC3569ma.f32048J1);
        if (TextUtils.isEmpty(str) || com.anythink.core.express.b.a.f17530f.equals(str)) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            Resources c9 = C4835j.f39730C.f39740h.c();
            if (c9 != null) {
                try {
                } catch (Resources.NotFoundException unused) {
                    int i = z.f41319b;
                    v2.i.a("Close button resource not found, falling back to default.");
                    drawable = null;
                }
                if ("white".equals(str)) {
                    drawable = c9.getDrawable(C5275R.drawable.admob_close_button_white_circle_black_cross);
                } else {
                    if ("black".equals(str)) {
                        drawable = c9.getDrawable(C5275R.drawable.admob_close_button_black_circle_white_cross);
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
        this.f40854n.setBackgroundColor(0);
        this.f40854n.setOnClickListener(this);
        ImageButton imageButton2 = this.f40854n;
        v2.d dVar = C4900p.f40196g.f40197a;
        imageButton2.setPadding(v2.d.b(context, vr.f28250a), v2.d.r(context.getResources().getDisplayMetrics(), 0), v2.d.r(context.getResources().getDisplayMetrics(), vr.f28251b), v2.d.r(context.getResources().getDisplayMetrics(), vr.f28252c));
        this.f40854n.setContentDescription("Interstitial close button");
        addView(this.f40854n, new FrameLayout.LayoutParams(v2.d.r(context.getResources().getDisplayMetrics(), vr.f28253d + vr.f28250a + vr.f28251b), v2.d.r(context.getResources().getDisplayMetrics(), vr.f28253d + vr.f28252c), 17));
        C3301ha c3301ha = AbstractC3569ma.f32056K1;
        r rVar = r.f40204e;
        long longValue = ((Long) rVar.f40207c.a(c3301ha)).longValue();
        if (longValue <= 0) {
            return;
        }
        D0.k kVar = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32064L1)).booleanValue() ? new D0.k(this) : null;
        this.f40854n.setAlpha(0.0f);
        this.f40854n.animate().alpha(1.0f).setDuration(longValue).setListener(kVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BinderC5036d binderC5036d = this.f40855u;
        if (binderC5036d != null) {
            binderC5036d.f40821Q = 2;
            binderC5036d.f40823u.finish();
        }
    }
}
