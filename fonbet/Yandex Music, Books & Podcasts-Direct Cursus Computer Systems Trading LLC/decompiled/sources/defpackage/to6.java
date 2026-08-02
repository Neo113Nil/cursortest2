package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import java.util.concurrent.ConcurrentHashMap;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class to6 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final int a(qo6 qo6Var, Context context) {
        qo6Var.getClass();
        context.getClass();
        int i = 0;
        switch (qo6Var.ordinal()) {
            case 0:
            case 9:
            case 11:
                i = R.attr.coverDefaultTrack;
                break;
            case 1:
            case 2:
                i = R.attr.coverDefaultAlbum;
                break;
            case 3:
                i = R.attr.coverDefaultArtist;
                break;
            case 4:
            case 5:
                i = R.attr.coverDefaultPlaylist;
                break;
            case 6:
                i = R.attr.coverDefaultConcert;
                break;
            case 7:
                i = R.attr.coverDefaultPodcast;
                break;
            case 8:
            case 13:
                i = R.attr.coverDefaultRadio;
                break;
            case 10:
                i = R.attr.bgPlaceholderOval;
                break;
            case 12:
                i = R.attr.bgPlaceholder;
                break;
            case 14:
                break;
            default:
                b6e.s();
                return 0;
        }
        return b(context, i);
    }

    public static final int b(Context context, int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        if (context instanceof Application) {
            ou0.a.getClass();
            int i3 = yu0.a[klx.Z(context).ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge : R.style.AppTheme_Dark_EdgeToEdge;
            Object computeIfAbsent = a.computeIfAbsent(Long.valueOf((i3 << 32) | (i & 4294967295L)), new so6(i2, new ro6(context, i3, i, i2)));
            computeIfAbsent.getClass();
            return ((Number) computeIfAbsent).intValue();
        }
        context.getClass();
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        theme.getClass();
        theme.resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public static final int c(qo6 qo6Var, Context context) {
        qo6Var.getClass();
        context.getClass();
        int i = 0;
        switch (qo6Var.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
                i = R.attr.bgPlaceholder;
                break;
            case 10:
                i = R.attr.bgPlaceholderOval;
                break;
            case 14:
                break;
            default:
                b6e.s();
                return 0;
        }
        return b(context, i);
    }
}
