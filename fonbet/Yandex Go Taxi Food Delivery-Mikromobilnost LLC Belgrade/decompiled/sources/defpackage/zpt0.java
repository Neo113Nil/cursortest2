package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.payment.sdk.ui.BaseActivity;

/* loaded from: classes2.dex */
public final class zpt0 extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        Bundle bundle = (Bundle) obj;
        Intent intent = new Intent(context, (Class<?>) (bundle != null ? bundle.getSerializable(BaseActivity.EXTRA_CLASS_NAME) : null));
        intent.putExtras(bundle);
        return intent;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return new frt0(i, intent);
    }
}
