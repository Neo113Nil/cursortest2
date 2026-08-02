package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.internal.domain.RumContext;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzhw {
    public static RumContext fromFeatureContext(Map map) {
        int i;
        int i2;
        int i3;
        map.getClass();
        Object obj = map.get("application_id");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("session_id");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("session_active");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Object obj4 = map.get("session_state");
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        int[] values = CameraSelector$$ExternalSyntheticOutline0.values(3);
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i = 0;
                break;
            }
            i = values[i4];
            if (RumErrorSource$EnumUnboxingLocalUtility.getAsString$1(i).equals(str3)) {
                break;
            }
            i4++;
        }
        Object obj5 = map.get("session_start_reason");
        String str4 = obj5 instanceof String ? (String) obj5 : null;
        int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(7);
        int length2 = values2.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                i2 = 0;
                break;
            }
            i2 = values2[i5];
            if (RumErrorSource$EnumUnboxingLocalUtility.getAsString(i2).equals(str4)) {
                break;
            }
            i5++;
        }
        Object obj6 = map.get("view_id");
        String str5 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("view_name");
        String str6 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = map.get("view_url");
        String str7 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = map.get("view_type");
        String str8 = obj9 instanceof String ? (String) obj9 : null;
        int[] values3 = CameraSelector$$ExternalSyntheticOutline0.values(4);
        int length3 = values3.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length3) {
                i3 = 0;
                break;
            }
            i3 = values3[i6];
            if (RumErrorSource$EnumUnboxingLocalUtility.getAsString$2(i3).equals(str8)) {
                break;
            }
            i6++;
        }
        Object obj10 = map.get("action_id");
        String str9 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = map.get("synthetics_test_id");
        String str10 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = map.get("synthetics_result_id");
        String str11 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = map.get("view_has_replay");
        Boolean bool2 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
        boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
        Object obj14 = map.get("view_timestamp");
        Long l = obj14 instanceof Long ? (Long) obj14 : null;
        long longValue = l != null ? l.longValue() : 0L;
        Object obj15 = map.get("view_timestamp_offset");
        Long l2 = obj15 instanceof Long ? (Long) obj15 : null;
        long longValue2 = l2 != null ? l2.longValue() : 0L;
        if (str == null) {
            str = RumContext.NULL_UUID;
        }
        String str12 = str;
        if (str2 == null) {
            str2 = RumContext.NULL_UUID;
        }
        return new RumContext(str12, str2, bool != null ? bool.booleanValue() : false, str5, str6, str7, str9, i == 0 ? 1 : i, i2 == 0 ? 1 : i2, i3 == 0 ? 1 : i3, str10, str11, longValue, longValue2, booleanValue);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalOrderStatusFromLocalHome.deepLinkSpecs;
    }
}
