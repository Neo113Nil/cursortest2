package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class r8n {
    public static final HashMap a;
    public static final HashMap b;

    static {
        q8n q8nVar;
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        q8n q8nVar2 = q8n.d;
        hashMap.put(1L, q8nVar2);
        hashMap2.put(q8nVar2, Collections.singletonList(1L));
        hashMap.put(2L, q8n.e);
        hashMap2.put((q8n) hashMap.get(2L), Collections.singletonList(2L));
        q8n q8nVar3 = q8n.f;
        hashMap.put(4L, q8nVar3);
        hashMap2.put(q8nVar3, Collections.singletonList(4L));
        q8n q8nVar4 = q8n.g;
        hashMap.put(8L, q8nVar4);
        hashMap2.put(q8nVar4, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            q8nVar = q8n.h;
            if (!hasNext) {
                break;
            }
            a.put((Long) it.next(), q8nVar);
        }
        b.put(q8nVar, asList);
        List asList2 = Arrays.asList(Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            q8n q8nVar5 = q8n.i;
            if (!hasNext2) {
                b.put(q8nVar5, asList2);
                return;
            } else {
                a.put((Long) it2.next(), q8nVar5);
            }
        }
    }

    public static Long a(q8n q8nVar, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) b.get(q8nVar);
        if (list == null) {
            return null;
        }
        supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
