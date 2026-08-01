package com.icefishinggame.icefishinggamemultigames;

import android.content.Intent;
import o4.InterfaceC4799l;

/* loaded from: classes2.dex */
public final class F implements InterfaceC4799l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F1.a f36390n;

    public /* synthetic */ F(F1.a aVar) {
        this.f36390n = aVar;
    }

    @Override // o4.InterfaceC4799l
    public void OnCall() {
        SplashActivity splashActivity = (SplashActivity) this.f36390n.f903u;
        Intent intent = splashActivity.f36887v;
        splashActivity.getClass();
        try {
            if (!splashActivity.f() || intent == null) {
                return;
            }
            splashActivity.startActivity(intent);
            splashActivity.finish();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
