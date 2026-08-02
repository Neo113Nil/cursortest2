package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class etu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ftu b;

    public /* synthetic */ etu(ftu ftuVar, int i) {
        this.a = i;
        this.b = ftuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
        }
        return this.b.getViewModelStore();
    }
}
