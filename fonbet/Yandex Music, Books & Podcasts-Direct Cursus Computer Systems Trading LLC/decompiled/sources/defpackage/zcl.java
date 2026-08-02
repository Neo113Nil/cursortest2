package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class zcl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ adl b;

    public /* synthetic */ zcl(adl adlVar, int i) {
        this.a = i;
        this.b = adlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
        }
        return this.b.getViewModelStore();
    }
}
