package defpackage;

import com.yandex.messaging.internal.entities.DivMessageData;
import com.yandex.messaging.internal.entities.GalleryMessageData;

/* loaded from: classes15.dex */
public final class y8t extends me10 {
    @Override // defpackage.me10, com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    /* renamed from: h */
    public final String d(DivMessageData divMessageData) {
        String str = divMessageData.text;
        if (str != null) {
            if (str.length() == 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return super.d(divMessageData);
    }

    @Override // defpackage.me10, com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    /* renamed from: i */
    public final String e(GalleryMessageData galleryMessageData) {
        String str = galleryMessageData.text;
        if (str != null) {
            if (str.length() == 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return super.e(galleryMessageData);
    }
}
