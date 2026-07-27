package com.instagram.common.viewpoint.core;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1773fd implements MediaController.MediaPlayerControl {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0840Cz A00;

    public C1773fd(TextureViewSurfaceTextureListenerC0840Cz textureViewSurfaceTextureListenerC0840Cz) {
        this.A00 = textureViewSurfaceTextureListenerC0840Cz;
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
        C1767fX c1767fX;
        C1767fX c1767fX2;
        c1767fX = this.A00.A0C;
        if (c1767fX == null) {
            return 0;
        }
        c1767fX2 = this.A00.A0C;
        return c1767fX2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C1767fX c1767fX;
        C1767fX c1767fX2;
        c1767fX = this.A00.A0C;
        if (c1767fX == null) {
            return 0;
        }
        c1767fX2 = this.A00.A0C;
        return c1767fX2.A05();
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
        C1767fX c1767fX;
        C1767fX c1767fX2;
        c1767fX = this.A00.A0C;
        if (c1767fX != null) {
            c1767fX2 = this.A00.A0C;
            if (c1767fX2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1783fn interfaceC1783fn;
        InterfaceC1783fn interfaceC1783fn2;
        interfaceC1783fn = this.A00.A0F;
        if (interfaceC1783fn != null) {
            interfaceC1783fn2 = this.A00.A0F;
            interfaceC1783fn2.AEo();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1783fn interfaceC1783fn;
        InterfaceC1783fn interfaceC1783fn2;
        interfaceC1783fn = this.A00.A0F;
        if (interfaceC1783fn != null) {
            interfaceC1783fn2 = this.A00.A0F;
            interfaceC1783fn2.AEp();
        }
    }
}
