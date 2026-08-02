package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2211ms extends InterfaceC06002c {
    void A47(int i) throws IOException;

    boolean A48(int i, boolean z6) throws IOException;

    long A8O();

    long A8i();

    long A8n();

    @MetaExoPlayerCustomization("Added API for MP4 extractor")
    Uri A9P();

    int AGs(byte[] bArr, int i, int i4) throws IOException;

    void AGt(byte[] bArr, int i, int i4) throws IOException;

    boolean AGu(byte[] bArr, int i, int i4, boolean z6) throws IOException;

    boolean AHR(byte[] bArr, int i, int i4, boolean z6) throws IOException;

    void AIl();

    int AK0(int i) throws IOException;

    void AK3(int i) throws IOException;

    @Override // com.instagram.common.viewpoint.core.InterfaceC06002c
    int read(byte[] bArr, int i, int i4) throws IOException;

    void readFully(byte[] bArr, int i, int i4) throws IOException;
}
