package defpackage;

import android.os.Bundle;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls3a;", "Lo4a;", "<init>", "()V", "flex-navigation-feature_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class s3a extends o4a {
    @Override // defpackage.o4a, androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        if (h4a.B(this)) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("dependencies_label") : null;
            if (string != null) {
                q3a.b.n(string);
            }
        }
    }

    @Override // defpackage.o4a
    public final o3a x() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("dependencies_label") : null;
        szm szmVar = string != null ? (szm) ((LinkedHashMap) q3a.b.a).get(string) : null;
        if (szmVar != null) {
            return (o3a) szmVar.get();
        }
        return null;
    }
}
