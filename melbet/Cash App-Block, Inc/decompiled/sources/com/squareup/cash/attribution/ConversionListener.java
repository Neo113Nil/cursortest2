package com.squareup.cash.attribution;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerConversionListener;
import com.squareup.cash.cdf.appsflyerinstallattribution.AppsFlyerInstallAttributionConversionDataReceived;
import com.squareup.cash.integration.analytics.Analytics;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ConversionListener implements AppsFlyerConversionListener {
    public final Analytics analytics;

    public /* synthetic */ ConversionListener(Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Timber.Forest.d(CameraSelector$$ExternalSyntheticOutline0.m("onAppOpen_attribute: ", (String) entry.getKey(), " = ", (String) entry.getValue()), new Object[0]);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("error onAttributionFailure :  ", str), new Object[0]);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("error onAttributionFailure :  ", str), new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0241  */
    @Override // com.appsflyer.AppsFlyerConversionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onConversionDataSuccess(Map map) {
        String str;
        String obj;
        Object obj2;
        Object obj3;
        String str2;
        String obj4;
        Object obj5;
        Object obj6;
        String str3;
        String obj7;
        Object obj8;
        Object obj9;
        String str4;
        String obj10;
        Object obj11;
        Object obj12;
        String str5;
        String obj13;
        String obj14;
        boolean z = false;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                Object value = entry.getValue();
                Timber.Forest.d("conversion_attribute:  " + str6 + " = " + value, new Object[0]);
            }
        }
        if (map == null) {
            return;
        }
        Object obj15 = map.get("af_status");
        String obj16 = obj15 != null ? obj15.toString() : null;
        AppsFlyerInstallAttributionConversionDataReceived.AfStatus afStatus = Intrinsics.areEqual(obj16, "Organic") ? AppsFlyerInstallAttributionConversionDataReceived.AfStatus.ORGANIC : Intrinsics.areEqual(obj16, "Non-organic") ? AppsFlyerInstallAttributionConversionDataReceived.AfStatus.NON_ORGANIC : AppsFlyerInstallAttributionConversionDataReceived.AfStatus.UNKNOWN;
        Object obj17 = map.get("is_first_launch");
        if (obj17 != null && (obj14 = obj17.toString()) != null) {
            z = Boolean.parseBoolean(obj14);
        }
        Boolean valueOf = Boolean.valueOf(z);
        Object obj18 = map.get("media_source");
        String obj19 = obj18 != null ? obj18.toString() : null;
        Object obj20 = map.get("campaign");
        String obj21 = obj20 != null ? obj20.toString() : null;
        Object obj22 = map.get("campaign_id");
        String obj23 = obj22 != null ? obj22.toString() : null;
        Object obj24 = map.get("af_adset");
        if (obj24 == null || (obj = obj24.toString()) == null) {
            Object obj25 = map.get("adset");
            if (obj25 != null) {
                obj = obj25.toString();
            } else {
                str = null;
                obj2 = map.get("af_adset_id");
                if (obj2 != null || (obj4 = obj2.toString()) == null) {
                    obj3 = map.get("adset_id");
                    if (obj3 == null) {
                        obj4 = obj3.toString();
                    } else {
                        Object obj26 = map.get("adgroup_id");
                        if (obj26 != null) {
                            obj4 = obj26.toString();
                        } else {
                            str2 = null;
                            obj5 = map.get("af_ad");
                            if (obj5 != null || (obj7 = obj5.toString()) == null) {
                                obj6 = map.get("ad");
                                if (obj6 != null) {
                                    obj7 = obj6.toString();
                                } else {
                                    str3 = null;
                                    obj8 = map.get("af_ad_id");
                                    if (obj8 != null || (obj10 = obj8.toString()) == null) {
                                        obj9 = map.get("ad_id");
                                        if (obj9 != null) {
                                            str4 = null;
                                            Object obj27 = map.get(AFInAppEventParameterName.AF_CHANNEL);
                                            String obj28 = obj27 == null ? obj27.toString() : null;
                                            Object obj29 = map.get("af_keywords");
                                            String obj30 = obj29 == null ? obj29.toString() : null;
                                            Object obj31 = map.get("click_time");
                                            String obj32 = obj31 == null ? obj31.toString() : null;
                                            Object obj33 = map.get("install_time");
                                            String obj34 = obj33 == null ? obj33.toString() : null;
                                            obj11 = map.get("af_id");
                                            if (obj11 != null || (obj13 = obj11.toString()) == null) {
                                                obj12 = map.get("appsflyer_id");
                                                if (obj12 != null) {
                                                    str5 = null;
                                                    Object obj35 = map.get("af_dp");
                                                    String obj36 = obj35 == null ? obj35.toString() : null;
                                                    Object obj37 = map.get("af_web_dp");
                                                    String obj38 = obj37 == null ? obj37.toString() : null;
                                                    Object obj39 = map.get("af_android_url");
                                                    String obj40 = obj39 == null ? obj39.toString() : null;
                                                    Object obj41 = map.get("http_referrer");
                                                    String obj42 = obj41 == null ? obj41.toString() : null;
                                                    Object obj43 = map.get("deep_link_value");
                                                    String obj44 = obj43 == null ? obj43.toString() : null;
                                                    Object obj45 = map.get("deep_link_sub1");
                                                    String obj46 = obj45 == null ? obj45.toString() : null;
                                                    Object obj47 = map.get("af_sub1");
                                                    String obj48 = obj47 == null ? obj47.toString() : null;
                                                    Object obj49 = map.get("af_sub2");
                                                    String obj50 = obj49 == null ? obj49.toString() : null;
                                                    Object obj51 = map.get("af_sub3");
                                                    String obj52 = obj51 == null ? obj51.toString() : null;
                                                    Object obj53 = map.get("af_sub4");
                                                    String obj54 = obj53 == null ? obj53.toString() : null;
                                                    Object obj55 = map.get("af_sub5");
                                                    String obj56 = obj55 == null ? obj55.toString() : null;
                                                    Object obj57 = map.get("atid");
                                                    String obj58 = obj57 == null ? obj57.toString() : null;
                                                    Object obj59 = map.get("af_siteid");
                                                    String obj60 = obj59 == null ? obj59.toString() : null;
                                                    Object obj61 = map.get("agency");
                                                    String obj62 = obj61 == null ? obj61.toString() : null;
                                                    Object obj63 = map.get("retargeting_conversion_type");
                                                    this.analytics.track(new AppsFlyerInstallAttributionConversionDataReceived(afStatus, valueOf, obj19, obj21, obj23, str, str2, str3, str4, obj28, obj30, obj32, obj34, str5, obj36, obj38, obj40, obj42, obj44, obj46, obj48, obj50, obj52, obj54, obj56, obj58, obj60, obj62, obj63 == null ? obj63.toString() : null), null);
                                                    return;
                                                }
                                                obj13 = obj12.toString();
                                            }
                                            str5 = obj13;
                                            Object obj352 = map.get("af_dp");
                                            if (obj352 == null) {
                                            }
                                            Object obj372 = map.get("af_web_dp");
                                            if (obj372 == null) {
                                            }
                                            Object obj392 = map.get("af_android_url");
                                            if (obj392 == null) {
                                            }
                                            Object obj412 = map.get("http_referrer");
                                            if (obj412 == null) {
                                            }
                                            Object obj432 = map.get("deep_link_value");
                                            if (obj432 == null) {
                                            }
                                            Object obj452 = map.get("deep_link_sub1");
                                            if (obj452 == null) {
                                            }
                                            Object obj472 = map.get("af_sub1");
                                            if (obj472 == null) {
                                            }
                                            Object obj492 = map.get("af_sub2");
                                            if (obj492 == null) {
                                            }
                                            Object obj512 = map.get("af_sub3");
                                            if (obj512 == null) {
                                            }
                                            Object obj532 = map.get("af_sub4");
                                            if (obj532 == null) {
                                            }
                                            Object obj552 = map.get("af_sub5");
                                            if (obj552 == null) {
                                            }
                                            Object obj572 = map.get("atid");
                                            if (obj572 == null) {
                                            }
                                            Object obj592 = map.get("af_siteid");
                                            if (obj592 == null) {
                                            }
                                            Object obj612 = map.get("agency");
                                            if (obj612 == null) {
                                            }
                                            Object obj632 = map.get("retargeting_conversion_type");
                                            this.analytics.track(new AppsFlyerInstallAttributionConversionDataReceived(afStatus, valueOf, obj19, obj21, obj23, str, str2, str3, str4, obj28, obj30, obj32, obj34, str5, obj36, obj38, obj40, obj42, obj44, obj46, obj48, obj50, obj52, obj54, obj56, obj58, obj60, obj62, obj632 == null ? obj632.toString() : null), null);
                                            return;
                                        }
                                        obj10 = obj9.toString();
                                    }
                                    str4 = obj10;
                                    Object obj272 = map.get(AFInAppEventParameterName.AF_CHANNEL);
                                    if (obj272 == null) {
                                    }
                                    Object obj292 = map.get("af_keywords");
                                    if (obj292 == null) {
                                    }
                                    Object obj312 = map.get("click_time");
                                    if (obj312 == null) {
                                    }
                                    Object obj332 = map.get("install_time");
                                    if (obj332 == null) {
                                    }
                                    obj11 = map.get("af_id");
                                    if (obj11 != null) {
                                    }
                                    obj12 = map.get("appsflyer_id");
                                    if (obj12 != null) {
                                    }
                                }
                            }
                            str3 = obj7;
                            obj8 = map.get("af_ad_id");
                            if (obj8 != null) {
                            }
                            obj9 = map.get("ad_id");
                            if (obj9 != null) {
                            }
                        }
                    }
                }
                str2 = obj4;
                obj5 = map.get("af_ad");
                if (obj5 != null) {
                }
                obj6 = map.get("ad");
                if (obj6 != null) {
                }
            }
        }
        str = obj;
        obj2 = map.get("af_adset_id");
        if (obj2 != null) {
        }
        obj3 = map.get("adset_id");
        if (obj3 == null) {
        }
        str2 = obj4;
        obj5 = map.get("af_ad");
        if (obj5 != null) {
        }
        obj6 = map.get("ad");
        if (obj6 != null) {
        }
    }
}
