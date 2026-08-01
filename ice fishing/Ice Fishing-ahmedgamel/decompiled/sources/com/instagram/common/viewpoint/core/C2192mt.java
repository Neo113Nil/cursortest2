package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2192mt implements InterfaceC0947Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final /* synthetic */ int AIp(InterfaceC05802c interfaceC05802c, int i, boolean z3) {
        return AbstractC0944Ha.A00(this, interfaceC05802c, i, z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final /* synthetic */ void AIr(C06474v c06474v, int i) {
        AbstractC0944Ha.A01(this, c06474v, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final void A6e(C2400qI c2400qI) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final int AIq(InterfaceC05802c interfaceC05802c, int i, boolean z3, int i6) throws IOException {
        int bytesSkipped = interfaceC05802c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final void AIs(C06474v c06474v, int i, int i6) {
        c06474v.A0g(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    public final void AIu(long j6, int i, int i6, int i9, C0945Hb c0945Hb) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0947Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
