package com.yandex.plus.plaquesdk.plaque;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.plus.plaquesdk.plaque.api.dependencies.d;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.btf;
import defpackage.bw1;
import defpackage.jyr;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final d a;
    public final com.yandex.plus.plaquesdk.plaque.api.dependencies.a b;
    public final jyr c;
    public final bw1 d;
    public j0 e;
    public float f;
    public final int g;
    public boolean h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @NotNull d dVar, @NotNull com.yandex.plus.plaquesdk.plaque.api.dependencies.b bVar, @NotNull Function1<? super x, Unit> function1, @NotNull com.yandex.plus.plaquesdk.plaque.api.dependencies.a aVar) {
        super(context);
        context.getClass();
        dVar.getClass();
        bVar.getClass();
        function1.getClass();
        aVar.getClass();
        this.a = dVar;
        this.b = aVar;
        this.c = btf.b(new b(0, this));
        this.d = new bw1((ViewGroup) this, bVar, (Function1) function1, true);
        this.g = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 3;
        this.h = true;
        this.i = new ArrayList();
        setImportantForAccessibility(2);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if ((r3.f - r4.getY()) <= r3.g) goto L21;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 0) {
            this.h = true;
        }
        if (this.h) {
            j0 j0Var = this.e;
            if (j0Var != null && j0Var.f) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    this.f = motionEvent.getY();
                } else if (actionMasked == 2) {
                }
            }
            super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final j0 getPlaqueModel() {
        return this.e;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.a();
    }
}
