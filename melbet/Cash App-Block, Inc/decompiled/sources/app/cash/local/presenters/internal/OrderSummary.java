package app.cash.local.presenters.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.order.RowIdentifier;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class OrderSummary {
    public final String customerTipIdentifier;
    public final String grandTotalIdentifier;
    public final String localCashIdentifier;
    public final ArrayList orderRows;
    public final String subtotalIdentifier;
    public final String totalBeforeTipIdentifier;
    public final String totalWithoutDiscountsIdentifier;

    public OrderSummary(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6) {
        this.orderRows = arrayList;
        this.customerTipIdentifier = str;
        this.localCashIdentifier = str2;
        this.subtotalIdentifier = str3;
        this.totalBeforeTipIdentifier = str4;
        this.totalWithoutDiscountsIdentifier = str5;
        this.grandTotalIdentifier = str6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        if (this != obj) {
            if (obj instanceof OrderSummary) {
                OrderSummary orderSummary = (OrderSummary) obj;
                if (this.orderRows.equals(orderSummary.orderRows)) {
                    String str = orderSummary.customerTipIdentifier;
                    String str2 = this.customerTipIdentifier;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals) {
                                String str3 = orderSummary.localCashIdentifier;
                                String str4 = this.localCashIdentifier;
                                if (str4 == null) {
                                    if (str3 == null) {
                                        equals2 = true;
                                        if (equals2) {
                                            String str5 = orderSummary.subtotalIdentifier;
                                            String str6 = this.subtotalIdentifier;
                                            if (str6 == null) {
                                                if (str5 == null) {
                                                    equals3 = true;
                                                    if (equals3) {
                                                        String str7 = orderSummary.totalBeforeTipIdentifier;
                                                        String str8 = this.totalBeforeTipIdentifier;
                                                        if (str8 == null) {
                                                            if (str7 == null) {
                                                                equals4 = true;
                                                                if (equals4) {
                                                                    String str9 = orderSummary.totalWithoutDiscountsIdentifier;
                                                                    String str10 = this.totalWithoutDiscountsIdentifier;
                                                                    if (str10 == null) {
                                                                        if (str9 == null) {
                                                                            equals5 = true;
                                                                            if (equals5) {
                                                                                String str11 = orderSummary.grandTotalIdentifier;
                                                                                String str12 = this.grandTotalIdentifier;
                                                                                if (str12 == null) {
                                                                                    if (str11 == null) {
                                                                                        equals6 = true;
                                                                                        if (equals6) {
                                                                                        }
                                                                                    }
                                                                                    equals6 = false;
                                                                                    if (equals6) {
                                                                                    }
                                                                                } else {
                                                                                    if (str11 != null) {
                                                                                        equals6 = str12.equals(str11);
                                                                                        if (equals6) {
                                                                                        }
                                                                                    }
                                                                                    equals6 = false;
                                                                                    if (equals6) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        equals5 = false;
                                                                        if (equals5) {
                                                                        }
                                                                    } else {
                                                                        if (str9 != null) {
                                                                            equals5 = str10.equals(str9);
                                                                            if (equals5) {
                                                                            }
                                                                        }
                                                                        equals5 = false;
                                                                        if (equals5) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            equals4 = false;
                                                            if (equals4) {
                                                            }
                                                        } else {
                                                            if (str7 != null) {
                                                                equals4 = str8.equals(str7);
                                                                if (equals4) {
                                                                }
                                                            }
                                                            equals4 = false;
                                                            if (equals4) {
                                                            }
                                                        }
                                                    }
                                                }
                                                equals3 = false;
                                                if (equals3) {
                                                }
                                            } else {
                                                if (str5 != null) {
                                                    equals3 = str6.equals(str5);
                                                    if (equals3) {
                                                    }
                                                }
                                                equals3 = false;
                                                if (equals3) {
                                                }
                                            }
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                } else {
                                    if (str3 != null) {
                                        equals2 = str4.equals(str3);
                                        if (equals2) {
                                        }
                                    }
                                    equals2 = false;
                                    if (equals2) {
                                    }
                                }
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.orderRows.hashCode() * 31;
        String str = this.customerTipIdentifier;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localCashIdentifier;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtotalIdentifier;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.totalBeforeTipIdentifier;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.totalWithoutDiscountsIdentifier;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.grandTotalIdentifier;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.customerTipIdentifier;
        String m1286toStringimpl = str == null ? "null" : RowIdentifier.m1286toStringimpl(str);
        String str2 = this.localCashIdentifier;
        String m1286toStringimpl2 = str2 == null ? "null" : RowIdentifier.m1286toStringimpl(str2);
        String str3 = this.subtotalIdentifier;
        String m1286toStringimpl3 = str3 == null ? "null" : RowIdentifier.m1286toStringimpl(str3);
        String str4 = this.totalBeforeTipIdentifier;
        String m1286toStringimpl4 = str4 == null ? "null" : RowIdentifier.m1286toStringimpl(str4);
        String str5 = this.totalWithoutDiscountsIdentifier;
        String m1286toStringimpl5 = str5 == null ? "null" : RowIdentifier.m1286toStringimpl(str5);
        String str6 = this.grandTotalIdentifier;
        String m1286toStringimpl6 = str6 != null ? RowIdentifier.m1286toStringimpl(str6) : "null";
        StringBuilder sb = new StringBuilder("OrderSummary(orderRows=");
        sb.append(this.orderRows);
        sb.append(", customerTipIdentifier=");
        sb.append(m1286toStringimpl);
        sb.append(", localCashIdentifier=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m1286toStringimpl2, ", subtotalIdentifier=", m1286toStringimpl3, ", totalBeforeTipIdentifier=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m1286toStringimpl4, ", totalWithoutDiscountsIdentifier=", m1286toStringimpl5, ", grandTotalIdentifier=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m1286toStringimpl6, ")");
    }
}
