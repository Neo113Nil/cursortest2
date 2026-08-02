package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFg1dSDK {
    private StringBuilder getMediationNetwork = new StringBuilder();
    private final List<AFa1zSDK> getMonetizationNetwork = new ArrayList();
    private final String AFAdRevenueData = null;

    public enum AFa1zSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public final void AFAdRevenueData(String str) {
        this.getMediationNetwork.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                this.getMediationNetwork.append("\\f");
            } else if (charAt == '\r') {
                this.getMediationNetwork.append("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
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
                        StringBuilder sb = this.getMediationNetwork;
                        if (charAt <= 31) {
                            sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            sb.append(charAt);
                            break;
                        }
                }
            } else {
                StringBuilder sb2 = this.getMediationNetwork;
                sb2.append('\\');
                sb2.append(charAt);
            }
        }
        this.getMediationNetwork.append("\"");
    }

    public final AFg1dSDK getCurrencyIso4217Code(Object obj) {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFg1mSDK("Nesting problem");
        }
        if (((Class) AFa1hSDK.getRevenue(TextUtils.indexOf((CharSequence) "", '0', 0) + EnumC0170g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, (char) (Drawable.resolveOpacity(0, 0) + 31687), (ViewConfiguration.getTouchSlop() >> 8) + 36)).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Map map = AFa1hSDK.d;
                Object obj2 = map.get(-811011778);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1hSDK.getRevenue((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31686), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 35)).getDeclaredMethod("getCurrencyIso4217Code", AFg1dSDK.class);
                    map.put(-811011778, obj2);
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
        if (obj instanceof AFg1gSDK) {
            ((AFg1gSDK) obj).getCurrencyIso4217Code(this);
            return this;
        }
        AFAdRevenueData();
        if (obj == null || (obj instanceof Boolean) || obj == AFg1gSDK.getRevenue) {
            this.getMediationNetwork.append(obj);
            return this;
        }
        if (obj instanceof Number) {
            this.getMediationNetwork.append(AFg1gSDK.getCurrencyIso4217Code((Number) obj));
            return this;
        }
        AFAdRevenueData(obj.toString());
        return this;
    }

    public final AFg1dSDK getMediationNetwork(AFa1zSDK aFa1zSDK, String str) {
        if (this.getMonetizationNetwork.isEmpty() && this.getMediationNetwork.length() > 0) {
            throw new AFg1mSDK("Nesting problem: multiple top-level roots");
        }
        AFAdRevenueData();
        this.getMonetizationNetwork.add(aFa1zSDK);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final void getMonetizationNetwork() {
        AFa1zSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork == AFa1zSDK.NONEMPTY_OBJECT) {
            this.getMediationNetwork.append(',');
        } else if (mediationNetwork != AFa1zSDK.EMPTY_OBJECT) {
            throw new AFg1mSDK("Nesting problem");
        }
        AFa1zSDK aFa1zSDK = AFa1zSDK.DANGLING_KEY;
        this.getMonetizationNetwork.set(r2.size() - 1, aFa1zSDK);
    }

    public final String toString() {
        if (this.getMediationNetwork.length() == 0) {
            return null;
        }
        return this.getMediationNetwork.toString();
    }

    private AFa1zSDK getMediationNetwork() {
        if (!this.getMonetizationNetwork.isEmpty()) {
            return this.getMonetizationNetwork.get(r1.size() - 1);
        }
        throw new AFg1mSDK("Nesting problem");
    }

    public final AFg1dSDK getMonetizationNetwork(AFa1zSDK aFa1zSDK, AFa1zSDK aFa1zSDK2, String str) {
        AFa1zSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork != aFa1zSDK2 && mediationNetwork != aFa1zSDK) {
            throw new AFg1mSDK("Nesting problem");
        }
        this.getMonetizationNetwork.remove(r2.size() - 1);
        this.getMediationNetwork.append(str);
        return this;
    }

    private void AFAdRevenueData() {
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1zSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork == AFa1zSDK.EMPTY_ARRAY) {
            AFa1zSDK aFa1zSDK = AFa1zSDK.NONEMPTY_ARRAY;
            this.getMonetizationNetwork.set(r2.size() - 1, aFa1zSDK);
        } else {
            if (mediationNetwork == AFa1zSDK.NONEMPTY_ARRAY) {
                this.getMediationNetwork.append(',');
                return;
            }
            if (mediationNetwork == AFa1zSDK.DANGLING_KEY) {
                this.getMediationNetwork.append(":");
                AFa1zSDK aFa1zSDK2 = AFa1zSDK.NONEMPTY_OBJECT;
                this.getMonetizationNetwork.set(r2.size() - 1, aFa1zSDK2);
                return;
            }
            if (mediationNetwork != AFa1zSDK.NULL) {
                throw new AFg1mSDK("Nesting problem");
            }
        }
    }
}
