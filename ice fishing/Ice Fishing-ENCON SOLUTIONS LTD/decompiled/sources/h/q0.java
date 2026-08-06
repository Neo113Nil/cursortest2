package h;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.watchfacestudio.spraktum.R;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3330a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3331b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3332c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f3333d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3334e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f3335f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3336g;

    public q0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3333d = layoutParams;
        this.f3334e = new Rect();
        this.f3335f = new int[2];
        this.f3336g = new int[2];
        this.f3330a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f3331b = inflate;
        this.f3332c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(q0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
