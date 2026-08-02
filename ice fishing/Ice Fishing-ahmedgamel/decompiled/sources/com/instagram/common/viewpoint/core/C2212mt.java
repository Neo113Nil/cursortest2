package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2212mt implements InterfaceC0967Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.instagram.common.viewpoint.core.InterfaceC0967Hd
    public final /* synthetic */ int AIp(InterfaceC06002c interfaceC06002c, int i, boolean z6) {
        return AbstractC0964Ha.A00(this, interfaceC06002c, i, z6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0967Hd
    public final /* synthetic */ void AIr(C06674v c06674v, int i) {
        AbstractC0964Ha.A01(this, c06674v, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0967Hd
    public final void A6e(C2420qI c2420qI) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0967Hd
    public final int AIq(InterfaceC06002c interfaceC06002c, int i, boolean z6, int i4) throws IOException {
        int bytesSkipped = interfaceC06002c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0967Hd
    public final void AIs(C06674v c06674v, int i, int i4) {
        c06674v.A0g(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0967Hd
    public final void AIu(long j6, int i, int i4, int i6, C0965Hb c0965Hb) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0967Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
