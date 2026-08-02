package defpackage;

import android.content.Context;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final class x5t {
    public final Context a;

    public x5t(Context context) {
        this.a = context;
    }

    public static String a(ybb ybbVar, Context context) {
        if (ybbVar instanceof l20) {
            l20 l20Var = (l20) ybbVar;
            String str = l20Var.a;
            if (str != null) {
                return str;
            }
            if (l20Var.b.b == Album$AlbumType.SINGLE) {
                String string = context.getString(R.string.dialog_action_trailer_single);
                string.getClass();
                return string;
            }
            String string2 = context.getString(R.string.dialog_action_trailer_album);
            string2.getClass();
            return string2;
        }
        if (ybbVar instanceof fm1) {
            String str2 = ((fm1) ybbVar).a;
            if (str2 != null) {
                return str2;
            }
            String string3 = context.getString(R.string.dialog_action_trailer_artist);
            string3.getClass();
            return string3;
        }
        if (ybbVar instanceof o3m) {
            String str3 = ((o3m) ybbVar).a;
            if (str3 != null) {
                return str3;
            }
            String string4 = context.getString(R.string.dialog_action_trailer_playlist);
            string4.getClass();
            return string4;
        }
        if (!(ybbVar instanceof u1t)) {
            b6e.s();
            return null;
        }
        String string5 = context.getString(R.string.dialog_action_trailer_track);
        string5.getClass();
        return string5;
    }
}
