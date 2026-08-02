package com.mikepenz.markdown.compose.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.PolymorphicSerializerKt;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class MarkdownListKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ ASTNodeImpl f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ ComposableLambdaImpl f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ MarkdownListKt$$ExternalSyntheticLambda6(String str, ASTNodeImpl aSTNodeImpl, int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = str;
        this.f$1 = aSTNodeImpl;
        this.f$2 = i;
        this.f$3 = function1;
        this.f$4 = function12;
        this.f$5 = composableLambdaImpl;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PolymorphicSerializerKt.MarkdownListItems(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                MoneybotMarkdownKt.MoneybotMarkdownListItems(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
