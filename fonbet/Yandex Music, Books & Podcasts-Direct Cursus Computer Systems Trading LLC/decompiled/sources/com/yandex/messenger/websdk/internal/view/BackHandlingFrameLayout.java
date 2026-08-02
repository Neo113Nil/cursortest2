package com.yandex.messenger.websdk.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.fi4;
import defpackage.fmq;
import defpackage.ia0;
import defpackage.wi2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class BackHandlingFrameLayout extends FrameLayout {
    public final fmq a;

    public /* synthetic */ BackHandlingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (((kotlin.jvm.internal.Intrinsics.d(r0.J, defpackage.bi4.s) && (r0 = r0.f()) != null) ? r0.e() : false) == true) goto L13;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        boolean z;
        keyEvent.getClass();
        int keyCode = keyEvent.getKeyCode();
        fmq fmqVar = this.a;
        BackHandlingFrameLayout backHandlingFrameLayout = (BackHandlingFrameLayout) fmqVar.c;
        if (((wi2) fmqVar.d) != null && keyCode == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = backHandlingFrameLayout.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, fmqVar);
                }
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = backHandlingFrameLayout.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    wi2 wi2Var = (wi2) fmqVar.d;
                    wi2Var.getClass();
                    fi4 fi4Var = (fi4) ((ia0) wi2Var).m;
                    if (fi4Var != null) {
                    }
                }
            }
            z = true;
            return !z || super.dispatchKeyEventPreIme(keyEvent);
        }
        z = false;
        if (z) {
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        view.getClass();
        fmq fmqVar = this.a;
        fmqVar.getClass();
        if (view == ((BackHandlingFrameLayout) fmqVar.c)) {
            fmqVar.A();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        fmq fmqVar = this.a;
        if (z) {
            fmqVar.A();
        } else {
            fmqVar.getClass();
        }
    }

    public void setBackClickEnabled(boolean z) {
        fmq fmqVar = this.a;
        fmqVar.b = z;
        fmqVar.A();
    }

    public void setOnBackClickListener(wi2 wi2Var) {
        fmq fmqVar = this.a;
        fmqVar.d = wi2Var;
        fmqVar.A();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackHandlingFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackHandlingFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackHandlingFrameLayout(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlingFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        fmq fmqVar = new fmq(this);
        this.a = fmqVar;
        getVisibility();
        fmqVar.A();
    }
}
