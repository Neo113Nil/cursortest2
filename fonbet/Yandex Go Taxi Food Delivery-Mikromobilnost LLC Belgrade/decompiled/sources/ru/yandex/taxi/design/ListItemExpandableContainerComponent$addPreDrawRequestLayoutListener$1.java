package ru.yandex.taxi.design;

import android.widget.FrameLayout;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class ListItemExpandableContainerComponent$addPreDrawRequestLayoutListener$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        ((FrameLayout) this.receiver).requestLayout();
        return zy11.a;
    }
}
