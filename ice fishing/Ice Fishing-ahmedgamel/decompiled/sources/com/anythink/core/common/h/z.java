package com.anythink.core.common.h;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBiddingNotice;

/* loaded from: classes.dex */
public class z {
    public ATBiddingNotice biddingNotice;
    public ATAdConst.CURRENCY currency;
    public String displayNoticeUrl;
    public String errorMsg;
    public Object extra;
    protected boolean isSuccess;
    public String loseNoticeUrl;
    public double originPrice;
    private String originRequestId;
    protected double price;
    public double rmbPrice;
    protected double sortPrice;
    public String token;
    public int useType;
    public String winNoticeUrl;

    public z(boolean z3, double d2, String str, String str2, String str3, String str4, String str5, ATAdConst.CURRENCY currency) {
        this.useType = 1;
        this.isSuccess = z3;
        this.originPrice = d2;
        this.price = d2;
        this.sortPrice = d2;
        this.token = str;
        this.winNoticeUrl = str2;
        this.loseNoticeUrl = str3;
        this.displayNoticeUrl = str4;
        this.errorMsg = str5;
        this.currency = currency;
    }

    public ATAdConst.CURRENCY getCurrency() {
        return this.currency;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public Object getExtra() {
        return this.extra;
    }

    public double getOriginPrice() {
        return this.originPrice;
    }

    public String getOriginRequestId() {
        return this.originRequestId;
    }

    public double getPrice() {
        return this.price;
    }

    public double getRmbPrice() {
        return this.rmbPrice;
    }

    public double getSortPrice() {
        return this.sortPrice;
    }

    public boolean isSamePrice() {
        return this.sortPrice == this.originPrice;
    }

    public boolean isSuccessWithUseType() {
        return this.isSuccess && this.useType == 1;
    }

    public void setBiddingNotice(ATBiddingNotice aTBiddingNotice) {
        this.biddingNotice = aTBiddingNotice;
    }

    public void setExtra(Object obj) {
        this.extra = obj;
    }

    public void setOriginRequestId(String str) {
        this.originRequestId = str;
    }

    public void setPrice(double d2) {
        this.price = d2;
    }

    public void setSortPrice(double d2) {
        this.sortPrice = d2;
    }

    public z(boolean z3, double d2, String str, ATBiddingNotice aTBiddingNotice, String str2, ATAdConst.CURRENCY currency) {
        this.useType = 1;
        this.isSuccess = z3;
        this.originPrice = d2;
        this.price = d2;
        this.sortPrice = d2;
        this.token = str;
        this.biddingNotice = aTBiddingNotice;
        this.errorMsg = str2;
        this.currency = currency;
    }

    public z(boolean z3, double d2, double d9, String str, ATBiddingNotice aTBiddingNotice, String str2, ATAdConst.CURRENCY currency) {
        this(z3, d9, str, aTBiddingNotice, str2, currency);
        this.sortPrice = d2;
    }
}
