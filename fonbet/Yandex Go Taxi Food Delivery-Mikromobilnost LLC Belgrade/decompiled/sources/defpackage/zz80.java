package defpackage;

import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes8.dex */
public final class zz80 {
    public final mhf a;

    public zz80(mhf mhfVar) {
        this.a = mhfVar;
    }

    public final boolean a() {
        mhf mhfVar = this.a;
        return (mhfVar.a() instanceof yz80) || mhfVar.b() == Screen.MAIN_V4 || mhfVar.b() == Screen.WALLET;
    }
}
