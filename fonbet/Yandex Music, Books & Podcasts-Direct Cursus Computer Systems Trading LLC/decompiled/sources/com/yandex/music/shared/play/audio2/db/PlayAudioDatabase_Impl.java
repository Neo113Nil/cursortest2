package com.yandex.music.shared.play.audio2.db;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b58;
import defpackage.btf;
import defpackage.bvk;
import defpackage.c58;
import defpackage.c5b;
import defpackage.d1j;
import defpackage.e58;
import defpackage.ern;
import defpackage.iye;
import defpackage.jyr;
import defpackage.yeo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/music/shared/play/audio2/db/PlayAudioDatabase_Impl;", "Lcom/yandex/music/shared/play/audio2/db/PlayAudioDatabase;", "<init>", "()V", "shared-play-audio2"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class PlayAudioDatabase_Impl extends PlayAudioDatabase {
    public final jyr n = btf.b(new d1j(14, this));

    @Override // defpackage.ueo
    public final List c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c58(14, 15, 12));
        arrayList.add(new c58(15, 16, 13));
        arrayList.add(new b58(3));
        arrayList.add(new c58(17, 18, 14));
        arrayList.add(new c58(18, 19, 15));
        arrayList.add(new c58(19, 20, 16));
        arrayList.add(new c58(20, 21, 17));
        arrayList.add(new c58(21, 22, 18));
        arrayList.add(new c58(22, 23, 19));
        arrayList.add(new c58(23, 24, 20));
        arrayList.add(new c58(24, 25, 21));
        arrayList.add(new c58(25, 26, 22));
        arrayList.add(new c58(26, 27, 23));
        arrayList.add(new c58(27, 28, 24));
        arrayList.add(new c58(28, 29, 25));
        return arrayList;
    }

    @Override // defpackage.ueo
    public final iye d() {
        return new iye(this, new LinkedHashMap(), new LinkedHashMap(), "PlayAudioBundle");
    }

    @Override // defpackage.ueo
    public final yeo e() {
        return new e58(this);
    }

    @Override // defpackage.ueo
    public final Set k() {
        return new LinkedHashSet();
    }

    @Override // defpackage.ueo
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ern.a(bvk.class), c5b.a);
        return linkedHashMap;
    }

    @Override // com.yandex.music.shared.play.audio2.db.PlayAudioDatabase
    public final bvk v() {
        return (bvk) this.n.getValue();
    }
}
