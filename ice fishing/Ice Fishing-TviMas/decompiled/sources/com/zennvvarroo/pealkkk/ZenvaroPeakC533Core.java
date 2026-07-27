package com.zennvvarroo.pealkkk;

import android.app.Application;
import com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: ZenvaroPeakC533Core.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/zennvvarroo/pealkkk/ZenvaroPeakC533Core;", "Landroid/app/Application;", "()V", "onCreate", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ZenvaroPeakC533Core extends Application {
    public static final int $stable = 0;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        ZenvaroPeakC533LaunchRouter.INSTANCE.initApp(this, new Function1<Result<? extends String>, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakC533Core$onCreate$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends String> result) {
                m6193invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m6193invoke(Object obj) {
                ZenvaroPeakC533LaunchRouter.INSTANCE.startAttributionBridge(ZenvaroPeakC533Core.this);
            }
        });
    }
}
