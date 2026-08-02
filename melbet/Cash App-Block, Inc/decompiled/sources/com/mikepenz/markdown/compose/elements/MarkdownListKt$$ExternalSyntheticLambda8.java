package com.mikepenz.markdown.compose.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.model.DefaultMarkdownPadding;
import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.PolymorphicSerializerKt;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class MarkdownListKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ ASTNodeImpl f$1;
    public final /* synthetic */ Function1 f$10;
    public final /* synthetic */ ComposableLambdaImpl f$11;
    public final /* synthetic */ int f$12;
    public final /* synthetic */ int f$13;
    public final /* synthetic */ ASTNodeImpl f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ DefaultMarkdownComponents f$6;
    public final /* synthetic */ DefaultMarkdownTypography f$7;
    public final /* synthetic */ DefaultMarkdownPadding f$8;
    public final /* synthetic */ Function1 f$9;

    public /* synthetic */ MarkdownListKt$$ExternalSyntheticLambda8(String str, ASTNodeImpl aSTNodeImpl, ASTNodeImpl aSTNodeImpl2, int i, int i2, int i3, DefaultMarkdownComponents defaultMarkdownComponents, DefaultMarkdownTypography defaultMarkdownTypography, DefaultMarkdownPadding defaultMarkdownPadding, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl, int i4, int i5, int i6) {
        this.$r8$classId = i6;
        this.f$0 = str;
        this.f$1 = aSTNodeImpl;
        this.f$2 = aSTNodeImpl2;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$5 = i3;
        this.f$6 = defaultMarkdownComponents;
        this.f$7 = defaultMarkdownTypography;
        this.f$8 = defaultMarkdownPadding;
        this.f$9 = function1;
        this.f$10 = function12;
        this.f$11 = composableLambdaImpl;
        this.f$12 = i4;
        this.f$13 = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$13;
        int i3 = this.f$12;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                PolymorphicSerializerKt.MarkdownListItem(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags4 = Updater.updateChangedFlags(i2);
                MoneybotMarkdownKt.MoneybotMarkdownListItem(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, (Composer) obj, updateChangedFlags3, updateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }
}
