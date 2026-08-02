package ru.yandex.video.m3.list_player_manager.impl.image;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class ListPreloaderWithBufferedScroll$listPreloader$1 extends FunctionReferenceImpl implements sls {
    public ListPreloaderWithBufferedScroll$listPreloader$1(Object obj) {
        super(0, obj, ListPreloaderWithBufferedScroll.class, "onSizeIsReady", "onSizeIsReady()V", 0);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m743invoke() {
        ((ListPreloaderWithBufferedScroll) this.receiver).onSizeIsReady();
    }

    @Override // defpackage.sls
    public /* bridge */ /* synthetic */ Object invoke() {
        m743invoke();
        return zy11.a;
    }
}
