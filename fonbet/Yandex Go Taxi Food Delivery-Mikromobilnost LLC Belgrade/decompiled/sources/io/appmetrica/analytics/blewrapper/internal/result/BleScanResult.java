package io.appmetrica.analytics.blewrapper.internal.result;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.vfc;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/result/BleScanResult;", "", "", "toString", "", "Lio/appmetrica/analytics/blewrapper/internal/result/BleData;", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", Constants.KEY_DATA, "", "b", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", ErrorResponseData.JSON_ERROR_CODE, "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BleScanResult {

    /* renamed from: a, reason: from kotlin metadata */
    private final List data;

    /* renamed from: b, reason: from kotlin metadata */
    private final Integer errorCode;

    public BleScanResult(List<BleData> list, Integer num) {
        this.data = list;
        this.errorCode = num;
    }

    public final List<BleData> getData() {
        return this.data;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BleScanResult(data=");
        sb.append(this.data);
        sb.append(", errorCode=");
        return vfc.o(sb, this.errorCode, ')');
    }
}
