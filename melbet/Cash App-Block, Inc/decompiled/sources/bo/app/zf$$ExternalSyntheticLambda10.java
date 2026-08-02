package bo.app;

import android.net.Uri;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class zf$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Uri f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ zf$$ExternalSyntheticLambda10(Uri uri, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = uri;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String onOtherUrlAction$lambda$4;
        int i = this.$r8$classId;
        String str = this.f$1;
        Uri uri = this.f$0;
        switch (i) {
            case 0:
                return zf.a(uri, str);
            default:
                onOtherUrlAction$lambda$4 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$4(uri, str);
                return onOtherUrlAction$lambda$4;
        }
    }
}
