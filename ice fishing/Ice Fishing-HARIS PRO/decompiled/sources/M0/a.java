package M0;

import a.AbstractC0078a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import b.C0106b;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f605a;

    /* renamed from: b, reason: collision with root package name */
    public final View f606b;

    /* renamed from: c, reason: collision with root package name */
    public final int f607c;

    /* renamed from: d, reason: collision with root package name */
    public final int f608d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public C0106b f609f;

    public a(View view) {
        this.f606b = view;
        Context context = view.getContext();
        this.f605a = AbstractC0078a.X(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(RecyclerView.f2111C0, RecyclerView.f2111C0, RecyclerView.f2111C0, 1.0f));
        this.f607c = AbstractC0078a.W(context, R.attr.motionDurationMedium2, 300);
        this.f608d = AbstractC0078a.W(context, R.attr.motionDurationShort3, 150);
        this.e = AbstractC0078a.W(context, R.attr.motionDurationShort2, 100);
    }
}
