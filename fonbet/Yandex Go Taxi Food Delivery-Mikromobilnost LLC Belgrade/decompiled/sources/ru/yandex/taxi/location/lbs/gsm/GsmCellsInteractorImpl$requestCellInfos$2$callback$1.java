package ru.yandex.taxi.location.lbs.gsm;

import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.n3u;
import defpackage.q7y;
import defpackage.tls;
import defpackage.xya1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"ru/yandex/taxi/location/lbs/gsm/GsmCellsInteractorImpl$requestCellInfos$2$callback$1", "Landroid/telephony/TelephonyManager$CellInfoCallback;", "", "Landroid/telephony/CellInfo;", "cellInfo", "Lzy11;", "onCellInfo", "(Ljava/util/List;)V", "", ErrorResponseData.JSON_ERROR_CODE, "", "detail", "onError", "(ILjava/lang/Throwable;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GsmCellsInteractorImpl$requestCellInfos$2$callback$1 extends TelephonyManager.CellInfoCallback {
    final /* synthetic */ tls $sendResult;
    final /* synthetic */ n3u this$0;

    public GsmCellsInteractorImpl$requestCellInfos$2$callback$1(tls tlsVar, n3u n3uVar) {
        this.$sendResult = tlsVar;
        this.this$0 = n3uVar;
    }

    @Override // android.telephony.TelephonyManager.CellInfoCallback
    public void onCellInfo(List<? extends CellInfo> cellInfo) {
        this.$sendResult.invoke(cellInfo);
    }

    @Override // android.telephony.TelephonyManager.CellInfoCallback
    public void onError(int errorCode, Throwable detail) {
        q7y q7yVar = this.this$0.c;
        if (detail == null) {
            detail = new IllegalStateException();
        }
        String concat = "Gsm: Error code when get cell data = ".concat(xya1.a(errorCode));
        q7yVar.getClass();
        q7y.a(detail, concat);
        this.$sendResult.invoke(EmptyList.a);
    }
}
