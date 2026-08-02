package ru.yandex.taxi.discovery;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.mqg0;
import defpackage.odh0;
import defpackage.rp31;
import defpackage.tph0;
import defpackage.vpa;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010 \u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\n¨\u0006!"}, d2 = {"Lru/yandex/taxi/discovery/DiscoveryTransitionModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "screenshot", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;)V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "onCollapseListener", "Lzy11;", "setOnCollapseListener", "(Ljava/lang/Runnable;)V", "onArrowClick", "()V", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "contentTop", "onModalViewAppear", "(I)V", "Ljava/lang/Runnable;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "discovery"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiscoveryTransitionModalView extends SlideableModalView {
    private Runnable onCollapseListener;

    public DiscoveryTransitionModalView(Context context, Bitmap bitmap) {
        super(context);
        this.onCollapseListener = new vpa(8);
        int i = odh0.main_screenshot;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ((ImageView) ((View) rp31.d(this, i))).setImageBitmap(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCollapseListener$lambda$0() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return tph0.discovery_modal_view;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        if (newState == 4) {
            this.onCollapseListener.run();
        } else {
            super.onBehaviorStateChanged(newState, movedByUser);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        setBehaviorPeekHeight(0);
        collapse();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public final void setOnCollapseListener(Runnable onCollapseListener) {
        this.onCollapseListener = onCollapseListener;
    }
}
