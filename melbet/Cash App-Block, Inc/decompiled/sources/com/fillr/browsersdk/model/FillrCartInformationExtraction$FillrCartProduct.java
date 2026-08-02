package com.fillr.browsersdk.model;

import java.util.Objects;

/* loaded from: classes7.dex */
public final class FillrCartInformationExtraction$FillrCartProduct {
    public final String imageUrl;
    public final Integer itemPrice;
    public final Integer lineTotal;
    public final String name;
    public final Integer quantity;
    public final String url;

    public FillrCartInformationExtraction$FillrCartProduct(String str, String str2, String str3, Integer num, Integer num2, Integer num3) {
        this.name = str;
        this.url = str2;
        this.imageUrl = str3;
        this.itemPrice = num;
        this.lineTotal = num2;
        this.quantity = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillrCartInformationExtraction$FillrCartProduct)) {
            return false;
        }
        FillrCartInformationExtraction$FillrCartProduct fillrCartInformationExtraction$FillrCartProduct = (FillrCartInformationExtraction$FillrCartProduct) obj;
        return Objects.equals(this.name, fillrCartInformationExtraction$FillrCartProduct.name) && Objects.equals(this.url, fillrCartInformationExtraction$FillrCartProduct.url) && Objects.equals(this.imageUrl, fillrCartInformationExtraction$FillrCartProduct.imageUrl) && Objects.equals(this.itemPrice, fillrCartInformationExtraction$FillrCartProduct.itemPrice) && Objects.equals(this.lineTotal, fillrCartInformationExtraction$FillrCartProduct.lineTotal) && Objects.equals(this.quantity, fillrCartInformationExtraction$FillrCartProduct.quantity);
    }

    public final int hashCode() {
        return Objects.hash(this.name, this.url, this.imageUrl, this.itemPrice, this.lineTotal, this.quantity);
    }
}
