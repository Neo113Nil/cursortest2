package defpackage;

import com.yandex.plus.pay.a;
import com.yandex.plus.pay.api.exception.PlusPayNetworkException;
import com.yandex.plus.pay.api.exception.PlusPayPaymentException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class qkj {
    public static final long d;
    public final a a;
    public final vwi b;
    public final c7m c;

    static {
        msa msaVar = nsa.b;
        d = yd5.M(15, ssa.SECONDS);
    }

    public qkj(a aVar, vwi vwiVar, c7m c7mVar) {
        aVar.getClass();
        c7mVar.getClass();
        this.a = aVar;
        this.b = vwiVar;
        this.c = c7mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
    
        if (r0 != r10) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rkj rkjVar, cg6 cg6Var) {
        okj okjVar;
        int i;
        String str;
        Map map;
        String str2;
        String str3;
        try {
            if (cg6Var instanceof okj) {
                okjVar = (okj) cg6Var;
                int i2 = okjVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    okjVar.n = i2 - Integer.MIN_VALUE;
                    okj okjVar2 = okjVar;
                    Object obj = okjVar2.l;
                    nm6 nm6Var = nm6.a;
                    i = okjVar2.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String str4 = rkjVar.c;
                        if (str4 != null) {
                            linkedHashMap.put("feature_id", str4);
                        }
                        String str5 = rkjVar.d;
                        if (str5 != null) {
                            linkedHashMap.put("campaign_id", str5);
                        }
                        String str6 = rkjVar.e;
                        if (str6 != null) {
                            linkedHashMap.put("communication_id", str6);
                        }
                        String str7 = rkjVar.f;
                        if (str7 != null) {
                            linkedHashMap.put("utm_campaign", str7);
                        }
                        String e = eta.e();
                        c7m c7mVar = this.c;
                        pkj pkjVar = new pkj(this, rkjVar, linkedHashMap, e, c7mVar.b(), c7mVar.a(), null, 1);
                        mn7 mn7Var = dm6.b;
                        okjVar2.j = e;
                        okjVar2.k = null;
                        okjVar2.n = 1;
                        obj = x97.V(mn7Var, pkjVar, okjVar2);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        str = e;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map = okjVar2.k;
                            str = okjVar2.j;
                            qgg.h0(obj);
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            map.getClass();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                Object value = entry.getValue();
                                if (value != null) {
                                    linkedHashMap2.put(entry.getKey(), value);
                                }
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(linkedHashMap2.size()));
                            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                Object key = entry2.getKey();
                                PlusPaySmartOffer plusPaySmartOffer = (PlusPaySmartOffer) entry2.getValue();
                                plusPaySmartOffer.getClass();
                                if (plusPaySmartOffer.isOneClickEnabled()) {
                                    String str8 = plusPaySmartOffer.getTexts().getCustomTexts().get("one_click_disclaimer_text");
                                    if (str8 == null) {
                                        str8 = plusPaySmartOffer.getLegals().getOneClickDisclaimer();
                                    }
                                    str2 = str8;
                                    str3 = plusPaySmartOffer.getTexts().getCustomTexts().get("one_click_disclaimer_text_a11y");
                                } else {
                                    str2 = null;
                                    str3 = null;
                                }
                                String str9 = plusPaySmartOffer.getTexts().getCustomTexts().get("title_text");
                                String str10 = plusPaySmartOffer.getTexts().getCustomTexts().get("title_text_a11y");
                                String str11 = plusPaySmartOffer.getTexts().getCustomTexts().get("slider_text");
                                String str12 = plusPaySmartOffer.getTexts().getCustomTexts().get("slider_accent_text");
                                String str13 = plusPaySmartOffer.getTexts().getCustomTexts().get("slider_combined_text_a11y");
                                String str14 = plusPaySmartOffer.getTexts().getCustomTexts().get("button_text");
                                String str15 = plusPaySmartOffer.getTexts().getCustomTexts().get("button_text_a11y");
                                String str16 = plusPaySmartOffer.getTexts().getCustomTexts().get("button_additional_text");
                                String str17 = plusPaySmartOffer.getTexts().getCustomTexts().get("button_additional_text_a11y");
                                String str18 = plusPaySmartOffer.getTexts().getCustomTexts().get("button_combined_text_a11y");
                                String str19 = plusPaySmartOffer.getTexts().getCustomTexts().get("disclaimer_text");
                                String str20 = plusPaySmartOffer.getTexts().getCustomTexts().get("disclaimer_text_a11y");
                                String batchId = plusPaySmartOffer.getMeta().getBatchId();
                                String positionId = plusPaySmartOffer.getMeta().getPositionId();
                                ArrayList arrayList = new ArrayList();
                                PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusPaySmartOffer.getCompositeOffer().getTariffOffer();
                                if (tariffOffer != null) {
                                    arrayList.add(tariffOffer.getName());
                                }
                                Iterator<T> it = plusPaySmartOffer.getCompositeOffer().getOptionOffers().iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getName());
                                }
                                linkedHashMap3.put(key, new bve(plusPaySmartOffer, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str2, str3, new jkj(batchId, positionId, arrayList)));
                            }
                            return new tkj(new mkj(str, linkedHashMap3, booleanValue));
                        }
                        String str21 = okjVar2.j;
                        qgg.h0(obj);
                        str = str21;
                    }
                    map = (Map) obj;
                    okjVar2.j = str;
                    okjVar2.k = map;
                    okjVar2.n = 2;
                    obj = this.b.a(okjVar2);
                }
            }
            if (i != 0) {
            }
            map = (Map) obj;
            okjVar2.j = str;
            okjVar2.k = map;
            okjVar2.n = 2;
            obj = this.b.a(okjVar2);
        } catch (com.yandex.plus.pay.api.exception.a e2) {
            return new skj(new lgb(e2 instanceof PlusPayNetworkException ? kgb.a : e2 instanceof PlusPayPaymentException ? kgb.b : kgb.d, e2.getMessage()));
        } catch (wis unused) {
            return new skj(new lgb(kgb.d, "offer request timeout"));
        }
        okjVar = new okj(this, cg6Var);
        okj okjVar22 = okjVar;
        Object obj2 = okjVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = okjVar22.n;
    }
}
