package com.appsflyer.internal;

import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1kSDK {
    private StringBuilder getMediationNetwork = new StringBuilder();
    private final List<AFa1ySDK> AFAdRevenueData = new ArrayList();
    private final String getCurrencyIso4217Code = null;

    public enum AFa1ySDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private void getMediationNetwork() throws AFa1gSDK {
        if (this.AFAdRevenueData.isEmpty()) {
            return;
        }
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1ySDK.EMPTY_ARRAY) {
            AFa1ySDK aFa1ySDK = AFa1ySDK.NONEMPTY_ARRAY;
            List<AFa1ySDK> list = this.AFAdRevenueData;
            list.set(list.size() - 1, aFa1ySDK);
        } else {
            if (monetizationNetwork == AFa1ySDK.NONEMPTY_ARRAY) {
                this.getMediationNetwork.append(',');
                return;
            }
            if (monetizationNetwork != AFa1ySDK.DANGLING_KEY) {
                if (monetizationNetwork != AFa1ySDK.NULL) {
                    throw new AFa1gSDK("Nesting problem");
                }
            } else {
                this.getMediationNetwork.append(":");
                AFa1ySDK aFa1ySDK2 = AFa1ySDK.NONEMPTY_OBJECT;
                List<AFa1ySDK> list2 = this.AFAdRevenueData;
                list2.set(list2.size() - 1, aFa1ySDK2);
            }
        }
    }

    private AFa1ySDK getMonetizationNetwork() throws AFa1gSDK {
        if (this.AFAdRevenueData.isEmpty()) {
            throw new AFa1gSDK("Nesting problem");
        }
        List<AFa1ySDK> list = this.AFAdRevenueData;
        return list.get(list.size() - 1);
    }

    public final AFa1kSDK AFAdRevenueData(AFa1ySDK aFa1ySDK, AFa1ySDK aFa1ySDK2, String str) throws AFa1gSDK {
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork != aFa1ySDK2 && monetizationNetwork != aFa1ySDK) {
            throw new AFa1gSDK("Nesting problem");
        }
        List<AFa1ySDK> list = this.AFAdRevenueData;
        list.remove(list.size() - 1);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final void getCurrencyIso4217Code() throws AFa1gSDK {
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1ySDK.NONEMPTY_OBJECT) {
            this.getMediationNetwork.append(',');
        } else if (monetizationNetwork != AFa1ySDK.EMPTY_OBJECT) {
            throw new AFa1gSDK("Nesting problem");
        }
        AFa1ySDK aFa1ySDK = AFa1ySDK.DANGLING_KEY;
        List<AFa1ySDK> list = this.AFAdRevenueData;
        list.set(list.size() - 1, aFa1ySDK);
    }

    public final String toString() {
        if (this.getMediationNetwork.length() == 0) {
            return null;
        }
        return this.getMediationNetwork.toString();
    }

    public final AFa1kSDK AFAdRevenueData(AFa1ySDK aFa1ySDK, String str) throws AFa1gSDK {
        if (this.AFAdRevenueData.isEmpty() && this.getMediationNetwork.length() > 0) {
            throw new AFa1gSDK("Nesting problem: multiple top-level roots");
        }
        getMediationNetwork();
        this.AFAdRevenueData.add(aFa1ySDK);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final void getMediationNetwork(String str) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        this.getMediationNetwork.append("\"");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\f') {
                sb = this.getMediationNetwork;
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"' || cCharAt == '/' || cCharAt == '\\') {
                    sb2 = this.getMediationNetwork;
                    sb2.append('\\');
                } else {
                    switch (cCharAt) {
                        case '\b':
                            sb = this.getMediationNetwork;
                            str2 = "\\b";
                            break;
                        case '\t':
                            sb = this.getMediationNetwork;
                            str2 = "\\t";
                            break;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            sb = this.getMediationNetwork;
                            str2 = "\\n";
                            break;
                        default:
                            if (cCharAt <= 31) {
                                this.getMediationNetwork.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            } else {
                                sb2 = this.getMediationNetwork;
                            }
                            break;
                    }
                }
                sb2.append(cCharAt);
            } else {
                sb = this.getMediationNetwork;
                str2 = "\\r";
            }
            sb.append(str2);
        }
        this.getMediationNetwork.append("\"");
    }

    public final AFa1kSDK getMonetizationNetwork(Object obj) throws Throwable {
        if (this.AFAdRevenueData.isEmpty()) {
            throw new AFa1gSDK("Nesting problem");
        }
        if (!((Class) AFa1vSDK.getRevenue(37 - View.resolveSize(0, 0), 159 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - Process.getGidForName("")))).isInstance(obj)) {
            if (obj instanceof AFa1lSDK) {
                ((AFa1lSDK) obj).getCurrencyIso4217Code(this);
                return this;
            }
            getMediationNetwork();
            if (obj == null || (obj instanceof Boolean) || obj == AFa1lSDK.AFAdRevenueData) {
                this.getMediationNetwork.append(obj);
            } else if (obj instanceof Number) {
                this.getMediationNetwork.append(AFa1lSDK.getCurrencyIso4217Code((Number) obj));
            } else {
                getMediationNetwork(obj.toString());
            }
            return this;
        }
        try {
            Object[] objArr = {this};
            Map map = AFa1vSDK.registerClient;
            Object declaredMethod = map.get(1161076700);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1vSDK.getRevenue(((byte) KeyEvent.getModifierMetaStateMask()) + 38, (ViewConfiguration.getJumpTapTimeout() >> 16) + 159, (char) (ViewConfiguration.getWindowTouchSlop() >> 8))).getDeclaredMethod("getCurrencyIso4217Code", AFa1kSDK.class);
                map.put(1161076700, declaredMethod);
            }
            ((Method) declaredMethod).invoke(obj, objArr);
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
