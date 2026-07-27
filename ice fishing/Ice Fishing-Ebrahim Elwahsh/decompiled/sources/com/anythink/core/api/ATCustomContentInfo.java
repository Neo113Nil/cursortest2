package com.anythink.core.api;

/* loaded from: classes.dex */
public class ATCustomContentInfo {
    ATAdInfo atAdInfo;
    double customContentDouble;
    Object customContentObject;
    String customContentString;

    public ATCustomContentInfo(String str, Object obj) {
        this.customContentDouble = -1.0d;
        this.customContentString = str;
        this.customContentObject = obj;
    }

    public ATAdInfo getAdInfo() {
        return this.atAdInfo;
    }

    public double getCustomContentDouble() {
        return this.customContentDouble;
    }

    public Object getCustomContentObject() {
        return this.customContentObject;
    }

    public String getCustomContentString() {
        return this.customContentString;
    }

    public void setATAdInfo(ATAdInfo aTAdInfo) {
        this.atAdInfo = aTAdInfo;
    }

    public String toString() {
        return "ATCustomContentInfo{customContentString='" + this.customContentString + "', customContentDouble=" + this.customContentDouble + ", customContentObject=" + this.customContentObject + '}';
    }

    public ATCustomContentInfo(double d2, Object obj) {
        this.customContentDouble = d2;
        this.customContentObject = obj;
    }
}
