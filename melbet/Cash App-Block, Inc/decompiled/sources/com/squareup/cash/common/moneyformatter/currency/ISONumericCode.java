package com.squareup.cash.common.moneyformatter.currency;

import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC0170g;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public enum ISONumericCode {
    AUD(36),
    BTC(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO),
    CAD(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE),
    EUR(978),
    GBP(826),
    JPY(392),
    MXN(484),
    USD(840),
    XTS(963),
    XUS(IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA),
    XXX(RoomDatabase.MAX_BIND_PARAMETER_CNT);

    public final int code;

    ISONumericCode(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
