package com.instagram.common.viewpoint.core;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1793fd implements MediaController.MediaPlayerControl {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0860Cz A00;

    public C1793fd(TextureViewSurfaceTextureListenerC0860Cz textureViewSurfaceTextureListenerC0860Cz) {
        this.A00 = textureViewSurfaceTextureListenerC0860Cz;
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
        C1787fX c1787fX;
        C1787fX c1787fX2;
        c1787fX = this.A00.A0C;
        if (c1787fX == null) {
            return 0;
        }
        c1787fX2 = this.A00.A0C;
        return c1787fX2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C1787fX c1787fX;
        C1787fX c1787fX2;
        c1787fX = this.A00.A0C;
        if (c1787fX == null) {
            return 0;
        }
        c1787fX2 = this.A00.A0C;
        return c1787fX2.A05();
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
        C1787fX c1787fX;
        C1787fX c1787fX2;
        c1787fX = this.A00.A0C;
        if (c1787fX != null) {
            c1787fX2 = this.A00.A0C;
            if (c1787fX2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1803fn interfaceC1803fn;
        InterfaceC1803fn interfaceC1803fn2;
        interfaceC1803fn = this.A00.A0F;
        if (interfaceC1803fn != null) {
            interfaceC1803fn2 = this.A00.A0F;
            interfaceC1803fn2.AEo();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1803fn interfaceC1803fn;
        InterfaceC1803fn interfaceC1803fn2;
        interfaceC1803fn = this.A00.A0F;
        if (interfaceC1803fn != null) {
            interfaceC1803fn2 = this.A00.A0F;
            interfaceC1803fn2.AEp();
        }
    }
}
