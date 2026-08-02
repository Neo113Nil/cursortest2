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
import com.IceFishing.LiveIceFishing.C5248R;
import g.AbstractC4528a;
import java.lang.ref.WeakReference;

/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4551g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37899a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC4552h f37900b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f37901c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f37902d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f37903e;

    /* renamed from: f, reason: collision with root package name */
    public Button f37904f;

    /* renamed from: g, reason: collision with root package name */
    public Button f37905g;

    /* renamed from: h, reason: collision with root package name */
    public Button f37906h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f37907j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f37908k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f37909l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f37910m;

    /* renamed from: n, reason: collision with root package name */
    public View f37911n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f37912o;

    /* renamed from: q, reason: collision with root package name */
    public final int f37914q;

    /* renamed from: r, reason: collision with root package name */
    public final int f37915r;

    /* renamed from: s, reason: collision with root package name */
    public final int f37916s;

    /* renamed from: t, reason: collision with root package name */
    public final int f37917t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f37918u;

    /* renamed from: v, reason: collision with root package name */
    public final B8.g f37919v;

    /* renamed from: p, reason: collision with root package name */
    public int f37913p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final N3.n f37920w = new N3.n(10, this);

    public C4551g(Context context, DialogInterfaceC4552h dialogInterfaceC4552h, Window window) {
        this.f37899a = context;
        this.f37900b = dialogInterfaceC4552h;
        this.f37901c = window;
        B8.g gVar = new B8.g();
        gVar.f303b = new WeakReference(dialogInterfaceC4552h);
        this.f37919v = gVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC4528a.f37554e, C5248R.attr.alertDialogStyle, 0);
        this.f37914q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f37915r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f37916s = obtainStyledAttributes.getResourceId(7, 0);
        this.f37917t = obtainStyledAttributes.getResourceId(3, 0);
        this.f37918u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC4552h.c().g(1);
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
