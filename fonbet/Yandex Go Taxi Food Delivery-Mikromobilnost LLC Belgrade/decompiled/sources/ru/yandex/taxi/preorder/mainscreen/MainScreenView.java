package ru.yandex.taxi.preorder.mainscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/preorder/mainscreen/MainScreenView;", "Landroid/widget/FrameLayout;", "Lru/yandex/taxi/preorder/mainscreen/MainScreen;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAfterInflate", "()V", "Lru/yandex/taxi/preorder/mainscreen/MainScreen$MainScreenMode;", "mode", "setMode", "(Lru/yandex/taxi/preorder/mainscreen/MainScreen$MainScreenMode;)V", "dismiss", "resume", "pause", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class MainScreenView extends FrameLayout implements MainScreen {
    public /* synthetic */ MainScreenView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public abstract /* synthetic */ void disableControlElements();

    public abstract void dismiss();

    public abstract /* synthetic */ void enableControlElements();

    public abstract /* synthetic */ int getBottomContentHeight();

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreen
    public /* bridge */ int getTopContentHeight() {
        return 0;
    }

    public abstract /* synthetic */ ITransitionCoordinator getTransitionCoordinator();

    public abstract void onAfterInflate();

    @Override // ru.yandex.taxi.preorder.mainscreen.MainScreen
    public /* bridge */ void onMapCollapsed() {
    }

    public void pause() {
    }

    public void resume() {
    }

    public abstract void setMode(MainScreen.MainScreenMode mode);

    public MainScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
