package ru.yandex.taxi.stories.domain;

import android.view.ViewTreeObserver;
import defpackage.g18;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class ImageLoaderDelegateKt$doOnPreDraw$callback$1 implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ sls $action;
    final /* synthetic */ Ref$ObjectRef<g18> $cancel;

    public ImageLoaderDelegateKt$doOnPreDraw$callback$1(sls slsVar, Ref$ObjectRef<g18> ref$ObjectRef) {
        this.$action = slsVar;
        this.$cancel = ref$ObjectRef;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.$action.invoke();
        this.$cancel.element.cancel();
        return true;
    }
}
