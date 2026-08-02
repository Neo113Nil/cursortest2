package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.entities.DivMessageData;
import com.yandex.messaging.internal.entities.FileMessageData;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import java.util.List;

/* loaded from: classes15.dex */
public final class zw80 implements MediaMessageData.MessageHandler {
    public final List a;

    public zw80(List list) {
        this.a = list;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object a(ImageMessageData imageMessageData) {
        List list = this.a;
        z83.h(null, list.size() == 1);
        u2r u2rVar = (u2r) list.get(0);
        imageMessageData.type = 1;
        AttachInfo attachInfo = u2rVar.b;
        imageMessageData.fileName = attachInfo.fileName;
        imageMessageData.fileId = u2rVar.a;
        imageMessageData.width = Integer.valueOf(attachInfo.width);
        imageMessageData.height = Integer.valueOf(attachInfo.height);
        imageMessageData.animated = attachInfo.isAnimated();
        imageMessageData.imageSize = Long.valueOf(attachInfo.size);
        return imageMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object b(VoiceMessageData voiceMessageData) {
        List list = this.a;
        list.size();
        z83.i();
        u2r u2rVar = (u2r) list.get(0);
        voiceMessageData.fileName = u2rVar.b.fileName;
        voiceMessageData.fileId = u2rVar.a;
        return voiceMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object c(StickerMessageData stickerMessageData) {
        throw new IllegalArgumentException("incorrect message type 'sticker'");
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object d(DivMessageData divMessageData) {
        throw new IllegalArgumentException("incorrect message type 'div'");
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object e(GalleryMessageData galleryMessageData) {
        List list = this.a;
        z83.h(null, list.size() == galleryMessageData.items.length);
        int length = galleryMessageData.items.length;
        for (int i = 0; i < length; i++) {
            PlainMessage.Item[] itemArr = galleryMessageData.items;
            PlainMessage.Image image = itemArr[i].image;
            itemArr[i] = new PlainMessage.Item(image.copy(PlainMessage.FileInfo.copy$default(image.fileInfo, 0L, ((u2r) list.get(i)).b.fileName, ((u2r) list.get(i)).b.size, ((u2r) list.get(i)).a, null, 17, null), ((u2r) list.get(i)).b.width, ((u2r) list.get(i)).b.height, ((u2r) list.get(i)).b.isAnimated()));
        }
        return galleryMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object f(VideoMessageData videoMessageData) {
        List list = this.a;
        z83.h(null, list.size() == 1);
        u2r u2rVar = (u2r) list.get(0);
        videoMessageData.type = 1001;
        videoMessageData.size = Long.valueOf(u2rVar.b.size);
        AttachInfo attachInfo = u2rVar.b;
        videoMessageData.fileName = attachInfo.fileName;
        videoMessageData.fileId = u2rVar.a;
        videoMessageData.width = attachInfo.width;
        videoMessageData.height = attachInfo.height;
        videoMessageData.durationMs = attachInfo.durationMs;
        videoMessageData.thumbHash = attachInfo.thumbHash;
        return videoMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object g(FileMessageData fileMessageData) {
        List list = this.a;
        z83.h(null, list.size() == 1);
        u2r u2rVar = (u2r) list.get(0);
        fileMessageData.type = 6;
        fileMessageData.size = Long.valueOf(u2rVar.b.size);
        fileMessageData.fileName = u2rVar.b.fileName;
        fileMessageData.fileId = u2rVar.a;
        return fileMessageData;
    }
}
