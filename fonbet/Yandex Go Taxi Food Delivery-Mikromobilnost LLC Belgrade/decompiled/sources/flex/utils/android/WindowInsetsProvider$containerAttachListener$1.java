package flex.utils.android;

import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import defpackage.n751;
import defpackage.op31;
import defpackage.t6f0;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"flex/utils/android/WindowInsetsProvider$containerAttachListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "container", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "flex-utils-android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WindowInsetsProvider$containerAttachListener$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ WindowInsetsProvider this$0;

    public WindowInsetsProvider$containerAttachListener$1(WindowInsetsProvider windowInsetsProvider) {
        this.this$0 = windowInsetsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 onViewAttachedToWindow$lambda$0(WindowInsetsProvider windowInsetsProvider, View view, n751 n751Var) {
        WindowInsetsProvider.a(windowInsetsProvider, n751Var);
        return n751Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View container) {
        WindowInsetsProvider windowInsetsProvider = this.this$0;
        WeakHashMap weakHashMap = b.a;
        WindowInsetsProvider.a(windowInsetsProvider, op31.a(container));
        ViewCompat$Api21Impl.o(container, new t6f0(13, this.this$0));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
    }
}
