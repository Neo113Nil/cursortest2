package ru.yandex.video.m3.player.netperf;

import defpackage.bgo;
import defpackage.yf7;
import defpackage.yfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.netperf.CompositeOkHttpEventListenerFactoryBuilder;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/netperf/CompositeOkHttpEventListenerFactoryBuilder;", "", "<init>", "()V", "Lbgo;", "Lyfo;", "asFactory", "(Lbgo;)Lyfo;", "eventListener", "Lzy11;", "addEventListener", "(Lbgo;)V", "eventListenerFactory", "addEventListenerFactory", "(Lyfo;)V", "build", "()Lyfo;", "", "eventListenerFactories", "Ljava/util/List;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositeOkHttpEventListenerFactoryBuilder {
    public static final int $stable = 8;
    private final List<yfo> eventListenerFactories = new ArrayList();

    private final yfo asFactory(final bgo bgoVar) {
        return new yfo() { // from class: sqd
            @Override // defpackage.yfo
            public final bgo create(yf7 yf7Var) {
                bgo asFactory$lambda$0;
                asFactory$lambda$0 = CompositeOkHttpEventListenerFactoryBuilder.asFactory$lambda$0(bgo.this, yf7Var);
                return asFactory$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bgo asFactory$lambda$0(bgo bgoVar, yf7 yf7Var) {
        return bgoVar;
    }

    public final void addEventListener(bgo eventListener) {
        this.eventListenerFactories.add(asFactory(eventListener));
    }

    public final void addEventListenerFactory(yfo eventListenerFactory) {
        this.eventListenerFactories.add(eventListenerFactory);
    }

    public final yfo build() {
        return new CompositeOkHttpEventListenerFactory(this.eventListenerFactories);
    }
}
