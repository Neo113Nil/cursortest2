package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import u2.C5076g;

/* renamed from: com.google.android.gms.internal.ads.Kn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2646Kn extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final C5076g f25970n;

    public C2646Kn(Context context, View view, C5076g c5076g) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f25970n = c5076g;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f25970n.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof InterfaceC4061vh) {
                arrayList.add((InterfaceC4061vh) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((InterfaceC4061vh) arrayList.get(i6)).destroy();
        }
    }
}
