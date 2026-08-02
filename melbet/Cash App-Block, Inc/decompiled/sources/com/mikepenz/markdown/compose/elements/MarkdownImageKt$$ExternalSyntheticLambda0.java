package com.mikepenz.markdown.compose.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.rx3.RxAwaitKt;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class MarkdownImageKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ ASTNodeImpl f$1;

    public /* synthetic */ MarkdownImageKt$$ExternalSyntheticLambda0(String str, ASTNodeImpl aSTNodeImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = aSTNodeImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                OnUndeliveredElementKt.MarkdownImage(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                OnUndeliveredElementKt.MarkdownImage(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                RxAwaitKt.MarkdownInlineImage(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
