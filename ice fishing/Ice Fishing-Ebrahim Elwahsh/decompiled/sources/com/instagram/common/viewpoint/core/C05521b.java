package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.anythink.basead.exoplayer.b;
import com.anythink.core.common.s.a.c;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* renamed from: com.facebook.ads.redexgen.X.1b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05521b extends AE implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"58lW15hp88fFpLaSxErp", "56QScXrV6I", "DwEmmtKo2ODeTiA17rxauXwet98Z4", "A4aLtxZMLOPLaVE6SeDzXnpOLTGefetw", "FhOKuZuvLBWd8lghoK1mwxVLtzQRZ", "h1d8vpIJ83Cnf8DVjx4Ui7av1xQxYsFL", "y1YT0hSXczs7bGZDGpuR", "alxZNjekiwxoo3ZSsAAxphzspQJfVEZr"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C2399qI A05;
    public InterfaceC2138lq A06;
    public C8S A07;
    public C8P A08;
    public C8P A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C07026z A0E;
    public final EP A0F;
    public final ES A0G;

    public static String A03(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i4);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "1YRuRVntTKbD5w1SSS8awuyRss3tM";
            strArr2[4] = "HmFGzdsys3t1iPkkAdwtO8Q44Z9aJ";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 122);
            i10++;
        }
    }

    public static void A09() {
        A0H = new byte[]{89, Byte.MAX_VALUE, 104, 126, 99, 126, 102, 111, 42, 110, 111, 105, 101, 110, 99, 100, 109, 42, 108, 107, 99, 102, 111, 110, 36, 42, 121, 126, 120, 111, 107, 103, 76, 101, 120, 103, 107, 126, 55, 57, 8, 21, 25, c.f16476c, 8, 3, 9, 8, 31, 8, 31};
    }

    static {
        A09();
    }

    public C05521b(ES es, Looper looper, EP ep) {
        super(3);
        this.A0G = (ES) AbstractC06233y.A01(es);
        this.A0D = looper == null ? null : C5C.A0c(looper, this);
        this.A0F = ep;
        this.A0E = new C07026z();
        this.A02 = b.f6539b;
        this.A04 = b.f6539b;
        this.A03 = b.f6539b;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC06233y.A01(this.A09);
        if (this.A01 >= this.A09.A84()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A83(this.A01);
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long A01(long j9) {
        int A8a = this.A09.A8a(j9);
        if (A8a != 0) {
            int nextEventTimeIndex = this.A09.A84();
            if (nextEventTimeIndex != 0) {
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[0];
                int length = str.length();
                int nextEventTimeIndex2 = str2.length();
                if (length != nextEventTimeIndex2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "dWbBH4lKinuUlTA8CpNFonpmnzuPl";
                strArr2[4] = "MDue3s6tkJ65MZJ0TxYFZvpfeIb1w";
                if (A8a == -1) {
                    C8P c8p = this.A09;
                    if (A0I[1].length() != 10) {
                        int nextEventTimeIndex3 = this.A09.A84();
                        return c8p.A83(nextEventTimeIndex3 - 1);
                    }
                    A0I[3] = "us0wUp64B7rq5nQeuQUWAOSOIfPFOl8I";
                    int nextEventTimeIndex4 = this.A09.A84();
                    return c8p.A83(nextEventTimeIndex4 - 1);
                }
                int nextEventTimeIndex5 = A8a - 1;
                return this.A09.A83(nextEventTimeIndex5);
            }
        }
        return ((AbstractC2319oz) this.A09).A01;
    }

    @SideEffectFree
    private long A02(long j9) {
        boolean z8 = true;
        AbstractC06233y.A08(j9 != b.f6539b);
        if (this.A04 == b.f6539b) {
            z8 = false;
        }
        AbstractC06233y.A08(z8);
        return j9 - this.A04;
    }

    private void A04() {
        A0B(new C2347pR(MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5K((C2399qI) AbstractC06233y.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((InterfaceC2138lq) AbstractC06233y.A01(this.A06)).AHb();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(C2347pR c2347pR) {
        this.A0G.ADa(c2347pR.A01);
        this.A0G.ADZ(c2347pR);
    }

    private void A0B(C2347pR c2347pR) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c2347pR).sendToTarget();
        } else {
            A0A(c2347pR);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0C(ER er) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, er).sendToTarget();
        }
    }

    private void A0D(C2131lj c2131lj) {
        AbstractC06314g.A08(A03(39, 12, 23), A03(0, 39, 112) + this.A05, c2131lj);
        A0C(new ER(this.A05, c2131lj));
        A04();
        A08();
    }

    @Override // com.instagram.common.viewpoint.core.AE
    public final void A1Z() {
        this.A05 = null;
        this.A02 = b.f6539b;
        A04();
        this.A04 = b.f6539b;
        this.A03 = b.f6539b;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.AE
    public final void A1a(long j9, boolean z8) {
        this.A03 = j9;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = b.f6539b;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((InterfaceC2138lq) AbstractC06233y.A01(this.A06)).flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AE
    public final void A1c(C2399qI[] c2399qIArr, long j9, long j10) {
        this.A04 = j10;
        this.A05 = c2399qIArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final boolean AAP() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final boolean AAe() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r7 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        r9.A09.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        r9.A01 = r6.A8a(r10);
        r9.A09 = r6;
        r9.A08 = null;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        if (r7 != null) goto L51;
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AIX(long j9, long j10) {
        this.A03 = j9;
        if (AAN() && this.A02 != b.f6539b && j9 >= this.A02) {
            A06();
            this.A0B = true;
        }
        if (this.A0B) {
            return;
        }
        if (this.A08 == null) {
            ((InterfaceC2138lq) AbstractC06233y.A01(this.A06)).AJh(j9);
            try {
                this.A08 = ((InterfaceC2138lq) AbstractC06233y.A01(this.A06)).A5t();
            } catch (C2131lj e6) {
                A0D(e6);
                return;
            }
        }
        if (A9A() != 2) {
            return;
        }
        boolean z8 = false;
        if (this.A09 != null) {
            long A00 = A00();
            while (A00 <= j9) {
                this.A01++;
                A00 = A00();
                z8 = true;
            }
        }
        if (this.A08 != null) {
            C8P c8p = this.A08;
            boolean textRendererNeedsUpdate = c8p.A05();
            if (textRendererNeedsUpdate) {
                if (!z8 && A00() == Long.MAX_VALUE) {
                    if (this.A00 == 2) {
                        A08();
                    } else {
                        A06();
                        this.A0B = true;
                    }
                }
            } else if (((AbstractC2319oz) c8p).A01 <= j9) {
                C8P c8p2 = this.A09;
                if (A0I[1].length() != 10) {
                    String[] strArr = A0I;
                    strArr[6] = "SM2l9fwyY7vSK8U9dCan";
                    strArr[0] = "PLBzRsO91bLUZoRphjDr";
                } else {
                    A0I[1] = "uDUYlaOON0";
                }
            }
        }
        if (z8) {
            AbstractC06233y.A01(this.A09);
            A0B(new C2347pR(this.A09.A7X(j9), A02(A01(j9))));
        }
        int i = this.A00;
        if (A0I[3].charAt(23) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[6] = "ML0YoWWFYnm1pIYkMDlj";
        strArr2[0] = "WzY2c9YM67lXJGPj7nnt";
        if (i == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A0A;
                if (!textRendererNeedsUpdate2) {
                    C8S c8s = this.A07;
                    if (c8s == null) {
                        c8s = ((InterfaceC2138lq) AbstractC06233y.A01(this.A06)).A5r();
                        if (c8s != null) {
                            this.A07 = c8s;
                        } else {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        c8s.A02(4);
                        ((InterfaceC2138lq) AbstractC06233y.A01(this.A06)).AHJ(c8s);
                        this.A07 = null;
                        this.A00 = 2;
                        return;
                    }
                    int A1R = A1R(this.A0E, c8s, 0);
                    if (A1R == -4) {
                        boolean textRendererNeedsUpdate3 = c8s.A05();
                        if (textRendererNeedsUpdate3) {
                            this.A0A = true;
                            this.A0C = false;
                        } else {
                            C2399qI c2399qI = this.A0E.A00;
                            if (c2399qI != null) {
                                c8s.A00 = c2399qI.A0M;
                                c8s.A0B();
                                boolean z9 = this.A0C;
                                boolean textRendererNeedsUpdate4 = c8s.A07();
                                this.A0C = (textRendererNeedsUpdate4 ? false : true) & z9;
                            } else {
                                return;
                            }
                        }
                        boolean textRendererNeedsUpdate5 = this.A0C;
                        if (!textRendererNeedsUpdate5) {
                            ((InterfaceC2138lq) AbstractC06233y.A01(this.A06)).AHJ(c8s);
                            this.A07 = null;
                        }
                    } else if (A1R == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (C2131lj e9) {
                A0D(e9);
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07187p
    public final int AKM(C2399qI c2399qI) {
        if (this.A0F.AKN(c2399qI)) {
            return AbstractC07117i.A00(4);
        }
        if (C3J.A0E(c2399qI.A0W)) {
            return AbstractC07117i.A00(1);
        }
        return AbstractC07117i.A00(0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo, com.instagram.common.viewpoint.core.InterfaceC07187p
    public final String getName() {
        return A03(39, 12, 23);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0A((C2347pR) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
