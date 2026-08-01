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
import p2.C4835j;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnScrollChangedListenerC4117wj extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: n, reason: collision with root package name */
    public final Context f34868n;

    /* renamed from: u, reason: collision with root package name */
    public View f34869u;

    public ViewTreeObserverOnScrollChangedListenerC4117wj(Context context) {
        super(context);
        this.f34868n = context;
    }

    public static ViewTreeObserverOnScrollChangedListenerC4117wj a(Context context, View view, St st) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        ViewTreeObserverOnScrollChangedListenerC4117wj viewTreeObserverOnScrollChangedListenerC4117wj = new ViewTreeObserverOnScrollChangedListenerC4117wj(context);
        List list = st.f27644u;
        boolean isEmpty = list.isEmpty();
        Context context2 = viewTreeObserverOnScrollChangedListenerC4117wj.f34868n;
        if (!isEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f3 = ((Tt) list.get(0)).f27807a;
            float f9 = displayMetrics.density;
            viewTreeObserverOnScrollChangedListenerC4117wj.setLayoutParams(new FrameLayout.LayoutParams((int) (f3 * f9), (int) (r5.f27808b * f9)));
        }
        viewTreeObserverOnScrollChangedListenerC4117wj.f34869u = view;
        viewTreeObserverOnScrollChangedListenerC4117wj.addView(view);
        C2866Yb c2866Yb = C4835j.f39733C.f39735B;
        ViewTreeObserverOnScrollChangedListenerC3683og viewTreeObserverOnScrollChangedListenerC3683og = new ViewTreeObserverOnScrollChangedListenerC3683og(viewTreeObserverOnScrollChangedListenerC4117wj, viewTreeObserverOnScrollChangedListenerC4117wj);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3683og.f26598n).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnScrollChangedListenerC3683og.Q1(viewTreeObserver);
        }
        ViewTreeObserverOnGlobalLayoutListenerC3629ng viewTreeObserverOnGlobalLayoutListenerC3629ng = new ViewTreeObserverOnGlobalLayoutListenerC3629ng(viewTreeObserverOnScrollChangedListenerC4117wj, viewTreeObserverOnScrollChangedListenerC4117wj);
        View view3 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3629ng.f26598n).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3629ng.Q1(viewTreeObserver3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObject = st.f27621h0;
        JSONObject optJSONObject = jSONObject.optJSONObject(com.anythink.expressad.foundation.d.g.f18705j);
        if (optJSONObject != null) {
            viewTreeObserverOnScrollChangedListenerC4117wj.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            viewTreeObserverOnScrollChangedListenerC4117wj.b(optJSONObject2, relativeLayout, 12);
        }
        viewTreeObserverOnScrollChangedListenerC4117wj.addView(relativeLayout);
        return viewTreeObserverOnScrollChangedListenerC4117wj;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.f34868n;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(com.anythink.basead.exoplayer.k.o.f8446c, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        C4900p c4900p = C4900p.f40199g;
        v2.d dVar = c4900p.f40200a;
        int b9 = v2.d.b(context, (int) optDouble);
        textView.setPadding(0, b9, 0, b9);
        double optDouble2 = jSONObject.optDouble("height", 15.0d);
        v2.d dVar2 = c4900p.f40200a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v2.d.b(context, (int) optDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f34869u.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f34869u.setY(-r0[1]);
    }
}
