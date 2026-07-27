package com.instagram.common.viewpoint.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC07508z {
    void A59(C2399qI c2399qI, int i, int[] iArr) throws C07458s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z8);

    C2378px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j9, int i) throws C07468t, C07498y;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C07498y;

    void AJG(C2405qQ c2405qQ);

    void AJH(int i);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z8);

    void AJV(InterfaceC07478v interfaceC07478v);

    void AJd(C2378px c2378px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z8);

    boolean AKN(C2399qI c2399qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i, int i4);

    void flush();

    void pause();

    void setVolume(float f6);
}
