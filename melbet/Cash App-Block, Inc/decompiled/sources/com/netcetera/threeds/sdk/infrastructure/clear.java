package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class clear implements notify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final clear ConfigParameters;
    public static final clear ConfigurationBuilder;
    private static int SchemeConfiguration;
    public static final clear ThreeDS2Service;
    public static final clear ThreeDS2ServiceInitializationCallback;
    public static final clear ThreeDS2ServiceInstance;
    public static final clear addParam;
    private static char[] amexConfiguration;
    public static final clear apiKey;
    private static final /* synthetic */ clear[] build;
    public static final clear cleanup;
    public static final clear configureScheme;
    public static final clear createTransaction;
    public static final clear get;
    public static final clear getParamValue;
    public static final clear getSDKInfo;
    public static final clear getSDKVersion;
    public static final clear getWarnings;
    public static final clear initialize;
    private static int mastercardSchemeConfiguration;
    public static final clear onCompleted;
    public static final clear onError;
    private static long visaSchemeConfiguration;
    private final String removeParam;
    private final String restrictedParameters;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        mastercardSchemeConfiguration = 0;
        SchemeConfiguration = 1;
        initialize();
        Object[] objArr = new Object[1];
        a(14 - ((Process.getThreadPriority(0) + 20) >> 6), KeyEvent.getMaxKeyCode() >> 16, (char) (57645 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3, 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (33168 - TextUtils.getTrimmedLength("")), objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, 17 - Color.argb(0, 0, 0, 0), (char) Color.alpha(0), objArr3);
        ThreeDS2Service = new clear(intern, 0, intern2, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
        String intern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(3 - ExpandableListView.getPackedPositionType(0L), ((byte) KeyEvent.getModifierMetaStateMask()) + 57, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr5);
        String intern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(73 - (ViewConfiguration.getEdgeSlop() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 59, (char) (Color.rgb(0, 0, 0) + 16806636), objArr6);
        ThreeDS2ServiceInstance = new clear(intern3, 1, intern4, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(14 - TextUtils.getOffsetAfter("", 0), 132 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr7);
        String intern5 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 3, 194 - AndroidCharacter.getMirror('0'), (char) (17486 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr8);
        String intern6 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a(28 - View.MeasureSpec.getMode(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, (char) (9594 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr9);
        getWarnings = new clear(intern5, 2, intern6, ((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        a(14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, (char) ExpandableListView.getPackedPositionGroup(0L), objArr10);
        String intern7 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 4, 191 - View.resolveSize(0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr11);
        String intern8 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 79, 195 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 27688), objArr12);
        initialize = new clear(intern7, 3, intern8, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, Color.red(0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, (char) (24166 - Process.getGidForName("")), objArr13);
        String intern9 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 3, (ViewConfiguration.getEdgeSlop() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr14);
        String intern10 = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        a(MotionEvent.axisFromString("") + 43, (ViewConfiguration.getScrollDefaultDelay() >> 16) + EnumC0170g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr15);
        get = new clear(intern9, 4, intern10, ((String) objArr15[0]).intern());
        Object[] objArr16 = new Object[1];
        a(13 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf((CharSequence) "", '0') + 333, (char) (ExpandableListView.getPackedPositionType(0L) + 56639), objArr16);
        String intern11 = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 345, (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1832), objArr17);
        String intern12 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 87, 349 - View.getDefaultSize(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1279), objArr18);
        cleanup = new clear(intern11, 5, intern12, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        a(14 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetAfter("", 0) + 436, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr19);
        String intern13 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 3, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 449, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr20);
        String intern14 = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        a(AndroidCharacter.getMirror('0') + 'E', 453 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (1681 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), objArr21);
        createTransaction = new clear(intern13, 6, intern14, ((String) objArr21[0]).intern());
        Object[] objArr22 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 14, View.resolveSizeAndState(0, 0, 0) + 570, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr22);
        String intern15 = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2, 584 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ExpandableListView.getPackedPositionGroup(0L) + 8354), objArr23);
        String intern16 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 96, (ViewConfiguration.getFadingEdgeLength() >> 16) + 587, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr24);
        getSDKVersion = new clear(intern15, 7, intern16, ((String) objArr24[0]).intern());
        Object[] objArr25 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 14, 683 - TextUtils.indexOf("", ""), (char) (ExpandableListView.getPackedPositionGroup(0L) + 58727), objArr25);
        String intern17 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 3, 698 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (54773 - TextUtils.lastIndexOf("", '0', 0)), objArr26);
        String intern18 = ((String) objArr26[0]).intern();
        Object[] objArr27 = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 76, MotionEvent.axisFromString("") + 701, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr27);
        getSDKInfo = new clear(intern17, 8, intern18, ((String) objArr27[0]).intern());
        Object[] objArr28 = new Object[1];
        a(TextUtils.indexOf("", "") + 14, (Process.myPid() >> 22) + 776, (char) (15629 - TextUtils.lastIndexOf("", '0', 0)), objArr28);
        String intern19 = ((String) objArr28[0]).intern();
        Object[] objArr29 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 3, 791 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr29);
        String intern20 = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        a(Color.red(0) + 13, 793 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Process.myTid() >> 22), objArr30);
        ThreeDS2ServiceInitializationCallback = new clear(intern19, 9, intern20, ((String) objArr30[0]).intern());
        Object[] objArr31 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 14, View.MeasureSpec.makeMeasureSpec(0, 0) + 806, (char) (41662 - Gravity.getAbsoluteGravity(0, 0)), objArr31);
        String intern21 = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 3, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 819, (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1), objArr32);
        String intern22 = ((String) objArr32[0]).intern();
        Object[] objArr33 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, 822 - TextUtils.lastIndexOf("", '0'), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr33);
        getParamValue = new clear(intern21, 10, intern22, ((String) objArr33[0]).intern());
        Object[] objArr34 = new Object[1];
        a(14 - (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 838, (char) (TextUtils.getOffsetBefore("", 0) + 15247), objArr34);
        String intern23 = ((String) objArr34[0]).intern();
        Object[] objArr35 = new Object[1];
        a(TextUtils.indexOf("", "", 0) + 3, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 853, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr35);
        String intern24 = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 856, (char) (18458 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr36);
        onError = new clear(intern23, 11, intern24, ((String) objArr36[0]).intern());
        Object[] objArr37 = new Object[1];
        a(14 - Color.alpha(0), TextUtils.getOffsetAfter("", 0) + 880, (char) KeyEvent.keyCodeFromString(""), objArr37);
        String intern25 = ((String) objArr37[0]).intern();
        Object[] objArr38 = new Object[1];
        a(4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 895, (char) (55913 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr38);
        String intern26 = ((String) objArr38[0]).intern();
        Object[] objArr39 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 12, 897 - KeyEvent.normalizeMetaState(0), (char) Color.alpha(0), objArr39);
        addParam = new clear(intern25, 12, intern26, ((String) objArr39[0]).intern());
        Object[] objArr40 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 14, TextUtils.getTrimmedLength("") + 908, (char) TextUtils.getOffsetBefore("", 0), objArr40);
        String intern27 = ((String) objArr40[0]).intern();
        Object[] objArr41 = new Object[1];
        a(2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "") + 922, (char) (View.resolveSize(0, 0) + 61744), objArr41);
        String intern28 = ((String) objArr41[0]).intern();
        Object[] objArr42 = new Object[1];
        a(20 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getTapTimeout() >> 16) + 925, (char) (TiffTagConstants.COMPRESSION_VALUE_DCS - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr42);
        ConfigParameters = new clear(intern27, 13, intern28, ((String) objArr42[0]).intern());
        Object[] objArr43 = new Object[1];
        a(15 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 946 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr43);
        String intern29 = ((String) objArr43[0]).intern();
        Object[] objArr44 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, View.combineMeasuredStates(0, 0) + 960, (char) (1883 - TextUtils.getOffsetAfter("", 0)), objArr44);
        String intern30 = ((String) objArr44[0]).intern();
        Object[] objArr45 = new Object[1];
        a(21 - View.MeasureSpec.getMode(0), 963 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.red(0), objArr45);
        onCompleted = new clear(intern29, 14, intern30, ((String) objArr45[0]).intern());
        Object[] objArr46 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 984, (char) Color.alpha(0), objArr46);
        String intern31 = ((String) objArr46[0]).intern();
        Object[] objArr47 = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 3, 998 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (65514 - Drawable.resolveOpacity(0, 0)), objArr47);
        String intern32 = ((String) objArr47[0]).intern();
        Object[] objArr48 = new Object[1];
        a(25 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 1000 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.indexOf("", ""), objArr48);
        configureScheme = new clear(intern31, 15, intern32, ((String) objArr48[0]).intern());
        Object[] objArr49 = new Object[1];
        a((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 14, (ViewConfiguration.getScrollDefaultDelay() >> 16) + IptcConstants.IMAGE_RESOURCE_BLOCK_WORKING_PATH, (char) (29701 - (ViewConfiguration.getTouchSlop() >> 8)), objArr49);
        String intern33 = ((String) objArr49[0]).intern();
        Object[] objArr50 = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, View.resolveSize(0, 0) + 1039, (char) (2757 - Process.getGidForName("")), objArr50);
        String intern34 = ((String) objArr50[0]).intern();
        Object[] objArr51 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, 1042 - View.combineMeasuredStates(0, 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr51);
        ConfigurationBuilder = new clear(intern33, 16, intern34, ((String) objArr51[0]).intern());
        Object[] objArr52 = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 15, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + IptcConstants.IMAGE_RESOURCE_BLOCK_LAYER_COMPS, (char) (39078 - TextUtils.getOffsetBefore("", 0)), objArr52);
        String intern35 = ((String) objArr52[0]).intern();
        Object[] objArr53 = new Object[1];
        a(Color.alpha(0) + 3, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1081, (char) View.resolveSizeAndState(0, 0, 0), objArr53);
        String intern36 = ((String) objArr53[0]).intern();
        Object[] objArr54 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, ((byte) KeyEvent.getModifierMetaStateMask()) + 1084, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 35043), objArr54);
        apiKey = new clear(intern35, 17, intern36, ((String) objArr54[0]).intern());
        build = get();
        int i = mastercardSchemeConfiguration + 59;
        SchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            int i2 = 13 / 0;
        }
    }

    private clear(String str, int i, String str2, String str3) {
        this.removeParam = str2;
        this.restrictedParameters = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        int i3;
        int i4;
        Object method;
        Integer num = -54653524;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr = new long[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i) {
                break;
            }
            $11 = ($10 + 125) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(amexConfiguration[i2 + i5])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    i4 = 1;
                    method = obj;
                    i3 = 2;
                } else {
                    i3 = 2;
                    Class cls2 = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 3220 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    Object[] objArr3 = new Object[1];
                    i4 = 1;
                    b((byte) 0, 0, (byte) -1, objArr3);
                    method = cls2.getMethod((String) objArr3[0], cls);
                    map.put(num, method);
                }
                Long l = (Long) ((Method) method).invoke(null, objArr2);
                l.longValue();
                long j = threeDS2ServiceInitializationCallback.initialize;
                long j2 = visaSchemeConfiguration;
                Integer num2 = num;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[i3] = Long.valueOf(j2);
                objArr4[i4] = Long.valueOf(j);
                objArr4[0] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getDoubleTapTimeout() >> 16) + 69, (char) (50704 - TextUtils.getOffsetAfter("", 0)), Color.argb(0, 0, 0, 0) + 7789);
                    Class cls4 = Long.TYPE;
                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                    map.put(1319531906, obj2);
                }
                jArr[i5] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i3];
                objArr5[i4] = threeDS2ServiceInitializationCallback;
                objArr5[0] = threeDS2ServiceInitializationCallback;
                Object obj3 = map.get(1724349229);
                if (obj3 == null) {
                    Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (27780 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2441);
                    byte b = (byte) ($$b & 3);
                    byte b2 = (byte) (b - 1);
                    Object[] objArr6 = new Object[i4];
                    b(b, b2, (byte) (b2 - 1), objArr6);
                    obj3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1724349229, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
                $11 = ($10 + 3) % 128;
                num = num2;
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
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i6 = threeDS2ServiceInitializationCallback.initialize;
            if (i6 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i6] = (char) jArr[i6];
            Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(1724349229);
            if (obj4 == null) {
                Class cls6 = (Class) removeParam.initialize(TextUtils.getCapsMode("", 0, 0) + 48, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27780), View.resolveSizeAndState(0, 0, 0) + 2441);
                byte b3 = (byte) ($$b & 3);
                byte b4 = (byte) (b3 - 1);
                Object[] objArr8 = new Object[1];
                b(b3, b4, (byte) (b4 - 1), objArr8);
                obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1724349229, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        int i3 = 100 - (b * 3);
        int i4 = b2 + 4;
        byte[] bArr = $$a;
        int i5 = i * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i3 += i7;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i4];
            i3 += i7;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    private static /* synthetic */ clear[] get() {
        int i = (SchemeConfiguration + 21) % 128;
        mastercardSchemeConfiguration = i;
        clear[] clearVarArr = {ThreeDS2Service, ThreeDS2ServiceInstance, getWarnings, initialize, get, cleanup, createTransaction, getSDKVersion, getSDKInfo, ThreeDS2ServiceInitializationCallback, getParamValue, onError, addParam, ConfigParameters, onCompleted, configureScheme, ConfigurationBuilder, apiKey};
        SchemeConfiguration = (i + 17) % 128;
        return clearVarArr;
    }

    public static void init$0() {
        $$a = new byte[]{58, -96, 36, -125};
        $$b = 93;
    }

    public static void initialize() {
        char[] cArr = new char[1108];
        ByteBuffer.wrap("hQåãs\fÀ´^Ò¬r9\u0089·Ø\u0005x\u0092\u009cà9~2Ë\u0098YD\b\u0099\u0085=\u0013Ó\u0089u\u0004ø\u0092\u0001!¤¿ÍMfØ\u0083V\u009bäBs\u0090\u0001)\u009fJ*í¸/6[Å÷SHî\u0084|Ì\nq\u0099½\u0017Ý¥\u007f0\u008fÎn\u0089}\u0004Ï\u0092 !\u0098¿þM^Ø¥VôäTs°\u0001\u0015\u009f\u001e*´¸k\u0089\t\u0004\u00ad\u0092@û\u0099v\u0014àíSHÍ!?\u008aªo$w\u0096ª\u0001|sÔí°X\u0001ÊÚD¼·_!Ê\u009cT\u000e#x\u0089ëUe/×ÚBu¼É.ª\u0099s\u000bÚ\u0085®ð\u0000bæÝ\u000fO\u001d¹â4\u001e¦5\u0010\u008f\u0083yý\u008ao\u0081Ú}TÕÆ¯1\u0007£¨\u001d³\u0088\u001dúíu\u0004ç5Q\u0086Ìn>p¨\u008f\u001b\u007f\u0095Ä\u0007©r\u0000ìÀ^ºÉ\u0016;â¶\u0002 ,\u0092û\r\\\u007f.é\u0094dnÖÈ@¤³c-\u0092\u0089}\u0004Ï\u0092 !\u0098¿þM^Ø¥VôäTs°\u0001\u0015\u009f\u001e*´¸jÍG@ãÖ\u000f¬\u0012!\u0081·e\u0004Ú\u009aõh\u0015ýús±Á\u001aVí$Tº3\u000f\u008e\u009d\u0000\u0013+à\u0083v|ËÝY¯/^¼À2°\u0080\f\u0015÷ë\\y8Îæ\\B\u0089}\u0004Ï\u0092 !\u0098¿þM^Ø¥VôäTs°\u0001\u0015\u009f\u001d*´¸h\u0089\n\u0004\u00ad\u0092CåQh\u0095þ7M\u009aÓ÷!Z´¯:ô\u0088]\u001fým\u0007ókFÉÔ\u001cZs©Õ?4\u0082Å\u0010øfJõ\u0085{ìÉW\\±¢\r0i\u0087ò\u0015\u0016\u009boî\u0081|\"Ã\u008eQÖ§<*\u0094¸ú\u000e@\u009déã\u0007q]ÄøJ)Øc/Å½ \u0003t\u0096\u0096ä\u001akÎù´O\nÒ¦ ç¶\u0019\u0005³\u008b\n\u0019{lÞò\u001b@y×Û%a¨\u0080>ù\u008c?\u0013\u0098aº÷Kz¬È\f^.\u00ad¾3\u001d\u0081n\u0014Ñ\u009a&é\u008b\u007fÔÍx×\u001aZ¨ÌG\u007fÿá\u0099\u00139\u0086Â\b\u0093º3-×_rÁztÓæ\f\u0089\n\u0004\u00ad\u0092@\u0089{\u0004ï\u0092\u001b!£¿ÅMbØ\u0087V×ä0s¸\u0001/\u009f\\*÷¸86YÅöSHî\u0088|Ú\ns\u0099¹\u0017ß¥e0\u0082Î/\\KëÚy\u0011÷[\u0082ý\u0010N¯\u0091=ýË\u001eF½ÔÐbbñ\u0088\u008f5\u001d~¨\u0094&{TBÙðO\u001fü§bÁ\u0090a\u0005\u009a\u008bË9k®\u008fÜ*B\"÷\u008beU\u008e\"\u0003\u0085\u0095i\u008d\u0080\u0000\f\u0096þ%D»3I\u008bÜ8R*à\u009cw+\u0005Â\u009b°.\u0016¼Ò2¥ÁMWùêUx|\u000e\u0096\u009dL\u0013*¡È4zÊÌXûïi}Îó¸\u0086\u0012\u0014°«y9\u0007Ï÷BMÐif·õs\u008bÝ\u0019\u0088¬k\"Å° G\u0002Õºk®þ\u0013\u008c\u00ad\u0003\u007f\u0091='\u008aºxH.Þ\u0086mlã\u0095q¿\u0004\u0018\u009aÇ(®¿\u0018MóÀYV3äá{\u0003\t8\u009f\u0086\u00122 Ë6°Å`[\u008eé\u0098|\u0004òô\u0081Y\u0017\u000e¥æ8DÎ5\\\u0092ÓhaÐ÷\u008d\u008aa\u0018\u0086\u0089}\u0004Ï\u0092 !\u0098¿þM^Ø¥VôäTs°\u0001\u0015\u009f\u001d*´¸n\u0089\n\u0004\u00ad\u0092E\u008fì\u0002l\u0094\u0096'&¹\u001cKÔÞ\u001aPNâíu\u0000\u0007´\u0099Ë,4¾¿0ÏÃoU\u008dè8z\u0012\fþ\u009f?\u0011\u0001£ï6\u0015ÈðZÁí\u0002\u007fªñ\u0084\u0084k\u0016\u009f©=;oÍ\u0088@bÒHdú÷Q\u0089\u008d\u001bÙ®\u0005 ¶²ßEm×\u0082iÌüj\u008eÃ\u0001>\u0093R%à¸WJhÜÒoFá®sÃ\u0006p\u0098\u0097*\u008f½kO\u008bÂ~Thæºy(\u000bQ\u009dâ\u0010\u000e¢§4ÓÇ\u000fYàëÃ~uð\u008d\u0083t\u0015L§£:\u0015Ì{^òÑRc±õù\u0088\u0015\u001a³¬É?u±ÕCßÖ|h\u0081û\u0004\u008d\u001e\u001fò\u0092&$I¶¢I\u000eÛ¯m\u0091àxr¤\u0004Ô\u0097%)\u0088¼:NWÀ\u0086S)åMwñ\n\u000e\u009c·.Ó¡B\u0089}\u0004Ï\u0092 !\u0098¿þM^Ø¥VôäTs°\u0001\u0015\u009f\u001c*´¸h©©$\u000f²á\u0089l\u0004ï\u0092\u0013!¹¿ßM`Ø\u0085VÏäys\u009a\u0001$\u009f\u000f*Í¸\u001d6\u001eÅÝS\u0007î¹|\u0082\nU\u0099¹\u0017Ò¥y0\u008cÎ.\\Lë\u0089y:÷P\u0082§\u0010N¯\u0097=êË\u001cF¼ÔÄbmñ\u0082\u008f2\u001dr¨\u009f&;´\nCÆÑ o\u0019úì\u0088\u0016\u0007«\u0095È#k¾\u0091LÙÚuiÖç\"uS\u0000¥\u009e4,P»àIIÄ¸RÂà\u0014\u007f´\rÖ\u009b7\u0016\u008a¤.2TÁÛ_$í]xïöO\u0085¶\u0013ü¡\u001d<¶ÊÁX{×\u008be)ó{\u008eÑ\u001c5ªD9í·\u0015EUÐñn\u0011ý§\u008bÚ\u0019-l\u001aá¨wGÄÿZ\u0099¨9=Â³\u0093\u00013\u0096×ärz{ÏÓ]\f\\ýÑ[G¶\u0089|\u0004ü\u0092\u0006!¶¿\u008cMbØ\u0089VÎä|s\u0091\u0001j\u009fA*ë¸-6\u001eÅñS\rîí|Æ\nb\u0099¿\u0017Ã¥o0\u009bÎ4\\@ë\u009ey\u007f÷V\u0082ð\u0010N¯·=ðË\u0018FòÔ\u0084bHñ²\u008ff\u001dH¨´&\u001e´\nCëÑ\u0011o\\ú¾\u0088\u0007\u0007§\u0095\u008d#v¾\u0082LßÚyi\u0098ç\"uC\u0000ä\u009e6,\u001f»ûI\u001bÄîRÌà\f\u007fµ\r×\u009be\u0016Ì¤32CÁ\u009a_#íZxäöA´s9Á¯.\u001c\u0096\u0082ðpPå«kúÙZN¾<\u001b¢\u0012\u0017º\u0085d\u0089\u000b\u0004\u00ad\u0092A\u0089y\u0004þ\u0092\u0011!²¿ßMrØÆVßäus\u009b\u0001#\u009fJ*à+Ã¦q0\u009e\u0083&\u001d@ïàz\u001bôJFêÑ\u000e£«=¢\u0088\n\u001aÓ\u0089\u000b\u0004\u00ad\u0092F\u0089q\u0004ó\u0092\u0004!¶¿ÀMhØ\u0082V\u009bäYs¦\u0001\u0005\u009f\u000f*ç¸66ZÅö²ò?@©¯\u001a\u0017\u0084qvÑã*m{ßÛH?:\u009a¤\u0093\u0011;\u0083ã\u0089\u000b\u0004\u00ad\u0092GÁkLéÚ\u001ei¬÷Ú\u0005r\u0090\u0098\u001e\u0081¬~;\u009dI1×[bíð\"~G\u008dý\u001b\u001b¦¸4ÖB=Ñ¢_Êíxx\u0090\u0089}\u0004Ï\u0092 !\u0098¿þM^Ø¥VôäTs°\u0001\u0015\u009f\u001c*´¸oScÞÅH,\u0089q\u0004ó\u0092\u0004!¶¿ÀMhØ\u0082V\u009bä]s¶\u0001\t\u0089}\u0004Ï\u0092 !\u0098¿þM^Ø¥VôäTs°\u0001\u0015\u009f\u001c*´¸nx;õ\u009dcu\tÂ\u0084@\u0012·¡\u0005?sÍÛX1Ö(dÐó#\u0081\u008b\u001fõªV8\u0086¶\u00adENÓ®n\u0013üs\u008aÑ\u0019\u001d\u0089}\u0004Ï\u0092 !\u0098¿þM^Ø¥VôäTs°\u0001\u0015\u009f\u001b*´¸k\u008eW\u0003ö\u0095\u001b\u0089l\u0004ï\u0092\u0013!¹¿ßM`Ø\u0085VÏäys\u009a\u0001$\u009f\u000f*ð¸06SÅöS\fîí|Í\nr\u0099¨\u0089}\u0004Ï\u0092 !\u0098¿þM^Ø¥VôäTs°\u0001\u0015\u009f\u001b*´¸jvæûGm«\u0089l\u0004ï\u0092\u0013!¹¿ßMhØ\u0083VÕädsÕ\u00019\u009fV*÷¸-6[ÅþSHî«|Ã\nn\u0099°\u0017Ä¥d0\u008eýxpÊæ%U\u009dËû9[¬ \"ñ\u0090Q\u0007µu\u0010ë\u001e^±Ìh\u0083Ê\u000ek\u0098\u0080\u0089h\u0004ø\u0092\u0000!º¿ÍMoØ\u0083VÕädsÕ\u00019\u009fV*÷¸-6[ÅþSHî«|Ã\nn\u0099°\u0017Ä¥d0\u008e\u0011Û\u009ci\n\u0086¹>'XÕø@\u0003ÎR|òë\u0016\u0099³\u0007½²\u0012 Ê\u0089\f\u0004\u00ad\u0092G\u0001\u0088\u008c\u0007\u001aâ©@7*Å\u008fP%Þ;l\u009cûx\u0089Ç\u0017©¢\u00040Î¾´M\u001fÛåf\u000eô'\u0082\u0085\u0011V\u009f>-\u0080¸zFÆ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1108);
        amexConfiguration = cArr;
        visaSchemeConfiguration = 6093520965370774685L;
    }

    public static clear valueOf(String str) {
        SchemeConfiguration = (mastercardSchemeConfiguration + 77) % 128;
        clear clearVar = (clear) Enum.valueOf(clear.class, str);
        mastercardSchemeConfiguration = (SchemeConfiguration + 3) % 128;
        return clearVar;
    }

    public static clear[] values() {
        SchemeConfiguration = (mastercardSchemeConfiguration + 121) % 128;
        clear[] clearVarArr = (clear[]) build.clone();
        int i = SchemeConfiguration + 119;
        mastercardSchemeConfiguration = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
        return clearVarArr;
    }

    public String ThreeDS2Service() {
        int i = SchemeConfiguration + 79;
        mastercardSchemeConfiguration = i % 128;
        int i2 = i % 2;
        String str = this.restrictedParameters;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = (mastercardSchemeConfiguration + 31) % 128;
        SchemeConfiguration = i;
        String str = this.removeParam;
        int i2 = i + 99;
        mastercardSchemeConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
