package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import w2.C5147g;

/* renamed from: com.google.android.gms.internal.ads.Ln, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2683Ln extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final C5147g f26967n;

    public C2683Ln(Context context, View view, C5147g c5147g) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f26967n = c5147g;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f26967n.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof InterfaceC4084vh) {
                arrayList.add((InterfaceC4084vh) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((InterfaceC4084vh) arrayList.get(i4)).destroy();
        }
    }
}
