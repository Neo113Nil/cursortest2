package ru.yandex.taxi.activity;

import android.view.View;
import android.view.ViewGroup;
import defpackage.ffe;
import defpackage.jl40;
import defpackage.l7a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"ru/yandex/taxi/activity/ContentContainer$1", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "Lzy11;", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", "onChildViewRemoved", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContentContainer$1 implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ ffe this$0;

    public ContentContainer$1(ffe ffeVar) {
        this.this$0 = ffeVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View parent, View child) {
        if (jl40.l(parent, this.this$0.a)) {
            Throwable th = new Throwable();
            ffe ffeVar = this.this$0;
            ffeVar.a.post(new l7a(23, ffeVar, th));
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View parent, View child) {
    }
}
