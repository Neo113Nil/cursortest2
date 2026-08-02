package com.knotapi.knot.models;

import com.knotapi.knot.Knot;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class KnotEvent {
    private Environment environment;
    private String event;
    private Knot.Product product;
    private String taskId;
    private String merchantName = "";
    private String merchantId = "";
    private Map<String, Object> metaData = new HashMap();

    public Environment getEnvironment() {
        return this.environment;
    }

    public String getEvent() {
        return this.event;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public Map<String, Object> getMetaData() {
        return this.metaData;
    }

    public Knot.Product getProduct() {
        return this.product;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setMetaData(Map<String, Object> map) {
        this.metaData = map;
    }

    public void setMetaDataEntry(String str, Object obj) {
        this.metaData.put(str, obj);
    }

    public void setProduct(Knot.Product product) {
        this.product = product;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }
}
