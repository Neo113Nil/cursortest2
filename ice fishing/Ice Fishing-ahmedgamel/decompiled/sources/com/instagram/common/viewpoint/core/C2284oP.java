package com.instagram.common.viewpoint.core;

import android.os.SystemClock;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.oP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2284oP implements AnonymousClass93 {
    public static byte[] A01;
    public static String[] A02 = {"JE7C4PJjP7BCbZqkJpMMyURXZ5h", "iMYF6XNZz1LBnq9Lsd18aPb3vu2", "XxqNLC6c7RSVqgSJXO5oI", "nEpRStmmyFjBR5hyZRShRQxXaXf0Mj7x", "WMevU6o4a2paeBy7iKLxLT9X", "1yBfwy19", "IbfL1f4elDnhfhlOaFmHA7", "3K7V2NpliX3hv5M7KS"};
    public final /* synthetic */ C2281oM A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {c.f16317b, 76, 70, 103, 100, 99, 119, 110, 118, 67, 119, 102, 107, 109, 81, 107, 108, 105, 24, 54, c.f16318c, 62, 35, 56, c.f16318c, 54, 113, 56, 60, 33, 62, 34, 34, 56, 51, 61, 40, 113, 61, 48, 35, 54, 52, 113, 48, 36, 53, 56, 62, 113, 61, 48, 37, 52, c.f16318c, 50, 40, 107, 113, 98, 65, 68, 67, 88, 94, 68, 66, 17, 80, 68, 85, 88, 94, 17, 69, 88, 92, 84, 66, 69, 80, 92, 65, 17, 25, 87, 67, 80, 92, 84, 17, 65, 94, 66, 88, 69, 88, 94, 95, 17, 92, 88, 66, 92, 80, 69, 82, 89, 24, 11, 17, 102, 69, c.f16317b, 71, 92, 90, c.f16317b, 70, 21, 84, c.f16317b, 81, 92, 90, 21, 65, 92, 88, 80, 70, 65, 84, 88, 69, 21, 29, 70, 76, 70, 65, 80, 88, 21, 86, 89, 90, 86, 94, 21, 88, 92, 70, 88, 84, 65, 86, 93, 28, 15, 21};
        if (A02[4].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "crOuuTwIIsvqp0CyO4zKH";
        strArr[6] = "QvBSziwTMADuiMqU3qgYIx";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C2284oP(C2281oM c2281oM) {
        this.A00 = c2281oM;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass93
    public final void AEM(long j6) {
        AbstractC06324g.A07(A00(2, 16, 116), A00(18, 41, 39) + j6);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass93
    public final void AFN(long j6) {
        InterfaceC07488v interfaceC07488v;
        InterfaceC07488v interfaceC07488v2;
        interfaceC07488v = this.A00.A0I;
        if (interfaceC07488v != null) {
            C2281oM c2281oM = this.A00;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "XUD65QsQyQCwJDnhFrO8y";
            strArr2[6] = "L1DcP3KlVDNfGhVI0cZDzs";
            interfaceC07488v2 = c2281oM.A0I;
            interfaceC07488v2.AFN(j6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass93
    public final void AFP(long j6, long j9, long j10, long j11) {
        long A06;
        long A07;
        StringBuilder append = new StringBuilder().append(A00(59, 52, 71)).append(j6);
        String A00 = A00(0, 2, 26);
        StringBuilder append2 = append.append(A00).append(j9).append(A00).append(j10).append(A00).append(j11).append(A00);
        A06 = this.A00.A06();
        StringBuilder append3 = append2.append(A06).append(A00);
        A07 = this.A00.A07();
        String sb = append3.append(A07).toString();
        if (!C2281oM.A0v) {
            String message = A00(2, 16, 116);
            AbstractC06324g.A07(message, sb);
            return;
        }
        throw new C9I(sb);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass93
    public final void AG9(long j6, long j9, long j10, long j11) {
        long A06;
        long A07;
        StringBuilder append = new StringBuilder().append(A00(111, 50, 67)).append(j6);
        String A00 = A00(0, 2, 26);
        StringBuilder append2 = append.append(A00).append(j9).append(A00).append(j10).append(A00).append(j11).append(A00);
        A06 = this.A00.A06();
        StringBuilder append3 = append2.append(A06).append(A00);
        A07 = this.A00.A07();
        String sb = append3.append(A07).toString();
        if (!C2281oM.A0v) {
            String message = A00(2, 16, 116);
            AbstractC06324g.A07(message, sb);
            return;
        }
        throw new C9I(sb);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass93
    public final void AGI(int i, long j6) {
        InterfaceC07488v interfaceC07488v;
        long j9;
        InterfaceC07488v interfaceC07488v2;
        interfaceC07488v = this.A00.A0I;
        if (interfaceC07488v != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j9 = this.A00.A07;
            long j10 = elapsedRealtime - j9;
            interfaceC07488v2 = this.A00.A0I;
            interfaceC07488v2.AGJ(i, j6, j10);
        }
    }
}
