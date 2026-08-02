package defpackage;

import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsDisplayContext;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import com.yandex.go.sharing_personal_goals.data.a;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsDisplayContextDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingServiceNameDto;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class wrr0 {
    public final a a;

    public wrr0(a aVar) {
        this.a = aVar;
    }

    public final Object a(SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName, SharingPersonalGoalsDisplayContext sharingPersonalGoalsDisplayContext, ContinuationImpl continuationImpl) {
        SharingServiceNameDto sharingServiceNameDto;
        SharingPersonalGoalsDisplayContextDto sharingPersonalGoalsDisplayContextDto;
        int i = sharingPersonalGoalsServiceName == null ? -1 : vrr0.a[sharingPersonalGoalsServiceName.ordinal()];
        if (i == -1) {
            sharingServiceNameDto = SharingServiceNameDto.NONE;
        } else if (i == 1) {
            sharingServiceNameDto = SharingServiceNameDto.SCOOTERS;
        } else if (i == 2) {
            sharingServiceNameDto = SharingServiceNameDto.CHARGERS;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            sharingServiceNameDto = SharingServiceNameDto.DRIVE;
        }
        int i2 = vrr0.b[sharingPersonalGoalsDisplayContext.ordinal()];
        if (i2 == 1) {
            sharingPersonalGoalsDisplayContextDto = SharingPersonalGoalsDisplayContextDto.OFFER_CARD;
        } else if (i2 == 2) {
            sharingPersonalGoalsDisplayContextDto = SharingPersonalGoalsDisplayContextDto.RIDE_FINISH;
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            sharingPersonalGoalsDisplayContextDto = SharingPersonalGoalsDisplayContextDto.NONE;
        }
        return this.a.c(sharingServiceNameDto, sharingPersonalGoalsDisplayContextDto, continuationImpl);
    }
}
