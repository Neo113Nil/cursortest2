package com.fidesmo.sec.delivery.models;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u0018\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0002`\u0004*\u0018\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0002`\u0004\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005*\n\u0010\u0007\"\u00020\u00022\u00020\u0002*D\u0010\b\"\u0014\u0012\u0004\u0012\u0002`\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2*\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0002`\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t**\u0010\f\"\u0010\u0012\u0004\u0012\u0002`\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0014\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*8\u0010\r\"\u000e\u0012\u0004\u0012\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2$\u0012\u001a\u0012\u0018\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e¨\u0006\u000f"}, d2 = {"filterExtraRequirements", "", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "Lcom/fidesmo/sec/delivery/models/UserDataResponse;", "", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "DataRequirementId", "EncryptedUserResponseHandler", "Lkotlin/Function2;", "", "", "UserDataResponse", "UserResponseHandler", "Lkotlin/Function1;", "sec-client-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataRequirementKt {
    public static final Map<String, String> filterExtraRequirements(Map<String, String> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            SetupRequirementIds[] values = SetupRequirementIds.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (SetupRequirementIds setupRequirementIds : values) {
                arrayList.add(setupRequirementIds.getValue());
            }
            if (!arrayList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final List<DataRequirement> filterExtraRequirements(List<? extends DataRequirement> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            DataRequirement dataRequirement = (DataRequirement) obj;
            SetupRequirementIds[] values = SetupRequirementIds.values();
            ArrayList arrayList2 = new ArrayList(values.length);
            for (SetupRequirementIds setupRequirementIds : values) {
                arrayList2.add(setupRequirementIds.getValue());
            }
            if (!arrayList2.contains(dataRequirement.getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
