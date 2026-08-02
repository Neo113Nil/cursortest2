package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2368pR implements AnonymousClass24 {
    public final long A00;

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C2370pT> A01;
    public static final C2368pR A03 = new C2368pR(MetaExoPlayerCustomizedCollections.A01(), 0);
    public static final String A04 = C5C.A0h(0);
    public static final String A05 = C5C.A0h(1);
    public static final AnonymousClass23<C2368pR> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pS
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C2368pR A00;
            A00 = C2368pR.A00(bundle);
            return A00;
        }
    };

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C2368pR(List<C2370pT> list, long j6) {
        this.A01 = MetaExoPlayerCustomizedCollections.A03((C2370pT[]) list.toArray(new C2370pT[0]));
        this.A00 = j6;
    }

    public static final C2368pR A00(Bundle bundle) {
        List A01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            A01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = AnonymousClass44.A01(C2370pT.A0I, cues);
        }
        return new C2368pR(A01, bundle.getLong(A05));
    }
}
