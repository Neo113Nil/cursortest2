package defpackage;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore_release"}, k = 2, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: bc7, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public abstract class datastore_release {
    public static final File a(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), Intrinsics.h(str, "datastore/"));
    }
}
