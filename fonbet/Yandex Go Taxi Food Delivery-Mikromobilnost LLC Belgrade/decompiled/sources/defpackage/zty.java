package defpackage;

import android.media.AudioManager;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.a;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.model.MediaDataKt;
import ru.yandex.video.m3.list_player_manager.model.Stream;
import ru.yandex.video.m3.list_player_manager.model.StreamType;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes7.dex */
public final class zty implements r4l {
    public static final ImageView.ScaleType m = ImageView.ScaleType.CENTER_CROP;
    public static final i3y n = a.a(new wky(15));
    public final ListYandexPlayer a;
    public final com.yandex.go.feed_video.domain.manager.a b;
    public final String c;
    public ru.yandex.taxi.audio.a d;
    public final ArrayList e = new ArrayList();
    public ListYandexPlayerView f;
    public MediaData g;
    public PlaybackConfig h;
    public final wty i;
    public final xty j;
    public final ImageView.ScaleType k;
    public final Boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    public zty(List list, v4l v4lVar, ListYandexPlayer listYandexPlayer, com.yandex.go.feed_video.domain.manager.a aVar, String str) {
        Object obj;
        this.a = listYandexPlayer;
        this.b = aVar;
        this.c = str;
        JSONObject jSONObject = v4lVar.d;
        this.g = d(list, jSONObject);
        this.h = h(v4lVar);
        wty wtyVar = new wty(0 == true ? 1 : 0, this);
        this.i = wtyVar;
        this.j = new xty();
        ImageView.ScaleType scaleType = m;
        this.k = scaleType;
        listYandexPlayer.addObserver(wtyVar);
        String J = jSONObject != null ? cvw.J("scale_type", jSONObject) : null;
        Iterator<E> it = yty.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((ImageView.ScaleType) obj).name(), J)) {
                    break;
                }
            }
        }
        ImageView.ScaleType scaleType2 = (ImageView.ScaleType) obj;
        this.k = scaleType2 != null ? scaleType2 : scaleType;
        Boolean valueOf = jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("play_from_begin")) : null;
        this.l = Boolean.valueOf(valueOf != null ? valueOf.booleanValue() : false);
    }

    public static MediaData d(List list, JSONObject jSONObject) {
        EmptyList emptyList = EmptyList.a;
        if (jSONObject == null) {
            jst.e.c("Video element for YandexListPlayer should have payload");
            return MediaDataKt.MediaData$default(emptyList, null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("streams");
        i3y i3yVar = n;
        if (optJSONArray != null && optJSONArray.length() != 0) {
            if (!optJSONArray.isNull(0)) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = optJSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String J = cvw.J("stream", jSONObject2);
                        Stream stream = J != null ? new Stream((StreamType) ((Map) i3yVar.getValue()).getOrDefault(cvw.J("stream_type", jSONObject2), null), J) : null;
                        if (stream == null) {
                            jst.e.c("Cannot parse stream from video payload");
                            return MediaDataKt.MediaData$default(emptyList, null, 2, null);
                        }
                        arrayList.add(stream);
                    }
                }
                MediaData.Builder builder = new MediaData.Builder(arrayList);
                builder.setFirstFrameUrl(cvw.J("first_frame_url", jSONObject));
                builder.setFirstFrameHash(cvw.J("first_frame_hash", jSONObject));
                builder.setVideoContentId(cvw.J("uuid", jSONObject));
                builder.setShowFirstFrameUntilPlay(jSONObject.optBoolean("show_first_frame_until_play"));
                return builder.build();
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jol jolVar = (jol) it.next();
            StreamType streamType = (StreamType) ((Map) i3yVar.getValue()).getOrDefault(jolVar.b, null);
            if (streamType == null) {
                jst.e.c("Cannot parse source mimeType to YandexListPlayer StreamType");
                return MediaDataKt.MediaData$default(emptyList, null, 2, null);
            }
            arrayList.add(new Stream(streamType, jolVar.a.toString()));
        }
        MediaData.Builder builder2 = new MediaData.Builder(arrayList);
        builder2.setFirstFrameUrl(cvw.J("first_frame_url", jSONObject));
        builder2.setFirstFrameHash(cvw.J("first_frame_hash", jSONObject));
        builder2.setVideoContentId(cvw.J("uuid", jSONObject));
        builder2.setShowFirstFrameUntilPlay(jSONObject.optBoolean("show_first_frame_until_play"));
        return builder2.build();
    }

    @Override // defpackage.r4l
    public final void a(q4l q4lVar) {
        this.e.add(q4lVar);
    }

    @Override // defpackage.r4l
    public final void b(long j) {
        this.a.seekTo(j);
    }

    @Override // defpackage.r4l
    public final void c(List list, v4l v4lVar) {
        this.h = h(v4lVar);
        MediaData d = d(list, v4lVar.d);
        this.g = d;
        this.a.setSource(d, this.h);
    }

    public final void e(ListYandexPlayerView listYandexPlayerView) {
        ListYandexPlayer listYandexPlayer = this.a;
        listYandexPlayerView.attachPlayer(listYandexPlayer);
        listYandexPlayerView.addObserver(this.j);
        this.f = listYandexPlayerView;
        this.d = new ru.yandex.taxi.audio.a((AudioManager) listYandexPlayerView.getContext().getApplicationContext().getSystemService(AudioManager.class), new uhx(2, this));
        listYandexPlayer.setSource(this.g, this.h);
        listYandexPlayerView.setScaleType(this.k);
    }

    public final void f() {
        this.d = null;
        ListYandexPlayerView listYandexPlayerView = this.f;
        if (listYandexPlayerView != null) {
            listYandexPlayerView.removeObserver(this.j);
            listYandexPlayerView.detach();
        }
        this.f = null;
        this.a.dropSource();
    }

    public final void g(q4l q4lVar) {
        this.e.remove(q4lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r3 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PlaybackConfig h(v4l v4lVar) {
        String str;
        JSONObject jSONObject = v4lVar.d;
        if (jSONObject != null && (str = jSONObject.optString("from_block")) != null) {
            if (str.length() <= 0) {
                str = null;
            }
        }
        str = this.c;
        boolean z = v4lVar.a;
        long optLong = jSONObject != null ? jSONObject.optLong("start_position") : 0L;
        boolean z2 = v4lVar.c;
        boolean z3 = v4lVar.b;
        if (str.length() <= 0) {
            str = null;
        }
        return new PlaybackConfig(z, optLong, z2, z3, str != null ? g8e.z("from_block", str) : null);
    }

    @Override // defpackage.r4l
    public final void pause() {
        this.a.pause();
        xpy xpyVar = new xpy(3);
        Iterator it = kotlin.collections.a.J0(this.e).iterator();
        while (it.hasNext()) {
            xpyVar.invoke((q4l) it.next());
        }
    }

    @Override // defpackage.r4l
    public final void play() {
        boolean l = jl40.l(this.l, Boolean.TRUE);
        ListYandexPlayer listYandexPlayer = this.a;
        if (l) {
            listYandexPlayer.seekTo(0L);
        }
        listYandexPlayer.play();
    }

    @Override // defpackage.r4l
    public final void release() {
        wty wtyVar = this.i;
        wtyVar.onPausePlayback();
        ru.yandex.taxi.audio.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        ListYandexPlayer listYandexPlayer = this.a;
        listYandexPlayer.removeObserver(wtyVar);
        this.b.c(listYandexPlayer);
        f();
    }

    @Override // defpackage.r4l
    public final void setMuted(boolean z) {
        this.a.setMuted(z);
    }
}
