package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.anythink.core.common.s.a.c;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2253nu implements DD {
    public static byte[] A03;
    public static String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public H9 A00;
    public InterfaceC2190ms A01;
    public final HD A02;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, 26, 22, 12, 21, 29, 89, 11, 28, 24, 29, 89, 13, 17, 28, 89, 10, 13, 11, 28, 24, 20, 87, 2, 35, 34, 41, 108, 35, 42, 108, 56, 36, 41, 108, 45, 58, 45, 37, 32, 45, 46, 32, 41, 108, 41, 52, 56, 62, 45, 47, 56, 35, 62, c.f16476c, 108, 100};
    }

    static {
        A01();
    }

    public C2253nu(HD hd) {
        this.A02 = hd;
    }

    @Override // com.instagram.common.viewpoint.core.DD
    @MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5y() {
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final long A7a() {
        if (this.A01 != null) {
            return this.A01.A8n();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r9.A8n() != r19) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0066, code lost:
    
        if (r9.A8n() != r19) goto L29;
     */
    @Override // com.instagram.common.viewpoint.core.DD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AAB(@MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") InterfaceC2335pF interfaceC2335pF, Uri uri, Map<String, List<String>> map, long j9, long j10, HA ha) throws IOException {
        C07549f c07549f = new C07549f(interfaceC2335pF, j9, j10);
        this.A01 = c07549f;
        if (this.A00 != null) {
            return;
        }
        H9[] extractors = this.A02.A5O(uri, map);
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            int length = extractors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                H9 h9 = extractors[i];
                try {
                } catch (EOFException unused) {
                    if (this.A00 == null) {
                    }
                } catch (Throwable th) {
                    AbstractC06233y.A08(this.A00 != null || c07549f.A8n() == j9);
                    c07549f.AIl();
                    throw th;
                }
                if (h9.AK5(c07549f)) {
                    this.A00 = h9;
                    AbstractC06233y.A08(this.A00 != null || c07549f.A8n() == j9);
                    c07549f.AIl();
                } else {
                    if (this.A00 == null) {
                    }
                    boolean z8 = true;
                    AbstractC06233y.A08(z8);
                    c07549f.AIl();
                    i++;
                }
            }
            if (this.A00 == null) {
                throw new C2228nV(A00(24, 34, 2) + C5C.A0s(extractors) + A00(0, 24, 55), (Uri) AbstractC06233y.A01(uri));
            }
        }
        H9 h92 = this.A00;
        String[] strArr = A04;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "617axDRVtVCpohDeNzS2wwDVGnqnMQm6";
        strArr2[3] = "irS2jSLrtgJgNTyuX8VyAPoURNJ9oGo8";
        h92.AAC(ha);
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final int AHM(HV hv) throws IOException {
        return ((H9) AbstractC06233y.A01(this.A00)).AHL((InterfaceC2190ms) AbstractC06233y.A01(this.A01), hv);
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final void AHb() {
        if (this.A00 != null) {
            this.A00.AHb();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.instagram.common.viewpoint.core.DD
    public final void AJ6(long j9, long j10) {
        ((H9) AbstractC06233y.A01(this.A00)).AJ6(j9, j10);
    }
}
