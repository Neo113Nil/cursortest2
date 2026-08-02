package ru.yandex.taxi.messenger.fallback;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.fragment.router.external.ExternalFragmentModalView;
import defpackage.c1o;
import defpackage.c230;
import defpackage.e230;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/messenger/fallback/FallbackChatModalView;", "Lcom/yandex/go/fragment/router/external/ExternalFragmentModalView;", "Landroidx/fragment/app/FragmentActivity;", "activity", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "Le230;", "insetsType", "()Le230;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FallbackChatModalView extends ExternalFragmentModalView {
    public FallbackChatModalView(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(FallbackChatModalView fallbackChatModalView) {
        return fallbackChatModalView;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new c1o(12, this), false);
    }
}
