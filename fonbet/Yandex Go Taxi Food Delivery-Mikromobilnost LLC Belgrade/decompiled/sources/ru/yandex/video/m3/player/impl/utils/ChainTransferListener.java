package ru.yandex.video.m3.player.impl.utils;

import defpackage.cj01;
import defpackage.kpg;
import defpackage.npg;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/ChainTransferListener;", "Lcj01;", "", "listeners", "<init>", "([Lcj01;)V", "Lkpg;", "p0", "Lnpg;", "p1", "", "p2", "Lzy11;", "onTransferInitializing", "(Lkpg;Lnpg;Z)V", "onTransferStart", "", "p3", "onBytesTransferred", "(Lkpg;Lnpg;ZI)V", "onTransferEnd", "[Lcj01;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChainTransferListener implements cj01 {
    public static final int $stable = 8;
    private final cj01[] listeners;

    public ChainTransferListener(cj01... cj01VarArr) {
        this.listeners = cj01VarArr;
    }

    @Override // defpackage.cj01
    public void onBytesTransferred(kpg p0, npg p1, boolean p2, int p3) {
        for (cj01 cj01Var : this.listeners) {
            cj01Var.onBytesTransferred(p0, p1, p2, p3);
        }
    }

    @Override // defpackage.cj01
    public void onTransferEnd(kpg p0, npg p1, boolean p2) {
        for (cj01 cj01Var : this.listeners) {
            cj01Var.onTransferEnd(p0, p1, p2);
        }
    }

    @Override // defpackage.cj01
    public void onTransferInitializing(kpg p0, npg p1, boolean p2) {
        for (cj01 cj01Var : this.listeners) {
            cj01Var.onTransferInitializing(p0, p1, p2);
        }
    }

    @Override // defpackage.cj01
    public void onTransferStart(kpg p0, npg p1, boolean p2) {
        for (cj01 cj01Var : this.listeners) {
            cj01Var.onTransferStart(p0, p1, p2);
        }
    }
}
