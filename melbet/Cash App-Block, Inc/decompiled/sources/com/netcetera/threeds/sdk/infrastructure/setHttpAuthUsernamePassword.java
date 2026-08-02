package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class setHttpAuthUsernamePassword implements setLayoutAnimationListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static char ThreeDS2ServiceInstance;
    private static int cleanup;
    private static char createTransaction;
    private static char get;
    private static char getSDKInfo;
    static final Locale getWarnings;
    private static final String initialize;

    static {
        getWarnings();
        Object[] objArr = new Object[1];
        a("\ued0e짯", Gravity.getAbsoluteGravity(0, 0) + 1, objArr);
        initialize = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("懇걥", -TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        ThreeDS2Service = ((String) objArr2[0]).intern();
        getWarnings = Locale.US;
        cleanup = (ThreeDS2ServiceInitializationCallback + 95) % 128;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        $11 = ($10 + 95) % 128;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 33) % 128;
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
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            cArr4[i2] = cArr2[i4];
            char c = 1;
            cArr4[1] = cArr2[i4 + 1];
            $10 = ($11 + 75) % 128;
            int i5 = 58224;
            int i6 = i2;
            while (i6 < 16) {
                char c2 = cArr4[c];
                char c3 = cArr4[i2];
                char c4 = c;
                int i7 = (c3 + i5) ^ ((c3 << 4) + ((char) (createTransaction ^ (-1730380012335540218L))));
                int i8 = c3 >>> 5;
                int i9 = i3;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKInfo);
                    objArr2[i9] = Integer.valueOf(i8);
                    objArr2[c4] = Integer.valueOf(i7);
                    objArr2[i2] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    int i10 = i2;
                    if (obj == null) {
                        obj = ((Class) removeParam.initialize((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 66, (char) (AndroidCharacter.getMirror('0') + 62348), 5352 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[c4] = charValue;
                    char c5 = cArr4[i10];
                    char[] cArr5 = cArr2;
                    char[] cArr6 = cArr4;
                    int i11 = (charValue + i5) ^ ((charValue << 4) + ((char) (ThreeDS2ServiceInstance ^ (-1730380012335540218L))));
                    int i12 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(get);
                    objArr3[i9] = Integer.valueOf(i12);
                    objArr3[c4] = Integer.valueOf(i11);
                    objArr3[i10] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(67 - View.resolveSizeAndState(i10, i10, i10), (char) (62397 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 5352 - Color.red(i10))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr6[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    c = c4;
                    i3 = i9;
                    cArr2 = cArr5;
                    cArr4 = cArr6;
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
            int i13 = i3;
            char[] cArr8 = cArr4;
            char c6 = c;
            int i14 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr3[i14] = cArr8[0];
            cArr3[i14 + 1] = cArr8[c6];
            Object[] objArr4 = new Object[i13];
            objArr4[c6] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 54, (char) (39909 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 7058)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            i3 = i13;
            cArr2 = cArr7;
            cArr4 = cArr8;
            i2 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Locale get(Locale locale) {
        boolean z;
        if (locale.getISO3Language() != null) {
            int i = ThreeDS2ServiceInitializationCallback + 87;
            cleanup = i % 128;
            if (i % 2 != 0) {
                locale.getISO3Language().equals("");
                throw null;
            }
            if (!locale.getISO3Language().equals("")) {
                z = true;
                boolean z2 = locale.getISO3Country() == null;
                if (z) {
                    int i2 = (ThreeDS2ServiceInitializationCallback + 53) % 128;
                    cleanup = i2;
                    if (z2) {
                        int i3 = i2 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        int i4 = i3 % 128;
                        ThreeDS2ServiceInitializationCallback = i4;
                        r3 = i3 % 2 != 0;
                        cleanup = (i4 + 5) % 128;
                    }
                }
                if (r3) {
                    throw setTextAlignment.apiKey.initialize(locale);
                }
                return locale;
            }
        }
        z = false;
        if (locale.getISO3Country() == null) {
        }
        if (z) {
        }
        if (r3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Locale getWarnings(String str) {
        String[] strArr;
        int length;
        Object[] objArr = new Object[1];
        a("懇걥", (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr);
        if (str.contains(((String) objArr[0]).intern())) {
            ThreeDS2ServiceInitializationCallback = (cleanup + 119) % 128;
            Object[] objArr2 = new Object[1];
            a("\ued0e짯", (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1, objArr2);
            if (str.contains(((String) objArr2[0]).intern())) {
                int i = ThreeDS2ServiceInitializationCallback + 113;
                cleanup = i % 128;
                int i2 = i % 2;
                strArr = new String[0];
                length = strArr.length;
                if (length != 1) {
                    return new Locale(strArr[0]);
                }
                if (length == 2) {
                    return new Locale(strArr[0], strArr[1]);
                }
                if (length != 3) {
                    throw setTextAlignment.apiKey.initialize(str);
                }
                Locale locale = new Locale(strArr[0], strArr[1], strArr[2]);
                cleanup = (ThreeDS2ServiceInitializationCallback + 5) % 128;
                return locale;
            }
        }
        Object[] objArr3 = new Object[1];
        a("懇걥", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr3);
        if (str.contains(((String) objArr3[0]).intern())) {
            Object[] objArr4 = new Object[1];
            a("懇걥", 1 - TextUtils.getOffsetAfter("", 0), objArr4);
            strArr = str.split(((String) objArr4[0]).intern());
        } else {
            Object[] objArr5 = new Object[1];
            a("\ued0e짯", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
            if (str.contains(((String) objArr5[0]).intern())) {
                Object[] objArr6 = new Object[1];
                a("\ued0e짯", TextUtils.getTrimmedLength("") + 1, objArr6);
                strArr = str.split(((String) objArr6[0]).intern());
            } else {
                strArr = new String[]{str};
            }
        }
        length = strArr.length;
        if (length != 1) {
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener
    public Locale ThreeDS2Service(String str) {
        if (str == null) {
            int i = ThreeDS2ServiceInitializationCallback + 67;
            cleanup = i % 128;
            if (i % 2 == 0) {
                return getWarnings;
            }
            int i2 = 38 / 0;
            return getWarnings;
        }
        Locale locale = get(getWarnings(str));
        int i3 = ThreeDS2ServiceInitializationCallback + 41;
        cleanup = i3 % 128;
        if (i3 % 2 == 0) {
            return locale;
        }
        throw null;
    }

    public static void getWarnings() {
        ThreeDS2ServiceInstance = (char) 44447;
        get = (char) 53642;
        createTransaction = (char) 59179;
        getSDKInfo = (char) 31607;
    }
}
