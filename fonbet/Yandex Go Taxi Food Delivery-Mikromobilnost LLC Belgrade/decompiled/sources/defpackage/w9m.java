package defpackage;

import com.ybsdk.feature.divkit.api.ui.SafeYbDivView;
import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes3.dex */
public final /* synthetic */ class w9m implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ w9m(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.w = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onMeasure$lambda$0;
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.w;
        switch (i) {
            case 0:
                ((z9m) obj).c(i3, i2 - 1);
                return Boolean.TRUE;
            case 1:
                euu euuVar = (euu) obj;
                try {
                    euuVar.P.n(i3, i2, true);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    euuVar.a(errorCode, errorCode, e);
                }
                return zy11.a;
            default:
                onMeasure$lambda$0 = SafeYbDivView.onMeasure$lambda$0((SafeYbDivView) obj, i3, i2);
                return onMeasure$lambda$0;
        }
    }
}
