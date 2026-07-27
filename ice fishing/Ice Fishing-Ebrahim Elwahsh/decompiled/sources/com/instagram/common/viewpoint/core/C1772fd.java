package com.instagram.common.viewpoint.core;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1772fd implements MediaController.MediaPlayerControl {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0839Cz A00;

    public C1772fd(TextureViewSurfaceTextureListenerC0839Cz textureViewSurfaceTextureListenerC0839Cz) {
        this.A00 = textureViewSurfaceTextureListenerC0839Cz;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C1766fX c1766fX;
        C1766fX c1766fX2;
        c1766fX = this.A00.A0C;
        if (c1766fX == null) {
            return 0;
        }
        c1766fX2 = this.A00.A0C;
        return c1766fX2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C1766fX c1766fX;
        C1766fX c1766fX2;
        c1766fX = this.A00.A0C;
        if (c1766fX == null) {
            return 0;
        }
        c1766fX2 = this.A00.A0C;
        return c1766fX2.A05();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C1766fX c1766fX;
        C1766fX c1766fX2;
        c1766fX = this.A00.A0C;
        if (c1766fX != null) {
            c1766fX2 = this.A00.A0C;
            if (c1766fX2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1782fn interfaceC1782fn;
        InterfaceC1782fn interfaceC1782fn2;
        interfaceC1782fn = this.A00.A0F;
        if (interfaceC1782fn != null) {
            interfaceC1782fn2 = this.A00.A0F;
            interfaceC1782fn2.AEo();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1782fn interfaceC1782fn;
        InterfaceC1782fn interfaceC1782fn2;
        interfaceC1782fn = this.A00.A0F;
        if (interfaceC1782fn != null) {
            interfaceC1782fn2 = this.A00.A0F;
            interfaceC1782fn2.AEp();
        }
    }
}
