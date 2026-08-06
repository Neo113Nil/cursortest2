package h;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3219a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3220b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3221c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f3222d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f3223e;

    public c0(View view) {
        this.f3219a = (TextView) view.findViewById(R.id.text1);
        this.f3220b = (TextView) view.findViewById(R.id.text2);
        this.f3221c = (ImageView) view.findViewById(R.id.icon1);
        this.f3222d = (ImageView) view.findViewById(R.id.icon2);
        this.f3223e = (ImageView) view.findViewById(com.watchfacestudio.spraktum.R.id.edit_query);
    }
}
