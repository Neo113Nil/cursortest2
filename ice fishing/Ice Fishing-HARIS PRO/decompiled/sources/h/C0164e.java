package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.lumenpath.harispro.hrnavigator.R;
import g.AbstractC0155a;
import java.lang.ref.WeakReference;

/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3187a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0165f f3188b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f3189c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f3190d;
    public AlertController$RecycleListView e;

    /* renamed from: f, reason: collision with root package name */
    public Button f3191f;

    /* renamed from: g, reason: collision with root package name */
    public Button f3192g;

    /* renamed from: h, reason: collision with root package name */
    public Button f3193h;
    public NestedScrollView i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f3194k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f3195l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f3196m;

    /* renamed from: n, reason: collision with root package name */
    public View f3197n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f3198o;

    /* renamed from: q, reason: collision with root package name */
    public final int f3200q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3201r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3202s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3203t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f3204u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0162c f3205v;

    /* renamed from: p, reason: collision with root package name */
    public int f3199p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final B0.l f3206w = new B0.l(3, this);

    public C0164e(Context context, DialogInterfaceC0165f dialogInterfaceC0165f, Window window) {
        this.f3187a = context;
        this.f3188b = dialogInterfaceC0165f;
        this.f3189c = window;
        HandlerC0162c handlerC0162c = new HandlerC0162c();
        handlerC0162c.f3186a = new WeakReference(dialogInterfaceC0165f);
        this.f3205v = handlerC0162c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0155a.e, R.attr.alertDialogStyle, 0);
        this.f3200q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f3201r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f3202s = obtainStyledAttributes.getResourceId(7, 0);
        this.f3203t = obtainStyledAttributes.getResourceId(3, 0);
        this.f3204u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0165f.f().f(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
