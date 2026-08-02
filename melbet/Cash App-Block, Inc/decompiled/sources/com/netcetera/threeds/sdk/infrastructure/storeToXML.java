package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class storeToXML extends loadFromXML<Toolbar> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char ThreeDS2ServiceInitializationCallback = 0;
    private static final int ThreeDS2ServiceInstance;
    private static int addParam = 0;
    private static char cleanup = 0;
    private static final int get;
    private static int getParamValue = 1;
    private static char getSDKInfo;
    private static char getSDKVersion;
    private final jo ThreeDS2Service;
    private computeIfAbsent createTransaction;
    private final jw getWarnings;

    static {
        getWarnings();
        get = ((Integer) nj.ThreeDS2Service(new Object[]{56}, 256526108, -256526107, 56)).intValue();
        ThreeDS2ServiceInstance = ((Integer) nj.ThreeDS2Service(new Object[]{4}, 256526108, -256526107, 4)).intValue();
        getParamValue = (addParam + 97) % 128;
    }

    public storeToXML(Context context, jw jwVar, jo joVar) {
        super(context);
        this.getWarnings = jwVar;
        this.ThreeDS2Service = joVar;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2 = $11 + 41;
        $10 = i2 % 128;
        int i3 = 2;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 67) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr3 = new char[cArr2.length];
        int i4 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i5 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i5 >= cArr2.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            $10 = ($11 + 45) % 128;
            cArr4[i4] = cArr2[i5];
            char c = 1;
            cArr4[1] = cArr2[i5 + 1];
            int i6 = 58224;
            int i7 = i4;
            while (i7 < 16) {
                $10 = ($11 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                char c2 = cArr4[c];
                char c3 = cArr4[i4];
                char c4 = c;
                int i8 = i3;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (getSDKVersion ^ (-1730380012335540218L))));
                int i10 = c3 >>> 5;
                int i11 = i4;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(cleanup);
                    objArr2[i8] = Integer.valueOf(i10);
                    objArr2[c4] = Integer.valueOf(i9);
                    objArr2[i11] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj == null) {
                        obj = ((Class) removeParam.initialize(Color.rgb(i11, i11, i11) + 16777283, (char) (62396 - TextUtils.indexOf("", "", i11)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5351)).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[c4] = charValue;
                    char c5 = cArr4[0];
                    char[] cArr5 = cArr2;
                    char[] cArr6 = cArr4;
                    int i12 = (charValue + i6) ^ ((charValue << 4) + ((char) (ThreeDS2ServiceInitializationCallback ^ (-1730380012335540218L))));
                    int i13 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getSDKInfo);
                    objArr3[i8] = Integer.valueOf(i13);
                    objArr3[c4] = Integer.valueOf(i12);
                    objArr3[0] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(68 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62395), (-16771864) - Color.rgb(0, 0, 0))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr6[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c = c4;
                    i3 = i8;
                    cArr2 = cArr5;
                    cArr4 = cArr6;
                    i4 = 0;
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
                obj3 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0') + 55, (char) (View.getDefaultSize(0, 0) + 39910), (ViewConfiguration.getScrollBarSize() >> 8) + 7059)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            i3 = i14;
            cArr2 = cArr7;
            cArr4 = cArr8;
            i4 = 0;
        }
    }

    public static void getWarnings() {
        ThreeDS2ServiceInitializationCallback = (char) 54973;
        getSDKInfo = (char) 46739;
        getSDKVersion = (char) 19896;
        cleanup = (char) 38831;
    }

    private /* synthetic */ void initialize(View view) {
        computeIfAbsent computeifabsent = this.createTransaction;
        Object[] objArr = new Object[1];
        a("퓫\ued01\uf49f晼妜\u1a8d\ud9fdᇉ", TextUtils.lastIndexOf("", '0') + 9, objArr);
        computeifabsent.get(new bg(((String) objArr[0]).intern()));
        getParamValue = (addParam + 21) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        int i = getParamValue + 53;
        addParam = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ Toolbar ThreeDS2ServiceInstance(Context context) {
        int i = getParamValue + 33;
        addParam = i % 128;
        int i2 = i % 2;
        Toolbar ae_ = ae_(context);
        if (i2 != 0) {
            int i3 = 0 / 0;
        }
        int i4 = getParamValue + 69;
        addParam = i4 % 128;
        if (i4 % 2 == 0) {
            return ae_;
        }
        throw null;
    }

    public Toolbar ae_(Context context) {
        Toolbar toolbar = new Toolbar(context);
        toolbar.setElevation(ThreeDS2ServiceInstance);
        toolbar.setContentInsetsAbsolute(0, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setMinimumHeight(get);
        linearLayout.setVerticalGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        TextView textView = new TextView(context);
        textView.setGravity(8388627);
        int i = es.getWarnings;
        int i2 = es.ThreeDS2Service;
        textView.setPadding(i, i2, i, i2);
        textView.setLayoutParams(layoutParams2);
        Button button = new Button(context);
        button.setTransformationMethod(null);
        button.setStateListAnimator(null);
        button.setText(this.getWarnings.ThreeDS2Service());
        button.setOnClickListener(new store(this));
        Object[] objArr = new Object[1];
        a("赧辌܌㭒靬䍧群\ud974蕆ᛞ䝗ﱐ㐠肛枻澡\udae2ꒄ潅射", (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 18, objArr);
        getWarnings(button, ((String) objArr[0]).intern());
        linearLayout.addView(textView);
        linearLayout.addView(button);
        toolbar.addView(linearLayout);
        et.bm_(textView, this.getWarnings);
        textView.setText(this.getWarnings.getWarnings());
        et.bm_(button, this.ThreeDS2Service);
        et.bo_(button, this.ThreeDS2Service);
        addParam = (getParamValue + 53) % 128;
        return toolbar;
    }

    public void ThreeDS2ServiceInstance(computeIfAbsent computeifabsent) {
        int i = addParam;
        this.createTransaction = computeifabsent;
        int i2 = i + 79;
        getParamValue = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
    }

    public static /* synthetic */ void initialize(storeToXML storetoxml, View view) {
        getParamValue = (addParam + 3) % 128;
        storetoxml.initialize(view);
        int i = addParam + 105;
        getParamValue = i % 128;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }
}
