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
import com.icefishing.icefishinglive2.C5275R;
import g.AbstractC4518a;
import java.lang.ref.WeakReference;

/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4547g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37873a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC4548h f37874b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f37875c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f37876d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f37877e;

    /* renamed from: f, reason: collision with root package name */
    public Button f37878f;

    /* renamed from: g, reason: collision with root package name */
    public Button f37879g;

    /* renamed from: h, reason: collision with root package name */
    public Button f37880h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f37881j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f37882k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f37883l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f37884m;

    /* renamed from: n, reason: collision with root package name */
    public View f37885n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f37886o;

    /* renamed from: q, reason: collision with root package name */
    public final int f37888q;

    /* renamed from: r, reason: collision with root package name */
    public final int f37889r;

    /* renamed from: s, reason: collision with root package name */
    public final int f37890s;

    /* renamed from: t, reason: collision with root package name */
    public final int f37891t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f37892u;

    /* renamed from: v, reason: collision with root package name */
    public final B8.g f37893v;

    /* renamed from: p, reason: collision with root package name */
    public int f37887p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final L3.q f37894w = new L3.q(4, this);

    public C4547g(Context context, DialogInterfaceC4548h dialogInterfaceC4548h, Window window) {
        this.f37873a = context;
        this.f37874b = dialogInterfaceC4548h;
        this.f37875c = window;
        B8.g gVar = new B8.g();
        gVar.f237b = new WeakReference(dialogInterfaceC4548h);
        this.f37893v = gVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC4518a.f37592e, C5275R.attr.alertDialogStyle, 0);
        this.f37888q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f37889r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f37890s = obtainStyledAttributes.getResourceId(7, 0);
        this.f37891t = obtainStyledAttributes.getResourceId(3, 0);
        this.f37892u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC4548h.c().g(1);
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
