package com.squareup.cash.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class Colors {
    public final Base base;
    public final Component component;
    public final Data data;
    public final boolean isLight;
    public final Semantic semantic;
    public final Surface surface;

    public final class Base {
        public final long amber10;
        public final long amber20;
        public final long bitcoin;
        public final long bitcoinBg;
        public final long blue10;
        public final long blue20;
        public final long brandAmber;
        public final long brandAquaS1;
        public final long brandAzureH2;
        public final long brandAzureS1;
        public final long brandCashGreen;
        public final long brandCashGreen05;
        public final long brandCashGreen10;
        public final long brandCashGreen15;
        public final long brandCashGreen20;
        public final long brandCashGreen25;
        public final long brandCashGreen30;
        public final long brandCashGreen35;
        public final long brandCashGreen40;
        public final long brandCashGreen45;
        public final long brandCashGreen50;
        public final long brandCashGreen55;
        public final long brandCashGreen60;
        public final long brandCashGreen65;
        public final long brandCashGreen70;
        public final long brandCashGreen75;
        public final long brandCashGreen80;
        public final long brandCashGreen85;
        public final long brandCashGreen90;
        public final long brandCashGreen95;
        public final long brandCitronH1;
        public final long brandCitronS1;
        public final long brandCobaltS1;
        public final long brandGoldS1;
        public final long brandGreenH1;
        public final long brandGreenS1;
        public final long brandMagentaH1;
        public final long brandMagentaH5;
        public final long brandMagentaS1;
        public final long brandOcean;
        public final long brandOrangeH1;
        public final long brandOrangeH3;
        public final long brandOrangeS1;
        public final long brandOrcaPastel;
        public final long brandPink;
        public final long brandPurple;
        public final long brandPurpleS1;
        public final long brandRoyal;
        public final long brandScarlet;
        public final long brandScarletS1;
        public final long brandSky;
        public final long brandSteel;
        public final long brandSunshine;
        public final long brandTurquoise;
        public final long brandVioletS1;
        public final long cashGreen10;
        public final long cashGreen20;
        public final long cashGreen30;
        public final long cashGreen40;
        public final long constantBlack;
        public final long constantClear;
        public final long constantWhite;
        public final long green10;
        public final long green20;
        public final long grey10;
        public final long grey15;
        public final long grey20;
        public final long grey25;
        public final long grey30;
        public final long grey40;
        public final long grey45;
        public final long grey50;
        public final long grey60;
        public final long grey65;
        public final long grey80;
        public final long grey85;
        public final long grey90;
        public final long grey95;
        public final long grey98;
        public final long purple10;
        public final long purple20;
        public final long red10;
        public final long red100;
        public final long red20;
        public final long red30;
        public final long red40;
        public final long red50;
        public final long red60;
        public final long red70;
        public final long red80;
        public final long red90;
        public final long violet10;
        public final long violet20;
        public final long violet30;
        public final long violet40;
        public final long violet5;
        public final long violet50;
        public final long violet60;
        public final long violet70;
        public final long violet80;
        public final long violet90;

        public Base(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, long j66, long j67, long j68, long j69, long j70, long j71, long j72, long j73, long j74, long j75, long j76, long j77, long j78, long j79, long j80, long j81, long j82, long j83, long j84, long j85, long j86, long j87, long j88, long j89, long j90, long j91, long j92, long j93, long j94, long j95, long j96, long j97, long j98, long j99, long j100, long j101) {
            this.amber10 = j;
            this.amber20 = j2;
            this.bitcoin = j3;
            this.bitcoinBg = j4;
            this.blue10 = j5;
            this.blue20 = j6;
            this.brandAmber = j7;
            this.brandAquaS1 = j8;
            this.brandAzureH2 = j9;
            this.brandAzureS1 = j10;
            this.brandCashGreen = j11;
            this.brandCashGreen05 = j12;
            this.brandCashGreen10 = j13;
            this.brandCashGreen15 = j14;
            this.brandCashGreen20 = j15;
            this.brandCashGreen25 = j16;
            this.brandCashGreen30 = j17;
            this.brandCashGreen35 = j18;
            this.brandCashGreen40 = j19;
            this.brandCashGreen45 = j20;
            this.brandCashGreen50 = j21;
            this.brandCashGreen55 = j22;
            this.brandCashGreen60 = j23;
            this.brandCashGreen65 = j24;
            this.brandCashGreen70 = j25;
            this.brandCashGreen75 = j26;
            this.brandCashGreen80 = j27;
            this.brandCashGreen85 = j28;
            this.brandCashGreen90 = j29;
            this.brandCashGreen95 = j30;
            this.brandCitronH1 = j31;
            this.brandCitronS1 = j32;
            this.brandCobaltS1 = j33;
            this.brandGoldS1 = j34;
            this.brandGreenH1 = j35;
            this.brandGreenS1 = j36;
            this.brandMagentaH1 = j37;
            this.brandMagentaH5 = j38;
            this.brandMagentaS1 = j39;
            this.brandOcean = j40;
            this.brandOrangeH1 = j41;
            this.brandOrangeH3 = j42;
            this.brandOrangeS1 = j43;
            this.brandOrcaPastel = j44;
            this.brandPink = j45;
            this.brandPurple = j46;
            this.brandPurpleS1 = j47;
            this.brandRoyal = j48;
            this.brandScarlet = j49;
            this.brandScarletS1 = j50;
            this.brandSky = j51;
            this.brandSteel = j52;
            this.brandSunshine = j53;
            this.brandTurquoise = j54;
            this.brandVioletS1 = j55;
            this.cashGreen10 = j56;
            this.cashGreen20 = j57;
            this.cashGreen30 = j58;
            this.cashGreen40 = j59;
            this.constantBlack = j60;
            this.constantClear = j61;
            this.constantWhite = j62;
            this.green10 = j63;
            this.green20 = j64;
            this.grey10 = j65;
            this.grey15 = j66;
            this.grey20 = j67;
            this.grey25 = j68;
            this.grey30 = j69;
            this.grey40 = j70;
            this.grey45 = j71;
            this.grey50 = j72;
            this.grey60 = j73;
            this.grey65 = j74;
            this.grey80 = j75;
            this.grey85 = j76;
            this.grey90 = j77;
            this.grey95 = j78;
            this.grey98 = j79;
            this.purple10 = j80;
            this.purple20 = j81;
            this.red10 = j82;
            this.red100 = j83;
            this.red20 = j84;
            this.red30 = j85;
            this.red40 = j86;
            this.red50 = j87;
            this.red60 = j88;
            this.red70 = j89;
            this.red80 = j90;
            this.red90 = j91;
            this.violet10 = j92;
            this.violet20 = j93;
            this.violet30 = j94;
            this.violet40 = j95;
            this.violet5 = j96;
            this.violet50 = j97;
            this.violet60 = j98;
            this.violet70 = j99;
            this.violet80 = j100;
            this.violet90 = j101;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Base)) {
                return false;
            }
            Base base = (Base) obj;
            return Color.m676equalsimpl0(this.amber10, base.amber10) && Color.m676equalsimpl0(this.amber20, base.amber20) && Color.m676equalsimpl0(this.bitcoin, base.bitcoin) && Color.m676equalsimpl0(this.bitcoinBg, base.bitcoinBg) && Color.m676equalsimpl0(this.blue10, base.blue10) && Color.m676equalsimpl0(this.blue20, base.blue20) && Color.m676equalsimpl0(this.brandAmber, base.brandAmber) && Color.m676equalsimpl0(this.brandAquaS1, base.brandAquaS1) && Color.m676equalsimpl0(this.brandAzureH2, base.brandAzureH2) && Color.m676equalsimpl0(this.brandAzureS1, base.brandAzureS1) && Color.m676equalsimpl0(this.brandCashGreen, base.brandCashGreen) && Color.m676equalsimpl0(this.brandCashGreen05, base.brandCashGreen05) && Color.m676equalsimpl0(this.brandCashGreen10, base.brandCashGreen10) && Color.m676equalsimpl0(this.brandCashGreen15, base.brandCashGreen15) && Color.m676equalsimpl0(this.brandCashGreen20, base.brandCashGreen20) && Color.m676equalsimpl0(this.brandCashGreen25, base.brandCashGreen25) && Color.m676equalsimpl0(this.brandCashGreen30, base.brandCashGreen30) && Color.m676equalsimpl0(this.brandCashGreen35, base.brandCashGreen35) && Color.m676equalsimpl0(this.brandCashGreen40, base.brandCashGreen40) && Color.m676equalsimpl0(this.brandCashGreen45, base.brandCashGreen45) && Color.m676equalsimpl0(this.brandCashGreen50, base.brandCashGreen50) && Color.m676equalsimpl0(this.brandCashGreen55, base.brandCashGreen55) && Color.m676equalsimpl0(this.brandCashGreen60, base.brandCashGreen60) && Color.m676equalsimpl0(this.brandCashGreen65, base.brandCashGreen65) && Color.m676equalsimpl0(this.brandCashGreen70, base.brandCashGreen70) && Color.m676equalsimpl0(this.brandCashGreen75, base.brandCashGreen75) && Color.m676equalsimpl0(this.brandCashGreen80, base.brandCashGreen80) && Color.m676equalsimpl0(this.brandCashGreen85, base.brandCashGreen85) && Color.m676equalsimpl0(this.brandCashGreen90, base.brandCashGreen90) && Color.m676equalsimpl0(this.brandCashGreen95, base.brandCashGreen95) && Color.m676equalsimpl0(this.brandCitronH1, base.brandCitronH1) && Color.m676equalsimpl0(this.brandCitronS1, base.brandCitronS1) && Color.m676equalsimpl0(this.brandCobaltS1, base.brandCobaltS1) && Color.m676equalsimpl0(this.brandGoldS1, base.brandGoldS1) && Color.m676equalsimpl0(this.brandGreenH1, base.brandGreenH1) && Color.m676equalsimpl0(this.brandGreenS1, base.brandGreenS1) && Color.m676equalsimpl0(this.brandMagentaH1, base.brandMagentaH1) && Color.m676equalsimpl0(this.brandMagentaH5, base.brandMagentaH5) && Color.m676equalsimpl0(this.brandMagentaS1, base.brandMagentaS1) && Color.m676equalsimpl0(this.brandOcean, base.brandOcean) && Color.m676equalsimpl0(this.brandOrangeH1, base.brandOrangeH1) && Color.m676equalsimpl0(this.brandOrangeH3, base.brandOrangeH3) && Color.m676equalsimpl0(this.brandOrangeS1, base.brandOrangeS1) && Color.m676equalsimpl0(this.brandOrcaPastel, base.brandOrcaPastel) && Color.m676equalsimpl0(this.brandPink, base.brandPink) && Color.m676equalsimpl0(this.brandPurple, base.brandPurple) && Color.m676equalsimpl0(this.brandPurpleS1, base.brandPurpleS1) && Color.m676equalsimpl0(this.brandRoyal, base.brandRoyal) && Color.m676equalsimpl0(this.brandScarlet, base.brandScarlet) && Color.m676equalsimpl0(this.brandScarletS1, base.brandScarletS1) && Color.m676equalsimpl0(this.brandSky, base.brandSky) && Color.m676equalsimpl0(this.brandSteel, base.brandSteel) && Color.m676equalsimpl0(this.brandSunshine, base.brandSunshine) && Color.m676equalsimpl0(this.brandTurquoise, base.brandTurquoise) && Color.m676equalsimpl0(this.brandVioletS1, base.brandVioletS1) && Color.m676equalsimpl0(this.cashGreen10, base.cashGreen10) && Color.m676equalsimpl0(this.cashGreen20, base.cashGreen20) && Color.m676equalsimpl0(this.cashGreen30, base.cashGreen30) && Color.m676equalsimpl0(this.cashGreen40, base.cashGreen40) && Color.m676equalsimpl0(this.constantBlack, base.constantBlack) && Color.m676equalsimpl0(this.constantClear, base.constantClear) && Color.m676equalsimpl0(this.constantWhite, base.constantWhite) && Color.m676equalsimpl0(this.green10, base.green10) && Color.m676equalsimpl0(this.green20, base.green20) && Color.m676equalsimpl0(this.grey10, base.grey10) && Color.m676equalsimpl0(this.grey15, base.grey15) && Color.m676equalsimpl0(this.grey20, base.grey20) && Color.m676equalsimpl0(this.grey25, base.grey25) && Color.m676equalsimpl0(this.grey30, base.grey30) && Color.m676equalsimpl0(this.grey40, base.grey40) && Color.m676equalsimpl0(this.grey45, base.grey45) && Color.m676equalsimpl0(this.grey50, base.grey50) && Color.m676equalsimpl0(this.grey60, base.grey60) && Color.m676equalsimpl0(this.grey65, base.grey65) && Color.m676equalsimpl0(this.grey80, base.grey80) && Color.m676equalsimpl0(this.grey85, base.grey85) && Color.m676equalsimpl0(this.grey90, base.grey90) && Color.m676equalsimpl0(this.grey95, base.grey95) && Color.m676equalsimpl0(this.grey98, base.grey98) && Color.m676equalsimpl0(this.purple10, base.purple10) && Color.m676equalsimpl0(this.purple20, base.purple20) && Color.m676equalsimpl0(this.red10, base.red10) && Color.m676equalsimpl0(this.red100, base.red100) && Color.m676equalsimpl0(this.red20, base.red20) && Color.m676equalsimpl0(this.red30, base.red30) && Color.m676equalsimpl0(this.red40, base.red40) && Color.m676equalsimpl0(this.red50, base.red50) && Color.m676equalsimpl0(this.red60, base.red60) && Color.m676equalsimpl0(this.red70, base.red70) && Color.m676equalsimpl0(this.red80, base.red80) && Color.m676equalsimpl0(this.red90, base.red90) && Color.m676equalsimpl0(this.violet10, base.violet10) && Color.m676equalsimpl0(this.violet20, base.violet20) && Color.m676equalsimpl0(this.violet30, base.violet30) && Color.m676equalsimpl0(this.violet40, base.violet40) && Color.m676equalsimpl0(this.violet5, base.violet5) && Color.m676equalsimpl0(this.violet50, base.violet50) && Color.m676equalsimpl0(this.violet60, base.violet60) && Color.m676equalsimpl0(this.violet70, base.violet70) && Color.m676equalsimpl0(this.violet80, base.violet80) && Color.m676equalsimpl0(this.violet90, base.violet90);
        }

        /* renamed from: getAmber10-0d7_KjU, reason: not valid java name */
        public final long m2986getAmber100d7_KjU() {
            return this.amber10;
        }

        /* renamed from: getAmber20-0d7_KjU, reason: not valid java name */
        public final long m2987getAmber200d7_KjU() {
            return this.amber20;
        }

        /* renamed from: getBitcoin-0d7_KjU, reason: not valid java name */
        public final long m2988getBitcoin0d7_KjU() {
            return this.bitcoin;
        }

        /* renamed from: getBitcoinBg-0d7_KjU, reason: not valid java name */
        public final long m2989getBitcoinBg0d7_KjU() {
            return this.bitcoinBg;
        }

        /* renamed from: getBlue10-0d7_KjU, reason: not valid java name */
        public final long m2990getBlue100d7_KjU() {
            return this.blue10;
        }

        /* renamed from: getBlue20-0d7_KjU, reason: not valid java name */
        public final long m2991getBlue200d7_KjU() {
            return this.blue20;
        }

        /* renamed from: getBrandAmber-0d7_KjU, reason: not valid java name */
        public final long m2992getBrandAmber0d7_KjU() {
            return this.brandAmber;
        }

        /* renamed from: getBrandAquaS1-0d7_KjU, reason: not valid java name */
        public final long m2993getBrandAquaS10d7_KjU() {
            return this.brandAquaS1;
        }

        /* renamed from: getBrandAzureH2-0d7_KjU, reason: not valid java name */
        public final long m2994getBrandAzureH20d7_KjU() {
            return this.brandAzureH2;
        }

        /* renamed from: getBrandAzureS1-0d7_KjU, reason: not valid java name */
        public final long m2995getBrandAzureS10d7_KjU() {
            return this.brandAzureS1;
        }

        /* renamed from: getBrandCashGreen-0d7_KjU, reason: not valid java name */
        public final long m2996getBrandCashGreen0d7_KjU() {
            return this.brandCashGreen;
        }

        /* renamed from: getBrandCashGreen05-0d7_KjU, reason: not valid java name */
        public final long m2997getBrandCashGreen050d7_KjU() {
            return this.brandCashGreen05;
        }

        /* renamed from: getBrandCashGreen10-0d7_KjU, reason: not valid java name */
        public final long m2998getBrandCashGreen100d7_KjU() {
            return this.brandCashGreen10;
        }

        /* renamed from: getBrandCashGreen15-0d7_KjU, reason: not valid java name */
        public final long m2999getBrandCashGreen150d7_KjU() {
            return this.brandCashGreen15;
        }

        /* renamed from: getBrandCashGreen20-0d7_KjU, reason: not valid java name */
        public final long m3000getBrandCashGreen200d7_KjU() {
            return this.brandCashGreen20;
        }

        /* renamed from: getBrandCashGreen25-0d7_KjU, reason: not valid java name */
        public final long m3001getBrandCashGreen250d7_KjU() {
            return this.brandCashGreen25;
        }

        /* renamed from: getBrandCashGreen30-0d7_KjU, reason: not valid java name */
        public final long m3002getBrandCashGreen300d7_KjU() {
            return this.brandCashGreen30;
        }

        /* renamed from: getBrandCashGreen35-0d7_KjU, reason: not valid java name */
        public final long m3003getBrandCashGreen350d7_KjU() {
            return this.brandCashGreen35;
        }

        /* renamed from: getBrandCashGreen40-0d7_KjU, reason: not valid java name */
        public final long m3004getBrandCashGreen400d7_KjU() {
            return this.brandCashGreen40;
        }

        /* renamed from: getBrandCashGreen45-0d7_KjU, reason: not valid java name */
        public final long m3005getBrandCashGreen450d7_KjU() {
            return this.brandCashGreen45;
        }

        /* renamed from: getBrandCashGreen50-0d7_KjU, reason: not valid java name */
        public final long m3006getBrandCashGreen500d7_KjU() {
            return this.brandCashGreen50;
        }

        /* renamed from: getBrandCashGreen55-0d7_KjU, reason: not valid java name */
        public final long m3007getBrandCashGreen550d7_KjU() {
            return this.brandCashGreen55;
        }

        /* renamed from: getBrandCashGreen60-0d7_KjU, reason: not valid java name */
        public final long m3008getBrandCashGreen600d7_KjU() {
            return this.brandCashGreen60;
        }

        /* renamed from: getBrandCashGreen65-0d7_KjU, reason: not valid java name */
        public final long m3009getBrandCashGreen650d7_KjU() {
            return this.brandCashGreen65;
        }

        /* renamed from: getBrandCashGreen70-0d7_KjU, reason: not valid java name */
        public final long m3010getBrandCashGreen700d7_KjU() {
            return this.brandCashGreen70;
        }

        /* renamed from: getBrandCashGreen75-0d7_KjU, reason: not valid java name */
        public final long m3011getBrandCashGreen750d7_KjU() {
            return this.brandCashGreen75;
        }

        /* renamed from: getBrandCashGreen80-0d7_KjU, reason: not valid java name */
        public final long m3012getBrandCashGreen800d7_KjU() {
            return this.brandCashGreen80;
        }

        /* renamed from: getBrandCashGreen85-0d7_KjU, reason: not valid java name */
        public final long m3013getBrandCashGreen850d7_KjU() {
            return this.brandCashGreen85;
        }

        /* renamed from: getBrandCashGreen90-0d7_KjU, reason: not valid java name */
        public final long m3014getBrandCashGreen900d7_KjU() {
            return this.brandCashGreen90;
        }

        /* renamed from: getBrandCashGreen95-0d7_KjU, reason: not valid java name */
        public final long m3015getBrandCashGreen950d7_KjU() {
            return this.brandCashGreen95;
        }

        /* renamed from: getBrandCitronH1-0d7_KjU, reason: not valid java name */
        public final long m3016getBrandCitronH10d7_KjU() {
            return this.brandCitronH1;
        }

        /* renamed from: getBrandCitronS1-0d7_KjU, reason: not valid java name */
        public final long m3017getBrandCitronS10d7_KjU() {
            return this.brandCitronS1;
        }

        /* renamed from: getBrandCobaltS1-0d7_KjU, reason: not valid java name */
        public final long m3018getBrandCobaltS10d7_KjU() {
            return this.brandCobaltS1;
        }

        /* renamed from: getBrandGoldS1-0d7_KjU, reason: not valid java name */
        public final long m3019getBrandGoldS10d7_KjU() {
            return this.brandGoldS1;
        }

        /* renamed from: getBrandGreenH1-0d7_KjU, reason: not valid java name */
        public final long m3020getBrandGreenH10d7_KjU() {
            return this.brandGreenH1;
        }

        /* renamed from: getBrandGreenS1-0d7_KjU, reason: not valid java name */
        public final long m3021getBrandGreenS10d7_KjU() {
            return this.brandGreenS1;
        }

        /* renamed from: getBrandMagentaH1-0d7_KjU, reason: not valid java name */
        public final long m3022getBrandMagentaH10d7_KjU() {
            return this.brandMagentaH1;
        }

        /* renamed from: getBrandMagentaH5-0d7_KjU, reason: not valid java name */
        public final long m3023getBrandMagentaH50d7_KjU() {
            return this.brandMagentaH5;
        }

        /* renamed from: getBrandMagentaS1-0d7_KjU, reason: not valid java name */
        public final long m3024getBrandMagentaS10d7_KjU() {
            return this.brandMagentaS1;
        }

        /* renamed from: getBrandOrangeH1-0d7_KjU, reason: not valid java name */
        public final long m3025getBrandOrangeH10d7_KjU() {
            return this.brandOrangeH1;
        }

        /* renamed from: getBrandOrangeH3-0d7_KjU, reason: not valid java name */
        public final long m3026getBrandOrangeH30d7_KjU() {
            return this.brandOrangeH3;
        }

        /* renamed from: getBrandOrangeS1-0d7_KjU, reason: not valid java name */
        public final long m3027getBrandOrangeS10d7_KjU() {
            return this.brandOrangeS1;
        }

        /* renamed from: getBrandOrcaPastel-0d7_KjU, reason: not valid java name */
        public final long m3028getBrandOrcaPastel0d7_KjU() {
            return this.brandOrcaPastel;
        }

        /* renamed from: getBrandPink-0d7_KjU, reason: not valid java name */
        public final long m3029getBrandPink0d7_KjU() {
            return this.brandPink;
        }

        /* renamed from: getBrandPurple-0d7_KjU, reason: not valid java name */
        public final long m3030getBrandPurple0d7_KjU() {
            return this.brandPurple;
        }

        /* renamed from: getBrandPurpleS1-0d7_KjU, reason: not valid java name */
        public final long m3031getBrandPurpleS10d7_KjU() {
            return this.brandPurpleS1;
        }

        /* renamed from: getBrandRoyal-0d7_KjU, reason: not valid java name */
        public final long m3032getBrandRoyal0d7_KjU() {
            return this.brandRoyal;
        }

        /* renamed from: getBrandScarlet-0d7_KjU, reason: not valid java name */
        public final long m3033getBrandScarlet0d7_KjU() {
            return this.brandScarlet;
        }

        /* renamed from: getBrandScarletS1-0d7_KjU, reason: not valid java name */
        public final long m3034getBrandScarletS10d7_KjU() {
            return this.brandScarletS1;
        }

        /* renamed from: getBrandSky-0d7_KjU, reason: not valid java name */
        public final long m3035getBrandSky0d7_KjU() {
            return this.brandSky;
        }

        /* renamed from: getBrandSteel-0d7_KjU, reason: not valid java name */
        public final long m3036getBrandSteel0d7_KjU() {
            return this.brandSteel;
        }

        /* renamed from: getBrandSunshine-0d7_KjU, reason: not valid java name */
        public final long m3037getBrandSunshine0d7_KjU() {
            return this.brandSunshine;
        }

        /* renamed from: getBrandTurquoise-0d7_KjU, reason: not valid java name */
        public final long m3038getBrandTurquoise0d7_KjU() {
            return this.brandTurquoise;
        }

        /* renamed from: getBrandVioletS1-0d7_KjU, reason: not valid java name */
        public final long m3039getBrandVioletS10d7_KjU() {
            return this.brandVioletS1;
        }

        /* renamed from: getCashGreen10-0d7_KjU, reason: not valid java name */
        public final long m3040getCashGreen100d7_KjU() {
            return this.cashGreen10;
        }

        /* renamed from: getCashGreen20-0d7_KjU, reason: not valid java name */
        public final long m3041getCashGreen200d7_KjU() {
            return this.cashGreen20;
        }

        /* renamed from: getCashGreen30-0d7_KjU, reason: not valid java name */
        public final long m3042getCashGreen300d7_KjU() {
            return this.cashGreen30;
        }

        /* renamed from: getCashGreen40-0d7_KjU, reason: not valid java name */
        public final long m3043getCashGreen400d7_KjU() {
            return this.cashGreen40;
        }

        /* renamed from: getConstantClear-0d7_KjU, reason: not valid java name */
        public final long m3044getConstantClear0d7_KjU() {
            return this.constantClear;
        }

        /* renamed from: getGreen10-0d7_KjU, reason: not valid java name */
        public final long m3045getGreen100d7_KjU() {
            return this.green10;
        }

        /* renamed from: getGreen20-0d7_KjU, reason: not valid java name */
        public final long m3046getGreen200d7_KjU() {
            return this.green20;
        }

        /* renamed from: getGrey10-0d7_KjU, reason: not valid java name */
        public final long m3047getGrey100d7_KjU() {
            return this.grey10;
        }

        /* renamed from: getGrey15-0d7_KjU, reason: not valid java name */
        public final long m3048getGrey150d7_KjU() {
            return this.grey15;
        }

        /* renamed from: getGrey20-0d7_KjU, reason: not valid java name */
        public final long m3049getGrey200d7_KjU() {
            return this.grey20;
        }

        /* renamed from: getGrey25-0d7_KjU, reason: not valid java name */
        public final long m3050getGrey250d7_KjU() {
            return this.grey25;
        }

        /* renamed from: getGrey30-0d7_KjU, reason: not valid java name */
        public final long m3051getGrey300d7_KjU() {
            return this.grey30;
        }

        /* renamed from: getGrey40-0d7_KjU, reason: not valid java name */
        public final long m3052getGrey400d7_KjU() {
            return this.grey40;
        }

        /* renamed from: getGrey45-0d7_KjU, reason: not valid java name */
        public final long m3053getGrey450d7_KjU() {
            return this.grey45;
        }

        /* renamed from: getGrey50-0d7_KjU, reason: not valid java name */
        public final long m3054getGrey500d7_KjU() {
            return this.grey50;
        }

        /* renamed from: getGrey60-0d7_KjU, reason: not valid java name */
        public final long m3055getGrey600d7_KjU() {
            return this.grey60;
        }

        /* renamed from: getGrey65-0d7_KjU, reason: not valid java name */
        public final long m3056getGrey650d7_KjU() {
            return this.grey65;
        }

        /* renamed from: getGrey80-0d7_KjU, reason: not valid java name */
        public final long m3057getGrey800d7_KjU() {
            return this.grey80;
        }

        /* renamed from: getGrey85-0d7_KjU, reason: not valid java name */
        public final long m3058getGrey850d7_KjU() {
            return this.grey85;
        }

        /* renamed from: getGrey90-0d7_KjU, reason: not valid java name */
        public final long m3059getGrey900d7_KjU() {
            return this.grey90;
        }

        /* renamed from: getGrey95-0d7_KjU, reason: not valid java name */
        public final long m3060getGrey950d7_KjU() {
            return this.grey95;
        }

        /* renamed from: getGrey98-0d7_KjU, reason: not valid java name */
        public final long m3061getGrey980d7_KjU() {
            return this.grey98;
        }

        /* renamed from: getPurple10-0d7_KjU, reason: not valid java name */
        public final long m3062getPurple100d7_KjU() {
            return this.purple10;
        }

        /* renamed from: getPurple20-0d7_KjU, reason: not valid java name */
        public final long m3063getPurple200d7_KjU() {
            return this.purple20;
        }

        /* renamed from: getRed10-0d7_KjU, reason: not valid java name */
        public final long m3064getRed100d7_KjU() {
            return this.red10;
        }

        /* renamed from: getRed100-0d7_KjU, reason: not valid java name */
        public final long m3065getRed1000d7_KjU() {
            return this.red100;
        }

        /* renamed from: getRed20-0d7_KjU, reason: not valid java name */
        public final long m3066getRed200d7_KjU() {
            return this.red20;
        }

        /* renamed from: getRed30-0d7_KjU, reason: not valid java name */
        public final long m3067getRed300d7_KjU() {
            return this.red30;
        }

        /* renamed from: getRed40-0d7_KjU, reason: not valid java name */
        public final long m3068getRed400d7_KjU() {
            return this.red40;
        }

        /* renamed from: getRed50-0d7_KjU, reason: not valid java name */
        public final long m3069getRed500d7_KjU() {
            return this.red50;
        }

        /* renamed from: getRed60-0d7_KjU, reason: not valid java name */
        public final long m3070getRed600d7_KjU() {
            return this.red60;
        }

        /* renamed from: getRed70-0d7_KjU, reason: not valid java name */
        public final long m3071getRed700d7_KjU() {
            return this.red70;
        }

        /* renamed from: getRed80-0d7_KjU, reason: not valid java name */
        public final long m3072getRed800d7_KjU() {
            return this.red80;
        }

        /* renamed from: getRed90-0d7_KjU, reason: not valid java name */
        public final long m3073getRed900d7_KjU() {
            return this.red90;
        }

        /* renamed from: getViolet10-0d7_KjU, reason: not valid java name */
        public final long m3074getViolet100d7_KjU() {
            return this.violet10;
        }

        /* renamed from: getViolet20-0d7_KjU, reason: not valid java name */
        public final long m3075getViolet200d7_KjU() {
            return this.violet20;
        }

        /* renamed from: getViolet30-0d7_KjU, reason: not valid java name */
        public final long m3076getViolet300d7_KjU() {
            return this.violet30;
        }

        /* renamed from: getViolet40-0d7_KjU, reason: not valid java name */
        public final long m3077getViolet400d7_KjU() {
            return this.violet40;
        }

        /* renamed from: getViolet5-0d7_KjU, reason: not valid java name */
        public final long m3078getViolet50d7_KjU() {
            return this.violet5;
        }

        /* renamed from: getViolet50-0d7_KjU, reason: not valid java name */
        public final long m3079getViolet500d7_KjU() {
            return this.violet50;
        }

        /* renamed from: getViolet60-0d7_KjU, reason: not valid java name */
        public final long m3080getViolet600d7_KjU() {
            return this.violet60;
        }

        /* renamed from: getViolet70-0d7_KjU, reason: not valid java name */
        public final long m3081getViolet700d7_KjU() {
            return this.violet70;
        }

        /* renamed from: getViolet80-0d7_KjU, reason: not valid java name */
        public final long m3082getViolet800d7_KjU() {
            return this.violet80;
        }

        /* renamed from: getViolet90-0d7_KjU, reason: not valid java name */
        public final long m3083getViolet900d7_KjU() {
            return this.violet90;
        }

        public final int hashCode() {
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Long.hashCode(this.violet90) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.amber10) * 31, 31, this.amber20), 31, this.bitcoin), 31, this.bitcoinBg), 31, this.blue10), 31, this.blue20), 31, this.brandAmber), 31, this.brandAquaS1), 31, this.brandAzureH2), 31, this.brandAzureS1), 31, this.brandCashGreen), 31, this.brandCashGreen05), 31, this.brandCashGreen10), 31, this.brandCashGreen15), 31, this.brandCashGreen20), 31, this.brandCashGreen25), 31, this.brandCashGreen30), 31, this.brandCashGreen35), 31, this.brandCashGreen40), 31, this.brandCashGreen45), 31, this.brandCashGreen50), 31, this.brandCashGreen55), 31, this.brandCashGreen60), 31, this.brandCashGreen65), 31, this.brandCashGreen70), 31, this.brandCashGreen75), 31, this.brandCashGreen80), 31, this.brandCashGreen85), 31, this.brandCashGreen90), 31, this.brandCashGreen95), 31, this.brandCitronH1), 31, this.brandCitronS1), 31, this.brandCobaltS1), 31, this.brandGoldS1), 31, this.brandGreenH1), 31, this.brandGreenS1), 31, this.brandMagentaH1), 31, this.brandMagentaH5), 31, this.brandMagentaS1), 31, this.brandOcean), 31, this.brandOrangeH1), 31, this.brandOrangeH3), 31, this.brandOrangeS1), 31, this.brandOrcaPastel), 31, this.brandPink), 31, this.brandPurple), 31, this.brandPurpleS1), 31, this.brandRoyal), 31, this.brandScarlet), 31, this.brandScarletS1), 31, this.brandSky), 31, this.brandSteel), 31, this.brandSunshine), 31, this.brandTurquoise), 31, this.brandVioletS1), 31, this.cashGreen10), 31, this.cashGreen20), 31, this.cashGreen30), 31, this.cashGreen40), 31, this.constantBlack), 31, this.constantClear), 31, this.constantWhite), 31, this.green10), 31, this.green20), 31, this.grey10), 31, this.grey15), 31, this.grey20), 31, this.grey25), 31, this.grey30), 31, this.grey40), 31, this.grey45), 31, this.grey50), 31, this.grey60), 31, this.grey65), 31, this.grey80), 31, this.grey85), 31, this.grey90), 31, this.grey95), 31, this.grey98), 31, this.purple10), 31, this.purple20), 31, this.red10), 31, this.red100), 31, this.red20), 31, this.red30), 31, this.red40), 31, this.red50), 31, this.red60), 31, this.red70), 31, this.red80), 31, this.red90), 31, this.violet10), 31, this.violet20), 31, this.violet30), 31, this.violet40), 31, this.violet5), 31, this.violet50), 31, this.violet60), 31, this.violet70), 31, this.violet80);
        }

        public final String toString() {
            String m682toStringimpl = Color.m682toStringimpl(this.amber10);
            String m682toStringimpl2 = Color.m682toStringimpl(this.amber20);
            String m682toStringimpl3 = Color.m682toStringimpl(this.bitcoin);
            String m682toStringimpl4 = Color.m682toStringimpl(this.bitcoinBg);
            String m682toStringimpl5 = Color.m682toStringimpl(this.blue10);
            String m682toStringimpl6 = Color.m682toStringimpl(this.blue20);
            String m682toStringimpl7 = Color.m682toStringimpl(this.brandAmber);
            String m682toStringimpl8 = Color.m682toStringimpl(this.brandAquaS1);
            String m682toStringimpl9 = Color.m682toStringimpl(this.brandAzureH2);
            String m682toStringimpl10 = Color.m682toStringimpl(this.brandAzureS1);
            String m682toStringimpl11 = Color.m682toStringimpl(this.brandCashGreen);
            String m682toStringimpl12 = Color.m682toStringimpl(this.brandCashGreen05);
            String m682toStringimpl13 = Color.m682toStringimpl(this.brandCashGreen10);
            String m682toStringimpl14 = Color.m682toStringimpl(this.brandCashGreen15);
            String m682toStringimpl15 = Color.m682toStringimpl(this.brandCashGreen20);
            String m682toStringimpl16 = Color.m682toStringimpl(this.brandCashGreen25);
            String m682toStringimpl17 = Color.m682toStringimpl(this.brandCashGreen30);
            String m682toStringimpl18 = Color.m682toStringimpl(this.brandCashGreen35);
            String m682toStringimpl19 = Color.m682toStringimpl(this.brandCashGreen40);
            String m682toStringimpl20 = Color.m682toStringimpl(this.brandCashGreen45);
            String m682toStringimpl21 = Color.m682toStringimpl(this.brandCashGreen50);
            String m682toStringimpl22 = Color.m682toStringimpl(this.brandCashGreen55);
            String m682toStringimpl23 = Color.m682toStringimpl(this.brandCashGreen60);
            String m682toStringimpl24 = Color.m682toStringimpl(this.brandCashGreen65);
            String m682toStringimpl25 = Color.m682toStringimpl(this.brandCashGreen70);
            String m682toStringimpl26 = Color.m682toStringimpl(this.brandCashGreen75);
            String m682toStringimpl27 = Color.m682toStringimpl(this.brandCashGreen80);
            String m682toStringimpl28 = Color.m682toStringimpl(this.brandCashGreen85);
            String m682toStringimpl29 = Color.m682toStringimpl(this.brandCashGreen90);
            String m682toStringimpl30 = Color.m682toStringimpl(this.brandCashGreen95);
            String m682toStringimpl31 = Color.m682toStringimpl(this.brandCitronH1);
            String m682toStringimpl32 = Color.m682toStringimpl(this.brandCitronS1);
            String m682toStringimpl33 = Color.m682toStringimpl(this.brandCobaltS1);
            String m682toStringimpl34 = Color.m682toStringimpl(this.brandGoldS1);
            String m682toStringimpl35 = Color.m682toStringimpl(this.brandGreenH1);
            String m682toStringimpl36 = Color.m682toStringimpl(this.brandGreenS1);
            String m682toStringimpl37 = Color.m682toStringimpl(this.brandMagentaH1);
            String m682toStringimpl38 = Color.m682toStringimpl(this.brandMagentaH5);
            String m682toStringimpl39 = Color.m682toStringimpl(this.brandMagentaS1);
            String m682toStringimpl40 = Color.m682toStringimpl(this.brandOcean);
            String m682toStringimpl41 = Color.m682toStringimpl(this.brandOrangeH1);
            String m682toStringimpl42 = Color.m682toStringimpl(this.brandOrangeH3);
            String m682toStringimpl43 = Color.m682toStringimpl(this.brandOrangeS1);
            String m682toStringimpl44 = Color.m682toStringimpl(this.brandOrcaPastel);
            String m682toStringimpl45 = Color.m682toStringimpl(this.brandPink);
            String m682toStringimpl46 = Color.m682toStringimpl(this.brandPurple);
            String m682toStringimpl47 = Color.m682toStringimpl(this.brandPurpleS1);
            String m682toStringimpl48 = Color.m682toStringimpl(this.brandRoyal);
            String m682toStringimpl49 = Color.m682toStringimpl(this.brandScarlet);
            String m682toStringimpl50 = Color.m682toStringimpl(this.brandScarletS1);
            String m682toStringimpl51 = Color.m682toStringimpl(this.brandSky);
            String m682toStringimpl52 = Color.m682toStringimpl(this.brandSteel);
            String m682toStringimpl53 = Color.m682toStringimpl(this.brandSunshine);
            String m682toStringimpl54 = Color.m682toStringimpl(this.brandTurquoise);
            String m682toStringimpl55 = Color.m682toStringimpl(this.brandVioletS1);
            String m682toStringimpl56 = Color.m682toStringimpl(this.cashGreen10);
            String m682toStringimpl57 = Color.m682toStringimpl(this.cashGreen20);
            String m682toStringimpl58 = Color.m682toStringimpl(this.cashGreen30);
            String m682toStringimpl59 = Color.m682toStringimpl(this.cashGreen40);
            String m682toStringimpl60 = Color.m682toStringimpl(this.constantBlack);
            String m682toStringimpl61 = Color.m682toStringimpl(this.constantClear);
            String m682toStringimpl62 = Color.m682toStringimpl(this.constantWhite);
            String m682toStringimpl63 = Color.m682toStringimpl(this.green10);
            String m682toStringimpl64 = Color.m682toStringimpl(this.green20);
            String m682toStringimpl65 = Color.m682toStringimpl(this.grey10);
            String m682toStringimpl66 = Color.m682toStringimpl(this.grey15);
            String m682toStringimpl67 = Color.m682toStringimpl(this.grey20);
            String m682toStringimpl68 = Color.m682toStringimpl(this.grey25);
            String m682toStringimpl69 = Color.m682toStringimpl(this.grey30);
            String m682toStringimpl70 = Color.m682toStringimpl(this.grey40);
            String m682toStringimpl71 = Color.m682toStringimpl(this.grey45);
            String m682toStringimpl72 = Color.m682toStringimpl(this.grey50);
            String m682toStringimpl73 = Color.m682toStringimpl(this.grey60);
            String m682toStringimpl74 = Color.m682toStringimpl(this.grey65);
            String m682toStringimpl75 = Color.m682toStringimpl(this.grey80);
            String m682toStringimpl76 = Color.m682toStringimpl(this.grey85);
            String m682toStringimpl77 = Color.m682toStringimpl(this.grey90);
            String m682toStringimpl78 = Color.m682toStringimpl(this.grey95);
            String m682toStringimpl79 = Color.m682toStringimpl(this.grey98);
            String m682toStringimpl80 = Color.m682toStringimpl(this.purple10);
            String m682toStringimpl81 = Color.m682toStringimpl(this.purple20);
            String m682toStringimpl82 = Color.m682toStringimpl(this.red10);
            String m682toStringimpl83 = Color.m682toStringimpl(this.red100);
            String m682toStringimpl84 = Color.m682toStringimpl(this.red20);
            String m682toStringimpl85 = Color.m682toStringimpl(this.red30);
            String m682toStringimpl86 = Color.m682toStringimpl(this.red40);
            String m682toStringimpl87 = Color.m682toStringimpl(this.red50);
            String m682toStringimpl88 = Color.m682toStringimpl(this.red60);
            String m682toStringimpl89 = Color.m682toStringimpl(this.red70);
            String m682toStringimpl90 = Color.m682toStringimpl(this.red80);
            String m682toStringimpl91 = Color.m682toStringimpl(this.red90);
            String m682toStringimpl92 = Color.m682toStringimpl(this.violet10);
            String m682toStringimpl93 = Color.m682toStringimpl(this.violet20);
            String m682toStringimpl94 = Color.m682toStringimpl(this.violet30);
            String m682toStringimpl95 = Color.m682toStringimpl(this.violet40);
            String m682toStringimpl96 = Color.m682toStringimpl(this.violet5);
            String m682toStringimpl97 = Color.m682toStringimpl(this.violet50);
            String m682toStringimpl98 = Color.m682toStringimpl(this.violet60);
            String m682toStringimpl99 = Color.m682toStringimpl(this.violet70);
            String m682toStringimpl100 = Color.m682toStringimpl(this.violet80);
            String m682toStringimpl101 = Color.m682toStringimpl(this.violet90);
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Base(amber10=", m682toStringimpl, ", amber20=", m682toStringimpl2, ", bitcoin=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", bitcoinBg=", m682toStringimpl4, ", blue10=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", blue20=", m682toStringimpl6, ", brandAmber=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", brandAquaS1=", m682toStringimpl8, ", brandAzureH2=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl9, ", brandAzureS1=", m682toStringimpl10, ", brandCashGreen=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl11, ", brandCashGreen05=", m682toStringimpl12, ", brandCashGreen10=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl13, ", brandCashGreen15=", m682toStringimpl14, ", brandCashGreen20=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl15, ", brandCashGreen25=", m682toStringimpl16, ", brandCashGreen30=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl17, ", brandCashGreen35=", m682toStringimpl18, ", brandCashGreen40=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl19, ", brandCashGreen45=", m682toStringimpl20, ", brandCashGreen50=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl21, ", brandCashGreen55=", m682toStringimpl22, ", brandCashGreen60=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl23, ", brandCashGreen65=", m682toStringimpl24, ", brandCashGreen70=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl25, ", brandCashGreen75=", m682toStringimpl26, ", brandCashGreen80=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl27, ", brandCashGreen85=", m682toStringimpl28, ", brandCashGreen90=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl29, ", brandCashGreen95=", m682toStringimpl30, ", brandCitronH1=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl31, ", brandCitronS1=", m682toStringimpl32, ", brandCobaltS1=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl33, ", brandGoldS1=", m682toStringimpl34, ", brandGreenH1=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl35, ", brandGreenS1=", m682toStringimpl36, ", brandMagentaH1=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl37, ", brandMagentaH5=", m682toStringimpl38, ", brandMagentaS1=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl39, ", brandOcean=", m682toStringimpl40, ", brandOrangeH1=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl41, ", brandOrangeH3=", m682toStringimpl42, ", brandOrangeS1=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl43, ", brandOrcaPastel=", m682toStringimpl44, ", brandPink=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl45, ", brandPurple=", m682toStringimpl46, ", brandPurpleS1=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl47, ", brandRoyal=", m682toStringimpl48, ", brandScarlet=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl49, ", brandScarletS1=", m682toStringimpl50, ", brandSky=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl51, ", brandSteel=", m682toStringimpl52, ", brandSunshine=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl53, ", brandTurquoise=", m682toStringimpl54, ", brandVioletS1=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl55, ", cashGreen10=", m682toStringimpl56, ", cashGreen20=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl57, ", cashGreen30=", m682toStringimpl58, ", cashGreen40=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl59, ", constantBlack=", m682toStringimpl60, ", constantClear=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl61, ", constantWhite=", m682toStringimpl62, ", green10=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl63, ", green20=", m682toStringimpl64, ", grey10=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl65, ", grey15=", m682toStringimpl66, ", grey20=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl67, ", grey25=", m682toStringimpl68, ", grey30=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl69, ", grey40=", m682toStringimpl70, ", grey45=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl71, ", grey50=", m682toStringimpl72, ", grey60=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl73, ", grey65=", m682toStringimpl74, ", grey80=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl75, ", grey85=", m682toStringimpl76, ", grey90=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl77, ", grey95=", m682toStringimpl78, ", grey98=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl79, ", purple10=", m682toStringimpl80, ", purple20=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl81, ", red10=", m682toStringimpl82, ", red100=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl83, ", red20=", m682toStringimpl84, ", red30=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl85, ", red40=", m682toStringimpl86, ", red50=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl87, ", red60=", m682toStringimpl88, ", red70=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl89, ", red80=", m682toStringimpl90, ", red90=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl91, ", violet10=", m682toStringimpl92, ", violet20=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl93, ", violet30=", m682toStringimpl94, ", violet40=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl95, ", violet5=", m682toStringimpl96, ", violet50=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl97, ", violet60=", m682toStringimpl98, ", violet70=");
            Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl99, ", violet80=", m682toStringimpl100, ", violet90=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl101, ")");
        }
    }

    public final class Component {
        public final Avatar avatar;
        public final Badge badge;
        public final BottomNavigation bottomNavigation;
        public final Button button;
        public final Card card;
        public final Cell cell;
        public final Checkbox checkbox;
        public final CopyCode copyCode;
        public final FilterBar filterBar;
        public final HalfSheet halfSheet;
        public final Header header;
        public final Input input;
        public final Modal modal;
        public final OptionCard optionCard;
        public final OptionChip optionChip;
        public final Radio radio;
        public final SearchBar searchBar;
        public final SearchField searchField;
        public final SegmentedControl segmentedControl;
        public final Sheet sheet;
        public final Slider slider;
        public final Timeline timeline;
        public final TitleBar titleBar;
        public final Toast toast;
        public final Toggle toggle;
        public final Tooltip tooltip;
        public final Ui ui;

        public final class Avatar {
            public final Background background;
            public final Name name;
            public final long text;

            public final class Background {
                public final long eight;
                public final long five;
                public final long four;
                public final long nine;
                public final long one;
                public final long seven;
                public final long six;
                public final long three;
                public final long two;

                public Background(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
                    this.eight = j;
                    this.five = j2;
                    this.four = j3;
                    this.nine = j4;
                    this.one = j5;
                    this.seven = j6;
                    this.six = j7;
                    this.three = j8;
                    this.two = j9;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) obj;
                    return Color.m676equalsimpl0(this.eight, background.eight) && Color.m676equalsimpl0(this.five, background.five) && Color.m676equalsimpl0(this.four, background.four) && Color.m676equalsimpl0(this.nine, background.nine) && Color.m676equalsimpl0(this.one, background.one) && Color.m676equalsimpl0(this.seven, background.seven) && Color.m676equalsimpl0(this.six, background.six) && Color.m676equalsimpl0(this.three, background.three) && Color.m676equalsimpl0(this.two, background.two);
                }

                /* renamed from: getEight-0d7_KjU, reason: not valid java name */
                public final long m3085getEight0d7_KjU() {
                    return this.eight;
                }

                /* renamed from: getFive-0d7_KjU, reason: not valid java name */
                public final long m3086getFive0d7_KjU() {
                    return this.five;
                }

                /* renamed from: getFour-0d7_KjU, reason: not valid java name */
                public final long m3087getFour0d7_KjU() {
                    return this.four;
                }

                /* renamed from: getNine-0d7_KjU, reason: not valid java name */
                public final long m3088getNine0d7_KjU() {
                    return this.nine;
                }

                /* renamed from: getOne-0d7_KjU, reason: not valid java name */
                public final long m3089getOne0d7_KjU() {
                    return this.one;
                }

                /* renamed from: getSeven-0d7_KjU, reason: not valid java name */
                public final long m3090getSeven0d7_KjU() {
                    return this.seven;
                }

                /* renamed from: getSix-0d7_KjU, reason: not valid java name */
                public final long m3091getSix0d7_KjU() {
                    return this.six;
                }

                /* renamed from: getThree-0d7_KjU, reason: not valid java name */
                public final long m3092getThree0d7_KjU() {
                    return this.three;
                }

                /* renamed from: getTwo-0d7_KjU, reason: not valid java name */
                public final long m3093getTwo0d7_KjU() {
                    return this.two;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.two) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.eight) * 31, 31, this.five), 31, this.four), 31, this.nine), 31, this.one), 31, this.seven), 31, this.six), 31, this.three);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.eight);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.five);
                    String m682toStringimpl3 = Color.m682toStringimpl(this.four);
                    String m682toStringimpl4 = Color.m682toStringimpl(this.nine);
                    String m682toStringimpl5 = Color.m682toStringimpl(this.one);
                    String m682toStringimpl6 = Color.m682toStringimpl(this.seven);
                    String m682toStringimpl7 = Color.m682toStringimpl(this.six);
                    String m682toStringimpl8 = Color.m682toStringimpl(this.three);
                    String m682toStringimpl9 = Color.m682toStringimpl(this.two);
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(eight=", m682toStringimpl, ", five=", m682toStringimpl2, ", four=");
                    Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", nine=", m682toStringimpl4, ", one=");
                    Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", seven=", m682toStringimpl6, ", six=");
                    Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", three=", m682toStringimpl8, ", two=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl9, ")");
                }
            }

            public final class Name {
                public final long text;

                public Name(long j) {
                    this.text = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Name) && Color.m676equalsimpl0(this.text, ((Name) obj).text);
                }

                /* renamed from: getText-0d7_KjU, reason: not valid java name */
                public final long m3094getText0d7_KjU() {
                    return this.text;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.text);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Name(text=", Color.m682toStringimpl(this.text), ")");
                }
            }

            public Avatar(Background background, Name name, long j) {
                this.background = background;
                this.name = name;
                this.text = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Avatar)) {
                    return false;
                }
                Avatar avatar = (Avatar) obj;
                return this.background.equals(avatar.background) && this.name.equals(avatar.name) && Color.m676equalsimpl0(this.text, avatar.text);
            }

            public final Background getBackground() {
                return this.background;
            }

            public final Name getName() {
                return this.name;
            }

            /* renamed from: getText-0d7_KjU, reason: not valid java name */
            public final long m3084getText0d7_KjU() {
                return this.text;
            }

            public final int hashCode() {
                int hashCode = (this.name.hashCode() + (this.background.hashCode() * 31)) * 31;
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.text) + hashCode;
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.text);
                StringBuilder sb = new StringBuilder("Avatar(background=");
                sb.append(this.background);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", text=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl, ")");
            }
        }

        public final class Badge {
            public final long background;
            public final long text;

            public Badge(long j, long j2) {
                this.background = j;
                this.text = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Badge)) {
                    return false;
                }
                Badge badge = (Badge) obj;
                return Color.m676equalsimpl0(this.background, badge.background) && Color.m676equalsimpl0(this.text, badge.text);
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3095getBackground0d7_KjU() {
                return this.background;
            }

            /* renamed from: getText-0d7_KjU, reason: not valid java name */
            public final long m3096getText0d7_KjU() {
                return this.text;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.text) + (Long.hashCode(this.background) * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Badge(background=", Color.m682toStringimpl(this.background), ", text=", Color.m682toStringimpl(this.text), ")");
            }
        }

        public final class BottomNavigation {
            public final long background;
            public final Bitcoin bitcoin;
            public final Icon icon;
            public final Keypad keypad;
            public final Text text;

            public final class Bitcoin {
                public final long background;
                public final Icon icon;
                public final Text text;

                public final class Icon {

                    /* renamed from: default, reason: not valid java name */
                    public final long f145default;
                    public final long selected;

                    public Icon(long j, long j2) {
                        this.f145default = j;
                        this.selected = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Icon)) {
                            return false;
                        }
                        Icon icon = (Icon) obj;
                        return Color.m676equalsimpl0(this.f145default, icon.f145default) && Color.m676equalsimpl0(this.selected, icon.selected);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3100getDefault0d7_KjU() {
                        return this.f145default;
                    }

                    /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                    public final long m3101getSelected0d7_KjU() {
                        return this.selected;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.selected) + (Long.hashCode(this.f145default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f145default), ", selected=", Color.m682toStringimpl(this.selected), ")");
                    }
                }

                public final class Text {

                    /* renamed from: default, reason: not valid java name */
                    public final long f146default;
                    public final long selected;

                    public Text(long j, long j2) {
                        this.f146default = j;
                        this.selected = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Text)) {
                            return false;
                        }
                        Text text = (Text) obj;
                        return Color.m676equalsimpl0(this.f146default, text.f146default) && Color.m676equalsimpl0(this.selected, text.selected);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3102getDefault0d7_KjU() {
                        return this.f146default;
                    }

                    /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                    public final long m3103getSelected0d7_KjU() {
                        return this.selected;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.selected) + (Long.hashCode(this.f146default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f146default), ", selected=", Color.m682toStringimpl(this.selected), ")");
                    }
                }

                public Bitcoin(long j, Icon icon, Text text) {
                    this.background = j;
                    this.icon = icon;
                    this.text = text;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Bitcoin)) {
                        return false;
                    }
                    Bitcoin bitcoin = (Bitcoin) obj;
                    return Color.m676equalsimpl0(this.background, bitcoin.background) && this.icon.equals(bitcoin.icon) && this.text.equals(bitcoin.text);
                }

                /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                public final long m3099getBackground0d7_KjU() {
                    return this.background;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return this.text.hashCode() + ((this.icon.hashCode() + (Long.hashCode(this.background) * 31)) * 31);
                }

                public final String toString() {
                    return "Bitcoin(background=" + Color.m682toStringimpl(this.background) + ", icon=" + this.icon + ", text=" + this.text + ")";
                }
            }

            public final class Icon {

                /* renamed from: default, reason: not valid java name */
                public final long f147default;
                public final long selected;

                public Icon(long j, long j2) {
                    this.f147default = j;
                    this.selected = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Icon)) {
                        return false;
                    }
                    Icon icon = (Icon) obj;
                    return Color.m676equalsimpl0(this.f147default, icon.f147default) && Color.m676equalsimpl0(this.selected, icon.selected);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3104getDefault0d7_KjU() {
                    return this.f147default;
                }

                /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                public final long m3105getSelected0d7_KjU() {
                    return this.selected;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.selected) + (Long.hashCode(this.f147default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f147default), ", selected=", Color.m682toStringimpl(this.selected), ")");
                }
            }

            public final class Keypad {
                public final long background;
                public final Icon icon;
                public final Text text;

                public final class Icon {

                    /* renamed from: default, reason: not valid java name */
                    public final long f148default;
                    public final long selected;

                    public Icon(long j, long j2) {
                        this.f148default = j;
                        this.selected = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Icon)) {
                            return false;
                        }
                        Icon icon = (Icon) obj;
                        return Color.m676equalsimpl0(this.f148default, icon.f148default) && Color.m676equalsimpl0(this.selected, icon.selected);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3107getDefault0d7_KjU() {
                        return this.f148default;
                    }

                    /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                    public final long m3108getSelected0d7_KjU() {
                        return this.selected;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.selected) + (Long.hashCode(this.f148default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f148default), ", selected=", Color.m682toStringimpl(this.selected), ")");
                    }
                }

                public final class Text {

                    /* renamed from: default, reason: not valid java name */
                    public final long f149default;
                    public final long selected;

                    public Text(long j, long j2) {
                        this.f149default = j;
                        this.selected = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Text)) {
                            return false;
                        }
                        Text text = (Text) obj;
                        return Color.m676equalsimpl0(this.f149default, text.f149default) && Color.m676equalsimpl0(this.selected, text.selected);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3109getDefault0d7_KjU() {
                        return this.f149default;
                    }

                    /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                    public final long m3110getSelected0d7_KjU() {
                        return this.selected;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.selected) + (Long.hashCode(this.f149default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f149default), ", selected=", Color.m682toStringimpl(this.selected), ")");
                    }
                }

                public Keypad(long j, Icon icon, Text text) {
                    this.background = j;
                    this.icon = icon;
                    this.text = text;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Keypad)) {
                        return false;
                    }
                    Keypad keypad = (Keypad) obj;
                    return Color.m676equalsimpl0(this.background, keypad.background) && this.icon.equals(keypad.icon) && this.text.equals(keypad.text);
                }

                /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                public final long m3106getBackground0d7_KjU() {
                    return this.background;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return this.text.hashCode() + ((this.icon.hashCode() + (Long.hashCode(this.background) * 31)) * 31);
                }

                public final String toString() {
                    return "Keypad(background=" + Color.m682toStringimpl(this.background) + ", icon=" + this.icon + ", text=" + this.text + ")";
                }
            }

            public final class Text {

                /* renamed from: default, reason: not valid java name */
                public final long f150default;
                public final long selected;

                public Text(long j, long j2) {
                    this.f150default = j;
                    this.selected = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) obj;
                    return Color.m676equalsimpl0(this.f150default, text.f150default) && Color.m676equalsimpl0(this.selected, text.selected);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3111getDefault0d7_KjU() {
                    return this.f150default;
                }

                /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                public final long m3112getSelected0d7_KjU() {
                    return this.selected;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.selected) + (Long.hashCode(this.f150default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f150default), ", selected=", Color.m682toStringimpl(this.selected), ")");
                }
            }

            public BottomNavigation(long j, Bitcoin bitcoin, Icon icon, Keypad keypad, Text text) {
                this.background = j;
                this.bitcoin = bitcoin;
                this.icon = icon;
                this.keypad = keypad;
                this.text = text;
            }

            /* renamed from: copy-3J-VO9M$default, reason: not valid java name */
            public static BottomNavigation m3097copy3JVO9M$default(BottomNavigation bottomNavigation, Keypad keypad) {
                return new BottomNavigation(bottomNavigation.background, bottomNavigation.bitcoin, bottomNavigation.icon, keypad, bottomNavigation.text);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BottomNavigation)) {
                    return false;
                }
                BottomNavigation bottomNavigation = (BottomNavigation) obj;
                return Color.m676equalsimpl0(this.background, bottomNavigation.background) && this.bitcoin.equals(bottomNavigation.bitcoin) && this.icon.equals(bottomNavigation.icon) && this.keypad.equals(bottomNavigation.keypad) && this.text.equals(bottomNavigation.text);
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3098getBackground0d7_KjU() {
                return this.background;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.text.hashCode() + ((this.keypad.hashCode() + ((this.icon.hashCode() + ((this.bitcoin.hashCode() + (Long.hashCode(this.background) * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "BottomNavigation(background=" + Color.m682toStringimpl(this.background) + ", bitcoin=" + this.bitcoin + ", icon=" + this.icon + ", keypad=" + this.keypad + ", text=" + this.text + ")";
            }
        }

        public final class Button {
            public final Destructive destructive;
            public final Prominent prominent;
            public final Standard standard;
            public final Subtle subtle;

            public final class Destructive {
                public final Prominent prominent;
                public final Standard standard;
                public final Subtle subtle;

                public final class Prominent {
                    public final Background background;
                    public final Icon icon;
                    public final Text text;

                    public final class Background {

                        /* renamed from: default, reason: not valid java name */
                        public final long f151default;
                        public final long disabled;
                        public final long pressed;

                        public Background(long j, long j2, long j3) {
                            this.f151default = j;
                            this.disabled = j2;
                            this.pressed = j3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Background)) {
                                return false;
                            }
                            Background background = (Background) obj;
                            return Color.m676equalsimpl0(this.f151default, background.f151default) && Color.m676equalsimpl0(this.disabled, background.disabled) && Color.m676equalsimpl0(this.pressed, background.pressed);
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f151default) * 31, 31, this.disabled);
                        }

                        public final String toString() {
                            String m682toStringimpl = Color.m682toStringimpl(this.f151default);
                            String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public final class Icon {

                        /* renamed from: default, reason: not valid java name */
                        public final long f152default;
                        public final long disabled;

                        public Icon(long j, long j2) {
                            this.f152default = j;
                            this.disabled = j2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Icon)) {
                                return false;
                            }
                            Icon icon = (Icon) obj;
                            return Color.m676equalsimpl0(this.f152default, icon.f152default) && Color.m676equalsimpl0(this.disabled, icon.disabled);
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.disabled) + (Long.hashCode(this.f152default) * 31);
                        }

                        public final String toString() {
                            return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f152default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                        }
                    }

                    public final class Text {

                        /* renamed from: default, reason: not valid java name */
                        public final long f153default;
                        public final long disabled;

                        public Text(long j, long j2) {
                            this.f153default = j;
                            this.disabled = j2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Text)) {
                                return false;
                            }
                            Text text = (Text) obj;
                            return Color.m676equalsimpl0(this.f153default, text.f153default) && Color.m676equalsimpl0(this.disabled, text.disabled);
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.disabled) + (Long.hashCode(this.f153default) * 31);
                        }

                        public final String toString() {
                            return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f153default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                        }
                    }

                    public Prominent(Background background, Icon icon, Text text) {
                        this.background = background;
                        this.icon = icon;
                        this.text = text;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Prominent)) {
                            return false;
                        }
                        Prominent prominent = (Prominent) obj;
                        return this.background.equals(prominent.background) && this.icon.equals(prominent.icon) && this.text.equals(prominent.text);
                    }

                    public final Background getBackground() {
                        return this.background;
                    }

                    public final int hashCode() {
                        return this.text.hashCode() + ((this.icon.hashCode() + (this.background.hashCode() * 31)) * 31);
                    }

                    public final String toString() {
                        return "Prominent(background=" + this.background + ", icon=" + this.icon + ", text=" + this.text + ")";
                    }
                }

                public final class Standard {
                    public final Background background;
                    public final Icon icon;
                    public final Text text;

                    public final class Background {

                        /* renamed from: default, reason: not valid java name */
                        public final long f154default;
                        public final long disabled;
                        public final long pressed;

                        public Background(long j, long j2, long j3) {
                            this.f154default = j;
                            this.disabled = j2;
                            this.pressed = j3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Background)) {
                                return false;
                            }
                            Background background = (Background) obj;
                            return Color.m676equalsimpl0(this.f154default, background.f154default) && Color.m676equalsimpl0(this.disabled, background.disabled) && Color.m676equalsimpl0(this.pressed, background.pressed);
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f154default) * 31, 31, this.disabled);
                        }

                        public final String toString() {
                            String m682toStringimpl = Color.m682toStringimpl(this.f154default);
                            String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public final class Icon {

                        /* renamed from: default, reason: not valid java name */
                        public final long f155default;
                        public final long disabled;
                        public final long pressed;

                        public Icon(long j, long j2, long j3) {
                            this.f155default = j;
                            this.disabled = j2;
                            this.pressed = j3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Icon)) {
                                return false;
                            }
                            Icon icon = (Icon) obj;
                            return Color.m676equalsimpl0(this.f155default, icon.f155default) && Color.m676equalsimpl0(this.disabled, icon.disabled) && Color.m676equalsimpl0(this.pressed, icon.pressed);
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f155default) * 31, 31, this.disabled);
                        }

                        public final String toString() {
                            String m682toStringimpl = Color.m682toStringimpl(this.f155default);
                            String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Icon(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public final class Text {

                        /* renamed from: default, reason: not valid java name */
                        public final long f156default;
                        public final long disabled;
                        public final long pressed;

                        public Text(long j, long j2, long j3) {
                            this.f156default = j;
                            this.disabled = j2;
                            this.pressed = j3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Text)) {
                                return false;
                            }
                            Text text = (Text) obj;
                            return Color.m676equalsimpl0(this.f156default, text.f156default) && Color.m676equalsimpl0(this.disabled, text.disabled) && Color.m676equalsimpl0(this.pressed, text.pressed);
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f156default) * 31, 31, this.disabled);
                        }

                        public final String toString() {
                            String m682toStringimpl = Color.m682toStringimpl(this.f156default);
                            String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public Standard(Background background, Icon icon, Text text) {
                        this.background = background;
                        this.icon = icon;
                        this.text = text;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Standard)) {
                            return false;
                        }
                        Standard standard = (Standard) obj;
                        return this.background.equals(standard.background) && this.icon.equals(standard.icon) && this.text.equals(standard.text);
                    }

                    public final Background getBackground() {
                        return this.background;
                    }

                    public final Icon getIcon() {
                        return this.icon;
                    }

                    public final Text getText() {
                        return this.text;
                    }

                    public final int hashCode() {
                        return this.text.hashCode() + ((this.icon.hashCode() + (this.background.hashCode() * 31)) * 31);
                    }

                    public final String toString() {
                        return "Standard(background=" + this.background + ", icon=" + this.icon + ", text=" + this.text + ")";
                    }
                }

                public final class Subtle {
                    public final Background background;
                    public final Icon icon;
                    public final Text text;

                    public final class Background {

                        /* renamed from: default, reason: not valid java name */
                        public final long f157default;
                        public final long pressed;

                        public Background(long j, long j2) {
                            this.f157default = j;
                            this.pressed = j2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Background)) {
                                return false;
                            }
                            Background background = (Background) obj;
                            return Color.m676equalsimpl0(this.f157default, background.f157default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed) + (Long.hashCode(this.f157default) * 31);
                        }

                        public final String toString() {
                            return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f157default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public final class Icon {

                        /* renamed from: default, reason: not valid java name */
                        public final long f158default;
                        public final long disabled;
                        public final long pressed;

                        public Icon(long j, long j2, long j3) {
                            this.f158default = j;
                            this.disabled = j2;
                            this.pressed = j3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Icon)) {
                                return false;
                            }
                            Icon icon = (Icon) obj;
                            return Color.m676equalsimpl0(this.f158default, icon.f158default) && Color.m676equalsimpl0(this.disabled, icon.disabled) && Color.m676equalsimpl0(this.pressed, icon.pressed);
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f158default) * 31, 31, this.disabled);
                        }

                        public final String toString() {
                            String m682toStringimpl = Color.m682toStringimpl(this.f158default);
                            String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Icon(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public final class Text {

                        /* renamed from: default, reason: not valid java name */
                        public final long f159default;
                        public final long disabled;
                        public final long pressed;

                        public Text(long j, long j2, long j3) {
                            this.f159default = j;
                            this.disabled = j2;
                            this.pressed = j3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Text)) {
                                return false;
                            }
                            Text text = (Text) obj;
                            return Color.m676equalsimpl0(this.f159default, text.f159default) && Color.m676equalsimpl0(this.disabled, text.disabled) && Color.m676equalsimpl0(this.pressed, text.pressed);
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f159default) * 31, 31, this.disabled);
                        }

                        public final String toString() {
                            String m682toStringimpl = Color.m682toStringimpl(this.f159default);
                            String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public Subtle(Background background, Icon icon, Text text) {
                        this.background = background;
                        this.icon = icon;
                        this.text = text;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Subtle)) {
                            return false;
                        }
                        Subtle subtle = (Subtle) obj;
                        return this.background.equals(subtle.background) && this.icon.equals(subtle.icon) && this.text.equals(subtle.text);
                    }

                    public final Icon getIcon() {
                        return this.icon;
                    }

                    public final Text getText() {
                        return this.text;
                    }

                    public final int hashCode() {
                        return this.text.hashCode() + ((this.icon.hashCode() + (this.background.hashCode() * 31)) * 31);
                    }

                    public final String toString() {
                        return "Subtle(background=" + this.background + ", icon=" + this.icon + ", text=" + this.text + ")";
                    }
                }

                public Destructive(Prominent prominent, Standard standard, Subtle subtle) {
                    this.prominent = prominent;
                    this.standard = standard;
                    this.subtle = subtle;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Destructive)) {
                        return false;
                    }
                    Destructive destructive = (Destructive) obj;
                    return this.prominent.equals(destructive.prominent) && this.standard.equals(destructive.standard) && this.subtle.equals(destructive.subtle);
                }

                public final Prominent getProminent() {
                    return this.prominent;
                }

                public final Standard getStandard() {
                    return this.standard;
                }

                public final Subtle getSubtle() {
                    return this.subtle;
                }

                public final int hashCode() {
                    return this.subtle.hashCode() + ((this.standard.hashCode() + (this.prominent.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "Destructive(prominent=" + this.prominent + ", standard=" + this.standard + ", subtle=" + this.subtle + ")";
                }
            }

            public final class Prominent {
                public final Background background;
                public final Icon icon;
                public final Text text;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f160default;
                    public final long disabled;
                    public final long pressed;
                    public final long ripple;

                    public Background(long j, long j2, long j3, long j4) {
                        this.f160default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                        this.ripple = j4;
                    }

                    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
                    public static Background m3113copyjRlVdoo$default(Background background, long j, long j2, long j3, int i) {
                        if ((i & 2) != 0) {
                            j2 = background.disabled;
                        }
                        long j4 = j2;
                        long j5 = (i & 4) != 0 ? background.pressed : j3;
                        long j6 = background.ripple;
                        background.getClass();
                        return new Background(j, j4, j5, j6);
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f160default, background.f160default) && Color.m676equalsimpl0(this.disabled, background.disabled) && Color.m676equalsimpl0(this.pressed, background.pressed) && Color.m676equalsimpl0(this.ripple, background.ripple);
                    }

                    /* renamed from: getRipple-0d7_KjU, reason: not valid java name */
                    public final long m3114getRipple0d7_KjU() {
                        return this.ripple;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.ripple) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f160default) * 31, 31, this.disabled), 31, this.pressed);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f160default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ", ripple=", Color.m682toStringimpl(this.ripple), ")");
                    }
                }

                public final class Icon {

                    /* renamed from: default, reason: not valid java name */
                    public final long f161default;
                    public final long disabled;

                    public Icon(long j, long j2) {
                        this.f161default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Icon)) {
                            return false;
                        }
                        Icon icon = (Icon) obj;
                        return Color.m676equalsimpl0(this.f161default, icon.f161default) && Color.m676equalsimpl0(this.disabled, icon.disabled);
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f161default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f161default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public final class Text {

                    /* renamed from: default, reason: not valid java name */
                    public final long f162default;
                    public final long disabled;
                    public final long pressed;

                    public Text(long j, long j2, long j3) {
                        this.f162default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                    }

                    /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
                    public static Text m3115copyysEtTa8$default(Text text, long j) {
                        long j2 = text.disabled;
                        long j3 = text.pressed;
                        text.getClass();
                        return new Text(j, j2, j3);
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Text)) {
                            return false;
                        }
                        Text text = (Text) obj;
                        return Color.m676equalsimpl0(this.f162default, text.f162default) && Color.m676equalsimpl0(this.disabled, text.disabled) && Color.m676equalsimpl0(this.pressed, text.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3116getDefault0d7_KjU() {
                        return this.f162default;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f162default) * 31, 31, this.disabled);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f162default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public Prominent(Background background, Icon icon, Text text) {
                    background.getClass();
                    icon.getClass();
                    text.getClass();
                    this.background = background;
                    this.icon = icon;
                    this.text = text;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Prominent)) {
                        return false;
                    }
                    Prominent prominent = (Prominent) obj;
                    return Intrinsics.areEqual(this.background, prominent.background) && Intrinsics.areEqual(this.icon, prominent.icon) && Intrinsics.areEqual(this.text, prominent.text);
                }

                public final Background getBackground() {
                    return this.background;
                }

                public final Text getText() {
                    return this.text;
                }

                public final int hashCode() {
                    return this.text.hashCode() + ((this.icon.hashCode() + (this.background.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "Prominent(background=" + this.background + ", icon=" + this.icon + ", text=" + this.text + ")";
                }
            }

            public final class Standard {
                public final Background background;
                public final Icon icon;
                public final Text text;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f163default;
                    public final long disabled;
                    public final long pressed;

                    public Background(long j, long j2, long j3) {
                        this.f163default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                    }

                    /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
                    public static Background m3117copyysEtTa8$default(Background background, long j, long j2, int i) {
                        long j3 = background.disabled;
                        if ((i & 4) != 0) {
                            j2 = background.pressed;
                        }
                        return new Background(j, j3, j2);
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f163default, background.f163default) && Color.m676equalsimpl0(this.disabled, background.disabled) && Color.m676equalsimpl0(this.pressed, background.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3118getDefault0d7_KjU() {
                        return this.f163default;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f163default) * 31, 31, this.disabled);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f163default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public final class Icon {

                    /* renamed from: default, reason: not valid java name */
                    public final long f164default;
                    public final long disabled;

                    public Icon(long j, long j2) {
                        this.f164default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Icon)) {
                            return false;
                        }
                        Icon icon = (Icon) obj;
                        return Color.m676equalsimpl0(this.f164default, icon.f164default) && Color.m676equalsimpl0(this.disabled, icon.disabled);
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f164default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f164default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public final class Text {

                    /* renamed from: default, reason: not valid java name */
                    public final long f165default;
                    public final long disabled;

                    public Text(long j, long j2) {
                        this.f165default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Text)) {
                            return false;
                        }
                        Text text = (Text) obj;
                        return Color.m676equalsimpl0(this.f165default, text.f165default) && Color.m676equalsimpl0(this.disabled, text.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3119getDefault0d7_KjU() {
                        return this.f165default;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f165default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f165default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Standard(Background background, Icon icon, Text text) {
                    this.background = background;
                    this.icon = icon;
                    this.text = text;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Standard)) {
                        return false;
                    }
                    Standard standard = (Standard) obj;
                    return this.background.equals(standard.background) && this.icon.equals(standard.icon) && this.text.equals(standard.text);
                }

                public final Background getBackground() {
                    return this.background;
                }

                public final Text getText() {
                    return this.text;
                }

                public final int hashCode() {
                    return this.text.hashCode() + ((this.icon.hashCode() + (this.background.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "Standard(background=" + this.background + ", icon=" + this.icon + ", text=" + this.text + ")";
                }
            }

            public final class Subtle {
                public final Background background;
                public final Icon icon;
                public final Text text;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f166default;
                    public final long pressed;

                    public Background(long j, long j2) {
                        this.f166default = j;
                        this.pressed = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f166default, background.f166default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + (Long.hashCode(this.f166default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f166default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public final class Icon {

                    /* renamed from: default, reason: not valid java name */
                    public final long f167default;
                    public final long disabled;
                    public final long pressed;

                    public Icon(long j, long j2, long j3) {
                        this.f167default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Icon)) {
                            return false;
                        }
                        Icon icon = (Icon) obj;
                        return Color.m676equalsimpl0(this.f167default, icon.f167default) && Color.m676equalsimpl0(this.disabled, icon.disabled) && Color.m676equalsimpl0(this.pressed, icon.pressed);
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f167default) * 31, 31, this.disabled);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f167default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Icon(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public final class Text {

                    /* renamed from: default, reason: not valid java name */
                    public final long f168default;
                    public final long disabled;
                    public final long pressed;

                    public Text(long j, long j2, long j3) {
                        this.f168default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Text)) {
                            return false;
                        }
                        Text text = (Text) obj;
                        return Color.m676equalsimpl0(this.f168default, text.f168default) && Color.m676equalsimpl0(this.disabled, text.disabled) && Color.m676equalsimpl0(this.pressed, text.pressed);
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f168default) * 31, 31, this.disabled);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f168default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public Subtle(Background background, Icon icon, Text text) {
                    this.background = background;
                    this.icon = icon;
                    this.text = text;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Subtle)) {
                        return false;
                    }
                    Subtle subtle = (Subtle) obj;
                    return this.background.equals(subtle.background) && this.icon.equals(subtle.icon) && this.text.equals(subtle.text);
                }

                public final Icon getIcon() {
                    return this.icon;
                }

                public final Text getText() {
                    return this.text;
                }

                public final int hashCode() {
                    return this.text.hashCode() + ((this.icon.hashCode() + (this.background.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "Subtle(background=" + this.background + ", icon=" + this.icon + ", text=" + this.text + ")";
                }
            }

            public Button(Destructive destructive, Prominent prominent, Standard standard, Subtle subtle) {
                this.destructive = destructive;
                this.prominent = prominent;
                this.standard = standard;
                this.subtle = subtle;
            }

            public static Button copy$default(Button button, Prominent prominent, Standard standard, int i) {
                Destructive destructive = button.destructive;
                if ((i & 2) != 0) {
                    prominent = button.prominent;
                }
                if ((i & 4) != 0) {
                    standard = button.standard;
                }
                Subtle subtle = button.subtle;
                button.getClass();
                return new Button(destructive, prominent, standard, subtle);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return this.destructive.equals(button.destructive) && this.prominent.equals(button.prominent) && this.standard.equals(button.standard) && this.subtle.equals(button.subtle);
            }

            public final Destructive getDestructive() {
                return this.destructive;
            }

            public final Prominent getProminent() {
                return this.prominent;
            }

            public final Standard getStandard() {
                return this.standard;
            }

            public final Subtle getSubtle() {
                return this.subtle;
            }

            public final int hashCode() {
                return this.subtle.hashCode() + ((this.standard.hashCode() + ((this.prominent.hashCode() + (this.destructive.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Button(destructive=" + this.destructive + ", prominent=" + this.prominent + ", standard=" + this.standard + ", subtle=" + this.subtle + ")";
            }
        }

        public final class Card {
            public final Background background;
            public final Border border;

            public final class Background {

                /* renamed from: default, reason: not valid java name */
                public final long f169default;
                public final long pressed;

                public Background(long j, long j2) {
                    this.f169default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) obj;
                    return Color.m676equalsimpl0(this.f169default, background.f169default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3120getDefault0d7_KjU() {
                    return this.f169default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3121getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f169default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f169default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public final class Border {

                /* renamed from: default, reason: not valid java name */
                public final long f170default;
                public final long pressed;

                public Border(long j, long j2) {
                    this.f170default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Border)) {
                        return false;
                    }
                    Border border = (Border) obj;
                    return Color.m676equalsimpl0(this.f170default, border.f170default) && Color.m676equalsimpl0(this.pressed, border.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3122getDefault0d7_KjU() {
                    return this.f170default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3123getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f170default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Border(default=", Color.m682toStringimpl(this.f170default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public Card(Background background, Border border) {
                this.background = background;
                this.border = border;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Card)) {
                    return false;
                }
                Card card = (Card) obj;
                return this.background.equals(card.background) && this.border.equals(card.border);
            }

            public final int hashCode() {
                return this.border.hashCode() + (this.background.hashCode() * 31);
            }

            public final String toString() {
                return "Card(background=" + this.background + ", border=" + this.border + ")";
            }
        }

        public final class Cell {
            public final Background background;
            public final Body body;
            public final Controls controls;
            public final Label label;

            public final class Background {

                /* renamed from: default, reason: not valid java name */
                public final long f171default;
                public final long pressed;

                public Background(long j, long j2) {
                    this.f171default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) obj;
                    return Color.m676equalsimpl0(this.f171default, background.f171default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3124getDefault0d7_KjU() {
                    return this.f171default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3125getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f171default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f171default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public final class Body {

                /* renamed from: default, reason: not valid java name */
                public final long f172default;
                public final long disabled;

                public Body(long j, long j2) {
                    this.f172default = j;
                    this.disabled = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Body)) {
                        return false;
                    }
                    Body body = (Body) obj;
                    return Color.m676equalsimpl0(this.f172default, body.f172default) && Color.m676equalsimpl0(this.disabled, body.disabled);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3126getDefault0d7_KjU() {
                    return this.f172default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3127getDisabled0d7_KjU() {
                    return this.disabled;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.disabled) + (Long.hashCode(this.f172default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Body(default=", Color.m682toStringimpl(this.f172default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                }
            }

            public final class Controls {
                public final ActivityAmount activityAmount;
                public final Icon icon;
                public final long text;

                public final class ActivityAmount {

                    /* renamed from: default, reason: not valid java name */
                    public final long f173default;
                    public final long pending;
                    public final long struckOut;

                    public ActivityAmount(long j, long j2, long j3) {
                        this.f173default = j;
                        this.pending = j2;
                        this.struckOut = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ActivityAmount)) {
                            return false;
                        }
                        ActivityAmount activityAmount = (ActivityAmount) obj;
                        return Color.m676equalsimpl0(this.f173default, activityAmount.f173default) && Color.m676equalsimpl0(this.pending, activityAmount.pending) && Color.m676equalsimpl0(this.struckOut, activityAmount.struckOut);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3129getDefault0d7_KjU() {
                        return this.f173default;
                    }

                    /* renamed from: getPending-0d7_KjU, reason: not valid java name */
                    public final long m3130getPending0d7_KjU() {
                        return this.pending;
                    }

                    /* renamed from: getStruckOut-0d7_KjU, reason: not valid java name */
                    public final long m3131getStruckOut0d7_KjU() {
                        return this.struckOut;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.struckOut) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f173default) * 31, 31, this.pending);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f173default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.pending);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivityAmount(default=", m682toStringimpl, ", pending=", m682toStringimpl2, ", struckOut="), Color.m682toStringimpl(this.struckOut), ")");
                    }
                }

                public final class Icon {

                    /* renamed from: default, reason: not valid java name */
                    public final long f174default;
                    public final long pressed;

                    public Icon(long j, long j2) {
                        this.f174default = j;
                        this.pressed = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Icon)) {
                            return false;
                        }
                        Icon icon = (Icon) obj;
                        return Color.m676equalsimpl0(this.f174default, icon.f174default) && Color.m676equalsimpl0(this.pressed, icon.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3132getDefault0d7_KjU() {
                        return this.f174default;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3133getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + (Long.hashCode(this.f174default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f174default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public Controls(ActivityAmount activityAmount, Icon icon, long j) {
                    this.activityAmount = activityAmount;
                    this.icon = icon;
                    this.text = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Controls)) {
                        return false;
                    }
                    Controls controls = (Controls) obj;
                    return this.activityAmount.equals(controls.activityAmount) && this.icon.equals(controls.icon) && Color.m676equalsimpl0(this.text, controls.text);
                }

                /* renamed from: getText-0d7_KjU, reason: not valid java name */
                public final long m3128getText0d7_KjU() {
                    return this.text;
                }

                public final int hashCode() {
                    int hashCode = (this.icon.hashCode() + (this.activityAmount.hashCode() * 31)) * 31;
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.text) + hashCode;
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.text);
                    StringBuilder sb = new StringBuilder("Controls(activityAmount=");
                    sb.append(this.activityAmount);
                    sb.append(", icon=");
                    sb.append(this.icon);
                    sb.append(", text=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl, ")");
                }
            }

            public final class Label {

                /* renamed from: default, reason: not valid java name */
                public final long f175default;
                public final long disabled;

                public Label(long j, long j2) {
                    this.f175default = j;
                    this.disabled = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Label)) {
                        return false;
                    }
                    Label label = (Label) obj;
                    return Color.m676equalsimpl0(this.f175default, label.f175default) && Color.m676equalsimpl0(this.disabled, label.disabled);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3134getDefault0d7_KjU() {
                    return this.f175default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3135getDisabled0d7_KjU() {
                    return this.disabled;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.disabled) + (Long.hashCode(this.f175default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Label(default=", Color.m682toStringimpl(this.f175default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                }
            }

            public Cell(Background background, Body body, Controls controls, Label label) {
                this.background = background;
                this.body = body;
                this.controls = controls;
                this.label = label;
            }

            public static Cell copy$default(Cell cell, Background background) {
                return new Cell(background, cell.body, cell.controls, cell.label);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Cell)) {
                    return false;
                }
                Cell cell = (Cell) obj;
                return this.background.equals(cell.background) && this.body.equals(cell.body) && this.controls.equals(cell.controls) && this.label.equals(cell.label);
            }

            public final Controls getControls() {
                return this.controls;
            }

            public final int hashCode() {
                return this.label.hashCode() + ((this.controls.hashCode() + ((this.body.hashCode() + (this.background.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Cell(background=" + this.background + ", body=" + this.body + ", controls=" + this.controls + ", label=" + this.label + ")";
            }
        }

        public final class Checkbox {
            public final Active active;
            public final Inactive inactive;

            public final class Active {
                public final Background background;
                public final Border border;
                public final long icon;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f176default;
                    public final long disabled;
                    public final long pressed;

                    public Background(long j, long j2, long j3) {
                        this.f176default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f176default, background.f176default) && Color.m676equalsimpl0(this.disabled, background.disabled) && Color.m676equalsimpl0(this.pressed, background.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3137getDefault0d7_KjU() {
                        return this.f176default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3138getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3139getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f176default) * 31, 31, this.disabled);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f176default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public final class Border {

                    /* renamed from: default, reason: not valid java name */
                    public final long f177default;

                    public Border(long j) {
                        this.f177default = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Border) && Color.m676equalsimpl0(this.f177default, ((Border) obj).f177default);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3140getDefault0d7_KjU() {
                        return this.f177default;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.f177default);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Border(default=", Color.m682toStringimpl(this.f177default), ")");
                    }
                }

                public Active(Background background, Border border, long j) {
                    this.background = background;
                    this.border = border;
                    this.icon = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Active)) {
                        return false;
                    }
                    Active active = (Active) obj;
                    return this.background.equals(active.background) && this.border.equals(active.border) && Color.m676equalsimpl0(this.icon, active.icon);
                }

                public final Border getBorder() {
                    return this.border;
                }

                /* renamed from: getIcon-0d7_KjU, reason: not valid java name */
                public final long m3136getIcon0d7_KjU() {
                    return this.icon;
                }

                public final int hashCode() {
                    int hashCode = (this.border.hashCode() + (this.background.hashCode() * 31)) * 31;
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.icon) + hashCode;
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.icon);
                    StringBuilder sb = new StringBuilder("Active(background=");
                    sb.append(this.background);
                    sb.append(", border=");
                    sb.append(this.border);
                    sb.append(", icon=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl, ")");
                }
            }

            public final class Inactive {
                public final Background background;
                public final Border border;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f178default;
                    public final long disabled;
                    public final long pressed;

                    public Background(long j, long j2, long j3) {
                        this.f178default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f178default, background.f178default) && Color.m676equalsimpl0(this.disabled, background.disabled) && Color.m676equalsimpl0(this.pressed, background.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3141getDefault0d7_KjU() {
                        return this.f178default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3142getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3143getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f178default) * 31, 31, this.disabled);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f178default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public final class Border {

                    /* renamed from: default, reason: not valid java name */
                    public final long f179default;
                    public final long disabled;

                    public Border(long j, long j2) {
                        this.f179default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Border)) {
                            return false;
                        }
                        Border border = (Border) obj;
                        return Color.m676equalsimpl0(this.f179default, border.f179default) && Color.m676equalsimpl0(this.disabled, border.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3144getDefault0d7_KjU() {
                        return this.f179default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3145getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f179default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Border(default=", Color.m682toStringimpl(this.f179default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Inactive(Background background, Border border) {
                    this.background = background;
                    this.border = border;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Inactive)) {
                        return false;
                    }
                    Inactive inactive = (Inactive) obj;
                    return this.background.equals(inactive.background) && this.border.equals(inactive.border);
                }

                public final int hashCode() {
                    return this.border.hashCode() + (this.background.hashCode() * 31);
                }

                public final String toString() {
                    return "Inactive(background=" + this.background + ", border=" + this.border + ")";
                }
            }

            public Checkbox(Active active, Inactive inactive) {
                this.active = active;
                this.inactive = inactive;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Checkbox)) {
                    return false;
                }
                Checkbox checkbox = (Checkbox) obj;
                return this.active.equals(checkbox.active) && this.inactive.equals(checkbox.inactive);
            }

            public final int hashCode() {
                return this.inactive.hashCode() + (this.active.hashCode() * 31);
            }

            public final String toString() {
                return "Checkbox(active=" + this.active + ", inactive=" + this.inactive + ")";
            }
        }

        public final class CopyCode {
            public final Background background;
            public final long icon;
            public final Success success;

            public final class Background {

                /* renamed from: default, reason: not valid java name */
                public final long f180default;
                public final long pressed;

                public Background(long j, long j2) {
                    this.f180default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) obj;
                    return Color.m676equalsimpl0(this.f180default, background.f180default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3147getDefault0d7_KjU() {
                    return this.f180default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3148getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f180default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f180default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public final class Success {
                public final long background;
                public final long border;
                public final long icon;

                public Success(long j, long j2, long j3) {
                    this.background = j;
                    this.border = j2;
                    this.icon = j3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Success)) {
                        return false;
                    }
                    Success success = (Success) obj;
                    return Color.m676equalsimpl0(this.background, success.background) && Color.m676equalsimpl0(this.border, success.border) && Color.m676equalsimpl0(this.icon, success.icon);
                }

                /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                public final long m3149getBackground0d7_KjU() {
                    return this.background;
                }

                /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                public final long m3150getBorder0d7_KjU() {
                    return this.border;
                }

                /* renamed from: getIcon-0d7_KjU, reason: not valid java name */
                public final long m3151getIcon0d7_KjU() {
                    return this.icon;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.icon) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.background) * 31, 31, this.border);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.background);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.border);
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(background=", m682toStringimpl, ", border=", m682toStringimpl2, ", icon="), Color.m682toStringimpl(this.icon), ")");
                }
            }

            public CopyCode(Background background, long j, Success success) {
                this.background = background;
                this.icon = j;
                this.success = success;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CopyCode)) {
                    return false;
                }
                CopyCode copyCode = (CopyCode) obj;
                return this.background.equals(copyCode.background) && Color.m676equalsimpl0(this.icon, copyCode.icon) && this.success.equals(copyCode.success);
            }

            /* renamed from: getIcon-0d7_KjU, reason: not valid java name */
            public final long m3146getIcon0d7_KjU() {
                return this.icon;
            }

            public final int hashCode() {
                int hashCode = this.background.hashCode() * 31;
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.success.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.icon);
            }

            public final String toString() {
                return "CopyCode(background=" + this.background + ", icon=" + Color.m682toStringimpl(this.icon) + ", success=" + this.success + ")";
            }
        }

        public final class FilterBar {
            public final Chip chip;

            public final class Chip {
                public final Background background;
                public final Icon icon;
                public final Text text;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f181default;
                    public final long disabled;
                    public final long pressed;
                    public final long selected;

                    public Background(long j, long j2, long j3, long j4) {
                        this.f181default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                        this.selected = j4;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f181default, background.f181default) && Color.m676equalsimpl0(this.disabled, background.disabled) && Color.m676equalsimpl0(this.pressed, background.pressed) && Color.m676equalsimpl0(this.selected, background.selected);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3152getDefault0d7_KjU() {
                        return this.f181default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3153getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3154getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                    public final long m3155getSelected0d7_KjU() {
                        return this.selected;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.selected) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f181default) * 31, 31, this.disabled), 31, this.pressed);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f181default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ", selected=", Color.m682toStringimpl(this.selected), ")");
                    }
                }

                public final class Icon {

                    /* renamed from: default, reason: not valid java name */
                    public final long f182default;
                    public final long disabled;

                    public Icon(long j, long j2) {
                        this.f182default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Icon)) {
                            return false;
                        }
                        Icon icon = (Icon) obj;
                        return Color.m676equalsimpl0(this.f182default, icon.f182default) && Color.m676equalsimpl0(this.disabled, icon.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3156getDefault0d7_KjU() {
                        return this.f182default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3157getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f182default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f182default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public final class Text {

                    /* renamed from: default, reason: not valid java name */
                    public final long f183default;
                    public final long disabled;

                    public Text(long j, long j2) {
                        this.f183default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Text)) {
                            return false;
                        }
                        Text text = (Text) obj;
                        return Color.m676equalsimpl0(this.f183default, text.f183default) && Color.m676equalsimpl0(this.disabled, text.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3158getDefault0d7_KjU() {
                        return this.f183default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3159getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f183default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f183default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Chip(Background background, Icon icon, Text text) {
                    this.background = background;
                    this.icon = icon;
                    this.text = text;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Chip)) {
                        return false;
                    }
                    Chip chip = (Chip) obj;
                    return this.background.equals(chip.background) && this.icon.equals(chip.icon) && this.text.equals(chip.text);
                }

                public final int hashCode() {
                    return this.text.hashCode() + ((this.icon.hashCode() + (this.background.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "Chip(background=" + this.background + ", icon=" + this.icon + ", text=" + this.text + ")";
                }
            }

            public FilterBar(Chip chip) {
                this.chip = chip;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FilterBar) && this.chip.equals(((FilterBar) obj).chip);
            }

            public final Chip getChip() {
                return this.chip;
            }

            public final int hashCode() {
                return this.chip.hashCode();
            }

            public final String toString() {
                return "FilterBar(chip=" + this.chip + ")";
            }
        }

        public final class HalfSheet {
            public final long background;

            public HalfSheet(long j) {
                this.background = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HalfSheet) && Color.m676equalsimpl0(this.background, ((HalfSheet) obj).background);
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3160getBackground0d7_KjU() {
                return this.background;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.background);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HalfSheet(background=", Color.m682toStringimpl(this.background), ")");
            }
        }

        public final class Header {
            public final long body;
            public final long icon;
            public final long title;

            public Header(long j, long j2, long j3) {
                this.body = j;
                this.icon = j2;
                this.title = j3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj;
                return Color.m676equalsimpl0(this.body, header.body) && Color.m676equalsimpl0(this.icon, header.icon) && Color.m676equalsimpl0(this.title, header.title);
            }

            /* renamed from: getBody-0d7_KjU, reason: not valid java name */
            public final long m3161getBody0d7_KjU() {
                return this.body;
            }

            /* renamed from: getIcon-0d7_KjU, reason: not valid java name */
            public final long m3162getIcon0d7_KjU() {
                return this.icon;
            }

            /* renamed from: getTitle-0d7_KjU, reason: not valid java name */
            public final long m3163getTitle0d7_KjU() {
                return this.title;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.title) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.body) * 31, 31, this.icon);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.body);
                String m682toStringimpl2 = Color.m682toStringimpl(this.icon);
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header(body=", m682toStringimpl, ", icon=", m682toStringimpl2, ", title="), Color.m682toStringimpl(this.title), ")");
            }
        }

        public final class Input {
            public final Background background;
            public final Border border;
            public final Checkbox checkbox;
            public final Chip chip;
            public final long cursor;
            public final Helper helper;
            public final Icon icon;
            public final Label label;
            public final Radio radio;
            public final Text text;

            public final class Background {

                /* renamed from: default, reason: not valid java name */
                public final long f184default;
                public final long pressed;
                public final Selected selected;

                public final class Selected {

                    /* renamed from: default, reason: not valid java name */
                    public final long f185default;
                    public final long pressed;

                    public Selected(long j, long j2) {
                        this.f185default = j;
                        this.pressed = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Selected)) {
                            return false;
                        }
                        Selected selected = (Selected) obj;
                        return Color.m676equalsimpl0(this.f185default, selected.f185default) && Color.m676equalsimpl0(this.pressed, selected.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3167getDefault0d7_KjU() {
                        return this.f185default;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3168getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + (Long.hashCode(this.f185default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Selected(default=", Color.m682toStringimpl(this.f185default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public Background(long j, long j2, Selected selected) {
                    this.f184default = j;
                    this.pressed = j2;
                    this.selected = selected;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) obj;
                    return Color.m676equalsimpl0(this.f184default, background.f184default) && Color.m676equalsimpl0(this.pressed, background.pressed) && this.selected.equals(background.selected);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3165getDefault0d7_KjU() {
                    return this.f184default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3166getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return this.selected.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f184default) * 31, 31, this.pressed);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", Color.m682toStringimpl(this.f184default), ", pressed=", Color.m682toStringimpl(this.pressed), ", selected=");
                    m.append(this.selected);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class Border {

                /* renamed from: default, reason: not valid java name */
                public final long f186default;
                public final long disabled;
                public final long error;
                public final long selected;

                public Border(long j, long j2, long j3, long j4) {
                    this.f186default = j;
                    this.disabled = j2;
                    this.error = j3;
                    this.selected = j4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Border)) {
                        return false;
                    }
                    Border border = (Border) obj;
                    return Color.m676equalsimpl0(this.f186default, border.f186default) && Color.m676equalsimpl0(this.disabled, border.disabled) && Color.m676equalsimpl0(this.error, border.error) && Color.m676equalsimpl0(this.selected, border.selected);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3169getDefault0d7_KjU() {
                    return this.f186default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3170getDisabled0d7_KjU() {
                    return this.disabled;
                }

                /* renamed from: getError-0d7_KjU, reason: not valid java name */
                public final long m3171getError0d7_KjU() {
                    return this.error;
                }

                /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                public final long m3172getSelected0d7_KjU() {
                    return this.selected;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.selected) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f186default) * 31, 31, this.disabled), 31, this.error);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.f186default);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Border(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", error="), Color.m682toStringimpl(this.error), ", selected=", Color.m682toStringimpl(this.selected), ")");
                }
            }

            public final class Checkbox {
                public final Inactive inactive;

                public final class Inactive {
                    public final Border border;

                    public final class Border {

                        /* renamed from: default, reason: not valid java name */
                        public final long f187default;

                        public Border(long j) {
                            this.f187default = j;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Border) && Color.m676equalsimpl0(this.f187default, ((Border) obj).f187default);
                        }

                        /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                        public final long m3173getDefault0d7_KjU() {
                            return this.f187default;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.f187default);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Border(default=", Color.m682toStringimpl(this.f187default), ")");
                        }
                    }

                    public Inactive(Border border) {
                        this.border = border;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Inactive) && this.border.equals(((Inactive) obj).border);
                    }

                    public final Border getBorder() {
                        return this.border;
                    }

                    public final int hashCode() {
                        return this.border.hashCode();
                    }

                    public final String toString() {
                        return "Inactive(border=" + this.border + ")";
                    }
                }

                public Checkbox(Inactive inactive) {
                    this.inactive = inactive;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Checkbox) && this.inactive.equals(((Checkbox) obj).inactive);
                }

                public final Inactive getInactive() {
                    return this.inactive;
                }

                public final int hashCode() {
                    return this.inactive.border.hashCode();
                }

                public final String toString() {
                    return "Checkbox(inactive=" + this.inactive + ")";
                }
            }

            public final class Chip {
                public final Icon icon;

                public final class Icon {

                    /* renamed from: default, reason: not valid java name */
                    public final long f188default;
                    public final long disabled;

                    public Icon(long j, long j2) {
                        this.f188default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Icon)) {
                            return false;
                        }
                        Icon icon = (Icon) obj;
                        return Color.m676equalsimpl0(this.f188default, icon.f188default) && Color.m676equalsimpl0(this.disabled, icon.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3174getDefault0d7_KjU() {
                        return this.f188default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3175getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f188default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f188default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Chip(Icon icon) {
                    this.icon = icon;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Chip) && this.icon.equals(((Chip) obj).icon);
                }

                public final int hashCode() {
                    return this.icon.hashCode();
                }

                public final String toString() {
                    return "Chip(icon=" + this.icon + ")";
                }
            }

            public final class Helper {
                public final long icon;
                public final Text text;

                public final class Text {

                    /* renamed from: default, reason: not valid java name */
                    public final long f189default;
                    public final long error;

                    public Text(long j, long j2) {
                        this.f189default = j;
                        this.error = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Text)) {
                            return false;
                        }
                        Text text = (Text) obj;
                        return Color.m676equalsimpl0(this.f189default, text.f189default) && Color.m676equalsimpl0(this.error, text.error);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3177getDefault0d7_KjU() {
                        return this.f189default;
                    }

                    /* renamed from: getError-0d7_KjU, reason: not valid java name */
                    public final long m3178getError0d7_KjU() {
                        return this.error;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.error) + (Long.hashCode(this.f189default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f189default), ", error=", Color.m682toStringimpl(this.error), ")");
                    }
                }

                public Helper(long j, Text text) {
                    this.icon = j;
                    this.text = text;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Helper)) {
                        return false;
                    }
                    Helper helper = (Helper) obj;
                    return Color.m676equalsimpl0(this.icon, helper.icon) && this.text.equals(helper.text);
                }

                /* renamed from: getIcon-0d7_KjU, reason: not valid java name */
                public final long m3176getIcon0d7_KjU() {
                    return this.icon;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return this.text.hashCode() + (Long.hashCode(this.icon) * 31);
                }

                public final String toString() {
                    return "Helper(icon=" + Color.m682toStringimpl(this.icon) + ", text=" + this.text + ")";
                }
            }

            public final class Icon {

                /* renamed from: default, reason: not valid java name */
                public final long f190default;
                public final long disabled;
                public final long error;
                public final Leading leading;
                public final long pressed;
                public final Trailing trailing;

                public final class Leading {

                    /* renamed from: default, reason: not valid java name */
                    public final long f191default;
                    public final long disabled;
                    public final long pressed;

                    public Leading(long j, long j2, long j3) {
                        this.f191default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Leading)) {
                            return false;
                        }
                        Leading leading = (Leading) obj;
                        return Color.m676equalsimpl0(this.f191default, leading.f191default) && Color.m676equalsimpl0(this.disabled, leading.disabled) && Color.m676equalsimpl0(this.pressed, leading.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3183getDefault0d7_KjU() {
                        return this.f191default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3184getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3185getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f191default) * 31, 31, this.disabled);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f191default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Leading(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public final class Trailing {

                    /* renamed from: default, reason: not valid java name */
                    public final long f192default;
                    public final long disabled;
                    public final long error;
                    public final long pressed;

                    public Trailing(long j, long j2, long j3, long j4) {
                        this.f192default = j;
                        this.disabled = j2;
                        this.error = j3;
                        this.pressed = j4;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Trailing)) {
                            return false;
                        }
                        Trailing trailing = (Trailing) obj;
                        return Color.m676equalsimpl0(this.f192default, trailing.f192default) && Color.m676equalsimpl0(this.disabled, trailing.disabled) && Color.m676equalsimpl0(this.error, trailing.error) && Color.m676equalsimpl0(this.pressed, trailing.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3186getDefault0d7_KjU() {
                        return this.f192default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3187getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    /* renamed from: getError-0d7_KjU, reason: not valid java name */
                    public final long m3188getError0d7_KjU() {
                        return this.error;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3189getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f192default) * 31, 31, this.disabled), 31, this.error);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f192default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Trailing(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", error="), Color.m682toStringimpl(this.error), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public Icon(long j, long j2, long j3, Leading leading, long j4, Trailing trailing) {
                    this.f190default = j;
                    this.disabled = j2;
                    this.error = j3;
                    this.leading = leading;
                    this.pressed = j4;
                    this.trailing = trailing;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Icon)) {
                        return false;
                    }
                    Icon icon = (Icon) obj;
                    return Color.m676equalsimpl0(this.f190default, icon.f190default) && Color.m676equalsimpl0(this.disabled, icon.disabled) && Color.m676equalsimpl0(this.error, icon.error) && this.leading.equals(icon.leading) && Color.m676equalsimpl0(this.pressed, icon.pressed) && this.trailing.equals(icon.trailing);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3179getDefault0d7_KjU() {
                    return this.f190default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3180getDisabled0d7_KjU() {
                    return this.disabled;
                }

                /* renamed from: getError-0d7_KjU, reason: not valid java name */
                public final long m3181getError0d7_KjU() {
                    return this.error;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3182getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return this.trailing.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.leading.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f190default) * 31, 31, this.disabled), 31, this.error)) * 31, 31, this.pressed);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.f190default);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                    String m682toStringimpl3 = Color.m682toStringimpl(this.error);
                    String m682toStringimpl4 = Color.m682toStringimpl(this.pressed);
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Icon(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", error=");
                    m.append(m682toStringimpl3);
                    m.append(", leading=");
                    m.append(this.leading);
                    m.append(", pressed=");
                    m.append(m682toStringimpl4);
                    m.append(", trailing=");
                    m.append(this.trailing);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class Label {

                /* renamed from: default, reason: not valid java name */
                public final long f193default;
                public final long disabled;

                public Label(long j, long j2) {
                    this.f193default = j;
                    this.disabled = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Label)) {
                        return false;
                    }
                    Label label = (Label) obj;
                    return Color.m676equalsimpl0(this.f193default, label.f193default) && Color.m676equalsimpl0(this.disabled, label.disabled);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3190getDefault0d7_KjU() {
                    return this.f193default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3191getDisabled0d7_KjU() {
                    return this.disabled;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.disabled) + (Long.hashCode(this.f193default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Label(default=", Color.m682toStringimpl(this.f193default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                }
            }

            public final class Radio {
                public final Inactive inactive;

                public final class Inactive {
                    public final Border border;

                    public final class Border {

                        /* renamed from: default, reason: not valid java name */
                        public final long f194default;

                        public Border(long j) {
                            this.f194default = j;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Border) && Color.m676equalsimpl0(this.f194default, ((Border) obj).f194default);
                        }

                        /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                        public final long m3192getDefault0d7_KjU() {
                            return this.f194default;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.f194default);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Border(default=", Color.m682toStringimpl(this.f194default), ")");
                        }
                    }

                    public Inactive(Border border) {
                        this.border = border;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Inactive) && this.border.equals(((Inactive) obj).border);
                    }

                    public final Border getBorder() {
                        return this.border;
                    }

                    public final int hashCode() {
                        return this.border.hashCode();
                    }

                    public final String toString() {
                        return "Inactive(border=" + this.border + ")";
                    }
                }

                public Radio(Inactive inactive) {
                    this.inactive = inactive;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Radio) && this.inactive.equals(((Radio) obj).inactive);
                }

                public final Inactive getInactive() {
                    return this.inactive;
                }

                public final int hashCode() {
                    return this.inactive.border.hashCode();
                }

                public final String toString() {
                    return "Radio(inactive=" + this.inactive + ")";
                }
            }

            public final class Text {

                /* renamed from: default, reason: not valid java name */
                public final long f195default;
                public final long disabled;
                public final long placeholder;

                public Text(long j, long j2, long j3) {
                    this.f195default = j;
                    this.disabled = j2;
                    this.placeholder = j3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) obj;
                    return Color.m676equalsimpl0(this.f195default, text.f195default) && Color.m676equalsimpl0(this.disabled, text.disabled) && Color.m676equalsimpl0(this.placeholder, text.placeholder);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3193getDefault0d7_KjU() {
                    return this.f195default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3194getDisabled0d7_KjU() {
                    return this.disabled;
                }

                /* renamed from: getPlaceholder-0d7_KjU, reason: not valid java name */
                public final long m3195getPlaceholder0d7_KjU() {
                    return this.placeholder;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.placeholder) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f195default) * 31, 31, this.disabled);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.f195default);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", placeholder="), Color.m682toStringimpl(this.placeholder), ")");
                }
            }

            public Input(Background background, Border border, Checkbox checkbox, Chip chip, long j, Helper helper, Icon icon, Label label, Radio radio, Text text) {
                this.background = background;
                this.border = border;
                this.checkbox = checkbox;
                this.chip = chip;
                this.cursor = j;
                this.helper = helper;
                this.icon = icon;
                this.label = label;
                this.radio = radio;
                this.text = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Input)) {
                    return false;
                }
                Input input = (Input) obj;
                return this.background.equals(input.background) && this.border.equals(input.border) && this.checkbox.equals(input.checkbox) && this.chip.equals(input.chip) && Color.m676equalsimpl0(this.cursor, input.cursor) && this.helper.equals(input.helper) && this.icon.equals(input.icon) && this.label.equals(input.label) && this.radio.equals(input.radio) && this.text.equals(input.text);
            }

            public final Checkbox getCheckbox() {
                return this.checkbox;
            }

            /* renamed from: getCursor-0d7_KjU, reason: not valid java name */
            public final long m3164getCursor0d7_KjU() {
                return this.cursor;
            }

            public final Icon getIcon() {
                return this.icon;
            }

            public final Radio getRadio() {
                return this.radio;
            }

            public final int hashCode() {
                int hashCode = (this.chip.icon.hashCode() + ((this.checkbox.hashCode() + ((this.border.hashCode() + (this.background.hashCode() * 31)) * 31)) * 31)) * 31;
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.text.hashCode() + ((this.radio.hashCode() + ((this.label.hashCode() + ((this.icon.hashCode() + ((this.helper.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.cursor)) * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Input(background=" + this.background + ", border=" + this.border + ", checkbox=" + this.checkbox + ", chip=" + this.chip + ", cursor=" + Color.m682toStringimpl(this.cursor) + ", helper=" + this.helper + ", icon=" + this.icon + ", label=" + this.label + ", radio=" + this.radio + ", text=" + this.text + ")";
            }
        }

        public final class Modal {
            public final long background;
            public final Button button;

            public final class Button {
                public final Destructive destructive;
                public final Primary primary;
                public final Secondary secondary;

                public final class Destructive {
                    public final Background background;
                    public final Text text;

                    public final class Background {
                        public final long pressed;

                        public Background(long j) {
                            this.pressed = j;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Background) && Color.m676equalsimpl0(this.pressed, ((Background) obj).pressed);
                        }

                        /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                        public final long m3197getPressed0d7_KjU() {
                            return this.pressed;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(pressed=", Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public final class Text {

                        /* renamed from: default, reason: not valid java name */
                        public final long f196default;
                        public final long disabled;
                        public final long pressed;

                        public Text(long j, long j2, long j3) {
                            this.f196default = j;
                            this.disabled = j2;
                            this.pressed = j3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Text)) {
                                return false;
                            }
                            Text text = (Text) obj;
                            return Color.m676equalsimpl0(this.f196default, text.f196default) && Color.m676equalsimpl0(this.disabled, text.disabled) && Color.m676equalsimpl0(this.pressed, text.pressed);
                        }

                        /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                        public final long m3198getDefault0d7_KjU() {
                            return this.f196default;
                        }

                        /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                        public final long m3199getDisabled0d7_KjU() {
                            return this.disabled;
                        }

                        /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                        public final long m3200getPressed0d7_KjU() {
                            return this.pressed;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f196default) * 31, 31, this.disabled);
                        }

                        public final String toString() {
                            String m682toStringimpl = Color.m682toStringimpl(this.f196default);
                            String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public Destructive(Background background, Text text) {
                        this.background = background;
                        this.text = text;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Destructive)) {
                            return false;
                        }
                        Destructive destructive = (Destructive) obj;
                        return this.background.equals(destructive.background) && this.text.equals(destructive.text);
                    }

                    public final Background getBackground() {
                        return this.background;
                    }

                    public final int hashCode() {
                        return this.text.hashCode() + (this.background.hashCode() * 31);
                    }

                    public final String toString() {
                        return "Destructive(background=" + this.background + ", text=" + this.text + ")";
                    }
                }

                public final class Primary {
                    public final Background background;
                    public final Destructive destructive;
                    public final Text text;

                    public final class Background {
                        public final long pressed;

                        public Background(long j) {
                            this.pressed = j;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Background) && Color.m676equalsimpl0(this.pressed, ((Background) obj).pressed);
                        }

                        /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                        public final long m3201getPressed0d7_KjU() {
                            return this.pressed;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(pressed=", Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public final class Destructive {
                        public final Text text;

                        public final class Text {

                            /* renamed from: default, reason: not valid java name */
                            public final long f197default;
                            public final long disabled;
                            public final long pressed;

                            public Text(long j, long j2, long j3) {
                                this.f197default = j;
                                this.disabled = j2;
                                this.pressed = j3;
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof Text)) {
                                    return false;
                                }
                                Text text = (Text) obj;
                                return Color.m676equalsimpl0(this.f197default, text.f197default) && Color.m676equalsimpl0(this.disabled, text.disabled) && Color.m676equalsimpl0(this.pressed, text.pressed);
                            }

                            /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                            public final long m3202getDefault0d7_KjU() {
                                return this.f197default;
                            }

                            /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                            public final long m3203getDisabled0d7_KjU() {
                                return this.disabled;
                            }

                            /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                            public final long m3204getPressed0d7_KjU() {
                                return this.pressed;
                            }

                            public final int hashCode() {
                                int i = Color.$r8$clinit;
                                ULong.Companion companion = ULong.Companion;
                                return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f197default) * 31, 31, this.disabled);
                            }

                            public final String toString() {
                                String m682toStringimpl = Color.m682toStringimpl(this.f197default);
                                String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                            }
                        }

                        public Destructive(Text text) {
                            this.text = text;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Destructive) && this.text.equals(((Destructive) obj).text);
                        }

                        public final int hashCode() {
                            return this.text.hashCode();
                        }

                        public final String toString() {
                            return "Destructive(text=" + this.text + ")";
                        }
                    }

                    public final class Text {

                        /* renamed from: default, reason: not valid java name */
                        public final long f198default;
                        public final long disabled;

                        public Text(long j, long j2) {
                            this.f198default = j;
                            this.disabled = j2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Text)) {
                                return false;
                            }
                            Text text = (Text) obj;
                            return Color.m676equalsimpl0(this.f198default, text.f198default) && Color.m676equalsimpl0(this.disabled, text.disabled);
                        }

                        /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                        public final long m3205getDefault0d7_KjU() {
                            return this.f198default;
                        }

                        /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                        public final long m3206getDisabled0d7_KjU() {
                            return this.disabled;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.disabled) + (Long.hashCode(this.f198default) * 31);
                        }

                        public final String toString() {
                            return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f198default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                        }
                    }

                    public Primary(Background background, Destructive destructive, Text text) {
                        this.background = background;
                        this.destructive = destructive;
                        this.text = text;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Primary)) {
                            return false;
                        }
                        Primary primary = (Primary) obj;
                        return this.background.equals(primary.background) && this.destructive.equals(primary.destructive) && this.text.equals(primary.text);
                    }

                    public final Background getBackground() {
                        return this.background;
                    }

                    public final int hashCode() {
                        return this.text.hashCode() + ((this.destructive.text.hashCode() + (this.background.hashCode() * 31)) * 31);
                    }

                    public final String toString() {
                        return "Primary(background=" + this.background + ", destructive=" + this.destructive + ", text=" + this.text + ")";
                    }
                }

                public final class Secondary {
                    public final Background background;
                    public final Text text;

                    public final class Background {
                        public final long pressed;

                        public Background(long j) {
                            this.pressed = j;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Background) && Color.m676equalsimpl0(this.pressed, ((Background) obj).pressed);
                        }

                        /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                        public final long m3207getPressed0d7_KjU() {
                            return this.pressed;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(pressed=", Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public final class Text {

                        /* renamed from: default, reason: not valid java name */
                        public final long f199default;
                        public final long disabled;

                        public Text(long j, long j2) {
                            this.f199default = j;
                            this.disabled = j2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Text)) {
                                return false;
                            }
                            Text text = (Text) obj;
                            return Color.m676equalsimpl0(this.f199default, text.f199default) && Color.m676equalsimpl0(this.disabled, text.disabled);
                        }

                        /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                        public final long m3208getDefault0d7_KjU() {
                            return this.f199default;
                        }

                        /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                        public final long m3209getDisabled0d7_KjU() {
                            return this.disabled;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.disabled) + (Long.hashCode(this.f199default) * 31);
                        }

                        public final String toString() {
                            return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f199default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                        }
                    }

                    public Secondary(Background background, Text text) {
                        this.background = background;
                        this.text = text;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Secondary)) {
                            return false;
                        }
                        Secondary secondary = (Secondary) obj;
                        return this.background.equals(secondary.background) && this.text.equals(secondary.text);
                    }

                    public final Background getBackground() {
                        return this.background;
                    }

                    public final int hashCode() {
                        return this.text.hashCode() + (this.background.hashCode() * 31);
                    }

                    public final String toString() {
                        return "Secondary(background=" + this.background + ", text=" + this.text + ")";
                    }
                }

                public Button(Destructive destructive, Primary primary, Secondary secondary) {
                    this.destructive = destructive;
                    this.primary = primary;
                    this.secondary = secondary;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return this.destructive.equals(button.destructive) && this.primary.equals(button.primary) && this.secondary.equals(button.secondary);
                }

                public final Primary getPrimary() {
                    return this.primary;
                }

                public final int hashCode() {
                    return this.secondary.hashCode() + ((this.primary.hashCode() + (this.destructive.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "Button(destructive=" + this.destructive + ", primary=" + this.primary + ", secondary=" + this.secondary + ")";
                }
            }

            public Modal(long j, Button button) {
                this.background = j;
                this.button = button;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Modal)) {
                    return false;
                }
                Modal modal = (Modal) obj;
                return Color.m676equalsimpl0(this.background, modal.background) && this.button.equals(modal.button);
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3196getBackground0d7_KjU() {
                return this.background;
            }

            public final Button getButton() {
                return this.button;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.button.hashCode() + (Long.hashCode(this.background) * 31);
            }

            public final String toString() {
                return "Modal(background=" + Color.m682toStringimpl(this.background) + ", button=" + this.button + ")";
            }
        }

        public final class OptionCard {
            public final Background background;
            public final Body body;
            public final Border border;
            public final Label label;

            public final class Background {

                /* renamed from: default, reason: not valid java name */
                public final long f200default;
                public final long pressed;

                public Background(long j, long j2) {
                    this.f200default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) obj;
                    return Color.m676equalsimpl0(this.f200default, background.f200default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3210getDefault0d7_KjU() {
                    return this.f200default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3211getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f200default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f200default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public final class Body {

                /* renamed from: default, reason: not valid java name */
                public final long f201default;
                public final long disabled;

                public Body(long j, long j2) {
                    this.f201default = j;
                    this.disabled = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Body)) {
                        return false;
                    }
                    Body body = (Body) obj;
                    return Color.m676equalsimpl0(this.f201default, body.f201default) && Color.m676equalsimpl0(this.disabled, body.disabled);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3212getDefault0d7_KjU() {
                    return this.f201default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3213getDisabled0d7_KjU() {
                    return this.disabled;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.disabled) + (Long.hashCode(this.f201default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Body(default=", Color.m682toStringimpl(this.f201default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                }
            }

            public final class Border {

                /* renamed from: default, reason: not valid java name */
                public final long f202default;
                public final Selected selected;

                public final class Selected {

                    /* renamed from: default, reason: not valid java name */
                    public final long f203default;
                    public final long disabled;
                    public final long pressed;

                    public Selected(long j, long j2, long j3) {
                        this.f203default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Selected)) {
                            return false;
                        }
                        Selected selected = (Selected) obj;
                        return Color.m676equalsimpl0(this.f203default, selected.f203default) && Color.m676equalsimpl0(this.disabled, selected.disabled) && Color.m676equalsimpl0(this.pressed, selected.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3215getDefault0d7_KjU() {
                        return this.f203default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3216getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3217getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f203default) * 31, 31, this.disabled);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f203default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Selected(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public Border(long j, Selected selected) {
                    this.f202default = j;
                    this.selected = selected;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Border)) {
                        return false;
                    }
                    Border border = (Border) obj;
                    return Color.m676equalsimpl0(this.f202default, border.f202default) && this.selected.equals(border.selected);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3214getDefault0d7_KjU() {
                    return this.f202default;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return this.selected.hashCode() + (Long.hashCode(this.f202default) * 31);
                }

                public final String toString() {
                    return "Border(default=" + Color.m682toStringimpl(this.f202default) + ", selected=" + this.selected + ")";
                }
            }

            public final class Label {

                /* renamed from: default, reason: not valid java name */
                public final long f204default;
                public final long disabled;

                public Label(long j, long j2) {
                    this.f204default = j;
                    this.disabled = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Label)) {
                        return false;
                    }
                    Label label = (Label) obj;
                    return Color.m676equalsimpl0(this.f204default, label.f204default) && Color.m676equalsimpl0(this.disabled, label.disabled);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3218getDefault0d7_KjU() {
                    return this.f204default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3219getDisabled0d7_KjU() {
                    return this.disabled;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.disabled) + (Long.hashCode(this.f204default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Label(default=", Color.m682toStringimpl(this.f204default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                }
            }

            public OptionCard(Background background, Body body, Border border, Label label) {
                this.background = background;
                this.body = body;
                this.border = border;
                this.label = label;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OptionCard)) {
                    return false;
                }
                OptionCard optionCard = (OptionCard) obj;
                return this.background.equals(optionCard.background) && this.body.equals(optionCard.body) && this.border.equals(optionCard.border) && this.label.equals(optionCard.label);
            }

            public final int hashCode() {
                return this.label.hashCode() + ((this.border.hashCode() + ((this.body.hashCode() + (this.background.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "OptionCard(background=" + this.background + ", body=" + this.body + ", border=" + this.border + ", label=" + this.label + ")";
            }
        }

        public final class OptionChip {
            public final Background background;
            public final Border border;
            public final Icon icon;
            public final Text text;

            public final class Background {

                /* renamed from: default, reason: not valid java name */
                public final long f205default;
                public final long pressed;

                public Background(long j, long j2) {
                    this.f205default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) obj;
                    return Color.m676equalsimpl0(this.f205default, background.f205default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3220getDefault0d7_KjU() {
                    return this.f205default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3221getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f205default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f205default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public final class Border {

                /* renamed from: default, reason: not valid java name */
                public final long f206default;
                public final long disabled;
                public final long selected;

                public Border(long j, long j2, long j3) {
                    this.f206default = j;
                    this.disabled = j2;
                    this.selected = j3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Border)) {
                        return false;
                    }
                    Border border = (Border) obj;
                    return Color.m676equalsimpl0(this.f206default, border.f206default) && Color.m676equalsimpl0(this.disabled, border.disabled) && Color.m676equalsimpl0(this.selected, border.selected);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3222getDefault0d7_KjU() {
                    return this.f206default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3223getDisabled0d7_KjU() {
                    return this.disabled;
                }

                /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                public final long m3224getSelected0d7_KjU() {
                    return this.selected;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.selected) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f206default) * 31, 31, this.disabled);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.f206default);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Border(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", selected="), Color.m682toStringimpl(this.selected), ")");
                }
            }

            public final class Icon {

                /* renamed from: default, reason: not valid java name */
                public final long f207default;
                public final long disabled;

                public Icon(long j, long j2) {
                    this.f207default = j;
                    this.disabled = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Icon)) {
                        return false;
                    }
                    Icon icon = (Icon) obj;
                    return Color.m676equalsimpl0(this.f207default, icon.f207default) && Color.m676equalsimpl0(this.disabled, icon.disabled);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3225getDefault0d7_KjU() {
                    return this.f207default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3226getDisabled0d7_KjU() {
                    return this.disabled;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.disabled) + (Long.hashCode(this.f207default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f207default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                }
            }

            public final class Text {

                /* renamed from: default, reason: not valid java name */
                public final long f208default;
                public final long disabled;

                public Text(long j, long j2) {
                    this.f208default = j;
                    this.disabled = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) obj;
                    return Color.m676equalsimpl0(this.f208default, text.f208default) && Color.m676equalsimpl0(this.disabled, text.disabled);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3227getDefault0d7_KjU() {
                    return this.f208default;
                }

                /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                public final long m3228getDisabled0d7_KjU() {
                    return this.disabled;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.disabled) + (Long.hashCode(this.f208default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f208default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                }
            }

            public OptionChip(Background background, Border border, Icon icon, Text text) {
                this.background = background;
                this.border = border;
                this.icon = icon;
                this.text = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OptionChip)) {
                    return false;
                }
                OptionChip optionChip = (OptionChip) obj;
                return this.background.equals(optionChip.background) && this.border.equals(optionChip.border) && this.icon.equals(optionChip.icon) && this.text.equals(optionChip.text);
            }

            public final int hashCode() {
                return this.text.hashCode() + ((this.icon.hashCode() + ((this.border.hashCode() + (this.background.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "OptionChip(background=" + this.background + ", border=" + this.border + ", icon=" + this.icon + ", text=" + this.text + ")";
            }
        }

        public final class Radio {
            public final Active active;
            public final Inactive inactive;

            public final class Active {
                public final Background background;
                public final Border border;

                public final class Background {
                    public final long pressed;

                    public Background(long j) {
                        this.pressed = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Background) && Color.m676equalsimpl0(this.pressed, ((Background) obj).pressed);
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3229getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(pressed=", Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public final class Border {

                    /* renamed from: default, reason: not valid java name */
                    public final long f209default;
                    public final long disabled;

                    public Border(long j, long j2) {
                        this.f209default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Border)) {
                            return false;
                        }
                        Border border = (Border) obj;
                        return Color.m676equalsimpl0(this.f209default, border.f209default) && Color.m676equalsimpl0(this.disabled, border.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3230getDefault0d7_KjU() {
                        return this.f209default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3231getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f209default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Border(default=", Color.m682toStringimpl(this.f209default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Active(Background background, Border border) {
                    this.background = background;
                    this.border = border;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Active)) {
                        return false;
                    }
                    Active active = (Active) obj;
                    return this.background.equals(active.background) && this.border.equals(active.border);
                }

                public final Background getBackground() {
                    return this.background;
                }

                public final int hashCode() {
                    return this.border.hashCode() + (this.background.hashCode() * 31);
                }

                public final String toString() {
                    return "Active(background=" + this.background + ", border=" + this.border + ")";
                }
            }

            public final class Inactive {
                public final Background background;
                public final Border border;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f210default;
                    public final long disabled;
                    public final long pressed;

                    public Background(long j, long j2, long j3) {
                        this.f210default = j;
                        this.disabled = j2;
                        this.pressed = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f210default, background.f210default) && Color.m676equalsimpl0(this.disabled, background.disabled) && Color.m676equalsimpl0(this.pressed, background.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3232getDefault0d7_KjU() {
                        return this.f210default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3233getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3234getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f210default) * 31, 31, this.disabled);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.f210default);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public final class Border {

                    /* renamed from: default, reason: not valid java name */
                    public final long f211default;
                    public final long disabled;

                    public Border(long j, long j2) {
                        this.f211default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Border)) {
                            return false;
                        }
                        Border border = (Border) obj;
                        return Color.m676equalsimpl0(this.f211default, border.f211default) && Color.m676equalsimpl0(this.disabled, border.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3235getDefault0d7_KjU() {
                        return this.f211default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3236getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f211default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Border(default=", Color.m682toStringimpl(this.f211default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Inactive(Background background, Border border) {
                    this.background = background;
                    this.border = border;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Inactive)) {
                        return false;
                    }
                    Inactive inactive = (Inactive) obj;
                    return this.background.equals(inactive.background) && this.border.equals(inactive.border);
                }

                public final int hashCode() {
                    return this.border.hashCode() + (this.background.hashCode() * 31);
                }

                public final String toString() {
                    return "Inactive(background=" + this.background + ", border=" + this.border + ")";
                }
            }

            public Radio(Active active, Inactive inactive) {
                this.active = active;
                this.inactive = inactive;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Radio)) {
                    return false;
                }
                Radio radio = (Radio) obj;
                return this.active.equals(radio.active) && this.inactive.equals(radio.inactive);
            }

            public final int hashCode() {
                return this.inactive.hashCode() + (this.active.hashCode() * 31);
            }

            public final String toString() {
                return "Radio(active=" + this.active + ", inactive=" + this.inactive + ")";
            }
        }

        public final class SearchBar {
            public final long background;
            public final Icon icon;
            public final Text text;

            public final class Icon {

                /* renamed from: default, reason: not valid java name */
                public final long f212default;
                public final long pressed;

                public Icon(long j, long j2) {
                    this.f212default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Icon)) {
                        return false;
                    }
                    Icon icon = (Icon) obj;
                    return Color.m676equalsimpl0(this.f212default, icon.f212default) && Color.m676equalsimpl0(this.pressed, icon.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3238getDefault0d7_KjU() {
                    return this.f212default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3239getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f212default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f212default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public final class Text {

                /* renamed from: default, reason: not valid java name */
                public final long f213default;
                public final long pressed;

                public Text(long j, long j2) {
                    this.f213default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) obj;
                    return Color.m676equalsimpl0(this.f213default, text.f213default) && Color.m676equalsimpl0(this.pressed, text.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3240getDefault0d7_KjU() {
                    return this.f213default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3241getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f213default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f213default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public SearchBar(long j, Icon icon, Text text) {
                this.background = j;
                this.icon = icon;
                this.text = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchBar)) {
                    return false;
                }
                SearchBar searchBar = (SearchBar) obj;
                return Color.m676equalsimpl0(this.background, searchBar.background) && this.icon.equals(searchBar.icon) && this.text.equals(searchBar.text);
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3237getBackground0d7_KjU() {
                return this.background;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.text.hashCode() + ((this.icon.hashCode() + (Long.hashCode(this.background) * 31)) * 31);
            }

            public final String toString() {
                return "SearchBar(background=" + Color.m682toStringimpl(this.background) + ", icon=" + this.icon + ", text=" + this.text + ")";
            }
        }

        public final class SearchField {
            public final Background background;
            public final Icon icon;
            public final long placeholder;
            public final long text;

            public final class Background {

                /* renamed from: default, reason: not valid java name */
                public final long f214default;
                public final long pressed;

                public Background(long j, long j2) {
                    this.f214default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) obj;
                    return Color.m676equalsimpl0(this.f214default, background.f214default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3244getDefault0d7_KjU() {
                    return this.f214default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3245getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f214default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f214default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public final class Icon {

                /* renamed from: default, reason: not valid java name */
                public final long f215default;
                public final long pressed;

                public Icon(long j, long j2) {
                    this.f215default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Icon)) {
                        return false;
                    }
                    Icon icon = (Icon) obj;
                    return Color.m676equalsimpl0(this.f215default, icon.f215default) && Color.m676equalsimpl0(this.pressed, icon.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3246getDefault0d7_KjU() {
                    return this.f215default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3247getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f215default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f215default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public SearchField(Background background, Icon icon, long j, long j2) {
                this.background = background;
                this.icon = icon;
                this.placeholder = j;
                this.text = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchField)) {
                    return false;
                }
                SearchField searchField = (SearchField) obj;
                return this.background.equals(searchField.background) && this.icon.equals(searchField.icon) && Color.m676equalsimpl0(this.placeholder, searchField.placeholder) && Color.m676equalsimpl0(this.text, searchField.text);
            }

            /* renamed from: getPlaceholder-0d7_KjU, reason: not valid java name */
            public final long m3242getPlaceholder0d7_KjU() {
                return this.placeholder;
            }

            /* renamed from: getText-0d7_KjU, reason: not valid java name */
            public final long m3243getText0d7_KjU() {
                return this.text;
            }

            public final int hashCode() {
                int hashCode = (this.icon.hashCode() + (this.background.hashCode() * 31)) * 31;
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.text) + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.placeholder);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.placeholder);
                String m682toStringimpl2 = Color.m682toStringimpl(this.text);
                StringBuilder sb = new StringBuilder("SearchField(background=");
                sb.append(this.background);
                sb.append(", icon=");
                sb.append(this.icon);
                sb.append(", placeholder=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl, ", text=", m682toStringimpl2, ")");
            }
        }

        public final class SegmentedControl {
            public final long background;
            public final Button button;
            public final Overlay overlay;

            public final class Button {
                public final Background background;
                public final long text;

                public final class Background {
                    public final long selected;

                    public Background(long j) {
                        this.selected = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Background) && Color.m676equalsimpl0(this.selected, ((Background) obj).selected);
                    }

                    /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                    public final long m3250getSelected0d7_KjU() {
                        return this.selected;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.selected);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(selected=", Color.m682toStringimpl(this.selected), ")");
                    }
                }

                public Button(Background background, long j) {
                    this.background = background;
                    this.text = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return this.background.equals(button.background) && Color.m676equalsimpl0(this.text, button.text);
                }

                public final Background getBackground() {
                    return this.background;
                }

                /* renamed from: getText-0d7_KjU, reason: not valid java name */
                public final long m3249getText0d7_KjU() {
                    return this.text;
                }

                public final int hashCode() {
                    int hashCode = this.background.hashCode() * 31;
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.text) + hashCode;
                }

                public final String toString() {
                    return "Button(background=" + this.background + ", text=" + Color.m682toStringimpl(this.text) + ")";
                }
            }

            public final class Overlay {
                public final Button button;

                public final class Button {
                    public final Background background;
                    public final Text text;

                    public final class Background {
                        public final long selected;

                        public Background(long j) {
                            this.selected = j;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Background) && Color.m676equalsimpl0(this.selected, ((Background) obj).selected);
                        }

                        /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                        public final long m3251getSelected0d7_KjU() {
                            return this.selected;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.selected);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(selected=", Color.m682toStringimpl(this.selected), ")");
                        }
                    }

                    public final class Text {

                        /* renamed from: default, reason: not valid java name */
                        public final long f216default;
                        public final long selected;

                        public Text(long j, long j2) {
                            this.f216default = j;
                            this.selected = j2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Text)) {
                                return false;
                            }
                            Text text = (Text) obj;
                            return Color.m676equalsimpl0(this.f216default, text.f216default) && Color.m676equalsimpl0(this.selected, text.selected);
                        }

                        /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                        public final long m3252getDefault0d7_KjU() {
                            return this.f216default;
                        }

                        /* renamed from: getSelected-0d7_KjU, reason: not valid java name */
                        public final long m3253getSelected0d7_KjU() {
                            return this.selected;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.selected) + (Long.hashCode(this.f216default) * 31);
                        }

                        public final String toString() {
                            return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f216default), ", selected=", Color.m682toStringimpl(this.selected), ")");
                        }
                    }

                    public Button(Background background, Text text) {
                        this.background = background;
                        this.text = text;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Button)) {
                            return false;
                        }
                        Button button = (Button) obj;
                        return this.background.equals(button.background) && this.text.equals(button.text);
                    }

                    public final Background getBackground() {
                        return this.background;
                    }

                    public final int hashCode() {
                        return this.text.hashCode() + (this.background.hashCode() * 31);
                    }

                    public final String toString() {
                        return "Button(background=" + this.background + ", text=" + this.text + ")";
                    }
                }

                public Overlay(Button button) {
                    this.button = button;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Overlay) && this.button.equals(((Overlay) obj).button);
                }

                public final int hashCode() {
                    return this.button.hashCode();
                }

                public final String toString() {
                    return "Overlay(button=" + this.button + ")";
                }
            }

            public SegmentedControl(long j, Button button, Overlay overlay) {
                this.background = j;
                this.button = button;
                this.overlay = overlay;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SegmentedControl)) {
                    return false;
                }
                SegmentedControl segmentedControl = (SegmentedControl) obj;
                return Color.m676equalsimpl0(this.background, segmentedControl.background) && this.button.equals(segmentedControl.button) && this.overlay.equals(segmentedControl.overlay);
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3248getBackground0d7_KjU() {
                return this.background;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.overlay.button.hashCode() + ((this.button.hashCode() + (Long.hashCode(this.background) * 31)) * 31);
            }

            public final String toString() {
                return "SegmentedControl(background=" + Color.m682toStringimpl(this.background) + ", button=" + this.button + ", overlay=" + this.overlay + ")";
            }
        }

        public final class Sheet {
            public final long background;
            public final Handle handle;

            public final class Handle {
                public final long border;

                public Handle(long j) {
                    this.border = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Handle) && Color.m676equalsimpl0(this.border, ((Handle) obj).border);
                }

                /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                public final long m3255getBorder0d7_KjU() {
                    return this.border;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.border);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Handle(border=", Color.m682toStringimpl(this.border), ")");
                }
            }

            public Sheet(long j, Handle handle) {
                this.background = j;
                this.handle = handle;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Sheet)) {
                    return false;
                }
                Sheet sheet = (Sheet) obj;
                return Color.m676equalsimpl0(this.background, sheet.background) && this.handle.equals(sheet.handle);
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3254getBackground0d7_KjU() {
                return this.background;
            }

            public final Handle getHandle() {
                return this.handle;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.handle.hashCode() + (Long.hashCode(this.background) * 31);
            }

            public final String toString() {
                return "Sheet(background=" + Color.m682toStringimpl(this.background) + ", handle=" + this.handle + ")";
            }
        }

        public final class Slider {
            public final Bar bar;
            public final Knob knob;
            public final Thumb thumb;
            public final Track track;

            public final class Bar {
                public final Filled filled;
                public final Unfilled unfilled;

                public final class Filled {
                    public final long background;

                    public Filled(long j) {
                        this.background = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Filled) && Color.m676equalsimpl0(this.background, ((Filled) obj).background);
                    }

                    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                    public final long m3256getBackground0d7_KjU() {
                        return this.background;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.background);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Filled(background=", Color.m682toStringimpl(this.background), ")");
                    }
                }

                public final class Unfilled {
                    public final long background;

                    public Unfilled(long j) {
                        this.background = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Unfilled) && Color.m676equalsimpl0(this.background, ((Unfilled) obj).background);
                    }

                    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                    public final long m3257getBackground0d7_KjU() {
                        return this.background;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.background);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unfilled(background=", Color.m682toStringimpl(this.background), ")");
                    }
                }

                public Bar(Filled filled, Unfilled unfilled) {
                    this.filled = filled;
                    this.unfilled = unfilled;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Bar)) {
                        return false;
                    }
                    Bar bar = (Bar) obj;
                    return this.filled.equals(bar.filled) && this.unfilled.equals(bar.unfilled);
                }

                public final Filled getFilled() {
                    return this.filled;
                }

                public final Unfilled getUnfilled() {
                    return this.unfilled;
                }

                public final int hashCode() {
                    return this.unfilled.hashCode() + (this.filled.hashCode() * 31);
                }

                public final String toString() {
                    return "Bar(filled=" + this.filled + ", unfilled=" + this.unfilled + ")";
                }
            }

            public final class Knob {
                public final long background;
                public final long border;

                public Knob(long j, long j2) {
                    this.background = j;
                    this.border = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Knob)) {
                        return false;
                    }
                    Knob knob = (Knob) obj;
                    return Color.m676equalsimpl0(this.background, knob.background) && Color.m676equalsimpl0(this.border, knob.border);
                }

                /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                public final long m3258getBackground0d7_KjU() {
                    return this.background;
                }

                /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                public final long m3259getBorder0d7_KjU() {
                    return this.border;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.border) + (Long.hashCode(this.background) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Knob(background=", Color.m682toStringimpl(this.background), ", border=", Color.m682toStringimpl(this.border), ")");
                }
            }

            public final class Thumb {
                public final long background;
                public final long border;

                public Thumb(long j, long j2) {
                    this.background = j;
                    this.border = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Thumb)) {
                        return false;
                    }
                    Thumb thumb = (Thumb) obj;
                    return Color.m676equalsimpl0(this.background, thumb.background) && Color.m676equalsimpl0(this.border, thumb.border);
                }

                /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                public final long m3260getBackground0d7_KjU() {
                    return this.background;
                }

                /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                public final long m3261getBorder0d7_KjU() {
                    return this.border;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.border) + (Long.hashCode(this.background) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Thumb(background=", Color.m682toStringimpl(this.background), ", border=", Color.m682toStringimpl(this.border), ")");
                }
            }

            public final class Track {
                public final Filled filled;
                public final Unfilled unfilled;

                public final class Filled {
                    public final long background;

                    public Filled(long j) {
                        this.background = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Filled) && Color.m676equalsimpl0(this.background, ((Filled) obj).background);
                    }

                    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                    public final long m3262getBackground0d7_KjU() {
                        return this.background;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.background);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Filled(background=", Color.m682toStringimpl(this.background), ")");
                    }
                }

                public final class Unfilled {
                    public final long background;

                    public Unfilled(long j) {
                        this.background = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Unfilled) && Color.m676equalsimpl0(this.background, ((Unfilled) obj).background);
                    }

                    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                    public final long m3263getBackground0d7_KjU() {
                        return this.background;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.background);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unfilled(background=", Color.m682toStringimpl(this.background), ")");
                    }
                }

                public Track(Filled filled, Unfilled unfilled) {
                    this.filled = filled;
                    this.unfilled = unfilled;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Track)) {
                        return false;
                    }
                    Track track = (Track) obj;
                    return this.filled.equals(track.filled) && this.unfilled.equals(track.unfilled);
                }

                public final Filled getFilled() {
                    return this.filled;
                }

                public final Unfilled getUnfilled() {
                    return this.unfilled;
                }

                public final int hashCode() {
                    return this.unfilled.hashCode() + (this.filled.hashCode() * 31);
                }

                public final String toString() {
                    return "Track(filled=" + this.filled + ", unfilled=" + this.unfilled + ")";
                }
            }

            public Slider(Bar bar, Knob knob, Thumb thumb, Track track) {
                this.bar = bar;
                this.knob = knob;
                this.thumb = thumb;
                this.track = track;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Slider)) {
                    return false;
                }
                Slider slider = (Slider) obj;
                return this.bar.equals(slider.bar) && this.knob.equals(slider.knob) && this.thumb.equals(slider.thumb) && this.track.equals(slider.track);
            }

            public final int hashCode() {
                return this.track.hashCode() + ((this.thumb.hashCode() + ((this.knob.hashCode() + (this.bar.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Slider(bar=" + this.bar + ", knob=" + this.knob + ", thumb=" + this.thumb + ", track=" + this.track + ")";
            }
        }

        public final class Timeline {
            public final Background background;
            public final Dot dot;
            public final Line line;

            public final class Background {

                /* renamed from: default, reason: not valid java name */
                public final long f217default;
                public final long pressed;

                public Background(long j, long j2) {
                    this.f217default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Background)) {
                        return false;
                    }
                    Background background = (Background) obj;
                    return Color.m676equalsimpl0(this.f217default, background.f217default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3264getDefault0d7_KjU() {
                    return this.f217default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3265getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f217default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f217default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public final class Dot {
                public final Background background;
                public final Border border;

                public final class Background {
                    public final long collapsed;
                    public final long done;
                    public final long inProgress;
                    public final long notStarted;
                    public final long pending;
                    public final long skipped;

                    public Background(long j, long j2, long j3, long j4, long j5, long j6) {
                        this.collapsed = j;
                        this.done = j2;
                        this.inProgress = j3;
                        this.notStarted = j4;
                        this.pending = j5;
                        this.skipped = j6;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.collapsed, background.collapsed) && Color.m676equalsimpl0(this.done, background.done) && Color.m676equalsimpl0(this.inProgress, background.inProgress) && Color.m676equalsimpl0(this.notStarted, background.notStarted) && Color.m676equalsimpl0(this.pending, background.pending) && Color.m676equalsimpl0(this.skipped, background.skipped);
                    }

                    /* renamed from: getCollapsed-0d7_KjU, reason: not valid java name */
                    public final long m3266getCollapsed0d7_KjU() {
                        return this.collapsed;
                    }

                    /* renamed from: getDone-0d7_KjU, reason: not valid java name */
                    public final long m3267getDone0d7_KjU() {
                        return this.done;
                    }

                    /* renamed from: getInProgress-0d7_KjU, reason: not valid java name */
                    public final long m3268getInProgress0d7_KjU() {
                        return this.inProgress;
                    }

                    /* renamed from: getNotStarted-0d7_KjU, reason: not valid java name */
                    public final long m3269getNotStarted0d7_KjU() {
                        return this.notStarted;
                    }

                    /* renamed from: getPending-0d7_KjU, reason: not valid java name */
                    public final long m3270getPending0d7_KjU() {
                        return this.pending;
                    }

                    /* renamed from: getSkipped-0d7_KjU, reason: not valid java name */
                    public final long m3271getSkipped0d7_KjU() {
                        return this.skipped;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.skipped) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.collapsed) * 31, 31, this.done), 31, this.inProgress), 31, this.notStarted), 31, this.pending);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.collapsed);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.done);
                        String m682toStringimpl3 = Color.m682toStringimpl(this.inProgress);
                        String m682toStringimpl4 = Color.m682toStringimpl(this.notStarted);
                        String m682toStringimpl5 = Color.m682toStringimpl(this.pending);
                        String m682toStringimpl6 = Color.m682toStringimpl(this.skipped);
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(collapsed=", m682toStringimpl, ", done=", m682toStringimpl2, ", inProgress=");
                        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", notStarted=", m682toStringimpl4, ", pending=");
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl5, ", skipped=", m682toStringimpl6, ")");
                    }
                }

                public final class Border {
                    public final long inProgress;

                    public Border(long j) {
                        this.inProgress = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Border) && Color.m676equalsimpl0(this.inProgress, ((Border) obj).inProgress);
                    }

                    /* renamed from: getInProgress-0d7_KjU, reason: not valid java name */
                    public final long m3272getInProgress0d7_KjU() {
                        return this.inProgress;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.inProgress);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Border(inProgress=", Color.m682toStringimpl(this.inProgress), ")");
                    }
                }

                public Dot(Background background, Border border) {
                    this.background = background;
                    this.border = border;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Dot)) {
                        return false;
                    }
                    Dot dot = (Dot) obj;
                    return this.background.equals(dot.background) && this.border.equals(dot.border);
                }

                public final Background getBackground() {
                    return this.background;
                }

                public final Border getBorder() {
                    return this.border;
                }

                public final int hashCode() {
                    return this.border.hashCode() + (this.background.hashCode() * 31);
                }

                public final String toString() {
                    return "Dot(background=" + this.background + ", border=" + this.border + ")";
                }
            }

            public final class Line {
                public final Border border;

                public final class Border {
                    public final long collapsed;
                    public final long done;
                    public final long inProgress;
                    public final long notStarted;
                    public final long pending;
                    public final long skipped;

                    public Border(long j, long j2, long j3, long j4, long j5, long j6) {
                        this.collapsed = j;
                        this.done = j2;
                        this.inProgress = j3;
                        this.notStarted = j4;
                        this.pending = j5;
                        this.skipped = j6;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Border)) {
                            return false;
                        }
                        Border border = (Border) obj;
                        return Color.m676equalsimpl0(this.collapsed, border.collapsed) && Color.m676equalsimpl0(this.done, border.done) && Color.m676equalsimpl0(this.inProgress, border.inProgress) && Color.m676equalsimpl0(this.notStarted, border.notStarted) && Color.m676equalsimpl0(this.pending, border.pending) && Color.m676equalsimpl0(this.skipped, border.skipped);
                    }

                    /* renamed from: getCollapsed-0d7_KjU, reason: not valid java name */
                    public final long m3273getCollapsed0d7_KjU() {
                        return this.collapsed;
                    }

                    /* renamed from: getDone-0d7_KjU, reason: not valid java name */
                    public final long m3274getDone0d7_KjU() {
                        return this.done;
                    }

                    /* renamed from: getInProgress-0d7_KjU, reason: not valid java name */
                    public final long m3275getInProgress0d7_KjU() {
                        return this.inProgress;
                    }

                    /* renamed from: getNotStarted-0d7_KjU, reason: not valid java name */
                    public final long m3276getNotStarted0d7_KjU() {
                        return this.notStarted;
                    }

                    /* renamed from: getPending-0d7_KjU, reason: not valid java name */
                    public final long m3277getPending0d7_KjU() {
                        return this.pending;
                    }

                    /* renamed from: getSkipped-0d7_KjU, reason: not valid java name */
                    public final long m3278getSkipped0d7_KjU() {
                        return this.skipped;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.skipped) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.collapsed) * 31, 31, this.done), 31, this.inProgress), 31, this.notStarted), 31, this.pending);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.collapsed);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.done);
                        String m682toStringimpl3 = Color.m682toStringimpl(this.inProgress);
                        String m682toStringimpl4 = Color.m682toStringimpl(this.notStarted);
                        String m682toStringimpl5 = Color.m682toStringimpl(this.pending);
                        String m682toStringimpl6 = Color.m682toStringimpl(this.skipped);
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Border(collapsed=", m682toStringimpl, ", done=", m682toStringimpl2, ", inProgress=");
                        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", notStarted=", m682toStringimpl4, ", pending=");
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl5, ", skipped=", m682toStringimpl6, ")");
                    }
                }

                public Line(Border border) {
                    this.border = border;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Line) && this.border.equals(((Line) obj).border);
                }

                public final Border getBorder() {
                    return this.border;
                }

                public final int hashCode() {
                    return this.border.hashCode();
                }

                public final String toString() {
                    return "Line(border=" + this.border + ")";
                }
            }

            public Timeline(Background background, Dot dot, Line line) {
                this.background = background;
                this.dot = dot;
                this.line = line;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Timeline)) {
                    return false;
                }
                Timeline timeline = (Timeline) obj;
                return this.background.equals(timeline.background) && this.dot.equals(timeline.dot) && this.line.equals(timeline.line);
            }

            public final Dot getDot() {
                return this.dot;
            }

            public final Line getLine() {
                return this.line;
            }

            public final int hashCode() {
                return this.line.border.hashCode() + ((this.dot.hashCode() + (this.background.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "Timeline(background=" + this.background + ", dot=" + this.dot + ", line=" + this.line + ")";
            }
        }

        public final class TitleBar {
            public final long background;
            public final Button button;
            public final Icon icon;
            public final Keypad keypad;
            public final long text;

            public final class Button {
                public final Background background;

                public final class Background {
                    public final long transparent;
                    public final long transparentDark;
                    public final long transparentLight;

                    public Background(long j, long j2, long j3) {
                        this.transparent = j;
                        this.transparentDark = j2;
                        this.transparentLight = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.transparent, background.transparent) && Color.m676equalsimpl0(this.transparentDark, background.transparentDark) && Color.m676equalsimpl0(this.transparentLight, background.transparentLight);
                    }

                    /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
                    public final long m3282getTransparent0d7_KjU() {
                        return this.transparent;
                    }

                    /* renamed from: getTransparentDark-0d7_KjU, reason: not valid java name */
                    public final long m3283getTransparentDark0d7_KjU() {
                        return this.transparentDark;
                    }

                    /* renamed from: getTransparentLight-0d7_KjU, reason: not valid java name */
                    public final long m3284getTransparentLight0d7_KjU() {
                        return this.transparentLight;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.transparentLight) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.transparent) * 31, 31, this.transparentDark);
                    }

                    public final String toString() {
                        String m682toStringimpl = Color.m682toStringimpl(this.transparent);
                        String m682toStringimpl2 = Color.m682toStringimpl(this.transparentDark);
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(transparent=", m682toStringimpl, ", transparentDark=", m682toStringimpl2, ", transparentLight="), Color.m682toStringimpl(this.transparentLight), ")");
                    }
                }

                public Button(Background background) {
                    this.background = background;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Button) && this.background.equals(((Button) obj).background);
                }

                public final int hashCode() {
                    return this.background.hashCode();
                }

                public final String toString() {
                    return "Button(background=" + this.background + ")";
                }
            }

            public final class Icon {

                /* renamed from: default, reason: not valid java name */
                public final long f218default;
                public final long pressed;

                public Icon(long j, long j2) {
                    this.f218default = j;
                    this.pressed = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Icon)) {
                        return false;
                    }
                    Icon icon = (Icon) obj;
                    return Color.m676equalsimpl0(this.f218default, icon.f218default) && Color.m676equalsimpl0(this.pressed, icon.pressed);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3285getDefault0d7_KjU() {
                    return this.f218default;
                }

                /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                public final long m3286getPressed0d7_KjU() {
                    return this.pressed;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.pressed) + (Long.hashCode(this.f218default) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f218default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                }
            }

            public final class Keypad {
                public final long background;
                public final Icon icon;

                public final class Icon {

                    /* renamed from: default, reason: not valid java name */
                    public final long f219default;
                    public final long pressed;

                    public Icon(long j, long j2) {
                        this.f219default = j;
                        this.pressed = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Icon)) {
                            return false;
                        }
                        Icon icon = (Icon) obj;
                        return Color.m676equalsimpl0(this.f219default, icon.f219default) && Color.m676equalsimpl0(this.pressed, icon.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3288getDefault0d7_KjU() {
                        return this.f219default;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3289getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + (Long.hashCode(this.f219default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Icon(default=", Color.m682toStringimpl(this.f219default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public Keypad(long j, Icon icon) {
                    this.background = j;
                    this.icon = icon;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Keypad)) {
                        return false;
                    }
                    Keypad keypad = (Keypad) obj;
                    return Color.m676equalsimpl0(this.background, keypad.background) && this.icon.equals(keypad.icon);
                }

                /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                public final long m3287getBackground0d7_KjU() {
                    return this.background;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return this.icon.hashCode() + (Long.hashCode(this.background) * 31);
                }

                public final String toString() {
                    return "Keypad(background=" + Color.m682toStringimpl(this.background) + ", icon=" + this.icon + ")";
                }
            }

            public TitleBar(long j, Button button, Icon icon, Keypad keypad, long j2) {
                this.background = j;
                this.button = button;
                this.icon = icon;
                this.keypad = keypad;
                this.text = j2;
            }

            /* renamed from: copy-0Hk2hKA$default, reason: not valid java name */
            public static TitleBar m3279copy0Hk2hKA$default(TitleBar titleBar, Keypad keypad) {
                return new TitleBar(titleBar.background, titleBar.button, titleBar.icon, keypad, titleBar.text);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TitleBar)) {
                    return false;
                }
                TitleBar titleBar = (TitleBar) obj;
                return Color.m676equalsimpl0(this.background, titleBar.background) && this.button.equals(titleBar.button) && this.icon.equals(titleBar.icon) && this.keypad.equals(titleBar.keypad) && Color.m676equalsimpl0(this.text, titleBar.text);
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3280getBackground0d7_KjU() {
                return this.background;
            }

            /* renamed from: getText-0d7_KjU, reason: not valid java name */
            public final long m3281getText0d7_KjU() {
                return this.text;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.text) + ((this.keypad.hashCode() + ((this.icon.hashCode() + ((this.button.background.hashCode() + (Long.hashCode(this.background) * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.background);
                String m682toStringimpl2 = Color.m682toStringimpl(this.text);
                StringBuilder sb = new StringBuilder("TitleBar(background=");
                sb.append(m682toStringimpl);
                sb.append(", button=");
                sb.append(this.button);
                sb.append(", icon=");
                sb.append(this.icon);
                sb.append(", keypad=");
                sb.append(this.keypad);
                sb.append(", text=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl2, ")");
            }
        }

        public final class Toast {
            public final Background background;
            public final Button button;

            public final class Background {

                /* renamed from: default, reason: not valid java name */
                public final long f220default;

                public Background(long j) {
                    this.f220default = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Background) && Color.m676equalsimpl0(this.f220default, ((Background) obj).f220default);
                }

                /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                public final long m3290getDefault0d7_KjU() {
                    return this.f220default;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.f220default);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", Color.m682toStringimpl(this.f220default), ")");
                }
            }

            public final class Button {
                public final Background background;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f221default;
                    public final long pressed;

                    public Background(long j, long j2) {
                        this.f221default = j;
                        this.pressed = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f221default, background.f221default) && Color.m676equalsimpl0(this.pressed, background.pressed);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3291getDefault0d7_KjU() {
                        return this.f221default;
                    }

                    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                    public final long m3292getPressed0d7_KjU() {
                        return this.pressed;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.pressed) + (Long.hashCode(this.f221default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f221default), ", pressed=", Color.m682toStringimpl(this.pressed), ")");
                    }
                }

                public Button(Background background) {
                    this.background = background;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Button) && this.background.equals(((Button) obj).background);
                }

                public final int hashCode() {
                    return this.background.hashCode();
                }

                public final String toString() {
                    return "Button(background=" + this.background + ")";
                }
            }

            public Toast(Background background, Button button) {
                this.background = background;
                this.button = button;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Toast)) {
                    return false;
                }
                Toast toast = (Toast) obj;
                return this.background.equals(toast.background) && this.button.equals(toast.button);
            }

            public final Background getBackground() {
                return this.background;
            }

            public final int hashCode() {
                return this.button.background.hashCode() + (this.background.hashCode() * 31);
            }

            public final String toString() {
                return "Toast(background=" + this.background + ", button=" + this.button + ")";
            }
        }

        public final class Toggle {
            public final Active active;
            public final Inactive inactive;
            public final Knob knob;
            public final Off off;
            public final On on;
            public final Thumb thumb;

            public final class Active {
                public final Background background;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f222default;
                    public final long disabled;

                    public Background(long j, long j2) {
                        this.f222default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f222default, background.f222default) && Color.m676equalsimpl0(this.disabled, background.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3293getDefault0d7_KjU() {
                        return this.f222default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3294getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f222default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f222default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Active(Background background) {
                    this.background = background;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Active) && this.background.equals(((Active) obj).background);
                }

                public final int hashCode() {
                    return this.background.hashCode();
                }

                public final String toString() {
                    return "Active(background=" + this.background + ")";
                }
            }

            public final class Inactive {
                public final Background background;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f223default;
                    public final long disabled;

                    public Background(long j, long j2) {
                        this.f223default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f223default, background.f223default) && Color.m676equalsimpl0(this.disabled, background.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3295getDefault0d7_KjU() {
                        return this.f223default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3296getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f223default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f223default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Inactive(Background background) {
                    this.background = background;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Inactive) && this.background.equals(((Inactive) obj).background);
                }

                public final int hashCode() {
                    return this.background.hashCode();
                }

                public final String toString() {
                    return "Inactive(background=" + this.background + ")";
                }
            }

            public final class Knob {
                public final Background background;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f224default;
                    public final long disabled;

                    public Background(long j, long j2) {
                        this.f224default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f224default, background.f224default) && Color.m676equalsimpl0(this.disabled, background.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3297getDefault0d7_KjU() {
                        return this.f224default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3298getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f224default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f224default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Knob(Background background) {
                    this.background = background;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Knob) && this.background.equals(((Knob) obj).background);
                }

                public final int hashCode() {
                    return this.background.hashCode();
                }

                public final String toString() {
                    return "Knob(background=" + this.background + ")";
                }
            }

            public final class Off {
                public final Background background;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f225default;
                    public final long disabled;

                    public Background(long j, long j2) {
                        this.f225default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f225default, background.f225default) && Color.m676equalsimpl0(this.disabled, background.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3299getDefault0d7_KjU() {
                        return this.f225default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3300getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f225default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f225default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Off(Background background) {
                    this.background = background;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Off) && this.background.equals(((Off) obj).background);
                }

                public final int hashCode() {
                    return this.background.hashCode();
                }

                public final String toString() {
                    return "Off(background=" + this.background + ")";
                }
            }

            public final class On {
                public final Background background;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f226default;
                    public final long disabled;

                    public Background(long j, long j2) {
                        this.f226default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f226default, background.f226default) && Color.m676equalsimpl0(this.disabled, background.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3301getDefault0d7_KjU() {
                        return this.f226default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3302getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f226default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f226default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public On(Background background) {
                    this.background = background;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof On) && this.background.equals(((On) obj).background);
                }

                public final int hashCode() {
                    return this.background.hashCode();
                }

                public final String toString() {
                    return "On(background=" + this.background + ")";
                }
            }

            public final class Thumb {
                public final Background background;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f227default;
                    public final long disabled;

                    public Background(long j, long j2) {
                        this.f227default = j;
                        this.disabled = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Background)) {
                            return false;
                        }
                        Background background = (Background) obj;
                        return Color.m676equalsimpl0(this.f227default, background.f227default) && Color.m676equalsimpl0(this.disabled, background.disabled);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3303getDefault0d7_KjU() {
                        return this.f227default;
                    }

                    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                    public final long m3304getDisabled0d7_KjU() {
                        return this.disabled;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.disabled) + (Long.hashCode(this.f227default) * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("Background(default=", Color.m682toStringimpl(this.f227default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                    }
                }

                public Thumb(Background background) {
                    this.background = background;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Thumb) && this.background.equals(((Thumb) obj).background);
                }

                public final int hashCode() {
                    return this.background.hashCode();
                }

                public final String toString() {
                    return "Thumb(background=" + this.background + ")";
                }
            }

            public Toggle(Active active, Inactive inactive, Knob knob, Off off, On on, Thumb thumb) {
                this.active = active;
                this.inactive = inactive;
                this.knob = knob;
                this.off = off;
                this.on = on;
                this.thumb = thumb;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Toggle)) {
                    return false;
                }
                Toggle toggle = (Toggle) obj;
                return this.active.equals(toggle.active) && this.inactive.equals(toggle.inactive) && this.knob.equals(toggle.knob) && this.off.equals(toggle.off) && this.on.equals(toggle.on) && this.thumb.equals(toggle.thumb);
            }

            public final int hashCode() {
                return this.thumb.background.hashCode() + ((this.on.background.hashCode() + ((this.off.background.hashCode() + ((this.knob.background.hashCode() + ((this.inactive.background.hashCode() + (this.active.background.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Toggle(active=" + this.active + ", inactive=" + this.inactive + ", knob=" + this.knob + ", off=" + this.off + ", on=" + this.on + ", thumb=" + this.thumb + ")";
            }
        }

        public final class Tooltip {
            public final long background;

            public Tooltip(long j) {
                this.background = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Tooltip) && Color.m676equalsimpl0(this.background, ((Tooltip) obj).background);
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3305getBackground0d7_KjU() {
                return this.background;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.background);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Tooltip(background=", Color.m682toStringimpl(this.background), ")");
            }
        }

        public final class Ui {
            public final long cursor;
            public final Dimmer dimmer;
            public final Divider divider;
            public final Handle handle;
            public final HomeIndicator homeIndicator;

            public final class Dimmer {
                public final long background;

                public Dimmer(long j) {
                    this.background = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Dimmer) && Color.m676equalsimpl0(this.background, ((Dimmer) obj).background);
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.background);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Dimmer(background=", Color.m682toStringimpl(this.background), ")");
                }
            }

            public final class Divider {
                public final long border;

                public Divider(long j) {
                    this.border = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Divider) && Color.m676equalsimpl0(this.border, ((Divider) obj).border);
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.border);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Divider(border=", Color.m682toStringimpl(this.border), ")");
                }
            }

            public final class Handle {
                public final long border;

                public Handle(long j) {
                    this.border = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Handle) && Color.m676equalsimpl0(this.border, ((Handle) obj).border);
                }

                /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                public final long m3307getBorder0d7_KjU() {
                    return this.border;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.border);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Handle(border=", Color.m682toStringimpl(this.border), ")");
                }
            }

            public final class HomeIndicator {
                public final long border;
                public final Inverse inverse;

                public final class Inverse {
                    public final long border;

                    public Inverse(long j) {
                        this.border = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Inverse) && Color.m676equalsimpl0(this.border, ((Inverse) obj).border);
                    }

                    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                    public final long m3309getBorder0d7_KjU() {
                        return this.border;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.border);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Inverse(border=", Color.m682toStringimpl(this.border), ")");
                    }
                }

                public HomeIndicator(long j, Inverse inverse) {
                    this.border = j;
                    this.inverse = inverse;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof HomeIndicator)) {
                        return false;
                    }
                    HomeIndicator homeIndicator = (HomeIndicator) obj;
                    return Color.m676equalsimpl0(this.border, homeIndicator.border) && this.inverse.equals(homeIndicator.inverse);
                }

                /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                public final long m3308getBorder0d7_KjU() {
                    return this.border;
                }

                public final Inverse getInverse() {
                    return this.inverse;
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return this.inverse.hashCode() + (Long.hashCode(this.border) * 31);
                }

                public final String toString() {
                    return "HomeIndicator(border=" + Color.m682toStringimpl(this.border) + ", inverse=" + this.inverse + ")";
                }
            }

            public Ui(long j, Dimmer dimmer, Divider divider, Handle handle, HomeIndicator homeIndicator) {
                this.cursor = j;
                this.dimmer = dimmer;
                this.divider = divider;
                this.handle = handle;
                this.homeIndicator = homeIndicator;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Ui)) {
                    return false;
                }
                Ui ui = (Ui) obj;
                return Color.m676equalsimpl0(this.cursor, ui.cursor) && this.dimmer.equals(ui.dimmer) && this.divider.equals(ui.divider) && this.handle.equals(ui.handle) && this.homeIndicator.equals(ui.homeIndicator);
            }

            /* renamed from: getCursor-0d7_KjU, reason: not valid java name */
            public final long m3306getCursor0d7_KjU() {
                return this.cursor;
            }

            public final Handle getHandle() {
                return this.handle;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.homeIndicator.hashCode() + ((this.handle.hashCode() + ((this.divider.hashCode() + ((this.dimmer.hashCode() + (Long.hashCode(this.cursor) * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Ui(cursor=" + Color.m682toStringimpl(this.cursor) + ", dimmer=" + this.dimmer + ", divider=" + this.divider + ", handle=" + this.handle + ", homeIndicator=" + this.homeIndicator + ")";
            }
        }

        public Component(Avatar avatar, Badge badge, BottomNavigation bottomNavigation, Button button, Card card, Cell cell, Checkbox checkbox, CopyCode copyCode, FilterBar filterBar, HalfSheet halfSheet, Header header, Input input, Modal modal, OptionCard optionCard, OptionChip optionChip, Radio radio, SearchBar searchBar, SearchField searchField, SegmentedControl segmentedControl, Sheet sheet, Slider slider, Timeline timeline, TitleBar titleBar, Toast toast, Toggle toggle, Tooltip tooltip, Ui ui) {
            this.avatar = avatar;
            this.badge = badge;
            this.bottomNavigation = bottomNavigation;
            this.button = button;
            this.card = card;
            this.cell = cell;
            this.checkbox = checkbox;
            this.copyCode = copyCode;
            this.filterBar = filterBar;
            this.halfSheet = halfSheet;
            this.header = header;
            this.input = input;
            this.modal = modal;
            this.optionCard = optionCard;
            this.optionChip = optionChip;
            this.radio = radio;
            this.searchBar = searchBar;
            this.searchField = searchField;
            this.segmentedControl = segmentedControl;
            this.sheet = sheet;
            this.slider = slider;
            this.timeline = timeline;
            this.titleBar = titleBar;
            this.toast = toast;
            this.toggle = toggle;
            this.tooltip = tooltip;
            this.ui = ui;
        }

        public static Component copy$default(Component component, BottomNavigation bottomNavigation, Button button, Cell cell, Input input, SegmentedControl segmentedControl, Sheet sheet, TitleBar titleBar, int i) {
            SearchField searchField;
            SegmentedControl segmentedControl2;
            Timeline timeline;
            TitleBar titleBar2;
            Avatar avatar = component.avatar;
            Badge badge = component.badge;
            BottomNavigation bottomNavigation2 = (i & 4) != 0 ? component.bottomNavigation : bottomNavigation;
            Button button2 = (i & 8) != 0 ? component.button : button;
            Card card = component.card;
            Cell cell2 = (i & 32) != 0 ? component.cell : cell;
            Checkbox checkbox = component.checkbox;
            BottomNavigation bottomNavigation3 = bottomNavigation2;
            Button button3 = button2;
            Cell cell3 = cell2;
            CopyCode copyCode = component.copyCode;
            FilterBar filterBar = component.filterBar;
            HalfSheet halfSheet = component.halfSheet;
            Header header = component.header;
            Input input2 = (i & 2048) != 0 ? component.input : input;
            Modal modal = component.modal;
            Input input3 = input2;
            OptionCard optionCard = component.optionCard;
            OptionChip optionChip = component.optionChip;
            Radio radio = component.radio;
            SearchBar searchBar = component.searchBar;
            SearchField searchField2 = component.searchField;
            if ((i & PKIFailureInfo.transactionIdInUse) != 0) {
                searchField = searchField2;
                segmentedControl2 = component.segmentedControl;
            } else {
                searchField = searchField2;
                segmentedControl2 = segmentedControl;
            }
            Sheet sheet2 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? component.sheet : sheet;
            Slider slider = component.slider;
            Timeline timeline2 = component.timeline;
            if ((i & 4194304) != 0) {
                timeline = timeline2;
                titleBar2 = component.titleBar;
            } else {
                timeline = timeline2;
                titleBar2 = titleBar;
            }
            return new Component(avatar, badge, bottomNavigation3, button3, card, cell3, checkbox, copyCode, filterBar, halfSheet, header, input3, modal, optionCard, optionChip, radio, searchBar, searchField, segmentedControl2, sheet2, slider, timeline, titleBar2, component.toast, component.toggle, component.tooltip, component.ui);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Component)) {
                return false;
            }
            Component component = (Component) obj;
            return this.avatar.equals(component.avatar) && this.badge.equals(component.badge) && this.bottomNavigation.equals(component.bottomNavigation) && this.button.equals(component.button) && this.card.equals(component.card) && this.cell.equals(component.cell) && this.checkbox.equals(component.checkbox) && this.copyCode.equals(component.copyCode) && this.filterBar.equals(component.filterBar) && this.halfSheet.equals(component.halfSheet) && this.header.equals(component.header) && this.input.equals(component.input) && this.modal.equals(component.modal) && this.optionCard.equals(component.optionCard) && this.optionChip.equals(component.optionChip) && this.radio.equals(component.radio) && this.searchBar.equals(component.searchBar) && this.searchField.equals(component.searchField) && this.segmentedControl.equals(component.segmentedControl) && this.sheet.equals(component.sheet) && this.slider.equals(component.slider) && this.timeline.equals(component.timeline) && this.titleBar.equals(component.titleBar) && this.toast.equals(component.toast) && this.toggle.equals(component.toggle) && this.tooltip.equals(component.tooltip) && this.ui.equals(component.ui);
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        public final BottomNavigation getBottomNavigation() {
            return this.bottomNavigation;
        }

        public final Button getButton() {
            return this.button;
        }

        public final Cell getCell() {
            return this.cell;
        }

        public final Checkbox getCheckbox() {
            return this.checkbox;
        }

        public final CopyCode getCopyCode() {
            return this.copyCode;
        }

        public final FilterBar getFilterBar() {
            return this.filterBar;
        }

        public final HalfSheet getHalfSheet() {
            return this.halfSheet;
        }

        public final Input getInput() {
            return this.input;
        }

        public final Modal getModal() {
            return this.modal;
        }

        public final OptionCard getOptionCard() {
            return this.optionCard;
        }

        public final OptionChip getOptionChip() {
            return this.optionChip;
        }

        public final Radio getRadio() {
            return this.radio;
        }

        public final SearchField getSearchField() {
            return this.searchField;
        }

        public final SegmentedControl getSegmentedControl() {
            return this.segmentedControl;
        }

        public final Slider getSlider() {
            return this.slider;
        }

        public final Timeline getTimeline() {
            return this.timeline;
        }

        public final TitleBar getTitleBar() {
            return this.titleBar;
        }

        public final Toggle getToggle() {
            return this.toggle;
        }

        public final Tooltip getTooltip() {
            return this.tooltip;
        }

        public final Ui getUi() {
            return this.ui;
        }

        public final int hashCode() {
            return this.ui.hashCode() + ((this.tooltip.hashCode() + ((this.toggle.hashCode() + ((this.toast.hashCode() + ((this.titleBar.hashCode() + ((this.timeline.hashCode() + ((this.slider.hashCode() + ((this.sheet.hashCode() + ((this.segmentedControl.hashCode() + ((this.searchField.hashCode() + ((this.searchBar.hashCode() + ((this.radio.hashCode() + ((this.optionChip.hashCode() + ((this.optionCard.hashCode() + ((this.modal.hashCode() + ((this.input.hashCode() + ((this.header.hashCode() + ((this.halfSheet.hashCode() + ((this.filterBar.chip.hashCode() + ((this.copyCode.hashCode() + ((this.checkbox.hashCode() + ((this.cell.hashCode() + ((this.card.hashCode() + ((this.button.hashCode() + ((this.bottomNavigation.hashCode() + ((this.badge.hashCode() + (this.avatar.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Component(avatar=" + this.avatar + ", badge=" + this.badge + ", bottomNavigation=" + this.bottomNavigation + ", button=" + this.button + ", card=" + this.card + ", cell=" + this.cell + ", checkbox=" + this.checkbox + ", copyCode=" + this.copyCode + ", filterBar=" + this.filterBar + ", halfSheet=" + this.halfSheet + ", header=" + this.header + ", input=" + this.input + ", modal=" + this.modal + ", optionCard=" + this.optionCard + ", optionChip=" + this.optionChip + ", radio=" + this.radio + ", searchBar=" + this.searchBar + ", searchField=" + this.searchField + ", segmentedControl=" + this.segmentedControl + ", sheet=" + this.sheet + ", slider=" + this.slider + ", timeline=" + this.timeline + ", titleBar=" + this.titleBar + ", toast=" + this.toast + ", toggle=" + this.toggle + ", tooltip=" + this.tooltip + ", ui=" + this.ui + ")";
        }
    }

    public final class Data {
        public final Part part;
        public final Portion portion;
        public final Trend trend;

        public final class Part {
            public final OfFive ofFive;
            public final OfFour ofFour;
            public final OfOne ofOne;
            public final OfThree ofThree;
            public final OfTwo ofTwo;

            public final class OfFive {
                public final long five;
                public final long fiveInactive;
                public final long four;
                public final long fourInactive;
                public final long one;
                public final long oneInactive;
                public final long three;
                public final long threeInactive;
                public final long two;
                public final long twoInactive;

                public OfFive(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
                    this.five = j;
                    this.fiveInactive = j2;
                    this.four = j3;
                    this.fourInactive = j4;
                    this.one = j5;
                    this.oneInactive = j6;
                    this.three = j7;
                    this.threeInactive = j8;
                    this.two = j9;
                    this.twoInactive = j10;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OfFive)) {
                        return false;
                    }
                    OfFive ofFive = (OfFive) obj;
                    return Color.m676equalsimpl0(this.five, ofFive.five) && Color.m676equalsimpl0(this.fiveInactive, ofFive.fiveInactive) && Color.m676equalsimpl0(this.four, ofFive.four) && Color.m676equalsimpl0(this.fourInactive, ofFive.fourInactive) && Color.m676equalsimpl0(this.one, ofFive.one) && Color.m676equalsimpl0(this.oneInactive, ofFive.oneInactive) && Color.m676equalsimpl0(this.three, ofFive.three) && Color.m676equalsimpl0(this.threeInactive, ofFive.threeInactive) && Color.m676equalsimpl0(this.two, ofFive.two) && Color.m676equalsimpl0(this.twoInactive, ofFive.twoInactive);
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.twoInactive) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.five) * 31, 31, this.fiveInactive), 31, this.four), 31, this.fourInactive), 31, this.one), 31, this.oneInactive), 31, this.three), 31, this.threeInactive), 31, this.two);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.five);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.fiveInactive);
                    String m682toStringimpl3 = Color.m682toStringimpl(this.four);
                    String m682toStringimpl4 = Color.m682toStringimpl(this.fourInactive);
                    String m682toStringimpl5 = Color.m682toStringimpl(this.one);
                    String m682toStringimpl6 = Color.m682toStringimpl(this.oneInactive);
                    String m682toStringimpl7 = Color.m682toStringimpl(this.three);
                    String m682toStringimpl8 = Color.m682toStringimpl(this.threeInactive);
                    String m682toStringimpl9 = Color.m682toStringimpl(this.two);
                    String m682toStringimpl10 = Color.m682toStringimpl(this.twoInactive);
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OfFive(five=", m682toStringimpl, ", fiveInactive=", m682toStringimpl2, ", four=");
                    Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", fourInactive=", m682toStringimpl4, ", one=");
                    Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", oneInactive=", m682toStringimpl6, ", three=");
                    Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", threeInactive=", m682toStringimpl8, ", two=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl9, ", twoInactive=", m682toStringimpl10, ")");
                }
            }

            public final class OfFour {
                public final long four;
                public final long fourInactive;
                public final long one;
                public final long oneInactive;
                public final long three;
                public final long threeInactive;
                public final long two;
                public final long twoInactive;

                public OfFour(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
                    this.four = j;
                    this.fourInactive = j2;
                    this.one = j3;
                    this.oneInactive = j4;
                    this.three = j5;
                    this.threeInactive = j6;
                    this.two = j7;
                    this.twoInactive = j8;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OfFour)) {
                        return false;
                    }
                    OfFour ofFour = (OfFour) obj;
                    return Color.m676equalsimpl0(this.four, ofFour.four) && Color.m676equalsimpl0(this.fourInactive, ofFour.fourInactive) && Color.m676equalsimpl0(this.one, ofFour.one) && Color.m676equalsimpl0(this.oneInactive, ofFour.oneInactive) && Color.m676equalsimpl0(this.three, ofFour.three) && Color.m676equalsimpl0(this.threeInactive, ofFour.threeInactive) && Color.m676equalsimpl0(this.two, ofFour.two) && Color.m676equalsimpl0(this.twoInactive, ofFour.twoInactive);
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.twoInactive) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.four) * 31, 31, this.fourInactive), 31, this.one), 31, this.oneInactive), 31, this.three), 31, this.threeInactive), 31, this.two);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.four);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.fourInactive);
                    String m682toStringimpl3 = Color.m682toStringimpl(this.one);
                    String m682toStringimpl4 = Color.m682toStringimpl(this.oneInactive);
                    String m682toStringimpl5 = Color.m682toStringimpl(this.three);
                    String m682toStringimpl6 = Color.m682toStringimpl(this.threeInactive);
                    String m682toStringimpl7 = Color.m682toStringimpl(this.two);
                    String m682toStringimpl8 = Color.m682toStringimpl(this.twoInactive);
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OfFour(four=", m682toStringimpl, ", fourInactive=", m682toStringimpl2, ", one=");
                    Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", oneInactive=", m682toStringimpl4, ", three=");
                    Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", threeInactive=", m682toStringimpl6, ", two=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl7, ", twoInactive=", m682toStringimpl8, ")");
                }
            }

            public final class OfOne {
                public final long one;
                public final long oneInactive;

                public OfOne(long j, long j2) {
                    this.one = j;
                    this.oneInactive = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OfOne)) {
                        return false;
                    }
                    OfOne ofOne = (OfOne) obj;
                    return Color.m676equalsimpl0(this.one, ofOne.one) && Color.m676equalsimpl0(this.oneInactive, ofOne.oneInactive);
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.oneInactive) + (Long.hashCode(this.one) * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("OfOne(one=", Color.m682toStringimpl(this.one), ", oneInactive=", Color.m682toStringimpl(this.oneInactive), ")");
                }
            }

            public final class OfThree {
                public final long one;
                public final long oneInactive;
                public final long three;
                public final long threeInactive;
                public final long two;
                public final long twoInactive;

                public OfThree(long j, long j2, long j3, long j4, long j5, long j6) {
                    this.one = j;
                    this.oneInactive = j2;
                    this.three = j3;
                    this.threeInactive = j4;
                    this.two = j5;
                    this.twoInactive = j6;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OfThree)) {
                        return false;
                    }
                    OfThree ofThree = (OfThree) obj;
                    return Color.m676equalsimpl0(this.one, ofThree.one) && Color.m676equalsimpl0(this.oneInactive, ofThree.oneInactive) && Color.m676equalsimpl0(this.three, ofThree.three) && Color.m676equalsimpl0(this.threeInactive, ofThree.threeInactive) && Color.m676equalsimpl0(this.two, ofThree.two) && Color.m676equalsimpl0(this.twoInactive, ofThree.twoInactive);
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.twoInactive) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.one) * 31, 31, this.oneInactive), 31, this.three), 31, this.threeInactive), 31, this.two);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.one);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.oneInactive);
                    String m682toStringimpl3 = Color.m682toStringimpl(this.three);
                    String m682toStringimpl4 = Color.m682toStringimpl(this.threeInactive);
                    String m682toStringimpl5 = Color.m682toStringimpl(this.two);
                    String m682toStringimpl6 = Color.m682toStringimpl(this.twoInactive);
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OfThree(one=", m682toStringimpl, ", oneInactive=", m682toStringimpl2, ", three=");
                    Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", threeInactive=", m682toStringimpl4, ", two=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl5, ", twoInactive=", m682toStringimpl6, ")");
                }
            }

            public final class OfTwo {
                public final long one;
                public final long oneInactive;
                public final long two;
                public final long twoInactive;

                public OfTwo(long j, long j2, long j3, long j4) {
                    this.one = j;
                    this.oneInactive = j2;
                    this.two = j3;
                    this.twoInactive = j4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OfTwo)) {
                        return false;
                    }
                    OfTwo ofTwo = (OfTwo) obj;
                    return Color.m676equalsimpl0(this.one, ofTwo.one) && Color.m676equalsimpl0(this.oneInactive, ofTwo.oneInactive) && Color.m676equalsimpl0(this.two, ofTwo.two) && Color.m676equalsimpl0(this.twoInactive, ofTwo.twoInactive);
                }

                public final int hashCode() {
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.twoInactive) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.one) * 31, 31, this.oneInactive), 31, this.two);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.one);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.oneInactive);
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OfTwo(one=", m682toStringimpl, ", oneInactive=", m682toStringimpl2, ", two="), Color.m682toStringimpl(this.two), ", twoInactive=", Color.m682toStringimpl(this.twoInactive), ")");
                }
            }

            public Part(OfFive ofFive, OfFour ofFour, OfOne ofOne, OfThree ofThree, OfTwo ofTwo) {
                this.ofFive = ofFive;
                this.ofFour = ofFour;
                this.ofOne = ofOne;
                this.ofThree = ofThree;
                this.ofTwo = ofTwo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Part)) {
                    return false;
                }
                Part part = (Part) obj;
                return this.ofFive.equals(part.ofFive) && this.ofFour.equals(part.ofFour) && this.ofOne.equals(part.ofOne) && this.ofThree.equals(part.ofThree) && this.ofTwo.equals(part.ofTwo);
            }

            public final int hashCode() {
                return this.ofTwo.hashCode() + ((this.ofThree.hashCode() + ((this.ofOne.hashCode() + ((this.ofFour.hashCode() + (this.ofFive.hashCode() * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Part(ofFive=" + this.ofFive + ", ofFour=" + this.ofFour + ", ofOne=" + this.ofOne + ", ofThree=" + this.ofThree + ", ofTwo=" + this.ofTwo + ")";
            }
        }

        public final class Portion {
            public final long empty;
            public final long full;

            public Portion(long j, long j2) {
                this.empty = j;
                this.full = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Portion)) {
                    return false;
                }
                Portion portion = (Portion) obj;
                return Color.m676equalsimpl0(this.empty, portion.empty) && Color.m676equalsimpl0(this.full, portion.full);
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.full) + (Long.hashCode(this.empty) * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Portion(empty=", Color.m682toStringimpl(this.empty), ", full=", Color.m682toStringimpl(this.full), ")");
            }
        }

        public final class Trend {
            public final long negative;
            public final long positive;

            public Trend(long j, long j2) {
                this.negative = j;
                this.positive = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Trend)) {
                    return false;
                }
                Trend trend = (Trend) obj;
                return Color.m676equalsimpl0(this.negative, trend.negative) && Color.m676equalsimpl0(this.positive, trend.positive);
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.positive) + (Long.hashCode(this.negative) * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Trend(negative=", Color.m682toStringimpl(this.negative), ", positive=", Color.m682toStringimpl(this.positive), ")");
            }
        }

        public Data(Part part, Portion portion, Trend trend) {
            this.part = part;
            this.portion = portion;
            this.trend = trend;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.part.equals(data.part) && this.portion.equals(data.portion) && this.trend.equals(data.trend);
        }

        public final int hashCode() {
            return this.trend.hashCode() + ((this.portion.hashCode() + (this.part.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Data(part=" + this.part + ", portion=" + this.portion + ", trend=" + this.trend + ")";
        }
    }

    public final class Semantic {
        public final Accent accent;
        public final Background background;
        public final Border border;
        public final Icon icon;
        public final Service service;
        public final Text text;

        public final class Accent {
            public final long amber;
            public final long ocean;
            public final long pink;
            public final long purple;
            public final long royal;
            public final long scarlet;
            public final long sky;
            public final long sunshine;
            public final long turquoise;

            public Accent(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
                this.amber = j;
                this.ocean = j2;
                this.pink = j3;
                this.purple = j4;
                this.royal = j5;
                this.scarlet = j6;
                this.sky = j7;
                this.sunshine = j8;
                this.turquoise = j9;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Accent)) {
                    return false;
                }
                Accent accent = (Accent) obj;
                return Color.m676equalsimpl0(this.amber, accent.amber) && Color.m676equalsimpl0(this.ocean, accent.ocean) && Color.m676equalsimpl0(this.pink, accent.pink) && Color.m676equalsimpl0(this.purple, accent.purple) && Color.m676equalsimpl0(this.royal, accent.royal) && Color.m676equalsimpl0(this.scarlet, accent.scarlet) && Color.m676equalsimpl0(this.sky, accent.sky) && Color.m676equalsimpl0(this.sunshine, accent.sunshine) && Color.m676equalsimpl0(this.turquoise, accent.turquoise);
            }

            /* renamed from: getAmber-0d7_KjU, reason: not valid java name */
            public final long m3310getAmber0d7_KjU() {
                return this.amber;
            }

            /* renamed from: getOcean-0d7_KjU, reason: not valid java name */
            public final long m3311getOcean0d7_KjU() {
                return this.ocean;
            }

            /* renamed from: getPink-0d7_KjU, reason: not valid java name */
            public final long m3312getPink0d7_KjU() {
                return this.pink;
            }

            /* renamed from: getPurple-0d7_KjU, reason: not valid java name */
            public final long m3313getPurple0d7_KjU() {
                return this.purple;
            }

            /* renamed from: getRoyal-0d7_KjU, reason: not valid java name */
            public final long m3314getRoyal0d7_KjU() {
                return this.royal;
            }

            /* renamed from: getScarlet-0d7_KjU, reason: not valid java name */
            public final long m3315getScarlet0d7_KjU() {
                return this.scarlet;
            }

            /* renamed from: getSky-0d7_KjU, reason: not valid java name */
            public final long m3316getSky0d7_KjU() {
                return this.sky;
            }

            /* renamed from: getSunshine-0d7_KjU, reason: not valid java name */
            public final long m3317getSunshine0d7_KjU() {
                return this.sunshine;
            }

            /* renamed from: getTurquoise-0d7_KjU, reason: not valid java name */
            public final long m3318getTurquoise0d7_KjU() {
                return this.turquoise;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.turquoise) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.amber) * 31, 31, this.ocean), 31, this.pink), 31, this.purple), 31, this.royal), 31, this.scarlet), 31, this.sky), 31, this.sunshine);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.amber);
                String m682toStringimpl2 = Color.m682toStringimpl(this.ocean);
                String m682toStringimpl3 = Color.m682toStringimpl(this.pink);
                String m682toStringimpl4 = Color.m682toStringimpl(this.purple);
                String m682toStringimpl5 = Color.m682toStringimpl(this.royal);
                String m682toStringimpl6 = Color.m682toStringimpl(this.scarlet);
                String m682toStringimpl7 = Color.m682toStringimpl(this.sky);
                String m682toStringimpl8 = Color.m682toStringimpl(this.sunshine);
                String m682toStringimpl9 = Color.m682toStringimpl(this.turquoise);
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Accent(amber=", m682toStringimpl, ", ocean=", m682toStringimpl2, ", pink=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", purple=", m682toStringimpl4, ", royal=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", scarlet=", m682toStringimpl6, ", sky=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", sunshine=", m682toStringimpl8, ", turquoise=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl9, ")");
            }
        }

        public final class Background {

            /* renamed from: app, reason: collision with root package name */
            public final long f1047app;
            public final long brand;
            public final long danger;
            public final long extraProminent;
            public final long inverse;
            public final long inversePressed;
            public final long inverseRipple;
            public final long keypad;
            public final long notification;
            public final long prominent;
            public final long ripple;
            public final long standard;
            public final long subtle;
            public final long warning;

            public Background(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
                this.f1047app = j;
                this.brand = j2;
                this.danger = j3;
                this.extraProminent = j4;
                this.inverse = j5;
                this.inversePressed = j6;
                this.inverseRipple = j7;
                this.keypad = j8;
                this.notification = j9;
                this.prominent = j10;
                this.ripple = j11;
                this.standard = j12;
                this.subtle = j13;
                this.warning = j14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Background)) {
                    return false;
                }
                Background background = (Background) obj;
                return Color.m676equalsimpl0(this.f1047app, background.f1047app) && Color.m676equalsimpl0(this.brand, background.brand) && Color.m676equalsimpl0(this.danger, background.danger) && Color.m676equalsimpl0(this.extraProminent, background.extraProminent) && Color.m676equalsimpl0(this.inverse, background.inverse) && Color.m676equalsimpl0(this.inversePressed, background.inversePressed) && Color.m676equalsimpl0(this.inverseRipple, background.inverseRipple) && Color.m676equalsimpl0(this.keypad, background.keypad) && Color.m676equalsimpl0(this.notification, background.notification) && Color.m676equalsimpl0(this.prominent, background.prominent) && Color.m676equalsimpl0(this.ripple, background.ripple) && Color.m676equalsimpl0(this.standard, background.standard) && Color.m676equalsimpl0(this.subtle, background.subtle) && Color.m676equalsimpl0(this.warning, background.warning);
            }

            /* renamed from: getBrand-0d7_KjU, reason: not valid java name */
            public final long m3319getBrand0d7_KjU() {
                return this.brand;
            }

            /* renamed from: getDanger-0d7_KjU, reason: not valid java name */
            public final long m3320getDanger0d7_KjU() {
                return this.danger;
            }

            /* renamed from: getExtraProminent-0d7_KjU, reason: not valid java name */
            public final long m3321getExtraProminent0d7_KjU() {
                return this.extraProminent;
            }

            /* renamed from: getInversePressed-0d7_KjU, reason: not valid java name */
            public final long m3322getInversePressed0d7_KjU() {
                return this.inversePressed;
            }

            /* renamed from: getInverseRipple-0d7_KjU, reason: not valid java name */
            public final long m3323getInverseRipple0d7_KjU() {
                return this.inverseRipple;
            }

            /* renamed from: getKeypad-0d7_KjU, reason: not valid java name */
            public final long m3324getKeypad0d7_KjU() {
                return this.keypad;
            }

            /* renamed from: getNotification-0d7_KjU, reason: not valid java name */
            public final long m3325getNotification0d7_KjU() {
                return this.notification;
            }

            /* renamed from: getProminent-0d7_KjU, reason: not valid java name */
            public final long m3326getProminent0d7_KjU() {
                return this.prominent;
            }

            /* renamed from: getRipple-0d7_KjU, reason: not valid java name */
            public final long m3327getRipple0d7_KjU() {
                return this.ripple;
            }

            /* renamed from: getWarning-0d7_KjU, reason: not valid java name */
            public final long m3328getWarning0d7_KjU() {
                return this.warning;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.warning) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f1047app) * 31, 31, this.brand), 31, this.danger), 31, this.extraProminent), 31, this.inverse), 31, this.inversePressed), 31, this.inverseRipple), 31, this.keypad), 31, this.notification), 31, this.prominent), 31, this.ripple), 31, this.standard), 31, this.subtle);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.f1047app);
                String m682toStringimpl2 = Color.m682toStringimpl(this.brand);
                String m682toStringimpl3 = Color.m682toStringimpl(this.danger);
                String m682toStringimpl4 = Color.m682toStringimpl(this.extraProminent);
                String m682toStringimpl5 = Color.m682toStringimpl(this.inverse);
                String m682toStringimpl6 = Color.m682toStringimpl(this.inversePressed);
                String m682toStringimpl7 = Color.m682toStringimpl(this.inverseRipple);
                String m682toStringimpl8 = Color.m682toStringimpl(this.keypad);
                String m682toStringimpl9 = Color.m682toStringimpl(this.notification);
                String m682toStringimpl10 = Color.m682toStringimpl(this.prominent);
                String m682toStringimpl11 = Color.m682toStringimpl(this.ripple);
                String m682toStringimpl12 = Color.m682toStringimpl(this.standard);
                String m682toStringimpl13 = Color.m682toStringimpl(this.subtle);
                String m682toStringimpl14 = Color.m682toStringimpl(this.warning);
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(app=", m682toStringimpl, ", brand=", m682toStringimpl2, ", danger=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", extraProminent=", m682toStringimpl4, ", inverse=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", inversePressed=", m682toStringimpl6, ", inverseRipple=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", keypad=", m682toStringimpl8, ", notification=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl9, ", prominent=", m682toStringimpl10, ", ripple=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl11, ", standard=", m682toStringimpl12, ", subtle=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl13, ", warning=", m682toStringimpl14, ")");
            }
        }

        public final class Border {

            /* renamed from: app, reason: collision with root package name */
            public final long f1048app;
            public final long brand;
            public final long danger;
            public final long inverse;
            public final long prominent;
            public final long standard;
            public final long subtle;
            public final long success;
            public final long warning;

            public Border(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
                this.f1048app = j;
                this.brand = j2;
                this.danger = j3;
                this.inverse = j4;
                this.prominent = j5;
                this.standard = j6;
                this.subtle = j7;
                this.success = j8;
                this.warning = j9;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Border)) {
                    return false;
                }
                Border border = (Border) obj;
                return Color.m676equalsimpl0(this.f1048app, border.f1048app) && Color.m676equalsimpl0(this.brand, border.brand) && Color.m676equalsimpl0(this.danger, border.danger) && Color.m676equalsimpl0(this.inverse, border.inverse) && Color.m676equalsimpl0(this.prominent, border.prominent) && Color.m676equalsimpl0(this.standard, border.standard) && Color.m676equalsimpl0(this.subtle, border.subtle) && Color.m676equalsimpl0(this.success, border.success) && Color.m676equalsimpl0(this.warning, border.warning);
            }

            /* renamed from: getApp-0d7_KjU, reason: not valid java name */
            public final long m3329getApp0d7_KjU() {
                return this.f1048app;
            }

            /* renamed from: getBrand-0d7_KjU, reason: not valid java name */
            public final long m3330getBrand0d7_KjU() {
                return this.brand;
            }

            /* renamed from: getDanger-0d7_KjU, reason: not valid java name */
            public final long m3331getDanger0d7_KjU() {
                return this.danger;
            }

            /* renamed from: getSuccess-0d7_KjU, reason: not valid java name */
            public final long m3332getSuccess0d7_KjU() {
                return this.success;
            }

            /* renamed from: getWarning-0d7_KjU, reason: not valid java name */
            public final long m3333getWarning0d7_KjU() {
                return this.warning;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.warning) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f1048app) * 31, 31, this.brand), 31, this.danger), 31, this.inverse), 31, this.prominent), 31, this.standard), 31, this.subtle), 31, this.success);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.f1048app);
                String m682toStringimpl2 = Color.m682toStringimpl(this.brand);
                String m682toStringimpl3 = Color.m682toStringimpl(this.danger);
                String m682toStringimpl4 = Color.m682toStringimpl(this.inverse);
                String m682toStringimpl5 = Color.m682toStringimpl(this.prominent);
                String m682toStringimpl6 = Color.m682toStringimpl(this.standard);
                String m682toStringimpl7 = Color.m682toStringimpl(this.subtle);
                String m682toStringimpl8 = Color.m682toStringimpl(this.success);
                String m682toStringimpl9 = Color.m682toStringimpl(this.warning);
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Border(app=", m682toStringimpl, ", brand=", m682toStringimpl2, ", danger=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", inverse=", m682toStringimpl4, ", prominent=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", standard=", m682toStringimpl6, ", subtle=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", success=", m682toStringimpl8, ", warning=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl9, ")");
            }
        }

        public final class Icon {
            public final long brand;
            public final long danger;
            public final long disabled;
            public final long extraSubtle;
            public final long info;
            public final long inverse;
            public final long prominent;
            public final long standard;
            public final long subtle;
            public final long success;
            public final long warning;

            public Icon(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
                this.brand = j;
                this.danger = j2;
                this.disabled = j3;
                this.extraSubtle = j4;
                this.info = j5;
                this.inverse = j6;
                this.prominent = j7;
                this.standard = j8;
                this.subtle = j9;
                this.success = j10;
                this.warning = j11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return Color.m676equalsimpl0(this.brand, icon.brand) && Color.m676equalsimpl0(this.danger, icon.danger) && Color.m676equalsimpl0(this.disabled, icon.disabled) && Color.m676equalsimpl0(this.extraSubtle, icon.extraSubtle) && Color.m676equalsimpl0(this.info, icon.info) && Color.m676equalsimpl0(this.inverse, icon.inverse) && Color.m676equalsimpl0(this.prominent, icon.prominent) && Color.m676equalsimpl0(this.standard, icon.standard) && Color.m676equalsimpl0(this.subtle, icon.subtle) && Color.m676equalsimpl0(this.success, icon.success) && Color.m676equalsimpl0(this.warning, icon.warning);
            }

            /* renamed from: getBrand-0d7_KjU, reason: not valid java name */
            public final long m3334getBrand0d7_KjU() {
                return this.brand;
            }

            /* renamed from: getDanger-0d7_KjU, reason: not valid java name */
            public final long m3335getDanger0d7_KjU() {
                return this.danger;
            }

            /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
            public final long m3336getDisabled0d7_KjU() {
                return this.disabled;
            }

            /* renamed from: getExtraSubtle-0d7_KjU, reason: not valid java name */
            public final long m3337getExtraSubtle0d7_KjU() {
                return this.extraSubtle;
            }

            /* renamed from: getInfo-0d7_KjU, reason: not valid java name */
            public final long m3338getInfo0d7_KjU() {
                return this.info;
            }

            /* renamed from: getProminent-0d7_KjU, reason: not valid java name */
            public final long m3339getProminent0d7_KjU() {
                return this.prominent;
            }

            /* renamed from: getSubtle-0d7_KjU, reason: not valid java name */
            public final long m3340getSubtle0d7_KjU() {
                return this.subtle;
            }

            /* renamed from: getSuccess-0d7_KjU, reason: not valid java name */
            public final long m3341getSuccess0d7_KjU() {
                return this.success;
            }

            /* renamed from: getWarning-0d7_KjU, reason: not valid java name */
            public final long m3342getWarning0d7_KjU() {
                return this.warning;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.warning) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.brand) * 31, 31, this.danger), 31, this.disabled), 31, this.extraSubtle), 31, this.info), 31, this.inverse), 31, this.prominent), 31, this.standard), 31, this.subtle), 31, this.success);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.brand);
                String m682toStringimpl2 = Color.m682toStringimpl(this.danger);
                String m682toStringimpl3 = Color.m682toStringimpl(this.disabled);
                String m682toStringimpl4 = Color.m682toStringimpl(this.extraSubtle);
                String m682toStringimpl5 = Color.m682toStringimpl(this.info);
                String m682toStringimpl6 = Color.m682toStringimpl(this.inverse);
                String m682toStringimpl7 = Color.m682toStringimpl(this.prominent);
                String m682toStringimpl8 = Color.m682toStringimpl(this.standard);
                String m682toStringimpl9 = Color.m682toStringimpl(this.subtle);
                String m682toStringimpl10 = Color.m682toStringimpl(this.success);
                String m682toStringimpl11 = Color.m682toStringimpl(this.warning);
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Icon(brand=", m682toStringimpl, ", danger=", m682toStringimpl2, ", disabled=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", extraSubtle=", m682toStringimpl4, ", info=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", inverse=", m682toStringimpl6, ", prominent=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", standard=", m682toStringimpl8, ", subtle=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl9, ", success=", m682toStringimpl10, ", warning=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl11, ")");
            }
        }

        public final class Service {
            public final long bitcoin;
            public final long bitcoinBackground;
            public final long bitcoinOrange;
            public final long bitcoinPressed;
            public final long borrow;
            public final long investing;
            public final long taxes;
            public final long taxesBackground;

            public Service(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
                this.bitcoin = j;
                this.bitcoinBackground = j2;
                this.bitcoinOrange = j3;
                this.bitcoinPressed = j4;
                this.borrow = j5;
                this.investing = j6;
                this.taxes = j7;
                this.taxesBackground = j8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Service)) {
                    return false;
                }
                Service service = (Service) obj;
                return Color.m676equalsimpl0(this.bitcoin, service.bitcoin) && Color.m676equalsimpl0(this.bitcoinBackground, service.bitcoinBackground) && Color.m676equalsimpl0(this.bitcoinOrange, service.bitcoinOrange) && Color.m676equalsimpl0(this.bitcoinPressed, service.bitcoinPressed) && Color.m676equalsimpl0(this.borrow, service.borrow) && Color.m676equalsimpl0(this.investing, service.investing) && Color.m676equalsimpl0(this.taxes, service.taxes) && Color.m676equalsimpl0(this.taxesBackground, service.taxesBackground);
            }

            /* renamed from: getBitcoin-0d7_KjU, reason: not valid java name */
            public final long m3343getBitcoin0d7_KjU() {
                return this.bitcoin;
            }

            /* renamed from: getBitcoinOrange-0d7_KjU, reason: not valid java name */
            public final long m3344getBitcoinOrange0d7_KjU() {
                return this.bitcoinOrange;
            }

            /* renamed from: getBitcoinPressed-0d7_KjU, reason: not valid java name */
            public final long m3345getBitcoinPressed0d7_KjU() {
                return this.bitcoinPressed;
            }

            /* renamed from: getBorrow-0d7_KjU, reason: not valid java name */
            public final long m3346getBorrow0d7_KjU() {
                return this.borrow;
            }

            /* renamed from: getTaxesBackground-0d7_KjU, reason: not valid java name */
            public final long m3347getTaxesBackground0d7_KjU() {
                return this.taxesBackground;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.taxesBackground) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.bitcoin) * 31, 31, this.bitcoinBackground), 31, this.bitcoinOrange), 31, this.bitcoinPressed), 31, this.borrow), 31, this.investing), 31, this.taxes);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.bitcoin);
                String m682toStringimpl2 = Color.m682toStringimpl(this.bitcoinBackground);
                String m682toStringimpl3 = Color.m682toStringimpl(this.bitcoinOrange);
                String m682toStringimpl4 = Color.m682toStringimpl(this.bitcoinPressed);
                String m682toStringimpl5 = Color.m682toStringimpl(this.borrow);
                String m682toStringimpl6 = Color.m682toStringimpl(this.investing);
                String m682toStringimpl7 = Color.m682toStringimpl(this.taxes);
                String m682toStringimpl8 = Color.m682toStringimpl(this.taxesBackground);
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Service(bitcoin=", m682toStringimpl, ", bitcoinBackground=", m682toStringimpl2, ", bitcoinOrange=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", bitcoinPressed=", m682toStringimpl4, ", borrow=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", investing=", m682toStringimpl6, ", taxes=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl7, ", taxesBackground=", m682toStringimpl8, ")");
            }
        }

        public final class Text {
            public final long brand;
            public final long danger;
            public final long disabled;
            public final long inverse;
            public final long link;
            public final long linkVisited;
            public final long placeholder;
            public final long prominent;
            public final long standard;
            public final long subtle;
            public final long success;
            public final long warning;

            public Text(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
                this.brand = j;
                this.danger = j2;
                this.disabled = j3;
                this.inverse = j4;
                this.link = j5;
                this.linkVisited = j6;
                this.placeholder = j7;
                this.prominent = j8;
                this.standard = j9;
                this.subtle = j10;
                this.success = j11;
                this.warning = j12;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Text)) {
                    return false;
                }
                Text text = (Text) obj;
                return Color.m676equalsimpl0(this.brand, text.brand) && Color.m676equalsimpl0(this.danger, text.danger) && Color.m676equalsimpl0(this.disabled, text.disabled) && Color.m676equalsimpl0(this.inverse, text.inverse) && Color.m676equalsimpl0(this.link, text.link) && Color.m676equalsimpl0(this.linkVisited, text.linkVisited) && Color.m676equalsimpl0(this.placeholder, text.placeholder) && Color.m676equalsimpl0(this.prominent, text.prominent) && Color.m676equalsimpl0(this.standard, text.standard) && Color.m676equalsimpl0(this.subtle, text.subtle) && Color.m676equalsimpl0(this.success, text.success) && Color.m676equalsimpl0(this.warning, text.warning);
            }

            /* renamed from: getBrand-0d7_KjU, reason: not valid java name */
            public final long m3348getBrand0d7_KjU() {
                return this.brand;
            }

            /* renamed from: getDanger-0d7_KjU, reason: not valid java name */
            public final long m3349getDanger0d7_KjU() {
                return this.danger;
            }

            /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
            public final long m3350getDisabled0d7_KjU() {
                return this.disabled;
            }

            /* renamed from: getInverse-0d7_KjU, reason: not valid java name */
            public final long m3351getInverse0d7_KjU() {
                return this.inverse;
            }

            /* renamed from: getLink-0d7_KjU, reason: not valid java name */
            public final long m3352getLink0d7_KjU() {
                return this.link;
            }

            /* renamed from: getLinkVisited-0d7_KjU, reason: not valid java name */
            public final long m3353getLinkVisited0d7_KjU() {
                return this.linkVisited;
            }

            /* renamed from: getProminent-0d7_KjU, reason: not valid java name */
            public final long m3354getProminent0d7_KjU() {
                return this.prominent;
            }

            /* renamed from: getStandard-0d7_KjU, reason: not valid java name */
            public final long m3355getStandard0d7_KjU() {
                return this.standard;
            }

            /* renamed from: getSubtle-0d7_KjU, reason: not valid java name */
            public final long m3356getSubtle0d7_KjU() {
                return this.subtle;
            }

            /* renamed from: getSuccess-0d7_KjU, reason: not valid java name */
            public final long m3357getSuccess0d7_KjU() {
                return this.success;
            }

            /* renamed from: getWarning-0d7_KjU, reason: not valid java name */
            public final long m3358getWarning0d7_KjU() {
                return this.warning;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.warning) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.brand) * 31, 31, this.danger), 31, this.disabled), 31, this.inverse), 31, this.link), 31, this.linkVisited), 31, this.placeholder), 31, this.prominent), 31, this.standard), 31, this.subtle), 31, this.success);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.brand);
                String m682toStringimpl2 = Color.m682toStringimpl(this.danger);
                String m682toStringimpl3 = Color.m682toStringimpl(this.disabled);
                String m682toStringimpl4 = Color.m682toStringimpl(this.inverse);
                String m682toStringimpl5 = Color.m682toStringimpl(this.link);
                String m682toStringimpl6 = Color.m682toStringimpl(this.linkVisited);
                String m682toStringimpl7 = Color.m682toStringimpl(this.placeholder);
                String m682toStringimpl8 = Color.m682toStringimpl(this.prominent);
                String m682toStringimpl9 = Color.m682toStringimpl(this.standard);
                String m682toStringimpl10 = Color.m682toStringimpl(this.subtle);
                String m682toStringimpl11 = Color.m682toStringimpl(this.success);
                String m682toStringimpl12 = Color.m682toStringimpl(this.warning);
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(brand=", m682toStringimpl, ", danger=", m682toStringimpl2, ", disabled=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", inverse=", m682toStringimpl4, ", link=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", linkVisited=", m682toStringimpl6, ", placeholder=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", prominent=", m682toStringimpl8, ", standard=");
                Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl9, ", subtle=", m682toStringimpl10, ", success=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl11, ", warning=", m682toStringimpl12, ")");
            }
        }

        public Semantic(Accent accent, Background background, Border border, Icon icon, Service service, Text text) {
            this.accent = accent;
            this.background = background;
            this.border = border;
            this.icon = icon;
            this.service = service;
            this.text = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Semantic)) {
                return false;
            }
            Semantic semantic = (Semantic) obj;
            return this.accent.equals(semantic.accent) && this.background.equals(semantic.background) && this.border.equals(semantic.border) && this.icon.equals(semantic.icon) && this.service.equals(semantic.service) && this.text.equals(semantic.text);
        }

        public final Accent getAccent() {
            return this.accent;
        }

        public final Background getBackground() {
            return this.background;
        }

        public final Border getBorder() {
            return this.border;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final Service getService() {
            return this.service;
        }

        public final Text getText() {
            return this.text;
        }

        public final int hashCode() {
            return this.text.hashCode() + ((this.service.hashCode() + ((this.icon.hashCode() + ((this.border.hashCode() + ((this.background.hashCode() + (this.accent.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Semantic(accent=" + this.accent + ", background=" + this.background + ", border=" + this.border + ", icon=" + this.icon + ", service=" + this.service + ", text=" + this.text + ")";
        }
    }

    public final class Surface {
        public final Keypad keypad;
        public final Money money;

        public final class Keypad {
            public final long background;
            public final Button button;
            public final long icon;
            public final long text;

            public final class Button {
                public final Background background;
                public final long icon;
                public final long text;

                public final class Background {

                    /* renamed from: default, reason: not valid java name */
                    public final long f228default;

                    public Background(long j) {
                        this.f228default = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Background) && Color.m676equalsimpl0(this.f228default, ((Background) obj).f228default);
                    }

                    /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                    public final long m3363getDefault0d7_KjU() {
                        return this.f228default;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.f228default);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", Color.m682toStringimpl(this.f228default), ")");
                    }
                }

                public Button(Background background, long j, long j2) {
                    this.background = background;
                    this.icon = j;
                    this.text = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return this.background.equals(button.background) && Color.m676equalsimpl0(this.icon, button.icon) && Color.m676equalsimpl0(this.text, button.text);
                }

                public final Background getBackground() {
                    return this.background;
                }

                /* renamed from: getIcon-0d7_KjU, reason: not valid java name */
                public final long m3361getIcon0d7_KjU() {
                    return this.icon;
                }

                /* renamed from: getText-0d7_KjU, reason: not valid java name */
                public final long m3362getText0d7_KjU() {
                    return this.text;
                }

                public final int hashCode() {
                    int hashCode = this.background.hashCode() * 31;
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return Long.hashCode(this.text) + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.icon);
                }

                public final String toString() {
                    String m682toStringimpl = Color.m682toStringimpl(this.icon);
                    String m682toStringimpl2 = Color.m682toStringimpl(this.text);
                    StringBuilder sb = new StringBuilder("Button(background=");
                    sb.append(this.background);
                    sb.append(", icon=");
                    sb.append(m682toStringimpl);
                    sb.append(", text=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl2, ")");
                }
            }

            public Keypad(long j, Button button, long j2, long j3) {
                this.background = j;
                this.button = button;
                this.icon = j2;
                this.text = j3;
            }

            /* renamed from: copy-nb2GgbA$default, reason: not valid java name */
            public static Keypad m3359copynb2GgbA$default(Keypad keypad, long j, long j2, long j3, int i) {
                long j4 = j2;
                Button button = keypad.button;
                if ((i & 4) != 0) {
                    j4 = keypad.icon;
                }
                return new Keypad(j, button, j4, j3);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Keypad)) {
                    return false;
                }
                Keypad keypad = (Keypad) obj;
                return Color.m676equalsimpl0(this.background, keypad.background) && this.button.equals(keypad.button) && Color.m676equalsimpl0(this.icon, keypad.icon) && Color.m676equalsimpl0(this.text, keypad.text);
            }

            /* renamed from: getIcon-0d7_KjU, reason: not valid java name */
            public final long m3360getIcon0d7_KjU() {
                return this.icon;
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.text) + Recorder$$ExternalSyntheticOutline2.m((this.button.hashCode() + (Long.hashCode(this.background) * 31)) * 31, 31, this.icon);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.background);
                String m682toStringimpl2 = Color.m682toStringimpl(this.icon);
                String m682toStringimpl3 = Color.m682toStringimpl(this.text);
                StringBuilder sb = new StringBuilder("Keypad(background=");
                sb.append(m682toStringimpl);
                sb.append(", button=");
                sb.append(this.button);
                sb.append(", icon=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl2, ", text=", m682toStringimpl3, ")");
            }
        }

        public final class Money {
            public final Applet applet;
            public final long background;
            public final Ui ui;

            public final class Applet {
                public final Asset asset;
                public final long background;
                public final Button button;
                public final Data data;

                public final class Asset {
                    public final long background;

                    public Asset(long j) {
                        this.background = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Asset) && Color.m676equalsimpl0(this.background, ((Asset) obj).background);
                    }

                    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                    public final long m3366getBackground0d7_KjU() {
                        return this.background;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.background);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Asset(background=", Color.m682toStringimpl(this.background), ")");
                    }
                }

                public final class Button {
                    public final Background background;
                    public final Text text;

                    public final class Background {

                        /* renamed from: default, reason: not valid java name */
                        public final long f229default;
                        public final long disabled;
                        public final long pressed;

                        public Background(long j, long j2, long j3) {
                            this.f229default = j;
                            this.disabled = j2;
                            this.pressed = j3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Background)) {
                                return false;
                            }
                            Background background = (Background) obj;
                            return Color.m676equalsimpl0(this.f229default, background.f229default) && Color.m676equalsimpl0(this.disabled, background.disabled) && Color.m676equalsimpl0(this.pressed, background.pressed);
                        }

                        /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                        public final long m3367getDefault0d7_KjU() {
                            return this.f229default;
                        }

                        /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                        public final long m3368getDisabled0d7_KjU() {
                            return this.disabled;
                        }

                        /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
                        public final long m3369getPressed0d7_KjU() {
                            return this.pressed;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.pressed) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.f229default) * 31, 31, this.disabled);
                        }

                        public final String toString() {
                            String m682toStringimpl = Color.m682toStringimpl(this.f229default);
                            String m682toStringimpl2 = Color.m682toStringimpl(this.disabled);
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(default=", m682toStringimpl, ", disabled=", m682toStringimpl2, ", pressed="), Color.m682toStringimpl(this.pressed), ")");
                        }
                    }

                    public final class Text {

                        /* renamed from: default, reason: not valid java name */
                        public final long f230default;
                        public final long disabled;

                        public Text(long j, long j2) {
                            this.f230default = j;
                            this.disabled = j2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Text)) {
                                return false;
                            }
                            Text text = (Text) obj;
                            return Color.m676equalsimpl0(this.f230default, text.f230default) && Color.m676equalsimpl0(this.disabled, text.disabled);
                        }

                        /* renamed from: getDefault-0d7_KjU, reason: not valid java name */
                        public final long m3370getDefault0d7_KjU() {
                            return this.f230default;
                        }

                        /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
                        public final long m3371getDisabled0d7_KjU() {
                            return this.disabled;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.disabled) + (Long.hashCode(this.f230default) * 31);
                        }

                        public final String toString() {
                            return Boxes$$ExternalSyntheticOutline1.m("Text(default=", Color.m682toStringimpl(this.f230default), ", disabled=", Color.m682toStringimpl(this.disabled), ")");
                        }
                    }

                    public Button(Background background, Text text) {
                        this.background = background;
                        this.text = text;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Button)) {
                            return false;
                        }
                        Button button = (Button) obj;
                        return this.background.equals(button.background) && this.text.equals(button.text);
                    }

                    public final int hashCode() {
                        return this.text.hashCode() + (this.background.hashCode() * 31);
                    }

                    public final String toString() {
                        return "Button(background=" + this.background + ", text=" + this.text + ")";
                    }
                }

                public final class Data {
                    public final Active active;
                    public final Inactive inactive;

                    public final class Active {
                        public final long border;

                        public Active(long j) {
                            this.border = j;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Active) && Color.m676equalsimpl0(this.border, ((Active) obj).border);
                        }

                        /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                        public final long m3372getBorder0d7_KjU() {
                            return this.border;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.border);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Active(border=", Color.m682toStringimpl(this.border), ")");
                        }
                    }

                    public final class Inactive {
                        public final long border;

                        public Inactive(long j) {
                            this.border = j;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Inactive) && Color.m676equalsimpl0(this.border, ((Inactive) obj).border);
                        }

                        /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                        public final long m3373getBorder0d7_KjU() {
                            return this.border;
                        }

                        public final int hashCode() {
                            int i = Color.$r8$clinit;
                            ULong.Companion companion = ULong.Companion;
                            return Long.hashCode(this.border);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Inactive(border=", Color.m682toStringimpl(this.border), ")");
                        }
                    }

                    public Data(Active active, Inactive inactive) {
                        this.active = active;
                        this.inactive = inactive;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Data)) {
                            return false;
                        }
                        Data data = (Data) obj;
                        return this.active.equals(data.active) && this.inactive.equals(data.inactive);
                    }

                    public final Active getActive() {
                        return this.active;
                    }

                    public final Inactive getInactive() {
                        return this.inactive;
                    }

                    public final int hashCode() {
                        return this.inactive.hashCode() + (this.active.hashCode() * 31);
                    }

                    public final String toString() {
                        return "Data(active=" + this.active + ", inactive=" + this.inactive + ")";
                    }
                }

                public Applet(Asset asset, long j, Button button, Data data) {
                    this.asset = asset;
                    this.background = j;
                    this.button = button;
                    this.data = data;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Applet)) {
                        return false;
                    }
                    Applet applet = (Applet) obj;
                    return this.asset.equals(applet.asset) && Color.m676equalsimpl0(this.background, applet.background) && this.button.equals(applet.button) && this.data.equals(applet.data);
                }

                public final Asset getAsset() {
                    return this.asset;
                }

                /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
                public final long m3365getBackground0d7_KjU() {
                    return this.background;
                }

                public final int hashCode() {
                    int hashCode = this.asset.hashCode() * 31;
                    int i = Color.$r8$clinit;
                    ULong.Companion companion = ULong.Companion;
                    return this.data.hashCode() + ((this.button.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.background)) * 31);
                }

                public final String toString() {
                    return "Applet(asset=" + this.asset + ", background=" + Color.m682toStringimpl(this.background) + ", button=" + this.button + ", data=" + this.data + ")";
                }
            }

            public final class Ui {
                public final Divider divider;

                public final class Divider {
                    public final long border;

                    public Divider(long j) {
                        this.border = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Divider) && Color.m676equalsimpl0(this.border, ((Divider) obj).border);
                    }

                    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
                    public final long m3374getBorder0d7_KjU() {
                        return this.border;
                    }

                    public final int hashCode() {
                        int i = Color.$r8$clinit;
                        ULong.Companion companion = ULong.Companion;
                        return Long.hashCode(this.border);
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Divider(border=", Color.m682toStringimpl(this.border), ")");
                    }
                }

                public Ui(Divider divider) {
                    this.divider = divider;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Ui) && this.divider.equals(((Ui) obj).divider);
                }

                public final Divider getDivider() {
                    return this.divider;
                }

                public final int hashCode() {
                    return this.divider.hashCode();
                }

                public final String toString() {
                    return "Ui(divider=" + this.divider + ")";
                }
            }

            public Money(Applet applet, long j, Ui ui) {
                this.applet = applet;
                this.background = j;
                this.ui = ui;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Money)) {
                    return false;
                }
                Money money = (Money) obj;
                return this.applet.equals(money.applet) && Color.m676equalsimpl0(this.background, money.background) && this.ui.equals(money.ui);
            }

            public final Applet getApplet() {
                return this.applet;
            }

            /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
            public final long m3364getBackground0d7_KjU() {
                return this.background;
            }

            public final Ui getUi() {
                return this.ui;
            }

            public final int hashCode() {
                int hashCode = this.applet.hashCode() * 31;
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.ui.divider.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.background);
            }

            public final String toString() {
                return "Money(applet=" + this.applet + ", background=" + Color.m682toStringimpl(this.background) + ", ui=" + this.ui + ")";
            }
        }

        public Surface(Keypad keypad, Money money) {
            this.keypad = keypad;
            this.money = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Surface)) {
                return false;
            }
            Surface surface = (Surface) obj;
            return this.keypad.equals(surface.keypad) && this.money.equals(surface.money);
        }

        public final Keypad getKeypad() {
            return this.keypad;
        }

        public final Money getMoney() {
            return this.money;
        }

        public final int hashCode() {
            return this.money.hashCode() + (this.keypad.hashCode() * 31);
        }

        public final String toString() {
            return "Surface(keypad=" + this.keypad + ", money=" + this.money + ")";
        }
    }

    public Colors(boolean z, Base base, Semantic semantic, Component component, Surface surface, Data data) {
        this.isLight = z;
        this.base = base;
        this.semantic = semantic;
        this.component = component;
        this.surface = surface;
        this.data = data;
    }

    public static Colors copy$default(Colors colors, Component component, Surface surface, int i) {
        boolean z = colors.isLight;
        Base base = colors.base;
        Semantic semantic = colors.semantic;
        if ((i & 16) != 0) {
            surface = colors.surface;
        }
        Data data = colors.data;
        colors.getClass();
        return new Colors(z, base, semantic, component, surface, data);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Colors)) {
            return false;
        }
        Colors colors = (Colors) obj;
        return this.isLight == colors.isLight && this.base.equals(colors.base) && this.semantic.equals(colors.semantic) && this.component.equals(colors.component) && this.surface.equals(colors.surface) && this.data.equals(colors.data);
    }

    public final Base getBase() {
        return this.base;
    }

    public final Component getComponent() {
        return this.component;
    }

    public final Semantic getSemantic() {
        return this.semantic;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    public final int hashCode() {
        return this.data.hashCode() + ((this.surface.hashCode() + ((this.component.hashCode() + ((this.semantic.hashCode() + ((this.base.hashCode() + (Boolean.hashCode(this.isLight) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Colors(isLight=" + this.isLight + ", base=" + this.base + ", semantic=" + this.semantic + ", component=" + this.component + ", surface=" + this.surface + ", data=" + this.data + ")";
    }
}
