package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class k {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;
    public static final zvd c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        a = configArr;
        b = i >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        c = new zvd((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.U(str)) {
            return null;
        }
        String o0 = StringsKt.o0(StringsKt.o0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.l0('.', StringsKt.l0('/', o0, o0), ""));
    }

    public static final ohu c(View view) {
        ohu ohuVar;
        Object tag = view.getTag(R.id.coil_request_manager);
        ohu ohuVar2 = tag instanceof ohu ? (ohu) tag : null;
        if (ohuVar2 != null) {
            return ohuVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil_request_manager);
                ohuVar = tag2 instanceof ohu ? (ohu) tag2 : null;
                if (ohuVar == null) {
                    ohuVar = new ohu(view);
                    view.addOnAttachStateChangeListener(ohuVar);
                    view.setTag(R.id.coil_request_manager, ohuVar);
                }
            } finally {
            }
        }
        return ohuVar;
    }

    public static final boolean d(Uri uri) {
        return Intrinsics.d(uri.getScheme(), "file") && Intrinsics.d((String) CollectionsKt.firstOrNull(uri.getPathSegments()), "android_asset");
    }

    public static final int e(x97 x97Var, nso nsoVar) {
        if (x97Var instanceof q38) {
            return ((q38) x97Var).n;
        }
        int ordinal = nsoVar.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Integer.MAX_VALUE;
        }
        b6e.s();
        return 0;
    }
}
