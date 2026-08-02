package defpackage;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class vg0 implements gih {
    public final Context a;

    public vg0(Context context) {
        this.a = context.getApplicationContext();
    }

    public Object a(String str) {
        List split$default;
        Long r0;
        str.getClass();
        try {
            r7o r7oVar = z7o.b;
            File filesDir = this.a.getFilesDir();
            filesDir.getClass();
            split$default = StringsKt__StringsKt.split$default(zac.d(new File(new File(new File(filesDir, "experiments2"), str), "throttle.txt")), new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null);
            String str2 = (String) CollectionsKt.S(split$default, 0);
            if (str2 == null || (r0 = StringsKt.r0(10, str2)) == null) {
                return null;
            }
            long longValue = r0.longValue();
            String str3 = (String) CollectionsKt.S(split$default, 1);
            return new uyb(longValue, str3 != null ? StringsKt.toIntOrNull(str3) : null);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }

    @Override // defpackage.gih
    public iih h(rdk rdkVar) {
        Context context;
        int i = dvt.a;
        if (i < 23 || (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new t7l(5).h(rdkVar);
        }
        int i2 = l5i.i(((dsc) rdkVar.d).n);
        vq1.Y("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(dvt.N(i2)));
        return new qne(new rt1(i2, 0), new rt1(i2, 1)).h(rdkVar);
    }

    public /* synthetic */ vg0(Context context, boolean z) {
        this.a = context;
    }
}
