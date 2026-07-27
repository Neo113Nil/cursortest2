package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Df, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0845Df extends ImageView implements InterfaceC1727eu {
    public static byte[] A06;
    public static String[] A07 = {"aghB38UhEEJpk0kXnwVgQHJdsNEW", "Z42NiOwJIVHIw0Yvb2zaIIHOyWtQtdjq", "3gFse8uXyFGORzgMyq8kaPi65dxCnZzv", "Jw8apcEAXkOZ3AQdkmgk3jwFJH7gSyWz", "3SkqDykKznuf11rk6OObVQ9S0DbCfrGf", "LUP6WVZdZh28wzzt0Y5b2oxyslCE6YSF", "OrWA41O07SU0jmvClar47c0fhMdTsOQM", "iv"};
    public static final int A08;
    public static final int A09;
    public C0876Ek A00;
    public final Paint A01;
    public final RectF A02;
    public final C1839gi A03;
    public final VI A04;
    public final AbstractC0857Dr A05;

    public static String A03(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i4);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[2].charAt(1) == 'n') {
                throw new RuntimeException();
            }
            A07[4] = "46k42TMmXNLOzm12QaWH4fref2fTAqwO";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 73);
            i10++;
        }
    }

    public static void A06() {
        A06 = new byte[]{44, 20, 21, 4, 65, 32, 5};
    }

    static {
        A06();
        A09 = (int) (XX.A02 * 4.0f);
        A08 = (int) (XX.A02 * 6.0f);
    }

    public C0845Df(C1839gi c1839gi, VI vi) {
        this(c1839gi, vi, false);
    }

    public C0845Df(C1839gi c1839gi, VI vi, boolean z8) {
        super(c1839gi);
        this.A05 = new AbstractC0857Dr() { // from class: com.facebook.ads.redexgen.X.3W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0858Ds c0858Ds) {
                C0845Df.this.A09();
            }
        };
        this.A04 = vi;
        this.A03 = c1839gi;
        if (z8) {
            this.A02 = new RectF();
        } else {
            this.A02 = null;
        }
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(A09, A09, A09, A09);
        setContentDescription(A03(0, 7, 40));
        A05();
        setOnClickListener(new ViewOnClickListenerC1744fB(this));
    }

    private void A04() {
        setImageBitmap(YN.A01(YM.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(YN.A01(YM.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        return this.A00 != null && this.A00.getVolume() == 0.0f;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1727eu
    public final void AAv(C0876Ek c0876Ek) {
        this.A00 = c0876Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A05);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1727eu
    public final void AKV(C0876Ek c0876Ek) {
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A05);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int x3 = getHeight();
        int y6 = x3 / 2;
        if (this.A02 != null) {
            RectF rectF = this.A02;
            int x9 = getWidth();
            float f6 = x9;
            int x10 = getHeight();
            rectF.set(0.0f, 0.0f, f6, x10);
            RectF rectF2 = this.A02;
            int x11 = A08;
            float f9 = x11;
            if (A07[3].charAt(1) == 84) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "zT7YbptMnSmKw0M5I4XTvaxbvvVXxWiN";
            strArr[1] = "NI8lQWe2kpQIwBdYvxwMMOMmXOv2vWWW";
            int x12 = A08;
            canvas.drawRoundRect(rectF2, f9, x12, this.A01);
        } else {
            int x13 = Math.min(width, y6);
            canvas.drawCircle(width, y6, x13, this.A01);
        }
        super.onDraw(canvas);
    }

    public void setBackgroundPaintColor(int i) {
        this.A01.setColor(i);
    }
}
