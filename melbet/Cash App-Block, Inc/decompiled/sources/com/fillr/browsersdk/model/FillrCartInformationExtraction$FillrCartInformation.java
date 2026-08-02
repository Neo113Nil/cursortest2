package com.fillr.browsersdk.model;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class FillrCartInformationExtraction$FillrCartInformation {
    public final Integer cart_total_qty;
    public final String currency;
    public final long currentTimestamp;
    public String json;
    public final String pageUrl;
    public final ArrayList products;
    public final Integer subtotal;
    public final Integer total;
    public final String version;

    public FillrCartInformationExtraction$FillrCartInformation(String str, Integer num, Integer num2, String str2, ArrayList arrayList, String str3, Integer num3, long j) {
        this.pageUrl = str;
        this.total = num;
        this.subtotal = num2;
        this.currency = str2;
        this.products = arrayList;
        this.version = str3;
        this.cart_total_qty = num3;
        this.currentTimestamp = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillrCartInformationExtraction$FillrCartInformation)) {
            return false;
        }
        FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation = (FillrCartInformationExtraction$FillrCartInformation) obj;
        return Objects.equals(this.total, fillrCartInformationExtraction$FillrCartInformation.total) && Objects.equals(this.subtotal, fillrCartInformationExtraction$FillrCartInformation.subtotal) && Objects.equals(this.currency, fillrCartInformationExtraction$FillrCartInformation.currency) && this.products.equals(fillrCartInformationExtraction$FillrCartInformation.products) && Objects.equals(this.pageUrl, fillrCartInformationExtraction$FillrCartInformation.pageUrl) && Objects.equals(this.version, fillrCartInformationExtraction$FillrCartInformation.version) && Objects.equals(this.cart_total_qty, fillrCartInformationExtraction$FillrCartInformation.cart_total_qty);
    }

    public final int hashCode() {
        return Objects.hash(this.total, this.subtotal, this.currency, this.products, this.pageUrl, this.version, this.cart_total_qty);
    }
}
