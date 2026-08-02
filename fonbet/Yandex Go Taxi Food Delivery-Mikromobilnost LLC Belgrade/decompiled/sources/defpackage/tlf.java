package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class tlf {
    public final Intent a;
    public final Bundle b;

    public tlf(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.a;
        intent.setData(uri);
        context.startActivity(intent, this.b);
    }
}
