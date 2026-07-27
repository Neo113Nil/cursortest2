package h;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.icecatchbiger.hookfrostmaster.R;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2294a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2295b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f2296c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f2297d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2298e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2299f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2300g;

    public t0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2297d = layoutParams;
        this.f2298e = new Rect();
        this.f2299f = new int[2];
        this.f2300g = new int[2];
        this.f2294a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2295b = inflate;
        this.f2296c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(t0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
