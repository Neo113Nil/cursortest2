package com.yandex.plus.home.feature.webviews.internal.accessibility;

import android.view.View;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class a implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ b c;
    public final /* synthetic */ View d;

    public /* synthetic */ a(View view, b bVar, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = bVar;
        this.d = view2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                b bVar = this.c;
                ArrayList arrayList = bVar.a;
                ArrayList arrayList2 = bVar.a;
                View view2 = this.d;
                arrayList.add(view2);
                if (!view2.isAttachedToWindow()) {
                    arrayList2.remove(view2);
                    b.a((View) CollectionsKt.Z(arrayList2));
                    break;
                } else {
                    view2.addOnAttachStateChangeListener(new a(view2, bVar, view2, 1));
                    break;
                }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                b bVar = this.c;
                bVar.a.remove(this.d);
                b.a((View) CollectionsKt.Z(bVar.a));
                break;
        }
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
