package ru.yandex.video.m3.player.utils;

import defpackage.kgx;
import defpackage.xbi0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/utils/NotNullAtomic;", "", "T", "Lxbi0;", "initValue", "<init>", "(Ljava/lang/Object;)V", "thisRef", "Lkgx;", "property", "getValue", "(Ljava/lang/Object;Lkgx;)Ljava/lang/Object;", "value", "Lzy11;", "setValue", "(Ljava/lang/Object;Lkgx;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class NotNullAtomic<T> implements xbi0 {
    private final AtomicReference<T> value;

    public NotNullAtomic(T t) {
        this.value = new AtomicReference<>(t);
    }

    @Override // defpackage.vbi0
    public T getValue(Object thisRef, kgx property) {
        return this.value.get();
    }

    @Override // defpackage.xbi0
    public void setValue(Object thisRef, kgx property, T value) {
        this.value.set(value);
    }
}
