package ru.yandex.taxi.cashback.router.real.home;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.yandex.plus.log.api.LogPriority;
import defpackage.d230;
import defpackage.dje;
import defpackage.e230;
import defpackage.pgz;
import defpackage.vrd0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import ru.yandex.taxi.plus.sdk.modal.b;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/cashback/router/real/home/PlusWebHomeModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "extraModalViewContainer", "Lvrd0;", "plusWebScreen", "Ljava/lang/Runnable;", "dismissCallback", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Lvrd0;Ljava/lang/Runnable;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "parent", "", "zOrder", "Lzy11;", "show", "(Landroid/view/ViewGroup;F)V", "onBackPressed", "()V", "dismiss", "Lvrd0;", "Ljava/lang/Runnable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlusWebHomeModalView extends ModalView {
    private final Runnable dismissCallback;
    private final vrd0 plusWebScreen;

    public PlusWebHomeModalView(Context context, ViewGroup viewGroup, vrd0 vrd0Var, Runnable runnable) {
        super(context);
        this.plusWebScreen = vrd0Var;
        this.dismissCallback = runnable;
        ((b) vrd0Var).b.getClass();
        new WeakReference(viewGroup);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        b bVar = (b) this.plusWebScreen;
        bVar.e.a("SdkWebPlusScreen", "getView()", null);
        return bVar.a.M;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
        vrd0 vrd0Var = this.plusWebScreen;
        vrd0Var.getClass();
        b bVar = (b) vrd0Var;
        bVar.e.a("SdkWebPlusScreen", "dismiss()", null);
        com.yandex.plus.home.feature.webviews.internal.container.a aVar = bVar.a;
        pgz pgzVar = aVar.w;
        FrameLayout frameLayout = aVar.M;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewsControllerImpl", "dismiss(): onDismissedExist=true");
        }
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = frameLayout.getChildAt(i);
            dje djeVar = childAt instanceof dje ? (dje) childAt : null;
            if (djeVar != null) {
                djeVar.hide();
            }
        }
        ViewParent parent = frameLayout.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new d230(0);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        if (((b) this.plusWebScreen).a.r()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void show(ViewGroup parent, float zOrder) {
        super.show(parent, zOrder);
        b bVar = (b) this.plusWebScreen;
        bVar.e.a("SdkWebPlusScreen", "getView()", null);
        parent.addView(bVar.a.M);
        ((b) this.plusWebScreen).a(this.dismissCallback);
    }
}
