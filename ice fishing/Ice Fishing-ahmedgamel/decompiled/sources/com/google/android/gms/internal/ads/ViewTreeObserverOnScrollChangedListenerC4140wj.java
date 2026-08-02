package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;
import r2.C4906k;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnScrollChangedListenerC4140wj extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35645n;

    /* renamed from: u, reason: collision with root package name */
    public View f35646u;

    public ViewTreeObserverOnScrollChangedListenerC4140wj(Context context) {
        super(context);
        this.f35645n = context;
    }

    public static ViewTreeObserverOnScrollChangedListenerC4140wj a(Context context, View view, St st) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        ViewTreeObserverOnScrollChangedListenerC4140wj viewTreeObserverOnScrollChangedListenerC4140wj = new ViewTreeObserverOnScrollChangedListenerC4140wj(context);
        List list = st.f28427u;
        boolean isEmpty = list.isEmpty();
        Context context2 = viewTreeObserverOnScrollChangedListenerC4140wj.f35645n;
        if (!isEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f2 = ((Tt) list.get(0)).f28604a;
            float f9 = displayMetrics.density;
            viewTreeObserverOnScrollChangedListenerC4140wj.setLayoutParams(new FrameLayout.LayoutParams((int) (f2 * f9), (int) (r5.f28605b * f9)));
        }
        viewTreeObserverOnScrollChangedListenerC4140wj.f35646u = view;
        viewTreeObserverOnScrollChangedListenerC4140wj.addView(view);
        C2889Yb c2889Yb = C4906k.f40186C.f40188B;
        ViewTreeObserverOnScrollChangedListenerC3706og viewTreeObserverOnScrollChangedListenerC3706og = new ViewTreeObserverOnScrollChangedListenerC3706og(viewTreeObserverOnScrollChangedListenerC4140wj, viewTreeObserverOnScrollChangedListenerC4140wj);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3706og.f27380n).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnScrollChangedListenerC3706og.R1(viewTreeObserver);
        }
        ViewTreeObserverOnGlobalLayoutListenerC3652ng viewTreeObserverOnGlobalLayoutListenerC3652ng = new ViewTreeObserverOnGlobalLayoutListenerC3652ng(viewTreeObserverOnScrollChangedListenerC4140wj, viewTreeObserverOnScrollChangedListenerC4140wj);
        View view3 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3652ng.f27380n).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3652ng.R1(viewTreeObserver3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObject = st.f28404h0;
        JSONObject optJSONObject = jSONObject.optJSONObject(com.anythink.expressad.foundation.d.g.f19492j);
        if (optJSONObject != null) {
            viewTreeObserverOnScrollChangedListenerC4140wj.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            viewTreeObserverOnScrollChangedListenerC4140wj.b(optJSONObject2, relativeLayout, 12);
        }
        viewTreeObserverOnScrollChangedListenerC4140wj.addView(relativeLayout);
        return viewTreeObserverOnScrollChangedListenerC4140wj;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.f35645n;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(com.anythink.basead.exoplayer.k.o.f9232c, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        C4949p c4949p = C4949p.f40498g;
        x2.d dVar = c4949p.f40499a;
        int b9 = x2.d.b(context, (int) optDouble);
        textView.setPadding(0, b9, 0, b9);
        double optDouble2 = jSONObject.optDouble("height", 15.0d);
        x2.d dVar2 = c4949p.f40499a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, x2.d.b(context, (int) optDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f35646u.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f35646u.setY(-r0[1]);
    }
}
