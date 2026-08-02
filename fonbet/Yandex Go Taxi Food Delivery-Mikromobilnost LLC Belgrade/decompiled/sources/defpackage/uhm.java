package defpackage;

import android.content.Context;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$Out;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.media3.exoplayer.f;
import com.google.android.material.textfield.c;
import com.yandex.go.due_timetable.presentation.DueTimetableModalView;
import com.yandex.go.due_timetable.presentation.g;
import com.yandex.go.dynamic.impl.ui.loading.DynamicFeatureLoadingLoadingModalView;
import com.yandex.go.payments.shared.family.invites.ui.FamilyInviteView;
import com.yandex.go.settings.email.EmailRequiredModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerButtonView;
import com.yandex.go.superapp.unified_polling.a;
import com.yandex.go.superapp.web_chat.ui.EatsOrderWebChatModalView;
import com.yandex.go.taxi.order.search.ui.driver.DriverAcceptanceGradientView;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;
import org.webrtc.EglRenderer;
import ru.yandex.taxi.due_selector.impl.presentation.ui.DueSelectorModalView;
import ru.yandex.taxi.eatskit.widget.placeholder.eats.EatsSplashView;
import ru.yandex.taxi.fragment.common.EditTextFragment;
import ru.yandex.taxi.fragment.favorites.list.FavoritesFragment;

/* loaded from: classes12.dex */
public final /* synthetic */ class uhm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uhm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DriverAcceptanceGradientView) obj).detachFromView();
                break;
            case 1:
                ((uyb0) obj).b.invoke();
                break;
            case 2:
                c cVar = (c) obj;
                boolean isPopupShowing = cVar.h.isPopupShowing();
                cVar.s(isPopupShowing);
                cVar.m = isPopupShowing;
                break;
            case 3:
                ((DualSurfaceProcessor) obj).lambda$release$4();
                break;
            case 4:
                DualSurfaceProcessorNode$Out dualSurfaceProcessorNode$Out = (DualSurfaceProcessorNode$Out) ((q4g) obj).x;
                if (dualSurfaceProcessorNode$Out != null) {
                    Iterator<enw0> it = dualSurfaceProcessorNode$Out.values().iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                    break;
                }
                break;
            case 5:
                ((DueSelectorModalView) obj).onBackPressed();
                break;
            case 6:
                gVar = ((DueTimetableModalView) obj).presenter;
                gVar.Lg(c0n.a);
                break;
            case 7:
                DynamicFeatureLoadingLoadingModalView.onAttachedToWindow$back((o7n) obj);
                break;
            case 8:
                ((a) obj).j();
                break;
            case 9:
                ((EatsOrderWebChatModalView) obj).onBackPressed();
                break;
            case 10:
                EatsOrderWebChatModalView.onAttachedToWindow$onPhoneCallClick((zbn) obj);
                break;
            case 11:
                EatsSplashView eatsSplashView = ((ngn) obj).b;
                if (eatsSplashView != null) {
                    eatsSplashView.showProgressBar();
                    break;
                }
                break;
            case 12:
                ((wln) obj).F.a.d();
                break;
            case 13:
                ((EditTextFragment) obj).showKeyboard();
                break;
            case 14:
                ((EglBase10Impl.EglConnection) obj).lambda$new$0();
                break;
            case 15:
                ((EglBase14Impl.EglConnection) obj).lambda$new$0();
                break;
            case 16:
                ((EglRenderer) obj).renderFrameOnRenderThread();
                break;
            case 17:
                ((EglBase.EglConnection) obj).release();
                break;
            case 18:
                EmailRequiredModalView._init_$lambda$0((gsn) obj);
                break;
            case 19:
                ((ctn) obj).a.b();
                break;
            case 20:
                ((EmojiView) obj).sendAccessibilityEvent(128);
                break;
            case 21:
                ((d1o) obj).h();
                break;
            case 22:
                oj91.a(((h7o) obj).a(), 200L);
                break;
            case 23:
                f fVar = (f) obj;
                zp1 zp1Var = fVar.F;
                Context context = fVar.e;
                int i2 = tw21.a;
                Integer valueOf = Integer.valueOf(eg3.i(context).generateAudioSessionId());
                zp1Var.y = valueOf;
                ((a3x0) zp1Var.c).e(new ci4(zp1Var, valueOf, 0));
                break;
            case 24:
                ExplorerButtonView.setupClickListeners$lambda$0((ExplorerButtonView) obj);
                break;
            case 25:
                ((e9e) obj).accept(new v751(EmptyList.a));
                break;
            case 26:
                FamilyInviteView._init_$onCloseClicked((bbp) obj);
                break;
            case 27:
                FamilyInviteView._init_$lambda$0((FamilyInviteView) obj);
                break;
            case 28:
                ((FavoritesFragment) obj).onBackPressed();
                break;
            default:
                ((ru.yandex.taxi.favorites.list.ui.f) obj).Pg();
                break;
        }
    }
}
