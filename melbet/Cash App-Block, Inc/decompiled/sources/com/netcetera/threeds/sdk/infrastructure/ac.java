package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class ac extends loadFromXML<LinearLayout> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] ThreeDS2Service;
    private static int cleanup;
    private static int getSDKVersion;
    private static final int getWarnings;
    private ImageView ThreeDS2ServiceInstance;
    private ImageView get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKVersion = 0;
        cleanup = 1;
        ThreeDS2ServiceInstance();
        getWarnings = ((Integer) nj.ThreeDS2Service(new Object[]{100}, 256526108, -256526107, 100)).intValue();
        int i = cleanup + 91;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ac(Context context) {
        super(context);
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2Service = new int[]{-288904689, 1369827343, 475549434, 785059081, 620520419, 1106079454, 1314236766, -497988762, 1512926960, 24235847, -1074650989, 762686779, 637843325, -986713957, -1002125271, -987198334, 1334134832, -1697818642};
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2;
        float f;
        int[] iArr2;
        int i3;
        int[] iArr3;
        char[] cArr;
        int i4;
        Object method;
        int i5;
        char[] cArr2;
        int[] iArr4;
        int[] iArr5;
        Object method2;
        createTransaction createtransaction = new createTransaction();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr6 = ThreeDS2Service;
        Class cls = Integer.TYPE;
        float f2 = RecyclerView.DECELERATION_RATE;
        int i6 = 2;
        int i7 = 0;
        if (iArr6 != null) {
            int length = iArr6.length;
            int[] iArr7 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr6[i8])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(2095751688);
                    if (obj != null) {
                        i5 = length;
                        iArr4 = iArr6;
                        iArr5 = iArr7;
                        method2 = obj;
                        cArr2 = cArr3;
                    } else {
                        i5 = length;
                        cArr2 = cArr3;
                        iArr4 = iArr6;
                        iArr5 = iArr7;
                        Class cls2 = (Class) removeParam.initialize(64 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0', 0, 0) + 1198);
                        Object[] objArr3 = new Object[1];
                        b((short) -1, (short) 1, (byte) 0, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2095751688, method2);
                    }
                    iArr5[i8] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i8++;
                    cArr3 = cArr2;
                    length = i5;
                    iArr6 = iArr4;
                    iArr7 = iArr5;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr6 = iArr7;
        }
        char[] cArr5 = cArr3;
        int length2 = iArr6.length;
        int[] iArr8 = new int[length2];
        int[] iArr9 = ThreeDS2Service;
        if (iArr9 != null) {
            int length3 = iArr9.length;
            int[] iArr10 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr9[i9])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(2095751688);
                if (obj2 != null) {
                    cArr = cArr4;
                    iArr2 = iArr9;
                    i3 = length3;
                    i4 = i9;
                    method = obj2;
                    iArr3 = iArr10;
                } else {
                    iArr2 = iArr9;
                    i3 = length3;
                    iArr3 = iArr10;
                    Class cls3 = (Class) removeParam.initialize(63 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getTapTimeout() >> 16), 1196 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    Object[] objArr5 = new Object[1];
                    cArr = cArr4;
                    i4 = i9;
                    b((short) -1, (short) 1, (byte) 0, objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2095751688, method);
                }
                iArr3[i4] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i9 = i4 + 1;
                iArr10 = iArr3;
                iArr9 = iArr2;
                length3 = i3;
                cArr4 = cArr;
                i7 = 0;
            }
            iArr9 = iArr10;
        }
        char[] cArr6 = cArr4;
        int i10 = 16;
        int i11 = i7;
        System.arraycopy(iArr9, i11, iArr8, i11, length2);
        createtransaction.initialize = i11;
        while (true) {
            int i12 = createtransaction.initialize;
            if (i12 >= iArr.length) {
                objArr[0] = new String(cArr6, 0, i);
                return;
            }
            int i13 = iArr[i12];
            char c = (char) (i13 >> 16);
            cArr5[i11] = c;
            char c2 = (char) i13;
            cArr5[1] = c2;
            char c3 = (char) (iArr[i12 + 1] >> 16);
            cArr5[i6] = c3;
            char c4 = (char) iArr[i12 + 1];
            cArr5[3] = c4;
            createtransaction.getWarnings = (c << 16) + c2;
            createtransaction.get = (c3 << 16) + c4;
            createTransaction.ThreeDS2ServiceInstance(iArr8);
            $10 = ($11 + 111) % 128;
            int i14 = 0;
            while (true) {
                i2 = createtransaction.getWarnings;
                if (i14 >= i10) {
                    break;
                }
                int i15 = i2 ^ iArr8[i14];
                createtransaction.getWarnings = i15;
                int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i15);
                Object[] objArr6 = new Object[4];
                objArr6[3] = createtransaction;
                objArr6[i6] = createtransaction;
                objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                objArr6[0] = createtransaction;
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-411264147);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(49 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13121)).getMethod("y", Object.class, cls, Object.class, Object.class);
                    map3.put(-411264147, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                createtransaction.getWarnings = createtransaction.get;
                createtransaction.get = intValue;
                i14++;
                i10 = 16;
            }
            int i16 = createtransaction.get;
            createtransaction.getWarnings = i16;
            createtransaction.get = i2;
            int i17 = i2 ^ iArr8[16];
            createtransaction.get = i17;
            int i18 = i16 ^ iArr8[17];
            createtransaction.getWarnings = i18;
            cArr5[0] = (char) (i18 >>> 16);
            cArr5[1] = (char) i18;
            cArr5[i6] = (char) (i17 >>> 16);
            cArr5[3] = (char) i17;
            createTransaction.ThreeDS2ServiceInstance(iArr8);
            int i19 = createtransaction.initialize;
            cArr6[i19 * 2] = cArr5[0];
            cArr6[(i19 * 2) + 1] = cArr5[1];
            cArr6[(i19 * 2) + 2] = cArr5[i6];
            cArr6[(i19 * 2) + 3] = cArr5[3];
            Object[] objArr7 = new Object[i6];
            objArr7[1] = createtransaction;
            objArr7[0] = createtransaction;
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj4 = map4.get(-1870831722);
            if (obj4 != null) {
                f = f2;
                i10 = 16;
            } else {
                i10 = 16;
                float f3 = f2;
                f = f3;
                Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 99, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1880 - (TypedValue.complexToFraction(0, f3, f3) > f ? 1 : (TypedValue.complexToFraction(0, f3, f3) == f ? 0 : -1)));
                Object[] objArr8 = new Object[1];
                b((short) -1, (short) 0, (byte) 0, objArr8);
                obj4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-1870831722, obj4);
            }
            ((Method) obj4).invoke(null, objArr7);
            $10 = ($11 + 15) % 128;
            f2 = f;
            i11 = 0;
            i6 = 2;
        }
    }

    private void ak_(ImageView imageView, Bitmap bitmap) {
        cleanup = (getSDKVersion + 115) % 128;
        if (bitmap != null) {
            ThreeDS2Service().setVisibility(0);
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setVisibility(8);
            getSDKVersion = (cleanup + 65) % 128;
        }
    }

    private LinearLayout.LayoutParams am_() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        int i = cleanup + 59;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
        return layoutParams;
    }

    private LinearLayout an_(ViewGroup viewGroup, LinearLayout.LayoutParams layoutParams, int i) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(i | 16);
        linearLayout.setOrientation(0);
        viewGroup.addView(linearLayout);
        getSDKVersion = (cleanup + 41) % 128;
        return linearLayout;
    }

    private ImageView ao_(ViewGroup viewGroup, int i, String str) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = i;
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setAdjustViewBounds(true);
        imageView.setBackground(aG_());
        int i2 = es.ThreeDS2Service;
        imageView.setPadding(i2, i2, i2, i2);
        getWarnings(imageView, str);
        viewGroup.addView(imageView);
        int i3 = getSDKVersion + 75;
        cleanup = i3 % 128;
        if (i3 % 2 != 0) {
            return imageView;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = s + 4;
        int i3 = b * 4;
        int i4 = 118 - (s2 * 5);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            int i8 = i2;
            int i9 = (-i2) + i7;
            int i10 = i8;
            i4 = i9;
            i2 = i10;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            i6 = i + 1;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i2 + 1;
            int i12 = i4;
            i8 = i11;
            i2 = bArr[i11];
            bArr3 = bArr;
            i7 = i12;
            int i92 = (-i2) + i7;
            int i102 = i8;
            i4 = i92;
            i2 = i102;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            i6 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i6 = i + 1;
            if (i == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{27, 61, 58, 11};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        int i = getSDKVersion + 103;
        cleanup = i % 128;
        if (i % 2 == 0) {
            initialize();
            ak_(this.ThreeDS2ServiceInstance, setscroller.createTransaction().R_());
            ak_(this.get, setscroller.ThreeDS2ServiceInitializationCallback().R_());
            throw null;
        }
        initialize();
        ak_(this.ThreeDS2ServiceInstance, setscroller.createTransaction().R_());
        ak_(this.get, setscroller.ThreeDS2ServiceInitializationCallback().R_());
        int i2 = getSDKVersion + 23;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
    }

    public abstract Drawable aG_();

    public LinearLayout al_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, getWarnings));
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        int i = es.getWarnings;
        linearLayout.setPadding(i, i, i, i);
        LinearLayout.LayoutParams am_ = am_();
        int i2 = es.ThreeDS2Service;
        am_.rightMargin = i2;
        LinearLayout an_ = an_(linearLayout, am_, 3);
        LinearLayout.LayoutParams am_2 = am_();
        am_2.leftMargin = i2;
        LinearLayout an_2 = an_(linearLayout, am_2, 5);
        Object[] objArr = new Object[1];
        a(new int[]{2134623869, -1033668502, 1650838856, -1193605043, -931118019, -1947357956, 981906182, 694609643, 2104946844, 1802022009, 353254667, 661353147, 538378789, -1148215723}, ExpandableListView.getPackedPositionType(0L) + 25, objArr);
        this.ThreeDS2ServiceInstance = ao_(an_, 3, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new int[]{2134623869, -1033668502, 1650838856, -1193605043, -931118019, -1947357956, 981906182, 694609643, -440620048, 175652786, -1234196836, 1646148997}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, objArr2);
        this.get = ao_(an_2, 5, ((String) objArr2[0]).intern());
        cleanup = (getSDKVersion + 21) % 128;
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        cleanup = (getSDKVersion + 35) % 128;
        LinearLayout al_ = al_(context);
        getSDKVersion = (cleanup + 27) % 128;
        return al_;
    }
}
