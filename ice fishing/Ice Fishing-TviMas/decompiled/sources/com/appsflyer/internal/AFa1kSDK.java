package com.appsflyer.internal;

import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AFa1kSDK {
    private StringBuilder getMediationNetwork = new StringBuilder();
    private final List<AFa1ySDK> AFAdRevenueData = new ArrayList();
    private final String getCurrencyIso4217Code = null;

    enum AFa1ySDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
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

    public final AFa1kSDK AFAdRevenueData(AFa1ySDK aFa1ySDK, AFa1ySDK aFa1ySDK2, String str) throws AFa1gSDK {
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork != aFa1ySDK2 && monetizationNetwork != aFa1ySDK) {
            throw new AFa1gSDK("Nesting problem");
        }
        this.AFAdRevenueData.remove(r2.size() - 1);
        this.getMediationNetwork.append(str);
        return this;
    }

    private AFa1ySDK getMonetizationNetwork() throws AFa1gSDK {
        if (this.AFAdRevenueData.isEmpty()) {
            throw new AFa1gSDK("Nesting problem");
        }
        return this.AFAdRevenueData.get(r0.size() - 1);
    }

    public final AFa1kSDK getMonetizationNetwork(Object obj) throws AFa1gSDK {
        if (this.AFAdRevenueData.isEmpty()) {
            throw new AFa1gSDK("Nesting problem");
        }
        if (((Class) AFa1vSDK.getRevenue(37 - View.resolveSize(0, 0), 159 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - Process.getGidForName("")))).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Object obj2 = AFa1vSDK.registerClient.get(1161076700);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1vSDK.getRevenue(((byte) KeyEvent.getModifierMetaStateMask()) + 38, (ViewConfiguration.getJumpTapTimeout() >> 16) + 159, (char) (ViewConfiguration.getWindowTouchSlop() >> 8))).getDeclaredMethod("getCurrencyIso4217Code", AFa1kSDK.class);
                    AFa1vSDK.registerClient.put(1161076700, obj2);
                }
                ((Method) obj2).invoke(obj, objArr);
                return this;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
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

    final void getMediationNetwork(String str) {
        this.getMediationNetwork.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt == '\"' || charAt == '/' || charAt == '\\') {
                        this.getMediationNetwork.append('\\').append(charAt);
                    } else {
                        switch (charAt) {
                            case '\b':
                                this.getMediationNetwork.append("\\b");
                                break;
                            case '\t':
                                this.getMediationNetwork.append("\\t");
                                break;
                            case '\n':
                                this.getMediationNetwork.append("\\n");
                                break;
                            default:
                                if (charAt <= 31) {
                                    this.getMediationNetwork.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                                    break;
                                } else {
                                    this.getMediationNetwork.append(charAt);
                                    break;
                                }
                        }
                    }
                } else {
                    this.getMediationNetwork.append("\\r");
                }
            } else {
                this.getMediationNetwork.append("\\f");
            }
        }
        this.getMediationNetwork.append("\"");
    }

    final void getCurrencyIso4217Code() throws AFa1gSDK {
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1ySDK.NONEMPTY_OBJECT) {
            this.getMediationNetwork.append(',');
        } else if (monetizationNetwork != AFa1ySDK.EMPTY_OBJECT) {
            throw new AFa1gSDK("Nesting problem");
        }
        AFa1ySDK aFa1ySDK = AFa1ySDK.DANGLING_KEY;
        this.AFAdRevenueData.set(r1.size() - 1, aFa1ySDK);
    }

    private void getMediationNetwork() throws AFa1gSDK {
        if (this.AFAdRevenueData.isEmpty()) {
            return;
        }
        AFa1ySDK monetizationNetwork = getMonetizationNetwork();
        if (monetizationNetwork == AFa1ySDK.EMPTY_ARRAY) {
            AFa1ySDK aFa1ySDK = AFa1ySDK.NONEMPTY_ARRAY;
            this.AFAdRevenueData.set(r1.size() - 1, aFa1ySDK);
        } else {
            if (monetizationNetwork == AFa1ySDK.NONEMPTY_ARRAY) {
                this.getMediationNetwork.append(',');
                return;
            }
            if (monetizationNetwork == AFa1ySDK.DANGLING_KEY) {
                this.getMediationNetwork.append(":");
                AFa1ySDK aFa1ySDK2 = AFa1ySDK.NONEMPTY_OBJECT;
                this.AFAdRevenueData.set(r1.size() - 1, aFa1ySDK2);
                return;
            }
            if (monetizationNetwork != AFa1ySDK.NULL) {
                throw new AFa1gSDK("Nesting problem");
            }
        }
    }

    public final String toString() {
        if (this.getMediationNetwork.length() == 0) {
            return null;
        }
        return this.getMediationNetwork.toString();
    }
}
