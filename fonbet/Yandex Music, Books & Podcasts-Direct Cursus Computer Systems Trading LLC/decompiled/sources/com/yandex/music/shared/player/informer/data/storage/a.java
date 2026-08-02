package com.yandex.music.shared.player.informer.data.storage;

import com.google.gson.Gson;
import defpackage.aok;
import defpackage.b6e;
import defpackage.bel;
import defpackage.btf;
import defpackage.c5b;
import defpackage.cel;
import defpackage.del;
import defpackage.fel;
import defpackage.gel;
import defpackage.jyr;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a {
    public final jyr a = btf.b(new aok(23));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [cel] */
    /* JADX WARN: Type inference failed for: r3v6, types: [del] */
    public final List a(String str) {
        String trackId;
        Long timestamp;
        bel belVar;
        String trackId2;
        Long timestamp2;
        Long timestamp3;
        if (StringsKt.U(str)) {
            return c5b.a;
        }
        Object d = ((Gson) this.a.getValue()).d(str, PlayerInformerImpressionsParser$PlayerInformerImpressionJson[].class);
        d.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Object[]) d) {
            PlayerInformerImpressionsParser$PlayerInformerImpressionJson playerInformerImpressionsParser$PlayerInformerImpressionJson = (PlayerInformerImpressionsParser$PlayerInformerImpressionJson) obj;
            fel type = playerInformerImpressionsParser$PlayerInformerImpressionJson.getType();
            int i = type == null ? -1 : gel.a[type.ordinal()];
            bel belVar2 = null;
            if (i != -1) {
                if (i == 1) {
                    String artistId = playerInformerImpressionsParser$PlayerInformerImpressionJson.getArtistId();
                    if (artistId != null && (trackId = playerInformerImpressionsParser$PlayerInformerImpressionJson.getTrackId()) != null && (timestamp = playerInformerImpressionsParser$PlayerInformerImpressionJson.getTimestamp()) != null) {
                        belVar = new cel(timestamp.longValue(), trackId, artistId);
                        belVar2 = belVar;
                    }
                } else if (i == 2) {
                    String artistId2 = playerInformerImpressionsParser$PlayerInformerImpressionJson.getArtistId();
                    if (artistId2 != null && (trackId2 = playerInformerImpressionsParser$PlayerInformerImpressionJson.getTrackId()) != null && (timestamp2 = playerInformerImpressionsParser$PlayerInformerImpressionJson.getTimestamp()) != null) {
                        belVar = new del(timestamp2.longValue(), trackId2, artistId2);
                        belVar2 = belVar;
                    }
                } else {
                    if (i != 3) {
                        b6e.s();
                        return null;
                    }
                    String trackId3 = playerInformerImpressionsParser$PlayerInformerImpressionJson.getTrackId();
                    if (trackId3 != null && (timestamp3 = playerInformerImpressionsParser$PlayerInformerImpressionJson.getTimestamp()) != null) {
                        belVar2 = new bel(trackId3, timestamp3.longValue());
                    }
                }
            }
            if (belVar2 != null) {
                arrayList.add(belVar2);
            }
        }
        return arrayList;
    }
}
