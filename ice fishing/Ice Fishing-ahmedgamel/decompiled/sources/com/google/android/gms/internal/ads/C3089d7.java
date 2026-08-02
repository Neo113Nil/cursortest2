package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3089d7 implements InterfaceC2928a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3196f7 f30485b;

    public /* synthetic */ C3089d7(C3196f7 c3196f7, int i) {
        this.f30484a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c3196f7);
                this.f30485b = c3196f7;
                break;
            case 2:
                Objects.requireNonNull(c3196f7);
                this.f30485b = c3196f7;
                break;
            default:
                Objects.requireNonNull(c3196f7);
                this.f30485b = c3196f7;
                break;
        }
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        C3196f7 c3196f7 = this.f30485b;
        int i = ~c3196f7.f30841B;
        c3196f7.f30841B = i;
        int i4 = c3196f7.f30881M1 ^ c3196f7.f30874K1;
        int i6 = c3196f7.f31010y;
        int i9 = ((((i4 | i6) ^ c3196f7.f30885O) ^ c3196f7.f30964l2) ^ c3196f7.f30909W0) ^ c3196f7.f30888P;
        c3196f7.f30888P = i9;
        int i10 = c3196f7.f30860G;
        int i11 = c3196f7.f30867I0;
        int i12 = ~i11;
        int i13 = i10 & i12;
        int i14 = i10 ^ i13;
        c3196f7.f30909W0 = i14;
        int i15 = c3196f7.f30923b;
        int i16 = c3196f7.f30987s0;
        int i17 = c3196f7.f31006x;
        int i18 = (((i13 ^ i15) | i16) ^ i17) ^ c3196f7.f30996u1;
        c3196f7.f30996u1 = i18;
        int i19 = i15 ^ i10;
        c3196f7.f30964l2 = i19;
        int i20 = i12 & i19;
        int i21 = (i16 | i20) ^ c3196f7.f30864H1;
        c3196f7.f30885O = i21;
        int i22 = (i17 ^ ((~i20) & i16)) | i6;
        int i23 = (i11 | i19) ^ i15;
        int i24 = i16 | i23;
        int i25 = c3196f7.f30947h0 ^ i24;
        c3196f7.f30923b = i25;
        int i26 = c3196f7.f30938e2 ^ i25;
        int i27 = c3196f7.f31013y2;
        int i28 = ((i26 | i27) ^ i18) ^ c3196f7.f30876L;
        c3196f7.f30876L = i28;
        int i29 = c3196f7.f30948h1 ^ (((i16 & i23) ^ i23) | i6);
        c3196f7.f30938e2 = i29;
        int i30 = i23 ^ (i16 & i20);
        c3196f7.f30874K1 = i30;
        int i31 = i30 ^ i22;
        c3196f7.f30864H1 = i31;
        int i32 = ~i6;
        int i33 = (i29 ^ ((((i14 ^ i24) & i32) ^ c3196f7.f30848D) | i27)) ^ c3196f7.f30949h2;
        c3196f7.f30949h2 = i33;
        int i34 = (c3196f7.f30895R0 ^ i20) ^ c3196f7.f30914Y0;
        c3196f7.f30914Y0 = i34;
        int i35 = ((i34 ^ (i34 & i32)) | i27) ^ c3196f7.f30845C;
        c3196f7.f31006x = i35;
        int i36 = i35 ^ c3196f7.f30976p;
        c3196f7.f30976p = i36;
        int i37 = (((((((i20 ^ c3196f7.f30879M) | i16) ^ i10) & i32) ^ i21) | i27) ^ i31) ^ c3196f7.f30990t;
        c3196f7.f30990t = i37;
        int i38 = c3196f7.i;
        int i39 = ((~i10) & i38) ^ c3196f7.f30982q2;
        c3196f7.f30867I0 = i39;
        int i40 = (((i6 & i39) ^ c3196f7.f30941f1) | c3196f7.f30991t0) ^ c3196f7.f30852E;
        int i41 = c3196f7.f30857F0;
        int i42 = (i40 & i41) ^ c3196f7.f30988s1;
        c3196f7.f31010y = i42;
        int i43 = i42 ^ c3196f7.f30856F;
        c3196f7.f30856F = i43;
        bArr2[0] = (byte) (i33 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[1] = (byte) ((i33 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[2] = (byte) ((i33 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[3] = (byte) (i33 >> 24);
        int i44 = c3196f7.f30966m1;
        bArr2[4] = (byte) (i44 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[5] = (byte) ((i44 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[6] = (byte) ((i44 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[7] = (byte) (i44 >> 24);
        int i45 = c3196f7.f30931d;
        bArr2[8] = (byte) (i45 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[9] = (byte) ((i45 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[10] = (byte) ((i45 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[11] = (byte) (i45 >> 24);
        int i46 = c3196f7.f30894R;
        bArr2[12] = (byte) (i46 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[13] = (byte) ((i46 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[14] = (byte) ((i46 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[15] = (byte) (i46 >> 24);
        int i47 = c3196f7.f30939f;
        bArr2[16] = (byte) (i47 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[17] = (byte) ((i47 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[18] = (byte) ((i47 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[19] = (byte) (i47 >> 24);
        int i48 = c3196f7.f30954j0;
        bArr2[20] = (byte) (i48 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[21] = (byte) ((i48 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[22] = (byte) ((i48 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[23] = (byte) (i48 >> 24);
        int i49 = c3196f7.f30846C1;
        bArr2[24] = (byte) (i49 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[25] = (byte) ((i49 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[26] = (byte) ((i49 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[27] = (byte) (i49 >> 24);
        int i50 = c3196f7.r1;
        bArr2[28] = (byte) (i50 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[29] = (byte) ((i50 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[30] = (byte) ((i50 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[31] = (byte) (i50 >> 24);
        int i51 = c3196f7.f30953j;
        bArr2[32] = (byte) (i51 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[33] = (byte) ((i51 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[34] = (byte) ((i51 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[35] = (byte) (i51 >> 24);
        bArr2[36] = (byte) (i38 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[37] = (byte) ((i38 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[38] = (byte) ((i38 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[39] = (byte) (i38 >> 24);
        int i52 = c3196f7.f30989s2;
        bArr2[40] = (byte) (i52 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[41] = (byte) ((i52 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[42] = (byte) ((i52 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[43] = (byte) (i52 >> 24);
        int i53 = c3196f7.f30890P1;
        bArr2[44] = (byte) (i53 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[45] = (byte) ((i53 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[46] = (byte) ((i53 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[47] = (byte) (i53 >> 24);
        int i54 = c3196f7.f30868I1;
        bArr2[48] = (byte) (i54 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[49] = (byte) ((i54 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[50] = (byte) ((i54 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[51] = (byte) (i54 >> 24);
        int i55 = c3196f7.f31011y0;
        bArr2[52] = (byte) (i55 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[53] = (byte) ((i55 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[54] = (byte) ((i55 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[55] = (byte) (i55 >> 24);
        bArr2[56] = (byte) (i36 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[57] = (byte) ((i36 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[58] = (byte) ((i36 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[59] = (byte) (i36 >> 24);
        int i56 = c3196f7.f30908W;
        bArr2[60] = (byte) (i56 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[61] = (byte) ((i56 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[62] = (byte) ((i56 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[63] = (byte) (i56 >> 24);
        int i57 = c3196f7.f30983r;
        bArr2[64] = (byte) (i57 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[65] = (byte) ((i57 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[66] = (byte) ((i57 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[67] = (byte) (i57 >> 24);
        int i58 = c3196f7.f30979q;
        bArr2[68] = (byte) (i58 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[69] = (byte) ((i58 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[70] = (byte) ((i58 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[71] = (byte) (i58 >> 24);
        bArr2[72] = (byte) (i37 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[73] = (byte) ((i37 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[74] = (byte) ((i37 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[75] = (byte) (i37 >> 24);
        int i59 = c3196f7.f30929c1;
        bArr2[76] = (byte) (i59 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[77] = (byte) ((i59 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[78] = (byte) ((i59 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[79] = (byte) (i59 >> 24);
        int i60 = c3196f7.f30998v;
        bArr2[80] = (byte) (i60 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[81] = (byte) ((i60 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[82] = (byte) ((i60 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[83] = (byte) (i60 >> 24);
        int i61 = c3196f7.f30994u;
        bArr2[84] = (byte) (i61 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[85] = (byte) ((i61 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[86] = (byte) ((i61 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[87] = (byte) (i61 >> 24);
        int i62 = c3196f7.f30921a1;
        bArr2[88] = (byte) (i62 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[89] = (byte) ((i62 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[90] = (byte) ((i62 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[91] = (byte) (i62 >> 24);
        int i63 = c3196f7.f30973o0;
        bArr2[92] = (byte) (i63 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[93] = (byte) ((i63 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[94] = (byte) ((i63 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[95] = (byte) (i63 >> 24);
        int i64 = c3196f7.f30978p2;
        bArr2[96] = (byte) (i64 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[97] = (byte) ((i64 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[98] = (byte) ((i64 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[99] = (byte) (i64 >> 24);
        int i65 = c3196f7.f30974o1;
        bArr2[100] = (byte) (i65 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[101] = (byte) ((i65 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[102] = (byte) ((i65 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[103] = (byte) (i65 >> 24);
        bArr2[104] = (byte) (i & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[105] = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[106] = (byte) ((i >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[107] = (byte) (i >> 24);
        int i66 = c3196f7.f30999v0;
        bArr2[108] = (byte) (i66 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[109] = (byte) ((i66 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[110] = (byte) ((i66 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[111] = (byte) (i66 >> 24);
        int i67 = c3196f7.f30945g2;
        bArr2[112] = (byte) (i67 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[113] = (byte) ((i67 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[114] = (byte) ((i67 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[115] = (byte) (i67 >> 24);
        int i68 = c3196f7.f30917Z0;
        bArr2[116] = (byte) (i68 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[117] = (byte) ((i68 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[118] = (byte) ((i68 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[119] = (byte) (i68 >> 24);
        bArr2[120] = (byte) (i43 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[121] = (byte) ((i43 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[122] = (byte) ((i43 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[123] = (byte) (i43 >> 24);
        int i69 = c3196f7.G2;
        bArr2[124] = (byte) (i69 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[125] = (byte) ((i69 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[126] = (byte) ((i69 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[127] = (byte) (i69 >> 24);
        int i70 = c3196f7.f30970n1;
        bArr2[128] = (byte) (i70 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[129] = (byte) ((i70 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[130] = (byte) ((i70 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[131] = (byte) (i70 >> 24);
        bArr2[132] = (byte) (i10 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[133] = (byte) ((i10 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[134] = (byte) ((i10 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[135] = (byte) (i10 >> 24);
        int i71 = c3196f7.J;
        bArr2[136] = (byte) (i71 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[137] = (byte) ((i71 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[138] = (byte) ((i71 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[139] = (byte) (i71 >> 24);
        int i72 = c3196f7.f30886O0;
        bArr2[140] = (byte) (i72 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[141] = (byte) ((i72 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[142] = (byte) ((i72 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[143] = (byte) (i72 >> 24);
        bArr2[144] = (byte) (i28 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[145] = (byte) ((i28 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[146] = (byte) ((i28 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[147] = (byte) (i28 >> 24);
        int i73 = c3196f7.f31017z2;
        bArr2[148] = (byte) (i73 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[149] = (byte) ((i73 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[150] = (byte) ((i73 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[151] = (byte) (i73 >> 24);
        int i74 = c3196f7.f30870J0;
        bArr2[152] = (byte) (i74 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[153] = (byte) ((i74 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[154] = (byte) ((i74 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[155] = (byte) (i74 >> 24);
        int i75 = c3196f7.f30892Q0;
        bArr2[156] = (byte) (i75 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[157] = (byte) ((i75 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[158] = (byte) ((i75 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[159] = (byte) (i75 >> 24);
        bArr2[160] = (byte) (i9 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[161] = (byte) ((i9 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[162] = (byte) ((i9 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[163] = (byte) (i9 >> 24);
        int i76 = c3196f7.f30942g;
        bArr2[164] = (byte) (i76 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[165] = (byte) ((i76 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[166] = (byte) ((i76 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[167] = (byte) (i76 >> 24);
        int i77 = c3196f7.f30898S1;
        bArr2[168] = (byte) (i77 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[169] = (byte) ((i77 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[170] = (byte) ((i77 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[171] = (byte) (i77 >> 24);
        int i78 = c3196f7.f30912X0;
        bArr2[172] = (byte) (i78 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[173] = (byte) ((i78 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[174] = (byte) ((i78 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[175] = (byte) (i78 >> 24);
        int i79 = c3196f7.f30899T;
        bArr2[176] = (byte) (i79 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[177] = (byte) ((i79 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[178] = (byte) ((i79 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[179] = (byte) (i79 >> 24);
        int i80 = c3196f7.f31004w1;
        bArr2[180] = (byte) (i80 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[181] = (byte) ((i80 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[182] = (byte) ((i80 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[183] = (byte) (i80 >> 24);
        int i81 = c3196f7.f31009x2;
        bArr2[184] = (byte) (i81 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[185] = (byte) ((i81 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[186] = (byte) ((i81 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[187] = (byte) (i81 >> 24);
        int i82 = c3196f7.f30873K0;
        bArr2[188] = (byte) (i82 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[189] = (byte) ((i82 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[190] = (byte) ((i82 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[191] = (byte) (i82 >> 24);
        int i83 = c3196f7.f30897S0;
        bArr2[192] = (byte) (i83 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[193] = (byte) ((i83 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[194] = (byte) ((i83 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[195] = (byte) (i83 >> 24);
        bArr2[196] = (byte) (i16 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[197] = (byte) ((i16 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[198] = (byte) ((i16 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[199] = (byte) (i16 >> 24);
        int i84 = c3196f7.f30916Z;
        bArr2[200] = (byte) (i84 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[201] = (byte) ((i84 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[202] = (byte) ((i84 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[203] = (byte) (i84 >> 24);
        int i85 = c3196f7.Y;
        bArr2[204] = (byte) (i85 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[205] = (byte) ((i85 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[206] = (byte) ((i85 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[207] = (byte) (i85 >> 24);
        int i86 = c3196f7.f2;
        bArr2[208] = (byte) (i86 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[209] = (byte) ((i86 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[210] = (byte) ((i86 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[211] = (byte) (i86 >> 24);
        int i87 = c3196f7.f30920a0;
        bArr2[212] = (byte) (i87 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[213] = (byte) ((i87 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[214] = (byte) ((i87 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[215] = (byte) (i87 >> 24);
        int i88 = c3196f7.f30932d0;
        bArr2[216] = (byte) (i88 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[217] = (byte) ((i88 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[218] = (byte) ((i88 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[219] = (byte) (i88 >> 24);
        int i89 = c3196f7.f30926b2;
        bArr2[220] = (byte) (i89 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[221] = (byte) ((i89 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[222] = (byte) ((i89 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[223] = (byte) (i89 >> 24);
        int i90 = c3196f7.f30959k1;
        bArr2[224] = (byte) (i90 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[225] = (byte) ((i90 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[226] = (byte) ((i90 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[227] = (byte) (i90 >> 24);
        int i91 = c3196f7.f30951i1;
        bArr2[228] = (byte) (i91 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[229] = (byte) ((i91 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[230] = (byte) ((i91 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[231] = (byte) (i91 >> 24);
        int i92 = c3196f7.f30985r2;
        bArr2[232] = (byte) (i92 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[233] = (byte) ((i92 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[234] = (byte) ((i92 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[235] = (byte) (i92 >> 24);
        int i93 = c3196f7.f30840A2;
        bArr2[236] = (byte) (i93 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[237] = (byte) ((i93 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[238] = (byte) ((i93 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[239] = (byte) (i93 >> 24);
        int i94 = c3196f7.f30933d1;
        bArr2[240] = (byte) (i94 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[241] = (byte) ((i94 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[242] = (byte) ((i94 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[243] = (byte) (i94 >> 24);
        int i95 = c3196f7.f30902U;
        bArr2[244] = (byte) (i95 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[245] = (byte) ((i95 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[246] = (byte) ((i95 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[247] = (byte) (i95 >> 24);
        int i96 = c3196f7.f31015z0;
        bArr2[248] = (byte) (i96 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[249] = (byte) ((i96 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[250] = (byte) ((i96 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[251] = (byte) (i96 >> 24);
        bArr2[252] = (byte) (i41 & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[253] = (byte) ((i41 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[254] = (byte) ((i41 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        bArr2[255] = (byte) (i41 >> 24);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r63v12 ?? I:??[int, boolean]), method size: 2827
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final void c(byte[] r93, byte[] r94) {
        /*
            Method dump skipped, instructions count: 2827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3089d7.c(byte[], byte[]):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r9v43 ?? I:??[int, boolean, short, byte, char]), method size: 2844
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.InterfaceC2928a7
    public final void a(byte[] r108, byte[] r109) {
        /*
            Method dump skipped, instructions count: 2844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3089d7.a(byte[], byte[]):void");
    }
}
