package com.netcetera.threeds.sdk.infrastructure;

import android.R;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes5.dex */
public class ay implements Runnable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int[] ThreeDS2ServiceInstance;
    private static int createTransaction;
    private static int initialize;
    private final at get;
    private final String getWarnings;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ThreeDS2Service = 0;
        createTransaction = 1;
        initialize = 1141902519;
        ThreeDS2ServiceInstance = new int[]{389419798, 158192846, -955457088, 1106413060, 1803683046, 1133330106, -835270418, -710624710, -1460595899, -1350647440, 862798585, 911563326, -70489666, 1468781232, 1927295845, 731140419, 1141286982, -1030884650};
    }

    public ay(at atVar, String str) {
        this.get = atVar;
        this.getWarnings = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x1268, code lost:
    
        r0 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x126c, code lost:
    
        if (r0 >= 28) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x126e, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.ay.ThreeDS2Service = (com.netcetera.threeds.sdk.infrastructure.ay.createTransaction + 87) % 128;
        r7 = r45[r0];
        r8 = new java.lang.Object[1];
        c(new int[]{-328625986, 642225615, 1728412407, 1518923829, -1069065809, 561644980}, 12 - android.view.View.getDefaultSize(0, 0), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x129d, code lost:
    
        r7 = new java.lang.Object[]{((java.lang.String) r8[0]).intern().concat(java.lang.String.valueOf(r7))};
        r9 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r8 = r9.get(-108371147);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x12ae, code lost:
    
        if (r8 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x12b0, code lost:
    
        r25 = r3;
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x1301, code lost:
    
        r13 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r7)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x130e, code lost:
    
        r50 = r13 ^ (-1);
        r13 = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m(983, (((-216472072) | r22) ^ (-1)) | (((-216472072) | r13) ^ (-1)), ((-983) * ((-216472072) | ((r50 | r22) ^ (-1)))) + (((216472071 | r50) * 983) + ((984 * r13) - 425367619515L)), 282847148);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x138f, code lost:
    
        if (((((int) (r13 >> 32)) & androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1.m((-845287511) | r25, -828, (((~(r25 | (-845287511))) | (-2012453375)) * (-828)) + 1754752898, -181610968)) | (((int) r13) & ((((~((-1605403973) | r83)) | (-1605739862)) * 433) + ((((~((-1252336914) | r83)) | (-1605403973)) * (-433)) + (((~(r25 | (-353402949))) * 433) + 303559698))))) != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x1391, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x1394, code lost:
    
        r6 = r6 + r3;
        r0 = r0 + 1;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x1393, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x12b4, code lost:
    
        r13 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(48 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1), 2753 - android.view.MotionEvent.axisFromString(""));
        r14 = new java.lang.Object[1];
        r25 = r3;
        a(com.netcetera.threeds.sdk.infrastructure.ay.$$a[6], 29, 20, r14);
        r3 = r13.getMethod((java.lang.String) r14[0], java.lang.String.class);
        r9.put(-108371147, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x139b, code lost:
    
        r25 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x13a5, code lost:
    
        if (r6 < 25.2d) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x13a7, code lost:
    
        r0 = new java.lang.Object[]{new int[]{r83}, new int[]{r4}, null, new int[1]};
        r4 = r83 ^ com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x13fa, code lost:
    
        r3 = new java.lang.Object[]{java.lang.Integer.valueOf(r86), r41, java.lang.Integer.valueOf((((~((-721117537) | r25)) | (~(r25 | (-16778249)))) * 614) + (((((~((-1056924136) | r25)) | 335806599) | (~(r25 | (-352584848)))) * (-1228)) + (((r83 | (-737895785)) * 614) - 1440538943)))};
        r1 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r2 = r1.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x1416, code lost:
    
        if (r2 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x146a, code lost:
    
        ((int[]) r0[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r3)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x1474, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x1419, code lost:
    
        r2 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 86, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 28641), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3317);
        r7 = new java.lang.Object[1];
        a((byte) (com.netcetera.threeds.sdk.infrastructure.ay.$$a[2] + 1), 27, r4[19], r7);
        r2 = r2.getMethod((java.lang.String) r7[0], r11, r11, r11);
        r1.put(-1544987438, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x1ef5, code lost:
    
        if ((r0 | (((int) r6) & (((r7 | (-1448861407)) * 764) + ((((~(r25 | 693945755)) | (-2136989664)) * (-1528)) + (((693945755 | r7) * 764) - 1352347579))))) == 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04a2, code lost:
    
        if (((((int) (r13 >> 32)) & (((~((-134481923) | r3)) * 476) + ((r8 * 952) + (((22028352 | r8) * (-476)) - 551065358)))) | (((int) r13) & ((((~(787835532 | r83)) | 649357836) * 49) + (((((~(649390877 | r3)) | 787835532) | (~((-649390878) | r83))) * (-49)) + ((((~(787835532 | r3)) | 33041) * 98) + 1000829841))))) != 477111747) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x07ab, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 33) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x2633, code lost:
    
        if (r4 == null) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x07ad, code lost:
    
        r7 = new java.lang.Object[1];
        c(new int[]{-1680240491, -1857908689, -194803530, 323389166, 534278834, 227164381, -1311439272, 98811301, 373097539, -1459981848, -777634048, 1316076022, -1347638144, -1682972840}, android.graphics.Color.rgb(0, 0, 0) + 16777244, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x07cb, code lost:
    
        r0 = new java.lang.Object[]{((java.lang.String) r7[0]).intern()};
        r7 = r6.get(-108371147);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x07da, code lost:
    
        if (r7 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0821, code lost:
    
        r13 = ((java.lang.Long) ((java.lang.reflect.Method) r7).invoke(null, r0)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x082e, code lost:
    
        r50 = r13 ^ (-1);
        r13 = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m(831, (((1642974947 | r22) ^ (-1)) | (((-1642974948) | r9) ^ (-1))) | ((r13 | r9) ^ (-1)), ((-1662) * (((r50 | (-1642974948)) | r9) ^ (-1))) + (((-831) * (((r50 | r22) ^ (-1)) | ((((-1642974948) | r13) | r9) ^ (-1)))) + ((832 * r13) + 1363669206840L)), 2142294167);
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x08b9, code lost:
    
        if (((((int) (r13 >> 32)) & ((((~((-1128924331) | r3)) | 4194304) * 560) + (((~((-604086529) | r83)) * (-560)) + (((~((-1728816555) | r3)) * (-560)) - 1925544534)))) | (((int) r13) & ((((~(1387103947 | r3)) | 5261332) * (-964)) + ((((~(1387103947 | r83)) | 50122462) * (-964)) - 1797190115)))) != 1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x08bb, code lost:
    
        r0 = true;
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x08bd, code lost:
    
        r37 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0962, code lost:
    
        if (r0 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0964, code lost:
    
        r0 = new java.lang.Object[4];
        r2 = new int[r15];
        r0[r37] = r2;
        r4 = new int[r15];
        r0[r15] = r4;
        r0[r39] = new int[r15];
        r7 = r83 ^ com.plaid.internal.EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
        r2[r37] = r83;
        r4[r37] = r7;
        r0[2] = null;
        r2 = ~(496524248 | r3);
        r1 = (((~(r83 | 503012351)) | (~(r3 | (-6488104)))) * (-712)) + (((6488103 | r2) * (-712)) + 1301812687);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x09a9, code lost:
    
        r3 = new java.lang.Object[r39];
        r3[2] = java.lang.Integer.valueOf(((r2 | (-207815040)) * 712) + r1);
        r3[1] = r41;
        r3[0] = java.lang.Integer.valueOf(r86);
        r1 = r6.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x1266, code lost:
    
        if (((((int) (r6 >> 32)) & (((r13 | (~((-1078001701) | r83))) * 470) + (((r9 | r13) * (-470)) - 825750356))) | (((int) r6) & ((((~r7) | (-1403637098)) * 495) + ((r7 * 495) + 1873402938)))) == 477111747) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x09c3, code lost:
    
        if (r1 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x08c1, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x07dd, code lost:
    
        r7 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(48 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.os.Process.myPid() >> 22), 2754 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
        r9 = new java.lang.Object[1];
        a(com.netcetera.threeds.sdk.infrastructure.ay.$$a[r18], 29, 20, r9);
        r7 = r7.getMethod((java.lang.String) r9[0], java.lang.String.class);
        r6.put(-108371147, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x08c3, code lost:
    
        r7 = new java.lang.Object[1];
        b(false, 7 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 13, "\u0012\u0004\u0004\ufffe\uffff\t\u0002\u000f\fￋ\u0001\u0002\uffff", android.os.Process.getGidForName("") + com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x08ee, code lost:
    
        r0 = new java.lang.Object[]{((java.lang.String) r7[0]).intern()};
        r7 = r6.get(-690415720);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x08f6, code lost:
    
        if (r7 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0937, code lost:
    
        r0 = ((java.lang.reflect.Method) r7).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x093e, code lost:
    
        r15 = 1;
        r9 = new java.lang.Object[1];
        c(new int[]{-984205466, 1938219878}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), r9);
        r37 = 0;
        r0 = r0.equals(((java.lang.String) r9[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x08f9, code lost:
    
        r7 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(47 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.text.TextUtils.getTrimmedLength(""), android.view.View.MeasureSpec.getSize(0) + 2248);
        r8 = com.netcetera.threeds.sdk.infrastructure.ay.$$a;
        r9 = r8[19];
        r14 = new java.lang.Object[1];
        a(r9, (byte) (r9 + 5), (byte) (-r8[24]), r14);
        r7 = r7.getMethod((java.lang.String) r14[0], java.lang.String.class);
        r6.put(-690415720, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x05a2, code lost:
    
        if (((((int) (r13 >> 32)) & ((((-285313027) | r83) * 668) + ((((-1535215756) | (~(1322525129 | r83))) * 1336) + ((((~((-1535215756) | r83)) | 1322525129) * (-668)) - 1825367198)))) | (((int) r13) & ((((~((-18874401) | r3)) | (~((-436377793) | r83))) * com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE) + ((((~(981974217 | r83)) | (~((-436377793) | r3))) * com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE) + ((((~(455252192 | r83)) | 981974217) * (-318)) - 1443347005))))) != 477111747) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x06b1, code lost:
    
        if (((((int) (r13 >> 32)) & ((((~((-39435716) | r3)) | 600064) * 859) + ((((~(1397790695 | r3)) | (~((-38835652) | r83))) * 859) + (((1397790695 | r83) * (-859)) + 33049718)))) | (((int) r13) & ((((~((-607499545) | r3)) | 829726865) * 783) + (((~((-67179785) | r3)) * (-783)) + 1721667286)))) != (-1032769152)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0a16, code lost:
    
        ((int[]) r0[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r3)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x07a5, code lost:
    
        if (((((int) (r13 >> 32)) & androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1.m((~((-1217709076) | r83)) | (~((-1640031810) | r83)), -1324, (((-1775560276) | r3) * 1324) - 818884594, -544161780)) | (((int) r13) & ((((~(r3 | (-10833))) | 1235582981) * com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE) + ((((~(1336399279 | r3)) | (-1336410112)) * (-241)) + 1482696096)))) == 542074309) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0a20, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x09c6, code lost:
    
        r1 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(86 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (28641 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), 3317 - (android.os.Process.myPid() >> 22));
        r7 = new java.lang.Object[1];
        a((byte) (com.netcetera.threeds.sdk.infrastructure.ay.$$a[2] + 1), 27, r2[19], r7);
        r1 = r1.getMethod((java.lang.String) r7[0], r11, r11, r11);
        r6.put(-1544987438, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x1173, code lost:
    
        if (((((int) (r13 >> 32)) & ((((~(1065946296 | r3)) | 1430622500) * com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + ((((~(1065946296 | r83)) | 1430622500) * com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 1749766296))) | (((int) r13) & (((((~(1947780023 | r3)) | (-2122248128)) | (~((-336085510) | r83))) * 497) + ((((~((-174468105) | r83)) | (~((-336085510) | r3))) * 497) + 711030488)))) != 477111747) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x20ed  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x21b0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x2639  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x263f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x2708  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x263c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] ThreeDS2ServiceInstance$62a34fac(int i, int i2, Object obj, int i3) {
        int i4;
        int i5;
        Integer num;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String[] strArr;
        Object method;
        int i12;
        int i13;
        int i14;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i15;
        int i16;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        long j;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        Object[] objArr9;
        Object[] objArr10;
        Object[] objArr11;
        long j2;
        Map map;
        Object[] objArr12;
        int parseInt;
        Object obj2;
        Object method2;
        Object obj3;
        Object method3;
        try {
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(-1926555265);
            if (obj4 != null) {
                i4 = 6;
            } else {
                i4 = 6;
                Class cls = (Class) removeParam.initialize(48 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 19826), View.getDefaultSize(0, 0) + 3613);
                Object[] objArr13 = new Object[1];
                a($$a[6], (short) 29, 20, objArr13);
                obj4 = cls.getMethod((String) objArr13[0], null);
                map2.put(-1926555265, obj4);
            }
            long longValue = ((Long) ((Method) obj4).invoke(null, null)).longValue();
            long j3 = i;
            long j4 = j3 ^ (-1);
            long m = SVG$Unit$EnumUnboxingLocalUtility.m(627L, ((j4 | longValue) ^ (-1)) | ((351524479 | j3) ^ (-1)), ((-627) * (351524479 | (((longValue ^ (-1)) | j3) ^ (-1)))) + ((longValue | j3 | (-351524480)) * (-627)) + (628 * longValue) + 220757372812L, -2106439556L);
            int i17 = ~i;
            int i18 = ((int) (m >> 32)) & ((((~(359387851 | i)) | 342479497) * 433) + ((359387851 | (~((-1796614263) | i))) * (-433)) + (((~(2139093759 | i17)) * 433) - 1316728756));
            int i19 = (int) m;
            int i20 = ~((-2026004090) | i17);
            Class cls2 = Integer.TYPE;
            if (r8 != 0) {
                Object[] objArr14 = {new int[]{i}, new int[]{r8}, null, new int[1]};
                int i21 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE;
                Object[] objArr15 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-275793928))) | 92803344) * 366) + (((~((-443664936) | i)) | 260674352) * (-366)) + 2015586071)};
                Object obj5 = map2.get(-1544987438);
                if (obj5 == null) {
                    Class cls3 = (Class) removeParam.initialize(85 - TextUtils.lastIndexOf("", '0', 0), (char) (28640 - MotionEvent.axisFromString("")), 3317 - TextUtils.getOffsetAfter("", 0));
                    Object[] objArr16 = new Object[1];
                    a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr16);
                    obj5 = cls3.getMethod((String) objArr16[0], cls2, cls2, cls2);
                    map2.put(-1544987438, obj5);
                }
                ((int[]) objArr14[3])[0] = ((Integer) ((Method) obj5).invoke(null, objArr15)).intValue();
                return objArr14;
            }
            int i22 = 3;
            Object[] objArr17 = new Object[1];
            b(true, AndroidCharacter.getMirror('0') - '\'', 11 - Color.argb(0, 0, 0, 0), "￼\u0012\uffff\r￼\u0003\uffc9\n\r\u0000\r", View.resolveSizeAndState(0, 0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, objArr17);
            Object[] objArr18 = {((String) objArr17[0]).intern()};
            Object obj6 = map2.get(-690415720);
            if (obj6 != null) {
                i5 = 0;
                num = 16;
            } else {
                i5 = 0;
                Class cls4 = (Class) removeParam.initialize((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47, (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2247);
                byte[] bArr = $$a;
                byte b = bArr[19];
                num = 16;
                Object[] objArr19 = new Object[1];
                a(b, (byte) (b + 5), (byte) (-bArr[24]), objArr19);
                obj6 = cls4.getMethod((String) objArr19[0], String.class);
                map2.put(-690415720, obj6);
            }
            String str = (String) ((Method) obj6).invoke(null, objArr18);
            int i23 = 7;
            if (str != null) {
                int i24 = i5;
                i11 = -146694085;
                Object[] objArr20 = new Object[1];
                b(false, Gravity.getAbsoluteGravity(i24, i24) + 5, 7 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\ufff7\u0004\ufff9\ufffe\u000b\b", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, objArr20);
                String intern = ((String) objArr20[0]).intern();
                i10 = 5;
                Object[] objArr21 = new Object[1];
                b(true, (ViewConfiguration.getPressedStateDuration() >> 16) + 8, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8, "\ufffe\t\uffff￼\ufffa\u0002\u0005�", ExpandableListView.getPackedPositionGroup(0L) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, objArr21);
                String[] strArr2 = {intern, ((String) objArr21[0]).intern()};
                int i25 = 2;
                int i26 = 0;
                while (true) {
                    if (i26 >= i25) {
                        i6 = i23;
                        i7 = 12;
                        i8 = i17;
                        i9 = 8;
                        break;
                    }
                    if (str.contains(strArr2[i26])) {
                        Object[] objArr22 = new Object[1];
                        c(new int[]{-1571768993, -1191488368, 1322506363, 48981116, 1023978170, 624649596, 370866034, 1851363927, -381365180, -377549881, 2029523401, -2063209795}, 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr22);
                        Object[] objArr23 = {((String) objArr22[0]).intern()};
                        Map map3 = removeParam.visaSchemeConfiguration;
                        Object obj7 = map3.get(-690415720);
                        if (obj7 != null) {
                            i6 = i23;
                            i7 = 12;
                            i9 = 8;
                        } else {
                            Class cls5 = (Class) removeParam.initialize((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 46, (char) (ViewConfiguration.getScrollBarSize() >> 8), 2248 - ExpandableListView.getPackedPositionType(0L));
                            byte[] bArr2 = $$a;
                            byte b2 = bArr2[19];
                            i6 = i23;
                            i7 = 12;
                            i9 = 8;
                            Object[] objArr24 = new Object[1];
                            a(b2, (byte) (b2 + 5), (byte) (-bArr2[24]), objArr24);
                            obj7 = cls5.getMethod((String) objArr24[0], String.class);
                            map3.put(-690415720, obj7);
                        }
                        Object invoke = ((Method) obj7).invoke(null, objArr23);
                        Object[] objArr25 = new Object[1];
                        c(new int[]{-1571768993, -1191488368, 1322506363, 48981116, -1769113132, 347830748, -477151178, -899442070, 47769900, -1010810684, 1887415966, -1598619423, -1592404150, 1810376483, -52567937, -506800923}, View.getDefaultSize(0, 0) + 30, objArr25);
                        Object[] objArr26 = {((String) objArr25[0]).intern()};
                        Object obj8 = map3.get(-690415720);
                        if (obj8 != null) {
                            obj3 = invoke;
                        } else {
                            Class cls6 = (Class) removeParam.initialize(47 - (ViewConfiguration.getEdgeSlop() >> 16), (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2247);
                            byte[] bArr3 = $$a;
                            byte b3 = bArr3[19];
                            obj3 = invoke;
                            Object[] objArr27 = new Object[1];
                            a(b3, (byte) (b3 + 5), (byte) (-bArr3[24]), objArr27);
                            obj8 = cls6.getMethod((String) objArr27[0], String.class);
                            map3.put(-690415720, obj8);
                        }
                        Object invoke2 = ((Method) obj8).invoke(null, objArr26);
                        if (obj3 != null) {
                            Object[] objArr28 = {obj3, 42};
                            Object obj9 = map3.get(-146694085);
                            if (obj9 == null) {
                                Class cls7 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 49, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29154), 3756 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                Object[] objArr29 = new Object[1];
                                a($$a[i4], (short) 29, 20, objArr29);
                                obj9 = cls7.getMethod((String) objArr29[0], String.class, cls2);
                                map3.put(-146694085, obj9);
                            }
                            long longValue2 = ((Long) ((Method) obj9).invoke(null, objArr28)).longValue();
                            long j5 = 1599126021 | j4;
                            long m2 = SVG$Unit$EnumUnboxingLocalUtility.m(369L, (((longValue2 ^ (-1)) | (-1599126022)) ^ (-1)) | (((-1599126022) | j3) ^ (-1)) | ((j5 | longValue2) ^ (-1)), ((-369) * (longValue2 | (j5 ^ (-1)))) + (((-1599126022) | longValue2 | j4) * (-369)) + ((370 * longValue2) - 591676628140L), 2097739371L);
                            i8 = i17;
                            int i27 = ~((-134481923) | i);
                        } else {
                            i8 = i17;
                        }
                        if (invoke2 != null) {
                            Object[] objArr30 = {invoke2, 42};
                            Object obj10 = map3.get(-146694085);
                            if (obj10 == null) {
                                Class cls8 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0, 0) + 49, (char) (29154 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Color.blue(0) + 3756);
                                Object[] objArr31 = new Object[1];
                                a($$a[i4], (short) 29, 20, objArr31);
                                obj10 = cls8.getMethod((String) objArr31[0], String.class, cls2);
                                map3.put(-146694085, obj10);
                            }
                            long longValue3 = ((Long) ((Method) obj10).invoke(null, objArr30)).longValue();
                            long j6 = (j4 | (-340525144)) ^ (-1);
                            long j7 = (340525143 | longValue3) ^ (-1);
                            long m3 = SVG$Unit$EnumUnboxingLocalUtility.m(764L, j7 | (((longValue3 ^ (-1)) | (-340525144)) ^ (-1)) | j6, ((-1528) * (j7 | ((j4 | longValue3) ^ (-1)))) + ((longValue3 | j6) * 764) + (((-1527) * longValue3) - 260501735160L), 839138493L);
                        }
                        if (obj3 != null) {
                            ThreeDS2Service = (createTransaction + 87) % 128;
                            Object[] objArr32 = {obj3, 42};
                            Object obj11 = map3.get(-146694085);
                            if (obj11 != null) {
                                method3 = obj11;
                            } else {
                                Class cls9 = (Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 48, (char) (29154 - (Process.myTid() >> 22)), 3757 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                Object[] objArr33 = new Object[1];
                                a($$a[i4], (short) 29, 20, objArr33);
                                method3 = cls9.getMethod((String) objArr33[0], String.class, cls2);
                                map3.put(-146694085, method3);
                            }
                            long longValue4 = ((Long) ((Method) method3).invoke(null, objArr32)).longValue();
                            long j8 = longValue4 ^ (-1);
                            long j9 = (-934082222) | longValue4;
                            long j10 = ((((934082221 | j8) ^ (-1)) | ((934082221 | j4) ^ (-1)) | ((j8 | j4) ^ (-1)) | ((j9 | j3) ^ (-1))) * (-84)) + ((85 * longValue4) - 79396988870L);
                            long j11 = (j4 | longValue4) ^ (-1);
                            long m4 = SVG$Unit$EnumUnboxingLocalUtility.m(84L, j11 | (j9 ^ (-1)), ((-84) * ((-934082222) | ((j8 | j3) ^ (-1)) | j11)) + j10, 1432695571L);
                        }
                        if (invoke2 != null) {
                            ThreeDS2Service = (createTransaction + 73) % 128;
                            Object[] objArr34 = {invoke2, 42};
                            Object obj12 = map3.get(-146694085);
                            if (obj12 == null) {
                                Class cls10 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionType(0L) + 48, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29154), 3756 - Color.green(0));
                                Object[] objArr35 = new Object[1];
                                a($$a[i4], (short) 29, 20, objArr35);
                                obj12 = cls10.getMethod((String) objArr35[0], String.class, cls2);
                                map3.put(-146694085, obj12);
                            }
                            long longValue5 = ((Long) ((Method) obj12).invoke(null, objArr34)).longValue();
                            long j12 = longValue5 ^ (-1);
                            long j13 = (294317218 | j12) ^ (-1);
                            long m5 = SVG$Unit$EnumUnboxingLocalUtility.m(576L, j13, ((((294317218 | longValue5) ^ (-1)) | (((j12 | j4) | (-294317219)) ^ (-1))) * 576) + ((j13 | ((j12 | j3) ^ (-1))) * 576) + ((-575) * longValue5) + 169232400925L, 792930568L);
                        }
                    } else {
                        i26++;
                        i23 = i23;
                        i25 = 2;
                        i22 = 3;
                    }
                }
            } else {
                i6 = 7;
                i7 = 12;
                i8 = i17;
                i9 = 8;
                i10 = 5;
                i11 = -146694085;
            }
            Object[] objArr36 = new Object[1];
            c(new int[]{-1695479323, 2055183407, 586782204, -1540133621}, (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 8, objArr36);
            String intern2 = ((String) objArr36[0]).intern();
            Object[] objArr37 = new Object[1];
            c(new int[]{238343032, 731343295, -1886794779, 299657858}, 6 - TextUtils.getTrimmedLength(""), objArr37);
            String intern3 = ((String) objArr37[0]).intern();
            Object[] objArr38 = new Object[1];
            c(new int[]{1748939727, -1716023579, -1341911184, 1452790227}, 7 - (Process.myPid() >> 22), objArr38);
            String intern4 = ((String) objArr38[0]).intern();
            Object[] objArr39 = new Object[1];
            b(true, 7 - (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.keyCodeFromString("") + 9, "\u000b\u0007\ufffa\b\ufff7\ufff9￼\u0007\ufffa", MotionEvent.axisFromString("") + EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, objArr39);
            String intern5 = ((String) objArr39[0]).intern();
            Object[] objArr40 = new Object[1];
            c(new int[]{-699949665, 1457550949, -2030961887, 308430601}, 6 - Color.argb(0, 0, 0, 0), objArr40);
            String intern6 = ((String) objArr40[0]).intern();
            Object[] objArr41 = new Object[1];
            b(false, 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 12 - ImageFormat.getBitsPerPixel(0), "\u0007ￎ\u0012\u0003\t\u000e\t\u0014ￍ\u0004\u0005\u0002\u0015", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, objArr41);
            String intern7 = ((String) objArr41[0]).intern();
            Object[] objArr42 = new Object[1];
            c(new int[]{-1090166753, -1738662652, -1297239403, -841798863}, (KeyEvent.getMaxKeyCode() >> 16) + 5, objArr42);
            String intern8 = ((String) objArr42[0]).intern();
            Object[] objArr43 = new Object[1];
            c(new int[]{-1909425429, 922658654, 1941508707, -1947438259}, 5 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr43);
            String intern9 = ((String) objArr43[0]).intern();
            Object[] objArr44 = new Object[1];
            b(true, 1 - MotionEvent.axisFromString(""), ExpandableListView.getPackedPositionType(0L) + 2, "\u0007\ufff9", TextUtils.indexOf("", "", 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, objArr44);
            String intern10 = ((String) objArr44[0]).intern();
            Object[] objArr45 = new Object[1];
            b(false, 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 15 - TextUtils.indexOf((CharSequence) "", '0'), "\u0005�\u0006\ufffb\b\t\uffff\t\nￄ\t\n\ufff7\b\n\u0002", (ViewConfiguration.getPressedStateDuration() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, objArr45);
            String intern11 = ((String) objArr45[0]).intern();
            Object[] objArr46 = new Object[1];
            b(true, View.MeasureSpec.getSize(0) + 9, TextUtils.getCapsMode("", 0, 0) + 10, "\u000fￋ\u0001\u0004\ufffe\u0011\u0004\f\t\u0000", (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 280, objArr46);
            String intern12 = ((String) objArr46[0]).intern();
            Object[] objArr47 = new Object[1];
            b(true, 2 - TextUtils.lastIndexOf("", '0'), Drawable.resolveOpacity(0, 0) + 8, "\u0003\u0006\u0004\uffff\u0002\ufff5\u0006\ufff7", KeyEvent.keyCodeFromString("") + EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, objArr47);
            String intern13 = ((String) objArr47[0]).intern();
            int[] iArr = new int[i4];
            // fill-array-data instruction
            iArr[0] = 1970726035;
            iArr[1] = -339269542;
            iArr[2] = 1308524438;
            iArr[3] = -347211952;
            iArr[4] = -1904614929;
            iArr[5] = -827755870;
            Object[] objArr48 = new Object[1];
            c(iArr, Color.green(0) + 12, objArr48);
            String intern14 = ((String) objArr48[0]).intern();
            int[] iArr2 = new int[i9];
            // fill-array-data instruction
            iArr2[0] = 1970726035;
            iArr2[1] = -339269542;
            iArr2[2] = 1308524438;
            iArr2[3] = -347211952;
            iArr2[4] = -732106864;
            iArr2[5] = -264749757;
            iArr2[6] = -370198264;
            iArr2[7] = -416621053;
            Object[] objArr49 = new Object[1];
            c(iArr2, (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 13, objArr49);
            String intern15 = ((String) objArr49[0]).intern();
            Object[] objArr50 = new Object[1];
            b(true, (ViewConfiguration.getPressedStateDuration() >> 16) + 5, 7 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0006\u0000\ufffe\ufff6\u0003\u0005\uffff", 292 - TextUtils.getOffsetAfter("", 0), objArr50);
            String intern16 = ((String) objArr50[0]).intern();
            Object[] objArr51 = new Object[1];
            c(new int[]{346446509, 1993902702, 2078003170, -369745051}, 7 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr51);
            String intern17 = ((String) objArr51[0]).intern();
            Object[] objArr52 = new Object[1];
            c(new int[]{-1758647977, 1351993924, -65241852, -2130746519}, 7 - ((Process.getThreadPriority(0) + 20) >> 6), objArr52);
            String intern18 = ((String) objArr52[0]).intern();
            Object[] objArr53 = new Object[1];
            b(false, View.combineMeasuredStates(0, 0) + 2, View.MeasureSpec.getMode(0) + 2, "\u0000\u0000", (Process.myPid() >> 22) + EnumC0170g.SDK_ASSET_LOADING_INDICATOR_VALUE, objArr53);
            String intern19 = ((String) objArr53[0]).intern();
            Object[] objArr54 = new Object[1];
            c(new int[]{-88279115, -102823935, -2063292, -476429065, 1018694651, -65157432, -1006171485, 267756043, 122918081, 1269667338}, (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 19, objArr54);
            String intern20 = ((String) objArr54[0]).intern();
            Object[] objArr55 = new Object[1];
            b(true, 6 - View.resolveSize(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6, "\ufffa\ufff8\ufff6\u0007\t\b", Drawable.resolveOpacity(0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, objArr55);
            String intern21 = ((String) objArr55[0]).intern();
            Object[] objArr56 = new Object[1];
            c(new int[]{1182011852, 1210941025}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, objArr56);
            String intern22 = ((String) objArr56[0]).intern();
            Object[] objArr57 = new Object[1];
            c(new int[]{665120056, 1244884545, -1284744769, -2145694228, -1479413614, -95472495, -1749990152, 120426975}, 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr57);
            String intern23 = ((String) objArr57[0]).intern();
            Object[] objArr58 = new Object[1];
            b(true, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 9, "\n\ufffe\n\ufff7\u0006\ufffb\ufff9\ufff7\b", TextUtils.getOffsetAfter("", 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, objArr58);
            String intern24 = ((String) objArr58[0]).intern();
            Object[] objArr59 = new Object[1];
            b(true, TextUtils.lastIndexOf("", '0', 0) + 9, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9, "\u000f￼\u000b\u0000\ufffe￼\r\u000f\uffd1\u0003", TextUtils.lastIndexOf("", '0', 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, objArr59);
            String intern25 = ((String) objArr59[0]).intern();
            Object[] objArr60 = new Object[1];
            c(new int[]{440121301, 77166212, -2016806761, -508390101, 142770375, 191704796}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, objArr60);
            String intern26 = ((String) objArr60[0]).intern();
            Object[] objArr61 = new Object[1];
            c(new int[]{1033313442, 663826304, 1789014235, 1934591610, -83077564, -1026424361}, TextUtils.getTrimmedLength("") + 11, objArr61);
            String intern27 = ((String) objArr61[0]).intern();
            Object[] objArr62 = new Object[1];
            b(false, 5 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 15, "\ufff5\uffff\u0004￼\u0005\u000b\u0004\r\uffff\u0004\ufffa\ufff5\b\ufffb�", 287 - View.resolveSize(0, 0), objArr62);
            String intern28 = ((String) objArr62[0]).intern();
            Object[] objArr63 = new Object[1];
            b(true, KeyEvent.keyCodeFromString("") + 3, Color.green(0) + 14, "\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2\ufff7\u0001￼", ((byte) KeyEvent.getModifierMetaStateMask()) + 291, objArr63);
            String[] strArr3 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((String) objArr63[0]).intern()};
            Object[] objArr64 = new Object[1];
            b(true, View.MeasureSpec.getSize(0) + 9, 11 - View.MeasureSpec.getMode(0), "￼\u0012\uffff\r￼\u0003\uffc9\n\r\u0000\r", 282 - ((Process.getThreadPriority(0) + 20) >> 6), objArr64);
            Object[] objArr65 = {((String) objArr64[0]).intern()};
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj13 = map4.get(-690415720);
            if (obj13 != null) {
                strArr = strArr3;
            } else {
                Class cls11 = (Class) removeParam.initialize(Process.getGidForName("") + 48, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0') + 2249);
                byte[] bArr4 = $$a;
                byte b4 = bArr4[19];
                strArr = strArr3;
                Object[] objArr66 = new Object[1];
                a(b4, (byte) (b4 + 5), (byte) (-bArr4[24]), objArr66);
                obj13 = cls11.getMethod((String) objArr66[0], String.class);
                map4.put(-690415720, obj13);
            }
            String str2 = (String) ((Method) obj13).invoke(null, objArr65);
            if (str2 != null) {
                Object[] objArr67 = new Object[1];
                b(false, 5 - ((Process.getThreadPriority(0) + 20) >> 6), 5 - TextUtils.indexOf((CharSequence) "", '0', 0), "\ufff7\u0004\ufff9\ufffe\u000b\b", 287 - ((Process.getThreadPriority(0) + 20) >> 6), objArr67);
                String intern29 = ((String) objArr67[0]).intern();
                Object[] objArr68 = new Object[1];
                b(true, 8 - TextUtils.getCapsMode("", 0, 0), TextUtils.getOffsetAfter("", 0) + 8, "\ufffe\t\uffff￼\ufffa\u0002\u0005�", (ViewConfiguration.getWindowTouchSlop() >> 8) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, objArr68);
                String[] strArr4 = {intern29, ((String) objArr68[0]).intern()};
                int i28 = 0;
                while (true) {
                    if (i28 >= 2) {
                        break;
                    }
                    if (str2.contains(strArr4[i28])) {
                        int[] iArr3 = new int[i7];
                        // fill-array-data instruction
                        iArr3[0] = -1571768993;
                        iArr3[1] = -1191488368;
                        iArr3[2] = 1322506363;
                        iArr3[3] = 48981116;
                        iArr3[4] = 1023978170;
                        iArr3[5] = 624649596;
                        iArr3[6] = 370866034;
                        iArr3[7] = 1851363927;
                        iArr3[8] = -381365180;
                        iArr3[9] = -377549881;
                        iArr3[10] = 2029523401;
                        iArr3[11] = -2063209795;
                        Object[] objArr69 = new Object[1];
                        c(iArr3, View.MeasureSpec.getSize(0) + 23, objArr69);
                        Object[] objArr70 = {((String) objArr69[0]).intern()};
                        Map map5 = removeParam.visaSchemeConfiguration;
                        Object obj14 = map5.get(-690415720);
                        if (obj14 == null) {
                            Class cls12 = (Class) removeParam.initialize(46 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) Color.argb(0, 0, 0, 0), 2248 - View.resolveSizeAndState(0, 0, 0));
                            byte[] bArr5 = $$a;
                            byte b5 = bArr5[19];
                            Object[] objArr71 = new Object[1];
                            a(b5, (byte) (b5 + 5), (byte) (-bArr5[24]), objArr71);
                            obj14 = cls12.getMethod((String) objArr71[0], String.class);
                            map5.put(-690415720, obj14);
                        }
                        Object invoke3 = ((Method) obj14).invoke(null, objArr70);
                        Object[] objArr72 = new Object[1];
                        c(new int[]{-1571768993, -1191488368, 1322506363, 48981116, -1769113132, 347830748, -477151178, -899442070, 47769900, -1010810684, 1887415966, -1598619423, -1592404150, 1810376483, -52567937, -506800923}, 30 - Color.alpha(0), objArr72);
                        Object[] objArr73 = {((String) objArr72[0]).intern()};
                        Object obj15 = map5.get(-690415720);
                        if (obj15 != null) {
                            obj2 = invoke3;
                        } else {
                            Class cls13 = (Class) removeParam.initialize(AndroidCharacter.getMirror('0') - 1, (char) (Process.myPid() >> 22), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2247);
                            byte[] bArr6 = $$a;
                            byte b6 = bArr6[19];
                            obj2 = invoke3;
                            Object[] objArr74 = new Object[1];
                            a(b6, (byte) (b6 + 5), (byte) (-bArr6[24]), objArr74);
                            obj15 = cls13.getMethod((String) objArr74[0], String.class);
                            map5.put(-690415720, obj15);
                        }
                        Object invoke4 = ((Method) obj15).invoke(null, objArr73);
                        if (obj2 != null) {
                            createTransaction = (ThreeDS2Service + 65) % 128;
                            Object[] objArr75 = {obj2, 42};
                            Object obj16 = map5.get(Integer.valueOf(i11));
                            if (obj16 != null) {
                                method2 = obj16;
                            } else {
                                Class cls14 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 49, (char) ((Process.myTid() >> 22) + 29154), 3756 - View.MeasureSpec.getMode(0));
                                Object[] objArr76 = new Object[1];
                                a($$a[6], (short) 29, 20, objArr76);
                                method2 = cls14.getMethod((String) objArr76[0], String.class, cls2);
                                map5.put(Integer.valueOf(i11), method2);
                            }
                            long longValue6 = ((Long) ((Method) method2).invoke(null, objArr75)).longValue();
                            long j14 = longValue6 ^ (-1);
                            long j15 = (j4 | longValue6) ^ (-1);
                            long m6 = SVG$Unit$EnumUnboxingLocalUtility.m(516L, ((1048956041 | longValue6) ^ (-1)) | j15, (((((1048956041 | j14) | j3) ^ (-1)) | (((1048956041 | j4) | longValue6) ^ (-1))) * 516) + ((-516) * (((j14 | j3) ^ (-1)) | ((j4 | (-1048956042)) ^ (-1)) | j15)) + (517 * longValue6) + 540212361630L, 1547569391L);
                        }
                        if (invoke4 != null) {
                            Object[] objArr77 = {invoke4, 42};
                            Object obj17 = map5.get(Integer.valueOf(i11));
                            if (obj17 == null) {
                                Class cls15 = (Class) removeParam.initialize(48 - View.MeasureSpec.getSize(0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29155), Color.red(0) + 3756);
                                Object[] objArr78 = new Object[1];
                                a($$a[6], (short) 29, 20, objArr78);
                                obj17 = cls15.getMethod((String) objArr78[0], String.class, cls2);
                                map5.put(Integer.valueOf(i11), obj17);
                            }
                            long longValue7 = ((Long) ((Method) obj17).invoke(null, objArr77)).longValue();
                            long j16 = longValue7 ^ (-1);
                            long j17 = 1379667174 | j16;
                            long j18 = j16 | j4;
                            long m7 = SVG$Unit$EnumUnboxingLocalUtility.m(192L, ((j17 | j3) ^ (-1)) | ((j18 | (-1379667175)) ^ (-1)) | ((((-1379667175) | longValue7) | j3) ^ (-1)), ((-384) * ((j17 ^ (-1)) | (j18 ^ (-1)))) + ((-192) * (j4 | ((1379667174 | longValue7) ^ (-1)))) + ((193 * longValue7) - 266275764775L), 1878280524L);
                            int i29 = (~(973776280 | i)) | (-2051777981);
                            int i30 = ~((-805962905) | i8);
                            int i31 = (-1115720002) | i8;
                        }
                    } else {
                        i28++;
                        i7 = 12;
                    }
                }
            }
            int i32 = i8;
            Object[] objArr79 = new Object[1];
            c(new int[]{-328625986, 642225615, 882240733, -991685637, 1878013586, -1236155855, 571476966, -1297589825, 1375357527, -1759773942, 1196688519, 857744015}, 23 - TextUtils.indexOf("", "", 0), objArr79);
            Object[] objArr80 = {((String) objArr79[0]).intern()};
            Map map6 = removeParam.visaSchemeConfiguration;
            Object obj18 = map6.get(1303953416);
            if (obj18 == null) {
                Class cls16 = (Class) removeParam.initialize(48 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 2952 - View.MeasureSpec.makeMeasureSpec(0, 0));
                Object[] objArr81 = new Object[1];
                a($$a[6], (short) 29, 20, objArr81);
                obj18 = cls16.getMethod((String) objArr81[0], String.class);
                map6.put(1303953416, obj18);
            }
            long longValue8 = ((Long) ((Method) obj18).invoke(null, objArr80)).longValue();
            long m8 = SVG$Unit$EnumUnboxingLocalUtility.m(433L, (((-175529538) | j3) ^ (-1)) | ((175529537 | longValue8) ^ (-1)), ((-433) * ((-175529538) | (((longValue8 ^ (-1)) | j3) ^ (-1)))) + (((((-175529538) | j4) | longValue8) ^ (-1)) * 433) + ((434 * longValue8) - 75828759984L), -1118417407L);
            long j19 = (((int) (m8 >> 32)) & ((((~((-143089207) | i)) | (-1294137205)) * EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE) + (((~(i32 | 143089206)) | (~((-1294137205) | i))) * (-301)) + ((~(1302855542 | i)) * (-301)) + 10322832)) | (((int) m8) & ((((~(i32 | (-30101283))) | 18720) * 560) + ((~((-1377042566) | i)) * (-560)) + ((~(i32 | (-1407125128))) * (-560)) + 896980805));
            Object[] objArr82 = new Object[1];
            c(new int[]{-855883648, -750861454, 11101570, -1983769298, -1737236144, -1063062715, -615928946, -1115662988, 1886083725, -1062565861}, 17 - (ViewConfiguration.getTapTimeout() >> 16), objArr82);
            Object[] objArr83 = {((String) objArr82[0]).intern()};
            Object obj19 = map6.get(1303953416);
            if (obj19 == null) {
                Class cls17 = (Class) removeParam.initialize(KeyEvent.normalizeMetaState(0) + 47, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2952 - View.MeasureSpec.makeMeasureSpec(0, 0));
                Object[] objArr84 = new Object[1];
                a($$a[6], (short) 29, 20, objArr84);
                obj19 = cls17.getMethod((String) objArr84[0], String.class);
                map6.put(1303953416, obj19);
            }
            long longValue9 = ((Long) ((Method) obj19).invoke(null, objArr83)).longValue();
            long j20 = ((-463) * longValue9) - 351874166205L;
            long j21 = longValue9 ^ (-1);
            long j22 = (j21 | (-756718637)) ^ (-1);
            long m9 = SVG$Unit$EnumUnboxingLocalUtility.m(464L, j22 | (((-756718637) | j3) ^ (-1)), ((-464) * (j3 | 756718636 | j21)) + ((((j21 | j4) ^ (-1)) | j22 | ((j4 | (-756718637)) ^ (-1))) * 464) + j20, -186169233L);
            long m10 = (((int) (m9 >> 32)) & (((1923277676 | (~(486051265 | i32))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) + (((~(i32 | 1923277676)) | 207096961) * (-160)) + 1726218954)) | (((int) m9) & Boxes$$ExternalSyntheticOutline1.m((~((-224202845) | i)) | R.dimen.dialog_min_width_minor | (~((-1661429255) | i)), -69, (((~((-207097945) | i)) | (~((-1644324355) | i))) * 69) - 177630460, -79357851));
            if (j19 > 0 && m10 > 0 && m10 - 3 < j19) {
                Object[] objArr85 = {new int[]{i}, new int[]{r6}, null, new int[1]};
                int i33 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE;
                int i34 = (~((-245053442) | i)) | 167780352;
                Object[] objArr86 = {Integer.valueOf(i3), num, Integer.valueOf((((~(i | (-77273090))) | (~(i32 | 536558935))) * 470) + (((i34 | r4) * (-470)) - 2043273897))};
                Object obj20 = map6.get(-1544987438);
                if (obj20 == null) {
                    Class cls18 = (Class) removeParam.initialize(TextUtils.indexOf("", "", 0, 0) + 86, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28640), Color.alpha(0) + 3317);
                    Object[] objArr87 = new Object[1];
                    a((byte) ($$a[2] + 1), (short) 27, r2[19], objArr87);
                    obj20 = cls18.getMethod((String) objArr87[0], cls2, cls2, cls2);
                    map6.put(-1544987438, obj20);
                }
                ((int[]) objArr85[3])[0] = ((Integer) ((Method) obj20).invoke(null, objArr86)).intValue();
                return objArr85;
            }
            Object[] objArr88 = new Object[1];
            c(new int[]{-328625986, 642225615, 882240733, -991685637, 1878013586, -1236155855, 571476966, -1297589825, 1375357527, -1759773942, 1196688519, 857744015}, 22 - MotionEvent.axisFromString(""), objArr88);
            Object[] objArr89 = {((String) objArr88[0]).intern()};
            Object obj21 = map6.get(1303953416);
            if (obj21 == null) {
                Class cls19 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 48, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2952);
                Object[] objArr90 = new Object[1];
                a($$a[6], (short) 29, 20, objArr90);
                obj21 = cls19.getMethod((String) objArr90[0], String.class);
                map6.put(1303953416, obj21);
            }
            long longValue10 = ((Long) ((Method) obj21).invoke(null, objArr89)).longValue();
            long j23 = longValue10 ^ (-1);
            long j24 = j4 | 569433778;
            long m11 = SVG$Unit$EnumUnboxingLocalUtility.m(904L, (((-569433779) | longValue10) ^ (-1)) | ((j23 | j3) ^ (-1)) | (j24 ^ (-1)), ((((((-569433779) | j23) | j3) ^ (-1)) | ((j24 | longValue10) ^ (-1))) * 904) + ((-1808) * ((((-569433779) | j3) ^ (-1)) | ((j4 | longValue10) ^ (-1)))) + ((-903) * longValue10) + 515337569090L, -1512321648L);
            long j25 = (((int) (m11 >> 32)) & (((341135616 | (~(1062567296 | i)) | (~(i32 | (-1062567297)))) * 988) + (((~(i32 | (-1795173589))) | 1073741908) * (-1976)) + (((i | 341135616) * 988) - 787217434))) | (((int) m11) & ((((-1437226711) | i) * 397) + (((((~(1471151945 | i32)) | (-1471152096)) | (~(i32 | 33925535))) * (-397)) - 2020702368)));
            Object[] objArr91 = new Object[1];
            c(new int[]{1318863825, 2061576514}, 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr91);
            Object[] objArr92 = {((String) objArr91[0]).intern()};
            Object obj22 = map6.get(1303953416);
            if (obj22 == null) {
                Class cls20 = (Class) removeParam.initialize(47 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (Process.myTid() >> 22), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2952);
                Object[] objArr93 = new Object[1];
                a($$a[6], (short) 29, 20, objArr93);
                obj22 = cls20.getMethod((String) objArr93[0], String.class);
                map6.put(1303953416, obj22);
            }
            long longValue11 = ((Long) ((Method) obj22).invoke(null, objArr92)).longValue();
            long j26 = ((-283) * (((729445732 | longValue11) ^ (-1)) | ((729445732 | j3) ^ (-1)))) + (((-282) * longValue11) - 207162588172L);
            long j27 = longValue11 ^ (-1);
            long m12 = SVG$Unit$EnumUnboxingLocalUtility.m(283L, ((729445732 | j27) | j3) ^ (-1), (((j27 | (-729445733)) ^ (-1)) * 283) + j26, -213442137L);
            long m13 = (((int) (m12 >> 32)) & ((((~(1215454740 | i32)) | 562102336 | (~((-135270933) | i))) * 497) + (((~(1777557076 | i)) | (~(i32 | (-135270933)))) * 497) + 1417667483)) | (((int) m12) & Boxes$$ExternalSyntheticOutline1.m((~(1446808387 | i32)) | (-1455341532), 933, (((~((-9581978) | i32)) | 1446808387) * (-933)) + 165318598, 273932938));
            if (j25 > 0 && m13 > 0 && m13 + 100 < j25) {
                int i35 = ThreeDS2Service + 71;
                createTransaction = i35 % 128;
                if (i35 % 2 != 0) {
                    Object[] objArr94 = {new int[]{i}, new int[]{r6}, null, new int[1]};
                    int i36 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
                    int i37 = ~(i | 470619987);
                    Object[] objArr95 = {Integer.valueOf(i3), num, Integer.valueOf(Boxes$$ExternalSyntheticOutline1.m(i37 | (-502224728), EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, (((-233719301) | i37) * (-220)) + 993611081, -1347619998))};
                    Object obj23 = map6.get(-1544987438);
                    if (obj23 == null) {
                        Class cls21 = (Class) removeParam.initialize(Color.red(0) + 86, (char) (28642 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), AndroidCharacter.getMirror('0') + 3269);
                        Object[] objArr96 = new Object[1];
                        a((byte) ($$a[2] + 1), (short) 27, r2[19], objArr96);
                        obj23 = cls21.getMethod((String) objArr96[0], cls2, cls2, cls2);
                        map6.put(-1544987438, obj23);
                    }
                    ((int[]) objArr94[3])[0] = ((Integer) ((Method) obj23).invoke(null, objArr95)).intValue();
                    return objArr94;
                }
            }
            Object[] objArr97 = new Object[1];
            b(false, (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 6, 6 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\uffc8\f\u0012\f\r\ufffe\u0006", 284 - TextUtils.getTrimmedLength(""), objArr97);
            String intern30 = ((String) objArr97[0]).intern();
            Object[] objArr98 = new Object[1];
            c(new int[]{-328625986, 642225615, 1728412407, 1518923829, -1433560048, -830079952}, 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr98);
            String intern31 = ((String) objArr98[0]).intern();
            Object[] objArr99 = new Object[1];
            c(new int[]{-328625986, 642225615, 1728412407, 1518923829, -1360666287, -1076448709}, TextUtils.lastIndexOf("", '0', 0) + 13, objArr99);
            String intern32 = ((String) objArr99[0]).intern();
            Object[] objArr100 = new Object[1];
            b(false, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 12, "\nￋ\u000f\u0015\u000f\u0010\u0001\tￋ\u0014\ufffe\u0005", 281 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr100);
            String intern33 = ((String) objArr100[0]).intern();
            Object[] objArr101 = new Object[1];
            c(new int[]{1481545247, 122922311, -120730640, 1094812715, -1433560048, -830079952}, 11 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr101);
            String intern34 = ((String) objArr101[0]).intern();
            Object[] objArr102 = new Object[1];
            c(new int[]{77930954, -459889705, -1120289261, -2062588168}, 5 - (ViewConfiguration.getScrollBarSize() >> 8), objArr102);
            String intern35 = ((String) objArr102[0]).intern();
            Object[] objArr103 = new Object[1];
            c(new int[]{-1680240491, -1857908689}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, objArr103);
            String[] strArr5 = {intern30, intern31, intern32, intern33, intern34, intern35, ((String) objArr103[0]).intern()};
            if ((i2 & 2048) == 0) {
                int i38 = 0;
                for (int i39 = i6; i38 < i39; i39 = 7) {
                    Object[] objArr104 = {strArr5[i38]};
                    Map map7 = removeParam.visaSchemeConfiguration;
                    Object obj24 = map7.get(1748705216);
                    if (obj24 != null) {
                        method = obj24;
                    } else {
                        Class cls22 = (Class) removeParam.initialize(48 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17723), 2904 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                        Object[] objArr105 = new Object[1];
                        a($$a[6], (short) 29, 20, objArr105);
                        method = cls22.getMethod((String) objArr105[0], String.class);
                        map7.put(1748705216, method);
                    }
                    long longValue12 = ((Long) ((Method) method).invoke(null, objArr104)).longValue();
                    long j28 = longValue12 ^ (-1);
                    long j29 = (-290012514) | j28;
                    long m14 = SVG$Unit$EnumUnboxingLocalUtility.m(920L, ((j29 | j4) ^ (-1)) | ((((-290012514) | longValue12) | j3) ^ (-1)) | (((j28 | 290012513) | j3) ^ (-1)), (((j29 ^ (-1)) | (((-290012514) | j4) ^ (-1))) * 920) + ((((j29 | j3) ^ (-1)) | (((j28 | j4) | 290012513) ^ (-1))) * 920) + (((-919) * longValue12) - 266521499447L), 1429103422L);
                    if (((((int) m14) & (((~((-740307593) | i)) * 566) + ((((~((-741618633) | i)) | 1311040) * (-566)) - 695177771))) | (((int) (m14 >> 32)) & ((((~(714419949 | i)) | 25167952) * 70) + ((~(731197181 | i)) * 70) + (((~(722806461 | i)) | 8390720) * (-140)) + 850170570))) != 0) {
                        i12 = i38 + 90;
                        break;
                    }
                    i38++;
                }
            }
            i12 = 0;
            if (i12 != 0) {
                Object[] objArr106 = {new int[]{i}, new int[]{i12 ^ i}, null, new int[1]};
                Object[] objArr107 = {Integer.valueOf(i3), num, Integer.valueOf(((150276251 | (~(i32 | 554063036))) * 56) + (((~(i | 150276251)) | 554063036) * 56) + 689650767)};
                Map map8 = removeParam.visaSchemeConfiguration;
                Object obj25 = map8.get(-1544987438);
                if (obj25 == null) {
                    Class cls23 = (Class) removeParam.initialize(86 - Color.green(0), (char) (Color.argb(0, 0, 0, 0) + 28641), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3317);
                    Object[] objArr108 = new Object[1];
                    a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr108);
                    obj25 = cls23.getMethod((String) objArr108[0], cls2, cls2, cls2);
                    map8.put(-1544987438, obj25);
                }
                ((int[]) objArr106[3])[0] = ((Integer) ((Method) obj25).invoke(null, objArr107)).intValue();
                return objArr106;
            }
            try {
                Object[] objArr109 = new Object[1];
                b(true, 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - ImageFormat.getBitsPerPixel(0), "\u0005ￋ\u0001\t\u0006\u0012\uffffￋ\f\u000f\u0011\u0010\f", 279 - MotionEvent.axisFromString(""), objArr109);
                try {
                    Object[] objArr110 = {((String) objArr109[0]).intern()};
                    map = removeParam.visaSchemeConfiguration;
                    Object obj26 = map.get(-690415720);
                    if (obj26 == null) {
                        Class cls24 = (Class) removeParam.initialize(46 - Process.getGidForName(""), (char) Gravity.getAbsoluteGravity(0, 0), (Process.myTid() >> 22) + 2248);
                        byte[] bArr7 = $$a;
                        byte b7 = bArr7[19];
                        Object[] objArr111 = new Object[1];
                        a(b7, (byte) (b7 + 5), (byte) (-bArr7[24]), objArr111);
                        obj26 = cls24.getMethod((String) objArr111[0], String.class);
                        map.put(-690415720, obj26);
                    }
                    Object invoke5 = ((Method) obj26).invoke(null, objArr110);
                    if (invoke5 != null) {
                        createTransaction = (ThreeDS2Service + 47) % 128;
                        int[] iArr4 = new int[6];
                        iArr4[0] = 2059371834;
                        iArr4[1] = -552632544;
                        iArr4[2] = 1540774253;
                        iArr4[3] = 1741115;
                        iArr4[4] = 1314662727;
                        iArr4[i10] = 349866151;
                        Object[] objArr112 = new Object[1];
                        c(iArr4, View.getDefaultSize(0, 0) + 11, objArr112);
                        try {
                            Object[] objArr113 = {invoke5, new String[]{((String) objArr112[0]).intern()}};
                            Object obj27 = map.get(-140597324);
                            if (obj27 == null) {
                                Class cls25 = (Class) removeParam.initialize(View.resolveSize(0, 0) + 48, (char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 2295);
                                Object[] objArr114 = new Object[1];
                                a($$a[6], (short) 29, 20, objArr114);
                                obj27 = cls25.getMethod((String) objArr114[0], String.class, String[].class);
                                map.put(-140597324, obj27);
                            }
                            long longValue13 = ((Long) ((Method) obj27).invoke(null, objArr113)).longValue();
                            long j30 = longValue13 ^ (-1);
                            int m15 = ((int) (SVG$Unit$EnumUnboxingLocalUtility.m(318L, j30 | (((-837774369) | j3) ^ (-1)), ((-318) * (((j30 | 837774368) ^ (-1)) | ((837774368 | j3) ^ (-1)))) + (((((((-837774369) | j30) | j3) ^ (-1)) | (((j4 | 837774368) | longValue13) ^ (-1))) * (-318)) + ((319 * longValue13) - 265574474656L)), -1630388691L) >> 32)) & ((((~(595227073 | i)) | 1476691500 | (~(i32 | (-39465090)))) * 521) + ((2032453484 | i) * 521) + ((((~(i32 | 2032453484)) | (-595227074)) * (-1042)) - 1784744180));
                            int i40 = ~(i32 | (-2131172166));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int[] iArr5 = new int[10];
                    iArr5[0] = -64394189;
                    iArr5[1] = 2134658127;
                    iArr5[2] = -240062541;
                    iArr5[3] = -1680944179;
                    iArr5[4] = 1571895779;
                    iArr5[i10] = -781835249;
                    iArr5[6] = -1207986912;
                    iArr5[7] = 1374040941;
                    iArr5[8] = 1368145945;
                    iArr5[9] = -1234825741;
                    objArr12 = new Object[1];
                    c(iArr5, TextUtils.indexOf("", "", 0) + 18, objArr12);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (Exception unused) {
            }
            try {
                Object[] objArr115 = {((String) objArr12[0]).intern()};
                Object obj28 = map.get(-690415720);
                if (obj28 == null) {
                    Class cls26 = (Class) removeParam.initialize((ViewConfiguration.getEdgeSlop() >> 16) + 47, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2248);
                    byte[] bArr8 = $$a;
                    byte b8 = bArr8[19];
                    Object[] objArr116 = new Object[1];
                    a(b8, (byte) (b8 + 5), (byte) (-bArr8[24]), objArr116);
                    obj28 = cls26.getMethod((String) objArr116[0], String.class);
                    map.put(-690415720, obj28);
                }
                Object invoke6 = ((Method) obj28).invoke(null, objArr115);
                if (invoke6 != null) {
                    Object[] objArr117 = new Object[1];
                    b(true, ExpandableListView.getPackedPositionType(0L) + 6, 6 - Process.getGidForName(""), "\u0001￼\u0001\u0001\b\u0005\ufffa", 289 - TextUtils.lastIndexOf("", '0', 0), objArr117);
                    if (invoke6.equals(((String) objArr117[0]).intern())) {
                        int[] iArr6 = new int[12];
                        iArr6[0] = -48690061;
                        iArr6[1] = 729307999;
                        iArr6[2] = -222207307;
                        iArr6[3] = 176587114;
                        iArr6[4] = 245122293;
                        iArr6[i10] = -1476715620;
                        iArr6[6] = 1962997509;
                        iArr6[7] = 1157687349;
                        iArr6[8] = -1823392866;
                        iArr6[9] = 629498107;
                        iArr6[10] = 1383770940;
                        iArr6[11] = -273828153;
                        Object[] objArr118 = new Object[1];
                        c(iArr6, ExpandableListView.getPackedPositionChild(0L) + 24, objArr118);
                        try {
                            Object[] objArr119 = {((String) objArr118[0]).intern()};
                            Object obj29 = map.get(-690415720);
                            if (obj29 == null) {
                                Class cls27 = (Class) removeParam.initialize(47 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 2248 - View.MeasureSpec.getMode(0));
                                byte[] bArr9 = $$a;
                                byte b9 = bArr9[19];
                                Object[] objArr120 = new Object[1];
                                a(b9, (byte) (b9 + 5), (byte) (-bArr9[24]), objArr120);
                                obj29 = cls27.getMethod((String) objArr120[0], String.class);
                                map.put(-690415720, obj29);
                            }
                            String str3 = (String) ((Method) obj29).invoke(null, objArr119);
                            if (str3 != null && (parseInt = Integer.parseInt(str3)) != 0) {
                                int i41 = ThreeDS2Service + 13;
                                createTransaction = i41 % 128;
                                i13 = i41 % 2 == 0 ? parseInt % 8922 : parseInt + EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                if (i13 == 0) {
                                    objArr6 = new Object[]{new int[]{i}, new int[]{i13 ^ i}, null, new int[1]};
                                    Object[] objArr121 = {Integer.valueOf(i3), num, Integer.valueOf((((~(i | (-602579494))) | 33595936 | (~(i32 | 670743351))) * 988) + ((((~(i32 | (-568983558))) | (~(670743351 | i))) * 988) - 669244757))};
                                    Map map9 = removeParam.visaSchemeConfiguration;
                                    Object obj30 = map9.get(-1544987438);
                                    if (obj30 == null) {
                                        Class cls28 = (Class) removeParam.initialize(134 - AndroidCharacter.getMirror('0'), (char) (28641 - (ViewConfiguration.getTapTimeout() >> 16)), 3317 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                        Object[] objArr122 = new Object[1];
                                        a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr122);
                                        obj30 = cls28.getMethod((String) objArr122[0], cls2, cls2, cls2);
                                        map9.put(-1544987438, obj30);
                                    }
                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj30).invoke(null, objArr121)).intValue();
                                } else {
                                    if ((i2 & 64) == 0) {
                                        Object[] objArr123 = new Object[1];
                                        b(true, 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0005ￋ\u0001\t\u0006\u0012\uffffￋ\f\u000f\u0011\u0010\f", 280 - TextUtils.indexOf("", ""), objArr123);
                                        Object[] objArr124 = {((String) objArr123[0]).intern()};
                                        Map map10 = removeParam.visaSchemeConfiguration;
                                        Object obj31 = map10.get(-690415720);
                                        if (obj31 == null) {
                                            Class cls29 = (Class) removeParam.initialize(View.MeasureSpec.getMode(0) + 47, (char) ExpandableListView.getPackedPositionGroup(0L), 2248 - View.MeasureSpec.getSize(0));
                                            byte[] bArr10 = $$a;
                                            byte b10 = bArr10[19];
                                            Object[] objArr125 = new Object[1];
                                            a(b10, (byte) (b10 + 5), (byte) (-bArr10[24]), objArr125);
                                            obj31 = cls29.getMethod((String) objArr125[0], String.class);
                                            map10.put(-690415720, obj31);
                                        }
                                        String str4 = (String) ((Method) obj31).invoke(null, objArr124);
                                        if (str4 != null) {
                                            createTransaction = (ThreeDS2Service + 1) % 128;
                                            Object[] objArr126 = new Object[1];
                                            c(new int[]{2059371834, -552632544, 1540774253, 1741115, 1314662727, 349866151}, TextUtils.indexOf("", "") + 11, objArr126);
                                            if (!str4.contains(new String[]{((String) objArr126[0]).intern()}[0])) {
                                                Object[] objArr127 = new Object[1];
                                                c(new int[]{323083472, 1551630066, -1004064614, -471573171, -59661156, -200442830}, Process.getGidForName("") + 13, objArr127);
                                                String intern36 = ((String) objArr127[0]).intern();
                                                Object[] objArr128 = new Object[1];
                                                b(false, TextUtils.getOffsetBefore("", 0) + 5, (Process.myTid() >> 22) + 16, "ￖ\t\u0010\u0015ￖￖ\u000b\b\u001b\bￖ\u0013\u0016\n\b\u0013", 270 - View.MeasureSpec.getMode(0), objArr128);
                                                String intern37 = ((String) objArr128[0]).intern();
                                                Object[] objArr129 = new Object[1];
                                                c(new int[]{323083472, 1551630066, -1004064614, -471573171, -59661156, -200442830, 1647582427, 1704638153, 1095458646, -1432487687}, 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr129);
                                                String intern38 = ((String) objArr129[0]).intern();
                                                Object[] objArr130 = new Object[1];
                                                c(new int[]{77930954, -459889705, -1095650773, 1079803663}, Color.alpha(0) + 6, objArr130);
                                                String intern39 = ((String) objArr130[0]).intern();
                                                Object[] objArr131 = new Object[1];
                                                c(new int[]{-328625986, 642225615, 1728412407, 1518923829, -1069065809, 561644980}, (Process.myTid() >> 22) + 12, objArr131);
                                                String intern40 = ((String) objArr131[0]).intern();
                                                Object[] objArr132 = new Object[1];
                                                c(new int[]{-328625986, 642225615, 1728412407, 1518923829, -1069065809, 561644980, -561723598, 488613690, 1095458646, -1432487687}, TextUtils.lastIndexOf("", '0') + 18, objArr132);
                                                String intern41 = ((String) objArr132[0]).intern();
                                                Object[] objArr133 = new Object[1];
                                                b(true, 2 - (ViewConfiguration.getPressedStateDuration() >> 16), 21 - (Process.myPid() >> 22), "\u0014\uffd0\uffd0\u0006\u0007\u0002\u0014\r\n\u0002\u0007\uffd0\u000f\n\u0003\uffd0\u000e\u0006\u0015\u0014\u001a", 276 - Color.alpha(0), objArr133);
                                                String intern42 = ((String) objArr133[0]).intern();
                                                Object[] objArr134 = new Object[1];
                                                c(new int[]{-328625986, 642225615, 1728412407, 1518923829, -2101121389, -1485710749, -1069065809, 561644980}, 16 - TextUtils.getOffsetAfter("", 0), objArr134);
                                                String intern43 = ((String) objArr134[0]).intern();
                                                Object[] objArr135 = new Object[1];
                                                c(new int[]{-328625986, 642225615, 1728412407, 1518923829, 1108590732, 1534878836, 1041371132, 1672604549, -729992013, 1152396493, 1962997509, 1157687349, 1095458646, -1432487687}, 25 - TextUtils.indexOf("", "", 0, 0), objArr135);
                                                String intern44 = ((String) objArr135[0]).intern();
                                                Object[] objArr136 = new Object[1];
                                                c(new int[]{-328625986, 642225615, 1728412407, 1518923829, 1647582427, 1704638153, 1095458646, -1432487687}, 13 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr136);
                                                String intern45 = ((String) objArr136[0]).intern();
                                                Object[] objArr137 = new Object[1];
                                                c(new int[]{1305426485, -1392229631, 27438262, 1906006186, 1095458646, -1432487687}, 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr137);
                                                String intern46 = ((String) objArr137[0]).intern();
                                                Object[] objArr138 = new Object[1];
                                                c(new int[]{974323249, 1917505167, -1069065809, 561644980}, 8 - (ViewConfiguration.getTapTimeout() >> 16), objArr138);
                                                String[] strArr6 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((String) objArr138[0]).intern()};
                                                for (int i42 = 0; i42 < 12; i42++) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(strArr6[i42]);
                                                    Object[] objArr139 = new Object[1];
                                                    c(new int[]{1182011852, 1210941025}, KeyEvent.normalizeMetaState(0) + 2, objArr139);
                                                    sb.append(((String) objArr139[0]).intern());
                                                    Object[] objArr140 = {sb.toString()};
                                                    Map map11 = removeParam.visaSchemeConfiguration;
                                                    Object obj32 = map11.get(-108371147);
                                                    if (obj32 == null) {
                                                        Class cls30 = (Class) removeParam.initialize((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 48, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2754 - (Process.myTid() >> 22));
                                                        Object[] objArr141 = new Object[1];
                                                        a($$a[6], (short) 29, 20, objArr141);
                                                        obj32 = cls30.getMethod((String) objArr141[0], String.class);
                                                        map11.put(-108371147, obj32);
                                                    }
                                                    long longValue14 = ((Long) ((Method) obj32).invoke(null, objArr140)).longValue();
                                                    long j31 = longValue14 ^ (-1);
                                                    int m16 = ((int) (SVG$Unit$EnumUnboxingLocalUtility.m(104L, (-1193743977) | j3, ((-104) * (((j4 | (-1193743977)) | longValue14) ^ (-1))) + (((((1193743976 | j31) ^ (-1)) | ((j31 | j3) ^ (-1))) * 104) + (((-103) * longValue14) + 122955629631L)), 1693063196L) >> 32)) & Boxes$$ExternalSyntheticOutline1.m((~(i32 | (-537215233))) | 83891368, 576, (((~((-945275138) | i)) | 408059905) * 576) - 1771464918, -1180696000);
                                                    int i43 = ~(783301403 | i);
                                                    if ((m16 | (((int) r6) & (((i43 | 715139866) * EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE) + ((68161537 | i43) * (-196)) + 604039985))) != 0) {
                                                        i14 = i42 + 110;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i14 = 0;
                                    if (i14 != 0) {
                                        objArr6 = new Object[]{new int[]{i}, new int[]{i14 ^ i}, null, new int[1]};
                                        Object[] objArr142 = {Integer.valueOf(i3), num, Integer.valueOf(Boxes$$ExternalSyntheticOutline1.m((~(i | (-420193795))) | 150994946, 490, (((-269198849) | i32) * (-490)) - 1534818763, -1792338588))};
                                        Map map12 = removeParam.visaSchemeConfiguration;
                                        Object obj33 = map12.get(-1544987438);
                                        if (obj33 == null) {
                                            Class cls31 = (Class) removeParam.initialize(Color.alpha(0) + 86, (char) (28641 - View.MeasureSpec.getMode(0)), View.MeasureSpec.getMode(0) + 3317);
                                            Object[] objArr143 = new Object[1];
                                            a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr143);
                                            obj33 = cls31.getMethod((String) objArr143[0], cls2, cls2, cls2);
                                            map12.put(-1544987438, obj33);
                                        }
                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj33).invoke(null, objArr142)).intValue();
                                    } else {
                                        long[] jArr = {472001035};
                                        Object[] objArr144 = new Object[1];
                                        c(new int[]{-855883648, -750861454, 11101570, -1983769298, 1321906624, -1767144361, -741079782, 2101860416, 1886083725, -1062565861}, 17 - KeyEvent.normalizeMetaState(0), objArr144);
                                        try {
                                            bufferedInputStream2 = new BufferedInputStream(new FileInputStream(((String) objArr144[0]).intern()));
                                            j2 = 0;
                                        } catch (IOException unused2) {
                                            bufferedInputStream2 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bufferedInputStream = null;
                                        }
                                        loop3: while (true) {
                                            try {
                                                int read = bufferedInputStream2.read();
                                                if (read != -1) {
                                                    j2 = ((j2 << i10) ^ read) & 1073741823;
                                                    for (int i44 = 0; i44 < 1; i44++) {
                                                        if (j2 == jArr[i44]) {
                                                            i15 = i44 + 1;
                                                            try {
                                                                bufferedInputStream2.close();
                                                                break loop3;
                                                            } catch (Exception unused3) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (IOException unused4) {
                                            } catch (Throwable th4) {
                                                th = th4;
                                                bufferedInputStream = bufferedInputStream2;
                                                if (bufferedInputStream != null) {
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Exception unused5) {
                                                    }
                                                }
                                                throw th;
                                            }
                                            try {
                                                bufferedInputStream2.close();
                                                break;
                                            } catch (Exception unused6) {
                                            }
                                        }
                                        i16 = i15 == 0 ? EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE : 0;
                                        if (i16 == 0) {
                                            objArr6 = new Object[]{new int[]{i}, new int[]{i16 ^ i}, null, new int[1]};
                                            Object[] objArr145 = {Integer.valueOf(i3), num, Integer.valueOf((((~(i32 | 274631375)) | (~(i | 429707912))) * 950) + (((~(i32 | 429707912)) | (~(i | 274631375))) * (-950)) + (((~((-274631376) | i32)) | (~((-429707913) | i))) * 1900) + 1596914813)};
                                            Map map13 = removeParam.visaSchemeConfiguration;
                                            Object obj34 = map13.get(-1544987438);
                                            if (obj34 == null) {
                                                Class cls32 = (Class) removeParam.initialize(86 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (28641 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.getOffsetAfter("", 0) + 3317);
                                                Object[] objArr146 = new Object[1];
                                                a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr146);
                                                obj34 = cls32.getMethod((String) objArr146[0], cls2, cls2, cls2);
                                                map13.put(-1544987438, obj34);
                                            }
                                            ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj34).invoke(null, objArr145)).intValue();
                                        } else {
                                            long[] jArr2 = {472001035};
                                            Object[] objArr147 = new Object[1];
                                            c(new int[]{-328625986, 642225615, 882240733, -991685637, 1878013586, -1236155855, 571476966, -1297589825, -854394100, -1869834323, -415047481, 92674646}, 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr147);
                                            Object[] objArr148 = {((String) objArr147[0]).intern(), Integer.valueOf(i10), 1073741823L, jArr2};
                                            Map map14 = removeParam.visaSchemeConfiguration;
                                            Object obj35 = map14.get(-2130454992);
                                            if (obj35 == null) {
                                                Class cls33 = (Class) removeParam.initialize(View.resolveSizeAndState(0, 0, 0) + 48, (char) (1941 - ImageFormat.getBitsPerPixel(0)), Process.getGidForName("") + 2563);
                                                Object[] objArr149 = new Object[1];
                                                a($$a[6], (short) 29, 20, objArr149);
                                                obj35 = cls33.getMethod((String) objArr149[0], String.class, cls2, Long.TYPE, long[].class);
                                                map14.put(-2130454992, obj35);
                                            }
                                            long longValue15 = ((Long) ((Method) obj35).invoke(null, objArr148)).longValue();
                                            long j32 = 976605663 | j4;
                                            long m17 = SVG$Unit$EnumUnboxingLocalUtility.m(495L, (((-976605664) | (longValue15 ^ (-1))) ^ (-1)) | (j32 ^ (-1)), (495 * j32) + ((-495) * ((976605663 | longValue15) ^ (-1))) + (((-494) * longValue15) - 482443197522L), 1065385414L);
                                            if (((((int) (m17 >> 32)) & ((((~((-1522767136) | i)) | 85469792) * 49) + (((~(85540724 | i32)) | (-1522767136) | (~((-85540725) | i))) * (-49)) + ((((~((-1522767136) | i32)) | 70932) * 98) - 1661592985))) | (((int) m17) & ((((~(i32 | 1215357003)) | (~(1642383882 | i))) * 627) + (((~((-1215357004) | i)) | 1642383882) * (-627)) + ((((-562301441) | i) * (-627)) - 635053948)))) != 0) {
                                                ThreeDS2Service = (createTransaction + 31) % 128;
                                                objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                int i45 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
                                                Object[] objArr150 = {Integer.valueOf(i3), num, Integer.valueOf((((~(i32 | 815356945)) | 111017657) * EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE) + (((~(i | 815356945)) | 100967080) * EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE) + 779457632)};
                                                Object obj36 = map14.get(-1544987438);
                                                if (obj36 == null) {
                                                    Class cls34 = (Class) removeParam.initialize(85 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 28641), 3317 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                                                    Object[] objArr151 = new Object[1];
                                                    a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr151);
                                                    obj36 = cls34.getMethod((String) objArr151[0], cls2, cls2, cls2);
                                                    map14.put(-1544987438, obj36);
                                                }
                                                ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj36).invoke(null, objArr150)).intValue();
                                            } else {
                                                Object obj37 = map14.get(1911500168);
                                                if (obj37 != null) {
                                                    objArr = null;
                                                } else {
                                                    Class cls35 = (Class) removeParam.initialize((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 47, (char) ((-1) - Process.getGidForName("")), 2856 - TextUtils.getOffsetAfter("", 0));
                                                    Object[] objArr152 = new Object[1];
                                                    a($$a[6], (short) 29, 20, objArr152);
                                                    objArr = null;
                                                    obj37 = cls35.getMethod((String) objArr152[0], null);
                                                    map14.put(1911500168, obj37);
                                                }
                                                long longValue16 = ((Long) ((Method) obj37).invoke(objArr, objArr)).longValue();
                                                long j33 = longValue16 ^ (-1);
                                                long j34 = (-594336018) | j4;
                                                long m18 = SVG$Unit$EnumUnboxingLocalUtility.m(241L, ((j33 | 594336017) ^ (-1)) | ((j34 | longValue16) ^ (-1)), ((-482) * (594336017 | longValue16)) + ((-241) * ((((-594336018) | j33) ^ (-1)) | (j34 ^ (-1)))) + (242 * longValue16) + 287064296211L, -1976209787L);
                                                if (((((int) (m18 >> 32)) & ((((~(i32 | (-1079442871))) | (-698896681)) * 494) + ((((-20769) | i32) * 494) - 1200163658))) | (((int) m18) & (((~((-738200193) | i)) * 566) + (((~((-772837078) | i)) | 34636885) * (-566)) + 987381315))) != 0) {
                                                    objArr6 = new Object[]{new int[]{i ^ EnumC0170g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i16}, null, new int[1]};
                                                    Object[] objArr153 = {Integer.valueOf(i3), num, Integer.valueOf((((~((-138299106) | i)) | (-566040183)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE) + (((~(138299105 | i)) | 562106390) * (-318)) + ((((~((-3933793) | i)) | (~(i32 | 700405495))) * (-318)) - 712951699))};
                                                    Object obj38 = map14.get(-1544987438);
                                                    if (obj38 == null) {
                                                        Class cls36 = (Class) removeParam.initialize(MotionEvent.axisFromString("") + 87, (char) ((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 28641), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3317);
                                                        Object[] objArr154 = new Object[1];
                                                        a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr154);
                                                        obj38 = cls36.getMethod((String) objArr154[0], cls2, cls2, cls2);
                                                        map14.put(-1544987438, obj38);
                                                    }
                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj38).invoke(null, objArr153)).intValue();
                                                } else {
                                                    Object[] objArr155 = {2};
                                                    Object obj39 = map14.get(-924697231);
                                                    if (obj39 == null) {
                                                        Class cls37 = (Class) removeParam.initialize(View.MeasureSpec.makeMeasureSpec(0, 0) + 47, (char) (TextUtils.getTrimmedLength("") + 5586), TextUtils.getCapsMode("", 0, 0) + IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO);
                                                        Object[] objArr156 = new Object[1];
                                                        a($$a[6], (short) 29, 20, objArr156);
                                                        obj39 = cls37.getMethod((String) objArr156[0], cls2);
                                                        map14.put(-924697231, obj39);
                                                    }
                                                    long longValue17 = ((Long) ((Method) obj39).invoke(null, objArr155)).longValue();
                                                    long j35 = longValue17 ^ (-1);
                                                    long m19 = SVG$Unit$EnumUnboxingLocalUtility.m(69L, (j35 | 561618252) ^ (-1), (((((-561618253) | longValue17) ^ (-1)) | (((-561618253) | j3) ^ (-1)) | ((longValue17 | j3) ^ (-1))) * (-69)) + ((((((-561618253) | j35) | j3) ^ (-1)) | (((561618252 | longValue17) | j3) ^ (-1))) * 69) + ((-68) * longValue17) + 39313277640L, 505283698L);
                                                    if (((((int) (m19 >> 32)) & ((((~(183037151 | i32)) | (-1794895584) | (~((-8405131) | i))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + ((~((-1611858433) | i)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~((-1620263563) | i32)) | 1611858432) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106)) | (((int) m19) & ((((~((-4194369) | i)) | 168972561) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) + ((~(i32 | (-4194369))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) + 1820876595))) == 2) {
                                                        objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                        int i46 = i ^ EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                                                        Object[] objArr157 = {Integer.valueOf(i3), num, Integer.valueOf(((i | (-25380885)) * 465) + (((-25684669) | (~((-730023957) | i))) * 930) + ((((~(i | (-25684669))) | (-730023957)) * (-465)) - 1337445475))};
                                                        Object obj40 = map14.get(-1544987438);
                                                        if (obj40 == null) {
                                                            Class cls38 = (Class) removeParam.initialize(86 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 28641), Process.getGidForName("") + 3318);
                                                            Object[] objArr158 = new Object[1];
                                                            a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr158);
                                                            obj40 = cls38.getMethod((String) objArr158[0], cls2, cls2, cls2);
                                                            map14.put(-1544987438, obj40);
                                                        }
                                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj40).invoke(null, objArr157)).intValue();
                                                    } else {
                                                        if ((i2 & 4096) != 0) {
                                                            Object obj41 = map14.get(1758994333);
                                                            if (obj41 != null) {
                                                                objArr11 = null;
                                                            } else {
                                                                Class cls39 = (Class) removeParam.initialize(TextUtils.getTrimmedLength("") + 48, (char) (55743 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 2054 - ((Process.getThreadPriority(0) + 20) >> 6));
                                                                byte[] bArr11 = $$a;
                                                                byte b11 = bArr11[19];
                                                                Object[] objArr159 = new Object[1];
                                                                a(b11, (byte) (b11 + 5), (byte) (-bArr11[24]), objArr159);
                                                                objArr11 = null;
                                                                obj41 = cls39.getMethod((String) objArr159[0], null);
                                                                map14.put(1758994333, obj41);
                                                            }
                                                            long longValue18 = ((Long) ((Method) obj41).invoke(objArr11, objArr11)).longValue();
                                                            long j36 = longValue18 ^ (-1);
                                                            long j37 = (j4 | longValue18) ^ (-1);
                                                            long m20 = SVG$Unit$EnumUnboxingLocalUtility.m(970L, ((423614817 | j36) ^ (-1)) | j37, (1940 * ((longValue18 | 423614817) ^ (-1))) + ((-970) * (((j36 | (-423614818)) ^ (-1)) | j37)) + (971 * longValue18) + 821389132102L, 2012577030L);
                                                            if (((((int) (m20 >> 32)) & ((((~((-1014826688) | i32)) | (~(i32 | 422399723))) * 865) + ((~(422399723 | i)) * 865) + (((~((-422399724) | i32)) | (-1014826688)) * (-865)) + 89010774)) | (((int) m20) & ((((~(1692501588 | i)) | 18096129 | (~(i32 | (-545358421)))) * 369) + (((~((-1692501589) | i32)) | 1165239297) * (-369)) + ((1710597717 | i32) * (-369)) + 802172634))) != 0) {
                                                                objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                int i47 = i ^ EnumC0170g.SDK_ASSET_HEADER_SHIELD_VALUE;
                                                                Object[] objArr160 = {Integer.valueOf(i3), num, Integer.valueOf((((~((-418301868) | i32)) | 149045763) * (-964)) + ((((~(i | (-418301868))) | (-286037421)) * (-964)) - 641753649))};
                                                                Object obj42 = map14.get(-1544987438);
                                                                if (obj42 == null) {
                                                                    Class cls40 = (Class) removeParam.initialize(86 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28640), 3317 - Color.red(0));
                                                                    Object[] objArr161 = new Object[1];
                                                                    a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr161);
                                                                    obj42 = cls40.getMethod((String) objArr161[0], cls2, cls2, cls2);
                                                                    map14.put(-1544987438, obj42);
                                                                }
                                                                ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj42).invoke(null, objArr160)).intValue();
                                                            }
                                                        }
                                                        if ((i2 & 16384) == 0) {
                                                            Object obj43 = map14.get(-1877869269);
                                                            if (obj43 != null) {
                                                                objArr10 = null;
                                                            } else {
                                                                Class cls41 = (Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 47, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 52333), 3661 - Gravity.getAbsoluteGravity(0, 0));
                                                                byte[] bArr12 = $$a;
                                                                byte b12 = bArr12[14];
                                                                byte b13 = (byte) (-bArr12[4]);
                                                                Object[] objArr162 = new Object[1];
                                                                a(b12, b13, (byte) (b13 | 16), objArr162);
                                                                objArr10 = null;
                                                                obj43 = cls41.getMethod((String) objArr162[0], null);
                                                                map14.put(-1877869269, obj43);
                                                            }
                                                            long longValue19 = ((Long) ((Method) obj43).invoke(objArr10, objArr10)).longValue();
                                                            long j38 = (246 * longValue19) - 96161465792L;
                                                            long j39 = longValue19 ^ (-1);
                                                            long j40 = ((((j39 | j4) ^ (-1)) | ((j39 | 394104368) ^ (-1))) * (-245)) + j38;
                                                            long j41 = (j39 | j3) ^ (-1);
                                                            long m21 = SVG$Unit$EnumUnboxingLocalUtility.m(245L, 394104368 | j41, ((-245) * j41) + j40, -750200459L);
                                                            int i48 = ((int) (m21 >> 32)) & ((((~(i32 | 571791878)) | 571759108) * 420) + ((~(571791878 | i)) * 420) + 1450990230);
                                                            int i49 = (int) m21;
                                                            int i50 = ~((-536887330) | i);
                                                            if ((i48 | (i49 & (((~(i32 | (-536887330))) * 476) + (i50 * 952) + (((139593092 | i50) * (-476)) - 1570722199)))) != 0) {
                                                                objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                int i51 = i ^ EnumC0170g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE;
                                                                Object[] objArr163 = {Integer.valueOf(i3), num, Integer.valueOf(((~(i32 | (-146597146))) * EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE) + (((~((-850936434) | i)) | 838861408 | (~(i32 | (-134522121)))) * (-301)) + (((~((-850936434) | i32)) | (-146597146)) * (-602)) + 1080999184)};
                                                                Object obj44 = map14.get(-1544987438);
                                                                if (obj44 == null) {
                                                                    Class cls42 = (Class) removeParam.initialize(85 - ExpandableListView.getPackedPositionChild(0L), (char) (28641 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3316);
                                                                    Object[] objArr164 = new Object[1];
                                                                    a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr164);
                                                                    obj44 = cls42.getMethod((String) objArr164[0], cls2, cls2, cls2);
                                                                    map14.put(-1544987438, obj44);
                                                                }
                                                                ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj44).invoke(null, objArr163)).intValue();
                                                            }
                                                        }
                                                        Object obj45 = map14.get(-1879685559);
                                                        if (obj45 != null) {
                                                            objArr2 = null;
                                                        } else {
                                                            Class cls43 = (Class) removeParam.initialize(47 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 52333), 3661 - TextUtils.indexOf("", ""));
                                                            Object[] objArr165 = new Object[1];
                                                            a($$a[6], (short) 29, 20, objArr165);
                                                            String str5 = (String) objArr165[0];
                                                            objArr2 = null;
                                                            obj45 = cls43.getMethod(str5, null);
                                                            map14.put(-1879685559, obj45);
                                                        }
                                                        long longValue20 = ((Long) ((Method) obj45).invoke(objArr2, objArr2)).longValue();
                                                        long j42 = longValue20 ^ (-1);
                                                        long j43 = 333644927 | j42;
                                                        long m22 = SVG$Unit$EnumUnboxingLocalUtility.m(497L, ((333644927 | j4) ^ (-1)) | ((333644927 | longValue20) ^ (-1)) | (((j42 | (-333644928)) | j3) ^ (-1)), ((((j43 | j3) ^ (-1)) | (((j42 | j4) | (-333644928)) ^ (-1))) * 497) + ((j43 ^ (-1)) * 497) + ((-496) * longValue20) + 165487884288L, -1036144632L);
                                                        int i52 = (((~(730053198 | i32)) | (-2144598607) | (~(2127687686 | i32)) | (~((-713142279) | i))) * (-84)) + 1905160562;
                                                        int i53 = (~(2127687686 | i)) | (-730053199);
                                                        int i54 = ~(i32 | (-2127687687));
                                                        if (((((int) (m22 >> 32)) & (((713142278 | i54) * 84) + ((i53 | i54) * (-84)) + i52)) | (((int) m22) & ((((~(899153749 | i)) | (~(i32 | (-25274370))) | (~((-538072661) | i))) * 192) + (((~(873879380 | i32)) | (-899153750)) * (-384)) + ((i32 | 335806720) * (-192)) + 1788176917))) != 0) {
                                                            objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                            int i55 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
                                                            Object[] objArr166 = {Integer.valueOf(i3), num, Integer.valueOf((((~(359847405 | i)) | 8913410) * 658) + (((33182343 | r0) * (-658)) - 506571983))};
                                                            Object obj46 = map14.get(-1544987438);
                                                            if (obj46 == null) {
                                                                Class cls44 = (Class) removeParam.initialize(86 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (28640 - ExpandableListView.getPackedPositionChild(0L)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3317);
                                                                Object[] objArr167 = new Object[1];
                                                                a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr167);
                                                                obj46 = cls44.getMethod((String) objArr167[0], cls2, cls2, cls2);
                                                                map14.put(-1544987438, obj46);
                                                            }
                                                            ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj46).invoke(null, objArr166)).intValue();
                                                        } else {
                                                            Object obj47 = map14.get(-898109011);
                                                            if (obj47 != null) {
                                                                objArr3 = null;
                                                            } else {
                                                                Class cls45 = (Class) removeParam.initialize(46 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 3566 - Color.argb(0, 0, 0, 0));
                                                                Object[] objArr168 = new Object[1];
                                                                a($$a[6], (short) 29, 20, objArr168);
                                                                String str6 = (String) objArr168[0];
                                                                objArr3 = null;
                                                                obj47 = cls45.getMethod(str6, null);
                                                                map14.put(-898109011, obj47);
                                                            }
                                                            long longValue21 = ((Long) ((Method) obj47).invoke(objArr3, objArr3)).longValue();
                                                            long m23 = SVG$Unit$EnumUnboxingLocalUtility.m(220L, (-762393419) | longValue21 | j3, ((-440) * ((-762393419) | ((j4 | longValue21) ^ (-1)))) + ((((762393418 | (longValue21 ^ (-1))) ^ (-1)) | (((j4 | (-762393419)) | longValue21) ^ (-1))) * 220) + (((-219) * longValue21) - 168488945599L), 2111953702L);
                                                            if (((((int) (m23 >> 32)) & (((~(i32 | (-620904449))) * 501) + ((((~((-620904449) | i)) | 2622848) * 501) - 1712303574))) | (((int) m23) & Boxes$$ExternalSyntheticOutline1.m((~(126072727 | i)) | 1210320896, 490, ((1336393623 | i32) * (-490)) + 1988657895, -1779790220))) != 0) {
                                                                objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                int i56 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE;
                                                                Object[] objArr169 = {Integer.valueOf(i3), num, Integer.valueOf(Boxes$$ExternalSyntheticOutline1.m((~(i | 540748813)) | (~(163590474 | i)), -1324, ((i32 | 8200) * 1324) - 1711800739, -1889684070))};
                                                                Object obj48 = map14.get(-1544987438);
                                                                if (obj48 == null) {
                                                                    Class cls46 = (Class) removeParam.initialize(86 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (28640 - TextUtils.lastIndexOf("", '0', 0)), 3317 - Color.blue(0));
                                                                    Object[] objArr170 = new Object[1];
                                                                    a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr170);
                                                                    obj48 = cls46.getMethod((String) objArr170[0], cls2, cls2, cls2);
                                                                    map14.put(-1544987438, obj48);
                                                                }
                                                                ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj48).invoke(null, objArr169)).intValue();
                                                            } else {
                                                                int i57 = i32;
                                                                if ((65536 & i2) != 0) {
                                                                    createTransaction = (ThreeDS2Service + 17) % 128;
                                                                    Object obj49 = map14.get(-896292721);
                                                                    if (obj49 != null) {
                                                                        j = -68;
                                                                        objArr9 = null;
                                                                    } else {
                                                                        Class cls47 = (Class) removeParam.initialize(46 - TextUtils.lastIndexOf("", '0'), (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 3566);
                                                                        byte[] bArr13 = $$a;
                                                                        byte b14 = bArr13[14];
                                                                        byte b15 = (byte) (-bArr13[4]);
                                                                        j = -68;
                                                                        Object[] objArr171 = new Object[1];
                                                                        a(b14, b15, (byte) (b15 | 16), objArr171);
                                                                        String str7 = (String) objArr171[0];
                                                                        objArr9 = null;
                                                                        obj49 = cls47.getMethod(str7, null);
                                                                        map14.put(-896292721, obj49);
                                                                    }
                                                                    long longValue22 = ((Long) ((Method) obj49).invoke(objArr9, objArr9)).longValue();
                                                                    long j44 = longValue22 ^ (-1);
                                                                    long j45 = (j4 | longValue22) ^ (-1);
                                                                    long m24 = SVG$Unit$EnumUnboxingLocalUtility.m(516L, ((longValue22 | (-108776062)) ^ (-1)) | j45, (((((j44 | (-108776062)) | j3) ^ (-1)) | ((((-108776062) | j4) | longValue22) ^ (-1))) * 516) + ((-516) * (((j44 | j3) ^ (-1)) | ((j4 | 108776061) ^ (-1)) | j45)) + ((517 * longValue22) - 56019671415L), -1113794077L);
                                                                    if (((((int) (m24 >> 32)) & ((((~(1361683471 | i57)) | 75542939) * EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + (((-75501969) | i57) * (-216)) + ((~(1361683471 | i)) * EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 70707082)) | (((int) m24) & ((((-209726049) | i) * 591) + (((~((-209726049) | i57)) | 1646952458) * (-591)) + 643110746))) != 0) {
                                                                        objArr6 = new Object[]{new int[]{i}, new int[]{r7}, null, new int[1]};
                                                                        int i58 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
                                                                        int i59 = (((((~((-609189333) | i57)) | 67853696) | (~((-95149956) | i57))) | (~(636485591 | i))) * (-84)) - 260702749;
                                                                        int i60 = (~(i | (-95149956))) | 609189332;
                                                                        int i61 = ~(i57 | 95149955);
                                                                        Object[] objArr172 = {Integer.valueOf(i3), num, Integer.valueOf((((-636485592) | i61) * 84) + ((i60 | i61) * (-84)) + i59)};
                                                                        Object obj50 = map14.get(-1544987438);
                                                                        if (obj50 == null) {
                                                                            Class cls48 = (Class) removeParam.initialize(85 - Process.getGidForName(""), (char) (28641 - KeyEvent.getDeadChar(0, 0)), 3317 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                            Object[] objArr173 = new Object[1];
                                                                            a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr173);
                                                                            obj50 = cls48.getMethod((String) objArr173[0], cls2, cls2, cls2);
                                                                            map14.put(-1544987438, obj50);
                                                                        }
                                                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj50).invoke(null, objArr172)).intValue();
                                                                    }
                                                                } else {
                                                                    j = -68;
                                                                }
                                                                long[] jArr3 = {624887784092251L};
                                                                Object[] objArr174 = new Object[1];
                                                                c(new int[]{-855883648, -750861454, 11101570, -1983769298, 1321906624, -1767144361, -741079782, 2101860416, 1886083725, -1062565861}, 17 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr174);
                                                                Object[] objArr175 = {((String) objArr174[0]).intern(), 3, 2251799813685247L, jArr3};
                                                                Object obj51 = map14.get(-2130454992);
                                                                if (obj51 == null) {
                                                                    Class cls49 = (Class) removeParam.initialize(48 - TextUtils.getCapsMode("", 0, 0), (char) (View.resolveSize(0, 0) + 1942), 2562 - TextUtils.indexOf("", "", 0, 0));
                                                                    Object[] objArr176 = new Object[1];
                                                                    a($$a[6], (short) 29, 20, objArr176);
                                                                    obj51 = cls49.getMethod((String) objArr176[0], String.class, cls2, Long.TYPE, long[].class);
                                                                    map14.put(-2130454992, obj51);
                                                                }
                                                                long longValue23 = ((Long) ((Method) obj51).invoke(null, objArr175)).longValue();
                                                                long j46 = (-827098040) | longValue23;
                                                                long m25 = SVG$Unit$EnumUnboxingLocalUtility.m(754L, (-827098040) | j4, ((-754) * ((((j4 | 827098039) | longValue23) ^ (-1)) | ((j46 | j3) ^ (-1)))) + (((j46 ^ (-1)) | (((-827098040) | j3) ^ (-1)) | ((longValue23 | j3) ^ (-1))) * (-754)) + ((-753) * longValue23) + 624459019445L, 1214893038L);
                                                                if (((((int) (m25 >> 32)) & Boxes$$ExternalSyntheticOutline1.m((~((-1463185770) | i57)) | 17043752, 933, (((~(25959358 | i57)) | (-1463185770)) * (-933)) - 660741406, -271674194)) | (((int) m25) & ((((~((-541163793) | i57)) | 16782341) * 521) + (((~((-541163793) | i)) * 521) - 69385576)))) != 0) {
                                                                    objArr6 = new Object[]{new int[]{i}, new int[]{r7}, null, new int[1]};
                                                                    int i62 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE;
                                                                    Object[] objArr177 = {Integer.valueOf(i3), num, Integer.valueOf((((~((-581769284) | i)) | (-669998424)) * 49) + (((~(i57 | (-122570005))) | (-581769284) | (~(122570004 | i))) * (-49)) + (((~((-581769284) | i57)) | 547428419) * 98) + 1236487301)};
                                                                    Object obj52 = map14.get(-1544987438);
                                                                    if (obj52 == null) {
                                                                        Class cls50 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 87, (char) (28641 - KeyEvent.keyCodeFromString("")), 3317 - KeyEvent.keyCodeFromString(""));
                                                                        Object[] objArr178 = new Object[1];
                                                                        a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr178);
                                                                        obj52 = cls50.getMethod((String) objArr178[0], cls2, cls2, cls2);
                                                                        map14.put(-1544987438, obj52);
                                                                    }
                                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj52).invoke(null, objArr177)).intValue();
                                                                } else {
                                                                    Object[] objArr179 = new Object[1];
                                                                    b(true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11, "\t\u0011\u0007\u0005\u0017\u0018ￍ\u0014\u0003\u0002ￍ", (ViewConfiguration.getPressedStateDuration() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, objArr179);
                                                                    Object[] objArr180 = {((String) objArr179[0]).intern()};
                                                                    Object obj53 = map14.get(-39554962);
                                                                    if (obj53 == null) {
                                                                        Class cls51 = (Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) Color.alpha(0), Color.rgb(0, 0, 0) + 16779970);
                                                                        Object[] objArr181 = new Object[1];
                                                                        a((byte) (-$$a[41]), r7[16], 20, objArr181);
                                                                        obj53 = cls51.getMethod((String) objArr181[0], String.class);
                                                                        map14.put(-39554962, obj53);
                                                                    }
                                                                    long longValue24 = ((Long) ((Method) obj53).invoke(null, objArr180)).longValue();
                                                                    long j47 = longValue24 ^ (-1);
                                                                    long j48 = (701718939 | longValue24) ^ (-1);
                                                                    long m26 = SVG$Unit$EnumUnboxingLocalUtility.m(722L, (((-701718940) | longValue24) ^ (-1)) | ((j47 | 701718939) ^ (-1)), ((-1444) * (j48 | ((701718939 | j3) ^ (-1)) | ((longValue24 | j3) ^ (-1)))) + (1444 * (j4 | (((-701718940) | j47) ^ (-1)) | j48)) + (((-721) * longValue24) - 505939355019L), 338521808L);
                                                                    if (((((int) (m26 >> 32)) & ((((~((-1377881) | i)) | (~(i57 | 1435848530))) * 979) + ((1435848530 | i) * (-979)) + ((~((-1377881) | i57)) * 979) + 1329686968)) | (((int) m26) & ((((~(1909695133 | i)) | 134219040 | (~((-1095868422) | i57))) * 369) + (((~((-1909695134) | i57)) | 948045752) * (-369)) + ((2043914173 | i57) * (-369)) + 802172634))) != 0) {
                                                                        objArr6 = new Object[]{new int[]{i}, new int[]{r7}, null, new int[1]};
                                                                        int i63 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE;
                                                                        Object[] objArr182 = {Integer.valueOf(i3), num, Integer.valueOf((((~((-69270974) | i57)) | 2138149) * 983) + ((((~((-635068315) | i57)) | (-69270974)) * (-983)) - 771351886))};
                                                                        Object obj54 = map14.get(-1544987438);
                                                                        if (obj54 == null) {
                                                                            Class cls52 = (Class) removeParam.initialize((ViewConfiguration.getDoubleTapTimeout() >> 16) + 86, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28640), Color.alpha(0) + 3317);
                                                                            Object[] objArr183 = new Object[1];
                                                                            a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr183);
                                                                            obj54 = cls52.getMethod((String) objArr183[0], cls2, cls2, cls2);
                                                                            map14.put(-1544987438, obj54);
                                                                        }
                                                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj54).invoke(null, objArr182)).intValue();
                                                                    } else {
                                                                        Object obj55 = map14.get(-481111141);
                                                                        if (obj55 != null) {
                                                                            objArr4 = null;
                                                                        } else {
                                                                            Class cls53 = (Class) removeParam.initialize(48 - TextUtils.getTrimmedLength(""), (char) TextUtils.indexOf("", "", 0), 2707 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                                            Object[] objArr184 = new Object[1];
                                                                            a($$a[6], (short) 29, 20, objArr184);
                                                                            objArr4 = null;
                                                                            obj55 = cls53.getMethod((String) objArr184[0], null);
                                                                            map14.put(-481111141, obj55);
                                                                        }
                                                                        long longValue25 = ((Long) ((Method) obj55).invoke(objArr4, objArr4)).longValue();
                                                                        long j49 = longValue25 ^ (-1);
                                                                        long j50 = j49 | 1218728063;
                                                                        long m27 = SVG$Unit$EnumUnboxingLocalUtility.m(623L, (j50 ^ (-1)) | ((j49 | j3) ^ (-1)) | ((1218728063 | j3) ^ (-1)), ((-623) * (j4 | ((longValue25 | (-1218728064)) ^ (-1)))) + (((j50 | j3) ^ (-1)) * 623) + ((-622) * longValue25) + 760486311312L, 324894386L);
                                                                        int i64 = ~(1924336821 | i);
                                                                        if (((((int) (m27 >> 32)) & ((((~((-1924336822) | i)) | 268436480 | (~((-487110411) | i))) * 407) + ((i64 | (~(487110410 | i57)) | 268436480) * 407) + (((-2143010752) | i64) * (-814)) + 2004675495)) | (((int) m27) & (((~(i57 | (-1447014964))) * EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE) + (((~((-9788554) | i)) | 8408200 | (~((-1445634611) | i57))) * (-301)) + ((((~((-9788554) | i57)) | (-1447014964)) * (-602)) - 2010486494)))) != 0) {
                                                                            objArr6 = new Object[]{new int[]{i}, new int[]{r7}, null, new int[1]};
                                                                            int i65 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                                                                            Object[] objArr185 = {Integer.valueOf(i3), num, Integer.valueOf((((~((-663099281) | i57)) | (-41240008)) * 68) + ((~((-7422024) | i57)) * (-68)) + (((~((-33817985) | i57)) | (-670521304) | (~(i | 663099280))) * (-68)) + 1367581683)};
                                                                            Object obj56 = map14.get(-1544987438);
                                                                            if (obj56 == null) {
                                                                                Class cls54 = (Class) removeParam.initialize(86 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 28642), 3317 - (ViewConfiguration.getTapTimeout() >> 16));
                                                                                Object[] objArr186 = new Object[1];
                                                                                a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr186);
                                                                                obj56 = cls54.getMethod((String) objArr186[0], cls2, cls2, cls2);
                                                                                map14.put(-1544987438, obj56);
                                                                            }
                                                                            ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj56).invoke(null, objArr185)).intValue();
                                                                        } else {
                                                                            if ((2097152 & i2) == 0) {
                                                                                Object obj57 = map14.get(-869420914);
                                                                                if (obj57 != null) {
                                                                                    objArr8 = null;
                                                                                } else {
                                                                                    Class cls55 = (Class) removeParam.initialize(48 - (Process.myTid() >> 22), (char) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 27780), View.combineMeasuredStates(0, 0) + 2441);
                                                                                    Object[] objArr187 = new Object[1];
                                                                                    a($$a[6], (short) 29, 20, objArr187);
                                                                                    objArr8 = null;
                                                                                    obj57 = cls55.getMethod((String) objArr187[0], null);
                                                                                    map14.put(-869420914, obj57);
                                                                                }
                                                                                long longValue26 = ((Long) ((Method) obj57).invoke(objArr8, objArr8)).longValue();
                                                                                long j51 = longValue26 ^ (-1);
                                                                                long m28 = SVG$Unit$EnumUnboxingLocalUtility.m(69L, (j51 | (-1167204831)) ^ (-1), ((-69) * (((longValue26 | j3) ^ (-1)) | ((1167204830 | longValue26) ^ (-1)) | ((1167204830 | j3) ^ (-1)))) + (((((1167204830 | j51) | j3) ^ (-1)) | ((((-1167204831) | longValue26) | j3) ^ (-1))) * 69) + ((j * longValue26) - 81704338170L), -8432867L);
                                                                                int i66 = (((~((-1782671719) | i57)) | 65826) * (-245)) - 1160112332;
                                                                                int i67 = ~((-1782671719) | i);
                                                                                if (((((int) (m28 >> 32)) & (((i67 | (-345445308)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) + (i67 * (-245)) + i66)) | (((int) m28) & ((((~((-1696744587) | i57)) | (-259518177)) * EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE) + ((((~((-1696744587) | i)) | 1610612746) * EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE) - 1704616964)))) != 0) {
                                                                                    objArr6 = new Object[]{new int[]{i}, new int[]{r7}, null, new int[1]};
                                                                                    int i68 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                                                                    Object[] objArr188 = {Integer.valueOf(i3), num, Integer.valueOf((((~((-279043467) | i)) | (-435814352)) * 433) + (((~((-425295822) | i)) | (-279043467)) * (-433)) + (((~((-10518531) | i57)) * 433) - 392900438))};
                                                                                    Object obj58 = map14.get(-1544987438);
                                                                                    if (obj58 == null) {
                                                                                        Class cls56 = (Class) removeParam.initialize(85 - ExpandableListView.getPackedPositionChild(0L), (char) (TextUtils.lastIndexOf("", '0', 0) + 28642), 3317 - TextUtils.getOffsetBefore("", 0));
                                                                                        Object[] objArr189 = new Object[1];
                                                                                        a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr189);
                                                                                        obj58 = cls56.getMethod((String) objArr189[0], cls2, cls2, cls2);
                                                                                        map14.put(-1544987438, obj58);
                                                                                    }
                                                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj58).invoke(null, objArr188)).intValue();
                                                                                }
                                                                            }
                                                                            if ((524288 & i2) == 0) {
                                                                                Object obj59 = map14.get(-1691149417);
                                                                                if (obj59 != null) {
                                                                                    objArr7 = null;
                                                                                } else {
                                                                                    Class cls57 = (Class) removeParam.initialize((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 47, (char) KeyEvent.keyCodeFromString(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3220);
                                                                                    Object[] objArr190 = new Object[1];
                                                                                    a($$a[6], (short) 29, 20, objArr190);
                                                                                    objArr7 = null;
                                                                                    obj59 = cls57.getMethod((String) objArr190[0], null);
                                                                                    map14.put(-1691149417, obj59);
                                                                                }
                                                                                long longValue27 = ((Long) ((Method) obj59).invoke(objArr7, objArr7)).longValue();
                                                                                long j52 = longValue27 ^ (-1);
                                                                                long m29 = SVG$Unit$EnumUnboxingLocalUtility.m(662L, ((1726458150 | longValue27) ^ (-1)) | ((j52 | (-1726458151)) ^ (-1)), ((-1324) * ((((-1726458151) | j3) ^ (-1)) | ((longValue27 | j3) ^ (-1)))) + (1324 * (j4 | ((1726458150 | j52) ^ (-1)))) + ((-661) * longValue27) + 1141188837811L, -172542938L);
                                                                                if (((((int) (m29 >> 32)) & Boxes$$ExternalSyntheticOutline1.m(~((-20989317) | i), -1504, (((~((-695518600) | i)) | 674529283) * 1504) - 1320242614, 1877709248)) | (((int) m29) & (((~((-1079511705) | i)) * 566) + (((~((-1105042362) | i)) | 25530657) * (-566)) + 128223563))) != 0) {
                                                                                    objArr6 = new Object[]{new int[]{i}, new int[]{i ^ 280}, null, new int[1]};
                                                                                    int i69 = (~(226680041 | i57)) | (-1073676010) | (~(931019329 | i57));
                                                                                    Object[] objArr191 = {Integer.valueOf(i3), num, Integer.valueOf((((~((-931019330) | i57)) | (~(i57 | (-226680042)))) * 590) + (i69 * (-1180)) + (((~(i | (-84023362))) | i69) * 590) + 561510461)};
                                                                                    Object obj60 = map14.get(-1544987438);
                                                                                    if (obj60 == null) {
                                                                                        Class cls58 = (Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 85, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28640), View.MeasureSpec.makeMeasureSpec(0, 0) + 3317);
                                                                                        Object[] objArr192 = new Object[1];
                                                                                        a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr192);
                                                                                        obj60 = cls58.getMethod((String) objArr192[0], cls2, cls2, cls2);
                                                                                        map14.put(-1544987438, obj60);
                                                                                    }
                                                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj60).invoke(null, objArr191)).intValue();
                                                                                }
                                                                            }
                                                                            Object obj61 = map14.get(-601987854);
                                                                            if (obj61 != null) {
                                                                                objArr5 = null;
                                                                            } else {
                                                                                Class cls59 = (Class) removeParam.initialize(TextUtils.indexOf("", "", 0, 0) + 48, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 36007), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3707);
                                                                                Object[] objArr193 = new Object[1];
                                                                                a($$a[6], (short) 29, 20, objArr193);
                                                                                objArr5 = null;
                                                                                obj61 = cls59.getMethod((String) objArr193[0], null);
                                                                                map14.put(-601987854, obj61);
                                                                            }
                                                                            long longValue28 = ((Long) ((Method) obj61).invoke(objArr5, objArr5)).longValue();
                                                                            long j53 = longValue28 ^ (-1);
                                                                            long j54 = (j4 | longValue28) ^ (-1);
                                                                            long m30 = SVG$Unit$EnumUnboxingLocalUtility.m(516L, ((longValue28 | 990377262) ^ (-1)) | j54, (((((j53 | 990377262) | j3) ^ (-1)) | (((990377262 | j4) | longValue28) ^ (-1))) * 516) + ((-516) * (((j53 | j3) ^ (-1)) | ((j4 | (-990377263)) ^ (-1)) | j54)) + (517 * longValue28) + 510044290445L, -1125910529L);
                                                                            int i70 = ((int) ((long) ((((int) (m30 >> 32)) & ((((-537003273) | i) * 668) + (((461123681 | (~((-976102730) | i))) * 1336) + ((((~(461123681 | i)) | (-976102730)) * (-668)) + 354717942)))) | (((int) m30) & (((i | 272695680) * 54) + (((((~(846306186 | i)) | 272695680) | (~((-846306187) | i57))) * 54) + ((((~((-590920224) | i57)) | 17309717) * (-108)) + (-498245501)))))))) != 0 ? i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i;
                                                                            if (i70 != i) {
                                                                                objArr6 = new Object[]{new int[]{i}, new int[]{i70}, null, new int[1]};
                                                                                Object[] objArr194 = {Integer.valueOf(i3), num, Integer.valueOf(((147107671 | (~(i | (-851446960))) | (~(i57 | 851446959))) * 45) + (((~(147107671 | i)) | 134521680) * (-45)) + ((((~(147107671 | i57)) | 851446959) * (-90)) - 1960131166))};
                                                                                Object obj62 = map14.get(-1544987438);
                                                                                if (obj62 == null) {
                                                                                    Class cls60 = (Class) removeParam.initialize(86 - TextUtils.indexOf("", "", 0), (char) (28642 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3317);
                                                                                    Object[] objArr195 = new Object[1];
                                                                                    a((byte) ($$a[2] + 1), (short) 27, r1[19], objArr195);
                                                                                    obj62 = cls60.getMethod((String) objArr195[0], cls2, cls2, cls2);
                                                                                    map14.put(-1544987438, obj62);
                                                                                }
                                                                                ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj62).invoke(null, objArr194)).intValue();
                                                                                Object[] objArr196 = {objArr6};
                                                                                Object obj63 = map14.get(60598709);
                                                                                if (obj63 == null) {
                                                                                    Class cls61 = (Class) removeParam.initialize(80 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 3881 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                                                    byte[] bArr14 = $$a;
                                                                                    byte b16 = bArr14[6];
                                                                                    byte b17 = bArr14[19];
                                                                                    Object[] objArr197 = new Object[1];
                                                                                    a(b16, b17, (byte) (b17 | 12), objArr197);
                                                                                    obj63 = cls61.getMethod((String) objArr197[0], Object[].class);
                                                                                    map14.put(60598709, obj63);
                                                                                }
                                                                                ((Method) obj63).invoke(obj, objArr196);
                                                                            } else {
                                                                                Object[] objArr198 = {Integer.valueOf(i), obj, Integer.valueOf(i3), Integer.valueOf(i2)};
                                                                                Object obj64 = map14.get(-679937179);
                                                                                if (obj64 == null) {
                                                                                    obj64 = ((Class) removeParam.initialize(76 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 3803 - TextUtils.lastIndexOf("", '0', 0))).getDeclaredConstructor(cls2, (Class) removeParam.initialize(MotionEvent.axisFromString("") + 81, (char) View.MeasureSpec.getMode(0), (ViewConfiguration.getEdgeSlop() >> 16) + 3881), cls2, cls2);
                                                                                    map14.put(-679937179, obj64);
                                                                                }
                                                                                Object newInstance = ((Constructor) obj64).newInstance(objArr198);
                                                                                try {
                                                                                    Object[] objArr199 = new Object[1];
                                                                                    c(new int[]{1347546517, 1596808319, 1857298264, -903972075, 207995845, -213405114, -1169372978, -131681451}, TextUtils.indexOf("", "", 0) + 16, objArr199);
                                                                                    Class<?> cls62 = Class.forName(((String) objArr199[0]).intern());
                                                                                    Object[] objArr200 = new Object[1];
                                                                                    b(true, Color.blue(0) + 5, 4 - Process.getGidForName(""), "\u0005\u0003\ufff2\u0005\u0004", View.getDefaultSize(0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, objArr200);
                                                                                    cls62.getMethod(((String) objArr200[0]).intern(), null).invoke(newInstance, null);
                                                                                    objArr6 = new Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                                                                    Object[] objArr201 = {Integer.valueOf(i3), 0, Integer.valueOf((((~(i | (-564134435))) | (~(i57 | (-138432518)))) * EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + ((((~((-565020603) | i57)) | (~((-139318686) | i))) * EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 991927639))};
                                                                                    Object obj65 = map14.get(-1544987438);
                                                                                    if (obj65 == null) {
                                                                                        Class cls63 = (Class) removeParam.initialize(86 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 28641), (Process.myPid() >> 22) + 3317);
                                                                                        Object[] objArr202 = new Object[1];
                                                                                        a((byte) ($$a[2] + 1), (short) 27, r4[19], objArr202);
                                                                                        obj65 = cls63.getMethod((String) objArr202[0], cls2, cls2, cls2);
                                                                                        map14.put(-1544987438, obj65);
                                                                                    }
                                                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj65).invoke(null, objArr201)).intValue();
                                                                                } catch (Throwable th5) {
                                                                                    Throwable cause3 = th5.getCause();
                                                                                    if (cause3 != null) {
                                                                                        throw cause3;
                                                                                    }
                                                                                    throw th5;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return objArr6;
                            }
                        } catch (Throwable th6) {
                            Throwable cause4 = th6.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th6;
                        }
                    }
                }
                i13 = 0;
                if (i13 == 0) {
                }
                return objArr6;
            } catch (Throwable th7) {
                Throwable cause5 = th7.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th7;
            }
            i15 = 0;
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            return objArr6;
        } catch (Throwable th8) {
            Throwable cause6 = th8.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 33 - s2;
        int i5 = 121 - s;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[23 - i];
        int i6 = 22 - i;
        if (bArr == null) {
            i2 = i4;
            int i7 = i6;
            int i8 = 0;
            i4 = i4 + i7 + 2;
            i2++;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i2];
            i4 = i4 + i7 + 2;
            i2++;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i4 = i5;
            i2 = i4;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        if (str != null) {
            $10 = ($11 + 41) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr3 = new char[i2];
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i4 = getsdkinfo.getWarnings;
            if (i4 >= i2) {
                break;
            }
            $10 = ($11 + 91) % 128;
            char c = cArr2[i4];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr3[i4] = c2;
            try {
                Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf(initialize)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj == null) {
                    Class cls = (Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 67, (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 45769), View.getDefaultSize(0, 0) + 4879);
                    Class cls2 = Integer.TYPE;
                    obj = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, obj);
                }
                cArr3[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getsdkinfo, getsdkinfo};
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, (char) ((-1) - Process.getGidForName("")), ((byte) KeyEvent.getModifierMetaStateMask()) + 12374)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                $11 = ($10 + 55) % 128;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            getsdkinfo.get = i;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            int i5 = getsdkinfo.get;
            System.arraycopy(cArr4, 0, cArr3, i2 - i5, i5);
            int i6 = getsdkinfo.get;
            System.arraycopy(cArr4, i6, cArr3, 0, i2 - i6);
            $11 = ($10 + 23) % 128;
        }
        if (z) {
            $11 = ($10 + 37) % 128;
            char[] cArr5 = new char[i2];
            getsdkinfo.getWarnings = 0;
            while (true) {
                int i7 = getsdkinfo.getWarnings;
                if (i7 >= i2) {
                    break;
                }
                cArr5[i7] = cArr3[(i2 - i7) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(59 - (ViewConfiguration.getTapTimeout() >> 16), (char) Color.green(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12373)).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    private static void c(int[] iArr, int i, Object[] objArr) {
        int i2;
        int i3;
        char c;
        int[] iArr2;
        int i4;
        int[] iArr3;
        int length;
        int[] iArr4;
        int i5;
        char[] cArr;
        Object method;
        createTransaction createtransaction = new createTransaction();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr5 = ThreeDS2ServiceInstance;
        Class cls = Integer.TYPE;
        if (iArr5 != null) {
            int i6 = $11 + 51;
            i2 = 2;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr5.length;
                iArr4 = new int[length];
            } else {
                length = iArr5.length;
                iArr4 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr5[i7])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(2095751688);
                    if (obj != null) {
                        i5 = i7;
                        method = obj;
                        cArr = cArr2;
                    } else {
                        i5 = i7;
                        Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatDelay() >> 16) + 64, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1196);
                        Object[] objArr3 = new Object[1];
                        cArr = cArr2;
                        d((short) 1, 0, 0, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2095751688, method);
                    }
                    iArr4[i5] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    i7 = i5 + 1;
                    $11 = ($10 + 49) % 128;
                    cArr2 = cArr;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr5 = iArr4;
        } else {
            i2 = 2;
        }
        char[] cArr4 = cArr2;
        int i8 = 16;
        int length2 = iArr5.length;
        int[] iArr6 = new int[length2];
        int[] iArr7 = ThreeDS2ServiceInstance;
        if (iArr7 != null) {
            $10 = ($11 + 81) % 128;
            int length3 = iArr7.length;
            int[] iArr8 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr7[i9])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(2095751688);
                if (obj2 != null) {
                    iArr2 = iArr7;
                    i4 = length3;
                    iArr3 = iArr8;
                } else {
                    iArr2 = iArr7;
                    i4 = length3;
                    Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64, (char) Color.green(0), 1197 - (ViewConfiguration.getScrollBarSize() >> 8));
                    Object[] objArr5 = new Object[1];
                    iArr3 = iArr8;
                    d((short) 1, 0, 0, objArr5);
                    obj2 = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2095751688, obj2);
                }
                iArr3[i9] = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                i9++;
                iArr7 = iArr2;
                iArr8 = iArr3;
                length3 = i4;
            }
            $10 = ($11 + 27) % 128;
            iArr7 = iArr8;
        }
        char c2 = 0;
        System.arraycopy(iArr7, 0, iArr6, 0, length2);
        createtransaction.initialize = 0;
        while (true) {
            int i10 = createtransaction.initialize;
            if (i10 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            int i11 = iArr[i10];
            char c3 = (char) (i11 >> 16);
            cArr4[c2] = c3;
            char c4 = (char) i11;
            cArr4[1] = c4;
            char c5 = (char) (iArr[i10 + 1] >> 16);
            cArr4[i2] = c5;
            char c6 = (char) iArr[i10 + 1];
            char c7 = 3;
            cArr4[3] = c6;
            createtransaction.getWarnings = (c3 << 16) + c4;
            createtransaction.get = (c5 << 16) + c6;
            createTransaction.ThreeDS2ServiceInstance(iArr6);
            int i12 = 0;
            while (true) {
                i3 = createtransaction.getWarnings;
                if (i12 >= i8) {
                    break;
                }
                int i13 = i3 ^ iArr6[i12];
                createtransaction.getWarnings = i13;
                int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i13);
                Object[] objArr6 = new Object[4];
                objArr6[c7] = createtransaction;
                objArr6[i2] = createtransaction;
                objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                objArr6[0] = createtransaction;
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-411264147);
                if (obj3 != null) {
                    c = c7;
                } else {
                    c = c7;
                    obj3 = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 50, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13121)).getMethod("y", Object.class, cls, Object.class, Object.class);
                    map3.put(-411264147, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                createtransaction.getWarnings = createtransaction.get;
                createtransaction.get = intValue;
                i12++;
                c7 = c;
                i8 = 16;
            }
            char c8 = c7;
            int i14 = createtransaction.get;
            createtransaction.getWarnings = i14;
            createtransaction.get = i3;
            int i15 = i3 ^ iArr6[16];
            createtransaction.get = i15;
            int i16 = i14 ^ iArr6[17];
            createtransaction.getWarnings = i16;
            cArr4[0] = (char) (i16 >>> 16);
            cArr4[1] = (char) i16;
            cArr4[i2] = (char) (i15 >>> 16);
            cArr4[c8] = (char) i15;
            createTransaction.ThreeDS2ServiceInstance(iArr6);
            int i17 = createtransaction.initialize;
            cArr3[i17 * 2] = cArr4[0];
            cArr3[(i17 * 2) + 1] = cArr4[1];
            cArr3[(i17 * 2) + 2] = cArr4[i2];
            cArr3[(i17 * 2) + 3] = cArr4[c8];
            int i18 = i2;
            Object[] objArr7 = new Object[i18];
            objArr7[1] = createtransaction;
            objArr7[0] = createtransaction;
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj4 = map4.get(-1870831722);
            if (obj4 != null) {
                i8 = 16;
            } else {
                i8 = 16;
                Class cls4 = (Class) removeParam.initialize(KeyEvent.keyCodeFromString("") + 99, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1880);
                Object[] objArr8 = new Object[1];
                d((short) 0, 0, 0, objArr8);
                obj4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-1870831722, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            i2 = i18;
            c2 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = 1 - (i * 4);
        byte[] bArr = $$d;
        int i6 = 118 - (s * 5);
        int i7 = 4 - (i2 * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i4 = 0;
            int i8 = i7;
            int i9 = i5;
            i6 = (-i6) + i9;
            i7 = i8 + 1;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i7];
            int i10 = i7;
            i9 = i6;
            i6 = b;
            bArr3 = bArr;
            i8 = i10;
            i6 = (-i6) + i9;
            i7 = i8 + 1;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{96, PnmConstants.PPM_RAW_CODE, 36, PnmConstants.PGM_RAW_CODE, -4, 13, 18, 8, -15, -2, -35, 13, -35, 31, 16, 11, 2, -15, -8, 0, -30, 35, 3, -1, -21, 11, -13, 0, -35, -7, 13, 3, -3, -4, 13, -31, 8, 15, -6, -7, 3, -9, 10};
        $$b = 79;
    }

    public static void init$1() {
        $$d = new byte[]{14, -39, PSSSigner.TRAILER_IMPLICIT, -42};
        $$e = 100;
    }

    @Override // java.lang.Runnable
    public void run() {
        createTransaction = (ThreeDS2Service + 61) % 128;
        at.getWarnings(this.get, this.getWarnings);
        createTransaction = (ThreeDS2Service + 105) % 128;
    }
}
