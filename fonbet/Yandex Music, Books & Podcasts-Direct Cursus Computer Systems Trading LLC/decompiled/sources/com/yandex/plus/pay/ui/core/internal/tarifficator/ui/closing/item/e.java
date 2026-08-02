package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.aa5;
import defpackage.eup;
import defpackage.ff7;
import defpackage.h1b;
import defpackage.h5;
import defpackage.kpn;
import defpackage.ouj;
import defpackage.qon;
import defpackage.rj7;
import defpackage.rvf;
import defpackage.won;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class e extends won {
    public final Drawable a;
    public final int b;
    public final int c;
    public final int d;

    public e(Drawable drawable, int i, int i2, int i3) {
        this.a = drawable;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        rect.getClass();
        view.getClass();
        kpnVar.getClass();
        int Y = RecyclerView.Y(view);
        Integer valueOf = Integer.valueOf(Y);
        if (Y == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            qon adapter = recyclerView.getAdapter();
            int c = adapter != null ? adapter.c() : 0;
            boolean z = recyclerView.getLayoutDirection() == 1;
            ((MaterialCardView) view).setCardBackgroundColor(aa5.l(r1.j(R.attr.pay_sdk_primaryBlockColor, view), 153));
            if (c != 1) {
                int i = this.b;
                if (c == 2) {
                    if (intValue < c - 1) {
                        if (z) {
                            rect.left = i;
                            return;
                        } else {
                            rect.right = i;
                            return;
                        }
                    }
                    return;
                }
                if (intValue == 0) {
                    rect.left = i;
                    rect.right = i;
                }
                if (z) {
                    rect.left = i;
                } else {
                    rect.right = i;
                }
            }
        }
    }

    @Override // defpackage.won
    public final void g(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
        Pair pair;
        canvas.getClass();
        kpnVar.getClass();
        qon adapter = recyclerView.getAdapter();
        int c = adapter != null ? adapter.c() : 0;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            }
            int Y = RecyclerView.Y(childAt);
            if (Y != -1) {
                int i3 = c - 1;
                if (Y < i3 && Build.VERSION.SDK_INT > 28) {
                    int height = childAt.getHeight();
                    Drawable drawable = this.a;
                    int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
                    int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
                    int i4 = this.b;
                    if (z) {
                        int left = childAt.getLeft() - ((i4 - intrinsicWidth) / 2);
                        pair = new Pair(Integer.valueOf(left - intrinsicWidth), Integer.valueOf(left));
                    } else {
                        int b = ouj.b(i4, intrinsicWidth, 2, childAt.getRight());
                        pair = new Pair(Integer.valueOf(b), Integer.valueOf(intrinsicWidth + b));
                    }
                    int intValue = ((Number) pair.a).intValue();
                    int intValue2 = ((Number) pair.b).intValue();
                    int top = ((height / 2) + childAt.getTop()) - (intrinsicHeight / 2);
                    int i5 = intrinsicHeight + top;
                    if (drawable != null) {
                        drawable.setBounds(new Rect(intValue, top, intValue2, i5));
                    }
                    if (drawable != null) {
                        drawable.draw(canvas);
                        if (c > 1 && Build.VERSION.SDK_INT > 28) {
                            com.google.android.material.shape.a aVar = new com.google.android.material.shape.a((Y == 0 || c <= 1) ? (Y == i3 || c <= 1) ? i(true, true) : i(!z, z) : i(z, !z));
                            aVar.setTint(aa5.l(r1.j(R.attr.pay_sdk_primaryBlockColor, childAt), 153));
                            Paint.Style style = Paint.Style.FILL;
                            aVar.t();
                            childAt.setBackground(aVar);
                        }
                    }
                }
                if (c > 1) {
                    com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a((Y == 0 || c <= 1) ? (Y == i3 || c <= 1) ? i(true, true) : i(!z, z) : i(z, !z));
                    aVar2.setTint(aa5.l(r1.j(R.attr.pay_sdk_primaryBlockColor, childAt), 153));
                    Paint.Style style2 = Paint.Style.FILL;
                    aVar2.t();
                    childAt.setBackground(aVar2);
                }
            }
            i = i2;
        }
    }

    public final eup i(boolean z, boolean z2) {
        h1b h1bVar = new h1b();
        h1b h1bVar2 = new h1b();
        h1b h1bVar3 = new h1b();
        h1b h1bVar4 = new h1b();
        if (z) {
            h1bVar4 = new d(this);
        }
        if (z2) {
            h1bVar2 = new d(this);
        }
        float f = this.d;
        ff7 y = rvf.y(0);
        h5 h5Var = new h5(f);
        h5 h5Var2 = new h5(f);
        h5 h5Var3 = new h5(f);
        h5 h5Var4 = new h5(f);
        eup eupVar = new eup();
        eupVar.a = y;
        eupVar.b = y;
        eupVar.c = y;
        eupVar.d = y;
        eupVar.e = h5Var;
        eupVar.f = h5Var2;
        eupVar.g = h5Var3;
        eupVar.h = h5Var4;
        eupVar.i = h1bVar;
        eupVar.j = h1bVar2;
        eupVar.k = h1bVar3;
        eupVar.l = h1bVar4;
        return eupVar;
    }
}
