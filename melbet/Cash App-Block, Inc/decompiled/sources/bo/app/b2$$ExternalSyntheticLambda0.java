package bo.app;

import com.braze.Braze;
import com.braze.support.ValidationUtils;
import com.braze.ui.support.UriUtils;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.internal._UtilCommonKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class b2$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$ObjectRef f$0;

    public /* synthetic */ b2$$ExternalSyntheticLambda0(int i, Ref$ObjectRef ref$ObjectRef) {
        this.$r8$classId = i;
        this.f$0 = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String logCustomEvent$lambda$1$1;
        String logCustomEvent$lambda$1$2;
        String logCustomEvent$lambda$1$4;
        String ensureBrazeFieldLength$lambda$0;
        String queryParameters$lambda$0;
        String queryParameters$lambda$2;
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.f$0;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                logCustomEvent$lambda$1$1 = Braze.logCustomEvent$lambda$1$1(ref$ObjectRef);
                break;
            case 7:
                logCustomEvent$lambda$1$2 = Braze.logCustomEvent$lambda$1$2(ref$ObjectRef);
                break;
            case 8:
                logCustomEvent$lambda$1$4 = Braze.logCustomEvent$lambda$1$4(ref$ObjectRef);
                break;
            case 9:
                ensureBrazeFieldLength$lambda$0 = ValidationUtils.ensureBrazeFieldLength$lambda$0(ref$ObjectRef);
                break;
            case 10:
                queryParameters$lambda$0 = UriUtils.getQueryParameters$lambda$0(ref$ObjectRef);
                break;
            case 11:
                queryParameters$lambda$2 = UriUtils.getQueryParameters$lambda$2(ref$ObjectRef);
                break;
            case 12:
                break;
            case 13:
                ((Function0) ref$ObjectRef.element).invoke();
                break;
            default:
                _UtilCommonKt.closeQuietly((Closeable) ref$ObjectRef.element);
                break;
        }
        return Unit.INSTANCE;
    }
}
