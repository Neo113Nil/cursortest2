package defpackage;

import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.telemost.domain.entities.CallHistoryData;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vh7 {
    public final d2b a;
    public final StatusAvailability b;
    public final CallHistoryData c;
    public final i3y d;
    public final i3y e;

    public vh7(d2b d2bVar, StatusAvailability statusAvailability, CallHistoryData callHistoryData) {
        this.a = d2bVar;
        this.b = statusAvailability;
        this.c = callHistoryData;
        final int i = 0;
        this.d = a.a(new sls(this) { // from class: uh7
            public final /* synthetic */ vh7 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                vh7 vh7Var = this.b;
                switch (i2) {
                    case 0:
                        CallHistoryData callHistoryData2 = vh7Var.c;
                        if (callHistoryData2 instanceof CallHistoryData.GroupCall) {
                            return ((CallHistoryData.GroupCall) callHistoryData2).getChatId();
                        }
                        if (callHistoryData2 instanceof CallHistoryData.OneToOneCall) {
                            return ((CallHistoryData.OneToOneCall) callHistoryData2).getChatId();
                        }
                        w511.b();
                        return null;
                    default:
                        CallHistoryData callHistoryData3 = vh7Var.c;
                        if (callHistoryData3 instanceof CallHistoryData.OneToOneCall) {
                            return ((CallHistoryData.OneToOneCall) callHistoryData3).getRemoteGuid();
                        }
                        return null;
                }
            }
        });
        CallHistoryData.GroupCall groupCall = callHistoryData instanceof CallHistoryData.GroupCall ? (CallHistoryData.GroupCall) callHistoryData : null;
        if (groupCall != null) {
            groupCall.getTelemostJoinUrl();
        }
        final int i2 = 1;
        this.e = a.a(new sls(this) { // from class: uh7
            public final /* synthetic */ vh7 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                vh7 vh7Var = this.b;
                switch (i22) {
                    case 0:
                        CallHistoryData callHistoryData2 = vh7Var.c;
                        if (callHistoryData2 instanceof CallHistoryData.GroupCall) {
                            return ((CallHistoryData.GroupCall) callHistoryData2).getChatId();
                        }
                        if (callHistoryData2 instanceof CallHistoryData.OneToOneCall) {
                            return ((CallHistoryData.OneToOneCall) callHistoryData2).getChatId();
                        }
                        w511.b();
                        return null;
                    default:
                        CallHistoryData callHistoryData3 = vh7Var.c;
                        if (callHistoryData3 instanceof CallHistoryData.OneToOneCall) {
                            return ((CallHistoryData.OneToOneCall) callHistoryData3).getRemoteGuid();
                        }
                        return null;
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh7)) {
            return false;
        }
        vh7 vh7Var = (vh7) obj;
        return jl40.l(this.a, vh7Var.a) && this.b == vh7Var.b && jl40.l(this.c, vh7Var.c);
    }

    public final int hashCode() {
        d2b d2bVar = this.a;
        int hashCode = (d2bVar == null ? 0 : d2bVar.hashCode()) * 31;
        StatusAvailability statusAvailability = this.b;
        return this.c.hashCode() + ((hashCode + (statusAvailability != null ? statusAvailability.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CallHistoryItemData(chatDisplayData=" + this.a + ", statusAvailability=" + this.b + ", data=" + this.c + Extension.C_BRAKE;
    }
}
