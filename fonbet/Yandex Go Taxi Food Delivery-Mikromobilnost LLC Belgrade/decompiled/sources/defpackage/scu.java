package defpackage;

import android.view.View;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.delegates.HeaderTranslationDelegate$State;

/* loaded from: classes.dex */
public final class scu {
    public final View a;
    public final boolean b;
    public int c;
    public HeaderTranslationDelegate$State d = HeaderTranslationDelegate$State.TranslatedToZero;
    public final rcu e;

    /* JADX WARN: Multi-variable type inference failed */
    public scu(View view, boolean z) {
        this.a = view;
        this.b = z;
        this.e = view instanceof rcu ? (rcu) view : null;
    }

    public final void a(HeaderTranslationDelegate$State headerTranslationDelegate$State) {
        if (this.d != headerTranslationDelegate$State) {
            this.d = headerTranslationDelegate$State;
            rcu rcuVar = this.e;
            if (rcuVar != null) {
                rcuVar.onStateChanged(headerTranslationDelegate$State);
            }
        }
    }
}
