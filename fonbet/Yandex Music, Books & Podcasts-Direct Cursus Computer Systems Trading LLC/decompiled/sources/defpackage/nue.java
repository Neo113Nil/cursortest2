package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.video.m3.data.CodecInfo;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes5.dex */
public final class nue implements rih {
    public final LinkedHashMap a;

    public nue(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    @Override // defpackage.rih
    public List b(String str, boolean z, boolean z2) {
        str.getClass();
        List e = zjh.e(str, z, z2);
        e.getClass();
        TrackType trackType = l5i.o(str) ? TrackType.Video : l5i.k(str) ? TrackType.Audio : l5i.n(str) ? TrackType.Subtitles : null;
        List<mih> list = e;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (mih mihVar : list) {
            CodecInfo.Companion.getClass();
            arrayList.add(rq4.a(mihVar));
        }
        this.a.put(trackType, new MediaCodecSelectorLog(str, z, z2, arrayList, null));
        return e;
    }
}
