package ru.yandex.taxi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.knn;
import defpackage.p8h0;
import defpackage.pwf0;
import defpackage.rp31;
import defpackage.zkh0;
import defpackage.zxf0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.EditRoutePointModalView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/yandex/taxi/widget/EditRoutePointModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljava/lang/Runnable;", "onAnimationEnd", "Lzy11;", "dismissInternal", "(Ljava/lang/Runnable;)V", "", "address", "setAddress", "(Ljava/lang/String;)V", "Lru/yandex/taxi/widget/EditRoutePointModalView$a;", "uiListener", "setUiListener", "(Lru/yandex/taxi/widget/EditRoutePointModalView$a;)V", "", "canChange", "setCanChange", "(Z)V", "canRemove", "setCanRemove", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Landroid/view/View;", "Lru/yandex/taxi/design/ListItemComponent;", "deleteAddressButton", "Lru/yandex/taxi/design/ListItemComponent;", "changeAddressButton", "addressView", "Lru/yandex/taxi/widget/EditRoutePointModalView$a;", "isDismissing", "Z", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EditRoutePointModalView extends ModalView {
    public static final int $stable = 8;
    private final ListItemComponent addressView;
    private final ListItemComponent changeAddressButton;
    private final View contentView;
    private final ListItemComponent deleteAddressButton;
    private boolean isDismissing;
    private a uiListener;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/widget/EditRoutePointModalView$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void L9();

        void i4();
    }

    public EditRoutePointModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final int i = 1;
        ru.yandex.taxi.design.utils.c.q(this, zkh0.edit_route_point_modal_view, true);
        int i2 = p8h0.content;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        View view = (View) rp31.d(this, i2);
        this.contentView = view;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, p8h0.delete_address));
        this.deleteAddressButton = listItemComponent;
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) rp31.d(this, p8h0.change_address));
        this.changeAddressButton = listItemComponent2;
        this.addressView = (ListItemComponent) ((View) rp31.d(this, p8h0.address));
        this.uiListener = (a) ((zxf0) pwf0.c(a.class));
        view.setClickable(true);
        final int i3 = 0;
        listItemComponent2.setOnClickListener(new View.OnClickListener(this) { // from class: lnn
            public final /* synthetic */ EditRoutePointModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                EditRoutePointModalView editRoutePointModalView = this.b;
                switch (i4) {
                    case 0:
                        EditRoutePointModalView._init_$lambda$0(editRoutePointModalView, view2);
                        break;
                    default:
                        EditRoutePointModalView._init_$lambda$1(editRoutePointModalView, view2);
                        break;
                }
            }
        });
        listItemComponent.setOnClickListener(new View.OnClickListener(this) { // from class: lnn
            public final /* synthetic */ EditRoutePointModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i;
                EditRoutePointModalView editRoutePointModalView = this.b;
                switch (i4) {
                    case 0:
                        EditRoutePointModalView._init_$lambda$0(editRoutePointModalView, view2);
                        break;
                    default:
                        EditRoutePointModalView._init_$lambda$1(editRoutePointModalView, view2);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(EditRoutePointModalView editRoutePointModalView, View view) {
        if (editRoutePointModalView.isDismissing) {
            return;
        }
        editRoutePointModalView.dismissInternal(new knn(editRoutePointModalView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(EditRoutePointModalView editRoutePointModalView, View view) {
        if (editRoutePointModalView.isDismissing) {
            return;
        }
        editRoutePointModalView.dismissInternal(new knn(editRoutePointModalView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(EditRoutePointModalView editRoutePointModalView) {
        editRoutePointModalView.uiListener.L9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$0(EditRoutePointModalView editRoutePointModalView) {
        editRoutePointModalView.uiListener.i4();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getBackgroundContent() {
        return this.contentView;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        this.isDismissing = true;
        super.dismissInternal(onAnimationEnd);
    }

    public final void setAddress(String address) {
        this.addressView.setTitle(address);
    }

    public final void setCanChange(boolean canChange) {
        this.changeAddressButton.setAlpha(canChange ? 1.0f : 0.5f);
        this.changeAddressButton.setEnabled(canChange);
    }

    public final void setCanRemove(boolean canRemove) {
        this.deleteAddressButton.setAlpha(canRemove ? 1.0f : 0.5f);
        this.deleteAddressButton.setEnabled(canRemove);
    }

    public final void setUiListener(a uiListener) {
        this.uiListener = uiListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditRoutePointModalView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ EditRoutePointModalView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
