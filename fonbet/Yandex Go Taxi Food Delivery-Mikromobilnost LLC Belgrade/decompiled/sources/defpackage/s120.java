package defpackage;

import android.os.Bundle;

/* loaded from: classes15.dex */
public abstract class s120 {
    public abstract String a();

    public abstract g720 b();

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("Messaging.Arguments.Key", a());
        bundle.putString("Messaging.Arguments.Source", b().c());
        return bundle;
    }
}
