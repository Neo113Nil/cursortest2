package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes15.dex */
public final class uai0 extends x0 {
    public final xav N;
    public final String O;
    public final int P;
    public final wls Q;
    public final ImageView R;
    public final TextView S;

    public uai0(View view, xav xavVar, String str, int i, wls wlsVar) {
        super(view);
        this.N = xavVar;
        this.O = str;
        this.P = i;
        this.Q = wlsVar;
        ImageView imageView = (ImageView) view.findViewById(e9h0.reaction_image);
        this.R = imageView;
        this.S = (TextView) view.findViewById(e9h0.reaction_count);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
    }
}
