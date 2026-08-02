package ru.yandex.video.m3.player.ui.debug.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.fid;
import defpackage.n4u0;
import defpackage.oz40;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt;
import ru.yandex.video.m3.player.ui.debug.compose.theme.ThemeKt;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfig;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfigKt;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlags;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlagsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u000fR+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010$\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/yandex/video/m3/player/ui/debug/view/PlayerDebugView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ln4u0;", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "debugDataStateFlow", "Lzy11;", "setDebugDataStateFlow", "(Ln4u0;)V", "<set-?>", "stateFlow$delegate", "Loz40;", "getStateFlow", "()Ln4u0;", "setStateFlow", "stateFlow", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;", "playerDebugViewFlags$delegate", "getPlayerDebugViewFlags", "()Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;", "setPlayerDebugViewFlags", "(Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;)V", "playerDebugViewFlags", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;", "playerDebugViewConfig$delegate", "getPlayerDebugViewConfig", "()Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;", "setPlayerDebugViewConfig", "(Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;)V", "playerDebugViewConfig", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerDebugView extends FrameLayout {
    public static final int $stable = ComposeView.$stable;
    private final ComposeView composeView;

    /* renamed from: playerDebugViewConfig$delegate, reason: from kotlin metadata */
    private final oz40 playerDebugViewConfig;

    /* renamed from: playerDebugViewFlags$delegate, reason: from kotlin metadata */
    private final oz40 playerDebugViewFlags;

    /* renamed from: stateFlow$delegate, reason: from kotlin metadata */
    private final oz40 stateFlow;

    public PlayerDebugView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.stateFlow = f.j(bvf0.c(new DebugData(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, false, 67108863, null)));
        this.playerDebugViewFlags = f.j(PlayerDebugViewFlagsKt.PlayerDebugViewFlags$default(null, 1, null));
        this.playerDebugViewConfig = f.j(PlayerDebugViewConfigKt.PlayerDebugViewConfig$default(null, 1, null));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        this.composeView = composeView;
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(composeView);
        composeView.setContent(new a(218106920, new wls() { // from class: ru.yandex.video.m3.player.ui.debug.view.PlayerDebugView.1
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.player.ui.debug.view.PlayerDebugView$1$1] */
            public final void invoke(fid fidVar, int i2) {
                if ((i2 & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return;
                    }
                }
                final PlayerDebugView playerDebugView = PlayerDebugView.this;
                ThemeKt.DebugTheme(false, null, wwg.i(fidVar, 820428845, new wls() { // from class: ru.yandex.video.m3.player.ui.debug.view.PlayerDebugView.1.1
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i3) {
                        if ((i3 & 3) == 2) {
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.E()) {
                                btsVar2.Y();
                                return;
                            }
                        }
                        DebugViewKt.DebugView(PlayerDebugView.this.getStateFlow(), null, PlayerDebugView.this.getPlayerDebugViewFlags(), PlayerDebugView.this.getPlayerDebugViewConfig(), fidVar2, 0, 2);
                    }

                    @Override // defpackage.wls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((fid) obj, ((Number) obj2).intValue());
                        return zy11.a;
                    }
                }), fidVar, 384, 3);
            }

            @Override // defpackage.wls
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((fid) obj, ((Number) obj2).intValue());
                return zy11.a;
            }
        }, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n4u0 getStateFlow() {
        return (n4u0) this.stateFlow.getValue();
    }

    private final void setStateFlow(n4u0 n4u0Var) {
        this.stateFlow.setValue(n4u0Var);
    }

    public final PlayerDebugViewConfig getPlayerDebugViewConfig() {
        return (PlayerDebugViewConfig) this.playerDebugViewConfig.getValue();
    }

    public final PlayerDebugViewFlags getPlayerDebugViewFlags() {
        return (PlayerDebugViewFlags) this.playerDebugViewFlags.getValue();
    }

    public final void setDebugDataStateFlow(n4u0 debugDataStateFlow) {
        setStateFlow(debugDataStateFlow);
    }

    public final void setPlayerDebugViewConfig(PlayerDebugViewConfig playerDebugViewConfig) {
        this.playerDebugViewConfig.setValue(playerDebugViewConfig);
    }

    public final void setPlayerDebugViewFlags(PlayerDebugViewFlags playerDebugViewFlags) {
        this.playerDebugViewFlags.setValue(playerDebugViewFlags);
    }

    public /* synthetic */ PlayerDebugView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
