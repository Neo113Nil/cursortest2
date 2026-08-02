package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.eboks.objects.domain.c;
import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.h;
import com.yandex.messaging.domain.inviteLink.b;
import com.yandex.messaging.isolated.IsolatedChatConfig;
import com.yandex.messaging.isolated.IsolatedTranslatorConfig;
import com.ybsdk.feature.paymentsdk.internal.screens.a;
import com.ybsdk.feature.pin.internal.screens.biometry.BiometricFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment;
import com.ybsdk.screens.initial.InitialFragment;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.delivery.interactors.p;

/* loaded from: classes15.dex */
public final class qx5 implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final xvf0 c;

    public /* synthetic */ qx5(n3w n3wVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        Object a;
        int i = this.a;
        xvf0 xvf0Var = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new BiometricFragment((qy5) n3wVar.a, (ux5) xvf0Var.get());
            case 1:
                return new p((g580) n3wVar.a, (vsi) xvf0Var.get());
            case 2:
                return new c((pgn) n3wVar.a, (hin) xvf0Var.get());
            case 3:
                gr41 gr41Var = (gr41) xvf0Var.get();
                rvq0 rvq0Var = (rvq0) n3wVar.a;
                gr41Var.a.getClass();
                return new fr41(rvq0Var);
            case 4:
                return new InitialFragment((mwv) n3wVar.a, (fj3) xvf0Var.get());
            case 5:
                return new hnw((k6x) xvf0Var.get(), (cir) n3wVar.a);
            case 6:
                IsolatedChatConfig isolatedChatConfig = (IsolatedChatConfig) n3wVar.a;
                nz01 nz01Var = (nz01) xvf0Var.get();
                boolean showEmojiButton = isolatedChatConfig.getShowEmojiButton();
                boolean showInput = isolatedChatConfig.getShowInput();
                boolean showScrollToBottomFab = isolatedChatConfig.getShowScrollToBottomFab();
                boolean canClick = isolatedChatConfig.getTimelineGestureConfig().getCanClick();
                boolean canLongClick = isolatedChatConfig.getTimelineGestureConfig().getCanLongClick();
                boolean canSwipe = isolatedChatConfig.getTimelineGestureConfig().getCanSwipe();
                boolean showAttachmentButton = isolatedChatConfig.getShowAttachmentButton();
                boolean fadingEdgeEnabled = isolatedChatConfig.getFadingEdgeEnabled();
                int fadingEdgeLength = isolatedChatConfig.getFadingEdgeLength();
                boolean allowMakeStarredMessages = isolatedChatConfig.getAllowMakeStarredMessages();
                boolean allowSilentMessages = isolatedChatConfig.getAllowSilentMessages();
                boolean showMetadataPanel = isolatedChatConfig.getShowMetadataPanel();
                IsolatedTranslatorConfig translatorConfig = isolatedChatConfig.getTranslatorConfig();
                sz01 sz01Var = null;
                if (translatorConfig != null) {
                    if (!nz01Var.b.a(tz10.s)) {
                        translatorConfig = null;
                    }
                    if (translatorConfig != null) {
                        sz01Var = new sz01(translatorConfig.getLanguageCode(), translatorConfig.getSupportedLanguageCodes());
                    }
                }
                return new mdb(showEmojiButton, showInput, showScrollToBottomFab, canClick, canLongClick, canSwipe, showAttachmentButton, fadingEdgeEnabled, fadingEdgeLength, allowMakeStarredMessages, allowSilentMessages, sz01Var, showMetadataPanel, ImageMetadata.CONTROL_AE_EXPOSURE_COMPENSATION);
            case 7:
                return new bqz((Activity) xvf0Var.get(), (zpz) n3wVar.a);
            case 8:
                return new i1s0((i61) n3wVar.a, (yb00) xvf0Var.get());
            case 9:
                return new zsa(24, (h240) xvf0Var.get(), (f240) n3wVar.a);
            case 10:
                return new zsa(25, (e340) xvf0Var.get(), (c340) n3wVar.a);
            case 11:
                return new dj50((ji50) n3wVar.a, (oh50) xvf0Var.get());
            case 12:
                return new a((tw51) n3wVar.a, (ija0) xvf0Var.get());
            case 13:
                return new h5g0((Context) n3wVar.a, (com.yandex.messaging.techprofile.logout.a) xvf0Var.get());
            case 14:
                return new com.yandex.messaging.ui.resolvelink.invitelink.a((jsj0) n3wVar.a, (b) xvf0Var.get());
            case 15:
                i6r i6rVar = (i6r) n3wVar.a;
                SafetyCenterParams$Source safetyCenterParams$Source = ((itl0) xvf0Var.get()).a;
                if (safetyCenterParams$Source == SafetyCenterParams$Source.ORDER_CARD) {
                    a = (w030) ((c0g) i6rVar).o0.get();
                } else {
                    a = ((y030) ((c0g) i6rVar).H3.get()).a(safetyCenterParams$Source == SafetyCenterParams$Source.ACCIDENT_DEEPLINK ? ContentContainer$ZOrder.IMPORTANT : ContentContainer$ZOrder.IN_FRONT_OF_MODAL_VIEW);
                }
                q5z.i(a);
                return a;
            case 16:
                return new y71((w030) xvf0Var.get(), (dqm0) n3wVar.a, 2);
            case 17:
                return new y71((w030) xvf0Var.get(), (azm0) n3wVar.a, 3);
            case 18:
                return new com.yandex.go.scooters.misc.common_dialog.a((w030) xvf0Var.get(), (u7n0) n3wVar.a);
            case 19:
                return new ii3((w030) xvf0Var.get(), (omn0) n3wVar.a, 1);
            case 20:
                return new dr7((w030) xvf0Var.get(), (btn0) n3wVar.a, 7);
            case 21:
                return new zc((w030) xvf0Var.get(), (hxn0) n3wVar.a, 12);
            case 22:
                return new dr7((w030) xvf0Var.get(), (ooo0) n3wVar.a, 8);
            case 23:
                return new f9p0((w030) xvf0Var.get(), (d9p0) n3wVar.a);
            case 24:
                return new ans0((vsi) xvf0Var.get(), (zof) n3wVar.a);
            case 25:
                return new TransactionsFeedFragment((kf01) n3wVar.a, (sb6) xvf0Var.get());
            case 26:
                return new h((tse) n3wVar.a, (wgr) xvf0Var.get());
            case 27:
                return new kcz0((q431) n3wVar.a, (m431) xvf0Var.get());
            default:
                return new zz31((xz31) n3wVar.a, (b00) xvf0Var.get());
        }
    }

    public /* synthetic */ qx5(xvf0 xvf0Var, n3w n3wVar, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = n3wVar;
    }
}
