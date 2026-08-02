package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setMenuCallbacks {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static char ThreeDS2ServiceInstance;
    private static char get;
    private static int getSDKVersion;
    private static long getWarnings;
    private static char initialize;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getSDKVersion = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        ThreeDS2ServiceInstance = (char) 54539;
        get = (char) 40774;
        ThreeDS2Service = (char) 60553;
        initialize = (char) 42115;
        getWarnings = -1812145187455007637L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0459, code lost:
    
        ((int[]) r3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r7)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0463, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0414, code lost:
    
        r1 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(android.view.View.getDefaultSize(0, 0) + 86, (char) (28640 - android.text.TextUtils.indexOf("", r42, 0, 0)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 3317);
        r5 = (byte) (-r10[21]);
        r6 = r10[17];
        r2 = new java.lang.Object[1];
        c(r5, r6, r6, r2);
        r1 = r1.getMethod((java.lang.String) r2[0], r9, r9, r9);
        r0.put(-1544987438, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e6, code lost:
    
        r11 = r24;
        r7 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(70 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.Gravity.getAbsoluteGravity(r11, r11) + 2178);
        r12 = new java.lang.Object[1];
        c(com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.$$a[22], (byte) (com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.$$b + 5), (byte) 19, r12);
        r7 = r7.getMethod((java.lang.String) r12[0], null);
        r0.put(-618166559, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c6, code lost:
    
        r24 = 0;
        r5 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 86, (char) (28642 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), 3316 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
        r12 = com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.$$a;
        r13 = (byte) (-r12[21]);
        r12 = r12[17];
        r25 = 3;
        r10 = new java.lang.Object[1];
        c(r13, r12, r12, r10);
        r12 = r5.getMethod((java.lang.String) r10[0], r9, r9, r9);
        r7.put(-1544987438, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021a, code lost:
    
        r24 = 0;
        r42 = '0';
        r11 = new java.lang.Object[]{new int[]{r43}, new int[]{r43}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025f, code lost:
    
        r7 = new java.lang.Object[]{java.lang.Integer.valueOf(r44), 0, java.lang.Integer.valueOf((((~((-397167231) | r43)) | (-116201649)) * com.plaid.internal.EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE) + ((((~((-116201649) | r43)) | (~((~r43) | 397167230))) * (-301)) + (((~(401431294 | r43)) * (-301)) + 1842074616)))};
        r0 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r5 = r0.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0275, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02bd, code lost:
    
        ((int[]) r11[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r5).invoke(null, r7)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0278, code lost:
    
        r5 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(134 - android.text.AndroidCharacter.getMirror('0'), (char) (android.view.MotionEvent.axisFromString("") + 28642), 3317 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
        r10 = com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.$$a;
        r12 = (byte) (-r10[21]);
        r10 = r10[17];
        r14 = new java.lang.Object[1];
        c(r12, r10, r10, r14);
        r5 = r5.getMethod((java.lang.String) r14[0], r9, r9, r9);
        r0.put(-1544987438, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x07a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x07a3, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x07a7, code lost:
    
        if (r1 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x07a9, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x07aa, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0035, code lost:
    
        if (r42 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cf, code lost:
    
        ((int[]) r0[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r6).invoke(null, r1)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        r6 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.view.ViewConfiguration.getScrollFriction() > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.view.ViewConfiguration.getScrollFriction() == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)) + 85, (char) (android.view.View.combineMeasuredStates(0, 0) + 28641), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3317);
        r7 = com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.$$a;
        r8 = (byte) (-r7[21]);
        r7 = r7[17];
        r2 = new java.lang.Object[1];
        c(r8, r7, r7, r2);
        r6 = r6.getMethod((java.lang.String) r2[0], r9, r9, r9);
        r3.put(-1544987438, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d6, code lost:
    
        r11 = new java.lang.Object[1];
        a("緿넁뙧菗굡鵾〭튵\udc08泅\u202cईƝ棂纹忹ꊖ㪬\u202cई틾負沿坻", 22 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), r11);
        r7 = java.lang.Class.forName(((java.lang.String) r11[0]).intern());
        r12 = new java.lang.Object[1];
        b("葘띯\ue221ᷡ䢛葆띭\ue225ᷴ䢃葙뜑\ue22cᷠ䢐葊뜉\ue2d5", 13109 - android.widget.ExpandableListView.getPackedPositionGroup(0), r12);
        r0 = r7.getMethod(((java.lang.String) r12[0]).intern(), null).invoke(r42, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0117, code lost:
    
        r11 = new java.lang.Object[1];
        a("緿넁뙧菗굡鵾〭튵\udc08泅\u202cईƝ棂纹忹ꖁ㭛\u1ad4ٱ벋ᛩ蟓庉\uda89䖣研骩秧噣耸覆䪀鍮", android.text.AndroidCharacter.getMirror('0') - 14, r11);
        r8 = java.lang.Class.forName(((java.lang.String) r11[0]).intern());
        r11 = new java.lang.Object[1];
        b("葙䔖۔잗腘", 49477 - (android.util.TypedValue.complexToFraction(0, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.util.TypedValue.complexToFraction(0, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0159, code lost:
    
        if ((r8.getField(((java.lang.String) r11[0]).intern()).getInt(r0) & 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x015b, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.getSDKVersion = (com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.ThreeDS2ServiceInitializationCallback + 105) % 128;
        r42 = '0';
        r11 = new java.lang.Object[]{new int[]{r43}, new int[]{r43 ^ 1}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01a9, code lost:
    
        r0 = new java.lang.Object[]{java.lang.Integer.valueOf(r44), 16, java.lang.Integer.valueOf(((~((-386892072) | r43)) * 113) + ((((~((~r43) | (-268828961))) | (8413696 | (~((-126476808) | r43)))) * (-113)) + ((((~((-386892072) | r0)) | 126476807) * com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE) - 1662739488)))};
        r7 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r12 = r7.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01bf, code lost:
    
        if (r12 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c1, code lost:
    
        r24 = 0;
        r25 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0212, code lost:
    
        ((int[]) r11[r25])[r24] = ((java.lang.Integer) ((java.lang.reflect.Method) r12).invoke(null, r0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02cb, code lost:
    
        if (((int[]) r11[1])[r24] == r43) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02cd, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.getSDKVersion = (com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.ThreeDS2ServiceInitializationCallback + 49) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02d5, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02d6, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r7 = r0.get(-618166559);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02e3, code lost:
    
        if (r7 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0325, code lost:
    
        r5 = (java.util.Set) ((java.lang.reflect.Method) r7).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x032d, code lost:
    
        r7 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(android.graphics.Color.red(0) + 70, (char) (android.util.TypedValue.complexToFloat(0) > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.util.TypedValue.complexToFloat(0) == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)), 2178 - (android.util.TypedValue.complexToFloat(0) > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.util.TypedValue.complexToFloat(0) == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)));
        r10 = com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.$$a;
        r12 = r10[28];
        r13 = (byte) (r12 & 116);
        r11 = new java.lang.Object[1];
        c(r12, r13, (byte) (r13 - 1), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0370, code lost:
    
        if (r5.contains(r7.getField((java.lang.String) r11[0]).get(null)) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0372, code lost:
    
        r7 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(70 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.media.AudioTrack.getMinVolume() > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.media.AudioTrack.getMinVolume() == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2178);
        r11 = (byte) (-r10[21]);
        r12 = r10[17];
        r14 = new java.lang.Object[1];
        c(r11, r12, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03ac, code lost:
    
        if (r5.contains(r7.getField((java.lang.String) r14[0]).get(null)) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0464, code lost:
    
        r5 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x046a, code lost:
    
        if (r5 <= 33) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x046c, code lost:
    
        r12 = new java.lang.Object[1];
        a("媦댡䐼痄㼌周ࢉƫꙣ奿鹣ꋞ\ueb28㲟褈Ꝺ㙳\udb49߳ᣃꄎ\ue585ྮ໊籎泿돷\ud947", 28 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), r12);
        r5 = ((java.lang.String) r12[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0487, code lost:
    
        r5 = new java.lang.Object[]{r5};
        r12 = r0.get(-108371147);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0496, code lost:
    
        if (r12 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04db, code lost:
    
        r10 = ((java.lang.Long) ((java.lang.reflect.Method) r12).invoke(null, r5)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04e7, code lost:
    
        r12 = ((-1917) * r10) - 381483495360L;
        r10 = r10 ^ (-1);
        r5 = 16;
        r2 = r43;
        r28 = r2 ^ (-1);
        r2 = com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility.m(959, ((r2 | r10) ^ (-1)) | ((r28 | (-397378641)) ^ (-1)), ((-959) * r10) + (((((r10 | r28) ^ (-1)) | (((-397378641) | r2) ^ (-1))) * 959) + r12), 896697860);
        r7 = ~((-1004130124) | r43);
        r10 = ~r43;
        r0 = ((int) (r2 >> 32)) & ((((~((-433096288) | r43)) | (~(1004130123 | r10))) * 406) + (((~((-571033857) | r10)) * (-406)) + (((r7 | (~(1004130143 | r10))) * (-406)) + 1348729842)));
        r3 = (((~((-1113075799) | r10)) | (~(1115255294 | r43))) * 520) - 1179466355;
        r7 = ~((-1115255295) | r10);
        r11 = ~(1742485591 | r43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0581, code lost:
    
        if ((r0 | (((int) r2) & (((((~((-1742485592) | r10)) | 2179496) | r11) * 520) + (((r7 | r11) * (-1040)) + r3)))) != 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0583, code lost:
    
        r0 = true;
        r5 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x062b, code lost:
    
        if (r0 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x062d, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.getSDKVersion = (com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.ThreeDS2ServiceInitializationCallback + 105) % 128;
        r2 = new java.lang.Object[]{new int[]{r43}, new int[]{r43 ^ 10}, null, new int[1]};
        r0 = ~r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0680, code lost:
    
        r3 = new java.lang.Object[]{java.lang.Integer.valueOf(r44), r5, java.lang.Integer.valueOf(androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1.m(((~((-122154393) | r0)) | 121726352) | (~((-391214487) | r0)), com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, (((~(r0 | (-269488135))) | (~((-428041) | r0))) * (-184)) + 542775838, -952219248))};
        r0 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r1 = r0.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0698, code lost:
    
        if (r1 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x06e3, code lost:
    
        ((int[]) r2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r3)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0798, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x069b, code lost:
    
        r1 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(android.text.TextUtils.getCapsMode("", 0, 0) + 86, (char) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 28640), 3316 - android.graphics.ImageFormat.getBitsPerPixel(0));
        r5 = com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.$$a;
        r6 = (byte) (-r5[21]);
        r5 = r5[17];
        r8 = new java.lang.Object[1];
        c(r6, r5, r5, r8);
        r1 = r1.getMethod((java.lang.String) r8[0], r9, r9, r9);
        r0.put(-1544987438, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        if (r42 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x06ef, code lost:
    
        r2 = new java.lang.Object[]{new int[]{r43}, new int[]{r43}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x072b, code lost:
    
        r1 = new java.lang.Object[]{java.lang.Integer.valueOf(r44), 0, java.lang.Integer.valueOf(androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1.m((~(r43 | (-131545731))) | 18158082, 490, (((-113387649) | (~r43)) * (-490)) - 1404747886, 1885218014))};
        r0 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r3 = r0.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0743, code lost:
    
        if (r3 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x078e, code lost:
    
        ((int[]) r2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r3).invoke(null, r1)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0746, code lost:
    
        r3 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(86 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 28642), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 3318);
        r5 = com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks.$$a;
        r6 = (byte) (-r5[21]);
        r5 = r5[17];
        r8 = new java.lang.Object[1];
        c(r6, r5, r5, r8);
        r3 = r3.getMethod((java.lang.String) r8[0], r9, r9, r9);
        r0.put(-1544987438, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0586, code lost:
    
        r0 = false;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0499, code lost:
    
        r12 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(48 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.graphics.Color.blue(0) + 2754);
        r10 = r10[28];
        r13 = (byte) (r10 & 116);
        r11 = new java.lang.Object[1];
        c(r10, r13, (byte) (r13 - 1), r11);
        r12 = r12.getMethod((java.lang.String) r11[0], java.lang.String.class);
        r0.put(-108371147, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        r0 = new java.lang.Object[]{new int[]{r43}, new int[]{r43}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0589, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x058b, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x058f, code lost:
    
        if (r2 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0591, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0592, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0595, code lost:
    
        r5 = 16;
        r12 = new java.lang.Object[1];
        a("캶鲗菵뷠㙳\udb49߳ᣃꄎ\ue585ྮ໊㰘ꂠ", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x05b0, code lost:
    
        r2 = new java.lang.Object[]{((java.lang.String) r12[0]).intern()};
        r12 = r0.get(-690415720);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006f, code lost:
    
        r1 = new java.lang.Object[]{java.lang.Integer.valueOf(r44), 0, java.lang.Integer.valueOf((((~((~r43) | (-52213389))) | 18092168) * 560) + (((~(r43 | 599703487)) * (-560)) + (((~(565582267 | r3)) * (-560)) - 1854814802)))};
        r3 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r6 = r3.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x05bf, code lost:
    
        if (r12 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0600, code lost:
    
        r0 = ((java.lang.reflect.Method) r12).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0606, code lost:
    
        r7 = new java.lang.Object[1];
        b("萎", 9967 - android.text.TextUtils.getOffsetBefore("", 0), r7);
        r0 = r0.equals(((java.lang.String) r7[0]).intern());
        r5 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x05c2, code lost:
    
        r3 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(48 - (android.view.ViewConfiguration.getScrollFriction() > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.view.ViewConfiguration.getScrollFriction() == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) android.view.View.resolveSize(0, 0), android.text.TextUtils.getTrimmedLength("") + 2248);
        r12 = new java.lang.Object[1];
        c((byte) 33, r10[22], (byte) 37, r12);
        r12 = r3.getMethod((java.lang.String) r12[0], java.lang.String.class);
        r0.put(-690415720, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0622, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0623, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0627, code lost:
    
        if (r2 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0629, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0085, code lost:
    
        if (r6 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x062a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0593, code lost:
    
        r5 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03b2, code lost:
    
        if (android.os.Build.VERSION.SDK_INT != 30) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03b4, code lost:
    
        r3 = new java.lang.Object[]{new int[]{r43}, new int[]{r43}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03fc, code lost:
    
        r7 = new java.lang.Object[]{java.lang.Integer.valueOf(r44), 0, java.lang.Integer.valueOf((((~(r43 | (-654705040))) | 141336160) * com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE) + ((((~(654705039 | r43)) | (-795779056)) * (-318)) + ((((~((-654442896) | r43)) | (~((~r43) | (-141074017)))) * (-318)) + 775337742)))};
        r1 = r0.get(-1544987438);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0411, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v66, types: [int] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v72, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v74, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] ThreeDS2ServiceInstance(Context context, int i, int i2) {
        int i3 = ThreeDS2ServiceInitializationCallback + 29;
        getSDKVersion = i3 % 128;
        int i4 = i3 % 2;
        Class cls = Integer.TYPE;
        try {
            if (i4 != 0) {
                int i5 = 9 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = $10 + 79;
        $11 = i2 % 128;
        int i3 = 2;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr = new char[charArray.length];
        int i4 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i5 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i5 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i);
                return;
            }
            cArr2[i4] = charArray[i5];
            char c = 1;
            cArr2[1] = charArray[i5 + 1];
            $11 = ($10 + 57) % 128;
            int i6 = 58224;
            int i7 = i4;
            while (i7 < 16) {
                char c2 = cArr2[c];
                char c3 = cArr2[i4];
                char c4 = c;
                int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (ThreeDS2Service ^ (-1730380012335540218L))));
                int i9 = c3 >>> 5;
                int i10 = i3;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(initialize);
                    objArr2[i10] = Integer.valueOf(i9);
                    objArr2[c4] = Integer.valueOf(i8);
                    objArr2[i4] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    int i11 = i4;
                    if (obj == null) {
                        obj = ((Class) removeParam.initialize((TypedValue.complexToFloat(i11) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(i11) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 67, (char) (62396 - (ViewConfiguration.getPressedStateDuration() >> 16)), 5352 - KeyEvent.normalizeMetaState(i11))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[c4] = charValue;
                    char c5 = cArr2[i11];
                    char[] cArr3 = charArray;
                    int i12 = (charValue + i6) ^ ((charValue << 4) + ((char) (ThreeDS2ServiceInstance ^ (-1730380012335540218L))));
                    int i13 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(get);
                    objArr3[i10] = Integer.valueOf(i13);
                    objArr3[c4] = Integer.valueOf(i12);
                    objArr3[i11] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(67 - Color.argb(i11, i11, i11, i11), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 62396), 5352 - KeyEvent.getDeadChar(i11, i11))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr2[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c = c4;
                    i3 = i10;
                    charArray = cArr3;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = charArray;
            int i14 = i3;
            char c6 = c;
            int i15 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr[i15] = cArr2[0];
            cArr[i15 + 1] = cArr2[c6];
            Object[] objArr4 = new Object[i14];
            objArr4[c6] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(54 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Color.rgb(0, 0, 0) + 16817126), 7059 - Color.alpha(0))).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            i3 = i14;
            charArray = cArr4;
            i4 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(String str, int i, Object[] objArr) {
        Throwable cause;
        byte b;
        int i2;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        byte b2 = 0;
        addparam.ThreeDS2Service = 0;
        $10 = ($11 + 105) % 128;
        while (true) {
            int i3 = addparam.ThreeDS2Service;
            if (i3 >= charArray.length) {
                break;
            }
            $11 = ($10 + 41) % 128;
            char c = charArray[i3];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = addparam;
                objArr2[1] = addparam;
                objArr2[b2] = Integer.valueOf(c);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    b = b2;
                    i2 = 1;
                    method = obj;
                } else {
                    b = b2;
                    i2 = 1;
                    method = ((Class) removeParam.initialize(66 - (ViewConfiguration.getTapTimeout() >> 16), (char) Color.blue((int) b), 12511 - Color.alpha((int) b))).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, method);
                }
                jArr[i3] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getWarnings ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[i2] = addparam;
                objArr3[b] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    Class cls = (Class) removeParam.initialize(Color.alpha((int) b) + 76, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62096), KeyEvent.keyCodeFromString("") + 2102);
                    Object[] objArr4 = new Object[i2];
                    byte b3 = b;
                    d((byte) -1, b3, b3, objArr4);
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
        while (true) {
            int i4 = addparam.ThreeDS2Service;
            if (i4 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            $11 = ($10 + 91) % 128;
            cArr[i4] = (char) jArr[i4];
            Object[] objArr5 = {addparam, addparam};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1840119381);
            if (obj3 == null) {
                Class cls2 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 77, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62096), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2102);
                Object[] objArr6 = new Object[1];
                d((byte) -1, 0, (byte) 0, objArr6);
                obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(-1840119381, obj3);
            }
            ((Method) obj3).invoke(null, objArr5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = b + 4;
        int i3 = b3 + 84;
        byte[] bArr2 = new byte[23 - b2];
        int i4 = 22 - b2;
        int i5 = -1;
        if (bArr == null) {
            i = i2;
            int i6 = i4;
            i2 = i2 + (-i6) + 2;
            i5++;
            bArr2[i5] = (byte) i2;
            i++;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i];
            i2 = i2 + (-i6) + 2;
            i5++;
            bArr2[i5] = (byte) i2;
            i++;
            if (i5 == i4) {
            }
        } else {
            i = i2;
            i2 = i3;
            i5++;
            bArr2[i5] = (byte) i2;
            i++;
            if (i5 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = b + 4;
        int i4 = b2 * 4;
        int i5 = (i * 3) + 99;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            i5 = i6;
            i2 = 0;
            i5 += i7;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i3];
            i5 += i7;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i2 == i6) {
            }
        }
    }

    private String get(setTextAlignment settextalignment, Map<setTextAlignment, List<computeValue>> map) {
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 111) % 128;
        if (!map.containsKey(settextalignment)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a("耸覆䨚\ue886蟓庉毌\ue8a0䑋\uf8ce傑쭰옪褢閞ꉁ\uecb9驅\udd7bẩ", TextUtils.indexOf((CharSequence) "", '0') + 21, objArr);
        sb.append(((String) objArr[0]).intern());
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b("葭뉹\ue818☥峜諾샍ﺬ㕈捶饁ퟘ\u0dfa㮑熹ꡛ\ue661ᰋ䩩胐뻢\uf48c⍔奾霖촠ﯘ㇡澅ꗲ\udc05", (Process.myTid() >> 22) + 13859, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        for (computeValue computevalue : map.get(settextalignment)) {
            ThreeDS2ServiceInitializationCallback = (getSDKVersion + 87) % 128;
            sb.append(computevalue.getWarnings());
            Object[] objArr3 = new Object[1];
            a("緯Ḳ", Color.rgb(0, 0, 0) + 16777218, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb2.append(computevalue.get());
            Object[] objArr4 = new Object[1];
            a("緯Ḳ", 1 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr4);
            sb2.append(((String) objArr4[0]).intern());
        }
        sb.delete(sb.length() - 2, sb.length());
        sb2.delete(sb2.length() - 2, sb2.length());
        Object[] objArr5 = new Object[1];
        b("葤썧શ刕駫\ue16b⢢灺뿷ݿ亮陎", 18301 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr5);
        String intern = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b("萍\ue844岠샮㕘馸ෳ", Color.alpha(0) + 27733, objArr6);
        return oj.ThreeDS2ServiceInstance(String.format(intern, ((String) objArr6[0]).intern(), sb, sb2), 2048);
    }

    public static void init$0() {
        $$a = new byte[]{119, -84, 99, -31, -18, -8, 15, 2, 35, -13, 35, -31, -16, -11, -2, 15, 8, 0, 30, -35, -3, 1, 21, -11, 13, 0, 4, -13, 31, -8, -15, 6, 7, -3, 9, -10, 4, -13, 35};
        $$b = 7;
    }

    public static void init$1() {
        $$d = new byte[]{102, 38, -14, -96};
        $$e = 36;
    }

    private void initialize(setTextAlignment settextalignment, Map<setTextAlignment, List<computeValue>> map) {
        getSDKVersion = (ThreeDS2ServiceInitializationCallback + 93) % 128;
        String str = get(settextalignment, map);
        if (oj.initialize(str)) {
            throw ((setScrollCaptureCallback.initialize) setScrollCaptureCallback.getWarnings(new Object[]{settextalignment}, -1667499669, 1667499669, (int) System.currentTimeMillis())).ThreeDS2Service(str).ThreeDS2ServiceInstance();
        }
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 31) % 128;
    }

    public void ThreeDS2Service(findFragmentById findfragmentbyid) {
        ThreeDS2ServiceInitializationCallback = (getSDKVersion + 7) % 128;
        if (!findfragmentbyid.get()) {
            Map<setTextAlignment, List<computeValue>> ThreeDS2ServiceInstance2 = findfragmentbyid.ThreeDS2ServiceInstance();
            initialize(setTextAlignment.getId, ThreeDS2ServiceInstance2);
            initialize(setTextAlignment.getSDKAppID, ThreeDS2ServiceInstance2);
            initialize(setTextAlignment.getMessageVersion, ThreeDS2ServiceInstance2);
            initialize(setTextAlignment.getSDKEphemeralPublicKey, ThreeDS2ServiceInstance2);
            initialize(setTextAlignment.Transaction, ThreeDS2ServiceInstance2);
            initialize(setTextAlignment.getSDKReferenceNumber, ThreeDS2ServiceInstance2);
            initialize(setTextAlignment.getSDKTransactionID, ThreeDS2ServiceInstance2);
            initialize(setTextAlignment.useBridgingExtension, ThreeDS2ServiceInstance2);
        }
        int i = getSDKVersion + 71;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
