package com.instagram.common.viewpoint.core;

import android.view.View;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.j3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1977j3 implements N9 {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ C07137k A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{89, 10, 14, 83, 89, 91, 92, 92, 32, 3, 12, 12, 7, 16, 66, 11, 15, 18, 16, 7, 17, 17, 11, 13, 12, 66, 4, 11, 16, 7, 6, 28, 29, 49, 18, 29, 29, 22, 1, c.f16476c, 28, 20, 20, 26, 29, 20, 58, 30, 3, 1, 22, 0, 0, 26, 28, 29};
    }

    static {
        A01();
    }

    public C1977j3(C07137k c07137k, Runnable runnable) {
        this.A00 = c07137k;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final void ADC(InterfaceC2035k8 interfaceC2035k8) {
        AnonymousClass76 anonymousClass76;
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4a();
        this.A00.A07.A0C();
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final void ADD(InterfaceC2035k8 interfaceC2035k8, View view) {
        AnonymousClass76 anonymousClass76;
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4Z(interfaceC2035k8 == ((AbstractC1974j0) this.A00).A00);
        if (interfaceC2035k8 != ((AbstractC1974j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        N1 n1 = ((AbstractC1974j0) this.A00).A01;
        C07137k c07137k = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC1974j0) c07137k).A01 = interfaceC2035k8;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC2035k8);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0Q(n1);
        }
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final void ADE(InterfaceC2035k8 interfaceC2035k8) {
        AnonymousClass76 anonymousClass76;
        AbstractC1322Vy.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4c();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final void AEN(InterfaceC2035k8 interfaceC2035k8, C1311Vm c1311Vm) {
        AnonymousClass76 anonymousClass76;
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4b(interfaceC2035k8 == ((AbstractC1974j0) this.A00).A00, c1311Vm.A03().getErrorCode());
        if (interfaceC2035k8 != ((AbstractC1974j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC2035k8);
        this.A00.ADp(c1311Vm);
    }
}
