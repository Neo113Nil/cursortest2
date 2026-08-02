package defpackage;

import android.net.Uri;
import com.squareup.wire.internal.MathMethodsKt;
import com.yandex.messaging.internal.entities.MediaFileMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.MessageSpan;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.io.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes3.dex */
public abstract class vkb1 {
    public static final void a(Logger logger, wsx0 wsx0Var, htx0 htx0Var, String str) {
        logger.fine(htx0Var.b + HexString.CHAR_SPACE + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + Extension.COLON_SPACE + wsx0Var.a);
    }

    public static final String b(long j) {
        String n;
        if (j <= -999500000) {
            n = oyr.n((j - 500000000) / MathMethodsKt.NANOS_PER_SECOND, " s ", new StringBuilder());
        } else if (j <= -999500) {
            n = oyr.n((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            n = oyr.n((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            n = oyr.n((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            n = oyr.n((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            n = oyr.n((j + 500000000) / MathMethodsKt.NANOS_PER_SECOND, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{n}, 1));
    }

    public static final String c(MediaFileMessageData mediaFileMessageData) {
        String str = mediaFileMessageData.fileName;
        if (str != null) {
            return b.m(new File(str));
        }
        return null;
    }

    public static final boolean d(Uri uri, String str) {
        String uri2 = uri.toString();
        return evu0.y(uri2, "?attach=true", false) && evu0.y(uri2, str, false);
    }

    public static final void e(MessageData messageData, v3k0 v3k0Var) {
        String str = messageData.text;
        if (str == null || evu0.J(str)) {
            messageData.textSpans = null;
            return;
        }
        String str2 = messageData.text;
        String spannableStringBuilder = str2 != null ? v3k0Var.b(2, str2).toString() : null;
        ArrayList arrayList = new ArrayList();
        for (wh21 wh21Var : if90.d(spannableStringBuilder, true)) {
            arrayList.add(new MessageSpan(wh21Var.a, wh21Var.b, wh21Var.c, wh21Var.d.toString()));
        }
        messageData.textSpans = arrayList;
    }

    public static final boolean f(MessageData messageData, boolean z) {
        boolean z2 = messageData.notificationBehaviour == 1;
        return z ? z2 : messageData.isSilent || z2;
    }
}
