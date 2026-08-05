package defpackage;

import android.content.Context;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class te {
    public static final int P7K7Inc8 = (int) Math.round(5.1000000000000005d);
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final float VgvYg0wo;
    public final boolean qoPGr6Ce;
    public final int wxUZMvaN;

    public te(Context context) {
        boolean ytu5o6f4 = ra.ytu5o6f4(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        int OnDfzHZD = fn.OnDfzHZD(context, R.attr.elevationOverlayColor, 0);
        int OnDfzHZD2 = fn.OnDfzHZD(context, R.attr.elevationOverlayAccentColor, 0);
        int OnDfzHZD3 = fn.OnDfzHZD(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.qoPGr6Ce = ytu5o6f4;
        this.NCTxEWno = OnDfzHZD;
        this.MdtA4re8 = OnDfzHZD2;
        this.wxUZMvaN = OnDfzHZD3;
        this.VgvYg0wo = f;
    }
}
