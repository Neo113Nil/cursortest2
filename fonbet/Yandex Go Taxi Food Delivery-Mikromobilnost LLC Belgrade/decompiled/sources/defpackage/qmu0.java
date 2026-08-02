package defpackage;

import android.content.Context;
import com.ybsdk.feature.stories.internal.screens.stories.b;
import com.ybsdk.feature.stories.internal.screens.verticalstories.a;

/* loaded from: classes3.dex */
public final class qmu0 implements v7p {
    public final /* synthetic */ int a;
    public final hag b;

    public /* synthetic */ qmu0(hag hagVar, int i) {
        this.a = i;
        this.b = hagVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        hag hagVar = this.b;
        switch (i) {
            case 0:
                return new b((Context) hagVar.get());
            default:
                return new a((Context) hagVar.get());
        }
    }
}
