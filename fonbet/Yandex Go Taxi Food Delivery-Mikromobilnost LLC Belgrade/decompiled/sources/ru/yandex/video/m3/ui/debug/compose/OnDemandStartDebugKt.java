package ru.yandex.video.m3.ui.debug.compose;

import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.f530;
import defpackage.fid;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "isOnDemand", "Lf530;", "modifier", "Lzy11;", "OnDemandStartDebug", "(Ljava/lang/Boolean;Lf530;Lfid;II)V", "OnDemandStartDebugPreview", "(Lfid;I)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnDemandStartDebugKt {
    public static final void OnDemandStartDebug(Boolean bool, final f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        final Boolean bool2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(349986199);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(bool) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            bool2 = bool;
        } else {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            f530 f530Var2 = f530Var;
            Integer valueOf = Integer.valueOf(R.string.isOnDemandStart);
            Flags flags = Flags.INSTANCE;
            bool2 = bool;
            BlocksKt.DebugBlock(valueOf, bool2, f530Var2, false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowIsOnDemand(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowIsOnDemandLabel(), btsVar, (i3 << 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, 8);
            f530Var = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.OnDemandStartDebugKt$OnDemandStartDebug$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    OnDemandStartDebugKt.OnDemandStartDebug(bool2, f530Var, fidVar2, vng.O(i | 1), i2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OnDemandStartDebugPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-646462074);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            ThemeKt.DebugTheme(false, ComposableSingletons$OnDemandStartDebugKt.INSTANCE.m920getLambda1$video_player_internalRelease(), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.OnDemandStartDebugKt$OnDemandStartDebugPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }

                public final void invoke(fid fidVar2, int i2) {
                    OnDemandStartDebugKt.OnDemandStartDebugPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }
}
