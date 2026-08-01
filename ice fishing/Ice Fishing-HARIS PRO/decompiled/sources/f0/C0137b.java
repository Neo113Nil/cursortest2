package f0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.ref.WeakReference;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137b extends D1.j implements C1.l {

    /* renamed from: c, reason: collision with root package name */
    public static final C0137b f2901c = new C0137b(1, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0137b f2902d = new C0137b(1, 1);
    public static final C0137b e = new C0137b(1, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final C0137b f2903f = new C0137b(1, 3);

    /* renamed from: g, reason: collision with root package name */
    public static final C0137b f2904g = new C0137b(1, 4);

    /* renamed from: h, reason: collision with root package name */
    public static final C0137b f2905h = new C0137b(1, 5);
    public static final C0137b i = new C0137b(1, 6);
    public static final C0137b j = new C0137b(1, 7);

    /* renamed from: k, reason: collision with root package name */
    public static final C0137b f2906k = new C0137b(1, 8);

    /* renamed from: l, reason: collision with root package name */
    public static final C0137b f2907l = new C0137b(1, 9);

    /* renamed from: m, reason: collision with root package name */
    public static final C0137b f2908m = new C0137b(1, 10);

    /* renamed from: n, reason: collision with root package name */
    public static final C0137b f2909n = new C0137b(1, 11);

    /* renamed from: o, reason: collision with root package name */
    public static final C0137b f2910o = new C0137b(1, 12);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0137b(int i2, int i3) {
        super(i2);
        this.f2911b = i3;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        switch (this.f2911b) {
            case 0:
                Context context = (Context) obj;
                D1.i.e(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                D1.i.e(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                C0135D c0135d = (C0135D) obj;
                D1.i.e(c0135d, "$this$navOptions");
                c0135d.f2869c = true;
                return t1.i.f4388c;
            case 3:
                w wVar = (w) obj;
                D1.i.e(wVar, "destination");
                y yVar = wVar.f2989b;
                if (yVar == null || yVar.f3000l != wVar.f2994h) {
                    return null;
                }
                return yVar;
            case 4:
                w wVar2 = (w) obj;
                D1.i.e(wVar2, "destination");
                y yVar2 = wVar2.f2989b;
                if (yVar2 == null || yVar2.f3000l != wVar2.f2994h) {
                    return null;
                }
                return yVar2;
            case 5:
                w wVar3 = (w) obj;
                D1.i.e(wVar3, "it");
                return Integer.valueOf(wVar3.f2994h);
            case 6:
                Context context3 = (Context) obj;
                D1.i.e(context3, "it");
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 7:
                Context context4 = (Context) obj;
                D1.i.e(context4, "it");
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case 8:
                w wVar4 = (w) obj;
                D1.i.e(wVar4, "it");
                return wVar4.f2989b;
            case 9:
                w wVar5 = (w) obj;
                D1.i.e(wVar5, "it");
                if (!(wVar5 instanceof y)) {
                    return null;
                }
                y yVar3 = (y) wVar5;
                return yVar3.g(yVar3.f3000l, yVar3, null, false);
            case 10:
                View view = (View) obj;
                D1.i.e(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 11:
                View view2 = (View) obj;
                D1.i.e(view2, "it");
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (z) ((WeakReference) tag).get();
                }
                if (tag instanceof z) {
                    return (z) tag;
                }
                return null;
            default:
                C0135D c0135d2 = (C0135D) obj;
                D1.i.e(c0135d2, "$this$navOptions");
                c0135d2.f2868b = true;
                return t1.i.f4388c;
        }
    }
}
