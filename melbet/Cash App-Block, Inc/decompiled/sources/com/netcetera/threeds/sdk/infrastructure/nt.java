package com.netcetera.threeds.sdk.infrastructure;

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
import com.netcetera.threeds.sdk.infrastructure.nw;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class nt implements nw.getWarnings {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static long ThreeDS2ServiceInstance;
    private static long getWarnings;
    private static char[] initialize;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ThreeDS2Service = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        initialize = new char[]{35146, 64589, 25378, 54814, 23857, 49352, 14272, 47865, 8585, 38048, 6745, 35146, 64579, 25442, 54805, 23864, 49359, 35146, 64589, 25378, 54790, 23842, 49365, 14272, 47867, 8587, 38054, 6674, 33099, 62561, 31492, 60961, 21976, 55545, 20449, 45720, 14755, 44866, 4735, 39286, 41373, 54402, 19370, 65261, 30207, 59419, 7961, 37433, 35164, 64591, 25465, 54789, 23861, 49352, 14272, 53916, 42885, 14509, 36294, 1782, 39691, 27665, 57640, 31321, 35153, 64589, 25464, 54809, 23840, 35153, 64597, 35144, 64592, 25443, 54805, 23842, 49371, 14282, 47845, 35144, 64592, 25443, 54800, 23859, 49365, 14280, 47842, 8589, 38065, 6728, 33090, 35146, 64583, 25441, 54809, 23845, 49364, 14288, 32104, 2153, 38720, 8738, 43294, 13560, 50167, 24402, 10826, 46457, 6, 35645, 5830, 57742, 35147, 64593, 24124, 11060, 46101, 360, 35411, 6052, 57513, 28060, 63213, 17288, 52536, 22053, 8982, 44137, 14678, 33466, 17455, 12590, 44569, 7037, 36956, 3516, 64153, 30597, 60644, 22998, 55089, 35149, 64588, 25467, 54815, 23870, 49374, 14331, 47869, 8593, 38079, 6750, 33097, 62572, 31513, 35095, 64593, 25461, 54789, 23844, 49375, 14281, 47777, 8586, 38075, 6738, 33033, 35095, 64594, 25470, 54809, 23859, 49301, 14295, 47851, 8580, 38068, 6675, 33109, 62580, 31499, 60960, 21963, 55531, 35095, 64593, 25461, 54789, 23844, 49375, 14281, 47777, 8603, 38064, 6741, 33096, 42741, 54195, 19607, 63975, 29382, 61245, 6187, 38211, 3698, 47954, 13751, 44714, 60409, 40634, 391, 46326, 16346, 41531, 21816, 55375, 17252, 63061, 30908, 35095, 64593, 25454, 54815, 23870, 35095, 64583, 25464, 54805, 47588, 52451, 21388, 59066, 28043, 61565, 1894, 35396, 4456, 42004, 11005, 45563, 50394, 46433, 49249, 24407, 59938, 24837, 64743, 3067, 34522, 7615, 43143, 9826, 27137, 7964, 32821, 13650, 48686, 9113, 54402, 22973, 49814, 30705, 63769, 25129, 5940, 39003, 3425, 46723, 15271, 44220, 35144, 64583, 25470, 54789, 23865, 49353, 14288, 47776, 8603, 38059, 6735, 33032, 62578, 31493, 60987, 21962, 55495, 20451, 45711, 14773, 44885, 4713, 39287, 35095, 64593, 25454, 54815, 23870, 49301, 35095, 64593, 25461, 54789, 23844, 49375, 14281, 47777, 8586, 38075, 6738, 33033, 62566, 31499, 60989, 21970, 55531, 20451, 45706, 14771, 44831, 6847, 28665, 61661, 17837, 52876, 21367, 42081, 10505, 45619, 1822, 35259, 4854, 26570, 59563, 32146, 50745, 269, 29771, 60259, 24131, 54568, 18633, 49104, 12987, 35787, 65210, 24969, 54503, 24485, 49721, 35095, 64594, 25470, 54809, 23859, 49301, 29785, 328, 40561, 11036, 41077, 15837, 51918, 18411, 56452, 27127, 59235, 31813, 2425, 34308, 4926, 43217, 35147, 64598, 25453, 54788, 23844};
        ThreeDS2ServiceInstance = 6256337433848970274L;
        getWarnings = 1250518383387328228L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x126e, code lost:
    
        if (r0 >= 28) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x1270, code lost:
    
        r7 = r45[r0];
        r13 = new java.lang.Object[1];
        b((android.os.SystemClock.uptimeMillis() > r21 ? 1 : (android.os.SystemClock.uptimeMillis() == r21 ? 0 : -1)) + 11, android.graphics.Color.alpha(0) + com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, (char) android.view.KeyEvent.normalizeMetaState(0), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x129d, code lost:
    
        r7 = new java.lang.Object[]{((java.lang.String) r13[0]).intern().concat(java.lang.String.valueOf(r7))};
        r9 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r10 = r9.get(-87104105);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x12ab, code lost:
    
        if (r10 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x12ad, code lost:
    
        r41 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x12f9, code lost:
    
        r9 = ((java.lang.Long) ((java.lang.reflect.Method) r10).invoke(null, r7)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x1306, code lost:
    
        r51 = r9 ^ (-1);
        r47 = (-41912841) | r51;
        r9 = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m(867, (((r47 | r39) ^ (-1)) | (((r9 | (-41912841)) | r37) ^ (-1))) | (((r51 | 41912840) | r37) ^ (-1)), ((-1734) * (((r47 ^ (-1)) | (((-41912841) | r37) ^ (-1))) | ((r51 | r37) ^ (-1)))) + (((-867) * ((((-41912841) | r39) ^ (-1)) | ((r51 | r39) ^ (-1)))) + ((868 * r9) + 36380345120L)), -2133664502);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x13b2, code lost:
    
        if (((((int) (r9 >> 32)) & ((((~(1786091109 | r36)) | 1071649775) * 68) + (((~(r36 | (-1075151873))) * (-68)) + (((((~(2146801647 | r36)) | 710939237) | (~((-1786091110) | r71))) * (-68)) - 1520370430)))) | (((int) r9) & ((((~((-77730982) | r71)) | 554189056) * com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + ((((~(956842242 | r71)) | (-480384168)) * (-470)) + ((((~(956842242 | r36)) | (-480384168)) * (-235)) - 1104146396))))) != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x13b4, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x13b7, code lost:
    
        r6 = r6 + r0;
        r0 = r41 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x13b6, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x12b0, code lost:
    
        r10 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 48, (char) android.view.KeyEvent.keyCodeFromString(""), 2755 - (android.os.Process.getElapsedCpuTime() > r21 ? 1 : (android.os.Process.getElapsedCpuTime() == r21 ? 0 : -1)));
        r12 = (byte) (com.netcetera.threeds.sdk.infrastructure.nt.$$b & 92);
        r41 = r0;
        r0 = new java.lang.Object[1];
        a(r12, (byte) (r12 + 4), com.netcetera.threeds.sdk.infrastructure.nt.$$a[14], r0);
        r10 = r10.getMethod((java.lang.String) r0[0], java.lang.String.class);
        r9.put(-87104105, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x13c4, code lost:
    
        if (r6 < 25.2d) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x13c6, code lost:
    
        r0 = new java.lang.Object[]{new int[]{r71}, new int[]{r4}, null, new int[1]};
        r4 = r71 ^ com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x1401, code lost:
    
        r3 = new java.lang.Object[]{java.lang.Integer.valueOf(r74), 16, java.lang.Integer.valueOf((((~(r71 | 419475402)) | 268479880) * com.plaid.internal.EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE) + (((150995522 | r1) * (-196)) - 847758401))};
        r1 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r2 = r1.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x141c, code lost:
    
        if (r2 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x146e, code lost:
    
        ((int[]) r0[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r3)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x1478, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x141f, code lost:
    
        r2 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(86 - android.text.TextUtils.getCapsMode("", 0, 0), (char) ((android.media.AudioTrack.getMinVolume() > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.media.AudioTrack.getMinVolume() == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)) + 28641), android.text.TextUtils.lastIndexOf("", '0') + 3318);
        r4 = com.netcetera.threeds.sdk.infrastructure.nt.$$a;
        r6 = r4[19];
        r4 = (byte) (-r4[r19]);
        r9 = new java.lang.Object[1];
        a(r6, r4, (byte) (r4 | 36), r9);
        r2 = r2.getMethod((java.lang.String) r9[0], r8, r8, r8);
        r1.put(-1544987438, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x1268, code lost:
    
        if (((((int) (r6 >> 32)) & (((((~(r36 | (-1035143417))) | 286328992) | (~((-1073783045) | r71))) * 140) + ((((~(r36 | (-1822597469))) | 1073783044) * (-280)) + ((((-1822597469) | r71) * 140) + 1772219190)))) | (((int) r6) & ((((~((-920719518) | r71)) | 134759680) * com.plaid.internal.EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE) + (((~((-538972306) | r71)) * (-604)) + ((((~(r36 | (-538972306))) | (~((-381747213) | r71))) * (-302)) + 375902051))))) == 477111747) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04d2, code lost:
    
        if (((((int) (r9 >> 32)) & ((((~(r36 | (-2020587884))) | (~((-837153002) | r71))) * 950) + ((((~((-2020587884) | r71)) | (~(r36 | (-837153002)))) * (-950)) + ((((~(2020587883 | r36)) | (~(837153001 | r71))) * 1900) + 1871737038)))) | (((int) r9) & (((((~((-1392525465) | r36)) | (~((-72616194) | r71))) | (~((-73765) | r71))) * 920) + ((((~((-1465141658) | r36)) | 1392525464) * 920) + ((((~((-1392525465) | r71)) | (~(r36 | (-73765)))) * 920) - 2038855459))))) != 477111747) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0809, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 33) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x080b, code lost:
    
        r7 = new java.lang.Object[1];
        c("뺟\ue680\u0e6e똬\udfcbݰ꼠풊籬ꑢ춎畻鴧슅樻鈯㮅捷謿\u3098塳耨⦜兿來ồ䙠\uee24", android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 22614, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x26a4, code lost:
    
        if (r6 == null) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0824, code lost:
    
        r0 = new java.lang.Object[]{((java.lang.String) r7[0]).intern()};
        r7 = r6.get(-108371147);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0833, code lost:
    
        if (r7 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x256e, code lost:
    
        if (r4 == null) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x087b, code lost:
    
        r9 = ((java.lang.Long) ((java.lang.reflect.Method) r7).invoke(null, r0)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0888, code lost:
    
        r9 = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m(560, ((1106005022 | r9) ^ (-1)) | ((r39 | r9) ^ (-1)), ((-560) * ((((r9 ^ (-1)) | (-1106005023)) | r37) ^ (-1))) + ((((r39 | (-1106005023)) ^ (-1)) * (-560)) + ((561 * r9) + 618256807857L)), 1605324242);
        r0 = (((int) (r9 >> 32)) & ((((~(r36 | 74540071)) | (-1430885797)) * 494) + ((((-1359516033) | r36) * 494) - 374793218))) | (((int) r9) & androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1.m((~(1545985124 | r36)) | (-1585438463), 933, (((~((-108758715) | r36)) | 1545985124) * (-933)) + 545516112, -942297132));
        r14 = 1;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0903, code lost:
    
        if (r0 != 1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0905, code lost:
    
        r14 = 1;
        r29 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0998, code lost:
    
        if (r29 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x099a, code lost:
    
        r0 = new java.lang.Object[4];
        r2 = new int[r14];
        r0[r9] = r2;
        r3 = new int[r14];
        r0[r14] = r3;
        r0[r32] = new int[r14];
        r4 = r71 ^ com.plaid.internal.EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
        r2[r9] = r71;
        r3[r9] = r4;
        r0[2] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x09eb, code lost:
    
        r3 = new java.lang.Object[r32];
        r3[2] = java.lang.Integer.valueOf((((~((-689203248) | r36)) | (~(r36 | 15136040))) * 590) + (((((~((-15136041) | r36)) | 14849280) | (~(r36 | 689203247))) * (-1180)) + ((((~(r71 | (-688916488))) | r2) * 590) - 1858321611)));
        r3[1] = 16;
        r3[0] = java.lang.Integer.valueOf(r74);
        r1 = r6.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0a04, code lost:
    
        if (r1 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0a52, code lost:
    
        ((int[]) r0[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r3)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x090a, code lost:
    
        r29 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0836, code lost:
    
        r7 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(android.text.TextUtils.indexOf("", "", 0, 0) + 48, (char) android.view.View.resolveSizeAndState(0, 0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 2755);
        r9 = (byte) (com.netcetera.threeds.sdk.infrastructure.nt.$$b & 92);
        r10 = com.netcetera.threeds.sdk.infrastructure.nt.$$a;
        r13 = new java.lang.Object[1];
        a(r9, r10[r19], r10[6], r13);
        r7 = r7.getMethod((java.lang.String) r13[0], java.lang.String.class);
        r6.put(-108371147, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x090e, code lost:
    
        r7 = new java.lang.Object[1];
        c("뻂ꩆ鞬茟\uecb1\ud82f앓\u2ef8᨟ް猨屏䧹", 5273 - android.graphics.Color.red(0), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0926, code lost:
    
        r0 = new java.lang.Object[]{((java.lang.String) r7[0]).intern()};
        r7 = r6.get(-690415720);
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x092e, code lost:
    
        if (r7 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0973, code lost:
    
        r0 = ((java.lang.reflect.Method) r7).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x097a, code lost:
    
        r9 = 0;
        r14 = 1;
        r10 = new java.lang.Object[1];
        c("뺁", 15551 - (android.util.TypedValue.complexToFraction(0, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.util.TypedValue.complexToFraction(0, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)), r10);
        r29 = r0.equals(((java.lang.String) r10[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0931, code lost:
    
        r7 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(47 - android.graphics.Color.alpha(0), (char) (android.text.TextUtils.lastIndexOf("", '0') + 1), 2248 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
        r10 = (byte) (-com.netcetera.threeds.sdk.infrastructure.nt.$$a[24]);
        r13 = new java.lang.Object[1];
        a(r10, (byte) (r10 + 2), r9[19], r13);
        r7 = r7.getMethod((java.lang.String) r13[0], java.lang.String.class);
        r6.put(-690415720, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0a5c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x05e5, code lost:
    
        if (((((int) (r9 >> 32)) & ((((~(r36 | (-1157890051))) | (~((-276832769) | r71))) * com.plaid.internal.EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + ((((~(1869399083 | r36)) | (~(988341801 | r71))) * com.plaid.internal.EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 530268190))) | (((int) r9) & (((r71 | (-1593507568)) * 54) + (((((~((-111696070) | r71)) | (-1593507568)) | (~(r36 | 111696069))) * 54) + ((((~(r36 | (-1548922480))) | 67110981) * (-108)) + 79297315))))) != 477111747) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0a07, code lost:
    
        r1 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > r21 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == r21 ? 0 : -1)) + 87, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 28642), 3317 - android.view.View.resolveSize(0, 0));
        r2 = com.netcetera.threeds.sdk.infrastructure.nt.$$a;
        r4 = r2[19];
        r2 = (byte) (-r2[r19]);
        r9 = new java.lang.Object[1];
        a(r4, r2, (byte) (r2 | 36), r9);
        r1 = r1.getMethod((java.lang.String) r9[0], r8, r8, r8);
        r6.put(-1544987438, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x06e3, code lost:
    
        if (((((int) (r9 >> 32)) & ((((-663131886) | r71) * 104) + (((~(r36 | (-42340966))) * (-104)) + ((((~((-2100358297) | r71)) | 1479567376) * 104) - 2005432166)))) | (((int) r9) & androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1.m((~((-1500570040) | r36)) | 152052001, 933, (((~((-1357170847) | r36)) | (-1500570040)) * (-933)) - 2084687304, 644355904))) != (-1032769152)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0803, code lost:
    
        if (((((int) (r9 >> 32)) & (((((~((-1489674668) | r36)) | (~((-537203269) | r71))) | (~(2079326191 | r71))) * 867) + (((((~((-2026877936) | r71)) | 1489674667) | (~(589651524 | r71))) * (-1734)) + ((((~((-2026877936) | r36)) | (~(589651524 | r36))) * (-867)) + 1972008040)))) | (((int) r9) & ((((~((-865815887) | r71)) | 262161) * com.plaid.internal.EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE) + (((~((-294667525) | r71)) * (-604)) + ((((~(r36 | (-294667525))) | (~((-571148363) | r71))) * (-302)) + 1573847295))))) == 542074309) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x1158, code lost:
    
        if (((((int) (r6 >> 32)) & (((((~(1461319247 | r36)) | 2228224) | (~((-67125835) | r71))) * 497) + ((((~(1463547471 | r71)) | (~(r36 | (-67125835)))) * 497) - 1433348784))) | (((int) r6) & ((((~((-8450) | r71)) | 1160251428) * 366) + ((((~(1298734694 | r71)) | (-138491716)) * (-366)) - 35847259)))) != 477111747) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x126a, code lost:
    
        r0 = 0;
        r6 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x14a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x15a2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1783  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x1896  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x1c59  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1d20 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x202c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x20f6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x26aa  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x2776 A[Catch: all -> 0x3fd8, TRY_ENTER, TryCatch #15 {all -> 0x3fd8, blocks: (B:3:0x0018, B:7:0x007e, B:11:0x0183, B:14:0x01e2, B:18:0x019c, B:20:0x021c, B:24:0x0274, B:34:0x02f0, B:37:0x0342, B:39:0x0360, B:42:0x03a9, B:44:0x03b2, B:47:0x0416, B:53:0x0824, B:56:0x087b, B:62:0x09eb, B:65:0x0a45, B:68:0x0a07, B:70:0x0df1, B:73:0x0e46, B:76:0x0e93, B:79:0x0eee, B:83:0x0fa6, B:86:0x0ff5, B:88:0x1013, B:91:0x1062, B:93:0x106b, B:96:0x10d3, B:103:0x129d, B:106:0x12f9, B:114:0x12b0, B:119:0x1401, B:122:0x1461, B:125:0x141f, B:128:0x1160, B:131:0x11c1, B:134:0x1178, B:135:0x1087, B:137:0x1020, B:138:0x0fb1, B:140:0x1495, B:143:0x14ed, B:145:0x1594, B:148:0x15ed, B:156:0x16e9, B:159:0x1743, B:162:0x1705, B:164:0x1775, B:167:0x17ca, B:169:0x1888, B:172:0x18dd, B:180:0x19ef, B:183:0x1a49, B:186:0x1a0b, B:192:0x1ca7, B:195:0x1d08, B:198:0x1cc6, B:222:0x207b, B:225:0x20dd, B:228:0x209a, B:234:0x248e, B:237:0x24ee, B:239:0x24ad, B:262:0x25b9, B:265:0x2618, B:267:0x25d8, B:290:0x26f8, B:293:0x275d, B:295:0x2717, B:296:0x2776, B:299:0x27d2, B:303:0x28c2, B:306:0x2920, B:308:0x28df, B:310:0x293b, B:313:0x299a, B:317:0x2a64, B:320:0x2ac1, B:322:0x2a81, B:326:0x2ae1, B:329:0x2b37, B:333:0x2c30, B:336:0x2c8d, B:338:0x2c4d, B:339:0x2aed, B:343:0x2cad, B:346:0x2d03, B:350:0x2de8, B:353:0x2e43, B:355:0x2e05, B:356:0x2cb9, B:358:0x2e5f, B:361:0x2eb5, B:365:0x2fc7, B:368:0x3020, B:370:0x2fe3, B:372:0x303c, B:375:0x308c, B:379:0x315d, B:382:0x31b9, B:384:0x3179, B:388:0x31da, B:391:0x322e, B:395:0x3303, B:398:0x335d, B:400:0x331f, B:401:0x31e6, B:403:0x339c, B:406:0x3416, B:410:0x34fb, B:413:0x3553, B:415:0x3517, B:417:0x3584, B:420:0x35de, B:424:0x36b4, B:427:0x3710, B:429:0x36d0, B:431:0x372c, B:434:0x3781, B:438:0x3861, B:441:0x38bd, B:443:0x387d, B:447:0x38de, B:450:0x3932, B:454:0x3a07, B:457:0x3a63, B:459:0x3a23, B:460:0x38ea, B:464:0x3a84, B:467:0x3ad2, B:471:0x3bb8, B:474:0x3c16, B:476:0x3bd4, B:477:0x3a90, B:479:0x3c32, B:482:0x3c86, B:488:0x3d56, B:491:0x3db3, B:493:0x3dca, B:496:0x3e28, B:497:0x3ddc, B:498:0x3d73, B:499:0x3e31, B:502:0x3eb1, B:506:0x3f5b, B:509:0x3fb7, B:511:0x3f7b, B:518:0x3e60, B:520:0x3c3e, B:521:0x3738, B:522:0x3593, B:523:0x33c9, B:524:0x3048, B:525:0x2e6b, B:526:0x2951, B:527:0x2787, B:577:0x2122, B:580:0x2173, B:587:0x235a, B:590:0x23b6, B:596:0x236b, B:598:0x212f, B:653:0x1b6a, B:656:0x1bcd, B:662:0x1b80, B:664:0x1899, B:665:0x1784, B:666:0x15a5, B:667:0x14a9, B:668:0x0ea7, B:670:0x0e02, B:672:0x0836, B:674:0x0926, B:677:0x0973, B:679:0x0931, B:682:0x04da, B:685:0x053a, B:688:0x04f3, B:691:0x05ea, B:694:0x064b, B:697:0x0603, B:700:0x06e8, B:703:0x0749, B:706:0x0701, B:708:0x03ce, B:710:0x036d, B:711:0x0300, B:716:0x0230, B:717:0x003b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x1b5c  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x1899 A[Catch: all -> 0x3fd8, TryCatch #15 {all -> 0x3fd8, blocks: (B:3:0x0018, B:7:0x007e, B:11:0x0183, B:14:0x01e2, B:18:0x019c, B:20:0x021c, B:24:0x0274, B:34:0x02f0, B:37:0x0342, B:39:0x0360, B:42:0x03a9, B:44:0x03b2, B:47:0x0416, B:53:0x0824, B:56:0x087b, B:62:0x09eb, B:65:0x0a45, B:68:0x0a07, B:70:0x0df1, B:73:0x0e46, B:76:0x0e93, B:79:0x0eee, B:83:0x0fa6, B:86:0x0ff5, B:88:0x1013, B:91:0x1062, B:93:0x106b, B:96:0x10d3, B:103:0x129d, B:106:0x12f9, B:114:0x12b0, B:119:0x1401, B:122:0x1461, B:125:0x141f, B:128:0x1160, B:131:0x11c1, B:134:0x1178, B:135:0x1087, B:137:0x1020, B:138:0x0fb1, B:140:0x1495, B:143:0x14ed, B:145:0x1594, B:148:0x15ed, B:156:0x16e9, B:159:0x1743, B:162:0x1705, B:164:0x1775, B:167:0x17ca, B:169:0x1888, B:172:0x18dd, B:180:0x19ef, B:183:0x1a49, B:186:0x1a0b, B:192:0x1ca7, B:195:0x1d08, B:198:0x1cc6, B:222:0x207b, B:225:0x20dd, B:228:0x209a, B:234:0x248e, B:237:0x24ee, B:239:0x24ad, B:262:0x25b9, B:265:0x2618, B:267:0x25d8, B:290:0x26f8, B:293:0x275d, B:295:0x2717, B:296:0x2776, B:299:0x27d2, B:303:0x28c2, B:306:0x2920, B:308:0x28df, B:310:0x293b, B:313:0x299a, B:317:0x2a64, B:320:0x2ac1, B:322:0x2a81, B:326:0x2ae1, B:329:0x2b37, B:333:0x2c30, B:336:0x2c8d, B:338:0x2c4d, B:339:0x2aed, B:343:0x2cad, B:346:0x2d03, B:350:0x2de8, B:353:0x2e43, B:355:0x2e05, B:356:0x2cb9, B:358:0x2e5f, B:361:0x2eb5, B:365:0x2fc7, B:368:0x3020, B:370:0x2fe3, B:372:0x303c, B:375:0x308c, B:379:0x315d, B:382:0x31b9, B:384:0x3179, B:388:0x31da, B:391:0x322e, B:395:0x3303, B:398:0x335d, B:400:0x331f, B:401:0x31e6, B:403:0x339c, B:406:0x3416, B:410:0x34fb, B:413:0x3553, B:415:0x3517, B:417:0x3584, B:420:0x35de, B:424:0x36b4, B:427:0x3710, B:429:0x36d0, B:431:0x372c, B:434:0x3781, B:438:0x3861, B:441:0x38bd, B:443:0x387d, B:447:0x38de, B:450:0x3932, B:454:0x3a07, B:457:0x3a63, B:459:0x3a23, B:460:0x38ea, B:464:0x3a84, B:467:0x3ad2, B:471:0x3bb8, B:474:0x3c16, B:476:0x3bd4, B:477:0x3a90, B:479:0x3c32, B:482:0x3c86, B:488:0x3d56, B:491:0x3db3, B:493:0x3dca, B:496:0x3e28, B:497:0x3ddc, B:498:0x3d73, B:499:0x3e31, B:502:0x3eb1, B:506:0x3f5b, B:509:0x3fb7, B:511:0x3f7b, B:518:0x3e60, B:520:0x3c3e, B:521:0x3738, B:522:0x3593, B:523:0x33c9, B:524:0x3048, B:525:0x2e6b, B:526:0x2951, B:527:0x2787, B:577:0x2122, B:580:0x2173, B:587:0x235a, B:590:0x23b6, B:596:0x236b, B:598:0x212f, B:653:0x1b6a, B:656:0x1bcd, B:662:0x1b80, B:664:0x1899, B:665:0x1784, B:666:0x15a5, B:667:0x14a9, B:668:0x0ea7, B:670:0x0e02, B:672:0x0836, B:674:0x0926, B:677:0x0973, B:679:0x0931, B:682:0x04da, B:685:0x053a, B:688:0x04f3, B:691:0x05ea, B:694:0x064b, B:697:0x0603, B:700:0x06e8, B:703:0x0749, B:706:0x0701, B:708:0x03ce, B:710:0x036d, B:711:0x0300, B:716:0x0230, B:717:0x003b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x1784 A[Catch: all -> 0x3fd8, TryCatch #15 {all -> 0x3fd8, blocks: (B:3:0x0018, B:7:0x007e, B:11:0x0183, B:14:0x01e2, B:18:0x019c, B:20:0x021c, B:24:0x0274, B:34:0x02f0, B:37:0x0342, B:39:0x0360, B:42:0x03a9, B:44:0x03b2, B:47:0x0416, B:53:0x0824, B:56:0x087b, B:62:0x09eb, B:65:0x0a45, B:68:0x0a07, B:70:0x0df1, B:73:0x0e46, B:76:0x0e93, B:79:0x0eee, B:83:0x0fa6, B:86:0x0ff5, B:88:0x1013, B:91:0x1062, B:93:0x106b, B:96:0x10d3, B:103:0x129d, B:106:0x12f9, B:114:0x12b0, B:119:0x1401, B:122:0x1461, B:125:0x141f, B:128:0x1160, B:131:0x11c1, B:134:0x1178, B:135:0x1087, B:137:0x1020, B:138:0x0fb1, B:140:0x1495, B:143:0x14ed, B:145:0x1594, B:148:0x15ed, B:156:0x16e9, B:159:0x1743, B:162:0x1705, B:164:0x1775, B:167:0x17ca, B:169:0x1888, B:172:0x18dd, B:180:0x19ef, B:183:0x1a49, B:186:0x1a0b, B:192:0x1ca7, B:195:0x1d08, B:198:0x1cc6, B:222:0x207b, B:225:0x20dd, B:228:0x209a, B:234:0x248e, B:237:0x24ee, B:239:0x24ad, B:262:0x25b9, B:265:0x2618, B:267:0x25d8, B:290:0x26f8, B:293:0x275d, B:295:0x2717, B:296:0x2776, B:299:0x27d2, B:303:0x28c2, B:306:0x2920, B:308:0x28df, B:310:0x293b, B:313:0x299a, B:317:0x2a64, B:320:0x2ac1, B:322:0x2a81, B:326:0x2ae1, B:329:0x2b37, B:333:0x2c30, B:336:0x2c8d, B:338:0x2c4d, B:339:0x2aed, B:343:0x2cad, B:346:0x2d03, B:350:0x2de8, B:353:0x2e43, B:355:0x2e05, B:356:0x2cb9, B:358:0x2e5f, B:361:0x2eb5, B:365:0x2fc7, B:368:0x3020, B:370:0x2fe3, B:372:0x303c, B:375:0x308c, B:379:0x315d, B:382:0x31b9, B:384:0x3179, B:388:0x31da, B:391:0x322e, B:395:0x3303, B:398:0x335d, B:400:0x331f, B:401:0x31e6, B:403:0x339c, B:406:0x3416, B:410:0x34fb, B:413:0x3553, B:415:0x3517, B:417:0x3584, B:420:0x35de, B:424:0x36b4, B:427:0x3710, B:429:0x36d0, B:431:0x372c, B:434:0x3781, B:438:0x3861, B:441:0x38bd, B:443:0x387d, B:447:0x38de, B:450:0x3932, B:454:0x3a07, B:457:0x3a63, B:459:0x3a23, B:460:0x38ea, B:464:0x3a84, B:467:0x3ad2, B:471:0x3bb8, B:474:0x3c16, B:476:0x3bd4, B:477:0x3a90, B:479:0x3c32, B:482:0x3c86, B:488:0x3d56, B:491:0x3db3, B:493:0x3dca, B:496:0x3e28, B:497:0x3ddc, B:498:0x3d73, B:499:0x3e31, B:502:0x3eb1, B:506:0x3f5b, B:509:0x3fb7, B:511:0x3f7b, B:518:0x3e60, B:520:0x3c3e, B:521:0x3738, B:522:0x3593, B:523:0x33c9, B:524:0x3048, B:525:0x2e6b, B:526:0x2951, B:527:0x2787, B:577:0x2122, B:580:0x2173, B:587:0x235a, B:590:0x23b6, B:596:0x236b, B:598:0x212f, B:653:0x1b6a, B:656:0x1bcd, B:662:0x1b80, B:664:0x1899, B:665:0x1784, B:666:0x15a5, B:667:0x14a9, B:668:0x0ea7, B:670:0x0e02, B:672:0x0836, B:674:0x0926, B:677:0x0973, B:679:0x0931, B:682:0x04da, B:685:0x053a, B:688:0x04f3, B:691:0x05ea, B:694:0x064b, B:697:0x0603, B:700:0x06e8, B:703:0x0749, B:706:0x0701, B:708:0x03ce, B:710:0x036d, B:711:0x0300, B:716:0x0230, B:717:0x003b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:666:0x15a5 A[Catch: all -> 0x3fd8, TryCatch #15 {all -> 0x3fd8, blocks: (B:3:0x0018, B:7:0x007e, B:11:0x0183, B:14:0x01e2, B:18:0x019c, B:20:0x021c, B:24:0x0274, B:34:0x02f0, B:37:0x0342, B:39:0x0360, B:42:0x03a9, B:44:0x03b2, B:47:0x0416, B:53:0x0824, B:56:0x087b, B:62:0x09eb, B:65:0x0a45, B:68:0x0a07, B:70:0x0df1, B:73:0x0e46, B:76:0x0e93, B:79:0x0eee, B:83:0x0fa6, B:86:0x0ff5, B:88:0x1013, B:91:0x1062, B:93:0x106b, B:96:0x10d3, B:103:0x129d, B:106:0x12f9, B:114:0x12b0, B:119:0x1401, B:122:0x1461, B:125:0x141f, B:128:0x1160, B:131:0x11c1, B:134:0x1178, B:135:0x1087, B:137:0x1020, B:138:0x0fb1, B:140:0x1495, B:143:0x14ed, B:145:0x1594, B:148:0x15ed, B:156:0x16e9, B:159:0x1743, B:162:0x1705, B:164:0x1775, B:167:0x17ca, B:169:0x1888, B:172:0x18dd, B:180:0x19ef, B:183:0x1a49, B:186:0x1a0b, B:192:0x1ca7, B:195:0x1d08, B:198:0x1cc6, B:222:0x207b, B:225:0x20dd, B:228:0x209a, B:234:0x248e, B:237:0x24ee, B:239:0x24ad, B:262:0x25b9, B:265:0x2618, B:267:0x25d8, B:290:0x26f8, B:293:0x275d, B:295:0x2717, B:296:0x2776, B:299:0x27d2, B:303:0x28c2, B:306:0x2920, B:308:0x28df, B:310:0x293b, B:313:0x299a, B:317:0x2a64, B:320:0x2ac1, B:322:0x2a81, B:326:0x2ae1, B:329:0x2b37, B:333:0x2c30, B:336:0x2c8d, B:338:0x2c4d, B:339:0x2aed, B:343:0x2cad, B:346:0x2d03, B:350:0x2de8, B:353:0x2e43, B:355:0x2e05, B:356:0x2cb9, B:358:0x2e5f, B:361:0x2eb5, B:365:0x2fc7, B:368:0x3020, B:370:0x2fe3, B:372:0x303c, B:375:0x308c, B:379:0x315d, B:382:0x31b9, B:384:0x3179, B:388:0x31da, B:391:0x322e, B:395:0x3303, B:398:0x335d, B:400:0x331f, B:401:0x31e6, B:403:0x339c, B:406:0x3416, B:410:0x34fb, B:413:0x3553, B:415:0x3517, B:417:0x3584, B:420:0x35de, B:424:0x36b4, B:427:0x3710, B:429:0x36d0, B:431:0x372c, B:434:0x3781, B:438:0x3861, B:441:0x38bd, B:443:0x387d, B:447:0x38de, B:450:0x3932, B:454:0x3a07, B:457:0x3a63, B:459:0x3a23, B:460:0x38ea, B:464:0x3a84, B:467:0x3ad2, B:471:0x3bb8, B:474:0x3c16, B:476:0x3bd4, B:477:0x3a90, B:479:0x3c32, B:482:0x3c86, B:488:0x3d56, B:491:0x3db3, B:493:0x3dca, B:496:0x3e28, B:497:0x3ddc, B:498:0x3d73, B:499:0x3e31, B:502:0x3eb1, B:506:0x3f5b, B:509:0x3fb7, B:511:0x3f7b, B:518:0x3e60, B:520:0x3c3e, B:521:0x3738, B:522:0x3593, B:523:0x33c9, B:524:0x3048, B:525:0x2e6b, B:526:0x2951, B:527:0x2787, B:577:0x2122, B:580:0x2173, B:587:0x235a, B:590:0x23b6, B:596:0x236b, B:598:0x212f, B:653:0x1b6a, B:656:0x1bcd, B:662:0x1b80, B:664:0x1899, B:665:0x1784, B:666:0x15a5, B:667:0x14a9, B:668:0x0ea7, B:670:0x0e02, B:672:0x0836, B:674:0x0926, B:677:0x0973, B:679:0x0931, B:682:0x04da, B:685:0x053a, B:688:0x04f3, B:691:0x05ea, B:694:0x064b, B:697:0x0603, B:700:0x06e8, B:703:0x0749, B:706:0x0701, B:708:0x03ce, B:710:0x036d, B:711:0x0300, B:716:0x0230, B:717:0x003b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:667:0x14a9 A[Catch: all -> 0x3fd8, TryCatch #15 {all -> 0x3fd8, blocks: (B:3:0x0018, B:7:0x007e, B:11:0x0183, B:14:0x01e2, B:18:0x019c, B:20:0x021c, B:24:0x0274, B:34:0x02f0, B:37:0x0342, B:39:0x0360, B:42:0x03a9, B:44:0x03b2, B:47:0x0416, B:53:0x0824, B:56:0x087b, B:62:0x09eb, B:65:0x0a45, B:68:0x0a07, B:70:0x0df1, B:73:0x0e46, B:76:0x0e93, B:79:0x0eee, B:83:0x0fa6, B:86:0x0ff5, B:88:0x1013, B:91:0x1062, B:93:0x106b, B:96:0x10d3, B:103:0x129d, B:106:0x12f9, B:114:0x12b0, B:119:0x1401, B:122:0x1461, B:125:0x141f, B:128:0x1160, B:131:0x11c1, B:134:0x1178, B:135:0x1087, B:137:0x1020, B:138:0x0fb1, B:140:0x1495, B:143:0x14ed, B:145:0x1594, B:148:0x15ed, B:156:0x16e9, B:159:0x1743, B:162:0x1705, B:164:0x1775, B:167:0x17ca, B:169:0x1888, B:172:0x18dd, B:180:0x19ef, B:183:0x1a49, B:186:0x1a0b, B:192:0x1ca7, B:195:0x1d08, B:198:0x1cc6, B:222:0x207b, B:225:0x20dd, B:228:0x209a, B:234:0x248e, B:237:0x24ee, B:239:0x24ad, B:262:0x25b9, B:265:0x2618, B:267:0x25d8, B:290:0x26f8, B:293:0x275d, B:295:0x2717, B:296:0x2776, B:299:0x27d2, B:303:0x28c2, B:306:0x2920, B:308:0x28df, B:310:0x293b, B:313:0x299a, B:317:0x2a64, B:320:0x2ac1, B:322:0x2a81, B:326:0x2ae1, B:329:0x2b37, B:333:0x2c30, B:336:0x2c8d, B:338:0x2c4d, B:339:0x2aed, B:343:0x2cad, B:346:0x2d03, B:350:0x2de8, B:353:0x2e43, B:355:0x2e05, B:356:0x2cb9, B:358:0x2e5f, B:361:0x2eb5, B:365:0x2fc7, B:368:0x3020, B:370:0x2fe3, B:372:0x303c, B:375:0x308c, B:379:0x315d, B:382:0x31b9, B:384:0x3179, B:388:0x31da, B:391:0x322e, B:395:0x3303, B:398:0x335d, B:400:0x331f, B:401:0x31e6, B:403:0x339c, B:406:0x3416, B:410:0x34fb, B:413:0x3553, B:415:0x3517, B:417:0x3584, B:420:0x35de, B:424:0x36b4, B:427:0x3710, B:429:0x36d0, B:431:0x372c, B:434:0x3781, B:438:0x3861, B:441:0x38bd, B:443:0x387d, B:447:0x38de, B:450:0x3932, B:454:0x3a07, B:457:0x3a63, B:459:0x3a23, B:460:0x38ea, B:464:0x3a84, B:467:0x3ad2, B:471:0x3bb8, B:474:0x3c16, B:476:0x3bd4, B:477:0x3a90, B:479:0x3c32, B:482:0x3c86, B:488:0x3d56, B:491:0x3db3, B:493:0x3dca, B:496:0x3e28, B:497:0x3ddc, B:498:0x3d73, B:499:0x3e31, B:502:0x3eb1, B:506:0x3f5b, B:509:0x3fb7, B:511:0x3f7b, B:518:0x3e60, B:520:0x3c3e, B:521:0x3738, B:522:0x3593, B:523:0x33c9, B:524:0x3048, B:525:0x2e6b, B:526:0x2951, B:527:0x2787, B:577:0x2122, B:580:0x2173, B:587:0x235a, B:590:0x23b6, B:596:0x236b, B:598:0x212f, B:653:0x1b6a, B:656:0x1bcd, B:662:0x1b80, B:664:0x1899, B:665:0x1784, B:666:0x15a5, B:667:0x14a9, B:668:0x0ea7, B:670:0x0e02, B:672:0x0836, B:674:0x0926, B:677:0x0973, B:679:0x0931, B:682:0x04da, B:685:0x053a, B:688:0x04f3, B:691:0x05ea, B:694:0x064b, B:697:0x0603, B:700:0x06e8, B:703:0x0749, B:706:0x0701, B:708:0x03ce, B:710:0x036d, B:711:0x0300, B:716:0x0230, B:717:0x003b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x1479  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0e02 A[Catch: all -> 0x3fd8, TryCatch #15 {all -> 0x3fd8, blocks: (B:3:0x0018, B:7:0x007e, B:11:0x0183, B:14:0x01e2, B:18:0x019c, B:20:0x021c, B:24:0x0274, B:34:0x02f0, B:37:0x0342, B:39:0x0360, B:42:0x03a9, B:44:0x03b2, B:47:0x0416, B:53:0x0824, B:56:0x087b, B:62:0x09eb, B:65:0x0a45, B:68:0x0a07, B:70:0x0df1, B:73:0x0e46, B:76:0x0e93, B:79:0x0eee, B:83:0x0fa6, B:86:0x0ff5, B:88:0x1013, B:91:0x1062, B:93:0x106b, B:96:0x10d3, B:103:0x129d, B:106:0x12f9, B:114:0x12b0, B:119:0x1401, B:122:0x1461, B:125:0x141f, B:128:0x1160, B:131:0x11c1, B:134:0x1178, B:135:0x1087, B:137:0x1020, B:138:0x0fb1, B:140:0x1495, B:143:0x14ed, B:145:0x1594, B:148:0x15ed, B:156:0x16e9, B:159:0x1743, B:162:0x1705, B:164:0x1775, B:167:0x17ca, B:169:0x1888, B:172:0x18dd, B:180:0x19ef, B:183:0x1a49, B:186:0x1a0b, B:192:0x1ca7, B:195:0x1d08, B:198:0x1cc6, B:222:0x207b, B:225:0x20dd, B:228:0x209a, B:234:0x248e, B:237:0x24ee, B:239:0x24ad, B:262:0x25b9, B:265:0x2618, B:267:0x25d8, B:290:0x26f8, B:293:0x275d, B:295:0x2717, B:296:0x2776, B:299:0x27d2, B:303:0x28c2, B:306:0x2920, B:308:0x28df, B:310:0x293b, B:313:0x299a, B:317:0x2a64, B:320:0x2ac1, B:322:0x2a81, B:326:0x2ae1, B:329:0x2b37, B:333:0x2c30, B:336:0x2c8d, B:338:0x2c4d, B:339:0x2aed, B:343:0x2cad, B:346:0x2d03, B:350:0x2de8, B:353:0x2e43, B:355:0x2e05, B:356:0x2cb9, B:358:0x2e5f, B:361:0x2eb5, B:365:0x2fc7, B:368:0x3020, B:370:0x2fe3, B:372:0x303c, B:375:0x308c, B:379:0x315d, B:382:0x31b9, B:384:0x3179, B:388:0x31da, B:391:0x322e, B:395:0x3303, B:398:0x335d, B:400:0x331f, B:401:0x31e6, B:403:0x339c, B:406:0x3416, B:410:0x34fb, B:413:0x3553, B:415:0x3517, B:417:0x3584, B:420:0x35de, B:424:0x36b4, B:427:0x3710, B:429:0x36d0, B:431:0x372c, B:434:0x3781, B:438:0x3861, B:441:0x38bd, B:443:0x387d, B:447:0x38de, B:450:0x3932, B:454:0x3a07, B:457:0x3a63, B:459:0x3a23, B:460:0x38ea, B:464:0x3a84, B:467:0x3ad2, B:471:0x3bb8, B:474:0x3c16, B:476:0x3bd4, B:477:0x3a90, B:479:0x3c32, B:482:0x3c86, B:488:0x3d56, B:491:0x3db3, B:493:0x3dca, B:496:0x3e28, B:497:0x3ddc, B:498:0x3d73, B:499:0x3e31, B:502:0x3eb1, B:506:0x3f5b, B:509:0x3fb7, B:511:0x3f7b, B:518:0x3e60, B:520:0x3c3e, B:521:0x3738, B:522:0x3593, B:523:0x33c9, B:524:0x3048, B:525:0x2e6b, B:526:0x2951, B:527:0x2787, B:577:0x2122, B:580:0x2173, B:587:0x235a, B:590:0x23b6, B:596:0x236b, B:598:0x212f, B:653:0x1b6a, B:656:0x1bcd, B:662:0x1b80, B:664:0x1899, B:665:0x1784, B:666:0x15a5, B:667:0x14a9, B:668:0x0ea7, B:670:0x0e02, B:672:0x0836, B:674:0x0926, B:677:0x0973, B:679:0x0931, B:682:0x04da, B:685:0x053a, B:688:0x04f3, B:691:0x05ea, B:694:0x064b, B:697:0x0603, B:700:0x06e8, B:703:0x0749, B:706:0x0701, B:708:0x03ce, B:710:0x036d, B:711:0x0300, B:716:0x0230, B:717:0x003b), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0dfd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0e4f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] ThreeDS2ServiceInstance$62a34fac(int i, int i2, Object obj, int i3) {
        char c;
        long j;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        Object obj2;
        String[] strArr;
        int i9;
        Object invoke;
        int i10;
        Map map;
        Object obj3;
        Object obj4;
        long j3;
        Object obj5;
        Object obj6;
        long j4;
        String[] strArr2;
        int i11;
        int i12;
        int i13;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i14;
        BufferedInputStream bufferedInputStream3;
        int i15;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        Object[] objArr9;
        Object[] objArr10;
        Object[] objArr11;
        long j5;
        long j6;
        Map map2;
        Object invoke2;
        Object[] objArr12;
        int parseInt;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        try {
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj11 = map3.get(-1926555265);
            if (obj11 != null) {
                j = 0;
                c = 23;
            } else {
                c = 23;
                j = 0;
                Class cls = (Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0'), (char) (19827 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3613);
                byte b = (byte) ($$b & 92);
                byte[] bArr = $$a;
                Object[] objArr13 = new Object[1];
                a(b, bArr[23], bArr[6], objArr13);
                obj11 = cls.getMethod((String) objArr13[0], null);
                map3.put(-1926555265, obj11);
            }
            long longValue = ((Long) ((Method) obj11).invoke(null, null)).longValue();
            long j7 = longValue ^ (-1);
            long j8 = i;
            long j9 = j8 ^ (-1);
            int m = ((int) (SVG$Unit$EnumUnboxingLocalUtility.m(210L, (((1435226703 | j9) | longValue) ^ (-1)) | (((j7 | (-1435226704)) | j8) ^ (-1)), ((((j7 | j9) ^ (-1)) | ((1435226703 | j8) ^ (-1))) * 210) + ((((1435226703 | j7) ^ (-1)) * 210) + (((-209) * longValue) + 299962381136L)), -319688373L) >> 32)) & Boxes$$ExternalSyntheticOutline1.m(25445410 | (~((-60214375) | i)) | (~(1377012036 | i)), -69, (((~((-34768965) | i)) | (~(1402457446 | i))) * 69) + 772500948, -1874508544);
            int i16 = ~(1892036452 | i);
            int i17 = ~i;
            Class cls2 = Integer.TYPE;
            if (r6 != 0) {
                Object[] objArr14 = {new int[]{i}, new int[]{r3}, null, new int[1]};
                int i18 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE;
                Object[] objArr15 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | 416625958)) | 287713329) * 519) + (((~((-19007506) | i17)) | (~(435633463 | i))) * (-519)) + (((~((-287713330) | i17)) | 416625958) * 519) + 224469494)};
                Object obj12 = map3.get(-1544987438);
                if (obj12 == null) {
                    Class cls3 = (Class) removeParam.initialize((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 86, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28641), Color.rgb(0, 0, 0) + 16780533);
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[19];
                    byte b3 = (byte) (-bArr2[c]);
                    Object[] objArr16 = new Object[1];
                    a(b2, b3, (byte) (b3 | 36), objArr16);
                    obj12 = cls3.getMethod((String) objArr16[0], cls2, cls2, cls2);
                    map3.put(-1544987438, obj12);
                }
                ((int[]) objArr14[3])[0] = ((Integer) ((Method) obj12).invoke(null, objArr15)).intValue();
                return objArr14;
            }
            int i19 = 3;
            Object[] objArr17 = new Object[1];
            b(10 - MotionEvent.axisFromString(""), ViewConfiguration.getKeyRepeatDelay() >> 16, (char) Color.alpha(0), objArr17);
            Object[] objArr18 = {((String) objArr17[0]).intern()};
            Object obj13 = map3.get(-690415720);
            if (obj13 != null) {
                i5 = i17;
                j2 = j8;
                i4 = -1;
            } else {
                i4 = -1;
                i5 = i17;
                Class cls4 = (Class) removeParam.initialize(TextUtils.indexOf("", "", 0) + 47, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Gravity.getAbsoluteGravity(0, 0) + 2248);
                byte b4 = (byte) (-$$a[24]);
                j2 = j8;
                Object[] objArr19 = new Object[1];
                a(b4, (byte) (b4 + 2), r9[19], objArr19);
                obj13 = cls4.getMethod((String) objArr19[0], String.class);
                map3.put(-690415720, obj13);
            }
            String str = (String) ((Method) obj13).invoke(null, objArr18);
            if (str != null) {
                i8 = 0;
                i6 = 42;
                Object[] objArr20 = new Object[1];
                b(KeyEvent.normalizeMetaState(0) + 6, 10 - MotionEvent.axisFromString(""), (char) TextUtils.getOffsetBefore("", 0), objArr20);
                String intern = ((String) objArr20[0]).intern();
                Object[] objArr21 = new Object[1];
                c("뻗\ude36缎鱯㵲婔﮵ᢇ", (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 24809, objArr21);
                String[] strArr3 = {intern, ((String) objArr21[0]).intern()};
                int i20 = 0;
                while (true) {
                    if (i20 >= 2) {
                        i7 = -146694085;
                        break;
                    }
                    if (str.contains(strArr3[i20])) {
                        Object[] objArr22 = new Object[1];
                        b(Color.rgb(i8, i8, i8) + 16777239, (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 16, (char) (TypedValue.complexToFloat(i8) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(i8) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr22);
                        Object[] objArr23 = {((String) objArr22[i8]).intern()};
                        Map map4 = removeParam.visaSchemeConfiguration;
                        Object obj14 = map4.get(-690415720);
                        if (obj14 != null) {
                            i7 = -146694085;
                        } else {
                            Class cls5 = (Class) removeParam.initialize(47 - View.combineMeasuredStates(0, 0), (char) View.resolveSizeAndState(0, 0, 0), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2247);
                            byte b5 = (byte) (-$$a[24]);
                            i7 = -146694085;
                            Object[] objArr24 = new Object[1];
                            a(b5, (byte) (b5 + 2), r10[19], objArr24);
                            obj14 = cls5.getMethod((String) objArr24[0], String.class);
                            map4.put(-690415720, obj14);
                        }
                        Object invoke3 = ((Method) obj14).invoke(null, objArr23);
                        Object[] objArr25 = new Object[1];
                        c("뻂쪂嘤\ue3d7澶\ufb0eӺ過᰻ꦁ㔼䄼쪕噺\ue3d2澦\ufb0dҳ遗ᰶꦚ㕤䄨쪊噫\ue3d1澷\ufb0dӹ運", Drawable.resolveOpacity(0, 0) + 29789, objArr25);
                        Object[] objArr26 = {((String) objArr25[0]).intern()};
                        Object obj15 = map4.get(-690415720);
                        if (obj15 != null) {
                            obj9 = invoke3;
                        } else {
                            Class cls6 = (Class) removeParam.initialize(Color.blue(0) + 47, (char) TextUtils.getOffsetBefore("", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 2248);
                            byte b6 = (byte) (-$$a[24]);
                            obj9 = invoke3;
                            Object[] objArr27 = new Object[1];
                            a(b6, (byte) (b6 + 2), r10[19], objArr27);
                            obj15 = cls6.getMethod((String) objArr27[0], String.class);
                            map4.put(-690415720, obj15);
                        }
                        Object invoke4 = ((Method) obj15).invoke(null, objArr26);
                        if (obj9 != null) {
                            Object[] objArr28 = {obj9, 42};
                            Object obj16 = map4.get(Integer.valueOf(i7));
                            if (obj16 != null) {
                                obj10 = invoke4;
                            } else {
                                Class cls7 = (Class) removeParam.initialize(48 - (KeyEvent.getMaxKeyCode() >> 16), (char) (29154 - TextUtils.indexOf("", "", 0, 0)), ExpandableListView.getPackedPositionGroup(j) + 3756);
                                byte b7 = (byte) ($$b & 92);
                                byte[] bArr3 = $$a;
                                obj10 = invoke4;
                                Object[] objArr29 = new Object[1];
                                a(b7, bArr3[c], bArr3[6], objArr29);
                                obj16 = cls7.getMethod((String) objArr29[0], String.class, cls2);
                                map4.put(Integer.valueOf(i7), obj16);
                            }
                            long longValue2 = ((Long) ((Method) obj16).invoke(null, objArr28)).longValue();
                            long m2 = SVG$Unit$EnumUnboxingLocalUtility.m(301L, (j9 | longValue2) ^ (-1), ((-301) * ((((-430113283) | (longValue2 ^ (-1))) ^ (-1)) | (((-430113283) | j2) ^ (-1)) | (((j9 | 430113282) | longValue2) ^ (-1)))) + ((-602) * (longValue2 | (((-430113283) | j9) ^ (-1)))) + (603 * longValue2) + 129894211164L, 68500067L);
                        } else {
                            obj10 = invoke4;
                        }
                        if (obj10 != null) {
                            Object[] objArr30 = {obj10, 42};
                            Object obj17 = map4.get(Integer.valueOf(i7));
                            if (obj17 == null) {
                                Class cls8 = (Class) removeParam.initialize(KeyEvent.normalizeMetaState(0) + 48, (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 29154), TextUtils.indexOf("", "") + 3756);
                                byte b8 = (byte) ($$b & 92);
                                byte[] bArr4 = $$a;
                                Object[] objArr31 = new Object[1];
                                a(b8, bArr4[c], bArr4[6], objArr31);
                                obj17 = cls8.getMethod((String) objArr31[0], String.class, cls2);
                                map4.put(Integer.valueOf(i7), obj17);
                            }
                            long longValue3 = ((Long) ((Method) obj17).invoke(null, objArr30)).longValue();
                            long j10 = longValue3 ^ (-1);
                            long m3 = SVG$Unit$EnumUnboxingLocalUtility.m(831L, ((386404247 | j9) ^ (-1)) | (((-386404248) | j2) ^ (-1)) | ((longValue3 | j2) ^ (-1)), ((-1662) * (((j10 | (-386404248)) | j2) ^ (-1))) + ((-831) * (((j10 | j9) ^ (-1)) | ((((-386404248) | longValue3) | j2) ^ (-1)))) + (832 * longValue3) + 320715525840L, 885017597L);
                        }
                        if (obj9 != null) {
                            Object[] objArr32 = {obj9, 42};
                            Object obj18 = map4.get(Integer.valueOf(i7));
                            if (obj18 == null) {
                                Class cls9 = (Class) removeParam.initialize((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) (ImageFormat.getBitsPerPixel(0) + 29155), 3756 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                byte b9 = (byte) ($$b & 92);
                                byte[] bArr5 = $$a;
                                Object[] objArr33 = new Object[1];
                                a(b9, bArr5[c], bArr5[6], objArr33);
                                obj18 = cls9.getMethod((String) objArr33[0], String.class, cls2);
                                map4.put(Integer.valueOf(i7), obj18);
                            }
                            long longValue4 = ((Long) ((Method) obj18).invoke(null, objArr32)).longValue();
                            long j11 = longValue4 ^ (-1);
                            long j12 = ((-721560518) | longValue4) ^ (-1);
                            long m4 = SVG$Unit$EnumUnboxingLocalUtility.m(370L, j12, ((-370) * (((721560517 | j9) ^ (-1)) | ((j11 | j2) ^ (-1)) | j12)) + ((((j11 | j9) ^ (-1)) | ((721560517 | j2) ^ (-1))) * (-370)) + ((371 * longValue4) - 267698952178L), 1220173867L);
                        }
                        if (obj10 != null) {
                            Object[] objArr34 = {obj10, 42};
                            Object obj19 = map4.get(Integer.valueOf(i7));
                            if (obj19 == null) {
                                Class cls10 = (Class) removeParam.initialize((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 47, (char) (Color.alpha(0) + 29154), 3755 - TextUtils.lastIndexOf("", '0', 0, 0));
                                byte b10 = (byte) ($$b & 92);
                                byte[] bArr6 = $$a;
                                Object[] objArr35 = new Object[1];
                                a(b10, bArr6[c], bArr6[6], objArr35);
                                obj19 = cls10.getMethod((String) objArr35[0], String.class, cls2);
                                map4.put(Integer.valueOf(i7), obj19);
                            }
                            long longValue5 = ((Long) ((Method) obj19).invoke(null, objArr34)).longValue();
                            long j13 = longValue5 ^ (-1);
                            long j14 = ((j13 | j9) ^ (-1)) | ((j13 | 325460997) ^ (-1)) | ((j9 | 325460997) ^ (-1));
                            long m5 = SVG$Unit$EnumUnboxingLocalUtility.m(590L, (((-325460998) | j9) ^ (-1)) | ((j9 | longValue5) ^ (-1)), ((-1180) * j14) + ((j14 | ((((-325460998) | longValue5) | j2) ^ (-1))) * 590) + ((591 * longValue5) - 191696527233L), 173152352L);
                        }
                    } else {
                        i20++;
                        i8 = 0;
                        i19 = 3;
                    }
                }
                Object[] objArr36 = new Object[1];
                b(View.MeasureSpec.makeMeasureSpec(i8, i8) + 8, 40 - (Process.myTid() >> 22), (char) (10436 - View.getDefaultSize(i8, i8)), objArr36);
                String intern2 = ((String) objArr36[i8]).intern();
                Object[] objArr37 = new Object[1];
                c("뻑ꍅ藎\ue64c죂\u2d74", 7560 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), objArr37);
                String intern3 = ((String) objArr37[i8]).intern();
                Object[] objArr38 = new Object[1];
                b((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 6, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 48, (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), objArr38);
                String intern4 = ((String) objArr38[0]).intern();
                Object[] objArr39 = new Object[1];
                b(TextUtils.indexOf("", "", 0) + 9, View.MeasureSpec.getMode(0) + 55, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 23491), objArr39);
                String intern5 = ((String) objArr39[0]).intern();
                Object[] objArr40 = new Object[1];
                c("뻙蔵줞൰兘閼", 15329 - (Process.myPid() >> 22), objArr40);
                String intern6 = ((String) objArr40[0]).intern();
                Object[] objArr41 = new Object[1];
                c("뻙免懿災Ñጋ⎧㏗쉝틼\ue520\uf593萷", Color.blue(0) + 61331, objArr41);
                String intern7 = ((String) objArr41[0]).intern();
                Object[] objArr42 = new Object[1];
                b(5 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64, (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr42);
                String intern8 = ((String) objArr42[0]).intern();
                Object[] objArr43 = new Object[1];
                c("뻙钏\uea4b쀯\u17ea洈", 10831 - (ViewConfiguration.getTouchSlop() >> 8), objArr43);
                String intern9 = ((String) objArr43[0]).intern();
                Object[] objArr44 = new Object[1];
                b(1 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 70 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (char) View.resolveSize(0, 0), objArr44);
                String intern10 = ((String) objArr44[0]).intern();
                Object[] objArr45 = new Object[1];
                c("뻜\ue0d8˙ꓕ웉棡諩⳨任\uf0fbዘ뒎횐碊骠㲭", 24071 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr45);
                String intern11 = ((String) objArr45[0]).intern();
                Object[] objArr46 = new Object[1];
                c("뻜躊\ude7d⸻羅佾鼪\ueccd㱪మ", (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12372, objArr46);
                String intern12 = ((String) objArr46[0]).intern();
                Object[] objArr47 = new Object[1];
                b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 71, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr47);
                String intern13 = ((String) objArr47[0]).intern();
                Object[] objArr48 = new Object[1];
                b(((Process.getThreadPriority(0) + 20) >> 6) + 12, 79 - (Process.myPid() >> 22), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr48);
                String intern14 = ((String) objArr48[0]).intern();
                Object[] objArr49 = new Object[1];
                c("뻀곡骙袿\uf65f\ue470툎쀩⿍ᷨச祒杠唛", 4642 - TextUtils.lastIndexOf("", '0'), objArr49);
                String intern15 = ((String) objArr49[0]).intern();
                Object[] objArr50 = new Object[1];
                b(7 - View.MeasureSpec.makeMeasureSpec(0, 0), 91 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr50);
                String intern16 = ((String) objArr50[0]).intern();
                Object[] objArr51 = new Object[1];
                b('7' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 98, (char) (ExpandableListView.getPackedPositionChild(j) + 62500), objArr51);
                String intern17 = ((String) objArr51[0]).intern();
                Object[] objArr52 = new Object[1];
                b(Color.rgb(0, 0, 0) + 16777223, 104 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (54808 - TextUtils.lastIndexOf("", '0')), objArr52);
                String intern18 = ((String) objArr52[0]).intern();
                Object[] objArr53 = new Object[1];
                b(View.combineMeasuredStates(0, 0) + 2, View.MeasureSpec.getMode(0) + 112, (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr53);
                String intern19 = ((String) objArr53[0]).intern();
                Object[] objArr54 = new Object[1];
                c("뻃㿙볫㶕몰㭾롩㤒똬㓝뗍㋣뎃オ녍\u2e62꼇ⰸ\uaad4⯣", 33053 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr54);
                String intern20 = ((String) objArr54[0]).intern();
                Object[] objArr55 = new Object[1];
                c("뻃䘽估吺崷戈", 63738 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr55);
                String intern21 = ((String) objArr55[0]).intern();
                Object[] objArr56 = new Object[1];
                c("뻃ﰎ", 17099 - (ViewConfiguration.getEdgeSlop() >> 16), objArr56);
                String intern22 = ((String) objArr56[0]).intern();
                Object[] objArr57 = new Object[1];
                b(16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 114, (char) (55159 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr57);
                String intern23 = ((String) objArr57[0]).intern();
                Object[] objArr58 = new Object[1];
                c("뻄懑÷⏪슙\ue59f蒣ꝁ䙀", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 57107, objArr58);
                String intern24 = ((String) objArr58[0]).intern();
                Object[] objArr59 = new Object[1];
                c("뻄䫋囃拈滱竭ۧዻẐ⫗", 62473 - View.getDefaultSize(0, 0), objArr59);
                String intern25 = ((String) objArr59[0]).intern();
                Object[] objArr60 = new Object[1];
                c("뻄贳\ud933─焑뵷襹핒⅌涬맬", 13297 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr60);
                String intern26 = ((String) objArr60[0]).intern();
                Object[] objArr61 = new Object[1];
                b(';' - AndroidCharacter.getMirror('0'), 130 - (ViewConfiguration.getTouchSlop() >> 8), (char) (52579 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr61);
                String intern27 = ((String) objArr61[0]).intern();
                Object[] objArr62 = new Object[1];
                c("뻅\ue2dbۍ\uaad6컊狍雱㫡廽苺⛝䫮\ueee2ኗ뚙", View.resolveSizeAndState(0, 0, 0) + 23557, objArr62);
                String intern28 = ((String) objArr62[0]).intern();
                Object[] objArr63 = new Object[1];
                b(13 - TextUtils.indexOf((CharSequence) "", '0'), 140 - TextUtils.lastIndexOf("", '0', 0, 0), (char) Color.blue(0), objArr63);
                String[] strArr4 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((String) objArr63[0]).intern()};
                Object[] objArr64 = new Object[1];
                b(11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0), (char) TextUtils.getOffsetBefore("", 0), objArr64);
                Object[] objArr65 = {((String) objArr64[0]).intern()};
                Map map5 = removeParam.visaSchemeConfiguration;
                obj2 = map5.get(-690415720);
                if (obj2 == null) {
                    strArr = strArr4;
                    i9 = 12;
                } else {
                    Class cls11 = (Class) removeParam.initialize((ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 47, (char) (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(j) + 2249);
                    byte b11 = (byte) (-$$a[24]);
                    strArr = strArr4;
                    i9 = 12;
                    Object[] objArr66 = new Object[1];
                    a(b11, (byte) (b11 + 2), r12[19], objArr66);
                    obj2 = cls11.getMethod((String) objArr66[0], String.class);
                    map5.put(-690415720, obj2);
                }
                invoke = ((Method) obj2).invoke(null, objArr65);
                if (invoke == null) {
                    i10 = -87104105;
                    Object[] objArr67 = new Object[1];
                    b((ViewConfiguration.getWindowTouchSlop() >> 8) + 6, ((byte) KeyEvent.getModifierMetaStateMask()) + 12, (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr67);
                    String intern29 = ((String) objArr67[0]).intern();
                    Object[] objArr68 = new Object[1];
                    c("뻗\ude36缎鱯㵲婔﮵ᢇ", TextUtils.lastIndexOf("", '0', 0) + 24810, objArr68);
                    Object[] objArr69 = {invoke, new String[]{intern29, ((String) objArr68[0]).intern()}};
                    Object obj20 = map5.get(-140597324);
                    if (obj20 == null) {
                        Class cls12 = (Class) removeParam.initialize(48 - TextUtils.getTrimmedLength(""), (char) Color.blue(0), 2295 - View.resolveSizeAndState(0, 0, 0));
                        byte b12 = (byte) ($$b & 92);
                        byte[] bArr7 = $$a;
                        Object[] objArr70 = new Object[1];
                        a(b12, bArr7[c], bArr7[6], objArr70);
                        obj20 = cls12.getMethod((String) objArr70[0], String.class, String[].class);
                        map5.put(-140597324, obj20);
                    }
                    long longValue6 = ((Long) ((Method) obj20).invoke(null, objArr69)).longValue();
                    long j15 = 789204330 | longValue6;
                    long j16 = ((-502) * j15) + (503 * longValue6) + 396969777990L;
                    long j17 = (-789204331) | j9;
                    long j18 = (j15 | j2) ^ (-1);
                    long m6 = SVG$Unit$EnumUnboxingLocalUtility.m(502L, ((j17 | longValue6) ^ (-1)) | j18, ((-502) * ((((-789204331) | (longValue6 ^ (-1))) ^ (-1)) | (j17 ^ (-1)) | j18)) + j16, -1581818653L);
                    if (((((int) (m6 >> 32)) & (((2071723765 | i) * 668) + ((1897607776 | (~(460381365 | i))) * 1336) + ((((~(1897607776 | i)) | 460381365) * (-668)) - 1438950510))) | (((int) m6) & ((((-1074005265) | i) * 465) + ((902879941 | (~((-1954860945) | i))) * 930) + ((((~(902879941 | i)) | (-1954860945)) * (-465)) - 2074221029)))) != 0) {
                        Object[] objArr71 = new Object[1];
                        b((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 22, 17 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr71);
                        Object[] objArr72 = {((String) objArr71[0]).intern()};
                        Object obj21 = map5.get(-690415720);
                        if (obj21 == null) {
                            Class cls13 = (Class) removeParam.initialize((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 46, (char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 2247);
                            byte b13 = (byte) (-$$a[24]);
                            Object[] objArr73 = new Object[1];
                            a(b13, (byte) (b13 + 2), r7[19], objArr73);
                            obj21 = cls13.getMethod((String) objArr73[0], String.class);
                            map5.put(-690415720, obj21);
                        }
                        Object invoke5 = ((Method) obj21).invoke(null, objArr72);
                        Object[] objArr74 = new Object[1];
                        c("뻂쪂嘤\ue3d7澶\ufb0eӺ過᰻ꦁ㔼䄼쪕噺\ue3d2澦\ufb0dҳ遗ᰶꦚ㕤䄨쪊噫\ue3d1澷\ufb0dӹ運", 29789 - TextUtils.getOffsetBefore("", 0), objArr74);
                        Object[] objArr75 = {((String) objArr74[0]).intern()};
                        Object obj22 = map5.get(-690415720);
                        if (obj22 != null) {
                            obj7 = invoke5;
                        } else {
                            Class cls14 = (Class) removeParam.initialize(47 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), ExpandableListView.getPackedPositionChild(j) + 2249);
                            byte b14 = (byte) (-$$a[24]);
                            obj7 = invoke5;
                            Object[] objArr76 = new Object[1];
                            a(b14, (byte) (b14 + 2), r10[19], objArr76);
                            obj22 = cls14.getMethod((String) objArr76[0], String.class);
                            map5.put(-690415720, obj22);
                        }
                        Object invoke6 = ((Method) obj22).invoke(null, objArr75);
                        if (obj7 != null) {
                            Object[] objArr77 = {obj7, Integer.valueOf(i6)};
                            Object obj23 = map5.get(Integer.valueOf(i7));
                            if (obj23 != null) {
                                obj8 = invoke6;
                            } else {
                                Class cls15 = (Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 48, (char) (29154 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), 3755 - ((byte) KeyEvent.getModifierMetaStateMask()));
                                byte b15 = (byte) ($$b & 92);
                                byte[] bArr8 = $$a;
                                obj8 = invoke6;
                                Object[] objArr78 = new Object[1];
                                a(b15, bArr8[c], bArr8[6], objArr78);
                                obj23 = cls15.getMethod((String) objArr78[0], String.class, cls2);
                                map5.put(Integer.valueOf(i7), obj23);
                            }
                            long longValue7 = ((Long) ((Method) obj23).invoke(null, objArr77)).longValue();
                            long m7 = SVG$Unit$EnumUnboxingLocalUtility.m(783L, 853206382 | ((j9 | longValue7) ^ (-1)), ((-783) * (((853206382 | j9) | longValue7) ^ (-1))) + ((longValue7 ^ (-1)) * (-783)) + (((-782) * longValue7) - 668913804272L), 1351819732L);
                        } else {
                            obj8 = invoke6;
                        }
                        if (obj8 != null) {
                            Object[] objArr79 = {obj8, Integer.valueOf(i6)};
                            Object obj24 = map5.get(Integer.valueOf(i7));
                            if (obj24 == null) {
                                Class cls16 = (Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (29155 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 3756 - (ViewConfiguration.getPressedStateDuration() >> 16));
                                byte b16 = (byte) ($$b & 92);
                                byte[] bArr9 = $$a;
                                Object[] objArr80 = new Object[1];
                                a(b16, bArr9[c], bArr9[6], objArr80);
                                obj24 = cls16.getMethod((String) objArr80[0], String.class, cls2);
                                map5.put(Integer.valueOf(i7), obj24);
                            }
                            long longValue8 = ((Long) ((Method) obj24).invoke(null, objArr79)).longValue();
                            long j19 = longValue8 ^ (-1);
                            long j20 = (-412904262) | j19;
                            long m8 = SVG$Unit$EnumUnboxingLocalUtility.m(168L, (((-412904262) | longValue8) ^ (-1)) | (((-412904262) | j9) ^ (-1)) | (((j19 | 412904261) | j2) ^ (-1)), (((j20 | j2) ^ (-1)) * 168) + (((j20 ^ (-1)) | ((j19 | j9) ^ (-1))) * 168) + (((-167) * longValue8) - 68955011587L), 85709088L);
                        }
                    }
                } else {
                    i10 = -87104105;
                }
                Object[] objArr81 = new Object[1];
                c("뺟卸斿矲ࡳᩱⲡ㺂팛\ue546\uf792觐騚겺뻲卪敥瞵ৰᨾⱞ㺄탇", 60859 - View.combineMeasuredStates(0, 0), objArr81);
                Object[] objArr82 = {((String) objArr81[0]).intern()};
                map = removeParam.visaSchemeConfiguration;
                obj3 = map.get(1303953416);
                if (obj3 != null) {
                    Class cls17 = (Class) removeParam.initialize(47 - Color.alpha(0), (char) TextUtils.getOffsetBefore("", 0), 2953 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                    byte b17 = (byte) ($$b & 92);
                    byte[] bArr10 = $$a;
                    Object[] objArr83 = new Object[1];
                    a(b17, bArr10[c], bArr10[6], objArr83);
                    obj3 = cls17.getMethod((String) objArr83[0], String.class);
                    map.put(1303953416, obj3);
                }
                long longValue9 = ((Long) ((Method) obj3).invoke(null, objArr82)).longValue();
                long j21 = ((-667) * longValue9) + 994586021760L;
                long j22 = longValue9 ^ (-1);
                long j23 = (-745008256) | j2;
                long m9 = SVG$Unit$EnumUnboxingLocalUtility.m(668L, j23 | j22, (1336 * ((-745008256) | ((j22 | j2) ^ (-1)))) + ((-668) * (j22 | (j23 ^ (-1)))) + j21, -197879614L);
                long j24 = (((int) (m9 >> 32)) & ((((~(i5 | (-1078010945))) | 286294292) * 521) + (((~((-1078010945) | i)) * 521) - 696197706))) | (((int) m9) & ((((~(i5 | (-1088667472))) | 1075915013) * 560) + ((~((-335806481) | i)) * (-560)) + ((~(i5 | (-348558939))) * (-560)) + 713822821));
                Object[] objArr84 = new Object[1];
                b(KeyEvent.getDeadChar(0, 0) + 17, (KeyEvent.getMaxKeyCode() >> 16) + 167, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1), objArr84);
                Object[] objArr85 = {((String) objArr84[0]).intern()};
                obj4 = map.get(1303953416);
                if (obj4 == null) {
                    j3 = j24;
                } else {
                    Class cls18 = (Class) removeParam.initialize(48 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionType(j) + 2952);
                    byte b18 = (byte) ($$b & 92);
                    byte[] bArr11 = $$a;
                    j3 = j24;
                    Object[] objArr86 = new Object[1];
                    a(b18, bArr11[c], bArr11[6], objArr86);
                    obj4 = cls18.getMethod((String) objArr86[0], String.class);
                    map.put(1303953416, obj4);
                }
                long longValue10 = ((Long) ((Method) obj4).invoke(null, objArr85)).longValue();
                long j25 = longValue10 ^ (-1);
                long j26 = 112561220 | j25;
                long m10 = SVG$Unit$EnumUnboxingLocalUtility.m(920L, (((112561220 | longValue10) | j2) ^ (-1)) | ((j26 | j9) ^ (-1)) | (((j25 | (-112561221)) | j2) ^ (-1)), (((j26 ^ (-1)) | ((112561220 | j9) ^ (-1))) * 920) + ((((j26 | j2) ^ (-1)) | (((j25 | j9) | (-112561221)) ^ (-1))) * 920) + ((-919) * longValue10) + 103443762099L, -830326649L);
                long j27 = (((int) (m10 >> 32)) & ((((~((-144756636) | i5)) | 134252043 | (~(1302974367 | i))) * 757) + ((~((-10504593) | i)) * 1514) + (((1292469775 | i5) * (-757)) - 1622287698))) | (((int) m10) & ((((~(478290883 | i)) | 268443969) * EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE) + ((~(2125364207 | i)) * (-604)) + (((~(i5 | 2125364207)) | (~((-1647073325) | i))) * (-302)) + 1482177159));
                if (j3 <= j && j27 > j && j27 - 3 < j3) {
                    Object[] objArr87 = {new int[]{i}, new int[]{r6}, null, new int[1]};
                    int i21 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE;
                    int i22 = (((~(217555708 | i5)) | (-1056416509)) * (-245)) + 711790802;
                    int i23 = ~(i | 217555708);
                    Object[] objArr88 = {Integer.valueOf(i3), 16, Integer.valueOf(((i23 | 921894996) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) + (i23 * (-245)) + i22)};
                    Object obj25 = map.get(-1544987438);
                    if (obj25 == null) {
                        Class cls19 = (Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 86, (char) (28640 - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0', 0) + 3318);
                        byte[] bArr12 = $$a;
                        byte b19 = bArr12[19];
                        byte b20 = (byte) (-bArr12[c]);
                        Object[] objArr89 = new Object[1];
                        a(b19, b20, (byte) (b20 | 36), objArr89);
                        obj25 = cls19.getMethod((String) objArr89[0], cls2, cls2, cls2);
                        map.put(-1544987438, obj25);
                    }
                    ((int[]) objArr87[3])[0] = ((Integer) ((Method) obj25).invoke(null, objArr88)).intValue();
                    return objArr87;
                }
                Object[] objArr90 = new Object[1];
                c("뺟卸斿矲ࡳᩱⲡ㺂팛\ue546\uf792觐騚겺뻲卪敥瞵ৰᨾⱞ㺄탇", ExpandableListView.getPackedPositionChild(j) + 60860, objArr90);
                Object[] objArr91 = {((String) objArr90[0]).intern()};
                obj5 = map.get(1303953416);
                if (obj5 != null) {
                    Class cls20 = (Class) removeParam.initialize(View.combineMeasuredStates(0, 0) + 47, (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 2952 - (Process.myPid() >> 22));
                    byte b21 = (byte) ($$b & 92);
                    byte[] bArr13 = $$a;
                    Object[] objArr92 = new Object[1];
                    a(b21, bArr13[c], bArr13[6], objArr92);
                    obj5 = cls20.getMethod((String) objArr92[0], String.class);
                    map.put(1303953416, obj5);
                }
                long longValue11 = ((Long) ((Method) obj5).invoke(null, objArr91)).longValue();
                long j28 = longValue11 ^ (-1);
                long m11 = SVG$Unit$EnumUnboxingLocalUtility.m(318L, (((j28 | j9) | 148523138) ^ (-1)) | (((148523138 | longValue11) | j2) ^ (-1)), ((((j28 | j2) ^ (-1)) | (((j9 | 148523138) | longValue11) ^ (-1))) * 318) + ((-318) * (j28 | (((-148523139) | j2) ^ (-1)))) + ((-317) * longValue11) + 47378881022L, -1091411008L);
                long j29 = (((int) (m11 >> 32)) & ((((~(1845620579 | i5)) | 273813648) * 52) + (((~(i5 | (-1845620580))) | (~(1012120305 | i5)) | 1107313922) * (-52)) + ((~(i5 | (-738306658))) * 52) + 1829567698)) | (((int) m11) & ((((~((-1476944707) | i)) | (~(i5 | 1380796179))) * 959) + (((~((-1476944707) | i5)) | (~(1380796179 | i))) * 959) + 845617667));
                Object[] objArr93 = new Object[1];
                c("뺟罕㷗海", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49537, objArr93);
                Object[] objArr94 = {((String) objArr93[0]).intern()};
                obj6 = map.get(1303953416);
                if (obj6 == null) {
                    j4 = j29;
                } else {
                    Class cls21 = (Class) removeParam.initialize(Process.getGidForName("") + 48, (char) View.resolveSize(0, 0), 2952 - ExpandableListView.getPackedPositionGroup(j));
                    byte b22 = (byte) ($$b & 92);
                    byte[] bArr14 = $$a;
                    j4 = j29;
                    Object[] objArr95 = new Object[1];
                    a(b22, bArr14[c], bArr14[6], objArr95);
                    obj6 = cls21.getMethod((String) objArr95[0], String.class);
                    map.put(1303953416, obj6);
                }
                long longValue12 = ((Long) ((Method) obj6).invoke(null, objArr94)).longValue();
                long j30 = longValue12 ^ (-1);
                long j31 = j9 | (-116777392);
                long m12 = SVG$Unit$EnumUnboxingLocalUtility.m(904L, ((longValue12 | 116777391) ^ (-1)) | ((j30 | j2) ^ (-1)) | (j31 ^ (-1)), (((((116777391 | j30) | j2) ^ (-1)) | ((j31 | longValue12) ^ (-1))) * 904) + ((-1808) * (((116777391 | j2) ^ (-1)) | ((j9 | longValue12) ^ (-1)))) + (((-903) * longValue12) - 105683539760L), -826110478L);
                long j32 = (((int) (m12 >> 32)) & ((((~((-1811062237) | i5)) | 37750800 | (~(2147147261 | i))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + ((~((-1773311437) | i)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(373835825 | i5)) | 1773311436) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106)) | (((int) m12) & ((((-1532222468) | (~((-94996058) | i5))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) + (((~(i5 | (-1532222468))) | 1515345922) * (-160)) + 842411541));
                if (j4 <= j && j32 > j && j32 + 100 < j4) {
                    ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 41) % 128;
                    Object[] objArr96 = {new int[]{i}, new int[]{r6}, null, new int[1]};
                    int i24 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
                    Object[] objArr97 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | 101124265)) | 131073 | (~(i5 | 805463553))) * 904) + (((~((-805332481) | i)) | (~(i5 | (-100993193)))) * 904) + ((((~((-805463554) | i)) | (~(i5 | (-101124266)))) * (-1808)) - 79025873))};
                    Object obj26 = map.get(-1544987438);
                    if (obj26 == null) {
                        Class cls22 = (Class) removeParam.initialize(TextUtils.getOffsetBefore("", 0) + 86, (char) (28641 - (ViewConfiguration.getEdgeSlop() >> 16)), Color.alpha(0) + 3317);
                        byte[] bArr15 = $$a;
                        byte b23 = bArr15[19];
                        byte b24 = (byte) (-bArr15[c]);
                        Object[] objArr98 = new Object[1];
                        a(b23, b24, (byte) (b24 | 36), objArr98);
                        obj26 = cls22.getMethod((String) objArr98[0], cls2, cls2, cls2);
                        map.put(-1544987438, obj26);
                    }
                    ((int[]) objArr96[3])[0] = ((Integer) ((Method) obj26).invoke(null, objArr97)).intValue();
                    return objArr96;
                }
                Object[] objArr99 = new Object[1];
                c("뺟漠ᴏ쭪賂Ꞻ喏", 53731 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr99);
                String intern30 = ((String) objArr99[0]).intern();
                Object[] objArr100 = new Object[1];
                c("뺟ۢ캋隠幀♰\uee1b뙸翚쟰辔", View.getDefaultSize(0, 0) + 47137, objArr100);
                String intern31 = ((String) objArr100[0]).intern();
                Object[] objArr101 = new Object[1];
                b(11 - TextUtils.lastIndexOf("", '0'), TextUtils.lastIndexOf("", '0', 0) + 185, (char) (Process.myTid() >> 22), objArr101);
                String intern32 = ((String) objArr101[0]).intern();
                Object[] objArr102 = new Object[1];
                b(12 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getTrimmedLength("") + EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) (12258 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr102);
                String intern33 = ((String) objArr102[0]).intern();
                Object[] objArr103 = new Object[1];
                b(11 - (ViewConfiguration.getEdgeSlop() >> 16), 208 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25326), objArr103);
                String intern34 = ((String) objArr103[0]).intern();
                Object[] objArr104 = new Object[1];
                b(5 - (ViewConfiguration.getFadingEdgeLength() >> 16), 219 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) Color.argb(0, 0, 0, 0), objArr104);
                String intern35 = ((String) objArr104[0]).intern();
                Object[] objArr105 = new Object[1];
                b((ViewConfiguration.getTouchSlop() >> 8) + 4, 223 - TextUtils.lastIndexOf("", '0'), (char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr105);
                String[] strArr5 = {intern30, intern31, intern32, intern33, intern34, intern35, ((String) objArr105[0]).intern()};
                if ((i2 & 2048) == 0) {
                    int i25 = 0;
                    while (i25 < 7) {
                        ThreeDS2ServiceInitializationCallback = (ThreeDS2Service + 87) % 128;
                        Object[] objArr106 = {strArr5[i25]};
                        Map map6 = removeParam.visaSchemeConfiguration;
                        Object obj27 = map6.get(1748705216);
                        if (obj27 != null) {
                            strArr2 = strArr5;
                        } else {
                            Class cls23 = (Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0'), (char) (17724 - ((Process.getThreadPriority(0) + 20) >> 6)), 2903 - TextUtils.lastIndexOf("", '0', 0));
                            byte b25 = (byte) ($$b & 92);
                            byte[] bArr16 = $$a;
                            strArr2 = strArr5;
                            Object[] objArr107 = new Object[1];
                            a(b25, bArr16[c], bArr16[6], objArr107);
                            obj27 = cls23.getMethod((String) objArr107[0], String.class);
                            map6.put(1748705216, obj27);
                        }
                        long longValue13 = ((Long) ((Method) obj27).invoke(null, objArr106)).longValue();
                        long j33 = ((-1917) * longValue13) + 1145545444800L;
                        long j34 = longValue13 ^ (-1);
                        long m13 = SVG$Unit$EnumUnboxingLocalUtility.m(959L, ((j34 | j2) ^ (-1)) | ((j9 | 1193276505) ^ (-1)), ((-959) * j34) + ((((j34 | j9) ^ (-1)) | ((1193276505 | j2) ^ (-1))) * 959) + j33, 525839430L);
                        if (((((int) (m13 >> 32)) & ((((~(569792831 | i)) | (~(i5 | 2007019242))) * 333) + (((~(569792831 | i5)) | (~(2007019242 | i))) * 333) + 522188185)) | (((int) m13) & ((((~((-984523162) | i5)) | 269000961) * (-964)) + (((~((-984523162) | i)) | (-1873217725)) * (-964)) + 854673093))) != 0) {
                            i11 = i25 + 90;
                            break;
                        }
                        i25++;
                        strArr5 = strArr2;
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                    Object[] objArr108 = {new int[]{i}, new int[]{i11 ^ i}, null, new int[1]};
                    Object[] objArr109 = {Integer.valueOf(i3), 16, Integer.valueOf((((-30316640) | i5) * 754) + (((~(i | (-29497352))) | (~(i5 | 703519999))) * (-754)) + (((~((-30316640) | i)) | 29497351 | (~(674022648 | i))) * (-754)) + 681312949)};
                    Map map7 = removeParam.visaSchemeConfiguration;
                    Object obj28 = map7.get(-1544987438);
                    if (obj28 == null) {
                        Class cls24 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 87, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28641), (ViewConfiguration.getTapTimeout() >> 16) + 3317);
                        byte[] bArr17 = $$a;
                        byte b26 = bArr17[19];
                        byte b27 = (byte) (-bArr17[c]);
                        Object[] objArr110 = new Object[1];
                        a(b26, b27, (byte) (b27 | 36), objArr110);
                        obj28 = cls24.getMethod((String) objArr110[0], cls2, cls2, cls2);
                        map7.put(-1544987438, obj28);
                    }
                    ((int[]) objArr108[3])[0] = ((Integer) ((Method) obj28).invoke(null, objArr109)).intValue();
                    return objArr108;
                }
                try {
                    Object[] objArr111 = new Object[1];
                    b(13 - (Process.myPid() >> 22), 229 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (12462 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr111);
                    try {
                        Object[] objArr112 = {((String) objArr111[0]).intern()};
                        map2 = removeParam.visaSchemeConfiguration;
                        Object obj29 = map2.get(-690415720);
                        if (obj29 == null) {
                            Class cls25 = (Class) removeParam.initialize(47 - KeyEvent.normalizeMetaState(0), (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (Process.myPid() >> 22) + 2248);
                            byte b28 = (byte) (-$$a[24]);
                            Object[] objArr113 = new Object[1];
                            a(b28, (byte) (b28 + 2), r7[19], objArr113);
                            obj29 = cls25.getMethod((String) objArr113[0], String.class);
                            map2.put(-690415720, obj29);
                        }
                        invoke2 = ((Method) obj29).invoke(null, objArr112);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                }
                try {
                    if (invoke2 != null) {
                        Object[] objArr114 = new Object[1];
                        b(10 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, (char) (TextUtils.getOffsetAfter("", 0) + 15418), objArr114);
                        try {
                            Object[] objArr115 = {invoke2, new String[]{((String) objArr114[0]).intern()}};
                            Object obj30 = map2.get(-140597324);
                            if (obj30 == null) {
                                Class cls26 = (Class) removeParam.initialize(48 - (ViewConfiguration.getTouchSlop() >> 8), (char) ExpandableListView.getPackedPositionType(j), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 2294);
                                byte b29 = (byte) ($$b & 92);
                                byte[] bArr18 = $$a;
                                Object[] objArr116 = new Object[1];
                                a(b29, bArr18[c], bArr18[6], objArr116);
                                obj30 = cls26.getMethod((String) objArr116[0], String.class, String[].class);
                                map2.put(-140597324, obj30);
                            }
                            long longValue14 = ((Long) ((Method) obj30).invoke(null, objArr115)).longValue();
                            long j35 = longValue14 ^ (-1);
                            long j36 = (-233495107) | j35;
                            long m14 = SVG$Unit$EnumUnboxingLocalUtility.m(867L, (((longValue14 | (-233495107)) | j2) ^ (-1)) | ((j36 | j9) ^ (-1)) | (((j35 | 233495106) | j2) ^ (-1)), ((-1734) * ((j36 ^ (-1)) | (((-233495107) | j2) ^ (-1)) | ((j35 | j2) ^ (-1)))) + ((-867) * ((((-233495107) | j9) ^ (-1)) | ((j35 | j9) ^ (-1)))) + (868 * longValue14) + 202673752008L, -1026109429L);
                            if (((((int) (m14 >> 32)) & ((((-554848257) | i) * 465) + (((-598997594) | (~((-2036224005) | i))) * 930) + ((((~((-598997594) | i)) | (-2036224005)) * (-465)) - 1792116390))) | (((int) m14) & Boxes$$ExternalSyntheticOutline1.m((~((-139465025) | i)) | 33621001, 446, (((~(665691193 | i5)) | (-805156218)) * 446) - 384374209, 1677579636))) == 0) {
                                int i26 = ThreeDS2ServiceInitializationCallback + 13;
                                ThreeDS2Service = i26 % 128;
                                if (i26 % 2 != 0) {
                                    i12 = 1;
                                    if (i12 == 0) {
                                        ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 9) % 128;
                                        objArr6 = new Object[]{new int[]{i}, new int[]{i12 ^ i}, null, new int[1]};
                                        Object[] objArr117 = {Integer.valueOf(i3), 16, Integer.valueOf(((2921148 | (~(i5 | 707260436))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | 707260436)) | 524968) * (-168)) + ((((~(2921148 | i)) | 704864256) * 336) - 1660543937))};
                                        Map map8 = removeParam.visaSchemeConfiguration;
                                        Object obj31 = map8.get(-1544987438);
                                        if (obj31 == null) {
                                            Class cls27 = (Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 85, (char) (TextUtils.lastIndexOf("", '0', 0) + 28642), 3317 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                            byte[] bArr19 = $$a;
                                            byte b30 = bArr19[19];
                                            byte b31 = (byte) (-bArr19[c]);
                                            Object[] objArr118 = new Object[1];
                                            a(b30, b31, (byte) (b31 | 36), objArr118);
                                            obj31 = cls27.getMethod((String) objArr118[0], cls2, cls2, cls2);
                                            map8.put(-1544987438, obj31);
                                        }
                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj31).invoke(null, objArr117)).intValue();
                                    } else {
                                        if ((i2 & 64) == 0) {
                                            Object[] objArr119 = new Object[1];
                                            b((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 12, 228 - View.resolveSizeAndState(0, 0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 12463), objArr119);
                                            Object[] objArr120 = {((String) objArr119[0]).intern()};
                                            Map map9 = removeParam.visaSchemeConfiguration;
                                            Object obj32 = map9.get(-690415720);
                                            if (obj32 == null) {
                                                Class cls28 = (Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 47, (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2248);
                                                byte b32 = (byte) (-$$a[24]);
                                                Object[] objArr121 = new Object[1];
                                                a(b32, (byte) (b32 + 2), r7[19], objArr121);
                                                obj32 = cls28.getMethod((String) objArr121[0], String.class);
                                                map9.put(-690415720, obj32);
                                            }
                                            String str2 = (String) ((Method) obj32).invoke(null, objArr120);
                                            if (str2 != null) {
                                                Object[] objArr122 = new Object[1];
                                                b(11 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, (char) (15418 - TextUtils.indexOf("", "", 0)), objArr122);
                                                String[] strArr6 = {((String) objArr122[0]).intern()};
                                                ThreeDS2ServiceInitializationCallback = (ThreeDS2Service + 67) % 128;
                                                if (!str2.contains(strArr6[0])) {
                                                    ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 37) % 128;
                                                    Object[] objArr123 = new Object[1];
                                                    c("뺟⍃藿昁좍구བ\uf1fe剫㒞餺篢", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40343, objArr123);
                                                    String intern36 = ((String) objArr123[0]).intern();
                                                    Object[] objArr124 = new Object[1];
                                                    c("뺟ᚋ\uee6f䟙ᾭ\uf744䳦⑆ﰫ喆\u2d6a芊媦㈊诬挎", 43102 - MotionEvent.axisFromString(""), objArr124);
                                                    String intern37 = ((String) objArr124[0]).intern();
                                                    Object[] objArr125 = new Object[1];
                                                    c("뺟ヱꊛᒫ虅砦\uea02巜쿻䆜㎮ꔈ\u1774褳磟\ueaf5峏", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36389, objArr125);
                                                    String intern38 = ((String) objArr125[0]).intern();
                                                    Object[] objArr126 = new Object[1];
                                                    b(Gravity.getAbsoluteGravity(0, 0) + 6, 293 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr126);
                                                    String intern39 = ((String) objArr126[0]).intern();
                                                    Object[] objArr127 = new Object[1];
                                                    b((ViewConfiguration.getTouchSlop() >> 8) + 12, (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, (char) KeyEvent.keyCodeFromString(""), objArr127);
                                                    String intern40 = ((String) objArr127[0]).intern();
                                                    Object[] objArr128 = new Object[1];
                                                    c("뺟抒٫⨰쾀\uf340霻뢨屚\u0000◴짤\ued52軈늦噻箏", 56401 - TextUtils.getOffsetBefore("", 0), objArr128);
                                                    String intern41 = ((String) objArr128[0]).intern();
                                                    Object[] objArr129 = new Object[1];
                                                    b(21 - ((Process.getThreadPriority(0) + 20) >> 6), (Process.myTid() >> 22) + EnumC0170g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr129);
                                                    String intern42 = ((String) objArr129[0]).intern();
                                                    Object[] objArr130 = new Object[1];
                                                    b(16 - (ViewConfiguration.getEdgeSlop() >> 16), 320 - Color.blue(0), (char) (37799 - Process.getGidForName("")), objArr130);
                                                    String intern43 = ((String) objArr130[0]).intern();
                                                    Object[] objArr131 = new Object[1];
                                                    c("뺟❼趷現\ud838빮⒧誦猽\ud974뾴▪訳灦훯볯┥譺熺ힰ밮≴袵滭흷", 39359 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr131);
                                                    String intern44 = ((String) objArr131[0]).intern();
                                                    Object[] objArr132 = new Object[1];
                                                    c("뺟늴꘧鮦輘肆\uf417\ue9de\udd70컽쉿㟃⬋", 3191 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr132);
                                                    String intern45 = ((String) objArr132[0]).intern();
                                                    Object[] objArr133 = new Object[1];
                                                    c("뺟枊ౝ㔯\udba3聙꤃俷瓧", 55631 - Color.red(0), objArr133);
                                                    String intern46 = ((String) objArr133[0]).intern();
                                                    Object[] objArr134 = new Object[1];
                                                    b(Color.green(0) + 8, 336 - View.MeasureSpec.getSize(0), (char) (34842 - Drawable.resolveOpacity(0, 0)), objArr134);
                                                    String[] strArr7 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((String) objArr134[0]).intern()};
                                                    int i27 = 0;
                                                    for (int i28 = i9; i27 < i28; i28 = 12) {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(strArr7[i27]);
                                                        Object[] objArr135 = new Object[1];
                                                        c("뻃ﰎ", 17099 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr135);
                                                        sb.append(((String) objArr135[0]).intern());
                                                        Object[] objArr136 = {sb.toString()};
                                                        Map map10 = removeParam.visaSchemeConfiguration;
                                                        Object obj33 = map10.get(Integer.valueOf(i10));
                                                        if (obj33 == null) {
                                                            Class cls29 = (Class) removeParam.initialize(48 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getEdgeSlop() >> 16), 2755 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                                                            byte b33 = (byte) ($$b & 92);
                                                            Object[] objArr137 = new Object[1];
                                                            a(b33, (byte) (b33 + 4), $$a[14], objArr137);
                                                            obj33 = cls29.getMethod((String) objArr137[0], String.class);
                                                            map10.put(Integer.valueOf(i10), obj33);
                                                        }
                                                        long longValue15 = ((Long) ((Method) obj33).invoke(null, objArr136)).longValue();
                                                        long j37 = ((-489) * longValue15) - 349726592429L;
                                                        long j38 = longValue15 ^ (-1);
                                                        long m15 = SVG$Unit$EnumUnboxingLocalUtility.m(490L, (((-712274119) | j38) ^ (-1)) | ((j38 | j2) ^ (-1)), ((-490) * (712274118 | j38 | j9)) + j37, 347634840277L);
                                                        if (((((int) (m15 >> 32)) & ((((~(1135341311 | i5)) | (-1739325440) | (~((-1118415446) | i))) * 676) + (((~(i5 | (-1722399574))) | 603984128) * 676) + ((((-603984129) | i) * (-676)) - 277167470))) | (((int) m15) & ((((~(i5 | (-1074340362))) | 18874400) * 521) + ((~((-1074340362) | i)) * 521) + 228533476))) != 0) {
                                                            i13 = i27 + 110;
                                                            break;
                                                        }
                                                        i27++;
                                                    }
                                                }
                                            }
                                        }
                                        i13 = 0;
                                        if (i13 != 0) {
                                            objArr6 = new Object[]{new int[]{i}, new int[]{i13 ^ i}, null, new int[1]};
                                            Object[] objArr138 = {Integer.valueOf(i3), 16, Integer.valueOf(((106054064 | (~(i | (-810393353)))) * HttpStatusCode.BAD_GATEWAY_502) + ((~(i5 | 912252856)) * (-502)) + (((~(106054064 | i)) | 101859504) * (-502)) + 209236625)};
                                            Map map11 = removeParam.visaSchemeConfiguration;
                                            Object obj34 = map11.get(-1544987438);
                                            if (obj34 == null) {
                                                Class cls30 = (Class) removeParam.initialize(87 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (char) (28641 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Drawable.resolveOpacity(0, 0) + 3317);
                                                byte[] bArr20 = $$a;
                                                byte b34 = bArr20[19];
                                                byte b35 = (byte) (-bArr20[c]);
                                                Object[] objArr139 = new Object[1];
                                                a(b34, b35, (byte) (b35 | 36), objArr139);
                                                obj34 = cls30.getMethod((String) objArr139[0], cls2, cls2, cls2);
                                                map11.put(-1544987438, obj34);
                                            }
                                            ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj34).invoke(null, objArr138)).intValue();
                                        } else {
                                            long[] jArr = {472001035};
                                            Object[] objArr140 = new Object[1];
                                            c("뺟쒗䩬퇚垏\udd2c惉\ue6b4汤\uf3d9秹｠ˋ袮ผ闝᮳", 31320 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr140);
                                            try {
                                                bufferedInputStream2 = new BufferedInputStream(new FileInputStream(((String) objArr140[0]).intern()));
                                                j6 = j;
                                            } catch (IOException unused2) {
                                                bufferedInputStream2 = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                bufferedInputStream = null;
                                            }
                                            loop2: while (true) {
                                                try {
                                                    int read = bufferedInputStream2.read();
                                                    if (read != i4) {
                                                        j6 = ((j6 << 5) ^ read) & 1073741823;
                                                        for (int i29 = 0; i29 < 1; i29++) {
                                                            if (j6 == jArr[i29]) {
                                                                i14 = i29 + 1;
                                                                try {
                                                                    bufferedInputStream2.close();
                                                                    break loop2;
                                                                } catch (Exception unused3) {
                                                                }
                                                            }
                                                        }
                                                        i4 = -1;
                                                    }
                                                } catch (IOException unused4) {
                                                } catch (Throwable th3) {
                                                    th = th3;
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
                                            i14 = 0;
                                            int i30 = i14 != 0 ? EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE : 0;
                                            if (i30 != 0) {
                                                objArr6 = new Object[]{new int[]{i}, new int[]{i30 ^ i}, null, new int[1]};
                                                Object[] objArr141 = {Integer.valueOf(i3), 16, Integer.valueOf(Boxes$$ExternalSyntheticOutline1.m((~(i5 | (-4265271))) | 712861624, 381, ((i | (-4103)) * (-381)) - 316125914, 1562862))};
                                                Map map12 = removeParam.visaSchemeConfiguration;
                                                Object obj35 = map12.get(-1544987438);
                                                if (obj35 == null) {
                                                    Class cls31 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionChild(j) + 87, (char) (28640 - ((byte) KeyEvent.getModifierMetaStateMask())), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 3318);
                                                    byte[] bArr21 = $$a;
                                                    byte b36 = bArr21[19];
                                                    byte b37 = (byte) (-bArr21[c]);
                                                    Object[] objArr142 = new Object[1];
                                                    a(b36, b37, (byte) (b37 | 36), objArr142);
                                                    obj35 = cls31.getMethod((String) objArr142[0], cls2, cls2, cls2);
                                                    map12.put(-1544987438, obj35);
                                                }
                                                ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj35).invoke(null, objArr141)).intValue();
                                            } else {
                                                long[] jArr2 = {472001035};
                                                Object[] objArr143 = new Object[1];
                                                c("뺟붖롣뜼돋깿괽꧌ꑫꌨ龎驾餢閔遮轤讐虺蔦膖ﱷאּ", 853 - (ViewConfiguration.getScrollBarSize() >> 8), objArr143);
                                                try {
                                                    bufferedInputStream3 = new BufferedInputStream(new FileInputStream(((String) objArr143[0]).intern()));
                                                    j5 = j;
                                                } catch (IOException unused7) {
                                                    bufferedInputStream3 = null;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    bufferedInputStream3 = null;
                                                }
                                                while (true) {
                                                    try {
                                                        int read2 = bufferedInputStream3.read();
                                                        if (read2 != -1) {
                                                            j5 = ((j5 << 5) ^ read2) & 1073741823;
                                                            for (int i31 = 0; i31 < 1; i31++) {
                                                                if (j5 == jArr2[i31]) {
                                                                    int i32 = ThreeDS2ServiceInitializationCallback + 81;
                                                                    ThreeDS2Service = i32 % 128;
                                                                    i15 = i32 % 2 != 0 ? i31 << 1 : i31 + 1;
                                                                    try {
                                                                        bufferedInputStream3.close();
                                                                    } catch (Exception unused8) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (IOException unused9) {
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        if (bufferedInputStream3 != null) {
                                                            try {
                                                                bufferedInputStream3.close();
                                                            } catch (Exception unused10) {
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                    try {
                                                        bufferedInputStream3.close();
                                                        break;
                                                    } catch (Exception unused11) {
                                                    }
                                                }
                                                if (i15 == 0) {
                                                    objArr6 = new Object[]{new int[]{i}, new int[]{r4}, null, new int[1]};
                                                    int i33 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
                                                    Object[] objArr144 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(255480868 | i)) | 101336064) * 49) + (((~((-959820157) | i5)) | 255480868 | (~(959820156 | i))) * (-49)) + ((((~(255480868 | i5)) | (-1061156221)) * 98) - 241791939))};
                                                    Map map13 = removeParam.visaSchemeConfiguration;
                                                    Object obj36 = map13.get(-1544987438);
                                                    if (obj36 == null) {
                                                        Class cls32 = (Class) removeParam.initialize(86 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (28641 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3317);
                                                        byte[] bArr22 = $$a;
                                                        byte b38 = bArr22[19];
                                                        byte b39 = (byte) (-bArr22[c]);
                                                        Object[] objArr145 = new Object[1];
                                                        a(b38, b39, (byte) (b39 | 36), objArr145);
                                                        obj36 = cls32.getMethod((String) objArr145[0], cls2, cls2, cls2);
                                                        map13.put(-1544987438, obj36);
                                                    }
                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj36).invoke(null, objArr144)).intValue();
                                                } else {
                                                    Map map14 = removeParam.visaSchemeConfiguration;
                                                    Object obj37 = map14.get(1911500168);
                                                    if (obj37 != null) {
                                                        objArr = null;
                                                    } else {
                                                        Class cls33 = (Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 48, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2856 - ((Process.getThreadPriority(0) + 20) >> 6));
                                                        byte b40 = (byte) ($$b & 92);
                                                        byte[] bArr23 = $$a;
                                                        Object[] objArr146 = new Object[1];
                                                        a(b40, bArr23[c], bArr23[6], objArr146);
                                                        objArr = null;
                                                        obj37 = cls33.getMethod((String) objArr146[0], null);
                                                        map14.put(1911500168, obj37);
                                                    }
                                                    long longValue16 = ((Long) ((Method) obj37).invoke(objArr, objArr)).longValue();
                                                    long j39 = longValue16 ^ (-1);
                                                    int m16 = ((int) (SVG$Unit$EnumUnboxingLocalUtility.m(68L, 875537022 | ((j39 | j9) ^ (-1)), ((-68) * ((longValue16 | (875537022 | j9)) ^ (-1))) + (((((((875537022 | j39) | j9) ^ (-1)) | (((-875537023) | longValue16) ^ (-1))) | ((longValue16 | j2) ^ (-1))) * (-68)) + (((-67) * longValue16) - 60412054587L)), -506336747L) >> 32)) & ((((~(i5 | 1887732203)) | (~((-450505793) | i))) * 950) + (((~(i5 | (-450505793))) | (~(1887732203 | i))) * (-950)) + (((~((-1887732204) | i5)) | (~(450505792 | i))) * 1900) + 1871737038);
                                                    int i34 = ~(i5 | (-462044440));
                                                    if ((m16 | (((int) r6) & (((i34 | 564798853) * 764) + (((~(i5 | (-975181971))) | 538968192) * (-1528)) + (((-975181971) | i34) * 764) + 1767506973))) != 0) {
                                                        ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 47) % 128;
                                                        objArr6 = new Object[]{new int[]{i ^ EnumC0170g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i30}, null, new int[1]};
                                                        Object[] objArr147 = {Integer.valueOf(i3), 16, Integer.valueOf(((i | (-1040491433)) * 397) + (((((~((-887099541) | i5)) | 14684180) | (~(i5 | (-182760253)))) * (-397)) - 1297737360))};
                                                        Object obj38 = map14.get(-1544987438);
                                                        if (obj38 == null) {
                                                            Class cls34 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionType(j) + 86, (char) (28689 - AndroidCharacter.getMirror('0')), 3317 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                                                            byte[] bArr24 = $$a;
                                                            byte b41 = bArr24[19];
                                                            byte b42 = (byte) (-bArr24[c]);
                                                            Object[] objArr148 = new Object[1];
                                                            a(b41, b42, (byte) (b42 | 36), objArr148);
                                                            obj38 = cls34.getMethod((String) objArr148[0], cls2, cls2, cls2);
                                                            map14.put(-1544987438, obj38);
                                                        }
                                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj38).invoke(null, objArr147)).intValue();
                                                    } else {
                                                        Object[] objArr149 = {2};
                                                        Object obj39 = map14.get(-924697231);
                                                        if (obj39 == null) {
                                                            Class cls35 = (Class) removeParam.initialize('_' - AndroidCharacter.getMirror('0'), (char) (5586 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1032 - TextUtils.indexOf("", "", 0, 0));
                                                            byte b43 = (byte) ($$b & 92);
                                                            byte[] bArr25 = $$a;
                                                            Object[] objArr150 = new Object[1];
                                                            a(b43, bArr25[c], bArr25[6], objArr150);
                                                            obj39 = cls35.getMethod((String) objArr150[0], cls2);
                                                            map14.put(-924697231, obj39);
                                                        }
                                                        long longValue17 = ((Long) ((Method) obj39).invoke(null, objArr149)).longValue();
                                                        long j40 = (longValue17 | j2) ^ (-1);
                                                        long m17 = SVG$Unit$EnumUnboxingLocalUtility.m(110L, ((28998962 | longValue17) ^ (-1)) | (((longValue17 ^ (-1)) | (-28998963)) ^ (-1)), (((((-28998963) | longValue17) ^ (-1)) | j40) * 220) + ((-220) * (28998962 | j40)) + (111 * longValue17) + 3160886967L, 1095900913L);
                                                        if (((((int) (m17 >> 32)) & (((~(i5 | (-4199427))) * 501) + (((~((-4199427) | i)) | 554254408) * 501) + 824729816)) | (((int) m17) & (((~((-1294598241) | i)) * 566) + ((((~((-1294671973) | i)) | 73732) * (-566)) - 1395494099)))) == 2) {
                                                            objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                            int i35 = i ^ EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
                                                            Object[] objArr151 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-7426056))) | (-981335744)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (((~((-846550544) | i)) | (-142211256)) * (-470)) + ((((~((-846550544) | i5)) | (-142211256)) * (-235)) - 339559604))};
                                                            Object obj40 = map14.get(-1544987438);
                                                            if (obj40 == null) {
                                                                Class cls36 = (Class) removeParam.initialize((ViewConfiguration.getTapTimeout() >> 16) + 86, (char) (View.MeasureSpec.getMode(0) + 28641), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 3317);
                                                                byte[] bArr26 = $$a;
                                                                byte b44 = bArr26[19];
                                                                byte b45 = (byte) (-bArr26[c]);
                                                                Object[] objArr152 = new Object[1];
                                                                a(b44, b45, (byte) (b45 | 36), objArr152);
                                                                obj40 = cls36.getMethod((String) objArr152[0], cls2, cls2, cls2);
                                                                map14.put(-1544987438, obj40);
                                                            }
                                                            ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj40).invoke(null, objArr151)).intValue();
                                                        } else {
                                                            if ((i2 & 4096) != 0) {
                                                                Object obj41 = map14.get(1758994333);
                                                                if (obj41 != null) {
                                                                    objArr11 = null;
                                                                } else {
                                                                    Class cls37 = (Class) removeParam.initialize(AndroidCharacter.getMirror('0'), (char) (55743 - ((Process.getThreadPriority(0) + 20) >> 6)), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 2053);
                                                                    byte b46 = (byte) (-$$a[24]);
                                                                    Object[] objArr153 = new Object[1];
                                                                    a(b46, (byte) (b46 + 2), r4[19], objArr153);
                                                                    String str3 = (String) objArr153[0];
                                                                    objArr11 = null;
                                                                    obj41 = cls37.getMethod(str3, null);
                                                                    map14.put(1758994333, obj41);
                                                                }
                                                                long longValue18 = ((Long) ((Method) obj41).invoke(objArr11, objArr11)).longValue();
                                                                long j41 = longValue18 ^ (-1);
                                                                long j42 = (1335455504 | j2) ^ (-1);
                                                                long j43 = ((-1335455505) | longValue18) ^ (-1);
                                                                long m18 = SVG$Unit$EnumUnboxingLocalUtility.m(407L, j43 | (((-1335455505) | j2) ^ (-1)) | ((longValue18 | j2) ^ (-1)), ((((j41 | j9) ^ (-1)) | j43 | j42) * 407) + ((-814) * (((j41 | 1335455504) ^ (-1)) | j42)) + ((408 * longValue18) - 1085725324752L), 253506708L);
                                                                if (((((int) (m18 >> 32)) & ((((~((-1177224581) | i)) | (~(i5 | 260001830))) * 406) + ((~(i5 | (-156520483))) * (-406)) + ((((~((-260001831) | i)) | (~(i5 | 1333745062))) * (-406)) - 1588022634))) | (((int) m18) & Boxes$$ExternalSyntheticOutline1.m((~(2141978623 | i)) | 268538449, 446, (((~(1923871741 | i5)) | 218106882) * 446) - 384374209, -1508578436))) != 0) {
                                                                    objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                    int i36 = i ^ EnumC0170g.SDK_ASSET_HEADER_SHIELD_VALUE;
                                                                    Object[] objArr154 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i5 | (-1469176))) | (~(i | 705808463))) * 950) + (((~(i5 | 705808463)) | (~(i | (-1469176)))) * (-950)) + (((~(1469175 | i5)) | (~((-705808464) | i))) * 1900) + 1596914813)};
                                                                    Object obj42 = map14.get(-1544987438);
                                                                    if (obj42 == null) {
                                                                        Class cls38 = (Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 86, (char) (View.MeasureSpec.getSize(0) + 28641), 3318 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)));
                                                                        byte[] bArr27 = $$a;
                                                                        byte b47 = bArr27[19];
                                                                        byte b48 = (byte) (-bArr27[c]);
                                                                        Object[] objArr155 = new Object[1];
                                                                        a(b47, b48, (byte) (b48 | 36), objArr155);
                                                                        obj42 = cls38.getMethod((String) objArr155[0], cls2, cls2, cls2);
                                                                        map14.put(-1544987438, obj42);
                                                                    }
                                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj42).invoke(null, objArr154)).intValue();
                                                                }
                                                            }
                                                            if ((i2 & 16384) == 0) {
                                                                Object obj43 = map14.get(-1877869269);
                                                                if (obj43 != null) {
                                                                    objArr10 = null;
                                                                } else {
                                                                    Class cls39 = (Class) removeParam.initialize(47 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 52333), 3661 - (ViewConfiguration.getEdgeSlop() >> 16));
                                                                    byte b49 = (byte) ($$b & 92);
                                                                    Object[] objArr156 = new Object[1];
                                                                    a(b49, (byte) (b49 + 4), $$a[14], objArr156);
                                                                    String str4 = (String) objArr156[0];
                                                                    objArr10 = null;
                                                                    obj43 = cls39.getMethod(str4, null);
                                                                    map14.put(-1877869269, obj43);
                                                                }
                                                                long longValue19 = ((Long) ((Method) obj43).invoke(objArr10, objArr10)).longValue();
                                                                long j44 = ((-1917) * longValue19) + 986713099200L;
                                                                long j45 = longValue19 ^ (-1);
                                                                long m19 = SVG$Unit$EnumUnboxingLocalUtility.m(959L, ((j45 | j2) ^ (-1)) | ((j9 | 1027826145) ^ (-1)), ((-959) * j45) + ((((j45 | j9) ^ (-1)) | ((1027826145 | j2) ^ (-1))) * 959) + j44, -1383922236L);
                                                                int i37 = ~(i5 | (-361216121));
                                                                if (((((int) (m19 >> 32)) & (((i37 | (-1798442532)) * 712) + (((~(i5 | (-16910369))) | (~((-344305753) | i))) * (-712)) + ((16910368 | i37) * (-712)) + 1515894666)) | (((int) m19) & ((((~((-966811836) | i5)) | 151003169) * 859) + (((~(i5 | 1890929050)) | (~((-815808667) | i))) * 859) + ((1890929050 | i) * (-859)) + 2105478810))) != 0) {
                                                                    objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                    int i38 = i ^ EnumC0170g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE;
                                                                    Object[] objArr157 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | 168711270)) | (~((-535628018) | i)) | 367069329) * 407) + (((~(535628017 | i)) | (~((-168711271) | i5)) | 367069329) * 407) + (((152582 | r0) * (-814)) - 1559159501))};
                                                                    Object obj44 = map14.get(-1544987438);
                                                                    if (obj44 == null) {
                                                                        Class cls40 = (Class) removeParam.initialize(86 - ExpandableListView.getPackedPositionType(j), (char) (28641 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Process.getGidForName("") + 3318);
                                                                        byte[] bArr28 = $$a;
                                                                        byte b50 = bArr28[19];
                                                                        byte b51 = (byte) (-bArr28[c]);
                                                                        Object[] objArr158 = new Object[1];
                                                                        a(b50, b51, (byte) (b51 | 36), objArr158);
                                                                        obj44 = cls40.getMethod((String) objArr158[0], cls2, cls2, cls2);
                                                                        map14.put(-1544987438, obj44);
                                                                    }
                                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj44).invoke(null, objArr157)).intValue();
                                                                }
                                                            }
                                                            Object obj45 = map14.get(-1879685559);
                                                            if (obj45 != null) {
                                                                objArr2 = null;
                                                            } else {
                                                                Class cls41 = (Class) removeParam.initialize((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 48, (char) (52333 - TextUtils.getTrimmedLength("")), 3660 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)));
                                                                byte b52 = (byte) ($$b & 92);
                                                                byte[] bArr29 = $$a;
                                                                Object[] objArr159 = new Object[1];
                                                                a(b52, bArr29[c], bArr29[6], objArr159);
                                                                String str5 = (String) objArr159[0];
                                                                objArr2 = null;
                                                                obj45 = cls41.getMethod(str5, null);
                                                                map14.put(-1879685559, obj45);
                                                            }
                                                            long longValue20 = ((Long) ((Method) obj45).invoke(objArr2, objArr2)).longValue();
                                                            long j46 = longValue20 ^ (-1);
                                                            long j47 = (629129029 | j2) ^ (-1);
                                                            long m20 = SVG$Unit$EnumUnboxingLocalUtility.m(520L, (((-629129030) | j9) ^ (-1)) | ((j46 | 629129029) ^ (-1)) | j47, ((-1040) * (((j46 | j9) ^ (-1)) | j47)) + ((((((-629129030) | j46) | j9) ^ (-1)) | ((longValue20 | j2) ^ (-1))) * 520) + ((521 * longValue20) - 326517966051L), -1998918589L);
                                                            int i39 = ((int) (m20 >> 32)) & (((i | 21495812) * 54) + (((~((-1009887956) | i)) | 21495812 | (~(i5 | 1009887955))) * 54) + (((~(i5 | 427338455)) | 604045312) * (-108)) + 1228688248);
                                                            int i40 = (int) m20;
                                                            int i41 = (((~((-813699075) | i5)) | (~(1888849939 | i))) * 520) + 200080093;
                                                            int i42 = ~((-1888849940) | i5);
                                                            int i43 = ~(968890946 | i);
                                                            if ((i39 | (i40 & ((((~((-968890947) | i5)) | 1075150865 | i43) * 520) + ((i42 | i43) * (-1040)) + i41))) != 0) {
                                                                objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                int i44 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE;
                                                                Object[] objArr160 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-838860889))) | (~(i5 | 916457690)) | (~(i5 | (-212118403)))) * 568) + (((~((-916457691) | i)) | (~(212118402 | i)) | (~(i5 | (-134521601)))) * (-568)) + (((~((-916457691) | i5)) | 838860888 | (~(212118402 | i5))) * (-1136)) + 1337095775)};
                                                                Object obj46 = map14.get(-1544987438);
                                                                if (obj46 == null) {
                                                                    Class cls42 = (Class) removeParam.initialize(Color.red(0) + 86, (char) (28641 - View.resolveSizeAndState(0, 0, 0)), 3316 - ((byte) KeyEvent.getModifierMetaStateMask()));
                                                                    byte[] bArr30 = $$a;
                                                                    byte b53 = bArr30[19];
                                                                    byte b54 = (byte) (-bArr30[c]);
                                                                    Object[] objArr161 = new Object[1];
                                                                    a(b53, b54, (byte) (b54 | 36), objArr161);
                                                                    obj46 = cls42.getMethod((String) objArr161[0], cls2, cls2, cls2);
                                                                    map14.put(-1544987438, obj46);
                                                                }
                                                                ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj46).invoke(null, objArr160)).intValue();
                                                            } else {
                                                                Object obj47 = map14.get(-898109011);
                                                                if (obj47 != null) {
                                                                    objArr3 = null;
                                                                } else {
                                                                    Class cls43 = (Class) removeParam.initialize((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 47, (char) Color.alpha(0), 3565 - ExpandableListView.getPackedPositionChild(j));
                                                                    byte b55 = (byte) ($$b & 92);
                                                                    byte[] bArr31 = $$a;
                                                                    Object[] objArr162 = new Object[1];
                                                                    a(b55, bArr31[c], bArr31[6], objArr162);
                                                                    String str6 = (String) objArr162[0];
                                                                    objArr3 = null;
                                                                    obj47 = cls43.getMethod(str6, null);
                                                                    map14.put(-898109011, obj47);
                                                                }
                                                                long longValue21 = ((Long) ((Method) obj47).invoke(objArr3, objArr3)).longValue();
                                                                long m21 = SVG$Unit$EnumUnboxingLocalUtility.m(220L, 457146797 | longValue21 | j2, ((-440) * (457146797 | ((j9 | longValue21) ^ (-1)))) + (((((-457146798) | (longValue21 ^ (-1))) ^ (-1)) | (((j9 | 457146797) | longValue21) ^ (-1))) * 220) + ((-219) * longValue21) + 101029442137L, 892413486L);
                                                                if (((((int) (m21 >> 32)) & ((((~((-983166081) | i5)) | (-454060331)) * 68) + ((~(i5 | (-16777515))) * (-68)) + (((((~((-437282817) | i5)) | (-999943595)) | (~(983166080 | i))) * (-68)) - 182226222))) | (((int) m21) & ((((~(704022798 | i5)) | 38094229) * EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + (((~(704022798 | i)) | 38094229) * EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 69709593))) != 0) {
                                                                    objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                    int i45 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE;
                                                                    Object[] objArr163 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i5 | 349226615)) | (-33181848)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + ((((-19533953) | i5) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1780135089))};
                                                                    Object obj48 = map14.get(-1544987438);
                                                                    if (obj48 == null) {
                                                                        Class cls44 = (Class) removeParam.initialize(86 - View.combineMeasuredStates(0, 0), (char) (28640 - TextUtils.lastIndexOf("", '0')), 3317 - (KeyEvent.getMaxKeyCode() >> 16));
                                                                        byte[] bArr32 = $$a;
                                                                        byte b56 = bArr32[19];
                                                                        byte b57 = (byte) (-bArr32[c]);
                                                                        Object[] objArr164 = new Object[1];
                                                                        a(b56, b57, (byte) (b57 | 36), objArr164);
                                                                        obj48 = cls44.getMethod((String) objArr164[0], cls2, cls2, cls2);
                                                                        map14.put(-1544987438, obj48);
                                                                    }
                                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj48).invoke(null, objArr163)).intValue();
                                                                } else {
                                                                    if ((65536 & i2) != 0) {
                                                                        Object obj49 = map14.get(-896292721);
                                                                        if (obj49 != null) {
                                                                            objArr9 = null;
                                                                        } else {
                                                                            Class cls45 = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), 3565 - TextUtils.lastIndexOf("", '0', 0, 0));
                                                                            byte b58 = (byte) ($$b & 92);
                                                                            Object[] objArr165 = new Object[1];
                                                                            a(b58, (byte) (b58 + 4), $$a[14], objArr165);
                                                                            String str7 = (String) objArr165[0];
                                                                            objArr9 = null;
                                                                            obj49 = cls45.getMethod(str7, null);
                                                                            map14.put(-896292721, obj49);
                                                                        }
                                                                        long longValue22 = ((Long) ((Method) obj49).invoke(objArr9, objArr9)).longValue();
                                                                        int m22 = (int) (SVG$Unit$EnumUnboxingLocalUtility.m(333L, ((642170949 | j2) ^ (-1)) | ((j9 | longValue22) ^ (-1)), ((((642170949 | j9) ^ (-1)) | ((longValue22 | j2) ^ (-1))) * 333) + ((334 * longValue22) + 213200755733L), -362847066L) >> 32);
                                                                        int i46 = ((((~(1110162655 | i)) | (-1781267968)) | (~(1747578229 | i))) * (-880)) - 818885110;
                                                                        int i47 = (~(1110162655 | i5)) | (-1747578230);
                                                                        int i48 = ~((-1110162656) | i);
                                                                        if (((m22 & ((i48 * 880) + ((i47 | i48) * (-880)) + i46)) | (((int) r6) & Boxes$$ExternalSyntheticOutline1.m((~((-2002911817) | i)) | 1157628480, 490, (((-845283337) | i5) * (-490)) - 1357056665, 2040550708))) != 0) {
                                                                            objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                            int i49 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
                                                                            Object[] objArr166 = {Integer.valueOf(i3), 16, Integer.valueOf((((~((-178442103) | i5)) | 167808352 | (~(i | 536530935))) * 757) + ((~((-10633751) | i)) * 1514) + ((i5 | 525897185) * (-757)) + 1734832062)};
                                                                            Object obj50 = map14.get(-1544987438);
                                                                            if (obj50 == null) {
                                                                                Class cls46 = (Class) removeParam.initialize(86 - KeyEvent.keyCodeFromString(""), (char) (28641 - Color.green(0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3318);
                                                                                byte[] bArr33 = $$a;
                                                                                byte b59 = bArr33[19];
                                                                                byte b60 = (byte) (-bArr33[c]);
                                                                                Object[] objArr167 = new Object[1];
                                                                                a(b59, b60, (byte) (b60 | 36), objArr167);
                                                                                obj50 = cls46.getMethod((String) objArr167[0], cls2, cls2, cls2);
                                                                                map14.put(-1544987438, obj50);
                                                                            }
                                                                            ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj50).invoke(null, objArr166)).intValue();
                                                                        }
                                                                    }
                                                                    long[] jArr3 = {624887784092251L};
                                                                    Object[] objArr168 = new Object[1];
                                                                    c("뺟쒗䩬퇚垏\udd2c惉\ue6b4汤\uf3d9秹｠ˋ袮ผ闝᮳", 31320 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), objArr168);
                                                                    Object[] objArr169 = {((String) objArr168[0]).intern(), 3, 2251799813685247L, jArr3};
                                                                    Object obj51 = map14.get(-2130454992);
                                                                    if (obj51 == null) {
                                                                        Class cls47 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionGroup(j) + 48, (char) (1942 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 2562);
                                                                        byte b61 = (byte) ($$b & 92);
                                                                        byte[] bArr34 = $$a;
                                                                        Object[] objArr170 = new Object[1];
                                                                        a(b61, bArr34[c], bArr34[6], objArr170);
                                                                        obj51 = cls47.getMethod((String) objArr170[0], String.class, cls2, Long.TYPE, long[].class);
                                                                        map14.put(-2130454992, obj51);
                                                                    }
                                                                    long longValue23 = ((Long) ((Method) obj51).invoke(null, objArr169)).longValue();
                                                                    long m23 = SVG$Unit$EnumUnboxingLocalUtility.m(560L, ((88638673 | longValue23) ^ (-1)) | ((j9 | longValue23) ^ (-1)), ((-560) * ((((longValue23 ^ (-1)) | (-88638674)) | j2) ^ (-1))) + (((j9 | (-88638674)) ^ (-1)) * (-560)) + (561 * longValue23) + 49549018766L, 2130629751L);
                                                                    if (((((int) (m23 >> 32)) & ((((~((-1712134148) | i5)) | (~(2139094911 | i)) | (~((-152053029) | i))) * 920) + (((~(426960764 | i5)) | 1712134147) * 920) + (((~((-1712134148) | i)) | (~(i5 | (-152053029)))) * 920) + 2038856378)) | (((int) m23) & (((~(i5 | 28438402)) * 886) + ((28438402 | (~(i5 | (-1465664813)))) * (-1772)) + (((((~(1465664812 | i)) | 10594946) | (~(i5 | (-1447821357)))) * 886) - 1085084693)))) != 0) {
                                                                        objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                        int i50 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE;
                                                                        int i51 = ~(i5 | 474199941);
                                                                        Object[] objArr171 = {Integer.valueOf(i3), 16, Integer.valueOf(((i51 | 201565568) * 970) + ((272634373 | i51) * (-970)) + 921603401)};
                                                                        Object obj52 = map14.get(-1544987438);
                                                                        if (obj52 == null) {
                                                                            Class cls48 = (Class) removeParam.initialize(86 - Drawable.resolveOpacity(0, 0), (char) (ExpandableListView.getPackedPositionType(j) + 28641), Color.green(0) + 3317);
                                                                            byte[] bArr35 = $$a;
                                                                            byte b62 = bArr35[19];
                                                                            byte b63 = (byte) (-bArr35[c]);
                                                                            Object[] objArr172 = new Object[1];
                                                                            a(b62, b63, (byte) (b63 | 36), objArr172);
                                                                            obj52 = cls48.getMethod((String) objArr172[0], cls2, cls2, cls2);
                                                                            map14.put(-1544987438, obj52);
                                                                        }
                                                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj52).invoke(null, objArr171)).intValue();
                                                                    } else {
                                                                        Object[] objArr173 = new Object[1];
                                                                        c("뺟鳱犯\ud8a9㘋ᑳ爗凔꿱趎\ueba9", 8741 - ExpandableListView.getPackedPositionGroup(j), objArr173);
                                                                        Object[] objArr174 = {((String) objArr173[0]).intern()};
                                                                        Object obj53 = map14.get(Integer.valueOf(i10));
                                                                        if (obj53 == null) {
                                                                            Class cls49 = (Class) removeParam.initialize((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 2754 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                                            byte b64 = (byte) ($$b & 92);
                                                                            Object[] objArr175 = new Object[1];
                                                                            a(b64, (byte) (b64 + 4), $$a[14], objArr175);
                                                                            obj53 = cls49.getMethod((String) objArr175[0], String.class);
                                                                            map14.put(Integer.valueOf(i10), obj53);
                                                                        }
                                                                        long longValue24 = ((Long) ((Method) obj53).invoke(null, objArr174)).longValue();
                                                                        long j48 = (((longValue24 ^ (-1)) | 1752283232) ^ (-1)) | ((1752283232 | j2) ^ (-1));
                                                                        long m24 = SVG$Unit$EnumUnboxingLocalUtility.m(496L, longValue24 | j2, ((-496) * (j48 | (((j9 | (-1752283233)) | longValue24) ^ (-1)))) + (992 * j48) + ((-495) * longValue24) + 867380200335L, -339468429L);
                                                                        int i52 = ~(384831782 | i5);
                                                                        int i53 = ~((-1822058194) | i);
                                                                        if (((((int) (m24 >> 32)) & ((((~(384831782 | i)) | (~(i5 | (-384831783)))) * 575) + ((i53 | (~(i5 | 1822058193))) * (-575)) + (((i52 | i53) * 1150) - 334238508))) | (((int) m24) & ((((~(1653696038 | i5)) | (-1861711487)) * (-964)) + ((((~(1653696038 | i)) | (-216469629)) * (-964)) - 390666043)))) != 0) {
                                                                            objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                            int i54 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE;
                                                                            Object[] objArr176 = {Integer.valueOf(i3), 16, Integer.valueOf((((~((-636694468) | i)) | (-67644821)) * EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE) + (((~((-67644821) | i)) | (~(i5 | 636694467))) * (-301)) + ((~(637218775 | i)) * (-301)) + 1219087380)};
                                                                            Object obj54 = map14.get(-1544987438);
                                                                            if (obj54 == null) {
                                                                                Class cls50 = (Class) removeParam.initialize(86 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 28640), Drawable.resolveOpacity(0, 0) + 3317);
                                                                                byte[] bArr36 = $$a;
                                                                                byte b65 = bArr36[19];
                                                                                byte b66 = (byte) (-bArr36[c]);
                                                                                Object[] objArr177 = new Object[1];
                                                                                a(b65, b66, (byte) (b66 | 36), objArr177);
                                                                                obj54 = cls50.getMethod((String) objArr177[0], cls2, cls2, cls2);
                                                                                map14.put(-1544987438, obj54);
                                                                            }
                                                                            ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj54).invoke(null, objArr176)).intValue();
                                                                        } else {
                                                                            Object obj55 = map14.get(-481111141);
                                                                            if (obj55 != null) {
                                                                                objArr4 = null;
                                                                            } else {
                                                                                Class cls51 = (Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48, (char) ((-1) - ExpandableListView.getPackedPositionChild(j)), View.MeasureSpec.getSize(0) + 2706);
                                                                                byte b67 = (byte) ($$b & 92);
                                                                                byte[] bArr37 = $$a;
                                                                                Object[] objArr178 = new Object[1];
                                                                                a(b67, bArr37[c], bArr37[6], objArr178);
                                                                                String str8 = (String) objArr178[0];
                                                                                objArr4 = null;
                                                                                obj55 = cls51.getMethod(str8, null);
                                                                                map14.put(-481111141, obj55);
                                                                            }
                                                                            long longValue25 = ((Long) ((Method) obj55).invoke(objArr4, objArr4)).longValue();
                                                                            long m25 = SVG$Unit$EnumUnboxingLocalUtility.m(272L, longValue25 | ((305522941 | j2) ^ (-1)), ((-272) * ((((-305522942) | longValue25) ^ (-1)) | (((-305522942) | j2) ^ (-1)))) + ((((((longValue25 ^ (-1)) | (-305522942)) | j9) ^ (-1)) | (((305522941 | longValue25) | j2) ^ (-1))) * (-272)) + ((-271) * longValue25) + 83407762893L, 1238099508L);
                                                                            int i55 = ((int) (m25 >> 32)) & ((((~((-1767854264) | i5)) | 18108420) * (-964)) + (((~((-1767854264) | i)) | 330627852) * (-964)) + 1444388854);
                                                                            int i56 = (int) m25;
                                                                            int i57 = (~((-186026217) | i5)) | 185991272;
                                                                            int i58 = ~((-1623217683) | i);
                                                                            if ((i55 | (i56 & (((i58 | (~(i5 | (-34945)))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) + (((i57 | i58) * (-252)) - 1812066123)))) != 0) {
                                                                                objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                                int i59 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                                                                                Object[] objArr179 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i5 | 934390145)) | (~(230050857 | i5)) | (-1069018538)) * 50) + (((~(i | (-838967681))) | (~(i5 | 1069018537))) * 50) + (((i | 934390145) * (-50)) - 1203152707))};
                                                                                Object obj56 = map14.get(-1544987438);
                                                                                if (obj56 == null) {
                                                                                    Class cls52 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0') + 87, (char) (28640 - TextUtils.lastIndexOf("", '0', 0)), 3317 - (ViewConfiguration.getScrollBarSize() >> 8));
                                                                                    byte[] bArr38 = $$a;
                                                                                    byte b68 = bArr38[19];
                                                                                    byte b69 = (byte) (-bArr38[c]);
                                                                                    Object[] objArr180 = new Object[1];
                                                                                    a(b68, b69, (byte) (b69 | 36), objArr180);
                                                                                    obj56 = cls52.getMethod((String) objArr180[0], cls2, cls2, cls2);
                                                                                    map14.put(-1544987438, obj56);
                                                                                }
                                                                                ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj56).invoke(null, objArr179)).intValue();
                                                                            } else {
                                                                                if ((2097152 & i2) == 0) {
                                                                                    Object obj57 = map14.get(-869420914);
                                                                                    if (obj57 != null) {
                                                                                        objArr8 = null;
                                                                                    } else {
                                                                                        Class cls53 = (Class) removeParam.initialize(48 - Drawable.resolveOpacity(0, 0), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27780), Color.blue(0) + 2441);
                                                                                        byte b70 = (byte) ($$b & 92);
                                                                                        byte[] bArr39 = $$a;
                                                                                        Object[] objArr181 = new Object[1];
                                                                                        a(b70, bArr39[c], bArr39[6], objArr181);
                                                                                        String str9 = (String) objArr181[0];
                                                                                        objArr8 = null;
                                                                                        obj57 = cls53.getMethod(str9, null);
                                                                                        map14.put(-869420914, obj57);
                                                                                    }
                                                                                    long longValue26 = ((Long) ((Method) obj57).invoke(objArr8, objArr8)).longValue();
                                                                                    long j49 = ((-283) * (((846860261 | longValue26) ^ (-1)) | ((846860261 | j2) ^ (-1)))) + (((-282) * longValue26) - 240508314408L);
                                                                                    long j50 = longValue26 ^ (-1);
                                                                                    long m26 = SVG$Unit$EnumUnboxingLocalUtility.m(283L, ((j50 | 846860261) | j2) ^ (-1), ((((-846860262) | j50) ^ (-1)) * 283) + j49, -328777436L);
                                                                                    if (((((int) (m26 >> 32)) & Boxes$$ExternalSyntheticOutline1.m((~(i5 | (-1342181441))) | 20988176, 576, (((~(768273810 | i)) | (-2110455251)) * 576) - 1771464918, -146479808)) | (((int) m26) & ((((~((-1528715407) | i)) | 1259753606 | (~(i5 | 1597987279))) * 521) + ((1329025479 | i) * 521) + ((((~(i5 | 1329025479)) | 1528715406) * (-1042)) - 477989548)))) != 0) {
                                                                                        objArr6 = new Object[]{new int[]{i}, new int[]{r6}, null, new int[1]};
                                                                                        int i60 = i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                                                                        Object[] objArr182 = {Integer.valueOf(i3), 16, Integer.valueOf(((857622046 | (~(153282758 | i5))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) + (((~(i5 | 857622046)) | 136358080) * (-160)) + 1266221719)};
                                                                                        Object obj58 = map14.get(-1544987438);
                                                                                        if (obj58 == null) {
                                                                                            Class cls54 = (Class) removeParam.initialize((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 85, (char) (28640 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 3317 - TextUtils.getCapsMode("", 0, 0));
                                                                                            byte[] bArr40 = $$a;
                                                                                            byte b71 = bArr40[19];
                                                                                            byte b72 = (byte) (-bArr40[c]);
                                                                                            Object[] objArr183 = new Object[1];
                                                                                            a(b71, b72, (byte) (b72 | 36), objArr183);
                                                                                            obj58 = cls54.getMethod((String) objArr183[0], cls2, cls2, cls2);
                                                                                            map14.put(-1544987438, obj58);
                                                                                        }
                                                                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj58).invoke(null, objArr182)).intValue();
                                                                                    }
                                                                                }
                                                                                if ((524288 & i2) == 0) {
                                                                                    Object obj59 = map14.get(-1691149417);
                                                                                    if (obj59 != null) {
                                                                                        objArr7 = null;
                                                                                    } else {
                                                                                        Class cls55 = (Class) removeParam.initialize(View.combineMeasuredStates(0, 0) + 48, (char) Color.argb(0, 0, 0, 0), 3221 - View.resolveSize(0, 0));
                                                                                        byte b73 = (byte) ($$b & 92);
                                                                                        byte[] bArr41 = $$a;
                                                                                        Object[] objArr184 = new Object[1];
                                                                                        a(b73, bArr41[c], bArr41[6], objArr184);
                                                                                        String str10 = (String) objArr184[0];
                                                                                        objArr7 = null;
                                                                                        obj59 = cls55.getMethod(str10, null);
                                                                                        map14.put(-1691149417, obj59);
                                                                                    }
                                                                                    long longValue27 = ((Long) ((Method) obj59).invoke(objArr7, objArr7)).longValue();
                                                                                    long j51 = longValue27 ^ (-1);
                                                                                    long j52 = ((-618071471) | longValue27) ^ (-1);
                                                                                    long m27 = SVG$Unit$EnumUnboxingLocalUtility.m(722L, ((longValue27 | 618071470) ^ (-1)) | ((j51 | (-618071471)) ^ (-1)), ((-1444) * (j52 | (((-618071471) | j2) ^ (-1)) | ((longValue27 | j2) ^ (-1)))) + (1444 * (j9 | ((618071470 | j51) ^ (-1)) | j52)) + ((-721) * longValue27) + 445629530591L, -1280929618L);
                                                                                    int i61 = ~((-1932653607) | i);
                                                                                    if (((((int) (m27 >> 32)) & (((i61 | (-1999894063)) * EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE) + (((67240456 | i61) * (-196)) - 1426300986))) | (((int) m27) & ((((~(i5 | 494979124)) | (~((-1932205535) | i))) * 950) + (((~(i5 | (-1932205535))) | (~(494979124 | i))) * (-950)) + ((((~((-494979125) | i5)) | (~(1932205534 | i))) * 1900) - 1871736089)))) != 0) {
                                                                                        objArr6 = new Object[]{new int[]{i}, new int[]{i ^ 280}, null, new int[1]};
                                                                                        Object[] objArr185 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i | (-279609507))) | 89136133) * EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + (((~((-447406331) | i)) | 256932957) * (-470)) + ((((~((-447406331) | i5)) | 256932957) * (-235)) - 1029950061))};
                                                                                        Object obj60 = map14.get(-1544987438);
                                                                                        if (obj60 == null) {
                                                                                            Class cls56 = (Class) removeParam.initialize(85 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((Process.myTid() >> 22) + 28641), 3317 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                                            byte[] bArr42 = $$a;
                                                                                            byte b74 = bArr42[19];
                                                                                            byte b75 = (byte) (-bArr42[c]);
                                                                                            Object[] objArr186 = new Object[1];
                                                                                            a(b74, b75, (byte) (b75 | 36), objArr186);
                                                                                            obj60 = cls56.getMethod((String) objArr186[0], cls2, cls2, cls2);
                                                                                            map14.put(-1544987438, obj60);
                                                                                        }
                                                                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj60).invoke(null, objArr185)).intValue();
                                                                                    }
                                                                                }
                                                                                Object obj61 = map14.get(-601987854);
                                                                                if (obj61 != null) {
                                                                                    objArr5 = null;
                                                                                } else {
                                                                                    Class cls57 = (Class) removeParam.initialize((ViewConfiguration.getScrollBarSize() >> 8) + 48, (char) (36007 - Color.blue(0)), View.getDefaultSize(0, 0) + 3708);
                                                                                    byte b76 = (byte) ($$b & 92);
                                                                                    byte[] bArr43 = $$a;
                                                                                    Object[] objArr187 = new Object[1];
                                                                                    a(b76, bArr43[c], bArr43[6], objArr187);
                                                                                    String str11 = (String) objArr187[0];
                                                                                    objArr5 = null;
                                                                                    obj61 = cls57.getMethod(str11, null);
                                                                                    map14.put(-601987854, obj61);
                                                                                }
                                                                                long longValue28 = ((Long) ((Method) obj61).invoke(objArr5, objArr5)).longValue();
                                                                                long j53 = longValue28 ^ (-1);
                                                                                long m28 = SVG$Unit$EnumUnboxingLocalUtility.m(45L, ((875381619 | j2) ^ (-1)) | j53 | ((j9 | (-875381620)) ^ (-1)), ((-45) * ((((-875381620) | longValue28) ^ (-1)) | ((j53 | j2) ^ (-1)))) + ((-90) * ((-875381620) | ((j53 | j9) ^ (-1)))) + ((46 * longValue28) - 40267554520L), -1240906172L);
                                                                                int i62 = ~((-25510177) | i);
                                                                                int i63 = ((int) ((long) ((((int) (m28 >> 32)) & (((~(i5 | (-25510177))) * 476) + ((i62 * 952) + (((135271424 | i62) * (-476)) + 2143972906)))) | (((int) m28) & ((((~((-1361248727) | i)) | 75977683) * 529) + ((((~(i5 | (-1361248727))) | 197074) * 529) + (-1520785380))))))) != 0 ? i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i;
                                                                                if (i63 != i) {
                                                                                    objArr6 = new Object[]{new int[]{i}, new int[]{i63}, null, new int[1]};
                                                                                    Object[] objArr188 = {Integer.valueOf(i3), 16, Integer.valueOf((((~(i5 | (-272635016))) | (-1044756448)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE) + (((~((-1010865376) | i5)) | 738230360) * (-241)) + 907430415)};
                                                                                    Object obj62 = map14.get(-1544987438);
                                                                                    if (obj62 == null) {
                                                                                        Class cls58 = (Class) removeParam.initialize(85 - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.indexOf("", "") + 28641), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 3316);
                                                                                        byte[] bArr44 = $$a;
                                                                                        byte b77 = bArr44[19];
                                                                                        byte b78 = (byte) (-bArr44[c]);
                                                                                        Object[] objArr189 = new Object[1];
                                                                                        a(b77, b78, (byte) (b78 | 36), objArr189);
                                                                                        obj62 = cls58.getMethod((String) objArr189[0], cls2, cls2, cls2);
                                                                                        map14.put(-1544987438, obj62);
                                                                                    }
                                                                                    ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj62).invoke(null, objArr188)).intValue();
                                                                                    Object[] objArr190 = {objArr6};
                                                                                    Object obj63 = map14.get(60598709);
                                                                                    if (obj63 == null) {
                                                                                        Class cls59 = (Class) removeParam.initialize(80 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), 3880 - ImageFormat.getBitsPerPixel(0));
                                                                                        Object[] objArr191 = new Object[1];
                                                                                        a((byte) ($$a[5] - 1), (byte) 26, r4[6], objArr191);
                                                                                        obj63 = cls59.getMethod((String) objArr191[0], Object[].class);
                                                                                        map14.put(60598709, obj63);
                                                                                    }
                                                                                    ((Method) obj63).invoke(obj, objArr190);
                                                                                } else {
                                                                                    Object[] objArr192 = {Integer.valueOf(i), obj, Integer.valueOf(i3), Integer.valueOf(i2)};
                                                                                    Object obj64 = map14.get(-679937179);
                                                                                    if (obj64 == null) {
                                                                                        obj64 = ((Class) removeParam.initialize((ViewConfiguration.getWindowTouchSlop() >> 8) + 77, (char) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3804)).getDeclaredConstructor(cls2, (Class) removeParam.initialize(80 - (ViewConfiguration.getEdgeSlop() >> 16), (char) View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0', 0) + 3882), cls2, cls2);
                                                                                        map14.put(-679937179, obj64);
                                                                                    }
                                                                                    Object newInstance = ((Constructor) obj64).newInstance(objArr192);
                                                                                    try {
                                                                                        Object[] objArr193 = new Object[1];
                                                                                        b(16 - ExpandableListView.getPackedPositionGroup(j), Color.green(0) + 356, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 64779), objArr193);
                                                                                        Class<?> cls60 = Class.forName(((String) objArr193[0]).intern());
                                                                                        Object[] objArr194 = new Object[1];
                                                                                        b(5 - TextUtils.indexOf("", "", 0), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 372, (char) (1 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr194);
                                                                                        cls60.getMethod(((String) objArr194[0]).intern(), null).invoke(newInstance, null);
                                                                                        objArr6 = new Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                                                                        Object[] objArr195 = {Integer.valueOf(i3), 0, Integer.valueOf((((~(i | 47576045)) | 738197504 | (~(i5 | (-33858217)))) * 988) + (((~(i5 | 785773549)) | (~((-33858217) | i))) * 988) + 1372653439)};
                                                                                        Object obj65 = map14.get(-1544987438);
                                                                                        if (obj65 == null) {
                                                                                            Class cls61 = (Class) removeParam.initialize(86 - View.combineMeasuredStates(0, 0), (char) (TextUtils.indexOf("", "", 0, 0) + 28641), View.resolveSizeAndState(0, 0, 0) + 3317);
                                                                                            byte[] bArr45 = $$a;
                                                                                            byte b79 = bArr45[19];
                                                                                            byte b80 = (byte) (-bArr45[c]);
                                                                                            Object[] objArr196 = new Object[1];
                                                                                            a(b79, b80, (byte) (b80 | 36), objArr196);
                                                                                            obj65 = cls61.getMethod((String) objArr196[0], cls2, cls2, cls2);
                                                                                            map14.put(-1544987438, obj65);
                                                                                        }
                                                                                        ((int[]) objArr6[3])[0] = ((Integer) ((Method) obj65).invoke(null, objArr195)).intValue();
                                                                                    } catch (Throwable th6) {
                                                                                        Throwable cause2 = th6.getCause();
                                                                                        if (cause2 != null) {
                                                                                            throw cause2;
                                                                                        }
                                                                                        throw th6;
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
                                i12 = 0;
                                if (i12 == 0) {
                                }
                                return objArr6;
                            }
                        } catch (Throwable th7) {
                            Throwable cause3 = th7.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th7;
                        }
                    }
                    Object[] objArr197 = {((String) objArr12[0]).intern()};
                    Object obj66 = map2.get(-690415720);
                    if (obj66 == null) {
                        Class cls62 = (Class) removeParam.initialize(47 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), 2248 - ExpandableListView.getPackedPositionGroup(j));
                        byte b81 = (byte) (-$$a[24]);
                        Object[] objArr198 = new Object[1];
                        a(b81, (byte) (b81 + 2), r7[19], objArr198);
                        obj66 = cls62.getMethod((String) objArr198[0], String.class);
                        map2.put(-690415720, obj66);
                    }
                    Object invoke7 = ((Method) obj66).invoke(null, objArr197);
                    if (invoke7 != null) {
                        Object[] objArr199 = new Object[1];
                        c("뻂猪㘔珱꽍\ueb27⒉", (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 17508, objArr199);
                        if (invoke7.equals(((String) objArr199[0]).intern())) {
                            Object[] objArr200 = new Object[1];
                            b(Color.green(0) + 23, (ViewConfiguration.getScrollDefaultDelay() >> 16) + EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, (char) View.combineMeasuredStates(0, 0), objArr200);
                            try {
                                Object[] objArr201 = {((String) objArr200[0]).intern()};
                                Object obj67 = map2.get(-690415720);
                                if (obj67 == null) {
                                    Class cls63 = (Class) removeParam.initialize(47 - TextUtils.getTrimmedLength(""), (char) Color.argb(0, 0, 0, 0), 2248 - TextUtils.getCapsMode("", 0, 0));
                                    byte b82 = (byte) (-$$a[24]);
                                    Object[] objArr202 = new Object[1];
                                    a(b82, (byte) (b82 + 2), r7[19], objArr202);
                                    obj67 = cls63.getMethod((String) objArr202[0], String.class);
                                    map2.put(-690415720, obj67);
                                }
                                String str12 = (String) ((Method) obj67).invoke(null, objArr201);
                                if (str12 != null && (parseInt = Integer.parseInt(str12)) != 0) {
                                    i12 = parseInt + EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                    if (i12 == 0) {
                                    }
                                    return objArr6;
                                }
                            } catch (Throwable th8) {
                                Throwable cause4 = th8.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th8;
                            }
                        }
                    }
                    i12 = 0;
                    if (i12 == 0) {
                    }
                    return objArr6;
                } catch (Throwable th9) {
                    Throwable cause5 = th9.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th9;
                }
                objArr12 = new Object[1];
                b((KeyEvent.getMaxKeyCode() >> 16) + 18, 252 - (Process.myTid() >> 22), (char) (58192 - (Process.myTid() >> 22)), objArr12);
            } else {
                i6 = 42;
                i7 = -146694085;
            }
            i8 = 0;
            Object[] objArr362 = new Object[1];
            b(View.MeasureSpec.makeMeasureSpec(i8, i8) + 8, 40 - (Process.myTid() >> 22), (char) (10436 - View.getDefaultSize(i8, i8)), objArr362);
            String intern210 = ((String) objArr362[i8]).intern();
            Object[] objArr372 = new Object[1];
            c("뻑ꍅ藎\ue64c죂\u2d74", 7560 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), objArr372);
            String intern310 = ((String) objArr372[i8]).intern();
            Object[] objArr382 = new Object[1];
            b((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 6, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 48, (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), objArr382);
            String intern47 = ((String) objArr382[0]).intern();
            Object[] objArr392 = new Object[1];
            b(TextUtils.indexOf("", "", 0) + 9, View.MeasureSpec.getMode(0) + 55, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 23491), objArr392);
            String intern52 = ((String) objArr392[0]).intern();
            Object[] objArr402 = new Object[1];
            c("뻙蔵줞൰兘閼", 15329 - (Process.myPid() >> 22), objArr402);
            String intern62 = ((String) objArr402[0]).intern();
            Object[] objArr412 = new Object[1];
            c("뻙免懿災Ñጋ⎧㏗쉝틼\ue520\uf593萷", Color.blue(0) + 61331, objArr412);
            String intern72 = ((String) objArr412[0]).intern();
            Object[] objArr422 = new Object[1];
            b(5 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64, (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr422);
            String intern82 = ((String) objArr422[0]).intern();
            Object[] objArr432 = new Object[1];
            c("뻙钏\uea4b쀯\u17ea洈", 10831 - (ViewConfiguration.getTouchSlop() >> 8), objArr432);
            String intern92 = ((String) objArr432[0]).intern();
            Object[] objArr442 = new Object[1];
            b(1 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 70 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (char) View.resolveSize(0, 0), objArr442);
            String intern102 = ((String) objArr442[0]).intern();
            Object[] objArr452 = new Object[1];
            c("뻜\ue0d8˙ꓕ웉棡諩⳨任\uf0fbዘ뒎횐碊骠㲭", 24071 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr452);
            String intern112 = ((String) objArr452[0]).intern();
            Object[] objArr462 = new Object[1];
            c("뻜躊\ude7d⸻羅佾鼪\ueccd㱪మ", (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12372, objArr462);
            String intern122 = ((String) objArr462[0]).intern();
            Object[] objArr472 = new Object[1];
            b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 71, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr472);
            String intern132 = ((String) objArr472[0]).intern();
            Object[] objArr482 = new Object[1];
            b(((Process.getThreadPriority(0) + 20) >> 6) + 12, 79 - (Process.myPid() >> 22), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr482);
            String intern142 = ((String) objArr482[0]).intern();
            Object[] objArr492 = new Object[1];
            c("뻀곡骙袿\uf65f\ue470툎쀩⿍ᷨச祒杠唛", 4642 - TextUtils.lastIndexOf("", '0'), objArr492);
            String intern152 = ((String) objArr492[0]).intern();
            Object[] objArr502 = new Object[1];
            b(7 - View.MeasureSpec.makeMeasureSpec(0, 0), 91 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr502);
            String intern162 = ((String) objArr502[0]).intern();
            Object[] objArr512 = new Object[1];
            b('7' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 98, (char) (ExpandableListView.getPackedPositionChild(j) + 62500), objArr512);
            String intern172 = ((String) objArr512[0]).intern();
            Object[] objArr522 = new Object[1];
            b(Color.rgb(0, 0, 0) + 16777223, 104 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (54808 - TextUtils.lastIndexOf("", '0')), objArr522);
            String intern182 = ((String) objArr522[0]).intern();
            Object[] objArr532 = new Object[1];
            b(View.combineMeasuredStates(0, 0) + 2, View.MeasureSpec.getMode(0) + 112, (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr532);
            String intern192 = ((String) objArr532[0]).intern();
            Object[] objArr542 = new Object[1];
            c("뻃㿙볫㶕몰㭾롩㤒똬㓝뗍㋣뎃オ녍\u2e62꼇ⰸ\uaad4⯣", 33053 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr542);
            String intern202 = ((String) objArr542[0]).intern();
            Object[] objArr552 = new Object[1];
            c("뻃䘽估吺崷戈", 63738 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr552);
            String intern212 = ((String) objArr552[0]).intern();
            Object[] objArr562 = new Object[1];
            c("뻃ﰎ", 17099 - (ViewConfiguration.getEdgeSlop() >> 16), objArr562);
            String intern222 = ((String) objArr562[0]).intern();
            Object[] objArr572 = new Object[1];
            b(16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 114, (char) (55159 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr572);
            String intern232 = ((String) objArr572[0]).intern();
            Object[] objArr582 = new Object[1];
            c("뻄懑÷⏪슙\ue59f蒣ꝁ䙀", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 57107, objArr582);
            String intern242 = ((String) objArr582[0]).intern();
            Object[] objArr592 = new Object[1];
            c("뻄䫋囃拈滱竭ۧዻẐ⫗", 62473 - View.getDefaultSize(0, 0), objArr592);
            String intern252 = ((String) objArr592[0]).intern();
            Object[] objArr602 = new Object[1];
            c("뻄贳\ud933─焑뵷襹핒⅌涬맬", 13297 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr602);
            String intern262 = ((String) objArr602[0]).intern();
            Object[] objArr612 = new Object[1];
            b(';' - AndroidCharacter.getMirror('0'), 130 - (ViewConfiguration.getTouchSlop() >> 8), (char) (52579 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr612);
            String intern272 = ((String) objArr612[0]).intern();
            Object[] objArr622 = new Object[1];
            c("뻅\ue2dbۍ\uaad6컊狍雱㫡廽苺⛝䫮\ueee2ኗ뚙", View.resolveSizeAndState(0, 0, 0) + 23557, objArr622);
            String intern282 = ((String) objArr622[0]).intern();
            Object[] objArr632 = new Object[1];
            b(13 - TextUtils.indexOf((CharSequence) "", '0'), 140 - TextUtils.lastIndexOf("", '0', 0, 0), (char) Color.blue(0), objArr632);
            String[] strArr42 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((String) objArr632[0]).intern()};
            Object[] objArr642 = new Object[1];
            b(11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0), (char) TextUtils.getOffsetBefore("", 0), objArr642);
            Object[] objArr652 = {((String) objArr642[0]).intern()};
            Map map52 = removeParam.visaSchemeConfiguration;
            obj2 = map52.get(-690415720);
            if (obj2 == null) {
            }
            invoke = ((Method) obj2).invoke(null, objArr652);
            if (invoke == null) {
            }
            Object[] objArr812 = new Object[1];
            c("뺟卸斿矲ࡳᩱⲡ㺂팛\ue546\uf792觐騚겺뻲卪敥瞵ৰᨾⱞ㺄탇", 60859 - View.combineMeasuredStates(0, 0), objArr812);
            Object[] objArr822 = {((String) objArr812[0]).intern()};
            map = removeParam.visaSchemeConfiguration;
            obj3 = map.get(1303953416);
            if (obj3 != null) {
            }
            long longValue92 = ((Long) ((Method) obj3).invoke(null, objArr822)).longValue();
            long j212 = ((-667) * longValue92) + 994586021760L;
            long j222 = longValue92 ^ (-1);
            long j232 = (-745008256) | j2;
            long m92 = SVG$Unit$EnumUnboxingLocalUtility.m(668L, j232 | j222, (1336 * ((-745008256) | ((j222 | j2) ^ (-1)))) + ((-668) * (j222 | (j232 ^ (-1)))) + j212, -197879614L);
            long j242 = (((int) (m92 >> 32)) & ((((~(i5 | (-1078010945))) | 286294292) * 521) + (((~((-1078010945) | i)) * 521) - 696197706))) | (((int) m92) & ((((~(i5 | (-1088667472))) | 1075915013) * 560) + ((~((-335806481) | i)) * (-560)) + ((~(i5 | (-348558939))) * (-560)) + 713822821));
            Object[] objArr842 = new Object[1];
            b(KeyEvent.getDeadChar(0, 0) + 17, (KeyEvent.getMaxKeyCode() >> 16) + 167, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1), objArr842);
            Object[] objArr852 = {((String) objArr842[0]).intern()};
            obj4 = map.get(1303953416);
            if (obj4 == null) {
            }
            long longValue102 = ((Long) ((Method) obj4).invoke(null, objArr852)).longValue();
            long j252 = longValue102 ^ (-1);
            long j262 = 112561220 | j252;
            long m102 = SVG$Unit$EnumUnboxingLocalUtility.m(920L, (((112561220 | longValue102) | j2) ^ (-1)) | ((j262 | j9) ^ (-1)) | (((j252 | (-112561221)) | j2) ^ (-1)), (((j262 ^ (-1)) | ((112561220 | j9) ^ (-1))) * 920) + ((((j262 | j2) ^ (-1)) | (((j252 | j9) | (-112561221)) ^ (-1))) * 920) + ((-919) * longValue102) + 103443762099L, -830326649L);
            long j272 = (((int) (m102 >> 32)) & ((((~((-144756636) | i5)) | 134252043 | (~(1302974367 | i))) * 757) + ((~((-10504593) | i)) * 1514) + (((1292469775 | i5) * (-757)) - 1622287698))) | (((int) m102) & ((((~(478290883 | i)) | 268443969) * EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE) + ((~(2125364207 | i)) * (-604)) + (((~(i5 | 2125364207)) | (~((-1647073325) | i))) * (-302)) + 1482177159));
            if (j3 <= j) {
            }
            Object[] objArr902 = new Object[1];
            c("뺟卸斿矲ࡳᩱⲡ㺂팛\ue546\uf792觐騚겺뻲卪敥瞵ৰᨾⱞ㺄탇", ExpandableListView.getPackedPositionChild(j) + 60860, objArr902);
            Object[] objArr912 = {((String) objArr902[0]).intern()};
            obj5 = map.get(1303953416);
            if (obj5 != null) {
            }
            long longValue112 = ((Long) ((Method) obj5).invoke(null, objArr912)).longValue();
            long j282 = longValue112 ^ (-1);
            long m112 = SVG$Unit$EnumUnboxingLocalUtility.m(318L, (((j282 | j9) | 148523138) ^ (-1)) | (((148523138 | longValue112) | j2) ^ (-1)), ((((j282 | j2) ^ (-1)) | (((j9 | 148523138) | longValue112) ^ (-1))) * 318) + ((-318) * (j282 | (((-148523139) | j2) ^ (-1)))) + ((-317) * longValue112) + 47378881022L, -1091411008L);
            long j292 = (((int) (m112 >> 32)) & ((((~(1845620579 | i5)) | 273813648) * 52) + (((~(i5 | (-1845620580))) | (~(1012120305 | i5)) | 1107313922) * (-52)) + ((~(i5 | (-738306658))) * 52) + 1829567698)) | (((int) m112) & ((((~((-1476944707) | i)) | (~(i5 | 1380796179))) * 959) + (((~((-1476944707) | i5)) | (~(1380796179 | i))) * 959) + 845617667));
            Object[] objArr932 = new Object[1];
            c("뺟罕㷗海", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49537, objArr932);
            Object[] objArr942 = {((String) objArr932[0]).intern()};
            obj6 = map.get(1303953416);
            if (obj6 == null) {
            }
            long longValue122 = ((Long) ((Method) obj6).invoke(null, objArr942)).longValue();
            long j302 = longValue122 ^ (-1);
            long j312 = j9 | (-116777392);
            long m122 = SVG$Unit$EnumUnboxingLocalUtility.m(904L, ((longValue122 | 116777391) ^ (-1)) | ((j302 | j2) ^ (-1)) | (j312 ^ (-1)), (((((116777391 | j302) | j2) ^ (-1)) | ((j312 | longValue122) ^ (-1))) * 904) + ((-1808) * (((116777391 | j2) ^ (-1)) | ((j9 | longValue122) ^ (-1)))) + (((-903) * longValue122) - 105683539760L), -826110478L);
            long j322 = (((int) (m122 >> 32)) & ((((~((-1811062237) | i5)) | 37750800 | (~(2147147261 | i))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + ((~((-1773311437) | i)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(373835825 | i5)) | 1773311436) * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106)) | (((int) m122) & ((((-1532222468) | (~((-94996058) | i5))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) + (((~(i5 | (-1532222468))) | 1515345922) * (-160)) + 842411541));
            if (j4 <= j) {
            }
            Object[] objArr992 = new Object[1];
            c("뺟漠ᴏ쭪賂Ꞻ喏", 53731 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr992);
            String intern302 = ((String) objArr992[0]).intern();
            Object[] objArr1002 = new Object[1];
            c("뺟ۢ캋隠幀♰\uee1b뙸翚쟰辔", View.getDefaultSize(0, 0) + 47137, objArr1002);
            String intern312 = ((String) objArr1002[0]).intern();
            Object[] objArr1012 = new Object[1];
            b(11 - TextUtils.lastIndexOf("", '0'), TextUtils.lastIndexOf("", '0', 0) + 185, (char) (Process.myTid() >> 22), objArr1012);
            String intern322 = ((String) objArr1012[0]).intern();
            Object[] objArr1022 = new Object[1];
            b(12 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getTrimmedLength("") + EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) (12258 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr1022);
            String intern332 = ((String) objArr1022[0]).intern();
            Object[] objArr1032 = new Object[1];
            b(11 - (ViewConfiguration.getEdgeSlop() >> 16), 208 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25326), objArr1032);
            String intern342 = ((String) objArr1032[0]).intern();
            Object[] objArr1042 = new Object[1];
            b(5 - (ViewConfiguration.getFadingEdgeLength() >> 16), 219 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) Color.argb(0, 0, 0, 0), objArr1042);
            String intern352 = ((String) objArr1042[0]).intern();
            Object[] objArr1052 = new Object[1];
            b((ViewConfiguration.getTouchSlop() >> 8) + 4, 223 - TextUtils.lastIndexOf("", '0'), (char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr1052);
            String[] strArr52 = {intern302, intern312, intern322, intern332, intern342, intern352, ((String) objArr1052[0]).intern()};
            if ((i2 & 2048) == 0) {
            }
            i11 = 0;
            if (i11 == 0) {
            }
            i15 = 0;
            if (i15 == 0) {
            }
            return objArr6;
        } catch (Throwable th10) {
            Throwable cause6 = th10.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        byte b4;
        byte[] bArr = $$a;
        ?? r7 = 121 - b3;
        int i2 = b2 + 4;
        byte[] bArr2 = new byte[23 - b];
        ?? r5 = 22 - b;
        if (bArr == null) {
            byte b5 = r7;
            i = 0;
            byte b6 = r5;
            b4 = b6 + b5 + 2;
            bArr2[i] = b4 == true ? (byte) 1 : (byte) 0;
            i2++;
            if (i == r5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            b5 = bArr[i2];
            b6 = b4;
            b4 = b6 + b5 + 2;
            bArr2[i] = b4 == true ? (byte) 1 : (byte) 0;
            i2++;
            if (i == r5) {
            }
        } else {
            i = 0;
            b4 = r7;
            bArr2[i] = b4 == true ? (byte) 1 : (byte) 0;
            i2++;
            if (i == r5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i];
        int i3 = 0;
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i4 = threeDS2ServiceInitializationCallback.initialize;
            if (i4 >= i) {
                break;
            }
            int i5 = $11 + 117;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i6 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(initialize[i2 << i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-54653524);
                    if (obj != null) {
                        jArr = jArr2;
                    } else {
                        jArr = jArr2;
                        Class cls3 = (Class) removeParam.initialize(48 - View.MeasureSpec.getMode(i3), (char) (Process.myTid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3221);
                        Object[] objArr3 = new Object[1];
                        d(0, (short) 0, (byte) 0, objArr3);
                        Method method = cls3.getMethod((String) objArr3[0], cls2);
                        map.put(-54653524, method);
                        obj = method;
                    }
                    Long l = (Long) ((Method) obj).invoke(null, objArr2);
                    l.longValue();
                    Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ThreeDS2ServiceInstance), Integer.valueOf(c)};
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(View.MeasureSpec.getSize(0) + 69, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 50705), 7789 - KeyEvent.keyCodeFromString(""))).getMethod("b", cls, cls, cls, cls2);
                        map.put(1319531906, obj2);
                    }
                    jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize(48 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 27780), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2440);
                        Object[] objArr6 = new Object[1];
                        d(0, (short) 3, (byte) 0, objArr6);
                        obj3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1724349229, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                jArr = jArr2;
                Object[] objArr7 = {Integer.valueOf(initialize[i2 + i4])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(-54653524);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 49, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 3221 - Gravity.getAbsoluteGravity(0, 0));
                    Object[] objArr8 = new Object[1];
                    d(0, (short) 0, (byte) 0, objArr8);
                    obj4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(-54653524, obj4);
                }
                Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                l2.longValue();
                Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(ThreeDS2ServiceInstance), Integer.valueOf(c)};
                Object obj5 = map2.get(1319531906);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(69 - View.MeasureSpec.getSize(0), (char) (Color.argb(0, 0, 0, 0) + 50704), 7789 - Drawable.resolveOpacity(0, 0))).getMethod("b", cls, cls, cls, cls2);
                    map2.put(1319531906, obj5);
                }
                jArr[i4] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj6 = map2.get(1724349229);
                if (obj6 == null) {
                    Class cls6 = (Class) removeParam.initialize(48 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (View.MeasureSpec.getMode(0) + 27780), (ViewConfiguration.getTouchSlop() >> 8) + 2441);
                    Object[] objArr11 = new Object[1];
                    d(0, (short) 3, (byte) 0, objArr11);
                    obj6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1724349229, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
            }
            $11 = ($10 + 85) % 128;
            jArr2 = jArr;
            i3 = 0;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr3 = jArr2;
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i7 = threeDS2ServiceInitializationCallback.initialize;
            if (i7 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i7] = (char) jArr3[i7];
            Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj7 = map3.get(1724349229);
            if (obj7 == null) {
                Class cls7 = (Class) removeParam.initialize(48 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 27781), 2441 - TextUtils.getOffsetAfter("", 0));
                Object[] objArr13 = new Object[1];
                d(0, (short) 3, (byte) 0, objArr13);
                obj7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1724349229, obj7);
            }
            ((Method) obj7).invoke(null, objArr12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(String str, int i, Object[] objArr) {
        Throwable cause;
        char c;
        byte b;
        $10 = ($11 + 71) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        byte b2 = 0;
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i2 = addparam.ThreeDS2Service;
            if (i2 >= charArray.length) {
                break;
            }
            char c2 = charArray[i2];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = addparam;
                objArr2[1] = addparam;
                objArr2[b2] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    b = b2;
                    c = 1;
                } else {
                    c = 1;
                    b = b2;
                    Method method = ((Class) removeParam.initialize((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 66, (char) ((Process.getThreadPriority(b2) + 20) >> 6), (ViewConfiguration.getPressedStateDuration() >> 16) + 12511)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, method);
                    obj = method;
                }
                jArr[i2] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (getWarnings ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[c] = addparam;
                objArr3[b] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    byte b3 = b;
                    Class cls = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', b3) + 77, (char) (MotionEvent.axisFromString("") + 62098), 2102 - View.MeasureSpec.getMode(b3));
                    int i3 = c;
                    Object[] objArr4 = new Object[i3];
                    d(b3, i3, b3, objArr4);
                    obj2 = cls.getMethod((String) objArr4[b3], Object.class, Object.class);
                    map.put(-1840119381, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                b2 = 0;
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
        char[] cArr = new char[length];
        addparam.ThreeDS2Service = 0;
        int i4 = $10 + 121;
        while (true) {
            $11 = i4 % 128;
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            $10 = ($11 + 87) % 128;
            cArr[i5] = (char) jArr[i5];
            Object[] objArr5 = {addparam, addparam};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1840119381);
            if (obj3 == null) {
                Class cls2 = (Class) removeParam.initialize(76 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 62096), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2102);
                Object[] objArr6 = new Object[1];
                d(0, (short) 1, (byte) 0, objArr6);
                obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(-1840119381, obj3);
            }
            ((Method) obj3).invoke(null, objArr5);
            i4 = $10 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, byte b, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 4 - (i * 4);
        int i5 = 1 - (b * 3);
        int i6 = 100 - s;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i2 = i4;
            int i7 = i5;
            i3 = 0;
            i4 += i7;
            i2++;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i2];
            i4 += i7;
            i2++;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
            }
        } else {
            i2 = i4;
            i4 = i6;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{106, -113, 65, 83, -4, 13, 18, 8, -15, -2, -35, 13, -35, 31, 16, 11, 2, -15, -8, 0, -30, 35, 3, -1, -21, 11, -13, 0, -35, -7, 13, -4, 13, -31, 8, 15, -6, -7, 3, -9, 10};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE;
    }

    public static void init$1() {
        $$d = new byte[]{PnmConstants.PAM_RAW_CODE, -74, 61, -103};
        $$e = 74;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.nw.getWarnings
    public void get(String str) {
        int i = ThreeDS2Service + 31;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
