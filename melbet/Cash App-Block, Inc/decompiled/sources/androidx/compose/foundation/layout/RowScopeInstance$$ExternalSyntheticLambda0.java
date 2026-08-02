package androidx.compose.foundation.layout;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.braze.ui.UserJavascriptInterfaceBase;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class RowScopeInstance$$ExternalSyntheticLambda0 implements IValueCallback, OnApplyWindowInsetsListener {
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ RowScopeInstance$$ExternalSyntheticLambda0(Function1 function1) {
        this.f$0 = function1;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        view.getClass();
        this.f$0.invoke(windowInsetsCompat);
        return windowInsetsCompat;
    }

    @Override // com.braze.events.IValueCallback
    public void onSuccess(Object obj) {
        UserJavascriptInterfaceBase.Companion.runOnUser$lambda$0(this.f$0, (BrazeUser) obj);
    }
}
