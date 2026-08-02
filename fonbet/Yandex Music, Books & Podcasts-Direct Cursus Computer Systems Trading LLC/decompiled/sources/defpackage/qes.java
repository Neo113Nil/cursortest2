package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class qes extends x2b {
    public final ArrayList w;
    public final ArrayList x;
    public final pj4 y;
    public String z;

    public qes(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = new ArrayList();
        this.x = new ArrayList();
        if (zb.b == null) {
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            zb.b = accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE;
        }
        if (!Intrinsics.d(zb.b, Boolean.TRUE)) {
            this.y = null;
            return;
        }
        pj4 pj4Var = new pj4(this);
        this.y = pj4Var;
        wdu.q(this, pj4Var);
        setAccessibilityLiveRegion(1);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        pj4 pj4Var = this.y;
        return (pj4Var != null && pj4Var.m(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        pj4 pj4Var = this.y;
        return (pj4Var != null && pj4Var.n(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.w.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            pj4 pj4Var = this.y;
            if (pj4Var != null) {
                pj4Var.q(i, 0);
            }
            i = i2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        pj4 pj4Var = this.y;
        if (pj4Var != null) {
            pj4Var.t(z, i, rect);
        }
    }

    public final void q() {
        String str;
        if (!Intrinsics.d(zb.b, Boolean.TRUE)) {
            super.setContentDescription(this.z);
            return;
        }
        ArrayList arrayList = this.x;
        if (arrayList == null || this.z != null) {
            str = this.z;
        } else {
            str = null;
            str = null;
            if (arrayList.size() != 0 && getText().length() != 0) {
                CharSequence text = getText();
                SpannableString spannableString = text instanceof SpannableString ? (SpannableString) text : null;
                if (spannableString != null) {
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(spannableString.getSpanStart((uce) it.next())));
                    }
                    List o0 = CollectionsKt.o0(arrayList2, new t1n(9));
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = o0.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        sb.append(getText().subSequence(i, intValue));
                        i = intValue + 1;
                    }
                    sb.append(getText().subSequence(i, getText().length()));
                    str = sb.toString();
                } else {
                    str = getText().toString();
                }
            }
        }
        super.setContentDescription(str);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        this.z = charSequence != null ? charSequence.toString() : null;
        super.setContentDescription(charSequence);
    }

    @Override // defpackage.x2b, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        q();
    }

    public /* synthetic */ qes(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
