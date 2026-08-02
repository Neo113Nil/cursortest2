package com.squareup.cash.common.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class EmojiIconsKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ EmojiIconsKt$$ExternalSyntheticLambda0(SpendingInsightDetailViewModel.Content.SpendingAnalysis spendingAnalysis, Modifier modifier, float f, Function1 function1, int i, int i2) {
        this.f$0 = spendingAnalysis;
        this.f$2 = modifier;
        this.f$1 = f;
        this.f$3 = function1;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$3;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                float f = this.f$1;
                VisibleKt.m3489EmojiIconDzVHIIc((String) obj5, f, (Modifier) obj3, (String) obj4, (Composer) obj, updateChangedFlags, this.f$5);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                float f2 = this.f$1;
                zzaho.m2020SpendingAnalysisContent942rkJo((SpendingInsightDetailViewModel.Content.SpendingAnalysis) obj5, (Modifier) obj3, f2, (Function1) obj4, (Composer) obj, updateChangedFlags2, this.f$5);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(this.f$5 | 1);
                float f3 = this.f$1;
                int i3 = this.f$4;
                MoneybotMarkdownKt.m3632MoneybotMarkdownTableHeaderTN_CM5M((String) obj5, (ASTNodeImpl) obj4, f3, i3, (JWECryptoParts) obj3, (Composer) obj, updateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EmojiIconsKt$$ExternalSyntheticLambda0(String str, float f, Modifier modifier, String str2, int i, int i2) {
        this.f$0 = str;
        this.f$1 = f;
        this.f$2 = modifier;
        this.f$3 = str2;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public /* synthetic */ EmojiIconsKt$$ExternalSyntheticLambda0(String str, ASTNodeImpl aSTNodeImpl, float f, int i, JWECryptoParts jWECryptoParts, int i2) {
        this.f$0 = str;
        this.f$3 = aSTNodeImpl;
        this.f$1 = f;
        this.f$4 = i;
        this.f$2 = jWECryptoParts;
        this.f$5 = i2;
    }
}
