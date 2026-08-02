package defpackage;

import com.ybsdk.core.utils.ext.ErrorResponse;
import com.ybsdk.core.utils.ext.ErrorResponseException;
import com.ybsdk.rconfig.configs.NetworkCodeRangeData;
import com.ybsdk.rconfig.configs.NetworkRetryConditionData;
import com.ybsdk.rconfig.configs.NetworkRetryConfigSettingData;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes9.dex */
public final /* synthetic */ class wz50 implements j1k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz50(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.j1k0
    public final boolean a(Throwable th) {
        ErrorResponse errorResponse;
        boolean z;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                NetworkRetryConditionData condition = ((NetworkRetryConfigSettingData) obj).getCondition();
                ErrorResponseException errorResponseException = th instanceof ErrorResponseException ? (ErrorResponseException) th : null;
                if (errorResponseException != null && (errorResponse = errorResponseException.getErrorResponse()) != null) {
                    int code = errorResponse.getCode();
                    Integer code2 = condition.getCode();
                    boolean z2 = code2 != null && code2.intValue() == code;
                    NetworkCodeRangeData codeRange = condition.getCodeRange();
                    if (codeRange != null) {
                        int lowerBound = codeRange.getLowerBound();
                        if (code <= codeRange.getUpperBound() && lowerBound <= code) {
                            z = true;
                            if (!z2 || z) {
                            }
                        }
                    }
                    z = false;
                    if (!z2) {
                    }
                }
                break;
            default:
                ListBuilder listBuilder = (ListBuilder) obj;
                if (!listBuilder.isEmpty()) {
                    Iterator<E> it = listBuilder.iterator();
                    while (it.hasNext()) {
                        if (((j1k0) it.next()).a(th)) {
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }
}
