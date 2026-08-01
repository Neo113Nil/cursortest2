package com.adjust.sdk;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class AdjustPlayStoreSubscription {
    private static ILogger logger = AdjustFactory.getLogger();
    private Map<String, String> callbackParameters;
    private String currency;
    private String orderId;
    private Map<String, String> partnerParameters;
    private long price;
    private long purchaseTime = -1;
    private String purchaseToken;
    private String signature;
    private String sku;

    public AdjustPlayStoreSubscription(long j, String str, String str2, String str3, String str4, String str5) {
        this.price = j;
        this.currency = str;
        this.sku = str2;
        this.orderId = str3;
        this.signature = str4;
        this.purchaseToken = str5;
    }

    public void addCallbackParameter(String str, String str2) {
        if (Util.isValidParameter(str, "key", "Callback") && Util.isValidParameter(str2, "value", "Callback")) {
            Map map = this.callbackParameters;
            if (map == null) {
                map = new LinkedHashMap();
                this.callbackParameters = map;
            }
            if (((String) map.put(str, str2)) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    public void addPartnerParameter(String str, String str2) {
        if (Util.isValidParameter(str, "key", "Partner") && Util.isValidParameter(str2, "value", "Partner")) {
            Map map = this.partnerParameters;
            if (map == null) {
                map = new LinkedHashMap();
                this.partnerParameters = map;
            }
            if (((String) map.put(str, str2)) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    public Map<String, String> getCallbackParameters() {
        return this.callbackParameters;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public Map<String, String> getPartnerParameters() {
        return this.partnerParameters;
    }

    public long getPrice() {
        return this.price;
    }

    public long getPurchaseTime() {
        return this.purchaseTime;
    }

    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSku() {
        return this.sku;
    }

    public void setPurchaseTime(long j) {
        this.purchaseTime = j;
    }
}
