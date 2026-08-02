package com.instagram.common.viewpoint.core;

import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.hE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1892hE implements InterfaceC1415Yv {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ C1890hC A01;

    public C1892hE(C1890hC c1890hC, MediaViewListener mediaViewListener) {
        this.A01 = c1890hC;
        this.A00 = mediaViewListener;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1415Yv
    public final void ADQ() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onComplete(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1415Yv
    public final void ADn() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onEnterFullscreen(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1415Yv
    public final void ADt() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onExitFullscreen(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1415Yv
    public final void AE1() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onFullscreenBackground(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1415Yv
    public final void AE3() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onFullscreenForeground(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1415Yv
    public final void AFC() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onPlay(mediaView);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1415Yv
    public final void AGe() {
        MediaView mediaView;
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewVideoRenderer = this.A01.A09;
        mediaViewListener.onVolumeChange(mediaView, mediaViewVideoRenderer.getVolume());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1415Yv
    public final void onPause() {
        MediaView mediaView;
        MediaViewListener mediaViewListener = this.A00;
        mediaView = this.A01.A07;
        mediaViewListener.onPause(mediaView);
    }
}
