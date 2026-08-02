package com.yandex.plus.home.dailyquests.feature.internal.utils;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f;
import defpackage.asq;
import defpackage.nyf;
import defpackage.r7o;
import defpackage.wdu;
import defpackage.z7o;
import defpackage.zt3;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((nyf) obj3).d((b) obj2);
                break;
            case 1:
                View view = (View) obj3;
                e eVar = (e) obj2;
                view.removeOnAttachStateChangeListener(eVar);
                WeakHashMap weakHashMap = wdu.a;
                if (view.isAttachedToWindow()) {
                    eVar.onViewDetachedFromWindow(view);
                }
                break;
            case 2:
                View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) obj;
                onAttachStateChangeListener.getClass();
                ((View) obj3).removeOnAttachStateChangeListener(onAttachStateChangeListener);
                zt3 zt3Var = (zt3) obj2;
                if (zt3Var.w()) {
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(Unit.a);
                }
                break;
            default:
                ColorStateList valueOf = ColorStateList.valueOf(((Number) obj).intValue());
                valueOf.getClass();
                asq.N((TextView) obj3, valueOf);
                ImageView imageView = ((f) obj2).r;
                if (imageView != null) {
                    imageView.setImageTintList(valueOf);
                }
                break;
        }
        return Unit.a;
    }
}
