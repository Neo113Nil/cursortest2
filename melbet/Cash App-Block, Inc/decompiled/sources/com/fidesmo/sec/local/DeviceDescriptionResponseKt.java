package com.fidesmo.sec.local;

import com.fidesmo.sec.core.models.ParametrisedTranslation;
import com.fidesmo.sec.local.models.Capabilities;
import com.fidesmo.sec.local.models.DeviceBatch;
import com.fidesmo.sec.local.models.DeviceDescription;
import com.fidesmo.sec.local.models.SupportInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDeviceDescription", "Lcom/fidesmo/sec/local/models/DeviceDescription;", "Lcom/fidesmo/sec/local/DeviceDescriptionResponse;", "sec-client-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceDescriptionResponseKt {
    public static final DeviceDescription toDeviceDescription(DeviceDescriptionResponse deviceDescriptionResponse) {
        deviceDescriptionResponse.getClass();
        DeviceDescriptionFromServer description = deviceDescriptionResponse.getDescription();
        String cin = deviceDescriptionResponse.getCin();
        ParametrisedTranslation name = description.getName();
        ParametrisedTranslation description2 = description.getDescription();
        DeviceBatch batch = description.getBatch();
        String imageUrl = description.getImageUrl();
        String siteUrl = description.getSiteUrl();
        Capabilities capabilities = description.getCapabilities();
        SupportInfo support = description.getSupport();
        Boolean ownedByAccount = deviceDescriptionResponse.getOwnedByAccount();
        return new DeviceDescription(cin, name, description2, batch, imageUrl, siteUrl, capabilities, support, ownedByAccount != null ? ownedByAccount.booleanValue() : false);
    }
}
