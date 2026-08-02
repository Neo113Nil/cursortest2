package defpackage;

import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes15.dex */
public final class zoq0 {
    public final w3c a;
    public final int b;
    public final int c;
    public final long d = System.currentTimeMillis();
    public long e;

    public zoq0(w3c w3cVar, int i, int i2) {
        this.a = w3cVar;
        this.b = i;
        this.c = i2;
    }

    public final String a() {
        int i = this.b;
        if (i == 6) {
            return "file";
        }
        if (i == 7) {
            return "div";
        }
        if (i == 8) {
            return "unsupported";
        }
        if (i == 10) {
            return "gallery";
        }
        if (i == 11) {
            return "voice";
        }
        if (i == 1000) {
            return "technical_message_end_code";
        }
        if (i == 1001) {
            return "video_file";
        }
        switch (i) {
            case -3:
                return "moderated_out";
            case -2:
                return "empty";
            case -1:
                return "removed";
            case 0:
                return "text";
            case 1:
                return "image";
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return MetaDataField.GEOLOCATION_FIELD;
            case 4:
                return "sticker";
            default:
                switch (i) {
                    case 101:
                        return "chat_created";
                    case 102:
                        return "chat_info_changed";
                    case 103:
                        return "chat_avatar_changed";
                    case 104:
                        return "users_added_to_chat";
                    case 105:
                        return "users_removed_from_chat";
                    case 106:
                        return "user_leave_chat";
                    case HProv.PP_SET_PIN /* 107 */:
                        return "user_join_chat";
                    case 108:
                        return "user_join_chat_by_link";
                    case 109:
                        return "call";
                    case 110:
                        return "generic";
                    default:
                        return oyr.i(i, "unknown ");
                }
        }
    }
}
