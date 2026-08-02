package com.mikepenz.markdown.compose.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.PolymorphicSerializerKt;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class MarkdownListKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ ASTNodeImpl f$1;
    public final /* synthetic */ TextStyle f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ Function1 f$5;

    public /* synthetic */ MarkdownListKt$$ExternalSyntheticLambda2(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, int i, Function1 function1, Function1 function12, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = str;
        this.f$1 = aSTNodeImpl;
        this.f$2 = textStyle;
        this.f$3 = i;
        this.f$4 = function1;
        this.f$5 = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                PolymorphicSerializerKt.MarkdownOrderedList(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                PolymorphicSerializerKt.MarkdownBulletList(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(1);
                MoneybotMarkdownKt.MoneybotMarkdownBulletList(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags3);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(1);
                MoneybotMarkdownKt.MoneybotMarkdownOrderedList(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }
}
