package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class bc extends ac {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1141902353;

    public bc(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, String str, boolean z, int i2, int i3, Object[] objArr) {
        Throwable cause;
        int i4;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr = new char[i];
        int i5 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i6 = getsdkinfo.getWarnings;
            if (i6 >= i) {
                break;
            }
            $11 = ($10 + 43) % 128;
            char c = charArray[i6];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i2 + c);
            cArr[i6] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(get);
                objArr2[i5] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i4 = i5;
                    method = obj;
                } else {
                    i4 = i5;
                    Class cls = (Class) removeParam.initialize(View.MeasureSpec.getSize(i5) + 67, (char) (45768 - (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4879);
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                }
                cArr[i6] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i4] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    int i7 = i4;
                    obj2 = ((Class) removeParam.initialize(((byte) KeyEvent.getModifierMetaStateMask()) + 60, (char) View.combineMeasuredStates(i7, i7), 12372 - TextUtils.lastIndexOf("", '0'))).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                $11 = ($10 + 111) % 128;
                i5 = 0;
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
        if (i3 > 0) {
            getsdkinfo.get = i3;
            char[] cArr2 = new char[i];
            System.arraycopy(cArr, 0, cArr2, 0, i);
            int i8 = getsdkinfo.get;
            System.arraycopy(cArr2, 0, cArr, i - i8, i8);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr2, i9, cArr, 0, i - i9);
            $10 = ($11 + 17) % 128;
        }
        if (z) {
            $11 = ($10 + 47) % 128;
            char[] cArr3 = new char[i];
            getsdkinfo.getWarnings = 0;
            while (true) {
                int i10 = getsdkinfo.getWarnings;
                if (i10 >= i) {
                    break;
                }
                cArr3[i10] = cArr[(i - i10) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(58 - ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12373)).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ac
    public Drawable aG_() {
        int i = es.ThreeDS2Service;
        float[] fArr = {i, i, i, i, i, i, i, i};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, fArr));
        Object[] objArr = new Object[1];
        c(7 - TextUtils.getCapsMode("", 0, 0), "ￇ\n\n\n\n\n\n", false, 159 - AndroidCharacter.getMirror('0'), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, objArr);
        shapeDrawable.getPaint().setColor(Color.parseColor(((String) objArr[0]).intern()));
        shapeDrawable.getPaint().setAntiAlias(true);
        int i2 = ThreeDS2Service + 65;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return shapeDrawable;
        }
        throw null;
    }
}
