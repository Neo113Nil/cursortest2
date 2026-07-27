package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.hU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1887hU extends R5 {
    public static byte[] A03;
    public static String[] A04 = {"VI3k6vbyE", "wbKxmRtdnLanYPPQlq0AQ7UHjncjxjam", "7rHsxeXjhwTRluKKUSI3i7DNAgzyS", "RLsJgHk6VqLvU3GrilIJimxIkswsMvKT", "sHDfA32w1RYOD3HMFDMkWGxW2yjuY1ZH", "JEcuqbBofZsfD30FS8fTTaggCipMDK", "8NUawD4TiWbh8YzDjR1LHPIBKq0RidcG", "8EIjrQLLrDPWSel1MFlzfXR6TVhPBcGW"};
    public C7M A00;
    public Scroller A01;
    public final R7 A02 = new C1892hZ(this);

    public static String A06(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{-120, -75, 103, -80, -75, -70, -69, -88, -75, -86, -84, 103, -74, -83, 103, -106, -75, -115, -77, -80, -75, -82, -109, -80, -70, -69, -84, -75, -84, -71, 103, -88, -77, -71, -84, -88, -85, -64, 103, -70, -84, -69, 117};
    }

    public abstract int A0C(R2 r22, int i, int i4);

    public abstract View A0D(R2 r22);

    @Deprecated
    public abstract C1908hq A0E(R2 r22);

    public abstract int[] A0H(R2 r22, View view);

    static {
        A09();
    }

    private final C1908hq A05(R2 r22) {
        return A0E(r22);
    }

    private void A07() {
        this.A00.A1i(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1h(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 56));
    }

    private boolean A0A(R2 r22, int i, int i4) {
        C1908hq A05;
        int A0C;
        if (!(r22 instanceof RE) || (A05 = A05(r22)) == null || (A0C = A0C(r22, i, i4)) == -1) {
            return false;
        }
        A05.A0A(A0C);
        r22.A1N(A05);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.R5
    public final boolean A0B(int i, int i4) {
        R2 layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i4) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && A0A(layoutManager, i, i4);
    }

    public final void A0F() {
        R2 layoutManager;
        View A0D;
        if (this.A00 == null || (layoutManager = this.A00.getLayoutManager()) == null || (A0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] A0H = A0H(layoutManager, A0D);
        if (A0H[0] != 0 || A0H[1] != 0) {
            this.A00.A1e(A0H[0], A0H[1]);
        }
    }

    public final void A0G(C7M c7m) throws IllegalStateException {
        if (this.A00 == c7m) {
            return;
        }
        C7M c7m2 = this.A00;
        if (A04[3].charAt(14) == 'w') {
            throw new RuntimeException();
        }
        A04[4] = "xzKGxret4GzWIxaR6oK37PWpSNYAUaFQ";
        if (c7m2 != null) {
            A07();
        }
        this.A00 = c7m;
        if (this.A00 != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
