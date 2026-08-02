package com.mikepenz.markdown.compose.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class MarkdownCodeKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ ASTNodeImpl f$1;
    public final /* synthetic */ TextStyle f$2;
    public final /* synthetic */ Function5 f$3;

    public /* synthetic */ MarkdownCodeKt$$ExternalSyntheticLambda0(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, Function5 function5, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = aSTNodeImpl;
        this.f$2 = textStyle;
        this.f$3 = function5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                FlowKt__CollectionKt.MarkdownCodeFence(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                FlowKt__CollectionKt.MarkdownCodeBlock(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }
}
