package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cr1 implements r8c {
    public final /* synthetic */ int a;

    public /* synthetic */ cr1(int i) {
        this.a = i;
    }

    @Override // defpackage.r8c
    public final s8c a(Object obj, rwj rwjVar) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if (k.d(uri)) {
                    return new dr1(uri, rwjVar, 0);
                }
                return null;
            case 1:
                return new j33((Bitmap) obj, rwjVar, 0);
            case 2:
                return new j33((ByteBuffer) obj, rwjVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (Intrinsics.d(uri2.getScheme(), "content")) {
                    return new fe6(uri2, rwjVar);
                }
                return null;
            case 4:
                return new j33((Drawable) obj, rwjVar, 2);
            case 5:
                return new u9c((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (Intrinsics.d(uri3.getScheme(), "android.resource")) {
                    return new dr1(uri3, rwjVar, 1);
                }
                return null;
        }
    }
}
