package ru.yandex.video.m3.telemetry.helpers;

import defpackage.cj01;
import defpackage.kpg;
import defpackage.npg;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/telemetry/helpers/ProxyTransferListener;", "Lcj01;", "externalTransferListener", "internalTransferListener", "<init>", "(Lcj01;Lcj01;)V", "Lkpg;", "source", "Lnpg;", "dataSpec", "", "isNetwork", "Lzy11;", "onTransferInitializing", "(Lkpg;Lnpg;Z)V", "onTransferStart", "", "bytesTransferred", "onBytesTransferred", "(Lkpg;Lnpg;ZI)V", "onTransferEnd", "Lcj01;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProxyTransferListener implements cj01 {
    public static final int $stable = 8;
    private final cj01 externalTransferListener;
    private final cj01 internalTransferListener;

    public ProxyTransferListener(cj01 cj01Var, cj01 cj01Var2) {
        this.externalTransferListener = cj01Var;
        this.internalTransferListener = cj01Var2;
    }

    @Override // defpackage.cj01
    public void onBytesTransferred(kpg source, npg dataSpec, boolean isNetwork, int bytesTransferred) {
        this.internalTransferListener.onBytesTransferred(source, dataSpec, isNetwork, bytesTransferred);
        cj01 cj01Var = this.externalTransferListener;
        if (cj01Var != null) {
            cj01Var.onBytesTransferred(source, dataSpec, isNetwork, bytesTransferred);
        }
    }

    @Override // defpackage.cj01
    public void onTransferEnd(kpg source, npg dataSpec, boolean isNetwork) {
        this.internalTransferListener.onTransferEnd(source, dataSpec, isNetwork);
        cj01 cj01Var = this.externalTransferListener;
        if (cj01Var != null) {
            cj01Var.onTransferEnd(source, dataSpec, isNetwork);
        }
    }

    @Override // defpackage.cj01
    public void onTransferInitializing(kpg source, npg dataSpec, boolean isNetwork) {
        this.internalTransferListener.onTransferInitializing(source, dataSpec, isNetwork);
        cj01 cj01Var = this.externalTransferListener;
        if (cj01Var != null) {
            cj01Var.onTransferInitializing(source, dataSpec, isNetwork);
        }
    }

    @Override // defpackage.cj01
    public void onTransferStart(kpg source, npg dataSpec, boolean isNetwork) {
        this.internalTransferListener.onTransferStart(source, dataSpec, isNetwork);
        cj01 cj01Var = this.externalTransferListener;
        if (cj01Var != null) {
            cj01Var.onTransferStart(source, dataSpec, isNetwork);
        }
    }
}
