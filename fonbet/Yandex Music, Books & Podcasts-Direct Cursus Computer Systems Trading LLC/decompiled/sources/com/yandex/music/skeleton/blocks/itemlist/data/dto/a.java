package com.yandex.music.skeleton.blocks.itemlist.data.dto;

import com.yandex.music.shared.dto.domainitem.PlaylistDomainItemDto;
import defpackage.a0f;
import defpackage.cg6;
import defpackage.eul;
import defpackage.g0f;
import defpackage.hwl;
import defpackage.iwl;
import defpackage.lwl;
import defpackage.neg;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(PlaylistItemDataDto playlistItemDataDto, cg6 cg6Var) {
        g0f g0fVar;
        int i;
        PlaylistDomainItemDto playlist;
        eul H;
        eul eulVar;
        if (cg6Var instanceof g0f) {
            g0fVar = (g0f) cg6Var;
            int i2 = g0fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0fVar.l = i2 - Integer.MIN_VALUE;
                Object obj = g0fVar.k;
                nm6 nm6Var = nm6.a;
                i = g0fVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (playlistItemDataDto == null || (playlist = playlistItemDataDto.getPlaylist()) == null || (H = neg.H(playlist)) == null) {
                        return null;
                    }
                    iwl iwlVar = iwl.a;
                    Integer trackCount = playlistItemDataDto.getTrackCount();
                    int intValue = trackCount != null ? trackCount.intValue() : 0;
                    Integer likesCount = playlistItemDataDto.getLikesCount();
                    g0fVar.j = H;
                    g0fVar.l = 1;
                    Object b = ((hwl) iwl.b.getValue()).b(H, intValue, likesCount, g0fVar);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    obj = b;
                    eulVar = H;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eulVar = g0fVar.j;
                    qgg.h0(obj);
                }
                return new a0f(eulVar, (lwl) obj);
            }
        }
        g0fVar = new g0f(cg6Var);
        Object obj2 = g0fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = g0fVar.l;
        if (i != 0) {
        }
        return new a0f(eulVar, (lwl) obj2);
    }
}
