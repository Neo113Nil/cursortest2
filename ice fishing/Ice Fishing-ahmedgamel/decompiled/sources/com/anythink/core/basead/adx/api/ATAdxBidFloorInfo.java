package com.anythink.core.basead.adx.api;

import com.anythink.core.api.ATAdConst;
import java.util.Map;

/* loaded from: classes.dex */
public class ATAdxBidFloorInfo {
    public static final String EXTRA_L_S_P = "extra_l_s_p";
    public static final String EXTRA_M_INFO = "extra_m_info";
    public static final String EXTRA_TP_M_INFO = "extra_tp_m_info";
    public static final String EXTRA_TYPE = "extra_type";
    double bidFloor;
    ATAdConst.CURRENCY currency;
    Map<String, Object> extraMap;

    public ATAdxBidFloorInfo(double d9, ATAdConst.CURRENCY currency) {
        this.bidFloor = d9;
        this.currency = currency;
    }

    public double getBidFloor() {
        return this.bidFloor;
    }

    public ATAdConst.CURRENCY getCurrency() {
        return this.currency;
    }

    public Map<String, Object> getExtraMap() {
        return this.extraMap;
    }

    public ATAdxBidFloorInfo(double d9, ATAdConst.CURRENCY currency, Map<String, Object> map) {
        this(d9, currency);
        this.extraMap = map;
    }
}
