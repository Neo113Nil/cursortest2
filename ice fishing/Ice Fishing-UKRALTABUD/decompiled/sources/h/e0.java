package h;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2155a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f2156b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f2157c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f2158d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f2159e;

    public e0(View view) {
        this.f2155a = (TextView) view.findViewById(R.id.text1);
        this.f2156b = (TextView) view.findViewById(R.id.text2);
        this.f2157c = (ImageView) view.findViewById(R.id.icon1);
        this.f2158d = (ImageView) view.findViewById(R.id.icon2);
        this.f2159e = (ImageView) view.findViewById(com.icedrifter.arcticquest.R.id.edit_query);
    }
}
