package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.webkit.URLUtil;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.type.UPSALE_STEP;
import com.yandex.plus.core.graphql.type.UPSALE_STEP_VIEW;
import com.yandex.plus.pay.repository.api.model.offers.UpsaleStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes7.dex */
public abstract class yma1 {
    public static String a(String str) {
        Object failure;
        try {
            if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
                str = "https://" + str;
            }
            failure = Uri.parse(str).getHost();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static Drawable b(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static Drawable c(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int d(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String q = eh20.q(str);
        q.getClass();
        switch (q.hashCode()) {
            case -2123537834:
                if (q.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (q.equals("video/mp2p")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (q.equals("video/mp2t")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (q.equals("video/webm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (q.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487656890:
                if (q.equals("image/avif")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1487464693:
                if (q.equals("image/heic")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1487464690:
                if (q.equals("image/heif")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (q.equals("image/jpeg")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1487018032:
                if (q.equals(GlideBitmapDownloader.ACCEPT_WEBP)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (q.equals("application/mp4")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1079884372:
                if (q.equals("video/x-msvideo")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (q.equals("text/vtt")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -879272239:
                if (q.equals("image/bmp")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -879258763:
                if (q.equals("image/png")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (q.equals("audio/x-matroska")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (q.equals("application/webm")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (q.equals("video/x-flv")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (q.equals("audio/ac3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (q.equals("audio/ac4")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (q.equals("audio/amr")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (q.equals("audio/mp4")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (q.equals("audio/ogg")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (q.equals("audio/wav")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (q.equals("video/mp4")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (q.equals("audio/3gpp")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (q.equals("audio/eac3")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (q.equals("audio/flac")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1504824762:
                if (q.equals("audio/midi")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (q.equals("audio/mpeg")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (q.equals("audio/webm")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (q.equals("video/x-matroska")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return -1;
    }

    public static int e(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final yib f(gm0 gm0Var) {
        ArrayList<fm0> arrayList = gm0Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (fm0 fm0Var : arrayList) {
            arrayList2.add(new xib(fm0Var.e, fm0Var.a, fm0Var.b, fm0Var.c, g(fm0Var.d)));
        }
        yf70 c0 = qje.c0(arrayList2);
        ArrayList arrayList3 = gm0Var.a;
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(g((UpsaleStep) it.next()));
        }
        return new yib(c0, qje.c0(arrayList4));
    }

    public static final UPSALE_STEP g(UpsaleStep upsaleStep) {
        int i = hm0.c[upsaleStep.ordinal()];
        if (i == 1) {
            return UPSALE_STEP.CHECKOUT;
        }
        if (i == 2) {
            return UPSALE_STEP.UPSALE;
        }
        if (i == 3) {
            return UPSALE_STEP.PRESALE;
        }
        w511.b();
        return null;
    }

    public static final UpsaleStep h(UPSALE_STEP_VIEW upsale_step_view) {
        int i = hm0.a[upsale_step_view.ordinal()];
        if (i == 1) {
            return UpsaleStep.CHECKOUT;
        }
        if (i == 2) {
            return UpsaleStep.UPSALE;
        }
        if (i == 3) {
            return UpsaleStep.PRESALE;
        }
        if (i == 4) {
            throw new GraphQLParseException("Unexpected UPSALE_STEP_VIEW value", null);
        }
        w511.b();
        return null;
    }
}
