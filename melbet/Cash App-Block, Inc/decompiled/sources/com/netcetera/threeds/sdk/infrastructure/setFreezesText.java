package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.knotapi.knot.utilities.Constants;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class setFreezesText {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char cleanup = 39973;
    private static int createTransaction = 0;
    private static char get = 31155;
    private static char getSDKInfo = 56926;
    private static int getSDKVersion = 1;
    private static char getWarnings = 37341;
    private final ExecutorService ThreeDS2Service;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{setFreezesText.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final setFocusedSearchResultHighlightColor initialize;

    public setFreezesText(setFocusedSearchResultHighlightColor setfocusedsearchresulthighlightcolor, ExecutorService executorService) {
        this.initialize = setfocusedsearchresulthighlightcolor;
        this.ThreeDS2Service = executorService;
    }

    private /* synthetic */ Bitmap A_(String str) {
        int i = getSDKVersion + 119;
        createTransaction = i % 128;
        Bitmap y_ = this.initialize.y_(str, i % 2 != 0);
        getSDKVersion = (createTransaction + 69) % 128;
        return y_;
    }

    private static /* synthetic */ Bitmap B_() {
        int i = (getSDKVersion + 19) % 128;
        createTransaction = i;
        getSDKVersion = (i + 77) % 128;
        return null;
    }

    public static /* synthetic */ Bitmap C_(setFreezesText setfreezestext, String str) {
        createTransaction = (getSDKVersion + 109) % 128;
        Bitmap A_ = setfreezestext.A_(str);
        createTransaction = (getSDKVersion + 101) % 128;
        return A_;
    }

    public static /* synthetic */ Bitmap D_() {
        int i = getSDKVersion + 3;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            return B_();
        }
        int i2 = 7 / 0;
        return B_();
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setFreezesText setfreezestext = new setFreezesText(setTextKeepState.ThreeDS2Service((setPictureListener) setPictureListener.getWarnings(new Object[0], -2036580896, 2036580897, (int) System.currentTimeMillis())), Executors.newFixedThreadPool(2));
        int i = createTransaction + 37;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return setfreezestext;
        }
        throw null;
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2;
        int i3;
        $10 = ($11 + 35) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr = new char[charArray.length];
        int i4 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        int i5 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i6 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i6 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i);
                return;
            }
            int i7 = $11 + 69;
            $10 = i7 % 128;
            int i8 = 58224;
            char c = 1;
            if (i7 % i5 != 0) {
                cArr2[1] = charArray[i6];
                cArr2[i4] = charArray[i6 / 0];
                i2 = 1;
            } else {
                cArr2[i4] = charArray[i6];
                cArr2[1] = charArray[i6 + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                $11 = ($10 + 61) % 128;
                char c2 = cArr2[c];
                char c3 = cArr2[i4];
                int i9 = i5;
                char[] cArr3 = cArr2;
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (cleanup ^ (-1730380012335540218L))));
                int i11 = c3 >>> 5;
                char c4 = c;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKInfo);
                    objArr2[i9] = Integer.valueOf(i11);
                    objArr2[c4] = Integer.valueOf(i10);
                    objArr2[i4] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        i3 = i4;
                    } else {
                        i3 = i4;
                        obj = ((Class) removeParam.initialize(67 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (62395 - TextUtils.lastIndexOf("", '0', i4)), 5352 - Color.blue(i3))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr3[c4] = charValue;
                    char c5 = cArr3[i3];
                    char[] cArr4 = charArray;
                    int i12 = i2;
                    int i13 = (charValue + i8) ^ ((charValue << 4) + ((char) (getWarnings ^ (-1730380012335540218L))));
                    int i14 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(get);
                    objArr3[i9] = Integer.valueOf(i14);
                    objArr3[c4] = Integer.valueOf(i13);
                    objArr3[i3] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        int i15 = i3;
                        obj2 = ((Class) removeParam.initialize(66 - TextUtils.lastIndexOf("", '0'), (char) (KeyEvent.getDeadChar(i15, i15) + 62396), Color.blue(i15) + 5352)).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr3[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2 = i12 + 1;
                    c = c4;
                    i5 = i9;
                    cArr2 = cArr3;
                    charArray = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = charArray;
            int i16 = i5;
            char[] cArr6 = cArr2;
            char c6 = c;
            int i17 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr[i17] = cArr6[0];
            cArr[i17 + 1] = cArr6[c6];
            Object[] objArr4 = new Object[i16];
            objArr4[c6] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 54, (char) (39910 - View.getDefaultSize(0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7058)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            i5 = i16;
            cArr2 = cArr6;
            charArray = cArr5;
            i4 = 0;
        }
    }

    public static setFreezesText get() {
        return (setFreezesText) get(new Object[0], 988694001, -988694001, (int) System.currentTimeMillis());
    }

    private Bitmap z_(Future<Bitmap> future) {
        try {
            if (!future.isCancelled()) {
                Bitmap bitmap = future.get();
                createTransaction = (getSDKVersion + 117) % 128;
                return bitmap;
            }
            int i = getSDKVersion + 33;
            createTransaction = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        } catch (InterruptedException | ExecutionException e) {
            no noVar = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            a("\udea0燑郥\ue790⥏䥬䁚蘻젅夜훇岮\uea90僃돮캲빚㝗챊⏅䍽ᑨٽ\uf0ef꽇㮌", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, objArr);
            noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), e);
            return null;
        }
    }

    public initialize getWarnings(String str, String str2, String str3, String str4) {
        Callable<Bitmap> ThreeDS2Service = ThreeDS2Service(str);
        Callable<Bitmap> ThreeDS2Service2 = ThreeDS2Service(str2);
        Callable<Bitmap> ThreeDS2Service3 = ThreeDS2Service(str3);
        Callable<Bitmap> ThreeDS2Service4 = ThreeDS2Service(str4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ThreeDS2Service);
        arrayList.add(ThreeDS2Service2);
        arrayList.add(ThreeDS2Service3);
        arrayList.add(ThreeDS2Service4);
        try {
            List invokeAll = this.ThreeDS2Service.invokeAll(arrayList, 10L, TimeUnit.SECONDS);
            initialize initializeVar = (initialize) initialize.ThreeDS2ServiceInstance(new Object[]{z_((Future) invokeAll.get(0)), z_((Future) invokeAll.get(1)), z_((Future) invokeAll.get(2)), z_((Future) invokeAll.get(3))}, 2099755505, -2099755505, (int) System.currentTimeMillis());
            getSDKVersion = (createTransaction + 15) % 128;
            return initializeVar;
        } catch (InterruptedException | RuntimeException e) {
            no noVar = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            a("\udea0燑郥\ue790⥏䥬䁚蘻젅夜훇岮\uea90僃돮캲빚㝗䁚蘻된䊈챊⏅\ue805툜혴퐪튎坿ᒶ戉⢗\udc78ቔ\u1a9cꚯ\u0cceᇻ\udf19ሐ㍍䞪采诛⚭⯦븑챊⏅䍽ᑨٽ\uf0ef\uefc4⻈", AndroidCharacter.getMirror('0') + '\b', objArr);
            noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), e);
            return (initialize) initialize.ThreeDS2ServiceInstance(new Object[0], -719744594, 719744595, (int) System.currentTimeMillis());
        }
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2Service(objArr);
    }

    public static final class initialize {
        private static int ThreeDS2ServiceInitializationCallback = 1;
        private static int initialize;
        private final Bitmap ThreeDS2Service;
        private final Bitmap ThreeDS2ServiceInstance;
        private final Bitmap get;
        private final Bitmap getWarnings;

        private initialize(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
            this.get = bitmap;
            this.getWarnings = bitmap2;
            this.ThreeDS2Service = bitmap3;
            this.ThreeDS2ServiceInstance = bitmap4;
        }

        public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
            int i4 = (i2 * Constants.ID_KROGER) + (i * Constants.ID_KROGER);
            int i5 = ~i3;
            int i6 = ((i | i2 | i5) * (-369)) + i4;
            int i7 = (~i) | i5;
            return ((((~(i | i3)) | (~((~i2) | i))) | (~(i2 | i7))) * 369) + ((((~i7) | i2) * (-369)) + i6) != 1 ? ThreeDS2ServiceInstance(objArr) : getWarnings(objArr);
        }

        private static /* synthetic */ Object getWarnings(Object[] objArr) {
            initialize initializeVar = new initialize(null, null, null, null);
            int i = ThreeDS2ServiceInitializationCallback;
            int i2 = i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            int i3 = (i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i2;
            int i4 = (i2 & i3) + (i3 | i2);
            initialize = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 68 / 0;
            }
            return initializeVar;
        }

        public Bitmap F_() {
            int i = ThreeDS2ServiceInitializationCallback;
            int i2 = (i & 51) + (i | 51);
            initialize = i2 % 128;
            int i3 = i2 % 2;
            Bitmap bitmap = this.get;
            if (i3 != 0) {
                int i4 = 54 / 0;
            }
            return bitmap;
        }

        public Bitmap G_() {
            int i = initialize;
            Bitmap bitmap = this.getWarnings;
            int i2 = i + 13;
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return bitmap;
            }
            throw null;
        }

        public Bitmap H_() {
            int i = ThreeDS2ServiceInitializationCallback;
            Bitmap bitmap = this.ThreeDS2Service;
            int i2 = i & 5;
            int i3 = -(-(i | 5));
            initialize = ((i2 & i3) + (i3 | i2)) % 128;
            return bitmap;
        }

        public Bitmap I_() {
            int i = ThreeDS2ServiceInitializationCallback;
            int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) << 1, i ^ EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 1, 128);
            initialize = m$1;
            Bitmap bitmap = this.ThreeDS2ServiceInstance;
            int i2 = m$1 + 41;
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return bitmap;
            }
            throw null;
        }

        private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
            initialize initializeVar = new initialize((Bitmap) objArr[0], (Bitmap) objArr[1], (Bitmap) objArr[2], (Bitmap) objArr[3]);
            int i = initialize;
            int i2 = (i & 115) + (i | 115);
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return initializeVar;
            }
            throw null;
        }
    }

    private Callable<Bitmap> ThreeDS2Service(String str) {
        if (str != null) {
            return new setImeActionLabel(this, str);
        }
        getSDKVersion = (createTransaction + 119) % 128;
        setEditableFactory seteditablefactory = setEditableFactory.getWarnings;
        int i = getSDKVersion + 71;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            int i2 = 42 / 0;
        }
        return seteditablefactory;
    }
}
