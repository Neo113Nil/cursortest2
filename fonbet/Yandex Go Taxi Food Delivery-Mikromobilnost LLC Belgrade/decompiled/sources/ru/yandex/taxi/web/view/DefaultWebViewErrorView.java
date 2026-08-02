package ru.yandex.taxi.web.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.ci8;
import defpackage.cma1;
import defpackage.ish0;
import defpackage.jgh0;
import defpackage.ny61;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/taxi/web/view/DefaultWebViewErrorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "onReloadListener", "Ljava/lang/Runnable;", "<init>", "(Landroid/content/Context;Ljava/lang/Runnable;)V", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultWebViewErrorView extends FrameLayout {
    private final Runnable onReloadListener;

    public DefaultWebViewErrorView(Context context, Runnable runnable) {
        super(context);
        this.onReloadListener = runnable;
        View inflate = LayoutInflater.from(context).inflate(ish0.web_view_default_error, (ViewGroup) this, false);
        addView(inflate);
        int i = jgh0.error_icon;
        if (((GoImageView) cma1.O(i, inflate)) != null) {
            i = jgh0.error_title;
            if (((ListTitleComponent) cma1.O(i, inflate)) != null) {
                i = jgh0.reload_button;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    listItemComponent.setOnClickListener(new ci8(27, this));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(DefaultWebViewErrorView defaultWebViewErrorView, View view) {
        defaultWebViewErrorView.onReloadListener.run();
    }
}
