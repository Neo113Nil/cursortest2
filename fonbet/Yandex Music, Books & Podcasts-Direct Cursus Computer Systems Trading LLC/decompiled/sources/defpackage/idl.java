package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class idl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jdl b;

    public /* synthetic */ idl(jdl jdlVar, int i) {
        this.a = i;
        this.b = jdlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
        }
        return this.b.getViewModelStore();
    }
}
