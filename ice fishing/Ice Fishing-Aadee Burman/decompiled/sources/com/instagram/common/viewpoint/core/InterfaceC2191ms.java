package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2191ms extends InterfaceC05802c {
    void A47(int i) throws IOException;

    boolean A48(int i, boolean z3) throws IOException;

    long A8O();

    long A8i();

    long A8n();

    @MetaExoPlayerCustomization("Added API for MP4 extractor")
    Uri A9P();

    int AGs(byte[] bArr, int i, int i6) throws IOException;

    void AGt(byte[] bArr, int i, int i6) throws IOException;

    boolean AGu(byte[] bArr, int i, int i6, boolean z3) throws IOException;

    boolean AHR(byte[] bArr, int i, int i6, boolean z3) throws IOException;

    void AIl();

    int AK0(int i) throws IOException;

    void AK3(int i) throws IOException;

    @Override // com.instagram.common.viewpoint.core.InterfaceC05802c
    int read(byte[] bArr, int i, int i6) throws IOException;

    void readFully(byte[] bArr, int i, int i6) throws IOException;
}
