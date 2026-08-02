package ru.yandex.taxi.requirements.modal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.jfh0;
import defpackage.jrh0;
import defpackage.mrg0;
import defpackage.oxe0;
import defpackage.qhj0;
import defpackage.rhj0;
import defpackage.rp31;
import defpackage.wnb1;
import defpackage.xmf0;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/requirements/modal/RequirementInfoModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lrhj0;", "infoPopup", "<init>", "(Landroid/content/Context;Lrhj0;)V", "Lqhj0;", "infoScreenText", "Lzy11;", "addItem", "(Lqhj0;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Ljava/lang/Runnable;", "onDismissListener", "setOnDismissListener", "(Ljava/lang/Runnable;)V", "onAnimationEnd", "dismissInternal", "content", "Landroid/view/View;", "Landroid/view/ViewGroup;", "itemsContainer", "Landroid/view/ViewGroup;", "Ljava/lang/Runnable;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementInfoModalView extends ModalView {
    private final View content;
    private final ViewGroup itemsContainer;
    private Runnable onDismissListener;

    public RequirementInfoModalView(Context context, rhj0 rhj0Var) {
        super(context);
        c.q(this, jrh0.requirement_info_modal_view, true);
        int i = jfh0.requirement_info_content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i);
        this.itemsContainer = (ViewGroup) ((View) rp31.d(this, jfh0.requirement_info_items_container));
        ToolbarComponent toolbarComponent = (ToolbarComponent) ((View) rp31.d(this, jfh0.requirement_info_toolbar));
        String str = rhj0Var.d;
        if (str == null || str.length() == 0) {
            toolbarComponent.setVisibility(8);
        } else {
            toolbarComponent.setTitle(rhj0Var.d);
        }
        Iterator it = rhj0Var.e.iterator();
        while (it.hasNext()) {
            addItem((qhj0) it.next());
        }
        toolbarComponent.setOnCloseClickListener(new oxe0(27, this));
        wnb1.d(r1.getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius), this.content);
    }

    private final void addItem(qhj0 infoScreenText) {
        View q = c.q(this.itemsContainer, jrh0.requirement_info_item, false);
        int i = jfh0.requirement_info_subtitle;
        WeakHashMap weakHashMap = b.a;
        TextView textView = (TextView) ((View) rp31.d(q, i));
        TextView textView2 = (TextView) ((View) rp31.d(q, jfh0.requirement_info_text));
        textView.setText(infoScreenText.a);
        textView2.setText(infoScreenText.b);
        this.itemsContainer.addView(q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissInternal$lambda$0(Runnable runnable, RequirementInfoModalView requirementInfoModalView) {
        runnable.run();
        Runnable runnable2 = requirementInfoModalView.onDismissListener;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        super.dismissInternal(new xmf0(15, onAnimationEnd, this));
    }

    public final void setOnDismissListener(Runnable onDismissListener) {
        this.onDismissListener = onDismissListener;
    }
}
