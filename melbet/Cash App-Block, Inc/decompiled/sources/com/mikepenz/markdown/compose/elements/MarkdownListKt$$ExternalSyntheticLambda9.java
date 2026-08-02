package com.mikepenz.markdown.compose.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.PolymorphicSerializerKt;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class MarkdownListKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ASTNodeImpl f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ DefaultMarkdownComponents f$3;
    public final /* synthetic */ DefaultMarkdownTypography f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ MarkdownListKt$$ExternalSyntheticLambda9(ASTNodeImpl aSTNodeImpl, String str, int i, DefaultMarkdownComponents defaultMarkdownComponents, DefaultMarkdownTypography defaultMarkdownTypography, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = aSTNodeImpl;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = defaultMarkdownComponents;
        this.f$4 = defaultMarkdownTypography;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).intValue();
                PolymorphicSerializerKt.MarkdownNestedListItem(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(this.f$5 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                MoneybotMarkdownKt.MoneybotMarkdownNestedListItem(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(this.f$5 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
