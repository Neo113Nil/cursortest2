package defpackage;

import ru.yandex.video.m3.player.bandwidth.IntervalTaskImpl;

/* loaded from: classes7.dex */
public final class twq {
    public final uuw a;

    public twq(IntervalTaskImpl.Factory factory, int i) {
        this.a = (i & 1) != 0 ? null : factory;
    }

    public twq() {
        this(null, 3);
    }
}
