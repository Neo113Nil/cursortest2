package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.deeplink.generated.OpenNoticeAction;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes3.dex */
public abstract class tub1 {
    public static sk7 a(i6r i6rVar, Activity activity, w030 w030Var) {
        i6rVar.getClass();
        activity.getClass();
        w030Var.getClass();
        return new sk7(i6rVar);
    }

    public static OpenNoticeAction b(Uri uri) {
        String queryParameter;
        String queryParameter2 = uri.getQueryParameter("title");
        if (queryParameter2 == null || (queryParameter = uri.getQueryParameter("button_text")) == null) {
            return null;
        }
        String queryParameter3 = uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        String queryParameter4 = uri.getQueryParameter("action");
        String queryParameter5 = uri.getQueryParameter("image_url");
        ThemedImageUrlEntity themedImageUrlEntity = queryParameter5 != null ? new ThemedImageUrlEntity(queryParameter5, uri.getQueryParameter("image_url_dark")) : null;
        String queryParameter6 = uri.getQueryParameter("image_height");
        return new OpenNoticeAction(queryParameter2, queryParameter, queryParameter3, queryParameter4, themedImageUrlEntity, queryParameter6 != null ? bvu0.l(10, queryParameter6) : null, uri.getQueryParameter("secondary_button_text"), uri.getQueryParameter("secondary_button_action"), uri.getQueryParameter("buttons_orientation"));
    }

    public static long c(ef90 ef90Var, int i, int i2) {
        ef90Var.K(i);
        if (ef90Var.a() < 5) {
            return -9223372036854775807L;
        }
        int k = ef90Var.k();
        if ((8388608 & k) != 0 || ((2096896 & k) >> 8) != i2 || (k & 32) == 0 || ef90Var.y() < 7 || ef90Var.a() < 7 || (ef90Var.y() & 16) != 16) {
            return -9223372036854775807L;
        }
        ef90Var.i(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
