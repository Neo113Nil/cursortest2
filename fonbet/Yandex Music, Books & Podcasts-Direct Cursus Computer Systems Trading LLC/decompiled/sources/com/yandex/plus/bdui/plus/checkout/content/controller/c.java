package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import defpackage.f1d;
import defpackage.kqv;
import defpackage.td0;
import defpackage.wpv;
import defpackage.xpv;
import defpackage.xq0;
import defpackage.ypv;
import defpackage.zpv;

/* loaded from: classes4.dex */
public abstract class c extends com.yandex.plus.bdui.plus.content.controller.a {
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.plus.bdui.m mVar, int i) {
        super(mVar);
        mVar.getClass();
        this.b = i;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        ((Activity) context).setRequestedOrientation(this.b);
    }

    @Override // com.yandex.plus.bdui.ui.c
    public View b(ViewGroup viewGroup) {
        Rect rect;
        kqv b;
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        Activity activity = (Activity) context;
        int i = activity.getResources().getConfiguration().orientation;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rect = com.yandex.plus.core.window.a.b(activity);
        } else {
            Object systemService = activity.getSystemService("window");
            systemService.getClass();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            defaultDisplay.getClass();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            rect = new Rect(0, 0, point.x, point.y);
        }
        if (i2 < 30) {
            b = (i2 >= 34 ? new zpv() : i2 >= 30 ? new ypv() : i2 >= 29 ? new xpv() : new wpv()).b();
            b.getClass();
        } else {
            if (i2 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b = com.yandex.plus.core.window.a.a.a(activity);
        }
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        if (i3 > i5) {
            xq0.o(f1d.e(i3, i5, "Left must be less than or equal to right, left: ", ", right: "));
            return null;
        }
        if (i4 > i6) {
            xq0.o(f1d.e(i4, i6, "top must be less than or equal to bottom, top: ", ", bottom: "));
            return null;
        }
        b.getClass();
        int width = new Rect(i3, i4, i5, i6).width();
        int height = new Rect(i3, i4, i5, i6).height();
        float f = activity.getResources().getDisplayMetrics().density;
        float f2 = width / f;
        float f3 = height / f;
        if (f2 < 0.0f) {
            td0.f("Width must be positive, received ", f2);
            return null;
        }
        com.yandex.plus.core.window.c cVar = com.yandex.plus.core.window.c.b;
        com.yandex.plus.core.window.c cVar2 = f2 < 600.0f ? cVar : f2 < 840.0f ? com.yandex.plus.core.window.c.c : com.yandex.plus.core.window.c.d;
        if (f3 < 0.0f) {
            td0.f("Height must be positive, received ", f3);
            return null;
        }
        com.yandex.plus.core.window.b bVar = com.yandex.plus.core.window.b.b;
        int i7 = (cVar2.equals(cVar) || ((f3 > 480.0f ? 1 : (f3 == 480.0f ? 0 : -1)) < 0 ? bVar : (f3 > 900.0f ? 1 : (f3 == 900.0f ? 0 : -1)) < 0 ? com.yandex.plus.core.window.b.c : com.yandex.plus.core.window.b.d).equals(bVar) || i != 2) ? 1 : 0;
        activity.setRequestedOrientation(i7);
        b bVar2 = new b(activity, i7, viewGroup.getContext());
        Context context2 = bVar2.getContext();
        context2.getClass();
        bVar2.setBackgroundColor(context2.getColor(R.color.transparent));
        return bVar2;
    }
}
