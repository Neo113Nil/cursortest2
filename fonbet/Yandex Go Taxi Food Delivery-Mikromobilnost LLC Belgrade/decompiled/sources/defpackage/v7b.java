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
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class v7b implements MediaMessageData.MessageHandler {
    public final Integer a;

    public v7b(Integer num) {
        this.a = num;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object a(ImageMessageData imageMessageData) {
        imageMessageData.fileSource = this.a;
        return imageMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object b(VoiceMessageData voiceMessageData) {
        return voiceMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object c(StickerMessageData stickerMessageData) {
        return stickerMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object d(DivMessageData divMessageData) {
        return divMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object e(GalleryMessageData galleryMessageData) {
        PlainMessage.Item[] itemArr = galleryMessageData.items;
        ArrayList arrayList = new ArrayList(itemArr.length);
        for (PlainMessage.Item item : itemArr) {
            PlainMessage.Image image = item.image;
            arrayList.add(item.copy(PlainMessage.Image.copy$default(image, PlainMessage.FileInfo.copy$default(image.fileInfo, 0L, null, 0L, null, this.a, 15, null), 0, 0, false, 14, null)));
        }
        galleryMessageData.items = (PlainMessage.Item[]) arrayList.toArray(new PlainMessage.Item[0]);
        return galleryMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object f(VideoMessageData videoMessageData) {
        videoMessageData.fileSource = this.a;
        return videoMessageData;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object g(FileMessageData fileMessageData) {
        fileMessageData.fileSource = this.a;
        return fileMessageData;
    }
}
