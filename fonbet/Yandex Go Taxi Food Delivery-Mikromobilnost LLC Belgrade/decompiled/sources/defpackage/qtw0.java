package defpackage;

import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class qtw0 extends xqt {
    public static final qtw0 e = new qtw0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, rtw0.INSTANCE.serializer(), qoi0.a(rtw0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, ptw0.Companion.serializer(), qoi0.a(ptw0.class)));
    }
}
