package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes6.dex */
public final class vdq {
    public static final clc a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bwi("myVibe", R.string.shortcut_short_label_play_my_vibe, R.string.shortcut_long_label_play_my_vibe, R.drawable.ic_shortcut_play_my_vibe_48));
        arrayList.add(new goi("startAudioRecognition", R.string.shortcut_short_label_music_recognition_redesign, R.string.shortcut_long_label_music_recognition_redesign, R.drawable.ic_shortcut_recognition_48));
        arrayList.add(new yvk("playQueue", R.string.shortcut_short_label_play_last_queue, R.string.shortcut_long_label_play_last_queue, R.drawable.ic_shortcut_play_last_queue_48));
        arrayList.add(new bga("openDownloadedTracks", R.string.shortcut_short_label_downloaded, R.string.shortcut_long_label_downloaded, R.drawable.ic_shortcut_cached_tracks_48));
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(zsd.b0(((ndq) it.next()).b(context)));
        }
        pjc b0 = zsd.b0(new u21(19, (pjc[]) CollectionsKt.w0(arrayList2).toArray(new pjc[0]), arrayList, context));
        msa msaVar = nsa.b;
        return new clc(zsd.Y(b0, yd5.M(1, ssa.SECONDS)), new ilp(3, 1, null));
    }

    public static void b(MainScreenActivity mainScreenActivity, String str) {
        ssg.a(4, "ShortcutsHelper", "reportShortcutUsed(): shortcutId = ".concat(str), null);
        l1b.i(mainScreenActivity).reportShortcutUsed(str);
        lg3.e0("ShortCut", Collections.singletonMap("type", str));
    }
}
