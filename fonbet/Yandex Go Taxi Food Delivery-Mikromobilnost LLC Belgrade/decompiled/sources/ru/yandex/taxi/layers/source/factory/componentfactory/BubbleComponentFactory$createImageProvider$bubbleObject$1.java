package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.graphics.drawable.Drawable;
import android.util.LruCache;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class BubbleComponentFactory$createImageProvider$bubbleObject$1 extends FunctionReferenceImpl implements tls {
    public BubbleComponentFactory$createImageProvider$bubbleObject$1(LruCache lruCache) {
        super(1, lruCache, LruCache.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return (Drawable) ((LruCache) this.receiver).get((String) obj);
    }
}
