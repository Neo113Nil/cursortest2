package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.widget.ImageView;
import coil.c;
import coil.graphics.DataSource;
import coil.view.Scale;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes3.dex */
public final class z2m0 {
    public String a = "";
    public int b = -1;

    public final void a(final String str, final int i, ImageView imageView) {
        String str2;
        Context context = imageView.getContext();
        final float f = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new gac(i, 4));
        if (str != null) {
            List list = rcv.a;
            str2 = rcv.a(str, rev.f, context);
        } else {
            str2 = null;
        }
        y2m0 y2m0Var = new y2m0(imageView);
        c f2 = com.ybsdk.core.utils.ext.a.f();
        bev b2 = com.ybsdk.core.utils.ext.a.b(context, 6, false);
        b2.c = str2;
        b2.d = y2m0Var;
        b2.l();
        b2.y = Scale.FILL;
        b2.k = new qx01() { // from class: x2m0
            @Override // defpackage.qx01
            public final wx01 a(qy01 qy01Var, nev nevVar) {
                Drawable a = nevVar.a();
                if (a == null) {
                    a = (ColorDrawable) b.getValue();
                }
                u3v0 u3v0Var = new u3v0(a, nevVar.b(), DataSource.NETWORK, null, null, false, false);
                z2m0 z2m0Var = z2m0.this;
                String str3 = z2m0Var.a;
                String str4 = str;
                boolean l = jl40.l(str3, str4);
                int i2 = i;
                if (l && z2m0Var.b == i2) {
                    qy01Var.b(a);
                    return new d7g0(19);
                }
                z2m0Var.a = str4;
                z2m0Var.b = i2;
                int b3 = m810.b(500.0f * f);
                if (b3 < 1) {
                    b3 = 1;
                }
                return new qcf(qy01Var, u3v0Var, b3, true);
            }
        };
        f2.b(b2.d());
    }
}
