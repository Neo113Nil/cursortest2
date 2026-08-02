package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class et {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char ThreeDS2Service = 0;
    private static char ThreeDS2ServiceInitializationCallback = 0;
    private static char ThreeDS2ServiceInstance = 0;
    private static int cleanup = 1;
    private static char get;
    private static int getSDKInfo;
    private static final int getWarnings;
    private static final int initialize;

    static {
        get();
        Object[] objArr = new Object[1];
        a("叨㾼䣥\ue313쐅叩쐅叩Ⳝᷣ", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8, objArr);
        initialize = Color.parseColor(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a("叨㾼靫㿂単ࠑ単ࠑﶜ҃", 9 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
        getWarnings = Color.parseColor(((String) objArr2[0]).intern());
        int i = getSDKInfo + 57;
        cleanup = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 121) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr3 = new char[cArr2.length];
        int i2 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        int i3 = 2;
        char[] cArr4 = new char[2];
        while (true) {
            int i4 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i4 >= cArr2.length) {
                break;
            }
            $10 = ($11 + 19) % 128;
            cArr4[i2] = cArr2[i4];
            char c = 1;
            cArr4[1] = cArr2[i4 + 1];
            int i5 = 58224;
            int i6 = i2;
            while (i6 < 16) {
                char c2 = cArr4[c];
                char c3 = cArr4[i2];
                char c4 = c;
                int i7 = i3;
                char[] cArr5 = cArr4;
                int i8 = (c3 + i5) ^ ((c3 << 4) + ((char) (ThreeDS2Service ^ (-1730380012335540218L))));
                int i9 = c3 >>> 5;
                int i10 = i2;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ThreeDS2ServiceInitializationCallback);
                    objArr2[i7] = Integer.valueOf(i9);
                    objArr2[c4] = Integer.valueOf(i8);
                    objArr2[i10] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj == null) {
                        obj = ((Class) removeParam.initialize(66 - TextUtils.indexOf((CharSequence) "", '0'), (char) (62396 - (ViewConfiguration.getTouchSlop() >> 8)), 5352 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr5[c4] = charValue;
                    char c5 = cArr5[i10];
                    char[] cArr6 = cArr2;
                    int i11 = i5;
                    int i12 = (charValue + i5) ^ ((charValue << 4) + ((char) (get ^ (-1730380012335540218L))));
                    int i13 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(ThreeDS2ServiceInstance);
                    objArr3[i7] = Integer.valueOf(i13);
                    objArr3[c4] = Integer.valueOf(i12);
                    objArr3[i10] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(TextUtils.indexOf("", "", i10) + 67, (char) (62396 - View.resolveSize(i10, i10)), Gravity.getAbsoluteGravity(i10, i10) + 5352)).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr5[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i5 = i11 - 40503;
                    i6++;
                    c = c4;
                    i3 = i7;
                    cArr4 = cArr5;
                    cArr2 = cArr6;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr7 = cArr2;
            int i14 = i3;
            char[] cArr8 = cArr4;
            char c6 = c;
            int i15 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr3[i15] = cArr8[0];
            cArr3[i15 + 1] = cArr8[c6];
            Object[] objArr4 = new Object[i14];
            objArr4[c6] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(54 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 39910), MotionEvent.axisFromString("") + 7060)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            $10 = ($11 + 3) % 128;
            cArr4 = cArr8;
            cArr2 = cArr7;
            i2 = 0;
            i3 = 2;
        }
        String str2 = new String(cArr3, 0, i);
        int i16 = $11 + 55;
        $10 = i16 % 128;
        if (i16 % 2 == 0) {
            objArr[0] = str2;
        } else {
            int i17 = 98 / 0;
            objArr[0] = str2;
        }
    }

    public static <T extends TextView> void bm_(T t, jp jpVar) {
        int i = getSDKInfo + 67;
        cleanup = i % 128;
        if (i % 2 == 0) {
            bn_(t, jpVar, 0);
        } else {
            bn_(t, jpVar, 0);
        }
    }

    public static <T extends TextView> void bn_(T t, jp jpVar, int i) {
        float ThreeDS2ServiceInstance2;
        int i2 = getSDKInfo + 69;
        cleanup = i2 % 128;
        int i3 = 2;
        if (i2 % 2 == 0) {
            t.setTextColor(Color.parseColor(jpVar.get()));
            ThreeDS2ServiceInstance2 = jpVar.ThreeDS2ServiceInstance();
            i3 = 3;
        } else {
            t.setTextColor(Color.parseColor(jpVar.get()));
            ThreeDS2ServiceInstance2 = jpVar.ThreeDS2ServiceInstance();
        }
        t.setTextSize(i3, ThreeDS2ServiceInstance2);
        br_(t, jpVar, i);
    }

    public static void bo_(Button button, jo joVar) {
        int i;
        int i2;
        int warnings = joVar.getWarnings();
        float intValue = ((Integer) nj.ThreeDS2Service(new Object[]{Integer.valueOf(warnings)}, 256526108, -256526107, warnings)).intValue();
        float[] fArr = {intValue, intValue, intValue, intValue, intValue, intValue, intValue, intValue};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, fArr));
        int parseColor = Color.parseColor(joVar.ThreeDS2Service());
        shapeDrawable.getPaint().setColor(parseColor);
        shapeDrawable.getPaint().setAntiAlias(true);
        if (my.ThreeDS2Service(parseColor)) {
            int i3 = cleanup;
            i = initialize;
            i2 = i3 + 23;
        } else {
            i = getWarnings;
            i2 = cleanup + 59;
        }
        getSDKInfo = i2 % 128;
        button.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{i}), shapeDrawable, null));
    }

    public static <T extends EditText> void bp_(T t, jq jqVar) {
        getWarnings(new Object[]{t, jqVar}, -297979556, 297979556, (int) System.currentTimeMillis());
    }

    public static <T extends TextView> void bq_(T t, jr jrVar) {
        cleanup = (getSDKInfo + 93) % 128;
        t.setTextColor(Color.parseColor(jrVar.ThreeDS2Service()));
        t.setTextSize(2, jrVar.getWarnings());
        br_(t, jrVar, om.ThreeDS2Service.intValue());
        getSDKInfo = (cleanup + 53) % 128;
    }

    private static <T extends TextView> void br_(T t, jp jpVar, int i) {
        Typeface create;
        getSDKInfo = (cleanup + 1) % 128;
        try {
            try {
                Context context = t.getContext();
                Resources resources = context.getResources();
                String initialize2 = jpVar.initialize();
                Object[] objArr = new Object[1];
                a("侣\ud8e3\uea3b蒓", 4 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                create = ResourcesCompat.getFont(context, resources.getIdentifier(initialize2, ((String) objArr[0]).intern(), context.getPackageName()));
            } catch (Throwable unused) {
                AssetManager assets = t.getContext().getAssets();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a("侣\ud8e3\uea3b蒓歝苵", 5 - TextUtils.getOffsetBefore("", 0), objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(jpVar.initialize());
                Object[] objArr3 = new Object[1];
                a("菉㯅꾊ⷜ", 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
                sb.append(((String) objArr3[0]).intern());
                create = Typeface.createFromAsset(assets, sb.toString());
            }
        } catch (Throwable unused2) {
            create = Typeface.create(jpVar.initialize(), i);
        }
        if (i != om.ThreeDS2Service.intValue()) {
            t.setTypeface(create, i);
            cleanup = (getSDKInfo + 99) % 128;
            return;
        }
        int i2 = getSDKInfo + 67;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            t.setTypeface(create);
        } else {
            t.setTypeface(create);
            int i3 = 17 / 0;
        }
    }

    public static void get() {
        get = (char) 8152;
        ThreeDS2ServiceInstance = (char) 54607;
        ThreeDS2Service = (char) 53056;
        ThreeDS2ServiceInitializationCallback = (char) 44765;
    }

    public static <T extends View> void getWarnings(T t, String str) {
        int i = cleanup + 111;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            t.setBackgroundColor(Color.parseColor(str));
            throw null;
        }
        t.setBackgroundColor(Color.parseColor(str));
        getSDKInfo = (cleanup + 79) % 128;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        EditText editText = (EditText) objArr[0];
        jq jqVar = (jq) objArr[1];
        int i = cleanup + 97;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            bm_(editText, jqVar);
            int parseColor = Color.parseColor(jqVar.ThreeDS2Service());
            int warnings = jqVar.getWarnings();
            int createTransaction = jqVar.createTransaction();
            editText.setBackground((Drawable) mz.ThreeDS2Service(new Object[]{Integer.valueOf(createTransaction), Integer.valueOf(warnings), Integer.valueOf(parseColor)}, 1964355730, -1964355730, createTransaction));
            throw null;
        }
        bm_(editText, jqVar);
        int parseColor2 = Color.parseColor(jqVar.ThreeDS2Service());
        int warnings2 = jqVar.getWarnings();
        int createTransaction2 = jqVar.createTransaction();
        editText.setBackground((Drawable) mz.ThreeDS2Service(new Object[]{Integer.valueOf(createTransaction2), Integer.valueOf(warnings2), Integer.valueOf(parseColor2)}, 1964355730, -1964355730, createTransaction2));
        cleanup = (getSDKInfo + 101) % 128;
        return null;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return initialize(objArr);
    }
}
