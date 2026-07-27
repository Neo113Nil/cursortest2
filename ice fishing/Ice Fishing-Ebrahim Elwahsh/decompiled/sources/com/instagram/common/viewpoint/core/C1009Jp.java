package com.instagram.common.viewpoint.core;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Jp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1009Jp {
    public static byte[] A0M;
    public static String[] A0N = {"Kv7ovND2cx6KZ8R5Ezu4hDmX6dp2iMsF", "cMayWHospKRMpxKq", "mql622251rYxqhMKViyNV", "P8t7Cej7Eu84XMsYCsqfV8", "67bBuM9FR4N3pZNg9PG0C391ASiInkRu", "7F7KFi1R4GAbzTVO1b4Hjpai2dbfx6Jn", "z0mbdaejDP4Gp0uM4K5gZ", "ITsACGDJX7h4DVdWQgnQRCMTb7k"};
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final int[] A0W;
    public static final int[] A0X;
    public static final boolean[] A0Y;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final List<SpannableString> A0L = new ArrayList();
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();

    public static String A03(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i, i + i4);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0N[4].charAt(27) == 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "mD7XUZguBvkCVVbcE7WnAk49VpUUHB7Z";
            strArr[5] = "aw72WUKXBCYvXfs7FlFT1zjutV7r8SLl";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 88);
            i10++;
        }
    }

    public static void A04() {
        A0M = new byte[]{76, 119, 124, 97, 105, 124, 122, 109, 124, 125, 57, 115, 108, 106, 109, 112, Byte.MAX_VALUE, 112, 122, 120, 109, 112, 118, 119, 57, 111, 120, 117, 108, 124, 35, 57};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1008Jo A05() {
        Layout.Alignment alignment;
        float f6;
        float f9;
        int i;
        if (A0H()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i4 = 0; i4 < this.A0L.size(); i4++) {
            spannableStringBuilder.append((CharSequence) this.A0L.get(i4));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A02());
        switch (this.A07) {
            case 0:
            case 3:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                if (this.A0H) {
                    f6 = this.A05 / 99.0f;
                    f9 = this.A0D / 99.0f;
                } else {
                    f6 = this.A05 / 209.0f;
                    f9 = this.A0D / 74.0f;
                }
                float f10 = (f6 * 0.9f) + 0.05f;
                float f11 = (0.9f * f9) + 0.05f;
                int i9 = this.A00 / 3 == 0 ? 0 : this.A00 / 3 == 1 ? 1 : 2;
                if (this.A00 % 3 == 0) {
                    i = 0;
                    String[] strArr = A0N;
                    if (strArr[6].length() == strArr[2].length()) {
                        String[] strArr2 = A0N;
                        strArr2[0] = "Fa7UQvLnbqmxFbTcY1UUAPqIv3qiyseY";
                        strArr2[5] = "Rn7fSkhECSao3Se51ChHFeFA96BWKZhu";
                    }
                } else {
                    if (this.A00 % 3 == 1) {
                        i = 1;
                        String[] strArr3 = A0N;
                        if (strArr3[6].length() == strArr3[2].length()) {
                            String[] strArr4 = A0N;
                            strArr4[6] = "EFcN8K0y7Hbu8UhXppleE";
                            strArr4[2] = "H3lBazkydsESAKcSyiLhJ";
                        }
                        throw new RuntimeException();
                    }
                    i = 2;
                }
                return new C1008Jo(spannableStringBuilder, alignment, f11, 0, i9, f10, i, -3.4028235E38f, this.A0E != A0O, this.A0E, this.A09);
            case 1:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                String[] strArr5 = A0N;
                if (strArr5[1].length() != strArr5[3].length()) {
                    String[] strArr6 = A0N;
                    strArr6[1] = "AjZAJROepXKxJH0I";
                    strArr6[3] = "I7pWWFcr0TB3DXF69vLyyG";
                    if (this.A0H) {
                    }
                    float f102 = (f6 * 0.9f) + 0.05f;
                    float f112 = (0.9f * f9) + 0.05f;
                    if (this.A00 / 3 == 0) {
                    }
                    if (this.A00 % 3 == 0) {
                    }
                    return new C1008Jo(spannableStringBuilder, alignment, f112, 0, i9, f102, i, -3.4028235E38f, this.A0E != A0O, this.A0E, this.A09);
                }
                throw new RuntimeException();
            case 2:
                alignment = Layout.Alignment.ALIGN_CENTER;
                if (this.A0H) {
                }
                float f1022 = (f6 * 0.9f) + 0.05f;
                float f1122 = (0.9f * f9) + 0.05f;
                if (this.A00 / 3 == 0) {
                }
                if (this.A00 % 3 == 0) {
                }
                return new C1008Jo(spannableStringBuilder, alignment, f1122, 0, i9, f1022, i, -3.4028235E38f, this.A0E != A0O, this.A0E, this.A09);
            default:
                throw new IllegalArgumentException(A03(0, 32, 65) + this.A07);
        }
    }

    static {
        A04();
        A0P = A01(2, 2, 2, 0);
        A0O = A01(0, 0, 0, 0);
        A0Q = A01(0, 0, 0, 3);
        A0V = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0W = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0X = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0Y = new boolean[]{false, false, false, true, true, true, false};
        A0U = new int[]{A0O, A0Q, A0O, A0O, A0Q, A0O, A0O};
        A0T = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0S = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0R = new int[]{A0O, A0O, A0O, A0O, A0O, A0Q, A0Q};
    }

    public C1009Jp() {
        A08();
    }

    public static int A00(int i, int i4, int i9) {
        return A01(i, i4, i9, 0);
    }

    public static int A01(int i, int i4, int i9, int i10) {
        int i11;
        AbstractC06233y.A00(i, 0, 4);
        AbstractC06233y.A00(i4, 0, 4);
        AbstractC06233y.A00(i9, 0, 4);
        AbstractC06233y.A00(i10, 0, 4);
        switch (i10) {
            case 0:
            case 1:
                i11 = p.f8630b;
                break;
            case 2:
                i11 = a.f21886R;
                break;
            case 3:
                i11 = 0;
                break;
            default:
                i11 = p.f8630b;
                break;
        }
        int alpha = i > 1 ? p.f8630b : 0;
        return Color.argb(i11, alpha, i4 > 1 ? p.f8630b : 0, i9 > 1 ? p.f8630b : 0);
    }

    private final SpannableString A02() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A0C, length, 33);
            }
            if (this.A04 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void A06() {
        int length = this.A0K.length();
        if (length > 0) {
            SpannableStringBuilder spannableStringBuilder = this.A0K;
            int i = length - 1;
            if (A0N[7].length() == 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "mr7H3cYDyzqjeYfUxSkedoxDGLReqWZH";
            strArr[5] = "WB7R3soSd1e4KWjeo1umNLF0CWboeFMb";
            spannableStringBuilder.delete(i, length);
        }
    }

    public final void A07() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
    }

    public final void A08() {
        A07();
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        this.A0E = A0O;
        this.A03 = A0P;
        this.A01 = A0O;
    }

    public final void A09(char c4) {
        if (c4 == '\n') {
            this.A0L.add(A02());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            int i = this.A0C;
            if (A0N[7].length() == 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "Up7OwHpaobzLA4EM9I6S8ympi8egU1xp";
            strArr[5] = "Jc7mAyZPvPSNSMBgW0QbkIOpFbTkWds1";
            if (i != -1) {
                this.A0C = 0;
            }
            if (this.A04 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                if ((this.A0I && this.A0L.size() >= this.A0B) || this.A0L.size() >= 15) {
                    this.A0L.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.A0K.append(c4);
        }
    }

    public final void A0A(int i, int i4) {
        if (this.A0A != i) {
            if (A0N[4].charAt(27) == 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[1] = "EQrEdXyc1aYcjFG7";
            strArr[3] = "uymaty7PipZZJPSz7splP0";
            A09('\n');
        }
        this.A0A = i;
    }

    public final void A0B(int i, int i4, int i9) {
        if (this.A04 != -1 && this.A03 != i) {
            this.A0K.setSpan(new ForegroundColorSpan(this.A03), this.A04, this.A0K.length(), 33);
        }
        if (i != A0P) {
            this.A04 = this.A0K.length();
            this.A03 = i;
        }
        int i10 = this.A02;
        String[] strArr = A0N;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0N;
        strArr2[6] = "zeXFeOtKIORA1zWkRmXlR";
        strArr2[2] = "fnzPNusOGbFXzxR4hah6k";
        if (i10 != -1 && this.A01 != i4) {
            this.A0K.setSpan(new BackgroundColorSpan(this.A01), this.A02, this.A0K.length(), 33);
        }
        if (i4 != A0O) {
            this.A02 = this.A0K.length();
            this.A01 = i4;
        }
    }

    public final void A0C(int i, int i4, int i9, boolean z8, boolean z9, int i10, int i11) {
        if (this.A06 != -1) {
            if (!z8) {
                this.A0K.setSpan(new StyleSpan(2), this.A06, this.A0K.length(), 33);
                this.A06 = -1;
            }
        } else if (z8) {
            this.A06 = this.A0K.length();
        }
        if (this.A0C != -1) {
            if (!z9) {
                this.A0K.setSpan(new UnderlineSpan(), this.A0C, this.A0K.length(), 33);
                this.A0C = -1;
                return;
            }
            return;
        }
        if (!z9) {
            return;
        }
        this.A0C = this.A0K.length();
    }

    public final void A0D(int i, int i4, boolean z8, int i9, int i10, int i11, int i12) {
        this.A0E = i;
        this.A07 = i12;
    }

    public final void A0E(boolean z8) {
        this.A0J = z8;
    }

    public final void A0F(boolean z8, boolean z9, boolean z10, int i, boolean z11, int i4, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.A0G = true;
        this.A0J = z8;
        this.A0I = z9;
        this.A09 = i;
        this.A0H = z11;
        this.A0D = i4;
        this.A05 = i9;
        this.A00 = i12;
        if (this.A0B != i10 + 1) {
            this.A0B = i10 + 1;
            while (true) {
                if ((!z9 || this.A0L.size() < this.A0B) && this.A0L.size() < 15) {
                    break;
                } else {
                    this.A0L.remove(0);
                }
            }
        }
        if (i13 != 0 && this.A0F != i13) {
            this.A0F = i13;
            int i15 = i13 - 1;
            A0D(A0U[i15], A0Q, A0Y[i15], 0, A0W[i15], A0X[i15], A0V[i15]);
        }
        if (i14 != 0 && this.A08 != i14) {
            this.A08 = i14;
            int i16 = i14 - 1;
            A0C(0, 1, 1, false, false, A0S[i16], A0T[i16]);
            A0B(A0P, A0R[i16], A0O);
        }
    }

    public final boolean A0G() {
        return this.A0G;
    }

    public final boolean A0H() {
        if (A0G()) {
            List<SpannableString> list = this.A0L;
            String[] strArr = A0N;
            if (strArr[0].charAt(2) != strArr[5].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[6] = "bd5mzLDHwmkoJbeiVaa7u";
            strArr2[2] = "zXPgjXTtuY4PD8las8bey";
            if (!list.isEmpty() || this.A0K.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0I() {
        return this.A0J;
    }
}
