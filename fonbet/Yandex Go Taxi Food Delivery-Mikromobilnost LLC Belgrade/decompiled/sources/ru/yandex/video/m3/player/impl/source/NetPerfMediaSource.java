package ru.yandex.video.m3.player.impl.source;

import android.os.Handler;
import defpackage.a9z0;
import defpackage.au1;
import defpackage.cj01;
import defpackage.fe10;
import defpackage.nmm;
import defpackage.sf10;
import defpackage.tf10;
import defpackage.uf10;
import defpackage.vyc0;
import defpackage.xe10;
import defpackage.yf10;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.NetPerfMarker;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u001cH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u001cH\u0097\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010!\u001a\u00020 H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b#\u0010$J,\u0010'\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u001c2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010%2\u0006\u0010\u0018\u001a\u00020&H\u0097\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0019H\u0097\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u001cH\u0097\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b\u0004\u00101R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105¨\u00066"}, d2 = {"Lru/yandex/video/m3/player/impl/source/NetPerfMediaSource;", "Lru/yandex/video/m3/player/impl/NetPerfMarker;", "Luf10;", "", "isNetPerfEnabled", "", "className", "delegateMediaSource", "<init>", "(ZLjava/lang/String;Luf10;)V", "(ZLuf10;)V", "Landroid/os/Handler;", "p0", "Lnmm;", "p1", "Lzy11;", "addDrmEventListener", "(Landroid/os/Handler;Lnmm;)V", "Lyf10;", "addEventListener", "(Landroid/os/Handler;Lyf10;)V", "Lsf10;", "Lau1;", "", "p2", "Lxe10;", "createPeriod", "(Lsf10;Lau1;J)Lxe10;", "Ltf10;", "disable", "(Ltf10;)V", "enable", "Lfe10;", "getMediaItem", "()Lfe10;", "maybeThrowSourceInfoRefreshError", "()V", "Lcj01;", "Lvyc0;", "prepareSource", "(Ltf10;Lcj01;Lvyc0;)V", "releasePeriod", "(Lxe10;)V", "releaseSource", "removeDrmEventListener", "(Lnmm;)V", "removeEventListener", "(Lyf10;)V", "Z", "()Z", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "Luf10;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetPerfMediaSource implements NetPerfMarker, uf10 {
    public static final int $stable = 8;
    private final String className;
    private final uf10 delegateMediaSource;
    private final boolean isNetPerfEnabled;

    public NetPerfMediaSource(boolean z, uf10 uf10Var) {
        this(z, uf10Var.getClass().getSimpleName(), uf10Var);
    }

    @Override // defpackage.uf10
    public void addDrmEventListener(Handler p0, nmm p1) {
        this.delegateMediaSource.addDrmEventListener(p0, p1);
    }

    @Override // defpackage.uf10
    public void addEventListener(Handler p0, yf10 p1) {
        this.delegateMediaSource.addEventListener(p0, p1);
    }

    @Override // defpackage.uf10
    public /* bridge */ /* synthetic */ boolean canUpdateMediaItem(fe10 fe10Var) {
        return false;
    }

    @Override // defpackage.uf10
    public xe10 createPeriod(sf10 p0, au1 p1, long p2) {
        return this.delegateMediaSource.createPeriod(p0, p1, p2);
    }

    @Override // defpackage.uf10
    public void disable(tf10 p0) {
        this.delegateMediaSource.disable(p0);
    }

    @Override // defpackage.uf10
    public void enable(tf10 p0) {
        this.delegateMediaSource.enable(p0);
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    public String getClassName() {
        return this.className;
    }

    @Override // defpackage.uf10
    public /* bridge */ /* synthetic */ a9z0 getInitialTimeline() {
        return null;
    }

    @Override // defpackage.uf10
    public fe10 getMediaItem() {
        return this.delegateMediaSource.getMediaItem();
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    /* renamed from: isNetPerfEnabled, reason: from getter */
    public boolean getIsNetPerfEnabled() {
        return this.isNetPerfEnabled;
    }

    @Override // defpackage.uf10
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return true;
    }

    @Override // defpackage.uf10
    public void maybeThrowSourceInfoRefreshError() {
        this.delegateMediaSource.maybeThrowSourceInfoRefreshError();
    }

    @Override // defpackage.uf10
    public void prepareSource(tf10 p0, cj01 p1, vyc0 p2) {
        this.delegateMediaSource.prepareSource(p0, p1, p2);
    }

    @Override // defpackage.uf10
    public void releasePeriod(xe10 p0) {
        this.delegateMediaSource.releasePeriod(p0);
    }

    @Override // defpackage.uf10
    public void releaseSource(tf10 p0) {
        this.delegateMediaSource.releaseSource(p0);
    }

    @Override // defpackage.uf10
    public void removeDrmEventListener(nmm p0) {
        this.delegateMediaSource.removeDrmEventListener(p0);
    }

    @Override // defpackage.uf10
    public void removeEventListener(yf10 p0) {
        this.delegateMediaSource.removeEventListener(p0);
    }

    @Override // defpackage.uf10
    public /* bridge */ /* synthetic */ void updateMediaItem(fe10 fe10Var) {
    }

    @Override // defpackage.uf10
    @Deprecated
    public void prepareSource(tf10 tf10Var, cj01 cj01Var) {
        prepareSource(tf10Var, cj01Var, vyc0.d);
    }

    public NetPerfMediaSource(boolean z, String str, uf10 uf10Var) {
        this.isNetPerfEnabled = z;
        this.className = str;
        this.delegateMediaSource = uf10Var;
    }
}
