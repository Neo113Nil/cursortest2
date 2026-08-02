package defpackage;

import android.content.res.Resources;
import android.widget.TextView;
import com.yandex.messaging.internal.entities.DivMessageData;
import com.yandex.messaging.internal.entities.FileMessageData;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import com.yandex.messaging.internal.view.chat.c;

/* loaded from: classes15.dex */
public final class y7b implements MediaMessageData.MessageHandler {
    public final Resources a;
    public final /* synthetic */ c b;

    public y7b(c cVar) {
        this.b = cVar;
        this.a = cVar.b.getResources();
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object a(ImageMessageData imageMessageData) {
        String a = ne10.a(imageMessageData, this.a);
        c cVar = this.b;
        cVar.I.setText(a, TextView.BufferType.EDITABLE);
        c.q(cVar, cVar.H, imageMessageData.fileId, imageMessageData.fileSource);
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object b(VoiceMessageData voiceMessageData) {
        String a = ne10.a(voiceMessageData, this.a);
        c cVar = this.b;
        cVar.I.setText(a, TextView.BufferType.EDITABLE);
        cVar.H.setVisibility(8);
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object c(StickerMessageData stickerMessageData) {
        String a = ne10.a(stickerMessageData, this.a);
        c cVar = this.b;
        cVar.I.setText(a, TextView.BufferType.EDITABLE);
        c.q(cVar, cVar.H, stickerMessageData.id, null);
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object d(DivMessageData divMessageData) {
        CharSequence a;
        String str = divMessageData.text;
        c cVar = this.b;
        if (str == null || str.length() == 0) {
            a = ne10.a(divMessageData, this.a);
        } else {
            a = ((v3k0) cVar.A).b(0, divMessageData.text);
        }
        cVar.I.setText(a, TextView.BufferType.EDITABLE);
        cVar.H.setVisibility(8);
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object e(GalleryMessageData galleryMessageData) {
        String a = ne10.a(galleryMessageData, this.a);
        c cVar = this.b;
        cVar.I.setText(a, TextView.BufferType.EDITABLE);
        c.q(cVar, cVar.H, galleryMessageData.previewId, galleryMessageData.b());
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object f(VideoMessageData videoMessageData) {
        h(vkb1.c(videoMessageData), videoMessageData.fileSource, videoMessageData.fileId, videoMessageData.fileName);
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object g(FileMessageData fileMessageData) {
        h(vkb1.c(fileMessageData), fileMessageData.fileSource, fileMessageData.fileId, fileMessageData.fileName);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(String str, Integer num, String str2, CharSequence charSequence) {
        int i;
        boolean z;
        j3b j3bVar;
        c cVar = this.b;
        Integer a = cVar.C.a(str);
        if (a != null) {
            i = a.intValue();
        } else {
            int i2 = xzq.b;
            i = xzq.b;
        }
        if (cVar.D.c(cVar.L, str, num) && (j3bVar = cVar.L) != null) {
            z = true;
            if (okb1.b(j3bVar).j()) {
            }
        }
        z = false;
        cVar.H.setVisibility(0);
        cVar.Q.c(i, str2, z);
        cVar.I.setText(charSequence, TextView.BufferType.EDITABLE);
    }
}
