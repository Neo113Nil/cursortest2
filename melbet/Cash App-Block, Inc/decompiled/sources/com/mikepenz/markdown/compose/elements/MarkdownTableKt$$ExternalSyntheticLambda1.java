package com.mikepenz.markdown.compose.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.text.TextStyle;
import com.nimbusds.jose.JWECryptoParts;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.encoding.AbstractDecoder;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class MarkdownTableKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ ASTNodeImpl f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ TextStyle f$3;
    public final /* synthetic */ BiasAlignment.Vertical f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ JWECryptoParts f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ MarkdownTableKt$$ExternalSyntheticLambda1(String str, ASTNodeImpl aSTNodeImpl, float f, TextStyle textStyle, BiasAlignment.Vertical vertical, int i, int i2, JWECryptoParts jWECryptoParts, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$0 = str;
        this.f$1 = aSTNodeImpl;
        this.f$2 = f;
        this.f$3 = textStyle;
        this.f$4 = vertical;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$7 = jWECryptoParts;
        this.f$8 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractDecoder.m4203MarkdownTableHeaderOniuKJc(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, Updater.updateChangedFlags(this.f$8 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractDecoder.m4204MarkdownTableRowOniuKJc(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, Updater.updateChangedFlags(this.f$8 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
