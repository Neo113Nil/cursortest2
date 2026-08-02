package ru.yandex.video.m3.player.ui.debug.compose.util;

import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.fid;
import defpackage.ljs0;
import defpackage.oeb1;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"Ly7m;", "size", "Lzy11;", "EmptySpacer-8Feqmps", "(FLfid;I)V", "EmptySpacer", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposeUtilsKt {
    /* renamed from: EmptySpacer-8Feqmps, reason: not valid java name */
    public static final void m860EmptySpacer8Feqmps(final float f, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(710765433);
        if ((i & 6) == 0) {
            i2 = (btsVar.b(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            oeb1.c(btsVar, ljs0.m(c530.a, f));
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.util.ComposeUtilsKt$EmptySpacer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }

                public final void invoke(fid fidVar2, int i3) {
                    ComposeUtilsKt.m860EmptySpacer8Feqmps(f, fidVar2, vng.O(i | 1));
                }
            };
        }
    }
}
