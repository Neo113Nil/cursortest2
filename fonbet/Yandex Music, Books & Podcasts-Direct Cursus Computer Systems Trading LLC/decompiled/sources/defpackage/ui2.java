package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ui2 extends kpj {
    public final /* synthetic */ aqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui2(boolean z, aqi aqiVar) {
        super(z);
        this.b = aqiVar;
    }

    @Override // defpackage.kpj
    public final void handleOnBackPressed() {
        ((Function0) this.b.getValue()).invoke();
    }
}
