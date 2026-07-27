package kotlin.text;

import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishMockkKtorWidget extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? CatchingFishDaggerGraphQL.class : super.loadClass(str, z);
    }
}
