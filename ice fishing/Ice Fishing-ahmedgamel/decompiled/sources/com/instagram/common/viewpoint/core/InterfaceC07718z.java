package com.instagram.common.viewpoint.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC07718z {
    void A59(C2420qI c2420qI, int i, int[] iArr) throws C07668s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z6);

    C2399px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j6, int i) throws C07678t, C07708y;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C07708y;

    void AJG(C2426qQ c2426qQ);

    void AJH(int i);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z6);

    void AJV(InterfaceC07688v interfaceC07688v);

    void AJd(C2399px c2399px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z6);

    boolean AKN(C2420qI c2420qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i, int i4);

    void flush();

    void pause();

    void setVolume(float f2);
}
