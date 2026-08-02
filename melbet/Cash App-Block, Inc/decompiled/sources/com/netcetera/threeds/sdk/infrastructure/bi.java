package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
abstract class bi<T extends View> extends loadFromXML<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2ServiceInstance;
    private static int createTransaction;
    private static int get;
    private final no ThreeDS2Service;
    private getWarnings getWarnings;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class getWarnings {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ getWarnings[] ThreeDS2Service;
        private static int ThreeDS2ServiceInitializationCallback;
        public static final getWarnings ThreeDS2ServiceInstance;
        private static int cleanup;
        private static long get;
        public static final getWarnings getWarnings;
        private static char[] initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            cleanup = 0;
            ThreeDS2ServiceInitializationCallback = 1;
            initialize();
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf("", "") + 8, Color.alpha(0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr);
            ThreeDS2ServiceInstance = new getWarnings(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9, AndroidCharacter.getMirror('0') - '(', (char) (MotionEvent.axisFromString("") + 20443), objArr2);
            getWarnings = new getWarnings(((String) objArr2[0]).intern(), 1);
            ThreeDS2Service = get();
            cleanup = (ThreeDS2ServiceInitializationCallback + 71) % 128;
        }

        private getWarnings(String str, int i) {
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x01b3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char c, Object[] objArr) {
            Throwable cause;
            float f;
            Object method;
            int i3;
            ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
            long[] jArr = new long[i];
            byte b = 0;
            threeDS2ServiceInitializationCallback.initialize = 0;
            while (true) {
                int i4 = threeDS2ServiceInitializationCallback.initialize;
                if (i4 >= i) {
                    break;
                }
                try {
                    Object[] objArr2 = {Integer.valueOf(initialize[i2 + i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-54653524);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        f = 0.0f;
                        method = obj;
                    } else {
                        f = 0.0f;
                        byte b2 = b;
                        Class cls2 = (Class) removeParam.initialize((TypedValue.complexToFraction(b, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(b, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) (Process.myPid() >> 22), 3221 - Color.green((int) b2));
                        Object[] objArr3 = new Object[1];
                        b(b2, (short) 1, b2, objArr3);
                        method = cls2.getMethod((String) objArr3[b2], cls);
                        map.put(-54653524, method);
                    }
                    Long l = (Long) ((Method) method).invoke(null, objArr2);
                    l.longValue();
                    Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(get), Integer.valueOf(c)};
                    Object obj2 = map.get(1319531906);
                    if (obj2 != null) {
                        i3 = 1;
                    } else {
                        i3 = 1;
                        Class cls3 = (Class) removeParam.initialize((-16777147) - Color.rgb(0, 0, 0), (char) (50704 - TextUtils.getTrimmedLength("")), 7788 - TextUtils.lastIndexOf("", '0', 0, 0));
                        Class cls4 = Long.TYPE;
                        obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                        map.put(1319531906, obj2);
                    }
                    jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = new Object[2];
                    objArr5[i3] = threeDS2ServiceInitializationCallback;
                    objArr5[0] = threeDS2ServiceInitializationCallback;
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls5 = (Class) removeParam.initialize(48 - ExpandableListView.getPackedPositionGroup(0L), (char) ((AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 27780), ExpandableListView.getPackedPositionType(0L) + 2441);
                        Object[] objArr6 = new Object[i3];
                        b(0, (short) 0, (byte) 0, objArr6);
                        obj3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1724349229, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                    b = 0;
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
                int i5 = threeDS2ServiceInitializationCallback.initialize;
                if (i5 >= i) {
                    String str = new String(cArr);
                    $11 = ($10 + 55) % 128;
                    objArr[0] = str;
                    return;
                }
                cArr[i5] = (char) jArr[i5];
                Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(1724349229);
                if (obj4 == null) {
                    Class cls6 = (Class) removeParam.initialize(TextUtils.getOffsetBefore("", 0) + 48, (char) (27780 - KeyEvent.normalizeMetaState(0)), (-16774775) - Color.rgb(0, 0, 0));
                    Object[] objArr8 = new Object[1];
                    b(0, (short) 0, (byte) 0, objArr8);
                    obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(1724349229, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                $11 = ($10 + 55) % 128;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, short s, byte b, Object[] objArr) {
            int i2;
            int i3 = i * 2;
            int i4 = (s * 3) + 97;
            int i5 = 3 - (b * 2);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i6 = i3;
                int i7 = i5;
                i2 = 0;
                int i8 = i5 + (-i6);
                i5 = i7;
                i4 = i8;
                bArr2[i2] = (byte) i4;
                int i9 = i5 + 1;
                if (i2 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i6 = bArr[i9];
                i2++;
                i5 = i4;
                i7 = i9;
                int i82 = i5 + (-i6);
                i5 = i7;
                i4 = i82;
                bArr2[i2] = (byte) i4;
                int i92 = i5 + 1;
                if (i2 == i3) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i4;
                int i922 = i5 + 1;
                if (i2 == i3) {
                }
            }
        }

        private static /* synthetic */ getWarnings[] get() {
            int i = cleanup + 99;
            ThreeDS2ServiceInitializationCallback = i % 128;
            if (i % 2 != 0) {
                return new getWarnings[]{ThreeDS2ServiceInstance, getWarnings};
            }
            getWarnings[] getwarningsArr = new getWarnings[3];
            getwarningsArr[0] = ThreeDS2ServiceInstance;
            getwarningsArr[1] = getWarnings;
            return getwarningsArr;
        }

        public static void init$0() {
            $$a = new byte[]{75, 5, 106, -89};
            $$b = 64;
        }

        public static void initialize() {
            initialize = new char[]{35176, 888, 40308, 5953, 41302, 15154, 46379, 20229, 50862, 19628, 53938, 22667, 61069, 29930, 64249, 219, 38623};
            get = -8262809689243843785L;
        }

        public static getWarnings valueOf(String str) {
            ThreeDS2ServiceInitializationCallback = (cleanup + 87) % 128;
            getWarnings getwarnings = (getWarnings) Enum.valueOf(getWarnings.class, str);
            ThreeDS2ServiceInitializationCallback = (cleanup + 29) % 128;
            return getwarnings;
        }

        public static getWarnings[] values() {
            getWarnings[] getwarningsArr;
            int i = ThreeDS2ServiceInitializationCallback + 97;
            cleanup = i % 128;
            if (i % 2 != 0) {
                getwarningsArr = (getWarnings[]) ThreeDS2Service.clone();
                int i2 = 98 / 0;
            } else {
                getwarningsArr = (getWarnings[]) ThreeDS2Service.clone();
            }
            ThreeDS2ServiceInitializationCallback = (cleanup + 69) % 128;
            return getwarningsArr;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        get = 0;
        createTransaction = 1;
        ThreeDS2ServiceInstance = 907910173259992529L;
    }

    public bi(Context context) {
        super(context);
        this.ThreeDS2Service = (no) nu.initialize(new Object[]{bi.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        $11 = (i2 + 19) % 128;
        if (str != null) {
            int i3 = i2 + 45;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                cArr = str.toCharArray();
                int i4 = 97 / 0;
            } else {
                cArr = str.toCharArray();
            }
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize = onCompleted.initialize(ThreeDS2ServiceInstance ^ (-2776494906517314268L), cArr, i);
        oncompleted.initialize = 4;
        $11 = ($10 + 89) % 128;
        while (true) {
            int i5 = oncompleted.initialize;
            if (i5 >= initialize.length) {
                objArr[0] = new String(initialize, 4, initialize.length - 4);
                return;
            }
            int i6 = i5 - 4;
            oncompleted.ThreeDS2Service = i6;
            try {
                Object[] objArr2 = {Long.valueOf(initialize[i5] ^ initialize[i5 % 4]), Long.valueOf(i6), Long.valueOf(ThreeDS2ServiceInstance)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj == null) {
                    Class cls = (Class) removeParam.initialize(47 - TextUtils.lastIndexOf("", '0'), (char) (ExpandableListView.getPackedPositionType(0L) + 27780), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2440);
                    Object[] objArr3 = new Object[1];
                    b(0, (short) -1, 0, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize[i5] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(66 - Drawable.resolveOpacity(0, 0), (char) Color.blue(0), (ViewConfiguration.getEdgeSlop() >> 16) + 14235)).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 19) % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private Point aK_(WindowManager windowManager) {
        createTransaction = (get + 95) % 128;
        if (Build.VERSION.SDK_INT < 30) {
            int i = createTransaction + 105;
            get = i % 128;
            if (i % 2 == 0) {
                return aL_(windowManager);
            }
            aL_(windowManager);
            throw null;
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        int i2 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i3 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        return new Point(bounds.width() - i2, bounds.height() - i3);
    }

    private Point aL_(WindowManager windowManager) {
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = get + 25;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
        return point;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, Object[] objArr) {
        int i3;
        int i4 = (i * 3) + 112;
        byte[] bArr = $$a;
        int i5 = i2 * 2;
        int i6 = s + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i6;
            i4 += -i6;
            i6 = i9;
            bArr = bArr3;
            i3 = i8;
            int i10 = i6 + 1;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i10];
            byte[] bArr4 = bArr;
            i9 = i10;
            i6 = b;
            bArr3 = bArr4;
            i4 += -i6;
            i6 = i9;
            bArr = bArr3;
            i3 = i8;
            int i102 = i6 + 1;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i6 + 1;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{17, 60, 91, -87};
        $$b = EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0 == com.netcetera.threeds.sdk.infrastructure.bi.getWarnings.getWarnings) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0 == com.netcetera.threeds.sdk.infrastructure.bi.getWarnings.getWarnings) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        getWarnings(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        return;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ThreeDS2Service(setScroller setscroller) {
        getWarnings getwarnings = this.getWarnings;
        if (getwarnings != null) {
            int i = get + 65;
            createTransaction = i % 128;
            if (i % 2 == 0) {
                int i2 = 95 / 0;
            }
        }
        get(setscroller);
        get = (createTransaction + 19) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public final T ThreeDS2ServiceInstance(Context context) {
        Object[] objArr = new Object[1];
        a("뒚듭禜턀\ud868窺觬老ᜡ㔢", (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        WindowManager windowManager = (WindowManager) context.getSystemService(((String) objArr[0]).intern());
        if (windowManager == null) {
            get = (createTransaction + 27) % 128;
            no noVar = this.ThreeDS2Service;
            Object[] objArr2 = new Object[1];
            a("鋌銏Ἆ랔피↔蒣\udb27ㅼ叧⃬뽈픐\uefb3䳜捶秄謍\ue833잪ᷪ✮㐦ꯏꆀ썲倒\u0fe0䑝悍ﶺ\uf02c\ue877㳯᧧呞谂\ud8faꗑ㢎僊瑉", 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            noVar.initialize(((String) objArr2[0]).intern());
            this.getWarnings = getWarnings.ThreeDS2ServiceInstance;
            return getWarnings(context);
        }
        Point aK_ = aK_(windowManager);
        if (aK_.x <= aK_.y) {
            this.getWarnings = getWarnings.ThreeDS2ServiceInstance;
            return getWarnings(context);
        }
        this.getWarnings = getWarnings.getWarnings;
        T initialize = initialize(context);
        int i = get + 37;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
        return initialize;
    }

    public abstract void get(setScroller setscroller);

    public abstract T getWarnings(Context context);

    public abstract void getWarnings(setScroller setscroller);

    public abstract T initialize(Context context);
}
