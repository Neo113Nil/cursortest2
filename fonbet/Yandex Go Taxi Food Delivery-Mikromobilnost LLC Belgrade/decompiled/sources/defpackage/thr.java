package defpackage;

import android.content.Context;
import com.yandex.div.core.Div2Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller.FlexContentControllersModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller.FlexScaffoldControllersModule;

/* loaded from: classes10.dex */
public final /* synthetic */ class thr implements b3k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Div2Context b;

    public /* synthetic */ thr(Div2Context div2Context, int i) {
        this.a = i;
        this.b = div2Context;
    }

    @Override // defpackage.b3k
    public final Div2Context a(Context context, pey peyVar) {
        Div2Context provideDivkitContentControllerFactory$lambda$0;
        Div2Context provideDivkitScaffoldControllerFactory$lambda$0;
        int i = this.a;
        Div2Context div2Context = this.b;
        switch (i) {
            case 0:
                provideDivkitContentControllerFactory$lambda$0 = FlexContentControllersModule.provideDivkitContentControllerFactory$lambda$0(div2Context, context, peyVar);
                return provideDivkitContentControllerFactory$lambda$0;
            default:
                provideDivkitScaffoldControllerFactory$lambda$0 = FlexScaffoldControllersModule.provideDivkitScaffoldControllerFactory$lambda$0(div2Context, context, peyVar);
                return provideDivkitScaffoldControllerFactory$lambda$0;
        }
    }
}
