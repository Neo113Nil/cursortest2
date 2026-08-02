package T;

import J3.l;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import i1.C4585b;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f3104a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, l lVar) {
        super(inputConnection, false);
        this.f3104a = lVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C4585b c4585b = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c4585b = new C4585b(13, new f(inputContentInfo));
        }
        if (this.f3104a.e(c4585b, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
